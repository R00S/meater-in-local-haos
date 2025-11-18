package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024c.p052i.p053e.C0924b;
import p024c.p052i.p059j.C0953c;
import p024c.p052i.p059j.C0954d;
import p024c.p052i.p059j.C0959i;

/* compiled from: WindowInsetsCompat.java */
/* renamed from: androidx.core.view.c0 */
/* loaded from: classes.dex */
public class C0285c0 {

    /* renamed from: a */
    public static final C0285c0 f2294a;

    /* renamed from: b */
    private final l f2295b;

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$a */
    static class a {

        /* renamed from: a */
        private static Field f2296a;

        /* renamed from: b */
        private static Field f2297b;

        /* renamed from: c */
        private static Field f2298c;

        /* renamed from: d */
        private static boolean f2299d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2296a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2297b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2298c = declaredField3;
                declaredField3.setAccessible(true);
                f2299d = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        /* renamed from: a */
        public static C0285c0 m1893a(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f2299d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2296a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2297b.get(obj);
                        Rect rect2 = (Rect) f2298c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0285c0 c0285c0M1894a = new b().m1895b(C0924b.m5890c(rect)).m1896c(C0924b.m5890c(rect2)).m1894a();
                            c0285c0M1894a.m1890r(c0285c0M1894a);
                            c0285c0M1894a.m1877d(view.getRootView());
                            return c0285c0M1894a;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$e */
    private static class e extends d {
        e() {
        }

        e(C0285c0 c0285c0) {
            super(c0285c0);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$f */
    private static class f {

        /* renamed from: a */
        private final C0285c0 f2308a;

        /* renamed from: b */
        C0924b[] f2309b;

        f() {
            this(new C0285c0((C0285c0) null));
        }

        /* renamed from: a */
        protected final void m1904a() {
            C0924b[] c0924bArr = this.f2309b;
            if (c0924bArr != null) {
                C0924b c0924bM1879f = c0924bArr[m.m1929a(1)];
                C0924b c0924bM1879f2 = this.f2309b[m.m1929a(2)];
                if (c0924bM1879f2 == null) {
                    c0924bM1879f2 = this.f2308a.m1879f(2);
                }
                if (c0924bM1879f == null) {
                    c0924bM1879f = this.f2308a.m1879f(1);
                }
                mo1900f(C0924b.m5888a(c0924bM1879f, c0924bM1879f2));
                C0924b c0924b = this.f2309b[m.m1929a(16)];
                if (c0924b != null) {
                    mo1902e(c0924b);
                }
                C0924b c0924b2 = this.f2309b[m.m1929a(32)];
                if (c0924b2 != null) {
                    mo1901c(c0924b2);
                }
                C0924b c0924b3 = this.f2309b[m.m1929a(64)];
                if (c0924b3 != null) {
                    mo1903g(c0924b3);
                }
            }
        }

        /* renamed from: b */
        C0285c0 mo1898b() {
            m1904a();
            return this.f2308a;
        }

        /* renamed from: c */
        void mo1901c(C0924b c0924b) {
        }

        /* renamed from: d */
        void mo1899d(C0924b c0924b) {
        }

        /* renamed from: e */
        void mo1902e(C0924b c0924b) {
        }

        /* renamed from: f */
        void mo1900f(C0924b c0924b) {
        }

        /* renamed from: g */
        void mo1903g(C0924b c0924b) {
        }

        f(C0285c0 c0285c0) {
            this.f2308a = c0285c0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$i */
    private static class i extends h {
        i(C0285c0 c0285c0, WindowInsets windowInsets) {
            super(c0285c0, windowInsets);
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: a */
        C0285c0 mo1924a() {
            return C0285c0.m1872u(this.f2316i.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C0285c0.g, androidx.core.view.C0285c0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C0953c.m6055a(this.f2316i, iVar.f2316i) && C0953c.m6055a(this.f2320m, iVar.f2320m);
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: f */
        C0284c mo1925f() {
            return C0284c.m1866e(this.f2316i.getDisplayCutout());
        }

        @Override // androidx.core.view.C0285c0.l
        public int hashCode() {
            return this.f2316i.hashCode();
        }

        i(C0285c0 c0285c0, i iVar) {
            super(c0285c0, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$k */
    private static class k extends j {

        /* renamed from: r */
        static final C0285c0 f2325r = C0285c0.m1872u(WindowInsets.CONSUMED);

        k(C0285c0 c0285c0, WindowInsets windowInsets) {
            super(c0285c0, windowInsets);
        }

        @Override // androidx.core.view.C0285c0.g, androidx.core.view.C0285c0.l
        /* renamed from: d */
        final void mo1909d(View view) {
        }

        @Override // androidx.core.view.C0285c0.g, androidx.core.view.C0285c0.l
        /* renamed from: g */
        public C0924b mo1911g(int i2) {
            return C0924b.m5891d(this.f2316i.getInsets(n.m1930a(i2)));
        }

        k(C0285c0 c0285c0, k kVar) {
            super(c0285c0, kVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$l */
    private static class l {

        /* renamed from: a */
        static final C0285c0 f2326a = new b().m1894a().m1874a().m1875b().m1876c();

        /* renamed from: b */
        final C0285c0 f2327b;

        l(C0285c0 c0285c0) {
            this.f2327b = c0285c0;
        }

        /* renamed from: a */
        C0285c0 mo1924a() {
            return this.f2327b;
        }

        /* renamed from: b */
        C0285c0 mo1919b() {
            return this.f2327b;
        }

        /* renamed from: c */
        C0285c0 mo1920c() {
            return this.f2327b;
        }

        /* renamed from: d */
        void mo1909d(View view) {
        }

        /* renamed from: e */
        void mo1910e(C0285c0 c0285c0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo1914o() == lVar.mo1914o() && mo1922n() == lVar.mo1922n() && C0954d.m6056a(mo1912k(), lVar.mo1912k()) && C0954d.m6056a(mo1921i(), lVar.mo1921i()) && C0954d.m6056a(mo1925f(), lVar.mo1925f());
        }

        /* renamed from: f */
        C0284c mo1925f() {
            return null;
        }

        /* renamed from: g */
        C0924b mo1911g(int i2) {
            return C0924b.f6282a;
        }

        /* renamed from: h */
        C0924b mo1926h() {
            return mo1912k();
        }

        public int hashCode() {
            return C0954d.m6057b(Boolean.valueOf(mo1914o()), Boolean.valueOf(mo1922n()), mo1912k(), mo1921i(), mo1925f());
        }

        /* renamed from: i */
        C0924b mo1921i() {
            return C0924b.f6282a;
        }

        /* renamed from: j */
        C0924b mo1927j() {
            return mo1912k();
        }

        /* renamed from: k */
        C0924b mo1912k() {
            return C0924b.f6282a;
        }

        /* renamed from: l */
        C0924b mo1928l() {
            return mo1912k();
        }

        /* renamed from: m */
        C0285c0 mo1913m(int i2, int i3, int i4, int i5) {
            return f2326a;
        }

        /* renamed from: n */
        boolean mo1922n() {
            return false;
        }

        /* renamed from: o */
        boolean mo1914o() {
            return false;
        }

        /* renamed from: p */
        public void mo1915p(C0924b[] c0924bArr) {
        }

        /* renamed from: q */
        void mo1916q(C0924b c0924b) {
        }

        /* renamed from: r */
        void mo1917r(C0285c0 c0285c0) {
        }

        /* renamed from: s */
        public void mo1923s(C0924b c0924b) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$m */
    public static final class m {
        /* renamed from: a */
        static int m1929a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$n */
    private static final class n {
        /* renamed from: a */
        static int m1930a(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2294a = k.f2325r;
        } else {
            f2294a = l.f2326a;
        }
    }

    private C0285c0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f2295b = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f2295b = new j(this, windowInsets);
            return;
        }
        if (i2 >= 28) {
            this.f2295b = new i(this, windowInsets);
            return;
        }
        if (i2 >= 21) {
            this.f2295b = new h(this, windowInsets);
        } else if (i2 >= 20) {
            this.f2295b = new g(this, windowInsets);
        } else {
            this.f2295b = new l(this);
        }
    }

    /* renamed from: m */
    static C0924b m1871m(C0924b c0924b, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0924b.f6283b - i2);
        int iMax2 = Math.max(0, c0924b.f6284c - i3);
        int iMax3 = Math.max(0, c0924b.f6285d - i4);
        int iMax4 = Math.max(0, c0924b.f6286e - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0924b : C0924b.m5889b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: u */
    public static C0285c0 m1872u(WindowInsets windowInsets) {
        return m1873v(windowInsets, null);
    }

    /* renamed from: v */
    public static C0285c0 m1873v(WindowInsets windowInsets, View view) {
        C0285c0 c0285c0 = new C0285c0((WindowInsets) C0959i.m6065c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0285c0.m1890r(C0311u.m2092E(view));
            c0285c0.m1877d(view.getRootView());
        }
        return c0285c0;
    }

    @Deprecated
    /* renamed from: a */
    public C0285c0 m1874a() {
        return this.f2295b.mo1924a();
    }

    @Deprecated
    /* renamed from: b */
    public C0285c0 m1875b() {
        return this.f2295b.mo1919b();
    }

    @Deprecated
    /* renamed from: c */
    public C0285c0 m1876c() {
        return this.f2295b.mo1920c();
    }

    /* renamed from: d */
    void m1877d(View view) {
        this.f2295b.mo1909d(view);
    }

    /* renamed from: e */
    public C0284c m1878e() {
        return this.f2295b.mo1925f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0285c0) {
            return C0954d.m6056a(this.f2295b, ((C0285c0) obj).f2295b);
        }
        return false;
    }

    /* renamed from: f */
    public C0924b m1879f(int i2) {
        return this.f2295b.mo1911g(i2);
    }

    @Deprecated
    /* renamed from: g */
    public C0924b m1880g() {
        return this.f2295b.mo1921i();
    }

    @Deprecated
    /* renamed from: h */
    public int m1881h() {
        return this.f2295b.mo1912k().f6286e;
    }

    public int hashCode() {
        l lVar = this.f2295b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m1882i() {
        return this.f2295b.mo1912k().f6283b;
    }

    @Deprecated
    /* renamed from: j */
    public int m1883j() {
        return this.f2295b.mo1912k().f6285d;
    }

    @Deprecated
    /* renamed from: k */
    public int m1884k() {
        return this.f2295b.mo1912k().f6284c;
    }

    /* renamed from: l */
    public C0285c0 m1885l(int i2, int i3, int i4, int i5) {
        return this.f2295b.mo1913m(i2, i3, i4, i5);
    }

    /* renamed from: n */
    public boolean m1886n() {
        return this.f2295b.mo1922n();
    }

    @Deprecated
    /* renamed from: o */
    public C0285c0 m1887o(int i2, int i3, int i4, int i5) {
        return new b(this).m1896c(C0924b.m5889b(i2, i3, i4, i5)).m1894a();
    }

    /* renamed from: p */
    void m1888p(C0924b[] c0924bArr) {
        this.f2295b.mo1915p(c0924bArr);
    }

    /* renamed from: q */
    void m1889q(C0924b c0924b) {
        this.f2295b.mo1916q(c0924b);
    }

    /* renamed from: r */
    void m1890r(C0285c0 c0285c0) {
        this.f2295b.mo1917r(c0285c0);
    }

    /* renamed from: s */
    void m1891s(C0924b c0924b) {
        this.f2295b.mo1923s(c0924b);
    }

    /* renamed from: t */
    public WindowInsets m1892t() {
        l lVar = this.f2295b;
        if (lVar instanceof g) {
            return ((g) lVar).f2316i;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$c */
    private static class c extends f {

        /* renamed from: c */
        private static Field f2301c = null;

        /* renamed from: d */
        private static boolean f2302d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f2303e = null;

        /* renamed from: f */
        private static boolean f2304f = false;

        /* renamed from: g */
        private WindowInsets f2305g;

        /* renamed from: h */
        private C0924b f2306h;

        c() {
            this.f2305g = m1897h();
        }

        /* renamed from: h */
        private static WindowInsets m1897h() {
            if (!f2302d) {
                try {
                    f2301c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2302d = true;
            }
            Field field = f2301c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f2304f) {
                try {
                    f2303e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2304f = true;
            }
            Constructor<WindowInsets> constructor = f2303e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: b */
        C0285c0 mo1898b() {
            m1904a();
            C0285c0 c0285c0M1872u = C0285c0.m1872u(this.f2305g);
            c0285c0M1872u.m1888p(this.f2309b);
            c0285c0M1872u.m1891s(this.f2306h);
            return c0285c0M1872u;
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: d */
        void mo1899d(C0924b c0924b) {
            this.f2306h = c0924b;
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: f */
        void mo1900f(C0924b c0924b) {
            WindowInsets windowInsets = this.f2305g;
            if (windowInsets != null) {
                this.f2305g = windowInsets.replaceSystemWindowInsets(c0924b.f6283b, c0924b.f6284c, c0924b.f6285d, c0924b.f6286e);
            }
        }

        c(C0285c0 c0285c0) {
            super(c0285c0);
            this.f2305g = c0285c0.m1892t();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$d */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f2307c;

        d() {
            this.f2307c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: b */
        C0285c0 mo1898b() {
            m1904a();
            C0285c0 c0285c0M1872u = C0285c0.m1872u(this.f2307c.build());
            c0285c0M1872u.m1888p(this.f2309b);
            return c0285c0M1872u;
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: c */
        void mo1901c(C0924b c0924b) {
            this.f2307c.setMandatorySystemGestureInsets(c0924b.m5892e());
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: d */
        void mo1899d(C0924b c0924b) {
            this.f2307c.setStableInsets(c0924b.m5892e());
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: e */
        void mo1902e(C0924b c0924b) {
            this.f2307c.setSystemGestureInsets(c0924b.m5892e());
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: f */
        void mo1900f(C0924b c0924b) {
            this.f2307c.setSystemWindowInsets(c0924b.m5892e());
        }

        @Override // androidx.core.view.C0285c0.f
        /* renamed from: g */
        void mo1903g(C0924b c0924b) {
            this.f2307c.setTappableElementInsets(c0924b.m5892e());
        }

        d(C0285c0 c0285c0) {
            WindowInsets.Builder builder;
            super(c0285c0);
            WindowInsets windowInsetsM1892t = c0285c0.m1892t();
            if (windowInsetsM1892t != null) {
                builder = new WindowInsets.Builder(windowInsetsM1892t);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2307c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$h */
    private static class h extends g {

        /* renamed from: n */
        private C0924b f2321n;

        h(C0285c0 c0285c0, WindowInsets windowInsets) {
            super(c0285c0, windowInsets);
            this.f2321n = null;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: b */
        C0285c0 mo1919b() {
            return C0285c0.m1872u(this.f2316i.consumeStableInsets());
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: c */
        C0285c0 mo1920c() {
            return C0285c0.m1872u(this.f2316i.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: i */
        final C0924b mo1921i() {
            if (this.f2321n == null) {
                this.f2321n = C0924b.m5889b(this.f2316i.getStableInsetLeft(), this.f2316i.getStableInsetTop(), this.f2316i.getStableInsetRight(), this.f2316i.getStableInsetBottom());
            }
            return this.f2321n;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: n */
        boolean mo1922n() {
            return this.f2316i.isConsumed();
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: s */
        public void mo1923s(C0924b c0924b) {
            this.f2321n = c0924b;
        }

        h(C0285c0 c0285c0, h hVar) {
            super(c0285c0, hVar);
            this.f2321n = null;
            this.f2321n = hVar.f2321n;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$g */
    private static class g extends l {

        /* renamed from: c */
        private static boolean f2310c = false;

        /* renamed from: d */
        private static Method f2311d;

        /* renamed from: e */
        private static Class<?> f2312e;

        /* renamed from: f */
        private static Class<?> f2313f;

        /* renamed from: g */
        private static Field f2314g;

        /* renamed from: h */
        private static Field f2315h;

        /* renamed from: i */
        final WindowInsets f2316i;

        /* renamed from: j */
        private C0924b[] f2317j;

        /* renamed from: k */
        private C0924b f2318k;

        /* renamed from: l */
        private C0285c0 f2319l;

        /* renamed from: m */
        C0924b f2320m;

        g(C0285c0 c0285c0, WindowInsets windowInsets) {
            super(c0285c0);
            this.f2318k = null;
            this.f2316i = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C0924b m1905t(int i2, boolean z) {
            C0924b c0924bM5888a = C0924b.f6282a;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    c0924bM5888a = C0924b.m5888a(c0924bM5888a, m1918u(i3, z));
                }
            }
            return c0924bM5888a;
        }

        /* renamed from: v */
        private C0924b m1906v() {
            C0285c0 c0285c0 = this.f2319l;
            return c0285c0 != null ? c0285c0.m1880g() : C0924b.f6282a;
        }

        /* renamed from: w */
        private C0924b m1907w(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2310c) {
                m1908x();
            }
            Method method = f2311d;
            if (method != null && f2313f != null && f2314g != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2314g.get(f2315h.get(objInvoke));
                    if (rect != null) {
                        return C0924b.m5890c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m1908x() throws ClassNotFoundException {
            try {
                f2311d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f2312e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2313f = cls;
                f2314g = cls.getDeclaredField("mVisibleInsets");
                f2315h = f2312e.getDeclaredField("mAttachInfo");
                f2314g.setAccessible(true);
                f2315h.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f2310c = true;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: d */
        void mo1909d(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            C0924b c0924bM1907w = m1907w(view);
            if (c0924bM1907w == null) {
                c0924bM1907w = C0924b.f6282a;
            }
            mo1916q(c0924bM1907w);
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: e */
        void mo1910e(C0285c0 c0285c0) {
            c0285c0.m1890r(this.f2319l);
            c0285c0.m1889q(this.f2320m);
        }

        @Override // androidx.core.view.C0285c0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return C0953c.m6055a(this.f2320m, ((g) obj).f2320m);
            }
            return false;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: g */
        public C0924b mo1911g(int i2) {
            return m1905t(i2, false);
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: k */
        final C0924b mo1912k() {
            if (this.f2318k == null) {
                this.f2318k = C0924b.m5889b(this.f2316i.getSystemWindowInsetLeft(), this.f2316i.getSystemWindowInsetTop(), this.f2316i.getSystemWindowInsetRight(), this.f2316i.getSystemWindowInsetBottom());
            }
            return this.f2318k;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: m */
        C0285c0 mo1913m(int i2, int i3, int i4, int i5) {
            b bVar = new b(C0285c0.m1872u(this.f2316i));
            bVar.m1896c(C0285c0.m1871m(mo1912k(), i2, i3, i4, i5));
            bVar.m1895b(C0285c0.m1871m(mo1921i(), i2, i3, i4, i5));
            return bVar.m1894a();
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: o */
        boolean mo1914o() {
            return this.f2316i.isRound();
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: p */
        public void mo1915p(C0924b[] c0924bArr) {
            this.f2317j = c0924bArr;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: q */
        void mo1916q(C0924b c0924b) {
            this.f2320m = c0924b;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: r */
        void mo1917r(C0285c0 c0285c0) {
            this.f2319l = c0285c0;
        }

        /* renamed from: u */
        protected C0924b m1918u(int i2, boolean z) {
            C0924b c0924bM1880g;
            int i3;
            if (i2 == 1) {
                return z ? C0924b.m5889b(0, Math.max(m1906v().f6284c, mo1912k().f6284c), 0, 0) : C0924b.m5889b(0, mo1912k().f6284c, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    C0924b c0924bM1906v = m1906v();
                    C0924b c0924bMo1921i = mo1921i();
                    return C0924b.m5889b(Math.max(c0924bM1906v.f6283b, c0924bMo1921i.f6283b), 0, Math.max(c0924bM1906v.f6285d, c0924bMo1921i.f6285d), Math.max(c0924bM1906v.f6286e, c0924bMo1921i.f6286e));
                }
                C0924b c0924bMo1912k = mo1912k();
                C0285c0 c0285c0 = this.f2319l;
                c0924bM1880g = c0285c0 != null ? c0285c0.m1880g() : null;
                int iMin = c0924bMo1912k.f6286e;
                if (c0924bM1880g != null) {
                    iMin = Math.min(iMin, c0924bM1880g.f6286e);
                }
                return C0924b.m5889b(c0924bMo1912k.f6283b, 0, c0924bMo1912k.f6285d, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return mo1927j();
                }
                if (i2 == 32) {
                    return mo1926h();
                }
                if (i2 == 64) {
                    return mo1928l();
                }
                if (i2 != 128) {
                    return C0924b.f6282a;
                }
                C0285c0 c0285c02 = this.f2319l;
                C0284c c0284cM1878e = c0285c02 != null ? c0285c02.m1878e() : mo1925f();
                return c0284cM1878e != null ? C0924b.m5889b(c0284cM1878e.m1868b(), c0284cM1878e.m1870d(), c0284cM1878e.m1869c(), c0284cM1878e.m1867a()) : C0924b.f6282a;
            }
            C0924b[] c0924bArr = this.f2317j;
            c0924bM1880g = c0924bArr != null ? c0924bArr[m.m1929a(8)] : null;
            if (c0924bM1880g != null) {
                return c0924bM1880g;
            }
            C0924b c0924bMo1912k2 = mo1912k();
            C0924b c0924bM1906v2 = m1906v();
            int i4 = c0924bMo1912k2.f6286e;
            if (i4 > c0924bM1906v2.f6286e) {
                return C0924b.m5889b(0, 0, 0, i4);
            }
            C0924b c0924b = this.f2320m;
            return (c0924b == null || c0924b.equals(C0924b.f6282a) || (i3 = this.f2320m.f6286e) <= c0924bM1906v2.f6286e) ? C0924b.f6282a : C0924b.m5889b(0, 0, 0, i3);
        }

        g(C0285c0 c0285c0, g gVar) {
            this(c0285c0, new WindowInsets(gVar.f2316i));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$j */
    private static class j extends i {

        /* renamed from: o */
        private C0924b f2322o;

        /* renamed from: p */
        private C0924b f2323p;

        /* renamed from: q */
        private C0924b f2324q;

        j(C0285c0 c0285c0, WindowInsets windowInsets) {
            super(c0285c0, windowInsets);
            this.f2322o = null;
            this.f2323p = null;
            this.f2324q = null;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: h */
        C0924b mo1926h() {
            if (this.f2323p == null) {
                this.f2323p = C0924b.m5891d(this.f2316i.getMandatorySystemGestureInsets());
            }
            return this.f2323p;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: j */
        C0924b mo1927j() {
            if (this.f2322o == null) {
                this.f2322o = C0924b.m5891d(this.f2316i.getSystemGestureInsets());
            }
            return this.f2322o;
        }

        @Override // androidx.core.view.C0285c0.l
        /* renamed from: l */
        C0924b mo1928l() {
            if (this.f2324q == null) {
                this.f2324q = C0924b.m5891d(this.f2316i.getTappableElementInsets());
            }
            return this.f2324q;
        }

        @Override // androidx.core.view.C0285c0.g, androidx.core.view.C0285c0.l
        /* renamed from: m */
        C0285c0 mo1913m(int i2, int i3, int i4, int i5) {
            return C0285c0.m1872u(this.f2316i.inset(i2, i3, i4, i5));
        }

        @Override // androidx.core.view.C0285c0.h, androidx.core.view.C0285c0.l
        /* renamed from: s */
        public void mo1923s(C0924b c0924b) {
        }

        j(C0285c0 c0285c0, j jVar) {
            super(c0285c0, jVar);
            this.f2322o = null;
            this.f2323p = null;
            this.f2324q = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.c0$b */
    public static final class b {

        /* renamed from: a */
        private final f f2300a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f2300a = new e();
                return;
            }
            if (i2 >= 29) {
                this.f2300a = new d();
            } else if (i2 >= 20) {
                this.f2300a = new c();
            } else {
                this.f2300a = new f();
            }
        }

        /* renamed from: a */
        public C0285c0 m1894a() {
            return this.f2300a.mo1898b();
        }

        @Deprecated
        /* renamed from: b */
        public b m1895b(C0924b c0924b) {
            this.f2300a.mo1899d(c0924b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public b m1896c(C0924b c0924b) {
            this.f2300a.mo1900f(c0924b);
            return this;
        }

        public b(C0285c0 c0285c0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f2300a = new e(c0285c0);
                return;
            }
            if (i2 >= 29) {
                this.f2300a = new d(c0285c0);
            } else if (i2 >= 20) {
                this.f2300a = new c(c0285c0);
            } else {
                this.f2300a = new f(c0285c0);
            }
        }
    }

    public C0285c0(C0285c0 c0285c0) {
        if (c0285c0 != null) {
            l lVar = c0285c0.f2295b;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.f2295b = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.f2295b = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.f2295b = new i(this, (i) lVar);
            } else if (i2 >= 21 && (lVar instanceof h)) {
                this.f2295b = new h(this, (h) lVar);
            } else if (i2 >= 20 && (lVar instanceof g)) {
                this.f2295b = new g(this, (g) lVar);
            } else {
                this.f2295b = new l(this);
            }
            lVar.mo1910e(this);
            return;
        }
        this.f2295b = new l(this);
    }
}
