package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2811o5 extends AbstractC2873x5 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f35488d;

    /* renamed from: e, reason: collision with root package name */
    private A f35489e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f35490f;

    protected C2811o5(C2880y5 c2880y5) {
        super(c2880y5);
        this.f35488d = (AlarmManager) a().getSystemService("alarm");
    }

    private final int B() {
        if (this.f35490f == null) {
            this.f35490f = Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f35490f.intValue();
    }

    private final PendingIntent C() {
        Context contextA = a();
        return com.google.android.gms.internal.measurement.B0.a(contextA, 0, new Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B0.f33662a);
    }

    private final A D() {
        if (this.f35489e == null) {
            this.f35489e = new C2831r5(this, this.f35538b.G0());
        }
        return this.f35489e;
    }

    @TargetApi(24)
    private final void E() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(B());
        }
    }

    public final void A() {
        v();
        k().L().a("Unscheduling upload");
        AlarmManager alarmManager = this.f35488d;
        if (alarmManager != null) {
            alarmManager.cancel(C());
        }
        D().a();
        E();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ N5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2812p r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2866w5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        AlarmManager alarmManager = this.f35488d;
        if (alarmManager != null) {
            alarmManager.cancel(C());
        }
        E();
        return false;
    }

    public final void z(long j10) {
        v();
        Context contextA = a();
        if (!Q5.e0(contextA)) {
            k().G().a("Receiver not registered/enabled");
        }
        if (!Q5.f0(contextA, false)) {
            k().G().a("Service not registered/enabled");
        }
        A();
        k().L().b("Scheduling upload, millis", Long.valueOf(j10));
        b().c();
        if (j10 < Math.max(0L, K.f34921H.a(null).longValue()) && !D().e()) {
            D().b(j10);
        }
        Context contextA2 = a();
        ComponentName componentName = new ComponentName(contextA2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iB = B();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.A0.c(contextA2, new JobInfo.Builder(iB, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
