package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsm;

/* loaded from: classes2.dex */
public final class zzcoi<AdT, AdapterT, ListenerT extends zzbsm> implements zzdti<zzcoe<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24805a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f24806b;

    /* renamed from: c */
    private final zzdtu<zzcjz<AdapterT, ListenerT>> f24807c;

    /* renamed from: d */
    private final zzdtu<zzcka<AdT, AdapterT, ListenerT>> f24808d;

    private zzcoi(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtuVar3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtuVar4) {
        this.f24805a = zzdtuVar;
        this.f24806b = zzdtuVar2;
        this.f24807c = zzdtuVar3;
        this.f24808d = zzdtuVar4;
    }

    /* renamed from: a */
    public static <AdT, AdapterT, ListenerT extends zzbsm> zzcoi<AdT, AdapterT, ListenerT> m18896a(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzcjz<AdapterT, ListenerT>> zzdtuVar3, zzdtu<zzcka<AdT, AdapterT, ListenerT>> zzdtuVar4) {
        return new zzcoi<>(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcoe(this.f24805a.get(), this.f24806b.get(), this.f24807c.get(), this.f24808d.get());
    }
}
