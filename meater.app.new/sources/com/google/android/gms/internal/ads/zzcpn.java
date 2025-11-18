package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcpn implements zzdti<zzcpm> {

    /* renamed from: a */
    private final zzdtu<Context> f24869a;

    /* renamed from: b */
    private final zzdtu<zzyz> f24870b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24871c;

    /* renamed from: d */
    private final zzdtu<zzbnf> f24872d;

    public zzcpn(zzdtu<Context> zzdtuVar, zzdtu<zzyz> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbnf> zzdtuVar4) {
        this.f24869a = zzdtuVar;
        this.f24870b = zzdtuVar2;
        this.f24871c = zzdtuVar3;
        this.f24872d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcpm(this.f24869a.get(), this.f24870b.get(), this.f24871c.get(), this.f24872d.get());
    }
}
