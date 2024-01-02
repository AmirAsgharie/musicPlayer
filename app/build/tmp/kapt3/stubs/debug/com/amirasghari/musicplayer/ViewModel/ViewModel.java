package com.amirasghari.musicplayer.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00130\u0004J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/amirasghari/musicplayer/ViewModel/ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentMusicName", "Landroidx/lifecycle/MutableLiveData;", "", "songs", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "getSongs", "()Ljava/util/ArrayList;", "setSongs", "(Ljava/util/ArrayList;)V", "songsList", "addToSongList", "", "data", "getCurrentMusicName", "observeSongsList", "Lkotlin/collections/ArrayList;", "setCurrentMusicName", "name", "size", "", "app_debug"})
public class ViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel>> songsList = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> songs;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentMusicName = null;
    
    public ViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getSongs() {
        return null;
    }
    
    public final void setSongs(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> p0) {
    }
    
    public final void addToSongList(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Model.AudioModel data) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel>> observeSongsList() {
        return null;
    }
    
    public final int size() {
        return 0;
    }
    
    public final void setCurrentMusicName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrentMusicName() {
        return null;
    }
}