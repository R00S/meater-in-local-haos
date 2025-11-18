package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcid implements zzdti<C6860kj> {

    /* renamed from: a */
    private final zzdtu<Context> f24350a;

    /* renamed from: b */
    private final zzdtu<zzavg> f24351b;

    private zzcid(zzdtu<Context> zzdtuVar, zzdtu<zzavg> zzdtuVar2) {
        this.f24350a = zzdtuVar;
        this.f24351b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcid m18803a(zzdtu<Context> zzdtuVar, zzdtu<zzavg> zzdtuVar2) {
        return new zzcid(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new C6860kj(this.f24350a.get(), this.f24351b.get());
    }
}
