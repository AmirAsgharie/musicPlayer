package com.amirasghari.musicplayer.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amirasghari.musicplayer.databinding.MusicRowBinding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Interface.MusicMenuListener
import com.amirasghari.musicplayer.R
import com.bumptech.glide.Glide

class MusicAdapter(
    val context: Context,
    val data: MutableLiveData<ArrayList<AudioModel>>,
    private val listener: MusicListener,
    private val longListener: MusicMenuListener
) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    inner class MusicViewHolder(private val binding: MusicRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("ResourceAsColor")
        fun bind(audioModel: AudioModel, position: Int, listener: MusicListener) {
            binding.musicCons.setOnClickListener {
                listener.onclickListener(audioModel, position)
            }

            binding.musicCons.setOnLongClickListener {
                longListener.onMenuClickListener(audioModel , position , it)
                return@setOnLongClickListener false
            }
            if (audioModel.image.isBlank()) {
                Glide.with(context).load(R.drawable.play2).into(binding.musicImg)
            } else {
                Glide.with(context).load(audioModel.image).into(binding.musicImg)
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
            binding.musicText.text = audioModel.Title
            //}
            binding.artistText.text = audioModel.Artist
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.music_row,
            parent,
            false
        ) as MusicRowBinding

        return MusicViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(data.value?.get(position)!!, position, listener)
    }

    override fun getItemCount(): Int = try {
        data.value!!.size
    }catch (e:Exception){
        0
    }


}