package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbou implements zzdti<zzbot> {

    /* renamed from: a */
    private final zzdtu<Context> f23381a;

    /* renamed from: b */
    private final zzdtu<zzbgz> f23382b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f23383c;

    /* renamed from: d */
    private final zzdtu<zzbai> f23384d;

    public zzbou(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4) {
        this.f23381a = zzdtuVar;
        this.f23382b = zzdtuVar2;
        this.f23383c = zzdtuVar3;
        this.f23384d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbot(this.f23381a.get(), this.f23382b.get(), this.f23383c.get(), this.f23384d.get());
    }
}
