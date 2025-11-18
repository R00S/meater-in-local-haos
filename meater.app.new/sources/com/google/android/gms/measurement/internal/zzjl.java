package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzj;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjl extends AbstractC7833u2 {

    /* renamed from: c */
    private Handler f29349c;

    /* renamed from: d */
    protected C7658a7 f29350d;

    /* renamed from: e */
    protected C7873y6 f29351e;

    /* renamed from: f */
    private C7864x6 f29352f;

    zzjl(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29350d = new C7658a7(this);
        this.f29351e = new C7873y6(this);
        this.f29352f = new C7864x6(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m23392B(long j2) {
        mo22792d();
        m23395H();
        mo22836h().m23145P().m23148b("Activity resumed, time", Long.valueOf(j2));
        this.f29352f.m22873a(j2);
        this.f29351e.m22878b(j2);
        this.f29350d.m22699a(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m23395H() {
        mo22792d();
        if (this.f29349c == null) {
            this.f29349c = new zzj(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m23397J(long j2) {
        mo22792d();
        m23395H();
        mo22836h().m23145P().m23148b("Activity paused, time", Long.valueOf(j2));
        this.f29352f.m22874b(j2);
        this.f29351e.m22881f(j2);
        C7658a7 c7658a7 = this.f29350d;
        if (c7658a7.f28551b.mo22841n().m23564B(c7658a7.f28551b.mo22795q().m23110C(), zzap.f29136c0)) {
            c7658a7.f28551b.mo22840m().f28873z.m23157a(true);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7833u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return false;
    }

    /* renamed from: E */
    public final boolean m23399E(boolean z, boolean z2) {
        return this.f29351e.m22879d(z, z2);
    }

    /* renamed from: F */
    protected final void m23400F() throws IllegalStateException {
        mo22835g().m23201z(new RunnableC7846v6(this, mo22837j().mo14609b()));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
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

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzb mo22793o() {
        return super.mo22793o();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzhc mo22794p() {
        return super.mo22794p();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzeq mo22795q() {
        return super.mo22795q();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzik mo22796r() {
        return super.mo22796r();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ zzif mo22797s() {
        return super.mo22797s();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzep mo22798t() {
        return super.mo22798t();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzjl mo22799u() {
        return super.mo22799u();
    }
}
