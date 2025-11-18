package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzctg implements zzcuz<Bundle> {

    /* renamed from: a */
    private final Bundle f25051a;

    public zzctg(Bundle bundle) {
        this.f25051a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleM19059a = zzcxz.m19059a(bundle2, "device");
        bundleM19059a.putBundle("android_mem_info", this.f25051a);
        bundle2.putBundle("device", bundleM19059a);
    }
}
