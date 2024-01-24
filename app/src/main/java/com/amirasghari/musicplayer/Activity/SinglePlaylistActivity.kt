package com.amirasghari.musicplayer.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.SinglePlaylistAdapter
import com.amirasghari.musicplayer.Interface.SinglePlayListListener
import com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

class SinglePlaylistActivity : AppCompatActivity() , SinglePlayListListener , SinglePlayListMenuListener{
    lateinit var binding:ActivitySinglePlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinglePlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val playlistName = intent.getStringExtra("playListName")

        binding.playListName.text = playlistName.toString().uppercase()

        val realm =RealmDAO()
        val allResult = realm.singlePlaylistReadAll()
        val data = ArrayList<SinglePlaylistInfo>()
        allResult.forEach {
            if (it.playListName == playlistName){
                data.add(it)
            }
        }

        binding.backCard.setOnClickListener {
            onBackPressed()
        }

        recyclerView(data)
        Log.i("single1" , data.toString())
    }

    private fun recyclerView(data:ArrayList<SinglePlaylistInfo>){
        val adapter = SinglePlaylistAdapter(this ,data ,this , this  )
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
    }

    override fun onclickListener(data: SinglePlaylistInfo, position: Int) {
        Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
    }

    override fun onMenuClickListener(data: SinglePlaylistInfo, position: Int, view: View) {
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
    }
}