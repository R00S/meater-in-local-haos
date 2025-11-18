package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.core.widget.C0324e;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
class C0164g {

    /* renamed from: a */
    private final CompoundButton f1123a;

    /* renamed from: b */
    private ColorStateList f1124b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1125c = null;

    /* renamed from: d */
    private boolean f1126d = false;

    /* renamed from: e */
    private boolean f1127e = false;

    /* renamed from: f */
    private boolean f1128f;

    C0164g(CompoundButton compoundButton) {
        this.f1123a = compoundButton;
    }

    /* renamed from: a */
    void m966a() throws NoSuchFieldException {
        Drawable drawableM2306a = C0324e.m2306a(this.f1123a);
        if (drawableM2306a != null) {
            if (this.f1126d || this.f1127e) {
                Drawable drawableMutate = C0265a.m1821r(drawableM2306a).mutate();
                if (this.f1126d) {
                    C0265a.m1818o(drawableMutate, this.f1124b);
                }
                if (this.f1127e) {
                    C0265a.m1819p(drawableMutate, this.f1125c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1123a.getDrawableState());
                }
                this.f1123a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    int m967b(int i2) {
        Drawable drawableM2306a;
        return (Build.VERSION.SDK_INT >= 17 || (drawableM2306a = C0324e.m2306a(this.f1123a)) == null) ? i2 : i2 + drawableM2306a.getIntrinsicWidth();
    }

    /* renamed from: c */
    ColorStateList m968c() {
        return this.f1124b;
    }

    /* renamed from: d */
    PorterDuff.Mode m969d() {
        return this.f1125c;
    }

    /* renamed from: e */
    void m970e(AttributeSet attributeSet, int i2) {
        boolean z;
        int iM1105n;
        int iM1105n2;
        Context context = this.f1123a.getContext();
        int[] iArr = C0832j.f5285R0;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.f1123a;
        C0311u.m2127g0(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        try {
            int i3 = C0832j.f5295T0;
            if (!c0185q0M1091v.m1110s(i3) || (iM1105n2 = c0185q0M1091v.m1105n(i3, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1123a;
                    compoundButton2.setButtonDrawable(C0833a.m5262d(compoundButton2.getContext(), iM1105n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z) {
                int i4 = C0832j.f5290S0;
                if (c0185q0M1091v.m1110s(i4) && (iM1105n = c0185q0M1091v.m1105n(i4, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1123a;
                    compoundButton3.setButtonDrawable(C0833a.m5262d(compoundButton3.getContext(), iM1105n));
                }
            }
            int i5 = C0832j.f5300U0;
            if (c0185q0M1091v.m1110s(i5)) {
                C0324e.m2308c(this.f1123a, c0185q0M1091v.m1094c(i5));
            }
            int i6 = C0832j.f5305V0;
            if (c0185q0M1091v.m1110s(i6)) {
                C0324e.m2309d(this.f1123a, C0200y.m1238e(c0185q0M1091v.m1102k(i6, -1), null));
            }
        } finally {
            c0185q0M1091v.m1111w();
        }
    }

    /* renamed from: f */
    void m971f() throws NoSuchFieldException {
        if (this.f1128f) {
            this.f1128f = false;
        } else {
            this.f1128f = true;
            m966a();
        }
    }

    /* renamed from: g */
    void m972g(ColorStateList colorStateList) throws NoSuchFieldException {
        this.f1124b = colorStateList;
        this.f1126d = true;
        m966a();
    }

    /* renamed from: h */
    void m973h(PorterDuff.Mode mode) throws NoSuchFieldException {
        this.f1125c = mode;
        this.f1127e = true;
        m966a();
    }
}
