package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbzg implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzbzf f23866a;

    /* renamed from: b */
    private final zzdtu<Context> f23867b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23868c;

    private zzbzg(zzbzf zzbzfVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.f23866a = zzbzfVar;
        this.f23867b = zzdtuVar;
        this.f23868c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbzg m18579a(zzbzf zzbzfVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        return new zzbzg(zzbzfVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.m19874b(new zzavf(this.f23867b.get(), this.f23868c.get().f25295f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
