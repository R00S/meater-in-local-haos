package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d7.AbstractC3049c;
import d7.InterfaceC3050d;
import d7.InterfaceC3051e;
import d7.InterfaceC3052f;
import e7.h0;
import g7.C3445p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p7.j;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends InterfaceC3051e> extends AbstractC3049c<R> {

    /* renamed from: n, reason: collision with root package name */
    static final ThreadLocal f33487n = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f33488a;

    /* renamed from: b, reason: collision with root package name */
    protected final a f33489b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f33490c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f33491d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f33492e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3052f f33493f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f33494g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC3051e f33495h;

    /* renamed from: i, reason: collision with root package name */
    private Status f33496i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f33497j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33498k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33499l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33500m;

    @KeepName
    private d resultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class a<R extends InterfaceC3051e> extends j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(InterfaceC3052f interfaceC3052f, InterfaceC3051e interfaceC3051e) {
            ThreadLocal threadLocal = BasePendingResult.f33487n;
            sendMessage(obtainMessage(1, new Pair((InterfaceC3052f) C3445p.k(interfaceC3052f), interfaceC3051e)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).e(Status.f33459J);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC3052f interfaceC3052f = (InterfaceC3052f) pair.first;
            InterfaceC3051e interfaceC3051e = (InterfaceC3051e) pair.second;
            try {
                interfaceC3052f.a(interfaceC3051e);
            } catch (RuntimeException e10) {
                BasePendingResult.l(interfaceC3051e);
                throw e10;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f33488a = new Object();
        this.f33491d = new CountDownLatch(1);
        this.f33492e = new ArrayList();
        this.f33494g = new AtomicReference();
        this.f33500m = false;
        this.f33489b = new a(Looper.getMainLooper());
        this.f33490c = new WeakReference(null);
    }

    private final InterfaceC3051e h() {
        InterfaceC3051e interfaceC3051e;
        synchronized (this.f33488a) {
            C3445p.o(!this.f33497j, "Result has already been consumed.");
            C3445p.o(f(), "Result is not ready.");
            interfaceC3051e = this.f33495h;
            this.f33495h = null;
            this.f33493f = null;
            this.f33497j = true;
        }
        if (((b) this.f33494g.getAndSet(null)) == null) {
            return (InterfaceC3051e) C3445p.k(interfaceC3051e);
        }
        throw null;
    }

    private final void i(InterfaceC3051e interfaceC3051e) {
        this.f33495h = interfaceC3051e;
        this.f33496i = interfaceC3051e.a0();
        this.f33491d.countDown();
        h0 h0Var = null;
        if (this.f33498k) {
            this.f33493f = null;
        } else {
            InterfaceC3052f interfaceC3052f = this.f33493f;
            if (interfaceC3052f != null) {
                this.f33489b.removeMessages(2);
                this.f33489b.a(interfaceC3052f, h());
            } else if (this.f33495h instanceof InterfaceC3050d) {
                this.resultGuardian = new d(this, h0Var);
            }
        }
        ArrayList arrayList = this.f33492e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3049c.a) arrayList.get(i10)).a(this.f33496i);
        }
        this.f33492e.clear();
    }

    public static void l(InterfaceC3051e interfaceC3051e) {
        if (interfaceC3051e instanceof InterfaceC3050d) {
            try {
                ((InterfaceC3050d) interfaceC3051e).c();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC3051e)), e10);
            }
        }
    }

    @Override // d7.AbstractC3049c
    public final void b(AbstractC3049c.a aVar) {
        C3445p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f33488a) {
            try {
                if (f()) {
                    aVar.a(this.f33496i);
                } else {
                    this.f33492e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d7.AbstractC3049c
    @ResultIgnorabilityUnspecified
    public final R c(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            C3445p.j("await must not be called on the UI thread when time is greater than zero.");
        }
        C3445p.o(!this.f33497j, "Result has already been consumed.");
        C3445p.o(true, "Cannot await if then() has been called.");
        try {
            if (!this.f33491d.await(j10, timeUnit)) {
                e(Status.f33459J);
            }
        } catch (InterruptedException unused) {
            e(Status.f33457H);
        }
        C3445p.o(f(), "Result is not ready.");
        return (R) h();
    }

    protected abstract R d(Status status);

    @Deprecated
    public final void e(Status status) {
        synchronized (this.f33488a) {
            try {
                if (!f()) {
                    g(d(status));
                    this.f33499l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        return this.f33491d.getCount() == 0;
    }

    public final void g(R r10) {
        synchronized (this.f33488a) {
            try {
                if (this.f33499l || this.f33498k) {
                    l(r10);
                    return;
                }
                f();
                C3445p.o(!f(), "Results have already been set");
                C3445p.o(!this.f33497j, "Result has already been consumed");
                i(r10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        boolean z10 = true;
        if (!this.f33500m && !((Boolean) f33487n.get()).booleanValue()) {
            z10 = false;
        }
        this.f33500m = z10;
    }

    protected BasePendingResult(com.google.android.gms.common.api.c cVar) {
        this.f33488a = new Object();
        this.f33491d = new CountDownLatch(1);
        this.f33492e = new ArrayList();
        this.f33494g = new AtomicReference();
        this.f33500m = false;
        this.f33489b = new a(cVar != null ? cVar.b() : Looper.getMainLooper());
        this.f33490c = new WeakReference(cVar);
    }
}
