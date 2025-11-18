package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.nw */
/* loaded from: classes2.dex */
final class C6984nw {

    /* renamed from: a */
    private static final Class<?> f20107a = m15650t();

    /* renamed from: b */
    private static final AbstractC6578cx<?, ?> f20108b = m15655y(false);

    /* renamed from: c */
    private static final AbstractC6578cx<?, ?> f20109c = m15655y(true);

    /* renamed from: d */
    private static final AbstractC6578cx<?, ?> f20110d = new C6615dx();

    /* renamed from: A */
    static int m15601A(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iM19635h0 = zzdni.m19635h0(i2) * size;
        if (list instanceof zzdot) {
            zzdot zzdotVar = (zzdot) list;
            while (i3 < size) {
                Object objMo19767k1 = zzdotVar.mo19767k1(i3);
                iM19635h0 += objMo19767k1 instanceof zzdmr ? zzdni.m19625Q((zzdmr) objMo19767k1) : zzdni.m19650r0((String) objMo19767k1);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iM19635h0 += obj instanceof zzdmr ? zzdni.m19625Q((zzdmr) obj) : zzdni.m19650r0((String) obj);
                i3++;
            }
        }
        return iM19635h0;
    }

    /* renamed from: B */
    static int m15602B(int i2, List<?> list, InterfaceC6910lw interfaceC6910lw) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM19635h0 = zzdni.m19635h0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iM19635h0 += obj instanceof zzdor ? zzdni.m19634e((zzdor) obj) : zzdni.m19609A((zzdpk) obj, interfaceC6910lw);
        }
        return iM19635h0;
    }

    /* renamed from: C */
    public static void m15603C(int i2, List<Long> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15882l(i2, list, z);
    }

    /* renamed from: D */
    static int m15604D(int i2, List<zzdmr> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM19635h0 = size * zzdni.m19635h0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM19635h0 += zzdni.m19625Q(list.get(i3));
        }
        return iM19635h0;
    }

    /* renamed from: E */
    static int m15605E(int i2, List<zzdpk> list, InterfaceC6910lw interfaceC6910lw) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM19622L = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM19622L += zzdni.m19622L(i2, list.get(i3), interfaceC6910lw);
        }
        return iM19622L;
    }

    /* renamed from: F */
    public static void m15606F(int i2, List<Long> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15890u(i2, list, z);
    }

    /* renamed from: G */
    public static void m15607G(int i2, List<Long> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15889t(i2, list, z);
    }

    /* renamed from: H */
    static boolean m15608H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: I */
    public static void m15609I(int i2, List<Long> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15888s(i2, list, z);
    }

    /* renamed from: J */
    public static void m15610J(int i2, List<Long> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15883m(i2, list, z);
    }

    /* renamed from: K */
    public static void m15611K(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15880j(i2, list, z);
    }

    /* renamed from: L */
    public static void m15612L(Class<?> cls) {
        Class<?> cls2;
        if (!zzdob.class.isAssignableFrom(cls) && (cls2 = f20107a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: M */
    public static void m15613M(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15885o(i2, list, z);
    }

    /* renamed from: N */
    public static void m15614N(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15891v(i2, list, z);
    }

    /* renamed from: O */
    public static void m15615O(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15884n(i2, list, z);
    }

    /* renamed from: P */
    public static void m15616P(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15886p(i2, list, z);
    }

    /* renamed from: Q */
    public static void m15617Q(int i2, List<Integer> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15881k(i2, list, z);
    }

    /* renamed from: R */
    public static void m15618R(int i2, List<Boolean> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15879i(i2, list, z);
    }

    /* renamed from: S */
    static int m15619S(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m15632c0(list) + (list.size() * zzdni.m19635h0(i2));
    }

    /* renamed from: T */
    static int m15620T(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15634d0(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: U */
    static int m15621U(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15639i(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: V */
    static int m15622V(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15640j(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: W */
    static int m15623W(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15641k(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: X */
    static int m15624X(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15642l(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: Y */
    static int m15625Y(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15643m(list) + (size * zzdni.m19635h0(i2));
    }

    /* renamed from: Z */
    static int m15626Z(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m19649r(i2, 0);
    }

    /* renamed from: a */
    static <UT, UB> UB m15627a(int i2, int i3, UB ub, AbstractC6578cx<UT, UB> abstractC6578cx) {
        if (ub == null) {
            ub = abstractC6578cx.mo15008m();
        }
        abstractC6578cx.mo14996a(ub, i2, i3);
        return ub;
    }

    /* renamed from: a0 */
    static int m15628a0(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m19615F0(i2, 0L);
    }

    /* renamed from: b */
    static <UT, UB> UB m15629b(int i2, List<Integer> list, zzdog zzdogVar, UB ub, AbstractC6578cx<UT, UB> abstractC6578cx) {
        if (zzdogVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (zzdogVar.mo14954a(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) m15627a(i2, iIntValue, ub, abstractC6578cx);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzdogVar.mo14954a(iIntValue2)) {
                    ub = (UB) m15627a(i2, iIntValue2, ub, abstractC6578cx);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: b0 */
    static int m15630b0(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdni.m19655w0(i2, true);
    }

    /* renamed from: c */
    public static void m15631c(int i2, List<String> list, InterfaceC7244ux interfaceC7244ux) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15854A(i2, list);
    }

    /* renamed from: c0 */
    static int m15632c0(List<Long> list) {
        int iM19626V;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7020ov) {
            C7020ov c7020ov = (C7020ov) list;
            iM19626V = 0;
            while (i2 < size) {
                iM19626V += zzdni.m19626V(c7020ov.m15692f(i2));
                i2++;
            }
        } else {
            iM19626V = 0;
            while (i2 < size) {
                iM19626V += zzdni.m19626V(list.get(i2).longValue());
                i2++;
            }
        }
        return iM19626V;
    }

    /* renamed from: d */
    public static void m15633d(int i2, List<?> list, InterfaceC7244ux interfaceC7244ux, InterfaceC6910lw interfaceC6910lw) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15876W(i2, list, interfaceC6910lw);
    }

    /* renamed from: d0 */
    static int m15634d0(List<Long> list) {
        int iM19627W;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7020ov) {
            C7020ov c7020ov = (C7020ov) list;
            iM19627W = 0;
            while (i2 < size) {
                iM19627W += zzdni.m19627W(c7020ov.m15692f(i2));
                i2++;
            }
        } else {
            iM19627W = 0;
            while (i2 < size) {
                iM19627W += zzdni.m19627W(list.get(i2).longValue());
                i2++;
            }
        }
        return iM19627W;
    }

    /* renamed from: e */
    public static void m15635e(int i2, List<Double> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15892w(i2, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    static <T, FT extends zzdnu<FT>> void m15636f(AbstractC7278vu<FT> abstractC7278vu, T t, T t2) {
        C7389yu<T> c7389yuMo15965i = abstractC7278vu.mo15965i(t2);
        if (c7389yuMo15965i.m16121b()) {
            return;
        }
        abstractC7278vu.mo15966j(t).m16125h(c7389yuMo15965i);
    }

    /* renamed from: g */
    static <T> void m15637g(InterfaceC7242uv interfaceC7242uv, T t, T t2, long j2) {
        C6726gx.m15205g(t, j2, interfaceC7242uv.mo15936a(C6726gx.m15190L(t, j2), C6726gx.m15190L(t2, j2)));
    }

    /* renamed from: h */
    static <T, UT, UB> void m15638h(AbstractC6578cx<UT, UB> abstractC6578cx, T t, T t2) {
        abstractC6578cx.mo15012q(t, abstractC6578cx.mo15014s(abstractC6578cx.mo15005j(t), abstractC6578cx.mo15005j(t2)));
    }

    /* renamed from: i */
    static int m15639i(List<Long> list) {
        int iM19628X;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7020ov) {
            C7020ov c7020ov = (C7020ov) list;
            iM19628X = 0;
            while (i2 < size) {
                iM19628X += zzdni.m19628X(c7020ov.m15692f(i2));
                i2++;
            }
        } else {
            iM19628X = 0;
            while (i2 < size) {
                iM19628X += zzdni.m19628X(list.get(i2).longValue());
                i2++;
            }
        }
        return iM19628X;
    }

    /* renamed from: j */
    static int m15640j(List<Integer> list) {
        int iM19643n0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6724gv) {
            C6724gv c6724gv = (C6724gv) list;
            iM19643n0 = 0;
            while (i2 < size) {
                iM19643n0 += zzdni.m19643n0(c6724gv.m15175f(i2));
                i2++;
            }
        } else {
            iM19643n0 = 0;
            while (i2 < size) {
                iM19643n0 += zzdni.m19643n0(list.get(i2).intValue());
                i2++;
            }
        }
        return iM19643n0;
    }

    /* renamed from: k */
    static int m15641k(List<Integer> list) {
        int iM19636i0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6724gv) {
            C6724gv c6724gv = (C6724gv) list;
            iM19636i0 = 0;
            while (i2 < size) {
                iM19636i0 += zzdni.m19636i0(c6724gv.m15175f(i2));
                i2++;
            }
        } else {
            iM19636i0 = 0;
            while (i2 < size) {
                iM19636i0 += zzdni.m19636i0(list.get(i2).intValue());
                i2++;
            }
        }
        return iM19636i0;
    }

    /* renamed from: l */
    static int m15642l(List<Integer> list) {
        int iM19637j0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6724gv) {
            C6724gv c6724gv = (C6724gv) list;
            iM19637j0 = 0;
            while (i2 < size) {
                iM19637j0 += zzdni.m19637j0(c6724gv.m15175f(i2));
                i2++;
            }
        } else {
            iM19637j0 = 0;
            while (i2 < size) {
                iM19637j0 += zzdni.m19637j0(list.get(i2).intValue());
                i2++;
            }
        }
        return iM19637j0;
    }

    /* renamed from: m */
    static int m15643m(List<Integer> list) {
        int iM19638k0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6724gv) {
            C6724gv c6724gv = (C6724gv) list;
            iM19638k0 = 0;
            while (i2 < size) {
                iM19638k0 += zzdni.m19638k0(c6724gv.m15175f(i2));
                i2++;
            }
        } else {
            iM19638k0 = 0;
            while (i2 < size) {
                iM19638k0 += zzdni.m19638k0(list.get(i2).intValue());
                i2++;
            }
        }
        return iM19638k0;
    }

    /* renamed from: n */
    static int m15644n(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: o */
    static int m15645o(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: p */
    static int m15646p(List<?> list) {
        return list.size();
    }

    /* renamed from: q */
    public static AbstractC6578cx<?, ?> m15647q() {
        return f20108b;
    }

    /* renamed from: r */
    public static AbstractC6578cx<?, ?> m15648r() {
        return f20109c;
    }

    /* renamed from: s */
    public static AbstractC6578cx<?, ?> m15649s() {
        return f20110d;
    }

    /* renamed from: t */
    private static Class<?> m15650t() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    private static Class<?> m15651u() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: v */
    public static void m15652v(int i2, List<zzdmr> list, InterfaceC7244ux interfaceC7244ux) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15893x(i2, list);
    }

    /* renamed from: w */
    public static void m15653w(int i2, List<?> list, InterfaceC7244ux interfaceC7244ux, InterfaceC6910lw interfaceC6910lw) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15872S(i2, list, interfaceC6910lw);
    }

    /* renamed from: x */
    public static void m15654x(int i2, List<Float> list, InterfaceC7244ux interfaceC7244ux, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7244ux.mo15894z(i2, list, z);
    }

    /* renamed from: y */
    private static AbstractC6578cx<?, ?> m15655y(boolean z) {
        try {
            Class<?> clsM15651u = m15651u();
            if (clsM15651u == null) {
                return null;
            }
            return (AbstractC6578cx) clsM15651u.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: z */
    static int m15656z(int i2, Object obj, InterfaceC6910lw interfaceC6910lw) {
        return obj instanceof zzdor ? zzdni.m19633d(i2, (zzdor) obj) : zzdni.m19658z(i2, (zzdpk) obj, interfaceC6910lw);
    }
}
