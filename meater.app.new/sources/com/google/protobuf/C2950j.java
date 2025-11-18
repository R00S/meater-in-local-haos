package com.google.protobuf;

import com.google.protobuf.I;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2950j implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f39294a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: com.google.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39295a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f39295a = iArr;
            try {
                iArr[r0.b.f39364K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39295a[r0.b.f39363J.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39295a[r0.b.f39361H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39295a[r0.b.f39371R.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39295a[r0.b.f39373T.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39295a[r0.b.f39369P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39295a[r0.b.f39362I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39295a[r0.b.f39359F.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39295a[r0.b.f39372S.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39295a[r0.b.f39374U.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39295a[r0.b.f39360G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39295a[r0.b.f39365L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2950j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C2964y.b(codedOutputStream, "output");
        this.f39294a = codedOutputStream2;
        codedOutputStream2.f39157a = this;
    }

    public static C2950j P(CodedOutputStream codedOutputStream) {
        C2950j c2950j = codedOutputStream.f39157a;
        return c2950j != null ? c2950j : new C2950j(codedOutputStream);
    }

    private <V> void Q(int i10, boolean z10, V v10, I.a<Boolean, V> aVar) {
        this.f39294a.S0(i10, 2);
        this.f39294a.U0(I.b(aVar, Boolean.valueOf(z10), v10));
        I.e(this.f39294a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, I.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f39294a.S0(i10, 2);
            this.f39294a.U0(I.b(aVar, Integer.valueOf(i13), v10));
            I.e(this.f39294a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, I.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f39294a.S0(i10, 2);
            this.f39294a.U0(I.b(aVar, Long.valueOf(j10), v10));
            I.e(this.f39294a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, I.a<K, V> aVar, Map<K, V> map) {
        switch (a.f39295a[aVar.f39179a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                S(i10, aVar, map);
                return;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f39179a);
        }
    }

    private <V> void U(int i10, I.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f39294a.S0(i10, 2);
            this.f39294a.U0(I.b(aVar, str, v10));
            I.e(this.f39294a, aVar, str, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f39294a.Q0(i10, (String) obj);
        } else {
            this.f39294a.k0(i10, (AbstractC2947g) obj);
        }
    }

    @Override // com.google.protobuf.s0
    public void A(int i10, float f10) {
        this.f39294a.u0(i10, f10);
    }

    @Override // com.google.protobuf.s0
    @Deprecated
    public void B(int i10) {
        this.f39294a.S0(i10, 4);
    }

    @Override // com.google.protobuf.s0
    public void C(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).intValue());
        }
        this.f39294a.U0(iO);
        while (i11 < list.size()) {
            this.f39294a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void D(int i10, int i11) {
        this.f39294a.o0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void E(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.C0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f39294a.U0(iY);
        while (i11 < list.size()) {
            this.f39294a.D0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void F(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f39294a.U0(iL);
        while (i11 < list.size()) {
            this.f39294a.p0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.m0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f39294a.U0(iJ);
        while (i11 < list.size()) {
            this.f39294a.n0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void H(int i10, int i11) {
        this.f39294a.M0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void I(int i10, List<AbstractC2947g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f39294a.k0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.s0
    public void J(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.protobuf.s0
    public void K(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.protobuf.s0
    public void L(int i10, Object obj, f0 f0Var) {
        this.f39294a.E0(i10, (P) obj, f0Var);
    }

    @Override // com.google.protobuf.s0
    public void M(int i10, Object obj, f0 f0Var) {
        this.f39294a.x0(i10, (P) obj, f0Var);
    }

    @Override // com.google.protobuf.s0
    public void N(int i10, AbstractC2947g abstractC2947g) {
        this.f39294a.k0(i10, abstractC2947g);
    }

    @Override // com.google.protobuf.s0
    public <K, V> void O(int i10, I.a<K, V> aVar, Map<K, V> map) {
        if (this.f39294a.b0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f39294a.S0(i10, 2);
            this.f39294a.U0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f39294a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.s0
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.u0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f39294a.U0(iR);
        while (i11 < list.size()) {
            this.f39294a.v0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void b(int i10, int i11) {
        this.f39294a.T0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC2947g) {
            this.f39294a.H0(i10, (AbstractC2947g) obj);
        } else {
            this.f39294a.G0(i10, (P) obj);
        }
    }

    @Override // com.google.protobuf.s0
    public void d(int i10, int i11) {
        this.f39294a.q0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void e(int i10, double d10) {
        this.f39294a.m0(i10, d10);
    }

    @Override // com.google.protobuf.s0
    public void f(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.K0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(list.get(i12).longValue());
        }
        this.f39294a.U0(iM);
        while (i11 < list.size()) {
            this.f39294a.L0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void g(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.V0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.X(list.get(i12).longValue());
        }
        this.f39294a.U0(iX);
        while (i11 < list.size()) {
            this.f39294a.W0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void h(int i10, long j10) {
        this.f39294a.s0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // com.google.protobuf.s0
    public void j(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof E)) {
            while (i11 < list.size()) {
                this.f39294a.Q0(i10, list.get(i11));
                i11++;
            }
        } else {
            E e10 = (E) list;
            while (i11 < list.size()) {
                V(i10, e10.p(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.s0
    public void k(int i10, String str) {
        this.f39294a.Q0(i10, str);
    }

    @Override // com.google.protobuf.s0
    public void l(int i10, long j10) {
        this.f39294a.V0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void m(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.A0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f39294a.U0(iW);
        while (i11 < list.size()) {
            this.f39294a.B0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void n(int i10, long j10) {
        this.f39294a.C0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void o(int i10, boolean z10) {
        this.f39294a.g0(i10, z10);
    }

    @Override // com.google.protobuf.s0
    public void p(int i10, int i11) {
        this.f39294a.I0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    @Deprecated
    public void q(int i10) {
        this.f39294a.S0(i10, 3);
    }

    @Override // com.google.protobuf.s0
    public void r(int i10, int i11) {
        this.f39294a.A0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void s(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.s0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f39294a.U0(iP);
        while (i11 < list.size()) {
            this.f39294a.t0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void t(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.I0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.K(list.get(i12).intValue());
        }
        this.f39294a.U0(iK);
        while (i11 < list.size()) {
            this.f39294a.J0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void u(int i10, long j10) {
        this.f39294a.K0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void v(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f39294a.U0(iN);
        while (i11 < list.size()) {
            this.f39294a.r0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void w(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f39294a.U0(iE);
        while (i11 < list.size()) {
            this.f39294a.h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void x(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.T0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.V(list.get(i12).intValue());
        }
        this.f39294a.U0(iV);
        while (i11 < list.size()) {
            this.f39294a.U0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39294a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f39294a.S0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).longValue());
        }
        this.f39294a.U0(iQ);
        while (i11 < list.size()) {
            this.f39294a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void z(int i10, long j10) {
        this.f39294a.O0(i10, j10);
    }
}
