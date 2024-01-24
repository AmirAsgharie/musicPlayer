package com.amirasghari.musicplayer.Activity

import android.content.DialogInterface
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.PlaylistAdapter
import com.amirasghari.musicplayer.Interface.PlaylistListener
import com.amirasghari.musicplayer.Interface.PlaylistMenuListener
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.ActivityPlaylistBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

class PlaylistActivity : AppCompatActivity() ,PlaylistListener , PlaylistMenuListener{
    lateinit var binding: ActivityPlaylistBinding
    lateinit var shared: SharedPreferences

    lateinit var title: String
    lateinit var artist: String
    lateinit var image: String
    lateinit var path: String
    lateinit var duration: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = getSharedPreferences("music", 0)

        title = intent.getStringExtra("title").toString()
        artist = intent.getStringExtra("artist").toString()
        image = intent.getStringExtra("image").toString()
        path = intent.getStringExtra("path").toString()
        duration = intent.getStringExtra("duration").toString()


        val data = RealmDAO().playlistReadAll()
        recyclerView()



        binding.musicCons.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Name")
            val customLayout: View = layoutInflater.inflate(R.layout.playllist_dialog, null)
            alertDialog.setView(customLayout)

            alertDialog.setPositiveButton(
                "create",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    val playListName = customLayout.findViewById<EditText>(R.id.dialogEdt).text

                    createNewPlaylist(playListName.toString())

                    Log.i("playlist", data.toString())
                })
            val dialog = alertDialog.create()
            dialog.show()
        }

        binding.backCard.setOnClickListener {
            finish()
        }
    }

    private fun createNewPlaylist(playListName: String) {
        if (playListName.isNullOrBlank()) {
            Toast.makeText(
                this,
                "you have to choose a special name",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            val realmDAO = RealmDAO()
            val listName = realmDAO.playlistReadAll()
            var exist = false
            listName.forEach {
                if (it.playListName.equals(playListName.toString())) {
                    exist = true
                }
            }
            if (exist) {
                Toast.makeText(this, "this name already exist", Toast.LENGTH_SHORT)
                    .show()
                exist = false
            } else {
                val playlistsInfo: PlaylistsInfo = PlaylistsInfo()
                playlistsInfo.playListName = playListName.toString()
                playlistsInfo.musicNumber = 0
                playlistsInfo.playListMainImagePath = image!!
                realmDAO.playlistUpdate(playlistsInfo)

                addToPlayList(playListName.toString())
            }
        }

    }

    private fun recyclerView(){
        val realm =RealmDAO()
        val playlistsInfo =realm.playlistReadAll()
        val data = ArrayList<PlaylistsInfo>()
        playlistsInfo.forEach {
            data.add(it)
        }

        val adapter =PlaylistAdapter(this , data , this , this)
        binding.playlistRec.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
        binding.playlistRec.adapter=adapter
    }

    private fun addToPlayList(playListName: String) {
        val realmDAO = RealmDAO()
        val singlePlaylistInfo = SinglePlaylistInfo()
        singlePlaylistInfo.playList_music = "${playListName}_${title}"
        singlePlaylistInfo.playListName = playListName
        singlePlaylistInfo.musicName = title
        singlePlaylistInfo.artist = artist
        singlePlaylistInfo.musicPath = path
        singlePlaylistInfo.imagePath = image
        singlePlaylistInfo.duration = duration

        realmDAO.singlePlaylistReadAll().forEach {
            if (it.musicPath == path){
                if (it.playListName == playListName){
                    Toast.makeText(this, "this is exist", Toast.LENGTH_SHORT).show()
                    return
                }
            }
        }

        realmDAO.singlePlaylistUpdate(singlePlaylistInfo)

        val playlist = realmDAO.playlistReadByName(playListName)
        val playlistsInfo =PlaylistsInfo()
        playlistsInfo.playListName = playlist!!.playListName
        playlistsInfo.musicNumber = playlist.musicNumber + 1
        playlistsInfo.playListMainImagePath = image

        realmDAO.playlistUpdate(playlistsInfo)
        Log.i("playList" ,realmDAO.playlistReadAll().toString())
    }

    override fun onclickListener(data: PlaylistsInfo, position: Int) {
        addToPlayList(data.playListName)
    }

    override fun onMenuClickListener(data: PlaylistsInfo, position: Int, view: View) {
        Toast.makeText(this, "long", Toast.LENGTH_SHORT).show()    }
}