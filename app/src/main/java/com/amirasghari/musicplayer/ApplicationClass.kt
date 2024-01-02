package com.amirasghari.musicplayer

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.bumptech.glide.Glide.init
import androidx.annotation.RequiresPermission
import io.realm.Realm
import io.realm.RealmConfiguration

class ApplicationClass:Application() {

    companion object{
        const val CHANNEL_ID = "channel1"
        const val PLAY = "play"
        const val NEXT = "next"
        const val PREVIOUS = "previous"
        const val EXIT = "exit"
    }

    override fun onCreate() {
        super.onCreate()


        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val notificationChannel = NotificationChannel(CHANNEL_ID , "Now play Song" , NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.description = "this is a important channel for showing song"
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
        }

        createRealm()
    }


    private fun createRealm(){

        Realm.init(this)

        val config= RealmConfiguration.Builder()
            .name("InfoDB")
            .schemaVersion(1)
            .allowWritesOnUiThread(true)
            .allowQueriesOnUiThread(true)
            .deleteRealmIfMigrationNeeded()
            .build()

        Realm.setDefaultConfiguration(config)
    }
}