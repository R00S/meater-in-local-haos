package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbxj implements zzdti<C6967nf> {

    /* renamed from: a */
    private final zzdtu<Map<String, zzcjv<zzbph>>> f23692a;

    /* renamed from: b */
    private final zzdtu<Map<String, zzcjv<zzbyn>>> f23693b;

    /* renamed from: c */
    private final zzdtu<Map<String, zzclw<zzbyn>>> f23694c;

    /* renamed from: d */
    private final zzdtu<zzbpe<zzbnf>> f23695d;

    /* renamed from: e */
    private final zzdtu<zzbzc> f23696e;

    public zzbxj(zzdtu<Map<String, zzcjv<zzbph>>> zzdtuVar, zzdtu<Map<String, zzcjv<zzbyn>>> zzdtuVar2, zzdtu<Map<String, zzclw<zzbyn>>> zzdtuVar3, zzdtu<zzbpe<zzbnf>> zzdtuVar4, zzdtu<zzbzc> zzdtuVar5) {
        this.f23692a = zzdtuVar;
        this.f23693b = zzdtuVar2;
        this.f23694c = zzdtuVar3;
        this.f23695d = zzdtuVar4;
        this.f23696e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new C6967nf(this.f23692a.get(), this.f23693b.get(), this.f23694c.get(), this.f23695d, this.f23696e.get());
    }
}
