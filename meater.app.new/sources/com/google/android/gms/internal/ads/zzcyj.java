package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyj implements zzdti<zzcyi> {

    /* renamed from: a */
    private final zzdtu<Context> f25330a;

    /* renamed from: b */
    private final zzdtu<zzawu> f25331b;

    private zzcyj(zzdtu<Context> zzdtuVar, zzdtu<zzawu> zzdtuVar2) {
        this.f25330a = zzdtuVar;
        this.f25331b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcyj m19076a(zzdtu<Context> zzdtuVar, zzdtu<zzawu> zzdtuVar2) {
        return new zzcyj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcyi(this.f25330a.get(), this.f25331b.get());
    }
}
