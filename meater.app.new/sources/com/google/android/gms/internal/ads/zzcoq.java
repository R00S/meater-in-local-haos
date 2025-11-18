package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcoq implements zzdti<zzcok> {

    /* renamed from: a */
    private final zzdtu<Context> f24827a;

    /* renamed from: b */
    private final zzdtu<zzboc> f24828b;

    /* renamed from: c */
    private final zzdtu<zzczt> f24829c;

    /* renamed from: d */
    private final zzdtu<zzbbl> f24830d;

    /* renamed from: e */
    private final zzdtu<zzado> f24831e;

    public zzcoq(zzdtu<Context> zzdtuVar, zzdtu<zzboc> zzdtuVar2, zzdtu<zzczt> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4, zzdtu<zzado> zzdtuVar5) {
        this.f24827a = zzdtuVar;
        this.f24828b = zzdtuVar2;
        this.f24829c = zzdtuVar3;
        this.f24830d = zzdtuVar4;
        this.f24831e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcok(this.f24827a.get(), this.f24828b.get(), this.f24829c.get(), this.f24830d.get(), this.f24831e.get());
    }
}
