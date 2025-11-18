package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbqd implements zzdti<zzawj> {

    /* renamed from: a */
    private final zzdtu<Clock> f23473a;

    /* renamed from: b */
    private final zzdtu<zzawu> f23474b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23475c;

    private zzbqd(zzdtu<Clock> zzdtuVar, zzdtu<zzawu> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        this.f23473a = zzdtuVar;
        this.f23474b = zzdtuVar2;
        this.f23475c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbqd m18256a(zzdtu<Clock> zzdtuVar, zzdtu<zzawu> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        return new zzbqd(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzawj) zzdto.m19874b(this.f23474b.get().m17074c(this.f23473a.get(), this.f23475c.get().f25295f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
