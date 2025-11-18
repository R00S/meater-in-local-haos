package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdh implements zzdti<zzcjv<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzcoe<zzcdb, zzams, zzclb>> f24105a;

    /* renamed from: b */
    private final zzdtu<zzcoe<zzcdb, zzams, zzcla>> f24106b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24107c;

    public zzcdh(zzdtu<zzcoe<zzcdb, zzams, zzclb>> zzdtuVar, zzdtu<zzcoe<zzcdb, zzams, zzcla>> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        this.f24105a = zzdtuVar;
        this.f24106b = zzdtuVar2;
        this.f24107c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.m19874b(this.f24107c.get().f25304o.contains("new_rewarded") ? this.f24106b.get() : this.f24105a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
