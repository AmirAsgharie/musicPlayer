package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J \u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u00102\u001a\u00020$H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\u00a8\u00063"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/PlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/amirasghari/musicplayer/Interface/PlaylistListener;", "Lcom/amirasghari/musicplayer/Interface/PlaylistMenuListener;", "()V", "artist", "", "getArtist", "()Ljava/lang/String;", "setArtist", "(Ljava/lang/String;)V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivityPlaylistBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivityPlaylistBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivityPlaylistBinding;)V", "duration", "getDuration", "setDuration", "image", "getImage", "setImage", "path", "getPath", "setPath", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "title", "getTitle", "setTitle", "addToPlayList", "", "playListName", "createNewPlaylist", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "Lcom/amirasghari/musicplayer/realm/PlaylistsInfo;", "position", "", "view", "Landroid/view/View;", "onclickListener", "recyclerView", "app_debug"})
public final class PlaylistActivity extends androidx.appcompat.app.AppCompatActivity implements com.amirasghari.musicplayer.Interface.PlaylistListener, com.amirasghari.musicplayer.Interface.PlaylistMenuListener {
    public com.amirasghari.musicplayer.databinding.ActivityPlaylistBinding binding;
    public android.content.SharedPreferences shared;
    public java.lang.String title;
    public java.lang.String artist;
    public java.lang.String image;
    public java.lang.String path;
    public java.lang.String duration;
    
    public PlaylistActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivityPlaylistBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivityPlaylistBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getArtist() {
        return null;
    }
    
    public final void setArtist(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createNewPlaylist(java.lang.String playListName) {
    }
    
    private final void recyclerView() {
    }
    
    private final void addToPlayList(java.lang.String playListName) {
    }
    
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.PlaylistsInfo data, int position) {
    }
    
    @java.lang.Override
    public void onMenuClickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.PlaylistsInfo data, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}