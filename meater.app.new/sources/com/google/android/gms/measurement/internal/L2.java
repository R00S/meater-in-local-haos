package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.apptionlabs.meater_app.data.Config;
import g7.C3445p;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class L2 extends Thread {

    /* renamed from: B, reason: collision with root package name */
    private final Object f35026B;

    /* renamed from: C, reason: collision with root package name */
    private final BlockingQueue<N2<?>> f35027C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f35028D = false;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ J2 f35029E;

    public L2(J2 j22, String str, BlockingQueue<N2<?>> blockingQueue) {
        this.f35029E = j22;
        C3445p.k(str);
        C3445p.k(blockingQueue);
        this.f35026B = new Object();
        this.f35027C = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f35029E.k().M().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f35029E.f34900i) {
            try {
                if (!this.f35028D) {
                    this.f35029E.f34901j.release();
                    this.f35029E.f34900i.notifyAll();
                    if (this == this.f35029E.f34894c) {
                        this.f35029E.f34894c = null;
                    } else if (this == this.f35029E.f34895d) {
                        this.f35029E.f34895d = null;
                    } else {
                        this.f35029E.k().H().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f35028D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.f35026B) {
            this.f35026B.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f35029E.f34901j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                N2<?> n2Poll = this.f35027C.poll();
                if (n2Poll != null) {
                    Process.setThreadPriority(n2Poll.f35060C ? threadPriority : 10);
                    n2Poll.run();
                } else {
                    synchronized (this.f35026B) {
                        if (this.f35027C.peek() == null && !this.f35029E.f34902k) {
                            try {
                                this.f35026B.wait(Config.MC_STATS_INTERVAL);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f35029E.f34900i) {
                        if (this.f35027C.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
