package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q3.C4282a;
import q3.C4283b;
import q3.C4284c;
import s1.C4421a;
import s1.C4422a0;
import s1.C4449o;
import s1.InterfaceC4451p;
import s1.X;
import t1.t;
import x1.C5048a;
import y1.AbstractC5121a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements s1.C {

    /* renamed from: g1, reason: collision with root package name */
    static boolean f28554g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    static boolean f28555h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    private static final int[] f28556i1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: j1, reason: collision with root package name */
    private static final float f28557j1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: k1, reason: collision with root package name */
    static final boolean f28558k1 = false;

    /* renamed from: l1, reason: collision with root package name */
    static final boolean f28559l1 = true;

    /* renamed from: m1, reason: collision with root package name */
    static final boolean f28560m1 = true;

    /* renamed from: n1, reason: collision with root package name */
    private static final Class<?>[] f28561n1;

    /* renamed from: o1, reason: collision with root package name */
    static final Interpolator f28562o1;

    /* renamed from: p1, reason: collision with root package name */
    static final D f28563p1;

    /* renamed from: A0, reason: collision with root package name */
    private int f28564A0;

    /* renamed from: B, reason: collision with root package name */
    private final float f28565B;

    /* renamed from: B0, reason: collision with root package name */
    private t f28566B0;

    /* renamed from: C, reason: collision with root package name */
    private final z f28567C;

    /* renamed from: C0, reason: collision with root package name */
    private final int f28568C0;

    /* renamed from: D, reason: collision with root package name */
    final x f28569D;

    /* renamed from: D0, reason: collision with root package name */
    private final int f28570D0;

    /* renamed from: E, reason: collision with root package name */
    A f28571E;

    /* renamed from: E0, reason: collision with root package name */
    float f28572E0;

    /* renamed from: F, reason: collision with root package name */
    a f28573F;

    /* renamed from: F0, reason: collision with root package name */
    float f28574F0;

    /* renamed from: G, reason: collision with root package name */
    d f28575G;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f28576G0;

    /* renamed from: H, reason: collision with root package name */
    final androidx.recyclerview.widget.y f28577H;

    /* renamed from: H0, reason: collision with root package name */
    final F f28578H0;

    /* renamed from: I, reason: collision with root package name */
    boolean f28579I;

    /* renamed from: I0, reason: collision with root package name */
    androidx.recyclerview.widget.k f28580I0;

    /* renamed from: J, reason: collision with root package name */
    final Runnable f28581J;

    /* renamed from: J0, reason: collision with root package name */
    k.b f28582J0;

    /* renamed from: K, reason: collision with root package name */
    final Rect f28583K;

    /* renamed from: K0, reason: collision with root package name */
    final C f28584K0;

    /* renamed from: L, reason: collision with root package name */
    private final Rect f28585L;

    /* renamed from: L0, reason: collision with root package name */
    private v f28586L0;

    /* renamed from: M, reason: collision with root package name */
    final RectF f28587M;

    /* renamed from: M0, reason: collision with root package name */
    private List<v> f28588M0;

    /* renamed from: N, reason: collision with root package name */
    h f28589N;

    /* renamed from: N0, reason: collision with root package name */
    boolean f28590N0;

    /* renamed from: O, reason: collision with root package name */
    q f28591O;

    /* renamed from: O0, reason: collision with root package name */
    boolean f28592O0;

    /* renamed from: P, reason: collision with root package name */
    y f28593P;

    /* renamed from: P0, reason: collision with root package name */
    private n.b f28594P0;

    /* renamed from: Q, reason: collision with root package name */
    final List<y> f28595Q;

    /* renamed from: Q0, reason: collision with root package name */
    boolean f28596Q0;

    /* renamed from: R, reason: collision with root package name */
    final ArrayList<p> f28597R;

    /* renamed from: R0, reason: collision with root package name */
    androidx.recyclerview.widget.s f28598R0;

    /* renamed from: S, reason: collision with root package name */
    private final ArrayList<u> f28599S;

    /* renamed from: S0, reason: collision with root package name */
    private final int[] f28600S0;

    /* renamed from: T, reason: collision with root package name */
    private u f28601T;

    /* renamed from: T0, reason: collision with root package name */
    private s1.D f28602T0;

    /* renamed from: U, reason: collision with root package name */
    boolean f28603U;

    /* renamed from: U0, reason: collision with root package name */
    private final int[] f28604U0;

    /* renamed from: V, reason: collision with root package name */
    boolean f28605V;

    /* renamed from: V0, reason: collision with root package name */
    private final int[] f28606V0;

    /* renamed from: W, reason: collision with root package name */
    boolean f28607W;

    /* renamed from: W0, reason: collision with root package name */
    final int[] f28608W0;

    /* renamed from: X0, reason: collision with root package name */
    final List<G> f28609X0;

    /* renamed from: Y0, reason: collision with root package name */
    private Runnable f28610Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f28611Z0;

    /* renamed from: a0, reason: collision with root package name */
    boolean f28612a0;

    /* renamed from: a1, reason: collision with root package name */
    private int f28613a1;

    /* renamed from: b0, reason: collision with root package name */
    private int f28614b0;

    /* renamed from: b1, reason: collision with root package name */
    private int f28615b1;

    /* renamed from: c0, reason: collision with root package name */
    boolean f28616c0;

    /* renamed from: c1, reason: collision with root package name */
    boolean f28617c1;

    /* renamed from: d0, reason: collision with root package name */
    boolean f28618d0;

    /* renamed from: d1, reason: collision with root package name */
    private final y.b f28619d1;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f28620e0;

    /* renamed from: e1, reason: collision with root package name */
    private final InterfaceC4451p f28621e1;

    /* renamed from: f0, reason: collision with root package name */
    private int f28622f0;

    /* renamed from: f1, reason: collision with root package name */
    C4449o f28623f1;

    /* renamed from: g0, reason: collision with root package name */
    boolean f28624g0;

    /* renamed from: h0, reason: collision with root package name */
    private final AccessibilityManager f28625h0;

    /* renamed from: i0, reason: collision with root package name */
    private List<s> f28626i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f28627j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f28628k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f28629l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f28630m0;

    /* renamed from: n0, reason: collision with root package name */
    private m f28631n0;

    /* renamed from: o0, reason: collision with root package name */
    private EdgeEffect f28632o0;

    /* renamed from: p0, reason: collision with root package name */
    private EdgeEffect f28633p0;

    /* renamed from: q0, reason: collision with root package name */
    private EdgeEffect f28634q0;

    /* renamed from: r0, reason: collision with root package name */
    private EdgeEffect f28635r0;

    /* renamed from: s0, reason: collision with root package name */
    n f28636s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f28637t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f28638u0;

    /* renamed from: v0, reason: collision with root package name */
    private VelocityTracker f28639v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f28640w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f28641x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f28642y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f28643z0;

    public static abstract class B {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f28646b;

        /* renamed from: c, reason: collision with root package name */
        private q f28647c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f28648d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f28649e;

        /* renamed from: f, reason: collision with root package name */
        private View f28650f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f28652h;

        /* renamed from: a, reason: collision with root package name */
        private int f28645a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f28651g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f28653a;

            /* renamed from: b, reason: collision with root package name */
            private int f28654b;

            /* renamed from: c, reason: collision with root package name */
            private int f28655c;

            /* renamed from: d, reason: collision with root package name */
            private int f28656d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f28657e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f28658f;

            /* renamed from: g, reason: collision with root package name */
            private int f28659g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f28657e != null && this.f28655c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f28655c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f28656d >= 0;
            }

            public void b(int i10) {
                this.f28656d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f28656d;
                if (i10 >= 0) {
                    this.f28656d = -1;
                    recyclerView.G0(i10);
                    this.f28658f = false;
                } else {
                    if (!this.f28658f) {
                        this.f28659g = 0;
                        return;
                    }
                    e();
                    recyclerView.f28578H0.e(this.f28653a, this.f28654b, this.f28655c, this.f28657e);
                    int i11 = this.f28659g + 1;
                    this.f28659g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f28658f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f28653a = i10;
                this.f28654b = i11;
                this.f28655c = i12;
                this.f28657e = interpolator;
                this.f28658f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f28656d = -1;
                this.f28658f = false;
                this.f28659g = 0;
                this.f28653a = i10;
                this.f28654b = i11;
                this.f28655c = i12;
                this.f28657e = interpolator;
            }
        }

        public interface b {
            PointF d(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).d(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f28646b.f28591O.H(i10);
        }

        public int c() {
            return this.f28646b.f28591O.O();
        }

        public int d(View view) {
            return this.f28646b.m0(view);
        }

        public q e() {
            return this.f28647c;
        }

        public int f() {
            return this.f28645a;
        }

        public boolean g() {
            return this.f28648d;
        }

        public boolean h() {
            return this.f28649e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f28646b;
            if (this.f28645a == -1 || recyclerView == null) {
                r();
            }
            if (this.f28648d && this.f28650f == null && this.f28647c != null && (pointFA = a(this.f28645a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.t1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f28648d = false;
            View view = this.f28650f;
            if (view != null) {
                if (d(view) == this.f28645a) {
                    o(this.f28650f, recyclerView.f28584K0, this.f28651g);
                    this.f28651g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f28650f = null;
                }
            }
            if (this.f28649e) {
                l(i10, i11, recyclerView.f28584K0, this.f28651g);
                boolean zA = this.f28651g.a();
                this.f28651g.c(recyclerView);
                if (zA && this.f28649e) {
                    this.f28648d = true;
                    recyclerView.f28578H0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f28650f = view;
                if (RecyclerView.f28555h1) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i10, int i11, C c10, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, C c10, a aVar);

        public void p(int i10) {
            this.f28645a = i10;
        }

        void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f28578H0.f();
            if (this.f28652h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f28646b = recyclerView;
            this.f28647c = qVar;
            int i10 = this.f28645a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f28584K0.f28660a = i10;
            this.f28649e = true;
            this.f28648d = true;
            this.f28650f = b(f());
            m();
            this.f28646b.f28578H0.d();
            this.f28652h = true;
        }

        protected final void r() {
            if (this.f28649e) {
                this.f28649e = false;
                n();
                this.f28646b.f28584K0.f28660a = -1;
                this.f28650f = null;
                this.f28645a = -1;
                this.f28648d = false;
                this.f28647c.k1(this);
                this.f28647c = null;
                this.f28646b = null;
            }
        }
    }

    public static class C {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f28661b;

        /* renamed from: m, reason: collision with root package name */
        int f28672m;

        /* renamed from: n, reason: collision with root package name */
        long f28673n;

        /* renamed from: o, reason: collision with root package name */
        int f28674o;

        /* renamed from: p, reason: collision with root package name */
        int f28675p;

        /* renamed from: q, reason: collision with root package name */
        int f28676q;

        /* renamed from: a, reason: collision with root package name */
        int f28660a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f28662c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f28663d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f28664e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f28665f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f28666g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f28667h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f28668i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f28669j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f28670k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f28671l = false;

        void a(int i10) {
            if ((this.f28664e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f28664e));
        }

        public int b() {
            return this.f28667h ? this.f28662c - this.f28663d : this.f28665f;
        }

        public int c() {
            return this.f28660a;
        }

        public boolean d() {
            return this.f28660a != -1;
        }

        public boolean e() {
            return this.f28667h;
        }

        void f(h hVar) {
            this.f28664e = 1;
            this.f28665f = hVar.h();
            this.f28667h = false;
            this.f28668i = false;
            this.f28669j = false;
        }

        public boolean g() {
            return this.f28671l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f28660a + ", mData=" + this.f28661b + ", mItemCount=" + this.f28665f + ", mIsMeasuring=" + this.f28669j + ", mPreviousLayoutItemCount=" + this.f28662c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f28663d + ", mStructureChanged=" + this.f28666g + ", mInPreLayout=" + this.f28667h + ", mRunSimpleAnimations=" + this.f28670k + ", mRunPredictiveAnimations=" + this.f28671l + '}';
        }
    }

    static class D extends m {
        D() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class E {
    }

    class F implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private int f28677B;

        /* renamed from: C, reason: collision with root package name */
        private int f28678C;

        /* renamed from: D, reason: collision with root package name */
        OverScroller f28679D;

        /* renamed from: E, reason: collision with root package name */
        Interpolator f28680E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f28681F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f28682G;

        F() {
            Interpolator interpolator = RecyclerView.f28562o1;
            this.f28680E = interpolator;
            this.f28681F = false;
            this.f28682G = false;
            this.f28679D = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            X.f0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f28678C = 0;
            this.f28677B = 0;
            Interpolator interpolator = this.f28680E;
            Interpolator interpolator2 = RecyclerView.f28562o1;
            if (interpolator != interpolator2) {
                this.f28680E = interpolator2;
                this.f28679D = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f28679D.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f28681F) {
                this.f28682G = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f28562o1;
            }
            if (this.f28680E != interpolator) {
                this.f28680E = interpolator;
                this.f28679D = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f28678C = 0;
            this.f28677B = 0;
            RecyclerView.this.setScrollState(2);
            this.f28679D.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f28679D.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f28591O == null) {
                f();
                return;
            }
            this.f28682G = false;
            this.f28681F = true;
            recyclerView.A();
            OverScroller overScroller = this.f28679D;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f28677B;
                int i13 = currY - this.f28678C;
                this.f28677B = currX;
                this.f28678C = currY;
                int iX = RecyclerView.this.x(i12);
                int iZ = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f28608W0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(iX, iZ, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f28608W0;
                    iX -= iArr2[0];
                    iZ -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(iX, iZ);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f28589N != null) {
                    int[] iArr3 = recyclerView3.f28608W0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.t1(iX, iZ, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f28608W0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    iX -= i11;
                    iZ -= i10;
                    B b10 = recyclerView4.f28591O.f28714g;
                    if (b10 != null && !b10.g() && b10.h()) {
                        int iB = RecyclerView.this.f28584K0.b();
                        if (iB == 0) {
                            b10.r();
                        } else if (b10.f() >= iB) {
                            b10.p(iB - 1);
                            b10.j(i11, i10);
                        } else {
                            b10.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f28597R.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f28608W0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i11, i10, iX, iZ, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f28608W0;
                int i14 = iX - iArr6[0];
                int i15 = iZ - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.O(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                B b11 = RecyclerView.this.f28591O.f28714g;
                if ((b11 == null || !b11.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f28560m1) {
                        RecyclerView.this.f28582J0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.k kVar = recyclerView7.f28580I0;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i11, i10);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            B b12 = RecyclerView.this.f28591O.f28714g;
            if (b12 != null && b12.g()) {
                b12.j(0, 0);
            }
            this.f28681F = false;
            if (this.f28682G) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.J1(1);
            }
        }
    }

    public static abstract class G {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends G> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
        int mOldPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
        long mItemId = -1;
        int mItemViewType = PENDING_ACCESSIBILITY_STATE_NOT_SET;
        int mPreLayoutPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
        G mShadowedHolder = null;
        G mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        x mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = PENDING_ACCESSIBILITY_STATE_NOT_SET;

        public G(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
            this.mPreLayoutPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & FLAG_NOT_RECYCLABLE) == 0 && X.O(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            return recyclerView == null ? PENDING_ACCESSIBILITY_STATE_NOT_SET : recyclerView.j0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends G> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iJ0;
            return (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iJ0 = this.mOwnerRecyclerView.j0(this)) == PENDING_ACCESSIBILITY_STATE_NOT_SET) ? PENDING_ACCESSIBILITY_STATE_NOT_SET : adapter.g(this.mBindingAdapter, this, iJ0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == PENDING_ACCESSIBILITY_STATE_NOT_SET ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == PENDING_ACCESSIBILITY_STATE_NOT_SET ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & FLAG_NOT_RECYCLABLE) == 0 && !X.O(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == PENDING_ACCESSIBILITY_STATE_NOT_SET) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == PENDING_ACCESSIBILITY_STATE_NOT_SET) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((r) this.itemView.getLayoutParams()).f28734c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != PENDING_ACCESSIBILITY_STATE_NOT_SET) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.w1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.w1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.f28554g1 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
            this.mOldPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
            this.mItemId = -1L;
            this.mPreLayoutPosition = PENDING_ACCESSIBILITY_STATE_NOT_SET;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = PENDING_ACCESSIBILITY_STATE_NOT_SET;
            RecyclerView.u(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == PENDING_ACCESSIBILITY_STATE_NOT_SET) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.f28554g1) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= FLAG_NOT_RECYCLABLE;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f28555h1) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void setScrapContainer(x xVar, boolean z10) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & FLAG_NOT_RECYCLABLE) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & FLAG_RETURNED_FROM_SCRAP) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC2164a implements Runnable {
        RunnableC2164a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f28612a0 || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f28603U) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f28618d0) {
                recyclerView2.f28616c0 = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC2165b implements Runnable {
        RunnableC2165b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.f28636s0;
            if (nVar != null) {
                nVar.u();
            }
            RecyclerView.this.f28596Q0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC2166c implements Interpolator {
        InterpolatorC2166c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C2167d implements y.b {
        C2167d() {
        }

        @Override // androidx.recyclerview.widget.y.b
        public void a(G g10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f28591O.r1(g10.itemView, recyclerView.f28569D);
        }

        @Override // androidx.recyclerview.widget.y.b
        public void b(G g10, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(g10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.y.b
        public void c(G g10, n.c cVar, n.c cVar2) {
            RecyclerView.this.f28569D.O(g10);
            RecyclerView.this.q(g10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.y.b
        public void d(G g10, n.c cVar, n.c cVar2) {
            g10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f28627j0) {
                if (recyclerView.f28636s0.b(g10, g10, cVar, cVar2)) {
                    RecyclerView.this.X0();
                }
            } else if (recyclerView.f28636s0.d(g10, cVar, cVar2)) {
                RecyclerView.this.X0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C2168e implements InterfaceC4451p {
        C2168e() {
        }

        @Override // s1.InterfaceC4451p
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f28591O.q()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f28591O.p()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.K1();
            return RecyclerView.this.i0(i10, i11);
        }

        @Override // s1.InterfaceC4451p
        public float b() {
            float f10;
            if (RecyclerView.this.f28591O.q()) {
                f10 = RecyclerView.this.f28574F0;
            } else {
                if (!RecyclerView.this.f28591O.p()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f28572E0;
            }
            return -f10;
        }

        @Override // s1.InterfaceC4451p
        public void c() {
            RecyclerView.this.K1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    class C2169f implements d.b {
        C2169f() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void b(View view) {
            G gO0 = RecyclerView.o0(view);
            if (gO0 != null) {
                gO0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.d.b
        public void d() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.F(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.d.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public G f(View view) {
            return RecyclerView.o0(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void g(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                G gO0 = RecyclerView.o0(viewA);
                if (gO0 != null) {
                    if (gO0.isTmpDetached() && !gO0.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + gO0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f28555h1) {
                        Log.d("RecyclerView", "tmpDetach " + gO0);
                    }
                    gO0.addFlags(256);
                }
            } else if (RecyclerView.f28554g1) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void h(View view) {
            G gO0 = RecyclerView.o0(view);
            if (gO0 != null) {
                gO0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public void i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            G gO0 = RecyclerView.o0(view);
            if (gO0 != null) {
                if (!gO0.isTmpDetached() && !gO0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + gO0 + RecyclerView.this.V());
                }
                if (RecyclerView.f28555h1) {
                    Log.d("RecyclerView", "reAttach " + gO0);
                }
                gO0.clearTmpDetachFlag();
            } else if (RecyclerView.f28554g1) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g, reason: case insensitive filesystem */
    class C2170g implements a.InterfaceC0389a {
        C2170g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void a(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f28590N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.M1(i10, i11, obj);
            RecyclerView.this.f28592O0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public G e(int i10) {
            G gF0 = RecyclerView.this.f0(i10, true);
            if (gF0 == null) {
                return null;
            }
            if (!RecyclerView.this.f28575G.n(gF0.itemView)) {
                return gF0;
            }
            if (RecyclerView.f28555h1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void f(int i10, int i11) {
            RecyclerView.this.O0(i10, i11, false);
            RecyclerView.this.f28590N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void g(int i10, int i11) {
            RecyclerView.this.M0(i10, i11);
            RecyclerView.this.f28590N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0389a
        public void h(int i10, int i11) {
            RecyclerView.this.O0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f28590N0 = true;
            recyclerView.f28584K0.f28663d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f28816a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f28591O.W0(recyclerView, bVar.f28817b, bVar.f28819d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f28591O.Z0(recyclerView2, bVar.f28817b, bVar.f28819d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f28591O.b1(recyclerView3, bVar.f28817b, bVar.f28819d, bVar.f28818c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f28591O.Y0(recyclerView4, bVar.f28817b, bVar.f28819d, 1);
            }
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    private static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
    }

    public static class m {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    private class o implements n.b {
        o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.b
        public void a(G g10) {
            g10.setIsRecyclable(true);
            if (g10.mShadowedHolder != null && g10.mShadowingHolder == null) {
                g10.mShadowedHolder = null;
            }
            g10.mShadowingHolder = null;
            if (g10.shouldBeKeptAsChild() || RecyclerView.this.i1(g10.itemView) || !g10.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(g10.itemView, false);
        }
    }

    public interface s {
        void a(View view);

        void b(View view);
    }

    public static abstract class t {
        public abstract boolean a(int i10, int i11);
    }

    public interface u {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static class w {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f28736a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f28737b = 0;

        /* renamed from: c, reason: collision with root package name */
        Set<h<?>> f28738c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<G> f28739a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f28740b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f28741c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f28742d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = this.f28736a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f28736a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f28737b++;
        }

        void b(h<?> hVar) {
            this.f28738c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f28736a.size(); i10++) {
                a aVarValueAt = this.f28736a.valueAt(i10);
                Iterator<G> it = aVarValueAt.f28739a.iterator();
                while (it.hasNext()) {
                    C5048a.b(it.next().itemView);
                }
                aVarValueAt.f28739a.clear();
            }
        }

        void d() {
            this.f28737b--;
        }

        void e(h<?> hVar, boolean z10) {
            this.f28738c.remove(hVar);
            if (this.f28738c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f28736a.size(); i10++) {
                SparseArray<a> sparseArray = this.f28736a;
                ArrayList<G> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f28739a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    C5048a.b(arrayList.get(i11).itemView);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f28742d = l(aVarI.f28742d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f28741c = l(aVarI.f28741c, j10);
        }

        public G h(int i10) {
            a aVar = this.f28736a.get(i10);
            if (aVar == null || aVar.f28739a.isEmpty()) {
                return null;
            }
            ArrayList<G> arrayList = aVar.f28739a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f28737b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(G g10) {
            int itemViewType = g10.getItemViewType();
            ArrayList<G> arrayList = i(itemViewType).f28739a;
            if (this.f28736a.get(itemViewType).f28740b <= arrayList.size()) {
                C5048a.b(g10.itemView);
            } else {
                if (RecyclerView.f28554g1 && arrayList.contains(g10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                g10.resetInternal();
                arrayList.add(g10);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f28742d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f28741c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public interface y {
        void a(G g10);
    }

    private class z extends j {
        z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f28584K0.f28666g = true;
            recyclerView.a1(true);
            if (RecyclerView.this.f28573F.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f28573F.r(i10, i11, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f28573F.s(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f28573F.t(i10, i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f28573F.u(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f28571E == null || (hVar = recyclerView.f28589N) == null || !hVar.e()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f28605V && recyclerView.f28603U) {
                X.f0(recyclerView, recyclerView.f28581J);
            } else {
                recyclerView.f28624g0 = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f28561n1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f28562o1 = new InterpolatorC2166c();
        f28563p1 = new D();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A0() {
        this.f28575G = new d(new C2169f());
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strS0 = s0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strS0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f28561n1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strS0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strS0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strS0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strS0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e16);
            }
        }
    }

    private boolean D(int i10, int i11) {
        a0(this.f28600S0);
        int[] iArr = this.f28600S0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private boolean F0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f28583K.set(0, 0, view.getWidth(), view.getHeight());
        this.f28585L.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f28583K);
        offsetDescendantRectToMyCoords(view2, this.f28585L);
        char c10 = 65535;
        int i12 = this.f28591O.d0() == 1 ? -1 : 1;
        Rect rect = this.f28583K;
        int i13 = rect.left;
        Rect rect2 = this.f28585L;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    private void G() {
        int i10 = this.f28622f0;
        this.f28622f0 = 0;
        if (i10 == 0 || !D0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        t1.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void G1(int i10) {
        boolean zP = this.f28591O.p();
        int i11 = zP;
        if (this.f28591O.q()) {
            i11 = (zP ? 1 : 0) | 2;
        }
        F1(i11, i10);
    }

    private boolean H1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f28632o0;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.e.d(this.f28632o0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f28634q0;
        if (edgeEffect2 != null && androidx.core.widget.e.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.e.d(this.f28634q0, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f28633p0;
        if (edgeEffect3 != null && androidx.core.widget.e.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.e.d(this.f28633p0, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f28635r0;
        if (edgeEffect4 == null || androidx.core.widget.e.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.e.d(this.f28635r0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void I() {
        this.f28584K0.a(1);
        W(this.f28584K0);
        this.f28584K0.f28669j = false;
        E1();
        this.f28577H.f();
        R0();
        Z0();
        q1();
        C c10 = this.f28584K0;
        c10.f28668i = c10.f28670k && this.f28592O0;
        this.f28592O0 = false;
        this.f28590N0 = false;
        c10.f28667h = c10.f28671l;
        c10.f28665f = this.f28589N.h();
        a0(this.f28600S0);
        if (this.f28584K0.f28670k) {
            int iG = this.f28575G.g();
            for (int i10 = 0; i10 < iG; i10++) {
                G gO0 = o0(this.f28575G.f(i10));
                if (!gO0.shouldIgnore() && (!gO0.isInvalid() || this.f28589N.m())) {
                    this.f28577H.e(gO0, this.f28636s0.t(this.f28584K0, gO0, n.e(gO0), gO0.getUnmodifiedPayloads()));
                    if (this.f28584K0.f28668i && gO0.isUpdated() && !gO0.isRemoved() && !gO0.shouldIgnore() && !gO0.isInvalid()) {
                        this.f28577H.c(k0(gO0), gO0);
                    }
                }
            }
        }
        if (this.f28584K0.f28671l) {
            r1();
            C c11 = this.f28584K0;
            boolean z10 = c11.f28666g;
            c11.f28666g = false;
            this.f28591O.c1(this.f28569D, c11);
            this.f28584K0.f28666g = z10;
            for (int i11 = 0; i11 < this.f28575G.g(); i11++) {
                G gO02 = o0(this.f28575G.f(i11));
                if (!gO02.shouldIgnore() && !this.f28577H.i(gO02)) {
                    int iE = n.e(gO02);
                    boolean zHasAnyOfTheFlags = gO02.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= 4096;
                    }
                    n.c cVarT = this.f28636s0.t(this.f28584K0, gO02, iE, gO02.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        c1(gO02, cVarT);
                    } else {
                        this.f28577H.a(gO02, cVarT);
                    }
                }
            }
            v();
        } else {
            v();
        }
        S0();
        I1(false);
        this.f28584K0.f28664e = 2;
    }

    private void J() {
        E1();
        R0();
        this.f28584K0.a(6);
        this.f28573F.j();
        this.f28584K0.f28665f = this.f28589N.h();
        this.f28584K0.f28663d = 0;
        if (this.f28571E != null && this.f28589N.e()) {
            Parcelable parcelable = this.f28571E.f28644D;
            if (parcelable != null) {
                this.f28591O.h1(parcelable);
            }
            this.f28571E = null;
        }
        C c10 = this.f28584K0;
        c10.f28667h = false;
        this.f28591O.c1(this.f28569D, c10);
        C c11 = this.f28584K0;
        c11.f28666g = false;
        c11.f28670k = c11.f28670k && this.f28636s0 != null;
        c11.f28664e = 4;
        S0();
        I1(false);
    }

    private void J0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f28618d0) {
            return;
        }
        int[] iArr = this.f28608W0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = qVar.p();
        boolean zQ = this.f28591O.q();
        int i13 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iF1 = i10 - f1(i10, height);
        int iG1 = i11 - g1(i11, width);
        F1(i13, i12);
        if (L(zP ? iF1 : 0, zQ ? iG1 : 0, this.f28608W0, this.f28604U0, i12)) {
            int[] iArr2 = this.f28608W0;
            iF1 -= iArr2[0];
            iG1 -= iArr2[1];
        }
        s1(zP ? iF1 : 0, zQ ? iG1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.k kVar = this.f28580I0;
        if (kVar != null && (iF1 != 0 || iG1 != 0)) {
            kVar.f(this, iF1, iG1);
        }
        J1(i12);
    }

    private void K() {
        this.f28584K0.a(4);
        E1();
        R0();
        C c10 = this.f28584K0;
        c10.f28664e = 1;
        if (c10.f28670k) {
            for (int iG = this.f28575G.g() - 1; iG >= 0; iG--) {
                G gO0 = o0(this.f28575G.f(iG));
                if (!gO0.shouldIgnore()) {
                    long jK0 = k0(gO0);
                    n.c cVarS = this.f28636s0.s(this.f28584K0, gO0);
                    G g10 = this.f28577H.g(jK0);
                    if (g10 == null || g10.shouldIgnore()) {
                        this.f28577H.d(gO0, cVarS);
                    } else {
                        boolean zH = this.f28577H.h(g10);
                        boolean zH2 = this.f28577H.h(gO0);
                        if (zH && g10 == gO0) {
                            this.f28577H.d(gO0, cVarS);
                        } else {
                            n.c cVarN = this.f28577H.n(g10);
                            this.f28577H.d(gO0, cVarS);
                            n.c cVarM = this.f28577H.m(gO0);
                            if (cVarN == null) {
                                v0(jK0, gO0, g10);
                            } else {
                                p(g10, gO0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f28577H.o(this.f28619d1);
        }
        this.f28591O.q1(this.f28569D);
        C c11 = this.f28584K0;
        c11.f28662c = c11.f28665f;
        this.f28627j0 = false;
        this.f28628k0 = false;
        c11.f28670k = false;
        c11.f28671l = false;
        this.f28591O.f28715h = false;
        ArrayList<G> arrayList = this.f28569D.f28744b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = this.f28591O;
        if (qVar.f28721n) {
            qVar.f28720m = 0;
            qVar.f28721n = false;
            this.f28569D.P();
        }
        this.f28591O.d1(this.f28584K0);
        S0();
        I1(false);
        this.f28577H.f();
        int[] iArr = this.f28600S0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        d1();
        o1();
    }

    private void L1() {
        this.f28578H0.f();
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.P1();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        u uVar = this.f28601T;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f28601T = null;
        }
        return true;
    }

    private void U0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f28638u0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f28638u0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f28642y0 = x10;
            this.f28640w0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f28643z0 = y10;
            this.f28641x0 = y10;
        }
    }

    private boolean Y0() {
        return this.f28636s0 != null && this.f28591O.Q1();
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f28599S.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = this.f28599S.get(i10);
            if (uVar.b(this, motionEvent) && action != 3) {
                this.f28601T = uVar;
                return true;
            }
        }
        return false;
    }

    private void Z0() {
        boolean z10;
        if (this.f28627j0) {
            this.f28573F.y();
            if (this.f28628k0) {
                this.f28591O.X0(this);
            }
        }
        if (Y0()) {
            this.f28573F.w();
        } else {
            this.f28573F.j();
        }
        boolean z11 = this.f28590N0 || this.f28592O0;
        this.f28584K0.f28670k = this.f28612a0 && this.f28636s0 != null && ((z10 = this.f28627j0) || z11 || this.f28591O.f28715h) && (!z10 || this.f28589N.m());
        C c10 = this.f28584K0;
        c10.f28671l = c10.f28670k && z11 && !this.f28627j0 && Y0();
    }

    private void a0(int[] iArr) {
        int iG = this.f28575G.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            G gO0 = o0(this.f28575G.f(i12));
            if (!gO0.shouldIgnore()) {
                int layoutPosition = gO0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewB0 = b0(viewGroup.getChildAt(i10));
            if (recyclerViewB0 != null) {
                return recyclerViewB0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.S()
            android.widget.EdgeEffect r1 = r6.f28632o0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.e.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.T()
            android.widget.EdgeEffect r1 = r6.f28634q0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.e.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.U()
            android.widget.EdgeEffect r9 = r6.f28633p0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.e.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.R()
            android.widget.EdgeEffect r9 = r6.f28635r0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.e.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            r6.postInvalidateOnAnimation()
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b1(float, float, float, float):void");
    }

    private View c0() {
        G gD0;
        C c10 = this.f28584K0;
        int i10 = c10.f28672m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = c10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            G gD02 = d0(i11);
            if (gD02 == null) {
                break;
            }
            if (gD02.itemView.hasFocusable()) {
                return gD02.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (gD0 = d0(iMin)) == null) {
                return null;
            }
        } while (!gD0.itemView.hasFocusable());
        return gD0.itemView;
    }

    private void d1() {
        View viewFindViewById;
        if (!this.f28576G0 || this.f28589N == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f28575G.n(getFocusedChild())) {
                return;
            }
        }
        View viewC0 = null;
        G gE0 = (this.f28584K0.f28673n == -1 || !this.f28589N.m()) ? null : e0(this.f28584K0.f28673n);
        if (gE0 != null && !this.f28575G.n(gE0.itemView) && gE0.itemView.hasFocusable()) {
            viewC0 = gE0.itemView;
        } else if (this.f28575G.g() > 0) {
            viewC0 = c0();
        }
        if (viewC0 != null) {
            int i10 = this.f28584K0.f28674o;
            if (i10 != -1 && (viewFindViewById = viewC0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewC0 = viewFindViewById;
            }
            viewC0.requestFocus();
        }
    }

    private void e1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f28632o0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f28632o0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f28633p0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f28633p0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f28634q0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f28634q0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f28635r0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f28635r0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private int f1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f28632o0;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f28634q0;
            if (edgeEffect2 != null && androidx.core.widget.e.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f28634q0.onRelease();
                } else {
                    float fD = androidx.core.widget.e.d(this.f28634q0, width, height);
                    if (androidx.core.widget.e.b(this.f28634q0) == 0.0f) {
                        this.f28634q0.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f28632o0.onRelease();
            } else {
                float f12 = -androidx.core.widget.e.d(this.f28632o0, -width, 1.0f - height);
                if (androidx.core.widget.e.b(this.f28632o0) == 0.0f) {
                    this.f28632o0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int g1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f28633p0;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f28635r0;
            if (edgeEffect2 != null && androidx.core.widget.e.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f28635r0.onRelease();
                } else {
                    float fD = androidx.core.widget.e.d(this.f28635r0, height, 1.0f - width);
                    if (androidx.core.widget.e.b(this.f28635r0) == 0.0f) {
                        this.f28635r0.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f28633p0.onRelease();
            } else {
                float f12 = -androidx.core.widget.e.d(this.f28633p0, -height, width);
                if (androidx.core.widget.e.b(this.f28633p0) == 0.0f) {
                    this.f28633p0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private s1.D getScrollingChildHelper() {
        if (this.f28602T0 == null) {
            this.f28602T0 = new s1.D(this);
        }
        return this.f28602T0;
    }

    private boolean h0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f28618d0) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f28591O.q();
        if (!zP || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f28632o0;
            if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f28634q0;
                if (edgeEffect2 != null && androidx.core.widget.e.b(edgeEffect2) != 0.0f) {
                    if (x1(this.f28634q0, i10, getWidth())) {
                        this.f28634q0.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i15 = -i10;
                if (x1(this.f28632o0, i15, getWidth())) {
                    this.f28632o0.onAbsorb(i15);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f28633p0;
            if (edgeEffect3 == null || androidx.core.widget.e.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f28635r0;
                if (edgeEffect4 != null && androidx.core.widget.e.b(edgeEffect4) != 0.0f) {
                    if (x1(this.f28635r0, i11, getHeight())) {
                        this.f28635r0.onAbsorb(i11);
                        i11 = 0;
                    }
                    i14 = 0;
                }
                i14 = i11;
                i11 = 0;
            } else {
                int i16 = -i11;
                if (x1(this.f28633p0, i16, getHeight())) {
                    this.f28633p0.onAbsorb(i16);
                    i11 = 0;
                }
                i14 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            G1(1);
            this.f28578H0.b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zP || zQ;
            dispatchNestedFling(f10, f11, z10);
            t tVar = this.f28566B0;
            if (tVar != null && tVar.a(i10, i14)) {
                return true;
            }
            if (z10) {
                G1(1);
                int i18 = -i13;
                this.f28578H0.b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    private void i(G g10) {
        View view = g10.itemView;
        boolean z10 = view.getParent() == this;
        this.f28569D.O(n0(view));
        if (g10.isTmpDetached()) {
            this.f28575G.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f28575G.k(view);
        } else {
            this.f28575G.b(view, true);
        }
    }

    private void n1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f28583K.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f28734c) {
                Rect rect = rVar.f28733b;
                Rect rect2 = this.f28583K;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f28583K);
            offsetRectIntoDescendantCoords(view, this.f28583K);
        }
        this.f28591O.x1(this, view, this.f28583K, !this.f28612a0, view2 == null);
    }

    static G o0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f28732a;
    }

    private void o1() {
        C c10 = this.f28584K0;
        c10.f28673n = -1L;
        c10.f28672m = -1;
        c10.f28674o = -1;
    }

    private void p(G g10, G g11, n.c cVar, n.c cVar2, boolean z10, boolean z11) {
        g10.setIsRecyclable(false);
        if (z10) {
            i(g10);
        }
        if (g10 != g11) {
            if (z11) {
                i(g11);
            }
            g10.mShadowedHolder = g11;
            i(g10);
            this.f28569D.O(g10);
            g11.setIsRecyclable(false);
            g11.mShadowingHolder = g10;
        }
        if (this.f28636s0.b(g10, g11, cVar, cVar2)) {
            X0();
        }
    }

    private void p1() {
        VelocityTracker velocityTracker = this.f28639v0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        J1(0);
        e1();
    }

    static void q0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f28733b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    private void q1() {
        View focusedChild = (this.f28576G0 && hasFocus() && this.f28589N != null) ? getFocusedChild() : null;
        G gY = focusedChild != null ? Y(focusedChild) : null;
        if (gY == null) {
            o1();
            return;
        }
        this.f28584K0.f28673n = this.f28589N.m() ? gY.getItemId() : -1L;
        this.f28584K0.f28672m = this.f28627j0 ? -1 : gY.isRemoved() ? gY.mOldPosition : gY.getAbsoluteAdapterPosition();
        this.f28584K0.f28674o = r0(gY.itemView);
    }

    private int r0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f28554g1 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f28555h1 = z10;
    }

    private void t() {
        p1();
        setScrollState(0);
    }

    static void u(G g10) {
        WeakReference<RecyclerView> weakReference = g10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g10.mNestedRecyclerView = null;
        }
    }

    private float u0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f28565B * 0.015f));
        float f10 = f28557j1;
        return (float) (this.f28565B * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * dLog));
    }

    private void v0(long j10, G g10, G g11) {
        int iG = this.f28575G.g();
        for (int i10 = 0; i10 < iG; i10++) {
            G gO0 = o0(this.f28575G.f(i10));
            if (gO0 != g10 && k0(gO0) == j10) {
                h hVar = this.f28589N;
                if (hVar == null || !hVar.m()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + gO0 + " \n View Holder 2:" + g10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + gO0 + " \n View Holder 2:" + g10 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + g11 + " cannot be found but it is necessary for " + g10 + V());
    }

    private void v1(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.f28589N;
        if (hVar2 != null) {
            hVar2.H(this.f28567C);
            this.f28589N.z(this);
        }
        if (!z10 || z11) {
            h1();
        }
        this.f28573F.y();
        h<?> hVar3 = this.f28589N;
        this.f28589N = hVar;
        if (hVar != null) {
            hVar.E(this.f28567C);
            hVar.v(this);
        }
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.J0(hVar3, this.f28589N);
        }
        this.f28569D.y(hVar3, this.f28589N, z10);
        this.f28584K0.f28666g = true;
    }

    private boolean x0() {
        int iG = this.f28575G.g();
        for (int i10 = 0; i10 < iG; i10++) {
            G gO0 = o0(this.f28575G.f(i10));
            if (gO0 != null && !gO0.shouldIgnore() && gO0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private boolean x1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return u0(-i10) < androidx.core.widget.e.b(edgeEffect) * ((float) i11);
    }

    private int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.e.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.e.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.e.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.e.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    @SuppressLint({"InlinedApi"})
    private void z0() {
        if (X.y(this) == 0) {
            X.z0(this, 8);
        }
    }

    void A() {
        if (!this.f28612a0 || this.f28627j0) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.f28573F.p()) {
            if (!this.f28573F.o(4) || this.f28573F.o(11)) {
                if (this.f28573F.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            E1();
            R0();
            this.f28573F.w();
            if (!this.f28616c0) {
                if (x0()) {
                    H();
                } else {
                    this.f28573F.i();
                }
            }
            I1(true);
            S0();
            Trace.endSection();
        }
    }

    public void A1(int i10, int i11, Interpolator interpolator) {
        B1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    void B0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C4283b.f47995a), resources.getDimensionPixelSize(C4283b.f47997c), resources.getDimensionPixelOffset(C4283b.f47996b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void B1(int i10, int i11, Interpolator interpolator, int i12) {
        C1(i10, i11, interpolator, i12, false);
    }

    void C(int i10, int i11) {
        setMeasuredDimension(q.s(i10, getPaddingLeft() + getPaddingRight(), X.B(this)), q.s(i11, getPaddingTop() + getPaddingBottom(), X.A(this)));
    }

    void C0() {
        this.f28635r0 = null;
        this.f28633p0 = null;
        this.f28634q0 = null;
        this.f28632o0 = null;
    }

    void C1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f28618d0) {
            return;
        }
        if (!qVar.p()) {
            i10 = 0;
        }
        if (!this.f28591O.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            F1(i13, 1);
        }
        this.f28578H0.e(i10, i11, i12, interpolator);
    }

    boolean D0() {
        AccessibilityManager accessibilityManager = this.f28625h0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void D1(int i10) {
        if (this.f28618d0) {
            return;
        }
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.N1(this, this.f28584K0, i10);
        }
    }

    void E(View view) {
        G gO0 = o0(view);
        P0(view);
        h hVar = this.f28589N;
        if (hVar != null && gO0 != null) {
            hVar.B(gO0);
        }
        List<s> list = this.f28626i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28626i0.get(size).b(view);
            }
        }
    }

    public boolean E0() {
        return this.f28629l0 > 0;
    }

    void E1() {
        int i10 = this.f28614b0 + 1;
        this.f28614b0 = i10;
        if (i10 != 1 || this.f28618d0) {
            return;
        }
        this.f28616c0 = false;
    }

    void F(View view) {
        G gO0 = o0(view);
        Q0(view);
        h hVar = this.f28589N;
        if (hVar != null && gO0 != null) {
            hVar.C(gO0);
        }
        List<s> list = this.f28626i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28626i0.get(size).a(view);
            }
        }
    }

    public boolean F1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void G0(int i10) {
        if (this.f28591O == null) {
            return;
        }
        setScrollState(2);
        this.f28591O.C1(i10);
        awakenScrollBars();
    }

    void H() {
        if (this.f28589N == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f28591O == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f28584K0.f28669j = false;
        boolean z10 = this.f28611Z0 && !(this.f28613a1 == getWidth() && this.f28615b1 == getHeight());
        this.f28613a1 = 0;
        this.f28615b1 = 0;
        this.f28611Z0 = false;
        if (this.f28584K0.f28664e == 1) {
            I();
            this.f28591O.E1(this);
            J();
        } else if (this.f28573F.q() || z10 || this.f28591O.s0() != getWidth() || this.f28591O.b0() != getHeight()) {
            this.f28591O.E1(this);
            J();
        } else {
            this.f28591O.E1(this);
        }
        K();
    }

    void H0() {
        int iJ = this.f28575G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((r) this.f28575G.i(i10).getLayoutParams()).f28734c = true;
        }
        this.f28569D.s();
    }

    void I0() {
        int iJ = this.f28575G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            G gO0 = o0(this.f28575G.i(i10));
            if (gO0 != null && !gO0.shouldIgnore()) {
                gO0.addFlags(6);
            }
        }
        H0();
        this.f28569D.t();
    }

    void I1(boolean z10) {
        if (this.f28614b0 < 1) {
            if (f28554g1) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f28614b0 = 1;
        }
        if (!z10 && !this.f28618d0) {
            this.f28616c0 = false;
        }
        if (this.f28614b0 == 1) {
            if (z10 && this.f28616c0 && !this.f28618d0 && this.f28591O != null && this.f28589N != null) {
                H();
            }
            if (!this.f28618d0) {
                this.f28616c0 = false;
            }
        }
        this.f28614b0--;
    }

    public void J1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void K0(int i10) {
        int iG = this.f28575G.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f28575G.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void K1() {
        setScrollState(0);
        L1();
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void L0(int i10) {
        int iG = this.f28575G.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f28575G.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void M0(int i10, int i11) {
        int iJ = this.f28575G.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            G gO0 = o0(this.f28575G.i(i12));
            if (gO0 != null && !gO0.shouldIgnore() && gO0.mPosition >= i10) {
                if (f28555h1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + gO0 + " now at position " + (gO0.mPosition + i11));
                }
                gO0.offsetPosition(i11, false);
                this.f28584K0.f28666g = true;
            }
        }
        this.f28569D.v(i10, i11);
        requestLayout();
    }

    void M1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f28575G.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f28575G.i(i14);
            G gO0 = o0(viewI);
            if (gO0 != null && !gO0.shouldIgnore() && (i12 = gO0.mPosition) >= i10 && i12 < i13) {
                gO0.addFlags(2);
                gO0.addChangePayload(obj);
                ((r) viewI.getLayoutParams()).f28734c = true;
            }
        }
        this.f28569D.R(i10, i11);
    }

    void N(int i10) {
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.j1(i10);
        }
        V0(i10);
        v vVar = this.f28586L0;
        if (vVar != null) {
            vVar.a(this, i10);
        }
        List<v> list = this.f28588M0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28588M0.get(size).a(this, i10);
            }
        }
    }

    void N0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f28575G.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            G gO0 = o0(this.f28575G.i(i16));
            if (gO0 != null && (i15 = gO0.mPosition) >= i13 && i15 <= i12) {
                if (f28555h1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + gO0);
                }
                if (gO0.mPosition == i10) {
                    gO0.offsetPosition(i11 - i10, false);
                } else {
                    gO0.offsetPosition(i14, false);
                }
                this.f28584K0.f28666g = true;
            }
        }
        this.f28569D.w(i10, i11);
        requestLayout();
    }

    void O(int i10, int i11) {
        this.f28630m0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        W0(i10, i11);
        v vVar = this.f28586L0;
        if (vVar != null) {
            vVar.b(this, i10, i11);
        }
        List<v> list = this.f28588M0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28588M0.get(size).b(this, i10, i11);
            }
        }
        this.f28630m0--;
    }

    void O0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f28575G.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            G gO0 = o0(this.f28575G.i(i13));
            if (gO0 != null && !gO0.shouldIgnore()) {
                int i14 = gO0.mPosition;
                if (i14 >= i12) {
                    if (f28555h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + gO0 + " now at position " + (gO0.mPosition - i11));
                    }
                    gO0.offsetPosition(-i11, z10);
                    this.f28584K0.f28666g = true;
                } else if (i14 >= i10) {
                    if (f28555h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + gO0 + " now REMOVED");
                    }
                    gO0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f28584K0.f28666g = true;
                }
            }
        }
        this.f28569D.x(i10, i11, z10);
        requestLayout();
    }

    void P() {
        int i10;
        for (int size = this.f28609X0.size() - 1; size >= 0; size--) {
            G g10 = this.f28609X0.get(size);
            if (g10.itemView.getParent() == this && !g10.shouldIgnore() && (i10 = g10.mPendingAccessibilityState) != -1) {
                g10.itemView.setImportantForAccessibility(i10);
                g10.mPendingAccessibilityState = -1;
            }
        }
        this.f28609X0.clear();
    }

    void R() {
        if (this.f28635r0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f28631n0.a(this, 3);
        this.f28635r0 = edgeEffectA;
        if (this.f28579I) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void R0() {
        this.f28629l0++;
    }

    void S() {
        if (this.f28632o0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f28631n0.a(this, 0);
        this.f28632o0 = edgeEffectA;
        if (this.f28579I) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void S0() {
        T0(true);
    }

    void T() {
        if (this.f28634q0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f28631n0.a(this, 2);
        this.f28634q0 = edgeEffectA;
        if (this.f28579I) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0(boolean z10) {
        int i10 = this.f28629l0 - 1;
        this.f28629l0 = i10;
        if (i10 < 1) {
            if (f28554g1 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.f28629l0 = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    void U() {
        if (this.f28633p0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f28631n0.a(this, 1);
        this.f28633p0 = edgeEffectA;
        if (this.f28579I) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f28589N + ", layout:" + this.f28591O + ", context:" + getContext();
    }

    final void W(C c10) {
        if (getScrollState() != 2) {
            c10.f28675p = 0;
            c10.f28676q = 0;
        } else {
            OverScroller overScroller = this.f28578H0.f28679D;
            c10.f28675p = overScroller.getFinalX() - overScroller.getCurrX();
            c10.f28676q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void X0() {
        if (this.f28596Q0 || !this.f28603U) {
            return;
        }
        X.f0(this, this.f28610Y0);
        this.f28596Q0 = true;
    }

    public G Y(View view) {
        View viewX = X(view);
        if (viewX == null) {
            return null;
        }
        return n0(viewX);
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f28632o0.isFinished()) {
                this.f28632o0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f28634q0.isFinished()) {
                this.f28634q0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f28633p0.isFinished()) {
                this.f28633p0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f28635r0.isFinished()) {
                this.f28635r0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    void a1(boolean z10) {
        this.f28628k0 = z10 | this.f28628k0;
        this.f28627j0 = true;
        I0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        q qVar = this.f28591O;
        if (qVar == null || !qVar.K0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void c1(G g10, n.c cVar) {
        g10.setFlags(0, 8192);
        if (this.f28584K0.f28668i && g10.isUpdated() && !g10.isRemoved() && !g10.shouldIgnore()) {
            this.f28577H.c(k0(g10), g10);
        }
        this.f28577H.e(g10, cVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f28591O.r((r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.p()) {
            return this.f28591O.v(this.f28584K0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.p()) {
            return this.f28591O.w(this.f28584K0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.p()) {
            return this.f28591O.x(this.f28584K0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.q()) {
            return this.f28591O.y(this.f28584K0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.q()) {
            return this.f28591O.z(this.f28584K0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        q qVar = this.f28591O;
        if (qVar != null && qVar.q()) {
            return this.f28591O.A(this.f28584K0);
        }
        return 0;
    }

    public G d0(int i10) {
        G g10 = null;
        if (this.f28627j0) {
            return null;
        }
        int iJ = this.f28575G.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            G gO0 = o0(this.f28575G.i(i11));
            if (gO0 != null && !gO0.isRemoved() && j0(gO0) == i10) {
                if (!this.f28575G.n(gO0.itemView)) {
                    return gO0;
                }
                g10 = gO0;
            }
        }
        return g10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int iH = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.q()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    B1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    B1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zA0 = layoutManager.A0();
                if (keyCode == 122) {
                    if (zA0) {
                        iH = getAdapter().h();
                    }
                } else if (!zA0) {
                    iH = getAdapter().h();
                }
                D1(iH);
                return true;
            }
        } else if (layoutManager.p()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    B1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    B1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zA02 = layoutManager.A0();
                if (keyCode2 == 122) {
                    if (zA02) {
                        iH = getAdapter().h();
                    }
                } else if (!zA02) {
                    iH = getAdapter().h();
                }
                D1(iH);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f28597R.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f28597R.get(i10).i(canvas, this, this.f28584K0);
        }
        EdgeEffect edgeEffect = this.f28632o0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f28579I ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f28632o0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f28633p0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f28579I) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f28633p0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f28634q0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f28579I ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f28634q0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f28635r0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f28579I) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f28635r0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f28636s0 == null || this.f28597R.size() <= 0 || !this.f28636s0.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public G e0(long j10) {
        h hVar = this.f28589N;
        G g10 = null;
        if (hVar != null && hVar.m()) {
            int iJ = this.f28575G.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                G gO0 = o0(this.f28575G.i(i10));
                if (gO0 != null && !gO0.isRemoved() && gO0.getItemId() == j10) {
                    if (!this.f28575G.n(gO0.itemView)) {
                        return gO0;
                    }
                    g10 = gO0;
                }
            }
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.G f0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.f28575G
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.f28575G
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$G r3 = o0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.f28575G
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f0(int, boolean):androidx.recyclerview.widget.RecyclerView$G");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public boolean g0(int i10, int i11) {
        return h0(i10, i11, this.f28568C0, this.f28570D0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f28591O;
        if (qVar != null) {
            return qVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f28591O;
        if (qVar != null) {
            return qVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f28589N;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f28591O;
        return qVar != null ? qVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f28579I;
    }

    public androidx.recyclerview.widget.s getCompatAccessibilityDelegate() {
        return this.f28598R0;
    }

    public m getEdgeEffectFactory() {
        return this.f28631n0;
    }

    public n getItemAnimator() {
        return this.f28636s0;
    }

    public int getItemDecorationCount() {
        return this.f28597R.size();
    }

    public q getLayoutManager() {
        return this.f28591O;
    }

    public int getMaxFlingVelocity() {
        return this.f28570D0;
    }

    public int getMinFlingVelocity() {
        return this.f28568C0;
    }

    long getNanoTime() {
        if (f28560m1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.f28566B0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f28576G0;
    }

    public w getRecycledViewPool() {
        return this.f28569D.i();
    }

    public int getScrollState() {
        return this.f28637t0;
    }

    void h1() {
        n nVar = this.f28636s0;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.p1(this.f28569D);
            this.f28591O.q1(this.f28569D);
        }
        this.f28569D.c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    boolean i0(int i10, int i11) {
        return h0(i10, i11, 0, Integer.MAX_VALUE);
    }

    boolean i1(View view) {
        E1();
        boolean zR = this.f28575G.r(view);
        if (zR) {
            G gO0 = o0(view);
            this.f28569D.O(gO0);
            this.f28569D.H(gO0);
            if (f28555h1) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        I1(!zR);
        return zR;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f28603U;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f28618d0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(p pVar) {
        k(pVar, -1);
    }

    int j0(G g10) {
        if (g10.hasAnyOfTheFlags(524) || !g10.isBound()) {
            return -1;
        }
        return this.f28573F.e(g10.mPosition);
    }

    public void j1(p pVar) {
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f28597R.remove(pVar);
        if (this.f28597R.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H0();
        requestLayout();
    }

    public void k(p pVar, int i10) {
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f28597R.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f28597R.add(pVar);
        } else {
            this.f28597R.add(i10, pVar);
        }
        H0();
        requestLayout();
    }

    long k0(G g10) {
        return this.f28589N.m() ? g10.getItemId() : g10.mPosition;
    }

    public void k1(u uVar) {
        this.f28599S.remove(uVar);
        if (this.f28601T == uVar) {
            this.f28601T = null;
        }
    }

    public void l(s sVar) {
        if (this.f28626i0 == null) {
            this.f28626i0 = new ArrayList();
        }
        this.f28626i0.add(sVar);
    }

    public int l0(View view) {
        G gO0 = o0(view);
        if (gO0 != null) {
            return gO0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void l1(v vVar) {
        List<v> list = this.f28588M0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    public void m(u uVar) {
        this.f28599S.add(uVar);
    }

    public int m0(View view) {
        G gO0 = o0(view);
        if (gO0 != null) {
            return gO0.getLayoutPosition();
        }
        return -1;
    }

    void m1() {
        G g10;
        int iG = this.f28575G.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f28575G.f(i10);
            G gN0 = n0(viewF);
            if (gN0 != null && (g10 = gN0.mShadowingHolder) != null) {
                View view = g10.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void n(v vVar) {
        if (this.f28588M0 == null) {
            this.f28588M0 = new ArrayList();
        }
        this.f28588M0.add(vVar);
    }

    public G n0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return o0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void o(G g10, n.c cVar, n.c cVar2) {
        g10.setIsRecyclable(false);
        if (this.f28636s0.a(g10, cVar, cVar2)) {
            X0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f28629l0 = r0
            r1 = 1
            r5.f28603U = r1
            boolean r2 = r5.f28612a0
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f28612a0 = r1
            androidx.recyclerview.widget.RecyclerView$x r1 = r5.f28569D
            r1.z()
            androidx.recyclerview.widget.RecyclerView$q r1 = r5.f28591O
            if (r1 == 0) goto L23
            r1.E(r5)
        L23:
            r5.f28596Q0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f28560m1
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.k> r0 = androidx.recyclerview.widget.k.f28968F
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.k) r1
            r5.f28580I0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.k r1 = new androidx.recyclerview.widget.k
            r1.<init>()
            r5.f28580I0 = r1
            android.view.Display r1 = s1.X.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.k r2 = r5.f28580I0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f28972D = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.k r0 = r5.f28580I0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.k kVar;
        super.onDetachedFromWindow();
        n nVar = this.f28636s0;
        if (nVar != null) {
            nVar.k();
        }
        K1();
        this.f28603U = false;
        q qVar = this.f28591O;
        if (qVar != null) {
            qVar.F(this, this.f28569D);
        }
        this.f28609X0.clear();
        removeCallbacks(this.f28610Y0);
        this.f28577H.j();
        this.f28569D.A();
        C5048a.c(this);
        if (!f28560m1 || (kVar = this.f28580I0) == null) {
            return;
        }
        kVar.j(this);
        this.f28580I0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f28597R.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f28597R.get(i10).g(canvas, this, this.f28584K0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        if (this.f28591O != null && !this.f28618d0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f10 = this.f28591O.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.f28591O.p() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f10;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f28591O.q()) {
                    float f11 = -axisValue;
                    axisValue = 0.0f;
                    f = f11;
                } else if (!this.f28591O.p()) {
                    axisValue = 0.0f;
                }
                z10 = this.f28617c1;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f * this.f28574F0);
            int i12 = (int) (axisValue * this.f28572E0);
            if (z10) {
                OverScroller overScroller = this.f28578H0.f28679D;
                C1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                J0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                this.f28623f1.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f28618d0) {
            return false;
        }
        this.f28601T = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f28591O;
        if (qVar == null) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f28591O.q();
        if (this.f28639v0 == null) {
            this.f28639v0 = VelocityTracker.obtain();
        }
        this.f28639v0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f28620e0) {
                this.f28620e0 = false;
            }
            this.f28638u0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f28642y0 = x10;
            this.f28640w0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f28643z0 = y10;
            this.f28641x0 = y10;
            if (H1(motionEvent) || this.f28637t0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                J1(1);
            }
            int[] iArr = this.f28606V0;
            iArr[1] = 0;
            iArr[0] = 0;
            G1(0);
        } else if (actionMasked == 1) {
            this.f28639v0.clear();
            J1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f28638u0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f28638u0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f28637t0 != 1) {
                int i10 = x11 - this.f28640w0;
                int i11 = y11 - this.f28641x0;
                if (!zP || Math.abs(i10) <= this.f28564A0) {
                    z10 = false;
                } else {
                    this.f28642y0 = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i11) > this.f28564A0) {
                    this.f28643z0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f28638u0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f28642y0 = x12;
            this.f28640w0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f28643z0 = y12;
            this.f28641x0 = y12;
        } else if (actionMasked == 6) {
            U0(motionEvent);
        }
        return this.f28637t0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f28612a0 = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        q qVar = this.f28591O;
        if (qVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f28591O.e1(this.f28569D, this.f28584K0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f28611Z0 = z10;
            if (z10 || this.f28589N == null) {
                return;
            }
            if (this.f28584K0.f28664e == 1) {
                I();
            }
            this.f28591O.F1(i10, i11);
            this.f28584K0.f28669j = true;
            J();
            this.f28591O.I1(i10, i11);
            if (this.f28591O.L1()) {
                this.f28591O.F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f28584K0.f28669j = true;
                J();
                this.f28591O.I1(i10, i11);
            }
            this.f28613a1 = getMeasuredWidth();
            this.f28615b1 = getMeasuredHeight();
            return;
        }
        if (this.f28605V) {
            this.f28591O.e1(this.f28569D, this.f28584K0, i10, i11);
            return;
        }
        if (this.f28624g0) {
            E1();
            R0();
            Z0();
            S0();
            C c10 = this.f28584K0;
            if (c10.f28671l) {
                c10.f28667h = true;
            } else {
                this.f28573F.j();
                this.f28584K0.f28667h = false;
            }
            this.f28624g0 = false;
            I1(false);
        } else if (this.f28584K0.f28671l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f28589N;
        if (hVar != null) {
            this.f28584K0.f28665f = hVar.h();
        } else {
            this.f28584K0.f28665f = 0;
        }
        E1();
        this.f28591O.e1(this.f28569D, this.f28584K0, i10, i11);
        I1(false);
        this.f28584K0.f28667h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a10 = (A) parcelable;
        this.f28571E = a10;
        super.onRestoreInstanceState(a10.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        A a10 = new A(super.onSaveInstanceState());
        A a11 = this.f28571E;
        if (a11 != null) {
            a10.b(a11);
        } else {
            q qVar = this.f28591O;
            if (qVar != null) {
                a10.f28644D = qVar.i1();
            } else {
                a10.f28644D = null;
            }
        }
        return a10;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        C0();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p0(View view, Rect rect) {
        q0(view, rect);
    }

    void q(G g10, n.c cVar, n.c cVar2) {
        i(g10);
        g10.setIsRecyclable(false);
        if (this.f28636s0.c(g10, cVar, cVar2)) {
            X0();
        }
    }

    void r(String str) {
        if (E0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.f28630m0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    void r1() {
        int iJ = this.f28575G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            G gO0 = o0(this.f28575G.i(i10));
            if (f28554g1 && gO0.mPosition == -1 && !gO0.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!gO0.shouldIgnore()) {
                gO0.saveOldPosition();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        G gO0 = o0(view);
        if (gO0 != null) {
            if (gO0.isTmpDetached()) {
                gO0.clearTmpDetachFlag();
            } else if (!gO0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + gO0 + V());
            }
        } else if (f28554g1) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f28591O.g1(this, this.f28584K0, view, view2) && view2 != null) {
            n1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f28591O.w1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f28599S.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f28599S.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f28614b0 != 0 || this.f28618d0) {
            this.f28616c0 = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(G g10) {
        n nVar = this.f28636s0;
        return nVar == null || nVar.g(g10, g10.getUnmodifiedPayloads());
    }

    boolean s1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f28589N != null) {
            int[] iArr = this.f28608W0;
            iArr[0] = 0;
            iArr[1] = 0;
            t1(i10, i11, iArr);
            int[] iArr2 = this.f28608W0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f28597R.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f28608W0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i14, i13, i15, i16, this.f28604U0, i12, iArr3);
        int[] iArr4 = this.f28608W0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f28642y0;
        int[] iArr5 = this.f28604U0;
        int i24 = iArr5[0];
        this.f28642y0 = i23 - i24;
        int i25 = this.f28643z0;
        int i26 = iArr5[1];
        this.f28643z0 = i25 - i26;
        int[] iArr6 = this.f28606V0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !s1.B.a(motionEvent, 8194)) {
                b1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && s1.B.a(motionEvent, 4194304)) {
                    e1();
                }
            }
            w(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            O(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f28618d0) {
            return;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f28591O.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            s1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (y1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.s sVar) {
        this.f28598R0 = sVar;
        X.n0(this, sVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        v1(hVar, false, true);
        a1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f28579I) {
            C0();
        }
        this.f28579I = z10;
        super.setClipToPadding(z10);
        if (this.f28612a0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(m mVar) {
        r1.i.g(mVar);
        this.f28631n0 = mVar;
        C0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f28605V = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.f28636s0;
        if (nVar2 != null) {
            nVar2.k();
            this.f28636s0.v(null);
        }
        this.f28636s0 = nVar;
        if (nVar != null) {
            nVar.v(this.f28594P0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f28569D.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f28591O) {
            return;
        }
        K1();
        if (this.f28591O != null) {
            n nVar = this.f28636s0;
            if (nVar != null) {
                nVar.k();
            }
            this.f28591O.p1(this.f28569D);
            this.f28591O.q1(this.f28569D);
            this.f28569D.c();
            if (this.f28603U) {
                this.f28591O.F(this, this.f28569D);
            }
            this.f28591O.J1(null);
            this.f28591O = null;
        } else {
            this.f28569D.c();
        }
        this.f28575G.o();
        this.f28591O = qVar;
        if (qVar != null) {
            if (qVar.f28709b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.f28709b.V());
            }
            qVar.J1(this);
            if (this.f28603U) {
                this.f28591O.E(this);
            }
        }
        this.f28569D.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.f28566B0 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f28586L0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f28576G0 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f28569D.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.f28593P = yVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f28637t0) {
            return;
        }
        if (f28555h1) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f28637t0, new Exception());
        }
        this.f28637t0 = i10;
        if (i10 != 2) {
            L1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f28564A0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f28564A0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(E e10) {
        this.f28569D.K(e10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f28618d0) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f28618d0 = true;
                this.f28620e0 = true;
                K1();
                return;
            }
            this.f28618d0 = false;
            if (this.f28616c0 && this.f28591O != null && this.f28589N != null) {
                requestLayout();
            }
            this.f28616c0 = false;
        }
    }

    Rect t0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f28734c) {
            return rVar.f28733b;
        }
        if (this.f28584K0.e() && (rVar.b() || rVar.d())) {
            return rVar.f28733b;
        }
        Rect rect = rVar.f28733b;
        rect.set(0, 0, 0, 0);
        int size = this.f28597R.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f28583K.set(0, 0, 0, 0);
            this.f28597R.get(i10).e(this.f28583K, view, this, this.f28584K0);
            int i11 = rect.left;
            Rect rect2 = this.f28583K;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f28734c = false;
        return rect;
    }

    void t1(int i10, int i11, int[] iArr) {
        E1();
        R0();
        Trace.beginSection("RV Scroll");
        W(this.f28584K0);
        int iB1 = i10 != 0 ? this.f28591O.B1(i10, this.f28569D, this.f28584K0) : 0;
        int iD1 = i11 != 0 ? this.f28591O.D1(i11, this.f28569D, this.f28584K0) : 0;
        Trace.endSection();
        m1();
        S0();
        I1(false);
        if (iArr != null) {
            iArr[0] = iB1;
            iArr[1] = iD1;
        }
    }

    public void u1(int i10) {
        if (this.f28618d0) {
            return;
        }
        K1();
        q qVar = this.f28591O;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.C1(i10);
            awakenScrollBars();
        }
    }

    void v() {
        int iJ = this.f28575G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            G gO0 = o0(this.f28575G.i(i10));
            if (!gO0.shouldIgnore()) {
                gO0.clearOldPosition();
            }
        }
        this.f28569D.d();
    }

    void w(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f28632o0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f28632o0.onRelease();
            zIsFinished = this.f28632o0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f28634q0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f28634q0.onRelease();
            zIsFinished |= this.f28634q0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f28633p0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f28633p0.onRelease();
            zIsFinished |= this.f28633p0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f28635r0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f28635r0.onRelease();
            zIsFinished |= this.f28635r0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public boolean w0() {
        return !this.f28612a0 || this.f28627j0 || this.f28573F.p();
    }

    boolean w1(G g10, int i10) {
        if (!E0()) {
            g10.itemView.setImportantForAccessibility(i10);
            return true;
        }
        g10.mPendingAccessibilityState = i10;
        this.f28609X0.add(g10);
        return false;
    }

    int x(int i10) {
        return y(i10, this.f28632o0, this.f28634q0, getWidth());
    }

    void y0() {
        this.f28573F = new a(new C2170g());
    }

    boolean y1(AccessibilityEvent accessibilityEvent) {
        if (!E0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? t1.b.a(accessibilityEvent) : 0;
        this.f28622f0 |= iA != 0 ? iA : 0;
        return true;
    }

    int z(int i10) {
        return y(i10, this.f28633p0, this.f28635r0, getHeight());
    }

    public void z1(int i10, int i11) {
        A1(i10, i11, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4282a.f47994a);
    }

    public static class A extends AbstractC5121a {
        public static final Parcelable.Creator<A> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        Parcelable f28644D;

        class a implements Parcelable.ClassLoaderCreator<A> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public A createFromParcel(Parcel parcel) {
                return new A(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public A createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new A(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public A[] newArray(int i10) {
                return new A[i10];
            }
        }

        A(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28644D = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        void b(A a10) {
            this.f28644D = a10.f28644D;
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f28644D, 0);
        }

        A(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.f28567C = new z();
        this.f28569D = new x();
        this.f28577H = new androidx.recyclerview.widget.y();
        this.f28581J = new RunnableC2164a();
        this.f28583K = new Rect();
        this.f28585L = new Rect();
        this.f28587M = new RectF();
        this.f28595Q = new ArrayList();
        this.f28597R = new ArrayList<>();
        this.f28599S = new ArrayList<>();
        this.f28614b0 = 0;
        this.f28627j0 = false;
        this.f28628k0 = false;
        this.f28629l0 = 0;
        this.f28630m0 = 0;
        this.f28631n0 = f28563p1;
        this.f28636s0 = new g();
        this.f28637t0 = 0;
        this.f28638u0 = -1;
        this.f28572E0 = Float.MIN_VALUE;
        this.f28574F0 = Float.MIN_VALUE;
        this.f28576G0 = true;
        this.f28578H0 = new F();
        this.f28582J0 = f28560m1 ? new k.b() : null;
        this.f28584K0 = new C();
        this.f28590N0 = false;
        this.f28592O0 = false;
        this.f28594P0 = new o();
        this.f28596Q0 = false;
        this.f28600S0 = new int[2];
        this.f28604U0 = new int[2];
        this.f28606V0 = new int[2];
        this.f28608W0 = new int[2];
        this.f28609X0 = new ArrayList();
        this.f28610Y0 = new RunnableC2165b();
        this.f28613a1 = 0;
        this.f28615b1 = 0;
        this.f28619d1 = new C2167d();
        C2168e c2168e = new C2168e();
        this.f28621e1 = c2168e;
        this.f28623f1 = new C4449o(getContext(), c2168e);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f28564A0 = viewConfiguration.getScaledTouchSlop();
        this.f28572E0 = C4422a0.e(viewConfiguration, context);
        this.f28574F0 = C4422a0.h(viewConfiguration, context);
        this.f28568C0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f28570D0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f28565B = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f28636s0.v(this.f28594P0);
        y0();
        A0();
        z0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f28625h0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.s(this));
        int[] iArr = C4284c.f47998a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        X.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(C4284c.f48007j);
        if (typedArrayObtainStyledAttributes.getInt(C4284c.f48001d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f28579I = typedArrayObtainStyledAttributes.getBoolean(C4284c.f48000c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C4284c.f48002e, false);
        this.f28607W = z10;
        if (z10) {
            B0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C4284c.f48005h), typedArrayObtainStyledAttributes.getDrawable(C4284c.f48006i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C4284c.f48003f), typedArrayObtainStyledAttributes.getDrawable(C4284c.f48004g));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f28617c1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i10, 0);
        int[] iArr2 = f28556i1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        X.l0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        C5048a.h(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        G f28732a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f28733b;

        /* renamed from: c, reason: collision with root package name */
        boolean f28734c;

        /* renamed from: d, reason: collision with root package name */
        boolean f28735d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28733b = new Rect();
            this.f28734c = true;
            this.f28735d = false;
        }

        public int a() {
            return this.f28732a.getLayoutPosition();
        }

        public boolean b() {
            return this.f28732a.isUpdated();
        }

        public boolean c() {
            return this.f28732a.isRemoved();
        }

        public boolean d() {
            return this.f28732a.isInvalid();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.f28733b = new Rect();
            this.f28734c = true;
            this.f28735d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28733b = new Rect();
            this.f28734c = true;
            this.f28735d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28733b = new Rect();
            this.f28734c = true;
            this.f28735d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.f28733b = new Rect();
            this.f28734c = true;
            this.f28735d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f28591O;
        if (qVar != null) {
            return qVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public static abstract class j {
        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void a() {
        }

        public void g() {
        }

        public void b(int i10, int i11) {
        }

        public void d(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }
    }

    public static abstract class h<VH extends G> {

        /* renamed from: B, reason: collision with root package name */
        private final i f28690B = new i();

        /* renamed from: C, reason: collision with root package name */
        private boolean f28691C = false;

        /* renamed from: D, reason: collision with root package name */
        private a f28692D = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public boolean A(VH vh) {
            return false;
        }

        public void E(j jVar) {
            this.f28690B.registerObserver(jVar);
        }

        public void F(boolean z10) {
            if (l()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f28691C = z10;
        }

        public void G(a aVar) {
            this.f28692D = aVar;
            this.f28690B.h();
        }

        public void H(j jVar) {
            this.f28690B.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(VH vh, int i10) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i10;
                if (m()) {
                    vh.mItemId = i(i10);
                }
                vh.setFlags(1, 519);
                if (n1.o.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh.mItemViewType)));
                }
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.f28554g1) {
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow() != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            x(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f28734c = true;
                }
                Trace.endSection();
            }
        }

        boolean e() {
            int iOrdinal = this.f28692D.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : h() > 0;
        }

        public final VH f(ViewGroup viewGroup, int i10) {
            try {
                if (n1.o.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                VH vh = (VH) y(viewGroup, i10);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i10;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public int g(h<? extends G> hVar, G g10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int h();

        public long i(int i10) {
            return -1L;
        }

        public int j(int i10) {
            return 0;
        }

        public final a k() {
            return this.f28692D;
        }

        public final boolean l() {
            return this.f28690B.a();
        }

        public final boolean m() {
            return this.f28691C;
        }

        public final void n() {
            this.f28690B.b();
        }

        public final void o(int i10) {
            this.f28690B.d(i10, 1);
        }

        public final void p(int i10, int i11) {
            this.f28690B.c(i10, i11);
        }

        public final void q(int i10, int i11) {
            this.f28690B.d(i10, i11);
        }

        public final void r(int i10, int i11, Object obj) {
            this.f28690B.e(i10, i11, obj);
        }

        public final void s(int i10, int i11) {
            this.f28690B.f(i10, i11);
        }

        public final void t(int i10, int i11) {
            this.f28690B.g(i10, i11);
        }

        public final void u(int i10) {
            this.f28690B.g(i10, 1);
        }

        public abstract void w(VH vh, int i10);

        public void x(VH vh, int i10, List<Object> list) {
            w(vh, i10);
        }

        public abstract VH y(ViewGroup viewGroup, int i10);

        public void B(VH vh) {
        }

        public void C(VH vh) {
        }

        public void D(VH vh) {
        }

        public void v(RecyclerView recyclerView) {
        }

        public void z(RecyclerView recyclerView) {
        }
    }

    public static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        private b f28697a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<a> f28698b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f28699c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f28700d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f28701e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f28702f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(G g10);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f28703a;

            /* renamed from: b, reason: collision with root package name */
            public int f28704b;

            /* renamed from: c, reason: collision with root package name */
            public int f28705c;

            /* renamed from: d, reason: collision with root package name */
            public int f28706d;

            public c a(G g10) {
                return b(g10, 0);
            }

            public c b(G g10, int i10) {
                View view = g10.itemView;
                this.f28703a = view.getLeft();
                this.f28704b = view.getTop();
                this.f28705c = view.getRight();
                this.f28706d = view.getBottom();
                return this;
            }
        }

        static int e(G g10) {
            int i10 = g10.mFlags;
            int i11 = i10 & 14;
            if (g10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int oldPosition = g10.getOldPosition();
            int absoluteAdapterPosition = g10.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i11 : i11 | 2048;
        }

        public abstract boolean a(G g10, c cVar, c cVar2);

        public abstract boolean b(G g10, G g11, c cVar, c cVar2);

        public abstract boolean c(G g10, c cVar, c cVar2);

        public abstract boolean d(G g10, c cVar, c cVar2);

        public abstract boolean f(G g10);

        public boolean g(G g10, List<Object> list) {
            return f(g10);
        }

        public final void h(G g10) {
            r(g10);
            b bVar = this.f28697a;
            if (bVar != null) {
                bVar.a(g10);
            }
        }

        public final void i() {
            int size = this.f28698b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f28698b.get(i10).a();
            }
            this.f28698b.clear();
        }

        public abstract void j(G g10);

        public abstract void k();

        public long l() {
            return this.f28699c;
        }

        public long m() {
            return this.f28702f;
        }

        public long n() {
            return this.f28701e;
        }

        public long o() {
            return this.f28700d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public c s(C c10, G g10) {
            return q().a(g10);
        }

        public c t(C c10, G g10, int i10, List<Object> list) {
            return q().a(g10);
        }

        public abstract void u();

        void v(b bVar) {
            this.f28697a = bVar;
        }

        public void r(G g10) {
        }
    }

    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.d f28708a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f28709b;

        /* renamed from: c, reason: collision with root package name */
        private final x.b f28710c;

        /* renamed from: d, reason: collision with root package name */
        private final x.b f28711d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.x f28712e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.x f28713f;

        /* renamed from: g, reason: collision with root package name */
        B f28714g;

        /* renamed from: h, reason: collision with root package name */
        boolean f28715h;

        /* renamed from: i, reason: collision with root package name */
        boolean f28716i;

        /* renamed from: j, reason: collision with root package name */
        boolean f28717j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f28718k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f28719l;

        /* renamed from: m, reason: collision with root package name */
        int f28720m;

        /* renamed from: n, reason: collision with root package name */
        boolean f28721n;

        /* renamed from: o, reason: collision with root package name */
        private int f28722o;

        /* renamed from: p, reason: collision with root package name */
        private int f28723p;

        /* renamed from: q, reason: collision with root package name */
        private int f28724q;

        /* renamed from: r, reason: collision with root package name */
        private int f28725r;

        class a implements x.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.x.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.x.b
            public int b(View view) {
                return q.this.V(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.x.b
            public int c() {
                return q.this.i0();
            }

            @Override // androidx.recyclerview.widget.x.b
            public int d() {
                return q.this.s0() - q.this.j0();
            }

            @Override // androidx.recyclerview.widget.x.b
            public int e(View view) {
                return q.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements x.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.x.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.x.b
            public int b(View view) {
                return q.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.x.b
            public int c() {
                return q.this.k0();
            }

            @Override // androidx.recyclerview.widget.x.b
            public int d() {
                return q.this.b0() - q.this.h0();
            }

            @Override // androidx.recyclerview.widget.x.b
            public int e(View view) {
                return q.this.T(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f28728a;

            /* renamed from: b, reason: collision with root package name */
            public int f28729b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f28730c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f28731d;
        }

        public q() {
            a aVar = new a();
            this.f28710c = aVar;
            b bVar = new b();
            this.f28711d = bVar;
            this.f28712e = new androidx.recyclerview.widget.x(aVar);
            this.f28713f = new androidx.recyclerview.widget.x(bVar);
            this.f28715h = false;
            this.f28716i = false;
            this.f28717j = false;
            this.f28718k = true;
            this.f28719l = true;
        }

        private void A1(x xVar, int i10, View view) {
            G gO0 = RecyclerView.o0(view);
            if (gO0.shouldIgnore()) {
                if (RecyclerView.f28555h1) {
                    Log.d("RecyclerView", "ignoring view " + gO0);
                    return;
                }
                return;
            }
            if (gO0.isInvalid() && !gO0.isRemoved() && !this.f28709b.f28589N.m()) {
                v1(i10);
                xVar.H(gO0);
            } else {
                C(i10);
                xVar.I(view);
                this.f28709b.f28577H.k(gO0);
            }
        }

        private static boolean B0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f28708a.d(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i10, boolean z10) {
            G gO0 = RecyclerView.o0(view);
            if (z10 || gO0.isRemoved()) {
                this.f28709b.f28577H.b(gO0);
            } else {
                this.f28709b.f28577H.p(gO0);
            }
            r rVar = (r) view.getLayoutParams();
            if (gO0.wasReturnedFromScrap() || gO0.isScrap()) {
                if (gO0.isScrap()) {
                    gO0.unScrap();
                } else {
                    gO0.clearReturnedFromScrapFlag();
                }
                this.f28708a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f28709b) {
                int iM = this.f28708a.m(view);
                if (i10 == -1) {
                    i10 = this.f28708a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f28709b.indexOfChild(view) + this.f28709b.V());
                }
                if (iM != i10) {
                    this.f28709b.f28591O.G0(iM, i10);
                }
            } else {
                this.f28708a.a(view, i10, false);
                rVar.f28734c = true;
                B b10 = this.f28714g;
                if (b10 != null && b10.h()) {
                    this.f28714g.k(view);
                }
            }
            if (rVar.f28735d) {
                if (RecyclerView.f28555h1) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f28732a);
                }
                gO0.itemView.invalidate();
                rVar.f28735d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4284c.f47998a, i10, i11);
            dVar.f28728a = typedArrayObtainStyledAttributes.getInt(C4284c.f47999b, 1);
            dVar.f28729b = typedArrayObtainStyledAttributes.getInt(C4284c.f48009l, 1);
            dVar.f28730c = typedArrayObtainStyledAttributes.getBoolean(C4284c.f48008k, false);
            dVar.f28731d = typedArrayObtainStyledAttributes.getBoolean(C4284c.f48010m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f28709b.f28583K;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        public int A(C c10) {
            return 0;
        }

        public boolean A0() {
            return false;
        }

        public void B(x xVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                A1(xVar, iO, N(iO));
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int B1(int i10, x xVar, C c10) {
            return 0;
        }

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0() {
            B b10 = this.f28714g;
            return b10 != null && b10.h();
        }

        public void C1(int i10) {
            if (RecyclerView.f28555h1) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public boolean D0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f28712e.b(view, 24579) && this.f28713f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        @SuppressLint({"UnknownNullness"})
        public int D1(int i10, x xVar, C c10) {
            return 0;
        }

        void E(RecyclerView recyclerView) {
            this.f28716i = true;
            L0(recyclerView);
        }

        public void E0(View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f28733b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        void E1(RecyclerView recyclerView) {
            F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void F(RecyclerView recyclerView, x xVar) {
            this.f28716i = false;
            N0(recyclerView, xVar);
        }

        public void F0(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect rectT0 = this.f28709b.t0(view);
            int i12 = i10 + rectT0.left + rectT0.right;
            int i13 = i11 + rectT0.top + rectT0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, q());
            if (K1(view, iP, iP2, rVar)) {
                view.measure(iP, iP2);
            }
        }

        void F1(int i10, int i11) {
            this.f28724q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f28722o = mode;
            if (mode == 0 && !RecyclerView.f28559l1) {
                this.f28724q = 0;
            }
            this.f28725r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f28723p = mode2;
            if (mode2 != 0 || RecyclerView.f28559l1) {
                return;
            }
            this.f28725r = 0;
        }

        public View G(View view) {
            View viewX;
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null || (viewX = recyclerView.X(view)) == null || this.f28708a.n(viewX)) {
                return null;
            }
            return viewX;
        }

        public void G0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f28709b.toString());
            }
        }

        public void G1(int i10, int i11) {
            this.f28709b.setMeasuredDimension(i10, i11);
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                G gO0 = RecyclerView.o0(viewN);
                if (gO0 != null && gO0.getLayoutPosition() == i10 && !gO0.shouldIgnore() && (this.f28709b.f28584K0.e() || !gO0.isRemoved())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                recyclerView.K0(i10);
            }
        }

        public void H1(Rect rect, int i10, int i11) {
            G1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract r I();

        public void I0(int i10) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        void I1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f28709b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f28709b.f28583K;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f28709b.f28583K.set(i15, i13, i12, i14);
            H1(this.f28709b.f28583K, i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public r J(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        void J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f28709b = null;
                this.f28708a = null;
                this.f28724q = 0;
                this.f28725r = 0;
            } else {
                this.f28709b = recyclerView;
                this.f28708a = recyclerView.f28575G;
                this.f28724q = recyclerView.getWidth();
                this.f28725r = recyclerView.getHeight();
            }
            this.f28722o = 1073741824;
            this.f28723p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public r K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof r ? new r((r) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public boolean K0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        boolean K1(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.f28718k && B0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int L() {
            return -1;
        }

        boolean L1() {
            return false;
        }

        public int M(View view) {
            return ((r) view.getLayoutParams()).f28733b.bottom;
        }

        boolean M1(View view, int i10, int i11, r rVar) {
            return (this.f28718k && B0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public View N(int i10) {
            androidx.recyclerview.widget.d dVar = this.f28708a;
            if (dVar != null) {
                return dVar.f(i10);
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void N0(RecyclerView recyclerView, x xVar) {
            M0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void N1(RecyclerView recyclerView, C c10, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int O() {
            androidx.recyclerview.widget.d dVar = this.f28708a;
            if (dVar != null) {
                return dVar.g();
            }
            return 0;
        }

        public View O0(View view, int i10, x xVar, C c10) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void O1(B b10) {
            B b11 = this.f28714g;
            if (b11 != null && b10 != b11 && b11.h()) {
                this.f28714g.r();
            }
            this.f28714g = b10;
            b10.q(this.f28709b, this);
        }

        public void P0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f28709b;
            Q0(recyclerView.f28569D, recyclerView.f28584K0, accessibilityEvent);
        }

        void P1() {
            B b10 = this.f28714g;
            if (b10 != null) {
                b10.r();
            }
        }

        public void Q0(x xVar, C c10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f28709b.canScrollVertically(-1) && !this.f28709b.canScrollHorizontally(-1) && !this.f28709b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f28709b.f28589N;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.h());
            }
        }

        public boolean Q1() {
            return false;
        }

        public boolean R() {
            RecyclerView recyclerView = this.f28709b;
            return recyclerView != null && recyclerView.f28579I;
        }

        public void R0(x xVar, C c10, t1.t tVar) {
            if (this.f28709b.canScrollVertically(-1) || this.f28709b.canScrollHorizontally(-1)) {
                tVar.a(8192);
                tVar.K0(true);
                tVar.t0(true);
            }
            if (this.f28709b.canScrollVertically(1) || this.f28709b.canScrollHorizontally(1)) {
                tVar.a(4096);
                tVar.K0(true);
                tVar.t0(true);
            }
            tVar.j0(t.e.a(o0(xVar, c10), S(xVar, c10), z0(xVar, c10), p0(xVar, c10)));
        }

        public int S(x xVar, C c10) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null || recyclerView.f28589N == null || !p()) {
                return 1;
            }
            return this.f28709b.f28589N.h();
        }

        void S0(t1.t tVar) {
            RecyclerView recyclerView = this.f28709b;
            R0(recyclerView.f28569D, recyclerView.f28584K0, tVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        void T0(View view, t1.t tVar) {
            G gO0 = RecyclerView.o0(view);
            if (gO0 == null || gO0.isRemoved() || this.f28708a.n(gO0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f28709b;
            U0(recyclerView.f28569D, recyclerView.f28584K0, view, tVar);
        }

        public void U(View view, Rect rect) {
            RecyclerView.q0(view, rect);
        }

        public void U0(x xVar, C c10, View view, t1.t tVar) {
            tVar.k0(t.f.a(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public View V0(View view, int i10) {
            return null;
        }

        public int W(View view) {
            Rect rect = ((r) view.getLayoutParams()).f28733b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int X(View view) {
            Rect rect = ((r) view.getLayoutParams()).f28733b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public int a() {
            RecyclerView recyclerView = this.f28709b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.h();
            }
            return 0;
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f28708a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int b0() {
            return this.f28725r;
        }

        public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            a1(recyclerView, i10, i11);
        }

        public int c0() {
            return this.f28723p;
        }

        @SuppressLint({"UnknownNullness"})
        public void c1(x xVar, C c10) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d0() {
            return this.f28709b.getLayoutDirection();
        }

        public int e0(View view) {
            return ((r) view.getLayoutParams()).f28733b.left;
        }

        public void e1(x xVar, C c10, int i10, int i11) {
            this.f28709b.C(i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public void f(View view) {
            g(view, -1);
        }

        public int f0() {
            return X.A(this.f28709b);
        }

        @Deprecated
        public boolean f1(RecyclerView recyclerView, View view, View view2) {
            return C0() || recyclerView.E0();
        }

        @SuppressLint({"UnknownNullness"})
        public void g(View view, int i10) {
            k(view, i10, true);
        }

        public int g0() {
            return X.B(this.f28709b);
        }

        public boolean g1(RecyclerView recyclerView, C c10, View view, View view2) {
            return f1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view) {
            i(view, -1);
        }

        public int h0() {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view, int i10) {
            k(view, i10, false);
        }

        public int i0() {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        public int j0() {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int k0() {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        void k1(B b10) {
            if (this.f28714g == b10) {
                this.f28714g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void l(String str) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(View view) {
            return ((r) view.getLayoutParams()).a();
        }

        boolean l1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f28709b;
            return m1(recyclerView.f28569D, recyclerView.f28584K0, i10, bundle);
        }

        public void m(View view, int i10) {
            n(view, i10, (r) view.getLayoutParams());
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m1(androidx.recyclerview.widget.RecyclerView.x r11, androidx.recyclerview.widget.RecyclerView.C r12, int r13, android.os.Bundle r14) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q.m1(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C, int, android.os.Bundle):boolean");
        }

        public void n(View view, int i10, r rVar) {
            G gO0 = RecyclerView.o0(view);
            if (gO0.isRemoved()) {
                this.f28709b.f28577H.b(gO0);
            } else {
                this.f28709b.f28577H.p(gO0);
            }
            this.f28708a.c(view, i10, rVar, gO0.isRemoved());
        }

        public int n0(View view) {
            return ((r) view.getLayoutParams()).f28733b.right;
        }

        boolean n1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f28709b;
            return o1(recyclerView.f28569D, recyclerView.f28584K0, view, i10, bundle);
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.t0(view));
            }
        }

        public int o0(x xVar, C c10) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView == null || recyclerView.f28589N == null || !q()) {
                return 1;
            }
            return this.f28709b.f28589N.h();
        }

        public boolean o1(x xVar, C c10, View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean p() {
            return false;
        }

        public int p0(x xVar, C c10) {
            return 0;
        }

        public void p1(x xVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.o0(N(iO)).shouldIgnore()) {
                    s1(iO, xVar);
                }
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(View view) {
            return ((r) view.getLayoutParams()).f28733b.top;
        }

        void q1(x xVar) {
            int iJ = xVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = xVar.n(i10);
                G gO0 = RecyclerView.o0(viewN);
                if (!gO0.shouldIgnore()) {
                    gO0.setIsRecyclable(false);
                    if (gO0.isTmpDetached()) {
                        this.f28709b.removeDetachedView(viewN, false);
                    }
                    n nVar = this.f28709b.f28636s0;
                    if (nVar != null) {
                        nVar.j(gO0);
                    }
                    gO0.setIsRecyclable(true);
                    xVar.D(viewN);
                }
            }
            xVar.e();
            if (iJ > 0) {
                this.f28709b.invalidate();
            }
        }

        public boolean r(r rVar) {
            return rVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).f28733b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f28709b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f28709b.f28587M;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(View view, x xVar) {
            u1(view);
            xVar.G(view);
        }

        public int s0() {
            return this.f28724q;
        }

        public void s1(int i10, x xVar) {
            View viewN = N(i10);
            v1(i10);
            xVar.G(viewN);
        }

        public int t0() {
            return this.f28722o;
        }

        public boolean t1(Runnable runnable) {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u1(View view) {
            this.f28708a.p(view);
        }

        public int v(C c10) {
            return 0;
        }

        public boolean v0() {
            return this.f28716i;
        }

        public void v1(int i10) {
            if (N(i10) != null) {
                this.f28708a.q(i10);
            }
        }

        public int w(C c10) {
            return 0;
        }

        public boolean w0() {
            return this.f28717j;
        }

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return x1(recyclerView, view, rect, z10, false);
        }

        public int x(C c10) {
            return 0;
        }

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.z1(i10, i11);
            }
            return true;
        }

        public int y(C c10) {
            return 0;
        }

        public final boolean y0() {
            return this.f28719l;
        }

        public void y1() {
            RecyclerView recyclerView = this.f28709b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int z(C c10) {
            return 0;
        }

        public boolean z0(x xVar, C c10) {
            return false;
        }

        public void z1() {
            this.f28715h = true;
        }

        public void L0(RecyclerView recyclerView) {
        }

        @Deprecated
        public void M0(RecyclerView recyclerView) {
        }

        public void X0(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void d1(C c10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(Parcelable parcelable) {
        }

        public void j1(int i10) {
        }

        public void J0(h hVar, h hVar2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i10, c cVar) {
        }

        public void W0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void a1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        @SuppressLint({"UnknownNullness"})
        public void t(int i10, int i11, C c10, c cVar) {
        }
    }

    public final class x {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<G> f28743a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<G> f28744b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<G> f28745c;

        /* renamed from: d, reason: collision with root package name */
        private final List<G> f28746d;

        /* renamed from: e, reason: collision with root package name */
        private int f28747e;

        /* renamed from: f, reason: collision with root package name */
        int f28748f;

        /* renamed from: g, reason: collision with root package name */
        w f28749g;

        public x() {
            ArrayList<G> arrayList = new ArrayList<>();
            this.f28743a = arrayList;
            this.f28744b = null;
            this.f28745c = new ArrayList<>();
            this.f28746d = Collections.unmodifiableList(arrayList);
            this.f28747e = 2;
            this.f28748f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z10) {
            w wVar = this.f28749g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        private boolean M(G g10, int i10, int i11, long j10) {
            g10.mBindingAdapter = null;
            g10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = g10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f28749g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (g10.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(g10.itemView, recyclerView.getChildCount(), g10.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f28589N.d(g10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(g10.itemView);
            }
            this.f28749g.f(g10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(g10);
            if (RecyclerView.this.f28584K0.e()) {
                g10.mPreLayoutPosition = i11;
            }
            return true;
        }

        private void b(G g10) {
            if (RecyclerView.this.D0()) {
                View view = g10.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.s sVar = RecyclerView.this.f28598R0;
                if (sVar == null) {
                    return;
                }
                C4421a c4421aN = sVar.n();
                if (c4421aN instanceof s.a) {
                    ((s.a) c4421aN).o(view);
                }
                X.n0(view, c4421aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(G g10) {
            View view = g10.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f28749g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f28589N == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f28749g.b(RecyclerView.this.f28589N);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f28745c.size(); i10++) {
                C5048a.b(this.f28745c.get(i10).itemView);
            }
            B(RecyclerView.this.f28589N);
        }

        void D(View view) {
            G gO0 = RecyclerView.o0(view);
            gO0.mScrapContainer = null;
            gO0.mInChangeScrap = false;
            gO0.clearReturnedFromScrapFlag();
            H(gO0);
        }

        void E() {
            for (int size = this.f28745c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f28745c.clear();
            if (RecyclerView.f28560m1) {
                RecyclerView.this.f28582J0.b();
            }
        }

        void F(int i10) {
            if (RecyclerView.f28555h1) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            G g10 = this.f28745c.get(i10);
            if (RecyclerView.f28555h1) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + g10);
            }
            a(g10, true);
            this.f28745c.remove(i10);
        }

        public void G(View view) {
            G gO0 = RecyclerView.o0(view);
            if (gO0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (gO0.isScrap()) {
                gO0.unScrap();
            } else if (gO0.wasReturnedFromScrap()) {
                gO0.clearReturnedFromScrapFlag();
            }
            H(gO0);
            if (RecyclerView.this.f28636s0 == null || gO0.isRecyclable()) {
                return;
            }
            RecyclerView.this.f28636s0.j(gO0);
        }

        void H(G g10) {
            boolean z10;
            boolean z11 = true;
            if (g10.isScrap() || g10.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(g10.isScrap());
                sb2.append(" isAttached:");
                sb2.append(g10.itemView.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (g10.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g10 + RecyclerView.this.V());
            }
            if (g10.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean zDoesTransientStatePreventRecycling = g10.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f28589N;
            boolean z12 = hVar != null && zDoesTransientStatePreventRecycling && hVar.A(g10);
            if (RecyclerView.f28554g1 && this.f28745c.contains(g10)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + g10 + RecyclerView.this.V());
            }
            if (z12 || g10.isRecyclable()) {
                if (this.f28748f <= 0 || g10.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f28745c.size();
                    if (size >= this.f28748f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f28560m1 && size > 0 && !RecyclerView.this.f28582J0.d(g10.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f28582J0.d(this.f28745c.get(i10).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f28745c.add(size, g10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(g10, true);
                }
                z = z10;
            } else {
                if (RecyclerView.f28555h1) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z11 = false;
            }
            RecyclerView.this.f28577H.q(g10);
            if (z || z11 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            C5048a.b(g10.itemView);
            g10.mBindingAdapter = null;
            g10.mOwnerRecyclerView = null;
        }

        void I(View view) {
            G gO0 = RecyclerView.o0(view);
            if (!gO0.hasAnyOfTheFlags(12) && gO0.isUpdated() && !RecyclerView.this.s(gO0)) {
                if (this.f28744b == null) {
                    this.f28744b = new ArrayList<>();
                }
                gO0.setScrapContainer(this, true);
                this.f28744b.add(gO0);
                return;
            }
            if (!gO0.isInvalid() || gO0.isRemoved() || RecyclerView.this.f28589N.m()) {
                gO0.setScrapContainer(this, false);
                this.f28743a.add(gO0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(w wVar) {
            B(RecyclerView.this.f28589N);
            w wVar2 = this.f28749g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f28749g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f28749g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f28747e = i10;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.G N(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$G");
        }

        void O(G g10) {
            if (g10.mInChangeScrap) {
                this.f28744b.remove(g10);
            } else {
                this.f28743a.remove(g10);
            }
            g10.mScrapContainer = null;
            g10.mInChangeScrap = false;
            g10.clearReturnedFromScrapFlag();
        }

        void P() {
            q qVar = RecyclerView.this.f28591O;
            this.f28748f = this.f28747e + (qVar != null ? qVar.f28720m : 0);
            for (int size = this.f28745c.size() - 1; size >= 0 && this.f28745c.size() > this.f28748f; size--) {
                F(size);
            }
        }

        boolean Q(G g10) {
            if (g10.isRemoved()) {
                if (!RecyclerView.f28554g1 || RecyclerView.this.f28584K0.e()) {
                    return RecyclerView.this.f28584K0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = g10.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f28589N.h()) {
                if (RecyclerView.this.f28584K0.e() || RecyclerView.this.f28589N.j(g10.mPosition) == g10.getItemViewType()) {
                    return !RecyclerView.this.f28589N.m() || g10.getItemId() == RecyclerView.this.f28589N.i(g10.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g10 + RecyclerView.this.V());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f28745c.size() - 1; size >= 0; size--) {
                G g10 = this.f28745c.get(size);
                if (g10 != null && (i12 = g10.mPosition) >= i10 && i12 < i13) {
                    g10.addFlags(2);
                    F(size);
                }
            }
        }

        void a(G g10, boolean z10) {
            RecyclerView.u(g10);
            View view = g10.itemView;
            androidx.recyclerview.widget.s sVar = RecyclerView.this.f28598R0;
            if (sVar != null) {
                C4421a c4421aN = sVar.n();
                X.n0(view, c4421aN instanceof s.a ? ((s.a) c4421aN).n(view) : null);
            }
            if (z10) {
                g(g10);
            }
            g10.mBindingAdapter = null;
            g10.mOwnerRecyclerView = null;
            i().k(g10);
        }

        public void c() {
            this.f28743a.clear();
            E();
        }

        void d() {
            int size = this.f28745c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f28745c.get(i10).clearOldPosition();
            }
            int size2 = this.f28743a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f28743a.get(i11).clearOldPosition();
            }
            ArrayList<G> arrayList = this.f28744b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f28744b.get(i12).clearOldPosition();
                }
            }
        }

        void e() {
            this.f28743a.clear();
            ArrayList<G> arrayList = this.f28744b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f28584K0.b()) {
                return !RecyclerView.this.f28584K0.e() ? i10 : RecyclerView.this.f28573F.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f28584K0.b() + RecyclerView.this.V());
        }

        void g(G g10) {
            y yVar = RecyclerView.this.f28593P;
            if (yVar != null) {
                yVar.a(g10);
            }
            int size = RecyclerView.this.f28595Q.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f28595Q.get(i10).a(g10);
            }
            h hVar = RecyclerView.this.f28589N;
            if (hVar != null) {
                hVar.D(g10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f28584K0 != null) {
                recyclerView.f28577H.q(g10);
            }
            if (RecyclerView.f28555h1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + g10);
            }
        }

        G h(int i10) {
            int size;
            int iM;
            ArrayList<G> arrayList = this.f28744b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    G g10 = this.f28744b.get(i11);
                    if (!g10.wasReturnedFromScrap() && g10.getLayoutPosition() == i10) {
                        g10.addFlags(32);
                        return g10;
                    }
                }
                if (RecyclerView.this.f28589N.m() && (iM = RecyclerView.this.f28573F.m(i10)) > 0 && iM < RecyclerView.this.f28589N.h()) {
                    long jI = RecyclerView.this.f28589N.i(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        G g11 = this.f28744b.get(i12);
                        if (!g11.wasReturnedFromScrap() && g11.getItemId() == jI) {
                            g11.addFlags(32);
                            return g11;
                        }
                    }
                }
            }
            return null;
        }

        w i() {
            if (this.f28749g == null) {
                this.f28749g = new w();
                u();
            }
            return this.f28749g;
        }

        int j() {
            return this.f28743a.size();
        }

        public List<G> k() {
            return this.f28746d;
        }

        G l(long j10, int i10, boolean z10) {
            for (int size = this.f28743a.size() - 1; size >= 0; size--) {
                G g10 = this.f28743a.get(size);
                if (g10.getItemId() == j10 && !g10.wasReturnedFromScrap()) {
                    if (i10 == g10.getItemViewType()) {
                        g10.addFlags(32);
                        if (g10.isRemoved() && !RecyclerView.this.f28584K0.e()) {
                            g10.setFlags(2, 14);
                        }
                        return g10;
                    }
                    if (!z10) {
                        this.f28743a.remove(size);
                        RecyclerView.this.removeDetachedView(g10.itemView, false);
                        D(g10.itemView);
                    }
                }
            }
            int size2 = this.f28745c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                G g11 = this.f28745c.get(size2);
                if (g11.getItemId() == j10 && !g11.isAttachedToTransitionOverlay()) {
                    if (i10 == g11.getItemViewType()) {
                        if (!z10) {
                            this.f28745c.remove(size2);
                        }
                        return g11;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        G m(int i10, boolean z10) {
            View viewE;
            int size = this.f28743a.size();
            for (int i11 = 0; i11 < size; i11++) {
                G g10 = this.f28743a.get(i11);
                if (!g10.wasReturnedFromScrap() && g10.getLayoutPosition() == i10 && !g10.isInvalid() && (RecyclerView.this.f28584K0.f28667h || !g10.isRemoved())) {
                    g10.addFlags(32);
                    return g10;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.f28575G.e(i10)) != null) {
                G gO0 = RecyclerView.o0(viewE);
                RecyclerView.this.f28575G.s(viewE);
                int iM = RecyclerView.this.f28575G.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f28575G.d(iM);
                    I(viewE);
                    gO0.addFlags(8224);
                    return gO0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + gO0 + RecyclerView.this.V());
            }
            int size2 = this.f28745c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                G g11 = this.f28745c.get(i12);
                if (!g11.isInvalid() && g11.getLayoutPosition() == i10 && !g11.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f28745c.remove(i12);
                    }
                    if (RecyclerView.f28555h1) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + g11);
                    }
                    return g11;
                }
            }
            return null;
        }

        View n(int i10) {
            return this.f28743a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).itemView;
        }

        void s() {
            int size = this.f28745c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) this.f28745c.get(i10).itemView.getLayoutParams();
                if (rVar != null) {
                    rVar.f28734c = true;
                }
            }
        }

        void t() {
            int size = this.f28745c.size();
            for (int i10 = 0; i10 < size; i10++) {
                G g10 = this.f28745c.get(i10);
                if (g10 != null) {
                    g10.addFlags(6);
                    g10.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f28589N;
            if (hVar == null || !hVar.m()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f28745c.size();
            for (int i12 = 0; i12 < size; i12++) {
                G g10 = this.f28745c.get(i12);
                if (g10 != null && g10.mPosition >= i10) {
                    if (RecyclerView.f28555h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + g10 + " now at position " + (g10.mPosition + i11));
                    }
                    g10.offsetPosition(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f28745c.size();
            for (int i16 = 0; i16 < size; i16++) {
                G g10 = this.f28745c.get(i16);
                if (g10 != null && (i15 = g10.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        g10.offsetPosition(i11 - i10, false);
                    } else {
                        g10.offsetPosition(i12, false);
                    }
                    if (RecyclerView.f28555h1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + g10);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f28745c.size() - 1; size >= 0; size--) {
                G g10 = this.f28745c.get(size);
                if (g10 != null) {
                    int i13 = g10.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.f28555h1) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + g10 + " now at position " + (g10.mPosition - i11));
                        }
                        g10.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        g10.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(E e10) {
        }
    }

    public void P0(View view) {
    }

    public void Q0(View view) {
    }

    public void V0(int i10) {
    }

    public static abstract class p {
        @Deprecated
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, C c10) {
            d(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, C c10) {
            f(canvas, recyclerView);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, C c10) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public static abstract class v {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void W0(int i10, int i11) {
    }
}
