// Generated by data binding compiler. Do not edit!
package com.amirasghari.musicplayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.amirasghari.musicplayer.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentShowMusicBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addBtn;

  @NonNull
  public final CardView backCard;

  @NonNull
  public final CardView controlBtn;

  @NonNull
  public final ImageButton controlMusicImg;

  @NonNull
  public final CardView currentMusicImgCard;

  @NonNull
  public final ImageView favoriteBtn;

  @NonNull
  public final TextView musicArtist;

  @NonNull
  public final ConstraintLayout musicController;

  @NonNull
  public final ImageView musicImg;

  @NonNull
  public final TextView musicTitle;

  protected FragmentShowMusicBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView addBtn, CardView backCard, CardView controlBtn, ImageButton controlMusicImg,
      CardView currentMusicImgCard, ImageView favoriteBtn, TextView musicArtist,
      ConstraintLayout musicController, ImageView musicImg, TextView musicTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBtn = addBtn;
    this.backCard = backCard;
    this.controlBtn = controlBtn;
    this.controlMusicImg = controlMusicImg;
    this.currentMusicImgCard = currentMusicImgCard;
    this.favoriteBtn = favoriteBtn;
    this.musicArtist = musicArtist;
    this.musicController = musicController;
    this.musicImg = musicImg;
    this.musicTitle = musicTitle;
  }

  @NonNull
  public static FragmentShowMusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_show_music, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShowMusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentShowMusicBinding>inflateInternal(inflater, R.layout.fragment_show_music, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentShowMusicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_show_music, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShowMusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentShowMusicBinding>inflateInternal(inflater, R.layout.fragment_show_music, null, false, component);
  }

  public static FragmentShowMusicBinding bind(@NonNull View view) {
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
  public static FragmentShowMusicBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentShowMusicBinding)bind(component, view, R.layout.fragment_show_music);
  }
}
