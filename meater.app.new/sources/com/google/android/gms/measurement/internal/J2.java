package com.google.android.gms.measurement.internal;

import android.content.Context;
import g7.C3445p;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class J2 extends AbstractC2816p3 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f34893l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private L2 f34894c;

    /* renamed from: d, reason: collision with root package name */
    private L2 f34895d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue<N2<?>> f34896e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<N2<?>> f34897f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f34898g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f34899h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f34900i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f34901j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f34902k;

    J2(P2 p22) {
        super(p22);
        this.f34900i = new Object();
        this.f34901j = new Semaphore(2);
        this.f34896e = new PriorityBlockingQueue<>();
        this.f34897f = new LinkedBlockingQueue();
        this.f34898g = new K2(this, "Thread death: Uncaught exception on worker thread");
        this.f34899h = new K2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void z(N2<?> n22) {
        synchronized (this.f34900i) {
            try {
                this.f34896e.add(n22);
                L2 l22 = this.f34894c;
                if (l22 == null) {
                    L2 l23 = new L2(this, "Measurement Worker", this.f34896e);
                    this.f34894c = l23;
                    l23.setUncaughtExceptionHandler(this.f34898g);
                    this.f34894c.start();
                } else {
                    l22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(Runnable runnable) {
        q();
        C3445p.k(runnable);
        N2<?> n22 = new N2<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f34900i) {
            try {
                this.f34897f.add(n22);
                L2 l22 = this.f34895d;
                if (l22 == null) {
                    L2 l23 = new L2(this, "Measurement Network", this.f34897f);
                    this.f34895d = l23;
                    l23.setUncaughtExceptionHandler(this.f34899h);
                    this.f34895d.start();
                } else {
                    l22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> Future<V> C(Callable<V> callable) {
        q();
        C3445p.k(callable);
        N2<?> n22 = new N2<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f34894c) {
            n22.run();
        } else {
            z(n22);
        }
        return n22;
    }

    public final void E(Runnable runnable) {
        q();
        C3445p.k(runnable);
        z(new N2<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void H(Runnable runnable) {
        q();
        C3445p.k(runnable);
        z(new N2<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean K() {
        return Thread.currentThread() == this.f34895d;
    }

    public final boolean L() {
        return Thread.currentThread() == this.f34894c;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final void l() {
        if (Thread.currentThread() != this.f34895d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final void n() {
        if (Thread.currentThread() != this.f34894c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final boolean u() {
        return false;
    }

    final <T> T w(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            o().E(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                k().M().a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            k().M().a("Timed out waiting for " + str);
        }
        return t10;
    }

    public final <V> Future<V> x(Callable<V> callable) {
        q();
        C3445p.k(callable);
        N2<?> n22 = new N2<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f34894c) {
            if (!this.f34896e.isEmpty()) {
                k().M().a("Callable skipped the worker queue.");
            }
            n22.run();
        } else {
            z(n22);
        }
        return n22;
    }
}
