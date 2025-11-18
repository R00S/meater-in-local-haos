package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcvm implements zzdti<zzcvk> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25152a;

    /* renamed from: b */
    private final zzdtu<Context> f25153b;

    private zzcvm(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.f25152a = zzdtuVar;
        this.f25153b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcvm m19001a(zzdtu<zzbbl> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        return new zzcvm(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvk(this.f25152a.get(), this.f25153b.get());
    }
}
