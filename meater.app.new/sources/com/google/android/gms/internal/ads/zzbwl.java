package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbwl implements zzdti<zzbuz<zzbrl>> {

    /* renamed from: a */
    private final zzbvz f23642a;

    /* renamed from: b */
    private final zzdtu<zzbxg> f23643b;

    /* renamed from: c */
    private final zzdtu<Executor> f23644c;

    private zzbwl(zzbvz zzbvzVar, zzdtu<zzbxg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23642a = zzbvzVar;
        this.f23643b = zzdtuVar;
        this.f23644c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbwl m18418a(zzbvz zzbvzVar, zzdtu<zzbxg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbwl(zzbvzVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23643b.get(), this.f23644c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
