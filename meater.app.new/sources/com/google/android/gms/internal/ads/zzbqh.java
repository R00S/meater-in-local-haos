package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbqh implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f23482a;

    /* renamed from: b */
    private final zzdtu<Executor> f23483b;

    private zzbqh(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23482a = zzdtuVar;
        this.f23483b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbqh m18261a(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbqh(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23482a.get(), this.f23483b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
