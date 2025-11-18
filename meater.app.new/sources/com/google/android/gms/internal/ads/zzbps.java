package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbps implements zzdti<zzcxm> {

    /* renamed from: a */
    private final zzbpr f23457a;

    private zzbps(zzbpr zzbprVar) {
        this.f23457a = zzbprVar;
    }

    /* renamed from: a */
    public static zzbps m18243a(zzbpr zzbprVar) {
        return new zzbps(zzbprVar);
    }

    /* renamed from: b */
    public static zzcxm m18244b(zzbpr zzbprVar) {
        return (zzcxm) zzdto.m19874b(zzbprVar.m18241b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18244b(this.f23457a);
    }
}
