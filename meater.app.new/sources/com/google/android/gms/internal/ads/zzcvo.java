package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcvo implements zzcva<zzcvn> {

    /* renamed from: a */
    private final zzawi f25157a;

    /* renamed from: b */
    private final Context f25158b;

    /* renamed from: c */
    private final ScheduledExecutorService f25159c;

    /* renamed from: d */
    private final Executor f25160d;

    public zzcvo(zzawi zzawiVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f25157a = zzawiVar;
        this.f25158b = context;
        this.f25159c = scheduledExecutorService;
        this.f25160d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    final /* synthetic */ void m19002a(zzbbh zzbbhVar, zzbbr zzbbrVar) {
        String strM17308m;
        try {
            AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) zzbbhVar.get();
            if (info == null || !TextUtils.isEmpty(info.getId())) {
                strM17308m = null;
            } else {
                zzyt.m20844a();
                strM17308m = zzazt.m17308m(this.f25158b);
            }
            zzbbrVar.m17385a(new zzcvn(info, this.f25158b, strM17308m));
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            zzyt.m20844a();
            zzbbrVar.m17385a(new zzcvn(null, this.f25158b, zzazt.m17308m(this.f25158b)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcvn> mo14982b() {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21792g1)).booleanValue()) {
            return zzbar.m17375l(new Exception("Did not ad Ad ID into query param."));
        }
        final zzbbr zzbbrVar = new zzbbr();
        final zzbbh<AdvertisingIdClient.Info> zzbbhVarMo17027a = this.f25157a.mo17027a(this.f25158b);
        zzbbhVarMo17027a.mo14748k(new Runnable(this, zzbbhVarMo17027a, zzbbrVar) { // from class: com.google.android.gms.internal.ads.fp

            /* renamed from: f */
            private final zzcvo f18911f;

            /* renamed from: g */
            private final zzbbh f18912g;

            /* renamed from: h */
            private final zzbbr f18913h;

            {
                this.f18911f = this;
                this.f18912g = zzbbhVarMo17027a;
                this.f18913h = zzbbrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18911f.m19002a(this.f18912g, this.f18913h);
            }
        }, this.f25160d);
        this.f25159c.schedule(new Runnable(zzbbhVarMo17027a) { // from class: com.google.android.gms.internal.ads.gp

            /* renamed from: f */
            private final zzbbh f18988f;

            {
                this.f18988f = zzbbhVarMo17027a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18988f.cancel(true);
            }
        }, ((Long) zzyt.m20848e().m16421c(zzacu.f21798h1)).longValue(), TimeUnit.MILLISECONDS);
        return zzbbrVar;
    }
}
