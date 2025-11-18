package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbpk {

    /* renamed from: a */
    private final Executor f23447a;

    /* renamed from: b */
    private final ScheduledExecutorService f23448b;

    /* renamed from: c */
    private final zzbbh<zzbph> f23449c;

    /* renamed from: d */
    private volatile boolean f23450d = true;

    public zzbpk(Executor executor, ScheduledExecutorService scheduledExecutorService, zzbbh<zzbph> zzbbhVar) {
        this.f23447a = executor;
        this.f23448b = scheduledExecutorService;
        this.f23449c = zzbbhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m18235f(List<? extends zzbbh<? extends zzbpc>> list, final zzban<zzbpc> zzbanVar) {
        if (list == null || list.isEmpty()) {
            this.f23447a.execute(new Runnable(zzbanVar) { // from class: com.google.android.gms.internal.ads.hd

                /* renamed from: f */
                private final zzban f19227f;

                {
                    this.f19227f = zzbanVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19227f.mo14742a(new zzcgm(3));
                }
            });
            return;
        }
        zzbbh zzbbhVarM17378o = zzbar.m17378o(null);
        for (final zzbbh<? extends zzbpc> zzbbhVar : list) {
            zzbbhVarM17378o = zzbar.m17366c(zzbar.m17368e(zzbbhVarM17378o, Throwable.class, new zzbal(zzbanVar) { // from class: com.google.android.gms.internal.ads.id

                /* renamed from: a */
                private final zzban f19373a;

                {
                    this.f19373a = zzbanVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    this.f19373a.mo14742a((Throwable) obj);
                    return zzbar.m17378o(null);
                }
            }, this.f23447a), new zzbal(this, zzbanVar, zzbbhVar) { // from class: com.google.android.gms.internal.ads.jd

                /* renamed from: a */
                private final zzbpk f19477a;

                /* renamed from: b */
                private final zzban f19478b;

                /* renamed from: c */
                private final zzbbh f19479c;

                {
                    this.f19477a = this;
                    this.f19478b = zzbanVar;
                    this.f19479c = zzbbhVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.f19477a.m18238b(this.f19478b, this.f19479c, (zzbpc) obj);
                }
            }, this.f23447a);
        }
        zzbar.m17369f(zzbbhVarM17378o, new C6891ld(this, zzbanVar), this.f23447a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m18236g() {
        this.f23450d = false;
    }

    /* renamed from: a */
    public final boolean m18237a() {
        return this.f23450d;
    }

    /* renamed from: b */
    final /* synthetic */ zzbbh m18238b(zzban zzbanVar, zzbbh zzbbhVar, zzbpc zzbpcVar) throws Exception {
        if (zzbpcVar != null) {
            zzbanVar.mo14743b(zzbpcVar);
        }
        return zzbar.m17365b(zzbbhVar, ((Long) zzyt.m20848e().m16421c(zzacu.f21779e2)).longValue(), TimeUnit.MILLISECONDS, this.f23448b);
    }

    /* renamed from: c */
    public final void m18239c(zzban<zzbpc> zzbanVar) {
        zzbar.m17369f(this.f23449c, new C6854kd(this, zzbanVar), this.f23447a);
    }
}
