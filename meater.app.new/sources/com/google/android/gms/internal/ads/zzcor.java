package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcor<AdT> implements zzcjv<AdT> {

    /* renamed from: a */
    private final zzado f24832a;

    /* renamed from: b */
    private final zzbbl f24833b;

    /* renamed from: c */
    private final zzczt f24834c;

    /* renamed from: d */
    private final zzcou<AdT> f24835d;

    public zzcor(zzczt zzcztVar, zzbbl zzbblVar, zzado zzadoVar, zzcou<AdT> zzcouVar) {
        this.f24834c = zzcztVar;
        this.f24833b = zzbblVar;
        this.f24832a = zzadoVar;
        this.f24835d = zzcouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<AdT> mo18846a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzbbr zzbbrVar = new zzbbr();
        zzcoz zzcozVar = new zzcoz();
        zzcozVar.m18905a(new C7048pm(this, zzbbrVar, zzcxuVar, zzcxmVar, zzcozVar));
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        final zzadj zzadjVar = new zzadj(zzcozVar, zzcxqVar.f25279b, zzcxqVar.f25278a);
        return this.f24834c.m19100g(zzczs.CUSTOM_RENDER_SYN).m19104a(new zzczd(this, zzadjVar) { // from class: com.google.android.gms.internal.ads.om

            /* renamed from: a */
            private final zzcor f20203a;

            /* renamed from: b */
            private final zzadj f20204b;

            {
                this.f20203a = this;
                this.f20204b = zzadjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzczd
            public final void run() throws Exception {
                this.f20203a.m18900d(this.f20204b);
            }
        }, this.f24833b).m19116j(zzczs.CUSTOM_RENDER_ACK).m19113g(zzbbrVar).m19112f();
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar;
        return (this.f24832a == null || (zzcxqVar = zzcxmVar.f25258p) == null || zzcxqVar.f25278a == null) ? false : true;
    }

    /* renamed from: d */
    final /* synthetic */ void m18900d(zzadj zzadjVar) throws Exception {
        this.f24832a.mo16456O2(zzadjVar);
    }
}
