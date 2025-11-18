package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import com.google.android.material.internal.C8033k;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p285x.C8947c;
import p241e.p254e.p256b.p271c.p286y.C8951a;
import p241e.p254e.p256b.p271c.p286y.C8952b;

/* compiled from: MaterialButtonHelper.java */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes2.dex */
class C7974a {

    /* renamed from: a */
    private static final boolean f29914a;

    /* renamed from: b */
    private final MaterialButton f29915b;

    /* renamed from: c */
    private C8904k f29916c;

    /* renamed from: d */
    private int f29917d;

    /* renamed from: e */
    private int f29918e;

    /* renamed from: f */
    private int f29919f;

    /* renamed from: g */
    private int f29920g;

    /* renamed from: h */
    private int f29921h;

    /* renamed from: i */
    private int f29922i;

    /* renamed from: j */
    private PorterDuff.Mode f29923j;

    /* renamed from: k */
    private ColorStateList f29924k;

    /* renamed from: l */
    private ColorStateList f29925l;

    /* renamed from: m */
    private ColorStateList f29926m;

    /* renamed from: n */
    private Drawable f29927n;

    /* renamed from: o */
    private boolean f29928o = false;

    /* renamed from: p */
    private boolean f29929p = false;

    /* renamed from: q */
    private boolean f29930q = false;

    /* renamed from: r */
    private boolean f29931r;

    /* renamed from: s */
    private LayerDrawable f29932s;

    static {
        f29914a = Build.VERSION.SDK_INT >= 21;
    }

    C7974a(MaterialButton materialButton, C8904k c8904k) {
        this.f29915b = materialButton;
        this.f29916c = c8904k;
    }

    /* renamed from: A */
    private void m24034A(C8904k c8904k) {
        if (m24043d() != null) {
            m24043d().setShapeAppearanceModel(c8904k);
        }
        if (m24039l() != null) {
            m24039l().setShapeAppearanceModel(c8904k);
        }
        if (m24042c() != null) {
            m24042c().setShapeAppearanceModel(c8904k);
        }
    }

