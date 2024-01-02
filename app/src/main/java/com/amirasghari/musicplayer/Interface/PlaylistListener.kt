package com.amirasghari.musicplayer.Interface

import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.realm.PlaylistsInfo

interface PlaylistListener {

    fun onclickListener(data: PlaylistsInfo, position:Int)
}