package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2497i1;
import com.google.android.gms.measurement.internal.Z4;
import g7.C3445p;
import java.util.Objects;
import v7.i0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Z4<T extends Context & v7.i0> {

    /* renamed from: a, reason: collision with root package name */
    private final T f35244a;

    public Z4(T t10) {
        C3445p.k(t10);
        this.f35244a = t10;
    }

    public static /* synthetic */ void d(Z4 z42, int i10, C2759h2 c2759h2, Intent intent) {
        if (z42.f35244a.g(i10)) {
            c2759h2.L().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            z42.k().L().a("Completed wakeful intent.");
            z42.f35244a.a(intent);
        }
    }

    public static /* synthetic */ void e(Z4 z42, JobParameters jobParameters) {
        Log.v("FA", "AppMeasurementJobService processed last Scion upload request.");
        z42.f35244a.b(jobParameters, false);
    }

    public static /* synthetic */ void f(Z4 z42, C2759h2 c2759h2, JobParameters jobParameters) {
        c2759h2.L().a("AppMeasurementJobService processed last upload request.");
        z42.f35244a.b(jobParameters, false);
    }

    private final void g(C2880y5 c2880y5, Runnable runnable) {
        c2880y5.o().E(new RunnableC2713a5(this, c2880y5, runnable));
    }

    private final C2759h2 k() {
        return P2.c(this.f35244a, null, null).k();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        final C2759h2 c2759h2K = P2.c(this.f35244a, null, null).k();
        if (intent == null) {
            c2759h2K.M().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c2759h2K.L().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            g(C2880y5.n(this.f35244a), new Runnable() { // from class: v7.h0
                @Override // java.lang.Runnable
                public final void run() {
                    Z4.d(this.f51563B, i11, c2759h2K, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().H().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new S2(C2880y5.n(this.f35244a));
        }
        k().M().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        P2.c(this.f35244a, null, null).k().L().a("Local AppMeasurementService is starting up");
    }

    @TargetApi(24)
    public final boolean h(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) C3445p.k(string);
            C2880y5 c2880y5N = C2880y5.n(this.f35244a);
            final C2759h2 c2759h2K = c2880y5N.k();
            c2759h2K.L().b("Local AppMeasurementJobService called. action", str);
            g(c2880y5N, new Runnable() { // from class: v7.g0
                @Override // java.lang.Runnable
                public final void run() {
                    Z4.f(this.f51560B, c2759h2K, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C2497i1 c2497i1E = C2497i1.e(this.f35244a);
        if (!K.f34936O0.a(null).booleanValue()) {
            return true;
        }
        c2497i1E.r(new Runnable() { // from class: v7.f0
            @Override // java.lang.Runnable
            public final void run() {
                Z4.e(this.f51558B, jobParameters);
            }
        });
        return true;
    }

    public final void i() {
        P2.c(this.f35244a, null, null).k().L().a("Local AppMeasurementService is shutting down");
    }

    public final void j(Intent intent) {
        if (intent == null) {
            k().H().a("onRebind called with null intent");
        } else {
            k().L().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean l(Intent intent) {
        if (intent == null) {
            k().H().a("onUnbind called with null intent");
            return true;
        }
        k().L().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
