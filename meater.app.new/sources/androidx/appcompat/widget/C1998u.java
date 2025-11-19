package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import k1.C3784a;

/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1998u extends C1995q {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f21738d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f21739e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f21740f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f21741g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21742h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21743i;

    C1998u(SeekBar seekBar) {
        super(seekBar);
        this.f21740f = null;
        this.f21741g = null;
        this.f21742h = false;
        this.f21743i = false;
        this.f21738d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f21739e;
        if (drawable != null) {
            if (this.f21742h || this.f21743i) {
                Drawable drawableR = C3784a.r(drawable.mutate());
                this.f21739e = drawableR;
                if (this.f21742h) {
                    C3784a.o(drawableR, this.f21740f);
                }
                if (this.f21743i) {
                    C3784a.p(this.f21739e, this.f21741g);
                }
                if (this.f21739e.isStateful()) {
                    this.f21739e.setState(this.f21738d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1995q
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f21738d.getContext();
        int[] iArr = i.j.f42656T;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f21738d;
        s1.X.l0(seekBar, seekBar.getContext(), iArr, attributeSet, a0VarV.r(), i10, 0);
        Drawable drawableH = a0VarV.h(i.j.f42660U);
        if (drawableH != null) {
            this.f21738d.setThumb(drawableH);
        }
        j(a0VarV.g(i.j.f42664V));
        int i11 = i.j.f42672X;
        if (a0VarV.s(i11)) {
            this.f21741g = I.e(a0VarV.k(i11, -1), this.f21741g);
            this.f21743i = true;
        }
        int i12 = i.j.f42668W;
        if (a0VarV.s(i12)) {
            this.f21740f = a0VarV.c(i12);
            this.f21742h = true;
        }
        a0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f21739e != null) {
            int max = this.f21738d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f21739e.getIntrinsicWidth();
                int intrinsicHeight = this.f21739e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f21739e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f21738d.getWidth() - this.f21738d.getPaddingLeft()) - this.f21738d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f21738d.getPaddingLeft(), this.f21738d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f21739e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f21739e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f21738d.getDrawableState())) {
            this.f21738d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f21739e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f21739e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21739e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f21738d);
            C3784a.m(drawable, this.f21738d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f21738d.getDrawableState());
            }
            f();
        }
        this.f21738d.invalidate();
    }
}
