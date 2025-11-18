package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuu implements zzdti<zzcus> {

    /* renamed from: a */
    private final zzdtu<zzavg> f25111a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f25112b;

    /* renamed from: c */
    private final zzdtu<Context> f25113c;

    private zzcuu(zzdtu<zzavg> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.f25111a = zzdtuVar;
        this.f25112b = zzdtuVar2;
        this.f25113c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcuu m18994a(zzdtu<zzavg> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        return new zzcuu(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcus(this.f25111a.get(), this.f25112b.get(), this.f25113c.get());
    }
}
