package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2073t;
import androidx.datastore.preferences.protobuf.C2079z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f24935a = B();

    /* renamed from: b, reason: collision with root package name */
    private static final l0<?, ?> f24936b = C(false);

    /* renamed from: c, reason: collision with root package name */
    private static final l0<?, ?> f24937c = C(true);

    /* renamed from: d, reason: collision with root package name */
    private static final l0<?, ?> f24938d = new n0();

    static <UT, UB> UB A(int i10, List<Integer> list, C2079z.e eVar, UB ub2, l0<UT, UB> l0Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (eVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, iIntValue, ub2, l0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.a(iIntValue2)) {
                    ub2 = (UB) L(i10, iIntValue2, ub2, l0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static l0<?, ?> C(boolean z10) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (l0) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends C2073t.b<FT>> void E(AbstractC2070p<FT> abstractC2070p, T t10, T t11) {
        C2073t<T> c2073tC = abstractC2070p.c(t11);
        if (c2073tC.n()) {
            return;
        }
        abstractC2070p.d(t10).u(c2073tC);
    }

    static <T> void F(K k10, T t10, T t11, long j10) {
        p0.O(t10, j10, k10.a(p0.A(t10, j10), p0.A(t11, j10)));
    }

    static <T, UT, UB> void G(l0<UT, UB> l0Var, T t10, T t11) {
        l0Var.p(t10, l0Var.k(l0Var.g(t10), l0Var.g(t11)));
    }

    public static l0<?, ?> H() {
        return f24936b;
    }

    public static l0<?, ?> I() {
        return f24937c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC2077x.class.isAssignableFrom(cls) && (cls2 = f24935a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i10, int i11, UB ub2, l0<UT, UB> l0Var) {
        if (ub2 == null) {
            ub2 = l0Var.n();
        }
        l0Var.e(ub2, i10, i11);
        return ub2;
    }

    public static l0<?, ?> M() {
        return f24938d;
    }

    public static void N(int i10, List<Boolean> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.w(i10, list, z10);
    }

    public static void O(int i10, List<AbstractC2062h> list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i10, list);
    }

    public static void P(int i10, List<Double> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.s(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, z10);
    }

    public static void U(int i10, List<?> list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i10, list, f0Var);
    }

    public static void V(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.m(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.E(i10, list, z10);
    }

    public static void X(int i10, List<?> list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i10, list, f0Var);
    }

    public static void Y(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.t(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i10, list, z10);
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(size) : size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i10, list, z10);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i10, list, z10);
    }

    static int c(int i10, List<AbstractC2062h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = size * CodedOutputStream.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iV += CodedOutputStream.h(list.get(i11));
        }
        return iV;
    }

    public static void c0(int i10, List<String> list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i10, list);
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iE) : iE + (size * CodedOutputStream.V(i10));
    }

    public static void d0(int i10, List<Integer> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.x(i10, list, z10);
    }

    static int e(List<Integer> list) {
        int iL;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2078y) {
            C2078y c2078y = (C2078y) list;
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(c2078y.getInt(i10));
                i10++;
            }
        } else {
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(list.get(i10).intValue());
                i10++;
            }
        }
        return iL;
    }

    public static void e0(int i10, List<Long> list, s0 s0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i10, list, z10);
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(size * 4) : size * CodedOutputStream.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(size * 8) : size * CodedOutputStream.o(i10, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<P> list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += CodedOutputStream.s(i10, list.get(i11), f0Var);
        }
        return iS;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iL) : iL + (size * CodedOutputStream.V(i10));
    }

    static int l(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2078y) {
            C2078y c2078y = (C2078y) list;
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(c2078y.getInt(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(list.get(i10).intValue());
                i10++;
            }
        }
        return iW;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iN) : iN + (list.size() * CodedOutputStream.V(i10));
    }

    static int n(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(g10.w(i10));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    static int o(int i10, Object obj, f0 f0Var) {
        return obj instanceof C ? CodedOutputStream.A(i10, (C) obj) : CodedOutputStream.F(i10, (P) obj, f0Var);
    }

    static int p(int i10, List<?> list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = CodedOutputStream.V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iV += obj instanceof C ? CodedOutputStream.B((C) obj) : CodedOutputStream.H((P) obj, f0Var);
        }
        return iV;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iR) : iR + (size * CodedOutputStream.V(i10));
    }

    static int r(List<Integer> list) {
        int iQ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2078y) {
            C2078y c2078y = (C2078y) list;
            iQ = 0;
            while (i10 < size) {
                iQ += CodedOutputStream.Q(c2078y.getInt(i10));
                i10++;
            }
        } else {
            iQ = 0;
            while (i10 < size) {
                iQ += CodedOutputStream.Q(list.get(i10).intValue());
                i10++;
            }
        }
        return iQ;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iT) : iT + (size * CodedOutputStream.V(i10));
    }

    static int t(List<Long> list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            iS = 0;
            while (i10 < size) {
                iS += CodedOutputStream.S(g10.w(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += CodedOutputStream.S(list.get(i10).longValue());
                i10++;
            }
        }
        return iS;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = CodedOutputStream.V(i10) * size;
        if (list instanceof E) {
            E e10 = (E) list;
            while (i11 < size) {
                Object objP = e10.p(i11);
                iV += objP instanceof AbstractC2062h ? CodedOutputStream.h((AbstractC2062h) objP) : CodedOutputStream.U((String) objP);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iV += obj instanceof AbstractC2062h ? CodedOutputStream.h((AbstractC2062h) obj) : CodedOutputStream.U((String) obj);
                i11++;
            }
        }
        return iV;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iW) : iW + (size * CodedOutputStream.V(i10));
    }

    static int w(List<Integer> list) {
        int iX;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2078y) {
            C2078y c2078y = (C2078y) list;
            iX = 0;
            while (i10 < size) {
                iX += CodedOutputStream.X(c2078y.getInt(i10));
                i10++;
            }
        } else {
            iX = 0;
            while (i10 < size) {
                iX += CodedOutputStream.X(list.get(i10).intValue());
                i10++;
            }
        }
        return iX;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.V(i10) + CodedOutputStream.C(iY) : iY + (size * CodedOutputStream.V(i10));
    }

    static int y(List<Long> list) {
        int iZ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            iZ = 0;
            while (i10 < size) {
                iZ += CodedOutputStream.Z(g10.w(i10));
                i10++;
            }
        } else {
            iZ = 0;
            while (i10 < size) {
                iZ += CodedOutputStream.Z(list.get(i10).longValue());
                i10++;
            }
        }
        return iZ;
    }

    static <UT, UB> UB z(int i10, List<Integer> list, C2079z.d<?> dVar, UB ub2, l0<UT, UB> l0Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (dVar.a(iIntValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, iIntValue, ub2, l0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.a(iIntValue2) == null) {
                    ub2 = (UB) L(i10, iIntValue2, ub2, l0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
