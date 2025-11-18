package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbun implements zzdti<zzcmu> {

    /* renamed from: a */
    private final zzbtv f23587a;

    /* renamed from: b */
    private final zzdtu<Clock> f23588b;

    private zzbun(zzbtv zzbtvVar, zzdtu<Clock> zzdtuVar) {
        this.f23587a = zzbtvVar;
        this.f23588b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbun m18378a(zzbtv zzbtvVar, zzdtu<Clock> zzdtuVar) {
        return new zzbun(zzbtvVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcmu) zzdto.m19874b(this.f23587a.m18333a(this.f23588b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
