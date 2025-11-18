package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* loaded from: classes2.dex */
public final class zzcwz implements zzdti<ApplicationInfo> {

    /* renamed from: a */
    private final zzcwx f25217a;

    public zzcwz(zzcwx zzcwxVar) {
        this.f25217a = zzcwxVar;
    }

    /* renamed from: a */
    public static ApplicationInfo m19013a(zzcwx zzcwxVar) {
        return (ApplicationInfo) zzdto.m19874b(zzcwxVar.m19010f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m19013a(this.f25217a);
    }
}
