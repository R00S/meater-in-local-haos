package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzcze<E, V> implements zzbbh<V> {

    /* renamed from: f */
    private final E f25362f;

    /* renamed from: g */
    private final String f25363g;

    /* renamed from: h */
    private final zzbbh<V> f25364h;

    public zzcze(E e2, String str, zzbbh<V> zzbbhVar) {
        this.f25362f = e2;
        this.f25363g = str;
        this.f25364h = zzbbhVar;
    }

    /* renamed from: a */
    public final E m19092a() {
        return this.f25362f;
    }

    /* renamed from: b */
    public final String m19093b() {
        return this.f25363g;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f25364h.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.f25364h.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25364h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25364h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    /* renamed from: k */
    public final void mo14748k(Runnable runnable, Executor executor) {
        this.f25364h.mo14748k(runnable, executor);
    }

    public final String toString() {
        String str = this.f25363g;
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f25364h.get(j2, timeUnit);
    }
}
