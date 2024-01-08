package com.amirasghari.musicplayer.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.amirasghari.musicplayer.Interface.PlaylistListener
import com.amirasghari.musicplayer.Interface.PlaylistMenuListener
import com.amirasghari.musicplayer.Interface.SinglePlayListListener
import com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.MusicRowBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo
import com.bumptech.glide.Glide

class SinglePlaylistAdapter(
    val context: Context,
    val data: ArrayList<SinglePlaylistInfo>,
    private val listener: SinglePlayListListener,
    private val longListener: SinglePlayListMenuListener
) :
    RecyclerView.Adapter<SinglePlaylistAdapter.SinglePlaylistViewHolder>() {

    inner class SinglePlaylistViewHolder(private val binding: MusicRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("ResourceAsColor")

        fun bind(singlePlaylistInfo: SinglePlaylistInfo, position: Int, listener: SinglePlayListListener) {

            binding.musicCons.setOnClickListener {
                listener.onclickListener(singlePlaylistInfo, position)
            }

            binding.musicCons.setOnLongClickListener {
                longListener.onMenuClickListener(singlePlaylistInfo , position , it)
                return@setOnLongClickListener false
            }

            if (singlePlaylistInfo.imagePath.isBlank()) {
                Glide.with(context).load(R.drawable.play2).into(binding.musicImg)
            } else {
                Glide.with(context).load(singlePlaylistInfo.imagePath).into(binding.musicImg)
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
            binding.musicText.text = singlePlaylistInfo.musicName
            //}
            binding.artistText.text =singlePlaylistInfo.artist
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SinglePlaylistViewHolder {
        val binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.music_row,
            parent,
            false
        ) as MusicRowBinding

        return SinglePlaylistViewHolder(binding)

    }

    override fun onBindViewHolder(holder: SinglePlaylistViewHolder, position: Int) {
        holder.bind(data[position], position, listener)
    }

    override fun getItemCount(): Int = data.size


}