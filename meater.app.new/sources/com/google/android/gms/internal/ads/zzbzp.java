package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbzp implements zzdti<zzbzl> {

    /* renamed from: a */
    private final zzdtu<Context> f23895a;

    /* renamed from: b */
    private final zzdtu<zzaxb> f23896b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23897c;

    /* renamed from: d */
    private final zzdtu<zzbyx> f23898d;

    /* renamed from: e */
    private final zzdtu<zzbyt> f23899e;

    /* renamed from: f */
    private final zzdtu<zzbzt> f23900f;

    /* renamed from: g */
    private final zzdtu<Executor> f23901g;

    /* renamed from: h */
    private final zzdtu<Executor> f23902h;

    private zzbzp(zzdtu<Context> zzdtuVar, zzdtu<zzaxb> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbyx> zzdtuVar4, zzdtu<zzbyt> zzdtuVar5, zzdtu<zzbzt> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<Executor> zzdtuVar8) {
        this.f23895a = zzdtuVar;
        this.f23896b = zzdtuVar2;
        this.f23897c = zzdtuVar3;
        this.f23898d = zzdtuVar4;
        this.f23899e = zzdtuVar5;
        this.f23900f = zzdtuVar6;
        this.f23901g = zzdtuVar7;
        this.f23902h = zzdtuVar8;
    }

    /* renamed from: a */
    public static zzbzp m18601a(zzdtu<Context> zzdtuVar, zzdtu<zzaxb> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzbyx> zzdtuVar4, zzdtu<zzbyt> zzdtuVar5, zzdtu<zzbzt> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<Executor> zzdtuVar8) {
        return new zzbzp(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbzl(this.f23895a.get(), this.f23896b.get(), this.f23897c.get(), this.f23898d.get(), this.f23899e.get(), this.f23900f.get(), this.f23901g.get(), this.f23902h.get());
    }
}
