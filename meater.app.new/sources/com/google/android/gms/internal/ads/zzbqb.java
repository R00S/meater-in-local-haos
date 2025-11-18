package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqb implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbpx f23469a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23470b;

    private zzbqb(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23469a = zzbpxVar;
        this.f23470b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqb m18254a(zzbpx zzbpxVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbqb(zzbpxVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23470b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
