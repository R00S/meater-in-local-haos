package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwu implements zzdti<zzbbh<zzbvx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f23653a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f23654b;

    /* renamed from: c */
    private final zzdtu<zzblq> f23655c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzbvx>> f23656d;

    public zzbwu(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbvx>> zzdtuVar4) {
        this.f23653a = zzdtuVar;
        this.f23654b = zzdtuVar2;
        this.f23655c = zzdtuVar3;
        this.f23656d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(zzbqq.m18273a(this.f23653a.get(), this.f23654b.get(), this.f23655c.get(), this.f23656d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
