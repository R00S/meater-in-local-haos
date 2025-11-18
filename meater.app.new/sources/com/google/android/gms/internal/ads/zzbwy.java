package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwy implements zzdti<zzcjv<zzbvx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f23660a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f23661b;

    /* renamed from: c */
    private final zzdtu<zzclq> f23662c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f23663d;

    public zzbwy(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzclq> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.f23660a = zzdtuVar;
        this.f23661b = zzdtuVar2;
        this.f23662c = zzdtuVar3;
        this.f23663d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.m19874b(new zzcoe(this.f23660a.get(), this.f23661b.get(), this.f23663d.get(), this.f23662c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
