package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private static final R5<?, ?> f33705a = new S5();

    static int A(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.i(i10, 0L);
    }

    static int B(List<?> list) {
        return list.size() << 3;
    }

    public static void C(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.B(i10, list, z10);
    }

    static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzjn.k0(i10));
    }

    static int E(List<Integer> list) {
        int iT;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iT = 0;
            while (i10 < size) {
                iT += zzjn.T(g42.f(i10));
                i10++;
            }
        } else {
            iT = 0;
            while (i10 < size) {
                iT += zzjn.T(list.get(i10).intValue());
                i10++;
            }
        }
        return iT;
    }

    public static void F(int i10, List<Long> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.z(i10, list, z10);
    }

    static int G(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * zzjn.k0(i10));
    }

    static int H(List<Long> list) {
        int iF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z4) {
            Z4 z42 = (Z4) list;
            iF = 0;
            while (i10 < size) {
                iF += zzjn.F(z42.s(i10));
                i10++;
            }
        } else {
            iF = 0;
            while (i10 < size) {
                iF += zzjn.F(list.get(i10).longValue());
                i10++;
            }
        }
        return iF;
    }

    public static void I(int i10, List<Float> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.H(i10, list, z10);
    }

    static int J(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * zzjn.k0(i10));
    }

    static int K(List<Integer> list) {
        int iG0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iG0 = 0;
            while (i10 < size) {
                iG0 += zzjn.g0(g42.f(i10));
                i10++;
            }
        } else {
            iG0 = 0;
            while (i10 < size) {
                iG0 += zzjn.g0(list.get(i10).intValue());
                i10++;
            }
        }
        return iG0;
    }

    public static void L(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.f(i10, list, z10);
    }

    static int M(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * zzjn.k0(i10));
    }

    static int N(List<Long> list) {
        int iE0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z4) {
            Z4 z42 = (Z4) list;
            iE0 = 0;
            while (i10 < size) {
                iE0 += zzjn.e0(z42.s(i10));
                i10++;
            }
        } else {
            iE0 = 0;
            while (i10 < size) {
                iE0 += zzjn.e0(list.get(i10).longValue());
                i10++;
            }
        }
        return iE0;
    }

    public static void O(int i10, List<Long> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.n(i10, list, z10);
    }

    static int P(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * zzjn.k0(i10));
    }

    static int Q(List<Integer> list) {
        int iO0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iO0 = 0;
            while (i10 < size) {
                iO0 += zzjn.o0(g42.f(i10));
                i10++;
            }
        } else {
            iO0 = 0;
            while (i10 < size) {
                iO0 += zzjn.o0(list.get(i10).intValue());
                i10++;
            }
        }
        return iO0;
    }

    public static void R(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.j(i10, list, z10);
    }

    static int S(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * zzjn.k0(i10));
    }

    static int T(List<Long> list) {
        int iJ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z4) {
            Z4 z42 = (Z4) list;
            iJ0 = 0;
            while (i10 < size) {
                iJ0 += zzjn.j0(z42.s(i10));
                i10++;
            }
        } else {
            iJ0 = 0;
            while (i10 < size) {
                iJ0 += zzjn.j0(list.get(i10).longValue());
                i10++;
            }
        }
        return iJ0;
    }

    public static void U(int i10, List<Long> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.d(i10, list, z10);
    }

    public static void V(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.u(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.c(i10, list, z10);
    }

    public static void X(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.C(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.e(i10, list, z10);
    }

    static int a(int i10, Object obj, C5<?> c52) {
        return obj instanceof R4 ? zzjn.D(i10, (R4) obj) : zzjn.E(i10, (InterfaceC2517k5) obj, c52);
    }

    static int b(int i10, List<Y3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = size * zzjn.k0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iK0 += zzjn.q(list.get(i11));
        }
        return iK0;
    }

    static int c(int i10, List<InterfaceC2517k5> list, C5<?> c52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM += zzjn.m(i10, list.get(i11), c52);
        }
        return iM;
    }

    static int d(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.o(i10, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static R5<?, ?> f() {
        return f33705a;
    }

    static <UT, UB> UB g(Object obj, int i10, int i11, UB ub2, R5<UT, UB> r52) {
        if (ub2 == null) {
            ub2 = r52.i(obj);
        }
        r52.f(ub2, i10, i11);
        return ub2;
    }

    static <UT, UB> UB h(Object obj, int i10, List<Integer> list, K4 k42, UB ub2, R5<UT, UB> r52) {
        if (k42 == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (k42.g(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) g(obj, i10, iIntValue, ub2, r52);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!k42.g(iIntValue2)) {
                    ub2 = (UB) g(obj, i10, iIntValue2, ub2, r52);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void i(int i10, List<Y3> list, InterfaceC2502i6 interfaceC2502i6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.N(i10, list);
    }

    public static void j(int i10, List<?> list, InterfaceC2502i6 interfaceC2502i6, C5<?> c52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.M(i10, list, c52);
    }

    public static void k(int i10, List<Boolean> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.m(i10, list, z10);
    }

    static <T, FT extends InterfaceC2611w4<FT>> void l(AbstractC2587t4<FT> abstractC2587t4, T t10, T t11) {
        C2595u4<T> c2595u4B = abstractC2587t4.b(t11);
        if (c2595u4B.f34397a.isEmpty()) {
            return;
        }
        abstractC2587t4.f(t10).h(c2595u4B);
    }

    static <T> void m(InterfaceC2493h5 interfaceC2493h5, T t10, T t11, long j10) {
        V5.j(t10, j10, interfaceC2493h5.g(V5.B(t10, j10), V5.B(t11, j10)));
    }

    static <T, UT, UB> void n(R5<UT, UB> r52, T t10, T t11) {
        r52.j(t10, r52.b(r52.k(t10), r52.k(t11)));
    }

    public static void o(Class<?> cls) {
        F4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iK0 = zzjn.k0(i10) * size;
        if (list instanceof U4) {
            U4 u42 = (U4) list;
            while (i11 < size) {
                Object objG = u42.g(i11);
                iK0 += objG instanceof Y3 ? zzjn.q((Y3) objG) : zzjn.u((String) objG);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iK0 += obj instanceof Y3 ? zzjn.q((Y3) obj) : zzjn.u((String) obj);
                i11++;
            }
        }
        return iK0;
    }

    static int r(int i10, List<?> list, C5<?> c52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = zzjn.k0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iK0 += obj instanceof R4 ? zzjn.r((R4) obj) : zzjn.t((InterfaceC2517k5) obj, c52);
        }
        return iK0;
    }

    static int s(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzjn.k0(i10));
    }

    static int t(List<Integer> list) {
        int iE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iE = 0;
            while (i10 < size) {
                iE += zzjn.e(g42.f(i10));
                i10++;
            }
        } else {
            iE = 0;
            while (i10 < size) {
                iE += zzjn.e(list.get(i10).intValue());
                i10++;
            }
        }
        return iE;
    }

    public static void u(int i10, List<String> list, InterfaceC2502i6 interfaceC2502i6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.D(i10, list);
    }

    public static void v(int i10, List<?> list, InterfaceC2502i6 interfaceC2502i6, C5<?> c52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.F(i10, list, c52);
    }

    public static void w(int i10, List<Double> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.r(i10, list, z10);
    }

    static int x(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.A(i10, 0);
    }

    static int y(List<?> list) {
        return list.size() << 2;
    }

    public static void z(int i10, List<Integer> list, InterfaceC2502i6 interfaceC2502i6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2502i6.b(i10, list, z10);
    }
}
