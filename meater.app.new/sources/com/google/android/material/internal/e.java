package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: FadeThroughDrawable.java */
/* loaded from: classes2.dex */
public class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f36749a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f36750b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f36751c;

    /* renamed from: d, reason: collision with root package name */
    private float f36752d;

    public void a(float f10) {
        if (this.f36752d != f10) {
            this.f36752d = f10;
            f.a(f10, this.f36751c);
            this.f36749a.setAlpha((int) (this.f36751c[0] * 255.0f));
            this.f36750b.setAlpha((int) (this.f36751c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f36749a.draw(canvas);
        this.f36750b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f36749a.getIntrinsicHeight(), this.f36750b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f36749a.getIntrinsicWidth(), this.f36750b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f36749a.getMinimumHeight(), this.f36750b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f36749a.getMinimumWidth(), this.f36750b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f36749a.isStateful() || this.f36750b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f36752d <= 0.5f) {
            this.f36749a.setAlpha(i10);
            this.f36750b.setAlpha(0);
        } else {
            this.f36749a.setAlpha(0);
            this.f36750b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f36749a.setBounds(i10, i11, i12, i13);
        this.f36750b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36749a.setColorFilter(colorFilter);
        this.f36750b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f36749a.setState(iArr) || this.f36750b.setState(iArr);
    }
}
