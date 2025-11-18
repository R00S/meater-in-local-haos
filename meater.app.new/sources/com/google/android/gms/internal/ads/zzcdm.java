package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdm implements zzdti<zzcjv<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24115a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f24116b;

    /* renamed from: c */
    private final zzdtu<zzcnd> f24117c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f24118d;

    public zzcdm(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcnd> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.f24115a = zzdtuVar;
        this.f24116b = zzdtuVar2;
        this.f24117c = zzdtuVar3;
        this.f24118d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.m19874b(new zzcoe(this.f24115a.get(), this.f24116b.get(), this.f24118d.get(), this.f24117c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
