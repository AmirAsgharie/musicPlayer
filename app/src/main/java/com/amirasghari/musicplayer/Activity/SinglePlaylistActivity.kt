package com.amirasghari.musicplayer.Activity

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.SinglePlaylistAdapter
import com.amirasghari.musicplayer.Interface.SinglePlayListListener
import com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

class SinglePlaylistActivity : AppCompatActivity(), SinglePlayListListener,
    SinglePlayListMenuListener,
    ServiceConnection {

    var musicService: Service? = null
    lateinit var shared: SharedPreferences
    lateinit var viewModel: ViewModel
    lateinit var binding: ActivitySinglePlaylistBinding
    val currentPlayListMusic = ArrayList<SinglePlaylistInfo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinglePlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        shared = getSharedPreferences("music", 0)
        val editor = shared.edit()
        //editor.putBoolean("first" , true)
        editor.apply()

        val playlistName = intent.getStringExtra("playListName")

        binding.playListName.text = playlistName.toString().uppercase()

        val realm = RealmDAO()
        val allResult = realm.singlePlaylistReadAll()
        allResult.forEach {
            if (it.playListName == playlistName) {
                currentPlayListMusic.add(it)
            }
        }

        recyclerView(currentPlayListMusic)
        Log.i("single1", currentPlayListMusic.toString())
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
        editor.apply()
        viewModel.setCurrentMusicName(data.musicName)


        if (shared.getBoolean("first", true)) {
            startService()
            editor.putBoolean("first", false)
            editor.apply()
        } else {
            play(data.musicPath)
        }
    }

    override fun onMenuClickListener(data: SinglePlaylistInfo, position: Int, view: View) {
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
    }

    fun startService() {
        val intent = Intent(this, Service::class.java)
        bindService(intent, this, BIND_AUTO_CREATE)
        startService(intent)
        //Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
    }

    override fun onServiceConnected(p0: ComponentName?, service: IBinder?) {
        val binder = service as Service.MyBinder
        musicService = binder.currentService()
        //Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        val path = shared.getString("musicPath", "")
        //play(path!!)
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        TODO("Not yet implemented")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun play(path: String) {
        val playListMusics = changePlayList()
        musicService!!.songList = playListMusics
        Log.i("playy", "here2")
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
                /*binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist*/
                val imagePath =musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                editor.putString("musicName" , musicName)
                editor.putString("musicArtist" , musicArtist)
                editor.putString("imagePath" , imagePath)
            }else{
                val musicName = musicService!!.songList[pos+1].Title
                val musicArtist = musicService!!.songList[pos+1].Artist
                /*binding.currentMusicTxt.text = musicName
                binding.currentMusicArtistTxt.text = musicArtist*/
                val imagePath =musicService!!.songList[pos+1].image
                editor.putString("musicName" , musicName)
                editor.putString("musicArtist" , musicArtist)
                editor.putString("imagePath" , imagePath)
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
}