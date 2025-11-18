package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcej implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f24175a;

    /* renamed from: b */
    private final zzdtu<Executor> f24176b;

    private zzcej(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24175a = zzdtuVar;
        this.f24176b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcej m18702a(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcej(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24175a.get(), this.f24176b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
