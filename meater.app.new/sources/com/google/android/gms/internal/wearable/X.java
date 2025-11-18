package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class X implements x1 {

    /* renamed from: a, reason: collision with root package name */
    private final W f34538a;

    private X(W w10) {
        byte[] bArr = C2689r0.f34653b;
        this.f34538a = w10;
        w10.f34533a = this;
    }

    public static X L(W w10) {
        X x10 = w10.f34533a;
        return x10 != null ? x10 : new X(w10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void A(int i10, Object obj) {
        if (obj instanceof P) {
            this.f34538a.r(i10, (P) obj);
        } else {
            this.f34538a.q(i10, (N0) obj);
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void B(int i10, int i11) {
        this.f34538a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    W w10 = this.f34538a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    w10.w(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += W.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f34538a.v(iA);
            while (i11 < list.size()) {
                W w11 = this.f34538a;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                w11.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C0 c02 = (C0) list;
        if (!z10) {
            while (i11 < c02.size()) {
                W w12 = this.f34538a;
                long jF = c02.f(i11);
                w12.w(i10, (jF >> 63) ^ (jF + jF));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c02.size(); i13++) {
            long jF2 = c02.f(i13);
            iA2 += W.a((jF2 >> 63) ^ (jF2 + jF2));
        }
        this.f34538a.v(iA2);
        while (i11 < c02.size()) {
            W w13 = this.f34538a;
            long jF3 = c02.f(i11);
            w13.x((jF3 >> 63) ^ (jF3 + jF3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2657g0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.i(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.j(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        C2657g0 c2657g0 = (C2657g0) list;
        if (!z10) {
            while (i11 < c2657g0.size()) {
                this.f34538a.i(i10, Float.floatToRawIntBits(c2657g0.f(i11)));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2657g0.size(); i15++) {
            c2657g0.f(i15);
            i14 += 4;
        }
        this.f34538a.v(i14);
        while (i11 < c2657g0.size()) {
            this.f34538a.j(Float.floatToRawIntBits(c2657g0.f(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void E(int i10, int i11) {
        this.f34538a.u(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void F(int i10, Object obj, Z0 z02) {
        this.f34538a.p(i10, (N0) obj, z02);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void G(int i10, long j10) {
        this.f34538a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void H(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2706z0)) {
            while (i11 < list.size()) {
                this.f34538a.s(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2706z0 interfaceC2706z0 = (InterfaceC2706z0) list;
        while (i11 < list.size()) {
            Object objD = interfaceC2706z0.d();
            if (objD instanceof String) {
                this.f34538a.s(i10, (String) objD);
            } else {
                this.f34538a.h(i10, (P) objD);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void I(int i10, long j10) {
        this.f34538a.w(i10, j10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    @Deprecated
    public final void J(int i10) {
        this.f34538a.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    @Deprecated
    public final void K(int i10) {
        this.f34538a.t(i10, 3);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void a(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f34538a.h(i10, (P) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.g(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.f(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        G g10 = (G) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34538a.g(i10, g10.h(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < g10.size(); i15++) {
            g10.h(i15);
            i14++;
        }
        this.f34538a.v(i14);
        while (i11 < g10.size()) {
            this.f34538a.f(g10.h(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                this.f34538a.i(i10, c2675m0.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2675m0.size(); i15++) {
            c2675m0.f(i15);
            i14 += 4;
        }
        this.f34538a.v(i14);
        while (i11 < c2675m0.size()) {
            this.f34538a.j(c2675m0.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.m(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += W.a(((Integer) list.get(i12)).intValue());
            }
            this.f34538a.v(iA);
            while (i11 < list.size()) {
                this.f34538a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                this.f34538a.m(i10, c2675m0.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c2675m0.size(); i13++) {
            iA2 += W.a(c2675m0.f(i13));
        }
        this.f34538a.v(iA2);
        while (i11 < c2675m0.size()) {
            this.f34538a.n(c2675m0.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.l(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0 c02 = (C0) list;
        if (!z10) {
            while (i11 < c02.size()) {
                this.f34538a.k(i10, c02.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c02.size(); i15++) {
            c02.f(i15);
            i14 += 8;
        }
        this.f34538a.v(i14);
        while (i11 < c02.size()) {
            this.f34538a.l(c02.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Y)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.k(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.l(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        Y y10 = (Y) list;
        if (!z10) {
            while (i11 < y10.size()) {
                this.f34538a.k(i10, Double.doubleToRawLongBits(y10.f(i11)));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < y10.size(); i15++) {
            y10.f(i15);
            i14 += 8;
        }
        this.f34538a.v(i14);
        while (i11 < y10.size()) {
            this.f34538a.l(Double.doubleToRawLongBits(y10.f(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void g(int i10, String str) {
        this.f34538a.s(i10, str);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void h(int i10, int i11) {
        this.f34538a.u(i10, i11);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                this.f34538a.i(i10, c2675m0.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2675m0.size(); i15++) {
            c2675m0.f(i15);
            i14 += 4;
        }
        this.f34538a.v(i14);
        while (i11 < c2675m0.size()) {
            this.f34538a.j(c2675m0.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void j(int i10, int i11) {
        this.f34538a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void k(int i10, boolean z10) {
        this.f34538a.g(i10, z10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void l(int i10, long j10) {
        this.f34538a.w(i10, j10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void m(int i10, Object obj, Z0 z02) {
        W w10 = this.f34538a;
        w10.t(i10, 3);
        z02.a((N0) obj, w10.f34533a);
        w10.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += W.B(((Integer) list.get(i12)).intValue());
            }
            this.f34538a.v(iB);
            while (i11 < list.size()) {
                this.f34538a.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                this.f34538a.u(i10, c2675m0.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c2675m0.size(); i13++) {
            iB2 += W.B(c2675m0.f(i13));
        }
        this.f34538a.v(iB2);
        while (i11 < c2675m0.size()) {
            this.f34538a.v(c2675m0.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f34538a.v(i12);
            while (i11 < list.size()) {
                this.f34538a.l(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0 c02 = (C0) list;
        if (!z10) {
            while (i11 < c02.size()) {
                this.f34538a.k(i10, c02.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c02.size(); i15++) {
            c02.f(i15);
            i14 += 8;
        }
        this.f34538a.v(i14);
        while (i11 < c02.size()) {
            this.f34538a.l(c02.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.m(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += W.a(((Integer) list.get(i12)).intValue());
            }
            this.f34538a.v(iA);
            while (i11 < list.size()) {
                this.f34538a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                this.f34538a.m(i10, c2675m0.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c2675m0.size(); i13++) {
            iA2 += W.a(c2675m0.f(i13));
        }
        this.f34538a.v(iA2);
        while (i11 < c2675m0.size()) {
            this.f34538a.n(c2675m0.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void q(int i10, long j10) {
        this.f34538a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void r(int i10, int i11) {
        this.f34538a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void s(int i10, P p10) {
        this.f34538a.h(i10, p10);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void t(int i10, int i11) {
        this.f34538a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2675m0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    W w10 = this.f34538a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    w10.u(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iB += W.B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f34538a.v(iB);
            while (i11 < list.size()) {
                W w11 = this.f34538a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                w11.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C2675m0 c2675m0 = (C2675m0) list;
        if (!z10) {
            while (i11 < c2675m0.size()) {
                W w12 = this.f34538a;
                int iF = c2675m0.f(i11);
                w12.u(i10, (iF >> 31) ^ (iF + iF));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c2675m0.size(); i13++) {
            int iF2 = c2675m0.f(i13);
            iB2 += W.B((iF2 >> 31) ^ (iF2 + iF2));
        }
        this.f34538a.v(iB2);
        while (i11 < c2675m0.size()) {
            W w13 = this.f34538a;
            int iF3 = c2675m0.f(i11);
            w13.v((iF3 >> 31) ^ (iF3 + iF3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void v(int i10, double d10) {
        this.f34538a.k(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void w(int i10, long j10) {
        this.f34538a.w(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += W.a(((Long) list.get(i12)).longValue());
            }
            this.f34538a.v(iA);
            while (i11 < list.size()) {
                this.f34538a.x(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0 c02 = (C0) list;
        if (!z10) {
            while (i11 < c02.size()) {
                this.f34538a.w(i10, c02.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c02.size(); i13++) {
            iA2 += W.a(c02.f(i13));
        }
        this.f34538a.v(iA2);
        while (i11 < c02.size()) {
            this.f34538a.x(c02.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void y(int i10, float f10) {
        this.f34538a.i(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.wearable.x1
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34538a.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f34538a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += W.a(((Long) list.get(i12)).longValue());
            }
            this.f34538a.v(iA);
            while (i11 < list.size()) {
                this.f34538a.x(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0 c02 = (C0) list;
        if (!z10) {
            while (i11 < c02.size()) {
                this.f34538a.w(i10, c02.f(i11));
                i11++;
            }
            return;
        }
        this.f34538a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c02.size(); i13++) {
            iA2 += W.a(c02.f(i13));
        }
        this.f34538a.v(iA2);
        while (i11 < c02.size()) {
            this.f34538a.x(c02.f(i11));
            i11++;
        }
    }
}
