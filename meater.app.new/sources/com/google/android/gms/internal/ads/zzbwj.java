package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbwj implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzbvz f23639a;

    /* renamed from: b */
    private final zzdtu<Context> f23640b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23641c;

    private zzbwj(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.f23639a = zzbvzVar;
        this.f23640b = zzdtuVar;
        this.f23641c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbwj m18416a(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        return new zzbwj(zzbvzVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzavf) zzdto.m19874b(new zzavf(this.f23640b.get(), this.f23641c.get().f25295f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
