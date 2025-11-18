package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcfd implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f24209a;

    /* renamed from: b */
    private final zzdtu<Executor> f24210b;

    private zzcfd(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        this.f24209a = zzdtuVar;
        this.f24210b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfd m18723a(zzdtu<zzcfb> zzdtuVar, zzdtu<Executor> zzdtuVar2) {
        return new zzcfd(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f24209a.get(), this.f24210b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
