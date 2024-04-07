package com.amirasghari.musicplayer.Fragment

import android.content.Intent
import android.content.SharedPreferences
import android.database.Cursor
import android.media.MediaPlayer
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Activity.MainActivity
import com.amirasghari.musicplayer.Activity.PlaylistActivity
import com.amirasghari.musicplayer.Adapter.MusicAdapter
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Interface.MusicMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.databinding.FragmentMainBinding
import com.bumptech.glide.Glide


class MainFragment() : Fragment(), MusicListener, MusicMenuListener {

    lateinit var binding: FragmentMainBinding
    lateinit var mediaPlayer: MediaPlayer
    lateinit var viewModel: ViewModel
    lateinit var shared: SharedPreferences
    private lateinit var shuffleList: List<Int>
    lateinit var bindingActivity: ActivityMainBinding
    lateinit var path: String
    lateinit var musicName: String
    lateinit var musicArtist: String
    private var first = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //bind fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        //bind main activity
        val main = requireActivity() as MainActivity
        bindingActivity = main.binding

        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shared = requireActivity().getSharedPreferences("music", 0)

        //mediaPlayer = MediaPlayer()
        viewModel = ViewModelProvider(this)[ViewModel::class.java]


        bindingActivity.backCard.setOnClickListener {
            playShuffle()
        }




        if (viewModel.observeSongsList().value == null) {
            getMusicsDetails()
        }
        recyclerView()


    }

    override fun onResume() {
        super.onResume()

    }

    private fun recyclerView() {

        binding.rec.layoutManager = LinearLayoutManager(requireActivity())
        //songsList.sortWith(compareBy { it.Title })
        val adapter = MusicAdapter(requireActivity(), viewModel.observeSongsList(), this, this)
        binding.rec.adapter = adapter

    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
        return true
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onclickListener(data: AudioModel, position: Int) {


        val editor = shared.edit()
        editor.putInt("position", position)
        editor.putString("imagePath", data.image)
        editor.putString("musicPath", data.Path)
        editor.putString("musicName", data.Title)
        editor.putString("musicArtist", data.Artist)
        editor.putBoolean("favorite", false)
        editor.putBoolean("recent", false)
        editor.apply()
        viewModel.setCurrentMusicName(data.Title)


        bindingActivity.currentMusicTxt.text = data.Title
        bindingActivity.currentMusicArtistTxt.text = data.Artist
        Glide.with(requireActivity()).load(data.image).into(bindingActivity.currentMusicImg)
        val animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.rotate)
        bindingActivity.currentMusicImg.startAnimation(animation)

        /*val intent = Intent(requireActivity(), Service::class.java)
        intent.putExtra("position", position)
        startForegroundService(requireActivity(), intent)*/

        if (shared.getBoolean("first", true)) {
            (activity as MainActivity?)!!.startService()
            editor.putBoolean("first", false)
            editor.apply()
        } else {
            (activity as MainActivity?)!!.play(data.Path, null, null)
        }


    }


    private fun getMusicsDetails() {
        val projection = arrayOf(
            MediaStore.Audio.Media.TITLE,
            MediaStore.Audio.Media.DATA,
            MediaStore.Audio.Media.DURATION,
            MediaStore.Audio.Media.ALBUM_ID,
            MediaStore.Audio.Media.ARTIST
        )
        val selection = MediaStore.Audio.Media.IS_MUSIC + " != 0"
        val cursor: Cursor? = requireActivity().contentResolver.query(
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
                    cursor.getString(1),
                    cursor.getString(0).trim(),
                    if (cursor.getString(3) == null) {
                        "100000"
                    } else {
                        cursor.getString(2)
                    },
                    artUri,
                    cursor.getString(4)
                )

            viewModel.addToSongList(songsData)
            //songsList.add(songsData)
            //Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show()


        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun playShuffle() {

        val music = viewModel.observeSongsList().value!!

        val size = viewModel.size() - 1
        shuffleList = (0..size).shuffled()
        Log.i("shuffle" , shuffleList.toString())
        val editor = shared.edit()
        editor.putInt("position", shuffleList[0])
        editor.putInt("shufflePosition", 1)
        editor.putBoolean("shuffle", true)
        editor.putString("imagePath", music[shuffleList[0]].image)
        editor.putString("musicPath", music[shuffleList[0]].Path)
        editor.putString("musicName", music[shuffleList[0]].Title)
        editor.putString("musicArtist", music[shuffleList[0]].Artist)
        editor.putBoolean("favorite", false)
        editor.putBoolean("recent", false)
        editor.apply()


        bindingActivity.currentMusicTxt.text = music[shuffleList[0]].Title
        bindingActivity.currentMusicArtistTxt.text = music[shuffleList[0]].Artist
        Glide.with(requireActivity()).load(music[shuffleList[0]].image).into(bindingActivity.currentMusicImg)
        val animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.rotate)
        bindingActivity.currentMusicImg.startAnimation(animation)



        if (shared.getBoolean("first", true)) {
            (activity as MainActivity?)!!.setShuffleList(shuffleList)
            (activity as MainActivity?)!!.startService()
            editor.putBoolean("first", false)
            editor.apply()
        } else {
            (activity as MainActivity?)!!.play(music[shuffleList[0]].Path, null, shuffleList)
        }

    }

    override fun onPrepareOptionsMenu(menu: Menu) {

    }


    override fun onMenuClickListener(data: AudioModel, position: Int, view: View) {
        val popupMenu = PopupMenu(requireContext(), view)
        // add the menu
        popupMenu.inflate(R.menu.options_menu)
        popupMenu.show()

        popupMenu.setOnMenuItemClickListener { item ->
            when (item.title) {
                "delete" -> {
                    Toast.makeText(requireActivity(), "delete", Toast.LENGTH_SHORT).show()
                    true
                }

                "playlist" -> {
                    val intent = Intent(requireActivity(), PlaylistActivity::class.java)
                    intent.putExtra("title", data.Title)
                    intent.putExtra("artist", data.Artist)
                    intent.putExtra("image", data.image)
                    intent.putExtra("path", data.Path)
                    intent.putExtra("duration", data.Duration)
                    startActivity(intent)
                    true
                }

                else -> {
                    false
                }
            }


        }


    }


}