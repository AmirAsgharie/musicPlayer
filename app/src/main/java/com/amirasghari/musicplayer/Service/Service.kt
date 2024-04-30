package com.amirasghari.musicplayer.Service

import android.app.*
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.MediaMetadataRetriever
import android.media.MediaPlayer
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.support.v4.media.session.MediaSessionCompat
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.amirasghari.musicplayer.Activity.ShowMusicActivity
import com.amirasghari.musicplayer.ApplicationClass
import com.amirasghari.musicplayer.Broadcast.MusicNotificationBroadcastReceiver
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R


class Service : Service() {

    var songList: ArrayList<AudioModel> = ArrayList<AudioModel>()
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

    val ACTION_PRE = "actionprevious"
    val ACTION_PLAY = "actionplay"
    val ACTION_NEXT = "actionpause"
    val ACTION_DESTROY_SERVICE = "destroy"

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
        LocalBroadcastManager.getInstance(this)
            .registerReceiver(broadcastNotificationReceiver, IntentFilter("TRACKS"));


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
            var largeIcon: Bitmap? = getAlbumImage(shared.getString("musicPath", "")!!)
            if (largeIcon == null) {
                largeIcon =
                    BitmapFactory.decodeResource(resources, R.drawable.ic_launcher_foreground)
            }
            val drw_previous: Int
            drw_previous = R.drawable.previous2
            val drw_play: Int
            if (musicPlayer!!.isPlaying) drw_play = R.drawable.pause1 else drw_play =
                R.drawable.playp
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
                .addAction(drw_previous, "Previous", getPendingIntentPrevious())
                .addAction(drw_play, "Play", getPendingIntentPlay())
                .addAction(drw_next, "Next", getPendingIntentNext())
                .setTicker(shared.getString("musicName", ""))
                .setDeleteIntent(getPendingIntentDelete())
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

    protected fun getPendingIntentPrevious(): PendingIntent? {
        val pendingIntentPrevious: PendingIntent
        val intentPrevious =
            Intent(applicationContext, MusicNotificationBroadcastReceiver::class.java).setAction(
                ACTION_PRE
            )
        pendingIntentPrevious = PendingIntent.getBroadcast(
            applicationContext,
            0,
            intentPrevious,
            PendingIntent.FLAG_MUTABLE
        )
        return pendingIntentPrevious
    }

    protected fun getPendingIntentPlay(): PendingIntent? {
        val pendingIntentPlay: PendingIntent
        val intentPlay =
            Intent(applicationContext, MusicNotificationBroadcastReceiver::class.java).setAction(
                ACTION_PLAY
            )
        pendingIntentPlay = PendingIntent.getBroadcast(
            applicationContext,
            0,
            intentPlay,
            PendingIntent.FLAG_MUTABLE
        )
        return pendingIntentPlay
    }

    protected fun getPendingIntentNext(): PendingIntent? {
        val pendingIntentNext: PendingIntent
        val intentNext =
            Intent(applicationContext, MusicNotificationBroadcastReceiver::class.java).setAction(
                ACTION_NEXT
            )
        pendingIntentNext = PendingIntent.getBroadcast(
            applicationContext,
            0,
            intentNext,
            PendingIntent.FLAG_MUTABLE
        )
        return pendingIntentNext
    }

    protected fun getPendingIntentDelete(): PendingIntent? {
        val pendingIntentDelete: PendingIntent
        val intentDelete =
            Intent(applicationContext, MusicNotificationBroadcastReceiver::class.java).setAction(
                ACTION_DESTROY_SERVICE
            )
        pendingIntentDelete = PendingIntent.getBroadcast(
            applicationContext,
            0,
            intentDelete,
            PendingIntent.FLAG_MUTABLE
        )
        return pendingIntentDelete
    }


