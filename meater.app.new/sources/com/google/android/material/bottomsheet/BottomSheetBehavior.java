package com.google.android.material.bottomsheet;

import C7.l;
import C7.m;
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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.android.material.internal.u;
import d.C2998b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m1.C3946a;
import s1.X;
import t1.t;
import t1.w;
import y1.AbstractC5121a;
import z1.d;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements R7.b {

    /* renamed from: J0, reason: collision with root package name */
    private static final int f36002J0 = l.f2573j;

    /* renamed from: A0, reason: collision with root package name */
    private final ArrayList<g> f36003A0;

    /* renamed from: B, reason: collision with root package name */
    private int f36004B;

    /* renamed from: B0, reason: collision with root package name */
    private VelocityTracker f36005B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f36006C;

    /* renamed from: C0, reason: collision with root package name */
    R7.f f36007C0;

    /* renamed from: D, reason: collision with root package name */
    private boolean f36008D;

    /* renamed from: D0, reason: collision with root package name */
    int f36009D0;

    /* renamed from: E, reason: collision with root package name */
    private float f36010E;

    /* renamed from: E0, reason: collision with root package name */
    private int f36011E0;

    /* renamed from: F, reason: collision with root package name */
    private int f36012F;

    /* renamed from: F0, reason: collision with root package name */
    boolean f36013F0;

    /* renamed from: G, reason: collision with root package name */
    private int f36014G;

    /* renamed from: G0, reason: collision with root package name */
    private Map<View, Integer> f36015G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f36016H;

    /* renamed from: H0, reason: collision with root package name */
    final SparseIntArray f36017H0;

    /* renamed from: I, reason: collision with root package name */
    private int f36018I;

    /* renamed from: I0, reason: collision with root package name */
    private final d.c f36019I0;

    /* renamed from: J, reason: collision with root package name */
    private int f36020J;

    /* renamed from: K, reason: collision with root package name */
    private X7.g f36021K;

    /* renamed from: L, reason: collision with root package name */
    private ColorStateList f36022L;

    /* renamed from: M, reason: collision with root package name */
    private int f36023M;

    /* renamed from: N, reason: collision with root package name */
    private int f36024N;

    /* renamed from: O, reason: collision with root package name */
    private int f36025O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f36026P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f36027Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f36028R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f36029S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f36030T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f36031U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f36032V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f36033W;

    /* renamed from: X, reason: collision with root package name */
    private int f36034X;

    /* renamed from: Y, reason: collision with root package name */
    private int f36035Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f36036Z;

    /* renamed from: a0, reason: collision with root package name */
    private k f36037a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f36038b0;

    /* renamed from: c0, reason: collision with root package name */
    private final BottomSheetBehavior<V>.i f36039c0;

    /* renamed from: d0, reason: collision with root package name */
    private ValueAnimator f36040d0;

    /* renamed from: e0, reason: collision with root package name */
    int f36041e0;

    /* renamed from: f0, reason: collision with root package name */
    int f36042f0;

    /* renamed from: g0, reason: collision with root package name */
    int f36043g0;

    /* renamed from: h0, reason: collision with root package name */
    float f36044h0;

    /* renamed from: i0, reason: collision with root package name */
    int f36045i0;

    /* renamed from: j0, reason: collision with root package name */
    float f36046j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f36047k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f36048l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f36049m0;

    /* renamed from: n0, reason: collision with root package name */
    int f36050n0;

    /* renamed from: o0, reason: collision with root package name */
    int f36051o0;

    /* renamed from: p0, reason: collision with root package name */
    z1.d f36052p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f36053q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f36054r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f36055s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f36056t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f36057u0;

    /* renamed from: v0, reason: collision with root package name */
    int f36058v0;

    /* renamed from: w0, reason: collision with root package name */
    int f36059w0;

    /* renamed from: x0, reason: collision with root package name */
    WeakReference<V> f36060x0;

    /* renamed from: y0, reason: collision with root package name */
    WeakReference<View> f36061y0;

    /* renamed from: z0, reason: collision with root package name */
    WeakReference<View> f36062z0;

    class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f36063B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f36064C;

        a(View view, int i10) {
            this.f36063B = view;
            this.f36064C = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.e1(this.f36063B, this.f36064C, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.X0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f36060x0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.f36060x0.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f36021K != null) {
                BottomSheetBehavior.this.f36021K.c0(fFloatValue);
            }
        }
    }

    class d implements u.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36068a;

        d(boolean z10) {
            this.f36068a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.u.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public s1.C4469y0 a(android.view.View r11, s1.C4469y0 r12, com.google.android.material.internal.u.d r13) {
            /*
                r10 = this;
                int r0 = s1.C4469y0.l.h()
                j1.d r0 = r12.f(r0)
                int r1 = s1.C4469y0.l.e()
                j1.d r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f43451b
                com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2, r3)
                boolean r2 = com.google.android.material.internal.u.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.W(r3, r6)
                int r3 = r13.f36804d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f36803c
                goto L50
            L4e:
                int r4 = r13.f36801a
            L50:
                int r6 = r0.f43450a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f36801a
                goto L62
            L60:
                int r13 = r13.f36803c
            L62:
                int r2 = r0.f43452c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.Z(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f43450a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.a0(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f43452c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f43451b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f36068a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f43453d
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f36068a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.L(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, s1.y0, com.google.android.material.internal.u$d):s1.y0");
        }
    }

    class e extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private long f36070a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f36059w0 + bottomSheetBehavior.s0()) / 2;
        }

        @Override // z1.d.c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // z1.d.c
        public int b(View view, int i10, int i11) {
            return C3946a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // z1.d.c
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f36059w0 : BottomSheetBehavior.this.f36045i0;
        }

        @Override // z1.d.c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f36049m0) {
                BottomSheetBehavior.this.X0(1);
            }
        }

        @Override // z1.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // z1.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // z1.d.c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f36050n0;
            if (i11 == 1 || bottomSheetBehavior.f36013F0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f36009D0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f36062z0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f36070a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f36060x0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f36072a;

        f(int i10) {
            this.f36072a = i10;
        }

        @Override // t1.w
        public boolean a(View view, w.a aVar) {
            BottomSheetBehavior.this.W0(this.f36072a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f36004B = 0;
        this.f36006C = true;
        this.f36008D = false;
        this.f36023M = -1;
        this.f36024N = -1;
        this.f36039c0 = new i(this, null);
        this.f36044h0 = 0.5f;
        this.f36046j0 = -1.0f;
        this.f36049m0 = true;
        this.f36050n0 = 4;
        this.f36051o0 = 4;
        this.f36056t0 = 0.1f;
        this.f36003A0 = new ArrayList<>();
        this.f36011E0 = -1;
        this.f36017H0 = new SparseIntArray();
        this.f36019I0 = new e();
    }

    private boolean C0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && X.Q(v10);
    }

    private void F0(View view, t.a aVar, int i10) {
        X.j0(view, aVar, null, l0(i10));
    }

    private void G0() {
        this.f36009D0 = -1;
        this.f36011E0 = -1;
        VelocityTracker velocityTracker = this.f36005B0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36005B0 = null;
        }
    }

    private void H0(h hVar) {
        int i10 = this.f36004B;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f36014G = hVar.f36075E;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f36006C = hVar.f36076F;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f36047k0 = hVar.f36077G;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f36048l0 = hVar.f36078H;
        }
    }

    private void I0(V v10, Runnable runnable) {
        if (C0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void Y0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || z0() || this.f36016H) ? false : true;
        if (this.f36027Q || this.f36028R || this.f36029S || this.f36031U || this.f36032V || this.f36033W || z10) {
            u.b(view, new d(z10));
        }
    }

    private boolean a1() {
        return this.f36052p0 != null && (this.f36049m0 || this.f36050n0 == 1);
    }

    private int b0(View view, int i10, int i11) {
        return X.c(view, view.getResources().getString(i10), l0(i11));
    }

    private void d0() {
        int iH0 = h0();
        if (this.f36006C) {
            this.f36045i0 = Math.max(this.f36059w0 - iH0, this.f36042f0);
        } else {
            this.f36045i0 = this.f36059w0 - iH0;
        }
    }

    private float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(View view, int i10, boolean z10) {
        int iV0 = v0(i10);
        z1.d dVar = this.f36052p0;
        if (dVar == null || (!z10 ? dVar.I(view, view.getLeft(), iV0) : dVar.G(view.getLeft(), iV0))) {
            X0(i10);
            return;
        }
        X0(2);
        h1(i10, true);
        this.f36039c0.c(i10);
    }

    private void f0() {
        this.f36043g0 = (int) (this.f36059w0 * (1.0f - this.f36044h0));
    }

    private void f1() {
        WeakReference<V> weakReference = this.f36060x0;
        if (weakReference != null) {
            g1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f36061y0;
        if (weakReference2 != null) {
            g1(weakReference2.get(), 1);
        }
    }

    private float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f36021K == null || (weakReference = this.f36060x0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v10 = this.f36060x0.get();
        if (!x0() || (rootWindowInsets = v10.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f36021K.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f36021K.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f36006C && this.f36050n0 != 6) {
            this.f36017H0.put(i10, b0(view, C7.k.f2532a, 6));
        }
        if (this.f36047k0 && B0() && this.f36050n0 != 5) {
            F0(view, t.a.f49798y, 5);
        }
        int i11 = this.f36050n0;
        if (i11 == 3) {
            F0(view, t.a.f49797x, this.f36006C ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            F0(view, t.a.f49796w, this.f36006C ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            F0(view, t.a.f49797x, 4);
            F0(view, t.a.f49796w, 3);
        }
    }

    private int h0() {
        int i10;
        return this.f36016H ? Math.min(Math.max(this.f36018I, this.f36059w0 - ((this.f36058v0 * 9) / 16)), this.f36057u0) + this.f36034X : (this.f36026P || this.f36027Q || (i10 = this.f36025O) <= 0) ? this.f36014G + this.f36034X : Math.max(this.f36014G, i10 + this.f36020J);
    }

    private void h1(int i10, boolean z10) {
        boolean zY0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f36038b0 == (zY0 = y0()) || this.f36021K == null) {
            return;
        }
        this.f36038b0 = zY0;
        if (!z10 || (valueAnimator = this.f36040d0) == null) {
            ValueAnimator valueAnimator2 = this.f36040d0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36040d0.cancel();
            }
            this.f36021K.c0(this.f36038b0 ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f36040d0.reverse();
        } else {
            this.f36040d0.setFloatValues(this.f36021K.y(), zY0 ? g0() : 1.0f);
            this.f36040d0.start();
        }
    }

    private float i0(int i10) {
        float f10;
        float fS0;
        int i11 = this.f36045i0;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f36045i0;
            f10 = i12 - i10;
            fS0 = this.f36059w0 - i12;
        } else {
            int i13 = this.f36045i0;
            f10 = i13 - i10;
            fS0 = i13 - s0();
        }
        return f10 / fS0;
    }

    private void i1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f36060x0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f36015G0 != null) {
                    return;
                } else {
                    this.f36015G0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f36060x0.get()) {
                    if (z10) {
                        this.f36015G0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f36008D) {
                            X.x0(childAt, 4);
                        }
                    } else if (this.f36008D && (map = this.f36015G0) != null && map.containsKey(childAt)) {
                        X.x0(childAt, this.f36015G0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f36015G0 = null;
            } else if (this.f36008D) {
                this.f36060x0.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return A0() && B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z10) {
        V v10;
        if (this.f36060x0 != null) {
            d0();
            if (this.f36050n0 != 4 || (v10 = this.f36060x0.get()) == null) {
                return;
            }
            if (z10) {
                W0(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        X.h0(view, 524288);
        X.h0(view, 262144);
        X.h0(view, 1048576);
        int i11 = this.f36017H0.get(i10, -1);
        if (i11 != -1) {
            X.h0(view, i11);
            this.f36017H0.delete(i10);
        }
    }

    private w l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.f36037a0 == null) {
            return;
        }
        X7.g gVar = new X7.g(this.f36037a0);
        this.f36021K = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f36022L;
        if (colorStateList != null) {
            this.f36021K.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f36021K.setTint(typedValue.data);
    }

    private void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.f36040d0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f36040d0.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> q0(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int r0(int i10, int i11, int i12, int i13) {
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

    private int v0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f36045i0;
        }
        if (i10 == 5) {
            return this.f36059w0;
        }
        if (i10 == 6) {
            return this.f36043g0;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float w0() {
        VelocityTracker velocityTracker = this.f36005B0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f36010E);
        return this.f36005B0.getYVelocity(this.f36009D0);
    }

    private boolean x0() {
        WeakReference<V> weakReference = this.f36060x0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f36060x0.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean y0() {
        return this.f36050n0 == 3 && (this.f36036Z || x0());
    }

    public boolean A0() {
        return this.f36047k0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v10, hVar.a());
        H0(hVar);
        int i10 = hVar.f36074D;
        if (i10 == 1 || i10 == 2) {
            this.f36050n0 = 4;
            this.f36051o0 = 4;
        } else {
            this.f36050n0 = i10;
            this.f36051o0 = i10;
        }
    }

    public boolean B0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v10) {
        return new h(super.C(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f36054r0 = 0;
        this.f36055s0 = false;
        return (i10 & 2) != 0;
    }

    public void E0(g gVar) {
        this.f36003A0.remove(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.X0(r0)
            return
        Lf:
            boolean r3 = r2.D0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f36062z0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f36055s0
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f36054r0
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f36006C
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f36043g0
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f36047k0
            if (r3 == 0) goto L49
            float r3 = r2.w0()
            boolean r3 = r2.b1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f36054r0
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f36006C
            if (r1 == 0) goto L68
            int r5 = r2.f36042f0
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f36045i0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f36043g0
            if (r3 >= r1) goto L7e
            int r1 = r2.f36045i0
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.c1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f36045i0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f36006C
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f36043g0
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f36045i0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.e1(r4, r0, r3)
            r2.f36055s0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36050n0 == 1 && actionMasked == 0) {
            return true;
        }
        if (a1()) {
            this.f36052p0.A(motionEvent);
        }
        if (actionMasked == 0) {
            G0();
        }
        if (this.f36005B0 == null) {
            this.f36005B0 = VelocityTracker.obtain();
        }
        this.f36005B0.addMovement(motionEvent);
        if (a1() && actionMasked == 2 && !this.f36053q0 && Math.abs(this.f36011E0 - motionEvent.getY()) > this.f36052p0.v()) {
            this.f36052p0.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f36053q0;
    }

    public void J0(boolean z10) {
        this.f36049m0 = z10;
    }

    public void K0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f36041e0 = i10;
        h1(this.f36050n0, true);
    }

    public void L0(boolean z10) {
        if (this.f36006C == z10) {
            return;
        }
        this.f36006C = z10;
        if (this.f36060x0 != null) {
            d0();
        }
        X0((this.f36006C && this.f36050n0 == 6) ? 3 : this.f36050n0);
        h1(this.f36050n0, true);
        f1();
    }

    public void M0(boolean z10) {
        this.f36026P = z10;
    }

    public void N0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f36044h0 = f10;
        if (this.f36060x0 != null) {
            f0();
        }
    }

    public void O0(boolean z10) {
        if (this.f36047k0 != z10) {
            this.f36047k0 = z10;
            if (!z10 && this.f36050n0 == 5) {
                W0(4);
            }
            f1();
        }
    }

    public void P0(int i10) {
        this.f36024N = i10;
    }

    public void Q0(int i10) {
        this.f36023M = i10;
    }

    public void R0(int i10) {
        S0(i10, false);
    }

    public final void S0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f36016H) {
                return;
            } else {
                this.f36016H = true;
            }
        } else {
            if (!this.f36016H && this.f36014G == i10) {
                return;
            }
            this.f36016H = false;
            this.f36014G = Math.max(0, i10);
        }
        j1(z10);
    }

    public void T0(int i10) {
        this.f36004B = i10;
    }

    public void U0(int i10) {
        this.f36012F = i10;
    }

    public void V0(boolean z10) {
        this.f36048l0 = z10;
    }

    public void W0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f36047k0 && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f36006C && v0(i10) <= this.f36042f0) ? 3 : i10;
        WeakReference<V> weakReference = this.f36060x0;
        if (weakReference == null || weakReference.get() == null) {
            X0(i10);
        } else {
            V v10 = this.f36060x0.get();
            I0(v10, new a(v10, i11));
        }
    }

    void X0(int i10) {
        V v10;
        if (this.f36050n0 == i10) {
            return;
        }
        this.f36050n0 = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f36047k0 && i10 == 5)) {
            this.f36051o0 = i10;
        }
        WeakReference<V> weakReference = this.f36060x0;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            i1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            i1(false);
        }
        h1(i10, true);
        for (int i11 = 0; i11 < this.f36003A0.size(); i11++) {
            this.f36003A0.get(i11).c(v10, i10);
        }
        f1();
    }

    public boolean Z0(long j10, float f10) {
        return false;
    }

    @Override // R7.b
    public void a(C2998b c2998b) {
        R7.f fVar = this.f36007C0;
        if (fVar == null) {
            return;
        }
        fVar.l(c2998b);
    }

    @Override // R7.b
    public void b() {
        R7.f fVar = this.f36007C0;
        if (fVar == null) {
            return;
        }
        C2998b c2998bC = fVar.c();
        if (c2998bC == null || Build.VERSION.SDK_INT < 34) {
            W0(this.f36047k0 ? 5 : 4);
        } else if (this.f36047k0) {
            this.f36007C0.h(c2998bC, new b());
        } else {
            this.f36007C0.i(c2998bC, null);
            W0(4);
        }
    }

    boolean b1(View view, float f10) {
        if (this.f36048l0) {
            return true;
        }
        if (B0() && view.getTop() >= this.f36045i0) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f36056t0)) - ((float) this.f36045i0)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    @Override // R7.b
    public void c(C2998b c2998b) {
        R7.f fVar = this.f36007C0;
        if (fVar == null) {
            return;
        }
        fVar.j(c2998b);
    }

    public void c0(g gVar) {
        if (this.f36003A0.contains(gVar)) {
            return;
        }
        this.f36003A0.add(gVar);
    }

    public boolean c1() {
        return false;
    }

    @Override // R7.b
    public void d() {
        R7.f fVar = this.f36007C0;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    public boolean d1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f36060x0 = null;
        this.f36052p0 = null;
        this.f36007C0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f36060x0 = null;
        this.f36052p0 = null;
        this.f36007C0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i10;
        z1.d dVar;
        if (!v10.isShown() || !this.f36049m0) {
            this.f36053q0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            G0();
        }
        if (this.f36005B0 == null) {
            this.f36005B0 = VelocityTracker.obtain();
        }
        this.f36005B0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f36011E0 = (int) motionEvent.getY();
            if (this.f36050n0 != 2) {
                WeakReference<View> weakReference = this.f36062z0;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x10, this.f36011E0)) {
                    this.f36009D0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f36013F0 = true;
                }
            }
            this.f36053q0 = this.f36009D0 == -1 && !coordinatorLayout.B(v10, x10, this.f36011E0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36013F0 = false;
            this.f36009D0 = -1;
            if (this.f36053q0) {
                this.f36053q0 = false;
                return false;
            }
        }
        if (!this.f36053q0 && (dVar = this.f36052p0) != null && dVar.H(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f36062z0;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f36053q0 || this.f36050n0 == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f36052p0 == null || (i10 = this.f36011E0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f36052p0.v())) ? false : true;
    }

    void o0(int i10) {
        V v10 = this.f36060x0.get();
        if (v10 == null || this.f36003A0.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.f36003A0.size(); i11++) {
            this.f36003A0.get(i11).b(v10, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (X.w(coordinatorLayout) && !X.w(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f36060x0 == null) {
            this.f36018I = coordinatorLayout.getResources().getDimensionPixelSize(C7.e.f2393h);
            Y0(v10);
            X.J0(v10, new com.google.android.material.bottomsheet.c(v10));
            this.f36060x0 = new WeakReference<>(v10);
            this.f36007C0 = new R7.f(v10);
            X7.g gVar = this.f36021K;
            if (gVar != null) {
                X.r0(v10, gVar);
                X7.g gVar2 = this.f36021K;
                float fU = this.f36046j0;
                if (fU == -1.0f) {
                    fU = X.u(v10);
                }
                gVar2.a0(fU);
            } else {
                ColorStateList colorStateList = this.f36022L;
                if (colorStateList != null) {
                    X.s0(v10, colorStateList);
                }
            }
            f1();
            if (X.x(v10) == 0) {
                X.x0(v10, 1);
            }
        }
        if (this.f36052p0 == null) {
            this.f36052p0 = z1.d.n(coordinatorLayout, this.f36019I0);
        }
        int top = v10.getTop();
        coordinatorLayout.I(v10, i10);
        this.f36058v0 = coordinatorLayout.getWidth();
        this.f36059w0 = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f36057u0 = height;
        int iMin = this.f36059w0;
        int i11 = iMin - height;
        int i12 = this.f36035Y;
        if (i11 < i12) {
            if (this.f36030T) {
                int i13 = this.f36024N;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f36057u0 = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f36024N;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f36057u0 = iMin2;
            }
        }
        this.f36042f0 = Math.max(0, this.f36059w0 - this.f36057u0);
        f0();
        d0();
        int i15 = this.f36050n0;
        if (i15 == 3) {
            X.Y(v10, s0());
        } else if (i15 == 6) {
            X.Y(v10, this.f36043g0);
        } else if (this.f36047k0 && i15 == 5) {
            X.Y(v10, this.f36059w0);
        } else if (i15 == 4) {
            X.Y(v10, this.f36045i0);
        } else if (i15 == 1 || i15 == 2) {
            X.Y(v10, top - v10.getTop());
        }
        h1(this.f36050n0, false);
        this.f36062z0 = new WeakReference<>(p0(v10));
        for (int i16 = 0; i16 < this.f36003A0.size(); i16++) {
            this.f36003A0.get(i16).a(v10);
        }
        return true;
    }

    View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (X.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewP0 = p0(viewGroup.getChildAt(i10));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f36023M, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f36024N, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (D0() && (weakReference = this.f36062z0) != null && view == weakReference.get()) {
            return this.f36050n0 != 3 || super.s(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    public int s0() {
        if (this.f36006C) {
            return this.f36042f0;
        }
        return Math.max(this.f36041e0, this.f36030T ? 0 : this.f36035Y);
    }

    X7.g t0() {
        return this.f36021K;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f36062z0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!D0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    X.Y(v10, -iS0);
                    X0(3);
                } else {
                    if (!this.f36049m0) {
                        return;
                    }
                    iArr[1] = i11;
                    X.Y(v10, -i11);
                    X0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f36045i0 && !j0()) {
                    int i14 = top - this.f36045i0;
                    iArr[1] = i14;
                    X.Y(v10, -i14);
                    X0(4);
                } else {
                    if (!this.f36049m0) {
                        return;
                    }
                    iArr[1] = i11;
                    X.Y(v10, -i11);
                    X0(1);
                }
            }
            o0(v10.getTop());
            this.f36054r0 = i11;
            this.f36055s0 = true;
        }
    }

    public int u0() {
        return this.f36050n0;
    }

    public boolean z0() {
        return this.f36026P;
    }

    private class i {

        /* renamed from: a, reason: collision with root package name */
        private int f36079a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36080b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f36081c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f36080b = false;
                z1.d dVar = BottomSheetBehavior.this.f36052p0;
                if (dVar != null && dVar.l(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f36079a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f36050n0 == 2) {
                    bottomSheetBehavior.X0(iVar2.f36079a);
                }
            }
        }

        private i() {
            this.f36081c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f36060x0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f36079a = i10;
            if (this.f36080b) {
                return;
            }
            X.f0(BottomSheetBehavior.this.f36060x0.get(), this.f36081c);
            this.f36080b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class h extends AbstractC5121a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        final int f36074D;

        /* renamed from: E, reason: collision with root package name */
        int f36075E;

        /* renamed from: F, reason: collision with root package name */
        boolean f36076F;

        /* renamed from: G, reason: collision with root package name */
        boolean f36077G;

        /* renamed from: H, reason: collision with root package name */
        boolean f36078H;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36074D = parcel.readInt();
            this.f36075E = parcel.readInt();
            this.f36076F = parcel.readInt() == 1;
            this.f36077G = parcel.readInt() == 1;
            this.f36078H = parcel.readInt() == 1;
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f36074D);
            parcel.writeInt(this.f36075E);
            parcel.writeInt(this.f36076F ? 1 : 0);
            parcel.writeInt(this.f36077G ? 1 : 0);
            parcel.writeInt(this.f36078H ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f36074D = bottomSheetBehavior.f36050n0;
            this.f36075E = ((BottomSheetBehavior) bottomSheetBehavior).f36014G;
            this.f36076F = ((BottomSheetBehavior) bottomSheetBehavior).f36006C;
            this.f36077G = bottomSheetBehavior.f36047k0;
            this.f36078H = ((BottomSheetBehavior) bottomSheetBehavior).f36048l0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f36004B = 0;
        this.f36006C = true;
        this.f36008D = false;
        this.f36023M = -1;
        this.f36024N = -1;
        this.f36039c0 = new i(this, null);
        this.f36044h0 = 0.5f;
        this.f36046j0 = -1.0f;
        this.f36049m0 = true;
        this.f36050n0 = 4;
        this.f36051o0 = 4;
        this.f36056t0 = 0.1f;
        this.f36003A0 = new ArrayList<>();
        this.f36011E0 = -1;
        this.f36017H0 = new SparseIntArray();
        this.f36019I0 = new e();
        this.f36020J = context.getResources().getDimensionPixelSize(C7.e.f2412q0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f3092w0);
        int i11 = m.f2591A0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f36022L = U7.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f2771S0)) {
            this.f36037a0 = k.e(context, attributeSet, C7.c.f2313f, f36002J0).m();
        }
        m0(context);
        n0();
        this.f36046j0 = typedArrayObtainStyledAttributes.getDimension(m.f3122z0, -1.0f);
        int i12 = m.f3102x0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = m.f3112y0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            P0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = m.f2651G0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            R0(i10);
        } else {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        O0(typedArrayObtainStyledAttributes.getBoolean(m.f2641F0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(m.f2691K0, false));
        L0(typedArrayObtainStyledAttributes.getBoolean(m.f2621D0, true));
        V0(typedArrayObtainStyledAttributes.getBoolean(m.f2681J0, false));
        J0(typedArrayObtainStyledAttributes.getBoolean(m.f2601B0, true));
        T0(typedArrayObtainStyledAttributes.getInt(m.f2661H0, 0));
        N0(typedArrayObtainStyledAttributes.getFloat(m.f2631E0, 0.5f));
        int i15 = m.f2611C0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            K0(typedValuePeekValue2.data);
        } else {
            K0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        U0(typedArrayObtainStyledAttributes.getInt(m.f2671I0, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE));
        this.f36027Q = typedArrayObtainStyledAttributes.getBoolean(m.f2731O0, false);
        this.f36028R = typedArrayObtainStyledAttributes.getBoolean(m.f2741P0, false);
        this.f36029S = typedArrayObtainStyledAttributes.getBoolean(m.f2751Q0, false);
        this.f36030T = typedArrayObtainStyledAttributes.getBoolean(m.f2761R0, true);
        this.f36031U = typedArrayObtainStyledAttributes.getBoolean(m.f2701L0, false);
        this.f36032V = typedArrayObtainStyledAttributes.getBoolean(m.f2711M0, false);
        this.f36033W = typedArrayObtainStyledAttributes.getBoolean(m.f2721N0, false);
        this.f36036Z = typedArrayObtainStyledAttributes.getBoolean(m.f2781T0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f36010E = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class g {
        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);

        void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
