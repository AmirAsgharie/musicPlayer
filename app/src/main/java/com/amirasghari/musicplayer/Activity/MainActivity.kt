package com.amirasghari.musicplayer.Activity

import android.annotation.SuppressLint
import android.content.*
import android.content.pm.PackageManager
import android.database.Cursor
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.amirasghari.musicplayer.Adapter.ViewPagerAdapter
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity(), ServiceConnection,
    AudioManager.OnAudioFocusChangeListener {

    lateinit var binding: ActivityMainBinding
    lateinit var mediaPlayer: MediaPlayer
    lateinit var viewModel: ViewModel
    lateinit var audioManager: AudioManager
    lateinit var shared: SharedPreferences
    private var shuffleList: List<Int>? = null
    var musicService: Service? = null
    lateinit var path: String
    lateinit var musicName: String
    lateinit var musicArtist: String
    var recentSongs = ArrayList<AudioModel>()


    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("Recycle", "Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = getSharedPreferences("music", 0)
        val editor = shared.edit()
        editor.putBoolean("first", true)
        editor.apply()
        viewModel = ViewModelProvider(this)[ViewModel::class.java]

        if (!checkPermission()) {
            requestPermission()
            return
        } else {
            setUpTabLayout()
        }


        //viewModel = ViewModelProvider(this)[ViewModel::class.java]

        binding.currentMusicCard.setOnClickListener {
            clickCurrentCard()
        }

        binding.searchCard.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onResume() {
        super.onResume()
        path = shared.getString("imagePath", "").toString()
        musicName = shared.getString("musicName", "").toString()
        musicArtist = shared.getString("musicArtist", "").toString()
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
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Recent"))


        val adapter = ViewPagerAdapter(this, supportFragmentManager, 4)

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


    }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onServiceConnected(p0: ComponentName?, service: IBinder?) {
        val binder = service as Service.MyBinder
        musicService = binder.currentService()
        val path = shared.getString("musicPath", "")
        val recent = shared.getBoolean("recent", false)


        if (!shuffleList.isNullOrEmpty()) {
            play(path!!, null, shuffleList)
        } else if (!recent) {
            play(path!!, null, null)
        } else {
            getRecentMusicsDetails()
            play(path!!, recentSongs, null)
        }

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun play(path: String, recentSongs: ArrayList<AudioModel>? = null, shuffleList: List<Int>?) {

        changeMusicFocus()


        if (recentSongs != null) {

            recentSongs.reverse()
            musicService!!.songList = recentSongs


        } else if (shared.getBoolean("favorite", false)) {
            val favoriteMusic = ArrayList<AudioModel>()
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

        } else {
            try {
                musicService!!.songList = musicService!!.mainSongList
                Log.i("playy", "here2")
            } catch (E: Exception) {
                musicService!!.getMusicsDetails()
                Log.i("playy", "here")
                musicService!!.songList = musicService!!.mainSongList
            }

        }

        if (shuffleList == null) {
            musicService!!.playShuffle()
        } else {
            musicService!!.shuffleList = shuffleList
            Log.i("sh" , musicService!!.shuffleList.toString())
        }



        if (musicService!!.musicPlayer == null) musicService!!.musicPlayer = MediaPlayer()
        musicService!!.musicPlayer!!.reset()
        musicService!!.musicPlayer!!.setDataSource(path)
        musicService!!.musicPlayer!!.prepare()
        musicService!!.musicPlayer!!.start()
        //musicService!!.showNotification()
        musicService!!.startNotification()


        musicService!!.musicPlayer!!.setOnCompletionListener {
            val pos = shared.getInt("position", 0)
            val editor = shared.edit()
            if (shared.getBoolean("shuffle", false)) {
                val shufflePos = shared.getInt("shufflePosition", 0)
                val musicName =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Title
                val musicArtist =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Artist
                binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist
                val imagePath =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                editor.putString("musicName", musicName)
                editor.putString("musicArtist", musicArtist)
                editor.putString("imagePath", imagePath)
            } else {
                val musicName = musicService!!.songList[pos + 1].Title
                val musicArtist = musicService!!.songList[pos + 1].Artist
                binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist
                val imagePath = musicService!!.songList[pos + 1].image
                editor.putString("musicName", musicName)
                editor.putString("musicArtist", musicArtist)
                editor.putString("imagePath", imagePath)
            }

            editor.apply()
            musicService!!.play()
        }

    }


    override fun onServiceDisconnected(p0: ComponentName?) {

        musicService = null
    }

    private fun getRecentMusicsDetails() {
        val projection = arrayOf(
            MediaStore.Audio.Media.TITLE,
            MediaStore.Audio.Media.DATA,
            MediaStore.Audio.Media.DURATION,
            MediaStore.Audio.Media.ALBUM_ID,
            MediaStore.Audio.Media.ARTIST
        )

        val selection = MediaStore.Audio.Media.IS_MUSIC + " != 0"
        val cursor: Cursor? = contentResolver.query(
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            null,
            null
        )



        while (cursor!!.moveToNext()) {
            //Toast.makeText(this, "ttttttt", Toast.LENGTH_SHORT).show()
            val id = cursor!!.getLong(3).toString()
            val uri = Uri.parse("content://media/external/audio/albumart")
            val artUri = Uri.withAppendedPath(uri, id).toString()
            val songsData =
                AudioModel(
                    cursor.getString(1), cursor.getString(0).trim(),
                    cursor.getString(2),
                    artUri,
                    cursor.getString(4)
                )



            recentSongs.add(songsData)


            //Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show()


        }


    }

    private fun requestPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            )
        ) {
            Toast.makeText(
                this,
                "permission not granted please do it from setting",
                Toast.LENGTH_SHORT
            ).show()
            val permissions = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            ActivityCompat.requestPermissions(this, permissions, 100)
        } else {
            val permissions = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            ActivityCompat.requestPermissions(this, permissions, 100)
        }

    }

    private fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(
            this,
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        )

        return result == PackageManager.PERMISSION_GRANTED

    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.permissionTxt.visibility = View.GONE
                setUpTabLayout()
            } else {
                binding.permissionTxt.visibility = View.VISIBLE
            }
        }
    }

    fun setShuffleList(shuffleList: List<Int>) {
        this.shuffleList = shuffleList
    }

    override fun onAudioFocusChange(focus: Int) {
        if (focus == AudioManager.AUDIOFOCUS_LOSS) {
            audioManager.abandonAudioFocus(this);
            musicService!!.musicPlayer!!.stop();
        }
    }

    private fun changeMusicFocus() {
        // Request audio focus for playback
        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager


        // Request audio focus for playback
        val result = audioManager.requestAudioFocus(
            this,  // Use the music stream.
            AudioManager.STREAM_MUSIC,  // Request permanent focus.
            AudioManager.AUDIOFOCUS_GAIN
        )


    }


}


