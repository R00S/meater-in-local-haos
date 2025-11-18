package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzcuc implements zzdti<zzcub> {

    /* renamed from: a */
    private final zzdtu<ApplicationInfo> f25079a;

    /* renamed from: b */
    private final zzdtu<PackageInfo> f25080b;

    private zzcuc(zzdtu<ApplicationInfo> zzdtuVar, zzdtu<PackageInfo> zzdtuVar2) {
        this.f25079a = zzdtuVar;
        this.f25080b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcuc m18983a(zzdtu<ApplicationInfo> zzdtuVar, zzdtu<PackageInfo> zzdtuVar2) {
        return new zzcuc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcub(this.f25079a.get(), this.f25080b.get());
    }
}
