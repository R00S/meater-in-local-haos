package androidx.constraintlayout.widget;

import a1.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: K, reason: collision with root package name */
    private boolean f24658K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f24659L;

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f24393V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24452c1) {
                    this.f24658K = true;
                } else if (index == i.f24515j1) {
                    this.f24659L = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (this.f24658K || this.f24659L) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f24049C; i10++) {
                    View viewQ = constraintLayout.q(this.f24048B[i10]);
                    if (viewQ != null) {
                        if (this.f24658K) {
                            viewQ.setVisibility(visibility);
                        }
                        if (this.f24659L && elevation > 0.0f) {
                            viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(l lVar, int i10, int i11) {
    }
}
