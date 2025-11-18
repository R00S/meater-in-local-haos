package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcsm implements zzdti<zzcsk<zzcsg>> {

    /* renamed from: a */
    private final zzdtu<zzcsh> f25028a;

    /* renamed from: b */
    private final zzdtu<Clock> f25029b;

    public zzcsm(zzdtu<zzcsh> zzdtuVar, zzdtu<Clock> zzdtuVar2) {
        this.f25028a = zzdtuVar;
        this.f25029b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcsk) zzdto.m19874b(new zzcsk(this.f25028a.get(), 10000L, this.f25029b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
