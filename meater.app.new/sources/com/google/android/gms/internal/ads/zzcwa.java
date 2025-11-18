package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcwa implements zzdti<zzcvy> {

    /* renamed from: a */
    private final zzdtu<zzasc> f25175a;

    /* renamed from: b */
    private final zzdtu<Context> f25176b;

    /* renamed from: c */
    private final zzdtu<String> f25177c;

    /* renamed from: d */
    private final zzdtu<zzbbl> f25178d;

    public zzcwa(zzdtu<zzasc> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<String> zzdtuVar3, zzdtu<zzbbl> zzdtuVar4) {
        this.f25175a = zzdtuVar;
        this.f25176b = zzdtuVar2;
        this.f25177c = zzdtuVar3;
        this.f25178d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvy(this.f25175a.get(), this.f25176b.get(), this.f25177c.get(), this.f25178d.get());
    }
}
