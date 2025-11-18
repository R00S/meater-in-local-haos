package com.google.android.material.button;

import C7.c;
import C7.m;
import V7.b;
import X7.g;
import X7.k;
import X7.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.u;
import k1.C3784a;
import s1.X;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f36148u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f36149v = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f36150a;

    /* renamed from: b, reason: collision with root package name */
    private k f36151b;

    /* renamed from: c, reason: collision with root package name */
    private int f36152c;

    /* renamed from: d, reason: collision with root package name */
    private int f36153d;

    /* renamed from: e, reason: collision with root package name */
    private int f36154e;

    /* renamed from: f, reason: collision with root package name */
    private int f36155f;

    /* renamed from: g, reason: collision with root package name */
    private int f36156g;

    /* renamed from: h, reason: collision with root package name */
    private int f36157h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f36158i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f36159j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f36160k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f36161l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f36162m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36166q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f36168s;

    /* renamed from: t, reason: collision with root package name */
    private int f36169t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36163n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36164o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f36165p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f36167r = true;

    a(MaterialButton materialButton, k kVar) {
        this.f36150a = materialButton;
        this.f36151b = kVar;
    }

    private void G(int i10, int i11) {
        int iE = X.E(this.f36150a);
        int paddingTop = this.f36150a.getPaddingTop();
        int iD = X.D(this.f36150a);
        int paddingBottom = this.f36150a.getPaddingBottom();
        int i12 = this.f36154e;
        int i13 = this.f36155f;
        this.f36155f = i11;
        this.f36154e = i10;
        if (!this.f36164o) {
            H();
        }
        X.C0(this.f36150a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f36150a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.a0(this.f36169t);
            gVarF.setState(this.f36150a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (f36149v && !this.f36164o) {
            int iE = X.E(this.f36150a);
            int paddingTop = this.f36150a.getPaddingTop();
            int iD = X.D(this.f36150a);
            int paddingBottom = this.f36150a.getPaddingBottom();
            H();
            X.C0(this.f36150a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.i0(this.f36157h, this.f36160k);
            if (gVarN != null) {
                gVarN.h0(this.f36157h, this.f36163n ? M7.a.d(this.f36150a, c.f2331p) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f36152c, this.f36154e, this.f36153d, this.f36155f);
    }

    private Drawable a() {
        g gVar = new g(this.f36151b);
        gVar.Q(this.f36150a.getContext());
        C3784a.o(gVar, this.f36159j);
        PorterDuff.Mode mode = this.f36158i;
        if (mode != null) {
            C3784a.p(gVar, mode);
        }
        gVar.i0(this.f36157h, this.f36160k);
        g gVar2 = new g(this.f36151b);
        gVar2.setTint(0);
        gVar2.h0(this.f36157h, this.f36163n ? M7.a.d(this.f36150a, c.f2331p) : 0);
        if (f36148u) {
            g gVar3 = new g(this.f36151b);
            this.f36162m = gVar3;
            C3784a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.d(this.f36161l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f36162m);
            this.f36168s = rippleDrawable;
            return rippleDrawable;
        }
        V7.a aVar = new V7.a(this.f36151b);
        this.f36162m = aVar;
        C3784a.o(aVar, b.d(this.f36161l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f36162m});
        this.f36168s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f36168s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f36148u ? (g) ((LayerDrawable) ((InsetDrawable) this.f36168s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f36168s.getDrawable(!z10 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(boolean z10) {
        this.f36163n = z10;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f36160k != colorStateList) {
            this.f36160k = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f36157h != i10) {
            this.f36157h = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f36159j != colorStateList) {
            this.f36159j = colorStateList;
            if (f() != null) {
                C3784a.o(f(), this.f36159j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f36158i != mode) {
            this.f36158i = mode;
            if (f() == null || this.f36158i == null) {
                return;
            }
            C3784a.p(f(), this.f36158i);
        }
    }

    void F(boolean z10) {
        this.f36167r = z10;
    }

    int b() {
        return this.f36156g;
    }

    public int c() {
        return this.f36155f;
    }

    public int d() {
        return this.f36154e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f36168s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f36168s.getNumberOfLayers() > 2 ? (n) this.f36168s.getDrawable(2) : (n) this.f36168s.getDrawable(1);
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f36161l;
    }

    k i() {
        return this.f36151b;
    }

    ColorStateList j() {
        return this.f36160k;
    }

    int k() {
        return this.f36157h;
    }

    ColorStateList l() {
        return this.f36159j;
    }

    PorterDuff.Mode m() {
        return this.f36158i;
    }

    boolean o() {
        return this.f36164o;
    }

    boolean p() {
        return this.f36166q;
    }

    boolean q() {
        return this.f36167r;
    }

    void r(TypedArray typedArray) {
        this.f36152c = typedArray.getDimensionPixelOffset(m.f3074u3, 0);
        this.f36153d = typedArray.getDimensionPixelOffset(m.f3085v3, 0);
        this.f36154e = typedArray.getDimensionPixelOffset(m.f3095w3, 0);
        this.f36155f = typedArray.getDimensionPixelOffset(m.f3105x3, 0);
        int i10 = m.f2604B3;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f36156g = dimensionPixelSize;
            z(this.f36151b.w(dimensionPixelSize));
            this.f36165p = true;
        }
        this.f36157h = typedArray.getDimensionPixelSize(m.f2704L3, 0);
        this.f36158i = u.i(typedArray.getInt(m.f2594A3, -1), PorterDuff.Mode.SRC_IN);
        this.f36159j = U7.c.a(this.f36150a.getContext(), typedArray, m.f3125z3);
        this.f36160k = U7.c.a(this.f36150a.getContext(), typedArray, m.f2694K3);
        this.f36161l = U7.c.a(this.f36150a.getContext(), typedArray, m.f2684J3);
        this.f36166q = typedArray.getBoolean(m.f3115y3, false);
        this.f36169t = typedArray.getDimensionPixelSize(m.f2614C3, 0);
        this.f36167r = typedArray.getBoolean(m.f2714M3, true);
        int iE = X.E(this.f36150a);
        int paddingTop = this.f36150a.getPaddingTop();
        int iD = X.D(this.f36150a);
        int paddingBottom = this.f36150a.getPaddingBottom();
        if (typedArray.hasValue(m.f3063t3)) {
            t();
        } else {
            H();
        }
        X.C0(this.f36150a, iE + this.f36152c, paddingTop + this.f36154e, iD + this.f36153d, paddingBottom + this.f36155f);
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void t() {
        this.f36164o = true;
        this.f36150a.setSupportBackgroundTintList(this.f36159j);
        this.f36150a.setSupportBackgroundTintMode(this.f36158i);
    }

    void u(boolean z10) {
        this.f36166q = z10;
    }

    void v(int i10) {
        if (this.f36165p && this.f36156g == i10) {
            return;
        }
        this.f36156g = i10;
        this.f36165p = true;
        z(this.f36151b.w(i10));
    }

    public void w(int i10) {
        G(this.f36154e, i10);
    }

    public void x(int i10) {
        G(i10, this.f36155f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f36161l != colorStateList) {
            this.f36161l = colorStateList;
            boolean z10 = f36148u;
            if (z10 && (this.f36150a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f36150a.getBackground()).setColor(b.d(colorStateList));
            } else {
                if (z10 || !(this.f36150a.getBackground() instanceof V7.a)) {
                    return;
                }
                ((V7.a) this.f36150a.getBackground()).setTintList(b.d(colorStateList));
            }
        }
    }

    void z(k kVar) {
        this.f36151b = kVar;
        I(kVar);
    }
}
