package com.google.android.gms.internal.measurement;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2549o5<T> implements C5<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f34229q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f34230r = V5.p();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f34231a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f34232b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34233c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34234d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2517k5 f34235e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34236f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f34237g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f34238h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f34239i;

    /* renamed from: j, reason: collision with root package name */
    private final int f34240j;

    /* renamed from: k, reason: collision with root package name */
    private final int f34241k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC2572r5 f34242l;

    /* renamed from: m, reason: collision with root package name */
    private final T4 f34243m;

    /* renamed from: n, reason: collision with root package name */
    private final R5<?, ?> f34244n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC2587t4<?> f34245o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC2493h5 f34246p;

    private C2549o5(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2517k5 interfaceC2517k5, boolean z10, int[] iArr2, int i12, int i13, InterfaceC2572r5 interfaceC2572r5, T4 t42, R5<?, ?> r52, AbstractC2587t4<?> abstractC2587t4, InterfaceC2493h5 interfaceC2493h5) {
        this.f34231a = iArr;
        this.f34232b = objArr;
        this.f34233c = i10;
        this.f34234d = i11;
        this.f34237g = interfaceC2517k5 instanceof F4;
        this.f34236f = abstractC2587t4 != null && abstractC2587t4.e(interfaceC2517k5);
        this.f34238h = false;
        this.f34239i = iArr2;
        this.f34240j = i12;
        this.f34241k = i13;
        this.f34242l = interfaceC2572r5;
        this.f34243m = t42;
        this.f34244n = r52;
        this.f34245o = abstractC2587t4;
        this.f34235e = interfaceC2517k5;
        this.f34246p = interfaceC2493h5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, C5 c52) {
        return c52.e(V5.B(obj, i10 & 1048575));
    }

    private static <T> float B(T t10, long j10) {
        return ((Float) V5.B(t10, j10)).floatValue();
    }

    private final int C(int i10) {
        return this.f34231a[i10 + 2];
    }

    private final void D(T t10, int i10) {
        int iC = C(i10);
        long j10 = 1048575 & iC;
        if (j10 == 1048575) {
            return;
        }
        V5.h(t10, j10, (1 << (iC >>> 20)) | V5.t(t10, j10));
    }

    private final void E(T t10, int i10, int i11) {
        V5.h(t10, C(i11) & 1048575, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(T t10, T t11, int i10) {
        int i11 = this.f34231a[i10];
        if (K(t11, i11, i10)) {
            long jG = G(i10) & 1048575;
            Unsafe unsafe = f34230r;
            Object object = unsafe.getObject(t11, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34231a[i10] + " is present but null: " + String.valueOf(t11));
            }
            C5 c5O = O(i10);
            if (!K(t10, i11, i10)) {
                if (T(object)) {
                    Object objA = c5O.a();
                    c5O.g(objA, object);
                    unsafe.putObject(t10, jG, objA);
                } else {
                    unsafe.putObject(t10, jG, object);
                }
                E(t10, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jG);
            if (!T(object2)) {
                Object objA2 = c5O.a();
                c5O.g(objA2, object2);
                unsafe.putObject(t10, jG, objA2);
                object2 = objA2;
            }
            c5O.g(object2, object);
        }
    }

    private final int G(int i10) {
        return this.f34231a[i10 + 1];
    }

    private static <T> int H(T t10, long j10) {
        return ((Integer) V5.B(t10, j10)).intValue();
    }

    static T5 I(Object obj) {
        F4 f42 = (F4) obj;
        T5 t52 = f42.zzb;
        if (t52 != T5.k()) {
            return t52;
        }
        T5 t5L = T5.l();
        f42.zzb = t5L;
        return t5L;
    }

    private final boolean J(T t10, int i10) {
        int iC = C(i10);
        long j10 = iC & 1048575;
        if (j10 != 1048575) {
            return (V5.t(t10, j10) & (1 << (iC >>> 20))) != 0;
        }
        int iG = G(i10);
        long j11 = iG & 1048575;
        switch ((iG & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(V5.a(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(V5.n(t10, j11)) != 0;
            case 2:
                return V5.x(t10, j11) != 0;
            case 3:
                return V5.x(t10, j11) != 0;
            case 4:
                return V5.t(t10, j11) != 0;
            case 5:
                return V5.x(t10, j11) != 0;
            case 6:
                return V5.t(t10, j11) != 0;
            case 7:
                return V5.F(t10, j11);
            case 8:
                Object objB = V5.B(t10, j11);
                if (objB instanceof String) {
                    return !((String) objB).isEmpty();
                }
                if (objB instanceof Y3) {
                    return !Y3.f33948C.equals(objB);
                }
                throw new IllegalArgumentException();
            case 9:
                return V5.B(t10, j11) != null;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !Y3.f33948C.equals(V5.B(t10, j11));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return V5.t(t10, j11) != 0;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return V5.t(t10, j11) != 0;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return V5.t(t10, j11) != 0;
            case 14:
                return V5.x(t10, j11) != 0;
            case 15:
                return V5.t(t10, j11) != 0;
            case 16:
                return V5.x(t10, j11) != 0;
            case 17:
                return V5.B(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean K(T t10, int i10, int i11) {
        return V5.t(t10, (long) (C(i11) & 1048575)) == i10;
    }

    private final boolean L(T t10, T t11, int i10) {
        return J(t10, i10) == J(t11, i10);
    }

    private static <T> long M(T t10, long j10) {
        return ((Long) V5.B(t10, j10)).longValue();
    }

    private final K4 N(int i10) {
        return (K4) this.f34232b[((i10 / 3) << 1) + 1];
    }

    private final C5 O(int i10) {
        int i11 = (i10 / 3) << 1;
        C5 c52 = (C5) this.f34232b[i11];
        if (c52 != null) {
            return c52;
        }
        C5<T> c5B = C2628y5.a().b((Class) this.f34232b[i11 + 1]);
        this.f34232b[i11] = c5B;
        return c5B;
    }

    private static <T> boolean P(T t10, long j10) {
        return ((Boolean) V5.B(t10, j10)).booleanValue();
    }

    private final Object Q(int i10) {
        return this.f34232b[(i10 / 3) << 1];
    }

    private static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean S(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof F4) {
            return ((F4) obj).J();
        }
        return true;
    }

    private static <T> double j(T t10, long j10) {
        return ((Double) V5.B(t10, j10)).doubleValue();
    }

    private final int k(int i10) {
        if (i10 < this.f34233c || i10 > this.f34234d) {
            return -1;
        }
        return l(i10, 0);
    }

    private final int l(int i10, int i11) {
        int length = (this.f34231a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f34231a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.measurement.C2549o5<T> n(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.InterfaceC2501i5 r33, com.google.android.gms.internal.measurement.InterfaceC2572r5 r34, com.google.android.gms.internal.measurement.T4 r35, com.google.android.gms.internal.measurement.R5<?, ?> r36, com.google.android.gms.internal.measurement.AbstractC2587t4<?> r37, com.google.android.gms.internal.measurement.InterfaceC2493h5 r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.n(java.lang.Class, com.google.android.gms.internal.measurement.i5, com.google.android.gms.internal.measurement.r5, com.google.android.gms.internal.measurement.T4, com.google.android.gms.internal.measurement.R5, com.google.android.gms.internal.measurement.t4, com.google.android.gms.internal.measurement.h5):com.google.android.gms.internal.measurement.o5");
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, K4 k42, UB ub2, R5<UT, UB> r52, Object obj) {
        this.f34246p.b(Q(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!k42.g(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = r52.i(obj);
                }
                C2468e4 c2468e4B = Y3.B(C2451c5.a(null, next.getKey(), next.getValue()));
                try {
                    C2451c5.b(c2468e4B.b(), null, next.getKey(), next.getValue());
                    r52.c(ub2, i11, c2468e4B.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(T t10, int i10) {
        C5 c5O = O(i10);
        long jG = G(i10) & 1048575;
        if (!J(t10, i10)) {
            return c5O.a();
        }
        Object object = f34230r.getObject(t10, jG);
        if (T(object)) {
            return object;
        }
        Object objA = c5O.a();
        if (object != null) {
            c5O.g(objA, object);
        }
        return objA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(T t10, int i10, int i11) {
        C5 c5O = O(i11);
        if (!K(t10, i10, i11)) {
            return c5O.a();
        }
        Object object = f34230r.getObject(t10, G(i11) & 1048575);
        if (T(object)) {
            return object;
        }
        Object objA = c5O.a();
        if (object != null) {
            c5O.g(objA, object);
        }
        return objA;
    }

    private final <UT, UB> UB r(Object obj, int i10, UB ub2, R5<UT, UB> r52, Object obj2) {
        K4 k4N;
        int i11 = this.f34231a[i10];
        Object objB = V5.B(obj, G(i10) & 1048575);
        return (objB == null || (k4N = N(i10)) == null) ? ub2 : (UB) o(i10, i11, this.f34246p.e(objB), k4N, ub2, r52, obj2);
    }

    private static Field s(Class<?> cls, String str) {
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

    private static void t(int i10, Object obj, InterfaceC2502i6 interfaceC2502i6) {
        if (obj instanceof String) {
            interfaceC2502i6.t(i10, (String) obj);
        } else {
            interfaceC2502i6.O(i10, (Y3) obj);
        }
    }

    private static <UT, UB> void u(R5<UT, UB> r52, T t10, InterfaceC2502i6 interfaceC2502i6) {
        r52.g(r52.k(t10), interfaceC2502i6);
    }

    private final <K, V> void v(InterfaceC2502i6 interfaceC2502i6, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f34246p.b(Q(i11));
            interfaceC2502i6.h(i10, null, this.f34246p.f(obj));
        }
    }

    private final void w(T t10, int i10, int i11, Object obj) {
        f34230r.putObject(t10, G(i11) & 1048575, obj);
        E(t10, i10, i11);
    }

    private final void x(T t10, int i10, Object obj) {
        f34230r.putObject(t10, G(i10) & 1048575, obj);
        D(t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y(T t10, T t11, int i10) {
        if (J(t11, i10)) {
            long jG = G(i10) & 1048575;
            Unsafe unsafe = f34230r;
            Object object = unsafe.getObject(t11, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34231a[i10] + " is present but null: " + String.valueOf(t11));
            }
            C5 c5O = O(i10);
            if (!J(t10, i10)) {
                if (T(object)) {
                    Object objA = c5O.a();
                    c5O.g(objA, object);
                    unsafe.putObject(t10, jG, objA);
                } else {
                    unsafe.putObject(t10, jG, object);
                }
                D(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jG);
            if (!T(object2)) {
                Object objA2 = c5O.a();
                c5O.g(objA2, object2);
                unsafe.putObject(t10, jG, objA2);
                object2 = objA2;
            }
            c5O.g(object2, object);
        }
    }

    private final boolean z(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? J(t10, i10) : (i12 & i13) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final T a() {
        return (T) this.f34242l.b(this.f34235e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C5
    public final int b(T t10) {
        int i10;
        int i11;
        int i12;
        int iF;
        int iO;
        int iC0;
        boolean z10;
        int iX;
        int iB;
        int iK0;
        int iO0;
        Unsafe unsafe = f34230r;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < this.f34231a.length) {
            int iG = G(i16);
            int i18 = (267386880 & iG) >>> 20;
            int[] iArr = this.f34231a;
            int i19 = iArr[i16];
            int i20 = iArr[i16 + 2];
            int i21 = i20 & i13;
            if (i18 <= 17) {
                if (i21 != i14) {
                    i15 = i21 == i13 ? 0 : unsafe.getInt(t10, i21);
                    i14 = i21;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            long j10 = iG & i13;
            if (i18 >= A4.f33639l0.a()) {
                A4.f33652y0.a();
            }
            switch (i18) {
                case 0:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.f(i19, 0.0d);
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.g(i19, 0.0f);
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.B(i19, unsafe.getLong(t10, j10));
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.i0(i19, unsafe.getLong(t10, j10));
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.U(i19, unsafe.getInt(t10, j10));
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.i(i19, 0L);
                        i17 += iF;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z(t10, i16, i10, i11, i12)) {
                        iF = zzjn.A(i19, 0);
                        i17 += iF;
                        break;
                    }
                    break;
                case 7:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.o(i19, true);
                        i17 += iO;
                    }
                    break;
                case 8:
                    if (z(t10, i16, i10, i11, i12)) {
                        Object object = unsafe.getObject(t10, j10);
                        iO = object instanceof Y3 ? zzjn.j(i19, (Y3) object) : zzjn.n(i19, (String) object);
                        i17 += iO;
                    }
                    break;
                case 9:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = D5.a(i19, unsafe.getObject(t10, j10), O(i16));
                        i17 += iO;
                    }
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.j(i19, (Y3) unsafe.getObject(t10, j10));
                        i17 += iO;
                    }
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.l0(i19, unsafe.getInt(t10, j10));
                        i17 += iO;
                    }
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.h(i19, unsafe.getInt(t10, j10));
                        i17 += iO;
                    }
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (z(t10, i16, i10, i11, i12)) {
                        iC0 = zzjn.c0(i19, 0);
                        i17 += iC0;
                    }
                    break;
                case 14:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.V(i19, 0L);
                        i17 += iO;
                    }
                    break;
                case 15:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.h0(i19, unsafe.getInt(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 16:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.d0(i19, unsafe.getLong(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 17:
                    if (z(t10, i16, i10, i11, i12)) {
                        iO = zzjn.m(i19, (InterfaceC2517k5) unsafe.getObject(t10, j10), O(i16));
                        i17 += iO;
                    }
                    break;
                case 18:
                    iO = D5.A(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iO;
                    break;
                case 19:
                    z10 = false;
                    iX = D5.x(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 20:
                    z10 = false;
                    iX = D5.G(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 21:
                    z10 = false;
                    iX = D5.S(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 22:
                    z10 = false;
                    iX = D5.D(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 23:
                    z10 = false;
                    iX = D5.A(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 24:
                    z10 = false;
                    iX = D5.x(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 25:
                    z10 = false;
                    iX = D5.d(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 26:
                    iO = D5.q(i19, (List) unsafe.getObject(t10, j10));
                    i17 += iO;
                    break;
                case 27:
                    iO = D5.r(i19, (List) unsafe.getObject(t10, j10), O(i16));
                    i17 += iO;
                    break;
                case 28:
                    iO = D5.b(i19, (List) unsafe.getObject(t10, j10));
                    i17 += iO;
                    break;
                case 29:
                    iO = D5.P(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iO;
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    z10 = false;
                    iX = D5.s(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 31:
                    z10 = false;
                    iX = D5.x(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 32:
                    z10 = false;
                    iX = D5.A(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 33:
                    z10 = false;
                    iX = D5.J(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 34:
                    z10 = false;
                    iX = D5.M(i19, (List) unsafe.getObject(t10, j10), false);
                    i17 += iX;
                    break;
                case 35:
                    iB = D5.B((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 36:
                    iB = D5.y((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 37:
                    iB = D5.H((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 38:
                    iB = D5.T((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 39:
                    iB = D5.E((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 40:
                    iB = D5.B((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 41:
                    iB = D5.y((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 42:
                    iB = D5.e((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 43:
                    iB = D5.Q((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 44:
                    iB = D5.t((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 45:
                    iB = D5.y((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 46:
                    iB = D5.B((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 47:
                    iB = D5.K((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 48:
                    iB = D5.N((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        iK0 = zzjn.k0(i19);
                        iO0 = zzjn.o0(iB);
                        iC0 = iK0 + iO0 + iB;
                        i17 += iC0;
                    }
                    break;
                case 49:
                    iO = D5.c(i19, (List) unsafe.getObject(t10, j10), O(i16));
                    i17 += iO;
                    break;
                case 50:
                    iO = this.f34246p.i(i19, unsafe.getObject(t10, j10), Q(i16));
                    i17 += iO;
                    break;
                case 51:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.f(i19, 0.0d);
                        i17 += iO;
                    }
                    break;
                case 52:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.g(i19, 0.0f);
                        i17 += iO;
                    }
                    break;
                case 53:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.B(i19, M(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 54:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.i0(i19, M(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 55:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.U(i19, H(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 56:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.i(i19, 0L);
                        i17 += iO;
                    }
                    break;
                case 57:
                    if (K(t10, i19, i16)) {
                        iC0 = zzjn.A(i19, 0);
                        i17 += iC0;
                    }
                    break;
                case 58:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.o(i19, true);
                        i17 += iO;
                    }
                    break;
                case 59:
                    if (K(t10, i19, i16)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        iO = object2 instanceof Y3 ? zzjn.j(i19, (Y3) object2) : zzjn.n(i19, (String) object2);
                        i17 += iO;
                    }
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (K(t10, i19, i16)) {
                        iO = D5.a(i19, unsafe.getObject(t10, j10), O(i16));
                        i17 += iO;
                    }
                    break;
                case 61:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.j(i19, (Y3) unsafe.getObject(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 62:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.l0(i19, H(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 63:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.h(i19, H(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 64:
                    if (K(t10, i19, i16)) {
                        iC0 = zzjn.c0(i19, 0);
                        i17 += iC0;
                    }
                    break;
                case 65:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.V(i19, 0L);
                        i17 += iO;
                    }
                    break;
                case 66:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.h0(i19, H(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 67:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.d0(i19, M(t10, j10));
                        i17 += iO;
                    }
                    break;
                case 68:
                    if (K(t10, i19, i16)) {
                        iO = zzjn.m(i19, (InterfaceC2517k5) unsafe.getObject(t10, j10), O(i16));
                        i17 += iO;
                    }
                    break;
            }
            i16 += 3;
            i14 = i10;
            i15 = i11;
            i13 = 1048575;
        }
        int iB2 = 0;
        R5<?, ?> r52 = this.f34244n;
        int iA = i17 + r52.a(r52.k(t10));
        if (!this.f34236f) {
            return iA;
        }
        C2595u4<T> c2595u4B = this.f34245o.b(t10);
        int i22 = c2595u4B.f34397a.i();
        for (int i23 = 0; i23 < i22; i23++) {
            Map.Entry entryG = c2595u4B.f34397a.g(i23);
            iB2 += C2595u4.b((InterfaceC2611w4) entryG.getKey(), entryG.getValue());
        }
        for (Map.Entry entry : c2595u4B.f34397a.l()) {
            iB2 += C2595u4.b((InterfaceC2611w4) entry.getKey(), entry.getValue());
        }
        return iA + iB2;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final int c(T t10) {
        int i10;
        int iB;
        int length = this.f34231a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iG = G(i12);
            int i13 = this.f34231a[i12];
            long j10 = 1048575 & iG;
            int iHashCode = 37;
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    iB = I4.b(Double.doubleToLongBits(V5.a(t10, j10)));
                    i11 = i10 + iB;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iB = Float.floatToIntBits(V5.n(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iB = I4.b(V5.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iB = I4.b(V5.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iB = I4.b(V5.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iB = I4.c(V5.F(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iB = ((String) V5.B(t10, j10)).hashCode();
                    i11 = i10 + iB;
                    break;
                case 9:
                    Object objB = V5.B(t10, j10);
                    if (objB != null) {
                        iHashCode = objB.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i10 = i11 * 53;
                    iB = V5.B(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iB = I4.b(V5.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iB = V5.t(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iB = I4.b(V5.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 17:
                    Object objB2 = V5.B(t10, j10);
                    if (objB2 != null) {
                        iHashCode = objB2.hashCode();
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
                    iB = V5.B(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iB = V5.B(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 51:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(Double.doubleToLongBits(j(t10, j10)));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = Float.floatToIntBits(B(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(M(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(M(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(M(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.c(P(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = ((String) V5.B(t10, j10)).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = V5.B(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = V5.B(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(M(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = H(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = I4.b(M(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (K(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = V5.B(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f34244n.k(t10).hashCode();
        return this.f34236f ? (iHashCode2 * 53) + this.f34245o.b(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void d(T t10, byte[] bArr, int i10, int i11, T3 t32) throws zzkp {
        m(t10, bArr, i10, i11, 0, t32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // com.google.android.gms.internal.measurement.C5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(T r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.measurement.C5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T r8) {
        /*
            r7 = this;
            boolean r0 = T(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.F4
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.measurement.F4 r0 = (com.google.android.gms.internal.measurement.F4) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.k(r2)
            r0.zza = r1
            r0.I()
        L1a:
            int[] r0 = r7.f34231a
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.G(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
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
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.C2549o5.f34230r
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.measurement.h5 r6 = r7.f34246p
            java.lang.Object r5 = r6.h(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.measurement.T4 r2 = r7.f34243m
            r2.a(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.f34231a
            r2 = r2[r1]
            boolean r2 = r7.K(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.C5 r2 = r7.O(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.C2549o5.f34230r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.f(r3)
            goto L80
        L6d:
            boolean r2 = r7.J(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.C5 r2 = r7.O(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.C2549o5.f34230r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.f(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.measurement.R5<?, ?> r0 = r7.f34244n
            r0.l(r8)
            boolean r0 = r7.f34236f
            if (r0 == 0) goto L91
            com.google.android.gms.internal.measurement.t4<?> r0 = r7.f34245o
            r0.g(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.f(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void g(T t10, T t11) {
        R(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f34231a.length; i10 += 3) {
            int iG = G(i10);
            long j10 = 1048575 & iG;
            int i11 = this.f34231a[i10];
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    if (J(t11, i10)) {
                        V5.f(t10, j10, V5.a(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (J(t11, i10)) {
                        V5.g(t10, j10, V5.n(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (J(t11, i10)) {
                        V5.i(t10, j10, V5.x(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (J(t11, i10)) {
                        V5.i(t10, j10, V5.x(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (J(t11, i10)) {
                        V5.i(t10, j10, V5.x(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (J(t11, i10)) {
                        V5.v(t10, j10, V5.F(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (J(t11, i10)) {
                        V5.j(t10, j10, V5.B(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    y(t10, t11, i10);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (J(t11, i10)) {
                        V5.j(t10, j10, V5.B(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (J(t11, i10)) {
                        V5.i(t10, j10, V5.x(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (J(t11, i10)) {
                        V5.h(t10, j10, V5.t(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (J(t11, i10)) {
                        V5.i(t10, j10, V5.x(t11, j10));
                        D(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    y(t10, t11, i10);
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
                    this.f34243m.b(t10, t11, j10);
                    break;
                case 50:
                    D5.m(this.f34246p, t10, t11, j10);
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
                    if (K(t11, i11, i10)) {
                        V5.j(t10, j10, V5.B(t11, j10));
                        E(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    F(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (K(t11, i11, i10)) {
                        V5.j(t10, j10, V5.B(t11, j10));
                        E(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    F(t10, t11, i10);
                    break;
            }
        }
        D5.n(this.f34244n, t10, t11);
        if (this.f34236f) {
            D5.l(this.f34245o, t10, t11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.C5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(T r24, com.google.android.gms.internal.measurement.InterfaceC2502i6 r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.h(java.lang.Object, com.google.android.gms.internal.measurement.i6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.C5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.i(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:487:0x0bec A[PHI: r4 r8 r9 r20 r27
      0x0bec: PHI (r4v78 com.google.android.gms.internal.measurement.T3) = 
      (r4v51 com.google.android.gms.internal.measurement.T3)
      (r4v52 com.google.android.gms.internal.measurement.T3)
      (r4v53 com.google.android.gms.internal.measurement.T3)
      (r4v54 com.google.android.gms.internal.measurement.T3)
      (r4v55 com.google.android.gms.internal.measurement.T3)
      (r4v57 com.google.android.gms.internal.measurement.T3)
      (r4v58 com.google.android.gms.internal.measurement.T3)
      (r4v59 com.google.android.gms.internal.measurement.T3)
      (r4v68 com.google.android.gms.internal.measurement.T3)
      (r4v73 com.google.android.gms.internal.measurement.T3)
      (r4v79 com.google.android.gms.internal.measurement.T3)
     binds: [B:485:0x0bd8, B:482:0x0bbc, B:479:0x0ba0, B:476:0x0b85, B:473:0x0b6a, B:469:0x0b4c, B:462:0x0b26, B:460:0x0b1a, B:428:0x0a51, B:424:0x0a2b, B:415:0x09ce] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r8v78 int) = 
      (r8v56 int)
      (r8v57 int)
      (r8v58 int)
      (r8v59 int)
      (r8v60 int)
      (r8v62 int)
      (r8v63 int)
      (r8v64 int)
      (r8v70 int)
      (r8v73 int)
      (r8v79 int)
     binds: [B:485:0x0bd8, B:482:0x0bbc, B:479:0x0ba0, B:476:0x0b85, B:473:0x0b6a, B:469:0x0b4c, B:462:0x0b26, B:460:0x0b1a, B:428:0x0a51, B:424:0x0a2b, B:415:0x09ce] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r9v84 int) = 
      (r9v59 int)
      (r9v60 int)
      (r9v61 int)
      (r9v62 int)
      (r9v63 int)
      (r9v65 int)
      (r9v66 int)
      (r9v67 int)
      (r9v76 int)
      (r9v78 int)
      (r9v85 int)
     binds: [B:485:0x0bd8, B:482:0x0bbc, B:479:0x0ba0, B:476:0x0b85, B:473:0x0b6a, B:469:0x0b4c, B:462:0x0b26, B:460:0x0b1a, B:428:0x0a51, B:424:0x0a2b, B:415:0x09ce] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r20v52 int) = 
      (r20v31 int)
      (r20v32 int)
      (r20v33 int)
      (r20v34 int)
      (r20v35 int)
      (r20v37 int)
      (r20v38 int)
      (r20v39 int)
      (r20v44 int)
      (r20v47 int)
      (r20v53 int)
     binds: [B:485:0x0bd8, B:482:0x0bbc, B:479:0x0ba0, B:476:0x0b85, B:473:0x0b6a, B:469:0x0b4c, B:462:0x0b26, B:460:0x0b1a, B:428:0x0a51, B:424:0x0a2b, B:415:0x09ce] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r27v13 sun.misc.Unsafe) = 
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v8 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
      (r27v7 sun.misc.Unsafe)
     binds: [B:485:0x0bd8, B:482:0x0bbc, B:479:0x0ba0, B:476:0x0b85, B:473:0x0b6a, B:469:0x0b4c, B:462:0x0b26, B:460:0x0b1a, B:428:0x0a51, B:424:0x0a2b, B:415:0x09ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0951 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0c70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0941 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.T3 r36) throws com.google.android.gms.internal.measurement.zzkp {
        /*
            Method dump skipped, instructions count: 3434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2549o5.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.T3):int");
    }
}
