// Generated by data binding compiler. Do not edit!
package com.amirasghari.musicplayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.amirasghari.musicplayer.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySinglePlaylistBinding extends ViewDataBinding {
  @NonNull
  public final CardView backCard;

  @NonNull
  public final TextView currentMusicArtistTxt;

  @NonNull
  public final CardView currentMusicCard;

  @NonNull
  public final ConstraintLayout currentMusicCons;

  @NonNull
  public final ImageView currentMusicImg;

  @NonNull
  public final CardView currentMusicImgCard;

  @NonNull
  public final TextView currentMusicTxt;

  @NonNull
  public final Guideline guid50Hor;

  @NonNull
  public final ConstraintLayout headerCons;

  @NonNull
  public final TextView playListName;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final CardView shuffleCard;

  protected ActivitySinglePlaylistBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView backCard, TextView currentMusicArtistTxt,
      CardView currentMusicCard, ConstraintLayout currentMusicCons, ImageView currentMusicImg,
      CardView currentMusicImgCard, TextView currentMusicTxt, Guideline guid50Hor,
      ConstraintLayout headerCons, TextView playListName, RecyclerView recycler,
      CardView shuffleCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backCard = backCard;
    this.currentMusicArtistTxt = currentMusicArtistTxt;
    this.currentMusicCard = currentMusicCard;
    this.currentMusicCons = currentMusicCons;
    this.currentMusicImg = currentMusicImg;
    this.currentMusicImgCard = currentMusicImgCard;
    this.currentMusicTxt = currentMusicTxt;
    this.guid50Hor = guid50Hor;
    this.headerCons = headerCons;
    this.playListName = playListName;
    this.recycler = recycler;
    this.shuffleCard = shuffleCard;
  }

  @NonNull
  public static ActivitySinglePlaylistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_single_playlist, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySinglePlaylistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySinglePlaylistBinding>inflateInternal(inflater, R.layout.activity_single_playlist, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySinglePlaylistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_single_playlist, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySinglePlaylistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySinglePlaylistBinding>inflateInternal(inflater, R.layout.activity_single_playlist, null, false, component);
  }

  public static ActivitySinglePlaylistBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySinglePlaylistBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySinglePlaylistBinding)bind(component, view, R.layout.activity_single_playlist);
  }
}
