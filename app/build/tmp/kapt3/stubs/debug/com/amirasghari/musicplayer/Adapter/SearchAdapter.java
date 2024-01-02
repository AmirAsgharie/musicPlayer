package com.amirasghari.musicplayer.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/amirasghari/musicplayer/Adapter/SearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/amirasghari/musicplayer/Adapter/SearchAdapter$SearchViewHolder;", "context", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/amirasghari/musicplayer/Interface/MusicListener;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.amirasghari.musicplayer.Adapter.SearchAdapter.SearchViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> data = null;
    private final com.amirasghari.musicplayer.Interface.MusicListener listener = null;
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> data, @org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Interface.MusicListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.amirasghari.musicplayer.Model.AudioModel> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.amirasghari.musicplayer.Adapter.SearchAdapter.SearchViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.amirasghari.musicplayer.Adapter.SearchAdapter.SearchViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/amirasghari/musicplayer/Adapter/SearchAdapter$SearchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/amirasghari/musicplayer/databinding/SearchRowBinding;", "(Lcom/amirasghari/musicplayer/Adapter/SearchAdapter;Lcom/amirasghari/musicplayer/databinding/SearchRowBinding;)V", "bind", "", "audioModel", "Lcom/amirasghari/musicplayer/Model/AudioModel;", "position", "", "listener", "Lcom/amirasghari/musicplayer/Interface/MusicListener;", "app_debug"})
    public final class SearchViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.amirasghari.musicplayer.databinding.SearchRowBinding binding = null;
        
        public SearchViewHolder(@org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.databinding.SearchRowBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"ResourceAsColor"})
        public final void bind(@org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.Model.AudioModel audioModel, int position, @org.jetbrains.annotations.NotNull
        com.amirasghari.musicplayer.Interface.MusicListener listener) {
        }
    }
}