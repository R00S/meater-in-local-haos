package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfs implements zzdti<Set<zzbuz<zzbrx>>> {

    /* renamed from: a */
    private final zzcfp f24236a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24237b;

    /* renamed from: c */
    private final zzdtu<Executor> f24238c;

    private zzcfs(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24236a = zzcfpVar;
        this.f24237b = zzdtuVar;
        this.f24238c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfs m18747a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfs(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18735a(this.f24237b.get(), this.f24238c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
