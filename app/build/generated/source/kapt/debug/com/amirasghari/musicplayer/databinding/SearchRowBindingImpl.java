package com.amirasghari.musicplayer.databinding;
import com.amirasghari.musicplayer.R;
import com.amirasghari.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchRowBindingImpl extends SearchRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.musicCons, 1);
        sViewsWithIds.put(R.id.musicImgCard, 2);
        sViewsWithIds.put(R.id.musicImg, 3);
        sViewsWithIds.put(R.id.musicText, 4);
        sViewsWithIds.put(R.id.artistText, 5);
        sViewsWithIds.put(R.id.guid50Hor, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private SearchRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.musicCard.setTag(null);
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