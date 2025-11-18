package com.google.firebase.perf.session.gauges;

import B9.o;
import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v9.C4925a;

/* compiled from: MemoryGaugeCollector.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    private static final C4925a f38591f = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f38592a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<C9.b> f38593b;

    /* renamed from: c, reason: collision with root package name */
    private final Runtime f38594c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture f38595d;

    /* renamed from: e, reason: collision with root package name */
    private long f38596e;

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private int d() {
        return o.c(B9.k.f1946G.j(this.f38594c.totalMemory() - this.f38594c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(B9.l lVar) {
        C9.b bVarL = l(lVar);
        if (bVarL != null) {
            this.f38593b.add(bVarL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(B9.l lVar) {
        C9.b bVarL = l(lVar);
        if (bVarL != null) {
            this.f38593b.add(bVarL);
        }
    }

    private synchronized void h(final B9.l lVar) {
        try {
            this.f38592a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38589B.f(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f38591f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, final B9.l lVar) {
        this.f38596e = j10;
        try {
            this.f38595d = this.f38592a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38587B.g(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f38591f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private C9.b l(B9.l lVar) {
        if (lVar == null) {
            return null;
        }
        return C9.b.d0().L(lVar.b()).M(d()).e();
    }

    public void c(B9.l lVar) {
        h(lVar);
    }

    public void j(long j10, B9.l lVar) {
        if (e(j10)) {
            return;
        }
        if (this.f38595d == null) {
            i(j10, lVar);
        } else if (this.f38596e != j10) {
            k();
            i(j10, lVar);
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f38595d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f38595d = null;
        this.f38596e = -1L;
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f38595d = null;
        this.f38596e = -1L;
        this.f38592a = scheduledExecutorService;
        this.f38593b = new ConcurrentLinkedQueue<>();
        this.f38594c = runtime;
    }
}
