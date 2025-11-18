package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbpq implements zzdti<zzbpk> {

    /* renamed from: a */
    private final zzdtu<Executor> f23451a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f23452b;

    /* renamed from: c */
    private final zzdtu<zzbbh<zzbph>> f23453c;

    public zzbpq(zzdtu<Executor> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<zzbbh<zzbph>> zzdtuVar3) {
        this.f23451a = zzdtuVar;
        this.f23452b = zzdtuVar2;
        this.f23453c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbpk(this.f23451a.get(), this.f23452b.get(), this.f23453c.get());
    }
}
