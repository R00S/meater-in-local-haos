package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzblg implements zzdti<zzbah> {

    /* renamed from: a */
    private final zzdtu<String> f23190a;

    private zzblg(zzdtu<String> zzdtuVar) {
        this.f23190a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzblg m17859a(zzdtu<String> zzdtuVar) {
        return new zzblg(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbah) zzdto.m19874b(new zzbah(this.f23190a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
