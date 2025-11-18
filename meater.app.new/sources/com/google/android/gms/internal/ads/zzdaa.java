package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdaa implements zzdti<zzczt> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25414a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f25415b;

    /* renamed from: c */
    private final zzdtu<C6904lq> f25416c;

    private zzdaa(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<C6904lq> zzdtuVar3) {
        this.f25414a = zzdtuVar;
        this.f25415b = zzdtuVar2;
        this.f25416c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzdaa m19128a(zzdtu<zzbbl> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<C6904lq> zzdtuVar3) {
        return new zzdaa(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzczt(this.f25414a.get(), this.f25415b.get(), this.f25416c.get());
    }
}
