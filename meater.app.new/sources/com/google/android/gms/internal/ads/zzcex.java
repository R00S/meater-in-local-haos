package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcex implements zzczz {

    /* renamed from: f */
    private Map<zzczs, zzcez> f24196f;

    /* renamed from: g */
    private zzwj f24197g;

    zzcex(zzwj zzwjVar, Map<zzczs, zzcez> map) {
        this.f24196f = map;
        this.f24197g = zzwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: b */
    public final void mo18713b(zzczs zzczsVar, String str, Throwable th) {
        if (this.f24196f.containsKey(zzczsVar)) {
            this.f24197g.m20698b(this.f24196f.get(zzczsVar).f24200c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: c */
    public final void mo18714c(zzczs zzczsVar, String str) {
        if (this.f24196f.containsKey(zzczsVar)) {
            this.f24197g.m20698b(this.f24196f.get(zzczsVar).f24199b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: d */
    public final void mo18715d(zzczs zzczsVar, String str) {
        if (this.f24196f.containsKey(zzczsVar)) {
            this.f24197g.m20698b(this.f24196f.get(zzczsVar).f24198a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: e */
    public final void mo18716e(zzczs zzczsVar, String str) {
    }
}
