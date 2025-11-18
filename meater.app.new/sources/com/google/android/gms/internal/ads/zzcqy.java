package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcqy implements zzdti<zzbbh<zzcrc>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24948a;

    /* renamed from: b */
    private final zzdtu<zzcqz> f24949b;

    /* renamed from: c */
    private final zzdtu<zzbbh<zzarx>> f24950c;

    public zzcqy(zzdtu<zzczt> zzdtuVar, zzdtu<zzcqz> zzdtuVar2, zzdtu<zzbbh<zzarx>> zzdtuVar3) {
        this.f24948a = zzdtuVar;
        this.f24949b = zzdtuVar2;
        this.f24950c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(this.f24948a.get().m19099c(zzczs.GENERATE_SIGNALS, this.f24950c.get()).m19109b(this.f24949b.get()).m19108a(((Integer) zzyt.m20848e().m16421c(zzacu.f21879u4)).intValue(), TimeUnit.SECONDS).m19112f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
