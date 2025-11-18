package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxs implements zzdti<zzbbh<zzbph>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f23703a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f23704b;

    /* renamed from: c */
    private final zzdtu<zzblq> f23705c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzbph>> f23706d;

    public zzbxs(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbph>> zzdtuVar4) {
        this.f23703a = zzdtuVar;
        this.f23704b = zzdtuVar2;
        this.f23705c = zzdtuVar3;
        this.f23706d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(zzbqq.m18273a(this.f23703a.get(), this.f23704b.get(), this.f23705c.get(), this.f23706d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
