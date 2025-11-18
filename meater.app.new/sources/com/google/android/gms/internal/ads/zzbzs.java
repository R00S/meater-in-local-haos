package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbzs implements zzdti<zzbzq> {

    /* renamed from: a */
    private final zzdtu<zzccj> f23910a;

    /* renamed from: b */
    private final zzdtu<Clock> f23911b;

    public zzbzs(zzdtu<zzccj> zzdtuVar, zzdtu<Clock> zzdtuVar2) {
        this.f23910a = zzdtuVar;
        this.f23911b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbzq(this.f23910a.get(), this.f23911b.get());
    }
}
