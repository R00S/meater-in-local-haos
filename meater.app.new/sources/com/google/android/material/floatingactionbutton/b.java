package com.google.android.material.floatingactionbutton;

import X7.n;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import k1.C3784a;
import s1.X;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
class b {

    /* renamed from: D, reason: collision with root package name */
    static final TimeInterpolator f36581D = D7.a.f3488c;

    /* renamed from: E, reason: collision with root package name */
    private static final int f36582E = C7.c.f2282F;

    /* renamed from: F, reason: collision with root package name */
    private static final int f36583F = C7.c.f2292P;

    /* renamed from: G, reason: collision with root package name */
    private static final int f36584G = C7.c.f2283G;

    /* renamed from: H, reason: collision with root package name */
    private static final int f36585H = C7.c.f2290N;

    /* renamed from: I, reason: collision with root package name */
    static final int[] f36586I = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    static final int[] f36587J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    static final int[] f36588K = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    static final int[] f36589L = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    static final int[] f36590M = {R.attr.state_enabled};

    /* renamed from: N, reason: collision with root package name */
    static final int[] f36591N = new int[0];

    /* renamed from: C, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f36594C;

    /* renamed from: a, reason: collision with root package name */
    X7.k f36595a;

    /* renamed from: b, reason: collision with root package name */
    X7.g f36596b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f36597c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f36598d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f36599e;

    /* renamed from: f, reason: collision with root package name */
    boolean f36600f;

    /* renamed from: h, reason: collision with root package name */
    float f36602h;

    /* renamed from: i, reason: collision with root package name */
    float f36603i;

    /* renamed from: j, reason: collision with root package name */
    float f36604j;

    /* renamed from: k, reason: collision with root package name */
    int f36605k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.android.material.internal.l f36606l;

    /* renamed from: m, reason: collision with root package name */
    private Animator f36607m;

    /* renamed from: n, reason: collision with root package name */
    private D7.h f36608n;

    /* renamed from: o, reason: collision with root package name */
    private D7.h f36609o;

    /* renamed from: p, reason: collision with root package name */
    private float f36610p;

    /* renamed from: r, reason: collision with root package name */
    private int f36612r;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f36614t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f36615u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<j> f36616v;

    /* renamed from: w, reason: collision with root package name */
    final FloatingActionButton f36617w;

    /* renamed from: x, reason: collision with root package name */
    final W7.b f36618x;

    /* renamed from: g, reason: collision with root package name */
    boolean f36601g = true;

    /* renamed from: q, reason: collision with root package name */
    private float f36611q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private int f36613s = 0;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f36619y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f36620z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final RectF f36592A = new RectF();

    /* renamed from: B, reason: collision with root package name */
    private final Matrix f36593B = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f36621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36622b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f36623c;

