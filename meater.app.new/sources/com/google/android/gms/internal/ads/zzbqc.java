package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqc implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzbpx f23471a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23472b;

    private zzbqc(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23471a = zzbpxVar;
        this.f23472b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqc m18255a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqc(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23472b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
