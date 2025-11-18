package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzclp implements zzdti<zzcln> {

    /* renamed from: a */
    private final zzdtu<Context> f24683a;

    /* renamed from: b */
    private final zzdtu<zzbai> f24684b;

    /* renamed from: c */
    private final zzdtu<zzbws> f24685c;

    public zzclp(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzbws> zzdtuVar3) {
        this.f24683a = zzdtuVar;
        this.f24684b = zzdtuVar2;
        this.f24685c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcln(this.f24683a.get(), this.f24684b.get(), this.f24685c.get());
    }
}
