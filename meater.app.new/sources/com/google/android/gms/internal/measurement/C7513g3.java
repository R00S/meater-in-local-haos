package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* loaded from: classes2.dex */
final class C7513g3<T> implements InterfaceC7567p3<T> {

    /* renamed from: a */
    private static final int[] f27732a = new int[0];

    /* renamed from: b */
    private static final Unsafe f27733b = C7538k4.m21208t();

    /* renamed from: c */
    private final int[] f27734c;

    /* renamed from: d */
    private final Object[] f27735d;

    /* renamed from: e */
    private final int f27736e;

    /* renamed from: f */
    private final int f27737f;

    /* renamed from: g */
    private final zzgo f27738g;

    /* renamed from: h */
    private final boolean f27739h;

    /* renamed from: i */
    private final boolean f27740i;

    /* renamed from: j */
    private final boolean f27741j;

    /* renamed from: k */
    private final boolean f27742k;

    /* renamed from: l */
    private final int[] f27743l;

    /* renamed from: m */
    private final int f27744m;

    /* renamed from: n */
    private final int f27745n;

    /* renamed from: o */
    private final InterfaceC7531j3 f27746o;

    /* renamed from: p */
    private final AbstractC7584s2 f27747p;

    /* renamed from: q */
    private final AbstractC7520h4<?, ?> f27748q;

    /* renamed from: r */
    private final AbstractC7494d2<?> f27749r;

    /* renamed from: s */
    private final InterfaceC7477a3 f27750s;

    private C7513g3(int[] iArr, Object[] objArr, int i2, int i3, zzgo zzgoVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, InterfaceC7531j3 interfaceC7531j3, AbstractC7584s2 abstractC7584s2, AbstractC7520h4<?, ?> abstractC7520h4, AbstractC7494d2<?> abstractC7494d2, InterfaceC7477a3 interfaceC7477a3) {
        this.f27734c = iArr;
        this.f27735d = objArr;
        this.f27736e = i2;
        this.f27737f = i3;
        this.f27740i = zzgoVar instanceof zzfd;
        this.f27741j = z;
        this.f27739h = abstractC7494d2 != null && abstractC7494d2.mo21038h(zzgoVar);
        this.f27742k = false;
        this.f27743l = iArr2;
        this.f27744m = i4;
        this.f27745n = i5;
        this.f27746o = interfaceC7531j3;
        this.f27747p = abstractC7584s2;
        this.f27748q = abstractC7520h4;
        this.f27749r = abstractC7494d2;
        this.f27738g = zzgoVar;
        this.f27750s = interfaceC7477a3;
    }

    /* renamed from: A */
    private final void m21057A(T t, T t2, int i2) {
        long jM21072P = m21072P(i2) & 1048575;
        if (m21058B(t2, i2)) {
            Object objM21179F = C7538k4.m21179F(t, jM21072P);
            Object objM21179F2 = C7538k4.m21179F(t2, jM21072P);
            if (objM21179F != null && objM21179F2 != null) {
                C7538k4.m21198j(t, jM21072P, zzff.m22290e(objM21179F, objM21179F2));
                m21065I(t, i2);
            } else if (objM21179F2 != null) {
                C7538k4.m21198j(t, jM21072P, objM21179F2);
                m21065I(t, i2);
            }
        }
    }

