package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqx implements zzdti<zzbtb> {

    /* renamed from: a */
    private final zzdtu<zzbtb> f23510a;

    private zzbqx(zzdtu<zzbtb> zzdtuVar) {
        this.f23510a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqx m18276a(zzdtu<zzbtb> zzdtuVar) {
        return new zzbqx(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbtb) zzdto.m19874b(this.f23510a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
