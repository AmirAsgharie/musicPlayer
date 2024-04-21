package com.amirasghari.musicplayer.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010#\u001a\u00020$H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J \u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020$H\u0016J\u001c\u00103\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00109\u001a\u00020$H\u0016J\u001a\u0010:\u001a\u00020$2\u0006\u00101\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u0010;\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H\u0017J\b\u0010<\u001a\u00020$H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006="}, d2 = {"Lcom/amirasghari/musicplayer/Fragment/RecentlyFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "Lcom/amirasghari/musicplayer/Interface/MusicMenuListener;", "Landroid/content/ServiceConnection;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/FragmentRecentlyBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/FragmentRecentlyBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/FragmentRecentlyBinding;)V", "bindingActivity", "Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "getBindingActivity", "()Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "setBindingActivity", "(Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;)V", "first", "", "recentSongs", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "getMusicsDetails", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "position", "", "view", "onResume", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "p1", "Landroid/os/IBinder;", "onServiceDisconnected", "onStop", "onViewCreated", "onclickListener", "recycler", "app_debug"})
public final class RecentlyFragment extends androidx.fragment.app.Fragment implements com.amirasghari.musicplayer.Interface.MusicListener, com.amirasghari.musicplayer.Interface.MusicMenuListener, android.content.ServiceConnection {
    public com.amirasghari.musicplayer.databinding.FragmentRecentlyBinding binding;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public android.content.SharedPreferences shared;
    public com.amirasghari.musicplayer.databinding.ActivityMainBinding bindingActivity;
    private boolean first = true;
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> recentSongs;
    
    public RecentlyFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.FragmentRecentlyBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.FragmentRecentlyBinding p0) {
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
    
    private final void recycler() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Model.AudioModel data, int position) {
    }
    
    @java.lang.Override
    public void onMenuClickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Model.AudioModel data, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final void getMusicsDetails() {
    }
    
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0, @org.jetbrains.annotations.Nullable
    android.os.IBinder p1) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0) {
    }
    
    @java.lang.Override
    public void onStop() {
    }
}