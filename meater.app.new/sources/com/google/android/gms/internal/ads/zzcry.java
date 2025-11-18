package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcry implements zzdti<zzcrv> {

    /* renamed from: a */
    private final zzdtu<Executor> f24994a;

    /* renamed from: b */
    private final zzdtu<zzawm> f24995b;

    private zzcry(zzdtu<Executor> zzdtuVar, zzdtu<zzawm> zzdtuVar2) {
        this.f24994a = zzdtuVar;
        this.f24995b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcry m18961a(zzdtu<Executor> zzdtuVar, zzdtu<zzawm> zzdtuVar2) {
        return new zzcry(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrv(this.f24994a.get(), this.f24995b.get());
    }
}
