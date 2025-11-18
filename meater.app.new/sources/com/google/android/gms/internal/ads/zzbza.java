package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbza implements zzdti<zzbyy> {

    /* renamed from: a */
    private final zzdtu<zzcxm> f23848a;

    /* renamed from: b */
    private final zzdtu<JSONObject> f23849b;

    public zzbza(zzdtu<zzcxm> zzdtuVar, zzdtu<JSONObject> zzdtuVar2) {
        this.f23848a = zzdtuVar;
        this.f23849b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbyy(this.f23848a.get(), this.f23849b.get());
    }
}
