package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0832j;

/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0184q extends C0180o {

    /* renamed from: d */
    private final SeekBar f1233d;

    /* renamed from: e */
    private Drawable f1234e;

    /* renamed from: f */
    private ColorStateList f1235f;

    /* renamed from: g */
    private PorterDuff.Mode f1236g;

    /* renamed from: h */
    private boolean f1237h;

    /* renamed from: i */
    private boolean f1238i;

    C0184q(SeekBar seekBar) {
        super(seekBar);
        this.f1235f = null;
        this.f1236g = null;
        this.f1237h = false;
        this.f1238i = false;
        this.f1233d = seekBar;
    }

    /* renamed from: f */
    private void m1084f() {
        Drawable drawable = this.f1234e;
        if (drawable != null) {
            if (this.f1237h || this.f1238i) {
                Drawable drawableM1821r = C0265a.m1821r(drawable.mutate());
                this.f1234e = drawableM1821r;
                if (this.f1237h) {
                    C0265a.m1818o(drawableM1821r, this.f1235f);
                }
                if (this.f1238i) {
                    C0265a.m1819p(this.f1234e, this.f1236g);
                }
                if (this.f1234e.isStateful()) {
                    this.f1234e.setState(this.f1233d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0180o
    /* renamed from: c */
    void mo1082c(AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.mo1082c(attributeSet, i2);
        Context context = this.f1233d.getContext();
        int[] iArr = C0832j.f5304V;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1233d;
        C0311u.m2127g0(seekBar, seekBar.getContext(), iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        Drawable drawableM1099h = c0185q0M1091v.m1099h(C0832j.f5309W);
        if (drawableM1099h != null) {
            this.f1233d.setThumb(drawableM1099h);
        }
        m1088j(c0185q0M1091v.m1098g(C0832j.f5314X));
        int i3 = C0832j.f5324Z;
        if (c0185q0M1091v.m1110s(i3)) {
            this.f1236g = C0200y.m1238e(c0185q0M1091v.m1102k(i3, -1), this.f1236g);
            this.f1238i = true;
        }
        int i4 = C0832j.f5319Y;
        if (c0185q0M1091v.m1110s(i4)) {
            this.f1235f = c0185q0M1091v.m1094c(i4);
            this.f1237h = true;
        }
        c0185q0M1091v.m1111w();
        m1084f();
    }

    /* renamed from: g */
    void m1085g(Canvas canvas) {
        if (this.f1234e != null) {
            int max = this.f1233d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1234e.getIntrinsicWidth();
                int intrinsicHeight = this.f1234e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1234e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1233d.getWidth() - this.f1233d.getPaddingLeft()) - this.f1233d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1233d.getPaddingLeft(), this.f1233d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1234e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* renamed from: h */
    void m1086h() {
        Drawable drawable = this.f1234e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1233d.getDrawableState())) {
            this.f1233d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    void m1087i() {
        Drawable drawable = this.f1234e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m1088j(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1234e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1234e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1233d);
            C0265a.m1816m(drawable, C0311u.m2162y(this.f1233d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1233d.getDrawableState());
            }
            m1084f();
        }
        this.f1233d.invalidate();
    }
}
