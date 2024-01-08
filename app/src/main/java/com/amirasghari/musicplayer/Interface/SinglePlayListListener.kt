package com.amirasghari.musicplayer.Interface

import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

interface SinglePlayListListener {
    fun onclickListener(data: SinglePlaylistInfo, position:Int)
}