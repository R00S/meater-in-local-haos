package com.google.android.gms.internal.wearable;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Q0<T> implements Z0<T> {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f34509l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f34510m = C2690r1.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f34511a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f34512b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34513c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34514d;

    /* renamed from: e, reason: collision with root package name */
    private final N0 f34515e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34516f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f34517g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34518h;

    /* renamed from: i, reason: collision with root package name */
    private final int f34519i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2670k1 f34520j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC2639a0 f34521k;

    private Q0(int[] iArr, Object[] objArr, int i10, int i11, N0 n02, boolean z10, int[] iArr2, int i12, int i13, S0 s02, A0 a02, AbstractC2670k1 abstractC2670k1, AbstractC2639a0 abstractC2639a0, I0 i02) {
        this.f34511a = iArr;
        this.f34512b = objArr;
        this.f34513c = i10;
        this.f34514d = i11;
        boolean z11 = false;
        if (abstractC2639a0 != null && (n02 instanceof AbstractC2666j0)) {
            z11 = true;
        }
        this.f34516f = z11;
        this.f34517g = iArr2;
        this.f34518h = i12;
        this.f34519i = i13;
        this.f34520j = abstractC2670k1;
        this.f34521k = abstractC2639a0;
        this.f34515e = n02;
    }

    private static int A(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int B(int i10) {
        return this.f34511a[i10 + 1];
    }

    private static long C(Object obj, long j10) {
        return ((Long) C2690r1.k(obj, j10)).longValue();
    }

    private final Z0 D(int i10) {
        Object[] objArr = this.f34512b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Z0 z02 = (Z0) objArr[i12];
        if (z02 != null) {
            return z02;
        }
        Z0 z0B = W0.a().b((Class) objArr[i12 + 1]);
        this.f34512b[i12] = z0B;
        return z0B;
    }

    private final Object E(int i10) {
        int i11 = i10 / 3;
        return this.f34512b[i11 + i11];
    }

    private static Field F(Class cls, String str) {
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

    private static void i(Object obj) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void j(Object obj, Object obj2, int i10) {
        if (o(obj2, i10)) {
            int iB = B(i10) & 1048575;
            Unsafe unsafe = f34510m;
            long j10 = iB;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34511a[i10] + " is present but null: " + obj2.toString());
            }
            Z0 z0D = D(i10);
            if (!o(obj, i10)) {
                if (r(object)) {
                    Object objH = z0D.h();
                    z0D.f(objH, object);
                    unsafe.putObject(obj, j10, objH);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                l(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                Object objH2 = z0D.h();
                z0D.f(objH2, object2);
                unsafe.putObject(obj, j10, objH2);
                object2 = objH2;
            }
            z0D.f(object2, object);
        }
    }

    private final void k(Object obj, Object obj2, int i10) {
        int i11 = this.f34511a[i10];
        if (s(obj2, i11, i10)) {
            int iB = B(i10) & 1048575;
            Unsafe unsafe = f34510m;
            long j10 = iB;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34511a[i10] + " is present but null: " + obj2.toString());
            }
            Z0 z0D = D(i10);
            if (!s(obj, i11, i10)) {
                if (r(object)) {
                    Object objH = z0D.h();
                    z0D.f(objH, object);
                    unsafe.putObject(obj, j10, objH);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                Object objH2 = z0D.h();
                z0D.f(objH2, object2);
                unsafe.putObject(obj, j10, objH2);
                object2 = objH2;
            }
            z0D.f(object2, object);
        }
    }

    private final void l(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        C2690r1.v(obj, j10, (1 << (iZ >>> 20)) | C2690r1.h(obj, j10));
    }

    private final void m(Object obj, int i10, int i11) {
        C2690r1.v(obj, z(i11) & 1048575, i10);
    }

    private final boolean n(Object obj, Object obj2, int i10) {
        return o(obj, i10) == o(obj2, i10);
    }

    private final boolean o(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = iZ & 1048575;
        if (j10 != 1048575) {
            return (C2690r1.h(obj, j10) & (1 << (iZ >>> 20))) != 0;
        }
        int iB = B(i10);
        long j11 = iB & 1048575;
        switch (A(iB)) {
            case 0:
                return Double.doubleToRawLongBits(C2690r1.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2690r1.g(obj, j11)) != 0;
            case 2:
                return C2690r1.i(obj, j11) != 0;
            case 3:
                return C2690r1.i(obj, j11) != 0;
            case 4:
                return C2690r1.h(obj, j11) != 0;
            case 5:
                return C2690r1.i(obj, j11) != 0;
            case 6:
                return C2690r1.h(obj, j11) != 0;
            case 7:
                return C2690r1.B(obj, j11);
            case 8:
                Object objK = C2690r1.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof P) {
                    return !P.f34503C.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return C2690r1.k(obj, j11) != null;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !P.f34503C.equals(C2690r1.k(obj, j11));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return C2690r1.h(obj, j11) != 0;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return C2690r1.h(obj, j11) != 0;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return C2690r1.h(obj, j11) != 0;
            case 14:
                return C2690r1.i(obj, j11) != 0;
            case 15:
                return C2690r1.h(obj, j11) != 0;
            case 16:
                return C2690r1.i(obj, j11) != 0;
            case 17:
                return C2690r1.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean p(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? o(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean q(Object obj, int i10, Z0 z02) {
        return z02.e(C2690r1.k(obj, i10 & 1048575));
    }

    private static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2672l0) {
            return ((AbstractC2672l0) obj).A();
        }
        return true;
    }

    private final boolean s(Object obj, int i10, int i11) {
        return C2690r1.h(obj, (long) (z(i11) & 1048575)) == i10;
    }

    private static boolean t(Object obj, long j10) {
        return ((Boolean) C2690r1.k(obj, j10)).booleanValue();
    }

    private static final void u(int i10, Object obj, x1 x1Var) {
        if (obj instanceof String) {
            x1Var.g(i10, (String) obj);
        } else {
            x1Var.s(i10, (P) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.wearable.Q0 v(java.lang.Class r34, com.google.android.gms.internal.wearable.K0 r35, com.google.android.gms.internal.wearable.S0 r36, com.google.android.gms.internal.wearable.A0 r37, com.google.android.gms.internal.wearable.AbstractC2670k1 r38, com.google.android.gms.internal.wearable.AbstractC2639a0 r39, com.google.android.gms.internal.wearable.I0 r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.Q0.v(java.lang.Class, com.google.android.gms.internal.wearable.K0, com.google.android.gms.internal.wearable.S0, com.google.android.gms.internal.wearable.A0, com.google.android.gms.internal.wearable.k1, com.google.android.gms.internal.wearable.a0, com.google.android.gms.internal.wearable.I0):com.google.android.gms.internal.wearable.Q0");
    }

    private static double w(Object obj, long j10) {
        return ((Double) C2690r1.k(obj, j10)).doubleValue();
    }

    private static float x(Object obj, long j10) {
        return ((Float) C2690r1.k(obj, j10)).floatValue();
    }

    private static int y(Object obj, long j10) {
        return ((Integer) C2690r1.k(obj, j10)).intValue();
    }

    private final int z(int i10) {
        return this.f34511a[i10 + 2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // com.google.android.gms.internal.wearable.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r21, com.google.android.gms.internal.wearable.x1 r22) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.Q0.a(java.lang.Object, com.google.android.gms.internal.wearable.x1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0481  */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.wearable.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.Q0.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final int c(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f34511a.length; i13 += 3) {
            int iB = B(i13);
            int[] iArr = this.f34511a;
            int i14 = 1048575 & iB;
            int iA = A(iB);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iA) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C2690r1.f(obj, j10));
                    byte[] bArr = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C2690r1.g(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2690r1.i(obj, j10);
                    byte[] bArr2 = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2690r1.i(obj, j10);
                    byte[] bArr3 = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2690r1.i(obj, j10);
                    byte[] bArr4 = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2689r0.a(C2690r1.B(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) C2690r1.k(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objK = C2690r1.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2690r1.i(obj, j10);
                    byte[] bArr5 = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.h(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2690r1.i(obj, j10);
                    byte[] bArr6 = C2689r0.f34653b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objK2 = C2690r1.k(obj, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(w(obj, j10));
                        byte[] bArr7 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(x(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = C(obj, j10);
                        byte[] bArr8 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = C(obj, j10);
                        byte[] bArr9 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = C(obj, j10);
                        byte[] bArr10 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C2689r0.a(t(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) C2690r1.k(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = C(obj, j10);
                        byte[] bArr11 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = y(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = C(obj, j10);
                        byte[] bArr12 = C2689r0.f34653b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C2690r1.k(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i12 * 53) + ((AbstractC2672l0) obj).zzc.hashCode();
        return this.f34516f ? (iHashCode2 * 53) + ((AbstractC2666j0) obj).zzb.f34561a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.wearable.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.wearable.AbstractC2672l0
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.wearable.l0 r0 = (com.google.android.gms.internal.wearable.AbstractC2672l0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.x(r2)
            r0.zza = r1
            r0.v()
        L1b:
            int[] r0 = r7.f34511a
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.B(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = A(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.wearable.Q0.f34510m
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.wearable.H0 r6 = (com.google.android.gms.internal.wearable.H0) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.wearable.C2690r1.k(r8, r3)
            com.google.android.gms.internal.wearable.q0 r2 = (com.google.android.gms.internal.wearable.InterfaceC2687q0) r2
            r2.b()
            goto L84
        L59:
            int[] r2 = r7.f34511a
            r2 = r2[r1]
            boolean r2 = r7.s(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.wearable.Z0 r2 = r7.D(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.wearable.Q0.f34510m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L84
        L71:
            boolean r2 = r7.o(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.wearable.Z0 r2 = r7.D(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.wearable.Q0.f34510m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.wearable.k1 r0 = r7.f34520j
            r0.a(r8)
            boolean r0 = r7.f34516f
            if (r0 == 0) goto L95
            com.google.android.gms.internal.wearable.a0 r0 = r7.f34521k
            r0.a(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.Q0.d(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.wearable.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.Q0.e(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final void f(Object obj, Object obj2) {
        i(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f34511a.length; i10 += 3) {
            int iB = B(i10);
            int i11 = 1048575 & iB;
            int[] iArr = this.f34511a;
            int iA = A(iB);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iA) {
                case 0:
                    if (o(obj2, i10)) {
                        C2690r1.t(obj, j10, C2690r1.f(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o(obj2, i10)) {
                        C2690r1.u(obj, j10, C2690r1.g(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (o(obj2, i10)) {
                        C2690r1.w(obj, j10, C2690r1.i(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (o(obj2, i10)) {
                        C2690r1.w(obj, j10, C2690r1.i(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (o(obj2, i10)) {
                        C2690r1.w(obj, j10, C2690r1.i(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (o(obj2, i10)) {
                        C2690r1.r(obj, j10, C2690r1.B(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (o(obj2, i10)) {
                        C2690r1.x(obj, j10, C2690r1.k(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    j(obj, obj2, i10);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (o(obj2, i10)) {
                        C2690r1.x(obj, j10, C2690r1.k(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (o(obj2, i10)) {
                        C2690r1.w(obj, j10, C2690r1.i(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (o(obj2, i10)) {
                        C2690r1.v(obj, j10, C2690r1.h(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (o(obj2, i10)) {
                        C2690r1.w(obj, j10, C2690r1.i(obj2, j10));
                        l(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    j(obj, obj2, i10);
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
                    InterfaceC2687q0 interfaceC2687q0C = (InterfaceC2687q0) C2690r1.k(obj, j10);
                    InterfaceC2687q0 interfaceC2687q0 = (InterfaceC2687q0) C2690r1.k(obj2, j10);
                    int size = interfaceC2687q0C.size();
                    int size2 = interfaceC2687q0.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC2687q0C.d()) {
                            interfaceC2687q0C = interfaceC2687q0C.C(size2 + size);
                        }
                        interfaceC2687q0C.addAll(interfaceC2687q0);
                    }
                    if (size > 0) {
                        interfaceC2687q0 = interfaceC2687q0C;
                    }
                    C2690r1.x(obj, j10, interfaceC2687q0);
                    break;
                case 50:
                    int i13 = C2643b1.f34555b;
                    C2690r1.x(obj, j10, I0.a(C2690r1.k(obj, j10), C2690r1.k(obj2, j10)));
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
                    if (s(obj2, i12, i10)) {
                        C2690r1.x(obj, j10, C2690r1.k(obj2, j10));
                        m(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    k(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(obj2, i12, i10)) {
                        C2690r1.x(obj, j10, C2690r1.k(obj2, j10));
                        m(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    k(obj, obj2, i10);
                    break;
            }
        }
        C2643b1.t(this.f34520j, obj, obj2);
        if (this.f34516f) {
            C2643b1.s(this.f34521k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final boolean g(Object obj, Object obj2) {
        boolean zE;
        for (int i10 = 0; i10 < this.f34511a.length; i10 += 3) {
            int iB = B(i10);
            long j10 = iB & 1048575;
            switch (A(iB)) {
                case 0:
                    if (!n(obj, obj2, i10) || Double.doubleToLongBits(C2690r1.f(obj, j10)) != Double.doubleToLongBits(C2690r1.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!n(obj, obj2, i10) || Float.floatToIntBits(C2690r1.g(obj, j10)) != Float.floatToIntBits(C2690r1.g(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!n(obj, obj2, i10) || C2690r1.i(obj, j10) != C2690r1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!n(obj, obj2, i10) || C2690r1.i(obj, j10) != C2690r1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!n(obj, obj2, i10) || C2690r1.i(obj, j10) != C2690r1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!n(obj, obj2, i10) || C2690r1.B(obj, j10) != C2690r1.B(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!n(obj, obj2, i10) || !C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!n(obj, obj2, i10) || !C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (!n(obj, obj2, i10) || !C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!n(obj, obj2, i10) || C2690r1.i(obj, j10) != C2690r1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!n(obj, obj2, i10) || C2690r1.h(obj, j10) != C2690r1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!n(obj, obj2, i10) || C2690r1.i(obj, j10) != C2690r1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!n(obj, obj2, i10) || !C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
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
                    zE = C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10));
                    break;
                case 50:
                    zE = C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10));
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
                    long jZ = z(i10) & 1048575;
                    if (C2690r1.h(obj, jZ) != C2690r1.h(obj2, jZ) || !C2643b1.e(C2690r1.k(obj, j10), C2690r1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zE) {
                return false;
            }
        }
        if (!((AbstractC2672l0) obj).zzc.equals(((AbstractC2672l0) obj2).zzc)) {
            return false;
        }
        if (this.f34516f) {
            return ((AbstractC2666j0) obj).zzb.equals(((AbstractC2666j0) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final Object h() {
        return ((AbstractC2672l0) this.f34515e).k();
    }
}
