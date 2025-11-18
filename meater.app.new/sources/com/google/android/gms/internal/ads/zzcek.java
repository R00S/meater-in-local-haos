package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcek implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f24177a;

    /* renamed from: b */
    private final zzdtu<Executor> f24178b;

    private zzcek(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24177a = zzdtuVar;
        this.f24178b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcek m18703a(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcek(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24177a.get(), this.f24178b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
