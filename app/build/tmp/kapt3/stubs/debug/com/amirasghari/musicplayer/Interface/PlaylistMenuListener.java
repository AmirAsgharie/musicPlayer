package com.amirasghari.musicplayer.Interface;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/amirasghari/musicplayer/Interface/PlaylistMenuListener;", "", "onMenuClickListener", "", "data", "Lcom/amirasghari/musicplayer/realm/PlaylistsInfo;", "position", "", "view", "Landroid/view/View;", "app_debug"})
public abstract interface PlaylistMenuListener {
    
    public abstract void onMenuClickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.PlaylistsInfo data, int position, @org.jetbrains.annotations.NotNull
    android.view.View view);
}