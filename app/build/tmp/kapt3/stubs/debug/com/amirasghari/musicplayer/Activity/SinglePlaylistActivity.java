package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010G\u001a\u00020HH\u0002J\u0018\u0010I\u001a\u0012\u0012\u0004\u0012\u0002010\u0014j\b\u0012\u0004\u0012\u000201`JH\u0002J\u0010\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020@H\u0016J\u0012\u0010M\u001a\u00020H2\b\u0010N\u001a\u0004\u0018\u00010OH\u0015J \u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020@2\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020HH\u0014J\u001c\u0010V\u001a\u00020H2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0017J\u0012\u0010[\u001a\u00020H2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0018\u0010\\\u001a\u00020H2\u0006\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020@H\u0017J>\u0010]\u001a\u00020H2\u0006\u0010-\u001a\u00020\u001f2\u001c\b\u0002\u0010^\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u00010\u0014j\n\u0012\u0004\u0012\u000201\u0018\u0001`J2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0003J \u0010_\u001a\u00020H2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`JH\u0003J \u0010`\u001a\u00020H2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`JH\u0002J\u0014\u0010a\u001a\u00020H2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?J\u0006\u0010b\u001a\u00020HJ\u0006\u0010c\u001a\u00020HR\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R \u00100\u001a\b\u0012\u0004\u0012\u0002010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u00a8\u0006d"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/SinglePlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListListener;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListMenuListener;", "Landroid/content/ServiceConnection;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "()V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;)V", "currentPlayListMusic", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/realm/SinglePlaylistInfo;", "getCurrentPlayListMusic", "()Ljava/util/ArrayList;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "musicArtist", "", "getMusicArtist", "()Ljava/lang/String;", "setMusicArtist", "(Ljava/lang/String;)V", "musicName", "getMusicName", "setMusicName", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "path", "getPath", "setPath", "playListMusics", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getPlayListMusics", "setPlayListMusics", "(Ljava/util/ArrayList;)V", "playlistName", "getPlaylistName", "setPlaylistName", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "shuffleList", "", "", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "changeMusicFocus", "", "changePlayList", "Lkotlin/collections/ArrayList;", "onAudioFocusChange", "focus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "position", "view", "Landroid/view/View;", "onResume", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "onclickListener", "play", "recentSongs", "playShuffle", "recyclerView", "setShuffleList", "startService", "updateUI", "app_debug"})
public final class SinglePlaylistActivity extends androidx.appcompat.app.AppCompatActivity implements com.amirasghari.musicplayer.Interface.SinglePlayListListener, com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener, android.content.ServiceConnection, android.media.AudioManager.OnAudioFocusChangeListener {
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public android.content.SharedPreferences shared;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public android.os.Handler mainHandler;
    public com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding binding;
    public java.lang.String path;
    public android.media.AudioManager audioManager;
    public java.lang.String musicName;
    public java.lang.String musicArtist;
    public java.lang.String playlistName;
    private java.util.List<java.lang.Integer> shuffleList;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> currentPlayListMusic = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> playListMusics;
    
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
    public final android.os.Handler getMainHandler() {
        return null;
    }
    
    public final void setMainHandler(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
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
    public final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    public final void setAudioManager(@org.jetbrains.annotations.NotNull
    android.media.AudioManager p0) {
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
    public final java.lang.String getPlaylistName() {
        return null;
    }
    
    public final void setPlaylistName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> getCurrentPlayListMusic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getPlayListMusics() {
        return null;
    }
    
    public final void setPlayListMusics(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
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
    
    private final void changeMusicFocus() {
    }
    
    @java.lang.Override
    public void onAudioFocusChange(int focus) {
    }
    
    public final void updateUI() {
    }
}