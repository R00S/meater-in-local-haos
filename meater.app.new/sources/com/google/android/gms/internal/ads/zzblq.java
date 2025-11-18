package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblq implements zzbal<zzcxu, zzcxu> {

    /* renamed from: a */
    private Map<String, zzbls> f23199a;

    public zzblq(Map<String, zzbls> map) {
        this.f23199a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh<zzcxu> zzf(zzcxu zzcxuVar) throws Exception {
        zzcxu zzcxuVar2 = zzcxuVar;
        for (zzcxt zzcxtVar : zzcxuVar2.f25289b.f25285c) {
            if (this.f23199a.containsKey(zzcxtVar.f25286a)) {
                this.f23199a.get(zzcxtVar.f25286a).mo17873a(zzcxtVar.f25287b);
            }
        }
        return zzbar.m17378o(zzcxuVar2);
    }
}
