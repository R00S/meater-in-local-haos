package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcsx implements zzdti<zzcsv> {

    /* renamed from: a */
    private final zzdtu<Context> f25040a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f25041b;

    private zzcsx(zzdtu<Context> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        this.f25040a = zzdtuVar;
        this.f25041b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcsx m18969a(zzdtu<Context> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        return new zzcsx(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsv(this.f25040a.get(), this.f25041b.get());
    }
}
