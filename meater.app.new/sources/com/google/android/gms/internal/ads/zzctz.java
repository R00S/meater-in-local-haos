package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcuz;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzctz<S extends zzcuz> implements zzcva<S> {

    /* renamed from: a */
    private final zzcva<S> f25074a;

    /* renamed from: b */
    private final long f25075b;

    /* renamed from: c */
    private final ScheduledExecutorService f25076c;

    public zzctz(zzcva<S> zzcvaVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.f25074a = zzcvaVar;
        this.f25075b = j2;
        this.f25076c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<S> mo14982b() {
        zzbbh<S> zzbbhVarMo14982b = this.f25074a.mo14982b();
        long j2 = this.f25075b;
        if (j2 > 0) {
            zzbbhVarMo14982b = zzbar.m17365b(zzbbhVarMo14982b, j2, TimeUnit.MILLISECONDS, this.f25076c);
        }
        return zzbar.m17368e(zzbbhVarMo14982b, Throwable.class, C7087qo.f20402a, zzbbm.f22758b);
    }
}
