package com.amirasghari.musicplayer.Activity

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.SinglePlaylistAdapter
import com.amirasghari.musicplayer.Interface.SinglePlayListListener
import com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo
import com.bumptech.glide.Glide

class SinglePlaylistActivity : AppCompatActivity(), SinglePlayListListener,
    SinglePlayListMenuListener,
    ServiceConnection, AudioManager.OnAudioFocusChangeListener {

    var musicService: Service? = null
    lateinit var shared: SharedPreferences
    lateinit var viewModel: ViewModel
    lateinit var mainHandler: Handler
    lateinit var binding: ActivitySinglePlaylistBinding
    lateinit var path: String
    lateinit var audioManager: AudioManager
    lateinit var musicName: String
    lateinit var musicArtist: String
    lateinit var playlistName:String
    private lateinit var shuffleList: List<Int>
    val currentPlayListMusic = ArrayList<SinglePlaylistInfo>()
    var playListMusics = ArrayList<AudioModel>()


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinglePlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        playlistName = intent.getStringExtra("playListName").toString()

        shared = getSharedPreferences("music", 0)
        val editor = shared.edit()
        editor.putBoolean("firstPlayList", true)
        editor.putString("playlistName", playlistName)
        //editor.putBoolean("first" , true)
        editor.apply()



        binding.playListName.text = playlistName.toString().uppercase()

        binding.currentMusicCard.setOnClickListener {
            val intent = Intent(this, ShowMusicActivity::class.java)
            intent.putExtra("musicName", binding.currentMusicTxt.text)
            intent.putExtra("musicArtist", binding.currentMusicArtistTxt.text)
            startActivity(intent)
        }

        binding.backCard.setOnClickListener {
            onBackPressed()
        }

        binding.shuffleCard.setOnClickListener {
            playShuffle(currentPlayListMusic)
        }

        val realm = RealmDAO()
        val allResult = realm.singlePlaylistReadAll()
        allResult.forEach {
            if (it.playListName == playlistName) {
                currentPlayListMusic.add(it)
            }
        }
        playListMusics = changePlayList()



        recyclerView(currentPlayListMusic)

        mainHandler = Handler(Looper.getMainLooper())

    }

    override fun onResume() {
        super.onResume()
        path = shared.getString("imagePath", "").toString()
        musicName = shared.getString("musicName", "").toString()
        musicArtist = shared.getString("musicArtist", "").toString()
        Glide.with(this).load(path).into(binding.currentMusicImg)
        binding.currentMusicTxt.text = musicName
        binding.currentMusicArtistTxt.text = musicArtist

        //updateUI()
    }

    private fun recyclerView(data: ArrayList<SinglePlaylistInfo>) {
        val adapter = SinglePlaylistAdapter(this, data, this, this)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onclickListener(data: SinglePlaylistInfo, position: Int) {
        val editor = shared.edit()
        editor.putInt("position", position)
        editor.putString("imagePath", data.imagePath)
        editor.putString("musicPath", data.musicPath)
        editor.putString("musicName", data.musicName)
        editor.putString("musicArtist", data.artist)
        editor.putBoolean("favorite", false)
        editor.putBoolean("onPlayList", true)
        editor.apply()
        //viewModel.setCurrentMusicName(data.musicName)

        binding.currentMusicTxt.text = data.musicName
        binding.currentMusicArtistTxt.text = data.artist
        Glide.with(this).load(data.imagePath).into(binding.currentMusicImg)
        val animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        binding.currentMusicImg.startAnimation(animation)


        if (shared.getBoolean("firstPlayList", true)) {
            startService()
            editor.putBoolean("firstPlayList", false)
            editor.apply()
        } else {
            val path = shared.getString("musicPath", "")
            play(path!!, null, null)
            editor.putBoolean("firstPlayList", false)
            editor.apply()
        }


    }

    override fun onMenuClickListener(data: SinglePlaylistInfo, position: Int, view: View) {
        val popupMenu = PopupMenu(this, view)
        // add the menu
        popupMenu.inflate(R.menu.single_playlist_menu)
        popupMenu.show()


        popupMenu.setOnMenuItemClickListener { item ->
            when (item.title) {
                "delete" -> {

                    val realmDAO = RealmDAO()
                    val musicName_PlayList = data.musicName_PlayList
                    realmDAO.singlePlaylistDelete(musicName_PlayList)


                    currentPlayListMusic.clear()


                    val playlist = realmDAO.playlistReadByName(playlistName)
                    val playlistsInfo = PlaylistsInfo()
                    playlistsInfo.playListName = playlist!!.playListName
                    playlistsInfo.musicNumber = playlist.musicNumber - 1
                    playlistsInfo.playListMainImagePath = playlist.playListMainImagePath
                    realmDAO.playlistUpdate(playlistsInfo)

                    val allResult = realmDAO.singlePlaylistReadAll()
                    allResult.forEach {
                        if (it.playListName == playlistName) {
                            currentPlayListMusic.add(it)
                        }
                    }
                    playListMusics = changePlayList()



                    recyclerView(currentPlayListMusic)


                    // val playlist = realmDAO.playlistReadByName(data.playListName)
                    true
                }

                else -> {
                    false
                }
            }


        }
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
        musicService!!.songList = playListMusics
        val path = shared.getString("musicPath", "")
        play(path!!, null, null)
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        Toast.makeText(this, "diss", Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun play(
        path: String,
        recentSongs: ArrayList<AudioModel>? = null,
        shuffleList: List<Int>?
    ) {
        //changeMusicFocus()


        musicService!!.playShuffle()

        if (musicService!!.musicPlayer == null) musicService!!.musicPlayer = MediaPlayer()
        musicService!!.musicPlayer!!.reset()
        musicService!!.musicPlayer!!.setDataSource(path)
        musicService!!.musicPlayer!!.prepare()
        musicService!!.musicPlayer!!.start()
        //musicService!!.startNotification()

        musicService!!.musicPlayer!!.setOnCompletionListener {
            val pos = shared.getInt("position", 0)
            val editor = shared.edit()
            if (shared.getBoolean("shuffle", false)) {
                val shufflePos = shared.getInt("shufflePosition", 0)
                val musicName =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Title
                val musicArtist =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Artist
                /*binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist*/
                val imagePath =
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                editor.putString("musicName", musicName)
                editor.putString("musicArtist", musicArtist)
                editor.putString("imagePath", imagePath)
            } else {
                val musicName = musicService!!.songList[pos + 1].Title
                val musicArtist = musicService!!.songList[pos + 1].Artist
                /*binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist*/
                val imagePath = musicService!!.songList[pos + 1].image
                editor.putString("musicName", musicName)
                editor.putString("musicArtist", musicArtist)
                editor.putString("imagePath", imagePath)
            }

            //Glide.with(this).load(imagePath).into(binding.currentMusicImg)


            //editor.putInt("position" , pos+1)
            editor.apply()
            musicService!!.play()
        }
    }

    private fun changePlayList(): ArrayList<AudioModel> {
        val playListMusics = ArrayList<AudioModel>()
        currentPlayListMusic.forEach {
            val audioModel =
                AudioModel(it.musicPath, it.musicName, it.duration, it.imagePath, it.artist)
            playListMusics.add(audioModel)
        }
        return playListMusics
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun playShuffle(currentPlayListMusic: ArrayList<SinglePlaylistInfo>) {

        val music = currentPlayListMusic

        val size = currentPlayListMusic.size
        shuffleList = (0 until size).shuffled()

        val editor = shared.edit()
        editor.putInt("position", shuffleList[0])
        editor.putInt("shufflePosition", 1)
        editor.putBoolean("shuffle", true)
        editor.putString("imagePath", music[shuffleList[0]].imagePath)
        editor.putString("musicPath", music[shuffleList[0]].musicPath)
        editor.putString("musicName", music[shuffleList[0]].musicName)
        editor.putString("musicArtist", music[shuffleList[0]].artist)
        editor.putBoolean("favorite", false)
        editor.putBoolean("recent", false)
        editor.putBoolean("onPlayList", true)
        editor.apply()


        binding.currentMusicTxt.text = music[shuffleList[0]].musicName
        binding.currentMusicArtistTxt.text = music[shuffleList[0]].artist
        Glide.with(this).load(music[shuffleList[0]].imagePath).into(binding.currentMusicImg)
        val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        binding.currentMusicImg.startAnimation(animation)



        if (shared.getBoolean("firstPlayList", true)) {
            setShuffleList(shuffleList)
            editor.putBoolean("firstPlayList", false)
            editor.apply()
            startService()
        } else {
            editor.putBoolean("firstPlayList", false)
            editor.apply()
            play(music[shuffleList[0]].musicPath, null, null)
            // play(music[shuffleList[0]].musicPath, null, shuffleList)
        }

//        musicService!!.startNotification()

    }

    fun setShuffleList(shuffleList: List<Int>) {
        this.shuffleList = shuffleList
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

    override fun onAudioFocusChange(focus: Int) {
        if (focus == AudioManager.AUDIOFOCUS_LOSS) {
            audioManager.abandonAudioFocus(this);
            musicService!!.musicPlayer!!.stop();
        }
    }

    fun updateUI() {
        mainHandler.post(object : Runnable {
            override fun run() {
                if (path != shared.getString("imagePath", "").toString()) {
                    path = shared.getString("imagePath", "").toString()
                    musicName = shared.getString("musicName", "").toString()
                    musicArtist = shared.getString("musicArtist", "").toString()

                    try {
                        Glide.with(this@SinglePlaylistActivity).load(path)
                            .into(binding.currentMusicImg)

                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                    binding.currentMusicTxt.text = musicName
                    binding.currentMusicArtistTxt.text = musicArtist
                }
                mainHandler.postDelayed(this, 1000)
            }
        })
    }


}