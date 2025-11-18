package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.flurry.sdk.b1 */
/* loaded from: classes2.dex */
public final class C6003b1<V> extends FutureTask<V> {

    /* renamed from: f */
    private final WeakReference<Callable<V>> f15677f;

    /* renamed from: g */
    private final WeakReference<Runnable> f15678g;

    public C6003b1(Runnable runnable, V v) {
        super(runnable, v);
        this.f15677f = new WeakReference<>(null);
        this.f15678g = new WeakReference<>(runnable);
    }

    /* renamed from: a */
    public final Runnable m12966a() {
        return this.f15678g.get();
    }
}
