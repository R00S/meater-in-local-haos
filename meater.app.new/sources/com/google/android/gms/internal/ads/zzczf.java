package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzczf<E> {

    /* renamed from: a */
    private static final zzbbh<?> f25365a = zzbar.m17378o(null);

    /* renamed from: b */
    private final zzbbl f25366b;

    /* renamed from: c */
    private final ScheduledExecutorService f25367c;

    /* renamed from: d */
    private final zzczr<E> f25368d;

    public zzczf(zzbbl zzbblVar, ScheduledExecutorService scheduledExecutorService, zzczr<E> zzczrVar) {
        this.f25366b = zzbblVar;
        this.f25367c = scheduledExecutorService;
        this.f25368d = zzczrVar;
    }

    /* renamed from: b */
    public final zzczh m19098b(E e2, zzbbh<?>... zzbbhVarArr) {
        return new zzczh(this, e2, Arrays.asList(zzbbhVarArr));
    }

    /* renamed from: c */
    public final <I> zzczl<I> m19099c(E e2, zzbbh<I> zzbbhVar) {
        return new zzczl<>(this, e2, zzbbhVar, Collections.singletonList(zzbbhVar), zzbbhVar);
    }

    /* renamed from: g */
    public final zzczj m19100g(E e2) {
        return new zzczj(this, e2);
    }

    /* renamed from: h */
    protected abstract String mo19101h(E e2);
}
