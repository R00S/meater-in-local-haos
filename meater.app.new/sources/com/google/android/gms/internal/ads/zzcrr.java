package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcrr implements zzdti<zzcrp> {

    /* renamed from: a */
    private final zzdtu<zzcsk<zzcvf>> f24987a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f24988b;

    /* renamed from: c */
    private final zzdtu<Context> f24989c;

    /* renamed from: d */
    private final zzdtu<zzawm> f24990d;

    private zzcrr(zzdtu<zzcsk<zzcvf>> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<zzawm> zzdtuVar4) {
        this.f24987a = zzdtuVar;
        this.f24988b = zzdtuVar2;
        this.f24989c = zzdtuVar3;
        this.f24990d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzcrr m18959a(zzdtu<zzcsk<zzcvf>> zzdtuVar, zzdtu<zzcxv> zzdtuVar2, zzdtu<Context> zzdtuVar3, zzdtu<zzawm> zzdtuVar4) {
        return new zzcrr(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrp(this.f24987a.get(), this.f24988b.get(), this.f24989c.get(), this.f24990d.get());
    }
}
