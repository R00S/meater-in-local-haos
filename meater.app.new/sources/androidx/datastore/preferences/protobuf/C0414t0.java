package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0377h;
import androidx.datastore.preferences.protobuf.C0357a0;
import androidx.datastore.preferences.protobuf.C0384j0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.InterfaceC0412s1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.t0 */
/* loaded from: classes.dex */
final class C0414t0<T> implements InterfaceC0373f1<T> {

    /* renamed from: a */
    private static final int[] f2915a = new int[0];

    /* renamed from: b */
    private static final Unsafe f2916b = C0403p1.m3082B();

    /* renamed from: c */
    private final int[] f2917c;

    /* renamed from: d */
    private final Object[] f2918d;

    /* renamed from: e */
    private final int f2919e;

    /* renamed from: f */
    private final int f2920f;

    /* renamed from: g */
    private final InterfaceC0405q0 f2921g;

    /* renamed from: h */
    private final boolean f2922h;

    /* renamed from: i */
    private final boolean f2923i;

    /* renamed from: j */
    private final boolean f2924j;

    /* renamed from: k */
    private final boolean f2925k;

    /* renamed from: l */
    private final int[] f2926l;

    /* renamed from: m */
    private final int f2927m;

    /* renamed from: n */
    private final int f2928n;

    /* renamed from: o */
    private final InterfaceC0418v0 f2929o;

    /* renamed from: p */
    private final AbstractC0375g0 f2930p;

    /* renamed from: q */
    private final AbstractC0391l1<?, ?> f2931q;

    /* renamed from: r */
    private final AbstractC0404q<?> f2932r;

    /* renamed from: s */
    private final InterfaceC0390l0 f2933s;

