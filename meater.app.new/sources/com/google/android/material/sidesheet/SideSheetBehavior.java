package com.google.android.material.sidesheet;

import C7.k;
import C7.l;
import C7.m;
import R7.h;
import X7.k;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apptionlabs.meater_app.data.Temperature;
import d.C2998b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m1.C3946a;
import s1.C4456s;
import s1.X;
import t1.t;
import t1.w;
import y1.AbstractC5121a;
import z1.d;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements R7.b {

    /* renamed from: a0, reason: collision with root package name */
    private static final int f37031a0 = k.f2531B;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f37032b0 = l.f2580q;

    /* renamed from: B, reason: collision with root package name */
    private com.google.android.material.sidesheet.d f37033B;

    /* renamed from: C, reason: collision with root package name */
    private float f37034C;

    /* renamed from: D, reason: collision with root package name */
    private X7.g f37035D;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f37036E;

    /* renamed from: F, reason: collision with root package name */
    private X7.k f37037F;

    /* renamed from: G, reason: collision with root package name */
    private final SideSheetBehavior<V>.d f37038G;

    /* renamed from: H, reason: collision with root package name */
    private float f37039H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f37040I;

    /* renamed from: J, reason: collision with root package name */
    private int f37041J;

    /* renamed from: K, reason: collision with root package name */
    private int f37042K;

    /* renamed from: L, reason: collision with root package name */
    private z1.d f37043L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f37044M;

    /* renamed from: N, reason: collision with root package name */
    private float f37045N;

    /* renamed from: O, reason: collision with root package name */
    private int f37046O;

    /* renamed from: P, reason: collision with root package name */
    private int f37047P;

    /* renamed from: Q, reason: collision with root package name */
    private int f37048Q;

    /* renamed from: R, reason: collision with root package name */
    private int f37049R;

    /* renamed from: S, reason: collision with root package name */
    private WeakReference<V> f37050S;

    /* renamed from: T, reason: collision with root package name */
    private WeakReference<View> f37051T;

    /* renamed from: U, reason: collision with root package name */
    private int f37052U;

    /* renamed from: V, reason: collision with root package name */
    private VelocityTracker f37053V;

    /* renamed from: W, reason: collision with root package name */
    private h f37054W;

    /* renamed from: X, reason: collision with root package name */
    private int f37055X;

    /* renamed from: Y, reason: collision with root package name */
    private final Set<g> f37056Y;

    /* renamed from: Z, reason: collision with root package name */
    private final d.c f37057Z;

    class a extends d.c {
        a() {
        }

        @Override // z1.d.c
        public int a(View view, int i10, int i11) {
            return C3946a.b(i10, SideSheetBehavior.this.f37033B.g(), SideSheetBehavior.this.f37033B.f());
        }

        @Override // z1.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // z1.d.c
        public int d(View view) {
            return SideSheetBehavior.this.f37046O + SideSheetBehavior.this.k0();
        }

        @Override // z1.d.c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f37040I) {
                SideSheetBehavior.this.J0(1);
            }
        }

        @Override // z1.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f37033B.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // z1.d.c
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.O0(view, iW, sideSheetBehavior.N0());
        }

        @Override // z1.d.c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f37041J == 1 || SideSheetBehavior.this.f37050S == null || SideSheetBehavior.this.f37050S.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.J0(5);
            if (SideSheetBehavior.this.f37050S == null || SideSheetBehavior.this.f37050S.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f37050S.get()).requestLayout();
        }
    }

    class d {

        /* renamed from: a, reason: collision with root package name */
        private int f37061a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37062b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f37063c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f37067B.c();
            }
        };

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f37062b = false;
            if (SideSheetBehavior.this.f37043L != null && SideSheetBehavior.this.f37043L.l(true)) {
                b(this.f37061a);
            } else if (SideSheetBehavior.this.f37041J == 2) {
                SideSheetBehavior.this.J0(this.f37061a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f37050S == null || SideSheetBehavior.this.f37050S.get() == null) {
                return;
            }
            this.f37061a = i10;
            if (this.f37062b) {
                return;
            }
            X.f0((View) SideSheetBehavior.this.f37050S.get(), this.f37063c);
            this.f37062b = true;
        }
    }

    public SideSheetBehavior() {
        this.f37038G = new d();
        this.f37040I = true;
        this.f37041J = 5;
        this.f37042K = 5;
        this.f37045N = 0.1f;
        this.f37052U = -1;
        this.f37056Y = new LinkedHashSet();
        this.f37057Z = new a();
    }

    private void A0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f37051T != null || (i10 = this.f37052U) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f37051T = new WeakReference<>(viewFindViewById);
    }

    private void B0(V v10, t.a aVar, int i10) {
        X.j0(v10, aVar, null, Y(i10));
    }

    private void C0() {
        VelocityTracker velocityTracker = this.f37053V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37053V = null;
        }
    }

    private void D0(V v10, Runnable runnable) {
        if (v0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void G0(int i10) {
        com.google.android.material.sidesheet.d dVar = this.f37033B;
        if (dVar == null || dVar.j() != i10) {
            if (i10 == 0) {
                this.f37033B = new com.google.android.material.sidesheet.b(this);
                if (this.f37037F == null || s0()) {
                    return;
                }
                k.b bVarV = this.f37037F.v();
                bVarV.E(0.0f).w(0.0f);
                R0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f37033B = new com.google.android.material.sidesheet.a(this);
                if (this.f37037F == null || r0()) {
                    return;
                }
                k.b bVarV2 = this.f37037F.v();
                bVarV2.A(0.0f).s(0.0f);
                R0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void H0(V v10, int i10) {
        G0(C4456s.b(((CoordinatorLayout.f) v10.getLayoutParams()).f24689c, i10) == 3 ? 1 : 0);
    }

    private boolean K0() {
        return this.f37043L != null && (this.f37040I || this.f37041J == 1);
    }

    private boolean M0(V v10) {
        return (v10.isShown() || X.o(v10) != null) && this.f37040I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            J0(i10);
        } else {
            J0(2);
            this.f37038G.b(i10);
        }
    }

    private void P0() {
        V v10;
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        X.h0(v10, 262144);
        X.h0(v10, 1048576);
        if (this.f37041J != 5) {
            B0(v10, t.a.f49798y, 5);
        }
        if (this.f37041J != 3) {
            B0(v10, t.a.f49796w, 3);
        }
    }

    private void Q0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f37050S.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f37033B.o(marginLayoutParams, (int) ((this.f37046O * v10.getScaleX()) + this.f37049R));
        viewF0.requestLayout();
    }

    private void R0(X7.k kVar) {
        X7.g gVar = this.f37035D;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void S0(View view) {
        int i10 = this.f37041J == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, V v10) {
        int i11 = this.f37041J;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f37033B.h(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f37033B.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f37041J);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (L0(view, f10)) {
            if (!this.f37033B.m(f10, f11) && !this.f37033B.l(view)) {
                return 3;
            }
        } else if (f10 == 0.0f || !e.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - g0()) < Math.abs(left - this.f37033B.e())) {
                return 3;
            }
        }
        return 5;
    }

    private void X() {
        WeakReference<View> weakReference = this.f37051T;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f37051T = null;
    }

    private w Y(final int i10) {
        return new w() { // from class: Y7.a
            @Override // t1.w
            public final boolean a(View view, w.a aVar) {
                return this.f19450a.x0(i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f37037F == null) {
            return;
        }
        X7.g gVar = new X7.g(this.f37037F);
        this.f37035D = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f37036E;
        if (colorStateList != null) {
            this.f37035D.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f37035D.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (this.f37056Y.isEmpty()) {
            return;
        }
        float fB = this.f37033B.b(i10);
        Iterator<g> it = this.f37056Y.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void b0(View view) {
        if (X.o(view) == null) {
            X.q0(view, view.getResources().getString(f37031a0));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f37033B.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: Y7.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f19454a.y0(marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    private int h0() {
        com.google.android.material.sidesheet.d dVar = this.f37033B;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        V v10;
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference == null || (v10 = weakReference.get()) == null || !(v10.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v10.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return K0() && V((float) this.f37055X, motionEvent.getX()) > ((float) this.f37043L.v());
    }

    private boolean u0(float f10) {
        return this.f37033B.k(f10);
    }

    private boolean v0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && X.Q(v10);
    }

    private boolean w0(View view, int i10, boolean z10) {
        int iL0 = l0(i10);
        z1.d dVarP0 = p0();
        return dVarP0 != null && (!z10 ? !dVarP0.I(view, iL0, view.getTop()) : !dVarP0.G(iL0, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean x0(int i10, View view, w.a aVar) {
        I0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        this.f37033B.o(marginLayoutParams, D7.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(int i10) {
        V v10 = this.f37050S.get();
        if (v10 != null) {
            O0(v10, i10, false);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v10, cVar.a());
        }
        int i10 = cVar.f37060D;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f37041J = i10;
        this.f37042K = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new c(super.C(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    public void E0(int i10) {
        this.f37052U = i10;
        X();
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (i10 == -1 || !X.R(v10)) {
                return;
            }
            v10.requestLayout();
        }
    }

    public void F0(boolean z10) {
        this.f37040I = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f37041J == 1 && actionMasked == 0) {
            return true;
        }
        if (K0()) {
            this.f37043L.A(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.f37053V == null) {
            this.f37053V = VelocityTracker.obtain();
        }
        this.f37053V.addMovement(motionEvent);
        if (K0() && actionMasked == 2 && !this.f37044M && t0(motionEvent)) {
            this.f37043L.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f37044M;
    }

    public void I0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference == null || weakReference.get() == null) {
            J0(i10);
        } else {
            D0(this.f37050S.get(), new Runnable() { // from class: Y7.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19452B.z0(i10);
                }
            });
        }
    }

    void J0(int i10) {
        V v10;
        if (this.f37041J == i10) {
            return;
        }
        this.f37041J = i10;
        if (i10 == 3 || i10 == 5) {
            this.f37042K = i10;
        }
        WeakReference<V> weakReference = this.f37050S;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        S0(v10);
        Iterator<g> it = this.f37056Y.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        P0();
    }

    boolean L0(View view, float f10) {
        return this.f37033B.n(view, f10);
    }

    public boolean N0() {
        return true;
    }

    @Override // R7.b
    public void a(C2998b c2998b) {
        h hVar = this.f37054W;
        if (hVar == null) {
            return;
        }
        hVar.l(c2998b, h0());
        Q0();
    }

    @Override // R7.b
    public void b() {
        h hVar = this.f37054W;
        if (hVar == null) {
            return;
        }
        C2998b c2998bC = hVar.c();
        if (c2998bC == null || Build.VERSION.SDK_INT < 34) {
            I0(5);
        } else {
            this.f37054W.h(c2998bC, h0(), new b(), e0());
        }
    }

    @Override // R7.b
    public void c(C2998b c2998b) {
        h hVar = this.f37054W;
        if (hVar == null) {
            return;
        }
        hVar.j(c2998b);
    }

    @Override // R7.b
    public void d() {
        h hVar = this.f37054W;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    int d0() {
        return this.f37046O;
    }

    public View f0() {
        WeakReference<View> weakReference = this.f37051T;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f37033B.d();
    }

    public float i0() {
        return this.f37045N;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f37050S = null;
        this.f37043L = null;
        this.f37054W = null;
    }

    int k0() {
        return this.f37049R;
    }

    int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f37033B.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int m0() {
        return this.f37048Q;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f37050S = null;
        this.f37043L = null;
        this.f37054W = null;
    }

    int n0() {
        return this.f37047P;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        z1.d dVar;
        if (!M0(v10)) {
            this.f37044M = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C0();
        }
        if (this.f37053V == null) {
            this.f37053V = VelocityTracker.obtain();
        }
        this.f37053V.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f37055X = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f37044M) {
            this.f37044M = false;
            return false;
        }
        return (this.f37044M || (dVar = this.f37043L) == null || !dVar.H(motionEvent)) ? false : true;
    }

    int o0() {
        return Temperature.MAX_AMBIENT_SECOND_GEN_PROBE;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (X.w(coordinatorLayout) && !X.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f37050S == null) {
            this.f37050S = new WeakReference<>(v10);
            this.f37054W = new h(v10);
            X7.g gVar = this.f37035D;
            if (gVar != null) {
                X.r0(v10, gVar);
                X7.g gVar2 = this.f37035D;
                float fU = this.f37039H;
                if (fU == -1.0f) {
                    fU = X.u(v10);
                }
                gVar2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f37036E;
                if (colorStateList != null) {
                    X.s0(v10, colorStateList);
                }
            }
            S0(v10);
            P0();
            if (X.x(v10) == 0) {
                X.x0(v10, 1);
            }
            b0(v10);
        }
        H0(v10, i10);
        if (this.f37043L == null) {
            this.f37043L = z1.d.n(coordinatorLayout, this.f37057Z);
        }
        int iH = this.f37033B.h(v10);
        coordinatorLayout.I(v10, i10);
        this.f37047P = coordinatorLayout.getWidth();
        this.f37048Q = this.f37033B.i(coordinatorLayout);
        this.f37046O = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f37049R = marginLayoutParams != null ? this.f37033B.a(marginLayoutParams) : 0;
        X.X(v10, U(iH, v10));
        A0(coordinatorLayout);
        for (g gVar3 : this.f37056Y) {
            if (gVar3 instanceof g) {
                gVar3.c(v10);
            }
        }
        return true;
    }

    z1.d p0() {
        return this.f37043L;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    protected static class c extends AbstractC5121a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        final int f37060D;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37060D = parcel.readInt();
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f37060D);
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f37060D = ((SideSheetBehavior) sideSheetBehavior).f37041J;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37038G = new d();
        this.f37040I = true;
        this.f37041J = 5;
        this.f37042K = 5;
        this.f37045N = 0.1f;
        this.f37052U = -1;
        this.f37056Y = new LinkedHashSet();
        this.f37057Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f3044r6);
        int i10 = m.f3066t6;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f37036E = U7.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f3098w6)) {
            this.f37037F = X7.k.e(context, attributeSet, 0, f37032b0).m();
        }
        int i11 = m.f3088v6;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            E0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f37039H = typedArrayObtainStyledAttributes.getDimension(m.f3055s6, -1.0f);
        F0(typedArrayObtainStyledAttributes.getBoolean(m.f3077u6, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f37034C = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
