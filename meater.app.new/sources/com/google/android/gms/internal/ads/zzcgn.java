package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcgn {

    /* renamed from: a */
    private final zzbbl f24278a;

    /* renamed from: b */
    private final zzbbl f24279b;

    /* renamed from: c */
    private final zzchv f24280c;

    /* renamed from: d */
    private final zzdte<zzcig> f24281d;

    public zzcgn(zzbbl zzbblVar, zzbbl zzbblVar2, zzchv zzchvVar, zzdte<zzcig> zzdteVar) {
        this.f24278a = zzbblVar;
        this.f24279b = zzbblVar2;
        this.f24280c = zzchvVar;
        this.f24281d = zzdteVar;
    }

    /* renamed from: a */
    final /* synthetic */ zzbbh m18775a(zzarx zzarxVar, zzcie zzcieVar) throws Exception {
        return this.f24281d.get().m18806j7(zzarxVar);
    }

    /* renamed from: b */
    public final zzbbh<InputStream> m18776b(final zzarx zzarxVar) {
        final zzbbh<InputStream> zzbbhVarM17368e;
        String str = zzarxVar.f22414i;
        zzk.zzlg();
        if (zzaxi.m17138V(str)) {
            zzbbhVarM17368e = zzbar.m17375l(new zzcie(0));
        } else {
            zzbbhVarM17368e = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21885v4)).booleanValue() ? zzbar.m17368e(this.f24278a.submit(new Callable(this, zzarxVar) { // from class: com.google.android.gms.internal.ads.si

                /* renamed from: f */
                private final zzcgn f20523f;

                /* renamed from: g */
                private final zzarx f20524g;

                {
                    this.f20523f = this;
                    this.f20524g = zzarxVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20523f.m18777c(this.f20524g);
                }
            }), ExecutionException.class, C7192ti.f20572a, this.f24279b) : this.f24280c.m18800b(zzarxVar);
        }
        zzbbh<InputStream> zzbbhVarM17368e2 = zzbar.m17368e(zzbbhVarM17368e, zzcie.class, new zzbal(this, zzarxVar) { // from class: com.google.android.gms.internal.ads.ui

            /* renamed from: a */
            private final zzcgn f20633a;

            /* renamed from: b */
            private final zzarx f20634b;

            {
                this.f20633a = this;
                this.f20634b = zzarxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20633a.m18775a(this.f20634b, (zzcie) obj);
            }
        }, this.f24279b);
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21885v4)).booleanValue()) {
            zzbbhVarM17368e2.mo14748k(new Runnable(zzbbhVarM17368e) { // from class: com.google.android.gms.internal.ads.vi

                /* renamed from: f */
                private final zzbbh f20744f;

                {
                    this.f20744f = zzbbhVarM17368e;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20744f.cancel(true);
                }
            }, zzbbm.f22758b);
        }
        return zzbbhVarM17368e2;
    }

    /* renamed from: c */
    final /* synthetic */ InputStream m18777c(zzarx zzarxVar) throws Exception {
        return this.f24280c.m18800b(zzarxVar).get(((Integer) zzyt.m20848e().m16421c(zzacu.f21879u4)).intValue(), TimeUnit.SECONDS);
    }
}
