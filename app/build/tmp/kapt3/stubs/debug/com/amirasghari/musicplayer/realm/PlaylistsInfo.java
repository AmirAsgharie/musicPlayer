package com.amirasghari.musicplayer.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/amirasghari/musicplayer/realm/PlaylistsInfo;", "Lio/realm/RealmObject;", "()V", "musicNumber", "", "getMusicNumber", "()I", "setMusicNumber", "(I)V", "playListMainImagePath", "", "getPlayListMainImagePath", "()Ljava/lang/String;", "setPlayListMainImagePath", "(Ljava/lang/String;)V", "playListName", "getPlayListName", "setPlayListName", "app_debug"})
public class PlaylistsInfo extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey
    public java.lang.String playListName;
    private int musicNumber = 0;
    public java.lang.String playListMainImagePath;
    
    public PlaylistsInfo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlayListName() {
        return null;
    }
    
    public final void setPlayListName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getMusicNumber() {
        return 0;
    }
    
    public final void setMusicNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlayListMainImagePath() {
        return null;
    }
    
    public final void setPlayListMainImagePath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}