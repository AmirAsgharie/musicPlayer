package com.amirasghari.musicplayer.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.amirasghari.musicplayer.Fragment.FavoriteFragment
import com.amirasghari.musicplayer.Fragment.MainFragment
import com.amirasghari.musicplayer.Fragment.PlayListFragment
import com.amirasghari.musicplayer.Fragment.RecentlyFragment
import com.amirasghari.musicplayer.Fragment.ShowMusicFragment

class ViewPagerAdapter(
    val context: Context,
    val fragment:FragmentManager,
    val totalTabs:Int
):FragmentPagerAdapter(fragment) {


    override fun getCount(): Int =totalTabs

    override fun getItem(position: Int): Fragment {
        when(position){
            0->return FavoriteFragment()
            1->return MainFragment()
            2->return PlayListFragment()
            3->return RecentlyFragment()
            else->return MainFragment()
        }
    }
}