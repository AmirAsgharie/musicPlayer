package com.amirasghari.musicplayer.Fragment

import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Adapter.MusicAdapter
import com.amirasghari.musicplayer.Adapter.RecentlyAdapter
import com.amirasghari.musicplayer.Interface.MusicListener
import com.amirasghari.musicplayer.Interface.MusicMenuListener
import com.amirasghari.musicplayer.Model.AudioModel
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.ViewModel.ViewModel
import com.amirasghari.musicplayer.databinding.FragmentRecentlyBinding


class RecentlyFragment : Fragment() , MusicListener, MusicMenuListener {
    lateinit var binding :FragmentRecentlyBinding
    lateinit var viewModel: ViewModel
    var recentSongs = ArrayList<AudioModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_recently , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        getMusicsDetails()
    }

    override fun onResume() {
        super.onResume()
        recycler()

    }

    private fun recycler(){
        recentSongs.reverse()
        val adapter = RecentlyAdapter(requireActivity() ,  recentSongs, this)
        binding.recentRec.adapter = adapter
        binding.recentRec.layoutManager = LinearLayoutManager(requireContext() , LinearLayoutManager.VERTICAL , false)
    }

    override fun onclickListener(data: AudioModel, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onMenuClickListener(data: AudioModel, position: Int, view: View) {
        TODO("Not yet implemented")
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
        val cursor: Cursor? = requireActivity().contentResolver.query(
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


            recentSongs.add(songsData)
            //Toast.makeText(this, "tttt", Toast.LENGTH_SHORT).show()


        }

    }


}