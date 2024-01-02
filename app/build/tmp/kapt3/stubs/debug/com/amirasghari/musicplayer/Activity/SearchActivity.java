package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u001c\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\u00020%2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`3H\u0002J\u0006\u00104\u001a\u00020%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00065"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/ServiceConnection;", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivitySearchBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivitySearchBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivitySearchBinding;)V", "music", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getMusic", "()Ljava/util/ArrayList;", "setMusic", "(Ljava/util/ArrayList;)V", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "onclickListener", "data", "position", "", "recyclerView", "Lkotlin/collections/ArrayList;", "startService", "app_debug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity implements android.content.ServiceConnection, com.amirasghari.musicplayer.Interface.MusicListener {
    public com.amirasghari.musicplayer.databinding.ActivitySearchBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public android.content.SharedPreferences shared;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> music;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    
    public SearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivitySearchBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivitySearchBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.Service.Service getMusicService() {
        return null;
    }
    
    public final void setMusicService(@org.jetbrains.annotations.Nullable
    com.amirasghari.musicplayer.Service.Service p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getMusic() {
        return null;
    }
    
    public final void setMusic(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.ViewModel.ViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.ViewModel.ViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void recyclerView(java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> data) {
    }
    
    public final void startService() {
    }
    
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0, @org.jetbrains.annotations.Nullable
    android.os.IBinder service) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0) {
    }
    
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Model.AudioModel data, int position) {
    }
}