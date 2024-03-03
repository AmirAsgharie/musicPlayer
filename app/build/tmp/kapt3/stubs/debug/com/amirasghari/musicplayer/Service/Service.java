package com.amirasghari.musicplayer.Service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001UB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010E\u001a\u00020FJ\b\u0010G\u001a\u00020FH\u0002J\u0014\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020FH\u0016J\"\u0010M\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010K2\u0006\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020*H\u0017J\u0006\u0010Q\u001a\u00020FJ\b\u0010R\u001a\u00020FH\u0007J\u0006\u0010S\u001a\u00020FJ\u0006\u0010T\u001a\u00020FR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R\u001a\u00102\u001a\u000203X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\b\u0012\u0004\u0012\u00020*09X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R*\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0010\"\u0004\bD\u0010\u0012\u00a8\u0006V"}, d2 = {"Lcom/amirasghari/musicplayer/Service/Service;", "Landroid/app/Service;", "()V", "builder", "Landroid/app/Notification$Builder;", "getBuilder", "()Landroid/app/Notification$Builder;", "setBuilder", "(Landroid/app/Notification$Builder;)V", "channelId", "", "description", "mainSongList", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getMainSongList", "()Ljava/util/ArrayList;", "setMainSongList", "(Ljava/util/ArrayList;)V", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "musicPlayer", "Landroid/media/MediaPlayer;", "getMusicPlayer", "()Landroid/media/MediaPlayer;", "setMusicPlayer", "(Landroid/media/MediaPlayer;)V", "myBinder", "Lcom/amirasghari/musicplayer/Service/Service$MyBinder;", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel", "()Landroid/app/NotificationChannel;", "setNotificationChannel", "(Landroid/app/NotificationChannel;)V", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "recentSongs", "getRecentSongs", "setRecentSongs", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "shuffleList", "", "getShuffleList", "()Ljava/util/List;", "setShuffleList", "(Ljava/util/List;)V", "shufflePosition", "getShufflePosition", "setShufflePosition", "songList", "Lkotlin/collections/ArrayList;", "getSongList", "setSongList", "getMusicsDetails", "", "notification", "onBind", "Landroid/os/IBinder;", "data", "Landroid/content/Intent;", "onCreate", "onStartCommand", "intent", "flags", "startId", "play", "playShuffle", "repeat", "showNotification", "MyBinder", "app_debug"})
public final class Service extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> songList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> mainSongList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> recentSongs;
    private int position = 0;
    private int shufflePosition = 0;
    public android.app.NotificationManager notificationManager;
    public android.app.NotificationChannel notificationChannel;
    public android.app.Notification.Builder builder;
    private final java.lang.String channelId = "i.apps.notifications";
    private final java.lang.String description = "Test notification";
    public android.content.SharedPreferences shared;
    public java.util.List<java.lang.Integer> shuffleList;
    private com.amirasghari.musicplayer.Service.Service.MyBinder myBinder;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer musicPlayer;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    
    public Service() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getSongList() {
        return null;
    }
    
    public final void setSongList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getMainSongList() {
        return null;
    }
    
    public final void setMainSongList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getRecentSongs() {
        return null;
    }
    
    public final void setRecentSongs(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    public final int getShufflePosition() {
        return 0;
    }
    
    public final void setShufflePosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    public final void setNotificationManager(@org.jetbrains.annotations.NotNull
    android.app.NotificationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.NotificationChannel getNotificationChannel() {
        return null;
    }
    
    public final void setNotificationChannel(@org.jetbrains.annotations.NotNull
    android.app.NotificationChannel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Notification.Builder getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.NotNull
    android.app.Notification.Builder p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getShuffleList() {
        return null;
    }
    
    public final void setShuffleList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.media.MediaPlayer getMusicPlayer() {
        return null;
    }
    
    public final void setMusicPlayer(@org.jetbrains.annotations.Nullable
    android.media.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent data) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @androidx.annotation.RequiresApi(value = 33)
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public final void play() {
    }
    
    public final void repeat() {
    }
    
    private final void notification() {
    }
    
    public final void getMusicsDetails() {
    }
    
    public final void showNotification() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void playShuffle() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/amirasghari/musicplayer/Service/Service$MyBinder;", "Landroid/os/Binder;", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "currentService", "Lcom/amirasghari/musicplayer/Service/Service;", "app_debug"})
    public final class MyBinder extends android.os.Binder {
        
        public MyBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.amirasghari.musicplayer.Service.Service currentService() {
            return null;
        }
    }
}