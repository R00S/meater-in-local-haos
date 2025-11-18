package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfe implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f24211a;

    /* renamed from: b */
    private final zzdtu<Executor> f24212b;

    private zzcfe(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24211a = zzdtuVar;
        this.f24212b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfe m18724a(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfe(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24211a.get(), this.f24212b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
