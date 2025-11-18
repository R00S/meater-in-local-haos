package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzcjw<DelegateT, AdapterT> implements zzcjv<AdapterT> {

    /* renamed from: a */
    @VisibleForTesting
    private final zzcjv<DelegateT> f24417a;

    /* renamed from: b */
    private final zzbam<DelegateT, AdapterT> f24418b;

    public zzcjw(zzcjv<DelegateT> zzcjvVar, zzbam<DelegateT, AdapterT> zzbamVar) {
        this.f24417a = zzcjvVar;
        this.f24418b = zzbamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<AdapterT> mo18846a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return zzbar.m17367d(this.f24417a.mo18846a(zzcxuVar, zzcxmVar), this.f24418b, zzaxg.f22651a);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return this.f24417a.mo18847b(zzcxuVar, zzcxmVar);
    }
}
