package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbma implements zzdti<zzblz> {

    /* renamed from: a */
    private final zzdtu<Context> f23216a;

    private zzbma(zzdtu<Context> zzdtuVar) {
        this.f23216a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbma m17880a(zzdtu<Context> zzdtuVar) {
        return new zzbma(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzblz(this.f23216a.get());
    }
}
