package com.amirasghari.musicplayer.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.MusicRowBinding
import com.bumptech.glide.Glide

class RecentlyAdapter(val context: Context, val data: MutableList<AudioModel>, private val listener: MusicListener): RecyclerView.Adapter<RecentlyAdapter.RecentlyViewHolder>() {

    inner class RecentlyViewHolder(val binding: MusicRowBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: AudioModel, position: Int, listener: MusicListener){
            binding.musicCons.setOnClickListener {
                listener.onclickListener(data ,position )
            }
            if (data.image.isBlank()){
                Glide.with(context).load(R.drawable.play2).into(binding.musicImg)
            }else{
                Glide.with(context).load(data.image).into(binding.musicImg)
            }


            when (position%4){
                0->binding.musicCons.setBackgroundColor(context.getColor(R.color.lightBlue))
                1->binding.musicCons.setBackgroundColor(context.getColor(R.color.lightGreen))
                2->binding.musicCons.setBackgroundColor(context.getColor(R.color.lightYellow))
                3->binding.musicCons.setBackgroundColor(context.getColor(R.color.lightOrange))
            }

            //if (audioModel.Title.length>=30){
            //val music = audioModel.Title.subSequence(0 ,30)
            //binding.musicText.text = "$music..."
            //}else{
            binding.musicText.text = data.Title
            //}
            binding.artistText.text = data.Artist
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentlyViewHolder {
        val binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.music_row,
            parent,
            false
        ) as MusicRowBinding

        return RecentlyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecentlyViewHolder, position: Int) {
        holder.bind(data[position] , position , listener)
    }

    override fun getItemCount(): Int =data.size
}