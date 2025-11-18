package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzchh implements zzdti<String> {

    /* renamed from: a */
    private final zzdtu<Context> f24319a;

    private zzchh(zzdtu<Context> zzdtuVar) {
        this.f24319a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzchh m18789a(zzdtu<Context> zzdtuVar) {
        return new zzchh(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (String) zzdto.m19874b(this.f24319a.get().getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
