package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbrd implements zzdti<String> {

    /* renamed from: a */
    private final zzbqy f23523a;

    /* renamed from: b */
    private final zzdtu<zzbqe> f23524b;

    private zzbrd(zzbqy zzbqyVar, zzdtu<zzbqe> zzdtuVar) {
        this.f23523a = zzbqyVar;
        this.f23524b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbrd m18294a(zzbqy zzbqyVar, zzdtu<zzbqe> zzdtuVar) {
        return new zzbrd(zzbqyVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (String) zzdto.m19874b(this.f23524b.get().m18258c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
