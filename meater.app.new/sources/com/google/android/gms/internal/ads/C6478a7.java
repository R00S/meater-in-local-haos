package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzard
/* renamed from: com.google.android.gms.internal.ads.a7 */
/* loaded from: classes2.dex */
final class C6478a7<T> implements zzbbh<T> {

    /* renamed from: f */
    private final Throwable f18092f;

    /* renamed from: g */
    private final C6552c7 f18093g;

    C6478a7(Throwable th) {
        this.f18092f = th;
        C6552c7 c6552c7 = new C6552c7();
        this.f18093g = c6552c7;
        c6552c7.m14965b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f18092f);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    /* renamed from: k */
    public final void mo14748k(Runnable runnable, Executor executor) {
        this.f18093g.m14964a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f18092f);
    }
}
