package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzchi implements zzdti<zzchv> {

    /* renamed from: a */
    private final zzdtu<Context> f24320a;

    private zzchi(zzdtu<Context> zzdtuVar) {
        this.f24320a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzchi m18790a(zzdtu<Context> zzdtuVar) {
        return new zzchi(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzchv) zzdto.m19874b(new zzchv(this.f24320a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
