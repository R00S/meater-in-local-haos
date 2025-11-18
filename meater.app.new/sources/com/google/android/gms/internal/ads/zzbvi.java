package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbvi implements zzdti<zzbvh> {

    /* renamed from: a */
    private final zzdtu<zzcxm> f23605a;

    /* renamed from: b */
    private final zzdtu<zzdae> f23606b;

    private zzbvi(zzdtu<zzcxm> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        this.f23605a = zzdtuVar;
        this.f23606b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbvi m18394a(zzdtu<zzcxm> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        return new zzbvi(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbvh(this.f23605a.get(), this.f23606b.get());
    }
}
