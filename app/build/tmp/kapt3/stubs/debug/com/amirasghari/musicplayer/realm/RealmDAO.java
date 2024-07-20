package com.amirasghari.musicplayer.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\nJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/amirasghari/musicplayer/realm/RealmDAO;", "", "()V", "realm", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "closeDB", "", "favoriteDelete", "path", "", "favoriteReadAll", "Lio/realm/RealmResults;", "Lcom/amirasghari/musicplayer/realm/FavoriteInfo;", "favoriteReadByName", "favoriteUpdate", "favoriteInfo", "playlistDelete", "name", "playlistReadAll", "Lcom/amirasghari/musicplayer/realm/PlaylistsInfo;", "playlistReadByName", "playlistUpdate", "playlistsInfo", "singlePlaylistDelete", "musicName_PlayList", "singlePlaylistReadAll", "Lcom/amirasghari/musicplayer/realm/SinglePlaylistInfo;", "singlePlaylistReadByName", "singlePlaylistUpdate", "singlePlaylistInfo", "app_debug"})
public final class RealmDAO {
    private final io.realm.Realm realm = null;
    
    public RealmDAO() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.RealmResults<com.amirasghari.musicplayer.realm.FavoriteInfo> favoriteReadAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.realm.FavoriteInfo favoriteReadByName(@org.jetbrains.annotations.NotNull
    java.lang.String path) {
        return null;
    }
    
    public final void favoriteUpdate(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.FavoriteInfo favoriteInfo) {
    }
    
    public final void favoriteDelete(@org.jetbrains.annotations.NotNull
    java.lang.String path) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.RealmResults<com.amirasghari.musicplayer.realm.PlaylistsInfo> playlistReadAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.realm.PlaylistsInfo playlistReadByName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    public final void playlistUpdate(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.PlaylistsInfo playlistsInfo) {
    }
    
    public final void playlistDelete(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.RealmResults<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> singlePlaylistReadAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.amirasghari.musicplayer.realm.SinglePlaylistInfo singlePlaylistReadByName(@org.jetbrains.annotations.NotNull
    java.lang.String musicName_PlayList) {
        return null;
    }
    
    public final void singlePlaylistUpdate(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.SinglePlaylistInfo singlePlaylistInfo) {
    }
    
    public final void singlePlaylistDelete(@org.jetbrains.annotations.NotNull
    java.lang.String musicName_PlayList) {
    }
    
    public final void closeDB() {
    }
}