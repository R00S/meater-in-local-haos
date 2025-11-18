package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzckq implements zzdti<zzckm> {

    /* renamed from: a */
    private final zzdtu<Context> f24445a;

    /* renamed from: b */
    private final zzdtu<zzboc> f24446b;

    public zzckq(zzdtu<Context> zzdtuVar, zzdtu<zzboc> zzdtuVar2) {
        this.f24445a = zzdtuVar;
        this.f24446b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckm(this.f24445a.get(), this.f24446b.get());
    }
}
