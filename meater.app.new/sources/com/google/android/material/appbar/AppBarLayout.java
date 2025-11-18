package com.google.android.material.appbar;

import C7.l;
import C7.m;
import R7.i;
import X7.h;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b8.C2272a;
import com.google.android.material.internal.r;
import j.C3699a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.C3784a;
import m1.C3946a;
import r1.C4337d;
import s1.C;
import s1.C4421a;
import s1.C4469y0;
import s1.I;
import s1.X;
import t1.t;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: d0, reason: collision with root package name */
    private static final int f35823d0 = l.f2571h;

    /* renamed from: B, reason: collision with root package name */
    private int f35824B;

    /* renamed from: C, reason: collision with root package name */
    private int f35825C;

    /* renamed from: D, reason: collision with root package name */
    private int f35826D;

    /* renamed from: E, reason: collision with root package name */
    private int f35827E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f35828F;

    /* renamed from: G, reason: collision with root package name */
    private int f35829G;

    /* renamed from: H, reason: collision with root package name */
    private C4469y0 f35830H;

    /* renamed from: I, reason: collision with root package name */
    private List<b> f35831I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f35832J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f35833K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f35834L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f35835M;

    /* renamed from: N, reason: collision with root package name */
    private int f35836N;

    /* renamed from: O, reason: collision with root package name */
    private WeakReference<View> f35837O;

    /* renamed from: P, reason: collision with root package name */
    private final boolean f35838P;

    /* renamed from: Q, reason: collision with root package name */
    private ValueAnimator f35839Q;

    /* renamed from: R, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f35840R;

    /* renamed from: S, reason: collision with root package name */
    private final List<f> f35841S;

    /* renamed from: T, reason: collision with root package name */
    private final long f35842T;

    /* renamed from: U, reason: collision with root package name */
    private final TimeInterpolator f35843U;

    /* renamed from: V, reason: collision with root package name */
    private int[] f35844V;

    /* renamed from: W, reason: collision with root package name */
    private Drawable f35845W;

    /* renamed from: a0, reason: collision with root package name */
    private Integer f35846a0;

    /* renamed from: b0, reason: collision with root package name */
    private final float f35847b0;

    /* renamed from: c0, reason: collision with root package name */
    private Behavior f35848c0;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c<T> {

        /* renamed from: L, reason: collision with root package name */
        private int f35849L;

        /* renamed from: M, reason: collision with root package name */
        private int f35850M;

        /* renamed from: N, reason: collision with root package name */
        private ValueAnimator f35851N;

        /* renamed from: O, reason: collision with root package name */
        private c f35852O;

        /* renamed from: P, reason: collision with root package name */
        private WeakReference<View> f35853P;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f35854a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f35855b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f35854a = coordinatorLayout;
                this.f35855b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f35854a, this.f35855b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C4421a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f35857d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f35858e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f35857d = appBarLayout;
                this.f35858e = coordinatorLayout;
            }

            @Override // s1.C4421a
            public void g(View view, t tVar) {
                View viewJ0;
                super.g(view, tVar);
                tVar.h0(ScrollView.class.getName());
                if (this.f35857d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f35858e)) == null || !BaseBehavior.this.f0(this.f35857d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f35857d.getTotalScrollRange())) {
                    tVar.b(t.a.f49790q);
                    tVar.K0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        tVar.b(t.a.f49791r);
                        tVar.K0(true);
                    } else if ((-this.f35857d.getDownNestedPreScrollRange()) != 0) {
                        tVar.b(t.a.f49791r);
                        tVar.K0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s1.C4421a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f35857d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f35858e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f35857d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f35857d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f35858e, this.f35857d, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(t10, iQ);
            if (iI0 >= 0) {
                View childAt = t10.getChildAt(iI0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iI0 == 0 && X.w(t10) && X.w(childAt)) {
                        topInset2 -= t10.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iA += X.A(childAt);
                    } else if (e0(iC, 5)) {
                        int iA2 = X.A(childAt) + iA;
                        if (iQ < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t10, C3946a.b(b0(iQ, iA, topInset2) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View viewH0 = h0(t10, i10);
            boolean zB = false;
            if (viewH0 != null) {
                int iC = ((e) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = X.A(viewH0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - iA) - t10.getTopInset()) : (-i10) >= (viewH0.getBottom() - iA) - t10.getTopInset()) {
                        zB = true;
                    }
                }
            }
            if (t10.o()) {
                zB = t10.B(g0(coordinatorLayout));
            }
            boolean zY = t10.y(zB);
            if (z10 || (zY && z0(coordinatorLayout, t10))) {
                if (t10.getBackground() != null) {
                    t10.getBackground().jumpToCurrentState();
                }
                if (t10.getForeground() != null) {
                    t10.getForeground().jumpToCurrentState();
                }
                if (t10.getStateListAnimator() != null) {
                    t10.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t10) {
            if (X.M(coordinatorLayout)) {
                return;
            }
            X.n0(coordinatorLayout, new b(t10, coordinatorLayout));
        }

        private void Z(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            a0(coordinatorLayout, t10, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t10.getHeight()) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f35851N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f35851N.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f35851N;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f35851N = valueAnimator3;
                valueAnimator3.setInterpolator(D7.a.f3490e);
                this.f35851N.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f35851N.setDuration(Math.min(i11, 600));
            this.f35851N.setIntValues(iQ, i10);
            this.f35851N.start();
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.k() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f35868a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof C) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(T t10, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (interpolatorD != null) {
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= X.A(childAt);
                        }
                    }
                    if (X.w(childAt)) {
                        topInset -= t10.getTopInset();
                    }
                    if (topInset > 0) {
                        float f10 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> listS = coordinatorLayout.s(t10);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listS.get(i10).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.c
        int Q() {
            return I() + this.f35849L;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t10) {
            WeakReference<View> weakReference = this.f35853P;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(T t10) {
            return (-t10.getDownNestedScrollRange()) + t10.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(T t10) {
            return t10.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, T t10) {
            A0(coordinatorLayout, t10);
            if (t10.o()) {
                t10.y(t10.B(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            boolean zP = super.p(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            c cVar = this.f35852O;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (cVar.f35860D) {
                T(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (cVar.f35861E) {
                T(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(cVar.f35862F);
                T(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f35852O.f35864H ? X.A(childAt) + t10.getTopInset() : Math.round(childAt.getHeight() * this.f35852O.f35863G)));
            }
            t10.u();
            this.f35852O = null;
            K(C3946a.b(I(), -t10.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t10, I(), 0, true);
            t10.s(I());
            Y(coordinatorLayout, t10);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.J(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int downNestedPreScrollRange;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    downNestedPreScrollRange = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    iArr[1] = S(coordinatorLayout, t10, i11, i14, i15);
                }
            }
            if (t10.o()) {
                t10.y(t10.B(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = S(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                Y(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, t10, this.f35852O.a());
            } else {
                super.B(coordinatorLayout, t10, parcelable);
                this.f35852O = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable parcelableC = super.C(coordinatorLayout, t10);
            c cVarX0 = x0(parcelableC, t10);
            return cVarX0 == null ? parcelableC : cVarX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.o() || d0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f35851N) != null) {
                valueAnimator.cancel();
            }
            this.f35853P = null;
            this.f35850M = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f35850M == 0 || i10 == 1) {
                A0(coordinatorLayout, t10);
                if (t10.o()) {
                    t10.y(t10.B(view));
                }
            }
            this.f35853P = new WeakReference<>(view);
        }

        void w0(c cVar, boolean z10) {
            if (this.f35852O == null || z10) {
                this.f35852O = cVar;
            }
        }

        c x0(Parcelable parcelable, T t10) {
            int I10 = I();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + I10;
                if (childAt.getTop() + I10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC5121a.f53100C;
                    }
                    c cVar = new c(parcelable);
                    boolean z10 = I10 == 0;
                    cVar.f35861E = z10;
                    cVar.f35860D = !z10 && (-I10) >= t10.getTotalScrollRange();
                    cVar.f35862F = i10;
                    cVar.f35864H = bottom == X.A(childAt) + t10.getTopInset();
                    cVar.f35863G = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int iQ = Q();
            int i13 = 0;
            if (i11 == 0 || iQ < i11 || iQ > i12) {
                this.f35849L = 0;
            } else {
                int iB = C3946a.b(i10, i11, i12);
                if (iQ != iB) {
                    int iM0 = t10.i() ? m0(t10, iB) : iB;
                    boolean zK = K(iM0);
                    int i14 = iQ - iB;
                    this.f35849L = iB - iM0;
                    if (zK) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(t10, t10.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && t10.i()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.s(I());
                    B0(coordinatorLayout, t10, iB, iB < iQ ? -1 : 1, false);
                    i13 = i14;
                }
            }
            Y(coordinatorLayout, t10);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends AbstractC5121a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: D, reason: collision with root package name */
            boolean f35860D;

            /* renamed from: E, reason: collision with root package name */
            boolean f35861E;

            /* renamed from: F, reason: collision with root package name */
            int f35862F;

            /* renamed from: G, reason: collision with root package name */
            float f35863G;

            /* renamed from: H, reason: collision with root package name */
            boolean f35864H;

            class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
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
                this.f35860D = parcel.readByte() != 0;
                this.f35861E = parcel.readByte() != 0;
                this.f35862F = parcel.readInt();
                this.f35863G = parcel.readFloat();
                this.f35864H = parcel.readByte() != 0;
            }

            @Override // y1.AbstractC5121a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f35860D ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f35861E ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f35862F);
                parcel.writeFloat(this.f35863G);
                parcel.writeByte(this.f35864H ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                X.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f35849L) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.r(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f35895E;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.v(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                X.n0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2868b6);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f2879c6, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements I {
        a() {
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) {
            return AppBarLayout.this.t(c4469y0);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f35866a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f35867b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f35866a, appBarLayout, view);
            float fAbs = this.f35866a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                X.u0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - C3946a.a(Math.abs(fAbs / this.f35866a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f35866a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f35867b);
            this.f35867b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f35867b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            X.u0(view, this.f35867b);
        }
    }

    public interface f {
        void a(float f10, int i10);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2303a);
    }

    private boolean A() {
        return this.f35845W != null && getTopInset() > 0;
    }

    private boolean C() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || X.w(childAt)) ? false : true;
    }

    private void D(float f10, float f11) {
        ValueAnimator valueAnimator = this.f35839Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f35839Q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f35842T);
        this.f35839Q.setInterpolator(this.f35843U);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f35840R;
        if (animatorUpdateListener != null) {
            this.f35839Q.addUpdateListener(animatorUpdateListener);
        }
        this.f35839Q.start();
    }

    private void E() {
        setWillNotDraw(!A());
    }

    private void c() {
        WeakReference<View> weakReference = this.f35837O;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f35837O = null;
    }

    private Integer d() {
        Drawable drawable = this.f35845W;
        if (drawable instanceof X7.g) {
            return Integer.valueOf(((X7.g) drawable).A());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f35837O == null && (i10 = this.f35836N) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f35836N);
            }
            if (viewFindViewById != null) {
                this.f35837O = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f35837O;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final X7.g gVar, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numF = M7.a.f(getContext(), C7.c.f2331p);
        this.f35840R = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f35878a.q(colorStateList, colorStateList2, gVar, numF, valueAnimator);
            }
        };
        X.r0(this, gVar);
    }

    private void m(Context context, final X7.g gVar) {
        gVar.Q(context);
        this.f35840R = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f35883a.r(gVar, valueAnimator);
            }
        };
        X.r0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.f35848c0;
        BaseBehavior.c cVarX0 = (behavior == null || this.f35825C == -1 || this.f35829G != 0) ? null : behavior.x0(AbstractC5121a.f53100C, this);
        this.f35825C = -1;
        this.f35826D = -1;
        this.f35827E = -1;
        if (cVarX0 != null) {
            this.f35848c0.w0(cVarX0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof X7.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ColorStateList colorStateList, ColorStateList colorStateList2, X7.g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iJ = M7.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.b0(ColorStateList.valueOf(iJ));
        if (this.f35845W != null && (num2 = this.f35846a0) != null && num2.equals(num)) {
            C3784a.n(this.f35845W, iJ);
        }
        if (this.f35841S.isEmpty()) {
            return;
        }
        for (f fVar : this.f35841S) {
            if (gVar.x() != null) {
                fVar.a(0.0f, iJ);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(X7.g gVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.a0(fFloatValue);
        Drawable drawable = this.f35845W;
        if (drawable instanceof X7.g) {
            ((X7.g) drawable).a0(fFloatValue);
        }
        Iterator<f> it = this.f35841S.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, gVar.A());
        }
    }

    private void w(boolean z10, boolean z11, boolean z12) {
        this.f35829G = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean x(boolean z10) {
        if (this.f35833K == z10) {
            return false;
        }
        this.f35833K = z10;
        refreshDrawableState();
        return true;
    }

    boolean B(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (A()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f35824B);
            this.f35845W.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f35845W;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f35848c0 = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i10 = this.f35826D;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f35868a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iA = X.A(childAt);
                    } else if ((i12 & 2) != 0) {
                        iA = measuredHeight - X.A(childAt);
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && X.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f35826D = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f35827E;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iA = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i12 = eVar.f35868a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i12 & 2) != 0) {
                    iA -= X.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iA);
        this.f35827E = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f35836N;
    }

    public X7.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof X7.g) {
            return (X7.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = X.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? X.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getPendingAction() {
        return this.f35829G;
    }

    public Drawable getStatusBarForeground() {
        return this.f35845W;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C4469y0 c4469y0 = this.f35830H;
        if (c4469y0 != null) {
            return c4469y0.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f35825C;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iA = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f35868a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && X.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iA -= X.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iA);
        this.f35825C = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean i() {
        return this.f35828F;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f35835M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f35844V == null) {
            this.f35844V = new int[4];
        }
        int[] iArr = this.f35844V;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f35833K;
        int i11 = C7.c.f2312e0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f35834L) ? C7.c.f2314f0 : -C7.c.f2314f0;
        int i12 = C7.c.f2304a0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f35834L) ? C7.c.f2302Z : -C7.c.f2302Z;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (X.w(this) && C()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                X.Y(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f35828F = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f35828F = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f35845W;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f35832J) {
            return;
        }
        if (!this.f35835M && !j()) {
            z11 = false;
        }
        x(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && X.w(this) && C()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C3946a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    void s(int i10) {
        this.f35824B = i10;
        if (!willNotDraw()) {
            X.e0(this);
        }
        List<b> list = this.f35831I;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f35831I.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        v(z10, X.R(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f35835M = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f35836N = -1;
        if (view == null) {
            c();
        } else {
            this.f35837O = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f35836N = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f35832J = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f35845W;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f35845W = drawable != null ? drawable.mutate() : null;
            this.f35846a0 = d();
            Drawable drawable3 = this.f35845W;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f35845W.setState(getDrawableState());
                }
                C3784a.m(this.f35845W, X.z(this));
                this.f35845W.setVisible(getVisibility() == 0, false);
                this.f35845W.setCallback(this);
            }
            E();
            X.e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C3699a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        g.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f35845W;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    C4469y0 t(C4469y0 c4469y0) {
        C4469y0 c4469y02 = X.w(this) ? c4469y0 : null;
        if (!C4337d.a(this.f35830H, c4469y02)) {
            this.f35830H = c4469y02;
            E();
            requestLayout();
        }
        return c4469y0;
    }

    void u() {
        this.f35829G = 0;
    }

    public void v(boolean z10, boolean z11) {
        w(z10, z11, true);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f35845W;
    }

    boolean y(boolean z10) {
        return z(z10, !this.f35832J);
    }

    boolean z(boolean z10, boolean z11) {
        if (!z11 || this.f35834L == z10) {
            return false;
        }
        this.f35834L = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.f35838P) {
            D(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f35835M) {
            return true;
        }
        D(z10 ? 0.0f : this.f35847b0, z10 ? this.f35847b0 : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f35823d0;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f35825C = -1;
        this.f35826D = -1;
        this.f35827E = -1;
        this.f35829G = 0;
        this.f35841S = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            g.a(this);
        }
        g.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f2960k, i10, i11, new int[0]);
        X.r0(this, typedArrayI.getDrawable(m.f2971l));
        ColorStateList colorStateListA = U7.c.a(context2, typedArrayI, m.f3037r);
        this.f35838P = colorStateListA != null;
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            X7.g gVar = new X7.g();
            gVar.b0(colorStateListF);
            if (colorStateListA != null) {
                l(gVar, colorStateListF, colorStateListA);
            } else {
                m(context2, gVar);
            }
        }
        this.f35842T = i.f(context2, C7.c.f2284H, getResources().getInteger(C7.h.f2500a));
        this.f35843U = i.g(context2, C7.c.f2296T, D7.a.f3486a);
        int i12 = m.f3015p;
        if (typedArrayI.hasValue(i12)) {
            w(typedArrayI.getBoolean(i12, false), false, false);
        }
        if (typedArrayI.hasValue(m.f3004o)) {
            g.b(this, typedArrayI.getDimensionPixelSize(r12, 0));
        }
        int i13 = m.f2993n;
        if (typedArrayI.hasValue(i13)) {
            setKeyboardNavigationCluster(typedArrayI.getBoolean(i13, false));
        }
        int i14 = m.f2982m;
        if (typedArrayI.hasValue(i14)) {
            setTouchscreenBlocksFocus(typedArrayI.getBoolean(i14, false));
        }
        this.f35847b0 = getResources().getDimension(C7.e.f2379a);
        this.f35835M = typedArrayI.getBoolean(m.f3026q, false);
        this.f35836N = typedArrayI.getResourceId(m.f3048s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(m.f3059t));
        typedArrayI.recycle();
        X.B0(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f35868a;

        /* renamed from: b, reason: collision with root package name */
        private c f35869b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f35870c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f35868a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f3081v);
            this.f35868a = typedArrayObtainStyledAttributes.getInt(m.f3101x, 0);
            f(typedArrayObtainStyledAttributes.getInt(m.f3091w, 0));
            int i10 = m.f3111y;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f35870c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f35869b;
        }

        public int c() {
            return this.f35868a;
        }

        public Interpolator d() {
            return this.f35870c;
        }

        boolean e() {
            int i10 = this.f35868a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f35869b = a(i10);
        }

        public void g(int i10) {
            this.f35868a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f35868a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f35868a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f35868a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f35868a = 1;
        }
    }
}
