package com.amirasghari.musicplayer.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001e"}, d2 = {"Lcom/amirasghari/musicplayer/Fragment/PlayListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/amirasghari/musicplayer/Interface/PlaylistListener;", "Lcom/amirasghari/musicplayer/Interface/PlaylistMenuListener;", "()V", "binding", "Lcom/amirasghari/musicplayer/databinding/FragmentPlayListBinding;", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/FragmentPlayListBinding;", "setBinding", "(Lcom/amirasghari/musicplayer/databinding/FragmentPlayListBinding;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMenuClickListener", "", "data", "Lcom/amirasghari/musicplayer/realm/PlaylistsInfo;", "position", "", "view", "onResume", "onViewCreated", "onclickListener", "recyclerView", "app_debug"})
public final class PlayListFragment extends androidx.fragment.app.Fragment implements com.amirasghari.musicplayer.Interface.PlaylistListener, com.amirasghari.musicplayer.Interface.PlaylistMenuListener {
    public com.amirasghari.musicplayer.databinding.FragmentPlayListBinding binding;
    
    public PlayListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.amirasghari.musicplayer.databinding.FragmentPlayListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.databinding.FragmentPlayListBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void recyclerView() {
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