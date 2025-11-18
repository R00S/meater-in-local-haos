package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcff implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f24213a;

    /* renamed from: b */
    private final zzdtu<Executor> f24214b;

    private zzcff(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24213a = zzdtuVar;
        this.f24214b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcff m18725a(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcff(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24213a.get(), this.f24214b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
