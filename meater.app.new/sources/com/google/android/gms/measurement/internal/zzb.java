package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzb extends C7744k3 {

    /* renamed from: b */
    private final Map<String, Long> f29183b;

    /* renamed from: c */
    private final Map<String, Integer> f29184c;

    /* renamed from: d */
    private long f29185d;

    public zzb(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29184c = new C0867a();
        this.f29183b = new C0867a();
    }

    /* renamed from: A */
    private final void m23068A(String str, long j2, zzig zzigVar) {
        if (zzigVar == null) {
            mo22836h().m23145P().m23147a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            mo22836h().m23145P().m23148b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        zzif.m23331I(zzigVar, bundle, true);
        mo22794p().m23281S("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m23069B(long j2) {
        Iterator<String> it = this.f29183b.keySet().iterator();
        while (it.hasNext()) {
            this.f29183b.put(it.next(), Long.valueOf(j2));
        }
        if (this.f29183b.isEmpty()) {
            return;
        }
        this.f29185d = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m23071E(String str, long j2) {
        mo22790b();
        mo22792d();
        Preconditions.m14368g(str);
        if (this.f29184c.isEmpty()) {
            this.f29185d = j2;
        }
        Integer num = this.f29184c.get(str);
        if (num != null) {
            this.f29184c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f29184c.size() >= 100) {
            mo22836h().m23140K().m23147a("Too many ads visible");
        } else {
            this.f29184c.put(str, 1);
            this.f29183b.put(str, Long.valueOf(j2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m23072F(String str, long j2) {
        mo22790b();
        mo22792d();
        Preconditions.m14368g(str);
        Integer num = this.f29184c.get(str);
        if (num == null) {
            mo22836h().m23137H().m23148b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzig zzigVarM23338L = mo22797s().m23338L();
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            this.f29184c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.f29184c.remove(str);
        Long l = this.f29183b.get(str);
        if (l == null) {
            mo22836h().m23137H().m23147a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j2 - l.longValue();
            this.f29183b.remove(str);
            m23068A(str, jLongValue, zzigVarM23338L);
        }
        if (this.f29184c.isEmpty()) {
            long j3 = this.f29185d;
            if (j3 == 0) {
                mo22836h().m23137H().m23147a("First ad exposure time was never set");
            } else {
                m23073w(j2 - j3, zzigVarM23338L);
                this.f29185d = 0L;
            }
        }
    }

    /* renamed from: w */
    private final void m23073w(long j2, zzig zzigVar) {
        if (zzigVar == null) {
            mo22836h().m23145P().m23147a("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            mo22836h().m23145P().m23148b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        zzif.m23331I(zzigVar, bundle, true);
        mo22794p().m23281S("am", "_xa", bundle);
    }

    /* renamed from: D */
    public final void m23076D(String str, long j2) {
        if (str == null || str.length() == 0) {
            mo22836h().m23137H().m23147a("Ad unit id must be a non-empty string");
        } else {
            mo22835g().m23201z(new RunnableC7823t1(this, str, j2));
        }
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

    /* renamed from: v */
    public final void m23077v(long j2) {
        zzig zzigVarM23338L = mo22797s().m23338L();
        for (String str : this.f29183b.keySet()) {
            m23068A(str, j2 - this.f29183b.get(str).longValue(), zzigVarM23338L);
        }
        if (!this.f29183b.isEmpty()) {
            m23073w(j2 - this.f29185d, zzigVarM23338L);
        }
        m23069B(j2);
    }

    /* renamed from: z */
    public final void m23078z(String str, long j2) {
        if (str == null || str.length() == 0) {
            mo22836h().m23137H().m23147a("Ad unit id must be a non-empty string");
        } else {
            mo22835g().m23201z(new RunnableC7650a(this, str, j2));
        }
    }
}
