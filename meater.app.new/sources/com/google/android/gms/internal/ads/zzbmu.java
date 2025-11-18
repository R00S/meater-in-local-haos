package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbmu implements zzdti<zzaly> {

    /* renamed from: a */
    private final zzdtu<zzalr> f23272a;

    private zzbmu(zzdtu<zzalr> zzdtuVar) {
        this.f23272a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbmu m17903a(zzdtu<zzalr> zzdtuVar) {
        return new zzbmu(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzaly) zzdto.m19874b(this.f23272a.get().m16659b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
