package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbmm implements zzdti<zzbml> {

    /* renamed from: a */
    private final zzdtu<Context> f23239a;

    /* renamed from: b */
    private final zzdtu<zzty> f23240b;

    private zzbmm(zzdtu<Context> zzdtuVar, zzdtu<zzty> zzdtuVar2) {
        this.f23239a = zzdtuVar;
        this.f23240b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbmm m17893a(zzdtu<Context> zzdtuVar, zzdtu<zzty> zzdtuVar2) {
        return new zzbmm(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbml(this.f23239a.get(), this.f23240b.get());
    }
}
