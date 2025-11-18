package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcgs implements zzdti<zzcgn> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f24282a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f24283b;

    /* renamed from: c */
    private final zzdtu<zzchv> f24284c;

    /* renamed from: d */
    private final zzdtu<zzcig> f24285d;

    private zzcgs(zzdtu<zzbbl> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzchv> zzdtuVar3, zzdtu<zzcig> zzdtuVar4) {
        this.f24282a = zzdtuVar;
        this.f24283b = zzdtuVar2;
        this.f24284c = zzdtuVar3;
        this.f24285d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzcgs m18778a(zzdtu<zzbbl> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzchv> zzdtuVar3, zzdtu<zzcig> zzdtuVar4) {
        return new zzcgs(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcgn(this.f24282a.get(), this.f24283b.get(), this.f24284c.get(), zzdth.m19868b(this.f24285d));
    }
}
