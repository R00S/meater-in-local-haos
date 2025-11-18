package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqn implements zzdti<com.google.android.gms.ads.internal.zzb> {

    /* renamed from: a */
    private final zzbqm f23490a;

    /* renamed from: b */
    private final zzdtu<Context> f23491b;

    /* renamed from: c */
    private final zzdtu<zzavb> f23492c;

    private zzbqn(zzbqm zzbqmVar, zzdtu<Context> zzdtuVar, zzdtu<zzavb> zzdtuVar2) {
        this.f23490a = zzbqmVar;
        this.f23491b = zzdtuVar;
        this.f23492c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbqn m18271a(zzbqm zzbqmVar, zzdtu<Context> zzdtuVar, zzdtu<zzavb> zzdtuVar2) {
        return new zzbqn(zzbqmVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zzb) zzdto.m19874b(new com.google.android.gms.ads.internal.zzb(this.f23491b.get(), this.f23492c.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
