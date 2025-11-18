package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcmf implements zzdti<zzcme> {

    /* renamed from: a */
    private final zzdtu<Context> f24699a;

    /* renamed from: b */
    private final zzdtu<zzbxo> f24700b;

    public zzcmf(zzdtu<Context> zzdtuVar, zzdtu<zzbxo> zzdtuVar2) {
        this.f24699a = zzdtuVar;
        this.f24700b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcme(this.f24699a.get(), this.f24700b.get());
    }
}
