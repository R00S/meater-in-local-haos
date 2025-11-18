package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzchg implements zzdti<PackageInfo> {

    /* renamed from: a */
    private final zzdtu<Context> f24317a;

    /* renamed from: b */
    private final zzdtu<ApplicationInfo> f24318b;

    private zzchg(zzdtu<Context> zzdtuVar, zzdtu<ApplicationInfo> zzdtuVar2) {
        this.f24317a = zzdtuVar;
        this.f24318b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzchg m18788a(zzdtu<Context> zzdtuVar, zzdtu<ApplicationInfo> zzdtuVar2) {
        return new zzchg(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return zzcgt.m18779a(this.f24317a.get(), this.f24318b.get());
    }
}
