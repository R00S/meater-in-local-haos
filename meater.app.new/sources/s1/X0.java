package s1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final g f49099a;

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f49100a;

        /* renamed from: b, reason: collision with root package name */
        private final O f49101b;

        a(Window window, O o10) {
            this.f49100a = window;
            this.f49101b = o10;
        }

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
                i(1024);
            } else if (i10 == 2) {
                h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f49101b.a();
            }
        }

        @Override // s1.X0.g
        void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        protected void e(int i10) {
            View decorView = this.f49100a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f49100a.addFlags(i10);
        }

        protected void h(int i10) {
            View decorView = this.f49100a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void i(int i10) {
            this.f49100a.clearFlags(i10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        @Override // s1.X0.g
        public boolean a() {
            return (this.f49100a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // s1.X0.g
        public void c(boolean z10) {
            if (!z10) {
                h(8192);
                return;
            }
            i(67108864);
            f(Integer.MIN_VALUE);
            e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        @Override // s1.X0.g
        public void b(boolean z10) {
            if (!z10) {
                h(16);
                return;
            }
            i(134217728);
            f(Integer.MIN_VALUE);
            e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class e extends d {
        e(Window window, X0 x02, O o10) {
            super(window, x02, o10);
        }

        e(WindowInsetsController windowInsetsController, X0 x02, O o10) {
            super(windowInsetsController, x02, o10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class f extends e {
        f(Window window, X0 x02, O o10) {
            super(window, x02, o10);
        }

        @Override // s1.X0.d, s1.X0.g
        public boolean a() {
            return (this.f49103b.getSystemBarsAppearance() & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, X0 x02, O o10) {
            super(windowInsetsController, x02, o10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class g {
        g() {
        }

        public boolean a() {
            throw null;
        }

        public void b(boolean z10) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        void d(int i10) {
            throw null;
        }
    }

    @Deprecated
    private X0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f49099a = new f(windowInsetsController, this, new O(windowInsetsController));
        } else {
            this.f49099a = new d(windowInsetsController, this, new O(windowInsetsController));
        }
    }

    @Deprecated
    public static X0 e(WindowInsetsController windowInsetsController) {
        return new X0(windowInsetsController);
    }

    public boolean a() {
        return this.f49099a.a();
    }

    public void b(boolean z10) {
        this.f49099a.b(z10);
    }

    public void c(boolean z10) {
        this.f49099a.c(z10);
    }

    public void d(int i10) {
        this.f49099a.d(i10);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        final X0 f49102a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f49103b;

        /* renamed from: c, reason: collision with root package name */
        final O f49104c;

        /* renamed from: d, reason: collision with root package name */
        private final s.X<Object, WindowInsetsController.OnControllableInsetsChangedListener> f49105d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f49106e;

        d(Window window, X0 x02, O o10) {
            this(window.getInsetsController(), x02, o10);
            this.f49106e = window;
        }

        @Override // s1.X0.g
        public boolean a() {
            this.f49103b.setSystemBarsAppearance(0, 0);
            return (this.f49103b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // s1.X0.g
        public void b(boolean z10) {
            if (z10) {
                if (this.f49106e != null) {
                    e(16);
                }
                this.f49103b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f49106e != null) {
                    f(16);
                }
                this.f49103b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // s1.X0.g
        public void c(boolean z10) {
            if (z10) {
                if (this.f49106e != null) {
                    e(8192);
                }
                this.f49103b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f49106e != null) {
                    f(8192);
                }
                this.f49103b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // s1.X0.g
        void d(int i10) {
            if ((i10 & 8) != 0) {
                this.f49104c.a();
            }
            this.f49103b.show(i10 & (-9));
        }

        protected void e(int i10) {
            View decorView = this.f49106e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            View decorView = this.f49106e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, X0 x02, O o10) {
            this.f49105d = new s.X<>();
            this.f49103b = windowInsetsController;
            this.f49102a = x02;
            this.f49104c = o10;
        }
    }

    public X0(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f49099a = new f(window, this, o10);
        } else if (i10 >= 30) {
            this.f49099a = new d(window, this, o10);
        } else {
            this.f49099a = new c(window, o10);
        }
    }
}
