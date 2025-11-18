package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2727c5 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f35311c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35312d;

    /* renamed from: e, reason: collision with root package name */
    protected final C2790l5 f35313e;

    /* renamed from: f, reason: collision with root package name */
    protected final C2776j5 f35314f;

    /* renamed from: g, reason: collision with root package name */
    private final C2734d5 f35315g;

    C2727c5(P2 p22) {
        super(p22);
        this.f35312d = true;
        this.f35313e = new C2790l5(this);
        this.f35314f = new C2776j5(this);
        this.f35315g = new C2734d5(this);
    }

    static /* synthetic */ void E(C2727c5 c2727c5, long j10) {
        c2727c5.n();
        c2727c5.I();
        c2727c5.k().L().b("Activity paused, time", Long.valueOf(j10));
        c2727c5.f35315g.b(j10);
        if (c2727c5.c().Y()) {
            c2727c5.f35314f.e(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        n();
        if (this.f35311c == null) {
            this.f35311c = new com.google.android.gms.internal.measurement.N0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void K(C2727c5 c2727c5, long j10) {
        c2727c5.n();
        c2727c5.I();
        c2727c5.k().L().b("Activity resumed, time", Long.valueOf(j10));
        if (c2727c5.c().u(K.f34952W0)) {
            if (c2727c5.c().Y() || c2727c5.f35312d) {
                c2727c5.f35314f.f(j10);
            }
        } else if (c2727c5.c().Y() || c2727c5.h().f35615u.b()) {
            c2727c5.f35314f.f(j10);
        }
        c2727c5.f35315g.a();
        C2790l5 c2790l5 = c2727c5.f35313e;
        c2790l5.f35444a.n();
        if (c2790l5.f35444a.f35457a.s()) {
            c2790l5.b(c2790l5.f35444a.b().a(), false);
        }
    }

    final void F(boolean z10) {
        n();
        this.f35312d = z10;
    }

    public final boolean G(boolean z10, boolean z11, long j10) {
        return this.f35314f.d(z10, z11, j10);
    }

    final boolean H() {
        n();
        return this.f35312d;
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
        return false;
    }
}
