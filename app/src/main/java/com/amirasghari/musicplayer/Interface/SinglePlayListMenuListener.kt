package com.amirasghari.musicplayer.Interface

import android.view.View
import com.amirasghari.musicplayer.realm.SinglePlaylistInfo

interface SinglePlayListMenuListener {
    fun onMenuClickListener(data: SinglePlaylistInfo, position:Int, view: View)
}