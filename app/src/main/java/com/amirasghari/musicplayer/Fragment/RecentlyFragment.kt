package com.amirasghari.musicplayer.Fragment

import android.content.ComponentName
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Activity.MainActivity
import com.amirasghari.musicplayer.Adapter.RecentlyAdapter
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Interface.MusicMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.databinding.FragmentRecentlyBinding
import com.bumptech.glide.Glide


class RecentlyFragment : Fragment(), MusicListener, MusicMenuListener ,ServiceConnection {
    lateinit var binding: FragmentRecentlyBinding
    lateinit var viewModel: ViewModel
    lateinit var shared: SharedPreferences
    lateinit var bindingActivity: ActivityMainBinding
    private var first = true
    private var recentSongs = ArrayList<AudioModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recently, container, false)
        val main = requireActivity() as MainActivity
        bindingActivity = main.binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shared = requireActivity().getSharedPreferences("music", 0)


        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        getMusicsDetails()
        recycler()
    }

    override fun onResume() {
        super.onResume()
        //recycler()
    }

    private fun recycler() {

        if (recentSongs.size > 100) {
            val limitRecent = recentSongs.subList(0, 100)
            val adapter = RecentlyAdapter(requireActivity(), limitRecent, this)
            binding.recentRec.adapter = adapter
        } else {
            val adapter = RecentlyAdapter(requireActivity(), recentSongs, this)
            binding.recentRec.adapter = adapter
        }


        binding.recentRec.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
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
        editor.putBoolean("onPlayList" , false)
        editor.putBoolean("recent" , true)
        editor.apply()
        viewModel.setCurrentMusicName(data.Title)

        bindingActivity.currentMusicTxt.text = data.Title
        bindingActivity.currentMusicArtistTxt.text = data.Artist
        Glide.with(requireActivity()).load(data.image).into(bindingActivity.currentMusicImg)
        val animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.rotate);
        bindingActivity.currentMusicImg.startAnimation(animation)


        if (shared.getBoolean("first", true)) {
            editor.putBoolean("first", false)
            editor.apply()
            (activity as MainActivity?)!!.startService()
        } else {
            editor.apply()
            (activity as MainActivity?)!!.play(data.Path , recentSongs , null)
        }
    }

    override fun onMenuClickListener(data: AudioModel, position: Int, view: View) {
        Toast.makeText(requireActivity(), "diss", Toast.LENGTH_SHORT).show()
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
                    cursor.getString(1), cursor.getString(0).trim(),
                    cursor.getString(2),
                    artUri,
                    cursor.getString(4)
                )


            recentSongs.add(songsData)
            //Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show()
        }

        recentSongs.reverse()
    }

    override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
        TODO("Not yet implemented")
    }

    override fun onServiceDisconnected(p0: ComponentName?) {
        TODO("Not yet implemented")
    }

    override fun onStop() {
        super.onStop()
        recentSongs.clear()
    }


}