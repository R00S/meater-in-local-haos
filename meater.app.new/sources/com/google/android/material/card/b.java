package com.google.android.material.card;

import C7.c;
import C7.l;
import C7.m;
import R7.i;
import X7.d;
import X7.e;
import X7.g;
import X7.j;
import X7.k;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import k1.C3784a;
import s1.X;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes2.dex */
class b {

    /* renamed from: A, reason: collision with root package name */
    private static final Drawable f36179A;

    /* renamed from: z, reason: collision with root package name */
    private static final double f36180z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f36181a;

    /* renamed from: c, reason: collision with root package name */
    private final g f36183c;

    /* renamed from: d, reason: collision with root package name */
    private final g f36184d;

    /* renamed from: e, reason: collision with root package name */
    private int f36185e;

    /* renamed from: f, reason: collision with root package name */
    private int f36186f;

    /* renamed from: g, reason: collision with root package name */
    private int f36187g;

    /* renamed from: h, reason: collision with root package name */
    private int f36188h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f36189i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f36190j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f36191k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f36192l;

    /* renamed from: m, reason: collision with root package name */
    private k f36193m;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f36194n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f36195o;

    /* renamed from: p, reason: collision with root package name */
    private LayerDrawable f36196p;

    /* renamed from: q, reason: collision with root package name */
    private g f36197q;

    /* renamed from: r, reason: collision with root package name */
    private g f36198r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f36200t;

    /* renamed from: u, reason: collision with root package name */
    private ValueAnimator f36201u;

    /* renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f36202v;

    /* renamed from: w, reason: collision with root package name */
    private final int f36203w;

    /* renamed from: x, reason: collision with root package name */
    private final int f36204x;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f36182b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    private boolean f36199s = false;

    /* renamed from: y, reason: collision with root package name */
    private float f36205y = 0.0f;

