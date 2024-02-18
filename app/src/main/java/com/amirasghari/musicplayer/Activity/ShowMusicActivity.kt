package com.amirasghari.musicplayer.Activity

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.Service.Service
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.ActivityShowMusicBinding
import com.amirasghari.musicplayer.realm.RealmDAO
import com.amirasghari.musicplayer.realm.FavoriteInfo
import com.bumptech.glide.Glide
import com.masoudss.lib.SeekBarOnProgressChanged
import com.masoudss.lib.WaveformSeekBar
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Suppress("UNREACHABLE_CODE")
class ShowMusicActivity : AppCompatActivity(), ServiceConnection {

    lateinit var binding: ActivityShowMusicBinding
    lateinit var shared: SharedPreferences
    lateinit var mediaPlayer: MediaPlayer
    lateinit var viewModel: ViewModel
    var musicService: Service? = null
    lateinit var mainHandler: Handler
    var time: Int = 0
    var favorite = false


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = getSharedPreferences("music", 0)
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        mainHandler = Handler(Looper.getMainLooper())

        registerForContextMenu(binding.addBtn)
        setUpBtn()
        setUp()

        binding.favoriteBtn.setOnClickListener {
            if (favorite) {
                favorite = false
                binding.favoriteBtn.setImageResource(R.drawable.favorite_svgrepo_com__1_)
                RealmDAO().favoriteDelete(shared.getString("musicPath", "").toString())
            } else {
                favorite = true
                binding.favoriteBtn.setImageResource(R.drawable.favorite_svgrepo_com__2_)
                val favoriteInfo = FavoriteInfo()
                favoriteInfo.musicPath = shared.getString("musicPath", "").toString()
                favoriteInfo.musicName = shared.getString("musicName", "").toString()
                favoriteInfo.artistName = shared.getString("musicArtist", "").toString()
                favoriteInfo.imagePath = shared.getString("imagePath", "").toString()
                favoriteInfo.duration = shared.getInt("musicTime", 0).toString()
                RealmDAO().favoriteUpdate(favoriteInfo)
            }

        }

        binding.addBtn.setOnClickListener {
            val intent =Intent(this , PlaylistActivity::class.java)
            intent.putExtra("title", shared.getString("musicName", "").toString())
            intent.putExtra("artist", shared.getString("musicArtist", "").toString())
            intent.putExtra("image", shared.getString("imagePath", "").toString())
            intent.putExtra("path", shared.getString("musicPath", "").toString())
            intent.putExtra("duration",  shared.getInt("musicTime", 0).toString())
            startActivity(intent)
        }

        binding.nextBtn.setOnClickListener {
            onClickNextBtn()
        }

        binding.backBtn.setOnClickListener {
            onClickBackBtn()
        }

        binding.shuffleBtn.setOnClickListener {
            val editor = shared.edit()
            val shuffle1 = shared.getBoolean("shuffle", false)
            if (shuffle1) {
                editor.putBoolean("shuffle", false)
                binding.shuffleBtn.alpha = 0.5f
            } else {
                editor.putBoolean("shuffle", true)
                binding.shuffleBtn.alpha = 1f

            }

            editor.apply()

        }

        binding.repeatBtn.setOnClickListener {
            val editor = shared.edit()
            val shuffle1 = shared.getBoolean("repeat", false)
            if (shuffle1) {
                editor.putBoolean("repeat", false)
                binding.repeatBtn.alpha = 0.5f
            } else {
                editor.putBoolean("repeat", true)
                binding.repeatBtn.alpha = 1f
            }
            editor.apply()
        }

        binding.controlMusicImg.setOnClickListener {
            it as ImageButton
            if (musicService!!.musicPlayer!!.isPlaying) {
                it.setImageResource(R.drawable.play2)
                musicService!!.musicPlayer!!.pause()
            } else {
                it.setImageResource(R.drawable.pause2)
                musicService!!.musicPlayer!!.start()
                time()
            }
        }

        binding.backCard.setOnClickListener {
            finish()
        }

        binding.audioWave.onProgressChanged = object : SeekBarOnProgressChanged {
            override fun onProgressChanged(
                waveformSeekBar: WaveformSeekBar,
                progress: Float,
                fromUser: Boolean
            ) {
                if (fromUser) {
                    val result = (time * progress) / 100
                    val editor = shared.edit()
                    editor.putInt("progress", result.toInt())
                    editor.apply()
                    musicService!!.musicPlayer!!.seekTo(result.toInt())
                }

            }

        }

