package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2643b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2670k1 f34554a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34555b = 0;

    static {
        int i10 = W0.f34535d;
        f34554a = new C2676m1();
    }

    public static void A(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.p(i10, list, z10);
    }

    public static void B(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.z(i10, list, z10);
    }

    public static void C(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.i(i10, list, z10);
    }

    public static void D(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.o(i10, list, z10);
    }

    public static void a(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.u(i10, list, z10);
    }

    public static void b(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.C(i10, list, z10);
    }

    public static void c(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.n(i10, list, z10);
    }

    public static void d(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.x(i10, list, z10);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2675m0) {
            C2675m0 c2675m0 = (C2675m0) list;
            iA = 0;
            while (i10 < size) {
                iA += W.a(c2675m0.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += W.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (W.B(i10 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (W.B(i10 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2675m0) {
            C2675m0 c2675m0 = (C2675m0) list;
            iA = 0;
            while (i10 < size) {
                iA += W.a(c2675m0.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += W.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    static int l(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0) {
            C0 c02 = (C0) list;
            iA = 0;
            while (i10 < size) {
                iA += W.a(c02.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += W.a(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iA;
    }

    static int m(int i10, Object obj, Z0 z02) {
        int i11 = i10 << 3;
        if (!(obj instanceof C2704y0)) {
            return W.B(i11) + W.z((N0) obj, z02);
        }
        int iB = W.B(i11);
        int iA = ((C2704y0) obj).a();
        return iB + W.B(iA) + iA;
    }

    static int n(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2675m0) {
            C2675m0 c2675m0 = (C2675m0) list;
            iB = 0;
            while (i10 < size) {
                int iF = c2675m0.f(i10);
                iB += W.B((iF >> 31) ^ (iF + iF));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iB += W.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iB;
    }

    static int o(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0) {
            C0 c02 = (C0) list;
            iA = 0;
            while (i10 < size) {
                long jF = c02.f(i10);
                iA += W.a((jF >> 63) ^ (jF + jF));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += W.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iA;
    }

    static int p(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2675m0) {
            C2675m0 c2675m0 = (C2675m0) list;
            iB = 0;
            while (i10 < size) {
                iB += W.B(c2675m0.f(i10));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                iB += W.B(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iB;
    }

    static int q(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0) {
            C0 c02 = (C0) list;
            iA = 0;
            while (i10 < size) {
                iA += W.a(c02.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += W.a(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iA;
    }

    public static AbstractC2670k1 r() {
        return f34554a;
    }

    static void s(AbstractC2639a0 abstractC2639a0, Object obj, Object obj2) {
        if (((AbstractC2666j0) obj2).zzb.f34561a.isEmpty()) {
            return;
        }
        throw null;
    }

    static void t(AbstractC2670k1 abstractC2670k1, Object obj, Object obj2) {
        AbstractC2672l0 abstractC2672l0 = (AbstractC2672l0) obj;
        C2673l1 c2673l1E = abstractC2672l0.zzc;
        C2673l1 c2673l1 = ((AbstractC2672l0) obj2).zzc;
        if (!C2673l1.c().equals(c2673l1)) {
            if (C2673l1.c().equals(c2673l1E)) {
                c2673l1E = C2673l1.e(c2673l1E, c2673l1);
            } else {
                c2673l1E.d(c2673l1);
            }
        }
        abstractC2672l0.zzc = c2673l1E;
    }

    public static void u(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.b(i10, list, z10);
    }

    public static void v(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.f(i10, list, z10);
    }

    public static void w(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.d(i10, list, z10);
    }

    public static void x(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.c(i10, list, z10);
    }

    public static void y(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.e(i10, list, z10);
    }

    public static void z(int i10, List list, x1 x1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x1Var.D(i10, list, z10);
    }
}
