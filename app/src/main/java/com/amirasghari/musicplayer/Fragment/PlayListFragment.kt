package com.amirasghari.musicplayer.Fragment

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AlertDialogLayout
import androidx.appcompat.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.amirasghari.musicplayer.Activity.PlaylistActivity
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


    }

    override fun onResume() {
        super.onResume()
        recyclerView()
    }

    private fun recyclerView(){
        val realm = RealmDAO()
        val playlistsInfo =realm.playlistReadAll()
        val data = ArrayList<PlaylistsInfo>()
        playlistsInfo.forEach {
            data.add(it)
        }

        if (data.isEmpty()){
            binding.emptyTxt.text = "You Have No PlayList"
            binding.emptyTxt.visibility = View.VISIBLE
        }else{
            binding.emptyTxt.visibility = View.GONE
            val adapter = PlaylistAdapter(requireActivity() , data , this , this)
            binding.rec.layoutManager = LinearLayoutManager(requireContext() , LinearLayoutManager.VERTICAL , false)
            binding.rec.adapter=adapter

        }

    }

    override fun onclickListener(data: PlaylistsInfo, position: Int) {
        val intent = Intent(requireActivity() , SinglePlaylistActivity::class.java)
        intent.putExtra("playListName" , data.playListName)
        startActivity(intent)
    }

    override fun onMenuClickListener(data: PlaylistsInfo, position: Int, view: View) {
        val popupMenu = PopupMenu(requireContext(), view)
        // add the menu
        popupMenu.inflate(R.menu.playlist_menu)
        popupMenu.show()

        popupMenu.setOnMenuItemClickListener { item ->
            val realm = RealmDAO()
            when (item.title) {
                "delete" -> {
                    realm.playlistDelete(data.playListName)
                    recyclerView()
                    val singlePlayList = realm.singlePlaylistReadAll()
                    singlePlayList.forEach {
                        if (it.playListName == data.playListName){
                            realm.singlePlaylistDelete(it.musicName_PlayList)
                        }
                    }
                    true
                }

                /*"rename playlist" -> {

                    val alertDialog = AlertDialog.Builder(requireContext())
                    alertDialog.setTitle("Name")
                    val customLayout: View = layoutInflater.inflate(R.layout.playllist_dialog, null)
                    alertDialog.setView(customLayout)

                    alertDialog.setPositiveButton(
                        "Rename",
                        DialogInterface.OnClickListener { dialogInterface, i ->
                            val playListName = customLayout.findViewById<EditText>(R.id.dialogEdt).text

                            if (playListName.isNullOrBlank()){
                                Toast.makeText(
                                    requireContext(),
                                    "please choose a name",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }else{
                                val playList = realm.playlistReadByName(data.playListName)
                                val playlistsInfo = PlaylistsInfo()
                                playlistsInfo.playListName = playList!!.playListName.toString()
                                playlistsInfo.playLisShowName = playListName.toString()
                                playlistsInfo.playListMainImagePath = playList.playListMainImagePath
                                playlistsInfo.musicNumber = playList.musicNumber
                                realm.playlistUpdate(playlistsInfo)
                                recyclerView()
                            }
                        })
                    val dialog = alertDialog.create()
                    dialog.show()


                    true
                }*/

                else -> {
                    false
                }
            }


        }    }

}