package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwq implements zzcva<zzcwp> {

    /* renamed from: a */
    private zzamg f25200a;

    /* renamed from: b */
    private ScheduledExecutorService f25201b;

    /* renamed from: c */
    private boolean f25202c;

    /* renamed from: d */
    private ApplicationInfo f25203d;

    public zzcwq(zzamg zzamgVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f25200a = zzamgVar;
        this.f25201b = scheduledExecutorService;
        this.f25202c = z;
        this.f25203d = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcwp> mo14982b() {
        if (!this.f25202c) {
            return zzbar.m17375l(new Exception("Auto Collect Location is false."));
        }
        return zzbar.m17367d(zzbar.m17365b(this.f25200a.mo16669a(this.f25203d), ((Long) zzyt.m20848e().m16421c(zzacu.f21733X2)).longValue(), TimeUnit.MILLISECONDS, this.f25201b), C7088qp.f20403a, zzaxg.f22651a);
    }
}
