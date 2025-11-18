package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzckz implements zzdti<zzckv> {

    /* renamed from: a */
    private final zzdtu<zzboc> f24460a;

    /* renamed from: b */
    private final zzdtu<zzckb> f24461b;

    /* renamed from: c */
    private final zzdtu<zzbrm> f24462c;

    /* renamed from: d */
    private final zzdtu<ScheduledExecutorService> f24463d;

    /* renamed from: e */
    private final zzdtu<zzbbl> f24464e;

    public zzckz(zzdtu<zzboc> zzdtuVar, zzdtu<zzckb> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<ScheduledExecutorService> zzdtuVar4, zzdtu<zzbbl> zzdtuVar5) {
        this.f24460a = zzdtuVar;
        this.f24461b = zzdtuVar2;
        this.f24462c = zzdtuVar3;
        this.f24463d = zzdtuVar4;
        this.f24464e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckv(this.f24460a.get(), this.f24461b.get(), this.f24462c.get(), this.f24463d.get(), this.f24464e.get());
    }
}
