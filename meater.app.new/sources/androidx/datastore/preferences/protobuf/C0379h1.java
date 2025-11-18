package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import androidx.datastore.preferences.protobuf.C0415u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* renamed from: androidx.datastore.preferences.protobuf.h1 */
/* loaded from: classes.dex */
final class C0379h1 {

    /* renamed from: a */
    private static final Class<?> f2749a = m2755B();

    /* renamed from: b */
    private static final AbstractC0391l1<?, ?> f2750b = m2756C(false);

    /* renamed from: c */
    private static final AbstractC0391l1<?, ?> f2751c = m2756C(true);

    /* renamed from: d */
    private static final AbstractC0391l1<?, ?> f2752d = new C0397n1();

    /* renamed from: A */
    static <UT, UB> UB m2754A(int i2, List<Integer> list, C0357a0.e eVar, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (eVar.m2568a(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) m2765L(i2, iIntValue, ub, abstractC0391l1);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.m2568a(iIntValue2)) {
                    ub = (UB) m2765L(i2, iIntValue2, ub, abstractC0391l1);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m2755B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static AbstractC0391l1<?, ?> m2756C(boolean z) {
        try {
            Class<?> clsM2757D = m2757D();
            if (clsM2757D == null) {
                return null;
            }
            return (AbstractC0391l1) clsM2757D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m2757D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends C0415u.b<FT>> void m2758E(AbstractC0404q<FT> abstractC0404q, T t, T t2) {
        C0415u<T> c0415uMo3144c = abstractC0404q.mo3144c(t2);
        if (c0415uMo3144c.m3293n()) {
            return;
        }
        abstractC0404q.mo3145d(t).m3298u(c0415uMo3144c);
    }

    /* renamed from: F */
    static <T> void m2759F(InterfaceC0390l0 interfaceC0390l0, T t, T t2, long j2) {
        C0403p1.m3095O(t, j2, interfaceC0390l0.mo2990a(C0403p1.m3081A(t, j2), C0403p1.m3081A(t2, j2)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m2760G(AbstractC0391l1<UT, UB> abstractC0391l1, T t, T t2) {
        abstractC0391l1.mo3013p(t, abstractC0391l1.mo3008k(abstractC0391l1.mo3004g(t), abstractC0391l1.mo3004g(t2)));
    }

    /* renamed from: H */
    public static AbstractC0391l1<?, ?> m2761H() {
        return f2750b;
    }

    /* renamed from: I */
    public static AbstractC0391l1<?, ?> m2762I() {
        return f2751c;
    }

    /* renamed from: J */
    public static void m2763J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC0423y.class.isAssignableFrom(cls) && (cls2 = f2749a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m2764K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    static <UT, UB> UB m2765L(int i2, int i3, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) {
        if (ub == null) {
            ub = abstractC0391l1.mo3011n();
        }
        abstractC0391l1.mo3002e(ub, i2, i3);
        return ub;
    }

    /* renamed from: M */
    public static AbstractC0391l1<?, ?> m2766M() {
        return f2752d;
    }

    /* renamed from: N */
    public static void m2767N(int i2, List<Boolean> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2949A(i2, list, z);
    }

    /* renamed from: O */
    public static void m2768O(int i2, List<AbstractC0377h> list, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2962N(i2, list);
    }

    /* renamed from: P */
    public static void m2769P(int i2, List<Double> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2959K(i2, list, z);
    }

    /* renamed from: Q */
    public static void m2770Q(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2958J(i2, list, z);
    }

    /* renamed from: R */
    public static void m2771R(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2988y(i2, list, z);
    }

    /* renamed from: S */
    public static void m2772S(int i2, List<Long> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2984u(i2, list, z);
    }

    /* renamed from: T */
    public static void m2773T(int i2, List<Float> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2964a(i2, list, z);
    }

    /* renamed from: U */
    public static void m2774U(int i2, List<?> list, InterfaceC0412s1 interfaceC0412s1, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2975l(i2, list, interfaceC0373f1);
    }

    /* renamed from: V */
    public static void m2775V(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2978o(i2, list, z);
    }

    /* renamed from: W */
    public static void m2776W(int i2, List<Long> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2957I(i2, list, z);
    }

    /* renamed from: X */
    public static void m2777X(int i2, List<?> list, InterfaceC0412s1 interfaceC0412s1, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2973j(i2, list, interfaceC0373f1);
    }

    /* renamed from: Y */
    public static void m2778Y(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2985v(i2, list, z);
    }

    /* renamed from: Z */
    public static void m2779Z(int i2, List<Long> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2969f(i2, list, z);
    }

    /* renamed from: a */
    static int m2780a(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(size) : size * CodedOutputStream.m2440d(i2, true);
    }

    /* renamed from: a0 */
    public static void m2781a0(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2955G(i2, list, z);
    }

    /* renamed from: b */
    static int m2782b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m2783b0(int i2, List<Long> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2951C(i2, list, z);
    }

    /* renamed from: c */
    static int m2784c(int i2, List<AbstractC0377h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2432V = size * CodedOutputStream.m2432V(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2432V += CodedOutputStream.m2446h(list.get(i3));
        }
        return iM2432V;
    }

    /* renamed from: c0 */
    public static void m2785c0(int i2, List<String> list, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2974k(i2, list);
    }

    /* renamed from: d */
    static int m2786d(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2788e = m2788e(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2788e) : iM2788e + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: d0 */
    public static void m2787d0(int i2, List<Integer> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2950B(i2, list, z);
    }

    /* renamed from: e */
    static int m2788e(List<Integer> list) {
        int iM2451l;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0425z) {
            C0425z c0425z = (C0425z) list;
            iM2451l = 0;
            while (i2 < size) {
                iM2451l += CodedOutputStream.m2451l(c0425z.m3372q(i2));
                i2++;
            }
        } else {
            iM2451l = 0;
            while (i2 < size) {
                iM2451l += CodedOutputStream.m2451l(list.get(i2).intValue());
                i2++;
            }
        }
        return iM2451l;
    }

    /* renamed from: e0 */
    public static void m2789e0(int i2, List<Long> list, InterfaceC0412s1 interfaceC0412s1, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0412s1.mo2970g(i2, list, z);
    }

    /* renamed from: f */
    static int m2790f(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(size * 4) : size * CodedOutputStream.m2452m(i2, 0);
    }

    /* renamed from: g */
    static int m2791g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m2792h(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(size * 8) : size * CodedOutputStream.m2454o(i2, 0L);
    }

    /* renamed from: i */
    static int m2793i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m2794j(int i2, List<InterfaceC0405q0> list, InterfaceC0373f1 interfaceC0373f1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2458s = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM2458s += CodedOutputStream.m2458s(i2, list.get(i3), interfaceC0373f1);
        }
        return iM2458s;
    }

    /* renamed from: k */
    static int m2795k(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2796l = m2796l(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2796l) : iM2796l + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: l */
    static int m2796l(List<Integer> list) {
        int iM2462w;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0425z) {
            C0425z c0425z = (C0425z) list;
            iM2462w = 0;
            while (i2 < size) {
                iM2462w += CodedOutputStream.m2462w(c0425z.m3372q(i2));
                i2++;
            }
        } else {
            iM2462w = 0;
            while (i2 < size) {
                iM2462w += CodedOutputStream.m2462w(list.get(i2).intValue());
                i2++;
            }
        }
        return iM2462w;
    }

    /* renamed from: m */
    static int m2797m(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iM2798n = m2798n(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2798n) : iM2798n + (list.size() * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: n */
    static int m2798n(List<Long> list) {
        int iM2464y;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0378h0) {
            C0378h0 c0378h0 = (C0378h0) list;
            iM2464y = 0;
            while (i2 < size) {
                iM2464y += CodedOutputStream.m2464y(c0378h0.m2749q(i2));
                i2++;
            }
        } else {
            iM2464y = 0;
            while (i2 < size) {
                iM2464y += CodedOutputStream.m2464y(list.get(i2).longValue());
                i2++;
            }
        }
        return iM2464y;
    }

    /* renamed from: o */
    static int m2799o(int i2, Object obj, InterfaceC0373f1 interfaceC0373f1) {
        return obj instanceof C0366d0 ? CodedOutputStream.m2411A(i2, (C0366d0) obj) : CodedOutputStream.m2416F(i2, (InterfaceC0405q0) obj, interfaceC0373f1);
    }

    /* renamed from: p */
    static int m2800p(int i2, List<?> list, InterfaceC0373f1 interfaceC0373f1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2432V = CodedOutputStream.m2432V(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iM2432V += obj instanceof C0366d0 ? CodedOutputStream.m2412B((C0366d0) obj) : CodedOutputStream.m2418H((InterfaceC0405q0) obj, interfaceC0373f1);
        }
        return iM2432V;
    }

    /* renamed from: q */
    static int m2801q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2802r = m2802r(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2802r) : iM2802r + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: r */
    static int m2802r(List<Integer> list) {
        int iM2427Q;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0425z) {
            C0425z c0425z = (C0425z) list;
            iM2427Q = 0;
            while (i2 < size) {
                iM2427Q += CodedOutputStream.m2427Q(c0425z.m3372q(i2));
                i2++;
            }
        } else {
            iM2427Q = 0;
            while (i2 < size) {
                iM2427Q += CodedOutputStream.m2427Q(list.get(i2).intValue());
                i2++;
            }
        }
        return iM2427Q;
    }

    /* renamed from: s */
    static int m2803s(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2804t = m2804t(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2804t) : iM2804t + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: t */
    static int m2804t(List<Long> list) {
        int iM2429S;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0378h0) {
            C0378h0 c0378h0 = (C0378h0) list;
            iM2429S = 0;
            while (i2 < size) {
                iM2429S += CodedOutputStream.m2429S(c0378h0.m2749q(i2));
                i2++;
            }
        } else {
            iM2429S = 0;
            while (i2 < size) {
                iM2429S += CodedOutputStream.m2429S(list.get(i2).longValue());
                i2++;
            }
        }
        return iM2429S;
    }

    /* renamed from: u */
    static int m2805u(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iM2432V = CodedOutputStream.m2432V(i2) * size;
        if (list instanceof InterfaceC0372f0) {
            InterfaceC0372f0 interfaceC0372f0 = (InterfaceC0372f0) list;
            while (i3 < size) {
                Object objMo2672c1 = interfaceC0372f0.mo2672c1(i3);
                iM2432V += objMo2672c1 instanceof AbstractC0377h ? CodedOutputStream.m2446h((AbstractC0377h) objMo2672c1) : CodedOutputStream.m2431U((String) objMo2672c1);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iM2432V += obj instanceof AbstractC0377h ? CodedOutputStream.m2446h((AbstractC0377h) obj) : CodedOutputStream.m2431U((String) obj);
                i3++;
            }
        }
        return iM2432V;
    }

    /* renamed from: v */
    static int m2806v(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2807w = m2807w(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2807w) : iM2807w + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: w */
    static int m2807w(List<Integer> list) {
        int iM2434X;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0425z) {
            C0425z c0425z = (C0425z) list;
            iM2434X = 0;
            while (i2 < size) {
                iM2434X += CodedOutputStream.m2434X(c0425z.m3372q(i2));
                i2++;
            }
        } else {
            iM2434X = 0;
            while (i2 < size) {
                iM2434X += CodedOutputStream.m2434X(list.get(i2).intValue());
                i2++;
            }
        }
        return iM2434X;
    }

    /* renamed from: x */
    static int m2808x(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2809y = m2809y(list);
        return z ? CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(iM2809y) : iM2809y + (size * CodedOutputStream.m2432V(i2));
    }

    /* renamed from: y */
    static int m2809y(List<Long> list) {
        int iM2436Z;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0378h0) {
            C0378h0 c0378h0 = (C0378h0) list;
            iM2436Z = 0;
            while (i2 < size) {
                iM2436Z += CodedOutputStream.m2436Z(c0378h0.m2749q(i2));
                i2++;
            }
        } else {
            iM2436Z = 0;
            while (i2 < size) {
                iM2436Z += CodedOutputStream.m2436Z(list.get(i2).longValue());
                i2++;
            }
        }
        return iM2436Z;
    }

    /* renamed from: z */
    static <UT, UB> UB m2810z(int i2, List<Integer> list, C0357a0.d<?> dVar, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (dVar.m2567a(iIntValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) m2765L(i2, iIntValue, ub, abstractC0391l1);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.m2567a(iIntValue2) == null) {
                    ub = (UB) m2765L(i2, iIntValue2, ub, abstractC0391l1);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
