package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* compiled from: ForegroundLinearLayout.java */
/* loaded from: classes2.dex */
public class h extends LinearLayoutCompat {

    /* renamed from: Q, reason: collision with root package name */
    private Drawable f36757Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f36758R;

    /* renamed from: S, reason: collision with root package name */
    private final Rect f36759S;

    /* renamed from: T, reason: collision with root package name */
    private int f36760T;

    /* renamed from: U, reason: collision with root package name */
    protected boolean f36761U;

    /* renamed from: V, reason: collision with root package name */
    boolean f36762V;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f36757Q;
        if (drawable != null) {
            if (this.f36762V) {
                this.f36762V = false;
                Rect rect = this.f36758R;
                Rect rect2 = this.f36759S;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f36761U) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f36760T, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f36757Q;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f36757Q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f36757Q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f36757Q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f36760T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f36757Q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36762V = z10 | this.f36762V;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f36762V = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f36757Q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f36757Q);
            }
            this.f36757Q = drawable;
            this.f36762V = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f36760T == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f36760T != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f36760T = i10;
            if (i10 == 119 && this.f36757Q != null) {
                this.f36757Q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f36757Q;
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36758R = new Rect();
        this.f36759S = new Rect();
        this.f36760T = 119;
        this.f36761U = true;
        this.f36762V = false;
        TypedArray typedArrayI = r.i(context, attributeSet, C7.m.f2703L2, i10, 0, new int[0]);
        this.f36760T = typedArrayI.getInt(C7.m.f2723N2, this.f36760T);
        Drawable drawable = typedArrayI.getDrawable(C7.m.f2713M2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f36761U = typedArrayI.getBoolean(C7.m.f2733O2, true);
        typedArrayI.recycle();
    }
}
