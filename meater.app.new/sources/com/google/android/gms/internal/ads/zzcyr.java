package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyr implements zzdti<Context> {

    /* renamed from: a */
    private final zzcyo f25349a;

    /* renamed from: b */
    private final zzdtu<zzcym> f25350b;

    private zzcyr(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.f25349a = zzcyoVar;
        this.f25350b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcyr m19082a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyr(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Context) zzdto.m19874b(this.f25350b.get().f25337a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
