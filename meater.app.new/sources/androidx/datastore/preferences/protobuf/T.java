package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2062h;
import androidx.datastore.preferences.protobuf.C2079z;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
final class T<T> implements f0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f24869r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f24870s = p0.B();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f24871a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f24872b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24873c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24874d;

    /* renamed from: e, reason: collision with root package name */
    private final P f24875e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24876f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24877g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24878h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f24879i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f24880j;

    /* renamed from: k, reason: collision with root package name */
    private final int f24881k;

    /* renamed from: l, reason: collision with root package name */
    private final int f24882l;

    /* renamed from: m, reason: collision with root package name */
    private final V f24883m;

    /* renamed from: n, reason: collision with root package name */
    private final F f24884n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f24885o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC2070p<?> f24886p;

    /* renamed from: q, reason: collision with root package name */
    private final K f24887q;

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, V v10, F f10, l0<?, ?> l0Var, AbstractC2070p<?> abstractC2070p, K k10) {
        this.f24871a = iArr;
        this.f24872b = objArr;
        this.f24873c = i10;
        this.f24874d = i11;
        this.f24877g = p10 instanceof AbstractC2077x;
        this.f24878h = z10;
        this.f24876f = abstractC2070p != null && abstractC2070p.e(p10);
        this.f24879i = z11;
        this.f24880j = iArr2;
        this.f24881k = i12;
        this.f24882l = i13;
        this.f24883m = v10;
        this.f24884n = f10;
        this.f24885o = l0Var;
        this.f24886p = abstractC2070p;
        this.f24875e = p10;
        this.f24887q = k10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, f0 f0Var) {
        return f0Var.c(p0.A(obj, R(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) p0.A(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarS = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarS.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.f0] */
    private boolean C(T t10, int i10, int i11) {
        Map<?, ?> mapH = this.f24887q.h(p0.A(t10, R(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f24887q.c(r(i11)).f24862c.c() != r0.c.MESSAGE) {
            return true;
        }
        ?? D10 = 0;
        for (Object obj : mapH.values()) {
            D10 = D10;
            if (D10 == 0) {
                D10 = b0.a().d(obj.getClass());
            }
            if (!D10.c(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long jY = Y(i10) & 1048575;
        return p0.x(t10, jY) == p0.x(t11, jY);
    }

    private boolean E(T t10, int i10, int i11) {
        return p0.x(t10, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> G(Object obj, long j10) {
        return (List) p0.A(obj, j10);
    }

    private static <T> long H(T t10, long j10) {
        return p0.y(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0 = r16.f24881k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r0 >= r16.f24882l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r13 = n(r19, r16.f24880j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.C2073t.b<ET>> void I(androidx.datastore.preferences.protobuf.l0<UT, UB> r17, androidx.datastore.preferences.protobuf.AbstractC2070p<ET> r18, T r19, androidx.datastore.preferences.protobuf.e0 r20, androidx.datastore.preferences.protobuf.C2069o r21) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.I(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.e0, androidx.datastore.preferences.protobuf.o):void");
    }

    private final <K, V> void J(Object obj, int i10, Object obj2, C2069o c2069o, e0 e0Var) {
        long jR = R(i0(i10));
        Object objA = p0.A(obj, jR);
        if (objA == null) {
            objA = this.f24887q.e(obj2);
            p0.O(obj, jR, objA);
        } else if (this.f24887q.g(objA)) {
            Object objE = this.f24887q.e(obj2);
            this.f24887q.a(objE, objA);
            p0.O(obj, jR, objE);
            objA = objE;
        }
        e0Var.M(this.f24887q.d(objA), this.f24887q.c(obj2), c2069o);
    }

    private void K(T t10, T t11, int i10) {
        long jR = R(i0(i10));
        if (y(t11, i10)) {
            Object objA = p0.A(t10, jR);
            Object objA2 = p0.A(t11, jR);
            if (objA != null && objA2 != null) {
                p0.O(t10, jR, C2079z.h(objA, objA2));
                e0(t10, i10);
            } else if (objA2 != null) {
                p0.O(t10, jR, objA2);
                e0(t10, i10);
            }
        }
    }

    private void L(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        int iQ = Q(i10);
        long jR = R(iI0);
        if (E(t11, iQ, i10)) {
            Object objA = p0.A(t10, jR);
            Object objA2 = p0.A(t11, jR);
            if (objA != null && objA2 != null) {
                p0.O(t10, jR, C2079z.h(objA, objA2));
                f0(t10, iQ, i10);
            } else if (objA2 != null) {
                p0.O(t10, jR, objA2);
                f0(t10, iQ, i10);
            }
        }
    }

    private void M(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        long jR = R(iI0);
        int iQ = Q(i10);
        switch (h0(iI0)) {
            case 0:
                if (y(t11, i10)) {
                    p0.K(t10, jR, p0.v(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (y(t11, i10)) {
                    p0.L(t10, jR, p0.w(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (y(t11, i10)) {
                    p0.N(t10, jR, p0.y(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (y(t11, i10)) {
                    p0.N(t10, jR, p0.y(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (y(t11, i10)) {
                    p0.N(t10, jR, p0.y(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (y(t11, i10)) {
                    p0.E(t10, jR, p0.p(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (y(t11, i10)) {
                    p0.O(t10, jR, p0.A(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 9:
                K(t10, t11, i10);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (y(t11, i10)) {
                    p0.O(t10, jR, p0.A(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (y(t11, i10)) {
                    p0.N(t10, jR, p0.y(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (y(t11, i10)) {
                    p0.M(t10, jR, p0.x(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (y(t11, i10)) {
                    p0.N(t10, jR, p0.y(t11, jR));
                    e0(t10, i10);
                    break;
                }
                break;
            case 17:
                K(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f24884n.d(t10, t11, jR);
                break;
            case 50:
                h0.F(this.f24887q, t10, t11, jR);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t11, iQ, i10)) {
                    p0.O(t10, jR, p0.A(t11, jR));
                    f0(t10, iQ, i10);
                    break;
                }
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                L(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, iQ, i10)) {
                    p0.O(t10, jR, p0.A(t11, jR));
                    f0(t10, iQ, i10);
                    break;
                }
                break;
            case 68:
                L(t10, t11, i10);
                break;
        }
    }

    static <T> T<T> N(Class<T> cls, N n10, V v10, F f10, l0<?, ?> l0Var, AbstractC2070p<?> abstractC2070p, K k10) {
        return n10 instanceof d0 ? P((d0) n10, v10, f10, l0Var, abstractC2070p, k10) : O((j0) n10, v10, f10, l0Var, abstractC2070p, k10);
    }

    static <T> T<T> O(j0 j0Var, V v10, F f10, l0<?, ?> l0Var, AbstractC2070p<?> abstractC2070p, K k10) {
        boolean z10 = j0Var.getSyntax() == a0.PROTO3;
        C2072s[] c2072sArrD = j0Var.d();
        if (c2072sArrD.length != 0) {
            C2072s c2072s = c2072sArrD[0];
            throw null;
        }
        int length = c2072sArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c2072sArrD.length > 0) {
            C2072s c2072s2 = c2072sArrD[0];
            throw null;
        }
        int[] iArrC = j0Var.c();
        if (iArrC == null) {
            iArrC = f24869r;
        }
        if (c2072sArrD.length > 0) {
            C2072s c2072s3 = c2072sArrD[0];
            throw null;
        }
        int[] iArr2 = f24869r;
        int[] iArr3 = f24869r;
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new T<>(iArr, objArr, 0, 0, j0Var.b(), z10, true, iArr4, iArrC.length, iArrC.length + iArr2.length, v10, f10, l0Var, abstractC2070p, k10);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.T<T> P(androidx.datastore.preferences.protobuf.d0 r35, androidx.datastore.preferences.protobuf.V r36, androidx.datastore.preferences.protobuf.F r37, androidx.datastore.preferences.protobuf.l0<?, ?> r38, androidx.datastore.preferences.protobuf.AbstractC2070p<?> r39, androidx.datastore.preferences.protobuf.K r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.P(androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.V, androidx.datastore.preferences.protobuf.F, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.K):androidx.datastore.preferences.protobuf.T");
    }

    private int Q(int i10) {
        return this.f24871a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean S(T t10, long j10) {
        return ((Boolean) p0.A(t10, j10)).booleanValue();
    }

    private static <T> double T(T t10, long j10) {
        return ((Double) p0.A(t10, j10)).doubleValue();
    }

    private static <T> float U(T t10, long j10) {
        return ((Float) p0.A(t10, j10)).floatValue();
    }

    private static <T> int V(T t10, long j10) {
        return ((Integer) p0.A(t10, j10)).intValue();
    }

    private static <T> long W(T t10, long j10) {
        return ((Long) p0.A(t10, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f24873c || i10 > this.f24874d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f24871a[i10 + 2];
    }

    private <E> void Z(Object obj, long j10, e0 e0Var, f0<E> f0Var, C2069o c2069o) {
        e0Var.N(this.f24884n.e(obj, j10), f0Var, c2069o);
    }

    private <E> void a0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C2069o c2069o) {
        e0Var.O(this.f24884n.e(obj, R(i10)), f0Var, c2069o);
    }

    private void b0(Object obj, int i10, e0 e0Var) {
        if (x(i10)) {
            p0.O(obj, R(i10), e0Var.H());
        } else if (this.f24877g) {
            p0.O(obj, R(i10), e0Var.v());
        } else {
            p0.O(obj, R(i10), e0Var.z());
        }
    }

    private void c0(Object obj, int i10, e0 e0Var) {
        if (x(i10)) {
            e0Var.y(this.f24884n.e(obj, R(i10)));
        } else {
            e0Var.x(this.f24884n.e(obj, R(i10)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t10, int i10) {
        if (this.f24878h) {
            return;
        }
        int iY = Y(i10);
        long j10 = iY & 1048575;
        p0.M(t10, j10, p0.x(t10, j10) | (1 << (iY >>> 20)));
    }

    private void f0(T t10, int i10, int i11) {
        p0.M(t10, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f24871a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iQ = Q(i13);
            if (i10 == iQ) {
                return i13;
            }
            if (i10 < iQ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int i0(int i10) {
        return this.f24871a[i10 + 1];
    }

    private boolean j(T t10, T t11, int i10) {
        return y(t10, i10) == y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(T r18, androidx.datastore.preferences.protobuf.s0 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.j0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private static <T> boolean k(T t10, long j10) {
        return p0.p(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k0(T r13, androidx.datastore.preferences.protobuf.s0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.k0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private static <T> double l(T t10, long j10) {
        return p0.v(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0(T r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.l0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    private boolean m(T t10, T t11, int i10) {
        int iI0 = i0(i10);
        long jR = R(iI0);
        switch (h0(iI0)) {
            case 0:
                if (j(t10, t11, i10) && Double.doubleToLongBits(p0.v(t10, jR)) == Double.doubleToLongBits(p0.v(t11, jR))) {
                    break;
                }
                break;
            case 1:
                if (j(t10, t11, i10) && Float.floatToIntBits(p0.w(t10, jR)) == Float.floatToIntBits(p0.w(t11, jR))) {
                    break;
                }
                break;
            case 2:
                if (j(t10, t11, i10) && p0.y(t10, jR) == p0.y(t11, jR)) {
                    break;
                }
                break;
            case 3:
                if (j(t10, t11, i10) && p0.y(t10, jR) == p0.y(t11, jR)) {
                    break;
                }
                break;
            case 4:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case 5:
                if (j(t10, t11, i10) && p0.y(t10, jR) == p0.y(t11, jR)) {
                    break;
                }
                break;
            case 6:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case 7:
                if (j(t10, t11, i10) && p0.p(t10, jR) == p0.p(t11, jR)) {
                    break;
                }
                break;
            case 8:
                if (j(t10, t11, i10) && h0.K(p0.A(t10, jR), p0.A(t11, jR))) {
                    break;
                }
                break;
            case 9:
                if (j(t10, t11, i10) && h0.K(p0.A(t10, jR), p0.A(t11, jR))) {
                    break;
                }
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (j(t10, t11, i10) && h0.K(p0.A(t10, jR), p0.A(t11, jR))) {
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case 14:
                if (j(t10, t11, i10) && p0.y(t10, jR) == p0.y(t11, jR)) {
                    break;
                }
                break;
            case 15:
                if (j(t10, t11, i10) && p0.x(t10, jR) == p0.x(t11, jR)) {
                    break;
                }
                break;
            case 16:
                if (j(t10, t11, i10) && p0.y(t10, jR) == p0.y(t11, jR)) {
                    break;
                }
                break;
            case 17:
                if (j(t10, t11, i10) && h0.K(p0.A(t10, jR), p0.A(t11, jR))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (D(t10, t11, i10) && h0.K(p0.A(t10, jR), p0.A(t11, jR))) {
                    break;
                }
                break;
        }
        return true;
    }

    private <K, V> void m0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.N(i10, this.f24887q.c(r(i11)), this.f24887q.h(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub2, l0<UT, UB> l0Var) {
        C2079z.e eVarQ;
        int iQ = Q(i10);
        Object objA = p0.A(obj, R(i0(i10)));
        return (objA == null || (eVarQ = q(i10)) == null) ? ub2 : (UB) o(i10, iQ, this.f24887q.d(objA), eVarQ, ub2, l0Var);
    }

    private void n0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.k(i10, (String) obj);
        } else {
            s0Var.L(i10, (AbstractC2062h) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, C2079z.e eVar, UB ub2, l0<UT, UB> l0Var) {
        I.a<?, ?> aVarC = this.f24887q.c(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.n();
                }
                AbstractC2062h.C0351h c0351hA = AbstractC2062h.A(I.b(aVarC, next.getKey(), next.getValue()));
                try {
                    I.e(c0351hA.b(), aVarC, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, c0351hA.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private <UT, UB> void o0(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.t(l0Var.g(t10), s0Var);
    }

    private static <T> float p(T t10, long j10) {
        return p0.w(t10, j10);
    }

    private C2079z.e q(int i10) {
        return (C2079z.e) this.f24872b[((i10 / 3) * 2) + 1];
    }

    private Object r(int i10) {
        return this.f24872b[(i10 / 3) * 2];
    }

    private f0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f24872b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarD = b0.a().d((Class) this.f24872b[i11 + 1]);
        this.f24872b[i11] = f0VarD;
        return f0VarD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int t(T t10) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iL;
        boolean z10;
        int iF;
        int i13;
        int iV;
        int iX;
        Unsafe unsafe = f24870s;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f24871a.length) {
            int iI0 = i0(i15);
            int iQ = Q(i15);
            int iH0 = h0(iI0);
            if (iH0 <= 17) {
                i10 = this.f24871a[i15 + 2];
                int i18 = 1048575 & i10;
                int i19 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(t10, i18);
                    i14 = i18;
                }
                i11 = i19;
            } else {
                i10 = (!this.f24879i || iH0 < EnumC2074u.f25135p0.c() || iH0 > EnumC2074u.f25094C0.c()) ? 0 : this.f24871a[i15 + 2] & 1048575;
                i11 = 0;
            }
            long jR = R(iI0);
            int i20 = i14;
            switch (iH0) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.i(iQ, 0.0d);
                        i16 += i12;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.q(iQ, 0.0f);
                        i16 += i12;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.x(iQ, unsafe.getLong(t10, jR));
                        i16 += i12;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.Y(iQ, unsafe.getLong(t10, jR));
                        i16 += i12;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.v(iQ, unsafe.getInt(t10, jR));
                        i16 += i12;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.o(iQ, 0L);
                        i16 += i12;
                        break;
                    }
                case 6:
                    if ((i17 & i11) != 0) {
                        i12 = CodedOutputStream.m(iQ, 0);
                        i16 += i12;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.d(iQ, true);
                        i16 += iD;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(t10, jR);
                        iD = object instanceof AbstractC2062h ? CodedOutputStream.g(iQ, (AbstractC2062h) object) : CodedOutputStream.T(iQ, (String) object);
                        i16 += iD;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        iD = h0.o(iQ, unsafe.getObject(t10, jR), s(i15));
                        i16 += iD;
                    }
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.g(iQ, (AbstractC2062h) unsafe.getObject(t10, jR));
                        i16 += iD;
                    }
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.W(iQ, unsafe.getInt(t10, jR));
                        i16 += iD;
                    }
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.k(iQ, unsafe.getInt(t10, jR));
                        i16 += iD;
                    }
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if ((i17 & i11) != 0) {
                        iL = CodedOutputStream.L(iQ, 0);
                        i16 += iL;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.N(iQ, 0L);
                        i16 += iD;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.P(iQ, unsafe.getInt(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.R(iQ, unsafe.getLong(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        iD = CodedOutputStream.s(iQ, (P) unsafe.getObject(t10, jR), s(i15));
                        i16 += iD;
                    }
                    break;
                case 18:
                    iD = h0.h(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iD;
                    break;
                case 19:
                    z10 = false;
                    iF = h0.f(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = h0.m(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = h0.x(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = h0.k(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = h0.h(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = h0.f(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = h0.a(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 26:
                    iD = h0.u(iQ, (List) unsafe.getObject(t10, jR));
                    i16 += iD;
                    break;
                case 27:
                    iD = h0.p(iQ, (List) unsafe.getObject(t10, jR), s(i15));
                    i16 += iD;
                    break;
                case 28:
                    iD = h0.c(iQ, (List) unsafe.getObject(t10, jR));
                    i16 += iD;
                    break;
                case 29:
                    iD = h0.v(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iD;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    z10 = false;
                    iF = h0.d(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = h0.f(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = h0.h(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = h0.q(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = h0.s(iQ, (List) unsafe.getObject(t10, jR), false);
                    i16 += iF;
                    break;
                case 35:
                    i13 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 36:
                    i13 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 37:
                    i13 = h0.n((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 38:
                    i13 = h0.y((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 39:
                    i13 = h0.l((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 40:
                    i13 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 41:
                    i13 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 42:
                    i13 = h0.b((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 43:
                    i13 = h0.w((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 44:
                    i13 = h0.e((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 45:
                    i13 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 46:
                    i13 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 47:
                    i13 = h0.r((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 48:
                    i13 = h0.t((List) unsafe.getObject(t10, jR));
                    if (i13 > 0) {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i13);
                        iL = iV + iX + i13;
                        i16 += iL;
                    }
                    break;
                case 49:
                    iD = h0.j(iQ, (List) unsafe.getObject(t10, jR), s(i15));
                    i16 += iD;
                    break;
                case 50:
                    iD = this.f24887q.f(iQ, unsafe.getObject(t10, jR), r(i15));
                    i16 += iD;
                    break;
                case 51:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.i(iQ, 0.0d);
                        i16 += iD;
                    }
                    break;
                case 52:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.q(iQ, 0.0f);
                        i16 += iD;
                    }
                    break;
                case 53:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.x(iQ, W(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 54:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.Y(iQ, W(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 55:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.v(iQ, V(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 56:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.o(iQ, 0L);
                        i16 += iD;
                    }
                    break;
                case 57:
                    if (E(t10, iQ, i15)) {
                        iL = CodedOutputStream.m(iQ, 0);
                        i16 += iL;
                    }
                    break;
                case 58:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.d(iQ, true);
                        i16 += iD;
                    }
                    break;
                case 59:
                    if (E(t10, iQ, i15)) {
                        Object object2 = unsafe.getObject(t10, jR);
                        iD = object2 instanceof AbstractC2062h ? CodedOutputStream.g(iQ, (AbstractC2062h) object2) : CodedOutputStream.T(iQ, (String) object2);
                        i16 += iD;
                    }
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (E(t10, iQ, i15)) {
                        iD = h0.o(iQ, unsafe.getObject(t10, jR), s(i15));
                        i16 += iD;
                    }
                    break;
                case 61:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.g(iQ, (AbstractC2062h) unsafe.getObject(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 62:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.W(iQ, V(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 63:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.k(iQ, V(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 64:
                    if (E(t10, iQ, i15)) {
                        iL = CodedOutputStream.L(iQ, 0);
                        i16 += iL;
                    }
                    break;
                case 65:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.N(iQ, 0L);
                        i16 += iD;
                    }
                    break;
                case 66:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.P(iQ, V(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 67:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.R(iQ, W(t10, jR));
                        i16 += iD;
                    }
                    break;
                case 68:
                    if (E(t10, iQ, i15)) {
                        iD = CodedOutputStream.s(iQ, (P) unsafe.getObject(t10, jR), s(i15));
                        i16 += iD;
                    }
                    break;
            }
            i15 += 3;
            i14 = i20;
        }
        int iV2 = i16 + v(this.f24885o, t10);
        return this.f24876f ? iV2 + this.f24886p.c(t10).l() : iV2;
    }

    private int u(T t10) {
        int i10;
        int i11;
        int iV;
        int iX;
        Unsafe unsafe = f24870s;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24871a.length; i13 += 3) {
            int iI0 = i0(i13);
            int iH0 = h0(iI0);
            int iQ = Q(i13);
            long jR = R(iI0);
            int i14 = (iH0 < EnumC2074u.f25135p0.c() || iH0 > EnumC2074u.f25094C0.c()) ? 0 : this.f24871a[i13 + 2] & 1048575;
            switch (iH0) {
                case 0:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.i(iQ, 0.0d);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.q(iQ, 0.0f);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.x(iQ, p0.y(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.Y(iQ, p0.y(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.v(iQ, p0.x(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.o(iQ, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.m(iQ, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.d(iQ, true);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y(t10, i13)) {
                        Object objA = p0.A(t10, jR);
                        i10 = objA instanceof AbstractC2062h ? CodedOutputStream.g(iQ, (AbstractC2062h) objA) : CodedOutputStream.T(iQ, (String) objA);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (y(t10, i13)) {
                        i10 = h0.o(iQ, p0.A(t10, jR), s(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.g(iQ, (AbstractC2062h) p0.A(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.W(iQ, p0.x(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.k(iQ, p0.x(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.L(iQ, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.N(iQ, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.P(iQ, p0.x(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.R(iQ, p0.y(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (y(t10, i13)) {
                        i10 = CodedOutputStream.s(iQ, (P) p0.A(t10, jR), s(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = h0.h(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 19:
                    i10 = h0.f(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 20:
                    i10 = h0.m(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 21:
                    i10 = h0.x(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 22:
                    i10 = h0.k(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 23:
                    i10 = h0.h(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 24:
                    i10 = h0.f(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 25:
                    i10 = h0.a(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 26:
                    i10 = h0.u(iQ, G(t10, jR));
                    i12 += i10;
                    break;
                case 27:
                    i10 = h0.p(iQ, G(t10, jR), s(i13));
                    i12 += i10;
                    break;
                case 28:
                    i10 = h0.c(iQ, G(t10, jR));
                    i12 += i10;
                    break;
                case 29:
                    i10 = h0.v(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    i10 = h0.d(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 31:
                    i10 = h0.f(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 32:
                    i10 = h0.h(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 33:
                    i10 = h0.q(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 34:
                    i10 = h0.s(iQ, G(t10, jR), false);
                    i12 += i10;
                    break;
                case 35:
                    i11 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 36:
                    i11 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 37:
                    i11 = h0.n((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 38:
                    i11 = h0.y((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 39:
                    i11 = h0.l((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 40:
                    i11 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 41:
                    i11 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 42:
                    i11 = h0.b((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 43:
                    i11 = h0.w((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 44:
                    i11 = h0.e((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 45:
                    i11 = h0.g((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 46:
                    i11 = h0.i((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 47:
                    i11 = h0.r((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 48:
                    i11 = h0.t((List) unsafe.getObject(t10, jR));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f24879i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iV = CodedOutputStream.V(iQ);
                        iX = CodedOutputStream.X(i11);
                        i10 = iV + iX + i11;
                        i12 += i10;
                        break;
                    }
                case 49:
                    i10 = h0.j(iQ, G(t10, jR), s(i13));
                    i12 += i10;
                    break;
                case 50:
                    i10 = this.f24887q.f(iQ, p0.A(t10, jR), r(i13));
                    i12 += i10;
                    break;
                case 51:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.i(iQ, 0.0d);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.q(iQ, 0.0f);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.x(iQ, W(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.Y(iQ, W(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.v(iQ, V(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.o(iQ, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.m(iQ, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.d(iQ, true);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, iQ, i13)) {
                        Object objA2 = p0.A(t10, jR);
                        i10 = objA2 instanceof AbstractC2062h ? CodedOutputStream.g(iQ, (AbstractC2062h) objA2) : CodedOutputStream.T(iQ, (String) objA2);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (E(t10, iQ, i13)) {
                        i10 = h0.o(iQ, p0.A(t10, jR), s(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.g(iQ, (AbstractC2062h) p0.A(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.W(iQ, V(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.k(iQ, V(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.L(iQ, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.N(iQ, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.P(iQ, V(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.R(iQ, W(t10, jR));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, iQ, i13)) {
                        i10 = CodedOutputStream.s(iQ, (P) p0.A(t10, jR), s(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i12 + v(this.f24885o, t10);
    }

    private <UT, UB> int v(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    private static <T> int w(T t10, long j10) {
        return p0.x(t10, j10);
    }

    private static boolean x(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean y(T t10, int i10) {
        if (!this.f24878h) {
            int iY = Y(i10);
            return (p0.x(t10, (long) (iY & 1048575)) & (1 << (iY >>> 20))) != 0;
        }
        int iI0 = i0(i10);
        long jR = R(iI0);
        switch (h0(iI0)) {
            case 0:
                return p0.v(t10, jR) != 0.0d;
            case 1:
                return p0.w(t10, jR) != 0.0f;
            case 2:
                return p0.y(t10, jR) != 0;
            case 3:
                return p0.y(t10, jR) != 0;
            case 4:
                return p0.x(t10, jR) != 0;
            case 5:
                return p0.y(t10, jR) != 0;
            case 6:
                return p0.x(t10, jR) != 0;
            case 7:
                return p0.p(t10, jR);
            case 8:
                Object objA = p0.A(t10, jR);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof AbstractC2062h) {
                    return !AbstractC2062h.f24923C.equals(objA);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.A(t10, jR) != null;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !AbstractC2062h.f24923C.equals(p0.A(t10, jR));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return p0.x(t10, jR) != 0;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p0.x(t10, jR) != 0;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return p0.x(t10, jR) != 0;
            case 14:
                return p0.y(t10, jR) != 0;
            case 15:
                return p0.x(t10, jR) != 0;
            case 16:
                return p0.y(t10, jR) != 0;
            case 17:
                return p0.A(t10, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean z(T t10, int i10, int i11, int i12) {
        return this.f24878h ? y(t10, i10) : (i11 & i12) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f24871a.length; i10 += 3) {
            M(t10, t11, i10);
        }
        if (this.f24878h) {
            return;
        }
        h0.G(this.f24885o, t10, t11);
        if (this.f24876f) {
            h0.E(this.f24886p, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(T t10) {
        int i10;
        int i11 = this.f24881k;
        while (true) {
            i10 = this.f24882l;
            if (i11 >= i10) {
                break;
            }
            long jR = R(i0(this.f24880j[i11]));
            Object objA = p0.A(t10, jR);
            if (objA != null) {
                p0.O(t10, jR, this.f24887q.b(objA));
            }
            i11++;
        }
        int length = this.f24880j.length;
        while (i10 < length) {
            this.f24884n.c(t10, this.f24880j[i10]);
            i10++;
        }
        this.f24885o.j(t10);
        if (this.f24876f) {
            this.f24886p.f(t10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(T r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.f24881k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f24880j
            r4 = r4[r2]
            int r6 = r12.Q(r4)
            int r7 = r12.i0(r4)
            boolean r8 = r12.f24878h
            if (r8 != 0) goto L31
            int[] r8 = r12.f24871a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.T.f24870s
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = r1
        L32:
            boolean r8 = F(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.z(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = h0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.C(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L67:
            boolean r5 = r12.E(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.f0 r4 = r12.s(r4)
            boolean r4 = A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L78:
            boolean r4 = r12.B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L7f:
            boolean r5 = r12.z(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.f0 r4 = r12.s(r4)
            boolean r4 = A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r0 = r12.f24876f
            if (r0 == 0) goto La5
            androidx.datastore.preferences.protobuf.p<?> r0 = r12.f24886p
            androidx.datastore.preferences.protobuf.t r13 = r0.c(r13)
            boolean r13 = r13.p()
            if (r13 != 0) goto La5
            return r1
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.c(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean d(T t10, T t11) {
        int length = this.f24871a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f24885o.g(t10).equals(this.f24885o.g(t11))) {
            return false;
        }
        if (this.f24876f) {
            return this.f24886p.c(t10).equals(this.f24886p.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int e(T t10) {
        return this.f24878h ? u(t10) : t(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public T f() {
        return (T) this.f24883m.a(this.f24875e);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(T t10) {
        int i10;
        int iF;
        int length = this.f24871a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iI0 = i0(i12);
            int iQ = Q(i12);
            long jR = R(iI0);
            int iHashCode = 37;
            switch (h0(iI0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C2079z.f(Double.doubleToLongBits(p0.v(t10, jR)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(p0.w(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C2079z.f(p0.y(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C2079z.f(p0.y(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C2079z.f(p0.y(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C2079z.c(p0.p(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) p0.A(t10, jR)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objA = p0.A(t10, jR);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i10 = i11 * 53;
                    iF = p0.A(t10, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C2079z.f(p0.y(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = p0.x(t10, jR);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C2079z.f(p0.y(t10, jR));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objA2 = p0.A(t10, jR);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = p0.A(t10, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = p0.A(t10, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(Double.doubleToLongBits(T(t10, jR)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(U(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(W(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(W(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(W(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.c(S(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) p0.A(t10, jR)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.A(t10, jR).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.A(t10, jR).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(W(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(t10, jR);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = C2079z.f(W(t10, jR));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.A(t10, jR).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f24885o.g(t10).hashCode();
        return this.f24876f ? (iHashCode2 * 53) + this.f24886p.c(t10).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(T t10, e0 e0Var, C2069o c2069o) {
        c2069o.getClass();
        I(this.f24885o, this.f24886p, t10, e0Var, c2069o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(T t10, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            l0(t10, s0Var);
        } else if (this.f24878h) {
            k0(t10, s0Var);
        } else {
            j0(t10, s0Var);
        }
    }
}
