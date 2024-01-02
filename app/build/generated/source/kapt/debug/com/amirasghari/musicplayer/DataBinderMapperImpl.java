package com.amirasghari.musicplayer;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.amirasghari.musicplayer.databinding.ActivityMainBindingImpl;
import com.amirasghari.musicplayer.databinding.ActivityPlaylistBindingImpl;
import com.amirasghari.musicplayer.databinding.ActivitySearchBindingImpl;
import com.amirasghari.musicplayer.databinding.ActivityShowMusicBindingImpl;
import com.amirasghari.musicplayer.databinding.FragmentFavoriteBindingImpl;
import com.amirasghari.musicplayer.databinding.FragmentMainBindingImpl;
import com.amirasghari.musicplayer.databinding.FragmentPlayListBindingImpl;
import com.amirasghari.musicplayer.databinding.FragmentShowMusicBindingImpl;
import com.amirasghari.musicplayer.databinding.MusicRowBindingImpl;
import com.amirasghari.musicplayer.databinding.PlayllistDialogBindingImpl;
import com.amirasghari.musicplayer.databinding.SearchRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYPLAYLIST = 2;

  private static final int LAYOUT_ACTIVITYSEARCH = 3;

  private static final int LAYOUT_ACTIVITYSHOWMUSIC = 4;

  private static final int LAYOUT_FRAGMENTFAVORITE = 5;

  private static final int LAYOUT_FRAGMENTMAIN = 6;

  private static final int LAYOUT_FRAGMENTPLAYLIST = 7;

  private static final int LAYOUT_FRAGMENTSHOWMUSIC = 8;

  private static final int LAYOUT_MUSICROW = 9;

  private static final int LAYOUT_PLAYLLISTDIALOG = 10;

  private static final int LAYOUT_SEARCHROW = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.activity_playlist, LAYOUT_ACTIVITYPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.activity_show_music, LAYOUT_ACTIVITYSHOWMUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.fragment_play_list, LAYOUT_FRAGMENTPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.fragment_show_music, LAYOUT_FRAGMENTSHOWMUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.music_row, LAYOUT_MUSICROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.playllist_dialog, LAYOUT_PLAYLLISTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.amirasghari.musicplayer.R.layout.search_row, LAYOUT_SEARCHROW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPLAYLIST: {
          if ("layout/activity_playlist_0".equals(tag)) {
            return new ActivityPlaylistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_playlist is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHOWMUSIC: {
          if ("layout/activity_show_music_0".equals(tag)) {
            return new ActivityShowMusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_show_music is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYLIST: {
          if ("layout/fragment_play_list_0".equals(tag)) {
            return new FragmentPlayListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_play_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOWMUSIC: {
          if ("layout/fragment_show_music_0".equals(tag)) {
            return new FragmentShowMusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_show_music is invalid. Received: " + tag);
        }
        case  LAYOUT_MUSICROW: {
          if ("layout/music_row_0".equals(tag)) {
            return new MusicRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for music_row is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYLLISTDIALOG: {
          if ("layout/playllist_dialog_0".equals(tag)) {
            return new PlayllistDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for playllist_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHROW: {
          if ("layout/search_row_0".equals(tag)) {
            return new SearchRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_row is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_main_0", com.amirasghari.musicplayer.R.layout.activity_main);
      sKeys.put("layout/activity_playlist_0", com.amirasghari.musicplayer.R.layout.activity_playlist);
      sKeys.put("layout/activity_search_0", com.amirasghari.musicplayer.R.layout.activity_search);
      sKeys.put("layout/activity_show_music_0", com.amirasghari.musicplayer.R.layout.activity_show_music);
      sKeys.put("layout/fragment_favorite_0", com.amirasghari.musicplayer.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_main_0", com.amirasghari.musicplayer.R.layout.fragment_main);
      sKeys.put("layout/fragment_play_list_0", com.amirasghari.musicplayer.R.layout.fragment_play_list);
      sKeys.put("layout/fragment_show_music_0", com.amirasghari.musicplayer.R.layout.fragment_show_music);
      sKeys.put("layout/music_row_0", com.amirasghari.musicplayer.R.layout.music_row);
      sKeys.put("layout/playllist_dialog_0", com.amirasghari.musicplayer.R.layout.playllist_dialog);
      sKeys.put("layout/search_row_0", com.amirasghari.musicplayer.R.layout.search_row);
    }
  }
}
