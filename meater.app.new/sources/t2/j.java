package t2;

import X1.C1804a;
import X1.L;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final C4538a f49853a = new C4538a();

    /* renamed from: b, reason: collision with root package name */
    private final b f49854b;

    /* renamed from: c, reason: collision with root package name */
    private final c f49855c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f49856d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f49857e;

    /* renamed from: f, reason: collision with root package name */
    private float f49858f;

    /* renamed from: g, reason: collision with root package name */
    private float f49859g;

    /* renamed from: h, reason: collision with root package name */
    private float f49860h;

    /* renamed from: i, reason: collision with root package name */
    private float f49861i;

    /* renamed from: j, reason: collision with root package name */
    private int f49862j;

    /* renamed from: k, reason: collision with root package name */
    private long f49863k;

    /* renamed from: l, reason: collision with root package name */
    private long f49864l;

    /* renamed from: m, reason: collision with root package name */
    private long f49865m;

    /* renamed from: n, reason: collision with root package name */
    private long f49866n;

    /* renamed from: o, reason: collision with root package name */
    private long f49867o;

    /* renamed from: p, reason: collision with root package name */
    private long f49868p;

    /* renamed from: q, reason: collision with root package name */
    private long f49869q;

    /* compiled from: VideoFrameReleaseHelper.java */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                X1.n.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: G, reason: collision with root package name */
        private static final c f49872G = new c();

        /* renamed from: B, reason: collision with root package name */
        public volatile long f49873B = -9223372036854775807L;

        /* renamed from: C, reason: collision with root package name */
        private final Handler f49874C;

        /* renamed from: D, reason: collision with root package name */
        private final HandlerThread f49875D;

        /* renamed from: E, reason: collision with root package name */
        private Choreographer f49876E;

        /* renamed from: F, reason: collision with root package name */
        private int f49877F;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f49875D = handlerThread;
            handlerThread.start();
            Handler handlerZ = L.z(handlerThread.getLooper(), this);
            this.f49874C = handlerZ;
            handlerZ.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f49876E;
            if (choreographer != null) {
                int i10 = this.f49877F + 1;
                this.f49877F = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f49876E = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                X1.n.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f49872G;
        }

        private void f() {
            Choreographer choreographer = this.f49876E;
            if (choreographer != null) {
                int i10 = this.f49877F - 1;
                this.f49877F = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f49873B = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f49874C.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f49873B = j10;
            ((Choreographer) C1804a.e(this.f49876E)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f49874C.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public j(Context context) {
        b bVarF = f(context);
        this.f49854b = bVarF;
        this.f49855c = bVarF != null ? c.d() : null;
        this.f49863k = -9223372036854775807L;
        this.f49864l = -9223372036854775807L;
        this.f49858f = -1.0f;
        this.f49861i = 1.0f;
        this.f49862j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (L.f18626a < 30 || (surface = this.f49857e) == null || this.f49862j == Integer.MIN_VALUE || this.f49860h == 0.0f) {
            return;
        }
        this.f49860h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f49865m = 0L;
        this.f49868p = -1L;
        this.f49866n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f49863k = refreshRate;
            this.f49864l = (refreshRate * 80) / 100;
        } else {
            X1.n.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f49863k = -9223372036854775807L;
            this.f49864l = -9223372036854775807L;
        }
    }

    private void q() {
        if (L.f18626a < 30 || this.f49857e == null) {
            return;
        }
        float fB = this.f49853a.e() ? this.f49853a.b() : this.f49858f;
        float f10 = this.f49859g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f49859g) < ((!this.f49853a.e() || this.f49853a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f49853a.c() < 30) {
            return;
        }
        this.f49859g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = X1.L.f18626a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f49857e
            if (r0 == 0) goto L30
            int r1 = r3.f49862j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f49856d
            if (r1 == 0) goto L21
            float r1 = r3.f49859g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f49861i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f49860h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f49860h = r1
            t2.j.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.j.r(boolean):void");
    }

    public long b(long j10) {
        long j11;
        if (this.f49868p == -1 || !this.f49853a.e()) {
            j11 = j10;
        } else {
            long jA = this.f49869q + ((long) ((this.f49853a.a() * (this.f49865m - this.f49868p)) / this.f49861i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f49866n = this.f49865m;
        this.f49867o = j11;
        c cVar = this.f49855c;
        if (cVar == null || this.f49863k == -9223372036854775807L) {
            return j11;
        }
        long j12 = cVar.f49873B;
        return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f49863k) - this.f49864l;
    }

    public void g(float f10) {
        this.f49858f = f10;
        this.f49853a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f49866n;
        if (j11 != -1) {
            this.f49868p = j11;
            this.f49869q = this.f49867o;
        }
        this.f49865m++;
        this.f49853a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f49861i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f49856d = true;
        n();
        if (this.f49854b != null) {
            ((c) C1804a.e(this.f49855c)).a();
            this.f49854b.b();
        }
        r(false);
    }

    public void l() {
        this.f49856d = false;
        b bVar = this.f49854b;
        if (bVar != null) {
            bVar.c();
            ((c) C1804a.e(this.f49855c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f49857e == surface) {
            return;
        }
        d();
        this.f49857e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f49862j == i10) {
            return;
        }
        this.f49862j = i10;
        r(true);
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    private final class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f49870a;

        public b(DisplayManager displayManager) {
            this.f49870a = displayManager;
        }

        private Display a() {
            return this.f49870a.getDisplay(0);
        }

        public void b() {
            this.f49870a.registerDisplayListener(this, L.A());
            j.this.p(a());
        }

        public void c() {
            this.f49870a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                j.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
