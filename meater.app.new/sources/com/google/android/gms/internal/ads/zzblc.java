package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzblc implements zzdti<zzbkz> {

    /* renamed from: a */
    private final zzdtu<Context> f23182a;

    /* renamed from: b */
    private final zzdtu<zzbai> f23183b;

    /* renamed from: c */
    private final zzdtu<zzclc> f23184c;

    /* renamed from: d */
    private final zzdtu<zzcjz<zzams, zzclb>> f23185d;

    /* renamed from: e */
    private final zzdtu<zzcpf> f23186e;

    /* renamed from: f */
    private final zzdtu<zzcgb> f23187f;

    public zzblc(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzclc> zzdtuVar3, zzdtu<zzcjz<zzams, zzclb>> zzdtuVar4, zzdtu<zzcpf> zzdtuVar5, zzdtu<zzcgb> zzdtuVar6) {
        this.f23182a = zzdtuVar;
        this.f23183b = zzdtuVar2;
        this.f23184c = zzdtuVar3;
        this.f23185d = zzdtuVar4;
        this.f23186e = zzdtuVar5;
        this.f23187f = zzdtuVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbkz(this.f23182a.get(), this.f23183b.get(), this.f23184c.get(), this.f23185d.get(), this.f23186e.get(), this.f23187f.get());
    }
}
