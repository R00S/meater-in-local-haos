package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnl implements zzcjv<zzcdb> {

    /* renamed from: a */
    private final Context f24781a;

    /* renamed from: b */
    private final zzcdn f24782b;

    /* renamed from: c */
    private final zzcdf f24783c;

    /* renamed from: d */
    private final zzcxv f24784d;

    /* renamed from: e */
    private final Executor f24785e;

    /* renamed from: f */
    private final zzbai f24786f;

    public zzcnl(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor, zzcdf zzcdfVar, zzcdn zzcdnVar) {
        this.f24781a = context;
        this.f24784d = zzcxvVar;
        this.f24783c = zzcdfVar;
        this.f24785e = executor;
        this.f24786f = zzbaiVar;
        this.f24782b = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzcdb> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzced zzcedVar = new zzced();
        zzbbh<zzcdb> zzbbhVarM17366c = zzbar.m17366c(zzbar.m17378o(null), new zzbal(this, zzcxmVar, zzcedVar, zzcxuVar) { // from class: com.google.android.gms.internal.ads.ul

            /* renamed from: a */
            private final zzcnl f20640a;

            /* renamed from: b */
            private final zzcxm f20641b;

            /* renamed from: c */
            private final zzced f20642c;

            /* renamed from: d */
            private final zzcxu f20643d;

            {
                this.f20640a = this;
                this.f20641b = zzcxmVar;
                this.f20642c = zzcedVar;
                this.f20643d = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20640a.m18888c(this.f20641b, this.f20642c, this.f20643d, obj);
            }
        }, this.f24785e);
        zzbbhVarM17366c.mo14748k(RunnableC7269vl.m15955a(zzcedVar), this.f24785e);
        return zzbbhVarM17366c;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        return (zzcxqVar == null || zzcxqVar.f25278a == null) ? false : true;
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m18888c(final zzcxm zzcxmVar, zzced zzcedVar, zzcxu zzcxuVar, Object obj) throws Exception {
        final zzbgz zzbgzVarM18682b = this.f24782b.m18682b(this.f24784d.f25294e);
        zzbgzVarM18682b.mo14938x(zzcxmVar.f25240M);
        zzcedVar.m18696a(this.f24781a, zzbgzVarM18682b.getView());
        final zzbbr zzbbrVar = new zzbbr();
        final zzcdc zzcdcVarMo15433a = this.f24783c.mo15433a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzcdd(new zzbwz(this, zzbgzVarM18682b, zzcxmVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.yl

            /* renamed from: a */
            private final zzcnl f21308a;

            /* renamed from: b */
            private final zzbgz f21309b;

            /* renamed from: c */
            private final zzcxm f21310c;

            /* renamed from: d */
            private final zzbbr f21311d;

            {
                this.f21308a = this;
                this.f21309b = zzbgzVarM18682b;
                this.f21310c = zzcxmVar;
                this.f21311d = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                this.f21308a.m18889d(this.f21309b, this.f21310c, this.f21311d, z, context);
            }
        }, zzbgzVarM18682b));
        zzbbrVar.m17385a(zzcdcVarMo15433a);
        zzahx.m16579b(zzbgzVarM18682b, zzcdcVarMo15433a.mo15508k());
        zzbrt zzbrtVarMo14757d = zzcdcVarMo15433a.mo14757d();
        zzbrw zzbrwVar = new zzbrw(zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.zl

            /* renamed from: f */
            private final zzbgz f21467f;

            {
                this.f21467f = zzbgzVarM18682b;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f21467f;
                if (zzbgzVar.mo14926p() != null) {
                    zzbgzVar.mo14926p().mo17683e();
                }
            }
        };
        Executor executor = zzbbm.f22758b;
        zzbrtVarMo14757d.m18332V(zzbrwVar, executor);
        zzcdcVarMo15433a.mo15504g().m18691i(zzbgzVarM18682b, true);
        zzcdcVarMo15433a.mo15504g();
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        zzbbh<?> zzbbhVarM18683a = zzcdp.m18683a(zzbgzVarM18682b, zzcxqVar.f25279b, zzcxqVar.f25278a);
        if (zzcxmVar.f25232E) {
            zzbbhVarM18683a.mo14748k(new Runnable(zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.am

                /* renamed from: f */
                private final zzbgz f18172f;

                {
                    this.f18172f = zzbgzVarM18682b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18172f.mo14920l0();
                }
            }, this.f24785e);
        }
        zzbbhVarM18683a.mo14748k(new Runnable(zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.bm

            /* renamed from: f */
            private final zzbgz f18347f;

            {
                this.f18347f = zzbgzVarM18682b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18347f.mo14887O();
            }
        }, this.f24785e);
        return zzbar.m17367d(zzbbhVarM18683a, new zzbam(zzcdcVarMo15433a) { // from class: com.google.android.gms.internal.ads.cm

            /* renamed from: a */
            private final zzcdc f18459a;

            {
                this.f18459a = zzcdcVarMo15433a;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj2) {
                return this.f18459a.mo15507j();
            }
        }, executor);
    }

    /* renamed from: d */
    final /* synthetic */ void m18889d(zzbgz zzbgzVar, zzcxm zzcxmVar, zzbbr zzbbrVar, boolean z, Context context) {
        zzbgz zzbgzVar2;
        try {
            zzcdc zzcdcVar = (zzcdc) zzbbrVar.get();
            if (zzbgzVar.mo14927p0()) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21731X0)).booleanValue()) {
                    final zzbgz zzbgzVarM18682b = this.f24782b.m18682b(this.f24784d.f25294e);
                    zzahx.m16579b(zzbgzVarM18682b, zzcdcVar.mo15508k());
                    final zzced zzcedVar = new zzced();
                    zzcedVar.m18696a(this.f24781a, zzbgzVarM18682b.getView());
                    zzcdcVar.mo15504g().m18691i(zzbgzVarM18682b, true);
                    zzbgzVarM18682b.mo14926p().mo17687i(new zzbij(zzcedVar, zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.wl

                        /* renamed from: a */
                        private final zzced f20858a;

                        /* renamed from: b */
                        private final zzbgz f20859b;

                        {
                            this.f20858a = zzcedVar;
                            this.f20859b = zzbgzVarM18682b;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbij
                        public final void zzae(boolean z2) {
                            zzced zzcedVar2 = this.f20858a;
                            zzbgz zzbgzVar3 = this.f20859b;
                            zzcedVar2.m18697b();
                            zzbgzVar3.mo14887O();
                            zzbgzVar3.mo14926p().mo17683e();
                        }
                    });
                    zzbgzVarM18682b.mo14926p().mo17688j(C7343xl.m16045b(zzbgzVarM18682b));
                    zzcxq zzcxqVar = zzcxmVar.f25258p;
                    zzbgzVarM18682b.mo14879G(zzcxqVar.f25279b, zzcxqVar.f25278a, null);
                    zzbgzVar2 = zzbgzVarM18682b;
                }
                zzbgzVar2.mo14916j0(true);
                zzk.zzlg();
                com.google.android.gms.ads.internal.zzh zzhVar = new com.google.android.gms.ads.internal.zzh(false, zzaxi.m17128H(this.f24781a), false, 0.0f, -1, z, zzcxmVar.f25233F, zzcxmVar.f25234G);
                zzk.zzlf();
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzcdc) zzbbrVar.get()).mo15506i(), null, zzbgzVar2, zzcxmVar.f25235H, this.f24786f, zzcxmVar.f25267y, zzhVar), true);
            }
            zzbgzVar2 = zzbgzVar;
            zzbgzVar2.mo14916j0(true);
            zzk.zzlg();
            com.google.android.gms.ads.internal.zzh zzhVar2 = new com.google.android.gms.ads.internal.zzh(false, zzaxi.m17128H(this.f24781a), false, 0.0f, -1, z, zzcxmVar.f25233F, zzcxmVar.f25234G);
            zzk.zzlf();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzcdc) zzbbrVar.get()).mo15506i(), null, zzbgzVar2, zzcxmVar.f25235H, this.f24786f, zzcxmVar.f25267y, zzhVar2), true);
        } catch (Exception unused) {
        }
    }
}
