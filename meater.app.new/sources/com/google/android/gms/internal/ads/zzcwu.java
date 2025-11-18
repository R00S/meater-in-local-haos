package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcwu implements zzcva<zzcwt> {

    /* renamed from: a */
    private zzaqm f25209a;

    /* renamed from: b */
    private ScheduledExecutorService f25210b;

    /* renamed from: c */
    private Context f25211c;

    public zzcwu(zzaqm zzaqmVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f25209a = zzaqmVar;
        this.f25210b = scheduledExecutorService;
        this.f25211c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcwt> mo14982b() {
        return zzbar.m17367d(zzbar.m17365b(this.f25209a.mo16878a(this.f25211c), ((Long) zzyt.m20848e().m16421c(zzacu.f21836n3)).longValue(), TimeUnit.MILLISECONDS, this.f25210b), C7125rp.f20468a, zzaxg.f22651a);
    }
}
