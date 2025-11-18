package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes2.dex */
final class C7873y6 {

    /* renamed from: a */
    @VisibleForTesting
    private long f29012a;

    /* renamed from: b */
    @VisibleForTesting
    private long f29013b;

    /* renamed from: c */
    private final AbstractC7695f f29014c;

    /* renamed from: d */
    private final /* synthetic */ zzjl f29015d;

    public C7873y6(zzjl zzjlVar) {
        this.f29015d = zzjlVar;
        this.f29014c = new C7667b7(this, zzjlVar.f28874a);
        long jMo14609b = zzjlVar.mo22837j().mo14609b();
        this.f29012a = jMo14609b;
        this.f29013b = jMo14609b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m22876g() {
        this.f29015d.mo22792d();
        m22879d(false, false);
        this.f29015d.mo22793o().m23077v(this.f29015d.mo22837j().mo14609b());
    }

    /* renamed from: a */
    final void m22877a() {
        this.f29014c.m22776e();
        this.f29012a = 0L;
        this.f29013b = 0L;
    }

    /* renamed from: b */
    final void m22878b(long j2) {
        this.f29015d.mo22792d();
        this.f29014c.m22776e();
        this.f29012a = j2;
        this.f29013b = j2;
    }

    /* renamed from: d */
    public final boolean m22879d(boolean z, boolean z2) {
        this.f29015d.mo22792d();
        this.f29015d.m22857x();
        long jMo14609b = this.f29015d.mo22837j().mo14609b();
        this.f29015d.mo22840m().f28870w.m23156b(this.f29015d.mo22837j().mo14608a());
        long j2 = jMo14609b - this.f29012a;
        if (!z && j2 < 1000) {
            this.f29015d.mo22836h().m23145P().m23148b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        this.f29015d.mo22840m().f28871x.m23156b(j2);
        this.f29015d.mo22836h().m23145P().m23148b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzif.m23331I(this.f29015d.mo22797s().m23338L(), bundle, true);
        if (this.f29015d.mo22841n().m23580T(this.f29015d.mo22795q().m23110C())) {
            if (this.f29015d.mo22841n().m23564B(this.f29015d.mo22795q().m23110C(), zzap.f29150j0)) {
                if (!z2) {
                    m22880e();
                }
            } else if (z2) {
                bundle.putLong("_fr", 1L);
            } else {
                m22880e();
            }
        }
        if (!this.f29015d.mo22841n().m23564B(this.f29015d.mo22795q().m23110C(), zzap.f29150j0) || !z2) {
            this.f29015d.mo22794p().m23281S("auto", "_e", bundle);
        }
        this.f29012a = jMo14609b;
        this.f29014c.m22776e();
        this.f29014c.m22774c(Math.max(0L, 3600000 - this.f29015d.mo22840m().f28871x.m23155a()));
        return true;
    }

    @VisibleForTesting
    /* renamed from: e */
    final long m22880e() {
        long jMo14609b = this.f29015d.mo22837j().mo14609b();
        long j2 = jMo14609b - this.f29013b;
        this.f29013b = jMo14609b;
        return j2;
    }

    /* renamed from: f */
    final void m22881f(long j2) {
        this.f29014c.m22776e();
        if (this.f29012a != 0) {
            this.f29015d.mo22840m().f28871x.m23156b(this.f29015d.mo22840m().f28871x.m23155a() + (j2 - this.f29012a));
        }
    }
}
