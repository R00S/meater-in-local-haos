package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcjp implements zzdti<zzcjm> {

    /* renamed from: a */
    private final zzdtu<Context> f24409a;

    /* renamed from: b */
    private final zzdtu<zzbbh<Bundle>> f24410b;

    /* renamed from: c */
    private final zzdtu<zzcji> f24411c;

    /* renamed from: d */
    private final zzdtu<zzcjc> f24412d;

    private zzcjp(zzdtu<Context> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzcji> zzdtuVar3, zzdtu<zzcjc> zzdtuVar4) {
        this.f24409a = zzdtuVar;
        this.f24410b = zzdtuVar2;
        this.f24411c = zzdtuVar3;
        this.f24412d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzcjp m18841a(zzdtu<Context> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzcji> zzdtuVar3, zzdtu<zzcjc> zzdtuVar4) {
        return new zzcjp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcjm(this.f24409a.get(), this.f24410b.get(), this.f24411c.get(), this.f24412d.get());
    }
}
