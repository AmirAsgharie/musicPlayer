package com.amirasghari.musicplayer.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Interface.MusicMenuListener
import com.amirasghari.musicplayer.Interface.PlaylistListener
import com.amirasghari.musicplayer.Interface.PlaylistMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.MusicRowBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.bumptech.glide.Glide

class PlaylistAdapter(
    val context: Context,
    val data: ArrayList<PlaylistsInfo>,
    private val listener: PlaylistListener,
    private val longListener: PlaylistMenuListener
) :
    RecyclerView.Adapter<PlaylistAdapter.PlayListViewHolder>() {

    inner class PlayListViewHolder(private val binding: MusicRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("ResourceAsColor")

        fun bind(playlistsInfo: PlaylistsInfo, position: Int, listener: PlaylistListener) {

            binding.musicCons.setOnClickListener {
                listener.onclickListener(playlistsInfo, position)
            }

            binding.musicCons.setOnLongClickListener {
                longListener.onMenuClickListener(playlistsInfo , position , it)
                return@setOnLongClickListener false
            }

            if (playlistsInfo.playListMainImagePath.isBlank()) {
                Glide.with(context).load(R.drawable.play2).into(binding.musicImg)
            } else {
                Glide.with(context).load(playlistsInfo.playListMainImagePath).into(binding.musicImg)
            }


            when (position % 4) {
                0 -> binding.musicCons.setBackgroundColor(context.getColor(R.color.lightBlue))
                1 -> binding.musicCons.setBackgroundColor(context.getColor(R.color.lightGreen))
                2 -> binding.musicCons.setBackgroundColor(context.getColor(R.color.lightYellow))
                3 -> binding.musicCons.setBackgroundColor(context.getColor(R.color.lightOrange))
            }

            //if (audioModel.Title.length>=30){
            //val music = audioModel.Title.subSequence(0 ,30)
            //binding.musicText.text = "$music..."
            //}else{
            binding.musicText.text = playlistsInfo.playListName
            //}
            binding.artistText.text =playlistsInfo.musicNumber.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListViewHolder {
        val binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.music_row,
            parent,
            false
        ) as MusicRowBinding

        return PlayListViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PlayListViewHolder, position: Int) {
        holder.bind(data[position], position, listener)
    }

    override fun getItemCount(): Int = data.size


}