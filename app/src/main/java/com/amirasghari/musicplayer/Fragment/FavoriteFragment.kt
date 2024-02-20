package com.amirasghari.musicplayer.Fragment

import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Activity.MainActivity
import com.amirasghari.musicplayer.Adapter.FavoriteAdapter
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.databinding.FragmentFavoriteBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.bumptech.glide.Glide


class FavoriteFragment : Fragment() , MusicListener{


    lateinit var binding:FragmentFavoriteBinding
    lateinit var viewModel: ViewModel
    lateinit var shared: SharedPreferences
    lateinit var bindingActivity:ActivityMainBinding
    private var first = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_favorite , container , false)

        val main  = requireActivity() as MainActivity
        bindingActivity = main.binding
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shared = requireActivity().getSharedPreferences("music" , 0)

        //mediaPlayer = MediaPlayer()
        viewModel = ViewModelProvider(this)[ViewModel::class.java]


    }

    override fun onResume() {
        super.onResume()
        recyclerView()
    }

    private fun recyclerView(){
        val data = RealmDAO().favoriteReadAll()
        val favoriteMusic=ArrayList<AudioModel>()
        data.forEach {
            favoriteMusic.add(AudioModel(
                it.musicPath,
                it.musicName,
                it.duration,
                it.imagePath,
                it.artistName
            ))
        }


        val adapter = FavoriteAdapter(requireContext() , favoriteMusic , this)
        binding.rec.adapter =adapter
        binding.rec.layoutManager = LinearLayoutManager(requireContext() , LinearLayoutManager.VERTICAL , false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onclickListener(data: AudioModel, position: Int) {
        val editor = shared.edit()
        editor.putInt("position" , position)
        editor.putString("imagePath" , data.image)
        editor.putString("musicPath" , data.Path)
        editor.putString("musicName" , data.Title)
        editor.putString("musicArtist" , data.Artist)
        editor.putBoolean("favorite" , true)
        editor.apply()
        viewModel.setCurrentMusicName(data.Title)

        bindingActivity.currentMusicTxt.text = data.Title
        bindingActivity.currentMusicArtistTxt.text = data.Artist
        Glide.with(requireActivity()).load(data.image).into(bindingActivity.currentMusicImg)
        val  animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.rotate);
        bindingActivity.currentMusicImg.startAnimation(animation)


        if (shared.getBoolean("first" , true)){
            (activity as MainActivity?)!!.startService()
            editor.putBoolean("first" , false)
            editor.apply()
        }else{
            (activity as MainActivity?)!!.play(data.Path)
        }

    }


}