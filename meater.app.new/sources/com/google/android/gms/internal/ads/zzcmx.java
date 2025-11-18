package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcmx<AdT> implements zzbal<zzcxu, AdT> {

    /* renamed from: a */
    private final zzczt f24744a;

    /* renamed from: b */
    private final zzbrm f24745b;

    /* renamed from: c */
    private final zzdae f24746c;

    /* renamed from: d */
    private final Executor f24747d;

    /* renamed from: e */
    private final ScheduledExecutorService f24748e;

    /* renamed from: f */
    private final zzbpe<AdT> f24749f;

    /* renamed from: g */
    private final zzcmu f24750g;

    public zzcmx(zzczt zzcztVar, zzcmu zzcmuVar, zzbrm zzbrmVar, zzdae zzdaeVar, zzbpe<AdT> zzbpeVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f24744a = zzcztVar;
        this.f24750g = zzcmuVar;
        this.f24745b = zzbrmVar;
        this.f24746c = zzdaeVar;
        this.f24749f = zzbpeVar;
        this.f24747d = executor;
        this.f24748e = scheduledExecutorService;
    }

    /* renamed from: b */
    final /* synthetic */ zzbbh m18886b(zzcxm zzcxmVar, zzcjv zzcjvVar, zzcxu zzcxuVar, Throwable th) throws Exception {
        return this.f24750g.m18884b(zzcxmVar, zzbar.m17365b(zzcjvVar.mo18846a(zzcxuVar, zzcxmVar), zzcxmVar.f25236I, TimeUnit.MILLISECONDS, this.f24748e));
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh zzf(zzcxu zzcxuVar) throws Exception {
        final zzcxu zzcxuVar2 = zzcxuVar;
        zzcze zzczeVarM19112f = this.f24744a.m19100g(zzczs.RENDER_CONFIG_INIT).m19105c(zzbar.m17375l(new zzcmw("No ad configs", 3))).m19112f();
        this.f24745b.m18332V(new zzbmd(zzcxuVar2, this.f24746c), this.f24747d);
        int i2 = 0;
        for (final zzcxm zzcxmVar : zzcxuVar2.f25289b.f25283a) {
            Iterator<String> it = zzcxmVar.f25243a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                final zzcjv<AdT> zzcjvVarMo15596a = this.f24749f.mo15596a(zzcxmVar.f25244b, next);
                if (zzcjvVarMo15596a != null && zzcjvVarMo15596a.mo18847b(zzcxuVar2, zzcxmVar)) {
                    zzczl<I> zzczlVarM19099c = this.f24744a.m19099c(zzczs.RENDER_CONFIG_WATERFALL, zzczeVarM19112f);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(next);
                    zzczeVarM19112f = zzczlVarM19099c.m19115i(sb.toString()).m19110d(Throwable.class, new zzbal(this, zzcxmVar, zzcjvVarMo15596a, zzcxuVar2) { // from class: com.google.android.gms.internal.ads.ol

                        /* renamed from: a */
                        private final zzcmx f20199a;

                        /* renamed from: b */
                        private final zzcxm f20200b;

                        /* renamed from: c */
                        private final zzcjv f20201c;

                        /* renamed from: d */
                        private final zzcxu f20202d;

                        {
                            this.f20199a = this;
                            this.f20200b = zzcxmVar;
                            this.f20201c = zzcjvVarMo15596a;
                            this.f20202d = zzcxuVar2;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbal
                        public final zzbbh zzf(Object obj) {
                            return this.f20199a.m18886b(this.f20200b, this.f20201c, this.f20202d, (Throwable) obj);
                        }
                    }).m19112f();
                    break;
                }
            }
            i2++;
        }
        return zzczeVarM19112f;
    }
}
