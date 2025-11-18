package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zzcyb<T> {

    /* renamed from: a */
    private final Deque<zzbbh<T>> f25321a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable<T> f25322b;

    /* renamed from: c */
    private final zzbbl f25323c;

    public zzcyb(Callable<T> callable, zzbbl zzbblVar) {
        this.f25322b = callable;
        this.f25323c = zzbblVar;
    }

    /* renamed from: a */
    public final synchronized void m19068a(zzbbh<T> zzbbhVar) {
        this.f25321a.addFirst(zzbbhVar);
    }

    /* renamed from: b */
    public final synchronized zzbbh<T> m19069b() {
        m19070c(1);
        return this.f25321a.poll();
    }

    /* renamed from: c */
    public final synchronized void m19070c(int i2) {
        int size = i2 - this.f25321a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f25321a.add(this.f25323c.mo17361y(this.f25322b));
        }
    }
}
