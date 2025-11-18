package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcgz implements zzdti<zzbbh<zzcxu>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24296a;

    /* renamed from: b */
    private final zzdtu<zzchl> f24297b;

    /* renamed from: c */
    private final zzdtu<zzchq> f24298c;

    /* renamed from: d */
    private final zzdtu<zzbbh<zzarx>> f24299d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f24300e;

    private zzcgz(zzdtu<zzczt> zzdtuVar, zzdtu<zzchl> zzdtuVar2, zzdtu<zzchq> zzdtuVar3, zzdtu<zzbbh<zzarx>> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        this.f24296a = zzdtuVar;
        this.f24297b = zzdtuVar2;
        this.f24298c = zzdtuVar3;
        this.f24299d = zzdtuVar4;
        this.f24300e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzcgz m18781a(zzdtu<zzczt> zzdtuVar, zzdtu<zzchl> zzdtuVar2, zzdtu<zzchq> zzdtuVar3, zzdtu<zzbbh<zzarx>> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        return new zzcgz(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzczt zzcztVar = this.f24296a.get();
        zzchl zzchlVar = this.f24297b.get();
        zzchq zzchqVar = this.f24298c.get();
        zzbbh<zzarx> zzbbhVar = this.f24299d.get();
        zzcxv zzcxvVar = this.f24300e.get();
        zzk.zzlm().m20673l();
        return (zzbbh) zzdto.m19874b(zzcxvVar.f25293d.f27420x != null ? zzcztVar.m19099c(zzczs.SERVER_TRANSACTION, zzbbhVar).m19113g(zzchqVar.m18797a()).m19112f() : zzcztVar.m19099c(zzczs.SERVER_TRANSACTION, zzbbhVar).m19109b(zzchlVar).m19112f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
