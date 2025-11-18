package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcrn implements zzdti<zzcrk> {

    /* renamed from: a */
    private final zzdtu<zzbbh<String>> f24973a;

    /* renamed from: b */
    private final zzdtu<Executor> f24974b;

    private zzcrn(zzdtu<zzbbh<String>> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24973a = zzdtuVar;
        this.f24974b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcrn m18957a(zzdtu<zzbbh<String>> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcrn(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrk(this.f24973a.get(), this.f24974b.get());
    }
}
