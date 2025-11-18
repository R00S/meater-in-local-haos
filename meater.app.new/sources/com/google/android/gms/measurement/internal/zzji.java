package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjm;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzji<T extends Context & zzjm> {

    /* renamed from: a */
    private final T f29348a;

    public zzji(T t) {
        Preconditions.m14372k(t);
        this.f29348a = t;
    }

    /* renamed from: f */
    private final void m23381f(Runnable runnable) throws IllegalStateException {
        zzkc zzkcVarM23418c = zzkc.m23418c(this.f29348a);
        zzkcVarM23418c.mo22835g().m23201z(new RunnableC7819s6(this, zzkcVarM23418c, runnable));
    }

    /* renamed from: j */
    private final zzet m23382j() {
        return zzfx.m23203a(this.f29348a, null).mo22836h();
    }

    /* renamed from: a */
    public final int m23383a(final Intent intent, int i2, final int i3) throws IllegalStateException {
        zzfx zzfxVarM23203a = zzfx.m23203a(this.f29348a, null);
        final zzet zzetVarMo22836h = zzfxVarM23203a.mo22836h();
        if (intent == null) {
            zzetVarMo22836h.m23140K().m23147a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfxVarM23203a.mo22832G();
        zzetVarMo22836h.m23145P().m23149c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m23381f(new Runnable(this, i3, zzetVarMo22836h, intent) { // from class: com.google.android.gms.measurement.internal.r6

                /* renamed from: f */
                private final zzji f28881f;

                /* renamed from: g */
                private final int f28882g;

                /* renamed from: h */
                private final zzet f28883h;

                /* renamed from: i */
                private final Intent f28884i;

                {
                    this.f28881f = this;
                    this.f28882g = i3;
                    this.f28883h = zzetVarMo22836h;
                    this.f28884i = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f28881f.m23386d(this.f28882g, this.f28883h, this.f28884i);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m23384b(Intent intent) {
        if (intent == null) {
            m23382j().m23137H().m23147a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgc(zzkc.m23418c(this.f29348a));
        }
        m23382j().m23140K().m23148b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final void m23385c() {
        zzfx zzfxVarM23203a = zzfx.m23203a(this.f29348a, null);
        zzet zzetVarMo22836h = zzfxVarM23203a.mo22836h();
        zzfxVarM23203a.mo22832G();
        zzetVarMo22836h.m23145P().m23147a("Local AppMeasurementService is starting up");
    }

    /* renamed from: d */
    final /* synthetic */ void m23386d(int i2, zzet zzetVar, Intent intent) {
        if (this.f29348a.mo22672d(i2)) {
            zzetVar.m23145P().m23148b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            m23382j().m23145P().m23147a("Completed wakeful intent.");
            this.f29348a.mo22670a(intent);
        }
    }

    /* renamed from: e */
    final /* synthetic */ void m23387e(zzet zzetVar, JobParameters jobParameters) {
        zzetVar.m23145P().m23147a("AppMeasurementJobService processed last upload request.");
        this.f29348a.mo22671b(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: g */
    public final boolean m23388g(final JobParameters jobParameters) throws IllegalStateException {
        zzfx zzfxVarM23203a = zzfx.m23203a(this.f29348a, null);
        final zzet zzetVarMo22836h = zzfxVarM23203a.mo22836h();
        String string = jobParameters.getExtras().getString("action");
        zzfxVarM23203a.mo22832G();
        zzetVarMo22836h.m23145P().m23148b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m23381f(new Runnable(this, zzetVarMo22836h, jobParameters) { // from class: com.google.android.gms.measurement.internal.t6

            /* renamed from: f */
            private final zzji f28922f;

            /* renamed from: g */
            private final zzet f28923g;

            /* renamed from: h */
            private final JobParameters f28924h;

            {
                this.f28922f = this;
                this.f28923g = zzetVarMo22836h;
                this.f28924h = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28922f.m23387e(this.f28923g, this.f28924h);
            }
        });
        return true;
    }

    /* renamed from: h */
    public final void m23389h() {
        zzfx zzfxVarM23203a = zzfx.m23203a(this.f29348a, null);
        zzet zzetVarMo22836h = zzfxVarM23203a.mo22836h();
        zzfxVarM23203a.mo22832G();
        zzetVarMo22836h.m23145P().m23147a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: i */
    public final boolean m23390i(Intent intent) {
        if (intent == null) {
            m23382j().m23137H().m23147a("onUnbind called with null intent");
            return true;
        }
        m23382j().m23145P().m23148b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final void m23391k(Intent intent) {
        if (intent == null) {
            m23382j().m23137H().m23147a("onRebind called with null intent");
        } else {
            m23382j().m23145P().m23148b("onRebind called. action", intent.getAction());
        }
    }
}
