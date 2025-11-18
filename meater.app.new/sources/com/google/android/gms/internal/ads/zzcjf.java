package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcjf implements zzdti<zzcjc> {

    /* renamed from: a */
    private final zzdtu<zzcja> f24385a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f24386b;

    private zzcjf(zzdtu<zzcja> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        this.f24385a = zzdtuVar;
        this.f24386b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcjf m18816a(zzdtu<zzcja> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        return new zzcjf(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcjc(this.f24385a.get(), this.f24386b.get());
    }
}
