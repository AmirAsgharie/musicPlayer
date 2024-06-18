package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020@H\u0002J\b\u0010D\u001a\u00020@H\u0002J\u0010\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u000208H\u0016J\u0012\u0010G\u001a\u00020@2\b\u0010H\u001a\u0004\u0018\u00010IH\u0015J-\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u0002082\u000e\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180M2\u0006\u0010N\u001a\u00020OH\u0016\u00a2\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020@H\u0014J\u001c\u0010R\u001a\u00020@2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0017J\u0012\u0010W\u001a\u00020@2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J>\u0010X\u001a\u00020@2\u0006\u0010&\u001a\u00020\u00182\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0004\u0012\u00020+\u0018\u00010*j\n\u0012\u0004\u0012\u00020+\u0018\u0001`Y2\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107H\u0007J\b\u0010Z\u001a\u00020@H\u0002J\u0014\u0010[\u001a\u00020@2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807J\b\u0010\\\u001a\u00020@H\u0002J\u0006\u0010]\u001a\u00020@J\u0006\u0010^\u001a\u00020@R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR \u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020:X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006_"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/ServiceConnection;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "()V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivityMainBinding;)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "musicArtist", "", "getMusicArtist", "()Ljava/lang/String;", "setMusicArtist", "(Ljava/lang/String;)V", "musicName", "getMusicName", "setMusicName", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "path", "getPath", "setPath", "recentSongs", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getRecentSongs", "()Ljava/util/ArrayList;", "setRecentSongs", "(Ljava/util/ArrayList;)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "shuffleList", "", "", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "changeMusicFocus", "", "checkPermission", "", "clickCurrentCard", "getRecentMusicsDetails", "onAudioFocusChange", "focus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "play", "Lkotlin/collections/ArrayList;", "requestPermission", "setShuffleList", "setUpTabLayout", "startService", "updateUI", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.content.ServiceConnection, android.media.AudioManager.OnAudioFocusChangeListener {
    public com.amirasghari.musicplayer.databinding.ActivityMainBinding binding;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public android.os.Handler mainHandler;
    public android.media.AudioManager audioManager;
    public android.content.SharedPreferences shared;
    private java.util.List<java.lang.Integer> shuffleList;
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public java.lang.String path;
    public java.lang.String musicName;
    public java.lang.String musicArtist;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> recentSongs;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivityMainBinding p0) {
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
    public final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    public final void setAudioManager(@org.jetbrains.annotations.NotNull
    android.media.AudioManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.Service.Service getMusicService() {
        return null;
    }
    
    public final void setMusicService(@org.jetbrains.annotations.Nullable
    com.amirasghari.musicplayer.Service.Service p0) {
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
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getRecentSongs() {
        return null;
    }
    
    public final void setRecentSongs(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle", "Range"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void clickCurrentCard() {
    }
    
    private final void setUpTabLayout() {
    }
    
    public final void startService() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0, @org.jetbrains.annotations.Nullable
    android.os.IBinder service) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void play(@org.jetbrains.annotations.NotNull
    java.lang.String path, @org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> recentSongs, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Integer> shuffleList) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName p0) {
    }
    
    private final void getRecentMusicsDetails() {
    }
    
    private final void requestPermission() {
    }
    
    private final boolean checkPermission() {
        return false;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    public final void setShuffleList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> shuffleList) {
    }
    
    @java.lang.Override
    public void onAudioFocusChange(int focus) {
    }
    
    private final void changeMusicFocus() {
    }
    
    public final void updateUI() {
    }
}