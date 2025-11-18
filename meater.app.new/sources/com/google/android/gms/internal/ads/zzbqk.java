package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbqk implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzbme> f23488a;

    /* renamed from: b */
    private final zzdtu<Executor> f23489b;

    private zzbqk(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f23488a = zzdtuVar;
        this.f23489b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m18264a(zzbme zzbmeVar, Executor executor) {
        return (zzbuz) zzdto.m19874b(new zzbuz(zzbmeVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static zzbqk m18265b(zzdtu<zzbme> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzbqk(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18264a(this.f23488a.get(), this.f23489b.get());
    }
}