    /* renamed from: C */
    private void m24035C() {
        C8900g c8900gM24043d = m24043d();
        C8900g c8900gM24039l = m24039l();
        if (c8900gM24043d != null) {
            c8900gM24043d.m28292f0(this.f29922i, this.f29925l);
            if (c8900gM24039l != null) {
                c8900gM24039l.m28291e0(this.f29922i, this.f29928o ? C8937a.m28472c(this.f29915b, C8908b.f33825o) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m24036D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f29917d, this.f29919f, this.f29918e, this.f29920g);
    }

    /* renamed from: a */
    private Drawable m24037a() {
        C8900g c8900g = new C8900g(this.f29916c);
        c8900g.m28278N(this.f29915b.getContext());
        C0265a.m1818o(c8900g, this.f29924k);
        PorterDuff.Mode mode = this.f29923j;
        if (mode != null) {
            C0265a.m1819p(c8900g, mode);
        }
        c8900g.m28292f0(this.f29922i, this.f29925l);
        C8900g c8900g2 = new C8900g(this.f29916c);
        c8900g2.setTint(0);
        c8900g2.m28291e0(this.f29922i, this.f29928o ? C8937a.m28472c(this.f29915b, C8908b.f33825o) : 0);
        if (f29914a) {
            C8900g c8900g3 = new C8900g(this.f29916c);
            this.f29927n = c8900g3;
            C0265a.m1817n(c8900g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C8952b.m28522d(this.f29926m), m24036D(new LayerDrawable(new Drawable[]{c8900g2, c8900g})), this.f29927n);
            this.f29932s = rippleDrawable;
            return rippleDrawable;
        }
        C8951a c8951a = new C8951a(this.f29916c);
        this.f29927n = c8951a;
        C0265a.m1818o(c8951a, C8952b.m28522d(this.f29926m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c8900g2, c8900g, this.f29927n});
        this.f29932s = layerDrawable;
        return m24036D(layerDrawable);
    }

    /* renamed from: e */
    private C8900g m24038e(boolean z) {
        LayerDrawable layerDrawable = this.f29932s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f29914a ? (C8900g) ((LayerDrawable) ((InsetDrawable) this.f29932s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (C8900g) this.f29932s.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: l */
    private C8900g m24039l() {
        return m24038e(true);
    }

    /* renamed from: B */
    void m24040B(int i2, int i3) {
        Drawable drawable = this.f29927n;
        if (drawable != null) {
            drawable.setBounds(this.f29917d, this.f29919f, i3 - this.f29918e, i2 - this.f29920g);
        }
    }

    /* renamed from: b */
    int m24041b() {
        return this.f29921h;
    }

    /* renamed from: c */
    public InterfaceC8907n m24042c() {
        LayerDrawable layerDrawable = this.f29932s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f29932s.getNumberOfLayers() > 2 ? (InterfaceC8907n) this.f29932s.getDrawable(2) : (InterfaceC8907n) this.f29932s.getDrawable(1);
    }

    /* renamed from: d */
    C8900g m24043d() {
        return m24038e(false);
    }

    /* renamed from: f */
    ColorStateList m24044f() {
        return this.f29926m;
    }

    /* renamed from: g */
    C8904k m24045g() {
        return this.f29916c;
    }

    /* renamed from: h */
    ColorStateList m24046h() {
        return this.f29925l;
    }

    /* renamed from: i */
    int m24047i() {
        return this.f29922i;
    }

    /* renamed from: j */
    ColorStateList m24048j() {
        return this.f29924k;
    }

    /* renamed from: k */
    PorterDuff.Mode m24049k() {
        return this.f29923j;
    }

    /* renamed from: m */
    boolean m24050m() {
        return this.f29929p;
    }

    /* renamed from: n */
    boolean m24051n() {
        return this.f29931r;
    }

    /* renamed from: o */
    void m24052o(TypedArray typedArray) {
        this.f29917d = typedArray.getDimensionPixelOffset(C8918l.f34338v2, 0);
        this.f29918e = typedArray.getDimensionPixelOffset(C8918l.f34345w2, 0);
        this.f29919f = typedArray.getDimensionPixelOffset(C8918l.f34352x2, 0);
        this.f29920g = typedArray.getDimensionPixelOffset(C8918l.f34359y2, 0);
        int i2 = C8918l.f34017C2;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f29921h = dimensionPixelSize;
            m24058u(this.f29916c.m28335w(dimensionPixelSize));
            this.f29930q = true;
        }
        this.f29922i = typedArray.getDimensionPixelSize(C8918l.f34087M2, 0);
        this.f29923j = C8033k.m24700e(typedArray.getInt(C8918l.f34010B2, -1), PorterDuff.Mode.SRC_IN);
        this.f29924k = C8947c.m28499a(this.f29915b.getContext(), typedArray, C8918l.f34003A2);
        this.f29925l = C8947c.m28499a(this.f29915b.getContext(), typedArray, C8918l.f34080L2);
        this.f29926m = C8947c.m28499a(this.f29915b.getContext(), typedArray, C8918l.f34073K2);
        this.f29931r = typedArray.getBoolean(C8918l.f34366z2, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C8918l.f34024D2, 0);
        int iM2090D = C0311u.m2090D(this.f29915b);
        int paddingTop = this.f29915b.getPaddingTop();
        int iM2088C = C0311u.m2088C(this.f29915b);
        int paddingBottom = this.f29915b.getPaddingBottom();
        if (typedArray.hasValue(C8918l.f34331u2)) {
            m24054q();
        } else {
            this.f29915b.setInternalBackground(m24037a());
            C8900g c8900gM24043d = m24043d();
            if (c8900gM24043d != null) {
                c8900gM24043d.m28283W(dimensionPixelSize2);
            }
        }
        C0311u.m2159w0(this.f29915b, iM2090D + this.f29917d, paddingTop + this.f29919f, iM2088C + this.f29918e, paddingBottom + this.f29920g);
    }

    /* renamed from: p */
    void m24053p(int i2) {
        if (m24043d() != null) {
            m24043d().setTint(i2);
        }
    }

    /* renamed from: q */
    void m24054q() {
        this.f29929p = true;
        this.f29915b.setSupportBackgroundTintList(this.f29924k);
        this.f29915b.setSupportBackgroundTintMode(this.f29923j);
    }

    /* renamed from: r */
    void m24055r(boolean z) {
        this.f29931r = z;
    }

    /* renamed from: s */
    void m24056s(int i2) {
        if (this.f29930q && this.f29921h == i2) {
            return;
        }
        this.f29921h = i2;
        this.f29930q = true;
        m24058u(this.f29916c.m28335w(i2));
    }

    /* renamed from: t */
    void m24057t(ColorStateList colorStateList) {
        if (this.f29926m != colorStateList) {
            this.f29926m = colorStateList;
            boolean z = f29914a;
            if (z && (this.f29915b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f29915b.getBackground()).setColor(C8952b.m28522d(colorStateList));
            } else {
                if (z || !(this.f29915b.getBackground() instanceof C8951a)) {
                    return;
                }
                ((C8951a) this.f29915b.getBackground()).setTintList(C8952b.m28522d(colorStateList));
            }
        }
    }

    /* renamed from: u */
    void m24058u(C8904k c8904k) {
        this.f29916c = c8904k;
        m24034A(c8904k);
    }

    /* renamed from: v */
    void m24059v(boolean z) {
        this.f29928o = z;
        m24035C();
    }

    /* renamed from: w */
    void m24060w(ColorStateList colorStateList) {
        if (this.f29925l != colorStateList) {
            this.f29925l = colorStateList;
            m24035C();
        }
    }

    /* renamed from: x */
    void m24061x(int i2) {
        if (this.f29922i != i2) {
            this.f29922i = i2;
            m24035C();
        }
    }

    /* renamed from: y */
    void m24062y(ColorStateList colorStateList) {
        if (this.f29924k != colorStateList) {
            this.f29924k = colorStateList;
            if (m24043d() != null) {
                C0265a.m1818o(m24043d(), this.f29924k);
            }
        }
    }

    /* renamed from: z */
    void m24063z(PorterDuff.Mode mode) {
        if (this.f29923j != mode) {
            this.f29923j = mode;
            if (m24043d() == null || this.f29923j == null) {
                return;
            }
            C0265a.m1819p(m24043d(), this.f29923j);
        }
    }
}
