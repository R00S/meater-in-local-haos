package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcwe implements zzdti<zzcwc> {

    /* renamed from: a */
    private final zzdtu<zzvx> f25183a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f25184b;

    /* renamed from: c */
    private final zzdtu<Context> f25185c;

    public zzcwe(zzdtu<zzvx> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.f25183a = zzdtuVar;
        this.f25184b = zzdtuVar2;
        this.f25185c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwc(this.f25183a.get(), this.f25184b.get(), this.f25185c.get());
    }
}
