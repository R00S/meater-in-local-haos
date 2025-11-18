package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbof implements zzdti<zzcjv<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<Boolean> f23346a;

    /* renamed from: b */
    private final zzdtu<zzcmo> f23347b;

    /* renamed from: c */
    private final zzdtu<zzcoe<zzbnf, zzams, zzcla>> f23348c;

    public zzbof(zzdtu<Boolean> zzdtuVar, zzdtu<zzcmo> zzdtuVar2, zzdtu<zzcoe<zzbnf, zzams, zzcla>> zzdtuVar3) {
        this.f23346a = zzdtuVar;
        this.f23347b = zzdtuVar2;
        this.f23348c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        boolean zBooleanValue = this.f23346a.get().booleanValue();
        zzcjv zzcjvVar = (zzcmo) this.f23347b.get();
        zzcjv zzcjvVar2 = (zzcoe) this.f23348c.get();
        if (!zBooleanValue) {
            zzcjvVar = zzcjvVar2;
        }
        return (zzcjv) zzdto.m19874b(zzcjvVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
