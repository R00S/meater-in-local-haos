package X8;

import K6.f;
import K6.i;
import K6.k;
import M6.l;
import N8.g;
import Q8.D;
import Q8.Q;
import Q8.i0;
import T8.F;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z7.C5209k;

/* compiled from: ReportQueue.java */
/* loaded from: classes2.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f18909a;

    /* renamed from: b, reason: collision with root package name */
    private final double f18910b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18911c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18912d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18913e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f18914f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f18915g;

    /* renamed from: h, reason: collision with root package name */
    private final i<F> f18916h;

    /* renamed from: i, reason: collision with root package name */
    private final Q f18917i;

    /* renamed from: j, reason: collision with root package name */
    private int f18918j;

    /* renamed from: k, reason: collision with root package name */
    private long f18919k;

    /* compiled from: ReportQueue.java */
    private final class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final D f18920B;

        /* renamed from: C, reason: collision with root package name */
        private final C5209k<D> f18921C;

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            e.this.p(this.f18920B, this.f18921C);
            e.this.f18917i.c();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f18920B.d());
            e.q(dG);
        }

        private b(D d10, C5209k<D> c5209k) {
            this.f18920B = d10;
            this.f18921C = c5209k;
        }
    }

    e(i<F> iVar, Y8.d dVar, Q q10) {
        this(dVar.f19467f, dVar.f19468g, dVar.f19469h * 1000, iVar, q10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f18909a) * Math.pow(this.f18910b, h()));
    }

    private int h() {
        if (this.f18919k == 0) {
            this.f18919k = o();
        }
        int iO = (int) ((o() - this.f18919k) / this.f18911c);
        int iMin = l() ? Math.min(100, this.f18918j + iO) : Math.max(0, this.f18918j - iO);
        if (this.f18918j != iMin) {
            this.f18918j = iMin;
            this.f18919k = o();
        }
        return iMin;
    }

    private boolean k() {
        return this.f18914f.size() < this.f18913e;
    }

    private boolean l() {
        return this.f18914f.size() == this.f18913e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f18916h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C5209k c5209k, boolean z10, D d10, Exception exc) {
        if (exc != null) {
            c5209k.d(exc);
            return;
        }
        if (z10) {
            j();
        }
        c5209k.e(d10);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final D d10, final C5209k<D> c5209k) {
        g.f().b("Sending report through Google DataTransport: " + d10.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f18912d < 2000;
        this.f18916h.a(K6.d.h(d10.b()), new k() { // from class: X8.c
            @Override // K6.k
            public final void a(Exception exc) {
                this.f18903a.n(c5209k, z10, d10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) throws InterruptedException {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    C5209k<D> i(D d10, boolean z10) {
        synchronized (this.f18914f) {
            try {
                C5209k<D> c5209k = new C5209k<>();
                if (!z10) {
                    p(d10, c5209k);
                    return c5209k;
                }
                this.f18917i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + d10.d());
                    this.f18917i.a();
                    c5209k.e(d10);
                    return c5209k;
                }
                g.f().b("Enqueueing report: " + d10.d());
                g.f().b("Queue size: " + this.f18914f.size());
                this.f18915g.execute(new b(d10, c5209k));
                g.f().b("Closing task for report: " + d10.d());
                c5209k.e(d10);
                return c5209k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: X8.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f18907B.m(countDownLatch);
            }
        }).start();
        i0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, i<F> iVar, Q q10) {
        this.f18909a = d10;
        this.f18910b = d11;
        this.f18911c = j10;
        this.f18916h = iVar;
        this.f18917i = q10;
        this.f18912d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f18913e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f18914f = arrayBlockingQueue;
        this.f18915g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f18918j = 0;
        this.f18919k = 0L;
    }
}
