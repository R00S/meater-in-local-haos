package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes2.dex */
final class C7861x3 extends Thread {

    /* renamed from: f */
    private final Object f28989f;

    /* renamed from: g */
    private final BlockingQueue<C7843v3<?>> f28990g;

    /* renamed from: h */
    private final /* synthetic */ zzfu f28991h;

    public C7861x3(zzfu zzfuVar, String str, BlockingQueue<C7843v3<?>> blockingQueue) {
        this.f28991h = zzfuVar;
        Preconditions.m14372k(str);
        Preconditions.m14372k(blockingQueue);
        this.f28989f = new Object();
        this.f28990g = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m22871b(InterruptedException interruptedException) {
        this.f28991h.mo22836h().m23140K().m23148b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m22872a() {
        synchronized (this.f28989f) {
            this.f28989f.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.f28991h.f29269k.acquire();
                z = true;
            } catch (InterruptedException e2) {
                m22871b(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C7843v3<?> c7843v3Poll = this.f28990g.poll();
                if (c7843v3Poll == null) {
                    synchronized (this.f28989f) {
                        if (this.f28990g.peek() == null && !this.f28991h.f29270l) {
                            try {
                                this.f28989f.wait(30000L);
                            } catch (InterruptedException e3) {
                                m22871b(e3);
                            }
                        }
                    }
                    synchronized (this.f28991h.f29268j) {
                        if (this.f28990g.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(c7843v3Poll.f28949g ? threadPriority : 10);
                    c7843v3Poll.run();
                }
            }
            synchronized (this.f28991h.f29268j) {
                this.f28991h.f29269k.release();
                this.f28991h.f29268j.notifyAll();
                if (this == this.f28991h.f29262d) {
                    zzfu.m23193u(this.f28991h, null);
                } else if (this == this.f28991h.f29263e) {
                    zzfu.m23187A(this.f28991h, null);
                } else {
                    this.f28991h.mo22836h().m23137H().m23147a("Current scheduler thread is neither worker nor network");
                }
            }
        } catch (Throwable th) {
            synchronized (this.f28991h.f29268j) {
                this.f28991h.f29269k.release();
                this.f28991h.f29268j.notifyAll();
                if (this == this.f28991h.f29262d) {
                    zzfu.m23193u(this.f28991h, null);
                } else if (this == this.f28991h.f29263e) {
                    zzfu.m23187A(this.f28991h, null);
                } else {
                    this.f28991h.mo22836h().m23137H().m23147a("Current scheduler thread is neither worker nor network");
                }
                throw th;
            }
        }
    }
}
