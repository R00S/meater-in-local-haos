package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v9.C4925a;

/* compiled from: CpuGaugeCollector.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final C4925a f38568g = C4925a.e();

    /* renamed from: h, reason: collision with root package name */
    private static final long f38569h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture f38574e = null;

    /* renamed from: f, reason: collision with root package name */
    private long f38575f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<C9.e> f38570a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f38571b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    private final String f38572c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    private final long f38573d = e();

    @SuppressLint({"ThreadPoolCreation"})
    c() {
    }

    private long d(long j10) {
        return Math.round((j10 / this.f38573d) * f38569h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(B9.l lVar) throws IOException {
        C9.e eVarM = m(lVar);
        if (eVarM != null) {
            this.f38570a.add(eVarM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(B9.l lVar) throws IOException {
        C9.e eVarM = m(lVar);
        if (eVarM != null) {
            this.f38570a.add(eVarM);
        }
    }

    private synchronized void i(final B9.l lVar) {
        try {
            this.f38571b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    this.f38566B.g(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f38568g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, final B9.l lVar) {
        this.f38575f = j10;
        try {
            this.f38574e = this.f38571b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    this.f38564B.h(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f38568g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private C9.e m(B9.l lVar) throws IOException {
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f38572c));
            try {
                long jB = lVar.b();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                C9.e eVarE = C9.e.e0().L(jB).M(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).N(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).e();
                bufferedReader.close();
                return eVarE;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            f38568g.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            f38568g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            f38568g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            f38568g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(B9.l lVar) {
        i(lVar);
    }

    public void k(long j10, B9.l lVar) {
        long j11 = this.f38573d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f38574e == null) {
            j(j10, lVar);
        } else if (this.f38575f != j10) {
            l();
            j(j10, lVar);
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f38574e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f38574e = null;
        this.f38575f = -1L;
    }
}
