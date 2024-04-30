package com.amirasghari.musicplayer.Broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.localbroadcastmanager.content.LocalBroadcastManager


class MusicNotificationBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val sendIntent = Intent("TRACKS")
        Log.i("notif", "notifff")
        sendIntent.putExtra("actionname", intent!!.getAction())
        LocalBroadcastManager.getInstance(context!!).sendBroadcast(sendIntent)
    }
}