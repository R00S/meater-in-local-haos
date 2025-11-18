package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcix implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcjg> f24376a;

    /* renamed from: b */
    private final zzdtu<Executor> f24377b;

    private zzcix(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24376a = zzdtuVar;
        this.f24377b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcix m18811a(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcix(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24376a.get(), this.f24377b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
