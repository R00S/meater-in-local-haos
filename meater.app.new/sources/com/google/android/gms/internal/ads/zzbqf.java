package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqf implements zzdti<zzbqe> {

    /* renamed from: a */
    private final zzdtu<Clock> f23478a;

    /* renamed from: b */
    private final zzdtu<zzawj> f23479b;

    private zzbqf(zzdtu<Clock> zzdtuVar, zzdtu<zzawj> zzdtuVar2) {
        this.f23478a = zzdtuVar;
        this.f23479b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbqf m18259a(zzdtu<Clock> zzdtuVar, zzdtu<zzawj> zzdtuVar2) {
        return new zzbqf(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbqe(this.f23478a.get(), this.f23479b.get());
    }
}
