package com.amirasghari.musicplayer.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Activity.SinglePlaylistActivity
import com.amirasghari.musicplayer.Adapter.PlaylistAdapter
import com.amirasghari.musicplayer.Interface.PlaylistListener
import com.amirasghari.musicplayer.Interface.PlaylistMenuListener
import com.amirasghari.musicplayer.R
import com.amirasghari.musicplayer.databinding.FragmentPlayListBinding
import com.amirasghari.musicplayer.realm.PlaylistsInfo
import com.amirasghari.musicplayer.realm.RealmDAO


class PlayListFragment : Fragment() , PlaylistListener , PlaylistMenuListener{

    lateinit var binding: FragmentPlayListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_play_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
    }

    private fun recyclerView(){
        val realm = RealmDAO()
        val playlistsInfo =realm.playlistReadAll()
        val data = ArrayList<PlaylistsInfo>()
        playlistsInfo.forEach {
            data.add(it)
        }

        val adapter = PlaylistAdapter(requireActivity() , data , this , this)
        binding.rec.layoutManager = LinearLayoutManager(requireContext() , LinearLayoutManager.VERTICAL , false)
        binding.rec.adapter=adapter
    }

    override fun onclickListener(data: PlaylistsInfo, position: Int) {
        val intent = Intent(requireActivity() , SinglePlaylistActivity::class.java)
        intent.putExtra("playListName" , data.playListName)
        startActivity(intent)
    }

    override fun onMenuClickListener(data: PlaylistsInfo, position: Int, view: View) {
        Toast.makeText(requireContext(), "2", Toast.LENGTH_SHORT).show()
    }

}