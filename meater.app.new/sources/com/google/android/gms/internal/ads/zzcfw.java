package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfw implements zzdti<Set<zzbuz<zzxr>>> {

    /* renamed from: a */
    private final zzcfp f24248a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24249b;

    /* renamed from: c */
    private final zzdtu<Executor> f24250c;

    private zzcfw(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24248a = zzcfpVar;
        this.f24249b = zzdtuVar;
        this.f24250c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfw m18752a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfw(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18742h(this.f24249b.get(), this.f24250c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
