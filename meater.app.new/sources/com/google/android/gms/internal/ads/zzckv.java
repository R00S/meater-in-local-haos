package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzckv implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final zzboc f24455a;

    /* renamed from: b */
    private final zzckb f24456b;

    /* renamed from: c */
    private final zzbbl f24457c;

    /* renamed from: d */
    private final zzbrm f24458d;

    /* renamed from: e */
    private final ScheduledExecutorService f24459e;

    public zzckv(zzboc zzbocVar, zzckb zzckbVar, zzbrm zzbrmVar, ScheduledExecutorService scheduledExecutorService, zzbbl zzbblVar) {
        this.f24455a = zzbocVar;
        this.f24456b = zzckbVar;
        this.f24458d = zzbrmVar;
        this.f24459e = scheduledExecutorService;
        this.f24457c = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzbnf> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        return this.f24457c.submit(new Callable(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.rk

            /* renamed from: f */
            private final zzckv f20460f;

            /* renamed from: g */
            private final zzcxu f20461g;

            /* renamed from: h */
            private final zzcxm f20462h;

            {
                this.f20460f = this;
                this.f20461g = zzcxuVar;
                this.f20462h = zzcxmVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20460f.m18859d(this.f20461g, this.f20462h);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return zzcxuVar.f25288a.f25282a.m19024a() != null && this.f24456b.mo18847b(zzcxuVar, zzcxmVar);
    }

    /* renamed from: d */
    final /* synthetic */ zzbnf m18859d(final zzcxu zzcxuVar, final zzcxm zzcxmVar) throws Exception {
        return this.f24455a.mo15069b(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbop(zzcxuVar.f25288a.f25282a.m19024a(), new Runnable(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.sk

            /* renamed from: f */
            private final zzckv f20526f;

            /* renamed from: g */
            private final zzcxu f20527g;

            /* renamed from: h */
            private final zzcxm f20528h;

            {
                this.f20526f = this;
                this.f20527g = zzcxuVar;
                this.f20528h = zzcxmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20526f.m18860e(this.f20527g, this.f20528h);
            }
        })).mo15141a();
    }

    /* renamed from: e */
    final /* synthetic */ void m18860e(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzbar.m17369f(zzbar.m17365b(this.f24456b.mo18846a(zzcxuVar, zzcxmVar), zzcxmVar.f25236I, TimeUnit.SECONDS, this.f24459e), new C7194tk(this), this.f24457c);
    }
}
