package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzckb implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final zzboc f24424a;

    /* renamed from: b */
    private final Context f24425b;

    /* renamed from: c */
    private final zzcdn f24426c;

    /* renamed from: d */
    private final zzcxv f24427d;

    /* renamed from: e */
    private final Executor f24428e;

    /* renamed from: f */
    private final zzbam<zzcxm, zzayb> f24429f;

    public zzckb(zzboc zzbocVar, Context context, Executor executor, zzcdn zzcdnVar, zzcxv zzcxvVar, zzbam<zzcxm, zzayb> zzbamVar) {
        this.f24425b = context;
        this.f24424a = zzbocVar;
        this.f24428e = executor;
        this.f24426c = zzcdnVar;
        this.f24427d = zzcxvVar;
        this.f24429f = zzbamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzbnf> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        return zzbar.m17366c(zzbar.m17378o(null), new zzbal(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.fk

            /* renamed from: a */
            private final zzckb f18899a;

            /* renamed from: b */
            private final zzcxu f18900b;

            /* renamed from: c */
            private final zzcxm f18901c;

            {
                this.f18899a = this;
                this.f18900b = zzcxuVar;
                this.f18901c = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18899a.m18853c(this.f18900b, this.f18901c, obj);
            }
        }, this.f24428e);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        return (zzcxqVar == null || zzcxqVar.f25278a == null) ? false : true;
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m18853c(zzcxu zzcxuVar, zzcxm zzcxmVar, Object obj) throws Exception {
        zzyd zzydVarM19058a = zzcxy.m19058a(this.f24425b, zzcxmVar.f25260r);
        final zzbgz zzbgzVarM18682b = this.f24426c.m18682b(zzydVarM19058a);
        zzbgzVarM18682b.mo14938x(zzcxmVar.f25240M);
        final zzbng zzbngVarMo15068a = this.f24424a.mo15068a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbnk(new zzcec(this.f24425b, zzbgzVarM18682b.getView(), this.f24429f.mo14764a(zzcxmVar)), zzbgzVarM18682b, C6713gk.m15166a(zzbgzVarM18682b), zzydVarM19058a.f27455n ? new zzcxn(-3, 0, true) : new zzcxn(zzydVarM19058a.f27451j, zzydVarM19058a.f27448g, false)));
        zzbngVarMo15068a.mo15107h().m18691i(zzbgzVarM18682b, false);
        zzbrt zzbrtVarMo14757d = zzbngVarMo15068a.mo14757d();
        zzbrw zzbrwVar = new zzbrw(zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.hk

            /* renamed from: f */
            private final zzbgz f19234f;

            {
                this.f19234f = zzbgzVarM18682b;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f19234f;
                if (zzbgzVar.mo14926p() != null) {
                    zzbgzVar.mo14926p().mo17683e();
                }
            }
        };
        Executor executor = zzbbm.f22758b;
        zzbrtVarMo14757d.m18332V(zzbrwVar, executor);
        zzbngVarMo15068a.mo15107h();
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        zzbbh<?> zzbbhVarM18683a = zzcdp.m18683a(zzbgzVarM18682b, zzcxqVar.f25279b, zzcxqVar.f25278a);
        if (zzcxmVar.f25232E) {
            zzbbhVarM18683a.mo14748k(RunnableC6787ik.m15351a(zzbgzVarM18682b), this.f24428e);
        }
        zzbbhVarM18683a.mo14748k(new Runnable(this, zzbgzVarM18682b) { // from class: com.google.android.gms.internal.ads.jk

            /* renamed from: f */
            private final zzckb f19486f;

            /* renamed from: g */
            private final zzbgz f19487g;

            {
                this.f19486f = this;
                this.f19487g = zzbgzVarM18682b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19486f.m18854d(this.f19487g);
            }
        }, this.f24428e);
        return zzbar.m17367d(zzbbhVarM18683a, new zzbam(zzbngVarMo15068a) { // from class: com.google.android.gms.internal.ads.kk

            /* renamed from: a */
            private final zzbng f19709a;

            {
                this.f19709a = zzbngVarMo15068a;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj2) {
                return this.f19709a.mo15106g();
            }
        }, executor);
    }

    /* renamed from: d */
    final /* synthetic */ void m18854d(zzbgz zzbgzVar) {
        zzbgzVar.mo14887O();
        zzbhq zzbhqVarMo14911h = zzbgzVar.mo14911h();
        zzacd zzacdVar = this.f24427d.f25291b;
        if (zzacdVar == null || zzbhqVarMo14911h == null) {
            return;
        }
        zzbhqVarMo14911h.m17710m7(zzacdVar);
    }
}
