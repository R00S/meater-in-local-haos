package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@zzard
/* renamed from: com.google.android.gms.internal.ads.e7 */
/* loaded from: classes2.dex */
final class C6626e7<V> extends FutureTask<V> implements zzbbh<V> {

    /* renamed from: f */
    private final C6552c7 f18737f;

    C6626e7(Callable<V> callable) {
        super(callable);
        this.f18737f = new C6552c7();
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.f18737f.m14965b();
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    /* renamed from: k */
    public final void mo14748k(Runnable runnable, Executor executor) {
        this.f18737f.m14964a(runnable, executor);
    }

    C6626e7(Runnable runnable, V v) {
        super(runnable, v);
        this.f18737f = new C6552c7();
    }
}
