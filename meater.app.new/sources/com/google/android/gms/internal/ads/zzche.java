package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes2.dex */
public final class zzche implements zzdti<ApplicationInfo> {

    /* renamed from: a */
    private final zzdtu<Context> f24315a;

    private zzche(zzdtu<Context> zzdtuVar) {
        this.f24315a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzche m18786a(zzdtu<Context> zzdtuVar) {
        return new zzche(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (ApplicationInfo) zzdto.m19874b(this.f24315a.get().getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
