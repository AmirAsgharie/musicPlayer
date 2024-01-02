package com.amirasghari.musicplayer.Interface

import android.view.View
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.realm.PlaylistsInfo

interface PlaylistMenuListener {
    fun onMenuClickListener(data: PlaylistsInfo, position:Int, view: View)
}