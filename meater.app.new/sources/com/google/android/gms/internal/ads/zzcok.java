package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzcok implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final Context f24816a;

    /* renamed from: b */
    private final zzboc f24817b;

    /* renamed from: c */
    private final zzado f24818c;

    /* renamed from: d */
    private final zzbbl f24819d;

    /* renamed from: e */
    private final zzczt f24820e;

    public zzcok(Context context, zzboc zzbocVar, zzczt zzcztVar, zzbbl zzbblVar, zzado zzadoVar) {
        this.f24816a = context;
        this.f24817b = zzbocVar;
        this.f24820e = zzcztVar;
        this.f24819d = zzbblVar;
        this.f24818c = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzbnf> mo18846a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzbng zzbngVarMo15068a = this.f24817b.mo15068a(new zzbpr(zzcxuVar, zzcxmVar, null), new C6974nm(this, new View(this.f24816a), null, C6900lm.f19846a, zzcxmVar.f25260r.get(0)));
        zzcoo zzcooVarMo15109j = zzbngVarMo15068a.mo15109j();
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        final zzadj zzadjVar = new zzadj(zzcooVarMo15109j, zzcxqVar.f25279b, zzcxqVar.f25278a);
        return this.f24820e.m19100g(zzczs.CUSTOM_RENDER_SYN).m19104a(new zzczd(this, zzadjVar) { // from class: com.google.android.gms.internal.ads.mm

            /* renamed from: a */
            private final zzcok f19931a;

            /* renamed from: b */
            private final zzadj f19932b;

            {
                this.f19931a = this;
                this.f19932b = zzadjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzczd
            public final void run() throws Exception {
                this.f19931a.m18897c(this.f19932b);
            }
        }, this.f24819d).m19116j(zzczs.CUSTOM_RENDER_ACK).m19113g(zzbar.m17378o(zzbngVarMo15068a.mo15106g())).m19112f();
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar;
        return (this.f24818c == null || (zzcxqVar = zzcxmVar.f25258p) == null || zzcxqVar.f25278a == null) ? false : true;
    }

    /* renamed from: c */
    final /* synthetic */ void m18897c(zzadj zzadjVar) throws Exception {
        this.f24818c.mo16456O2(zzadjVar);
    }
}
