package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010#\u001a\u0012\u0012\u0004\u0012\u00020$0\rj\b\u0012\u0004\u0012\u00020$`%H\u0002J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J \u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u001c\u00100\u001a\u00020\'2\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\'2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00106\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-H\u0017J\u0010\u00107\u001a\u00020\'2\u0006\u00108\u001a\u000209H\u0003J \u0010:\u001a\u00020\'2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`%H\u0002J\u0006\u0010;\u001a\u00020\'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006<"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/SinglePlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListListener;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListMenuListener;", "Landroid/content/ServiceConnection;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;)V", "currentPlayListMusic", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/realm/SinglePlaylistInfo;", "getCurrentPlayListMusic", "()Ljava/util/ArrayList;", "musicService", "Lcom/amirasghari/musicplayer/Service/Service;", "getMusicService", "()Lcom/amirasghari/musicplayer/Service/Service;", "setMusicService", "(Lcom/amirasghari/musicplayer/Service/Service;)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "viewModel", "Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "getViewModel", "()Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "setViewModel", "(Lcom/amirasghari/musicplayer/ViewModel/ViewModel;)V", "changePlayList", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "Lkotlin/collections/ArrayList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "position", "", "view", "Landroid/view/View;", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "onclickListener", "play", "path", "", "recyclerView", "startService", "app_debug"})
public final class SinglePlaylistActivity extends androidx.appcompat.app.AppCompatActivity implements com.amirasghari.musicplayer.Interface.SinglePlayListListener, com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener, android.content.ServiceConnection {
    @org.jetbrains.annotations.Nullable
    private com.amirasghari.musicplayer.Service.Service musicService;
    public android.content.SharedPreferences shared;
    public com.amirasghari.musicplayer.ViewModel.ViewModel viewModel;
    public com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding binding;
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
    public final java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> getCurrentPlayListMusic() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    private final void play(java.lang.String path) {
    }
    
    private final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> changePlayList() {
        return null;
    }
}