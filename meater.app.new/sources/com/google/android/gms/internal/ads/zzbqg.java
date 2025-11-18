package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbqg implements zzdti<zzbuz<zzbvg>> {

    /* renamed from: a */
    private final zzdtu<zzbvh> f23480a;

    /* renamed from: b */
    private final zzdtu<Executor> f23481b;

    private zzbqg(zzdtu<zzbvh> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23480a = zzdtuVar;
        this.f23481b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbqg m18260a(zzdtu<zzbvh> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbqg(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23480a.get(), this.f23481b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
