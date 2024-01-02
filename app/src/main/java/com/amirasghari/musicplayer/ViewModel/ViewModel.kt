package com.amirasghari.musicplayer.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amirasghari.musicplayer.Model.AudioModel

open class ViewModel : ViewModel() {

    private val songsList = MutableLiveData<ArrayList<AudioModel>>()
    var songs = ArrayList<AudioModel>()
    private val currentMusicName=MutableLiveData<String>()



    fun addToSongList(data: AudioModel) {
        songs.add(data)
        songs.sortWith(compareBy { it.Title })
        songsList.value = songs
    }

    fun observeSongsList():MutableLiveData<ArrayList<AudioModel>>{
        return songsList
    }

    fun size(): Int {
        return songsList.value!!.size
    }

    fun setCurrentMusicName(name :String){
        currentMusicName.value = name
    }

    fun getCurrentMusicName():MutableLiveData<String>{
        return currentMusicName
    }








}