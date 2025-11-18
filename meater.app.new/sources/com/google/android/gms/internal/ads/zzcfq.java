package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfq implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzcfp f24230a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24231b;

    /* renamed from: c */
    private final zzdtu<Executor> f24232c;

    private zzcfq(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24230a = zzcfpVar;
        this.f24231b = zzdtuVar;
        this.f24232c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfq m18745a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfq(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18740f(this.f24231b.get(), this.f24232c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