    /* compiled from: MaterialCardViewHelper.java */
    class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f36179A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f36181a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f36183c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.g0(-12303292);
        k.b bVarV = gVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, m.f2811W0, i10, l.f2564a);
        int i12 = m.f2821X0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f36184d = new g();
        Z(bVarV.m());
        this.f36202v = i.g(materialCardView.getContext(), c.f2293Q, D7.a.f3486a);
        this.f36203w = i.f(materialCardView.getContext(), c.f2287K, 300);
        this.f36204x = i.f(materialCardView.getContext(), c.f2286J, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f36181a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f36187g & 80) == 80;
    }

    private boolean H() {
        return (this.f36187g & 8388613) == 8388613;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f36190j.setAlpha((int) (255.0f * fFloatValue));
        this.f36205y = fFloatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f36193m.q(), this.f36183c.J()), d(this.f36193m.s(), this.f36183c.K())), Math.max(d(this.f36193m.k(), this.f36183c.t()), d(this.f36193m.i(), this.f36183c.s())));
    }

    private float d(d dVar, float f10) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f36180z) * f10);
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f36181a.getPreventCornerOverlap() && !g();
    }

    private float e() {
        return this.f36181a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    private boolean e0() {
        return this.f36181a.getPreventCornerOverlap() && g() && this.f36181a.getUseCompatPadding();
    }

    private float f() {
        return (this.f36181a.getMaxCardElevation() * 1.5f) + (e0() ? c() : 0.0f);
    }

    private boolean f0() {
        if (this.f36181a.isClickable()) {
            return true;
        }
        View view = this.f36181a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private boolean g() {
        return this.f36183c.T();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarJ = j();
        this.f36197q = gVarJ;
        gVarJ.b0(this.f36191k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f36197q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!V7.b.f18152a) {
            return h();
        }
        this.f36198r = j();
        return new RippleDrawable(this.f36191k, null, this.f36198r);
    }

    private g j() {
        return new g(this.f36193m);
    }

    private void j0(Drawable drawable) {
        if (this.f36181a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f36181a.getForeground()).setDrawable(drawable);
        } else {
            this.f36181a.setForeground(D(drawable));
        }
    }

    private void l0() {
        Drawable drawable;
        if (V7.b.f18152a && (drawable = this.f36195o) != null) {
            ((RippleDrawable) drawable).setColor(this.f36191k);
            return;
        }
        g gVar = this.f36197q;
        if (gVar != null) {
            gVar.b0(this.f36191k);
        }
    }

    private Drawable t() {
        if (this.f36195o == null) {
            this.f36195o = i();
        }
        if (this.f36196p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f36195o, this.f36184d, this.f36190j});
            this.f36196p = layerDrawable;
            layerDrawable.setId(2, C7.g.f2448E);
        }
        return this.f36196p;
    }

    private float v() {
        if (this.f36181a.getPreventCornerOverlap() && this.f36181a.getUseCompatPadding()) {
            return (float) ((1.0d - f36180z) * this.f36181a.getCardViewRadius());
        }
        return 0.0f;
    }

    ColorStateList A() {
        return this.f36194n;
    }

    int B() {
        return this.f36188h;
    }

    Rect C() {
        return this.f36182b;
    }

    boolean E() {
        return this.f36199s;
    }

    boolean F() {
        return this.f36200t;
    }

    void J(TypedArray typedArray) {
        ColorStateList colorStateListA = U7.c.a(this.f36181a.getContext(), typedArray, m.f3096w4);
        this.f36194n = colorStateListA;
        if (colorStateListA == null) {
            this.f36194n = ColorStateList.valueOf(-1);
        }
        this.f36188h = typedArray.getDimensionPixelSize(m.f3106x4, 0);
        boolean z10 = typedArray.getBoolean(m.f3009o4, false);
        this.f36200t = z10;
        this.f36181a.setLongClickable(z10);
        this.f36192l = U7.c.a(this.f36181a.getContext(), typedArray, m.f3075u4);
        R(U7.c.e(this.f36181a.getContext(), typedArray, m.f3031q4));
        U(typedArray.getDimensionPixelSize(m.f3064t4, 0));
        T(typedArray.getDimensionPixelSize(m.f3053s4, 0));
        this.f36187g = typedArray.getInteger(m.f3042r4, 8388661);
        ColorStateList colorStateListA2 = U7.c.a(this.f36181a.getContext(), typedArray, m.f3086v4);
        this.f36191k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f36191k = ColorStateList.valueOf(M7.a.d(this.f36181a, c.f2321j));
        }
        N(U7.c.a(this.f36181a.getContext(), typedArray, m.f3020p4));
        l0();
        i0();
        m0();
        this.f36181a.setBackgroundInternal(D(this.f36183c));
        Drawable drawableT = f0() ? t() : this.f36184d;
        this.f36189i = drawableT;
        this.f36181a.setForeground(D(drawableT));
    }

    void K(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f36196p != null) {
            if (this.f36181a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f36185e) - this.f36186f) - iCeil2 : this.f36185e;
            int i15 = G() ? this.f36185e : ((i11 - this.f36185e) - this.f36186f) - iCeil;
            int i16 = H() ? this.f36185e : ((i10 - this.f36185e) - this.f36186f) - iCeil2;
            int i17 = G() ? ((i11 - this.f36185e) - this.f36186f) - iCeil : this.f36185e;
            if (X.z(this.f36181a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f36196p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void L(boolean z10) {
        this.f36199s = z10;
    }

    void M(ColorStateList colorStateList) {
        this.f36183c.b0(colorStateList);
    }

    void N(ColorStateList colorStateList) {
        g gVar = this.f36184d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.b0(colorStateList);
    }

    void O(boolean z10) {
        this.f36200t = z10;
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        Drawable drawable = this.f36190j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f36205y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void R(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = C3784a.r(drawable).mutate();
            this.f36190j = drawableMutate;
            C3784a.o(drawableMutate, this.f36192l);
            P(this.f36181a.isChecked());
        } else {
            this.f36190j = f36179A;
        }
        LayerDrawable layerDrawable = this.f36196p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C7.g.f2448E, this.f36190j);
        }
    }

    void S(int i10) {
        this.f36187g = i10;
        K(this.f36181a.getMeasuredWidth(), this.f36181a.getMeasuredHeight());
    }

    void T(int i10) {
        this.f36185e = i10;
    }

    void U(int i10) {
        this.f36186f = i10;
    }

    void V(ColorStateList colorStateList) {
        this.f36192l = colorStateList;
        Drawable drawable = this.f36190j;
        if (drawable != null) {
            C3784a.o(drawable, colorStateList);
        }
    }

    void W(float f10) {
        Z(this.f36193m.w(f10));
        this.f36189i.invalidateSelf();
        if (e0() || d0()) {
            h0();
        }
        if (e0()) {
            k0();
        }
    }

    void X(float f10) {
        this.f36183c.c0(f10);
        g gVar = this.f36184d;
        if (gVar != null) {
            gVar.c0(f10);
        }
        g gVar2 = this.f36198r;
        if (gVar2 != null) {
            gVar2.c0(f10);
        }
    }

    void Y(ColorStateList colorStateList) {
        this.f36191k = colorStateList;
        l0();
    }

    void Z(k kVar) {
        this.f36193m = kVar;
        this.f36183c.setShapeAppearanceModel(kVar);
        this.f36183c.f0(!r0.T());
        g gVar = this.f36184d;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        g gVar2 = this.f36198r;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f36197q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    void a0(ColorStateList colorStateList) {
        if (this.f36194n == colorStateList) {
            return;
        }
        this.f36194n = colorStateList;
        m0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f36205y : this.f36205y;
        ValueAnimator valueAnimator = this.f36201u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36201u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36205y, f10);
        this.f36201u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f36178a.I(valueAnimator2);
            }
        });
        this.f36201u.setInterpolator(this.f36202v);
        this.f36201u.setDuration((long) ((z10 ? this.f36203w : this.f36204x) * f11));
        this.f36201u.start();
    }

    void b0(int i10) {
        if (i10 == this.f36188h) {
            return;
        }
        this.f36188h = i10;
        m0();
    }

    void c0(int i10, int i11, int i12, int i13) {
        this.f36182b.set(i10, i11, i12, i13);
        h0();
    }

    void g0() {
        Drawable drawable = this.f36189i;
        Drawable drawableT = f0() ? t() : this.f36184d;
        this.f36189i = drawableT;
        if (drawable != drawableT) {
            j0(drawableT);
        }
    }

    void h0() {
        int iC = (int) (((d0() || e0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f36181a;
        Rect rect = this.f36182b;
        materialCardView.i(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void i0() {
        this.f36183c.a0(this.f36181a.getCardElevation());
    }

    void k() {
        Drawable drawable = this.f36195o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f36195o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f36195o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    void k0() {
        if (!E()) {
            this.f36181a.setBackgroundInternal(D(this.f36183c));
        }
        this.f36181a.setForeground(D(this.f36189i));
    }

    g l() {
        return this.f36183c;
    }

    ColorStateList m() {
        return this.f36183c.x();
    }

    void m0() {
        this.f36184d.i0(this.f36188h, this.f36194n);
    }

    ColorStateList n() {
        return this.f36184d.x();
    }

    Drawable o() {
        return this.f36190j;
    }

    int p() {
        return this.f36187g;
    }

    int q() {
        return this.f36185e;
    }

    int r() {
        return this.f36186f;
    }

    ColorStateList s() {
        return this.f36192l;
    }

    float u() {
        return this.f36183c.J();
    }

    float w() {
        return this.f36183c.y();
    }

    ColorStateList x() {
        return this.f36191k;
    }

    k y() {
        return this.f36193m;
    }

    int z() {
        ColorStateList colorStateList = this.f36194n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
