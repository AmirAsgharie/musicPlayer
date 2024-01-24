package com.amirasghari.musicplayer.Activity

import android.annotation.SuppressLint
import android.content.*
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.amirasghari.musicplayer.Adapter.ViewPagerAdapter
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity(), ServiceConnection {

    lateinit var binding: ActivityMainBinding
    lateinit var mediaPlayer: MediaPlayer
    lateinit var viewModel: ViewModel
    lateinit var shared: SharedPreferences
    private lateinit var shuffleList: List<Int>
    var musicService: Service? = null
    lateinit var path:String
    lateinit var musicName:String
    lateinit var musicArtist:String
    private var first = true


    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("Recycle", "Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = getSharedPreferences("music", 0)
        val editor =shared.edit()
        editor.putBoolean("first" , true)
        editor.apply()
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        setUpTabLayout()
        

        //viewModel = ViewModelProvider(this)[ViewModel::class.java]

        binding.currentMusicCard.setOnClickListener {
            clickCurrentCard()
        }

        binding.searchCard.setOnClickListener {
            val intent = Intent(this , SearchActivity::class.java)
            startActivity(intent)
        }





    }

    override fun onResume() {
        super.onResume()
        path = shared.getString("imagePath" , "").toString()
        musicName = shared.getString("musicName" , "").toString()
        musicArtist = shared.getString("musicArtist" , "").toString()
        Glide.with(this).load(path).into(binding.currentMusicImg)
        binding.currentMusicTxt.text = musicName
        binding.currentMusicArtistTxt.text = musicArtist
    }

    private fun clickCurrentCard() {
        val intent = Intent(this, ShowMusicActivity::class.java)
        intent.putExtra("musicName", binding.currentMusicTxt.text)
        intent.putExtra("musicArtist", binding.currentMusicArtistTxt.text)
        startActivity(intent)
    }

    private fun setUpTabLayout() {
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Favorite"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Song"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("PlayList"))


        val adapter = ViewPagerAdapter(this, supportFragmentManager, 3)

        binding.viewPager.adapter = adapter

        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        binding.tabLayout.selectTab(binding.tabLayout.getTabAt(1))

    }

    fun startService() {
        val intent = Intent(this, Service::class.java)
        bindService(intent, this, BIND_AUTO_CREATE)
        startService(intent)
        //Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onServiceConnected(p0: ComponentName?, service: IBinder?) {
        val binder = service as Service.MyBinder
        musicService = binder.currentService()
        //Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        val path =shared.getString("musicPath" , "")
        play(path!!)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun play(path:String) {

        if (shared.getBoolean("favorite" ,false)){
            val favoriteMusic =ArrayList<AudioModel>()
            val data = RealmDAO().favoriteReadAll()
            data.forEach {
                favoriteMusic.add(
                    AudioModel(
                        it.musicPath,
                        it.musicName,
                        it.duration,
                        it.imagePath,
                        it.artistName
                    )
                )
            }

            musicService!!.songList = favoriteMusic

        }else{
            try {
                musicService!!.songList = musicService!!.mainSongList
                Log.i("playy" , "here2")
            }catch (E:Exception){
                musicService!!.getMusicsDetails()
                Log.i("playy" , "here")
                musicService!!.songList = musicService!!.mainSongList
            }

        }
        musicService!!.playShuffle()


        if (musicService!!.musicPlayer == null) musicService!!.musicPlayer = MediaPlayer()
        musicService!!.musicPlayer!!.reset()
        musicService!!.musicPlayer!!.setDataSource(path)
        musicService!!.musicPlayer!!.prepare()
        musicService!!.musicPlayer!!.start()
        musicService!!.showNotification()


        musicService!!.musicPlayer!!.setOnCompletionListener {
            val pos = shared.getInt("position" , 0)
            val editor =shared.edit()
            if (shared.getBoolean("shuffle" , false)){
                val shufflePos = shared.getInt("shufflePosition" , 0)
                val musicName = musicService!!.songList[musicService!!.shuffleList[shufflePos]].Title
                val musicArtist = musicService!!.songList[musicService!!.shuffleList[shufflePos]].Artist
                binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist
                val imagePath =musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                editor.putString("musicName" , musicName)
                editor.putString("musicArtist" , musicArtist)
                editor.putString("imagePath" , imagePath)
            }else{
                val musicName = musicService!!.songList[pos+1].Title
                val musicArtist = musicService!!.songList[pos+1].Artist
                binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist
                val imagePath =musicService!!.songList[pos+1].image
                editor.putString("musicName" , musicName)
                editor.putString("musicArtist" , musicArtist)
                editor.putString("imagePath" , imagePath)
            }
            editor.apply()
            musicService!!.play()
        }

    }

    override fun onServiceDisconnected(p0: ComponentName?) {

        musicService = null
    }

    override fun onDestroy() {
        super.onDestroy()

    }

}


