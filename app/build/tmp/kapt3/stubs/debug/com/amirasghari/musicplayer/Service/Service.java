package com.amirasghari.musicplayer.Service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001hB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u0006\u0010P\u001a\u00020QJ\n\u0010R\u001a\u0004\u0018\u00010SH\u0004J\n\u0010T\u001a\u0004\u0018\u00010SH\u0004J\n\u0010U\u001a\u0004\u0018\u00010SH\u0004J\n\u0010V\u001a\u0004\u0018\u00010SH\u0004J\n\u0010W\u001a\u0004\u0018\u00010SH\u0004J\u0014\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010\\\u001a\u00020QH\u0016J\"\u0010]\u001a\u0002052\b\u0010^\u001a\u0004\u0018\u00010[2\u0006\u0010_\u001a\u0002052\u0006\u0010`\u001a\u000205H\u0017J\u0006\u0010a\u001a\u00020QJ\u0006\u0010b\u001a\u00020QJ\u0006\u0010c\u001a\u00020QJ\u0006\u0010d\u001a\u00020QJ\b\u0010e\u001a\u00020QH\u0007J\u0006\u0010f\u001a\u00020QJ\u0006\u0010g\u001a\u00020QR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0012\u0010&\u001a\u00060\'R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010@\u001a\b\u0012\u0004\u0012\u0002050AX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00107\"\u0004\bH\u00109R*\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001b\"\u0004\bL\u0010\u001d\u00a8\u0006i"}, d2 = {"Lcom/amirasghari/musicplayer/Service/Service;", "Landroid/app/Service;", "()V", "ACTION_DESTROY_SERVICE", "", "getACTION_DESTROY_SERVICE", "()Ljava/lang/String;", "ACTION_NEXT", "getACTION_NEXT", "ACTION_PLAY", "getACTION_PLAY", "ACTION_PRE", "getACTION_PRE", "broadcastNotificationReceiver", "Landroid/content/BroadcastReceiver;", "builder", "Landroid/app/Notification$Builder;", "getBuilder", "()Landroid/app/Notification$Builder;", "setBuilder", "(Landroid/app/Notification$Builder;)V", "channelId", "description", "mainSongList", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getMainSongList", "()Ljava/util/ArrayList;", "setMainSongList", "(Ljava/util/ArrayList;)V", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "musicPlayer", "Landroid/media/MediaPlayer;", "getMusicPlayer", "()Landroid/media/MediaPlayer;", "setMusicPlayer", "(Landroid/media/MediaPlayer;)V", "myBinder", "Lcom/amirasghari/musicplayer/Service/Service$MyBinder;", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel", "()Landroid/app/NotificationChannel;", "setNotificationChannel", "(Landroid/app/NotificationChannel;)V", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "shuffleList", "", "getShuffleList", "()Ljava/util/List;", "setShuffleList", "(Ljava/util/List;)V", "shufflePosition", "getShufflePosition", "setShufflePosition", "songList", "Lkotlin/collections/ArrayList;", "getSongList", "setSongList", "getAlbumImage", "Landroid/graphics/Bitmap;", "path", "getMusicsDetails", "", "getPendingIntentDelete", "Landroid/app/PendingIntent;", "getPendingIntentNext", "getPendingIntentPlay", "getPendingIntentPrevious", "intentClick", "onBind", "Landroid/os/IBinder;", "data", "Landroid/content/Intent;", "onCreate", "onStartCommand", "intent", "flags", "startId", "play", "playNext", "playPlayer", "playPrev", "playShuffle", "repeat", "startNotification", "MyBinder", "app_debug"})
public final class Service extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> songList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> mainSongList;
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
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ACTION_PRE = "actionprevious";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ACTION_PLAY = "actionplay";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ACTION_NEXT = "actionpause";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ACTION_DESTROY_SERVICE = "destroy";
    private final android.content.BroadcastReceiver broadcastNotificationReceiver = null;
    
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getACTION_PRE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getACTION_PLAY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getACTION_NEXT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getACTION_DESTROY_SERVICE() {
        return null;
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
    
    public final void getMusicsDetails() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void playShuffle() {
    }
    
    public final void startNotification() {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.app.PendingIntent intentClick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.app.PendingIntent getPendingIntentPrevious() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.app.PendingIntent getPendingIntentPlay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.app.PendingIntent getPendingIntentNext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.app.PendingIntent getPendingIntentDelete() {
        return null;
    }
    
    private final android.graphics.Bitmap getAlbumImage(java.lang.String path) {
        return null;
    }
    
    public final void playPrev() {
    }
    
    public final void playPlayer() {
    }
    
    public final void playNext() {
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