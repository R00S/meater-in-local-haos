package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfx implements zzdti<Set<zzbuz<zzbrw>>> {

    /* renamed from: a */
    private final zzcfp f24251a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24252b;

    /* renamed from: c */
    private final zzdtu<Executor> f24253c;

    private zzcfx(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24251a = zzcfpVar;
        this.f24252b = zzdtuVar;
        this.f24253c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfx m18753a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfx(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18741g(this.f24252b.get(), this.f24253c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
