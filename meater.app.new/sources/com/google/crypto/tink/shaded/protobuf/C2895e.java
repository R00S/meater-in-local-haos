package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2915z;
import com.google.crypto.tink.shaded.protobuf.r0;

/* compiled from: ArrayDecoders.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2895e {

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37793a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f37793a = iArr;
            try {
                iArr[r0.b.f37927D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37793a[r0.b.f37928E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37793a[r0.b.f37929F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37793a[r0.b.f37930G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37793a[r0.b.f37931H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37793a[r0.b.f37939P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37793a[r0.b.f37932I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37793a[r0.b.f37942S.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37793a[r0.b.f37933J.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37793a[r0.b.f37941R.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37793a[r0.b.f37934K.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37793a[r0.b.f37943T.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37793a[r0.b.f37944U.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37793a[r0.b.f37940Q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37793a[r0.b.f37938O.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37793a[r0.b.f37935L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37793a[r0.b.f37936M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37793a[r0.b.f37937N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f37794a;

        /* renamed from: b, reason: collision with root package name */
        public long f37795b;

        /* renamed from: c, reason: collision with root package name */
        public Object f37796c;

        /* renamed from: d, reason: collision with root package name */
        public final C2905o f37797d;

        b(C2905o c2905o) {
            c2905o.getClass();
            this.f37797d = c2905o;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2914y c2914y = (C2914y) iVar;
        int I10 = I(bArr, i11, bVar);
        c2914y.X(AbstractC2899i.b(bVar.f37794a));
        while (I10 < i12) {
            int I11 = I(bArr, I10, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            I10 = I(bArr, I11, bVar);
            c2914y.X(AbstractC2899i.b(bVar.f37794a));
        }
        return I10;
    }

    static int B(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        G g10 = (G) iVar;
        int iL = L(bArr, i11, bVar);
        g10.j(AbstractC2899i.c(bVar.f37795b));
        while (iL < i12) {
            int I10 = I(bArr, iL, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            iL = L(bArr, I10, bVar);
            g10.j(AbstractC2899i.c(bVar.f37795b));
        }
        return iL;
    }

    static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            bVar.f37796c = "";
            return I10;
        }
        bVar.f37796c = new String(bArr, I10, i11, C2915z.f38061b);
        return I10 + i11;
    }

    static int D(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i11, bVar);
        int i13 = bVar.f37794a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, I10, i13, C2915z.f38061b));
            I10 += i13;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            I10 = I(bArr, I11, bVar);
            int i14 = bVar.f37794a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, I10, i14, C2915z.f38061b));
                I10 += i14;
            }
        }
        return I10;
    }

    static int E(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i11, bVar);
        int i13 = bVar.f37794a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            int i14 = I10 + i13;
            if (!q0.n(bArr, I10, i14)) {
                throw InvalidProtocolBufferException.d();
            }
            iVar.add(new String(bArr, I10, i13, C2915z.f38061b));
            I10 = i14;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            I10 = I(bArr, I11, bVar);
            int i15 = bVar.f37794a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i15 == 0) {
                iVar.add("");
            } else {
                int i16 = I10 + i15;
                if (!q0.n(bArr, I10, i16)) {
                    throw InvalidProtocolBufferException.d();
                }
                iVar.add(new String(bArr, I10, i15, C2915z.f38061b));
                I10 = i16;
            }
        }
        return I10;
    }

    static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            bVar.f37796c = "";
            return I10;
        }
        bVar.f37796c = q0.e(bArr, I10, i11);
        return I10 + i11;
    }

    static int G(int i10, byte[] bArr, int i11, int i12, m0 m0Var, b bVar) throws InvalidProtocolBufferException {
        if (r0.a(i10) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int iB = r0.b(i10);
        if (iB == 0) {
            int iL = L(bArr, i11, bVar);
            m0Var.n(i10, Long.valueOf(bVar.f37795b));
            return iL;
        }
        if (iB == 1) {
            m0Var.n(i10, Long.valueOf(j(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int I10 = I(bArr, i11, bVar);
            int i13 = bVar.f37794a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i13 > bArr.length - I10) {
                throw InvalidProtocolBufferException.m();
            }
            if (i13 == 0) {
                m0Var.n(i10, AbstractC2898h.f37801C);
            } else {
                m0Var.n(i10, AbstractC2898h.r(bArr, I10, i13));
            }
            return I10 + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.c();
            }
            m0Var.n(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        m0 m0VarK = m0.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int I11 = I(bArr, i11, bVar);
            int i16 = bVar.f37794a;
            if (i16 == i14) {
                i15 = i16;
                i11 = I11;
                break;
            }
            i15 = i16;
            i11 = G(i16, bArr, I11, i12, m0VarK, bVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw InvalidProtocolBufferException.h();
        }
        m0Var.n(i10, m0VarK);
        return i11;
    }

    static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f37794a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f37794a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f37794a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f37794a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f37794a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, bVar);
        }
        bVar.f37794a = b10;
        return i11;
    }

    static int J(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2914y c2914y = (C2914y) iVar;
        int I10 = I(bArr, i11, bVar);
        c2914y.X(bVar.f37794a);
        while (I10 < i12) {
            int I11 = I(bArr, I10, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            I10 = I(bArr, I11, bVar);
            c2914y.X(bVar.f37794a);
        }
        return I10;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & 127) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & 127) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f37795b = j11;
        return i11;
    }

    static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return K(j10, bArr, i11, bVar);
        }
        bVar.f37795b = j10;
        return i11;
    }

    static int M(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        G g10 = (G) iVar;
        int iL = L(bArr, i11, bVar);
        g10.j(bVar.f37795b);
        while (iL < i12) {
            int I10 = I(bArr, iL, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            iL = L(bArr, I10, bVar);
            g10.j(bVar.f37795b);
        }
        return iL;
    }

    static int N(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        int iG0 = ((T) f0Var).g0(obj, bArr, i10, i11, i12, bVar);
        bVar.f37796c = obj;
        return iG0;
    }

    static int O(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, b bVar) throws InvalidProtocolBufferException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, bVar);
            i12 = bVar.f37794a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.m();
        }
        int i14 = i12 + i13;
        f0Var.h(obj, bArr, i13, i14, bVar);
        bVar.f37796c = obj;
        return i14;
    }

    static int P(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (r0.a(i10) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int iB = r0.b(i10);
        if (iB == 0) {
            return L(bArr, i11, bVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return I(bArr, i11, bVar) + bVar.f37794a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = I(bArr, i11, bVar);
            i14 = bVar.f37794a;
            if (i14 == i13) {
                break;
            }
            i11 = P(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.h();
        }
        return i11;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2896f c2896f = (C2896f) iVar;
        int iL = L(bArr, i11, bVar);
        c2896f.j(bVar.f37795b != 0);
        while (iL < i12) {
            int I10 = I(bArr, iL, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            iL = L(bArr, I10, bVar);
            c2896f.j(bVar.f37795b != 0);
        }
        return iL;
    }

    static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 > bArr.length - I10) {
            throw InvalidProtocolBufferException.m();
        }
        if (i11 == 0) {
            bVar.f37796c = AbstractC2898h.f37801C;
            return I10;
        }
        bVar.f37796c = AbstractC2898h.r(bArr, I10, i11);
        return I10 + i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I10 = I(bArr, i11, bVar);
        int i13 = bVar.f37794a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 > bArr.length - I10) {
            throw InvalidProtocolBufferException.m();
        }
        if (i13 == 0) {
            iVar.add(AbstractC2898h.f37801C);
        } else {
            iVar.add(AbstractC2898h.r(bArr, I10, i13));
            I10 += i13;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            I10 = I(bArr, I11, bVar);
            int i14 = bVar.f37794a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 > bArr.length - I10) {
                throw InvalidProtocolBufferException.m();
            }
            if (i14 == 0) {
                iVar.add(AbstractC2898h.f37801C);
            } else {
                iVar.add(AbstractC2898h.r(bArr, I10, i14));
                I10 += i14;
            }
        }
        return I10;
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2902l c2902l = (C2902l) iVar;
        c2902l.i(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I10 = I(bArr, i13, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            c2902l.i(d(bArr, I10));
            i13 = I10 + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i10, byte[] bArr, int i11, int i12, AbstractC2913x.c<?, ?> cVar, AbstractC2913x.e<?, ?> eVar, l0<m0, m0> l0Var, b bVar) throws InvalidProtocolBufferException {
        C2909t<AbstractC2913x.d> c2909t = cVar.extensions;
        int i13 = i10 >>> 3;
        if (eVar.f38048b.isRepeated() && eVar.f38048b.isPacked()) {
            switch (a.f37793a[eVar.a().ordinal()]) {
                case 1:
                    C2902l c2902l = new C2902l();
                    int iS = s(bArr, i11, c2902l, bVar);
                    c2909t.x(eVar.f38048b, c2902l);
                    return iS;
                case 2:
                    C2911v c2911v = new C2911v();
                    int iV = v(bArr, i11, c2911v, bVar);
                    c2909t.x(eVar.f38048b, c2911v);
                    return iV;
                case 3:
                case 4:
                    G g10 = new G();
                    int iZ = z(bArr, i11, g10, bVar);
                    c2909t.x(eVar.f38048b, g10);
                    return iZ;
                case 5:
                case 6:
                    C2914y c2914y = new C2914y();
                    int iY = y(bArr, i11, c2914y, bVar);
                    c2909t.x(eVar.f38048b, c2914y);
                    return iY;
                case 7:
                case 8:
                    G g11 = new G();
                    int iU = u(bArr, i11, g11, bVar);
                    c2909t.x(eVar.f38048b, g11);
                    return iU;
                case 9:
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    C2914y c2914y2 = new C2914y();
                    int iT = t(bArr, i11, c2914y2, bVar);
                    c2909t.x(eVar.f38048b, c2914y2);
                    return iT;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    C2896f c2896f = new C2896f();
                    int iR = r(bArr, i11, c2896f, bVar);
                    c2909t.x(eVar.f38048b, c2896f);
                    return iR;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    C2914y c2914y3 = new C2914y();
                    int iW = w(bArr, i11, c2914y3, bVar);
                    c2909t.x(eVar.f38048b, c2914y3);
                    return iW;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    G g12 = new G();
                    int iX = x(bArr, i11, g12, bVar);
                    c2909t.x(eVar.f38048b, g12);
                    return iX;
                case 14:
                    C2914y c2914y4 = new C2914y();
                    int iY2 = y(bArr, i11, c2914y4, bVar);
                    h0.z(cVar, i13, c2914y4, eVar.f38048b.j(), null, l0Var);
                    c2909t.x(eVar.f38048b, c2914y4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f38048b.g());
            }
        }
        Object objValueOf = null;
        if (eVar.a() == r0.b.f37940Q) {
            i11 = I(bArr, i11, bVar);
            if (eVar.f38048b.j().a(bVar.f37794a) == null) {
                h0.L(cVar, i13, bVar.f37794a, null, l0Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f37794a);
        } else {
            switch (a.f37793a[eVar.a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(d(bArr, i11));
                    i11 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(l(bArr, i11));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f37795b);
                    break;
                case 5:
                case 6:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f37794a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(bArr, i11));
                    i11 += 8;
                    break;
                case 9:
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    objValueOf = Integer.valueOf(h(bArr, i11));
                    i11 += 4;
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f37795b != 0);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(AbstractC2899i.b(bVar.f37794a));
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Long.valueOf(AbstractC2899i.c(bVar.f37795b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = b(bArr, i11, bVar);
                    objValueOf = bVar.f37796c;
                    break;
                case 16:
                    i11 = C(bArr, i11, bVar);
                    objValueOf = bVar.f37796c;
                    break;
                case 17:
                    int i14 = (i13 << 3) | 4;
                    f0 f0VarC = b0.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iN = n(f0VarC, bArr, i11, i12, i14, bVar);
                        c2909t.a(eVar.f38048b, bVar.f37796c);
                        return iN;
                    }
                    Object objI = c2909t.i(eVar.f38048b);
                    if (objI == null) {
                        objI = f0VarC.f();
                        c2909t.x(eVar.f38048b, objI);
                    }
                    return N(objI, f0VarC, bArr, i11, i12, i14, bVar);
                case 18:
                    f0 f0VarC2 = b0.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iP = p(f0VarC2, bArr, i11, i12, bVar);
                        c2909t.a(eVar.f38048b, bVar.f37796c);
                        return iP;
                    }
                    Object objI2 = c2909t.i(eVar.f38048b);
                    if (objI2 == null) {
                        objI2 = f0VarC2.f();
                        c2909t.x(eVar.f38048b, objI2);
                    }
                    return O(objI2, f0VarC2, bArr, i11, i12, bVar);
            }
        }
        if (eVar.d()) {
            c2909t.a(eVar.f38048b, objValueOf);
        } else {
            c2909t.x(eVar.f38048b, objValueOf);
        }
        return i11;
    }

    static int g(int i10, byte[] bArr, int i11, int i12, Object obj, P p10, l0<m0, m0> l0Var, b bVar) {
        AbstractC2913x.e eVarA = bVar.f37797d.a(p10, i10 >>> 3);
        if (eVarA == null) {
            return G(i10, bArr, i11, i12, T.w(obj), bVar);
        }
        AbstractC2913x.c cVar = (AbstractC2913x.c) obj;
        cVar.X();
        return f(i10, bArr, i11, i12, cVar, eVarA, l0Var, bVar);
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2914y c2914y = (C2914y) iVar;
        c2914y.X(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I10 = I(bArr, i13, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            c2914y.X(h(bArr, I10));
            i13 = I10 + 4;
        }
        return i13;
    }

    static long j(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int k(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        G g10 = (G) iVar;
        g10.j(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I10 = I(bArr, i13, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            g10.j(j(bArr, I10));
            i13 = I10 + 8;
        }
        return i13;
    }

    static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int m(int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        C2911v c2911v = (C2911v) iVar;
        c2911v.i(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I10 = I(bArr, i13, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            c2911v.i(l(bArr, I10));
            i13 = I10 + 4;
        }
        return i13;
    }

    static int n(f0 f0Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        Object objF = f0Var.f();
        int iN = N(objF, f0Var, bArr, i10, i11, i12, bVar);
        f0Var.b(objF);
        bVar.f37796c = objF;
        return iN;
    }

    static int o(f0 f0Var, int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(f0Var, bArr, i11, i12, i13, bVar);
        iVar.add(bVar.f37796c);
        while (iN < i12) {
            int I10 = I(bArr, iN, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            iN = n(f0Var, bArr, I10, i12, i13, bVar);
            iVar.add(bVar.f37796c);
        }
        return iN;
    }

    static int p(f0 f0Var, byte[] bArr, int i10, int i11, b bVar) throws InvalidProtocolBufferException {
        Object objF = f0Var.f();
        int iO = O(objF, f0Var, bArr, i10, i11, bVar);
        f0Var.b(objF);
        bVar.f37796c = objF;
        return iO;
    }

    static int q(f0<?> f0Var, int i10, byte[] bArr, int i11, int i12, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iP = p(f0Var, bArr, i11, i12, bVar);
        iVar.add(bVar.f37796c);
        while (iP < i12) {
            int I10 = I(bArr, iP, bVar);
            if (i10 != bVar.f37794a) {
                break;
            }
            iP = p(f0Var, bArr, I10, i12, bVar);
            iVar.add(bVar.f37796c);
        }
        return iP;
    }

    static int r(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2896f c2896f = (C2896f) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, bVar);
            c2896f.j(bVar.f37795b != 0);
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int s(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2902l c2902l = (C2902l) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            c2902l.i(d(bArr, I10));
            I10 += 8;
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int t(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2914y c2914y = (C2914y) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            c2914y.X(h(bArr, I10));
            I10 += 4;
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int u(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        G g10 = (G) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            g10.j(j(bArr, I10));
            I10 += 8;
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int v(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2911v c2911v = (C2911v) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            c2911v.i(l(bArr, I10));
            I10 += 4;
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int w(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2914y c2914y = (C2914y) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            I10 = I(bArr, I10, bVar);
            c2914y.X(AbstractC2899i.b(bVar.f37794a));
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int x(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        G g10 = (G) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, bVar);
            g10.j(AbstractC2899i.c(bVar.f37795b));
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int y(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        C2914y c2914y = (C2914y) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            I10 = I(bArr, I10, bVar);
            c2914y.X(bVar.f37794a);
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int z(byte[] bArr, int i10, C2915z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        G g10 = (G) iVar;
        int I10 = I(bArr, i10, bVar);
        int i11 = bVar.f37794a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, bVar);
            g10.j(bVar.f37795b);
        }
        if (I10 == i11) {
            return I10;
        }
        throw InvalidProtocolBufferException.m();
    }
}
