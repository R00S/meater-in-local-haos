package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@zzard
/* renamed from: com.google.android.gms.internal.ads.b7 */
/* loaded from: classes2.dex */
public final class C6515b7<T> implements zzbbh<T> {

    /* renamed from: f */
    private final T f18254f;

    /* renamed from: g */
    private final C6552c7 f18255g;

    C6515b7(T t) {
        this.f18254f = t;
        C6552c7 c6552c7 = new C6552c7();
        this.f18255g = c6552c7;
        c6552c7.m14965b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f18254f;
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
        this.f18255g.m14964a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) {
        return this.f18254f;
    }
}
