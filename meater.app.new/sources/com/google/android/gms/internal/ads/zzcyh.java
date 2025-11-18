package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyh implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzcyg f25325a;

    /* renamed from: b */
    private final zzdtu<zzcyi> f25326b;

    private zzcyh(zzcyg zzcygVar, zzdtu<zzcyi> zzdtuVar) {
        this.f25325a = zzcygVar;
        this.f25326b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcyh m19074a(zzcyg zzcygVar, zzdtu<zzcyi> zzdtuVar) {
        return new zzcyh(zzcygVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f25326b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
