package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcug implements zzdti<zzcue> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25084a;

    /* renamed from: b */
    private final zzdtu<Bundle> f25085b;

    private zzcug(zzdtu<zzbbl> zzdtuVar, zzdtu<Bundle> zzdtuVar2) {
        this.f25084a = zzdtuVar;
        this.f25085b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcug m18985a(zzdtu<zzbbl> zzdtuVar, zzdtu<Bundle> zzdtuVar2) {
        return new zzcug(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcue(this.f25084a.get(), this.f25085b.get());
    }
}
