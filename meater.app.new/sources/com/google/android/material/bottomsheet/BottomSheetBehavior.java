package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.InterfaceC0292f;
import androidx.customview.view.AbsSavedState;
import cm.aptoide.p092pt.file.CacheHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p024c.p052i.p056g.C0937a;
import p024c.p062k.p063a.C0966c;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {

    /* renamed from: a */
    private static final int f29831a = C8917k.f33984i;

    /* renamed from: A */
    private boolean f29832A;

    /* renamed from: B */
    private int f29833B;

    /* renamed from: C */
    private boolean f29834C;

    /* renamed from: D */
    int f29835D;

    /* renamed from: E */
    int f29836E;

    /* renamed from: F */
    WeakReference<V> f29837F;

    /* renamed from: G */
    WeakReference<View> f29838G;

    /* renamed from: H */
    private final ArrayList<AbstractC7968e> f29839H;

    /* renamed from: I */
    private VelocityTracker f29840I;

    /* renamed from: J */
    int f29841J;

    /* renamed from: K */
    private int f29842K;

    /* renamed from: L */
    boolean f29843L;

    /* renamed from: M */
    private Map<View, Integer> f29844M;

    /* renamed from: N */
    private final C0966c.c f29845N;

    /* renamed from: b */
    private int f29846b;

    /* renamed from: c */
    private boolean f29847c;

    /* renamed from: d */
    private boolean f29848d;

    /* renamed from: e */
    private float f29849e;

    /* renamed from: f */
    private int f29850f;

    /* renamed from: g */
    private boolean f29851g;

    /* renamed from: h */
    private int f29852h;

    /* renamed from: i */
    private boolean f29853i;

    /* renamed from: j */
    private C8900g f29854j;

    /* renamed from: k */
    private boolean f29855k;

    /* renamed from: l */
    private C8904k f29856l;

    /* renamed from: m */
    private boolean f29857m;

    /* renamed from: n */
    private BottomSheetBehavior<V>.RunnableC7969f f29858n;

    /* renamed from: o */
    private ValueAnimator f29859o;

    /* renamed from: p */
    int f29860p;

    /* renamed from: q */
    int f29861q;

    /* renamed from: r */
    int f29862r;

    /* renamed from: s */
    float f29863s;

    /* renamed from: t */
    int f29864t;

    /* renamed from: u */
    float f29865u;

    /* renamed from: v */
    boolean f29866v;

    /* renamed from: w */
    private boolean f29867w;

    /* renamed from: x */
    private boolean f29868x;

    /* renamed from: y */
    int f29869y;

    /* renamed from: z */
    C0966c f29870z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class RunnableC7964a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f29876f;

        /* renamed from: g */
        final /* synthetic */ int f29877g;

        RunnableC7964a(View view, int i2) {
            this.f29876f = view;
            this.f29877g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m24008o0(this.f29876f, this.f29877g);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C7965b implements ValueAnimator.AnimatorUpdateListener {
        C7965b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f29854j != null) {
                BottomSheetBehavior.this.f29854j.m28285Y(fFloatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C7966c extends C0966c.c {
        C7966c() {
        }

        /* renamed from: n */
        private boolean m24014n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f29836E + bottomSheetBehavior.m23992U()) / 2;
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: a */
        public int mo6164a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: b */
        public int mo6165b(View view, int i2, int i3) {
            int iM23992U = BottomSheetBehavior.this.m23992U();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0937a.m5966b(i2, iM23992U, bottomSheetBehavior.f29866v ? bottomSheetBehavior.f29836E : bottomSheetBehavior.f29864t);
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: e */
        public int mo6168e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f29866v ? bottomSheetBehavior.f29836E : bottomSheetBehavior.f29864t;
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: j */
        public void mo6173j(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.f29868x) {
                BottomSheetBehavior.this.m24007m0(1);
            }
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: k */
        public void mo6174k(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.m23990R(i3);
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: l */
        public void mo6175l(View view, float f2, float f3) {
            int i2;
            int i3 = 4;
            if (f3 < 0.0f) {
                if (BottomSheetBehavior.this.f29847c) {
                    i2 = BottomSheetBehavior.this.f29861q;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i4 = bottomSheetBehavior.f29862r;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = bottomSheetBehavior.f29860p;
                    }
                }
                i3 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f29866v && bottomSheetBehavior2.m24009q0(view, f3)) {
                    if ((Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) && !m24014n(view)) {
                        if (BottomSheetBehavior.this.f29847c) {
                            i2 = BottomSheetBehavior.this.f29861q;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f29860p) < Math.abs(view.getTop() - BottomSheetBehavior.this.f29862r)) {
                            i2 = BottomSheetBehavior.this.f29860p;
                        } else {
                            i2 = BottomSheetBehavior.this.f29862r;
                            i3 = 6;
                        }
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.f29836E;
                        i3 = 5;
                    }
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f29847c) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i5 = bottomSheetBehavior3.f29862r;
                        if (top2 < i5) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.f29864t)) {
                                i2 = BottomSheetBehavior.this.f29860p;
                                i3 = 3;
                            } else {
                                i2 = BottomSheetBehavior.this.f29862r;
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - BottomSheetBehavior.this.f29864t)) {
                            i2 = BottomSheetBehavior.this.f29862r;
                        } else {
                            i2 = BottomSheetBehavior.this.f29864t;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.f29861q) < Math.abs(top2 - BottomSheetBehavior.this.f29864t)) {
                        i2 = BottomSheetBehavior.this.f29861q;
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.f29864t;
                    }
                } else if (BottomSheetBehavior.this.f29847c) {
                    i2 = BottomSheetBehavior.this.f29864t;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - BottomSheetBehavior.this.f29862r) < Math.abs(top3 - BottomSheetBehavior.this.f29864t)) {
                        i2 = BottomSheetBehavior.this.f29862r;
                        i3 = 6;
                    } else {
                        i2 = BottomSheetBehavior.this.f29864t;
                    }
                }
            }
            BottomSheetBehavior.this.m24010r0(view, i3, i2, true);
        }

        @Override // p024c.p062k.p063a.C0966c.c
        /* renamed from: m */
        public boolean mo6176m(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.f29869y;
            if (i3 == 1 || bottomSheetBehavior.f29843L) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.f29841J == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.f29838G;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f29837F;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C7967d implements InterfaceC0292f {

        /* renamed from: a */
        final /* synthetic */ int f29881a;

        C7967d(int i2) {
            this.f29881a = i2;
        }

        @Override // androidx.core.view.p004d0.InterfaceC0292f
        /* renamed from: a */
        public boolean mo2032a(View view, InterfaceC0292f.a aVar) {
            BottomSheetBehavior.this.m24006l0(this.f29881a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class AbstractC7968e {
        public abstract void onSlide(View view, float f2);

        public abstract void onStateChanged(View view, int i2);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    private class RunnableC7969f implements Runnable {

        /* renamed from: f */
        private final View f29883f;

        /* renamed from: g */
        private boolean f29884g;

        /* renamed from: h */
        int f29885h;

        RunnableC7969f(View view, int i2) {
            this.f29883f = view;
            this.f29885h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0966c c0966c = BottomSheetBehavior.this.f29870z;
            if (c0966c == null || !c0966c.m6157k(true)) {
                BottomSheetBehavior.this.m24007m0(this.f29885h);
            } else {
                C0311u.m2115a0(this.f29883f, this);
            }
            this.f29884g = false;
        }
    }

    public BottomSheetBehavior() {
        this.f29846b = 0;
        this.f29847c = true;
        this.f29848d = false;
        this.f29858n = null;
        this.f29863s = 0.5f;
        this.f29865u = -1.0f;
        this.f29868x = true;
        this.f29869y = 4;
        this.f29839H = new ArrayList<>();
        this.f29845N = new C7966c();
    }

    /* renamed from: J */
    private void m23973J(V v, C0289c.a aVar, int i2) {
        C0311u.m2123e0(v, aVar, null, new C7967d(i2));
    }

    /* renamed from: L */
    private void m23974L() {
        int iM23976N = m23976N();
        if (this.f29847c) {
            this.f29864t = Math.max(this.f29836E - iM23976N, this.f29861q);
        } else {
            this.f29864t = this.f29836E - iM23976N;
        }
    }

    /* renamed from: M */
    private void m23975M() {
        this.f29862r = (int) (this.f29836E * (1.0f - this.f29863s));
    }

    /* renamed from: N */
    private int m23976N() {
        return this.f29851g ? Math.max(this.f29852h, this.f29836E - ((this.f29835D * 9) / 16)) : this.f29850f;
    }

    /* renamed from: O */
    private void m23977O(Context context, AttributeSet attributeSet, boolean z) {
        m23978P(context, attributeSet, z, null);
    }

    /* renamed from: P */
    private void m23978P(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f29853i) {
            this.f29856l = C8904k.m28317e(context, attributeSet, C8908b.f33816f, f29831a).m28355m();
            C8900g c8900g = new C8900g(this.f29856l);
            this.f29854j = c8900g;
            c8900g.m28278N(context);
            if (z && colorStateList != null) {
                this.f29854j.m28284X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f29854j.setTint(typedValue.data);
        }
    }

    /* renamed from: Q */
    private void m23979Q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f29859o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f29859o.addUpdateListener(new C7965b());
    }

    /* renamed from: T */
    public static <V extends View> BottomSheetBehavior<V> m23980T(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0229f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC0226c abstractC0226cM1481f = ((CoordinatorLayout.C0229f) layoutParams).m1481f();
        if (abstractC0226cM1481f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0226cM1481f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* renamed from: W */
    private float m23981W() {
        VelocityTracker velocityTracker = this.f29840I;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f29849e);
        return this.f29840I.getYVelocity(this.f29841J);
    }

    /* renamed from: Y */
    private void m23982Y() {
        this.f29841J = -1;
        VelocityTracker velocityTracker = this.f29840I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29840I = null;
        }
    }

    /* renamed from: Z */
    private void m23983Z(SavedState savedState) {
        int i2 = this.f29846b;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f29850f = savedState.f29872i;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f29847c = savedState.f29873j;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.f29866v = savedState.f29874k;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.f29867w = savedState.f29875l;
        }
    }

    /* renamed from: n0 */
    private void m23984n0(CoordinatorLayout coordinatorLayout) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || m23994X() || (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) == null) {
            return;
        }
        this.f29850f += rootWindowInsets.getSystemGestureInsets().bottom;
    }

    /* renamed from: p0 */
    private void m23985p0(int i2) {
        V v = this.f29837F.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C0311u.m2101N(v)) {
            v.post(new RunnableC7964a(v, i2));
        } else {
            m24008o0(v, i2);
        }
    }

    /* renamed from: s0 */
    private void m23986s0() {
        V v;
        WeakReference<V> weakReference = this.f29837F;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0311u.m2119c0(v, 524288);
        C0311u.m2119c0(v, 262144);
        C0311u.m2119c0(v, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        if (this.f29866v && this.f29869y != 5) {
            m23973J(v, C0289c.a.f2368u, 5);
        }
        int i2 = this.f29869y;
        if (i2 == 3) {
            m23973J(v, C0289c.a.f2367t, this.f29847c ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            m23973J(v, C0289c.a.f2366s, this.f29847c ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            m23973J(v, C0289c.a.f2367t, 4);
            m23973J(v, C0289c.a.f2366s, 3);
        }
    }

    /* renamed from: t0 */
    private void m23987t0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.f29857m != z) {
            this.f29857m = z;
            if (this.f29854j == null || (valueAnimator = this.f29859o) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f29859o.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.f29859o.setFloatValues(1.0f - f2, f2);
            this.f29859o.start();
        }
    }

    /* renamed from: u0 */
    private void m23988u0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f29837F;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f29844M != null) {
                    return;
                } else {
                    this.f29844M = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f29837F.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f29844M.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f29848d) {
                            C0311u.m2153t0(childAt, 4);
                        }
                    } else if (this.f29848d && (map = this.f29844M) != null && map.containsKey(childAt)) {
                        C0311u.m2153t0(childAt, this.f29844M.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.f29844M = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: A */
    public boolean mo1443A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.f29833B = 0;
        this.f29834C = false;
        return (i2 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: C */
    public void mo1445C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v.getTop() == m23992U()) {
            m24007m0(3);
            return;
        }
        WeakReference<View> weakReference = this.f29838G;
        if (weakReference != null && view == weakReference.get() && this.f29834C) {
            if (this.f29833B > 0) {
                if (this.f29847c) {
                    i3 = this.f29861q;
                } else {
                    int top = v.getTop();
                    int i5 = this.f29862r;
                    if (top > i5) {
                        i3 = i5;
                        i4 = 6;
                    } else {
                        i3 = this.f29860p;
                    }
                }
            } else if (this.f29866v && m24009q0(v, m23981W())) {
                i3 = this.f29836E;
                i4 = 5;
            } else if (this.f29833B == 0) {
                int top2 = v.getTop();
                if (!this.f29847c) {
                    int i6 = this.f29862r;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.f29864t)) {
                            i3 = this.f29860p;
                        } else {
                            i3 = this.f29862r;
                        }
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f29864t)) {
                        i3 = this.f29862r;
                    } else {
                        i3 = this.f29864t;
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (Math.abs(top2 - this.f29861q) < Math.abs(top2 - this.f29864t)) {
                    i3 = this.f29861q;
                } else {
                    i3 = this.f29864t;
                    i4 = 4;
                }
            } else {
                if (this.f29847c) {
                    i3 = this.f29864t;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f29862r) < Math.abs(top3 - this.f29864t)) {
                        i3 = this.f29862r;
                        i4 = 6;
                    } else {
                        i3 = this.f29864t;
                    }
                }
                i4 = 4;
            }
            m24010r0(v, i4, i3, false);
            this.f29834C = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: D */
    public boolean mo1446D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f29869y == 1 && actionMasked == 0) {
            return true;
        }
        C0966c c0966c = this.f29870z;
        if (c0966c != null) {
            c0966c.m6163z(motionEvent);
        }
        if (actionMasked == 0) {
            m23982Y();
        }
        if (this.f29840I == null) {
            this.f29840I = VelocityTracker.obtain();
        }
        this.f29840I.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f29832A && Math.abs(this.f29842K - motionEvent.getY()) > this.f29870z.m6159u()) {
            this.f29870z.m6156b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f29832A;
    }

    /* renamed from: K */
    public void m23989K(AbstractC7968e abstractC7968e) {
        if (this.f29839H.contains(abstractC7968e)) {
            return;
        }
        this.f29839H.add(abstractC7968e);
    }

    /* renamed from: R */
    void m23990R(int i2) {
        float f2;
        float fM23992U;
        V v = this.f29837F.get();
        if (v == null || this.f29839H.isEmpty()) {
            return;
        }
        int i3 = this.f29864t;
        if (i2 > i3 || i3 == m23992U()) {
            int i4 = this.f29864t;
            f2 = i4 - i2;
            fM23992U = this.f29836E - i4;
        } else {
            int i5 = this.f29864t;
            f2 = i5 - i2;
            fM23992U = i5 - m23992U();
        }
        float f3 = f2 / fM23992U;
        for (int i6 = 0; i6 < this.f29839H.size(); i6++) {
            this.f29839H.get(i6).onSlide(v, f3);
        }
    }

    /* renamed from: S */
    View m23991S(View view) {
        if (C0311u.m2103P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewM23991S = m23991S(viewGroup.getChildAt(i2));
            if (viewM23991S != null) {
                return viewM23991S;
            }
        }
        return null;
    }

    /* renamed from: U */
    public int m23992U() {
        return this.f29847c ? this.f29861q : this.f29860p;
    }

    /* renamed from: V */
    public int m23993V() {
        return this.f29869y;
    }

    /* renamed from: X */
    public boolean m23994X() {
        return this.f29855k;
    }

    @Deprecated
    /* renamed from: a0 */
    public void m23995a0(AbstractC7968e abstractC7968e) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f29839H.clear();
        if (abstractC7968e != null) {
            this.f29839H.add(abstractC7968e);
        }
    }

    /* renamed from: b0 */
    public void m23996b0(boolean z) {
        this.f29868x = z;
    }

    /* renamed from: c0 */
    public void m23997c0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f29860p = i2;
    }

    /* renamed from: d0 */
    public void m23998d0(boolean z) {
        if (this.f29847c == z) {
            return;
        }
        this.f29847c = z;
        if (this.f29837F != null) {
            m23974L();
        }
        m24007m0((this.f29847c && this.f29869y == 6) ? 3 : this.f29869y);
        m23986s0();
    }

    /* renamed from: e0 */
    public void m23999e0(boolean z) {
        this.f29855k = z;
    }

    /* renamed from: f0 */
    public void m24000f0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f29863s = f2;
        if (this.f29837F != null) {
            m23975M();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: g */
    public void mo1453g(CoordinatorLayout.C0229f c0229f) {
        super.mo1453g(c0229f);
        this.f29837F = null;
        this.f29870z = null;
    }

    /* renamed from: g0 */
    public void m24001g0(boolean z) {
        if (this.f29866v != z) {
            this.f29866v = z;
            if (!z && this.f29869y == 5) {
                m24006l0(4);
            }
            m23986s0();
        }
    }

    /* renamed from: h0 */
    public void m24002h0(int i2) {
        m24003i0(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24003i0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f29851g
            if (r4 != 0) goto L15
            r3.f29851g = r0
            goto L1f
        Lc:
            boolean r2 = r3.f29851g
            if (r2 != 0) goto L17
            int r2 = r3.f29850f
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.f29851g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f29850f = r4
        L1f:
            if (r0 == 0) goto L42
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.f29837F
            if (r4 == 0) goto L42
            r3.m23974L()
            int r4 = r3.f29869y
            r0 = 4
            if (r4 != r0) goto L42
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.f29837F
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L42
            if (r5 == 0) goto L3f
            int r4 = r3.f29869y
            r3.m23985p0(r4)
            goto L42
        L3f:
            r4.requestLayout()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m24003i0(int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: j */
    public void mo1456j() {
        super.mo1456j();
        this.f29837F = null;
        this.f29870z = null;
    }

    /* renamed from: j0 */
    public void m24004j0(int i2) {
        this.f29846b = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: k */
    public boolean mo1457k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0966c c0966c;
        if (!v.isShown() || !this.f29868x) {
            this.f29832A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m23982Y();
        }
        if (this.f29840I == null) {
            this.f29840I = VelocityTracker.obtain();
        }
        this.f29840I.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f29842K = (int) motionEvent.getY();
            if (this.f29869y != 2) {
                WeakReference<View> weakReference = this.f29838G;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m1419B(view, x, this.f29842K)) {
                    this.f29841J = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f29843L = true;
                }
            }
            this.f29832A = this.f29841J == -1 && !coordinatorLayout.m1419B(v, x, this.f29842K);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f29843L = false;
            this.f29841J = -1;
            if (this.f29832A) {
                this.f29832A = false;
                return false;
            }
        }
        if (!this.f29832A && (c0966c = this.f29870z) != null && c0966c.m6152G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f29838G;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f29832A || this.f29869y == 1 || coordinatorLayout.m1419B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f29870z == null || Math.abs(((float) this.f29842K) - motionEvent.getY()) <= ((float) this.f29870z.m6159u())) ? false : true;
    }

    /* renamed from: k0 */
    public void m24005k0(boolean z) {
        this.f29867w = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: l */
    public boolean mo1458l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        C8900g c8900g;
        if (C0311u.m2156v(coordinatorLayout) && !C0311u.m2156v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f29837F == null) {
            this.f29852h = coordinatorLayout.getResources().getDimensionPixelSize(C8910d.f33875j);
            m23984n0(coordinatorLayout);
            this.f29837F = new WeakReference<>(v);
            if (this.f29853i && (c8900g = this.f29854j) != null) {
                C0311u.m2139m0(v, c8900g);
            }
            C8900g c8900g2 = this.f29854j;
            if (c8900g2 != null) {
                float fM2152t = this.f29865u;
                if (fM2152t == -1.0f) {
                    fM2152t = C0311u.m2152t(v);
                }
                c8900g2.m28283W(fM2152t);
                boolean z = this.f29869y == 3;
                this.f29857m = z;
                this.f29854j.m28285Y(z ? 0.0f : 1.0f);
            }
            m23986s0();
            if (C0311u.m2158w(v) == 0) {
                C0311u.m2153t0(v, 1);
            }
        }
        if (this.f29870z == null) {
            this.f29870z = C0966c.m6142m(coordinatorLayout, this.f29845N);
        }
        int top = v.getTop();
        coordinatorLayout.m1422I(v, i2);
        this.f29835D = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f29836E = height;
        this.f29861q = Math.max(0, height - v.getHeight());
        m23975M();
        m23974L();
        int i3 = this.f29869y;
        if (i3 == 3) {
            C0311u.m2108U(v, m23992U());
        } else if (i3 == 6) {
            C0311u.m2108U(v, this.f29862r);
        } else if (this.f29866v && i3 == 5) {
            C0311u.m2108U(v, this.f29836E);
        } else if (i3 == 4) {
            C0311u.m2108U(v, this.f29864t);
        } else if (i3 == 1 || i3 == 2) {
            C0311u.m2108U(v, top - v.getTop());
        }
        this.f29838G = new WeakReference<>(m23991S(v));
        return true;
    }

    /* renamed from: l0 */
    public void m24006l0(int i2) {
        if (i2 == this.f29869y) {
            return;
        }
        if (this.f29837F != null) {
            m23985p0(i2);
            return;
        }
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f29866v && i2 == 5)) {
            this.f29869y = i2;
        }
    }

    /* renamed from: m0 */
    void m24007m0(int i2) {
        V v;
        if (this.f29869y == i2) {
            return;
        }
        this.f29869y = i2;
        WeakReference<V> weakReference = this.f29837F;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m23988u0(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m23988u0(false);
        }
        m23987t0(i2);
        for (int i3 = 0; i3 < this.f29839H.size(); i3++) {
            this.f29839H.get(i3).onStateChanged(v, i2);
        }
        m23986s0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: o */
    public boolean mo1461o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.f29838G;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f29869y != 3 || super.mo1461o(coordinatorLayout, v, view, f2, f3);
    }

    /* renamed from: o0 */
    void m24008o0(View view, int i2) {
        int iM23992U;
        int i3;
        if (i2 == 4) {
            iM23992U = this.f29864t;
        } else if (i2 == 6) {
            int i4 = this.f29862r;
            if (!this.f29847c || i4 > (i3 = this.f29861q)) {
                iM23992U = i4;
            } else {
                iM23992U = i3;
                i2 = 3;
            }
        } else if (i2 == 3) {
            iM23992U = m23992U();
        } else {
            if (!this.f29866v || i2 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i2);
            }
            iM23992U = this.f29836E;
        }
        m24010r0(view, i2, iM23992U, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: q */
    public void mo1463q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f29838G;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m23992U()) {
                iArr[1] = top - m23992U();
                C0311u.m2108U(v, -iArr[1]);
                m24007m0(3);
            } else {
                if (!this.f29868x) {
                    return;
                }
                iArr[1] = i3;
                C0311u.m2108U(v, -i3);
                m24007m0(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f29864t;
            if (i5 > i6 && !this.f29866v) {
                iArr[1] = top - i6;
                C0311u.m2108U(v, -iArr[1]);
                m24007m0(4);
            } else {
                if (!this.f29868x) {
                    return;
                }
                iArr[1] = i3;
                C0311u.m2108U(v, -i3);
                m24007m0(1);
            }
        }
        m23990R(v.getTop());
        this.f29833B = i3;
        this.f29834C = true;
    }

    /* renamed from: q0 */
    boolean m24009q0(View view, float f2) {
        if (this.f29867w) {
            return true;
        }
        if (view.getTop() < this.f29864t) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f29864t)) / ((float) m23976N()) > 0.5f;
    }

    /* renamed from: r0 */
    void m24010r0(View view, int i2, int i3, boolean z) {
        if (!(z ? this.f29870z.m6151F(view.getLeft(), i3) : this.f29870z.m6153H(view, view.getLeft(), i3))) {
            m24007m0(i2);
            return;
        }
        m24007m0(2);
        m23987t0(i2);
        if (this.f29858n == null) {
            this.f29858n = new RunnableC7969f(view, i2);
        }
        if (((RunnableC7969f) this.f29858n).f29884g) {
            this.f29858n.f29885h = i2;
            return;
        }
        BottomSheetBehavior<V>.RunnableC7969f runnableC7969f = this.f29858n;
        runnableC7969f.f29885h = i2;
        C0311u.m2115a0(view, runnableC7969f);
        ((RunnableC7969f) this.f29858n).f29884g = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: t */
    public void mo1466t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: x */
    public void mo1470x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1470x(coordinatorLayout, v, savedState.m2342a());
        m23983Z(savedState);
        int i2 = savedState.f29871h;
        if (i2 == 1 || i2 == 2) {
            this.f29869y = 4;
        } else {
            this.f29869y = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: y */
    public Parcelable mo1471y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1471y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7963a();

        /* renamed from: h */
        final int f29871h;

        /* renamed from: i */
        int f29872i;

        /* renamed from: j */
        boolean f29873j;

        /* renamed from: k */
        boolean f29874k;

        /* renamed from: l */
        boolean f29875l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C7963a implements Parcelable.ClassLoaderCreator<SavedState> {
            C7963a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29871h = parcel.readInt();
            this.f29872i = parcel.readInt();
            this.f29873j = parcel.readInt() == 1;
            this.f29874k = parcel.readInt() == 1;
            this.f29875l = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f29871h);
            parcel.writeInt(this.f29872i);
            parcel.writeInt(this.f29873j ? 1 : 0);
            parcel.writeInt(this.f29874k ? 1 : 0);
            parcel.writeInt(this.f29875l ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f29871h = bottomSheetBehavior.f29869y;
            this.f29872i = ((BottomSheetBehavior) bottomSheetBehavior).f29850f;
            this.f29873j = ((BottomSheetBehavior) bottomSheetBehavior).f29847c;
            this.f29874k = bottomSheetBehavior.f29866v;
            this.f29875l = ((BottomSheetBehavior) bottomSheetBehavior).f29867w;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f29846b = 0;
        this.f29847c = true;
        this.f29848d = false;
        this.f29858n = null;
        this.f29863s = 0.5f;
        this.f29865u = -1.0f;
        this.f29868x = true;
        this.f29869y = 4;
        this.f29839H = new ArrayList<>();
        this.f29845N = new C7966c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34119R);
        this.f29853i = typedArrayObtainStyledAttributes.hasValue(C8918l.f34207d0);
        int i3 = C8918l.f34133T;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            m23978P(context, attributeSet, zHasValue, C8947c.m28499a(context, typedArrayObtainStyledAttributes, i3));
        } else {
            m23977O(context, attributeSet, zHasValue);
        }
        m23979Q();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f29865u = typedArrayObtainStyledAttributes.getDimension(C8918l.f34126S, -1.0f);
        }
        int i4 = C8918l.f34175Z;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i4);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            m24002h0(i2);
        } else {
            m24002h0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        m24001g0(typedArrayObtainStyledAttributes.getBoolean(C8918l.f34168Y, false));
        m23999e0(typedArrayObtainStyledAttributes.getBoolean(C8918l.f34199c0, false));
        m23998d0(typedArrayObtainStyledAttributes.getBoolean(C8918l.f34154W, true));
        m24005k0(typedArrayObtainStyledAttributes.getBoolean(C8918l.f34191b0, false));
        m23996b0(typedArrayObtainStyledAttributes.getBoolean(C8918l.f34140U, true));
        m24004j0(typedArrayObtainStyledAttributes.getInt(C8918l.f34183a0, 0));
        m24000f0(typedArrayObtainStyledAttributes.getFloat(C8918l.f34161X, 0.5f));
        int i5 = C8918l.f34147V;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            m23997c0(typedValuePeekValue2.data);
        } else {
            m23997c0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f29849e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
