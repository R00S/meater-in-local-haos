package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcaa implements zzdti<zzbzt> {

    /* renamed from: a */
    private final zzdtu<Context> f23925a;

    /* renamed from: b */
    private final zzdtu<zzcdn> f23926b;

    /* renamed from: c */
    private final zzdtu<zzccj> f23927c;

    /* renamed from: d */
    private final zzdtu<zzbmy> f23928d;

    /* renamed from: e */
    private final zzdtu<zzbzb> f23929e;

    public zzcaa(zzdtu<Context> zzdtuVar, zzdtu<zzcdn> zzdtuVar2, zzdtu<zzccj> zzdtuVar3, zzdtu<zzbmy> zzdtuVar4, zzdtu<zzbzb> zzdtuVar5) {
        this.f23925a = zzdtuVar;
        this.f23926b = zzdtuVar2;
        this.f23927c = zzdtuVar3;
        this.f23928d = zzdtuVar4;
        this.f23929e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbzt(this.f23925a.get(), this.f23926b.get(), this.f23927c.get(), this.f23928d.get(), this.f23929e.get());
    }
}
