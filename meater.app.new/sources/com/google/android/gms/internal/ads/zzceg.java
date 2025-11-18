package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzceg implements zzdti<zzbuz<zzxr>> {

    /* renamed from: a */
    private final zzdtu<zzcep> f24169a;

    /* renamed from: b */
    private final zzdtu<Executor> f24170b;

    private zzceg(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24169a = zzdtuVar;
        this.f24170b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzceg m18699a(zzdtu<zzcep> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzceg(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24169a.get(), this.f24170b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
