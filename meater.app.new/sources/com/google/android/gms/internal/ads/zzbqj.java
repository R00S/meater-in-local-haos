package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbqj implements zzdti<zzbuz<zzbrw>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f23486a;

    /* renamed from: b */
    private final zzdtu<Executor> f23487b;

    private zzbqj(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23486a = zzdtuVar;
        this.f23487b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbqj m18263a(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbqj(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23486a.get(), this.f23487b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
