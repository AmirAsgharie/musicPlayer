package com.amirasghari.musicplayer.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\u00020\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0018j\b\u0012\u0004\u0012\u00020\u0011`\u0019H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/amirasghari/musicplayer/Activity/SinglePlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListListener;", "Lcom/amirasghari/musicplayer/Interface/SinglePlayListMenuListener;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/ActivitySinglePlaylistBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "data", "Lcom/amirasghari/musicplayer/realm/SinglePlaylistInfo;", "position", "", "view", "Landroid/view/View;", "onclickListener", "recyclerView", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class SinglePlaylistActivity extends androidx.appcompat.app.AppCompatActivity implements com.amirasghari.musicplayer.Interface.SinglePlayListListener, com.amirasghari.musicplayer.Interface.SinglePlayListMenuListener {
    public com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding binding;
    
    public SinglePlaylistActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.ActivitySinglePlaylistBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void recyclerView(java.util.ArrayList<com.amirasghari.musicplayer.realm.SinglePlaylistInfo> data) {
    }
    
    @java.lang.Override
    public void onclickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.SinglePlaylistInfo data, int position) {
    }
    
    @java.lang.Override
    public void onMenuClickListener(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.realm.SinglePlaylistInfo data, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}