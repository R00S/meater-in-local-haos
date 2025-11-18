package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzchd implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<C6860kj> f24313a;

    /* renamed from: b */
    private final zzdtu<Executor> f24314b;

    private zzchd(zzdtu<C6860kj> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24313a = zzdtuVar;
        this.f24314b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzchd m18785a(zzdtu<C6860kj> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzchd(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24313a.get(), this.f24314b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
