package com.amirasghari.musicplayer.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amirasghari.musicplayer.Model.AudioModel

open class ViewModel : ViewModel() {

    private val songsList = MutableLiveData<ArrayList<AudioModel>>()
    var songs = ArrayList<AudioModel>()
    var songsRecent = ArrayList<AudioModel>()
    private var recentSongs = MutableLiveData<ArrayList<AudioModel>>()
    private val currentMusicName=MutableLiveData<String>()



    fun addToSongList(data: AudioModel) {
        songs.add(data)
        songs.sortWith(compareBy { it.Title })
        songsList.value = songs
    }

    fun addToRecent(data: AudioModel){
        songsRecent.add(data)
    }



    fun observeSongsList():MutableLiveData<ArrayList<AudioModel>>{
        return songsList
    }

    fun  reverse(){
        songsRecent.reverse()
    }

    fun observeRecentSongsList():MutableLiveData<ArrayList<AudioModel>>{
        recentSongs.value = songsRecent
        return recentSongs
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