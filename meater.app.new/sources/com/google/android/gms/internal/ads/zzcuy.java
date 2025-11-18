package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcuy implements zzdti<zzcuw> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25123a;

    /* renamed from: b */
    private final zzdtu<Context> f25124b;

    /* renamed from: c */
    private final zzdtu<zzbai> f25125c;

    private zzcuy(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbai> zzdtuVar3) {
        this.f25123a = zzdtuVar;
        this.f25124b = zzdtuVar2;
        this.f25125c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcuy m18996a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbai> zzdtuVar3) {
        return new zzcuy(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcuw(this.f25123a.get(), this.f25124b.get(), this.f25125c.get());
    }
}
