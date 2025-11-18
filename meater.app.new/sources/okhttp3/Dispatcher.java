package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* compiled from: Dispatcher.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b?\u0010@J\u001d\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\u000f\u0010'\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&R*\u0010(\u001a\u00020 2\u0006\u0010(\u001a\u00020 8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010,R \u0010.\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R \u00101\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0013\u0010'\u001a\u00020$8G@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0018\u00102\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00104\u001a\u00020 2\u0006\u00104\u001a\u00020 8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010,R.\u00109\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, m32267d2 = {"Lokhttp3/Dispatcher;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "host", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "findExistingCallWithHost", "(Ljava/lang/String;)Lokhttp3/internal/connection/RealCall$AsyncCall;", HttpUrl.FRAGMENT_ENCODE_SET, "promoteAndExecute", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "Lkotlin/u;", "finished", "(Ljava/util/Deque;Ljava/lang/Object;)V", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "()V", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)V", "executed", "finished$okhttp", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Call;", "queuedCalls", "()Ljava/util/List;", "runningCalls", HttpUrl.FRAGMENT_ENCODE_SET, "queuedCallsCount", "()I", "runningCallsCount", "Ljava/util/concurrent/ExecutorService;", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "maxRequests", "I", "getMaxRequests", "setMaxRequests", "(I)V", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningSyncCalls", "runningAsyncCalls", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String host) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (C9801m.m32341a(next.getHost(), host)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (C9801m.m32341a(next2.getHost(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            C10775u c10775u = C10775u.f41439a;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i2;
        boolean z;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            C9801m.m32345e(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    C9801m.m32345e(next, "asyncCall");
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z = runningCallsCount() > 0;
            C10775u c10775u = C10775u.f41439a;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((RealCall.AsyncCall) arrayList.get(i2)).executeOn(executorService());
        }
        return z;
    }

    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m41092deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getThis$0().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getThis$0().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        C9801m.m32346f(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getThis$0().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
            C10775u c10775u = C10775u.f41439a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall call) {
        C9801m.m32346f(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        C9801m.m32343c(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        C9801m.m32346f(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C9801m.m32345e(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = Collections.unmodifiableList(C10782c0.m38609o0(arrayDeque, arrayList));
        C9801m.m32345e(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.maxRequests = i2;
            C10775u c10775u = C10775u.f41439a;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i2;
            C10775u c10775u = C10775u.f41439a;
        }
        promoteAndExecute();
    }

    public final void finished$okhttp(RealCall call) {
        C9801m.m32346f(call, "call");
        finished(this.runningSyncCalls, call);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        C9801m.m32346f(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
