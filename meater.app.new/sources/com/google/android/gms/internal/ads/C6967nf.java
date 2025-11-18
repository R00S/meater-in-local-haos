package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nf */
/* loaded from: classes2.dex */
final class C6967nf implements zzbpe<zzbph> {

    /* renamed from: a */
    private final Map<String, zzcjv<zzbph>> f20082a;

    /* renamed from: b */
    private final Map<String, zzcjv<zzbyn>> f20083b;

    /* renamed from: c */
    private final Map<String, zzclw<zzbyn>> f20084c;

    /* renamed from: d */
    private final zzdtu<zzbpe<zzbnf>> f20085d;

    /* renamed from: e */
    private final zzbzc f20086e;

    C6967nf(Map<String, zzcjv<zzbph>> map, Map<String, zzcjv<zzbyn>> map2, Map<String, zzclw<zzbyn>> map3, zzdtu<zzbpe<zzbnf>> zzdtuVar, zzbzc zzbzcVar) {
        this.f20082a = map;
        this.f20083b = map2;
        this.f20084c = map3;
        this.f20085d = zzdtuVar;
        this.f20086e = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    /* renamed from: a */
    public final zzcjv<zzbph> mo15596a(int i2, String str) {
        zzcjv<zzbnf> zzcjvVarMo15596a;
        zzcjv<zzbph> zzcjvVar = this.f20082a.get(str);
        if (zzcjvVar != null) {
            return zzcjvVar;
        }
        if (i2 == 1) {
            if (this.f20086e.m18565d() == null || (zzcjvVarMo15596a = this.f20085d.get().mo15596a(i2, str)) == null) {
                return null;
            }
            return zzbph.m18231a(zzcjvVarMo15596a);
        }
        if (i2 != 4) {
            return null;
        }
        zzclw<zzbyn> zzclwVar = this.f20084c.get(str);
        if (zzclwVar != null) {
            return zzbph.m18232b(zzclwVar);
        }
        zzcjv<zzbyn> zzcjvVar2 = this.f20083b.get(str);
        if (zzcjvVar2 != null) {
            return zzbph.m18231a(zzcjvVar2);
        }
        return null;
    }
}
