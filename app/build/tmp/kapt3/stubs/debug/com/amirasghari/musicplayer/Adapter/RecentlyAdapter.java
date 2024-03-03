package com.amirasghari.musicplayer.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/amirasghari/musicplayer/Adapter/RecentlyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/amirasghari/musicplayer/Adapter/RecentlyAdapter$RecentlyViewHolder;", "context", "Landroid/content/Context;", "data", "", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "listener", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/amirasghari/musicplayer/Interface/MusicListener;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RecentlyViewHolder", "app_debug"})
public final class RecentlyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.amirasghari.musicplayer.Adapter.RecentlyAdapter.RecentlyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.amirasghari.musicplayer.Model.AudioModel> data = null;
    private final com.amirasghari.musicplayer.Interface.MusicListener listener = null;
    
    public RecentlyAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.amirasghari.musicplayer.Model.AudioModel> data, @org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Interface.MusicListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.amirasghari.musicplayer.Model.AudioModel> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.amirasghari.musicplayer.Adapter.RecentlyAdapter.RecentlyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Adapter.RecentlyAdapter.RecentlyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/amirasghari/musicplayer/Adapter/RecentlyAdapter$RecentlyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/amirasghari/musicplayer/databinding/MusicRowBinding;", "(Lcom/amirasghari/musicplayer/Adapter/RecentlyAdapter;Lcom/amirasghari/musicplayer/databinding/MusicRowBinding;)V", "getBinding", "()Lcom/amirasghari/musicplayer/databinding/MusicRowBinding;", "bind", "", "data", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "position", "", "listener", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "app_debug"})
    public final class RecentlyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.amirasghari.musicplayer.databinding.MusicRowBinding binding = null;
        
        public RecentlyViewHolder(@org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.databinding.MusicRowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.amirasghari.musicplayer.databinding.MusicRowBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.Model.AudioModel data, int position, @org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.Interface.MusicListener listener) {
        }
    }
}