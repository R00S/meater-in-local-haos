package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbpf<AdT> implements zzbpe<AdT> {

    /* renamed from: a */
    private final Map<String, zzcjv<AdT>> f23444a;

    zzbpf(Map<String, zzcjv<AdT>> map) {
        this.f23444a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    /* renamed from: a */
    public final zzcjv<AdT> mo15596a(int i2, String str) {
        return this.f23444a.get(str);
    }
}
