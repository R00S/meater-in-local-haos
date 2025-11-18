package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzn extends Thread {

    /* renamed from: f */
    private final BlockingQueue<zzr<?>> f26617f;

    /* renamed from: g */
    private final zzm f26618g;

    /* renamed from: h */
    private final zzb f26619h;

    /* renamed from: i */
    private final zzab f26620i;

    /* renamed from: j */
    private volatile boolean f26621j = false;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzmVar, zzb zzbVar, zzab zzabVar) {
        this.f26617f = blockingQueue;
        this.f26618g = zzmVar;
        this.f26619h = zzbVar;
        this.f26620i = zzabVar;
    }

    /* renamed from: a */
    private final void m20301a() throws InterruptedException {
        zzr<?> zzrVarTake = this.f26617f.take();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzrVarTake.m20413A(3);
        try {
            zzrVarTake.m20418I("network-queue-take");
            zzrVarTake.m20431u();
            TrafficStats.setThreadStatsTag(zzrVarTake.m20420K());
            zzp zzpVarMo16589a = this.f26618g.mo16589a(zzrVarTake);
            zzrVarTake.m20418I("network-http-complete");
            if (zzpVarMo16589a.f26743e && zzrVarTake.m20427T()) {
                zzrVarTake.m20419J("not-modified");
                zzrVarTake.m20428U();
                return;
            }
            zzy<?> zzyVarMo17084y = zzrVarTake.mo17084y(zzpVarMo16589a);
            zzrVarTake.m20418I("network-parse-complete");
            if (zzrVarTake.m20423P() && zzyVarMo17084y.f27424b != null) {
                this.f26619h.mo16744v(zzrVarTake.m20421M(), zzyVarMo17084y.f27424b);
                zzrVarTake.m20418I("network-cache-written");
            }
            zzrVarTake.m20426S();
            this.f26620i.mo16227c(zzrVarTake, zzyVarMo17084y);
            zzrVarTake.m20415E(zzyVarMo17084y);
        } catch (Exception e2) {
            zzag.m16530e(e2, "Unhandled exception %s", e2.toString());
            zzaf zzafVar = new zzaf(e2);
            zzafVar.m16492a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f26620i.mo16225a(zzrVarTake, zzafVar);
            zzrVarTake.m20428U();
        } catch (zzaf e3) {
            e3.m16492a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f26620i.mo16225a(zzrVarTake, e3);
            zzrVarTake.m20428U();
        } finally {
            zzrVarTake.m20413A(4);
        }
    }

    /* renamed from: b */
    public final void m20302b() {
        this.f26621j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m20301a();
            } catch (InterruptedException unused) {
                if (this.f26621j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m16527b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
