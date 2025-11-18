package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzctu implements zzdti<zzctp> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25063a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f25064b;

    /* renamed from: c */
    private final zzdtu<PackageInfo> f25065c;

    /* renamed from: d */
    private final zzdtu<zzaxb> f25066d;

    public zzctu(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<PackageInfo> zzdtuVar3, zzdtu<zzaxb> zzdtuVar4) {
        this.f25063a = zzdtuVar;
        this.f25064b = zzdtuVar2;
        this.f25065c = zzdtuVar3;
        this.f25066d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctp(this.f25063a.get(), this.f25064b.get(), this.f25065c.get(), this.f25066d.get());
    }
}
