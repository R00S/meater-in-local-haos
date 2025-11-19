package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import g7.C3445p;
import java.util.Iterator;
import java.util.Map;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2707a extends Z1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f35249b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f35250c;

    /* renamed from: d, reason: collision with root package name */
    private long f35251d;

    public C2707a(P2 p22) {
        super(p22);
        this.f35250c = new C4391a();
        this.f35249b = new C4391a();
    }

    static /* synthetic */ void A(C2707a c2707a, String str, long j10) {
        c2707a.n();
        C3445p.e(str);
        if (c2707a.f35250c.isEmpty()) {
            c2707a.f35251d = j10;
        }
        Integer num = c2707a.f35250c.get(str);
        if (num != null) {
            c2707a.f35250c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2707a.f35250c.size() >= 100) {
            c2707a.k().M().a("Too many ads visible");
        } else {
            c2707a.f35250c.put(str, 1);
            c2707a.f35249b.put(str, Long.valueOf(j10));
        }
    }

    private final void C(String str, long j10, C2782k4 c2782k4) {
        if (c2782k4 == null) {
            k().L().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            k().L().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        Q5.Y(c2782k4, bundle, true);
        s().h1("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(long j10) {
        Iterator<String> it = this.f35249b.keySet().iterator();
        while (it.hasNext()) {
            this.f35249b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f35249b.isEmpty()) {
            return;
        }
        this.f35251d = j10;
    }

    static /* synthetic */ void E(C2707a c2707a, String str, long j10) {
        c2707a.n();
        C3445p.e(str);
        Integer num = c2707a.f35250c.get(str);
        if (num == null) {
            c2707a.k().H().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C2782k4 c2782k4E = c2707a.u().E(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c2707a.f35250c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c2707a.f35250c.remove(str);
        Long l10 = c2707a.f35249b.get(str);
        if (l10 == null) {
            c2707a.k().H().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            c2707a.f35249b.remove(str);
            c2707a.C(str, jLongValue, c2782k4E);
        }
        if (c2707a.f35250c.isEmpty()) {
            long j11 = c2707a.f35251d;
            if (j11 == 0) {
                c2707a.k().H().a("First ad exposure time was never set");
            } else {
                c2707a.y(j10 - j11, c2782k4E);
                c2707a.f35251d = 0L;
            }
        }
    }

    private final void y(long j10, C2782k4 c2782k4) {
        if (c2782k4 == null) {
            k().L().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            k().L().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        Q5.Y(c2782k4, bundle, true);
        s().h1("am", "_xa", bundle);
    }

    public final void B(String str, long j10) {
        if (str == null || str.length() == 0) {
            k().H().a("Ad unit id must be a non-empty string");
        } else {
            o().E(new Y(this, str, j10));
        }
    }

    public final void F(String str, long j10) {
        if (str == null || str.length() == 0) {
            k().H().a("Ad unit id must be a non-empty string");
        } else {
            o().E(new RunnableC2874y(this, str, j10));
        }
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

    public final void x(long j10) {
        C2782k4 c2782k4E = u().E(false);
        for (String str : this.f35249b.keySet()) {
            C(str, j10 - this.f35249b.get(str).longValue(), c2782k4E);
        }
        if (!this.f35249b.isEmpty()) {
            y(j10 - this.f35251d, c2782k4E);
        }
        D(j10);
    }
}
