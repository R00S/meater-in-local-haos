package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbmf implements zzdti<zzbme> {

    /* renamed from: a */
    private final zzdtu<zzcxu> f23227a;

    /* renamed from: b */
    private final zzdtu<zzcxm> f23228b;

    /* renamed from: c */
    private final zzdtu<zzdae> f23229c;

    private zzbmf(zzdtu<zzcxu> zzdtuVar, zzdtu<zzcxm> zzdtuVar2, zzdtu<zzdae> zzdtuVar3) {
        this.f23227a = zzdtuVar;
        this.f23228b = zzdtuVar2;
        this.f23229c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbmf m17883a(zzdtu<zzcxu> zzdtuVar, zzdtu<zzcxm> zzdtuVar2, zzdtu<zzdae> zzdtuVar3) {
        return new zzbmf(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbme(this.f23227a.get(), this.f23228b.get(), this.f23229c.get());
    }
}
