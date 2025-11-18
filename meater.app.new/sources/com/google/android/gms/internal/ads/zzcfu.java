package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfu implements zzdti<Set<zzbuz<zzbtk>>> {

    /* renamed from: a */
    private final zzcfp f24242a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24243b;

    /* renamed from: c */
    private final zzdtu<Executor> f24244c;

    private zzcfu(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24242a = zzcfpVar;
        this.f24243b = zzdtuVar;
        this.f24244c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfu m18750a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfu(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18744j(this.f24243b.get(), this.f24244c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
