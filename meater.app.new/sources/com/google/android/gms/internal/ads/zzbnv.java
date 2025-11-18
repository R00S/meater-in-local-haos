package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnv implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbnk f23328a;

    /* renamed from: b */
    private final zzdtu<zzbot> f23329b;

    public zzbnv(zzbnk zzbnkVar, zzdtu<zzbot> zzdtuVar) {
        this.f23328a = zzbnkVar;
        this.f23329b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m17929a(zzbnk zzbnkVar, zzbot zzbotVar) {
        return (zzbuz) zzdto.m19874b(new zzbuz(zzbotVar, zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17929a(this.f23328a, this.f23329b.get());
    }
}
