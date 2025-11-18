package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbxb implements zzdti<zzbxa> {

    /* renamed from: a */
    private final zzdtu<Context> f23670a;

    /* renamed from: b */
    private final zzdtu<zzbgz> f23671b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f23672c;

    /* renamed from: d */
    private final zzdtu<zzbai> f23673d;

    /* renamed from: e */
    private final zzdtu<Integer> f23674e;

    private zzbxb(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        this.f23670a = zzdtuVar;
        this.f23671b = zzdtuVar2;
        this.f23672c = zzdtuVar3;
        this.f23673d = zzdtuVar4;
        this.f23674e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzbxb m18426a(zzdtu<Context> zzdtuVar, zzdtu<zzbgz> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        return new zzbxb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxa(this.f23670a.get(), this.f23671b.get(), this.f23672c.get(), this.f23673d.get(), this.f23674e.get().intValue());
    }
}
