package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzblu implements zzdti<zzblt> {

    /* renamed from: a */
    private final zzdtu<zzaxb> f23202a;

    private zzblu(zzdtu<zzaxb> zzdtuVar) {
        this.f23202a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzblu m17874a(zzdtu<zzaxb> zzdtuVar) {
        return new zzblu(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzblt(this.f23202a.get());
    }
}
