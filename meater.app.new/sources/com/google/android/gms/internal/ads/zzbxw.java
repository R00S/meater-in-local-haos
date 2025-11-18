package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzbxw implements zzdti<zzbpe<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<zzbjm> f23711a;

    /* renamed from: b */
    private final zzdtu<zzbqy.zza> f23712b;

    /* renamed from: c */
    private final zzdtu<zzbtv> f23713c;

    /* renamed from: d */
    private final zzdtu<zzbxk> f23714d;

    /* renamed from: e */
    private final zzdtu<zzbtb> f23715e;

    public zzbxw(zzdtu<zzbjm> zzdtuVar, zzdtu<zzbqy.zza> zzdtuVar2, zzdtu<zzbtv> zzdtuVar3, zzdtu<zzbxk> zzdtuVar4, zzdtu<zzbtb> zzdtuVar5) {
        this.f23711a = zzdtuVar;
        this.f23712b = zzdtuVar2;
        this.f23713c = zzdtuVar3;
        this.f23714d = zzdtuVar4;
        this.f23715e = zzdtuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbjm zzbjmVar = this.f23711a.get();
        zzbqy.zza zzaVar = this.f23712b.get();
        zzbtv zzbtvVar = this.f23713c.get();
        return (zzbpe) zzdto.m19874b(zzbjmVar.mo17785j().mo14977f(zzaVar.m18287c()).mo14972a(zzbtvVar).mo14978g(this.f23714d.get()).mo14976e(new zzcow(null)).mo14974c(new zzbox(this.f23715e.get())).mo14975d(new zzbnc(null)).mo14973b().mo15072e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
