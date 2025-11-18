package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0311u;
import p024c.p025a.C0832j;

/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
class C0158d {

    /* renamed from: a */
    private final View f1064a;

    /* renamed from: d */
    private C0181o0 f1067d;

    /* renamed from: e */
    private C0181o0 f1068e;

    /* renamed from: f */
    private C0181o0 f1069f;

    /* renamed from: c */
    private int f1066c = -1;

    /* renamed from: b */
    private final C0166h f1065b = C0166h.m1008b();

    C0158d(View view) {
        this.f1064a = view;
    }

    /* renamed from: a */
    private boolean m916a(Drawable drawable) {
        if (this.f1069f == null) {
            this.f1069f = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1069f;
        c0181o0.m1083a();
        ColorStateList colorStateListM2144p = C0311u.m2144p(this.f1064a);
        if (colorStateListM2144p != null) {
            c0181o0.f1230d = true;
            c0181o0.f1227a = colorStateListM2144p;
        }
        PorterDuff.Mode modeM2146q = C0311u.m2146q(this.f1064a);
        if (modeM2146q != null) {
            c0181o0.f1229c = true;
            c0181o0.f1228b = modeM2146q;
        }
        if (!c0181o0.f1230d && !c0181o0.f1229c) {
            return false;
        }
        C0166h.m1011i(drawable, c0181o0, this.f1064a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m917k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f1067d != null : i2 == 21;
    }

    /* renamed from: b */
    void m918b() {
        Drawable background = this.f1064a.getBackground();
        if (background != null) {
            if (m917k() && m916a(background)) {
                return;
            }
            C0181o0 c0181o0 = this.f1068e;
            if (c0181o0 != null) {
                C0166h.m1011i(background, c0181o0, this.f1064a.getDrawableState());
                return;
            }
            C0181o0 c0181o02 = this.f1067d;
            if (c0181o02 != null) {
                C0166h.m1011i(background, c0181o02, this.f1064a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    ColorStateList m919c() {
        C0181o0 c0181o0 = this.f1068e;
        if (c0181o0 != null) {
            return c0181o0.f1227a;
        }
        return null;
    }

    /* renamed from: d */
    PorterDuff.Mode m920d() {
        C0181o0 c0181o0 = this.f1068e;
        if (c0181o0 != null) {
            return c0181o0.f1228b;
        }
        return null;
    }

    /* renamed from: e */
    void m921e(AttributeSet attributeSet, int i2) {
        Context context = this.f1064a.getContext();
        int[] iArr = C0832j.f5288R3;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        View view = this.f1064a;
        C0311u.m2127g0(view, view.getContext(), iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        try {
            int i3 = C0832j.f5293S3;
            if (c0185q0M1091v.m1110s(i3)) {
                this.f1066c = c0185q0M1091v.m1105n(i3, -1);
                ColorStateList colorStateListM1014f = this.f1065b.m1014f(this.f1064a.getContext(), this.f1066c);
                if (colorStateListM1014f != null) {
                    m924h(colorStateListM1014f);
                }
            }
            int i4 = C0832j.f5298T3;
            if (c0185q0M1091v.m1110s(i4)) {
                C0311u.m2141n0(this.f1064a, c0185q0M1091v.m1094c(i4));
            }
            int i5 = C0832j.f5303U3;
            if (c0185q0M1091v.m1110s(i5)) {
                C0311u.m2143o0(this.f1064a, C0200y.m1238e(c0185q0M1091v.m1102k(i5, -1), null));
            }
        } finally {
            c0185q0M1091v.m1111w();
        }
    }

    /* renamed from: f */
    void m922f(Drawable drawable) {
        this.f1066c = -1;
        m924h(null);
        m918b();
    }

    /* renamed from: g */
    void m923g(int i2) {
        this.f1066c = i2;
        C0166h c0166h = this.f1065b;
        m924h(c0166h != null ? c0166h.m1014f(this.f1064a.getContext(), i2) : null);
        m918b();
    }

    /* renamed from: h */
    void m924h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1067d == null) {
                this.f1067d = new C0181o0();
            }
            C0181o0 c0181o0 = this.f1067d;
            c0181o0.f1227a = colorStateList;
            c0181o0.f1230d = true;
        } else {
            this.f1067d = null;
        }
        m918b();
    }

    /* renamed from: i */
    void m925i(ColorStateList colorStateList) {
        if (this.f1068e == null) {
            this.f1068e = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1068e;
        c0181o0.f1227a = colorStateList;
        c0181o0.f1230d = true;
        m918b();
    }

    /* renamed from: j */
    void m926j(PorterDuff.Mode mode) {
        if (this.f1068e == null) {
            this.f1068e = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1068e;
        c0181o0.f1228b = mode;
        c0181o0.f1229c = true;
        m918b();
    }
}
