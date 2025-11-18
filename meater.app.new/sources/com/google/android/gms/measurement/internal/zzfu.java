package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfu extends AbstractC7799q4 {

    /* renamed from: c */
    private static final AtomicLong f29261c = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d */
    private C7861x3 f29262d;

    /* renamed from: e */
    private C7861x3 f29263e;

    /* renamed from: f */
    private final PriorityBlockingQueue<C7843v3<?>> f29264f;

    /* renamed from: g */
    private final BlockingQueue<C7843v3<?>> f29265g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f29266h;

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f29267i;

    /* renamed from: j */
    private final Object f29268j;

    /* renamed from: k */
    private final Semaphore f29269k;

    /* renamed from: l */
    private volatile boolean f29270l;

    zzfu(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29268j = new Object();
        this.f29269k = new Semaphore(2);
        this.f29264f = new PriorityBlockingQueue<>();
        this.f29265g = new LinkedBlockingQueue();
        this.f29266h = new C7852w3(this, "Thread death: Uncaught exception on worker thread");
        this.f29267i = new C7852w3(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: A */
    static /* synthetic */ C7861x3 m23187A(zzfu zzfuVar, C7861x3 c7861x3) {
        zzfuVar.f29263e = null;
        return null;
    }

    /* renamed from: u */
    static /* synthetic */ C7861x3 m23193u(zzfu zzfuVar, C7861x3 c7861x3) {
        zzfuVar.f29262d = null;
        return null;
    }

    /* renamed from: y */
    private final void m23195y(C7843v3<?> c7843v3) {
        synchronized (this.f29268j) {
            this.f29264f.add(c7843v3);
            C7861x3 c7861x3 = this.f29262d;
            if (c7861x3 == null) {
                C7861x3 c7861x32 = new C7861x3(this, "Measurement Worker", this.f29264f);
                this.f29262d = c7861x32;
                c7861x32.setUncaughtExceptionHandler(this.f29266h);
                this.f29262d.start();
            } else {
                c7861x3.m22872a();
            }
        }
    }

    /* renamed from: B */
    public final <V> Future<V> m23196B(Callable<V> callable) throws IllegalStateException {
        m22807p();
        Preconditions.m14372k(callable);
        C7843v3<?> c7843v3 = new C7843v3<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f29262d) {
            c7843v3.run();
        } else {
            m23195y(c7843v3);
        }
        return c7843v3;
    }

    /* renamed from: C */
    public final void m23197C(Runnable runnable) throws IllegalStateException {
        m22807p();
        Preconditions.m14372k(runnable);
        C7843v3<?> c7843v3 = new C7843v3<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f29268j) {
            this.f29265g.add(c7843v3);
            C7861x3 c7861x3 = this.f29263e;
            if (c7861x3 == null) {
                C7861x3 c7861x32 = new C7861x3(this, "Measurement Network", this.f29265g);
                this.f29263e = c7861x32;
                c7861x32.setUncaughtExceptionHandler(this.f29267i);
                this.f29263e.start();
            } else {
                c7861x3.m22872a();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: I */
    public final boolean m23198I() {
        return Thread.currentThread() == this.f29262d;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final void mo22791c() {
        if (Thread.currentThread() != this.f29263e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final void mo22792d() {
        if (Thread.currentThread() != this.f29262d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        return false;
    }

    /* renamed from: v */
    final <T> T m23199v(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            mo22835g().m23201z(runnable);
            try {
                atomicReference.wait(15000L);
            } catch (InterruptedException unused) {
                zzev zzevVarM23140K = mo22836h().m23140K();
                String strValueOf = String.valueOf(str);
                zzevVarM23140K.m23147a(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzev zzevVarM23140K2 = mo22836h().m23140K();
            String strValueOf2 = String.valueOf(str);
            zzevVarM23140K2.m23147a(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    /* renamed from: w */
    public final <V> Future<V> m23200w(Callable<V> callable) throws IllegalStateException {
        m22807p();
        Preconditions.m14372k(callable);
        C7843v3<?> c7843v3 = new C7843v3<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f29262d) {
            if (!this.f29264f.isEmpty()) {
                mo22836h().m23140K().m23147a("Callable skipped the worker queue.");
            }
            c7843v3.run();
        } else {
            m23195y(c7843v3);
        }
        return c7843v3;
    }

    /* renamed from: z */
    public final void m23201z(Runnable runnable) throws IllegalStateException {
        m22807p();
        Preconditions.m14372k(runnable);
        m23195y(new C7843v3<>(this, runnable, false, "Task exception on worker thread"));
    }
}