        startService()

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menu!!.setHeaderTitle("Choose a color")
        // add menu items
        menu.add(0, v!!.id, 0, "Yellow")
        menu.add(0, v.id, 0, "Gray")
        menu.add(0, v.id, 0, "Cyan")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
        return true
    }

    private fun setUp() {


        val musicName = shared.getString("musicName", "")
        val musicArtist = shared.getString("musicArtist", "")
        val image = shared.getString("imagePath", "")
        val path = shared.getString("musicPath", "")



        binding.musicTitle.text = musicName
        binding.musicArtist.text = musicArtist


        val data = RealmDAO().favoriteReadAll()
        favorite = false
        binding.favoriteBtn.setImageResource(R.drawable.favorite_svgrepo_com__1_)
        data.forEach {
            if (it.musicPath.equals(path)) {
                favorite = true
                binding.favoriteBtn.setImageResource(R.drawable.favorite_svgrepo_com__2_)
            }
        }
        val animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        binding.musicImg.startAnimation(animation)


        try {
            Glide.with(this).load(image).into(binding.musicImg)
        } catch (E: Exception) {
            E.printStackTrace()
        }
        try {
            runBlocking {
                coroutineScope {
                    launch {
                        binding.audioWave.setSampleFrom(path!!)
                    }
                }
            }


        } catch (e: Exception) {
            e.printStackTrace()
        }



    }

    private fun setUpBtn() {

        val shuffle = shared.getBoolean("shuffle", false)
        if (shuffle) {
            binding.shuffleBtn.alpha = 1f
        } else {
            binding.shuffleBtn.alpha = 0.5f
        }

        val repeat = shared.getBoolean("repeat", false)
        if (repeat) {
            binding.repeatBtn.alpha = 1f
        } else {
            binding.repeatBtn.alpha = 0.5f
        }


    }

    private fun startService() {
        val intent = Intent(this, Service::class.java)
        bindService(intent, this, BIND_AUTO_CREATE)
        startService(intent)
        //Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        //Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
        val binder = service as Service.MyBinder
        musicService = binder.currentService()
        Log.i("songList", musicService!!.mainSongList.toString())
        if (shared.getBoolean("favorite", false)) {
            val favoriteMusic = ArrayList<AudioModel>()
            val data = RealmDAO().favoriteReadAll()
            data.forEach {
                favoriteMusic.add(
                    AudioModel(
                        it.musicPath,
                        it.musicName,
                        it.duration,
                        it.imagePath,
                        it.artistName
                    )
                )
            }
            musicService!!.songList = favoriteMusic

        } else {
            //musicService!!.songList = musicService!!.mainSongList
        }

        if (musicService!!.musicPlayer == null) {
            musicService!!.musicPlayer = MediaPlayer()
            binding.controlMusicImg.setImageResource(R.drawable.play2)
        }
        /*if (shared.getBoolean("shuffle" , false) && shared.getBoolean("favorite", false)){
            musicService!!.playShuffle()
        }*/
        time()

        try {
            if (musicService!!.shuffleList.isNotEmpty()) {
                //Toast.makeText(this,"1", Toast.LENGTH_SHORT).show()
            } else {
                //Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            }
        } catch (E: Exception) {
            musicService!!.playShuffle()
            //Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
        }


        musicService!!.musicPlayer!!.setOnCompletionListener {
            val pos = shared.getInt("position", 0)
            val editor = shared.edit()

            if (shared.getBoolean("repeat", false)) {
                musicService!!.repeat()
            } else {
                if (shared.getBoolean("shuffle", false)) {
                    val shufflePos = shared.getInt("shufflePosition", 0)
                    val musicName =
                        musicService!!.songList[musicService!!.shuffleList[shufflePos]].Title
                    val musicArtist =
                        musicService!!.songList[musicService!!.shuffleList[shufflePos]].Artist
                    val imagePath =
                        musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                    editor.putString("musicName", musicName)
                    editor.putString("musicArtist", musicArtist)
                    editor.putString("imagePath", imagePath)

                } else {
                    val musicName = musicService!!.songList[pos + 1].Title
                    val musicArtist = musicService!!.songList[pos + 1].Artist
                    val imagePath = musicService!!.songList[pos + 1].image
                    editor.putString("musicName", musicName)
                    editor.putString("musicArtist", musicArtist)
                    editor.putString("imagePath", imagePath)
                }
                editor.apply()
                musicService!!.play()
                setUp()
                time()
            }


            //Glide.with(this).load(imagePath).into(binding.currentMusicImg)


            //editor.putInt("position" , pos+1)


        }

    }

    override fun onServiceDisconnected(name: ComponentName?) {
        Toast.makeText(this, "disconnect", Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun onClickNextBtn() {

        var pos = shared.getInt("position", 0)
        val shuffle = shared.getBoolean("shuffle", false)
        val editor = shared.edit()

        if (shuffle) {
            //Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            val shufflePos = shared.getInt("shufflePosition", 0)
            //Toast.makeText(this, shufflePos.toString(), Toast.LENGTH_SHORT).show()
            if (shufflePos == musicService!!.shuffleList.size) {
                editor.putInt("shufflePosition", 0)
                editor.putString(
                    "musicName",
                    musicService!!.songList[musicService!!.shuffleList[0]].Title
                )
                editor.putString(
                    "musicArtist",
                    musicService!!.songList[musicService!!.shuffleList[0]].Artist
                )
                editor.putString(
                    "imagePath",
                    musicService!!.songList[musicService!!.shuffleList[0]].image
                )
                editor.putString(
                    "musicPath",
                    musicService!!.songList[musicService!!.shuffleList[0]].Path
                )
                editor.putInt("position", musicService!!.shuffleList[0])
                editor.apply()
                setUp()
                musicService!!.play()
            } else {
                editor.putString(
                    "musicName",
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Title
                )
                editor.putString(
                    "musicArtist",
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Artist
                )
                editor.putString(
                    "imagePath",
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].image
                )
                editor.putString(
                    "musicPath",
                    musicService!!.songList[musicService!!.shuffleList[shufflePos]].Path
                )
                editor.putInt("position", musicService!!.shuffleList[shufflePos])
                editor.apply()
                setUp()
                musicService!!.play()
            }

        } else {
            //Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
            if (pos == musicService!!.songList.size - 1) {
                editor.putInt("position", -1)
                editor.putString("musicName", musicService!!.songList[0].Title)
                editor.putString("musicArtist", musicService!!.songList[0].Artist)
                editor.putString("imagePath", musicService!!.songList[0].image)
                editor.putString("musicPath", musicService!!.songList[0].Path)
                editor.apply()
                setUp()
                musicService!!.play()

            } else if (pos != null) {
                /*editor.putInt("position" , pos+1)
                editor.apply()*/
                //val intent = Intent(requireActivity(), Service::class.java)
                //pos = pos!! + 1
                editor.putString("musicName", musicService!!.songList[pos + 1].Title)
                editor.putString("musicArtist", musicService!!.songList[pos + 1].Artist)
                editor.putString("imagePath", musicService!!.songList[pos + 1].image)
                editor.putString("musicPath", musicService!!.songList[pos + 1].Path)
                editor.apply()
                /*binding.musicTitle.text = musicService!!.songList[pos+1].Title
                //binding.musicTitle.setSingleLine()
                binding.musicArtist.text = musicService!!.songList[pos+1].Artist
                Glide.with(this).load(musicService!!.songList[pos+1].image).into(binding.musicImg)*/
                setUp()
                musicService!!.play()
                //ContextCompat.startForegroundService(requireActivity(), intent)

            }
        }

        binding.controlMusicImg.setImageResource(R.drawable.pause2)
        time()


    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun onClickBackBtn() {
        var pos = shared.getInt("position", 0)
        val shuffle = shared.getBoolean("shuffle", false)
        val editor = shared.edit()



        if (shuffle) {
            val shufflePos = shared.getInt("shufflePosition", 0)
            // Toast.makeText(this, "shufflePos $shufflePos", Toast.LENGTH_SHORT).show()

            if (shufflePos == 0) {
                editor.putInt("shufflePosition", musicService!!.shuffleList.size - 1)
                editor.putString(
                    "musicName",
                    musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Title
                )
                editor.putString(
                    "musicArtist",
                    musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Artist
                )
                editor.putString(
                    "imagePath",
                    musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].image
                )
                editor.putString(
                    "musicPath",
                    musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Path
                )
                editor.putInt(
                    "position",
                    musicService!!.shuffleList[musicService!!.shuffleList.size - 1]
                )
                editor.apply()
                setUp()
                musicService!!.play()
            } else {
                if (shufflePos == 1) {
                    editor.putInt("shufflePosition", musicService!!.shuffleList.size - 1)
                    editor.putString(
                        "musicName",
                        musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Title
                    )
                    editor.putString(
                        "musicArtist",
                        musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Artist
                    )
                    editor.putString(
                        "imagePath",
                        musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].image
                    )
                    editor.putString(
                        "musicPath",
                        musicService!!.songList[musicService!!.shuffleList[musicService!!.shuffleList.size - 1]].Path
                    )
                    editor.putInt(
                        "position",
                        musicService!!.shuffleList[musicService!!.shuffleList.size - 1]
                    )
                } else {
                    editor.putInt("shufflePosition", shufflePos - 2)
                    editor.putString(
                        "musicName",
                        musicService!!.songList[musicService!!.shuffleList[shufflePos - 2]].Title
                    )
                    editor.putString(
                        "musicArtist",
                        musicService!!.songList[musicService!!.shuffleList[shufflePos - 2]].Artist
                    )
                    editor.putString(
                        "imagePath",
                        musicService!!.songList[musicService!!.shuffleList[shufflePos - 2]].image
                    )
                    editor.putString(
                        "musicPath",
                        musicService!!.songList[musicService!!.shuffleList[shufflePos - 2]].Path
                    )
                    editor.putInt("position", musicService!!.shuffleList[shufflePos - 2])
                }

                editor.apply()
                setUp()
                musicService!!.play()
            }
            /*val intent = Intent(requireActivity(), Service::class.java)
            intent.putExtra("shuffleList" , shuffleList.toIntArray())
            ContextCompat.startForegroundService(requireActivity(), intent)*/
        } else {
            if (pos == 0) {
                val end = musicService!!.songList.size - 1
                editor.putInt("position", end - 1)
                editor.putString("musicName", musicService!!.songList[end].Title)
                editor.putString("musicArtist", musicService!!.songList[end].Artist)
                editor.putString("imagePath", musicService!!.songList[end].image)
                editor.putString("musicPath", musicService!!.songList[end].Path)
                editor.apply()
                setUp()
                musicService!!.play()
                /*val intent = Intent(requireActivity(), Service::class.java)
                pos = viewModel.size() - 1
                ContextCompat.startForegroundService(requireActivity(), intent)*/

            } else {
                editor.putInt("position", pos - 2)
                editor.putString("musicName", musicService!!.songList[pos - 1].Title)
                editor.putString("musicArtist", musicService!!.songList[pos - 1].Artist)
                editor.putString("imagePath", musicService!!.songList[pos - 1].image)
                editor.putString("musicPath", musicService!!.songList[pos - 1].Path)
                editor.apply()
                setUp()
                musicService!!.play()
                //val intent = Intent(requireActivity(), Service::class.java)
                //pos = pos!! - 1
                //startForegroundService(requireActivity() , intent)

            }
        }

        binding.controlMusicImg.setImageResource(R.drawable.pause2)
        time()

    }

    private fun time() {
        if (musicService!!.musicPlayer!!.isPlaying) {
            time = musicService!!.musicPlayer!!.duration
            val editor = shared.edit()
            editor.putInt("musicTime", time)
            editor.apply()
            val min = ((time / (1000 * 60)) % 60)
            val sec = (time / 1000) % 60
            val show = String.format("%02d:%02d", min, sec)
            binding.musicDuration.text = show

            mainHandler.post(object : Runnable {
                override fun run() {
                    val current = musicService!!.musicPlayer!!.currentPosition * 100
                    var position = (current.toDouble() / time.toDouble())
                    binding.audioWave.progress = position.toFloat()

                    val min = ((current / (100000 * 60)) % 60)
                    val sec = (current / 100000) % 60
                    val show = String.format("%02d:%02d", min, sec)
                    Log.i("timee" , show.toString())
                    binding.currentDuration.text = show
                    mainHandler.postDelayed(this, 1000)
                }
            })

        } else {
            time = shared.getInt("musicTime", 0)
            val min = ((time / (1000 * 60)) % 60)
            val sec = (time / 1000) % 60
            val show = String.format("%02d:%02d", min, sec)
            binding.musicDuration.text = show
        }

    }


}
