package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Z4;
import v7.i0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements i0 {

    /* renamed from: B, reason: collision with root package name */
    private Z4<AppMeasurementJobService> f34727B;

    private final Z4<AppMeasurementJobService> c() {
        if (this.f34727B == null) {
            this.f34727B = new Z4<>(this);
        }
        return this.f34727B;
    }

    @Override // v7.i0
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // v7.i0
    public final boolean g(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().i();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().j(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().h(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().l(intent);
    }

    @Override // v7.i0
    public final void a(Intent intent) {
    }
}
