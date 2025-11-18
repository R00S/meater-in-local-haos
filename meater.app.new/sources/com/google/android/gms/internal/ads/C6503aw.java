package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.aw */
/* loaded from: classes2.dex */
final class C6503aw<T> implements InterfaceC6910lw<T> {

    /* renamed from: a */
    private static final int[] f18185a = new int[0];

    /* renamed from: b */
    private static final Unsafe f18186b = C6726gx.m15216r();

    /* renamed from: c */
    private final int[] f18187c;

    /* renamed from: d */
    private final Object[] f18188d;

    /* renamed from: e */
    private final int f18189e;

    /* renamed from: f */
    private final int f18190f;

    /* renamed from: g */
    private final zzdpk f18191g;

    /* renamed from: h */
    private final boolean f18192h;

    /* renamed from: i */
    private final boolean f18193i;

    /* renamed from: j */
    private final boolean f18194j;

    /* renamed from: k */
    private final boolean f18195k;

    /* renamed from: l */
    private final int[] f18196l;

    /* renamed from: m */
    private final int f18197m;

    /* renamed from: n */
    private final int f18198n;

    /* renamed from: o */
    private final InterfaceC6577cw f18199o;

    /* renamed from: p */
    private final AbstractC6872kv f18200p;

    /* renamed from: q */
    private final AbstractC6578cx<?, ?> f18201q;

    /* renamed from: r */
    private final AbstractC7278vu<?> f18202r;

    /* renamed from: s */
    private final InterfaceC7242uv f18203s;

