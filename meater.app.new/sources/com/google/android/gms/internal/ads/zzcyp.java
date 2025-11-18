package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyp implements zzdti<zzaxb> {

    /* renamed from: a */
    private final zzcyo f25344a;

    /* renamed from: b */
    private final zzdtu<zzcym> f25345b;

    private zzcyp(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.f25344a = zzcyoVar;
        this.f25345b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcyp m19080a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyp(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzaxb) zzdto.m19874b(this.f25345b.get().f25338b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
