package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Suppress(names = {"UNREACHABLE_CODE"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0003J\b\u00106\u001a\u000205H\u0003J\u0010\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010<H\u0015J&\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u001c\u0010D\u001a\u0002052\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0017J\u0012\u0010I\u001a\u0002052\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010J\u001a\u000205H\u0002J\b\u0010K\u001a\u000205H\u0002J\b\u0010L\u001a\u000205H\u0002J\b\u0010(\u001a\u000205H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006M"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/ShowMusicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/ServiceConnection;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivityShowMusicBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivityShowMusicBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivityShowMusicBinding;)V", "favorite", "", "getFavorite", "()Z", "setFavorite", "(Z)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "time", "", "getTime", "()I", "setTime", "(I)V", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "onClickBackBtn", "", "onClickNextBtn", "onContextItemSelected", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateContextMenu", "menu", "Landroid/view/ContextMenu;", "v", "Landroid/view/View;", "menuInfo", "Landroid/view/ContextMenu$ContextMenuInfo;", "onServiceConnected", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "setUp", "setUpBtn", "startService", "app_debug"})
public final class ShowMusicActivity extends androidx.appcompat.app.AppCompatActivity implements android.content.ServiceConnection {
    public com.amirasghari.musicplayer.databinding.ActivityShowMusicBinding binding;
    public android.content.SharedPreferences shared;
    public android.media.MediaPlayer mediaPlayer;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public android.os.Handler mainHandler;
    private int time = 0;
    private boolean favorite = false;
    
    public ShowMusicActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivityShowMusicBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivityShowMusicBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.NotNull
    android.media.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.ViewModel.ViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.ViewModel.ViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.Service.Service getMusicService() {
        return null;
    }
    
    public final void setMusicService(@org.jetbrains.annotations.Nullable
    com.amirasghari.musicplayer.Service.Service p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getMainHandler() {
        return null;
    }
    
    public final void setMainHandler(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
    }
    
    public final int getTime() {
        return 0;
    }
    
    public final void setTime(int p0) {
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onCreateContextMenu(@org.jetbrains.annotations.Nullable
    android.view.ContextMenu menu, @org.jetbrains.annotations.Nullable
    android.view.View v, @org.jetbrains.annotations.Nullable
    android.view.ContextMenu.ContextMenuInfo menuInfo) {
    }
    
    @java.lang.Override
    public boolean onContextItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setUp() {
    }
    
    private final void setUpBtn() {
    }
    
    private final void startService() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName name, @org.jetbrains.annotations.Nullable
    android.os.IBinder service) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable
    android.content.ComponentName name) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void onClickNextBtn() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void onClickBackBtn() {
    }
    
    private final void time() {
    }
}