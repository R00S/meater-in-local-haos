package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
public abstract class AbstractC0636q extends RecyclerView.AbstractC0599l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.AbstractC0590c0 abstractC0590c0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l
    public boolean animateAppearance(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2) {
        int i2;
        int i3;
        return (cVar == null || ((i2 = cVar.f3953a) == (i3 = cVar2.f3953a) && cVar.f3954b == cVar2.f3954b)) ? animateAdd(abstractC0590c0) : animateMove(abstractC0590c0, i2, cVar.f3954b, i3, cVar2.f3954b);
    }

    public abstract boolean animateChange(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0590c0 abstractC0590c02, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l
    public boolean animateChange(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0590c0 abstractC0590c02, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f3953a;
        int i5 = cVar.f3954b;
        if (abstractC0590c02.shouldIgnore()) {
            int i6 = cVar.f3953a;
            i3 = cVar.f3954b;
            i2 = i6;
        } else {
            i2 = cVar2.f3953a;
            i3 = cVar2.f3954b;
        }
        return animateChange(abstractC0590c0, abstractC0590c02, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l
    public boolean animateDisappearance(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2) {
        int i2 = cVar.f3953a;
        int i3 = cVar.f3954b;
        View view = abstractC0590c0.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3953a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3954b;
        if (abstractC0590c0.isRemoved() || (i2 == left && i3 == top)) {
            return animateRemove(abstractC0590c0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(abstractC0590c0, i2, i3, left, top);
    }

    public abstract boolean animateMove(RecyclerView.AbstractC0590c0 abstractC0590c0, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l
    public boolean animatePersistence(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2) {
        int i2 = cVar.f3953a;
        int i3 = cVar2.f3953a;
        if (i2 != i3 || cVar.f3954b != cVar2.f3954b) {
            return animateMove(abstractC0590c0, i2, cVar.f3954b, i3, cVar2.f3954b);
        }
        dispatchMoveFinished(abstractC0590c0);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.AbstractC0590c0 abstractC0590c0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l
    public boolean canReuseUpdatedViewHolder(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        return !this.mSupportsChangeAnimations || abstractC0590c0.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onAddFinished(abstractC0590c0);
        dispatchAnimationFinished(abstractC0590c0);
    }

    public final void dispatchAddStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onAddStarting(abstractC0590c0);
    }

    public final void dispatchChangeFinished(RecyclerView.AbstractC0590c0 abstractC0590c0, boolean z) {
        onChangeFinished(abstractC0590c0, z);
        dispatchAnimationFinished(abstractC0590c0);
    }

    public final void dispatchChangeStarting(RecyclerView.AbstractC0590c0 abstractC0590c0, boolean z) {
        onChangeStarting(abstractC0590c0, z);
    }

    public final void dispatchMoveFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onMoveFinished(abstractC0590c0);
        dispatchAnimationFinished(abstractC0590c0);
    }

    public final void dispatchMoveStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onMoveStarting(abstractC0590c0);
    }

    public final void dispatchRemoveFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onRemoveFinished(abstractC0590c0);
        dispatchAnimationFinished(abstractC0590c0);
    }

    public final void dispatchRemoveStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        onRemoveStarting(abstractC0590c0);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void onAddStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void onChangeFinished(RecyclerView.AbstractC0590c0 abstractC0590c0, boolean z) {
    }

    public void onChangeStarting(RecyclerView.AbstractC0590c0 abstractC0590c0, boolean z) {
    }

    public void onMoveFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void onMoveStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void onRemoveFinished(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void onRemoveStarting(RecyclerView.AbstractC0590c0 abstractC0590c0) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
