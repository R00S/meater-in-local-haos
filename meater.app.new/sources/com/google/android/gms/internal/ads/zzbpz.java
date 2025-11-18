package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpz implements zzdti<zzbuz<zzbrl>> {

    /* renamed from: a */
    private final zzbpx f23465a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23466b;

    private zzbpz(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23465a = zzbpxVar;
        this.f23466b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbpz m18252a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbpz(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23466b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