    private C6503aw(int[] iArr, Object[] objArr, int i2, int i3, zzdpk zzdpkVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, InterfaceC6577cw interfaceC6577cw, AbstractC6872kv abstractC6872kv, AbstractC6578cx<?, ?> abstractC6578cx, AbstractC7278vu<?> abstractC7278vu, InterfaceC7242uv interfaceC7242uv) {
        this.f18187c = iArr;
        this.f18188d = objArr;
        this.f18189e = i2;
        this.f18190f = i3;
        this.f18193i = zzdpkVar instanceof zzdob;
        this.f18194j = z;
        this.f18192h = abstractC7278vu != null && abstractC7278vu.mo15964h(zzdpkVar);
        this.f18195k = false;
        this.f18196l = iArr2;
        this.f18197m = i4;
        this.f18198n = i5;
        this.f18199o = interfaceC6577cw;
        this.f18200p = abstractC6872kv;
        this.f18201q = abstractC6578cx;
        this.f18202r = abstractC7278vu;
        this.f18191g = zzdpkVar;
        this.f18203s = interfaceC7242uv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private static boolean m14783A(Object obj, int i2, InterfaceC6910lw interfaceC6910lw) {
        return interfaceC6910lw.mo14830j(C6726gx.m15190L(obj, i2 & 1048575));
    }

    /* renamed from: B */
    private final int m14784B(int i2, int i3) {
        if (i2 < this.f18189e || i2 > this.f18190f) {
            return -1;
        }
        return m14785C(i2, i3);
    }

    /* renamed from: C */
    private final int m14785C(int i2, int i3) {
        int length = (this.f18187c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f18187c[i5];
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

    /* renamed from: D */
    private static zzdqu m14786D(Object obj) {
        zzdob zzdobVar = (zzdob) obj;
        zzdqu zzdquVar = zzdobVar.zzhhd;
        if (zzdquVar != zzdqu.m19782f()) {
            return zzdquVar;
        }
        zzdqu zzdquVarM19784i = zzdqu.m19784i();
        zzdobVar.zzhhd = zzdquVarM19784i;
        return zzdquVarM19784i;
    }

    /* renamed from: E */
    private final void m14787E(T t, int i2, int i3) {
        C6726gx.m15212n(t, m14800R(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m14788F(T r19, com.google.android.gms.internal.ads.InterfaceC7244ux r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.m14788F(java.lang.Object, com.google.android.gms.internal.ads.ux):void");
    }

    /* renamed from: G */
    private final void m14789G(T t, T t2, int i2) {
        int iM14799Q = m14799Q(i2);
        int i3 = this.f18187c[i2];
        long j2 = iM14799Q & 1048575;
        if (m14819y(t2, i3, i2)) {
            Object objM15190L = C6726gx.m15190L(t, j2);
            Object objM15190L2 = C6726gx.m15190L(t2, j2);
            if (objM15190L != null && objM15190L2 != null) {
                C6726gx.m15205g(t, j2, zzdod.m19746g(objM15190L, objM15190L2));
                m14787E(t, i3, i2);
            } else if (objM15190L2 != null) {
                C6726gx.m15205g(t, j2, objM15190L2);
                m14787E(t, i3, i2);
            }
        }
    }

    /* renamed from: H */
    private final boolean m14790H(T t, T t2, int i2) {
        return m14791I(t, i2) == m14791I(t2, i2);
    }

    /* renamed from: I */
    private final boolean m14791I(T t, int i2) {
        if (!this.f18194j) {
            int iM14800R = m14800R(i2);
            return (C6726gx.m15183E(t, (long) (iM14800R & 1048575)) & (1 << (iM14800R >>> 20))) != 0;
        }
        int iM14799Q = m14799Q(i2);
        long j2 = iM14799Q & 1048575;
        switch ((iM14799Q & 267386880) >>> 20) {
            case 0:
                return C6726gx.m15189K(t, j2) != 0.0d;
            case 1:
                return C6726gx.m15187I(t, j2) != 0.0f;
            case 2:
                return C6726gx.m15184F(t, j2) != 0;
            case 3:
                return C6726gx.m15184F(t, j2) != 0;
            case 4:
                return C6726gx.m15183E(t, j2) != 0;
            case 5:
                return C6726gx.m15184F(t, j2) != 0;
            case 6:
                return C6726gx.m15183E(t, j2) != 0;
            case 7:
                return C6726gx.m15186H(t, j2);
            case 8:
                Object objM15190L = C6726gx.m15190L(t, j2);
                if (objM15190L instanceof String) {
                    return !((String) objM15190L).isEmpty();
                }
                if (objM15190L instanceof zzdmr) {
                    return !zzdmr.f25661f.equals(objM15190L);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6726gx.m15190L(t, j2) != null;
            case 10:
                return !zzdmr.f25661f.equals(C6726gx.m15190L(t, j2));
            case 11:
                return C6726gx.m15183E(t, j2) != 0;
            case 12:
                return C6726gx.m15183E(t, j2) != 0;
            case 13:
                return C6726gx.m15183E(t, j2) != 0;
            case 14:
                return C6726gx.m15184F(t, j2) != 0;
            case 15:
                return C6726gx.m15183E(t, j2) != 0;
            case 16:
                return C6726gx.m15184F(t, j2) != 0;
            case 17:
                return C6726gx.m15190L(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: J */
    private static <E> List<E> m14792J(Object obj, long j2) {
        return (List) C6726gx.m15190L(obj, j2);
    }

    /* renamed from: K */
    private final void m14793K(T t, int i2) {
        if (this.f18194j) {
            return;
        }
        int iM14800R = m14800R(i2);
        long j2 = iM14800R & 1048575;
        C6726gx.m15212n(t, j2, C6726gx.m15183E(t, j2) | (1 << (iM14800R >>> 20)));
    }

    /* renamed from: L */
    private static <T> double m14794L(T t, long j2) {
        return ((Double) C6726gx.m15190L(t, j2)).doubleValue();
    }

    /* renamed from: M */
    private static <T> float m14795M(T t, long j2) {
        return ((Float) C6726gx.m15190L(t, j2)).floatValue();
    }

    /* renamed from: N */
    private final InterfaceC6910lw m14796N(int i2) {
        int i3 = (i2 / 3) << 1;
        InterfaceC6910lw interfaceC6910lw = (InterfaceC6910lw) this.f18188d[i3];
        if (interfaceC6910lw != null) {
            return interfaceC6910lw;
        }
        InterfaceC6910lw<T> interfaceC6910lwM15178c = C6725gw.m15176b().m15178c((Class) this.f18188d[i3 + 1]);
        this.f18188d[i3] = interfaceC6910lwM15178c;
        return interfaceC6910lwM15178c;
    }

    /* renamed from: O */
    private final Object m14797O(int i2) {
        return this.f18188d[(i2 / 3) << 1];
    }

    /* renamed from: P */
    private final zzdog m14798P(int i2) {
        return (zzdog) this.f18188d[((i2 / 3) << 1) + 1];
    }

    /* renamed from: Q */
    private final int m14799Q(int i2) {
        return this.f18187c[i2 + 1];
    }

    /* renamed from: R */
    private final int m14800R(int i2) {
        return this.f18187c[i2 + 2];
    }

    /* renamed from: S */
    private static boolean m14801S(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* renamed from: T */
    private final int m14802T(int i2) {
        if (i2 < this.f18189e || i2 > this.f18190f) {
            return -1;
        }
        return m14785C(i2, 0);
    }

    /* renamed from: U */
    private static <T> int m14803U(T t, long j2) {
        return ((Integer) C6726gx.m15190L(t, j2)).intValue();
    }

    /* renamed from: V */
    private static <T> long m14804V(T t, long j2) {
        return ((Long) C6726gx.m15190L(t, j2)).longValue();
    }

    /* renamed from: W */
    private static <T> boolean m14805W(T t, long j2) {
        return ((Boolean) C6726gx.m15190L(t, j2)).booleanValue();
    }

    /* renamed from: k */
    private static <UT, UB> int m14806k(AbstractC6578cx<UT, UB> abstractC6578cx, T t) {
        return abstractC6578cx.mo15004i(abstractC6578cx.mo15005j(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: l */
    private final int m14807l(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C6538bu c6538bu) throws IOException {
        int iM14775j;
        Unsafe unsafe = f18186b;
        long j3 = this.f18187c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(C6501au.m14781p(bArr, i2)));
                    iM14775j = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(C6501au.m14782q(bArr, i2)));
                    iM14775j = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    iM14775j = C6501au.m14775j(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, Long.valueOf(c6538bu.f18357b));
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    iM14775j = C6501au.m14773h(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, Integer.valueOf(c6538bu.f18356a));
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(C6501au.m14780o(bArr, i2)));
                    iM14775j = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(C6501au.m14779n(bArr, i2)));
                    iM14775j = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    iM14775j = C6501au.m14775j(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, Boolean.valueOf(c6538bu.f18357b != 0));
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int iM14773h = C6501au.m14773h(bArr, i2, c6538bu);
                    int i10 = c6538bu.f18356a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i7 & 536870912) != 0 && !C6837jx.m15384k(bArr, iM14773h, iM14773h + i10)) {
                            throw zzdok.m19757h();
                        }
                        unsafe.putObject(t, j2, new String(bArr, iM14773h, i10, zzdod.f25772a));
                        iM14773h += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM14773h;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int iM14772g = C6501au.m14772g(m14796N(i9), bArr, i2, i3, c6538bu);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, c6538bu.f18358c);
                    } else {
                        unsafe.putObject(t, j2, zzdod.m19746g(object, c6538bu.f18358c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM14772g;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    iM14775j = C6501au.m14778m(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, c6538bu.f18358c);
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int iM14773h2 = C6501au.m14773h(bArr, i2, c6538bu);
                    int i11 = c6538bu.f18356a;
                    zzdog zzdogVarM14798P = m14798P(i9);
                    if (zzdogVarM14798P != null && !zzdogVarM14798P.mo14954a(i11)) {
                        m14786D(t).m19791k(i4, Long.valueOf(i11));
                        return iM14773h2;
                    }
                    unsafe.putObject(t, j2, Integer.valueOf(i11));
                    iM14775j = iM14773h2;
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    iM14775j = C6501au.m14773h(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, Integer.valueOf(zzdnd.m19606B(c6538bu.f18356a)));
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    iM14775j = C6501au.m14775j(bArr, i2, c6538bu);
                    unsafe.putObject(t, j2, Long.valueOf(zzdnd.m19608w(c6538bu.f18357b)));
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    iM14775j = C6501au.m14771f(m14796N(i9), bArr, i2, i3, (i4 & (-8)) | 4, c6538bu);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, c6538bu.f18358c);
                    } else {
                        unsafe.putObject(t, j2, zzdod.m19746g(object2, c6538bu.f18358c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iM14775j;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private final int m14808m(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, C6538bu c6538bu) throws IOException {
        int iM14773h;
        int iM14773h2 = i2;
        Unsafe unsafe = f18186b;
        zzdoj zzdojVarMo14989N = (zzdoj) unsafe.getObject(t, j3);
        if (!zzdojVarMo14989N.mo16107m0()) {
            int size = zzdojVarMo14989N.size();
            zzdojVarMo14989N = zzdojVarMo14989N.mo14989N(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, zzdojVarMo14989N);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    C7204tu c7204tu = (C7204tu) zzdojVarMo14989N;
                    int iM14773h3 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i9 = c6538bu.f18356a + iM14773h3;
                    while (iM14773h3 < i9) {
                        c7204tu.m15911f(C6501au.m14781p(bArr, iM14773h3));
                        iM14773h3 += 8;
                    }
                    if (iM14773h3 == i9) {
                        return iM14773h3;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 1) {
                    C7204tu c7204tu2 = (C7204tu) zzdojVarMo14989N;
                    c7204tu2.m15911f(C6501au.m14781p(bArr, i2));
                    while (true) {
                        int i10 = iM14773h2 + 8;
                        if (i10 >= i3) {
                            return i10;
                        }
                        iM14773h2 = C6501au.m14773h(bArr, i10, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return i10;
                        }
                        c7204tu2.m15911f(C6501au.m14781p(bArr, iM14773h2));
                    }
                }
                return iM14773h2;
            case 19:
            case 36:
                if (i6 == 2) {
                    C6576cv c6576cv = (C6576cv) zzdojVarMo14989N;
                    int iM14773h4 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i11 = c6538bu.f18356a + iM14773h4;
                    while (iM14773h4 < i11) {
                        c6576cv.m14994i(C6501au.m14782q(bArr, iM14773h4));
                        iM14773h4 += 4;
                    }
                    if (iM14773h4 == i11) {
                        return iM14773h4;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 5) {
                    C6576cv c6576cv2 = (C6576cv) zzdojVarMo14989N;
                    c6576cv2.m14994i(C6501au.m14782q(bArr, i2));
                    while (true) {
                        int i12 = iM14773h2 + 4;
                        if (i12 >= i3) {
                            return i12;
                        }
                        iM14773h2 = C6501au.m14773h(bArr, i12, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return i12;
                        }
                        c6576cv2.m14994i(C6501au.m14782q(bArr, iM14773h2));
                    }
                }
                return iM14773h2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    C7020ov c7020ov = (C7020ov) zzdojVarMo14989N;
                    int iM14773h5 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i13 = c6538bu.f18356a + iM14773h5;
                    while (iM14773h5 < i13) {
                        iM14773h5 = C6501au.m14775j(bArr, iM14773h5, c6538bu);
                        c7020ov.m15693i(c6538bu.f18357b);
                    }
                    if (iM14773h5 == i13) {
                        return iM14773h5;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C7020ov c7020ov2 = (C7020ov) zzdojVarMo14989N;
                    int iM14775j = C6501au.m14775j(bArr, iM14773h2, c6538bu);
                    c7020ov2.m15693i(c6538bu.f18357b);
                    while (iM14775j < i3) {
                        int iM14773h6 = C6501au.m14773h(bArr, iM14775j, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return iM14775j;
                        }
                        iM14775j = C6501au.m14775j(bArr, iM14773h6, c6538bu);
                        c7020ov2.m15693i(c6538bu.f18357b);
                    }
                    return iM14775j;
                }
                return iM14773h2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return C6501au.m14774i(bArr, iM14773h2, zzdojVarMo14989N, c6538bu);
                }
                if (i6 == 0) {
                    return C6501au.m14767b(i4, bArr, i2, i3, zzdojVarMo14989N, c6538bu);
                }
                return iM14773h2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    C7020ov c7020ov3 = (C7020ov) zzdojVarMo14989N;
                    int iM14773h7 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i14 = c6538bu.f18356a + iM14773h7;
                    while (iM14773h7 < i14) {
                        c7020ov3.m15693i(C6501au.m14780o(bArr, iM14773h7));
                        iM14773h7 += 8;
                    }
                    if (iM14773h7 == i14) {
                        return iM14773h7;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 1) {
                    C7020ov c7020ov4 = (C7020ov) zzdojVarMo14989N;
                    c7020ov4.m15693i(C6501au.m14780o(bArr, i2));
                    while (true) {
                        int i15 = iM14773h2 + 8;
                        if (i15 >= i3) {
                            return i15;
                        }
                        iM14773h2 = C6501au.m14773h(bArr, i15, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return i15;
                        }
                        c7020ov4.m15693i(C6501au.m14780o(bArr, iM14773h2));
                    }
                }
                return iM14773h2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    C6724gv c6724gv = (C6724gv) zzdojVarMo14989N;
                    int iM14773h8 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i16 = c6538bu.f18356a + iM14773h8;
                    while (iM14773h8 < i16) {
                        c6724gv.mo15174Z0(C6501au.m14779n(bArr, iM14773h8));
                        iM14773h8 += 4;
                    }
                    if (iM14773h8 == i16) {
                        return iM14773h8;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 5) {
                    C6724gv c6724gv2 = (C6724gv) zzdojVarMo14989N;
                    c6724gv2.mo15174Z0(C6501au.m14779n(bArr, i2));
                    while (true) {
                        int i17 = iM14773h2 + 4;
                        if (i17 >= i3) {
                            return i17;
                        }
                        iM14773h2 = C6501au.m14773h(bArr, i17, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return i17;
                        }
                        c6724gv2.mo15174Z0(C6501au.m14779n(bArr, iM14773h2));
                    }
                }
                return iM14773h2;
            case 25:
            case 42:
                if (i6 == 2) {
                    C6575cu c6575cu = (C6575cu) zzdojVarMo14989N;
                    iM14773h = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i18 = c6538bu.f18356a + iM14773h;
                    while (iM14773h < i18) {
                        iM14773h = C6501au.m14775j(bArr, iM14773h, c6538bu);
                        c6575cu.m14990f(c6538bu.f18357b != 0);
                    }
                    if (iM14773h != i18) {
                        throw zzdok.m19750a();
                    }
                    return iM14773h;
                }
                if (i6 == 0) {
                    C6575cu c6575cu2 = (C6575cu) zzdojVarMo14989N;
                    iM14773h2 = C6501au.m14775j(bArr, iM14773h2, c6538bu);
                    c6575cu2.m14990f(c6538bu.f18357b != 0);
                    while (iM14773h2 < i3) {
                        int iM14773h9 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                        if (i4 == c6538bu.f18356a) {
                            iM14773h2 = C6501au.m14775j(bArr, iM14773h9, c6538bu);
                            c6575cu2.m14990f(c6538bu.f18357b != 0);
                        }
                    }
                }
                return iM14773h2;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        iM14773h2 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                        int i19 = c6538bu.f18356a;
                        if (i19 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i19 == 0) {
                            zzdojVarMo14989N.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzdojVarMo14989N.add(new String(bArr, iM14773h2, i19, zzdod.f25772a));
                            iM14773h2 += i19;
                        }
                        while (iM14773h2 < i3) {
                            int iM14773h10 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                            if (i4 == c6538bu.f18356a) {
                                iM14773h2 = C6501au.m14773h(bArr, iM14773h10, c6538bu);
                                int i20 = c6538bu.f18356a;
                                if (i20 < 0) {
                                    throw zzdok.m19751b();
                                }
                                if (i20 == 0) {
                                    zzdojVarMo14989N.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    zzdojVarMo14989N.add(new String(bArr, iM14773h2, i20, zzdod.f25772a));
                                    iM14773h2 += i20;
                                }
                            }
                        }
                    } else {
                        iM14773h2 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                        int i21 = c6538bu.f18356a;
                        if (i21 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i21 == 0) {
                            zzdojVarMo14989N.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i22 = iM14773h2 + i21;
                            if (!C6837jx.m15384k(bArr, iM14773h2, i22)) {
                                throw zzdok.m19757h();
                            }
                            zzdojVarMo14989N.add(new String(bArr, iM14773h2, i21, zzdod.f25772a));
                            iM14773h2 = i22;
                        }
                        while (iM14773h2 < i3) {
                            int iM14773h11 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                            if (i4 == c6538bu.f18356a) {
                                iM14773h2 = C6501au.m14773h(bArr, iM14773h11, c6538bu);
                                int i23 = c6538bu.f18356a;
                                if (i23 < 0) {
                                    throw zzdok.m19751b();
                                }
                                if (i23 == 0) {
                                    zzdojVarMo14989N.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i24 = iM14773h2 + i23;
                                    if (!C6837jx.m15384k(bArr, iM14773h2, i24)) {
                                        throw zzdok.m19757h();
                                    }
                                    zzdojVarMo14989N.add(new String(bArr, iM14773h2, i23, zzdod.f25772a));
                                    iM14773h2 = i24;
                                }
                            }
                        }
                    }
                }
                return iM14773h2;
            case 27:
                if (i6 == 2) {
                    return C6501au.m14770e(m14796N(i7), i4, bArr, i2, i3, zzdojVarMo14989N, c6538bu);
                }
                return iM14773h2;
            case 28:
                if (i6 == 2) {
                    int iM14773h12 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i25 = c6538bu.f18356a;
                    if (i25 < 0) {
                        throw zzdok.m19751b();
                    }
                    if (i25 > bArr.length - iM14773h12) {
                        throw zzdok.m19750a();
                    }
                    if (i25 == 0) {
                        zzdojVarMo14989N.add(zzdmr.f25661f);
                    } else {
                        zzdojVarMo14989N.add(zzdmr.m19595A(bArr, iM14773h12, i25));
                        iM14773h12 += i25;
                    }
                    while (iM14773h12 < i3) {
                        int iM14773h13 = C6501au.m14773h(bArr, iM14773h12, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return iM14773h12;
                        }
                        iM14773h12 = C6501au.m14773h(bArr, iM14773h13, c6538bu);
                        int i26 = c6538bu.f18356a;
                        if (i26 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i26 > bArr.length - iM14773h12) {
                            throw zzdok.m19750a();
                        }
                        if (i26 == 0) {
                            zzdojVarMo14989N.add(zzdmr.f25661f);
                        } else {
                            zzdojVarMo14989N.add(zzdmr.m19595A(bArr, iM14773h12, i26));
                            iM14773h12 += i26;
                        }
                    }
                    return iM14773h12;
                }
                return iM14773h2;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        iM14773h = C6501au.m14767b(i4, bArr, i2, i3, zzdojVarMo14989N, c6538bu);
                    }
                    return iM14773h2;
                }
                iM14773h = C6501au.m14774i(bArr, iM14773h2, zzdojVarMo14989N, c6538bu);
                zzdob zzdobVar = (zzdob) t;
                zzdqu zzdquVar = zzdobVar.zzhhd;
                if (zzdquVar == zzdqu.m19782f()) {
                    zzdquVar = null;
                }
                zzdqu zzdquVar2 = (zzdqu) C6984nw.m15629b(i5, zzdojVarMo14989N, m14798P(i7), zzdquVar, this.f18201q);
                if (zzdquVar2 != null) {
                    zzdobVar.zzhhd = zzdquVar2;
                }
                return iM14773h;
            case 33:
            case 47:
                if (i6 == 2) {
                    C6724gv c6724gv3 = (C6724gv) zzdojVarMo14989N;
                    int iM14773h14 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i27 = c6538bu.f18356a + iM14773h14;
                    while (iM14773h14 < i27) {
                        iM14773h14 = C6501au.m14773h(bArr, iM14773h14, c6538bu);
                        c6724gv3.mo15174Z0(zzdnd.m19606B(c6538bu.f18356a));
                    }
                    if (iM14773h14 == i27) {
                        return iM14773h14;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C6724gv c6724gv4 = (C6724gv) zzdojVarMo14989N;
                    int iM14773h15 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    c6724gv4.mo15174Z0(zzdnd.m19606B(c6538bu.f18356a));
                    while (iM14773h15 < i3) {
                        int iM14773h16 = C6501au.m14773h(bArr, iM14773h15, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return iM14773h15;
                        }
                        iM14773h15 = C6501au.m14773h(bArr, iM14773h16, c6538bu);
                        c6724gv4.mo15174Z0(zzdnd.m19606B(c6538bu.f18356a));
                    }
                    return iM14773h15;
                }
                return iM14773h2;
            case 34:
            case 48:
                if (i6 == 2) {
                    C7020ov c7020ov5 = (C7020ov) zzdojVarMo14989N;
                    int iM14773h17 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                    int i28 = c6538bu.f18356a + iM14773h17;
                    while (iM14773h17 < i28) {
                        iM14773h17 = C6501au.m14775j(bArr, iM14773h17, c6538bu);
                        c7020ov5.m15693i(zzdnd.m19608w(c6538bu.f18357b));
                    }
                    if (iM14773h17 == i28) {
                        return iM14773h17;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C7020ov c7020ov6 = (C7020ov) zzdojVarMo14989N;
                    int iM14775j2 = C6501au.m14775j(bArr, iM14773h2, c6538bu);
                    c7020ov6.m15693i(zzdnd.m19608w(c6538bu.f18357b));
                    while (iM14775j2 < i3) {
                        int iM14773h18 = C6501au.m14773h(bArr, iM14775j2, c6538bu);
                        if (i4 != c6538bu.f18356a) {
                            return iM14775j2;
                        }
                        iM14775j2 = C6501au.m14775j(bArr, iM14773h18, c6538bu);
                        c7020ov6.m15693i(zzdnd.m19608w(c6538bu.f18357b));
                    }
                    return iM14775j2;
                }
                return iM14773h2;
            case 49:
                if (i6 == 3) {
                    InterfaceC6910lw interfaceC6910lwM14796N = m14796N(i7);
                    int i29 = (i4 & (-8)) | 4;
                    iM14773h2 = C6501au.m14771f(interfaceC6910lwM14796N, bArr, i2, i3, i29, c6538bu);
                    zzdojVarMo14989N.add(c6538bu.f18358c);
                    while (iM14773h2 < i3) {
                        int iM14773h19 = C6501au.m14773h(bArr, iM14773h2, c6538bu);
                        if (i4 == c6538bu.f18356a) {
                            iM14773h2 = C6501au.m14771f(interfaceC6910lwM14796N, bArr, iM14773h19, i3, i29, c6538bu);
                            zzdojVarMo14989N.add(c6538bu.f18358c);
                        }
                    }
                }
                return iM14773h2;
            default:
                return iM14773h2;
        }
    }

    /* renamed from: n */
    private final <K, V> int m14809n(T t, byte[] bArr, int i2, int i3, int i4, long j2, C6538bu c6538bu) throws IOException {
        Unsafe unsafe = f18186b;
        Object objM14797O = m14797O(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.f18203s.mo15938c(object)) {
            Object objMo15940e = this.f18203s.mo15940e(objM14797O);
            this.f18203s.mo15936a(objMo15940e, object);
            unsafe.putObject(t, j2, objMo15940e);
            object = objMo15940e;
        }
        this.f18203s.mo15942g(objM14797O);
        this.f18203s.mo15943h(object);
        int iM14773h = C6501au.m14773h(bArr, i2, c6538bu);
        int i5 = c6538bu.f18356a;
        if (i5 < 0 || i5 > i3 - iM14773h) {
            throw zzdok.m19750a();
        }
        throw null;
    }

    /* renamed from: p */
    static <T> C6503aw<T> m14810p(Class<T> cls, InterfaceC7353xv interfaceC7353xv, InterfaceC6577cw interfaceC6577cw, AbstractC6872kv abstractC6872kv, AbstractC6578cx<?, ?> abstractC6578cx, AbstractC7278vu<?> abstractC7278vu, InterfaceC7242uv interfaceC7242uv) {
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
        C6799iw c6799iw;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        Class<?> cls2;
        String str;
        int iObjectFieldOffset2;
        int i22;
        Field fieldM14813s;
        int i23;
        char cCharAt9;
        int i24;
        Field fieldM14813s2;
        Field fieldM14813s3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        char cCharAt14;
        if (!(interfaceC7353xv instanceof C6799iw)) {
            ((C7391yw) interfaceC7353xv).mo15355c();
            throw new NoSuchMethodError();
        }
        C6799iw c6799iw2 = (C6799iw) interfaceC7353xv;
        int i29 = 0;
        boolean z2 = c6799iw2.mo15355c() == zzdob.zze.f25767j;
        String strM15356d = c6799iw2.m15356d();
        int length = strM15356d.length();
        int iCharAt3 = strM15356d.charAt(0);
        if (iCharAt3 >= 55296) {
            int i30 = iCharAt3 & 8191;
            int i31 = 1;
            int i32 = 13;
            while (true) {
                i2 = i31 + 1;
                cCharAt14 = strM15356d.charAt(i31);
                if (cCharAt14 < 55296) {
                    break;
                }
                i30 |= (cCharAt14 & 8191) << i32;
                i32 += 13;
                i31 = i2;
            }
            iCharAt3 = i30 | (cCharAt14 << i32);
        } else {
            i2 = 1;
        }
        int i33 = i2 + 1;
        int iCharAt4 = strM15356d.charAt(i2);
        if (iCharAt4 >= 55296) {
            int i34 = iCharAt4 & 8191;
            int i35 = 13;
            while (true) {
                i28 = i33 + 1;
                cCharAt13 = strM15356d.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i28;
            }
            iCharAt4 = i34 | (cCharAt13 << i35);
            i33 = i28;
        }
        if (iCharAt4 == 0) {
            iArr = f18185a;
            i7 = 0;
            i4 = 0;
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i6 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt5 = strM15356d.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strM15356d.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt5 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt6 = strM15356d.charAt(i36);
            if (iCharAt6 >= 55296) {
                int i40 = iCharAt6 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strM15356d.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt6 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            iCharAt = strM15356d.charAt(i39);
            if (iCharAt >= 55296) {
                int i43 = iCharAt & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strM15356d.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt7 = strM15356d.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strM15356d.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt7 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt2 = strM15356d.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strM15356d.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt2 = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strM15356d.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strM15356d.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt8 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt9 = strM15356d.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = strM15356d.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i56 = i9;
                }
                iCharAt9 = i55 | (cCharAt2 << i57);
                i3 = i9;
            } else {
                i3 = i54;
            }
            int i58 = i3 + 1;
            int iCharAt10 = strM15356d.charAt(i3);
            if (iCharAt10 >= 55296) {
                int i59 = iCharAt10 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i8 = i60 + 1;
                    cCharAt = strM15356d.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i60 = i8;
                }
                iCharAt10 = i59 | (cCharAt << i61);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            int i62 = (iCharAt5 << 1) + iCharAt6;
            i4 = iCharAt7;
            i5 = i62;
            i6 = iCharAt10;
            i29 = iCharAt5;
            i33 = i58;
            int i63 = iCharAt8;
            iArr = iArr2;
            i7 = i63;
        }
        Unsafe unsafe = f18186b;
        Object[] objArrM15357e = c6799iw2.m15357e();
        Class<?> cls3 = c6799iw2.mo15354b().getClass();
        int i64 = i33;
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 << 1];
        int i65 = i6 + i7;
        int i66 = i6;
        int i67 = i64;
        int i68 = i65;
        int i69 = 0;
        int i70 = 0;
        while (i67 < length) {
            int i71 = i67 + 1;
            int iCharAt11 = strM15356d.charAt(i67);
            int i72 = length;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i27 = i74 + 1;
                    cCharAt12 = strM15356d.charAt(i74);
                    i16 = i6;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i27;
                    i6 = i16;
                }
                iCharAt11 = i73 | (cCharAt12 << i75);
                i17 = i27;
            } else {
                i16 = i6;
                i17 = i71;
            }
            int i76 = i17 + 1;
            int iCharAt12 = strM15356d.charAt(i17);
            if (iCharAt12 >= 55296) {
                int i77 = iCharAt12 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i26 = i78 + 1;
                    cCharAt11 = strM15356d.charAt(i78);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i26;
                    z2 = z;
                }
                iCharAt12 = i77 | (cCharAt11 << i79);
                i18 = i26;
            } else {
                z = z2;
                i18 = i76;
            }
            int i80 = iCharAt12 & 255;
            int i81 = i4;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i82 = iCharAt;
            if (i80 >= 51) {
                int i83 = i18 + 1;
                int iCharAt13 = strM15356d.charAt(i18);
                char c2 = 55296;
                if (iCharAt13 >= 55296) {
                    int i84 = iCharAt13 & 8191;
                    int i85 = 13;
                    while (true) {
                        i25 = i83 + 1;
                        cCharAt10 = strM15356d.charAt(i83);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i25;
                        c2 = 55296;
                    }
                    iCharAt13 = i84 | (cCharAt10 << i85);
                    i83 = i25;
                }
                int i86 = i80 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    objArr[((i70 / 3) << 1) + 1] = objArrM15357e[i5];
                    i5++;
                } else if (i86 == 12 && (iCharAt3 & 1) == 1) {
                    objArr[((i70 / 3) << 1) + 1] = objArrM15357e[i5];
                    i5++;
                }
                int i88 = iCharAt13 << 1;
                Object obj = objArrM15357e[i88];
                if (obj instanceof Field) {
                    fieldM14813s2 = (Field) obj;
                } else {
                    fieldM14813s2 = m14813s(cls3, (String) obj);
                    objArrM15357e[i88] = fieldM14813s2;
                }
                c6799iw = c6799iw2;
                String str2 = strM15356d;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14813s2);
                int i89 = i88 + 1;
                Object obj2 = objArrM15357e[i89];
                if (obj2 instanceof Field) {
                    fieldM14813s3 = (Field) obj2;
                } else {
                    fieldM14813s3 = m14813s(cls3, (String) obj2);
                    objArrM15357e[i89] = fieldM14813s3;
                }
                cls2 = cls3;
                i20 = i5;
                i18 = i87;
                str = str2;
                i22 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14813s3);
                i21 = i29;
            } else {
                c6799iw = c6799iw2;
                String str3 = strM15356d;
                int i90 = i5 + 1;
                Field fieldM14813s4 = m14813s(cls3, (String) objArrM15357e[i5]);
                if (i80 == 9 || i80 == 17) {
                    i19 = 1;
                    objArr[((i70 / 3) << 1) + 1] = fieldM14813s4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i19 = 1;
                        i24 = i90 + 1;
                        objArr[((i70 / 3) << 1) + 1] = objArrM15357e[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i19 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = objArrM15357e[i90];
                        }
                    } else if (i80 == 50) {
                        int i91 = i66 + 1;
                        iArr[i66] = i70;
                        int i92 = (i70 / 3) << 1;
                        int i93 = i90 + 1;
                        objArr[i92] = objArrM15357e[i90];
                        if ((iCharAt12 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 0) {
                            i90 = i93 + 1;
                            objArr[i92 + 1] = objArrM15357e[i93];
                            i66 = i91;
                            i19 = 1;
                        } else {
                            i90 = i93;
                            i19 = 1;
                            i66 = i91;
                        }
                    } else {
                        i19 = 1;
                    }
                    i90 = i24;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14813s4);
                if ((iCharAt3 & 1) != i19 || i80 > 17) {
                    i20 = i90;
                    i21 = i29;
                    cls2 = cls3;
                    str = str3;
                    iObjectFieldOffset2 = 0;
                    i22 = 0;
                } else {
                    int i94 = i18 + 1;
                    str = str3;
                    int iCharAt14 = str.charAt(i18);
                    if (iCharAt14 >= 55296) {
                        int i95 = iCharAt14 & 8191;
                        int i96 = 13;
                        while (true) {
                            i23 = i94 + 1;
                            cCharAt9 = str.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i23;
                        }
                        iCharAt14 = i95 | (cCharAt9 << i96);
                        i94 = i23;
                    }
                    int i97 = (i29 << 1) + (iCharAt14 / 32);
                    Object obj3 = objArrM15357e[i97];
                    i20 = i90;
                    if (obj3 instanceof Field) {
                        fieldM14813s = (Field) obj3;
                    } else {
                        fieldM14813s = m14813s(cls3, (String) obj3);
                        objArrM15357e[i97] = fieldM14813s;
                    }
                    i21 = i29;
                    cls2 = cls3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14813s);
                    i22 = iCharAt14 % 32;
                    i18 = i94;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i98 = i70 + 1;
            iArr3[i70] = iCharAt11;
            int i99 = i98 + 1;
            iArr3[i98] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i80 << 20);
            i70 = i99 + 1;
            iArr3[i99] = (i22 << 20) | iObjectFieldOffset2;
            i29 = i21;
            strM15356d = str;
            i67 = i18;
            cls3 = cls2;
            i4 = i81;
            length = i72;
            i6 = i16;
            z2 = z;
            iCharAt = i82;
            i5 = i20;
            c6799iw2 = c6799iw;
        }
        return new C6503aw<>(iArr3, objArr, iCharAt, i4, c6799iw2.mo15354b(), z2, false, iArr, i6, i65, interfaceC6577cw, abstractC6872kv, abstractC6578cx, abstractC7278vu, interfaceC7242uv);
    }

    /* renamed from: q */
    private final <K, V, UT, UB> UB m14811q(int i2, int i3, Map<K, V> map, zzdog zzdogVar, UB ub, AbstractC6578cx<UT, UB> abstractC6578cx) {
        C7205tv<?, ?> c7205tvMo15942g = this.f18203s.mo15942g(m14797O(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzdogVar.mo14954a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC6578cx.mo15008m();
                }
                C6834ju c6834juM19600x = zzdmr.m19600x(zzdpc.m19770a(c7205tvMo15942g, next.getKey(), next.getValue()));
                try {
                    zzdpc.m19771b(c6834juM19600x.m15373b(), c7205tvMo15942g, next.getKey(), next.getValue());
                    abstractC6578cx.mo14997b(ub, i3, c6834juM19600x.m15372a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: r */
    private final <UT, UB> UB m14812r(Object obj, int i2, UB ub, AbstractC6578cx<UT, UB> abstractC6578cx) {
        zzdog zzdogVarM14798P;
        int i3 = this.f18187c[i2];
        Object objM15190L = C6726gx.m15190L(obj, m14799Q(i2) & 1048575);
        return (objM15190L == null || (zzdogVarM14798P = m14798P(i2)) == null) ? ub : (UB) m14811q(i2, i3, this.f18203s.mo15943h(objM15190L), zzdogVarM14798P, ub, abstractC6578cx);
    }

    /* renamed from: s */
    private static Field m14813s(Class<?> cls, String str) {
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

    /* renamed from: t */
    private static void m14814t(int i2, Object obj, InterfaceC7244ux interfaceC7244ux) throws IOException {
        if (obj instanceof String) {
            interfaceC7244ux.mo15877X(i2, (String) obj);
        } else {
            interfaceC7244ux.mo15862I(i2, (zzdmr) obj);
        }
    }

    /* renamed from: u */
    private static <UT, UB> void m14815u(AbstractC6578cx<UT, UB> abstractC6578cx, T t, InterfaceC7244ux interfaceC7244ux) throws IOException {
        abstractC6578cx.mo14999d(abstractC6578cx.mo15005j(t), interfaceC7244ux);
    }

    /* renamed from: v */
    private final <K, V> void m14816v(InterfaceC7244ux interfaceC7244ux, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            interfaceC7244ux.mo15875V(i2, this.f18203s.mo15942g(m14797O(i3)), this.f18203s.mo15937b(obj));
        }
    }

    /* renamed from: w */
    private final void m14817w(Object obj, int i2, InterfaceC6873kw interfaceC6873kw) throws IOException {
        if (m14801S(i2)) {
            C6726gx.m15205g(obj, i2 & 1048575, interfaceC6873kw.mo15455M());
        } else if (this.f18193i) {
            C6726gx.m15205g(obj, i2 & 1048575, interfaceC6873kw.mo15469a());
        } else {
            C6726gx.m15205g(obj, i2 & 1048575, interfaceC6873kw.mo15462T());
        }
    }

    /* renamed from: x */
    private final void m14818x(T t, T t2, int i2) {
        long jM14799Q = m14799Q(i2) & 1048575;
        if (m14791I(t2, i2)) {
            Object objM15190L = C6726gx.m15190L(t, jM14799Q);
            Object objM15190L2 = C6726gx.m15190L(t2, jM14799Q);
            if (objM15190L != null && objM15190L2 != null) {
                C6726gx.m15205g(t, jM14799Q, zzdod.m19746g(objM15190L, objM15190L2));
                m14793K(t, i2);
            } else if (objM15190L2 != null) {
                C6726gx.m15205g(t, jM14799Q, objM15190L2);
                m14793K(t, i2);
            }
        }
    }

    /* renamed from: y */
    private final boolean m14819y(T t, int i2, int i3) {
        return C6726gx.m15183E(t, (long) (m14800R(i3) & 1048575)) == i2;
    }

    /* renamed from: z */
    private final boolean m14820z(T t, int i2, int i3, int i4) {
        return this.f18194j ? m14791I(t, i2) : (i3 & i4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: a */
    public final void mo14821a(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f18187c.length; i2 += 3) {
            int iM14799Q = m14799Q(i2);
            long j2 = 1048575 & iM14799Q;
            int i3 = this.f18187c[i2];
            switch ((iM14799Q & 267386880) >>> 20) {
                case 0:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15202d(t, j2, C6726gx.m15189K(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15203e(t, j2, C6726gx.m15187I(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15204f(t, j2, C6726gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15204f(t, j2, C6726gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15204f(t, j2, C6726gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15206h(t, j2, C6726gx.m15186H(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15205g(t, j2, C6726gx.m15190L(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m14818x(t, t2, i2);
                    break;
                case 10:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15205g(t, j2, C6726gx.m15190L(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15204f(t, j2, C6726gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15212n(t, j2, C6726gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m14791I(t2, i2)) {
                        C6726gx.m15204f(t, j2, C6726gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m14818x(t, t2, i2);
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
                    this.f18200p.mo15442b(t, t2, j2);
                    break;
                case 50:
                    C6984nw.m15637g(this.f18203s, t, t2, j2);
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
                    if (m14819y(t2, i3, i2)) {
                        C6726gx.m15205g(t, j2, C6726gx.m15190L(t2, j2));
                        m14787E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m14789G(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14819y(t2, i3, i2)) {
                        C6726gx.m15205g(t, j2, C6726gx.m15190L(t2, j2));
                        m14787E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m14789G(t, t2, i2);
                    break;
            }
        }
        if (this.f18194j) {
            return;
        }
        C6984nw.m15638h(this.f18201q, t, t2);
        if (this.f18192h) {
            C6984nw.m15636f(this.f18202r, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo14822b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14822b(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: c */
    public final T mo14823c() {
        return (T) this.f18199o.mo14995a(this.f18191g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: d */
    public final int mo14824d(T t) {
        int i2;
        int iM19748i;
        int length = this.f18187c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM14799Q = m14799Q(i4);
            int i5 = this.f18187c[i4];
            long j2 = 1048575 & iM14799Q;
            int iHashCode = 37;
            switch ((iM14799Q & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(Double.doubleToLongBits(C6726gx.m15189K(t, j2)));
                    i3 = i2 + iM19748i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iM19748i = Float.floatToIntBits(C6726gx.m15187I(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(C6726gx.m15184F(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(C6726gx.m15184F(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(C6726gx.m15184F(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19747h(C6726gx.m15186H(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iM19748i = ((String) C6726gx.m15190L(t, j2)).hashCode();
                    i3 = i2 + iM19748i;
                    break;
                case 9:
                    Object objM15190L = C6726gx.m15190L(t, j2);
                    if (objM15190L != null) {
                        iHashCode = objM15190L.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15190L(t, j2).hashCode();
                    i3 = i2 + iM19748i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(C6726gx.m15184F(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15183E(t, j2);
                    i3 = i2 + iM19748i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iM19748i = zzdod.m19748i(C6726gx.m15184F(t, j2));
                    i3 = i2 + iM19748i;
                    break;
                case 17:
                    Object objM15190L2 = C6726gx.m15190L(t, j2);
                    if (objM15190L2 != null) {
                        iHashCode = objM15190L2.hashCode();
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
                    iM19748i = C6726gx.m15190L(t, j2).hashCode();
                    i3 = i2 + iM19748i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iM19748i = C6726gx.m15190L(t, j2).hashCode();
                    i3 = i2 + iM19748i;
                    break;
                case 51:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(Double.doubleToLongBits(m14794L(t, j2)));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = Float.floatToIntBits(m14795M(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19747h(m14805W(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = ((String) C6726gx.m15190L(t, j2)).hashCode();
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = C6726gx.m15190L(t, j2).hashCode();
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = C6726gx.m15190L(t, j2).hashCode();
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = m14803U(t, j2);
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        iM19748i = C6726gx.m15190L(t, j2).hashCode();
                        i3 = i2 + iM19748i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.f18201q.mo15005j(t).hashCode();
        return this.f18192h ? (iHashCode2 * 53) + this.f18202r.mo15965i(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo14825e(T r14, com.google.android.gms.internal.ads.InterfaceC7244ux r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14825e(java.lang.Object, com.google.android.gms.internal.ads.ux):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: f */
    public final void mo14826f(T t) {
        int i2;
        int i3 = this.f18197m;
        while (true) {
            i2 = this.f18198n;
            if (i3 >= i2) {
                break;
            }
            long jM14799Q = m14799Q(this.f18196l[i3]) & 1048575;
            Object objM15190L = C6726gx.m15190L(t, jM14799Q);
            if (objM15190L != null) {
                C6726gx.m15205g(t, jM14799Q, this.f18203s.mo15939d(objM15190L));
            }
            i3++;
        }
        int length = this.f18196l.length;
        while (i2 < length) {
            this.f18200p.mo15443e(t, this.f18196l[i2]);
            i2++;
        }
        this.f18201q.mo15002g(t);
        if (this.f18192h) {
            this.f18202r.mo15963g(t);
        }
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
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo14827g(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.C6538bu r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14827g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ce A[LOOP:5: B:163:0x05ca->B:165:0x05ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05db  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo14828h(T r13, com.google.android.gms.internal.ads.InterfaceC6873kw r14, com.google.android.gms.internal.ads.zzdno r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14828h(java.lang.Object, com.google.android.gms.internal.ads.kw, com.google.android.gms.internal.ads.zzdno):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0908 A[PHI: r6
      0x0908: PHI (r6v4 int) = 
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
      (r6v1 int)
      (r6v13 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v14 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:460:0x09b6, B:457:0x09ac, B:451:0x0990, B:448:0x097e, B:445:0x096f, B:442:0x0962, B:439:0x0955, B:435:0x094a, B:432:0x093f, B:429:0x0932, B:426:0x0925, B:423:0x0912, B:396:0x081e, B:390:0x0801, B:384:0x07e4, B:378:0x07c7, B:372:0x07a9, B:366:0x078b, B:360:0x076d, B:354:0x074f, B:348:0x0731, B:342:0x0713, B:336:0x06f5, B:330:0x06d7, B:324:0x06b9, B:318:0x069b, B:313:0x0667, B:310:0x065a, B:307:0x064a, B:304:0x063a, B:301:0x062a, B:298:0x061c, B:295:0x060f, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:437:0x0951, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:419:0x0907, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo14829i(T r20) {
        /*
            Method dump skipped, instructions count: 2904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14829i(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo14830j(T r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.mo14830j(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0493, code lost:
    
        if (r7 == (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0495, code lost:
    
        r26.putInt(r13, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x049b, code lost:
    
        r1 = null;
        r2 = r10.f18197m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a0, code lost:
    
        if (r2 >= r10.f18198n) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a2, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzdqu) r10.m14812r(r13, r10.f18196l[r2], r1, r10.f18201q);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b1, code lost:
    
        if (r1 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b3, code lost:
    
        r10.f18201q.mo15013r(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b8, code lost:
    
        if (r8 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04bc, code lost:
    
        if (r0 != r33) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04c3, code lost:
    
        throw com.google.android.gms.internal.ads.zzdok.m19756g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04c6, code lost:
    
        if (r0 > r33) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04c8, code lost:
    
        if (r3 != r8) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04ca, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04d0, code lost:
    
        throw com.google.android.gms.internal.ads.zzdok.m19756g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m14831o(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.ads.C6538bu r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6503aw.m14831o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.bu):int");
    }
}