    private C0414t0(int[] iArr, Object[] objArr, int i2, int i3, InterfaceC0405q0 interfaceC0405q0, boolean z, boolean z2, int[] iArr2, int i4, int i5, InterfaceC0418v0 interfaceC0418v0, AbstractC0375g0 abstractC0375g0, AbstractC0391l1<?, ?> abstractC0391l1, AbstractC0404q<?> abstractC0404q, InterfaceC0390l0 interfaceC0390l0) {
        this.f2917c = iArr;
        this.f2918d = objArr;
        this.f2919e = i2;
        this.f2920f = i3;
        this.f2923i = interfaceC0405q0 instanceof AbstractC0423y;
        this.f2924j = z;
        this.f2922h = abstractC0404q != null && abstractC0404q.mo3146e(interfaceC0405q0);
        this.f2925k = z2;
        this.f2926l = iArr2;
        this.f2927m = i4;
        this.f2928n = i5;
        this.f2929o = interfaceC0418v0;
        this.f2930p = abstractC0375g0;
        this.f2931q = abstractC0391l1;
        this.f2932r = abstractC0404q;
        this.f2921g = interfaceC0405q0;
        this.f2933s = interfaceC0390l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private static boolean m3215A(Object obj, int i2, InterfaceC0373f1 interfaceC0373f1) {
        return interfaceC0373f1.mo2698g(C0403p1.m3081A(obj, m3232R(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private <N> boolean m3216B(Object obj, int i2, int i3) {
        List list = (List) C0403p1.m3081A(obj, m3232R(i2));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC0373f1 interfaceC0373f1M3265s = m3265s(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!interfaceC0373f1M3265s.mo2698g(list.get(i4))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.f1] */
    /* renamed from: C */
    private boolean m3217C(T t, int i2, int i3) {
        Map<?, ?> mapMo2997h = this.f2933s.mo2997h(C0403p1.m3081A(t, m3232R(i2)));
        if (mapMo2997h.isEmpty()) {
            return true;
        }
        if (this.f2933s.mo2992c(m3264r(i3)).f2805c.m3205g() != C0409r1.c.MESSAGE) {
            return true;
        }
        ?? M2581d = 0;
        for (Object obj : mapMo2997h.values()) {
            M2581d = M2581d;
            if (M2581d == 0) {
                M2581d = C0361b1.m2578a().m2581d(obj.getClass());
            }
            if (!M2581d.mo2698g(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m3218D(T t, T t2, int i2) {
        long jM3239Y = m3239Y(i2) & 1048575;
        return C0403p1.m3121x(t, jM3239Y) == C0403p1.m3121x(t2, jM3239Y);
    }

    /* renamed from: E */
    private boolean m3219E(T t, int i2, int i3) {
        return C0403p1.m3121x(t, (long) (m3239Y(i3) & 1048575)) == i2;
    }

    /* renamed from: F */
    private static boolean m3220F(int i2) {
        return (i2 & 268435456) != 0;
    }

    /* renamed from: G */
    private static List<?> m3221G(Object obj, long j2) {
        return (List) C0403p1.m3081A(obj, j2);
    }

    /* renamed from: H */
    private static <T> long m3222H(T t, long j2) {
        return C0403p1.m3122y(t, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r0 = r16.f2927m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 >= r16.f2928n) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r13 = m3258n(r19, r16.f2926l[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r13 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r17.mo3012o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.C0415u.b<ET>> void m3223I(androidx.datastore.preferences.protobuf.AbstractC0391l1<UT, UB> r17, androidx.datastore.preferences.protobuf.AbstractC0404q<ET> r18, T r19, androidx.datastore.preferences.protobuf.InterfaceC0370e1 r20, androidx.datastore.preferences.protobuf.C0401p r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.m3223I(androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.q, java.lang.Object, androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.p):void");
    }

    /* renamed from: J */
    private final <K, V> void m3224J(Object obj, int i2, Object obj2, C0401p c0401p, InterfaceC0370e1 interfaceC0370e1) throws IOException {
        long jM3232R = m3232R(m3249i0(i2));
        Object objM3081A = C0403p1.m3081A(obj, jM3232R);
        if (objM3081A == null) {
            objM3081A = this.f2933s.mo2994e(obj2);
            C0403p1.m3095O(obj, jM3232R, objM3081A);
        } else if (this.f2933s.mo2996g(objM3081A)) {
            Object objMo2994e = this.f2933s.mo2994e(obj2);
            this.f2933s.mo2990a(objMo2994e, objM3081A);
            C0403p1.m3095O(obj, jM3232R, objMo2994e);
            objM3081A = objMo2994e;
        }
        interfaceC0370e1.mo2664u(this.f2933s.mo2993d(objM3081A), this.f2933s.mo2992c(obj2), c0401p);
    }

    /* renamed from: K */
    private void m3225K(T t, T t2, int i2) {
        long jM3232R = m3232R(m3249i0(i2));
        if (m3271y(t2, i2)) {
            Object objM3081A = C0403p1.m3081A(t, jM3232R);
            Object objM3081A2 = C0403p1.m3081A(t2, jM3232R);
            if (objM3081A != null && objM3081A2 != null) {
                C0403p1.m3095O(t, jM3232R, C0357a0.m2563h(objM3081A, objM3081A2));
                m3245e0(t, i2);
            } else if (objM3081A2 != null) {
                C0403p1.m3095O(t, jM3232R, objM3081A2);
                m3245e0(t, i2);
            }
        }
    }

    /* renamed from: L */
    private void m3226L(T t, T t2, int i2) {
        int iM3249i0 = m3249i0(i2);
        int iM3231Q = m3231Q(i2);
        long jM3232R = m3232R(iM3249i0);
        if (m3219E(t2, iM3231Q, i2)) {
            Object objM3081A = C0403p1.m3081A(t, jM3232R);
            Object objM3081A2 = C0403p1.m3081A(t2, jM3232R);
            if (objM3081A != null && objM3081A2 != null) {
                C0403p1.m3095O(t, jM3232R, C0357a0.m2563h(objM3081A, objM3081A2));
                m3246f0(t, iM3231Q, i2);
            } else if (objM3081A2 != null) {
                C0403p1.m3095O(t, jM3232R, objM3081A2);
                m3246f0(t, iM3231Q, i2);
            }
        }
    }

    /* renamed from: M */
    private void m3227M(T t, T t2, int i2) {
        int iM3249i0 = m3249i0(i2);
        long jM3232R = m3232R(iM3249i0);
        int iM3231Q = m3231Q(i2);
        switch (m3248h0(iM3249i0)) {
            case 0:
                if (m3271y(t2, i2)) {
                    C0403p1.m3091K(t, jM3232R, C0403p1.m3119v(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 1:
                if (m3271y(t2, i2)) {
                    C0403p1.m3092L(t, jM3232R, C0403p1.m3120w(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 2:
                if (m3271y(t2, i2)) {
                    C0403p1.m3094N(t, jM3232R, C0403p1.m3122y(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 3:
                if (m3271y(t2, i2)) {
                    C0403p1.m3094N(t, jM3232R, C0403p1.m3122y(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 4:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 5:
                if (m3271y(t2, i2)) {
                    C0403p1.m3094N(t, jM3232R, C0403p1.m3122y(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 6:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 7:
                if (m3271y(t2, i2)) {
                    C0403p1.m3085E(t, jM3232R, C0403p1.m3113p(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 8:
                if (m3271y(t2, i2)) {
                    C0403p1.m3095O(t, jM3232R, C0403p1.m3081A(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 9:
                m3225K(t, t2, i2);
                break;
            case 10:
                if (m3271y(t2, i2)) {
                    C0403p1.m3095O(t, jM3232R, C0403p1.m3081A(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 11:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 12:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 13:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 14:
                if (m3271y(t2, i2)) {
                    C0403p1.m3094N(t, jM3232R, C0403p1.m3122y(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 15:
                if (m3271y(t2, i2)) {
                    C0403p1.m3093M(t, jM3232R, C0403p1.m3121x(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 16:
                if (m3271y(t2, i2)) {
                    C0403p1.m3094N(t, jM3232R, C0403p1.m3122y(t2, jM3232R));
                    m3245e0(t, i2);
                    break;
                }
                break;
            case 17:
                m3225K(t, t2, i2);
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
            case 30:
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
                this.f2930p.mo2704d(t, t2, jM3232R);
                break;
            case 50:
                C0379h1.m2759F(this.f2933s, t, t2, jM3232R);
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
                if (m3219E(t2, iM3231Q, i2)) {
                    C0403p1.m3095O(t, jM3232R, C0403p1.m3081A(t2, jM3232R));
                    m3246f0(t, iM3231Q, i2);
                    break;
                }
                break;
            case 60:
                m3226L(t, t2, i2);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m3219E(t2, iM3231Q, i2)) {
                    C0403p1.m3095O(t, jM3232R, C0403p1.m3081A(t2, jM3232R));
                    m3246f0(t, iM3231Q, i2);
                    break;
                }
                break;
            case 68:
                m3226L(t, t2, i2);
                break;
        }
    }

    /* renamed from: N */
    static <T> C0414t0<T> m3228N(Class<T> cls, InterfaceC0399o0 interfaceC0399o0, InterfaceC0418v0 interfaceC0418v0, AbstractC0375g0 abstractC0375g0, AbstractC0391l1<?, ?> abstractC0391l1, AbstractC0404q<?> abstractC0404q, InterfaceC0390l0 interfaceC0390l0) {
        return interfaceC0399o0 instanceof C0367d1 ? m3230P((C0367d1) interfaceC0399o0, interfaceC0418v0, abstractC0375g0, abstractC0391l1, abstractC0404q, interfaceC0390l0) : m3229O((C0385j1) interfaceC0399o0, interfaceC0418v0, abstractC0375g0, abstractC0391l1, abstractC0404q, interfaceC0390l0);
    }

    /* renamed from: O */
    static <T> C0414t0<T> m3229O(C0385j1 c0385j1, InterfaceC0418v0 interfaceC0418v0, AbstractC0375g0 abstractC0375g0, AbstractC0391l1<?, ?> abstractC0391l1, AbstractC0404q<?> abstractC0404q, InterfaceC0390l0 interfaceC0390l0) {
        boolean z = c0385j1.mo2602c() == EnumC0358a1.PROTO3;
        C0413t[] c0413tArrM2917e = c0385j1.m2917e();
        if (c0413tArrM2917e.length != 0) {
            C0413t c0413t = c0413tArrM2917e[0];
            throw null;
        }
        int length = c0413tArrM2917e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c0413tArrM2917e.length > 0) {
            C0413t c0413t2 = c0413tArrM2917e[0];
            throw null;
        }
        int[] iArrM2916d = c0385j1.m2916d();
        if (iArrM2916d == null) {
            iArrM2916d = f2915a;
        }
        if (c0413tArrM2917e.length > 0) {
            C0413t c0413t3 = c0413tArrM2917e[0];
            throw null;
        }
        int[] iArr2 = f2915a;
        int[] iArr3 = f2915a;
        int[] iArr4 = new int[iArrM2916d.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrM2916d, 0, iArr4, 0, iArrM2916d.length);
        System.arraycopy(iArr2, 0, iArr4, iArrM2916d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrM2916d.length + iArr2.length, iArr3.length);
        return new C0414t0<>(iArr, objArr, 0, 0, c0385j1.mo2601b(), z, true, iArr4, iArrM2916d.length, iArrM2916d.length + iArr2.length, interfaceC0418v0, abstractC0375g0, abstractC0391l1, abstractC0404q, interfaceC0390l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039f  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.C0414t0<T> m3230P(androidx.datastore.preferences.protobuf.C0367d1 r36, androidx.datastore.preferences.protobuf.InterfaceC0418v0 r37, androidx.datastore.preferences.protobuf.AbstractC0375g0 r38, androidx.datastore.preferences.protobuf.AbstractC0391l1<?, ?> r39, androidx.datastore.preferences.protobuf.AbstractC0404q<?> r40, androidx.datastore.preferences.protobuf.InterfaceC0390l0 r41) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.m3230P(androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.v0, androidx.datastore.preferences.protobuf.g0, androidx.datastore.preferences.protobuf.l1, androidx.datastore.preferences.protobuf.q, androidx.datastore.preferences.protobuf.l0):androidx.datastore.preferences.protobuf.t0");
    }

    /* renamed from: Q */
    private int m3231Q(int i2) {
        return this.f2917c[i2];
    }

    /* renamed from: R */
    private static long m3232R(int i2) {
        return i2 & 1048575;
    }

    /* renamed from: S */
    private static <T> boolean m3233S(T t, long j2) {
        return ((Boolean) C0403p1.m3081A(t, j2)).booleanValue();
    }

    /* renamed from: T */
    private static <T> double m3234T(T t, long j2) {
        return ((Double) C0403p1.m3081A(t, j2)).doubleValue();
    }

    /* renamed from: U */
    private static <T> float m3235U(T t, long j2) {
        return ((Float) C0403p1.m3081A(t, j2)).floatValue();
    }

    /* renamed from: V */
    private static <T> int m3236V(T t, long j2) {
        return ((Integer) C0403p1.m3081A(t, j2)).intValue();
    }

    /* renamed from: W */
    private static <T> long m3237W(T t, long j2) {
        return ((Long) C0403p1.m3081A(t, j2)).longValue();
    }

    /* renamed from: X */
    private int m3238X(int i2) {
        if (i2 < this.f2919e || i2 > this.f2920f) {
            return -1;
        }
        return m3247g0(i2, 0);
    }

    /* renamed from: Y */
    private int m3239Y(int i2) {
        return this.f2917c[i2 + 2];
    }

    /* renamed from: Z */
    private <E> void m3240Z(Object obj, long j2, InterfaceC0370e1 interfaceC0370e1, InterfaceC0373f1<E> interfaceC0373f1, C0401p c0401p) throws IOException {
        interfaceC0370e1.mo2631F(this.f2930p.mo2705e(obj, j2), interfaceC0373f1, c0401p);
    }

    /* renamed from: a0 */
    private <E> void m3241a0(Object obj, int i2, InterfaceC0370e1 interfaceC0370e1, InterfaceC0373f1<E> interfaceC0373f1, C0401p c0401p) throws IOException {
        interfaceC0370e1.mo2636K(this.f2930p.mo2705e(obj, m3232R(i2)), interfaceC0373f1, c0401p);
    }

    /* renamed from: b0 */
    private void m3242b0(Object obj, int i2, InterfaceC0370e1 interfaceC0370e1) throws IOException {
        if (m3270x(i2)) {
            C0403p1.m3095O(obj, m3232R(i2), interfaceC0370e1.mo2638M());
        } else if (this.f2923i) {
            C0403p1.m3095O(obj, m3232R(i2), interfaceC0370e1.mo2642a());
        } else {
            C0403p1.m3095O(obj, m3232R(i2), interfaceC0370e1.mo2628C());
        }
    }

    /* renamed from: c0 */
    private void m3243c0(Object obj, int i2, InterfaceC0370e1 interfaceC0370e1) throws IOException {
        if (m3270x(i2)) {
            interfaceC0370e1.mo2627B(this.f2930p.mo2705e(obj, m3232R(i2)));
        } else {
            interfaceC0370e1.mo2644b(this.f2930p.mo2705e(obj, m3232R(i2)));
        }
    }

    /* renamed from: d0 */
    private static Field m3244d0(Class<?> cls, String str) {
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

    /* renamed from: e0 */
    private void m3245e0(T t, int i2) {
        if (this.f2924j) {
            return;
        }
        int iM3239Y = m3239Y(i2);
        long j2 = iM3239Y & 1048575;
        C0403p1.m3093M(t, j2, C0403p1.m3121x(t, j2) | (1 << (iM3239Y >>> 20)));
    }

    /* renamed from: f0 */
    private void m3246f0(T t, int i2, int i3) {
        C0403p1.m3093M(t, m3239Y(i3) & 1048575, i2);
    }

    /* renamed from: g0 */
    private int m3247g0(int i2, int i3) {
        int length = (this.f2917c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int iM3231Q = m3231Q(i5);
            if (i2 == iM3231Q) {
                return i5;
            }
            if (i2 < iM3231Q) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* renamed from: h0 */
    private static int m3248h0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* renamed from: i0 */
    private int m3249i0(int i2) {
        return this.f2917c[i2 + 1];
    }

    /* renamed from: j */
    private boolean m3250j(T t, T t2, int i2) {
        return m3271y(t, i2) == m3271y(t2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3251j0(T r18, androidx.datastore.preferences.protobuf.InterfaceC0412s1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.m3251j0(java.lang.Object, androidx.datastore.preferences.protobuf.s1):void");
    }

    /* renamed from: k */
    private static <T> boolean m3252k(T t, long j2) {
        return C0403p1.m3113p(t, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3253k0(T r13, androidx.datastore.preferences.protobuf.InterfaceC0412s1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.m3253k0(java.lang.Object, androidx.datastore.preferences.protobuf.s1):void");
    }

    /* renamed from: l */
    private static <T> double m3254l(T t, long j2) {
        return C0403p1.m3119v(t, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3255l0(T r11, androidx.datastore.preferences.protobuf.InterfaceC0412s1 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.m3255l0(java.lang.Object, androidx.datastore.preferences.protobuf.s1):void");
    }

    /* renamed from: m */
    private boolean m3256m(T t, T t2, int i2) {
        int iM3249i0 = m3249i0(i2);
        long jM3232R = m3232R(iM3249i0);
        switch (m3248h0(iM3249i0)) {
            case 0:
                return m3250j(t, t2, i2) && Double.doubleToLongBits(C0403p1.m3119v(t, jM3232R)) == Double.doubleToLongBits(C0403p1.m3119v(t2, jM3232R));
            case 1:
                return m3250j(t, t2, i2) && Float.floatToIntBits(C0403p1.m3120w(t, jM3232R)) == Float.floatToIntBits(C0403p1.m3120w(t2, jM3232R));
            case 2:
                return m3250j(t, t2, i2) && C0403p1.m3122y(t, jM3232R) == C0403p1.m3122y(t2, jM3232R);
            case 3:
                return m3250j(t, t2, i2) && C0403p1.m3122y(t, jM3232R) == C0403p1.m3122y(t2, jM3232R);
            case 4:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 5:
                return m3250j(t, t2, i2) && C0403p1.m3122y(t, jM3232R) == C0403p1.m3122y(t2, jM3232R);
            case 6:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 7:
                return m3250j(t, t2, i2) && C0403p1.m3113p(t, jM3232R) == C0403p1.m3113p(t2, jM3232R);
            case 8:
                return m3250j(t, t2, i2) && C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            case 9:
                return m3250j(t, t2, i2) && C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            case 10:
                return m3250j(t, t2, i2) && C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            case 11:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 12:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 13:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 14:
                return m3250j(t, t2, i2) && C0403p1.m3122y(t, jM3232R) == C0403p1.m3122y(t2, jM3232R);
            case 15:
                return m3250j(t, t2, i2) && C0403p1.m3121x(t, jM3232R) == C0403p1.m3121x(t2, jM3232R);
            case 16:
                return m3250j(t, t2, i2) && C0403p1.m3122y(t, jM3232R) == C0403p1.m3122y(t2, jM3232R);
            case 17:
                return m3250j(t, t2, i2) && C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
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
            case 30:
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
                return C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            case 50:
                return C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return m3218D(t, t2, i2) && C0379h1.m2764K(C0403p1.m3081A(t, jM3232R), C0403p1.m3081A(t2, jM3232R));
            default:
                return true;
        }
    }

    /* renamed from: m0 */
    private <K, V> void m3257m0(InterfaceC0412s1 interfaceC0412s1, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            interfaceC0412s1.mo2960L(i2, this.f2933s.mo2992c(m3264r(i3)), this.f2933s.mo2997h(obj));
        }
    }

    /* renamed from: n */
    private final <UT, UB> UB m3258n(Object obj, int i2, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) {
        C0357a0.e eVarM3263q;
        int iM3231Q = m3231Q(i2);
        Object objM3081A = C0403p1.m3081A(obj, m3232R(m3249i0(i2)));
        return (objM3081A == null || (eVarM3263q = m3263q(i2)) == null) ? ub : (UB) m3260o(i2, iM3231Q, this.f2933s.mo2993d(objM3081A), eVarM3263q, ub, abstractC0391l1);
    }

    /* renamed from: n0 */
    private void m3259n0(int i2, Object obj, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (obj instanceof String) {
            interfaceC0412s1.mo2976m(i2, (String) obj);
        } else {
            interfaceC0412s1.mo2986w(i2, (AbstractC0377h) obj);
        }
    }

    /* renamed from: o */
    private final <K, V, UT, UB> UB m3260o(int i2, int i3, Map<K, V> map, C0357a0.e eVar, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) {
        C0384j0.a<?, ?> aVarMo2992c = this.f2933s.mo2992c(m3264r(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.m2568a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC0391l1.mo3011n();
                }
                AbstractC0377h.h hVarM2719u = AbstractC0377h.m2719u(C0384j0.m2911b(aVarMo2992c, next.getKey(), next.getValue()));
                try {
                    C0384j0.m2913e(hVarM2719u.m2740b(), aVarMo2992c, next.getKey(), next.getValue());
                    abstractC0391l1.mo3001d(ub, i3, hVarM2719u.m2739a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: o0 */
    private <UT, UB> void m3261o0(AbstractC0391l1<UT, UB> abstractC0391l1, T t, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        abstractC0391l1.mo3017t(abstractC0391l1.mo3004g(t), interfaceC0412s1);
    }

    /* renamed from: p */
    private static <T> float m3262p(T t, long j2) {
        return C0403p1.m3120w(t, j2);
    }

    /* renamed from: q */
    private C0357a0.e m3263q(int i2) {
        return (C0357a0.e) this.f2918d[((i2 / 3) * 2) + 1];
    }

    /* renamed from: r */
    private Object m3264r(int i2) {
        return this.f2918d[(i2 / 3) * 2];
    }

    /* renamed from: s */
    private InterfaceC0373f1 m3265s(int i2) {
        int i3 = (i2 / 3) * 2;
        InterfaceC0373f1 interfaceC0373f1 = (InterfaceC0373f1) this.f2918d[i3];
        if (interfaceC0373f1 != null) {
            return interfaceC0373f1;
        }
        InterfaceC0373f1<T> interfaceC0373f1M2581d = C0361b1.m2578a().m2581d((Class) this.f2918d[i3 + 1]);
        this.f2918d[i3] = interfaceC0373f1M2581d;
        return interfaceC0373f1M2581d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t */
    private int m3266t(T t) {
        int i2;
        int i3;
        int iM2448i;
        int iM2440d;
        int iM2422L;
        int iM2793i;
        int iM2432V;
        int iM2434X;
        Unsafe unsafe = f2916b;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f2917c.length) {
            int iM3249i0 = m3249i0(i5);
            int iM3231Q = m3231Q(i5);
            int iM3248h0 = m3248h0(iM3249i0);
            if (iM3248h0 <= 17) {
                i2 = this.f2917c[i5 + 2];
                int i8 = 1048575 & i2;
                int i9 = 1 << (i2 >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
                i3 = i9;
            } else {
                i2 = (!this.f2925k || iM3248h0 < EnumC0417v.f2958O.m3311g() || iM3248h0 > EnumC0417v.f2971b0.m3311g()) ? 0 : this.f2917c[i5 + 2] & 1048575;
                i3 = 0;
            }
            long jM3232R = m3232R(iM3249i0);
            int i10 = i4;
            switch (iM3248h0) {
                case 0:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2448i(iM3231Q, 0.0d);
                        i6 += iM2448i;
                        break;
                    }
                case 1:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2456q(iM3231Q, 0.0f);
                        i6 += iM2448i;
                        break;
                    }
                case 2:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2463x(iM3231Q, unsafe.getLong(t, jM3232R));
                        i6 += iM2448i;
                        break;
                    }
                case 3:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2435Y(iM3231Q, unsafe.getLong(t, jM3232R));
                        i6 += iM2448i;
                        break;
                    }
                case 4:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2461v(iM3231Q, unsafe.getInt(t, jM3232R));
                        i6 += iM2448i;
                        break;
                    }
                case 5:
                    if ((i7 & i3) == 0) {
                        break;
                    } else {
                        iM2448i = CodedOutputStream.m2454o(iM3231Q, 0L);
                        i6 += iM2448i;
                        break;
                    }
                case 6:
                    if ((i7 & i3) != 0) {
                        iM2448i = CodedOutputStream.m2452m(iM3231Q, 0);
                        i6 += iM2448i;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2440d(iM3231Q, true);
                        i6 += iM2440d;
                    }
                    break;
                case 8:
                    if ((i7 & i3) != 0) {
                        Object object = unsafe.getObject(t, jM3232R);
                        iM2440d = object instanceof AbstractC0377h ? CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) object) : CodedOutputStream.m2430T(iM3231Q, (String) object);
                        i6 += iM2440d;
                    }
                    break;
                case 9:
                    if ((i7 & i3) != 0) {
                        iM2440d = C0379h1.m2799o(iM3231Q, unsafe.getObject(t, jM3232R), m3265s(i5));
                        i6 += iM2440d;
                    }
                    break;
                case 10:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) unsafe.getObject(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 11:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2433W(iM3231Q, unsafe.getInt(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 12:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2450k(iM3231Q, unsafe.getInt(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 13:
                    if ((i7 & i3) != 0) {
                        iM2422L = CodedOutputStream.m2422L(iM3231Q, 0);
                        i6 += iM2422L;
                    }
                    break;
                case 14:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2424N(iM3231Q, 0L);
                        i6 += iM2440d;
                    }
                    break;
                case 15:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2426P(iM3231Q, unsafe.getInt(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 16:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2428R(iM3231Q, unsafe.getLong(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 17:
                    if ((i7 & i3) != 0) {
                        iM2440d = CodedOutputStream.m2458s(iM3231Q, (InterfaceC0405q0) unsafe.getObject(t, jM3232R), m3265s(i5));
                        i6 += iM2440d;
                    }
                    break;
                case 18:
                    iM2440d = C0379h1.m2792h(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 19:
                    iM2440d = C0379h1.m2790f(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 20:
                    iM2440d = C0379h1.m2797m(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 21:
                    iM2440d = C0379h1.m2808x(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 22:
                    iM2440d = C0379h1.m2795k(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 23:
                    iM2440d = C0379h1.m2792h(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 24:
                    iM2440d = C0379h1.m2790f(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 25:
                    iM2440d = C0379h1.m2780a(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 26:
                    iM2440d = C0379h1.m2805u(iM3231Q, (List) unsafe.getObject(t, jM3232R));
                    i6 += iM2440d;
                    break;
                case 27:
                    iM2440d = C0379h1.m2800p(iM3231Q, (List) unsafe.getObject(t, jM3232R), m3265s(i5));
                    i6 += iM2440d;
                    break;
                case 28:
                    iM2440d = C0379h1.m2784c(iM3231Q, (List) unsafe.getObject(t, jM3232R));
                    i6 += iM2440d;
                    break;
                case 29:
                    iM2440d = C0379h1.m2806v(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 30:
                    iM2440d = C0379h1.m2786d(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 31:
                    iM2440d = C0379h1.m2790f(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 32:
                    iM2440d = C0379h1.m2792h(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 33:
                    iM2440d = C0379h1.m2801q(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 34:
                    iM2440d = C0379h1.m2803s(iM3231Q, (List) unsafe.getObject(t, jM3232R), false);
                    i6 += iM2440d;
                    break;
                case 35:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 36:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 37:
                    iM2793i = C0379h1.m2798n((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 38:
                    iM2793i = C0379h1.m2809y((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 39:
                    iM2793i = C0379h1.m2796l((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 40:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 41:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 42:
                    iM2793i = C0379h1.m2782b((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 43:
                    iM2793i = C0379h1.m2807w((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 44:
                    iM2793i = C0379h1.m2788e((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 45:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 46:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 47:
                    iM2793i = C0379h1.m2802r((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 48:
                    iM2793i = C0379h1.m2804t((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i > 0) {
                        if (this.f2925k) {
                            unsafe.putInt(t, i2, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2422L = iM2432V + iM2434X + iM2793i;
                        i6 += iM2422L;
                    }
                    break;
                case 49:
                    iM2440d = C0379h1.m2794j(iM3231Q, (List) unsafe.getObject(t, jM3232R), m3265s(i5));
                    i6 += iM2440d;
                    break;
                case 50:
                    iM2440d = this.f2933s.mo2995f(iM3231Q, unsafe.getObject(t, jM3232R), m3264r(i5));
                    i6 += iM2440d;
                    break;
                case 51:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2448i(iM3231Q, 0.0d);
                        i6 += iM2440d;
                    }
                    break;
                case 52:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2456q(iM3231Q, 0.0f);
                        i6 += iM2440d;
                    }
                    break;
                case 53:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2463x(iM3231Q, m3237W(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 54:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2435Y(iM3231Q, m3237W(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 55:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2461v(iM3231Q, m3236V(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 56:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2454o(iM3231Q, 0L);
                        i6 += iM2440d;
                    }
                    break;
                case 57:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2422L = CodedOutputStream.m2452m(iM3231Q, 0);
                        i6 += iM2422L;
                    }
                    break;
                case 58:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2440d(iM3231Q, true);
                        i6 += iM2440d;
                    }
                    break;
                case 59:
                    if (m3219E(t, iM3231Q, i5)) {
                        Object object2 = unsafe.getObject(t, jM3232R);
                        iM2440d = object2 instanceof AbstractC0377h ? CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) object2) : CodedOutputStream.m2430T(iM3231Q, (String) object2);
                        i6 += iM2440d;
                    }
                    break;
                case 60:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = C0379h1.m2799o(iM3231Q, unsafe.getObject(t, jM3232R), m3265s(i5));
                        i6 += iM2440d;
                    }
                    break;
                case 61:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) unsafe.getObject(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 62:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2433W(iM3231Q, m3236V(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 63:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2450k(iM3231Q, m3236V(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 64:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2422L = CodedOutputStream.m2422L(iM3231Q, 0);
                        i6 += iM2422L;
                    }
                    break;
                case 65:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2424N(iM3231Q, 0L);
                        i6 += iM2440d;
                    }
                    break;
                case 66:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2426P(iM3231Q, m3236V(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 67:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2428R(iM3231Q, m3237W(t, jM3232R));
                        i6 += iM2440d;
                    }
                    break;
                case 68:
                    if (m3219E(t, iM3231Q, i5)) {
                        iM2440d = CodedOutputStream.m2458s(iM3231Q, (InterfaceC0405q0) unsafe.getObject(t, jM3232R), m3265s(i5));
                        i6 += iM2440d;
                    }
                    break;
            }
            i5 += 3;
            i4 = i10;
        }
        int iM3268v = i6 + m3268v(this.f2931q, t);
        return this.f2922h ? iM3268v + this.f2932r.mo3144c(t).m3292l() : iM3268v;
    }

    /* renamed from: u */
    private int m3267u(T t) {
        int iM2448i;
        int iM2793i;
        int iM2432V;
        int iM2434X;
        Unsafe unsafe = f2916b;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2917c.length; i3 += 3) {
            int iM3249i0 = m3249i0(i3);
            int iM3248h0 = m3248h0(iM3249i0);
            int iM3231Q = m3231Q(i3);
            long jM3232R = m3232R(iM3249i0);
            int i4 = (iM3248h0 < EnumC0417v.f2958O.m3311g() || iM3248h0 > EnumC0417v.f2971b0.m3311g()) ? 0 : this.f2917c[i3 + 2] & 1048575;
            switch (iM3248h0) {
                case 0:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2448i(iM3231Q, 0.0d);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2456q(iM3231Q, 0.0f);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2463x(iM3231Q, C0403p1.m3122y(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2435Y(iM3231Q, C0403p1.m3122y(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2461v(iM3231Q, C0403p1.m3121x(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2454o(iM3231Q, 0L);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2452m(iM3231Q, 0);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2440d(iM3231Q, true);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m3271y(t, i3)) {
                        Object objM3081A = C0403p1.m3081A(t, jM3232R);
                        iM2448i = objM3081A instanceof AbstractC0377h ? CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) objM3081A) : CodedOutputStream.m2430T(iM3231Q, (String) objM3081A);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m3271y(t, i3)) {
                        iM2448i = C0379h1.m2799o(iM3231Q, C0403p1.m3081A(t, jM3232R), m3265s(i3));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) C0403p1.m3081A(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2433W(iM3231Q, C0403p1.m3121x(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2450k(iM3231Q, C0403p1.m3121x(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2422L(iM3231Q, 0);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2424N(iM3231Q, 0L);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2426P(iM3231Q, C0403p1.m3121x(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2428R(iM3231Q, C0403p1.m3122y(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m3271y(t, i3)) {
                        iM2448i = CodedOutputStream.m2458s(iM3231Q, (InterfaceC0405q0) C0403p1.m3081A(t, jM3232R), m3265s(i3));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iM2448i = C0379h1.m2792h(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 19:
                    iM2448i = C0379h1.m2790f(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 20:
                    iM2448i = C0379h1.m2797m(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 21:
                    iM2448i = C0379h1.m2808x(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 22:
                    iM2448i = C0379h1.m2795k(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 23:
                    iM2448i = C0379h1.m2792h(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 24:
                    iM2448i = C0379h1.m2790f(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 25:
                    iM2448i = C0379h1.m2780a(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 26:
                    iM2448i = C0379h1.m2805u(iM3231Q, m3221G(t, jM3232R));
                    i2 += iM2448i;
                    break;
                case 27:
                    iM2448i = C0379h1.m2800p(iM3231Q, m3221G(t, jM3232R), m3265s(i3));
                    i2 += iM2448i;
                    break;
                case 28:
                    iM2448i = C0379h1.m2784c(iM3231Q, m3221G(t, jM3232R));
                    i2 += iM2448i;
                    break;
                case 29:
                    iM2448i = C0379h1.m2806v(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 30:
                    iM2448i = C0379h1.m2786d(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 31:
                    iM2448i = C0379h1.m2790f(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 32:
                    iM2448i = C0379h1.m2792h(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 33:
                    iM2448i = C0379h1.m2801q(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 34:
                    iM2448i = C0379h1.m2803s(iM3231Q, m3221G(t, jM3232R), false);
                    i2 += iM2448i;
                    break;
                case 35:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 36:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 37:
                    iM2793i = C0379h1.m2798n((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 38:
                    iM2793i = C0379h1.m2809y((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 39:
                    iM2793i = C0379h1.m2796l((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 40:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 41:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 42:
                    iM2793i = C0379h1.m2782b((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 43:
                    iM2793i = C0379h1.m2807w((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 44:
                    iM2793i = C0379h1.m2788e((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 45:
                    iM2793i = C0379h1.m2791g((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 46:
                    iM2793i = C0379h1.m2793i((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 47:
                    iM2793i = C0379h1.m2802r((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 48:
                    iM2793i = C0379h1.m2804t((List) unsafe.getObject(t, jM3232R));
                    if (iM2793i <= 0) {
                        break;
                    } else {
                        if (this.f2925k) {
                            unsafe.putInt(t, i4, iM2793i);
                        }
                        iM2432V = CodedOutputStream.m2432V(iM3231Q);
                        iM2434X = CodedOutputStream.m2434X(iM2793i);
                        iM2448i = iM2432V + iM2434X + iM2793i;
                        i2 += iM2448i;
                        break;
                    }
                case 49:
                    iM2448i = C0379h1.m2794j(iM3231Q, m3221G(t, jM3232R), m3265s(i3));
                    i2 += iM2448i;
                    break;
                case 50:
                    iM2448i = this.f2933s.mo2995f(iM3231Q, C0403p1.m3081A(t, jM3232R), m3264r(i3));
                    i2 += iM2448i;
                    break;
                case 51:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2448i(iM3231Q, 0.0d);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2456q(iM3231Q, 0.0f);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2463x(iM3231Q, m3237W(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2435Y(iM3231Q, m3237W(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2461v(iM3231Q, m3236V(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2454o(iM3231Q, 0L);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2452m(iM3231Q, 0);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2440d(iM3231Q, true);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m3219E(t, iM3231Q, i3)) {
                        Object objM3081A2 = C0403p1.m3081A(t, jM3232R);
                        iM2448i = objM3081A2 instanceof AbstractC0377h ? CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) objM3081A2) : CodedOutputStream.m2430T(iM3231Q, (String) objM3081A2);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = C0379h1.m2799o(iM3231Q, C0403p1.m3081A(t, jM3232R), m3265s(i3));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2444g(iM3231Q, (AbstractC0377h) C0403p1.m3081A(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2433W(iM3231Q, m3236V(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2450k(iM3231Q, m3236V(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2422L(iM3231Q, 0);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2424N(iM3231Q, 0L);
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2426P(iM3231Q, m3236V(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2428R(iM3231Q, m3237W(t, jM3232R));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m3219E(t, iM3231Q, i3)) {
                        iM2448i = CodedOutputStream.m2458s(iM3231Q, (InterfaceC0405q0) C0403p1.m3081A(t, jM3232R), m3265s(i3));
                        i2 += iM2448i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i2 + m3268v(this.f2931q, t);
    }

    /* renamed from: v */
    private <UT, UB> int m3268v(AbstractC0391l1<UT, UB> abstractC0391l1, T t) {
        return abstractC0391l1.mo3005h(abstractC0391l1.mo3004g(t));
    }

    /* renamed from: w */
    private static <T> int m3269w(T t, long j2) {
        return C0403p1.m3121x(t, j2);
    }

    /* renamed from: x */
    private static boolean m3270x(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* renamed from: y */
    private boolean m3271y(T t, int i2) {
        if (!this.f2924j) {
            int iM3239Y = m3239Y(i2);
            return (C0403p1.m3121x(t, (long) (iM3239Y & 1048575)) & (1 << (iM3239Y >>> 20))) != 0;
        }
        int iM3249i0 = m3249i0(i2);
        long jM3232R = m3232R(iM3249i0);
        switch (m3248h0(iM3249i0)) {
            case 0:
                return C0403p1.m3119v(t, jM3232R) != 0.0d;
            case 1:
                return C0403p1.m3120w(t, jM3232R) != 0.0f;
            case 2:
                return C0403p1.m3122y(t, jM3232R) != 0;
            case 3:
                return C0403p1.m3122y(t, jM3232R) != 0;
            case 4:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 5:
                return C0403p1.m3122y(t, jM3232R) != 0;
            case 6:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 7:
                return C0403p1.m3113p(t, jM3232R);
            case 8:
                Object objM3081A = C0403p1.m3081A(t, jM3232R);
                if (objM3081A instanceof String) {
                    return !((String) objM3081A).isEmpty();
                }
                if (objM3081A instanceof AbstractC0377h) {
                    return !AbstractC0377h.f2734f.equals(objM3081A);
                }
                throw new IllegalArgumentException();
            case 9:
                return C0403p1.m3081A(t, jM3232R) != null;
            case 10:
                return !AbstractC0377h.f2734f.equals(C0403p1.m3081A(t, jM3232R));
            case 11:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 12:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 13:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 14:
                return C0403p1.m3122y(t, jM3232R) != 0;
            case 15:
                return C0403p1.m3121x(t, jM3232R) != 0;
            case 16:
                return C0403p1.m3122y(t, jM3232R) != 0;
            case 17:
                return C0403p1.m3081A(t, jM3232R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    private boolean m3272z(T t, int i2, int i3, int i4) {
        return this.f2924j ? m3271y(t, i2) : (i3 & i4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: a */
    public void mo2692a(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f2917c.length; i2 += 3) {
            m3227M(t, t2, i2);
        }
        if (this.f2924j) {
            return;
        }
        C0379h1.m2760G(this.f2931q, t, t2);
        if (this.f2922h) {
            C0379h1.m2758E(this.f2932r, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: b */
    public boolean mo2693b(T t, T t2) {
        int length = this.f2917c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!m3256m(t, t2, i2)) {
                return false;
            }
        }
        if (!this.f2931q.mo3004g(t).equals(this.f2931q.mo3004g(t2))) {
            return false;
        }
        if (this.f2922h) {
            return this.f2932r.mo3144c(t).equals(this.f2932r.mo3144c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: c */
    public T mo2694c() {
        return (T) this.f2929o.mo3312a(this.f2921g);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: d */
    public int mo2695d(T t) {
        int i2;
        int iM2561f;
        int length = this.f2917c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM3249i0 = m3249i0(i4);
            int iM3231Q = m3231Q(i4);
            long jM3232R = m3232R(iM3249i0);
            int iHashCode = 37;
            switch (m3248h0(iM3249i0)) {
                case 0:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(Double.doubleToLongBits(C0403p1.m3119v(t, jM3232R)));
                    i3 = i2 + iM2561f;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iM2561f = Float.floatToIntBits(C0403p1.m3120w(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(C0403p1.m3122y(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(C0403p1.m3122y(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(C0403p1.m3122y(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2558c(C0403p1.m3113p(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iM2561f = ((String) C0403p1.m3081A(t, jM3232R)).hashCode();
                    i3 = i2 + iM2561f;
                    break;
                case 9:
                    Object objM3081A = C0403p1.m3081A(t, jM3232R);
                    if (objM3081A != null) {
                        iHashCode = objM3081A.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                    i3 = i2 + iM2561f;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(C0403p1.m3122y(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3121x(t, jM3232R);
                    i3 = i2 + iM2561f;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iM2561f = C0357a0.m2561f(C0403p1.m3122y(t, jM3232R));
                    i3 = i2 + iM2561f;
                    break;
                case 17:
                    Object objM3081A2 = C0403p1.m3081A(t, jM3232R);
                    if (objM3081A2 != null) {
                        iHashCode = objM3081A2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                case 30:
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
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                    i3 = i2 + iM2561f;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                    i3 = i2 + iM2561f;
                    break;
                case 51:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(Double.doubleToLongBits(m3234T(t, jM3232R)));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = Float.floatToIntBits(m3235U(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(m3237W(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(m3237W(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(m3237W(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2558c(m3233S(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = ((String) C0403p1.m3081A(t, jM3232R)).hashCode();
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(m3237W(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = m3236V(t, jM3232R);
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0357a0.m2561f(m3237W(t, jM3232R));
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m3219E(t, iM3231Q, i4)) {
                        i2 = i3 * 53;
                        iM2561f = C0403p1.m3081A(t, jM3232R).hashCode();
                        i3 = i2 + iM2561f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.f2931q.mo3004g(t).hashCode();
        return this.f2922h ? (iHashCode2 * 53) + this.f2932r.mo3144c(t).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: e */
    public void mo2696e(T t, InterfaceC0370e1 interfaceC0370e1, C0401p c0401p) throws IOException {
        c0401p.getClass();
        m3223I(this.f2931q, this.f2932r, t, interfaceC0370e1, c0401p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: f */
    public void mo2697f(T t) {
        int i2;
        int i3 = this.f2927m;
        while (true) {
            i2 = this.f2928n;
            if (i3 >= i2) {
                break;
            }
            long jM3232R = m3232R(m3249i0(this.f2926l[i3]));
            Object objM3081A = C0403p1.m3081A(t, jM3232R);
            if (objM3081A != null) {
                C0403p1.m3095O(t, jM3232R, this.f2933s.mo2991b(objM3081A));
            }
            i3++;
        }
        int length = this.f2926l.length;
        while (i2 < length) {
            this.f2930p.mo2703c(t, this.f2926l[i2]);
            i2++;
        }
        this.f2931q.mo3007j(t);
        if (this.f2922h) {
            this.f2932r.mo3147f(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2698g(T r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
        L4:
            int r4 = r12.f2927m
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f2926l
            r4 = r4[r2]
            int r6 = r12.m3231Q(r4)
            int r7 = r12.m3249i0(r4)
            boolean r8 = r12.f2924j
            if (r8 != 0) goto L31
            int[] r8 = r12.f2917c
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r1) goto L32
            sun.misc.Unsafe r1 = androidx.datastore.preferences.protobuf.C0414t0.f2916b
            long r10 = (long) r9
            int r3 = r1.getInt(r13, r10)
            r1 = r9
            goto L32
        L31:
            r5 = 0
        L32:
            boolean r8 = m3220F(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.m3272z(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r0
        L3f:
            int r8 = m3248h0(r7)
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
            boolean r4 = r12.m3217C(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L67:
            boolean r5 = r12.m3219E(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.f1 r4 = r12.m3265s(r4)
            boolean r4 = m3215A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L78:
            boolean r4 = r12.m3216B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L7f:
            boolean r5 = r12.m3272z(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.f1 r4 = r12.m3265s(r4)
            boolean r4 = m3215A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r1 = r12.f2922h
            if (r1 == 0) goto La5
            androidx.datastore.preferences.protobuf.q<?> r1 = r12.f2932r
            androidx.datastore.preferences.protobuf.u r13 = r1.mo3144c(r13)
            boolean r13 = r13.m3295p()
            if (r13 != 0) goto La5
            return r0
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0414t0.mo2698g(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: h */
    public void mo2699h(T t, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (interfaceC0412s1.mo2972i() == InterfaceC0412s1.a.DESCENDING) {
            m3255l0(t, interfaceC0412s1);
        } else if (this.f2924j) {
            m3253k0(t, interfaceC0412s1);
        } else {
            m3251j0(t, interfaceC0412s1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: i */
    public int mo2700i(T t) {
        return this.f2924j ? m3267u(t) : m3266t(t);
    }
}
