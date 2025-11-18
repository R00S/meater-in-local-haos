package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzclu implements zzdti<zzclq> {

    /* renamed from: a */
    private final zzdtu<Context> f24688a;

    /* renamed from: b */
    private final zzdtu<zzbws> f24689b;

    public zzclu(zzdtu<Context> zzdtuVar, zzdtu<zzbws> zzdtuVar2) {
        this.f24688a = zzdtuVar;
        this.f24689b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzclq(this.f24688a.get(), this.f24689b.get());
    }
}
