package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzceo implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzdtu<Executor> f24182a;

    /* renamed from: b */
    private final zzdtu<zzcex> f24183b;

    private zzceo(zzdtu<Executor> zzdtuVar, zzdtu<zzcex> zzdtuVar2) {
        this.f24182a = zzdtuVar;
        this.f24183b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzceo m18707a(zzdtu<Executor> zzdtuVar, zzdtu<zzcex> zzdtuVar2) {
        return new zzceo(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Executor executor = this.f24182a.get();
        return (Set) zzdto.m19874b(((Boolean) zzyt.m20848e().m16421c(zzacu.f21704S3)).booleanValue() ? Collections.singleton(new zzbuz(this.f24183b.get(), executor)) : Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
