package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfy implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzcfp f24254a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24255b;

    /* renamed from: c */
    private final zzdtu<Executor> f24256c;

    private zzcfy(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24254a = zzcfpVar;
        this.f24255b = zzdtuVar;
        this.f24256c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfy m18754a(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfy(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(zzcfp.m18743i(this.f24255b.get(), this.f24256c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
