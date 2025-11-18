package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcsf implements zzdti<zzcsd> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25016a;

    /* renamed from: b */
    private final zzdtu<Context> f25017b;

    private zzcsf(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.f25016a = zzdtuVar;
        this.f25017b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcsf m18965a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        return new zzcsf(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsd(this.f25016a.get(), this.f25017b.get());
    }
}
