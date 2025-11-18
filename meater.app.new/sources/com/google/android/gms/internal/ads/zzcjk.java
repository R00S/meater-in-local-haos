package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcjk implements zzczz {

    /* renamed from: f */
    private final zzcji f24400f;

    zzcjk(zzcji zzcjiVar) {
        this.f24400f = zzcjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: b */
    public final void mo18713b(zzczs zzczsVar, String str, Throwable th) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue() && zzczs.RENDERER == zzczsVar && this.f24400f.m18822c() != 0) {
            this.f24400f.m18826g(zzk.zzln().mo14609b() - this.f24400f.m18822c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: c */
    public final void mo18714c(zzczs zzczsVar, String str) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue() && zzczs.RENDERER == zzczsVar && this.f24400f.m18822c() != 0) {
            this.f24400f.m18826g(zzk.zzln().mo14609b() - this.f24400f.m18822c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: d */
    public final void mo18715d(zzczs zzczsVar, String str) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue() && zzczs.RENDERER == zzczsVar) {
            this.f24400f.m18827h(zzk.zzln().mo14609b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: e */
    public final void mo18716e(zzczs zzczsVar, String str) {
    }
}
