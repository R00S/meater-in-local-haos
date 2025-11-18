package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2065k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f24992a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24993a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f24993a = iArr;
            try {
                iArr[r0.b.f25058K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24993a[r0.b.f25057J.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24993a[r0.b.f25055H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24993a[r0.b.f25065R.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24993a[r0.b.f25067T.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24993a[r0.b.f25063P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24993a[r0.b.f25056I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24993a[r0.b.f25053F.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24993a[r0.b.f25066S.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24993a[r0.b.f25068U.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24993a[r0.b.f25054G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24993a[r0.b.f25059L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2065k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C2079z.b(codedOutputStream, "output");
        this.f24992a = codedOutputStream2;
        codedOutputStream2.f24834a = this;
    }

    public static C2065k P(CodedOutputStream codedOutputStream) {
        C2065k c2065k = codedOutputStream.f24834a;
        return c2065k != null ? c2065k : new C2065k(codedOutputStream);
    }

    private <V> void Q(int i10, boolean z10, V v10, I.a<Boolean, V> aVar) {
        this.f24992a.W0(i10, 2);
        this.f24992a.Y0(I.b(aVar, Boolean.valueOf(z10), v10));
        I.e(this.f24992a, aVar, Boolean.valueOf(z10), v10);
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
            this.f24992a.W0(i10, 2);
            this.f24992a.Y0(I.b(aVar, Integer.valueOf(i13), v10));
            I.e(this.f24992a, aVar, Integer.valueOf(i13), v10);
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
            this.f24992a.W0(i10, 2);
            this.f24992a.Y0(I.b(aVar, Long.valueOf(j10), v10));
            I.e(this.f24992a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, I.a<K, V> aVar, Map<K, V> map) {
        switch (a.f24993a[aVar.f24860a.ordinal()]) {
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
                throw new IllegalArgumentException("does not support key type: " + aVar.f24860a);
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
            this.f24992a.W0(i10, 2);
            this.f24992a.Y0(I.b(aVar, str, v10));
            I.e(this.f24992a, aVar, str, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f24992a.U0(i10, (String) obj);
        } else {
            this.f24992a.o0(i10, (AbstractC2062h) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i10, float f10) {
        this.f24992a.y0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i10) {
        this.f24992a.W0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.Q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).intValue());
        }
        this.f24992a.Y0(iQ);
        while (i11 < list.size()) {
            this.f24992a.R0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i10, int i11) {
        this.f24992a.s0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.G0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f24992a.Y0(iY);
        while (i11 < list.size()) {
            this.f24992a.H0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.s0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f24992a.Y0(iL);
        while (i11 < list.size()) {
            this.f24992a.t0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.q0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f24992a.Y0(iJ);
        while (i11 < list.size()) {
            this.f24992a.r0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i10, int i11) {
        this.f24992a.Q0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i10, List<AbstractC2062h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f24992a.o0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i10, List<?> list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i10, AbstractC2062h abstractC2062h) {
        this.f24992a.o0(i10, abstractC2062h);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i10, Object obj, f0 f0Var) {
        this.f24992a.I0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public <K, V> void N(int i10, I.a<K, V> aVar, Map<K, V> map) {
        if (this.f24992a.e0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f24992a.W0(i10, 2);
            this.f24992a.Y0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f24992a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i10, Object obj, f0 f0Var) {
        this.f24992a.B0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.y0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f24992a.Y0(iR);
        while (i11 < list.size()) {
            this.f24992a.z0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i10, int i11) {
        this.f24992a.X0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC2062h) {
            this.f24992a.L0(i10, (AbstractC2062h) obj);
        } else {
            this.f24992a.K0(i10, (P) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i10, int i11) {
        this.f24992a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i10, double d10) {
        this.f24992a.q0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).longValue());
        }
        this.f24992a.Y0(iO);
        while (i11 < list.size()) {
            this.f24992a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.Z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += CodedOutputStream.Z(list.get(i12).longValue());
        }
        this.f24992a.Y0(iZ);
        while (i11 < list.size()) {
            this.f24992a.a1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i10, long j10) {
        this.f24992a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof E)) {
            while (i11 < list.size()) {
                this.f24992a.U0(i10, list.get(i11));
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

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i10, String str) {
        this.f24992a.U0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i10, long j10) {
        this.f24992a.Z0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.E0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f24992a.Y0(iW);
        while (i11 < list.size()) {
            this.f24992a.F0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i10, long j10) {
        this.f24992a.G0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i10, boolean z10) {
        this.f24992a.k0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i10, int i11) {
        this.f24992a.M0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i10) {
        this.f24992a.W0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i10, int i11) {
        this.f24992a.E0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.w0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f24992a.Y0(iP);
        while (i11 < list.size()) {
            this.f24992a.x0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(list.get(i12).intValue());
        }
        this.f24992a.Y0(iM);
        while (i11 < list.size()) {
            this.f24992a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i10, long j10) {
        this.f24992a.O0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.u0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f24992a.Y0(iN);
        while (i11 < list.size()) {
            this.f24992a.v0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.k0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f24992a.Y0(iE);
        while (i11 < list.size()) {
            this.f24992a.l0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.X0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.X(list.get(i12).intValue());
        }
        this.f24992a.Y0(iX);
        while (i11 < list.size()) {
            this.f24992a.Y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24992a.S0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f24992a.W0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += CodedOutputStream.S(list.get(i12).longValue());
        }
        this.f24992a.Y0(iS);
        while (i11 < list.size()) {
            this.f24992a.T0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i10, long j10) {
        this.f24992a.S0(i10, j10);
    }
}
