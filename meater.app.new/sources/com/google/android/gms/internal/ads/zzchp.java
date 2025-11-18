package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzchp implements zzdti<zzchl> {

    /* renamed from: a */
    private final zzdtu<zzbtg> f24328a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f24329b;

    /* renamed from: c */
    private final zzdtu<zzcgn> f24330c;

    /* renamed from: d */
    private final zzdtu<zzbbl> f24331d;

    /* renamed from: e */
    private final zzdtu<ScheduledExecutorService> f24332e;

    /* renamed from: f */
    private final zzdtu<zzcji> f24333f;

    private zzchp(zzdtu<zzbtg> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzcgn> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5, zzdtu<zzcji> zzdtuVar6) {
        this.f24328a = zzdtuVar;
        this.f24329b = zzdtuVar2;
        this.f24330c = zzdtuVar3;
        this.f24331d = zzdtuVar4;
        this.f24332e = zzdtuVar5;
        this.f24333f = zzdtuVar6;
    }

    /* renamed from: a */
    public static zzchp m18796a(zzdtu<zzbtg> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<zzcgn> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<ScheduledExecutorService> zzdtuVar5, zzdtu<zzcji> zzdtuVar6) {
        return new zzchp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzchl(this.f24328a.get(), this.f24329b.get(), this.f24330c.get(), this.f24331d.get(), this.f24332e.get(), this.f24333f.get());
    }
}
