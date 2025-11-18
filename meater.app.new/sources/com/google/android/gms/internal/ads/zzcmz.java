package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcmz<AdT> implements zzdti<zzcmx<AdT>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24751a;

    /* renamed from: b */
    private final zzdtu<zzcmu> f24752b;

    /* renamed from: c */
    private final zzdtu<zzbrm> f24753c;

    /* renamed from: d */
    private final zzdtu<zzdae> f24754d;

    /* renamed from: e */
    private final zzdtu<zzbpe<AdT>> f24755e;

    /* renamed from: f */
    private final zzdtu<Executor> f24756f;

    /* renamed from: g */
    private final zzdtu<ScheduledExecutorService> f24757g;

    private zzcmz(zzdtu<zzczt> zzdtuVar, zzdtu<zzcmu> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<zzdae> zzdtuVar4, zzdtu<zzbpe<AdT>> zzdtuVar5, zzdtu<Executor> zzdtuVar6, zzdtu<ScheduledExecutorService> zzdtuVar7) {
        this.f24751a = zzdtuVar;
        this.f24752b = zzdtuVar2;
        this.f24753c = zzdtuVar3;
        this.f24754d = zzdtuVar4;
        this.f24755e = zzdtuVar5;
        this.f24756f = zzdtuVar6;
        this.f24757g = zzdtuVar7;
    }

    /* renamed from: a */
    public static <AdT> zzcmz<AdT> m18887a(zzdtu<zzczt> zzdtuVar, zzdtu<zzcmu> zzdtuVar2, zzdtu<zzbrm> zzdtuVar3, zzdtu<zzdae> zzdtuVar4, zzdtu<zzbpe<AdT>> zzdtuVar5, zzdtu<Executor> zzdtuVar6, zzdtu<ScheduledExecutorService> zzdtuVar7) {
        return new zzcmz<>(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcmx(this.f24751a.get(), this.f24752b.get(), this.f24753c.get(), this.f24754d.get(), this.f24755e.get(), this.f24756f.get(), this.f24757g.get());
    }
}
