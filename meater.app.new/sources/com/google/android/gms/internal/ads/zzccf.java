package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzccf implements zzdti<zzccd> {

    /* renamed from: a */
    private final zzdtu<Context> f24050a;

    /* renamed from: b */
    private final zzdtu<zzbyt> f24051b;

    /* renamed from: c */
    private final zzdtu<zzbzl> f24052c;

    /* renamed from: d */
    private final zzdtu<zzbyn> f24053d;

    private zzccf(zzdtu<Context> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzl> zzdtuVar3, zzdtu<zzbyn> zzdtuVar4) {
        this.f24050a = zzdtuVar;
        this.f24051b = zzdtuVar2;
        this.f24052c = zzdtuVar3;
        this.f24053d = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzccf m18659a(zzdtu<Context> zzdtuVar, zzdtu<zzbyt> zzdtuVar2, zzdtu<zzbzl> zzdtuVar3, zzdtu<zzbyn> zzdtuVar4) {
        return new zzccf(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccd(this.f24050a.get(), this.f24051b.get(), this.f24052c.get(), this.f24053d.get());
    }
}
