package com.amirasghari.musicplayer.databinding;
import com.amirasghari.musicplayer.R;
import com.amirasghari.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityShowMusicBindingImpl extends ActivityShowMusicBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.currentMusicImgCard, 1);
        sViewsWithIds.put(R.id.musicImg, 2);
        sViewsWithIds.put(R.id.backCard, 3);
        sViewsWithIds.put(R.id.musicTitle, 4);
        sViewsWithIds.put(R.id.musicArtist, 5);
        sViewsWithIds.put(R.id.addBtn, 6);
        sViewsWithIds.put(R.id.favoriteBtn, 7);
        sViewsWithIds.put(R.id.musicController, 8);
        sViewsWithIds.put(R.id.audioWave, 9);
        sViewsWithIds.put(R.id.musicDuration, 10);
        sViewsWithIds.put(R.id.currentDuration, 11);
        sViewsWithIds.put(R.id.controlBtn, 12);
        sViewsWithIds.put(R.id.controlMusicImg, 13);
        sViewsWithIds.put(R.id.nextBtn, 14);
        sViewsWithIds.put(R.id.backBtn, 15);
        sViewsWithIds.put(R.id.shuffleBtn, 16);
        sViewsWithIds.put(R.id.repeatBtn, 17);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityShowMusicBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityShowMusicBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (com.masoudss.lib.WaveformSeekBar) bindings[9]
            , (android.widget.ImageButton) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageButton) bindings[17]
            , (android.widget.ImageButton) bindings[16]
            );
        this.cons.setTag(null);
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