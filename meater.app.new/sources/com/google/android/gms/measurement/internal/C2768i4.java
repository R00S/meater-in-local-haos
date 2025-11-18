package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.A2;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2768i4 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private JobScheduler f35405c;

    public C2768i4(P2 p22) {
        super(p22);
    }

    private final int F() {
        return ("measurement-client" + a().getPackageName()).hashCode();
    }

    @Override // com.google.android.gms.measurement.internal.B1
    @TargetApi(24)
    protected final void C() {
        this.f35405c = (JobScheduler) a().getSystemService("jobscheduler");
    }

    @TargetApi(24)
    public final void D(long j10) {
        z();
        n();
        JobScheduler jobScheduler = this.f35405c;
        if (jobScheduler != null && jobScheduler.getPendingJob(F()) != null) {
            k().L().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        A2.a aVarE = E();
        if (aVarE != A2.a.CLIENT_UPLOAD_ELIGIBLE) {
            k().L().b("[sgtm] Not eligible for Scion upload", aVarE.name());
            return;
        }
        k().L().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        k().L().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) C3445p.k(this.f35405c)).schedule(new JobInfo.Builder(F(), new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    final A2.a E() {
        z();
        n();
        return !c().u(K.f34932M0) ? A2.a.CLIENT_FLAG_OFF : this.f35405c == null ? A2.a.MISSING_JOB_SCHEDULER : !c().w() ? A2.a.NOT_ENABLED_IN_MANIFEST : !c().u(K.f34936O0) ? A2.a.SDK_TOO_OLD : !Q5.v0(a(), "com.google.android.gms.measurement.AppMeasurementJobService") ? A2.a.MEASUREMENT_SERVICE_NOT_ENABLED : !v().p0() ? A2.a.NON_PLAY_MODE : A2.a.CLIENT_UPLOAD_ELIGIBLE;
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

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2707a p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2717b2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2731d2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2843t3 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2768i4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2796m4 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2837s4 v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2727c5 w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.B1
    protected final boolean y() {
        return true;
    }
}
