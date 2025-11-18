package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqa implements zzdti<zzbuz<zzbrw>> {

    /* renamed from: a */
    private final zzbpx f23467a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23468b;

    private zzbqa(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23467a = zzbpxVar;
        this.f23468b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqa m18253a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqa(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23468b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
