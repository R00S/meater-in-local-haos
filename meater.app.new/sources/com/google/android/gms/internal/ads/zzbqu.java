package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqu implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzbqt f23505a;

    /* renamed from: b */
    private final zzdtu<zzbqr> f23506b;

    private zzbqu(zzbqt zzbqtVar, zzdtu<zzbqr> zzdtuVar) {
        this.f23505a = zzbqtVar;
        this.f23506b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbqu m18275a(zzbqt zzbqtVar, zzdtu<zzbqr> zzdtuVar) {
        return new zzbqu(zzbqtVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23506b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
