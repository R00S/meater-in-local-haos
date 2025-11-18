package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.h7 */
/* loaded from: classes2.dex */
final class C6737h7 extends zzbak {

    /* renamed from: f */
    private final Executor f19064f;

    private C6737h7(Executor executor) {
        this.f19064f = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19064f.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C6737h7(Executor executor, ExecutorC6663f7 executorC6663f7) {
        this(executor);
    }
}