        a(boolean z10, k kVar) {
            this.f36622b = z10;
            this.f36623c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f36621a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f36613s = 0;
            b.this.f36607m = null;
            if (this.f36621a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.f36617w;
            boolean z10 = this.f36622b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f36623c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f36617w.b(0, this.f36622b);
            b.this.f36613s = 1;
            b.this.f36607m = animator;
            this.f36621a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0469b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f36626b;

        C0469b(boolean z10, k kVar) {
            this.f36625a = z10;
            this.f36626b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f36613s = 0;
            b.this.f36607m = null;
            k kVar = this.f36626b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f36617w.b(0, this.f36625a);
            b.this.f36613s = 2;
            b.this.f36607m = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class c extends D7.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            b.this.f36611q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f36629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f36630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f36631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f36632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f36633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f36634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f36635g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f36636h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f36629a = f10;
            this.f36630b = f11;
            this.f36631c = f12;
            this.f36632d = f13;
            this.f36633e = f14;
            this.f36634f = f15;
            this.f36635g = f16;
            this.f36636h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f36617w.setAlpha(D7.a.b(this.f36629a, this.f36630b, 0.0f, 0.2f, fFloatValue));
            b.this.f36617w.setScaleX(D7.a.a(this.f36631c, this.f36632d, fFloatValue));
            b.this.f36617w.setScaleY(D7.a.a(this.f36633e, this.f36632d, fFloatValue));
            b.this.f36611q = D7.a.a(this.f36634f, this.f36635g, fFloatValue);
            b.this.h(D7.a.a(this.f36634f, this.f36635g, fFloatValue), this.f36636h);
            b.this.f36617w.setImageMatrix(this.f36636h);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f36638a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f36638a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class g extends m {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class h extends m {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f36602h + bVar.f36603i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class i extends m {
        i() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f36602h + bVar.f36604j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface k {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class l extends m {
        l() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return b.this.f36602h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f36645a;

        /* renamed from: b, reason: collision with root package name */
        private float f36646b;

        /* renamed from: c, reason: collision with root package name */
        private float f36647c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.g0((int) this.f36647c);
            this.f36645a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f36645a) {
                X7.g gVar = b.this.f36596b;
                this.f36646b = gVar == null ? 0.0f : gVar.w();
                this.f36647c = a();
                this.f36645a = true;
            }
            b bVar = b.this;
            float f10 = this.f36646b;
            bVar.g0((int) (f10 + ((this.f36647c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, W7.b bVar) {
        this.f36617w = floatingActionButton;
        this.f36618x = bVar;
        com.google.android.material.internal.l lVar = new com.google.android.material.internal.l();
        this.f36606l = lVar;
        lVar.a(f36586I, k(new i()));
        lVar.a(f36587J, k(new h()));
        lVar.a(f36588K, k(new h()));
        lVar.a(f36589L, k(new h()));
        lVar.a(f36590M, k(new l()));
        lVar.a(f36591N, k(new g()));
        this.f36610p = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return X.R(this.f36617w) && !this.f36617w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f36617w.getDrawable() == null || this.f36612r == 0) {
            return;
        }
        RectF rectF = this.f36620z;
        RectF rectF2 = this.f36592A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f36612r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f36612r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    private AnimatorSet i(D7.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36617w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f36617w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f36617w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.f36593B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f36617w, new D7.f(), new c(), new Matrix(this.f36593B));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        D7.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f36617w.getAlpha(), f10, this.f36617w.getScaleX(), f11, this.f36617w.getScaleY(), this.f36611q, f12, new Matrix(this.f36593B)));
        arrayList.add(valueAnimatorOfFloat);
        D7.b.a(animatorSet, arrayList);
        animatorSet.setDuration(R7.i.f(this.f36617w.getContext(), i10, this.f36617w.getContext().getResources().getInteger(C7.h.f2501b)));
        animatorSet.setInterpolator(R7.i.g(this.f36617w.getContext(), i11, D7.a.f3487b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f36581D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.f36594C == null) {
            this.f36594C = new f();
        }
        return this.f36594C;
    }

    void A() {
        throw null;
    }

    void B() {
        X7.g gVar = this.f36596b;
        if (gVar != null) {
            X7.h.f(this.f36617w, gVar);
        }
        if (K()) {
            this.f36617w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    void C() {
        throw null;
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f36617w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f36594C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f36594C = null;
        }
    }

    void E(int[] iArr) {
        throw null;
    }

    void F(float f10, float f11, float f12) {
        throw null;
    }

    void G(Rect rect) {
        r1.i.h(this.f36599e, "Didn't initialize content background");
        if (!Z()) {
            this.f36618x.c(this.f36599e);
        } else {
            this.f36618x.c(new InsetDrawable(this.f36599e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f36617w.getRotation();
        if (this.f36610p != rotation) {
            this.f36610p = rotation;
            d0();
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f36616v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void J() {
        ArrayList<j> arrayList = this.f36616v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean K() {
        throw null;
    }

    void L(ColorStateList colorStateList) {
        X7.g gVar = this.f36596b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f36598d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    void M(PorterDuff.Mode mode) {
        X7.g gVar = this.f36596b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void N(float f10) {
        if (this.f36602h != f10) {
            this.f36602h = f10;
            F(f10, this.f36603i, this.f36604j);
        }
    }

    void O(boolean z10) {
        this.f36600f = z10;
    }

    final void P(D7.h hVar) {
        this.f36609o = hVar;
    }

    final void Q(float f10) {
        if (this.f36603i != f10) {
            this.f36603i = f10;
            F(this.f36602h, f10, this.f36604j);
        }
    }

    final void R(float f10) {
        this.f36611q = f10;
        Matrix matrix = this.f36593B;
        h(f10, matrix);
        this.f36617w.setImageMatrix(matrix);
    }

    final void S(int i10) {
        if (this.f36612r != i10) {
            this.f36612r = i10;
            e0();
        }
    }

    void T(int i10) {
        this.f36605k = i10;
    }

    final void U(float f10) {
        if (this.f36604j != f10) {
            this.f36604j = f10;
            F(this.f36602h, this.f36603i, f10);
        }
    }

    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f36597c;
        if (drawable != null) {
            C3784a.o(drawable, V7.b.d(colorStateList));
        }
    }

    void W(boolean z10) {
        this.f36601g = z10;
        f0();
    }

    final void X(X7.k kVar) {
        this.f36595a = kVar;
        X7.g gVar = this.f36596b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f36597c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f36598d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    final void Y(D7.h hVar) {
        this.f36608n = hVar;
    }

    boolean Z() {
        throw null;
    }

    final boolean b0() {
        return !this.f36600f || this.f36617w.getSizeDimension() >= this.f36605k;
    }

    void c0(k kVar, boolean z10) {
        if (z()) {
            return;
        }
        Animator animator = this.f36607m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f36608n == null;
        if (!a0()) {
            this.f36617w.b(0, z10);
            this.f36617w.setAlpha(1.0f);
            this.f36617w.setScaleY(1.0f);
            this.f36617w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f36617w.getVisibility() != 0) {
            this.f36617w.setAlpha(0.0f);
            this.f36617w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f36617w.setScaleX(z11 ? 0.4f : 0.0f);
            R(z11 ? 0.4f : 0.0f);
        }
        D7.h hVar = this.f36608n;
        AnimatorSet animatorSetI = hVar != null ? i(hVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f, f36582E, f36583F);
        animatorSetI.addListener(new C0469b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f36614t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void d0() {
        throw null;
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f36615u == null) {
            this.f36615u = new ArrayList<>();
        }
        this.f36615u.add(animatorListener);
    }

    final void e0() {
        R(this.f36611q);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f36614t == null) {
            this.f36614t = new ArrayList<>();
        }
        this.f36614t.add(animatorListener);
    }

    final void f0() {
        Rect rect = this.f36619y;
        r(rect);
        G(rect);
        this.f36618x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void g(j jVar) {
        if (this.f36616v == null) {
            this.f36616v = new ArrayList<>();
        }
        this.f36616v.add(jVar);
    }

    void g0(float f10) {
        X7.g gVar = this.f36596b;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    final Drawable l() {
        return this.f36599e;
    }

    float m() {
        throw null;
    }

    boolean n() {
        return this.f36600f;
    }

    final D7.h o() {
        return this.f36609o;
    }

    float p() {
        return this.f36603i;
    }

    void r(Rect rect) {
        int iV = v();
        int iMax = Math.max(iV, (int) Math.ceil(this.f36601g ? m() + this.f36604j : 0.0f));
        int iMax2 = Math.max(iV, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float s() {
        return this.f36604j;
    }

    final X7.k t() {
        return this.f36595a;
    }

    final D7.h u() {
        return this.f36608n;
    }

    int v() {
        if (this.f36600f) {
            return Math.max((this.f36605k - this.f36617w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(k kVar, boolean z10) {
        if (y()) {
            return;
        }
        Animator animator = this.f36607m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f36617w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        D7.h hVar = this.f36609o;
        AnimatorSet animatorSetI = hVar != null ? i(hVar, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f, f36584G, f36585H);
        animatorSetI.addListener(new a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f36615u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    boolean y() {
        return this.f36617w.getVisibility() == 0 ? this.f36613s == 1 : this.f36613s != 2;
    }

    boolean z() {
        return this.f36617w.getVisibility() != 0 ? this.f36613s == 2 : this.f36613s != 1;
    }
}
