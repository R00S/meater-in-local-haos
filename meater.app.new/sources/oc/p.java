package oc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import tc.e;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010!R.\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u001e\u00103\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u001e\u00104\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0011\u00107\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b'\u00106¨\u00068"}, d2 = {"Loc/p;", "", "<init>", "()V", "", "host", "Ltc/e$a;", "Ltc/e;", "d", "(Ljava/lang/String;)Ltc/e$a;", "", "h", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "Loa/F;", "e", "(Ljava/util/Deque;Ljava/lang/Object;)V", "a", "(Ltc/e$a;)V", "b", "(Ltc/e;)V", "f", "g", "", "i", "()I", "maxRequests", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable idleCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorServiceOrNull;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests = 64;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost = 5;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<e.a> readyAsyncCalls = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<e.a> runningAsyncCalls = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<tc.e> runningSyncCalls = new ArrayDeque<>();

    private final e.a d(String host) {
        Iterator<e.a> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (C3862t.b(next.d(), host)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (C3862t.b(next2.d(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            C4153F c4153f = C4153F.f46609a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e.a> it = this.readyAsyncCalls.iterator();
                C3862t.f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a asyncCall = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        C3862t.f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.runningAsyncCalls.add(asyncCall);
                    }
                }
                z10 = i() > 0;
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(e.a call) {
        e.a aVarD;
        C3862t.g(call, "call");
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(call);
                if (!call.getF50109D().getForWebSocket() && (aVarD = d(call.d())) != null) {
                    call.e(aVarD);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(tc.e call) {
        C3862t.g(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), pc.d.N(pc.d.f47759i + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            C3862t.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(e.a call) {
        C3862t.g(call, "call");
        call.getCallsPerHost().decrementAndGet();
        e(this.runningAsyncCalls, call);
    }

    public final void g(tc.e call) {
        C3862t.g(call, "call");
        e(this.runningSyncCalls, call);
    }

    public final synchronized int i() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }
}
