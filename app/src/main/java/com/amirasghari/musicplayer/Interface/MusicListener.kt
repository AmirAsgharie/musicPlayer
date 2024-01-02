package com.amirasghari.musicplayer.Interface

import com.amirasghari.musicplayer.Model.AudioModel

interface MusicListener {

    fun onclickListener(data: AudioModel, position:Int)
}