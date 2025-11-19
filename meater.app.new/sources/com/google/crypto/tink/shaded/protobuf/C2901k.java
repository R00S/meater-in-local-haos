package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2901k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f37870a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37871a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f37871a = iArr;
            try {
                iArr[r0.b.f37934K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37871a[r0.b.f37933J.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37871a[r0.b.f37931H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37871a[r0.b.f37941R.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37871a[r0.b.f37943T.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37871a[r0.b.f37939P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37871a[r0.b.f37932I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37871a[r0.b.f37929F.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37871a[r0.b.f37942S.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37871a[r0.b.f37944U.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37871a[r0.b.f37930G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37871a[r0.b.f37935L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2901k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C2915z.b(codedOutputStream, "output");
        this.f37870a = codedOutputStream2;
        codedOutputStream2.f37724a = this;
    }

    public static C2901k P(CodedOutputStream codedOutputStream) {
        C2901k c2901k = codedOutputStream.f37724a;
        return c2901k != null ? c2901k : new C2901k(codedOutputStream);
    }

    private <K, V> void Q(int i10, I.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f37871a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f37870a.K0(i10, (String) obj);
        } else {
            this.f37870a.i0(i10, (AbstractC2898h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void A(int i10, float f10) {
        this.f37870a.r0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    @Deprecated
    public void B(int i10) {
        this.f37870a.L0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void C(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.G0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).intValue());
        }
        this.f37870a.N0(iO);
        while (i11 < list.size()) {
            this.f37870a.H0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void D(int i10, int i11) {
        this.f37870a.l0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void E(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.x0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f37870a.N0(iY);
        while (i11 < list.size()) {
            this.f37870a.y0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void F(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.l0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f37870a.N0(iL);
        while (i11 < list.size()) {
            this.f37870a.m0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.j0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f37870a.N0(iJ);
        while (i11 < list.size()) {
            this.f37870a.k0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void H(int i10, int i11) {
        this.f37870a.G0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void I(int i10, List<AbstractC2898h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f37870a.i0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void J(int i10, Object obj, f0 f0Var) {
        this.f37870a.z0(i10, (P) obj, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public <K, V> void K(int i10, I.a<K, V> aVar, Map<K, V> map) {
        if (this.f37870a.b0()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f37870a.L0(i10, 2);
            this.f37870a.N0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.d(this.f37870a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void L(int i10, Object obj, f0 f0Var) {
        this.f37870a.t0(i10, (P) obj, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void M(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void N(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            J(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void O(int i10, AbstractC2898h abstractC2898h) {
        this.f37870a.i0(i10, abstractC2898h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.r0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f37870a.N0(iR);
        while (i11 < list.size()) {
            this.f37870a.s0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void b(int i10, int i11) {
        this.f37870a.M0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC2898h) {
            this.f37870a.B0(i10, (AbstractC2898h) obj);
        } else {
            this.f37870a.A0(i10, (P) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void d(int i10, int i11) {
        this.f37870a.n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void e(int i10, double d10) {
        this.f37870a.j0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void f(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.E0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(list.get(i12).longValue());
        }
        this.f37870a.N0(iM);
        while (i11 < list.size()) {
            this.f37870a.F0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void g(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.X(list.get(i12).longValue());
        }
        this.f37870a.N0(iX);
        while (i11 < list.size()) {
            this.f37870a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void h(int i10, long j10) {
        this.f37870a.p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void j(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof E)) {
            while (i11 < list.size()) {
                this.f37870a.K0(i10, list.get(i11));
                i11++;
            }
        } else {
            E e10 = (E) list;
            while (i11 < list.size()) {
                R(i10, e10.p(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void k(int i10, String str) {
        this.f37870a.K0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void l(int i10, long j10) {
        this.f37870a.O0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void m(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.v0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f37870a.N0(iW);
        while (i11 < list.size()) {
            this.f37870a.w0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void n(int i10, long j10) {
        this.f37870a.x0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void o(int i10, boolean z10) {
        this.f37870a.g0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void p(int i10, int i11) {
        this.f37870a.C0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    @Deprecated
    public void q(int i10) {
        this.f37870a.L0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void r(int i10, int i11) {
        this.f37870a.v0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void s(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.p0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f37870a.N0(iP);
        while (i11 < list.size()) {
            this.f37870a.q0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void t(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.C0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.K(list.get(i12).intValue());
        }
        this.f37870a.N0(iK);
        while (i11 < list.size()) {
            this.f37870a.D0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void u(int i10, long j10) {
        this.f37870a.E0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void v(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.n0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f37870a.N0(iN);
        while (i11 < list.size()) {
            this.f37870a.o0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void w(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f37870a.N0(iE);
        while (i11 < list.size()) {
            this.f37870a.h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void x(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.V(list.get(i12).intValue());
        }
        this.f37870a.N0(iV);
        while (i11 < list.size()) {
            this.f37870a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37870a.I0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f37870a.L0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).longValue());
        }
        this.f37870a.N0(iQ);
        while (i11 < list.size()) {
            this.f37870a.J0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void z(int i10, long j10) {
        this.f37870a.I0(i10, j10);
    }
}
