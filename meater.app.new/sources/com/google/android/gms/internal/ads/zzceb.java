package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzceb implements zzdti<zzcdn> {

    /* renamed from: a */
    private final zzdtu<zzbhf> f24153a;

    /* renamed from: b */
    private final zzdtu<Context> f24154b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24155c;

    /* renamed from: d */
    private final zzdtu<zzdh> f24156d;

    /* renamed from: e */
    private final zzdtu<zzbai> f24157e;

    /* renamed from: f */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f24158f;

    /* renamed from: g */
    private final zzdtu<zzwj> f24159g;

    /* renamed from: h */
    private final zzdtu<zzbtb> f24160h;

    private zzceb(zzdtu<zzbhf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzdh> zzdtuVar4, zzdtu<zzbai> zzdtuVar5, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar6, zzdtu<zzwj> zzdtuVar7, zzdtu<zzbtb> zzdtuVar8) {
        this.f24153a = zzdtuVar;
        this.f24154b = zzdtuVar2;
        this.f24155c = zzdtuVar3;
        this.f24156d = zzdtuVar4;
        this.f24157e = zzdtuVar5;
        this.f24158f = zzdtuVar6;
        this.f24159g = zzdtuVar7;
        this.f24160h = zzdtuVar8;
    }

    /* renamed from: a */
    public static zzceb m18694a(zzdtu<zzbhf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<zzdh> zzdtuVar4, zzdtu<zzbai> zzdtuVar5, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar6, zzdtu<zzwj> zzdtuVar7, zzdtu<zzbtb> zzdtuVar8) {
        return new zzceb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcdn(this.f24153a.get(), this.f24154b.get(), this.f24155c.get(), this.f24156d.get(), this.f24157e.get(), this.f24158f.get(), this.f24159g.get(), this.f24160h.get());
    }
}