    /* renamed from: B */
    private final boolean m21058B(T t, int i2) {
        if (!this.f27741j) {
            int iM21074R = m21074R(i2);
            return (C7538k4.m21190b(t, (long) (iM21074R & 1048575)) & (1 << (iM21074R >>> 20))) != 0;
        }
        int iM21072P = m21072P(i2);
        long j2 = iM21072P & 1048575;
        switch ((iM21072P & 267386880) >>> 20) {
            case 0:
                return C7538k4.m21176C(t, j2) != 0.0d;
            case 1:
                return C7538k4.m21212x(t, j2) != 0.0f;
            case 2:
                return C7538k4.m21203o(t, j2) != 0;
            case 3:
                return C7538k4.m21203o(t, j2) != 0;
            case 4:
                return C7538k4.m21190b(t, j2) != 0;
            case 5:
                return C7538k4.m21203o(t, j2) != 0;
            case 6:
                return C7538k4.m21190b(t, j2) != 0;
            case 7:
                return C7538k4.m21211w(t, j2);
            case 8:
                Object objM21179F = C7538k4.m21179F(t, j2);
                if (objM21179F instanceof String) {
                    return !((String) objM21179F).isEmpty();
                }
                if (objM21179F instanceof zzdu) {
                    return !zzdu.f28037f.equals(objM21179F);
                }
                throw new IllegalArgumentException();
            case 9:
                return C7538k4.m21179F(t, j2) != null;
            case 10:
                return !zzdu.f28037f.equals(C7538k4.m21179F(t, j2));
            case 11:
                return C7538k4.m21190b(t, j2) != 0;
            case 12:
                return C7538k4.m21190b(t, j2) != 0;
            case 13:
                return C7538k4.m21190b(t, j2) != 0;
            case 14:
                return C7538k4.m21203o(t, j2) != 0;
            case 15:
                return C7538k4.m21190b(t, j2) != 0;
            case 16:
                return C7538k4.m21203o(t, j2) != 0;
            case 17:
                return C7538k4.m21179F(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: C */
    private final boolean m21059C(T t, int i2, int i3) {
        return C7538k4.m21190b(t, (long) (m21074R(i3) & 1048575)) == i2;
    }

    /* renamed from: D */
    private final boolean m21060D(T t, int i2, int i3, int i4) {
        return this.f27741j ? m21058B(t, i2) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private static boolean m21061E(Object obj, int i2, InterfaceC7567p3 interfaceC7567p3) {
        return interfaceC7567p3.mo21099e(C7538k4.m21179F(obj, i2 & 1048575));
    }

    /* renamed from: F */
    private static <T> double m21062F(T t, long j2) {
        return ((Double) C7538k4.m21179F(t, j2)).doubleValue();
    }

    /* renamed from: G */
    private final int m21063G(int i2, int i3) {
        int length = (this.f27734c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f27734c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* renamed from: H */
    private final Object m21064H(int i2) {
        return this.f27735d[(i2 / 3) << 1];
    }

    /* renamed from: I */
    private final void m21065I(T t, int i2) {
        if (this.f27741j) {
            return;
        }
        int iM21074R = m21074R(i2);
        long j2 = iM21074R & 1048575;
        C7538k4.m21196h(t, j2, C7538k4.m21190b(t, j2) | (1 << (iM21074R >>> 20)));
    }

    /* renamed from: J */
    private final void m21066J(T t, int i2, int i3) {
        C7538k4.m21196h(t, m21074R(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m21067K(T r19, com.google.android.gms.internal.measurement.InterfaceC7622y4 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.m21067K(java.lang.Object, com.google.android.gms.internal.measurement.y4):void");
    }

    /* renamed from: L */
    private final void m21068L(T t, T t2, int i2) {
        int iM21072P = m21072P(i2);
        int i3 = this.f27734c[i2];
        long j2 = iM21072P & 1048575;
        if (m21059C(t2, i3, i2)) {
            Object objM21179F = C7538k4.m21179F(t, j2);
            Object objM21179F2 = C7538k4.m21179F(t2, j2);
            if (objM21179F != null && objM21179F2 != null) {
                C7538k4.m21198j(t, j2, zzff.m22290e(objM21179F, objM21179F2));
                m21066J(t, i3, i2);
            } else if (objM21179F2 != null) {
                C7538k4.m21198j(t, j2, objM21179F2);
                m21066J(t, i3, i2);
            }
        }
    }

    /* renamed from: M */
    private static <T> float m21069M(T t, long j2) {
        return ((Float) C7538k4.m21179F(t, j2)).floatValue();
    }

    /* renamed from: N */
    private final zzfk m21070N(int i2) {
        return (zzfk) this.f27735d[((i2 / 3) << 1) + 1];
    }

    /* renamed from: O */
    private final boolean m21071O(T t, T t2, int i2) {
        return m21058B(t, i2) == m21058B(t2, i2);
    }

    /* renamed from: P */
    private final int m21072P(int i2) {
        return this.f27734c[i2 + 1];
    }

    /* renamed from: Q */
    private static <T> int m21073Q(T t, long j2) {
        return ((Integer) C7538k4.m21179F(t, j2)).intValue();
    }

    /* renamed from: R */
    private final int m21074R(int i2) {
        return this.f27734c[i2 + 2];
    }

    /* renamed from: S */
    private static <T> long m21075S(T t, long j2) {
        return ((Long) C7538k4.m21179F(t, j2)).longValue();
    }

    /* renamed from: T */
    private static zzhy m21076T(Object obj) {
        zzfd zzfdVar = (zzfd) obj;
        zzhy zzhyVar = zzfdVar.zzb;
        if (zzhyVar != zzhy.m22330a()) {
            return zzhyVar;
        }
        zzhy zzhyVarM22333g = zzhy.m22333g();
        zzfdVar.zzb = zzhyVarM22333g;
        return zzhyVarM22333g;
    }

    /* renamed from: U */
    private static boolean m21077U(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* renamed from: V */
    private static <T> boolean m21078V(T t, long j2) {
        return ((Boolean) C7538k4.m21179F(t, j2)).booleanValue();
    }

    /* renamed from: W */
    private final int m21079W(int i2) {
        if (i2 < this.f27736e || i2 > this.f27737f) {
            return -1;
        }
        return m21063G(i2, 0);
    }

    /* renamed from: k */
    private final int m21080k(int i2, int i3) {
        if (i2 < this.f27736e || i2 > this.f27737f) {
            return -1;
        }
        return m21063G(i2, i3);
    }

    /* renamed from: l */
    private static <UT, UB> int m21081l(AbstractC7520h4<UT, UB> abstractC7520h4, T t) {
        return abstractC7520h4.mo21143s(abstractC7520h4.mo21135k(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: m */
    private final int m21082m(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C7547m1 c7547m1) throws IOException {
        int iM21159k;
        Unsafe unsafe = f27733b;
        long j3 = this.f27734c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(C7529j1.m21161m(bArr, i2)));
                    iM21159k = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(C7529j1.m21163o(bArr, i2)));
                    iM21159k = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    iM21159k = C7529j1.m21159k(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, Long.valueOf(c7547m1.f27838b));
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    iM21159k = C7529j1.m21157i(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, Integer.valueOf(c7547m1.f27837a));
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(C7529j1.m21160l(bArr, i2)));
                    iM21159k = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(C7529j1.m21156h(bArr, i2)));
                    iM21159k = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    iM21159k = C7529j1.m21159k(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, Boolean.valueOf(c7547m1.f27838b != 0));
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int iM21157i = C7529j1.m21157i(bArr, i2, c7547m1);
                    int i10 = c7547m1.f27837a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i7 & 536870912) != 0 && !C7556n4.m21253g(bArr, iM21157i, iM21157i + i10)) {
                            throw zzfo.m22303h();
                        }
                        unsafe.putObject(t, j2, new String(bArr, iM21157i, i10, zzff.f28137a));
                        iM21157i += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM21157i;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int iM21155g = C7529j1.m21155g(m21086r(i9), bArr, i2, i3, c7547m1);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, c7547m1.f27839c);
                    } else {
                        unsafe.putObject(t, j2, zzff.m22290e(object, c7547m1.f27839c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM21155g;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    iM21159k = C7529j1.m21165q(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, c7547m1.f27839c);
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int iM21157i2 = C7529j1.m21157i(bArr, i2, c7547m1);
                    int i11 = c7547m1.f27837a;
                    zzfk zzfkVarM21070N = m21070N(i9);
                    if (zzfkVarM21070N != null && !zzfkVarM21070N.mo20979d(i11)) {
                        m21076T(t).m22334c(i4, Long.valueOf(i11));
                        return iM21157i2;
                    }
                    unsafe.putObject(t, j2, Integer.valueOf(i11));
                    iM21159k = iM21157i2;
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    iM21159k = C7529j1.m21157i(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, Integer.valueOf(zzeg.m22161k(c7547m1.f27837a)));
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    iM21159k = C7529j1.m21159k(bArr, i2, c7547m1);
                    unsafe.putObject(t, j2, Long.valueOf(zzeg.m22159b(c7547m1.f27838b)));
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    iM21159k = C7529j1.m21154f(m21086r(i9), bArr, i2, i3, (i4 & (-8)) | 4, c7547m1);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, c7547m1.f27839c);
                    } else {
                        unsafe.putObject(t, j2, zzff.m22290e(object2, c7547m1.f27839c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM21159k;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    private final int m21083n(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, C7547m1 c7547m1) throws IOException {
        int iM21157i;
        int iM21157i2 = i2;
        Unsafe unsafe = f27733b;
        zzfl zzflVarMo20982d = (zzfl) unsafe.getObject(t, j3);
        if (!zzflVarMo20982d.mo21145a()) {
            int size = zzflVarMo20982d.size();
            zzflVarMo20982d = zzflVarMo20982d.mo20982d(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, zzflVarMo20982d);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    C7482b2 c7482b2 = (C7482b2) zzflVarMo20982d;
                    int iM21157i3 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i9 = c7547m1.f27837a + iM21157i3;
                    while (iM21157i3 < i9) {
                        c7482b2.m20983f(C7529j1.m21161m(bArr, iM21157i3));
                        iM21157i3 += 8;
                    }
                    if (iM21157i3 == i9) {
                        return iM21157i3;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 1) {
                    C7482b2 c7482b22 = (C7482b2) zzflVarMo20982d;
                    c7482b22.m20983f(C7529j1.m21161m(bArr, i2));
                    while (true) {
                        int i10 = iM21157i2 + 8;
                        if (i10 >= i3) {
                            return i10;
                        }
                        iM21157i2 = C7529j1.m21157i(bArr, i10, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return i10;
                        }
                        c7482b22.m20983f(C7529j1.m21161m(bArr, iM21157i2));
                    }
                }
                return iM21157i2;
            case 19:
            case 36:
                if (i6 == 2) {
                    C7542l2 c7542l2 = (C7542l2) zzflVarMo20982d;
                    int iM21157i4 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i11 = c7547m1.f27837a + iM21157i4;
                    while (iM21157i4 < i11) {
                        c7542l2.m21233f(C7529j1.m21163o(bArr, iM21157i4));
                        iM21157i4 += 4;
                    }
                    if (iM21157i4 == i11) {
                        return iM21157i4;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 5) {
                    C7542l2 c7542l22 = (C7542l2) zzflVarMo20982d;
                    c7542l22.m21233f(C7529j1.m21163o(bArr, i2));
                    while (true) {
                        int i12 = iM21157i2 + 4;
                        if (i12 >= i3) {
                            return i12;
                        }
                        iM21157i2 = C7529j1.m21157i(bArr, i12, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return i12;
                        }
                        c7542l22.m21233f(C7529j1.m21163o(bArr, iM21157i2));
                    }
                }
                return iM21157i2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    C7608w2 c7608w2 = (C7608w2) zzflVarMo20982d;
                    int iM21157i5 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i13 = c7547m1.f27837a + iM21157i5;
                    while (iM21157i5 < i13) {
                        iM21157i5 = C7529j1.m21159k(bArr, iM21157i5, c7547m1);
                        c7608w2.mo21439G0(c7547m1.f27838b);
                    }
                    if (iM21157i5 == i13) {
                        return iM21157i5;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7608w2 c7608w22 = (C7608w2) zzflVarMo20982d;
                    int iM21159k = C7529j1.m21159k(bArr, iM21157i2, c7547m1);
                    c7608w22.mo21439G0(c7547m1.f27838b);
                    while (iM21159k < i3) {
                        int iM21157i6 = C7529j1.m21157i(bArr, iM21159k, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return iM21159k;
                        }
                        iM21159k = C7529j1.m21159k(bArr, iM21157i6, c7547m1);
                        c7608w22.mo21439G0(c7547m1.f27838b);
                    }
                    return iM21159k;
                }
                return iM21157i2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return C7529j1.m21158j(bArr, iM21157i2, zzflVarMo20982d, c7547m1);
                }
                if (i6 == 0) {
                    return C7529j1.m21150b(i4, bArr, i2, i3, zzflVarMo20982d, c7547m1);
                }
                return iM21157i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    C7608w2 c7608w23 = (C7608w2) zzflVarMo20982d;
                    int iM21157i7 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i14 = c7547m1.f27837a + iM21157i7;
                    while (iM21157i7 < i14) {
                        c7608w23.mo21439G0(C7529j1.m21160l(bArr, iM21157i7));
                        iM21157i7 += 8;
                    }
                    if (iM21157i7 == i14) {
                        return iM21157i7;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 1) {
                    C7608w2 c7608w24 = (C7608w2) zzflVarMo20982d;
                    c7608w24.mo21439G0(C7529j1.m21160l(bArr, i2));
                    while (true) {
                        int i15 = iM21157i2 + 8;
                        if (i15 >= i3) {
                            return i15;
                        }
                        iM21157i2 = C7529j1.m21157i(bArr, i15, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return i15;
                        }
                        c7608w24.mo21439G0(C7529j1.m21160l(bArr, iM21157i2));
                    }
                }
                return iM21157i2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    C7554n2 c7554n2 = (C7554n2) zzflVarMo20982d;
                    int iM21157i8 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i16 = c7547m1.f27837a + iM21157i8;
                    while (iM21157i8 < i16) {
                        c7554n2.m21244h(C7529j1.m21156h(bArr, iM21157i8));
                        iM21157i8 += 4;
                    }
                    if (iM21157i8 == i16) {
                        return iM21157i8;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 5) {
                    C7554n2 c7554n22 = (C7554n2) zzflVarMo20982d;
                    c7554n22.m21244h(C7529j1.m21156h(bArr, i2));
                    while (true) {
                        int i17 = iM21157i2 + 4;
                        if (i17 >= i3) {
                            return i17;
                        }
                        iM21157i2 = C7529j1.m21157i(bArr, i17, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return i17;
                        }
                        c7554n22.m21244h(C7529j1.m21156h(bArr, iM21157i2));
                    }
                }
                return iM21157i2;
            case 25:
            case 42:
                if (i6 == 2) {
                    C7541l1 c7541l1 = (C7541l1) zzflVarMo20982d;
                    iM21157i = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i18 = c7547m1.f27837a + iM21157i;
                    while (iM21157i < i18) {
                        iM21157i = C7529j1.m21159k(bArr, iM21157i, c7547m1);
                        c7541l1.m21230f(c7547m1.f27838b != 0);
                    }
                    if (iM21157i != i18) {
                        throw zzfo.m22296a();
                    }
                    return iM21157i;
                }
                if (i6 == 0) {
                    C7541l1 c7541l12 = (C7541l1) zzflVarMo20982d;
                    iM21157i2 = C7529j1.m21159k(bArr, iM21157i2, c7547m1);
                    c7541l12.m21230f(c7547m1.f27838b != 0);
                    while (iM21157i2 < i3) {
                        int iM21157i9 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                        if (i4 == c7547m1.f27837a) {
                            iM21157i2 = C7529j1.m21159k(bArr, iM21157i9, c7547m1);
                            c7541l12.m21230f(c7547m1.f27838b != 0);
                        }
                    }
                }
                return iM21157i2;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        iM21157i2 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                        int i19 = c7547m1.f27837a;
                        if (i19 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i19 == 0) {
                            zzflVarMo20982d.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzflVarMo20982d.add(new String(bArr, iM21157i2, i19, zzff.f28137a));
                            iM21157i2 += i19;
                        }
                        while (iM21157i2 < i3) {
                            int iM21157i10 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                            if (i4 == c7547m1.f27837a) {
                                iM21157i2 = C7529j1.m21157i(bArr, iM21157i10, c7547m1);
                                int i20 = c7547m1.f27837a;
                                if (i20 < 0) {
                                    throw zzfo.m22297b();
                                }
                                if (i20 == 0) {
                                    zzflVarMo20982d.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    zzflVarMo20982d.add(new String(bArr, iM21157i2, i20, zzff.f28137a));
                                    iM21157i2 += i20;
                                }
                            }
                        }
                    } else {
                        iM21157i2 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                        int i21 = c7547m1.f27837a;
                        if (i21 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i21 == 0) {
                            zzflVarMo20982d.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i22 = iM21157i2 + i21;
                            if (!C7556n4.m21253g(bArr, iM21157i2, i22)) {
                                throw zzfo.m22303h();
                            }
                            zzflVarMo20982d.add(new String(bArr, iM21157i2, i21, zzff.f28137a));
                            iM21157i2 = i22;
                        }
                        while (iM21157i2 < i3) {
                            int iM21157i11 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                            if (i4 == c7547m1.f27837a) {
                                iM21157i2 = C7529j1.m21157i(bArr, iM21157i11, c7547m1);
                                int i23 = c7547m1.f27837a;
                                if (i23 < 0) {
                                    throw zzfo.m22297b();
                                }
                                if (i23 == 0) {
                                    zzflVarMo20982d.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i24 = iM21157i2 + i23;
                                    if (!C7556n4.m21253g(bArr, iM21157i2, i24)) {
                                        throw zzfo.m22303h();
                                    }
                                    zzflVarMo20982d.add(new String(bArr, iM21157i2, i23, zzff.f28137a));
                                    iM21157i2 = i24;
                                }
                            }
                        }
                    }
                }
                return iM21157i2;
            case 27:
                if (i6 == 2) {
                    return C7529j1.m21153e(m21086r(i7), i4, bArr, i2, i3, zzflVarMo20982d, c7547m1);
                }
                return iM21157i2;
            case 28:
                if (i6 == 2) {
                    int iM21157i12 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i25 = c7547m1.f27837a;
                    if (i25 < 0) {
                        throw zzfo.m22297b();
                    }
                    if (i25 > bArr.length - iM21157i12) {
                        throw zzfo.m22296a();
                    }
                    if (i25 == 0) {
                        zzflVarMo20982d.add(zzdu.f28037f);
                    } else {
                        zzflVarMo20982d.add(zzdu.m22152q(bArr, iM21157i12, i25));
                        iM21157i12 += i25;
                    }
                    while (iM21157i12 < i3) {
                        int iM21157i13 = C7529j1.m21157i(bArr, iM21157i12, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return iM21157i12;
                        }
                        iM21157i12 = C7529j1.m21157i(bArr, iM21157i13, c7547m1);
                        int i26 = c7547m1.f27837a;
                        if (i26 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i26 > bArr.length - iM21157i12) {
                            throw zzfo.m22296a();
                        }
                        if (i26 == 0) {
                            zzflVarMo20982d.add(zzdu.f28037f);
                        } else {
                            zzflVarMo20982d.add(zzdu.m22152q(bArr, iM21157i12, i26));
                            iM21157i12 += i26;
                        }
                    }
                    return iM21157i12;
                }
                return iM21157i2;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        iM21157i = C7529j1.m21150b(i4, bArr, i2, i3, zzflVarMo20982d, c7547m1);
                    }
                    return iM21157i2;
                }
                iM21157i = C7529j1.m21158j(bArr, iM21157i2, zzflVarMo20982d, c7547m1);
                zzfd zzfdVar = (zzfd) t;
                zzhy zzhyVar = zzfdVar.zzb;
                if (zzhyVar == zzhy.m22330a()) {
                    zzhyVar = null;
                }
                zzhy zzhyVar2 = (zzhy) C7579r3.m21374i(i5, zzflVarMo20982d, m21070N(i7), zzhyVar, this.f27748q);
                if (zzhyVar2 != null) {
                    zzfdVar.zzb = zzhyVar2;
                }
                return iM21157i;
            case 33:
            case 47:
                if (i6 == 2) {
                    C7554n2 c7554n23 = (C7554n2) zzflVarMo20982d;
                    int iM21157i14 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i27 = c7547m1.f27837a + iM21157i14;
                    while (iM21157i14 < i27) {
                        iM21157i14 = C7529j1.m21157i(bArr, iM21157i14, c7547m1);
                        c7554n23.m21244h(zzeg.m22161k(c7547m1.f27837a));
                    }
                    if (iM21157i14 == i27) {
                        return iM21157i14;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7554n2 c7554n24 = (C7554n2) zzflVarMo20982d;
                    int iM21157i15 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    c7554n24.m21244h(zzeg.m22161k(c7547m1.f27837a));
                    while (iM21157i15 < i3) {
                        int iM21157i16 = C7529j1.m21157i(bArr, iM21157i15, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return iM21157i15;
                        }
                        iM21157i15 = C7529j1.m21157i(bArr, iM21157i16, c7547m1);
                        c7554n24.m21244h(zzeg.m22161k(c7547m1.f27837a));
                    }
                    return iM21157i15;
                }
                return iM21157i2;
            case 34:
            case 48:
                if (i6 == 2) {
                    C7608w2 c7608w25 = (C7608w2) zzflVarMo20982d;
                    int iM21157i17 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                    int i28 = c7547m1.f27837a + iM21157i17;
                    while (iM21157i17 < i28) {
                        iM21157i17 = C7529j1.m21159k(bArr, iM21157i17, c7547m1);
                        c7608w25.mo21439G0(zzeg.m22159b(c7547m1.f27838b));
                    }
                    if (iM21157i17 == i28) {
                        return iM21157i17;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7608w2 c7608w26 = (C7608w2) zzflVarMo20982d;
                    int iM21159k2 = C7529j1.m21159k(bArr, iM21157i2, c7547m1);
                    c7608w26.mo21439G0(zzeg.m22159b(c7547m1.f27838b));
                    while (iM21159k2 < i3) {
                        int iM21157i18 = C7529j1.m21157i(bArr, iM21159k2, c7547m1);
                        if (i4 != c7547m1.f27837a) {
                            return iM21159k2;
                        }
                        iM21159k2 = C7529j1.m21159k(bArr, iM21157i18, c7547m1);
                        c7608w26.mo21439G0(zzeg.m22159b(c7547m1.f27838b));
                    }
                    return iM21159k2;
                }
                return iM21157i2;
            case 49:
                if (i6 == 3) {
                    InterfaceC7567p3 interfaceC7567p3M21086r = m21086r(i7);
                    int i29 = (i4 & (-8)) | 4;
                    iM21157i2 = C7529j1.m21154f(interfaceC7567p3M21086r, bArr, i2, i3, i29, c7547m1);
                    zzflVarMo20982d.add(c7547m1.f27839c);
                    while (iM21157i2 < i3) {
                        int iM21157i19 = C7529j1.m21157i(bArr, iM21157i2, c7547m1);
                        if (i4 == c7547m1.f27837a) {
                            iM21157i2 = C7529j1.m21154f(interfaceC7567p3M21086r, bArr, iM21157i19, i3, i29, c7547m1);
                            zzflVarMo20982d.add(c7547m1.f27839c);
                        }
                    }
                }
                return iM21157i2;
            default:
                return iM21157i2;
        }
    }

    /* renamed from: o */
    private final <K, V> int m21084o(T t, byte[] bArr, int i2, int i3, int i4, long j2, C7547m1 c7547m1) throws IOException {
        Unsafe unsafe = f27733b;
        Object objM21064H = m21064H(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.f27750s.mo20975f(object)) {
            Object objMo20973d = this.f27750s.mo20973d(objM21064H);
            this.f27750s.mo20976g(objMo20973d, object);
            unsafe.putObject(t, j2, objMo20973d);
            object = objMo20973d;
        }
        this.f27750s.zzf(objM21064H);
        this.f27750s.mo20972c(object);
        int iM21157i = C7529j1.m21157i(bArr, i2, c7547m1);
        int i5 = c7547m1.f27837a;
        if (i5 < 0 || i5 > i3 - iM21157i) {
            throw zzfo.m22296a();
        }
        throw null;
    }

    /* renamed from: q */
    static <T> C7513g3<T> m21085q(Class<T> cls, InterfaceC7501e3 interfaceC7501e3, InterfaceC7531j3 interfaceC7531j3, AbstractC7584s2 abstractC7584s2, AbstractC7520h4<?, ?> abstractC7520h4, AbstractC7494d2<?> abstractC7494d2, InterfaceC7477a3 interfaceC7477a3) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        boolean z;
        int i18;
        C7555n3 c7555n3;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        Class<?> cls2;
        String str;
        int iObjectFieldOffset2;
        int i22;
        Field fieldM21089u;
        int i23;
        char cCharAt9;
        int i24;
        Field fieldM21089u2;
        Field fieldM21089u3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        char cCharAt14;
        if (!(interfaceC7501e3 instanceof C7555n3)) {
            ((C7502e4) interfaceC7501e3).mo21047a();
            int i29 = zzfd.zze.f28132j;
            throw new NoSuchMethodError();
        }
        C7555n3 c7555n32 = (C7555n3) interfaceC7501e3;
        int i30 = 0;
        boolean z2 = c7555n32.mo21047a() == zzfd.zze.f28132j;
        String strM21245d = c7555n32.m21245d();
        int length = strM21245d.length();
        int iCharAt3 = strM21245d.charAt(0);
        if (iCharAt3 >= 55296) {
            int i31 = iCharAt3 & 8191;
            int i32 = 1;
            int i33 = 13;
            while (true) {
                i2 = i32 + 1;
                cCharAt14 = strM21245d.charAt(i32);
                if (cCharAt14 < 55296) {
                    break;
                }
                i31 |= (cCharAt14 & 8191) << i33;
                i33 += 13;
                i32 = i2;
            }
            iCharAt3 = i31 | (cCharAt14 << i33);
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int iCharAt4 = strM21245d.charAt(i2);
        if (iCharAt4 >= 55296) {
            int i35 = iCharAt4 & 8191;
            int i36 = 13;
            while (true) {
                i28 = i34 + 1;
                cCharAt13 = strM21245d.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i28;
            }
            iCharAt4 = i35 | (cCharAt13 << i36);
            i34 = i28;
        }
        if (iCharAt4 == 0) {
            iArr = f27732a;
            i7 = 0;
            i4 = 0;
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i6 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt5 = strM21245d.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = strM21245d.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt5 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt6 = strM21245d.charAt(i37);
            if (iCharAt6 >= 55296) {
                int i41 = iCharAt6 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = strM21245d.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt6 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            iCharAt = strM21245d.charAt(i40);
            if (iCharAt >= 55296) {
                int i44 = iCharAt & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = strM21245d.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt7 = strM21245d.charAt(i43);
            if (iCharAt7 >= 55296) {
                int i47 = iCharAt7 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = strM21245d.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt7 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt2 = strM21245d.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = strM21245d.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt2 = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strM21245d.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = strM21245d.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt8 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strM21245d.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i9 = i57 + 1;
                    cCharAt2 = strM21245d.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i57 = i9;
                }
                iCharAt9 = i56 | (cCharAt2 << i58);
                i3 = i9;
            } else {
                i3 = i55;
            }
            int i59 = i3 + 1;
            int iCharAt10 = strM21245d.charAt(i3);
            if (iCharAt10 >= 55296) {
                int i60 = iCharAt10 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    cCharAt = strM21245d.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                iCharAt10 = i60 | (cCharAt << i62);
                i59 = i8;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            int i63 = (iCharAt5 << 1) + iCharAt6;
            i4 = iCharAt7;
            i5 = i63;
            i6 = iCharAt10;
            i30 = iCharAt5;
            i34 = i59;
            int i64 = iCharAt8;
            iArr = iArr2;
            i7 = i64;
        }
        Unsafe unsafe = f27733b;
        Object[] objArrM21246e = c7555n32.m21246e();
        Class<?> cls3 = c7555n32.mo21049c().getClass();
        int i65 = i34;
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 << 1];
        int i66 = i6 + i7;
        int i67 = i6;
        int i68 = i65;
        int i69 = i66;
        int i70 = 0;
        int i71 = 0;
        while (i68 < length) {
            int i72 = i68 + 1;
            int iCharAt11 = strM21245d.charAt(i68);
            int i73 = length;
            if (iCharAt11 >= 55296) {
                int i74 = iCharAt11 & 8191;
                int i75 = i72;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    cCharAt12 = strM21245d.charAt(i75);
                    i16 = i6;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i27;
                    i6 = i16;
                }
                iCharAt11 = i74 | (cCharAt12 << i76);
                i17 = i27;
            } else {
                i16 = i6;
                i17 = i72;
            }
            int i77 = i17 + 1;
            int iCharAt12 = strM21245d.charAt(i17);
            if (iCharAt12 >= 55296) {
                int i78 = iCharAt12 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i26 = i79 + 1;
                    cCharAt11 = strM21245d.charAt(i79);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i26;
                    z2 = z;
                }
                iCharAt12 = i78 | (cCharAt11 << i80);
                i18 = i26;
            } else {
                z = z2;
                i18 = i77;
            }
            int i81 = iCharAt12 & 255;
            int i82 = i4;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i83 = iCharAt;
            if (i81 >= 51) {
                int i84 = i18 + 1;
                int iCharAt13 = strM21245d.charAt(i18);
                char c2 = 55296;
                if (iCharAt13 >= 55296) {
                    int i85 = iCharAt13 & 8191;
                    int i86 = 13;
                    while (true) {
                        i25 = i84 + 1;
                        cCharAt10 = strM21245d.charAt(i84);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i25;
                        c2 = 55296;
                    }
                    iCharAt13 = i85 | (cCharAt10 << i86);
                    i84 = i25;
                }
                int i87 = i81 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    objArr[((i71 / 3) << 1) + 1] = objArrM21246e[i5];
                    i5++;
                } else if (i87 == 12 && (iCharAt3 & 1) == 1) {
                    objArr[((i71 / 3) << 1) + 1] = objArrM21246e[i5];
                    i5++;
                }
                int i89 = iCharAt13 << 1;
                Object obj = objArrM21246e[i89];
                if (obj instanceof Field) {
                    fieldM21089u2 = (Field) obj;
                } else {
                    fieldM21089u2 = m21089u(cls3, (String) obj);
                    objArrM21246e[i89] = fieldM21089u2;
                }
                c7555n3 = c7555n32;
                String str2 = strM21245d;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM21089u2);
                int i90 = i89 + 1;
                Object obj2 = objArrM21246e[i90];
                if (obj2 instanceof Field) {
                    fieldM21089u3 = (Field) obj2;
                } else {
                    fieldM21089u3 = m21089u(cls3, (String) obj2);
                    objArrM21246e[i90] = fieldM21089u3;
                }
                cls2 = cls3;
                i20 = i5;
                i18 = i88;
                str = str2;
                i22 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM21089u3);
                i21 = i30;
            } else {
                c7555n3 = c7555n32;
                String str3 = strM21245d;
                int i91 = i5 + 1;
                Field fieldM21089u4 = m21089u(cls3, (String) objArrM21246e[i5]);
                if (i81 == 9 || i81 == 17) {
                    i19 = 1;
                    objArr[((i71 / 3) << 1) + 1] = fieldM21089u4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i19 = 1;
                        i24 = i91 + 1;
                        objArr[((i71 / 3) << 1) + 1] = objArrM21246e[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i19 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i24 = i91 + 1;
                            objArr[((i71 / 3) << 1) + 1] = objArrM21246e[i91];
                        }
                    } else if (i81 == 50) {
                        int i92 = i67 + 1;
                        iArr[i67] = i71;
                        int i93 = (i71 / 3) << 1;
                        int i94 = i91 + 1;
                        objArr[i93] = objArrM21246e[i91];
                        if ((iCharAt12 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 0) {
                            i91 = i94 + 1;
                            objArr[i93 + 1] = objArrM21246e[i94];
                            i67 = i92;
                            i19 = 1;
                        } else {
                            i91 = i94;
                            i19 = 1;
                            i67 = i92;
                        }
                    } else {
                        i19 = 1;
                    }
                    i91 = i24;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM21089u4);
                if ((iCharAt3 & 1) != i19 || i81 > 17) {
                    i20 = i91;
                    i21 = i30;
                    cls2 = cls3;
                    str = str3;
                    iObjectFieldOffset2 = 0;
                    i22 = 0;
                } else {
                    int i95 = i18 + 1;
                    str = str3;
                    int iCharAt14 = str.charAt(i18);
                    if (iCharAt14 >= 55296) {
                        int i96 = iCharAt14 & 8191;
                        int i97 = 13;
                        while (true) {
                            i23 = i95 + 1;
                            cCharAt9 = str.charAt(i95);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i96 |= (cCharAt9 & 8191) << i97;
                            i97 += 13;
                            i95 = i23;
                        }
                        iCharAt14 = i96 | (cCharAt9 << i97);
                        i95 = i23;
                    }
                    int i98 = (i30 << 1) + (iCharAt14 / 32);
                    Object obj3 = objArrM21246e[i98];
                    i20 = i91;
                    if (obj3 instanceof Field) {
                        fieldM21089u = (Field) obj3;
                    } else {
                        fieldM21089u = m21089u(cls3, (String) obj3);
                        objArrM21246e[i98] = fieldM21089u;
                    }
                    i21 = i30;
                    cls2 = cls3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM21089u);
                    i22 = iCharAt14 % 32;
                    i18 = i95;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
            }
            int i99 = i71 + 1;
            iArr3[i71] = iCharAt11;
            int i100 = i99 + 1;
            iArr3[i99] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i81 << 20);
            i71 = i100 + 1;
            iArr3[i100] = (i22 << 20) | iObjectFieldOffset2;
            i30 = i21;
            strM21245d = str;
            i68 = i18;
            cls3 = cls2;
            i4 = i82;
            length = i73;
            i6 = i16;
            z2 = z;
            iCharAt = i83;
            i5 = i20;
            c7555n32 = c7555n3;
        }
        return new C7513g3<>(iArr3, objArr, iCharAt, i4, c7555n32.mo21049c(), z2, false, iArr, i6, i66, interfaceC7531j3, abstractC7584s2, abstractC7520h4, abstractC7494d2, interfaceC7477a3);
    }

    /* renamed from: r */
    private final InterfaceC7567p3 m21086r(int i2) {
        int i3 = (i2 / 3) << 1;
        InterfaceC7567p3 interfaceC7567p3 = (InterfaceC7567p3) this.f27735d[i3];
        if (interfaceC7567p3 != null) {
            return interfaceC7567p3;
        }
        InterfaceC7567p3<T> interfaceC7567p3M21235b = C7543l3.m21234a().m21235b((Class) this.f27735d[i3 + 1]);
        this.f27735d[i3] = interfaceC7567p3M21235b;
        return interfaceC7567p3M21235b;
    }

    /* renamed from: s */
    private final <K, V, UT, UB> UB m21087s(int i2, int i3, Map<K, V> map, zzfk zzfkVar, UB ub, AbstractC7520h4<UT, UB> abstractC7520h4) {
        C7626z2<?, ?> c7626z2Zzf = this.f27750s.zzf(m21064H(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfkVar.mo20979d(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC7520h4.mo21125a();
                }
                C7589t1 c7589t1M22155x = zzdu.m22155x(zzgg.m22316a(c7626z2Zzf, next.getKey(), next.getValue()));
                try {
                    zzgg.m22317b(c7589t1M22155x.m21405b(), c7626z2Zzf, next.getKey(), next.getValue());
                    abstractC7520h4.mo21129e(ub, i3, c7589t1M22155x.m21404a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: t */
    private final <UT, UB> UB m21088t(Object obj, int i2, UB ub, AbstractC7520h4<UT, UB> abstractC7520h4) {
        zzfk zzfkVarM21070N;
        int i3 = this.f27734c[i2];
        Object objM21179F = C7538k4.m21179F(obj, m21072P(i2) & 1048575);
        return (objM21179F == null || (zzfkVarM21070N = m21070N(i2)) == null) ? ub : (UB) m21087s(i2, i3, this.f27750s.mo20972c(objM21179F), zzfkVarM21070N, ub, abstractC7520h4);
    }

    /* renamed from: u */
    private static Field m21089u(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: v */
    private static List<?> m21090v(Object obj, long j2) {
        return (List) C7538k4.m21179F(obj, j2);
    }

    /* renamed from: w */
    private static void m21091w(int i2, Object obj, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        if (obj instanceof String) {
            interfaceC7622y4.mo21009g(i2, (String) obj);
        } else {
            interfaceC7622y4.mo20992E(i2, (zzdu) obj);
        }
    }

    /* renamed from: x */
    private static <UT, UB> void m21092x(AbstractC7520h4<UT, UB> abstractC7520h4, T t, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        abstractC7520h4.mo21131g(abstractC7520h4.mo21135k(t), interfaceC7622y4);
    }

    /* renamed from: y */
    private final <K, V> void m21093y(InterfaceC7622y4 interfaceC7622y4, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            interfaceC7622y4.mo21002O(i2, this.f27750s.zzf(m21064H(i3)), this.f27750s.mo20971b(obj));
        }
    }

    /* renamed from: z */
    private final void m21094z(Object obj, int i2, InterfaceC7573q3 interfaceC7573q3) throws IOException {
        if (m21077U(i2)) {
            C7538k4.m21198j(obj, i2 & 1048575, interfaceC7573q3.mo21315j());
        } else if (this.f27740i) {
            C7538k4.m21198j(obj, i2 & 1048575, interfaceC7573q3.mo21329w());
        } else {
            C7538k4.m21198j(obj, i2 & 1048575, interfaceC7573q3.mo21311f());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: a */
    public final T mo21095a() {
        return (T) this.f27746o.mo21147c(this.f27738g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:421:0x090b A[PHI: r6
      0x090b: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v16 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v17 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:459:0x09b0, B:453:0x0994, B:450:0x0982, B:447:0x0973, B:444:0x0966, B:441:0x0959, B:437:0x094e, B:434:0x0943, B:431:0x0936, B:428:0x0929, B:425:0x0916, B:396:0x081f, B:390:0x0802, B:384:0x07e5, B:378:0x07c8, B:372:0x07aa, B:366:0x078c, B:360:0x076e, B:354:0x0750, B:348:0x0732, B:342:0x0714, B:336:0x06f6, B:330:0x06d8, B:324:0x06ba, B:318:0x069c, B:313:0x0668, B:310:0x065b, B:307:0x064b, B:304:0x063b, B:301:0x062b, B:298:0x061d, B:295:0x0610, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:439:0x0955, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:420:0x090a, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo21096b(T r20) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21096b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: c */
    public final int mo21097c(T t) {
        int i2;
        int iM22287b;
        int length = this.f27734c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM21072P = m21072P(i4);
            int i5 = this.f27734c[i4];
            long j2 = 1048575 & iM21072P;
            int iHashCode = 37;
            switch ((iM21072P & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(Double.doubleToLongBits(C7538k4.m21176C(t, j2)));
                    i3 = i2 + iM22287b;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iM22287b = Float.floatToIntBits(C7538k4.m21212x(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(C7538k4.m21203o(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(C7538k4.m21203o(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(C7538k4.m21203o(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22288c(C7538k4.m21211w(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iM22287b = ((String) C7538k4.m21179F(t, j2)).hashCode();
                    i3 = i2 + iM22287b;
                    break;
                case 9:
                    Object objM21179F = C7538k4.m21179F(t, j2);
                    if (objM21179F != null) {
                        iHashCode = objM21179F.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21179F(t, j2).hashCode();
                    i3 = i2 + iM22287b;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(C7538k4.m21203o(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21190b(t, j2);
                    i3 = i2 + iM22287b;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iM22287b = zzff.m22287b(C7538k4.m21203o(t, j2));
                    i3 = i2 + iM22287b;
                    break;
                case 17:
                    Object objM21179F2 = C7538k4.m21179F(t, j2);
                    if (objM21179F2 != null) {
                        iHashCode = objM21179F2.hashCode();
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
                    iM22287b = C7538k4.m21179F(t, j2).hashCode();
                    i3 = i2 + iM22287b;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iM22287b = C7538k4.m21179F(t, j2).hashCode();
                    i3 = i2 + iM22287b;
                    break;
                case 51:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(Double.doubleToLongBits(m21062F(t, j2)));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = Float.floatToIntBits(m21069M(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22288c(m21078V(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = ((String) C7538k4.m21179F(t, j2)).hashCode();
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = C7538k4.m21179F(t, j2).hashCode();
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = C7538k4.m21179F(t, j2).hashCode();
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = m21073Q(t, j2);
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM22287b = C7538k4.m21179F(t, j2).hashCode();
                        i3 = i2 + iM22287b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.f27748q.mo21135k(t).hashCode();
        return this.f27739h ? (iHashCode2 * 53) + this.f27749r.mo21032b(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21098d(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.C7547m1 r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21098d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.m1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo21099e(T r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21099e(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: f */
    public final void mo21100f(T t) {
        int i2;
        int i3 = this.f27744m;
        while (true) {
            i2 = this.f27745n;
            if (i3 >= i2) {
                break;
            }
            long jM21072P = m21072P(this.f27743l[i3]) & 1048575;
            Object objM21179F = C7538k4.m21179F(t, jM21072P);
            if (objM21179F != null) {
                C7538k4.m21198j(t, jM21072P, this.f27750s.mo20974e(objM21179F));
            }
            i3++;
        }
        int length = this.f27743l.length;
        while (i2 < length) {
            this.f27747p.mo21402e(t, this.f27743l[i2]);
            i2++;
        }
        this.f27748q.mo21141q(t);
        if (this.f27739h) {
            this.f27749r.mo21040j(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo21101g(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21101g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21102h(T r14, com.google.android.gms.internal.measurement.InterfaceC7622y4 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21102h(java.lang.Object, com.google.android.gms.internal.measurement.y4):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ce A[LOOP:5: B:163:0x05ca->B:165:0x05ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05db  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21103i(T r13, com.google.android.gms.internal.measurement.InterfaceC7573q3 r14, com.google.android.gms.internal.measurement.zzeq r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.mo21103i(java.lang.Object, com.google.android.gms.internal.measurement.q3, com.google.android.gms.internal.measurement.zzeq):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: j */
    public final void mo21104j(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f27734c.length; i2 += 3) {
            int iM21072P = m21072P(i2);
            long j2 = 1048575 & iM21072P;
            int i3 = this.f27734c[i2];
            switch ((iM21072P & 267386880) >>> 20) {
                case 0:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21194f(t, j2, C7538k4.m21176C(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21195g(t, j2, C7538k4.m21212x(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21197i(t, j2, C7538k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21197i(t, j2, C7538k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21197i(t, j2, C7538k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21199k(t, j2, C7538k4.m21211w(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21198j(t, j2, C7538k4.m21179F(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m21057A(t, t2, i2);
                    break;
                case 10:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21198j(t, j2, C7538k4.m21179F(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21197i(t, j2, C7538k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21196h(t, j2, C7538k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m21058B(t2, i2)) {
                        C7538k4.m21197i(t, j2, C7538k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m21057A(t, t2, i2);
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
                    this.f27747p.mo21401c(t, t2, j2);
                    break;
                case 50:
                    C7579r3.m21379n(this.f27750s, t, t2, j2);
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
                    if (m21059C(t2, i3, i2)) {
                        C7538k4.m21198j(t, j2, C7538k4.m21179F(t2, j2));
                        m21066J(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m21068L(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m21059C(t2, i3, i2)) {
                        C7538k4.m21198j(t, j2, C7538k4.m21179F(t2, j2));
                        m21066J(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m21068L(t, t2, i2);
                    break;
            }
        }
        if (this.f27741j) {
            return;
        }
        C7579r3.m21380o(this.f27748q, t, t2);
        if (this.f27739h) {
            C7579r3.m21378m(this.f27749r, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0486, code lost:
    
        if (r7 == (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0488, code lost:
    
        r26.putInt(r13, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x048e, code lost:
    
        r1 = null;
        r2 = r10.f27744m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0493, code lost:
    
        if (r2 >= r10.f27745n) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0495, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.zzhy) r10.m21088t(r13, r10.f27743l[r2], r1, r10.f27748q);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a4, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a6, code lost:
    
        r10.f27748q.mo21138n(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04ab, code lost:
    
        if (r8 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04af, code lost:
    
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04b6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzfo.m22302g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b9, code lost:
    
        if (r0 > r33) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04bb, code lost:
    
        if (r3 != r8) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04bd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04c3, code lost:
    
        throw com.google.android.gms.internal.measurement.zzfo.m22302g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m21105p(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.C7547m1 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7513g3.m21105p(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.m1):int");
    }
}
