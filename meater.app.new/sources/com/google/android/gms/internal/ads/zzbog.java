package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbog implements zzdti<zzbbh<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f23349a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f23350b;

    /* renamed from: c */
    private final zzdtu<zzblq> f23351c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzbnf>> f23352d;

    public zzbog(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<zzcxu>> zzdtuVar2, zzdtu<zzblq> zzdtuVar3, zzdtu<zzcmx<zzbnf>> zzdtuVar4) {
        this.f23349a = zzdtuVar;
        this.f23350b = zzdtuVar2;
        this.f23351c = zzdtuVar3;
        this.f23352d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(zzbqq.m18273a(this.f23349a.get(), this.f23350b.get(), this.f23351c.get(), this.f23352d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
