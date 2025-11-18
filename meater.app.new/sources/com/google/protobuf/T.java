package com.google.protobuf;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.protobuf.AbstractC2947g;
import com.google.protobuf.C2964y;
import com.google.protobuf.I;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes2.dex */
final class T<T> implements f0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f39190r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f39191s = p0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f39192a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f39193b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39194c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39195d;

    /* renamed from: e, reason: collision with root package name */
    private final P f39196e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39197f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39198g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f39199h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f39200i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f39201j;

    /* renamed from: k, reason: collision with root package name */
    private final int f39202k;

    /* renamed from: l, reason: collision with root package name */
    private final int f39203l;

    /* renamed from: m, reason: collision with root package name */
    private final V f39204m;

    /* renamed from: n, reason: collision with root package name */
    private final F f39205n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f39206o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC2955o<?> f39207p;

    /* renamed from: q, reason: collision with root package name */
    private final K f39208q;

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, V v10, F f10, l0<?, ?> l0Var, AbstractC2955o<?> abstractC2955o, K k10) {
        this.f39192a = iArr;
        this.f39193b = objArr;
        this.f39194c = i10;
        this.f39195d = i11;
        this.f39198g = p10 instanceof AbstractC2962w;
        this.f39199h = a0Var;
        this.f39197f = abstractC2955o != null && abstractC2955o.e(p10);
        this.f39200i = z10;
        this.f39201j = iArr2;
        this.f39202k = i12;
        this.f39203l = i13;
        this.f39204m = v10;
        this.f39205n = f10;
        this.f39206o = l0Var;
        this.f39207p = abstractC2955o;
        this.f39196e = p10;
        this.f39208q = k10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) p0.C(obj, S(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarT = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarT.c(list.get(i12))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.f0] */
    private boolean B(T t10, int i10, int i11) {
        Map<?, ?> mapH = this.f39208q.h(p0.C(t10, S(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f39208q.c(s(i11)).f39181c.c() != r0.c.MESSAGE) {
            return true;
        }
        ?? C10 = 0;
        for (Object obj : mapH.values()) {
            C10 = C10;
            if (C10 == 0) {
                C10 = b0.a().c(obj.getClass());
            }
            if (!C10.c(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2962w) {
            return ((AbstractC2962w) obj).O();
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long jZ = Z(i10) & 1048575;
        return p0.z(t10, jZ) == p0.z(t11, jZ);
    }

    private boolean E(T t10, int i10, int i11) {
        return p0.z(t10, (long) (Z(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static <T> long G(T t10, long j10) {
        return p0.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r0 = r18.f39202k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0 >= r18.f39203l) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r4 = o(r21, r18.f39201j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r4 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r7.o(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b1 A[LOOP:4: B:196:0x06ad->B:198:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.C2958s.b<ET>> void H(com.google.protobuf.l0<UT, UB> r19, com.google.protobuf.AbstractC2955o<ET> r20, T r21, com.google.protobuf.e0 r22, com.google.protobuf.C2954n r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.H(com.google.protobuf.l0, com.google.protobuf.o, java.lang.Object, com.google.protobuf.e0, com.google.protobuf.n):void");
    }

    private final <K, V> void I(Object obj, int i10, Object obj2, C2954n c2954n, e0 e0Var) {
        long jS = S(l0(i10));
        Object objC = p0.C(obj, jS);
        if (objC == null) {
            objC = this.f39208q.e(obj2);
            p0.R(obj, jS, objC);
        } else if (this.f39208q.g(objC)) {
            Object objE = this.f39208q.e(obj2);
            this.f39208q.a(objE, objC);
            p0.R(obj, jS, objE);
            objC = objE;
        }
        e0Var.P(this.f39208q.d(objC), this.f39208q.c(obj2), c2954n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(T t10, T t11, int i10) {
        if (x(t11, i10)) {
            long jS = S(l0(i10));
            Unsafe unsafe = f39191s;
            Object object = unsafe.getObject(t11, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
            }
            f0 f0VarT = t(i10);
            if (!x(t10, i10)) {
                if (C(object)) {
                    Object objF = f0VarT.f();
                    f0VarT.a(objF, object);
                    unsafe.putObject(t10, jS, objF);
                } else {
                    unsafe.putObject(t10, jS, object);
                }
                f0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jS);
            if (!C(object2)) {
                Object objF2 = f0VarT.f();
                f0VarT.a(objF2, object2);
                unsafe.putObject(t10, jS, objF2);
                object2 = objF2;
            }
            f0VarT.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(T t10, T t11, int i10) {
        int iR = R(i10);
        if (E(t11, iR, i10)) {
            long jS = S(l0(i10));
            Unsafe unsafe = f39191s;
            Object object = unsafe.getObject(t11, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
            }
            f0 f0VarT = t(i10);
            if (!E(t10, iR, i10)) {
                if (C(object)) {
                    Object objF = f0VarT.f();
                    f0VarT.a(objF, object);
                    unsafe.putObject(t10, jS, objF);
                } else {
                    unsafe.putObject(t10, jS, object);
                }
                g0(t10, iR, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jS);
            if (!C(object2)) {
                Object objF2 = f0VarT.f();
                f0VarT.a(objF2, object2);
                unsafe.putObject(t10, jS, objF2);
                object2 = objF2;
            }
            f0VarT.a(object2, object);
        }
    }

    private void L(T t10, T t11, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        int iR = R(i10);
        switch (k0(iL0)) {
            case 0:
                if (x(t11, i10)) {
                    p0.N(t10, jS, p0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (x(t11, i10)) {
                    p0.O(t10, jS, p0.y(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (x(t11, i10)) {
                    p0.H(t10, jS, p0.r(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (x(t11, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 9:
                J(t10, t11, i10);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (x(t11, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 17:
                J(t10, t11, i10);
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
                this.f39205n.d(t10, t11, jS);
                break;
            case 50:
                h0.F(this.f39208q, t10, t11, jS);
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
                if (E(t11, iR, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    g0(t10, iR, i10);
                    break;
                }
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                K(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, iR, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    g0(t10, iR, i10);
                    break;
                }
                break;
            case 68:
                K(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object M(T t10, int i10) {
        f0 f0VarT = t(i10);
        long jS = S(l0(i10));
        if (!x(t10, i10)) {
            return f0VarT.f();
        }
        Object object = f39191s.getObject(t10, jS);
        if (C(object)) {
            return object;
        }
        Object objF = f0VarT.f();
        if (object != null) {
            f0VarT.a(objF, object);
        }
        return objF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object N(T t10, int i10, int i11) {
        f0 f0VarT = t(i11);
        if (!E(t10, i10, i11)) {
            return f0VarT.f();
        }
        Object object = f39191s.getObject(t10, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object objF = f0VarT.f();
        if (object != null) {
            f0VarT.a(objF, object);
        }
        return objF;
    }

    static <T> T<T> O(Class<T> cls, N n10, V v10, F f10, l0<?, ?> l0Var, AbstractC2955o<?> abstractC2955o, K k10) {
        return n10 instanceof d0 ? Q((d0) n10, v10, f10, l0Var, abstractC2955o, k10) : P((j0) n10, v10, f10, l0Var, abstractC2955o, k10);
    }

    static <T> T<T> P(j0 j0Var, V v10, F f10, l0<?, ?> l0Var, AbstractC2955o<?> abstractC2955o, K k10) {
        r[] rVarArrD = j0Var.d();
        if (rVarArrD.length != 0) {
            r rVar = rVarArrD[0];
            throw null;
        }
        int length = rVarArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (rVarArrD.length > 0) {
            r rVar2 = rVarArrD[0];
            throw null;
        }
        int[] iArrC = j0Var.c();
        if (iArrC == null) {
            iArrC = f39190r;
        }
        if (rVarArrD.length > 0) {
            r rVar3 = rVarArrD[0];
            throw null;
        }
        int[] iArr2 = f39190r;
        int[] iArr3 = f39190r;
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new T<>(iArr, objArr, 0, 0, j0Var.b(), j0Var.getSyntax(), true, iArr4, iArrC.length, iArrC.length + iArr2.length, v10, f10, l0Var, abstractC2955o, k10);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.protobuf.T<T> Q(com.google.protobuf.d0 r31, com.google.protobuf.V r32, com.google.protobuf.F r33, com.google.protobuf.l0<?, ?> r34, com.google.protobuf.AbstractC2955o<?> r35, com.google.protobuf.K r36) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.Q(com.google.protobuf.d0, com.google.protobuf.V, com.google.protobuf.F, com.google.protobuf.l0, com.google.protobuf.o, com.google.protobuf.K):com.google.protobuf.T");
    }

    private int R(int i10) {
        return this.f39192a[i10];
    }

    private static long S(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean T(T t10, long j10) {
        return ((Boolean) p0.C(t10, j10)).booleanValue();
    }

    private static <T> double U(T t10, long j10) {
        return ((Double) p0.C(t10, j10)).doubleValue();
    }

    private static <T> float V(T t10, long j10) {
        return ((Float) p0.C(t10, j10)).floatValue();
    }

    private static <T> int W(T t10, long j10) {
        return ((Integer) p0.C(t10, j10)).intValue();
    }

    private static <T> long X(T t10, long j10) {
        return ((Long) p0.C(t10, j10)).longValue();
    }

    private int Y(int i10) {
        if (i10 < this.f39194c || i10 > this.f39195d) {
            return -1;
        }
        return h0(i10, 0);
    }

    private int Z(int i10) {
        return this.f39192a[i10 + 2];
    }

    private <E> void a0(Object obj, long j10, e0 e0Var, f0<E> f0Var, C2954n c2954n) {
        e0Var.J(this.f39205n.e(obj, j10), f0Var, c2954n);
    }

    private <E> void b0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C2954n c2954n) {
        e0Var.M(this.f39205n.e(obj, S(i10)), f0Var, c2954n);
    }

    private void c0(Object obj, int i10, e0 e0Var) {
        if (w(i10)) {
            p0.R(obj, S(i10), e0Var.H());
        } else if (this.f39198g) {
            p0.R(obj, S(i10), e0Var.v());
        } else {
            p0.R(obj, S(i10), e0Var.z());
        }
    }

    private void d0(Object obj, int i10, e0 e0Var) {
        if (w(i10)) {
            e0Var.y(this.f39205n.e(obj, S(i10)));
        } else {
            e0Var.x(this.f39205n.e(obj, S(i10)));
        }
    }

    private static Field e0(Class<?> cls, String str) {
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

    private void f0(T t10, int i10) {
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        p0.P(t10, j10, (1 << (iZ >>> 20)) | p0.z(t10, j10));
    }

    private void g0(T t10, int i10, int i11) {
        p0.P(t10, Z(i11) & 1048575, i10);
    }

    private int h0(int i10, int i11) {
        int length = (this.f39192a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iR = R(i13);
            if (i10 == iR) {
                return i13;
            }
            if (i10 < iR) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void i0(T t10, int i10, Object obj) {
        f39191s.putObject(t10, S(l0(i10)), obj);
        f0(t10, i10);
    }

    private boolean j(T t10, T t11, int i10) {
        return x(t10, i10) == x(t11, i10);
    }

    private void j0(T t10, int i10, int i11, Object obj) {
        f39191s.putObject(t10, S(l0(i11)), obj);
        g0(t10, i10, i11);
    }

    private static <T> boolean k(T t10, long j10) {
        return p0.r(t10, j10);
    }

    private static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int l0(int i10) {
        return this.f39192a[i10 + 1];
    }

    private static <T> double m(T t10, long j10) {
        return p0.x(t10, j10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m0(T r22, com.google.protobuf.s0 r23) {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.m0(java.lang.Object, com.google.protobuf.s0):void");
    }

    private boolean n(T t10, T t11, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                if (j(t10, t11, i10) && Double.doubleToLongBits(p0.x(t10, jS)) == Double.doubleToLongBits(p0.x(t11, jS))) {
                    break;
                }
                break;
            case 1:
                if (j(t10, t11, i10) && Float.floatToIntBits(p0.y(t10, jS)) == Float.floatToIntBits(p0.y(t11, jS))) {
                    break;
                }
                break;
            case 2:
                if (j(t10, t11, i10) && p0.A(t10, jS) == p0.A(t11, jS)) {
                    break;
                }
                break;
            case 3:
                if (j(t10, t11, i10) && p0.A(t10, jS) == p0.A(t11, jS)) {
                    break;
                }
                break;
            case 4:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case 5:
                if (j(t10, t11, i10) && p0.A(t10, jS) == p0.A(t11, jS)) {
                    break;
                }
                break;
            case 6:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case 7:
                if (j(t10, t11, i10) && p0.r(t10, jS) == p0.r(t11, jS)) {
                    break;
                }
                break;
            case 8:
                if (j(t10, t11, i10) && h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                    break;
                }
                break;
            case 9:
                if (j(t10, t11, i10) && h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                    break;
                }
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (j(t10, t11, i10) && h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case 14:
                if (j(t10, t11, i10) && p0.A(t10, jS) == p0.A(t11, jS)) {
                    break;
                }
                break;
            case 15:
                if (j(t10, t11, i10) && p0.z(t10, jS) == p0.z(t11, jS)) {
                    break;
                }
                break;
            case 16:
                if (j(t10, t11, i10) && p0.A(t10, jS) == p0.A(t11, jS)) {
                    break;
                }
                break;
            case 17:
                if (j(t10, t11, i10) && h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
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
                if (D(t10, t11, i10) && h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n0(T r11, com.google.protobuf.s0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.n0(java.lang.Object, com.google.protobuf.s0):void");
    }

    private <UT, UB> UB o(Object obj, int i10, UB ub2, l0<UT, UB> l0Var, Object obj2) {
        C2964y.e eVarR;
        int iR = R(i10);
        Object objC = p0.C(obj, S(l0(i10)));
        return (objC == null || (eVarR = r(i10)) == null) ? ub2 : (UB) p(i10, iR, this.f39208q.d(objC), eVarR, ub2, l0Var, obj2);
    }

    private <K, V> void o0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.O(i10, this.f39208q.c(s(i11)), this.f39208q.h(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, C2964y.e eVar, UB ub2, l0<UT, UB> l0Var, Object obj) {
        I.a<?, ?> aVarC = this.f39208q.c(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.f(obj);
                }
                AbstractC2947g.h hVarY = AbstractC2947g.y(I.b(aVarC, next.getKey(), next.getValue()));
                try {
                    I.e(hVarY.b(), aVarC, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, hVarY.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void p0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.k(i10, (String) obj);
        } else {
            s0Var.N(i10, (AbstractC2947g) obj);
        }
    }

    private static <T> float q(T t10, long j10) {
        return p0.y(t10, j10);
    }

    private <UT, UB> void q0(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.t(l0Var.g(t10), s0Var);
    }

    private C2964y.e r(int i10) {
        return (C2964y.e) this.f39193b[((i10 / 3) * 2) + 1];
    }

    private Object s(int i10) {
        return this.f39193b[(i10 / 3) * 2];
    }

    private f0 t(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f39193b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarC = b0.a().c((Class) this.f39193b[i11 + 1]);
        this.f39193b[i11] = f0VarC;
        return f0VarC;
    }

    private <UT, UB> int u(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    private static <T> int v(T t10, long j10) {
        return p0.z(t10, j10);
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean x(T t10, int i10) {
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 != 1048575) {
            return (p0.z(t10, j10) & (1 << (iZ >>> 20))) != 0;
        }
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return Double.doubleToRawLongBits(p0.x(t10, jS)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.y(t10, jS)) != 0;
            case 2:
                return p0.A(t10, jS) != 0;
            case 3:
                return p0.A(t10, jS) != 0;
            case 4:
                return p0.z(t10, jS) != 0;
            case 5:
                return p0.A(t10, jS) != 0;
            case 6:
                return p0.z(t10, jS) != 0;
            case 7:
                return p0.r(t10, jS);
            case 8:
                Object objC = p0.C(t10, jS);
                if (objC instanceof String) {
                    return !((String) objC).isEmpty();
                }
                if (objC instanceof AbstractC2947g) {
                    return !AbstractC2947g.f39238C.equals(objC);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.C(t10, jS) != null;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !AbstractC2947g.f39238C.equals(p0.C(t10, jS));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return p0.z(t10, jS) != 0;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p0.z(t10, jS) != 0;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return p0.z(t10, jS) != 0;
            case 14:
                return p0.A(t10, jS) != 0;
            case 15:
                return p0.z(t10, jS) != 0;
            case 16:
                return p0.A(t10, jS) != 0;
            case 17:
                return p0.C(t10, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean y(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? x(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i10, f0 f0Var) {
        return f0Var.c(p0.C(obj, S(i10)));
    }

    @Override // com.google.protobuf.f0
    public void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f39192a.length; i10 += 3) {
            L(t10, t11, i10);
        }
        h0.G(this.f39206o, t10, t11);
        if (this.f39197f) {
            h0.E(this.f39207p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.google.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(T r8) {
        /*
            r7 = this;
            boolean r0 = C(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.protobuf.AbstractC2962w
            if (r0 == 0) goto L17
            r0 = r8
            com.google.protobuf.w r0 = (com.google.protobuf.AbstractC2962w) r0
            r0.z()
            r0.y()
            r0.Q()
        L17:
            int[] r0 = r7.f39192a
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L7f
            int r2 = r7.l0(r1)
            long r3 = S(r2)
            int r2 = k0(r2)
            r5 = 9
            if (r2 == r5) goto L69
            r5 = 60
            if (r2 == r5) goto L51
            r5 = 68
            if (r2 == r5) goto L51
            switch(r2) {
                case 17: goto L69;
                case 18: goto L4b;
                case 19: goto L4b;
                case 20: goto L4b;
                case 21: goto L4b;
                case 22: goto L4b;
                case 23: goto L4b;
                case 24: goto L4b;
                case 25: goto L4b;
                case 26: goto L4b;
                case 27: goto L4b;
                case 28: goto L4b;
                case 29: goto L4b;
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4b;
                case 33: goto L4b;
                case 34: goto L4b;
                case 35: goto L4b;
                case 36: goto L4b;
                case 37: goto L4b;
                case 38: goto L4b;
                case 39: goto L4b;
                case 40: goto L4b;
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                case 44: goto L4b;
                case 45: goto L4b;
                case 46: goto L4b;
                case 47: goto L4b;
                case 48: goto L4b;
                case 49: goto L4b;
                case 50: goto L39;
                default: goto L38;
            }
        L38:
            goto L7c
        L39:
            sun.misc.Unsafe r2 = com.google.protobuf.T.f39191s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7c
            com.google.protobuf.K r6 = r7.f39208q
            java.lang.Object r5 = r6.b(r5)
            r2.putObject(r8, r3, r5)
            goto L7c
        L4b:
            com.google.protobuf.F r2 = r7.f39205n
            r2.c(r8, r3)
            goto L7c
        L51:
            int r2 = r7.R(r1)
            boolean r2 = r7.E(r8, r2, r1)
            if (r2 == 0) goto L7c
            com.google.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.T.f39191s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
            goto L7c
        L69:
            boolean r2 = r7.x(r8, r1)
            if (r2 == 0) goto L7c
            com.google.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.T.f39191s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
        L7c:
            int r1 = r1 + 3
            goto L1b
        L7f:
            com.google.protobuf.l0<?, ?> r0 = r7.f39206o
            r0.j(r8)
            boolean r0 = r7.f39197f
            if (r0 == 0) goto L8d
            com.google.protobuf.o<?> r0 = r7.f39207p
            r0.f(r8)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.f39202k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f39201j
            r11 = r2[r10]
            int r12 = r6.R(r11)
            int r13 = r6.l0(r11)
            int[] r2 = r6.f39192a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.protobuf.T.f39191s
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = F(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = k0(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.B(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.E(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.protobuf.f0 r0 = r6.t(r11)
            boolean r0 = z(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.A(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.protobuf.f0 r0 = r6.t(r11)
            boolean r0 = z(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f39197f
            if (r0 == 0) goto Lc2
            com.google.protobuf.o<?> r0 = r6.f39207p
            com.google.protobuf.s r0 = r0.c(r7)
            boolean r0 = r0.p()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.c(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.f0
    public boolean d(T t10, T t11) {
        int length = this.f39192a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f39206o.g(t10).equals(this.f39206o.g(t11))) {
            return false;
        }
        if (this.f39197f) {
            return this.f39207p.c(t10).equals(this.f39207p.c(t11));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.f0
    public int e(T t10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iD;
        int iJ;
        boolean z10;
        int iF;
        int i14;
        int iT;
        int iV;
        Unsafe unsafe = f39191s;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f39192a.length) {
            int iL0 = l0(i18);
            int iK0 = k0(iL0);
            int iR = R(i18);
            int i20 = this.f39192a[i18 + 2];
            int i21 = i20 & i15;
            if (iK0 <= 17) {
                if (i21 != i16) {
                    i17 = i21 == i15 ? 0 : unsafe.getInt(t10, i21);
                    i16 = i21;
                }
                i10 = i16;
                i11 = i17;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i16;
                i11 = i17;
                i12 = 0;
            }
            long jS = S(iL0);
            if (iK0 < EnumC2959t.f39441p0.c() || iK0 > EnumC2959t.f39400C0.c()) {
                i21 = 0;
            }
            switch (iK0) {
                case 0:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.i(iR, 0.0d);
                        i19 += i13;
                        break;
                    }
                case 1:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.q(iR, 0.0f);
                        i19 += i13;
                        break;
                    }
                case 2:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.x(iR, unsafe.getLong(t10, jS));
                        i19 += i13;
                        break;
                    }
                case 3:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.W(iR, unsafe.getLong(t10, jS));
                        i19 += i13;
                        break;
                    }
                case 4:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.v(iR, unsafe.getInt(t10, jS));
                        i19 += i13;
                        break;
                    }
                case 5:
                    if (!y(t10, i18, i10, i11, i12)) {
                        break;
                    } else {
                        i13 = CodedOutputStream.o(iR, 0L);
                        i19 += i13;
                        break;
                    }
                case 6:
                    if (y(t10, i18, i10, i11, i12)) {
                        i13 = CodedOutputStream.m(iR, 0);
                        i19 += i13;
                        break;
                    }
                    break;
                case 7:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.d(iR, true);
                        i19 += iD;
                    }
                    break;
                case 8:
                    if (y(t10, i18, i10, i11, i12)) {
                        Object object = unsafe.getObject(t10, jS);
                        iD = object instanceof AbstractC2947g ? CodedOutputStream.g(iR, (AbstractC2947g) object) : CodedOutputStream.R(iR, (String) object);
                        i19 += iD;
                    }
                    break;
                case 9:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = h0.o(iR, unsafe.getObject(t10, jS), t(i18));
                        i19 += iD;
                    }
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.g(iR, (AbstractC2947g) unsafe.getObject(t10, jS));
                        i19 += iD;
                    }
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.U(iR, unsafe.getInt(t10, jS));
                        i19 += iD;
                    }
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.k(iR, unsafe.getInt(t10, jS));
                        i19 += iD;
                    }
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (y(t10, i18, i10, i11, i12)) {
                        iJ = CodedOutputStream.J(iR, 0);
                        i19 += iJ;
                    }
                    break;
                case 14:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.L(iR, 0L);
                        i19 += iD;
                    }
                    break;
                case 15:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.N(iR, unsafe.getInt(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 16:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.P(iR, unsafe.getLong(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 17:
                    if (y(t10, i18, i10, i11, i12)) {
                        iD = CodedOutputStream.s(iR, (P) unsafe.getObject(t10, jS), t(i18));
                        i19 += iD;
                    }
                    break;
                case 18:
                    iD = h0.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iD;
                    break;
                case 19:
                    z10 = false;
                    iF = h0.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = h0.m(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = h0.x(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = h0.k(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = h0.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = h0.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = h0.a(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 26:
                    iD = h0.u(iR, (List) unsafe.getObject(t10, jS));
                    i19 += iD;
                    break;
                case 27:
                    iD = h0.p(iR, (List) unsafe.getObject(t10, jS), t(i18));
                    i19 += iD;
                    break;
                case 28:
                    iD = h0.c(iR, (List) unsafe.getObject(t10, jS));
                    i19 += iD;
                    break;
                case 29:
                    iD = h0.v(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iD;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    z10 = false;
                    iF = h0.d(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = h0.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = h0.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = h0.q(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = h0.s(iR, (List) unsafe.getObject(t10, jS), false);
                    i19 += iF;
                    break;
                case 35:
                    i14 = h0.i((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 36:
                    i14 = h0.g((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 37:
                    i14 = h0.n((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 38:
                    i14 = h0.y((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 39:
                    i14 = h0.l((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 40:
                    i14 = h0.i((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 41:
                    i14 = h0.g((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 42:
                    i14 = h0.b((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 43:
                    i14 = h0.w((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 44:
                    i14 = h0.e((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 45:
                    i14 = h0.g((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 46:
                    i14 = h0.i((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 47:
                    i14 = h0.r((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 48:
                    i14 = h0.t((List) unsafe.getObject(t10, jS));
                    if (i14 > 0) {
                        if (this.f39200i) {
                            unsafe.putInt(t10, i21, i14);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i14);
                        iJ = iT + iV + i14;
                        i19 += iJ;
                    }
                    break;
                case 49:
                    iD = h0.j(iR, (List) unsafe.getObject(t10, jS), t(i18));
                    i19 += iD;
                    break;
                case 50:
                    iD = this.f39208q.f(iR, unsafe.getObject(t10, jS), s(i18));
                    i19 += iD;
                    break;
                case 51:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.i(iR, 0.0d);
                        i19 += iD;
                    }
                    break;
                case 52:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.q(iR, 0.0f);
                        i19 += iD;
                    }
                    break;
                case 53:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.x(iR, X(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 54:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.W(iR, X(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 55:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.v(iR, W(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 56:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.o(iR, 0L);
                        i19 += iD;
                    }
                    break;
                case 57:
                    if (E(t10, iR, i18)) {
                        iJ = CodedOutputStream.m(iR, 0);
                        i19 += iJ;
                    }
                    break;
                case 58:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.d(iR, true);
                        i19 += iD;
                    }
                    break;
                case 59:
                    if (E(t10, iR, i18)) {
                        Object object2 = unsafe.getObject(t10, jS);
                        iD = object2 instanceof AbstractC2947g ? CodedOutputStream.g(iR, (AbstractC2947g) object2) : CodedOutputStream.R(iR, (String) object2);
                        i19 += iD;
                    }
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (E(t10, iR, i18)) {
                        iD = h0.o(iR, unsafe.getObject(t10, jS), t(i18));
                        i19 += iD;
                    }
                    break;
                case 61:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.g(iR, (AbstractC2947g) unsafe.getObject(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 62:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.U(iR, W(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 63:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.k(iR, W(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 64:
                    if (E(t10, iR, i18)) {
                        iJ = CodedOutputStream.J(iR, 0);
                        i19 += iJ;
                    }
                    break;
                case 65:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.L(iR, 0L);
                        i19 += iD;
                    }
                    break;
                case 66:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.N(iR, W(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 67:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.P(iR, X(t10, jS));
                        i19 += iD;
                    }
                    break;
                case 68:
                    if (E(t10, iR, i18)) {
                        iD = CodedOutputStream.s(iR, (P) unsafe.getObject(t10, jS), t(i18));
                        i19 += iD;
                    }
                    break;
            }
            i18 += 3;
            i16 = i10;
            i17 = i11;
            i15 = 1048575;
        }
        int iU = i19 + u(this.f39206o, t10);
        return this.f39197f ? iU + this.f39207p.c(t10).l() : iU;
    }

    @Override // com.google.protobuf.f0
    public T f() {
        return (T) this.f39204m.a(this.f39196e);
    }

    @Override // com.google.protobuf.f0
    public int g(T t10) {
        int i10;
        int iF;
        int length = this.f39192a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL0 = l0(i12);
            int iR = R(i12);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C2964y.f(Double.doubleToLongBits(p0.x(t10, jS)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(p0.y(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C2964y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C2964y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C2964y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C2964y.c(p0.r(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) p0.C(t10, jS)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = p0.C(t10, jS);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C2964y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C2964y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = p0.C(t10, jS);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
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
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(Double.doubleToLongBits(U(t10, jS)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(V(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.c(T(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) p0.C(t10, jS)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C2964y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f39206o.g(t10).hashCode();
        return this.f39197f ? (iHashCode2 * 53) + this.f39207p.c(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.f0
    public void h(T t10, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            n0(t10, s0Var);
        } else {
            m0(t10, s0Var);
        }
    }

    @Override // com.google.protobuf.f0
    public void i(T t10, e0 e0Var, C2954n c2954n) throws Throwable {
        c2954n.getClass();
        l(t10);
        H(this.f39206o, this.f39207p, t10, e0Var, c2954n);
    }
}
