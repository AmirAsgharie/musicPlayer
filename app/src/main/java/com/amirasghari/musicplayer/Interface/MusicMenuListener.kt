package com.amirasghari.musicplayer.Interface

import android.view.View
import com.amirasghari.musicplayer.Model.AudioModel

interface MusicMenuListener {

    fun onMenuClickListener(data: AudioModel, position:Int, view:View)
}