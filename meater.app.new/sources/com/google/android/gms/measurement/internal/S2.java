package com.google.android.gms.measurement.internal;

import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import c7.C2339h;
import c7.C2340i;
import com.google.android.gms.internal.measurement.C2463e;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.S2;
import g7.C3445p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v7.AbstractBinderC4905g;
import v7.C4901c;
import v7.InterfaceC4907i;
import v7.InterfaceC4911m;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class S2 extends AbstractBinderC4905g {

    /* renamed from: B, reason: collision with root package name */
    private final C2880y5 f35164B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f35165C;

    /* renamed from: D, reason: collision with root package name */
    private String f35166D;

    public S2(C2880y5 c2880y5) {
        this(c2880y5, null);
    }

    public static /* synthetic */ void B1(S2 s22, E5 e52) {
        s22.f35164B.N0();
        s22.f35164B.y0(e52);
    }

    private final void C1(E5 e52, boolean z10) {
        C3445p.k(e52);
        C3445p.e(e52.f34806B);
        z1(e52.f34806B, false);
        this.f35164B.L0().l0(e52.f34807C, e52.f34821Q);
    }

    private final void D1(Runnable runnable) {
        C3445p.k(runnable);
        if (this.f35164B.o().L()) {
            runnable.run();
        } else {
            this.f35164B.o().E(runnable);
        }
    }

    private final void F1(J j10, E5 e52) {
        this.f35164B.N0();
        this.f35164B.y(j10, e52);
    }

    public static /* synthetic */ void k(S2 s22, Bundle bundle, String str, E5 e52) throws SQLException {
        boolean zU = s22.f35164B.u0().u(K.f34956Y0);
        boolean zU2 = s22.f35164B.u0().u(K.f34961a1);
        if (bundle.isEmpty() && zU) {
            C2812p c2812pX0 = s22.f35164B.x0();
            c2812pX0.n();
            c2812pX0.v();
            try {
                c2812pX0.C().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c2812pX0.k().H().b("Error clearing default event params", e10);
                return;
            }
        }
        s22.f35164B.x0().r0(str, bundle);
        if (s22.f35164B.x0().q0(str, e52.f34837g0)) {
            if (zU2) {
                s22.f35164B.x0().f0(str, Long.valueOf(e52.f34837g0), null, bundle);
            } else {
                s22.f35164B.x0().f0(str, null, null, bundle);
            }
        }
    }

    public static /* synthetic */ void u1(S2 s22, E5 e52) {
        s22.f35164B.N0();
        s22.f35164B.B0(e52);
    }

    public static /* synthetic */ void v1(S2 s22, E5 e52, Bundle bundle, InterfaceC4907i interfaceC4907i, String str) {
        s22.f35164B.N0();
        try {
            interfaceC4907i.c0(s22.f35164B.s(e52, bundle));
        } catch (RemoteException e10) {
            s22.f35164B.k().H().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public static /* synthetic */ void w1(S2 s22, E5 e52, C2735e c2735e) {
        s22.f35164B.N0();
        s22.f35164B.L((String) C3445p.k(e52.f34806B), c2735e);
    }

    public static /* synthetic */ void x1(S2 s22, String str, v7.k0 k0Var, InterfaceC4911m interfaceC4911m) {
        s22.f35164B.N0();
        try {
            interfaceC4911m.m(s22.f35164B.l(str, k0Var));
        } catch (RemoteException e10) {
            s22.f35164B.k().H().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    private final void y1(Runnable runnable) {
        C3445p.k(runnable);
        if (this.f35164B.o().L()) {
            runnable.run();
        } else {
            this.f35164B.o().H(runnable);
        }
    }

    private final void z1(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f35164B.k().H().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f35165C == null) {
                    this.f35165C = Boolean.valueOf("com.google.android.gms".equals(this.f35166D) || com.google.android.gms.common.util.q.a(this.f35164B.a(), Binder.getCallingUid()) || C2340i.a(this.f35164B.a()).c(Binder.getCallingUid()));
                }
                if (this.f35165C.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f35164B.k().H().b("Measurement Service called with invalid calling package. appId", C2759h2.w(str));
                throw e10;
            }
        }
        if (this.f35166D == null && C2339h.i(this.f35164B.a(), Binder.getCallingUid(), str)) {
            this.f35166D = str;
        }
        if (str.equals(this.f35166D)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    final J A1(J j10, E5 e52) {
        F f10;
        if ("_cmp".equals(j10.f34889B) && (f10 = j10.f34890C) != null && f10.f0() != 0) {
            String strU0 = j10.f34890C.U0("_cis");
            if ("referrer broadcast".equals(strU0) || "referrer API".equals(strU0)) {
                this.f35164B.k().K().b("Event has been filtered ", j10.toString());
                return new J("_cmpx", j10.f34890C, j10.f34891D, j10.f34892E);
            }
        }
        return j10;
    }

    @Override // v7.InterfaceC4906h
    public final List<P5> C(String str, String str2, String str3, boolean z10) {
        z1(str, true);
        try {
            List<R5> list = (List) this.f35164B.o().x(new CallableC2711a3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (z10 || !Q5.H0(r52.f35161c)) {
                    arrayList.add(new P5(r52));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35164B.k().H().c("Failed to get user properties as. appId", C2759h2.w(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f35164B.k().H().c("Failed to get user properties as. appId", C2759h2.w(str), e);
            return Collections.emptyList();
        }
    }

    final void E1(J j10, E5 e52) {
        boolean zE;
        if (!this.f35164B.E0().Y(e52.f34806B)) {
            F1(j10, e52);
            return;
        }
        this.f35164B.k().L().b("EES config found for", e52.f34806B);
        C2 c2E0 = this.f35164B.E0();
        String str = e52.f34806B;
        com.google.android.gms.internal.measurement.C c10 = TextUtils.isEmpty(str) ? null : c2E0.f34771j.c(str);
        if (c10 == null) {
            this.f35164B.k().L().b("EES not loaded for", e52.f34806B);
            F1(j10, e52);
            return;
        }
        try {
            Map<String, Object> mapR = this.f35164B.K0().R(j10.f34890C.v0(), true);
            String strA = v7.H.a(j10.f34889B);
            if (strA == null) {
                strA = j10.f34889B;
            }
            zE = c10.e(new C2463e(strA, j10.f34892E, mapR));
        } catch (zzc unused) {
            this.f35164B.k().H().c("EES error. appId, eventName", e52.f34807C, j10.f34889B);
            zE = false;
        }
        if (!zE) {
            this.f35164B.k().L().b("EES was not applied to event", j10.f34889B);
            F1(j10, e52);
            return;
        }
        if (c10.h()) {
            this.f35164B.k().L().b("EES edited event", j10.f34889B);
            F1(this.f35164B.K0().I(c10.a().d()), e52);
        } else {
            F1(j10, e52);
        }
        if (c10.g()) {
            for (C2463e c2463e : c10.a().f()) {
                this.f35164B.k().L().b("EES logging created event", c2463e.e());
                F1(this.f35164B.K0().I(c2463e), e52);
            }
        }
    }

    @Override // v7.InterfaceC4906h
    public final void F0(E5 e52) {
        C1(e52, false);
        D1(new T2(this, e52));
    }

    @Override // v7.InterfaceC4906h
    public final void G(E5 e52) {
        C1(e52, false);
        D1(new U2(this, e52));
    }

    @Override // v7.InterfaceC4906h
    public final void I(E5 e52) {
        C3445p.e(e52.f34806B);
        z1(e52.f34806B, false);
        D1(new RunnableC2739e3(this, e52));
    }

    @Override // v7.InterfaceC4906h
    public final void J0(final E5 e52, final Bundle bundle, final InterfaceC4907i interfaceC4907i) {
        C1(e52, false);
        final String str = (String) C3445p.k(e52.f34806B);
        this.f35164B.o().E(new Runnable() { // from class: v7.y
            @Override // java.lang.Runnable
            public final void run() {
                S2.v1(this.f51583B, e52, bundle, interfaceC4907i, str);
            }
        });
    }

    @Override // v7.InterfaceC4906h
    public final void O0(final E5 e52) {
        C3445p.e(e52.f34806B);
        C3445p.k(e52.f34826V);
        y1(new Runnable() { // from class: v7.x
            @Override // java.lang.Runnable
            public final void run() {
                S2.u1(this.f51581B, e52);
            }
        });
    }

    @Override // v7.InterfaceC4906h
    public final C4901c R(E5 e52) {
        C1(e52, false);
        C3445p.e(e52.f34806B);
        try {
            return (C4901c) this.f35164B.o().C(new CallableC2760h3(this, e52)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f35164B.k().H().c("Failed to get consent. appId", C2759h2.w(e52.f34806B), e10);
            return new C4901c(null);
        }
    }

    @Override // v7.InterfaceC4906h
    public final void T(C2749g c2749g) {
        C3445p.k(c2749g);
        C3445p.k(c2749g.f35353D);
        C3445p.e(c2749g.f35351B);
        z1(c2749g.f35351B, true);
        D1(new Y2(this, new C2749g(c2749g)));
    }

    @Override // v7.InterfaceC4906h
    public final void U0(E5 e52) {
        C3445p.e(e52.f34806B);
        C3445p.k(e52.f34826V);
        y1(new RunnableC2746f3(this, e52));
    }

    @Override // v7.InterfaceC4906h
    public final List<P5> V(E5 e52, boolean z10) {
        C1(e52, false);
        String str = e52.f34806B;
        C3445p.k(str);
        try {
            List<R5> list = (List) this.f35164B.o().x(new V2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (z10 || !Q5.H0(r52.f35161c)) {
                    arrayList.add(new P5(r52));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35164B.k().H().c("Failed to get user properties. appId", C2759h2.w(e52.f34806B), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f35164B.k().H().c("Failed to get user properties. appId", C2759h2.w(e52.f34806B), e);
            return null;
        }
    }

    @Override // v7.InterfaceC4906h
    public final List<P5> Y0(String str, String str2, boolean z10, E5 e52) {
        C1(e52, false);
        String str3 = e52.f34806B;
        C3445p.k(str3);
        try {
            List<R5> list = (List) this.f35164B.o().x(new CallableC2718b3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (z10 || !Q5.H0(r52.f35161c)) {
                    arrayList.add(new P5(r52));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35164B.k().H().c("Failed to query user properties. appId", C2759h2.w(e52.f34806B), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f35164B.k().H().c("Failed to query user properties. appId", C2759h2.w(e52.f34806B), e);
            return Collections.emptyList();
        }
    }

    @Override // v7.InterfaceC4906h
    public final void a1(final E5 e52, final C2735e c2735e) {
        if (this.f35164B.u0().u(K.f34928K0)) {
            C1(e52, false);
            D1(new Runnable() { // from class: v7.w
                @Override // java.lang.Runnable
                public final void run() {
                    S2.w1(this.f51578B, e52, c2735e);
                }
            });
        }
    }

    @Override // v7.InterfaceC4906h
    public final void e1(P5 p52, E5 e52) {
        C3445p.k(p52);
        C1(e52, false);
        D1(new RunnableC2788l3(this, p52, e52));
    }

    @Override // v7.InterfaceC4906h
    public final void g0(long j10, String str, String str2, String str3) {
        D1(new W2(this, str2, str3, str, j10));
    }

    @Override // v7.InterfaceC4906h
    public final void g1(C2749g c2749g, E5 e52) {
        C3445p.k(c2749g);
        C3445p.k(c2749g.f35353D);
        C1(e52, false);
        C2749g c2749g2 = new C2749g(c2749g);
        c2749g2.f35351B = e52.f34806B;
        D1(new Z2(this, c2749g2, e52));
    }

    @Override // v7.InterfaceC4906h
    public final List<C2797m5> i0(E5 e52, Bundle bundle) {
        C1(e52, false);
        C3445p.k(e52.f34806B);
        if (!this.f35164B.u0().u(K.f34970d1)) {
            try {
                return (List) this.f35164B.o().x(new CallableC2802n3(this, e52, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f35164B.k().H().c("Failed to get trigger URIs. appId", C2759h2.w(e52.f34806B), e10);
                return Collections.emptyList();
            }
        }
        try {
            return (List) this.f35164B.o().C(new CallableC2781k3(this, e52, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f35164B.k().H().c("Failed to get trigger URIs. appId", C2759h2.w(e52.f34806B), e11);
            return Collections.emptyList();
        }
    }

    @Override // v7.InterfaceC4906h
    public final String j0(E5 e52) {
        C1(e52, false);
        return this.f35164B.f0(e52);
    }

    @Override // v7.InterfaceC4906h
    public final List<C2749g> k0(String str, String str2, String str3) {
        z1(str, true);
        try {
            return (List) this.f35164B.o().x(new CallableC2725c3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f35164B.k().H().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // v7.InterfaceC4906h
    public final void l1(final E5 e52) {
        C3445p.e(e52.f34806B);
        C3445p.k(e52.f34826V);
        y1(new Runnable() { // from class: v7.z
            @Override // java.lang.Runnable
            public final void run() {
                S2.B1(this.f51588B, e52);
            }
        });
    }

    @Override // v7.InterfaceC4906h
    public final void n(final Bundle bundle, final E5 e52) {
        C1(e52, false);
        final String str = e52.f34806B;
        C3445p.k(str);
        D1(new Runnable() { // from class: v7.B
            @Override // java.lang.Runnable
            public final void run() throws SQLException {
                S2.k(this.f51492B, bundle, str, e52);
            }
        });
    }

    @Override // v7.InterfaceC4906h
    public final void p0(J j10, String str, String str2) {
        C3445p.k(j10);
        C3445p.e(str);
        z1(str, true);
        D1(new RunnableC2774j3(this, j10, str));
    }

    @Override // v7.InterfaceC4906h
    public final void r(E5 e52) {
        C1(e52, false);
        D1(new X2(this, e52));
    }

    @Override // v7.InterfaceC4906h
    public final byte[] w0(J j10, String str) {
        C3445p.e(str);
        C3445p.k(j10);
        z1(str, true);
        this.f35164B.k().G().b("Log and bundle. event", this.f35164B.A0().c(j10.f34889B));
        long jB = this.f35164B.b().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f35164B.o().C(new CallableC2767i3(this, j10, str)).get();
            if (bArr == null) {
                this.f35164B.k().H().b("Log and bundle returned null. appId", C2759h2.w(str));
                bArr = new byte[0];
            }
            this.f35164B.k().G().d("Log and bundle processed. event, size, time_ms", this.f35164B.A0().c(j10.f34889B), Integer.valueOf(bArr.length), Long.valueOf((this.f35164B.b().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            this.f35164B.k().H().d("Failed to log and bundle. appId, event, error", C2759h2.w(str), this.f35164B.A0().c(j10.f34889B), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f35164B.k().H().d("Failed to log and bundle. appId, event, error", C2759h2.w(str), this.f35164B.A0().c(j10.f34889B), e);
            return null;
        }
    }

    @Override // v7.InterfaceC4906h
    public final void x(E5 e52, final v7.k0 k0Var, final InterfaceC4911m interfaceC4911m) {
        if (this.f35164B.u0().u(K.f34928K0)) {
            C1(e52, false);
            final String str = (String) C3445p.k(e52.f34806B);
            this.f35164B.o().E(new Runnable() { // from class: v7.A
                @Override // java.lang.Runnable
                public final void run() {
                    S2.x1(this.f51488B, str, k0Var, interfaceC4911m);
                }
            });
        }
    }

    @Override // v7.InterfaceC4906h
    public final void x0(J j10, E5 e52) {
        C3445p.k(j10);
        C1(e52, false);
        D1(new RunnableC2753g3(this, j10, e52));
    }

    @Override // v7.InterfaceC4906h
    public final List<C2749g> y(String str, String str2, E5 e52) {
        C1(e52, false);
        String str3 = e52.f34806B;
        C3445p.k(str3);
        try {
            return (List) this.f35164B.o().x(new CallableC2732d3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f35164B.k().H().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    private S2(C2880y5 c2880y5, String str) {
        C3445p.k(c2880y5);
        this.f35164B = c2880y5;
        this.f35166D = null;
    }
}
