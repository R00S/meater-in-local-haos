package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzaly {

    /* renamed from: a */
    private zzakh f22116a;

    /* renamed from: b */
    private zzbbr<zzalf> f22117b;

    zzaly(zzakh zzakhVar) {
        this.f22116a = zzakhVar;
    }

    /* renamed from: d */
    private final void m16663d() {
        if (this.f22117b == null) {
            final zzbbr<zzalf> zzbbrVar = new zzbbr<>();
            this.f22117b = zzbbrVar;
            this.f22116a.m16641h(null).m17390d(new zzbbv(zzbbrVar) { // from class: com.google.android.gms.internal.ads.j2

                /* renamed from: a */
                private final zzbbr f19423a;

                {
                    this.f19423a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbv
                /* renamed from: a */
                public final void mo14740a(Object obj) {
                    this.f19423a.m17385a((zzalf) obj);
                }
            }, new zzbbt(zzbbrVar) { // from class: com.google.android.gms.internal.ads.l2

                /* renamed from: a */
                private final zzbbr f19738a;

                {
                    this.f19738a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbt
                public final void run() {
                    this.f19738a.m17386c(new zzali("Cannot get Javascript Engine"));
                }
            });
        }
    }

    /* renamed from: a */
    public final zzamd m16664a(String str, zzalm zzalmVar, zzall zzallVar) {
        m16663d();
        return new zzamd(this.f22117b, str, zzalmVar, zzallVar);
    }

    /* renamed from: b */
    public final void m16665b(final String str, final zzaho<? super zzalf> zzahoVar) {
        m16663d();
        this.f22117b = (zzbbr) zzbar.m17366c(this.f22117b, new zzbal(str, zzahoVar) { // from class: com.google.android.gms.internal.ads.m2

            /* renamed from: a */
            private final String f19859a;

            /* renamed from: b */
            private final zzaho f19860b;

            {
                this.f19859a = str;
                this.f19860b = zzahoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                zzalf zzalfVar = (zzalf) obj;
                zzalfVar.mo16627f(this.f19859a, this.f19860b);
                return zzbar.m17378o(zzalfVar);
            }
        }, zzbbm.f22758b);
    }

    /* renamed from: c */
    public final void m16666c(final String str, final zzaho<? super zzalf> zzahoVar) {
        this.f22117b = (zzbbr) zzbar.m17367d(this.f22117b, new zzbam(str, zzahoVar) { // from class: com.google.android.gms.internal.ads.n2

            /* renamed from: a */
            private final String f19973a;

            /* renamed from: b */
            private final zzaho f19974b;

            {
                this.f19973a = str;
                this.f19974b = zzahoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                zzalf zzalfVar = (zzalf) obj;
                zzalfVar.mo16628i(this.f19973a, this.f19974b);
                return zzalfVar;
            }
        }, zzbbm.f22758b);
    }
}
