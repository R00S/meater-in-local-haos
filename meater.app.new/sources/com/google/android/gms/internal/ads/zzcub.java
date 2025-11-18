package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcub implements zzcuz<Bundle>, zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final ApplicationInfo f25077a;

    /* renamed from: b */
    private final PackageInfo f25078b;

    zzcub(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f25077a = applicationInfo;
        this.f25078b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f25077a.packageName;
        PackageInfo packageInfo = this.f25078b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (numValueOf != null) {
            bundle2.putInt("vc", numValueOf.intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuz<Bundle>> mo14982b() {
        return zzbar.m17378o(this);
    }
}
