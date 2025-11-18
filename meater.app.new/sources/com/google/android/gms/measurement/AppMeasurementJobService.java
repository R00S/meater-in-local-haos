package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjm;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements zzjm {

    /* renamed from: f */
    private zzji<AppMeasurementJobService> f28527f;

    /* renamed from: c */
    private final zzji<AppMeasurementJobService> m22669c() {
        if (this.f28527f == null) {
            this.f28527f = new zzji<>(this);
        }
        return this.f28527f;
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    /* renamed from: a */
    public final void mo22670a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    @TargetApi(24)
    /* renamed from: b */
    public final void mo22671b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzjm
    /* renamed from: d */
    public final boolean mo22672d(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m22669c().m23385c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m22669c().m23389h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m22669c().m23391k(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return m22669c().m23388g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m22669c().m23390i(intent);
    }
}
