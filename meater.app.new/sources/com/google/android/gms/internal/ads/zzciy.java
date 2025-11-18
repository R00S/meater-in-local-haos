package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzciy implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<zzcjg> f24378a;

    /* renamed from: b */
    private final zzdtu<Executor> f24379b;

    private zzciy(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24378a = zzdtuVar;
        this.f24379b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzciy m18812a(zzdtu<zzcjg> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzciy(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24378a.get(), this.f24379b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
