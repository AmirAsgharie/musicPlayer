package com.amirasghari.musicplayer.Service

import android.app.*
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.MediaPlayer
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.support.v4.media.session.MediaSessionCompat
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.amirasghari.musicplayer.Activity.ShowMusicActivity
import com.amirasghari.musicplayer.ApplicationClass
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R


class Service : Service() {

    var songList :ArrayList<AudioModel> = ArrayList<AudioModel>()
    var mainSongList = ArrayList<AudioModel>()
    var position: Int = 0
    var shufflePosition: Int = 0
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"
    lateinit var shared: SharedPreferences
    lateinit var shuffleList: List<Int>
    private var myBinder = MyBinder()
    var musicPlayer: MediaPlayer? = null
    private lateinit var mediaSession: MediaSessionCompat

    override fun onBind(data: Intent?): IBinder? {
        mediaSession = MediaSessionCompat(baseContext, "My Music")

        return myBinder
    }

    inner class MyBinder : Binder() {
        fun currentService(): com.amirasghari.musicplayer.Service.Service {
            return this@Service
        }
    }

    override fun onCreate() {
        super.onCreate()
        //musicPlayer = MediaPlayer()
        shared = getSharedPreferences("music", 0)

        getMusicsDetails()


    }

    @RequiresApi(33)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        /*position = shared.getInt("position" , 0)
        shufflePosition = shared.getInt("shufflePosition" , 0)

        if (shared.getBoolean("shuffle" , false)){
            shuffleList = intent!!.getIntArrayExtra("shuffleList")!!
            play(songList[shuffleList[shufflePosition]].Path)
            Toast.makeText(this, "svcsvsfv", Toast.LENGTH_SHORT).show()

        }else{
            play(songList[position].Path)
        }

        notification()*/
        //notification()


