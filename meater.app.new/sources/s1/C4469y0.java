package s1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j1.C3719d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import r1.C4337d;

/* compiled from: WindowInsetsCompat.java */
/* renamed from: s1.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4469y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4469y0 f49201b;

    /* renamed from: a, reason: collision with root package name */
    private final k f49202a;

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$d */
    private static class d extends c {
        d() {
        }

        @Override // s1.C4469y0.e
        void c(int i10, C3719d c3719d) {
            this.f49210c.setInsets(m.a(i10), c3719d.e());
        }

        d(C4469y0 c4469y0) {
            super(c4469y0);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final C4469y0 f49211a;

        /* renamed from: b, reason: collision with root package name */
        C3719d[] f49212b;

        e() {
            this(new C4469y0((C4469y0) null));
        }

        protected final void a() {
            C3719d[] c3719dArr = this.f49212b;
            if (c3719dArr != null) {
                C3719d c3719dF = c3719dArr[l.d(1)];
                C3719d c3719dF2 = this.f49212b[l.d(2)];
                if (c3719dF2 == null) {
                    c3719dF2 = this.f49211a.f(2);
                }
                if (c3719dF == null) {
                    c3719dF = this.f49211a.f(1);
                }
                g(C3719d.a(c3719dF, c3719dF2));
                C3719d c3719d = this.f49212b[l.d(16)];
                if (c3719d != null) {
                    f(c3719d);
                }
                C3719d c3719d2 = this.f49212b[l.d(32)];
                if (c3719d2 != null) {
                    d(c3719d2);
                }
                C3719d c3719d3 = this.f49212b[l.d(64)];
                if (c3719d3 != null) {
                    h(c3719d3);
                }
            }
        }

        C4469y0 b() {
            throw null;
        }

        void c(int i10, C3719d c3719d) {
            if (this.f49212b == null) {
                this.f49212b = new C3719d[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f49212b[l.d(i11)] = c3719d;
                }
            }
        }

        void e(C3719d c3719d) {
            throw null;
        }

        void g(C3719d c3719d) {
            throw null;
        }

        e(C4469y0 c4469y0) {
            this.f49211a = c4469y0;
        }

        void d(C3719d c3719d) {
        }

        void f(C3719d c3719d) {
        }

        void h(C3719d c3719d) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$h */
    private static class h extends g {
        h(C4469y0 c4469y0, WindowInsets windowInsets) {
            super(c4469y0, windowInsets);
        }

        @Override // s1.C4469y0.k
        C4469y0 a() {
            return C4469y0.w(this.f49218c.consumeDisplayCutout());
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f49218c, hVar.f49218c) && Objects.equals(this.f49222g, hVar.f49222g);
        }

        @Override // s1.C4469y0.k
        r f() {
            return r.f(this.f49218c.getDisplayCutout());
        }

        @Override // s1.C4469y0.k
        public int hashCode() {
            return this.f49218c.hashCode();
        }

        h(C4469y0 c4469y0, h hVar) {
            super(c4469y0, hVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$j */
    private static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        static final C4469y0 f49227q = C4469y0.w(WindowInsets.CONSUMED);

        j(C4469y0 c4469y0, WindowInsets windowInsets) {
            super(c4469y0, windowInsets);
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        public C3719d g(int i10) {
            return C3719d.d(this.f49218c.getInsets(m.a(i10)));
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        public C3719d h(int i10) {
            return C3719d.d(this.f49218c.getInsetsIgnoringVisibility(m.a(i10)));
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        public boolean q(int i10) {
            return this.f49218c.isVisible(m.a(i10));
        }

        j(C4469y0 c4469y0, j jVar) {
            super(c4469y0, jVar);
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$l */
    public static final class l {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$m */
    private static final class m {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f49201b = j.f49227q;
        } else {
            f49201b = k.f49228b;
        }
    }

    private C4469y0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f49202a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f49202a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f49202a = new h(this, windowInsets);
        } else {
            this.f49202a = new g(this, windowInsets);
        }
    }

    static C3719d n(C3719d c3719d, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, c3719d.f43450a - i10);
        int iMax2 = Math.max(0, c3719d.f43451b - i11);
        int iMax3 = Math.max(0, c3719d.f43452c - i12);
        int iMax4 = Math.max(0, c3719d.f43453d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? c3719d : C3719d.b(iMax, iMax2, iMax3, iMax4);
    }

    public static C4469y0 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static C4469y0 x(WindowInsets windowInsets, View view) {
        C4469y0 c4469y0 = new C4469y0((WindowInsets) r1.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c4469y0.t(X.F(view));
            c4469y0.d(view.getRootView());
        }
        return c4469y0;
    }

    @Deprecated
    public C4469y0 a() {
        return this.f49202a.a();
    }

    @Deprecated
    public C4469y0 b() {
        return this.f49202a.b();
    }

    @Deprecated
    public C4469y0 c() {
        return this.f49202a.c();
    }

    void d(View view) {
        this.f49202a.d(view);
    }

    public r e() {
        return this.f49202a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4469y0) {
            return C4337d.a(this.f49202a, ((C4469y0) obj).f49202a);
        }
        return false;
    }

    public C3719d f(int i10) {
        return this.f49202a.g(i10);
    }

    public C3719d g(int i10) {
        return this.f49202a.h(i10);
    }

    @Deprecated
    public C3719d h() {
        return this.f49202a.j();
    }

    public int hashCode() {
        k kVar = this.f49202a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f49202a.l().f43453d;
    }

    @Deprecated
    public int j() {
        return this.f49202a.l().f43450a;
    }

    @Deprecated
    public int k() {
        return this.f49202a.l().f43452c;
    }

    @Deprecated
    public int l() {
        return this.f49202a.l().f43451b;
    }

    public C4469y0 m(int i10, int i11, int i12, int i13) {
        return this.f49202a.n(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f49202a.o();
    }

    public boolean p(int i10) {
        return this.f49202a.q(i10);
    }

    @Deprecated
    public C4469y0 q(int i10, int i11, int i12, int i13) {
        return new a(this).d(C3719d.b(i10, i11, i12, i13)).a();
    }

    void r(C3719d[] c3719dArr) {
        this.f49202a.r(c3719dArr);
    }

    void s(C3719d c3719d) {
        this.f49202a.s(c3719d);
    }

    void t(C4469y0 c4469y0) {
        this.f49202a.t(c4469y0);
    }

    void u(C3719d c3719d) {
        this.f49202a.u(c3719d);
    }

    public WindowInsets v() {
        k kVar = this.f49202a;
        if (kVar instanceof f) {
            return ((f) kVar).f49218c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$b */
    private static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private static Field f49204e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f49205f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f49206g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f49207h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f49208c;

        /* renamed from: d, reason: collision with root package name */
        private C3719d f49209d;

        b() {
            this.f49208c = i();
        }

        private static WindowInsets i() {
            if (!f49205f) {
                try {
                    f49204e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f49205f = true;
            }
            Field field = f49204e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f49207h) {
                try {
                    f49206g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f49207h = true;
            }
            Constructor<WindowInsets> constructor = f49206g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // s1.C4469y0.e
        C4469y0 b() {
            a();
            C4469y0 c4469y0W = C4469y0.w(this.f49208c);
            c4469y0W.r(this.f49212b);
            c4469y0W.u(this.f49209d);
            return c4469y0W;
        }

        @Override // s1.C4469y0.e
        void e(C3719d c3719d) {
            this.f49209d = c3719d;
        }

        @Override // s1.C4469y0.e
        void g(C3719d c3719d) {
            WindowInsets windowInsets = this.f49208c;
            if (windowInsets != null) {
                this.f49208c = windowInsets.replaceSystemWindowInsets(c3719d.f43450a, c3719d.f43451b, c3719d.f43452c, c3719d.f43453d);
            }
        }

        b(C4469y0 c4469y0) {
            super(c4469y0);
            this.f49208c = c4469y0.v();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$c */
    private static class c extends e {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f49210c;

        c() {
            this.f49210c = p1.e.a();
        }

        @Override // s1.C4469y0.e
        C4469y0 b() {
            a();
            C4469y0 c4469y0W = C4469y0.w(this.f49210c.build());
            c4469y0W.r(this.f49212b);
            return c4469y0W;
        }

        @Override // s1.C4469y0.e
        void d(C3719d c3719d) {
            this.f49210c.setMandatorySystemGestureInsets(c3719d.e());
        }

        @Override // s1.C4469y0.e
        void e(C3719d c3719d) {
            this.f49210c.setStableInsets(c3719d.e());
        }

        @Override // s1.C4469y0.e
        void f(C3719d c3719d) {
            this.f49210c.setSystemGestureInsets(c3719d.e());
        }

        @Override // s1.C4469y0.e
        void g(C3719d c3719d) {
            this.f49210c.setSystemWindowInsets(c3719d.e());
        }

        @Override // s1.C4469y0.e
        void h(C3719d c3719d) {
            this.f49210c.setTappableElementInsets(c3719d.e());
        }

        c(C4469y0 c4469y0) {
            WindowInsets.Builder builderA;
            super(c4469y0);
            WindowInsets windowInsetsV = c4469y0.v();
            if (windowInsetsV != null) {
                builderA = E0.a(windowInsetsV);
            } else {
                builderA = p1.e.a();
            }
            this.f49210c = builderA;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$g */
    private static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        private C3719d f49223m;

        g(C4469y0 c4469y0, WindowInsets windowInsets) {
            super(c4469y0, windowInsets);
            this.f49223m = null;
        }

        @Override // s1.C4469y0.k
        C4469y0 b() {
            return C4469y0.w(this.f49218c.consumeStableInsets());
        }

        @Override // s1.C4469y0.k
        C4469y0 c() {
            return C4469y0.w(this.f49218c.consumeSystemWindowInsets());
        }

        @Override // s1.C4469y0.k
        final C3719d j() {
            if (this.f49223m == null) {
                this.f49223m = C3719d.b(this.f49218c.getStableInsetLeft(), this.f49218c.getStableInsetTop(), this.f49218c.getStableInsetRight(), this.f49218c.getStableInsetBottom());
            }
            return this.f49223m;
        }

        @Override // s1.C4469y0.k
        boolean o() {
            return this.f49218c.isConsumed();
        }

        @Override // s1.C4469y0.k
        public void u(C3719d c3719d) {
            this.f49223m = c3719d;
        }

        g(C4469y0 c4469y0, g gVar) {
            super(c4469y0, gVar);
            this.f49223m = null;
            this.f49223m = gVar.f49223m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$f */
    private static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f49213h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f49214i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f49215j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f49216k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f49217l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f49218c;

        /* renamed from: d, reason: collision with root package name */
        private C3719d[] f49219d;

        /* renamed from: e, reason: collision with root package name */
        private C3719d f49220e;

        /* renamed from: f, reason: collision with root package name */
        private C4469y0 f49221f;

        /* renamed from: g, reason: collision with root package name */
        C3719d f49222g;

        f(C4469y0 c4469y0, WindowInsets windowInsets) {
            super(c4469y0);
            this.f49220e = null;
            this.f49218c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() throws ClassNotFoundException, SecurityException {
            try {
                f49214i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f49215j = cls;
                f49216k = cls.getDeclaredField("mVisibleInsets");
                f49217l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f49216k.setAccessible(true);
                f49217l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f49213h = true;
        }

        @SuppressLint({"WrongConstant"})
        private C3719d v(int i10, boolean z10) {
            C3719d c3719dA = C3719d.f43449e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c3719dA = C3719d.a(c3719dA, w(i11, z10));
                }
            }
            return c3719dA;
        }

        private C3719d x() {
            C4469y0 c4469y0 = this.f49221f;
            return c4469y0 != null ? c4469y0.h() : C3719d.f43449e;
        }

        private C3719d y(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f49213h) {
                A();
            }
            Method method = f49214i;
            if (method != null && f49215j != null && f49216k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f49216k.get(f49217l.get(objInvoke));
                    if (rect != null) {
                        return C3719d.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // s1.C4469y0.k
        void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C3719d c3719dY = y(view);
            if (c3719dY == null) {
                c3719dY = C3719d.f43449e;
            }
            s(c3719dY);
        }

        @Override // s1.C4469y0.k
        void e(C4469y0 c4469y0) {
            c4469y0.t(this.f49221f);
            c4469y0.s(this.f49222g);
        }

        @Override // s1.C4469y0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f49222g, ((f) obj).f49222g);
            }
            return false;
        }

        @Override // s1.C4469y0.k
        public C3719d g(int i10) {
            return v(i10, false);
        }

        @Override // s1.C4469y0.k
        public C3719d h(int i10) {
            return v(i10, true);
        }

        @Override // s1.C4469y0.k
        final C3719d l() {
            if (this.f49220e == null) {
                this.f49220e = C3719d.b(this.f49218c.getSystemWindowInsetLeft(), this.f49218c.getSystemWindowInsetTop(), this.f49218c.getSystemWindowInsetRight(), this.f49218c.getSystemWindowInsetBottom());
            }
            return this.f49220e;
        }

        @Override // s1.C4469y0.k
        C4469y0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(C4469y0.w(this.f49218c));
            aVar.d(C4469y0.n(l(), i10, i11, i12, i13));
            aVar.c(C4469y0.n(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // s1.C4469y0.k
        boolean p() {
            return this.f49218c.isRound();
        }

        @Override // s1.C4469y0.k
        @SuppressLint({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // s1.C4469y0.k
        public void r(C3719d[] c3719dArr) {
            this.f49219d = c3719dArr;
        }

        @Override // s1.C4469y0.k
        void s(C3719d c3719d) {
            this.f49222g = c3719d;
        }

        @Override // s1.C4469y0.k
        void t(C4469y0 c4469y0) {
            this.f49221f = c4469y0;
        }

        protected C3719d w(int i10, boolean z10) {
            C3719d c3719dH;
            int i11;
            if (i10 == 1) {
                return z10 ? C3719d.b(0, Math.max(x().f43451b, l().f43451b), 0, 0) : C3719d.b(0, l().f43451b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C3719d c3719dX = x();
                    C3719d c3719dJ = j();
                    return C3719d.b(Math.max(c3719dX.f43450a, c3719dJ.f43450a), 0, Math.max(c3719dX.f43452c, c3719dJ.f43452c), Math.max(c3719dX.f43453d, c3719dJ.f43453d));
                }
                C3719d c3719dL = l();
                C4469y0 c4469y0 = this.f49221f;
                c3719dH = c4469y0 != null ? c4469y0.h() : null;
                int iMin = c3719dL.f43453d;
                if (c3719dH != null) {
                    iMin = Math.min(iMin, c3719dH.f43453d);
                }
                return C3719d.b(c3719dL.f43450a, 0, c3719dL.f43452c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return C3719d.f43449e;
                }
                C4469y0 c4469y02 = this.f49221f;
                r rVarE = c4469y02 != null ? c4469y02.e() : f();
                return rVarE != null ? C3719d.b(rVarE.b(), rVarE.d(), rVarE.c(), rVarE.a()) : C3719d.f43449e;
            }
            C3719d[] c3719dArr = this.f49219d;
            c3719dH = c3719dArr != null ? c3719dArr[l.d(8)] : null;
            if (c3719dH != null) {
                return c3719dH;
            }
            C3719d c3719dL2 = l();
            C3719d c3719dX2 = x();
            int i12 = c3719dL2.f43453d;
            if (i12 > c3719dX2.f43453d) {
                return C3719d.b(0, 0, 0, i12);
            }
            C3719d c3719d = this.f49222g;
            return (c3719d == null || c3719d.equals(C3719d.f43449e) || (i11 = this.f49222g.f43453d) <= c3719dX2.f43453d) ? C3719d.f43449e : C3719d.b(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(C3719d.f43449e);
        }

        f(C4469y0 c4469y0, f fVar) {
            this(c4469y0, new WindowInsets(fVar.f49218c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$i */
    private static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        private C3719d f49224n;

        /* renamed from: o, reason: collision with root package name */
        private C3719d f49225o;

        /* renamed from: p, reason: collision with root package name */
        private C3719d f49226p;

        i(C4469y0 c4469y0, WindowInsets windowInsets) {
            super(c4469y0, windowInsets);
            this.f49224n = null;
            this.f49225o = null;
            this.f49226p = null;
        }

        @Override // s1.C4469y0.k
        C3719d i() {
            if (this.f49225o == null) {
                this.f49225o = C3719d.d(this.f49218c.getMandatorySystemGestureInsets());
            }
            return this.f49225o;
        }

        @Override // s1.C4469y0.k
        C3719d k() {
            if (this.f49224n == null) {
                this.f49224n = C3719d.d(this.f49218c.getSystemGestureInsets());
            }
            return this.f49224n;
        }

        @Override // s1.C4469y0.k
        C3719d m() {
            if (this.f49226p == null) {
                this.f49226p = C3719d.d(this.f49218c.getTappableElementInsets());
            }
            return this.f49226p;
        }

        @Override // s1.C4469y0.f, s1.C4469y0.k
        C4469y0 n(int i10, int i11, int i12, int i13) {
            return C4469y0.w(this.f49218c.inset(i10, i11, i12, i13));
        }

        i(C4469y0 c4469y0, i iVar) {
            super(c4469y0, iVar);
            this.f49224n = null;
            this.f49225o = null;
            this.f49226p = null;
        }

        @Override // s1.C4469y0.g, s1.C4469y0.k
        public void u(C3719d c3719d) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f49203a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f49203a = new d();
            } else if (i10 >= 29) {
                this.f49203a = new c();
            } else {
                this.f49203a = new b();
            }
        }

        public C4469y0 a() {
            return this.f49203a.b();
        }

        public a b(int i10, C3719d c3719d) {
            this.f49203a.c(i10, c3719d);
            return this;
        }

        @Deprecated
        public a c(C3719d c3719d) {
            this.f49203a.e(c3719d);
            return this;
        }

        @Deprecated
        public a d(C3719d c3719d) {
            this.f49203a.g(c3719d);
            return this;
        }

        public a(C4469y0 c4469y0) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f49203a = new d(c4469y0);
            } else if (i10 >= 29) {
                this.f49203a = new c(c4469y0);
            } else {
                this.f49203a = new b(c4469y0);
            }
        }
    }

    public C4469y0(C4469y0 c4469y0) {
        if (c4469y0 != null) {
            k kVar = c4469y0.f49202a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f49202a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f49202a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f49202a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f49202a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f49202a = new f(this, (f) kVar);
            } else {
                this.f49202a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f49202a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: s1.y0$k */
    private static class k {

        /* renamed from: b, reason: collision with root package name */
        static final C4469y0 f49228b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final C4469y0 f49229a;

        k(C4469y0 c4469y0) {
            this.f49229a = c4469y0;
        }

        C4469y0 a() {
            return this.f49229a;
        }

        C4469y0 b() {
            return this.f49229a;
        }

        C4469y0 c() {
            return this.f49229a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && C4337d.a(l(), kVar.l()) && C4337d.a(j(), kVar.j()) && C4337d.a(f(), kVar.f());
        }

        r f() {
            return null;
        }

        C3719d g(int i10) {
            return C3719d.f43449e;
        }

        C3719d h(int i10) {
            if ((i10 & 8) == 0) {
                return C3719d.f43449e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C4337d.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        C3719d i() {
            return l();
        }

        C3719d j() {
            return C3719d.f43449e;
        }

        C3719d k() {
            return l();
        }

        C3719d l() {
            return C3719d.f43449e;
        }

        C3719d m() {
            return l();
        }

        C4469y0 n(int i10, int i11, int i12, int i13) {
            return f49228b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        void d(View view) {
        }

        void e(C4469y0 c4469y0) {
        }

        public void r(C3719d[] c3719dArr) {
        }

        void s(C3719d c3719d) {
        }

        void t(C4469y0 c4469y0) {
        }

        public void u(C3719d c3719d) {
        }
    }
}