    private val broadcastNotificationReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val action = intent.extras!!.getString("actionname")
            if (action == ACTION_PRE) {
                Toast.makeText(applicationContext, "egr", Toast.LENGTH_SHORT).show()
                Log.i("prev", "prev2")

                playPrev()
                //songPlaying = true
                startNotification()
            } else if (action == ACTION_PLAY) {
                playPlayer()
                startNotification()

            } else if (action == ACTION_NEXT) {
                playNext()
                //songPlaying = true
                startNotification()
            } else if (action == ACTION_DESTROY_SERVICE) {
                //stopSelf()
            }
        }
    }

    private fun getAlbumImage(path: String): Bitmap? {
        val mmr = MediaMetadataRetriever()
        mmr.setDataSource(path)
        val data = mmr.embeddedPicture
        return if (data != null) BitmapFactory.decodeByteArray(data, 0, data.size) else null
    }

    fun playPrev() {
        var pos = shared.getInt("position", 0)
        val shuffle = shared.getBoolean("shuffle", false)
        val editor = shared.edit()



        if (shuffle) {
            val shufflePos = shared.getInt("shufflePosition", 0)
            // Toast.makeText(this, "shufflePos $shufflePos", Toast.LENGTH_SHORT).show()

            if (shufflePos == 0) {
                editor.putInt("shufflePosition", shuffleList.size - 1)
                editor.putString(
                    "musicName", songList[shuffleList[shuffleList.size - 1]].Title
                )
                editor.putString(
                    "musicArtist",
                    songList[shuffleList[shuffleList.size - 1]].Artist
                )
                editor.putString(
                    "imagePath",
                    songList[shuffleList[shuffleList.size - 1]].image
                )
                editor.putString(
                    "musicPath",
                    songList[shuffleList[shuffleList.size - 1]].Path
                )
                editor.putInt(
                    "position",
                    shuffleList[shuffleList.size - 1]
                )
                editor.apply()
                play()
            } else {
                if (shufflePos == 1) {
                    editor.putInt("shufflePosition", shuffleList.size - 1)
                    editor.putString(
                        "musicName",
                        songList[shuffleList[shuffleList.size - 1]].Title
                    )
                    editor.putString(
                        "musicArtist",
                        songList[shuffleList[shuffleList.size - 1]].Artist
                    )
                    editor.putString(
                        "imagePath",
                        songList[shuffleList[shuffleList.size - 1]].image
                    )
                    editor.putString(
                        "musicPath",
                        songList[shuffleList[shuffleList.size - 1]].Path
                    )
                    editor.putInt(
                        "position",
                        shuffleList[shuffleList.size - 1]
                    )
                } else {
                    editor.putInt("shufflePosition", shufflePos - 2)
                    editor.putString(
                        "musicName",
                        songList[shuffleList[shufflePos - 2]].Title
                    )
                    editor.putString(
                        "musicArtist",
                        songList[shuffleList[shufflePos - 2]].Artist
                    )
                    editor.putString(
                        "imagePath",
                        songList[shuffleList[shufflePos - 2]].image
                    )
                    editor.putString(
                        "musicPath",
                        songList[shuffleList[shufflePos - 2]].Path
                    )
                    editor.putInt("position", shuffleList[shufflePos - 2])
                }

                editor.apply()

                play()
            }
            /*val intent = Intent(requireActivity(), Service::class.java)
            intent.putExtra("shuffleList" , shuffleList.toIntArray())
            ContextCompat.startForegroundService(requireActivity(), intent)*/
        } else {
            if (pos == 0) {
                val end = songList.size - 1
                editor.putInt("position", end - 1)
                editor.putString("musicName", songList[end].Title)
                editor.putString("musicArtist", songList[end].Artist)
                editor.putString("imagePath", songList[end].image)
                editor.putString("musicPath", songList[end].Path)
                editor.apply()

                play()
                /*val intent = Intent(requireActivity(), Service::class.java)
                pos = viewModel.size() - 1
                ContextCompat.startForegroundService(requireActivity(), intent)*/

            } else {
                editor.putInt("position", pos - 2)
                editor.putString("musicName", songList[pos - 1].Title)
                editor.putString("musicArtist", songList[pos - 1].Artist)
                editor.putString("imagePath", songList[pos - 1].image)
                editor.putString("musicPath", songList[pos - 1].Path)
                editor.apply()

                play()
                //val intent = Intent(requireActivity(), Service::class.java)
                //pos = pos!! - 1
                //startForegroundService(requireActivity() , intent)

            }
        }


    }

    fun playPlayer() {
        if (musicPlayer!!.isPlaying) {
            musicPlayer!!.stop()
        } else {
            musicPlayer!!.start()
        }
    }

    fun playNext() {
        //changeMusicFocus()

        var pos = shared.getInt("position", 0)
        val shuffle = shared.getBoolean("shuffle", false)
        val editor = shared.edit()






        if (shuffle) {
            //musicService!!.playShuffle()
            //Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            val shufflePos = shared.getInt("shufflePosition", 0)
            //Toast.makeText(this, shufflePos.toString(), Toast.LENGTH_SHORT).show()
            if (shufflePos == shuffleList.size) {
                editor.putInt("shufflePosition", 0)
                editor.putString(
                    "musicName",
                    songList[shuffleList[0]].Title
                )
                editor.putString(
                    "musicArtist",
                    songList[shuffleList[0]].Artist
                )
                editor.putString(
                    "imagePath",
                    songList[shuffleList[0]].image
                )
                editor.putString(
                    "musicPath",
                    songList[shuffleList[0]].Path
                )
                editor.putInt("position", shuffleList[0])
                editor.apply()
                //setUp()
                play()
            } else {
                editor.putString(
                    "musicName",
                    songList[shuffleList[shufflePos]].Title
                )
                editor.putString(
                    "musicArtist",
                    songList[shuffleList[shufflePos]].Artist
                )
                editor.putString(
                    "imagePath",
                    songList[shuffleList[shufflePos]].image
                )
                editor.putString(
                    "musicPath",
                    songList[shuffleList[shufflePos]].Path
                )
                editor.putInt("position", shuffleList[shufflePos])
                editor.apply()
                //setUp()
                play()
            }

        } else {
            //Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
            if (pos == songList.size - 1) {
                editor.putInt("position", -1)
                editor.putString("musicName", songList[0].Title)
                editor.putString("musicArtist", songList[0].Artist)
                editor.putString("imagePath", songList[0].image)
                editor.putString("musicPath", songList[0].Path)
                editor.apply()
                //setUp()
                play()

            } else if (pos != null) {
                /*editor.putInt("position" , pos+1)
                editor.apply()*/
                //val intent = Intent(requireActivity(), Service::class.java)
                //pos = pos!! + 1
                Log.i("list", songList.toString())
                editor.putString("musicName", songList[pos + 1].Title)
                editor.putString("musicArtist", songList[pos + 1].Artist)
                editor.putString("imagePath", songList[pos + 1].image)
                editor.putString("musicPath", songList[pos + 1].Path)
                editor.apply()
                /*binding.musicTitle.text = musicService!!.songList[pos+1].Title
                //binding.musicTitle.setSingleLine()
                binding.musicArtist.text = musicService!!.songList[pos+1].Artist
                Glide.with(this).load(musicService!!.songList[pos+1].image).into(binding.musicImg)*/
                //setUp()
                play()
                //ContextCompat.startForegroundService(requireActivity(), intent)
            }


        }
    }
}