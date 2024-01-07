package com.amirasghari.musicplayer.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

class SinglePlaylistActivity : AppCompatActivity() {
    lateinit var binding:ActivitySinglePlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinglePlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val playlistName = intent.getStringExtra("playListName")

        val realm =RealmDAO()
        val allResult = realm.singlePlaylistReadAll()
        val data = ArrayList<SinglePlaylistInfo>()
        allResult.forEach {
            if (it.playListName == playlistName){
                data.add(it)
            }
        }
    }
}