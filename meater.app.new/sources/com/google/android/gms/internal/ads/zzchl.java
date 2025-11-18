package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzchl extends zzchj {

    /* renamed from: b */
    private static final Pattern f24322b = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: c */
    private final zzcgn f24323c;

    /* renamed from: d */
    private final zzbbl f24324d;

    /* renamed from: e */
    private final zzcxv f24325e;

    /* renamed from: f */
    private final ScheduledExecutorService f24326f;

    /* renamed from: g */
    private final zzcji f24327g;

    zzchl(zzbtg zzbtgVar, zzcxv zzcxvVar, zzcgn zzcgnVar, zzbbl zzbblVar, ScheduledExecutorService scheduledExecutorService, zzcji zzcjiVar) {
        super(zzbtgVar);
        this.f24325e = zzcxvVar;
        this.f24323c = zzcgnVar;
        this.f24324d = zzbblVar;
        this.f24326f = scheduledExecutorService;
        this.f24327g = zzcjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    /* renamed from: c */
    public final zzbbh<zzcxu> mo18792c(zzarx zzarxVar) throws zzcgm {
        zzbbh<zzcxu> zzbbhVarM17366c = zzbar.m17366c(this.f24323c.m18776b(zzarxVar), new zzbal(this) { // from class: com.google.android.gms.internal.ads.bj

            /* renamed from: a */
            private final zzchl f18344a;

            {
                this.f18344a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18344a.m18795f((InputStream) obj);
            }
        }, this.f24324d);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21873t4)).booleanValue()) {
            zzbbhVarM17366c = zzbar.m17368e(zzbar.m17365b(zzbbhVarM17366c, ((Integer) zzyt.m20848e().m16421c(zzacu.f21879u4)).intValue(), TimeUnit.SECONDS, this.f24326f), TimeoutException.class, C6564cj.f18455a, zzbbm.f22758b);
        }
        zzbar.m17369f(zzbbhVarM17366c, new C6601dj(this), zzbbm.f22758b);
        return zzbbhVarM17366c;
    }

    /* renamed from: f */
    final /* synthetic */ zzbbh m18795f(InputStream inputStream) throws Exception {
        return zzbar.m17378o(new zzcxu(new zzcxr(this.f24325e), zzcxs.m19023a(new InputStreamReader(inputStream))));
    }
}
