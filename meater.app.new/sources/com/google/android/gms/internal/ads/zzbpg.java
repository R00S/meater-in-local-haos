package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbpg<AdT> implements zzdti<zzbpf<AdT>> {

    /* renamed from: a */
    private final zzdtu<Map<String, zzcjv<AdT>>> f23445a;

    private zzbpg(zzdtu<Map<String, zzcjv<AdT>>> zzdtuVar) {
        this.f23445a = zzdtuVar;
    }

    /* renamed from: a */
    public static <AdT> zzbpg<AdT> m18230a(zzdtu<Map<String, zzcjv<AdT>>> zzdtuVar) {
        return new zzbpg<>(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbpf(this.f23445a.get());
    }
}
