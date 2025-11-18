package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcdi implements zzdti<zzbbh<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24108a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f24109b;

    /* renamed from: c */
    private final zzdtu<zzblq> f24110c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzcdb>> f24111d;

    public zzcdi(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzcdb>> zzdtuVar4) {
        this.f24108a = zzdtuVar;
        this.f24109b = zzdtuVar2;
        this.f24110c = zzdtuVar3;
        this.f24111d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(zzbqq.m18273a(this.f24108a.get(), this.f24109b.get(), this.f24110c.get(), this.f24111d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
