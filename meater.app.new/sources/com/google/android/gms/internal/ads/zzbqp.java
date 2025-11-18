package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqp implements zzdti<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>> {

    /* renamed from: a */
    private final zzbqo f23493a;

    /* renamed from: b */
    private final zzdtu<zzbpv> f23494b;

    private zzbqp(zzbqo zzbqoVar, zzdtu<zzbpv> zzdtuVar) {
        this.f23493a = zzbqoVar;
        this.f23494b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqp m18272a(zzbqo zzbqoVar, zzdtu<zzbpv> zzdtuVar) {
        return new zzbqp(zzbqoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23494b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
