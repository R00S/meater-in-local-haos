package androidx.constraintlayout.widget;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p024c.p044g.p048b.p049k.C0898k;

/* compiled from: VirtualLayout.java */
/* renamed from: androidx.constraintlayout.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC0222j extends AbstractC0214b {

    /* renamed from: o */
    private boolean f1973o;

    /* renamed from: p */
    private boolean f1974p;

    @Override // androidx.constraintlayout.widget.AbstractC0214b
    /* renamed from: h */
    protected void mo1311h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo1311h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0221i.f1809a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1823c1) {
                    this.f1973o = true;
                } else if (index == C0221i.f1858h1) {
                    this.f1974p = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void m1395o(C0898k c0898k, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0214b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1973o || this.f1974p) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i2 = 0; i2 < this.f1510g; i2++) {
                View viewM1325h = constraintLayout.m1325h(this.f1509f[i2]);
                if (viewM1325h != null) {
                    if (this.f1973o) {
                        viewM1325h.setVisibility(visibility);
                    }
                    if (this.f1974p && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewM1325h.setTranslationZ(viewM1325h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m1348d();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        m1348d();
    }
}
