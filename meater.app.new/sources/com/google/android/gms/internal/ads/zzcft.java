package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcft implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzcfp f24239a;

    /* renamed from: b */
    private final zzdtu<zzcfz> f24240b;

    /* renamed from: c */
    private final zzdtu<Executor> f24241c;

    private zzcft(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24239a = zzcfpVar;
        this.f24240b = zzdtuVar;
        this.f24241c = zzdtuVar2;
    }

    /* renamed from: a */
    public static Set<zzbuz<zzbsr>> m18748a(zzcfp zzcfpVar, zzcfz zzcfzVar, Executor executor) {
        return (Set) zzdto.m19874b(zzcfp.m18737c(zzcfzVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static zzcft m18749b(zzcfp zzcfpVar, zzdtu<zzcfz> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcft(zzcfpVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18748a(this.f24239a, this.f24240b.get(), this.f24241c.get());
    }
}
