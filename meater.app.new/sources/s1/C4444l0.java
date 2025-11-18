package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import e1.C3123e;
import j1.C3719d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import s1.C4469y0;

/* compiled from: WindowInsetsAnimationCompat.java */
/* renamed from: s1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4444l0 {

    /* renamed from: a, reason: collision with root package name */
    private e f49145a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* renamed from: s1.l0$c */
    private static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private static final Interpolator f49150e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f49151f = new M1.a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f49152g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* renamed from: s1.l0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f49153a;

            /* renamed from: b, reason: collision with root package name */
            private C4469y0 f49154b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: s1.l0$c$a$a, reason: collision with other inner class name */
            class C0690a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4444l0 f49155a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C4469y0 f49156b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C4469y0 f49157c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f49158d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f49159e;

                C0690a(C4444l0 c4444l0, C4469y0 c4469y0, C4469y0 c4469y02, int i10, View view) {
                    this.f49155a = c4444l0;
                    this.f49156b = c4469y0;
                    this.f49157c = c4469y02;
                    this.f49158d = i10;
                    this.f49159e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f49155a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f49159e, c.o(this.f49156b, this.f49157c, this.f49155a.b(), this.f49158d), Collections.singletonList(this.f49155a));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: s1.l0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4444l0 f49161a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f49162b;

                b(C4444l0 c4444l0, View view) {
                    this.f49161a = c4444l0;
                    this.f49162b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f49161a.e(1.0f);
                    c.i(this.f49162b, this.f49161a);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: s1.l0$c$a$c, reason: collision with other inner class name */
            class RunnableC0691c implements Runnable {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ View f49164B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C4444l0 f49165C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ a f49166D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f49167E;

                RunnableC0691c(View view, C4444l0 c4444l0, a aVar, ValueAnimator valueAnimator) {
                    this.f49164B = view;
                    this.f49165C = c4444l0;
                    this.f49166D = aVar;
                    this.f49167E = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f49164B, this.f49165C, this.f49166D);
                    this.f49167E.start();
                }
            }

            a(View view, b bVar) {
                this.f49153a = bVar;
                C4469y0 c4469y0F = X.F(view);
                this.f49154b = c4469y0F != null ? new C4469y0.a(c4469y0F).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f49154b = C4469y0.x(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                C4469y0 c4469y0X = C4469y0.x(windowInsets, view);
                if (this.f49154b == null) {
                    this.f49154b = X.F(view);
                }
                if (this.f49154b == null) {
                    this.f49154b = c4469y0X;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.f49148B, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int iE = c.e(c4469y0X, this.f49154b);
                if (iE == 0) {
                    return c.m(view, windowInsets);
                }
                C4469y0 c4469y0 = this.f49154b;
                C4444l0 c4444l0 = new C4444l0(iE, c.g(iE, c4469y0X, c4469y0), 160L);
                c4444l0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c4444l0.a());
                a aVarF = c.f(c4469y0X, c4469y0, iE);
                c.j(view, c4444l0, windowInsets, false);
                duration.addUpdateListener(new C0690a(c4444l0, c4469y0X, c4469y0, iE, view));
                duration.addListener(new b(c4444l0, view));
                L.a(view, new RunnableC0691c(view, c4444l0, aVarF, duration));
                this.f49154b = c4469y0X;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        static int e(C4469y0 c4469y0, C4469y0 c4469y02) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!c4469y0.f(i11).equals(c4469y02.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(C4469y0 c4469y0, C4469y0 c4469y02, int i10) {
            C3719d c3719dF = c4469y0.f(i10);
            C3719d c3719dF2 = c4469y02.f(i10);
            return new a(C3719d.b(Math.min(c3719dF.f43450a, c3719dF2.f43450a), Math.min(c3719dF.f43451b, c3719dF2.f43451b), Math.min(c3719dF.f43452c, c3719dF2.f43452c), Math.min(c3719dF.f43453d, c3719dF2.f43453d)), C3719d.b(Math.max(c3719dF.f43450a, c3719dF2.f43450a), Math.max(c3719dF.f43451b, c3719dF2.f43451b), Math.max(c3719dF.f43452c, c3719dF2.f43452c), Math.max(c3719dF.f43453d, c3719dF2.f43453d)));
        }

        static Interpolator g(int i10, C4469y0 c4469y0, C4469y0 c4469y02) {
            return (i10 & 8) != 0 ? c4469y0.f(C4469y0.l.c()).f43453d > c4469y02.f(C4469y0.l.c()).f43453d ? f49150e : f49151f : f49152g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C4444l0 c4444l0) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.c(c4444l0);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c4444l0);
                }
            }
        }

        static void j(View view, C4444l0 c4444l0, WindowInsets windowInsets, boolean z10) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f49148B = windowInsets;
                if (!z10) {
                    bVarN.d(c4444l0);
                    z10 = bVarN.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c4444l0, windowInsets, z10);
                }
            }
        }

        static void k(View view, C4469y0 c4469y0, List<C4444l0> list) {
            b bVarN = n(view);
            if (bVarN != null) {
                c4469y0 = bVarN.e(c4469y0, list);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), c4469y0, list);
                }
            }
        }

        static void l(View view, C4444l0 c4444l0, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f(c4444l0, aVar);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c4444l0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(C3123e.f39985L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(C3123e.f39992S);
            if (tag instanceof a) {
                return ((a) tag).f49153a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static C4469y0 o(C4469y0 c4469y0, C4469y0 c4469y02, float f10, int i10) {
            C4469y0.a aVar = new C4469y0.a(c4469y0);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, c4469y0.f(i11));
                } else {
                    C3719d c3719dF = c4469y0.f(i11);
                    C3719d c3719dF2 = c4469y02.f(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, C4469y0.n(c3719dF, (int) (((c3719dF.f43450a - c3719dF2.f43450a) * f11) + 0.5d), (int) (((c3719dF.f43451b - c3719dF2.f43451b) * f11) + 0.5d), (int) (((c3719dF.f43452c - c3719dF2.f43452c) * f11) + 0.5d), (int) (((c3719dF.f43453d - c3719dF2.f43453d) * f11) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(C3123e.f39985L);
            if (bVar == null) {
                view.setTag(C3123e.f39992S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(C3123e.f39992S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* renamed from: s1.l0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f49174a;

        /* renamed from: b, reason: collision with root package name */
        private float f49175b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f49176c;

        /* renamed from: d, reason: collision with root package name */
        private final long f49177d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f49174a = i10;
            this.f49176c = interpolator;
            this.f49177d = j10;
        }

        public long a() {
            return this.f49177d;
        }

        public float b() {
            Interpolator interpolator = this.f49176c;
            return interpolator != null ? interpolator.getInterpolation(this.f49175b) : this.f49175b;
        }

        public int c() {
            return this.f49174a;
        }

        public void d(float f10) {
            this.f49175b = f10;
        }
    }

    public C4444l0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f49145a = new d(i10, interpolator, j10);
        } else {
            this.f49145a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C4444l0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C4444l0(windowInsetsAnimation);
    }

    public long a() {
        return this.f49145a.a();
    }

    public float b() {
        return this.f49145a.b();
    }

    public int c() {
        return this.f49145a.c();
    }

    public void e(float f10) {
        this.f49145a.d(f10);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* renamed from: s1.l0$d */
    private static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        private final WindowInsetsAnimation f49169e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* renamed from: s1.l0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f49170a;

            /* renamed from: b, reason: collision with root package name */
            private List<C4444l0> f49171b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<C4444l0> f49172c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, C4444l0> f49173d;

            a(b bVar) {
                super(bVar.b());
                this.f49173d = new HashMap<>();
                this.f49170a = bVar;
            }

            private C4444l0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C4444l0 c4444l0 = this.f49173d.get(windowInsetsAnimation);
                if (c4444l0 != null) {
                    return c4444l0;
                }
                C4444l0 c4444l0F = C4444l0.f(windowInsetsAnimation);
                this.f49173d.put(windowInsetsAnimation, c4444l0F);
                return c4444l0F;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f49170a.c(a(windowInsetsAnimation));
                this.f49173d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f49170a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C4444l0> arrayList = this.f49172c;
                if (arrayList == null) {
                    ArrayList<C4444l0> arrayList2 = new ArrayList<>(list.size());
                    this.f49172c = arrayList2;
                    this.f49171b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = C4465w0.a(list.get(size));
                    C4444l0 c4444l0A = a(windowInsetsAnimationA);
                    c4444l0A.e(windowInsetsAnimationA.getFraction());
                    this.f49172c.add(c4444l0A);
                }
                return this.f49170a.e(C4469y0.w(windowInsets), this.f49171b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f49170a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f49169e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C4459t0.a();
            return C4457s0.a(aVar.a().e(), aVar.b().e());
        }

        public static C3719d f(WindowInsetsAnimation.Bounds bounds) {
            return C3719d.d(bounds.getUpperBound());
        }

        public static C3719d g(WindowInsetsAnimation.Bounds bounds) {
            return C3719d.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // s1.C4444l0.e
        public long a() {
            return this.f49169e.getDurationMillis();
        }

        @Override // s1.C4444l0.e
        public float b() {
            return this.f49169e.getInterpolatedFraction();
        }

        @Override // s1.C4444l0.e
        public int c() {
            return this.f49169e.getTypeMask();
        }

        @Override // s1.C4444l0.e
        public void d(float f10) {
            this.f49169e.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(C4455r0.a(i10, interpolator, j10));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* renamed from: s1.l0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3719d f49146a;

        /* renamed from: b, reason: collision with root package name */
        private final C3719d f49147b;

        public a(C3719d c3719d, C3719d c3719d2) {
            this.f49146a = c3719d;
            this.f49147b = c3719d2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C3719d a() {
            return this.f49146a;
        }

        public C3719d b() {
            return this.f49147b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f49146a + " upper=" + this.f49147b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f49146a = d.g(bounds);
            this.f49147b = d.f(bounds);
        }
    }

    private C4444l0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f49145a = new d(windowInsetsAnimation);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* renamed from: s1.l0$b */
    public static abstract class b {

        /* renamed from: B, reason: collision with root package name */
        WindowInsets f49148B;

        /* renamed from: C, reason: collision with root package name */
        private final int f49149C;

        public b(int i10) {
            this.f49149C = i10;
        }

        public final int b() {
            return this.f49149C;
        }

        public abstract C4469y0 e(C4469y0 c4469y0, List<C4444l0> list);

        public void c(C4444l0 c4444l0) {
        }

        public void d(C4444l0 c4444l0) {
        }

        public a f(C4444l0 c4444l0, a aVar) {
            return aVar;
        }
    }
}
