package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.Z4;
import v7.i0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements i0 {

    /* renamed from: B, reason: collision with root package name */
    private Z4<AppMeasurementService> f34729B;

    private final Z4<AppMeasurementService> c() {
        if (this.f34729B == null) {
            this.f34729B = new Z4<>(this);
        }
        return this.f34729B;
    }

    @Override // v7.i0
    public final void a(Intent intent) {
        N1.a.b(intent);
    }

    @Override // v7.i0
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // v7.i0
    public final boolean g(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().l(intent);
    }
}