        return START_STICKY;

    }

    fun play() {

        position = shared.getInt("position", 0)

        if (shared.getBoolean("shuffle", false)) {
            var shufflePos = shared.getInt("shufflePosition", 0)
            musicPlayer!!.reset()
            musicPlayer!!.setDataSource(songList[shuffleList[shufflePos]].Path)
            musicPlayer!!.prepare()
            musicPlayer!!.start()
            //showNotification()
            startNotification()
            val editor = shared.edit()
            editor.putString("musicPath", songList[shuffleList[shufflePos]].Path)
            editor.putInt("position", shuffleList[shufflePos])
            editor.putInt("shufflePosition", shufflePos + 1)
            editor.apply()
        } else {
            position += 1
            val editor = shared.edit()
            editor.putInt("position", position)
            editor.putString("musicPath", songList[position].Path)
            editor.apply()
            musicPlayer!!.reset()
            musicPlayer!!.setDataSource(songList[position].Path)
            musicPlayer!!.prepare()
            musicPlayer!!.start()
            //showNotification()
            startNotification()
        }

        //notification()


    }

    fun repeat() {
        val path = shared.getString("musicPath", "")
        musicPlayer!!.reset()
        musicPlayer!!.setDataSource(path)
        musicPlayer!!.prepare()
        musicPlayer!!.start()
    }

    private fun notification() {
        notificationManager =
            this?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val intent2 = Intent(this, ShowMusicActivity::class.java)
        intent2.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val pendingIntent =
            PendingIntent.getActivity(this, 0, intent2, PendingIntent.FLAG_IMMUTABLE)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            notificationChannel =
                NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.GREEN
            notificationChannel.enableVibration(false)
            notificationManager.createNotificationChannel(notificationChannel)


            if (shared.getBoolean("shuffle", false)) {
                builder = Notification.Builder(this, channelId)
                    //.setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentIntent(pendingIntent)
                    .setContentTitle(songList[shuffleList[shufflePosition]].Title)
                    .setContentText(songList[shuffleList[shufflePosition]].Duration)
            } else {
                builder = Notification.Builder(this, channelId)
                    //.setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentIntent(pendingIntent)
                    .setContentTitle(songList[position].Title)
                    .setContentText(songList[position].Duration)
            }


        } else {

            if (shared.getBoolean("shuffle", false)) {
                builder = Notification.Builder(this)
                    //.setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentIntent(pendingIntent)
                    .setContentTitle(songList[shuffleList[shufflePosition]].Title)
                    .setContentText(songList[shuffleList[shufflePosition]].Duration)

            } else {
                builder = Notification.Builder(this)
                    //.setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentIntent(pendingIntent)
                    .setContentTitle(songList[position].Title)
                    .setContentText(songList[position].Duration)

            }


        }

        startForeground(10, builder.build())
    }

    fun getMusicsDetails() {
        val projection = arrayOf(
            MediaStore.Audio.Media.TITLE,
            MediaStore.Audio.Media.DATA,
            MediaStore.Audio.Media.DURATION,
            MediaStore.Audio.Media.ALBUM_ID,
            MediaStore.Audio.Media.ARTIST
        )

        val selection = MediaStore.Audio.Media.IS_MUSIC + " != 0"
        val cursor: Cursor? = contentResolver.query(
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            null,
            null
        )



        while (cursor!!.moveToNext()) {
            //Toast.makeText(this, "ttttttt", Toast.LENGTH_SHORT).show()
            val id = cursor!!.getLong(3).toString()
            val uri = Uri.parse("content://media/external/audio/albumart")
            val artUri = Uri.withAppendedPath(uri, id).toString()
            val songsData =
                AudioModel(
                    cursor.getString(1), cursor.getString(0).trim(),
                    cursor.getString(2),
                    artUri,
                    cursor.getString(4)
                )



            mainSongList.add(songsData)
            //Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show()


        }
        mainSongList.sortWith(compareBy { it.Title })
    }


    fun showNotification() {

        val notification = NotificationCompat.Builder(baseContext, ApplicationClass.CHANNEL_ID)
            .setContentTitle(shared.getString("musicName", ""))
            .setContentText(shared.getString("musicArtist", ""))
            .setSmallIcon(R.drawable.play)
            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.shuffle))
            .setStyle(
                androidx.media.app.NotificationCompat.MediaStyle()
                    .setMediaSession(mediaSession.sessionToken)
            )
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .addAction(R.drawable.shuffle, "Previous", null)
            .addAction(R.drawable.shuffle, "Next", null)
            .addAction(R.drawable.shuffle, "Exit", null)
            .build()

        startForeground(13, notification)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun playShuffle() {
        val shuffle = shared.getBoolean("shuffle", false)
        val size = songList.size - 1

        shuffleList = (0..size).shuffled()
        //Log.i("shuffle", shuffleList.toString())
        val editor = shared.edit()
        /*if (shuffle){

            editor.putInt("position", shuffleList[0])
        }*/
        editor.putInt("shufflePosition", 0)
        editor.apply()


    }

    fun startNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val NOTIFICATION_CHANNEL_ID = "123"
            val channelName = "My Notification Service"
            var largeIcon: Bitmap? = BitmapFactory.decodeResource(resources, R.drawable.shuffle)
            if (largeIcon == null) {
                largeIcon = BitmapFactory.decodeResource(resources, R.drawable.playp)
            }
            val drw_previous: Int
            drw_previous = R.drawable.next
            val drw_play: Int
            if (musicPlayer!!.isPlaying) drw_play = R.drawable.pause1 else drw_play = R.drawable.playp
            val drw_next: Int
            drw_next = R.drawable.next
            val mediaSession = MediaSessionCompat(applicationContext, "MusicService")
            val token = mediaSession.sessionToken
            val chan = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                channelName,
                NotificationManager.IMPORTANCE_HIGH
            )
            chan.lightColor = Color.BLUE
            chan.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
            notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            assert(notificationManager != null)
            notificationManager.createNotificationChannel(chan)
            val notificationBuilder = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            val notification: Notification = notificationBuilder.setOngoing(false)
                .setSmallIcon(R.drawable.play)
                .setContentTitle(shared.getString("musicName", ""))
                .setLargeIcon(largeIcon)
                .addAction(drw_previous, "Previous", null)
                .addAction(drw_play, "Play", null)
                .addAction(drw_next, "Next", null)
                .setTicker(shared.getString("musicName", ""))
                .setStyle(
                    androidx.media.app.NotificationCompat.MediaStyle()
                        .setShowActionsInCompactView(0, 1, 2)
                        .setMediaSession(token)
                )
                .setContentText("Artist: ${shared.getString("musicArtist", "")}")
                .setPriority(NotificationManager.IMPORTANCE_HIGH)
                .setCategory(Notification.CATEGORY_SERVICE)
                .build()
            startForeground(2, notification)
            if (musicPlayer!!.isPlaying === false) {
                stopForeground(false)
            }
        } else {
            startForeground(1, Notification())
        }
    }


}