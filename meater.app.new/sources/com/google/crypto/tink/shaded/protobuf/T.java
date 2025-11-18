package com.google.crypto.tink.shaded.protobuf;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2895e;
import com.google.crypto.tink.shaded.protobuf.C2915z;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.s0;
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
    private static final int[] f37749r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f37750s = p0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f37751a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f37752b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37753c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37754d;

    /* renamed from: e, reason: collision with root package name */
    private final P f37755e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f37756f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f37757g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f37758h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f37759i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f37760j;

    /* renamed from: k, reason: collision with root package name */
    private final int f37761k;

    /* renamed from: l, reason: collision with root package name */
    private final int f37762l;

    /* renamed from: m, reason: collision with root package name */
    private final V f37763m;

    /* renamed from: n, reason: collision with root package name */
    private final F f37764n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f37765o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC2906p<?> f37766p;

    /* renamed from: q, reason: collision with root package name */
    private final K f37767q;

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, V v10, F f10, l0<?, ?> l0Var, AbstractC2906p<?> abstractC2906p, K k10) {
        this.f37751a = iArr;
        this.f37752b = objArr;
        this.f37753c = i10;
        this.f37754d = i11;
        this.f37757g = p10 instanceof AbstractC2913x;
        this.f37758h = z10;
        this.f37756f = abstractC2906p != null && abstractC2906p.e(p10);
        this.f37759i = z11;
        this.f37760j = iArr2;
        this.f37761k = i12;
        this.f37762l = i13;
        this.f37763m = v10;
        this.f37764n = f10;
        this.f37765o = l0Var;
        this.f37766p = abstractC2906p;
        this.f37755e = p10;
        this.f37767q = k10;
    }

    private static <T> int A(T t10, long j10) {
        return p0.z(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0(T r11, com.google.crypto.tink.shaded.protobuf.s0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.A0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s0):void");
    }

    private static boolean B(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <K, V> void B0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f37767q.c(u(i11));
            s0Var.K(i10, null, this.f37767q.h(obj));
        }
    }

    private boolean C(T t10, int i10) {
        int iL0 = l0(i10);
        long j10 = 1048575 & iL0;
        if (j10 != 1048575) {
            return (p0.z(t10, j10) & (1 << (iL0 >>> 20))) != 0;
        }
        int iX0 = x0(i10);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return Double.doubleToRawLongBits(p0.x(t10, jY)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.y(t10, jY)) != 0;
            case 2:
                return p0.A(t10, jY) != 0;
            case 3:
                return p0.A(t10, jY) != 0;
            case 4:
                return p0.z(t10, jY) != 0;
            case 5:
                return p0.A(t10, jY) != 0;
            case 6:
                return p0.z(t10, jY) != 0;
            case 7:
                return p0.r(t10, jY);
            case 8:
                Object objC = p0.C(t10, jY);
                if (objC instanceof String) {
                    return !((String) objC).isEmpty();
                }
                if (objC instanceof AbstractC2898h) {
                    return !AbstractC2898h.f37801C.equals(objC);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.C(t10, jY) != null;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !AbstractC2898h.f37801C.equals(p0.C(t10, jY));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return p0.z(t10, jY) != 0;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p0.z(t10, jY) != 0;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return p0.z(t10, jY) != 0;
            case 14:
                return p0.A(t10, jY) != 0;
            case 15:
                return p0.z(t10, jY) != 0;
            case 16:
                return p0.A(t10, jY) != 0;
            case 17:
                return p0.C(t10, jY) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void C0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.k(i10, (String) obj);
        } else {
            s0Var.O(i10, (AbstractC2898h) obj);
        }
    }

    private boolean D(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(t10, i10) : (i12 & i13) != 0;
    }

    private <UT, UB> void D0(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.t(l0Var.g(t10), s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object obj, int i10, f0 f0Var) {
        return f0Var.c(p0.C(obj, Y(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean F(Object obj, int i10, int i11) {
        List list = (List) p0.C(obj, Y(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarV = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarV.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t10, int i10, int i11) {
        if (this.f37767q.h(p0.C(t10, Y(i10))).isEmpty()) {
            return true;
        }
        this.f37767q.c(u(i11));
        throw null;
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2913x) {
            return ((AbstractC2913x) obj).H();
        }
        return true;
    }

    private boolean I(T t10, T t11, int i10) {
        long jL0 = l0(i10) & 1048575;
        return p0.z(t10, jL0) == p0.z(t11, jL0);
    }

    private boolean J(T t10, int i10, int i11) {
        return p0.z(t10, (long) (l0(i11) & 1048575)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j10) {
        return (List) p0.C(obj, j10);
    }

    private static <T> long M(T t10, long j10) {
        return p0.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        r0 = r18.f37761k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r0 >= r18.f37762l) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r4 = q(r21, r18.f37760j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r4 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        r7.o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #9 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:213:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b5 A[LOOP:4: B:198:0x06b1->B:200:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C2909t.b<ET>> void N(com.google.crypto.tink.shaded.protobuf.l0<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.AbstractC2906p<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.e0 r22, com.google.crypto.tink.shaded.protobuf.C2905o r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.N(com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.p, java.lang.Object, com.google.crypto.tink.shaded.protobuf.e0, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    private final <K, V> void O(Object obj, int i10, Object obj2, C2905o c2905o, e0 e0Var) {
        long jY = Y(x0(i10));
        Object objC = p0.C(obj, jY);
        if (objC == null) {
            objC = this.f37767q.e(obj2);
            p0.R(obj, jY, objC);
        } else if (this.f37767q.g(objC)) {
            Object objE = this.f37767q.e(obj2);
            this.f37767q.a(objE, objC);
            p0.R(obj, jY, objE);
            objC = objE;
        }
        Map<?, ?> mapD = this.f37767q.d(objC);
        this.f37767q.c(obj2);
        e0Var.O(mapD, null, c2905o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(T t10, T t11, int i10) {
        if (C(t11, i10)) {
            long jY = Y(x0(i10));
            Unsafe unsafe = f37750s;
            Object object = unsafe.getObject(t11, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
            }
            f0 f0VarV = v(i10);
            if (!C(t10, i10)) {
                if (H(object)) {
                    Object objF = f0VarV.f();
                    f0VarV.a(objF, object);
                    unsafe.putObject(t10, jY, objF);
                } else {
                    unsafe.putObject(t10, jY, object);
                }
                r0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jY);
            if (!H(object2)) {
                Object objF2 = f0VarV.f();
                f0VarV.a(objF2, object2);
                unsafe.putObject(t10, jY, objF2);
                object2 = objF2;
            }
            f0VarV.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T t10, T t11, int i10) {
        int iX = X(i10);
        if (J(t11, iX, i10)) {
            long jY = Y(x0(i10));
            Unsafe unsafe = f37750s;
            Object object = unsafe.getObject(t11, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
            }
            f0 f0VarV = v(i10);
            if (!J(t10, iX, i10)) {
                if (H(object)) {
                    Object objF = f0VarV.f();
                    f0VarV.a(objF, object);
                    unsafe.putObject(t10, jY, objF);
                } else {
                    unsafe.putObject(t10, jY, object);
                }
                s0(t10, iX, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jY);
            if (!H(object2)) {
                Object objF2 = f0VarV.f();
                f0VarV.a(objF2, object2);
                unsafe.putObject(t10, jY, objF2);
                object2 = objF2;
            }
            f0VarV.a(object2, object);
        }
    }

    private void R(T t10, T t11, int i10) {
        int iX0 = x0(i10);
        long jY = Y(iX0);
        int iX = X(i10);
        switch (w0(iX0)) {
            case 0:
                if (C(t11, i10)) {
                    p0.N(t10, jY, p0.x(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (C(t11, i10)) {
                    p0.O(t10, jY, p0.y(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (C(t11, i10)) {
                    p0.Q(t10, jY, p0.A(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (C(t11, i10)) {
                    p0.Q(t10, jY, p0.A(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (C(t11, i10)) {
                    p0.Q(t10, jY, p0.A(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (C(t11, i10)) {
                    p0.H(t10, jY, p0.r(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (C(t11, i10)) {
                    p0.R(t10, jY, p0.C(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 9:
                P(t10, t11, i10);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (C(t11, i10)) {
                    p0.R(t10, jY, p0.C(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (C(t11, i10)) {
                    p0.Q(t10, jY, p0.A(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (C(t11, i10)) {
                    p0.P(t10, jY, p0.z(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (C(t11, i10)) {
                    p0.Q(t10, jY, p0.A(t11, jY));
                    r0(t10, i10);
                    break;
                }
                break;
            case 17:
                P(t10, t11, i10);
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
                this.f37764n.d(t10, t11, jY);
                break;
            case 50:
                h0.F(this.f37767q, t10, t11, jY);
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
                if (J(t11, iX, i10)) {
                    p0.R(t10, jY, p0.C(t11, jY));
                    s0(t10, iX, i10);
                    break;
                }
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                Q(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t11, iX, i10)) {
                    p0.R(t10, jY, p0.C(t11, jY));
                    s0(t10, iX, i10);
                    break;
                }
                break;
            case 68:
                Q(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object S(T t10, int i10) {
        f0 f0VarV = v(i10);
        long jY = Y(x0(i10));
        if (!C(t10, i10)) {
            return f0VarV.f();
        }
        Object object = f37750s.getObject(t10, jY);
        if (H(object)) {
            return object;
        }
        Object objF = f0VarV.f();
        if (object != null) {
            f0VarV.a(objF, object);
        }
        return objF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T t10, int i10, int i11) {
        f0 f0VarV = v(i11);
        if (!J(t10, i10, i11)) {
            return f0VarV.f();
        }
        Object object = f37750s.getObject(t10, Y(x0(i11)));
        if (H(object)) {
            return object;
        }
        Object objF = f0VarV.f();
        if (object != null) {
            f0VarV.a(objF, object);
        }
        return objF;
    }

    static <T> T<T> U(Class<T> cls, N n10, V v10, F f10, l0<?, ?> l0Var, AbstractC2906p<?> abstractC2906p, K k10) {
        return n10 instanceof d0 ? W((d0) n10, v10, f10, l0Var, abstractC2906p, k10) : V((j0) n10, v10, f10, l0Var, abstractC2906p, k10);
    }

    static <T> T<T> V(j0 j0Var, V v10, F f10, l0<?, ?> l0Var, AbstractC2906p<?> abstractC2906p, K k10) {
        boolean z10 = j0Var.getSyntax() == a0.PROTO3;
        C2908s[] c2908sArrD = j0Var.d();
        if (c2908sArrD.length != 0) {
            C2908s c2908s = c2908sArrD[0];
            throw null;
        }
        int length = c2908sArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c2908sArrD.length > 0) {
            C2908s c2908s2 = c2908sArrD[0];
            throw null;
        }
        int[] iArrC = j0Var.c();
        if (iArrC == null) {
            iArrC = f37749r;
        }
        if (c2908sArrD.length > 0) {
            C2908s c2908s3 = c2908sArrD[0];
            throw null;
        }
        int[] iArr2 = f37749r;
        int[] iArr3 = f37749r;
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new T<>(iArr, objArr, 0, 0, j0Var.b(), z10, true, iArr4, iArrC.length, iArrC.length + iArr2.length, v10, f10, l0Var, abstractC2906p, k10);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.crypto.tink.shaded.protobuf.T<T> W(com.google.crypto.tink.shaded.protobuf.d0 r33, com.google.crypto.tink.shaded.protobuf.V r34, com.google.crypto.tink.shaded.protobuf.F r35, com.google.crypto.tink.shaded.protobuf.l0<?, ?> r36, com.google.crypto.tink.shaded.protobuf.AbstractC2906p<?> r37, com.google.crypto.tink.shaded.protobuf.K r38) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.W(com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.V, com.google.crypto.tink.shaded.protobuf.F, com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.p, com.google.crypto.tink.shaded.protobuf.K):com.google.crypto.tink.shaded.protobuf.T");
    }

    private int X(int i10) {
        return this.f37751a[i10];
    }

    private static long Y(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean Z(T t10, long j10) {
        return ((Boolean) p0.C(t10, j10)).booleanValue();
    }

    private static <T> double a0(T t10, long j10) {
        return ((Double) p0.C(t10, j10)).doubleValue();
    }

    private static <T> float b0(T t10, long j10) {
        return ((Float) p0.C(t10, j10)).floatValue();
    }

    private static <T> int c0(T t10, long j10) {
        return ((Integer) p0.C(t10, j10)).intValue();
    }

    private static <T> long d0(T t10, long j10) {
        return ((Long) p0.C(t10, j10)).longValue();
    }

    private <K, V> int e0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C2895e.b bVar) {
        Unsafe unsafe = f37750s;
        Object objU = u(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f37767q.g(object)) {
            Object objE = this.f37767q.e(objU);
            this.f37767q.a(objE, object);
            unsafe.putObject(t10, j10, objE);
            object = objE;
        }
        this.f37767q.c(objU);
        return n(bArr, i10, i11, null, this.f37767q.d(object), bVar);
    }

    private int f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2895e.b bVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f37750s;
        long j11 = this.f37751a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(C2895e.d(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(C2895e.l(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int iL = C2895e.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Long.valueOf(bVar.f37795b));
                    unsafe.putInt(t10, j11, i13);
                    return iL;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int I10 = C2895e.I(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(bVar.f37794a));
                    unsafe.putInt(t10, j11, i13);
                    return I10;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(C2895e.j(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(C2895e.h(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int iL2 = C2895e.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f37795b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return iL2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int I11 = C2895e.I(bArr, i10, bVar);
                    int i22 = bVar.f37794a;
                    if (i22 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !q0.n(bArr, I11, I11 + i22)) {
                            throw InvalidProtocolBufferException.d();
                        }
                        unsafe.putObject(t10, j10, new String(bArr, I11, i22, C2915z.f38061b));
                        I11 += i22;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return I11;
                }
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                if (i14 == 2) {
                    Object objT = T(t10, i13, i17);
                    int iO = C2895e.O(objT, v(i17), bArr, i10, i11, bVar);
                    v0(t10, i13, i17, objT);
                    return iO;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int iB = C2895e.b(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, bVar.f37796c);
                    unsafe.putInt(t10, j11, i13);
                    return iB;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int I12 = C2895e.I(bArr, i10, bVar);
                    int i23 = bVar.f37794a;
                    C2915z.e eVarT = t(i17);
                    if (eVarT == null || eVarT.a(i23)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i23));
                        unsafe.putInt(t10, j11, i13);
                    } else {
                        w(t10).n(i12, Long.valueOf(i23));
                    }
                    return I12;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int I13 = C2895e.I(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(AbstractC2899i.b(bVar.f37794a)));
                    unsafe.putInt(t10, j11, i13);
                    return I13;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int iL3 = C2895e.L(bArr, i10, bVar);
                    unsafe.putObject(t10, j10, Long.valueOf(AbstractC2899i.c(bVar.f37795b)));
                    unsafe.putInt(t10, j11, i13);
                    return iL3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object objT2 = T(t10, i13, i17);
                    int iN = C2895e.N(objT2, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    v0(t10, i13, i17, objT2);
                    return iN;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0307, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h0(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.C2895e.b r34) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.h0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int i0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2895e.b bVar) throws InvalidProtocolBufferException {
        int iJ;
        Unsafe unsafe = f37750s;
        C2915z.i iVarK = (C2915z.i) unsafe.getObject(t10, j11);
        if (!iVarK.q()) {
            int size = iVarK.size();
            iVarK = iVarK.k(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVarK);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return C2895e.s(bArr, i10, iVarK, bVar);
                }
                if (i14 == 1) {
                    return C2895e.e(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return C2895e.v(bArr, i10, iVarK, bVar);
                }
                if (i14 == 5) {
                    return C2895e.m(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return C2895e.z(bArr, i10, iVarK, bVar);
                }
                if (i14 == 0) {
                    return C2895e.M(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C2895e.y(bArr, i10, iVarK, bVar);
                }
                if (i14 == 0) {
                    return C2895e.J(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return C2895e.u(bArr, i10, iVarK, bVar);
                }
                if (i14 == 1) {
                    return C2895e.k(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return C2895e.t(bArr, i10, iVarK, bVar);
                }
                if (i14 == 5) {
                    return C2895e.i(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return C2895e.r(bArr, i10, iVarK, bVar);
                }
                if (i14 == 0) {
                    return C2895e.a(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? C2895e.D(i12, bArr, i10, i11, iVarK, bVar) : C2895e.E(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return C2895e.q(v(i15), i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return C2895e.c(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 44:
                if (i14 == 2) {
                    iJ = C2895e.y(bArr, i10, iVarK, bVar);
                } else if (i14 == 0) {
                    iJ = C2895e.J(i12, bArr, i10, i11, iVarK, bVar);
                }
                h0.A(t10, i13, iVarK, t(i15), null, this.f37765o);
                return iJ;
            case 33:
            case 47:
                if (i14 == 2) {
                    return C2895e.w(bArr, i10, iVarK, bVar);
                }
                if (i14 == 0) {
                    return C2895e.A(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return C2895e.x(bArr, i10, iVarK, bVar);
                }
                if (i14 == 0) {
                    return C2895e.B(i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return C2895e.o(v(i15), i12, bArr, i10, i11, iVarK, bVar);
                }
                break;
        }
        return i10;
    }

    private int j0(int i10) {
        if (i10 < this.f37753c || i10 > this.f37754d) {
            return -1;
        }
        return t0(i10, 0);
    }

    private boolean k(T t10, T t11, int i10) {
        return C(t10, i10) == C(t11, i10);
    }

    private int k0(int i10, int i11) {
        if (i10 < this.f37753c || i10 > this.f37754d) {
            return -1;
        }
        return t0(i10, i11);
    }

    private static <T> boolean l(T t10, long j10) {
        return p0.r(t10, j10);
    }

    private int l0(int i10) {
        return this.f37751a[i10 + 2];
    }

    private static void m(Object obj) {
        if (H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private <E> void m0(Object obj, long j10, e0 e0Var, f0<E> f0Var, C2905o c2905o) {
        e0Var.P(this.f37764n.e(obj, j10), f0Var, c2905o);
    }

    private <K, V> int n(byte[] bArr, int i10, int i11, I.a<K, V> aVar, Map<K, V> map, C2895e.b bVar) throws InvalidProtocolBufferException {
        int I10 = C2895e.I(bArr, i10, bVar);
        int i12 = bVar.f37794a;
        if (i12 < 0 || i12 > i11 - I10) {
            throw InvalidProtocolBufferException.m();
        }
        throw null;
    }

    private <E> void n0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C2905o c2905o) {
        e0Var.K(this.f37764n.e(obj, Y(i10)), f0Var, c2905o);
    }

    private static <T> double o(T t10, long j10) {
        return p0.x(t10, j10);
    }

    private void o0(Object obj, int i10, e0 e0Var) {
        if (B(i10)) {
            p0.R(obj, Y(i10), e0Var.H());
        } else if (this.f37757g) {
            p0.R(obj, Y(i10), e0Var.v());
        } else {
            p0.R(obj, Y(i10), e0Var.z());
        }
    }

    private boolean p(T t10, T t11, int i10) {
        int iX0 = x0(i10);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                if (k(t10, t11, i10) && Double.doubleToLongBits(p0.x(t10, jY)) == Double.doubleToLongBits(p0.x(t11, jY))) {
                    break;
                }
                break;
            case 1:
                if (k(t10, t11, i10) && Float.floatToIntBits(p0.y(t10, jY)) == Float.floatToIntBits(p0.y(t11, jY))) {
                    break;
                }
                break;
            case 2:
                if (k(t10, t11, i10) && p0.A(t10, jY) == p0.A(t11, jY)) {
                    break;
                }
                break;
            case 3:
                if (k(t10, t11, i10) && p0.A(t10, jY) == p0.A(t11, jY)) {
                    break;
                }
                break;
            case 4:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case 5:
                if (k(t10, t11, i10) && p0.A(t10, jY) == p0.A(t11, jY)) {
                    break;
                }
                break;
            case 6:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case 7:
                if (k(t10, t11, i10) && p0.r(t10, jY) == p0.r(t11, jY)) {
                    break;
                }
                break;
            case 8:
                if (k(t10, t11, i10) && h0.K(p0.C(t10, jY), p0.C(t11, jY))) {
                    break;
                }
                break;
            case 9:
                if (k(t10, t11, i10) && h0.K(p0.C(t10, jY), p0.C(t11, jY))) {
                    break;
                }
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (k(t10, t11, i10) && h0.K(p0.C(t10, jY), p0.C(t11, jY))) {
                    break;
                }
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case 14:
                if (k(t10, t11, i10) && p0.A(t10, jY) == p0.A(t11, jY)) {
                    break;
                }
                break;
            case 15:
                if (k(t10, t11, i10) && p0.z(t10, jY) == p0.z(t11, jY)) {
                    break;
                }
                break;
            case 16:
                if (k(t10, t11, i10) && p0.A(t10, jY) == p0.A(t11, jY)) {
                    break;
                }
                break;
            case 17:
                if (k(t10, t11, i10) && h0.K(p0.C(t10, jY), p0.C(t11, jY))) {
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
                if (I(t10, t11, i10) && h0.K(p0.C(t10, jY), p0.C(t11, jY))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void p0(Object obj, int i10, e0 e0Var) {
        if (B(i10)) {
            e0Var.y(this.f37764n.e(obj, Y(i10)));
        } else {
            e0Var.x(this.f37764n.e(obj, Y(i10)));
        }
    }

    private <UT, UB> UB q(Object obj, int i10, UB ub2, l0<UT, UB> l0Var, Object obj2) {
        C2915z.e eVarT;
        int iX = X(i10);
        Object objC = p0.C(obj, Y(x0(i10)));
        return (objC == null || (eVarT = t(i10)) == null) ? ub2 : (UB) r(i10, iX, this.f37767q.d(objC), eVarT, ub2, l0Var, obj2);
    }

    private static Field q0(Class<?> cls, String str) {
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

    private <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, C2915z.e eVar, UB ub2, l0<UT, UB> l0Var, Object obj) {
        this.f37767q.c(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.f(obj);
                }
                AbstractC2898h.C0486h c0486hA = AbstractC2898h.A(I.b(null, next.getKey(), next.getValue()));
                try {
                    I.d(c0486hA.b(), null, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, c0486hA.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void r0(T t10, int i10) {
        int iL0 = l0(i10);
        long j10 = 1048575 & iL0;
        if (j10 == 1048575) {
            return;
        }
        p0.P(t10, j10, (1 << (iL0 >>> 20)) | p0.z(t10, j10));
    }

    private static <T> float s(T t10, long j10) {
        return p0.y(t10, j10);
    }

    private void s0(T t10, int i10, int i11) {
        p0.P(t10, l0(i11) & 1048575, i10);
    }

    private C2915z.e t(int i10) {
        return (C2915z.e) this.f37752b[((i10 / 3) * 2) + 1];
    }

    private int t0(int i10, int i11) {
        int length = (this.f37751a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iX = X(i13);
            if (i10 == iX) {
                return i13;
            }
            if (i10 < iX) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object u(int i10) {
        return this.f37752b[(i10 / 3) * 2];
    }

    private void u0(T t10, int i10, Object obj) {
        f37750s.putObject(t10, Y(x0(i10)), obj);
        r0(t10, i10);
    }

    private f0 v(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f37752b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarC = b0.a().c((Class) this.f37752b[i11 + 1]);
        this.f37752b[i11] = f0VarC;
        return f0VarC;
    }

    private void v0(T t10, int i10, int i11, Object obj) {
        f37750s.putObject(t10, Y(x0(i11)), obj);
        s0(t10, i10, i11);
    }

    static m0 w(Object obj) {
        AbstractC2913x abstractC2913x = (AbstractC2913x) obj;
        m0 m0Var = abstractC2913x.unknownFields;
        if (m0Var != m0.c()) {
            return m0Var;
        }
        m0 m0VarK = m0.k();
        abstractC2913x.unknownFields = m0VarK;
        return m0VarK;
    }

    private static int w0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int x(T t10) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iJ;
        boolean z10;
        int iF;
        int i13;
        int iT;
        int iV;
        Unsafe unsafe = f37750s;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.f37751a.length) {
            int iX0 = x0(i16);
            int iX = X(i16);
            int iW0 = w0(iX0);
            if (iW0 <= 17) {
                i10 = this.f37751a[i16 + 2];
                int i19 = i10 & i14;
                i11 = 1 << (i10 >>> 20);
                if (i19 != i15) {
                    i18 = unsafe.getInt(t10, i19);
                    i15 = i19;
                }
            } else {
                i10 = (!this.f37759i || iW0 < EnumC2910u.f38011p0.c() || iW0 > EnumC2910u.f37970C0.c()) ? 0 : this.f37751a[i16 + 2] & i14;
                i11 = 0;
            }
            long jY = Y(iX0);
            switch (iW0) {
                case 0:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.i(iX, 0.0d);
                        i17 += i12;
                        break;
                    }
                case 1:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.q(iX, 0.0f);
                        i17 += i12;
                        break;
                    }
                case 2:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.x(iX, unsafe.getLong(t10, jY));
                        i17 += i12;
                        break;
                    }
                case 3:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.W(iX, unsafe.getLong(t10, jY));
                        i17 += i12;
                        break;
                    }
                case 4:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.v(iX, unsafe.getInt(t10, jY));
                        i17 += i12;
                        break;
                    }
                case 5:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.o(iX, 0L);
                        i17 += i12;
                        break;
                    }
                case 6:
                    if ((i18 & i11) != 0) {
                        i12 = CodedOutputStream.m(iX, 0);
                        i17 += i12;
                        break;
                    }
                    break;
                case 7:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.d(iX, true);
                        i17 += iD;
                    }
                    break;
                case 8:
                    if ((i18 & i11) != 0) {
                        Object object = unsafe.getObject(t10, jY);
                        iD = object instanceof AbstractC2898h ? CodedOutputStream.g(iX, (AbstractC2898h) object) : CodedOutputStream.R(iX, (String) object);
                        i17 += iD;
                    }
                    break;
                case 9:
                    if ((i18 & i11) != 0) {
                        iD = h0.o(iX, unsafe.getObject(t10, jY), v(i16));
                        i17 += iD;
                    }
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.g(iX, (AbstractC2898h) unsafe.getObject(t10, jY));
                        i17 += iD;
                    }
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.U(iX, unsafe.getInt(t10, jY));
                        i17 += iD;
                    }
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.k(iX, unsafe.getInt(t10, jY));
                        i17 += iD;
                    }
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if ((i18 & i11) != 0) {
                        iJ = CodedOutputStream.J(iX, 0);
                        i17 += iJ;
                    }
                    break;
                case 14:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.L(iX, 0L);
                        i17 += iD;
                    }
                    break;
                case 15:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.N(iX, unsafe.getInt(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 16:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.P(iX, unsafe.getLong(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 17:
                    if ((i18 & i11) != 0) {
                        iD = CodedOutputStream.s(iX, (P) unsafe.getObject(t10, jY), v(i16));
                        i17 += iD;
                    }
                    break;
                case 18:
                    iD = h0.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iD;
                    break;
                case 19:
                    z10 = false;
                    iF = h0.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = h0.m(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = h0.x(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = h0.k(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = h0.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = h0.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = h0.a(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 26:
                    iD = h0.u(iX, (List) unsafe.getObject(t10, jY));
                    i17 += iD;
                    break;
                case 27:
                    iD = h0.p(iX, (List) unsafe.getObject(t10, jY), v(i16));
                    i17 += iD;
                    break;
                case 28:
                    iD = h0.c(iX, (List) unsafe.getObject(t10, jY));
                    i17 += iD;
                    break;
                case 29:
                    iD = h0.v(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iD;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    z10 = false;
                    iF = h0.d(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = h0.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = h0.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = h0.q(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = h0.s(iX, (List) unsafe.getObject(t10, jY), false);
                    i17 += iF;
                    break;
                case 35:
                    i13 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 36:
                    i13 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 37:
                    i13 = h0.n((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 38:
                    i13 = h0.y((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 39:
                    i13 = h0.l((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 40:
                    i13 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 41:
                    i13 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 42:
                    i13 = h0.b((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 43:
                    i13 = h0.w((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 44:
                    i13 = h0.e((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 45:
                    i13 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 46:
                    i13 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 47:
                    i13 = h0.r((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 48:
                    i13 = h0.t((List) unsafe.getObject(t10, jY));
                    if (i13 > 0) {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i13);
                        iJ = iT + iV + i13;
                        i17 += iJ;
                    }
                    break;
                case 49:
                    iD = h0.j(iX, (List) unsafe.getObject(t10, jY), v(i16));
                    i17 += iD;
                    break;
                case 50:
                    iD = this.f37767q.f(iX, unsafe.getObject(t10, jY), u(i16));
                    i17 += iD;
                    break;
                case 51:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.i(iX, 0.0d);
                        i17 += iD;
                    }
                    break;
                case 52:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.q(iX, 0.0f);
                        i17 += iD;
                    }
                    break;
                case 53:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.x(iX, d0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 54:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.W(iX, d0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 55:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.v(iX, c0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 56:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.o(iX, 0L);
                        i17 += iD;
                    }
                    break;
                case 57:
                    if (J(t10, iX, i16)) {
                        iJ = CodedOutputStream.m(iX, 0);
                        i17 += iJ;
                    }
                    break;
                case 58:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.d(iX, true);
                        i17 += iD;
                    }
                    break;
                case 59:
                    if (J(t10, iX, i16)) {
                        Object object2 = unsafe.getObject(t10, jY);
                        iD = object2 instanceof AbstractC2898h ? CodedOutputStream.g(iX, (AbstractC2898h) object2) : CodedOutputStream.R(iX, (String) object2);
                        i17 += iD;
                    }
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (J(t10, iX, i16)) {
                        iD = h0.o(iX, unsafe.getObject(t10, jY), v(i16));
                        i17 += iD;
                    }
                    break;
                case 61:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.g(iX, (AbstractC2898h) unsafe.getObject(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 62:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.U(iX, c0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 63:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.k(iX, c0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 64:
                    if (J(t10, iX, i16)) {
                        iJ = CodedOutputStream.J(iX, 0);
                        i17 += iJ;
                    }
                    break;
                case 65:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.L(iX, 0L);
                        i17 += iD;
                    }
                    break;
                case 66:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.N(iX, c0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 67:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.P(iX, d0(t10, jY));
                        i17 += iD;
                    }
                    break;
                case 68:
                    if (J(t10, iX, i16)) {
                        iD = CodedOutputStream.s(iX, (P) unsafe.getObject(t10, jY), v(i16));
                        i17 += iD;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        int iZ = i17 + z(this.f37765o, t10);
        return this.f37756f ? iZ + this.f37766p.c(t10).l() : iZ;
    }

    private int x0(int i10) {
        return this.f37751a[i10 + 1];
    }

    private int y(T t10) {
        int i10;
        int i11;
        int iT;
        int iV;
        Unsafe unsafe = f37750s;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37751a.length; i13 += 3) {
            int iX0 = x0(i13);
            int iW0 = w0(iX0);
            int iX = X(i13);
            long jY = Y(iX0);
            int i14 = (iW0 < EnumC2910u.f38011p0.c() || iW0 > EnumC2910u.f37970C0.c()) ? 0 : this.f37751a[i13 + 2] & 1048575;
            switch (iW0) {
                case 0:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.i(iX, 0.0d);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.q(iX, 0.0f);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.x(iX, p0.A(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.W(iX, p0.A(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.v(iX, p0.z(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.o(iX, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.m(iX, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.d(iX, true);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (C(t10, i13)) {
                        Object objC = p0.C(t10, jY);
                        i10 = objC instanceof AbstractC2898h ? CodedOutputStream.g(iX, (AbstractC2898h) objC) : CodedOutputStream.R(iX, (String) objC);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (C(t10, i13)) {
                        i10 = h0.o(iX, p0.C(t10, jY), v(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.g(iX, (AbstractC2898h) p0.C(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.U(iX, p0.z(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.k(iX, p0.z(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.J(iX, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.L(iX, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.N(iX, p0.z(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.P(iX, p0.A(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (C(t10, i13)) {
                        i10 = CodedOutputStream.s(iX, (P) p0.C(t10, jY), v(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = h0.h(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 19:
                    i10 = h0.f(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 20:
                    i10 = h0.m(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 21:
                    i10 = h0.x(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 22:
                    i10 = h0.k(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 23:
                    i10 = h0.h(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 24:
                    i10 = h0.f(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 25:
                    i10 = h0.a(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 26:
                    i10 = h0.u(iX, L(t10, jY));
                    i12 += i10;
                    break;
                case 27:
                    i10 = h0.p(iX, L(t10, jY), v(i13));
                    i12 += i10;
                    break;
                case 28:
                    i10 = h0.c(iX, L(t10, jY));
                    i12 += i10;
                    break;
                case 29:
                    i10 = h0.v(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    i10 = h0.d(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 31:
                    i10 = h0.f(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 32:
                    i10 = h0.h(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 33:
                    i10 = h0.q(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 34:
                    i10 = h0.s(iX, L(t10, jY), false);
                    i12 += i10;
                    break;
                case 35:
                    i11 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 36:
                    i11 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 37:
                    i11 = h0.n((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 38:
                    i11 = h0.y((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 39:
                    i11 = h0.l((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 40:
                    i11 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 41:
                    i11 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 42:
                    i11 = h0.b((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 43:
                    i11 = h0.w((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 44:
                    i11 = h0.e((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 45:
                    i11 = h0.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 46:
                    i11 = h0.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 47:
                    i11 = h0.r((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 48:
                    i11 = h0.t((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        break;
                    } else {
                        if (this.f37759i) {
                            unsafe.putInt(t10, i14, i11);
                        }
                        iT = CodedOutputStream.T(iX);
                        iV = CodedOutputStream.V(i11);
                        i10 = iT + iV + i11;
                        i12 += i10;
                        break;
                    }
                case 49:
                    i10 = h0.j(iX, L(t10, jY), v(i13));
                    i12 += i10;
                    break;
                case 50:
                    i10 = this.f37767q.f(iX, p0.C(t10, jY), u(i13));
                    i12 += i10;
                    break;
                case 51:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.i(iX, 0.0d);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.q(iX, 0.0f);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.x(iX, d0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.W(iX, d0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.v(iX, c0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.o(iX, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.m(iX, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.d(iX, true);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t10, iX, i13)) {
                        Object objC2 = p0.C(t10, jY);
                        i10 = objC2 instanceof AbstractC2898h ? CodedOutputStream.g(iX, (AbstractC2898h) objC2) : CodedOutputStream.R(iX, (String) objC2);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (J(t10, iX, i13)) {
                        i10 = h0.o(iX, p0.C(t10, jY), v(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.g(iX, (AbstractC2898h) p0.C(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.U(iX, c0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.k(iX, c0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.J(iX, 0);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.L(iX, 0L);
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.N(iX, c0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.P(iX, d0(t10, jY));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t10, iX, i13)) {
                        i10 = CodedOutputStream.s(iX, (P) p0.C(t10, jY), v(i13));
                        i12 += i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i12 + z(this.f37765o, t10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y0(T r18, com.google.crypto.tink.shaded.protobuf.s0 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s0):void");
    }

    private <UT, UB> int z(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void z0(T r13, com.google.crypto.tink.shaded.protobuf.s0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s0):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void a(T t10, T t11) {
        m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f37751a.length; i10 += 3) {
            R(t10, t11, i10);
        }
        h0.G(this.f37765o, t10, t11);
        if (this.f37756f) {
            h0.E(this.f37766p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(T r8) {
        /*
            r7 = this;
            boolean r0 = H(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC2913x
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC2913x) r0
            r0.t()
            r0.s()
            r0.J()
        L17:
            int[] r0 = r7.f37751a
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5f
            int r2 = r7.x0(r1)
            long r3 = Y(r2)
            int r2 = w0(r2)
            r5 = 9
            if (r2 == r5) goto L49
            switch(r2) {
                case 17: goto L49;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L31;
                default: goto L30;
            }
        L30:
            goto L5c
        L31:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.T.f37750s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.K r6 = r7.f37767q
            java.lang.Object r5 = r6.b(r5)
            r2.putObject(r8, r3, r5)
            goto L5c
        L43:
            com.google.crypto.tink.shaded.protobuf.F r2 = r7.f37764n
            r2.c(r8, r3)
            goto L5c
        L49:
            boolean r2 = r7.C(r8, r1)
            if (r2 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.f0 r2 = r7.v(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.T.f37750s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
        L5c:
            int r1 = r1 + 3
            goto L1b
        L5f:
            com.google.crypto.tink.shaded.protobuf.l0<?, ?> r0 = r7.f37765o
            r0.j(r8)
            boolean r0 = r7.f37756f
            if (r0 == 0) goto L6d
            com.google.crypto.tink.shaded.protobuf.p<?> r0 = r7.f37766p
            r0.f(r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
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
            int r2 = r6.f37761k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f37760j
            r11 = r2[r10]
            int r12 = r6.X(r11)
            int r13 = r6.x0(r11)
            int[] r2 = r6.f37751a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.T.f37750s
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
            boolean r0 = K(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.D(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = w0(r13)
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
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.J(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.f0 r0 = r6.v(r11)
            boolean r0 = E(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.F(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.D(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.crypto.tink.shaded.protobuf.f0 r0 = r6.v(r11)
            boolean r0 = E(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f37756f
            if (r0 == 0) goto Lc2
            com.google.crypto.tink.shaded.protobuf.p<?> r0 = r6.f37766p
            com.google.crypto.tink.shaded.protobuf.t r0 = r0.c(r7)
            boolean r0 = r0.o()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.c(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean d(T t10, T t11) {
        int length = this.f37751a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f37765o.g(t10).equals(this.f37765o.g(t11))) {
            return false;
        }
        if (this.f37756f) {
            return this.f37766p.c(t10).equals(this.f37766p.c(t11));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int e(T t10) {
        return this.f37758h ? y(t10) : x(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public T f() {
        return (T) this.f37763m.a(this.f37755e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int g(T t10) {
        int i10;
        int iF;
        int length = this.f37751a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iX0 = x0(i12);
            int iX = X(i12);
            long jY = Y(iX0);
            int iHashCode = 37;
            switch (w0(iX0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C2915z.f(Double.doubleToLongBits(p0.x(t10, jY)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(p0.y(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C2915z.f(p0.A(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C2915z.f(p0.A(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C2915z.f(p0.A(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C2915z.c(p0.r(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) p0.C(t10, jY)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = p0.C(t10, jY);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C2915z.f(p0.A(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jY);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C2915z.f(p0.A(t10, jY));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = p0.C(t10, jY);
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
                    iF = p0.C(t10, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jY).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(Double.doubleToLongBits(a0(t10, jY)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(b0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(d0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(d0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(d0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.c(Z(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) p0.C(t10, jY)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(d0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = c0(t10, jY);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = C2915z.f(d0(t10, jY));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t10, iX, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jY).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f37765o.g(t10).hashCode();
        return this.f37756f ? (iHashCode2 * 53) + this.f37766p.c(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0090. Please report as an issue. */
    int g0(T t10, byte[] bArr, int i10, int i11, int i12, C2895e.b bVar) {
        Unsafe unsafe;
        int i13;
        T<T> t11;
        int i14;
        int i15;
        int i16;
        int i17;
        T t12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int iL;
        int i29;
        int i30;
        T<T> t13 = this;
        T t14 = t10;
        byte[] bArr3 = bArr;
        int i31 = i11;
        int i32 = i12;
        C2895e.b bVar2 = bVar;
        m(t10);
        Unsafe unsafe2 = f37750s;
        int iG = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (iG < i31) {
                int i38 = iG + 1;
                byte b10 = bArr3[iG];
                if (b10 < 0) {
                    int iH = C2895e.H(b10, bArr3, i38, bVar2);
                    i18 = bVar2.f37794a;
                    i38 = iH;
                } else {
                    i18 = b10;
                }
                int i39 = i18 >>> 3;
                int i40 = i18 & 7;
                int iK0 = i39 > i36 ? t13.k0(i39, i33 / 3) : t13.j0(i39);
                if (iK0 == -1) {
                    i19 = i39;
                    i20 = i38;
                    i15 = i18;
                    i21 = i35;
                    i22 = i37;
                    unsafe = unsafe2;
                    i13 = i32;
                    i23 = 0;
                } else {
                    int i41 = t13.f37751a[iK0 + 1];
                    int iW0 = w0(i41);
                    long jY = Y(i41);
                    int i42 = i18;
                    if (iW0 <= 17) {
                        int i43 = t13.f37751a[iK0 + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(t14, i37, i35);
                            }
                            i25 = i45;
                            i24 = unsafe2.getInt(t14, i45);
                        } else {
                            i24 = i35;
                            i25 = i37;
                        }
                        switch (iW0) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    p0.N(t14, jY, C2895e.d(bArr2, i38));
                                    iG = i38 + 8;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 1:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    p0.O(t14, jY, C2895e.l(bArr2, i38));
                                    iG = i38 + 4;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iL = C2895e.L(bArr2, i38, bVar2);
                                    unsafe2.putLong(t10, jY, bVar2.f37795b);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    iG = iL;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 4:
                            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = C2895e.I(bArr2, i38, bVar2);
                                    unsafe2.putInt(t14, jY, bVar2.f37794a);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putLong(t10, jY, C2895e.j(bArr2, i38));
                                    iG = i38 + 8;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 6:
                            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putInt(t14, jY, C2895e.h(bArr2, i38));
                                    iG = i38 + 4;
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 7:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = C2895e.L(bArr2, i38, bVar2);
                                    p0.H(t14, jY, bVar2.f37795b != 0);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 8:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = (536870912 & i41) == 0 ? C2895e.C(bArr2, i38, bVar2) : C2895e.F(bArr2, i38, bVar2);
                                    unsafe2.putObject(t14, jY, bVar2.f37796c);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 9:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object objS = t13.S(t14, i28);
                                    iG = C2895e.O(objS, t13.v(i28), bArr, i38, i11, bVar);
                                    t13.u0(t14, i28, objS);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = C2895e.b(bArr2, i38, bVar2);
                                    unsafe2.putObject(t14, jY, bVar2.f37796c);
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = C2895e.I(bArr2, i38, bVar2);
                                    int i46 = bVar2.f37794a;
                                    C2915z.e eVarT = t13.t(i28);
                                    if (eVarT == null || eVarT.a(i46)) {
                                        unsafe2.putInt(t14, jY, i46);
                                        i35 = i24 | i44;
                                        i32 = i12;
                                        i33 = i28;
                                        i34 = i27;
                                        i36 = i19;
                                        i37 = i26;
                                        bArr3 = bArr2;
                                    } else {
                                        w(t10).n(i27, Long.valueOf(i46));
                                        i33 = i28;
                                        i35 = i24;
                                        i34 = i27;
                                        i36 = i19;
                                        i37 = i26;
                                        i32 = i12;
                                        bArr3 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iG = C2895e.I(bArr2, i38, bVar2);
                                    unsafe2.putInt(t14, jY, AbstractC2899i.b(bVar2.f37794a));
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 16:
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                bArr2 = bArr;
                                if (i40 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    iL = C2895e.L(bArr2, i38, bVar2);
                                    unsafe2.putLong(t10, jY, AbstractC2899i.c(bVar2.f37795b));
                                    i35 = i24 | i44;
                                    i32 = i12;
                                    i33 = i28;
                                    iG = iL;
                                    i34 = i27;
                                    i36 = i19;
                                    i37 = i26;
                                    bArr3 = bArr2;
                                }
                            case 17:
                                if (i40 != 3) {
                                    i19 = i39;
                                    i26 = i25;
                                    i27 = i42;
                                    i28 = iK0;
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i38;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object objS2 = t13.S(t14, iK0);
                                    iG = C2895e.N(objS2, t13.v(iK0), bArr, i38, i11, (i39 << 3) | 4, bVar);
                                    t13.u0(t14, iK0, objS2);
                                    i35 = i24 | i44;
                                    i37 = i25;
                                    i32 = i12;
                                    i33 = iK0;
                                    i34 = i42;
                                    i36 = i39;
                                    bArr3 = bArr;
                                }
                            default:
                                i19 = i39;
                                i28 = iK0;
                                i26 = i25;
                                i27 = i42;
                                i22 = i26;
                                i13 = i12;
                                i20 = i38;
                                i23 = i28;
                                unsafe = unsafe2;
                                i21 = i24;
                                i15 = i27;
                                break;
                        }
                    } else {
                        i19 = i39;
                        i22 = i37;
                        i21 = i35;
                        if (iW0 == 27) {
                            if (i40 == 2) {
                                C2915z.i iVarK = (C2915z.i) unsafe2.getObject(t14, jY);
                                if (!iVarK.q()) {
                                    int size = iVarK.size();
                                    iVarK = iVarK.k(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(t14, jY, iVarK);
                                }
                                iG = C2895e.q(t13.v(iK0), i42, bArr, i38, i11, iVarK, bVar);
                                i33 = iK0;
                                i34 = i42;
                                i37 = i22;
                                i35 = i21;
                                i36 = i19;
                                bArr3 = bArr;
                                i32 = i12;
                            } else {
                                i29 = i38;
                                unsafe = unsafe2;
                                i23 = iK0;
                                i30 = i42;
                                i13 = i12;
                                i20 = i29;
                            }
                        } else if (iW0 <= 49) {
                            int i47 = i38;
                            unsafe = unsafe2;
                            i23 = iK0;
                            i30 = i42;
                            iG = i0(t10, bArr, i38, i11, i42, i19, i40, iK0, i41, iW0, jY, bVar);
                            if (iG != i47) {
                                t13 = this;
                                t14 = t10;
                                bArr3 = bArr;
                                i31 = i11;
                                i32 = i12;
                                bVar2 = bVar;
                                i37 = i22;
                                i35 = i21;
                                i33 = i23;
                                i34 = i30;
                                i36 = i19;
                                unsafe2 = unsafe;
                            } else {
                                i13 = i12;
                                i20 = iG;
                            }
                        } else {
                            i29 = i38;
                            unsafe = unsafe2;
                            i23 = iK0;
                            i30 = i42;
                            if (iW0 != 50) {
                                iG = f0(t10, bArr, i29, i11, i30, i19, i40, i41, iW0, jY, i23, bVar);
                                if (iG != i29) {
                                    t13 = this;
                                    t14 = t10;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    bVar2 = bVar;
                                    i37 = i22;
                                    i35 = i21;
                                    i33 = i23;
                                    i34 = i30;
                                    i36 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = iG;
                                }
                            } else if (i40 == 2) {
                                iG = e0(t10, bArr, i29, i11, i23, jY, bVar);
                                if (iG != i29) {
                                    t13 = this;
                                    t14 = t10;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    bVar2 = bVar;
                                    i37 = i22;
                                    i35 = i21;
                                    i33 = i23;
                                    i34 = i30;
                                    i36 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = iG;
                                }
                            } else {
                                i13 = i12;
                                i20 = i29;
                            }
                        }
                        i15 = i30;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    iG = (!this.f37756f || bVar.f37797d == C2905o.b()) ? C2895e.G(i15, bArr, i20, i11, w(t10), bVar) : C2895e.g(i15, bArr, i20, i11, t10, this.f37755e, this.f37765o, bVar);
                    t14 = t10;
                    bArr3 = bArr;
                    i31 = i11;
                    i34 = i15;
                    t13 = this;
                    bVar2 = bVar;
                    i37 = i22;
                    i35 = i21;
                    i33 = i23;
                    i36 = i19;
                    unsafe2 = unsafe;
                    i32 = i13;
                } else {
                    i17 = 1048575;
                    t11 = this;
                    i14 = i20;
                    i16 = i22;
                    i35 = i21;
                }
            } else {
                int i48 = i37;
                unsafe = unsafe2;
                i13 = i32;
                t11 = t13;
                i14 = iG;
                i15 = i34;
                i16 = i48;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t12 = t10;
            unsafe.putInt(t12, i16, i35);
        } else {
            t12 = t10;
        }
        m0 m0Var = null;
        for (int i49 = t11.f37761k; i49 < t11.f37762l; i49++) {
            m0Var = (m0) q(t10, t11.f37760j[i49], m0Var, t11.f37765o, t10);
        }
        if (m0Var != null) {
            t11.f37765o.o(t12, m0Var);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.h();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.h();
        }
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void h(T t10, byte[] bArr, int i10, int i11, C2895e.b bVar) throws InvalidProtocolBufferException {
        if (this.f37758h) {
            h0(t10, bArr, i10, i11, bVar);
        } else {
            g0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void i(T t10, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            A0(t10, s0Var);
        } else if (this.f37758h) {
            z0(t10, s0Var);
        } else {
            y0(t10, s0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void j(T t10, e0 e0Var, C2905o c2905o) throws Throwable {
        c2905o.getClass();
        m(t10);
        N(this.f37765o, this.f37766p, t10, e0Var, c2905o);
    }
}
