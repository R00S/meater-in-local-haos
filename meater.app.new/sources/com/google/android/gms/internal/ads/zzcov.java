package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcov<AdT> implements zzdti<zzcor<AdT>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24836a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f24837b;

    /* renamed from: c */
    private final zzdtu<zzado> f24838c;

    /* renamed from: d */
    private final zzdtu<zzcou<AdT>> f24839d;

    public zzcov(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzado> zzdtuVar3, zzdtu<zzcou<AdT>> zzdtuVar4) {
        this.f24836a = zzdtuVar;
        this.f24837b = zzdtuVar2;
        this.f24838c = zzdtuVar3;
        this.f24839d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcor(this.f24836a.get(), this.f24837b.get(), this.f24838c.get(), this.f24839d.get());
    }
}
