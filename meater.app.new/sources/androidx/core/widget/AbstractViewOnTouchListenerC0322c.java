package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0311u;

/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0322c implements View.OnTouchListener {

    /* renamed from: f */
    private static final int f2478f = ViewConfiguration.getTapTimeout();

    /* renamed from: i */
    final View f2481i;

    /* renamed from: j */
    private Runnable f2482j;

    /* renamed from: m */
    private int f2485m;

    /* renamed from: n */
    private int f2486n;

    /* renamed from: r */
    private boolean f2490r;

    /* renamed from: s */
    boolean f2491s;

    /* renamed from: t */
    boolean f2492t;

    /* renamed from: u */
    boolean f2493u;

    /* renamed from: v */
    private boolean f2494v;

    /* renamed from: w */
    private boolean f2495w;

    /* renamed from: g */
    final a f2479g = new a();

    /* renamed from: h */
    private final Interpolator f2480h = new AccelerateInterpolator();

    /* renamed from: k */
    private float[] f2483k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f2484l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private float[] f2487o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f2488p = {0.0f, 0.0f};

    /* renamed from: q */
    private float[] f2489q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.c$a */
    private static class a {

        /* renamed from: a */
        private int f2496a;

        /* renamed from: b */
        private int f2497b;

        /* renamed from: c */
        private float f2498c;

        /* renamed from: d */
        private float f2499d;

        /* renamed from: j */
        private float f2505j;

        /* renamed from: k */
        private int f2506k;

        /* renamed from: e */
        private long f2500e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f2504i = -1;

        /* renamed from: f */
        private long f2501f = 0;

        /* renamed from: g */
        private int f2502g = 0;

        /* renamed from: h */
        private int f2503h = 0;

        a() {
        }

        /* renamed from: e */
        private float m2293e(long j2) {
            if (j2 < this.f2500e) {
                return 0.0f;
            }
            long j3 = this.f2504i;
            if (j3 < 0 || j2 < j3) {
                return AbstractViewOnTouchListenerC0322c.m2272e((j2 - r0) / this.f2496a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f2505j;
            return (1.0f - f2) + (f2 * AbstractViewOnTouchListenerC0322c.m2272e((j2 - j3) / this.f2506k, 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m2294g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        /* renamed from: a */
        public void m2295a() {
            if (this.f2501f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM2294g = m2294g(m2293e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f2501f;
            this.f2501f = jCurrentAnimationTimeMillis;
            float f2 = j2 * fM2294g;
            this.f2502g = (int) (this.f2498c * f2);
            this.f2503h = (int) (f2 * this.f2499d);
        }

        /* renamed from: b */
        public int m2296b() {
            return this.f2502g;
        }

        /* renamed from: c */
        public int m2297c() {
            return this.f2503h;
        }

        /* renamed from: d */
        public int m2298d() {
            float f2 = this.f2498c;
            return (int) (f2 / Math.abs(f2));
        }

        /* renamed from: f */
        public int m2299f() {
            float f2 = this.f2499d;
            return (int) (f2 / Math.abs(f2));
        }

        /* renamed from: h */
        public boolean m2300h() {
            return this.f2504i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2504i + ((long) this.f2506k);
        }

        /* renamed from: i */
        public void m2301i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2506k = AbstractViewOnTouchListenerC0322c.m2273f((int) (jCurrentAnimationTimeMillis - this.f2500e), 0, this.f2497b);
            this.f2505j = m2293e(jCurrentAnimationTimeMillis);
            this.f2504i = jCurrentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m2302j(int i2) {
            this.f2497b = i2;
        }

        /* renamed from: k */
        public void m2303k(int i2) {
            this.f2496a = i2;
        }

        /* renamed from: l */
        public void m2304l(float f2, float f3) {
            this.f2498c = f2;
            this.f2499d = f3;
        }

        /* renamed from: m */
        public void m2305m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2500e = jCurrentAnimationTimeMillis;
            this.f2504i = -1L;
            this.f2501f = jCurrentAnimationTimeMillis;
            this.f2505j = 0.5f;
            this.f2502g = 0;
            this.f2503h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.c$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0322c abstractViewOnTouchListenerC0322c = AbstractViewOnTouchListenerC0322c.this;
            if (abstractViewOnTouchListenerC0322c.f2493u) {
                if (abstractViewOnTouchListenerC0322c.f2491s) {
                    abstractViewOnTouchListenerC0322c.f2491s = false;
                    abstractViewOnTouchListenerC0322c.f2479g.m2305m();
                }
                a aVar = AbstractViewOnTouchListenerC0322c.this.f2479g;
                if (aVar.m2300h() || !AbstractViewOnTouchListenerC0322c.this.m2292u()) {
                    AbstractViewOnTouchListenerC0322c.this.f2493u = false;
                    return;
                }
                AbstractViewOnTouchListenerC0322c abstractViewOnTouchListenerC0322c2 = AbstractViewOnTouchListenerC0322c.this;
                if (abstractViewOnTouchListenerC0322c2.f2492t) {
                    abstractViewOnTouchListenerC0322c2.f2492t = false;
                    abstractViewOnTouchListenerC0322c2.m2280c();
                }
                aVar.m2295a();
                AbstractViewOnTouchListenerC0322c.this.mo2281j(aVar.m2296b(), aVar.m2297c());
                C0311u.m2115a0(AbstractViewOnTouchListenerC0322c.this.f2481i, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0322c(View view) {
        this.f2481i = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        m2286o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        m2287p(f4, f4);
        m2283l(1);
        m2285n(Float.MAX_VALUE, Float.MAX_VALUE);
        m2290s(0.2f, 0.2f);
        m2291t(1.0f, 1.0f);
        m2282k(f2478f);
        m2289r(500);
        m2288q(500);
    }

    /* renamed from: d */
    private float m2271d(int i2, float f2, float f3, float f4) {
        float fM2275h = m2275h(this.f2483k[i2], f3, this.f2484l[i2], f2);
        if (fM2275h == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f2487o[i2];
        float f6 = this.f2488p[i2];
        float f7 = this.f2489q[i2];
        float f8 = f5 * f4;
        return fM2275h > 0.0f ? m2272e(fM2275h * f8, f6, f7) : -m2272e((-fM2275h) * f8, f6, f7);
    }

    /* renamed from: e */
    static float m2272e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* renamed from: f */
    static int m2273f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    /* renamed from: g */
    private float m2274g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2485m;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f2493u && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m2275h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fM2272e = m2272e(f2 * f3, 0.0f, f4);
        float fM2274g = m2274g(f3 - f5, fM2272e) - m2274g(f5, fM2272e);
        if (fM2274g < 0.0f) {
            interpolation = -this.f2480h.getInterpolation(-fM2274g);
        } else {
            if (fM2274g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2480h.getInterpolation(fM2274g);
        }
        return m2272e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m2276i() {
        if (this.f2491s) {
            this.f2493u = false;
        } else {
            this.f2479g.m2301i();
        }
    }

    /* renamed from: v */
    private void m2277v() {
        int i2;
        if (this.f2482j == null) {
            this.f2482j = new b();
        }
        this.f2493u = true;
        this.f2491s = true;
        if (this.f2490r || (i2 = this.f2486n) <= 0) {
            this.f2482j.run();
        } else {
            C0311u.m2117b0(this.f2481i, this.f2482j, i2);
        }
        this.f2490r = true;
    }

    /* renamed from: a */
    public abstract boolean mo2278a(int i2);

    /* renamed from: b */
    public abstract boolean mo2279b(int i2);

    /* renamed from: c */
    void m2280c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2481i.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo2281j(int i2, int i3);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0322c m2282k(int i2) {
        this.f2486n = i2;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC0322c m2283l(int i2) {
        this.f2485m = i2;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC0322c m2284m(boolean z) {
        if (this.f2494v && !z) {
            m2276i();
        }
        this.f2494v = z;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC0322c m2285n(float f2, float f3) {
        float[] fArr = this.f2484l;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC0322c m2286o(float f2, float f3) {
        float[] fArr = this.f2489q;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2494v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m2276i()
            goto L58
        L1a:
            r5.f2492t = r2
            r5.f2490r = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2481i
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2271d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2481i
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2271d(r2, r7, r6, r3)
            androidx.core.widget.c$a r7 = r5.f2479g
            r7.m2304l(r0, r6)
            boolean r6 = r5.f2493u
            if (r6 != 0) goto L58
            boolean r6 = r5.m2292u()
            if (r6 == 0) goto L58
            r5.m2277v()
        L58:
            boolean r6 = r5.f2495w
            if (r6 == 0) goto L61
            boolean r6 = r5.f2493u
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0322c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC0322c m2287p(float f2, float f3) {
        float[] fArr = this.f2488p;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC0322c m2288q(int i2) {
        this.f2479g.m2302j(i2);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC0322c m2289r(int i2) {
        this.f2479g.m2303k(i2);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC0322c m2290s(float f2, float f3) {
        float[] fArr = this.f2483k;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC0322c m2291t(float f2, float f3) {
        float[] fArr = this.f2487o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m2292u() {
        a aVar = this.f2479g;
        int iM2299f = aVar.m2299f();
        int iM2298d = aVar.m2298d();
        return (iM2299f != 0 && mo2279b(iM2299f)) || (iM2298d != 0 && mo2278a(iM2298d));
    }
}
