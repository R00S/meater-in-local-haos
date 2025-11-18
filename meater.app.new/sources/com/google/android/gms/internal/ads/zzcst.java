package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcst implements zzdti<zzcsp> {

    /* renamed from: a */
    private final zzdtu<Context> f25035a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f25036b;

    private zzcst(zzdtu<Context> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        this.f25035a = zzdtuVar;
        this.f25036b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcst m18968a(zzdtu<Context> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        return new zzcst(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsp(this.f25035a.get(), this.f25036b.get());
    }
}
