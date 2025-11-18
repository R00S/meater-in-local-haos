package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcys implements zzdti<zzdh> {

    /* renamed from: a */
    private final zzcyo f25351a;

    /* renamed from: b */
    private final zzdtu<zzcym> f25352b;

    private zzcys(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.f25351a = zzcyoVar;
        this.f25352b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcys m19083a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcys(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzdh) zzdto.m19874b(this.f25352b.get().f25340d, "Cannot return null from a non-@Nullable @Provides method");
    }
}
