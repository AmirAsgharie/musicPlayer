package com.amirasghari.musicplayer.Activity

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.graphics.drawable.GradientDrawable.Orientation
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.MusicAdapter
import com.amirasghari.musicplayer.Adapter.SearchAdapter
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity(), ServiceConnection ,  MusicListener{

    lateinit var binding:ActivitySearchBinding
    var musicService: Service? = null
    lateinit var shared: SharedPreferences
    var music = ArrayList<AudioModel>()
    lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        shared = getSharedPreferences("music" , 0)
        viewModel = ViewModelProvider(this)[ViewModel::class.java]


        startService()
        binding.moreBtn.setOnClickListener {

        }

        binding.searchEdt.doAfterTextChanged {
            val search = ArrayList<AudioModel>()
            for (i in 0 until music.size){
                if (music[i].Title.contains(it.toString() ,true)){
                    search.add(
                        AudioModel(music[i].Path , music[i].Title , music[i].Duration , music[i].image , music[i].Artist))
                    recyclerView(search)
                }
            }
        }
    }

    private fun recyclerView( data:ArrayList<AudioModel>) {
        binding.rec.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
        if (data.size >5){
            val data2 =ArrayList<AudioModel>()
            for (i in 0..10){
                data2.add(data[i])
                //binding.moreBtn.visibility = View.VISIBLE
            }
            val adapter = SearchAdapter(this , data2 , this )
            binding.rec.adapter = adapter
        }else{
            val adapter = SearchAdapter(this , data , this )
            binding.rec.adapter = adapter
            //binding.moreBtn.visibility = View.GONE
        }


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
        music = musicService!!.mainSongList
        Log.i("musicss" , music.toString())
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        TODO("Not yet implemented")
    }

    override fun onclickListener(data: AudioModel, position: Int) {
        val editor = shared.edit()
        editor.putInt("position" , position)
        editor.putString("imagePath" , data.image)
        editor.putString("musicPath" , data.Path)
        editor.putString("musicName" , data.Title)
        editor.putString("musicArtist" , data.Artist)
        editor.putBoolean("favorite" , false)
        editor.apply()
        viewModel.setCurrentMusicName(data.Title)

        if (musicService!!.musicPlayer == null) musicService!!.musicPlayer = MediaPlayer()
        musicService!!.musicPlayer!!.reset()
        musicService!!.musicPlayer!!.setDataSource(data.Path)
        musicService!!.musicPlayer!!.prepare()
        musicService!!.musicPlayer!!.start()
        musicService!!.showNotification()

        musicService!!.musicPlayer!!.setOnCompletionListener {
            musicService!!.repeat()
        }
    }

}