package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.apptionlabs.meater_app.data.Temperature;
import s1.X;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: S, reason: collision with root package name */
    private static final int f24773S = ViewConfiguration.getTapTimeout();

    /* renamed from: D, reason: collision with root package name */
    final View f24776D;

    /* renamed from: E, reason: collision with root package name */
    private Runnable f24777E;

    /* renamed from: H, reason: collision with root package name */
    private int f24780H;

    /* renamed from: I, reason: collision with root package name */
    private int f24781I;

    /* renamed from: M, reason: collision with root package name */
    private boolean f24785M;

    /* renamed from: N, reason: collision with root package name */
    boolean f24786N;

    /* renamed from: O, reason: collision with root package name */
    boolean f24787O;

    /* renamed from: P, reason: collision with root package name */
    boolean f24788P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f24789Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f24790R;

    /* renamed from: B, reason: collision with root package name */
    final C0349a f24774B = new C0349a();

    /* renamed from: C, reason: collision with root package name */
    private final Interpolator f24775C = new AccelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    private float[] f24778F = {0.0f, 0.0f};

    /* renamed from: G, reason: collision with root package name */
    private float[] f24779G = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: J, reason: collision with root package name */
    private float[] f24782J = {0.0f, 0.0f};

    /* renamed from: K, reason: collision with root package name */
    private float[] f24783K = {0.0f, 0.0f};

    /* renamed from: L, reason: collision with root package name */
    private float[] f24784L = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0349a {

        /* renamed from: a, reason: collision with root package name */
        private int f24791a;

        /* renamed from: b, reason: collision with root package name */
        private int f24792b;

        /* renamed from: c, reason: collision with root package name */
        private float f24793c;

        /* renamed from: d, reason: collision with root package name */
        private float f24794d;

        /* renamed from: j, reason: collision with root package name */
        private float f24800j;

        /* renamed from: k, reason: collision with root package name */
        private int f24801k;

        /* renamed from: e, reason: collision with root package name */
        private long f24795e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f24799i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f24796f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f24797g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f24798h = 0;

        C0349a() {
        }

        private float e(long j10) {
            if (j10 < this.f24795e) {
                return 0.0f;
            }
            long j11 = this.f24799i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f24791a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f24800j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f24801k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f24796f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f24796f;
            this.f24796f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f24797g = (int) (this.f24793c * f10);
            this.f24798h = (int) (f10 * this.f24794d);
        }

        public int b() {
            return this.f24797g;
        }

        public int c() {
            return this.f24798h;
        }

        public int d() {
            float f10 = this.f24793c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f24794d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f24799i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f24799i + ((long) this.f24801k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f24801k = a.f((int) (jCurrentAnimationTimeMillis - this.f24795e), 0, this.f24792b);
            this.f24800j = e(jCurrentAnimationTimeMillis);
            this.f24799i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f24792b = i10;
        }

        public void k(int i10) {
            this.f24791a = i10;
        }

        public void l(float f10, float f11) {
            this.f24793c = f10;
            this.f24794d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f24795e = jCurrentAnimationTimeMillis;
            this.f24799i = -1L;
            this.f24796f = jCurrentAnimationTimeMillis;
            this.f24800j = 0.5f;
            this.f24797g = 0;
            this.f24798h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f24788P) {
                if (aVar.f24786N) {
                    aVar.f24786N = false;
                    aVar.f24774B.m();
                }
                C0349a c0349a = a.this.f24774B;
                if (c0349a.h() || !a.this.u()) {
                    a.this.f24788P = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f24787O) {
                    aVar2.f24787O = false;
                    aVar2.c();
                }
                c0349a.a();
                a.this.j(c0349a.b(), c0349a.c());
                X.f0(a.this.f24776D, this);
            }
        }
    }

    public a(View view) {
        this.f24776D = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f24773S);
        r(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
        q(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f24778F[i10], f11, this.f24779G[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f24782J[i10];
        float f14 = this.f24783K[i10];
        float f15 = this.f24784L[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f24780H;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f24788P && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f24775C.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f24775C.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f24786N) {
            this.f24788P = false;
        } else {
            this.f24774B.i();
        }
    }

    private void v() {
        int i10;
        if (this.f24777E == null) {
            this.f24777E = new b();
        }
        this.f24788P = true;
        this.f24786N = true;
        if (this.f24785M || (i10 = this.f24781I) <= 0) {
            this.f24777E.run();
        } else {
            X.g0(this.f24776D, this.f24777E, i10);
        }
        this.f24785M = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f24776D.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f24781I = i10;
        return this;
    }

    public a l(int i10) {
        this.f24780H = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f24789Q && !z10) {
            i();
        }
        this.f24789Q = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f24779G;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f24784L;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
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
            boolean r0 = r5.f24789Q
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
            r5.i()
            goto L58
        L1a:
            r5.f24787O = r2
            r5.f24785M = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f24776D
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f24776D
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f24774B
            r7.l(r0, r6)
            boolean r6 = r5.f24788P
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f24790R
            if (r6 == 0) goto L61
            boolean r6 = r5.f24788P
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f24783K;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f24774B.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f24774B.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f24778F;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f24782J;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0349a c0349a = this.f24774B;
        int iF = c0349a.f();
        int iD = c0349a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
