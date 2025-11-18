package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.c {

    /* renamed from: K, reason: collision with root package name */
    private boolean f23833K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f23834L;

    /* renamed from: M, reason: collision with root package name */
    private float f23835M;

    /* renamed from: N, reason: collision with root package name */
    protected View[] f23836N;

    public float getProgress() {
        return this.f23835M;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f24239B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.i.f24255D6) {
                    this.f23833K = typedArrayObtainStyledAttributes.getBoolean(index, this.f23833K);
                } else if (index == androidx.constraintlayout.widget.i.f24247C6) {
                    this.f23834L = typedArrayObtainStyledAttributes.getBoolean(index, this.f23834L);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f23835M = f10;
        int i10 = 0;
        if (this.f24049C > 0) {
            this.f23836N = l((ConstraintLayout) getParent());
            while (i10 < this.f24049C) {
                x(this.f23836N[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f23834L;
    }

    public boolean v() {
        return this.f23833K;
    }

    public void w(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void c(j jVar, int i10) {
    }

    public void x(View view, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void b(j jVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void a(j jVar, int i10, int i11, float f10) {
    }
}
