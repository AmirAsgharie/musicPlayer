package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\rj\b\u0012\u0004\u0012\u000203`4H\u0002J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0015J \u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000206H\u0014J\u001c\u0010?\u001a\u0002062\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0017J\u0012\u0010D\u001a\u0002062\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0018\u0010E\u001a\u0002062\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020+H\u0017J>\u0010F\u001a\u0002062\u0006\u0010 \u001a\u00020\u00122\u001c\b\u0002\u0010G\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u00010\rj\n\u0012\u0004\u0012\u000203\u0018\u0001`42\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0003J \u0010H\u001a\u0002062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`4H\u0003J \u0010I\u001a\u0002062\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`4H\u0002J\u0014\u0010J\u001a\u0002062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010K\u001a\u000206R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006L"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/SinglePlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListListener;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListMenuListener;", "Landroid/content/ServiceConnection;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;)V", "currentPlayListMusic", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/realm/SinglePlaylistInfo;", "getCurrentPlayListMusic", "()Ljava/util/ArrayList;", "musicArtist", "", "getMusicArtist", "()Ljava/lang/String;", "setMusicArtist", "(Ljava/lang/String;)V", "musicName", "getMusicName", "setMusicName", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "path", "getPath", "setPath", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "shuffleList", "", "", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "changePlayList", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "Lkotlin/collections/ArrayList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "position", "view", "Landroid/view/View;", "onResume", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "onclickListener", "play", "recentSongs", "playShuffle", "recyclerView", "setShuffleList", "startService", "app_debug"})
public final class SinglePlaylistActivity extends androidx.appcompat.app.AppCompatActivity implements com.amirasghari.musicplayer.Interface.SinglePlayListListener, com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener, android.content.ServiceConnection {
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public android.content.SharedPreferences shared;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding binding;
    public java.lang.String path;
    public java.lang.String musicName;
    public java.lang.String musicArtist;
    private java.util.List<java.lang.Integer> shuffleList;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> currentPlayListMusic = null;
    
    public SinglePlaylistActivity() {
        super();
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
    public final com.amirasghari.musicplayer.ViewModel.ViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.ViewModel.ViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMusicName() {
        return null;
    }
    
    public final void setMusicName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMusicArtist() {
        return null;
    }
    
    public final void setMusicArtist(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> getCurrentPlayListMusic() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void recyclerView(java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> data) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.SinglePlaylistInfo data, int position) {
    }
    
    @java.lang.Override
    public void onMenuClickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.SinglePlaylistInfo data, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void startService() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0, @org.jetbrains.annotations.Nullable
    android.os.IBinder service) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void play(java.lang.String path, java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> recentSongs, java.util.List<java.lang.Integer> shuffleList) {
    }
    
    private final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> changePlayList() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void playShuffle(java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> currentPlayListMusic) {
    }
    
    public final void setShuffleList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> shuffleList) {
    }
}