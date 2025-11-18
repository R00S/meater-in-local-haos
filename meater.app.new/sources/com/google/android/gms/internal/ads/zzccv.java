package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzccv implements zzdti<zzccj> {

    /* renamed from: a */
    private final zzdtu<Context> f24082a;

    /* renamed from: b */
    private final zzdtu<Executor> f24083b;

    /* renamed from: c */
    private final zzdtu<zzdh> f24084c;

    /* renamed from: d */
    private final zzdtu<zzbai> f24085d;

    /* renamed from: e */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f24086e;

    /* renamed from: f */
    private final zzdtu<zzbhf> f24087f;

    public zzccv(zzdtu<Context> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<zzdh> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar5, zzdtu<zzbhf> zzdtuVar6) {
        this.f24082a = zzdtuVar;
        this.f24083b = zzdtuVar2;
        this.f24084c = zzdtuVar3;
        this.f24085d = zzdtuVar4;
        this.f24086e = zzdtuVar5;
        this.f24087f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccj(this.f24082a.get(), this.f24083b.get(), this.f24084c.get(), this.f24085d.get(), this.f24086e.get(), this.f24087f.get());
    }
}
