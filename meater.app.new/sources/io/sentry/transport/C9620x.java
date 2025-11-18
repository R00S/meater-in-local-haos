package io.sentry.transport;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: QueuedThreadPoolExecutor.java */
/* renamed from: io.sentry.transport.x */
/* loaded from: classes2.dex */
final class C9620x extends ThreadPoolExecutor {

    /* renamed from: f */
    private final int f36905f;

    /* renamed from: g */
    private final InterfaceC9670w1 f36906g;

    /* renamed from: h */
    private final C9622z f36907h;

    /* compiled from: QueuedThreadPoolExecutor.java */
    /* renamed from: io.sentry.transport.x$a */
    static final class a<T> implements Future<T> {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public C9620x(int i2, int i3, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, InterfaceC9670w1 interfaceC9670w1) {
        super(i2, i2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f36907h = new C9622z();
        this.f36905f = i3;
        this.f36906g = interfaceC9670w1;
    }

    /* renamed from: a */
    private boolean m31707a() {
        return this.f36907h.m31719b() < this.f36905f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.f36907h.m31718a();
        }
    }

    /* renamed from: b */
    void m31708b(long j2) {
        try {
            this.f36907h.m31721d(j2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            this.f36906g.mo30213b(EnumC9587s4.ERROR, "Failed to wait till idle", e2);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (m31707a()) {
            this.f36907h.m31720c();
            return super.submit(runnable);
        }
        this.f36906g.mo30214c(EnumC9587s4.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
