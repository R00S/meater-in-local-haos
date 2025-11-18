package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpy implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzbpx f23463a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23464b;

    private zzbpy(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23463a = zzbpxVar;
        this.f23464b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbpy m18251a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbpy(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23464b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
