package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzciz implements zzdti<zzbuz<zzczz>> {

    /* renamed from: a */
    private final zzdtu<zzcjk> f24380a;

    /* renamed from: b */
    private final zzdtu<Executor> f24381b;

    private zzciz(zzdtu<zzcjk> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24380a = zzdtuVar;
        this.f24381b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzciz m18813a(zzdtu<zzcjk> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzciz(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24380a.get(), this.f24381b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
