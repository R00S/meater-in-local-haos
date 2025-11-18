package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcsy implements zzcuz<Bundle> {

    /* renamed from: a */
    private final int f25042a;

    /* renamed from: b */
    private final zzxz f25043b;

    public zzcsy(int i2, zzxz zzxzVar) {
        this.f25042a = i2;
        this.f25043b = zzxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        zzcxz.m19062d(bundle, "correlation_id", Integer.valueOf(this.f25042a), this.f25043b.f27402f >= 6);
    }
}
