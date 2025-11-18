package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmr implements zzdti<zzbmg> {

    /* renamed from: a */
    private final zzdtu<zzty> f23262a;

    /* renamed from: b */
    private final zzdtu<zzaly> f23263b;

    /* renamed from: c */
    private final zzdtu<Executor> f23264c;

    private zzbmr(zzdtu<zzty> zzdtuVar, zzdtu<zzaly> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        this.f23262a = zzdtuVar;
        this.f23263b = zzdtuVar2;
        this.f23264c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzbmr m17900a(zzdtu<zzty> zzdtuVar, zzdtu<zzaly> zzdtuVar2, zzdtu<Executor> zzdtuVar3) {
        return new zzbmr(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzty zztyVar = this.f23262a.get();
        return (zzbmg) zzdto.m19874b(new zzbmg(zztyVar.m20591d(), this.f23263b.get(), this.f23264c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
