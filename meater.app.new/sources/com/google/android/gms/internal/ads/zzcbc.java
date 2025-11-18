package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcbc implements zzdti<zzcau> {

    /* renamed from: a */
    private final zzdtu<Context> f23988a;

    /* renamed from: b */
    private final zzdtu<zzcan> f23989b;

    /* renamed from: c */
    private final zzdtu<zzdh> f23990c;

    /* renamed from: d */
    private final zzdtu<zzbai> f23991d;

    /* renamed from: e */
    private final zzdtu<com.google.android.gms.ads.internal.zza> f23992e;

    /* renamed from: f */
    private final zzdtu<zzwj> f23993f;

    /* renamed from: g */
    private final zzdtu<Executor> f23994g;

    /* renamed from: h */
    private final zzdtu<zzcxv> f23995h;

    /* renamed from: i */
    private final zzdtu<zzcbi> f23996i;

    /* renamed from: j */
    private final zzdtu<ScheduledExecutorService> f23997j;

    public zzcbc(zzdtu<Context> zzdtuVar, zzdtu<zzcan> zzdtuVar2, zzdtu<zzdh> zzdtuVar3, zzdtu<zzbai> zzdtuVar4, zzdtu<com.google.android.gms.ads.internal.zza> zzdtuVar5, zzdtu<zzwj> zzdtuVar6, zzdtu<Executor> zzdtuVar7, zzdtu<zzcxv> zzdtuVar8, zzdtu<zzcbi> zzdtuVar9, zzdtu<ScheduledExecutorService> zzdtuVar10) {
        this.f23988a = zzdtuVar;
        this.f23989b = zzdtuVar2;
        this.f23990c = zzdtuVar3;
        this.f23991d = zzdtuVar4;
        this.f23992e = zzdtuVar5;
        this.f23993f = zzdtuVar6;
        this.f23994g = zzdtuVar7;
        this.f23995h = zzdtuVar8;
        this.f23996i = zzdtuVar9;
        this.f23997j = zzdtuVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcau(this.f23988a.get(), this.f23989b.get(), this.f23990c.get(), this.f23991d.get(), this.f23992e.get(), this.f23993f.get(), this.f23994g.get(), this.f23995h.get(), this.f23996i.get(), this.f23997j.get());
    }
}
