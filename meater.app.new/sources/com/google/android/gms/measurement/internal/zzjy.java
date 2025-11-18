package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzh;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjy extends AbstractC7703f7 {

    /* renamed from: d */
    private final AlarmManager f29353d;

    /* renamed from: e */
    private final AbstractC7695f f29354e;

    /* renamed from: f */
    private Integer f29355f;

    protected zzjy(zzkc zzkcVar) {
        super(zzkcVar);
        this.f29353d = (AlarmManager) mo22834f().getSystemService("alarm");
        this.f29354e = new C7694e7(this, zzkcVar.m23455g0(), zzkcVar);
    }

    /* renamed from: A */
    private final PendingIntent m23401A() {
        Context contextMo22834f = mo22834f();
        return PendingIntent.getBroadcast(contextMo22834f, 0, new Intent().setClassName(contextMo22834f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @TargetApi(24)
    /* renamed from: y */
    private final void m23402y() {
        JobScheduler jobScheduler = (JobScheduler) mo22834f().getSystemService("jobscheduler");
        int iM23403z = m23403z();
        mo22836h().m23145P().m23148b("Cancelling job. JobID", Integer.valueOf(iM23403z));
        jobScheduler.cancel(iM23403z);
    }

    /* renamed from: z */
    private final int m23403z() {
        if (this.f29355f == null) {
            String strValueOf = String.valueOf(mo22834f().getPackageName());
            this.f29355f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f29355f.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C7802q7 mo22783o() {
        return super.mo22783o();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzkg mo22784p() {
        return super.mo22784p();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C7668c mo22785q() {
        return super.mo22785q();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzfr mo22786r() {
        return super.mo22786r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7703f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        this.f29353d.cancel(m23401A());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m23402y();
        return false;
    }

    /* renamed from: w */
    public final void m23404w(long j2) {
        m22778t();
        mo22832G();
        Context contextMo22834f = mo22834f();
        if (!zzfn.m23169b(contextMo22834f)) {
            mo22836h().m23144O().m23147a("Receiver not registered/enabled");
        }
        if (!zzkk.m23500U(contextMo22834f, false)) {
            mo22836h().m23144O().m23147a("Service not registered/enabled");
        }
        m23405x();
        long jMo14609b = mo22837j().mo14609b() + j2;
        if (j2 < Math.max(0L, zzap.f29089E.m23095a(null).longValue()) && !this.f29354e.m22775d()) {
            mo22836h().m23145P().m23147a("Scheduling upload with DelayedRunnable");
            this.f29354e.m22774c(j2);
        }
        mo22832G();
        if (Build.VERSION.SDK_INT < 24) {
            mo22836h().m23145P().m23147a("Scheduling upload with AlarmManager");
            this.f29353d.setInexactRepeating(2, jMo14609b, Math.max(zzap.f29181z.m23095a(null).longValue(), j2), m23401A());
            return;
        }
        mo22836h().m23145P().m23147a("Scheduling upload with JobScheduler");
        Context contextMo22834f2 = mo22834f();
        ComponentName componentName = new ComponentName(contextMo22834f2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM23403z = m23403z();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(iM23403z, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build();
        mo22836h().m23145P().m23148b("Scheduling job. JobID", Integer.valueOf(iM23403z));
        zzh.m22326b(contextMo22834f2, jobInfoBuild, "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: x */
    public final void m23405x() {
        m22778t();
        this.f29353d.cancel(m23401A());
        this.f29354e.m22776e();
        if (Build.VERSION.SDK_INT >= 24) {
            m23402y();
        }
    }
}
