package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcnh implements zzdti<zzcnd> {

    /* renamed from: a */
    private final zzdtu<Context> f24766a;

    /* renamed from: b */
    private final zzdtu<zzcdf> f24767b;

    public zzcnh(zzdtu<Context> zzdtuVar, zzdtu<zzcdf> zzdtuVar2) {
        this.f24766a = zzdtuVar;
        this.f24767b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcnd(this.f24766a.get(), this.f24767b.get());
    }
}
