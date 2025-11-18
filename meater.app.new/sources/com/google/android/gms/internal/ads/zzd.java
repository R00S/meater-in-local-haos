package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzd extends Thread {

    /* renamed from: f */
    private static final boolean f25402f = zzag.f21996b;

    /* renamed from: g */
    private final BlockingQueue<zzr<?>> f25403g;

    /* renamed from: h */
    private final BlockingQueue<zzr<?>> f25404h;

    /* renamed from: i */
    private final zzb f25405i;

    /* renamed from: j */
    private final zzab f25406j;

    /* renamed from: k */
    private volatile boolean f25407k = false;

    /* renamed from: l */
    private final C7245uy f25408l = new C7245uy(this);

    public zzd(BlockingQueue<zzr<?>> blockingQueue, BlockingQueue<zzr<?>> blockingQueue2, zzb zzbVar, zzab zzabVar) {
        this.f25403g = blockingQueue;
        this.f25404h = blockingQueue2;
        this.f25405i = zzbVar;
        this.f25406j = zzabVar;
    }

    /* renamed from: a */
    private final void m19118a() throws InterruptedException {
        zzr<?> zzrVarTake = this.f25403g.take();
        zzrVarTake.m20418I("cache-queue-take");
        zzrVarTake.m20413A(1);
        try {
            zzrVarTake.m20431u();
            zzc zzcVarMo16743u = this.f25405i.mo16743u(zzrVarTake.m20421M());
            if (zzcVarMo16743u == null) {
                zzrVarTake.m20418I("cache-miss");
                if (!this.f25408l.m15945d(zzrVarTake)) {
                    this.f25404h.put(zzrVarTake);
                }
                return;
            }
            if (zzcVarMo16743u.m18612a()) {
                zzrVarTake.m20418I("cache-hit-expired");
                zzrVarTake.m20432v(zzcVarMo16743u);
                if (!this.f25408l.m15945d(zzrVarTake)) {
                    this.f25404h.put(zzrVarTake);
                }
                return;
            }
            zzrVarTake.m20418I("cache-hit");
            zzy<?> zzyVarMo17084y = zzrVarTake.mo17084y(new zzp(zzcVarMo16743u.f23917a, zzcVarMo16743u.f23923g));
            zzrVarTake.m20418I("cache-hit-parsed");
            if (zzcVarMo16743u.f23922f < System.currentTimeMillis()) {
                zzrVarTake.m20418I("cache-hit-refresh-needed");
                zzrVarTake.m20432v(zzcVarMo16743u);
                zzyVarMo17084y.f27426d = true;
                if (this.f25408l.m15945d(zzrVarTake)) {
                    this.f25406j.mo16227c(zzrVarTake, zzyVarMo17084y);
                } else {
                    this.f25406j.mo16226b(zzrVarTake, zzyVarMo17084y, new RunnableC6949my(this, zzrVarTake));
                }
            } else {
                this.f25406j.mo16227c(zzrVarTake, zzyVarMo17084y);
            }
        } finally {
            zzrVarTake.m20413A(2);
        }
    }

    /* renamed from: b */
    public final void m19121b() {
        this.f25407k = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f25402f) {
            zzag.m16528c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f25405i.mo16742a();
        while (true) {
            try {
                m19118a();
            } catch (InterruptedException unused) {
                if (this.f25407k) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m16527b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
