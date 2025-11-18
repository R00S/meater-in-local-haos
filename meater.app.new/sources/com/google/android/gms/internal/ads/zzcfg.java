package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfg implements zzdti<zzbuz<zzczz>> {

    /* renamed from: a */
    private final zzdtu<zzcfk> f24215a;

    /* renamed from: b */
    private final zzdtu<Executor> f24216b;

    private zzcfg(zzdtu<zzcfk> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24215a = zzdtuVar;
        this.f24216b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfg m18726a(zzdtu<zzcfk> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfg(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24215a.get(), this.f24216b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
