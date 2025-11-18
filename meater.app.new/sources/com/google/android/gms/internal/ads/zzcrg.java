package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class zzcrg implements zzdti<zzcre> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f24964a;

    /* renamed from: b */
    private final zzdtu<Context> f24965b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f24966c;

    /* renamed from: d */
    private final zzdtu<ViewGroup> f24967d;

    public zzcrg(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3, zzdtu<ViewGroup> zzdtuVar4) {
        this.f24964a = zzdtuVar;
        this.f24965b = zzdtuVar2;
        this.f24966c = zzdtuVar3;
        this.f24967d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcre(this.f24964a.get(), this.f24965b.get(), this.f24966c.get(), this.f24967d.get());
    }
}
