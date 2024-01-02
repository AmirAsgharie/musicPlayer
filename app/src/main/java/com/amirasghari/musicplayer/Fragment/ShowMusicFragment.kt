package com.amirasghari.musicplayer.Fragment

import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.amirasghari.musicplayer.Activity.MainActivity
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityMainBinding
import com.amirasghari.musicplayer.databinding.ActivityShowMusicBinding
import com.amirasghari.musicplayer.databinding.FragmentShowMusicBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.RealmDAO
import com.bumptech.glide.Glide

class ShowMusicFragment : Fragment() {

    lateinit var binding: FragmentShowMusicBinding
    lateinit var bindingActivity: ActivityMainBinding
    lateinit var shared: SharedPreferences
    lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_show_music, container, false)
        val main = requireActivity() as MainActivity
        bindingActivity = main.binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shared = requireActivity().getSharedPreferences("music", 0)

        binding.addBtn.setOnClickListener {

        }


        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        //x()
        setUp()

        /*binding.controlMusicImg.setOnClickListener {
            it as ImageButton
            it.setImageResource(R.drawable.play2)
        }*/

    }

    private fun setUp() {

        /*val musicName = intent.getStringExtra("musicName")
        val musicArtist = intent.getStringExtra("musicArtist")
        val image = shared.getString("path", "")
        if (musicName!!.length >= 25) {
            binding.musicTitle.text = "${musicName!!.subSequence(0, 25)}..."
        } else {
            binding.musicTitle.text = musicName
        }

        if (musicArtist!!.length >= 20) {
            binding.musicArtist.text = "${musicName!!.subSequence(0, 20)}..."
        } else {
            binding.musicArtist.text = musicName
        }

        if (binding.musicArtist.text.length>=20){
            binding.musicArtist.text = "${binding.musicArtist.text!!.subSequence(0, 20)}..."
        }


        Glide.with(this).load(image).into(binding.musicImg)

        val  animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        binding.musicImg.startAnimation(animation)*/
    }

}