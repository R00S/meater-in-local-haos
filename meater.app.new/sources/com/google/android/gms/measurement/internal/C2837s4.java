package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.measurement.internal.C2837s4;
import g7.C3445p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import v7.C4901c;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837s4 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private final S4 f35631c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4906h f35632d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f35633e;

    /* renamed from: f, reason: collision with root package name */
    private final A f35634f;

    /* renamed from: g, reason: collision with root package name */
    private final C2804n5 f35635g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Runnable> f35636h;

    /* renamed from: i, reason: collision with root package name */
    private final A f35637i;

    protected C2837s4(P2 p22) {
        super(p22);
        this.f35636h = new ArrayList();
        this.f35635g = new C2804n5(p22.b());
        this.f35631c = new S4(this);
        this.f35634f = new C2851u4(this, p22);
        this.f35637i = new F4(this, p22);
    }

    static /* synthetic */ void N(C2837s4 c2837s4, ComponentName componentName) {
        c2837s4.n();
        if (c2837s4.f35632d != null) {
            c2837s4.f35632d = null;
            c2837s4.k().L().b("Disconnected from device MeasurementService", componentName);
            c2837s4.n();
            c2837s4.g0();
        }
    }

    public static /* synthetic */ void O(C2837s4 c2837s4, E5 e52, C2735e c2735e) {
        InterfaceC4906h interfaceC4906h = c2837s4.f35632d;
        if (interfaceC4906h == null) {
            c2837s4.k().H().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC4906h.a1(e52, c2735e);
            c2837s4.r0();
        } catch (RemoteException e10) {
            c2837s4.k().H().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c2735e.f35331B), e10);
        }
    }

    public static /* synthetic */ void P(C2837s4 c2837s4, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        InterfaceC4906h interfaceC4906h;
        synchronized (atomicReference) {
            try {
                interfaceC4906h = c2837s4.f35632d;
            } catch (RemoteException e10) {
                c2837s4.k().H().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4906h == null) {
                c2837s4.k().H().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            C3445p.k(e52);
            interfaceC4906h.J0(e52, bundle, new BinderC2872x4(c2837s4, atomicReference));
            c2837s4.r0();
        }
    }

    public static /* synthetic */ void Q(C2837s4 c2837s4, AtomicReference atomicReference, E5 e52, v7.k0 k0Var) {
        InterfaceC4906h interfaceC4906h;
        synchronized (atomicReference) {
            try {
                interfaceC4906h = c2837s4.f35632d;
            } catch (RemoteException e10) {
                c2837s4.k().H().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4906h == null) {
                c2837s4.k().H().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            C3445p.k(e52);
            interfaceC4906h.x(e52, k0Var, new BinderC2886z4(c2837s4, atomicReference));
            c2837s4.r0();
        }
    }

    private final void T(Runnable runnable) {
        n();
        if (l0()) {
            runnable.run();
        } else {
            if (this.f35636h.size() >= 1000) {
                k().H().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f35636h.add(runnable);
            this.f35637i.b(Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        n();
        k().L().b("Processing queued up service tasks", Integer.valueOf(this.f35636h.size()));
        Iterator<Runnable> it = this.f35636h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                k().H().b("Task exception while flushing queue", e10);
            }
        }
        this.f35636h.clear();
        this.f35637i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        n();
        this.f35635g.c();
        this.f35634f.b(K.f34947U.a(null).longValue());
    }

    private final E5 u0(boolean z10) {
        return q().D(z10 ? k().P() : null);
    }

    public static /* synthetic */ void v0(C2837s4 c2837s4) {
        InterfaceC4906h interfaceC4906h = c2837s4.f35632d;
        if (interfaceC4906h == null) {
            c2837s4.k().H().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            E5 e5U0 = c2837s4.u0(false);
            C3445p.k(e5U0);
            interfaceC4906h.O0(e5U0);
            c2837s4.r0();
        } catch (RemoteException e10) {
            c2837s4.k().H().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public static /* synthetic */ void w0(C2837s4 c2837s4) {
        InterfaceC4906h interfaceC4906h = c2837s4.f35632d;
        if (interfaceC4906h == null) {
            c2837s4.k().H().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            E5 e5U0 = c2837s4.u0(false);
            C3445p.k(e5U0);
            interfaceC4906h.l1(e5U0);
            c2837s4.r0();
        } catch (RemoteException e10) {
            c2837s4.k().H().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    static /* synthetic */ void y0(C2837s4 c2837s4) {
        c2837s4.n();
        if (c2837s4.l0()) {
            c2837s4.k().L().a("Inactivity, disconnecting from the service");
            c2837s4.h0();
        }
    }

    public final void E(Bundle bundle) {
        n();
        z();
        T(new G4(this, u0(false), bundle));
    }

    public final void F(com.google.android.gms.internal.measurement.U0 u02) {
        n();
        z();
        T(new D4(this, u0(false), u02));
    }

    public final void G(com.google.android.gms.internal.measurement.U0 u02, J j10, String str) {
        n();
        z();
        if (j().v(12451000) == 0) {
            T(new K4(this, j10, str, u02));
        } else {
            k().M().a("Not bundling data. Service unavailable or out of date");
            j().W(u02, new byte[0]);
        }
    }

    protected final void H(com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        n();
        z();
        T(new Q4(this, str, str2, u0(false), u02));
    }

    protected final void I(com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z10) {
        n();
        z();
        T(new RunnableC2858v4(this, str, str2, u0(false), z10, u02));
    }

    protected final void J(final C2735e c2735e) {
        n();
        z();
        final E5 e5U0 = u0(true);
        C3445p.k(e5U0);
        T(new Runnable() { // from class: v7.d0
            @Override // java.lang.Runnable
            public final void run() {
                C2837s4.O(this.f51551B, e5U0, c2735e);
            }
        });
    }

    protected final void K(C2749g c2749g) {
        C3445p.k(c2749g);
        n();
        z();
        T(new O4(this, true, u0(true), r().G(c2749g), new C2749g(c2749g), c2749g));
    }

    protected final void L(J j10, String str) {
        C3445p.k(j10);
        n();
        z();
        T(new L4(this, true, u0(true), r().H(j10), j10, str));
    }

    protected final void M(C2782k4 c2782k4) {
        n();
        z();
        T(new H4(this, c2782k4));
    }

    protected final void S(P5 p52) {
        n();
        z();
        T(new RunnableC2879y4(this, u0(true), r().I(p52), p52));
    }

    public final void U(AtomicReference<String> atomicReference) {
        n();
        z();
        T(new A4(this, atomicReference, u0(false)));
    }

    protected final void V(final AtomicReference<List<C2797m5>> atomicReference, final Bundle bundle) {
        n();
        z();
        final E5 e5U0 = u0(false);
        if (c().u(K.f34973e1)) {
            T(new Runnable() { // from class: v7.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C2837s4.P(this.f51547B, atomicReference, e5U0, bundle);
                }
            });
        } else {
            T(new RunnableC2865w4(this, atomicReference, e5U0, bundle));
        }
    }

    protected final void W(AtomicReference<List<C2749g>> atomicReference, String str, String str2, String str3) {
        n();
        z();
        T(new N4(this, atomicReference, str, str2, str3, u0(false)));
    }

    protected final void X(AtomicReference<List<P5>> atomicReference, String str, String str2, String str3, boolean z10) {
        n();
        z();
        T(new P4(this, atomicReference, str, str2, str3, u0(false), z10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y(final AtomicReference<C2859v5> atomicReference, final v7.k0 k0Var) {
        n();
        z();
        final E5 e5U0 = u0(false);
        T(new Runnable() { // from class: v7.e0
            @Override // java.lang.Runnable
            public final void run() {
                C2837s4.Q(this.f51554B, atomicReference, e5U0, k0Var);
            }
        });
    }

    protected final void Z(InterfaceC4906h interfaceC4906h) {
        n();
        C3445p.k(interfaceC4906h);
        this.f35632d = interfaceC4906h;
        r0();
        q0();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a0(v7.InterfaceC4906h r37, h7.AbstractC3492a r38, com.google.android.gms.measurement.internal.E5 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2837s4.a0(v7.h, h7.a, com.google.android.gms.measurement.internal.E5):void");
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    protected final void b0(boolean z10) {
        n();
        z();
        if (n0()) {
            T(new M4(this, u0(false)));
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    protected final C4901c c0() {
        n();
        z();
        InterfaceC4906h interfaceC4906h = this.f35632d;
        if (interfaceC4906h == null) {
            g0();
            k().G().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        E5 e5U0 = u0(false);
        C3445p.k(e5U0);
        try {
            C4901c c4901cR = interfaceC4906h.R(e5U0);
            r0();
            return c4901cR;
        } catch (RemoteException e10) {
            k().H().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    final Boolean d0() {
        return this.f35633e;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    protected final void e0() {
        n();
        z();
        T(new E4(this, u0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    protected final void f0() {
        n();
        z();
        E5 e5U0 = u0(true);
        r().K();
        T(new C4(this, e5U0));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    final void g0() {
        n();
        z();
        if (l0()) {
            return;
        }
        if (p0()) {
            this.f35631c.a();
            return;
        }
        if (c().a0()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            k().H().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f35631c.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    public final void h0() {
        n();
        z();
        this.f35631c.e();
        try {
            j7.b.b().c(a(), this.f35631c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f35632d = null;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    protected final void i0() {
        n();
        z();
        E5 e5U0 = u0(false);
        r().J();
        T(new B4(this, e5U0));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    protected final void j0() {
        n();
        z();
        T(new Runnable() { // from class: v7.a0
            @Override // java.lang.Runnable
            public final void run() {
                C2837s4.w0(this.f51544B);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    protected final void k0() {
        n();
        z();
        T(new J4(this, u0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final boolean l0() {
        n();
        z();
        return this.f35632d != null;
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    final boolean m0() {
        n();
        z();
        return !p0() || j().I0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    final boolean n0() {
        n();
        z();
        return !p0() || j().I0() >= K.f34916E0.a(null).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    final boolean o0() {
        n();
        z();
        return !p0() || j().I0() >= 241200;
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2707a p() {
        return super.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean p0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2837s4.p0():boolean");
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

    protected final void t0(boolean z10) {
        n();
        z();
        T(new Runnable() { // from class: v7.b0
            @Override // java.lang.Runnable
            public final void run() {
                C2837s4.v0(this.f51545B);
            }
        });
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
