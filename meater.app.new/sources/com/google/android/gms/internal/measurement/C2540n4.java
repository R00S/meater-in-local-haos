package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2540n4 implements InterfaceC2502i6 {

    /* renamed from: a, reason: collision with root package name */
    private final zzjn f34220a;

    private C2540n4(zzjn zzjnVar) {
        zzjn zzjnVar2 = (zzjn) I4.f(zzjnVar, "output");
        this.f34220a = zzjnVar2;
        zzjnVar2.f34471a = this;
    }

    public static C2540n4 P(zzjn zzjnVar) {
        C2540n4 c2540n4 = zzjnVar.f34471a;
        return c2540n4 != null ? c2540n4 : new C2540n4(zzjnVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void A(int i10, int i11) {
        this.f34220a.C0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void B(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.p0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iZ = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZ += zzjn.z(list.get(i12).intValue());
            }
            this.f34220a.B0(iZ);
            while (i11 < list.size()) {
                this.f34220a.s0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.p0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iZ2 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iZ2 += zzjn.z(g42.f(i13));
        }
        this.f34220a.B0(iZ2);
        while (i11 < g42.size()) {
            this.f34220a.s0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void C(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.C0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iO0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iO0 += zzjn.o0(list.get(i12).intValue());
            }
            this.f34220a.B0(iO0);
            while (i11 < list.size()) {
                this.f34220a.B0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.C0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iO02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iO02 += zzjn.o0(g42.f(i13));
        }
        this.f34220a.B0(iO02);
        while (i11 < g42.size()) {
            this.f34220a.B0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void D(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof U4)) {
            while (i11 < list.size()) {
                this.f34220a.O(i10, list.get(i11));
                i11++;
            }
            return;
        }
        U4 u42 = (U4) list;
        while (i11 < list.size()) {
            Object objG = u42.g(i11);
            if (objG instanceof String) {
                this.f34220a.O(i10, (String) objG);
            } else {
                this.f34220a.X(i10, (Y3) objG);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void E(int i10, int i11) {
        this.f34220a.p0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void F(int i10, List<?> list, C5 c52) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), c52);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void G(int i10, long j10) {
        this.f34220a.q0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void H(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof B4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.M(i10, list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iD += zzjn.d(list.get(i12).floatValue());
            }
            this.f34220a.B0(iD);
            while (i11 < list.size()) {
                this.f34220a.K(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        B4 b42 = (B4) list;
        if (!z10) {
            while (i11 < b42.size()) {
                this.f34220a.M(i10, b42.h(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iD2 = 0;
        for (int i13 = 0; i13 < b42.size(); i13++) {
            iD2 += zzjn.d(b42.h(i13));
        }
        this.f34220a.B0(iD2);
        while (i11 < b42.size()) {
            this.f34220a.K(b42.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void I(int i10, Object obj, C5 c52) {
        zzjn zzjnVar = this.f34220a;
        zzjnVar.A0(i10, 3);
        c52.h((InterfaceC2517k5) obj, zzjnVar.f34471a);
        zzjnVar.A0(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void J(int i10, int i11) {
        this.f34220a.y0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void K(int i10, long j10) {
        this.f34220a.u0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void L(int i10, Object obj, C5 c52) {
        this.f34220a.Y(i10, (InterfaceC2517k5) obj, c52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void M(int i10, List<?> list, C5 c52) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            I(i10, list.get(i11), c52);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void N(int i10, List<Y3> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f34220a.X(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void O(int i10, Y3 y32) {
        this.f34220a.X(i10, y32);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void b(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.t0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += zzjn.e(list.get(i12).intValue());
            }
            this.f34220a.B0(iE);
            while (i11 < list.size()) {
                this.f34220a.x0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.t0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iE2 += zzjn.e(g42.f(i13));
        }
        this.f34220a.B0(iE2);
        while (i11 < g42.size()) {
            this.f34220a.x0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void c(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.q0(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iE0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE0 += zzjn.e0(list.get(i12).longValue());
            }
            this.f34220a.B0(iE0);
            while (i11 < list.size()) {
                this.f34220a.r0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        Z4 z42 = (Z4) list;
        if (!z10) {
            while (i11 < z42.size()) {
                this.f34220a.q0(i10, z42.s(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iE02 = 0;
        for (int i13 = 0; i13 < z42.size(); i13++) {
            iE02 += zzjn.e0(z42.s(i13));
        }
        this.f34220a.B0(iE02);
        while (i11 < z42.size()) {
            this.f34220a.r0(z42.s(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void d(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.m0(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += zzjn.W(list.get(i12).longValue());
            }
            this.f34220a.B0(iW);
            while (i11 < list.size()) {
                this.f34220a.n0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        Z4 z42 = (Z4) list;
        if (!z10) {
            while (i11 < z42.size()) {
                this.f34220a.m0(i10, z42.s(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < z42.size(); i13++) {
            iW2 += zzjn.W(z42.s(i13));
        }
        this.f34220a.B0(iW2);
        while (i11 < z42.size()) {
            this.f34220a.n0(z42.s(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void e(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.u0(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iJ0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iJ0 += zzjn.j0(list.get(i12).longValue());
            }
            this.f34220a.B0(iJ0);
            while (i11 < list.size()) {
                this.f34220a.v0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        Z4 z42 = (Z4) list;
        if (!z10) {
            while (i11 < z42.size()) {
                this.f34220a.u0(i10, z42.s(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iJ02 = 0;
        for (int i13 = 0; i13 < z42.size(); i13++) {
            iJ02 += zzjn.j0(z42.s(i13));
        }
        this.f34220a.B0(iJ02);
        while (i11 < z42.size()) {
            this.f34220a.v0(z42.s(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void f(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.t0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iT = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT += zzjn.T(list.get(i12).intValue());
            }
            this.f34220a.B0(iT);
            while (i11 < list.size()) {
                this.f34220a.x0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.t0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iT2 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iT2 += zzjn.T(g42.f(i13));
        }
        this.f34220a.B0(iT2);
        while (i11 < g42.size()) {
            this.f34220a.x0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    @Deprecated
    public final void g(int i10) {
        this.f34220a.A0(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final <K, V> void h(int i10, C2477f5<K, V> c2477f5, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f34220a.A0(i10, 2);
            this.f34220a.B0(C2451c5.a(c2477f5, entry.getKey(), entry.getValue()));
            C2451c5.b(this.f34220a, c2477f5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void i(int i10, boolean z10) {
        this.f34220a.P(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.p0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iB0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB0 += zzjn.b0(list.get(i12).intValue());
            }
            this.f34220a.B0(iB0);
            while (i11 < list.size()) {
                this.f34220a.s0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.p0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iB02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iB02 += zzjn.b0(g42.f(i13));
        }
        this.f34220a.B0(iB02);
        while (i11 < g42.size()) {
            this.f34220a.s0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void k(int i10, long j10) {
        this.f34220a.u0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void l(int i10, int i11) {
        this.f34220a.p0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void m(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof W3)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.P(i10, list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iV = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iV += zzjn.v(list.get(i12).booleanValue());
            }
            this.f34220a.B0(iV);
            while (i11 < list.size()) {
                this.f34220a.S(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        W3 w32 = (W3) list;
        if (!z10) {
            while (i11 < w32.size()) {
                this.f34220a.P(i10, w32.h(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iV2 = 0;
        for (int i13 = 0; i13 < w32.size(); i13++) {
            iV2 += zzjn.v(w32.h(i13));
        }
        this.f34220a.B0(iV2);
        while (i11 < w32.size()) {
            this.f34220a.S(w32.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void n(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.u0(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += zzjn.F(list.get(i12).longValue());
            }
            this.f34220a.B0(iF);
            while (i11 < list.size()) {
                this.f34220a.v0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        Z4 z42 = (Z4) list;
        if (!z10) {
            while (i11 < z42.size()) {
                this.f34220a.u0(i10, z42.s(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < z42.size(); i13++) {
            iF2 += zzjn.F(z42.s(i13));
        }
        this.f34220a.B0(iF2);
        while (i11 < z42.size()) {
            this.f34220a.v0(z42.s(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void o(int i10, int i11) {
        this.f34220a.t0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void p(int i10, long j10) {
        this.f34220a.m0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void q(int i10, Object obj) {
        if (obj instanceof Y3) {
            this.f34220a.f0(i10, (Y3) obj);
        } else {
            this.f34220a.N(i10, (InterfaceC2517k5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void r(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2564q4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.L(i10, list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += zzjn.c(list.get(i12).doubleValue());
            }
            this.f34220a.B0(iC);
            while (i11 < list.size()) {
                this.f34220a.J(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        C2564q4 c2564q4 = (C2564q4) list;
        if (!z10) {
            while (i11 < c2564q4.size()) {
                this.f34220a.L(i10, c2564q4.h(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < c2564q4.size(); i13++) {
            iC2 += zzjn.c(c2564q4.h(i13));
        }
        this.f34220a.B0(iC2);
        while (i11 < c2564q4.size()) {
            this.f34220a.J(c2564q4.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    @Deprecated
    public final void s(int i10) {
        this.f34220a.A0(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void t(int i10, String str) {
        this.f34220a.O(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void u(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.y0(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += zzjn.g0(list.get(i12).intValue());
            }
            this.f34220a.B0(iG0);
            while (i11 < list.size()) {
                this.f34220a.z0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f34220a.y0(i10, g42.f(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iG02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iG02 += zzjn.g0(g42.f(i13));
        }
        this.f34220a.B0(iG02);
        while (i11 < g42.size()) {
            this.f34220a.z0(g42.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void v(int i10, int i11) {
        this.f34220a.t0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void w(int i10, long j10) {
        this.f34220a.m0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void x(int i10, double d10) {
        this.f34220a.L(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void y(int i10, float f10) {
        this.f34220a.M(i10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2502i6
    public final void z(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34220a.m0(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.f34220a.A0(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iP += zzjn.p(list.get(i12).longValue());
            }
            this.f34220a.B0(iP);
            while (i11 < list.size()) {
                this.f34220a.n0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        Z4 z42 = (Z4) list;
        if (!z10) {
            while (i11 < z42.size()) {
                this.f34220a.m0(i10, z42.s(i11));
                i11++;
            }
            return;
        }
        this.f34220a.A0(i10, 2);
        int iP2 = 0;
        for (int i13 = 0; i13 < z42.size(); i13++) {
            iP2 += zzjn.p(z42.s(i13));
        }
        this.f34220a.B0(iP2);
        while (i11 < z42.size()) {
            this.f34220a.n0(z42.s(i11));
            i11++;
        }
    }
}
