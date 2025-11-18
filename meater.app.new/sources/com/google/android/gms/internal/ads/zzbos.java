package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbos implements zzdti<zzbol> {

    /* renamed from: a */
    private final zzdtu<zzaga> f23367a;

    /* renamed from: b */
    private final zzdtu<Runnable> f23368b;

    /* renamed from: c */
    private final zzdtu<Executor> f23369c;

    /* renamed from: d */
    private final zzdtu<zzcxu> f23370d;

    /* renamed from: e */
    private final zzdtu<zzcxm> f23371e;

    /* renamed from: f */
    private final zzdtu<zzbry> f23372f;

    /* renamed from: g */
    private final zzdtu<zzbso> f23373g;

    /* renamed from: h */
    private final zzdtu<String> f23374h;

    public zzbos(zzdtu<zzaga> zzdtuVar, zzdtu<Runnable> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<zzcxu> zzdtuVar4, zzdtu<zzcxm> zzdtuVar5, zzdtu<zzbry> zzdtuVar6, zzdtu<zzbso> zzdtuVar7, zzdtu<String> zzdtuVar8) {
        this.f23367a = zzdtuVar;
        this.f23368b = zzdtuVar2;
        this.f23369c = zzdtuVar3;
        this.f23370d = zzdtuVar4;
        this.f23371e = zzdtuVar5;
        this.f23372f = zzdtuVar6;
        this.f23373g = zzdtuVar7;
        this.f23374h = zzdtuVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbol zzbolVar = new zzbol(this.f23367a.get(), this.f23368b.get(), this.f23369c.get());
        zzbql.m18269d(zzbolVar, this.f23370d.get());
        zzbql.m18268c(zzbolVar, this.f23371e.get());
        zzbql.m18266a(zzbolVar, this.f23372f.get());
        zzbql.m18267b(zzbolVar, this.f23373g.get());
        zzbql.m18270e(zzbolVar, this.f23374h.get());
        return zzbolVar;
    }
}
