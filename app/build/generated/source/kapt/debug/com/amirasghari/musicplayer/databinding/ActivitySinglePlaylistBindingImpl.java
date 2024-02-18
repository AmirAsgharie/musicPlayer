package com.amirasghari.musicplayer.databinding;
import com.amirasghari.musicplayer.R;
import com.amirasghari.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySinglePlaylistBindingImpl extends ActivitySinglePlaylistBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerCons, 1);
        sViewsWithIds.put(R.id.backCard, 2);
        sViewsWithIds.put(R.id.searchCard, 3);
        sViewsWithIds.put(R.id.playListName, 4);
        sViewsWithIds.put(R.id.recycler, 5);
        sViewsWithIds.put(R.id.currentMusicCard, 6);
        sViewsWithIds.put(R.id.currentMusicCons, 7);
        sViewsWithIds.put(R.id.currentMusicImgCard, 8);
        sViewsWithIds.put(R.id.currentMusicImg, 9);
        sViewsWithIds.put(R.id.currentMusicTxt, 10);
        sViewsWithIds.put(R.id.currentMusicArtistTxt, 11);
        sViewsWithIds.put(R.id.guid50Hor, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySinglePlaylistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivitySinglePlaylistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}