package com.amirasghari.musicplayer.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0017J\b\u0010/\u001a\u00020\'H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/amirasghari/musicplayer/Fragment/FavoriteFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/FragmentFavoriteBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/FragmentFavoriteBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/FragmentFavoriteBinding;)V", "bindingActivity", "Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "getBindingActivity", "()Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "setBindingActivity", "(Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;)V", "first", "", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "onViewCreated", "view", "onclickListener", "data", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "position", "", "recyclerView", "app_debug"})
public final class FavoriteFragment extends androidx.fragment.app.Fragment implements com.amirasghari.musicplayer.Interface.MusicListener {
    public com.amirasghari.musicplayer.databinding.FragmentFavoriteBinding binding;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public android.content.SharedPreferences shared;
    public com.amirasghari.musicplayer.databinding.ActivityMainBinding bindingActivity;
    private boolean first = true;
    
    public FavoriteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.FragmentFavoriteBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.FragmentFavoriteBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.ViewModel.ViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.ViewModel.ViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivityMainBinding getBindingActivity() {
        return null;
    }
    
    public final void setBindingActivity(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void recyclerView() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Model.AudioModel data, int position) {
    }
}