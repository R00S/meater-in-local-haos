package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0157c0;
import p241e.p254e.p256b.p271c.C8918l;

/* compiled from: ForegroundLinearLayout.java */
/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes2.dex */
public class C8026d extends C0157c0 {

    /* renamed from: u */
    private Drawable f30386u;

    /* renamed from: v */
    private final Rect f30387v;

    /* renamed from: w */
    private final Rect f30388w;

    /* renamed from: x */
    private int f30389x;

    /* renamed from: y */
    protected boolean f30390y;

    /* renamed from: z */
    boolean f30391z;

    public C8026d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f30386u;
        if (drawable != null) {
            if (this.f30391z) {
                this.f30391z = false;
                Rect rect = this.f30387v;
                Rect rect2 = this.f30388w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f30390y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f30389x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f30386u;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f30386u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f30386u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f30386u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f30389x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f30386u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f30391z = z | this.f30391z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f30391z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f30386u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f30386u);
            }
            this.f30386u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f30389x == 119) {
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
    public void setForegroundGravity(int i2) {
        if (this.f30389x != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f30389x = i2;
            if (i2 == 119 && this.f30386u != null) {
                this.f30386u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f30386u;
    }

    public C8026d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30387v = new Rect();
        this.f30388w = new Rect();
        this.f30389x = 119;
        this.f30390y = true;
        this.f30391z = false;
        TypedArray typedArrayM24694h = C8032j.m24694h(context, attributeSet, C8918l.f34225f2, i2, 0, new int[0]);
        this.f30389x = typedArrayM24694h.getInt(C8918l.f34240h2, this.f30389x);
        Drawable drawable = typedArrayM24694h.getDrawable(C8918l.f34233g2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f30390y = typedArrayM24694h.getBoolean(C8918l.f34247i2, true);
        typedArrayM24694h.recycle();
    }
}
