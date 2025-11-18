package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcsj implements zzdti<zzcsh> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25022a;

    /* renamed from: b */
    private final zzdtu<Context> f25023b;

    public zzcsj(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.f25022a = zzdtuVar;
        this.f25023b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsh(this.f25022a.get(), this.f25023b.get());
    }
}
