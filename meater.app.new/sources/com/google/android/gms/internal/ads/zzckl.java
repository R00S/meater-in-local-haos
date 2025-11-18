package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzckl implements zzdti<zzckj> {

    /* renamed from: a */
    private final zzdtu<Context> f24439a;

    /* renamed from: b */
    private final zzdtu<zzbai> f24440b;

    /* renamed from: c */
    private final zzdtu<zzboc> f24441c;

    public zzckl(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzboc> zzdtuVar3) {
        this.f24439a = zzdtuVar;
        this.f24440b = zzdtuVar2;
        this.f24441c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzckj(this.f24439a.get(), this.f24440b.get(), this.f24441c.get());
    }
}
