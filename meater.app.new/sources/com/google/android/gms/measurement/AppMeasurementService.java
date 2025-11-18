package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjm;
import p024c.p071o.p072a.AbstractC0991a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements zzjm {

    /* renamed from: f */
    private zzji<AppMeasurementService> f28529f;

    /* renamed from: c */
    private final zzji<AppMeasurementService> m22673c() {
        if (this.f28529f == null) {
            this.f28529f = new zzji<>(this);
        }
        return this.f28529f;
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    /* renamed from: a */
    public final void mo22670a(Intent intent) {
        AbstractC0991a.m6270c(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    /* renamed from: b */
    public final void mo22671b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    /* renamed from: d */
    public final boolean mo22672d(int i2) {
        return stopSelfResult(i2);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return m22673c().m23384b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m22673c().m23385c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m22673c().m23389h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m22673c().m23391k(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        return m22673c().m23383a(intent, i2, i3);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m22673c().m23390i(intent);
    }
}
