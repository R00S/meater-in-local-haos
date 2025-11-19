package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class U3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f33902a = 100;

    static double a(byte[] bArr, int i10) {
        return Double.longBitsToDouble(u(bArr, i10));
    }

    static int b(int i10, byte[] bArr, int i11, int i12, T3 t32) {
        if ((i10 >>> 3) == 0) {
            throw zzkp.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return t(bArr, i11, t32);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return s(bArr, i11, t32) + t32.f33875a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzkp.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = s(bArr, i11, t32);
            i15 = t32.f33875a;
            if (i15 == i14) {
                break;
            }
            i11 = b(i15, bArr, i11, i12, t32);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzkp.e();
        }
        return i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, L4<?> l42, T3 t32) {
        G4 g42 = (G4) l42;
        int iS = s(bArr, i11, t32);
        g42.i(t32.f33875a);
        while (iS < i12) {
            int iS2 = s(bArr, iS, t32);
            if (i10 != t32.f33875a) {
                break;
            }
            iS = s(bArr, iS2, t32);
            g42.i(t32.f33875a);
        }
        return iS;
    }

    static int d(int i10, byte[] bArr, int i11, int i12, T5 t52, T3 t32) {
        if ((i10 >>> 3) == 0) {
            throw zzkp.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iT = t(bArr, i11, t32);
            t52.e(i10, Long.valueOf(t32.f33876b));
            return iT;
        }
        if (i13 == 1) {
            t52.e(i10, Long.valueOf(u(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iS = s(bArr, i11, t32);
            int i14 = t32.f33875a;
            if (i14 < 0) {
                throw zzkp.d();
            }
            if (i14 > bArr.length - iS) {
                throw zzkp.g();
            }
            if (i14 == 0) {
                t52.e(i10, Y3.f33948C);
            } else {
                t52.e(i10, Y3.w(bArr, iS, i14));
            }
            return iS + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzkp.b();
            }
            t52.e(i10, Integer.valueOf(r(bArr, i11)));
            return i11 + 4;
        }
        T5 t5L = T5.l();
        int i15 = (i10 & (-8)) | 4;
        int i16 = t32.f33879e + 1;
        t32.f33879e = i16;
        n(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iS2 = s(bArr, i11, t32);
            int i18 = t32.f33875a;
            i17 = i18;
            if (i18 == i15) {
                i11 = iS2;
                break;
            }
            int iD = d(i17, bArr, iS2, i12, t5L, t32);
            i17 = i18;
            i11 = iD;
        }
        t32.f33879e--;
        if (i11 > i12 || i17 != i15) {
            throw zzkp.e();
        }
        t52.e(i10, t5L);
        return i11;
    }

    static int e(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC2517k5 interfaceC2517k5, R5<T5, T5> r52, T3 t32) {
        if (t32.f33878d.b(interfaceC2517k5, i10 >>> 3) == null) {
            return d(i10, bArr, i11, i12, C2549o5.I(obj), t32);
        }
        F4.b bVar = (F4.b) obj;
        bVar.K();
        C2595u4<F4.e> c2595u4 = bVar.zzc;
        throw new NoSuchMethodError();
    }

    static int f(int i10, byte[] bArr, int i11, T3 t32) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            t32.f33875a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            t32.f33875a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            t32.f33875a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            t32.f33875a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                t32.f33875a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int g(C5<?> c52, int i10, byte[] bArr, int i11, int i12, L4<Object> l42, T3 t32) {
        int i13 = (i10 & (-8)) | 4;
        int iH = h(c52, bArr, i11, i12, i13, t32);
        l42.add(t32.f33877c);
        while (iH < i12) {
            int iS = s(bArr, iH, t32);
            if (i10 != t32.f33875a) {
                break;
            }
            iH = h(c52, bArr, iS, i12, i13, t32);
            l42.add(t32.f33877c);
        }
        return iH;
    }

    private static <T> int h(C5<T> c52, byte[] bArr, int i10, int i11, int i12, T3 t32) {
        T tA = c52.a();
        int iJ = j(tA, c52, bArr, i10, i11, i12, t32);
        c52.f(tA);
        t32.f33877c = tA;
        return iJ;
    }

    static <T> int i(C5<T> c52, byte[] bArr, int i10, int i11, T3 t32) {
        T tA = c52.a();
        int iK = k(tA, c52, bArr, i10, i11, t32);
        c52.f(tA);
        t32.f33877c = tA;
        return iK;
    }

    static <T> int j(Object obj, C5<T> c52, byte[] bArr, int i10, int i11, int i12, T3 t32) {
        C2549o5 c2549o5 = (C2549o5) c52;
        int i13 = t32.f33879e + 1;
        t32.f33879e = i13;
        n(i13);
        int iM = c2549o5.m(obj, bArr, i10, i11, i12, t32);
        t32.f33879e--;
        t32.f33877c = obj;
        return iM;
    }

    static <T> int k(Object obj, C5<T> c52, byte[] bArr, int i10, int i11, T3 t32) {
        int iF = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iF = f(i12, bArr, iF, t32);
            i12 = t32.f33875a;
        }
        int i13 = iF;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzkp.g();
        }
        int i14 = t32.f33879e + 1;
        t32.f33879e = i14;
        n(i14);
        int i15 = i12 + i13;
        c52.d(obj, bArr, i13, i15, t32);
        t32.f33879e--;
        t32.f33877c = obj;
        return i15;
    }

    static int l(byte[] bArr, int i10, T3 t32) {
        int iS = s(bArr, i10, t32);
        int i11 = t32.f33875a;
        if (i11 < 0) {
            throw zzkp.d();
        }
        if (i11 > bArr.length - iS) {
            throw zzkp.g();
        }
        if (i11 == 0) {
            t32.f33877c = Y3.f33948C;
            return iS;
        }
        t32.f33877c = Y3.w(bArr, iS, i11);
        return iS + i11;
    }

    static int m(byte[] bArr, int i10, L4<?> l42, T3 t32) {
        G4 g42 = (G4) l42;
        int iS = s(bArr, i10, t32);
        int i11 = t32.f33875a + iS;
        while (iS < i11) {
            iS = s(bArr, iS, t32);
            g42.i(t32.f33875a);
        }
        if (iS == i11) {
            return iS;
        }
        throw zzkp.g();
    }

    private static void n(int i10) throws zzkp {
        if (i10 >= f33902a) {
            throw zzkp.f();
        }
    }

    static float o(byte[] bArr, int i10) {
        return Float.intBitsToFloat(r(bArr, i10));
    }

    static int p(C5<?> c52, int i10, byte[] bArr, int i11, int i12, L4<?> l42, T3 t32) {
        int i13 = i(c52, bArr, i11, i12, t32);
        l42.add(t32.f33877c);
        while (i13 < i12) {
            int iS = s(bArr, i13, t32);
            if (i10 != t32.f33875a) {
                break;
            }
            i13 = i(c52, bArr, iS, i12, t32);
            l42.add(t32.f33877c);
        }
        return i13;
    }

    static int q(byte[] bArr, int i10, T3 t32) {
        int iS = s(bArr, i10, t32);
        int i11 = t32.f33875a;
        if (i11 < 0) {
            throw zzkp.d();
        }
        if (i11 == 0) {
            t32.f33877c = "";
            return iS;
        }
        t32.f33877c = X5.d(bArr, iS, i11);
        return iS + i11;
    }

    static int r(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int s(byte[] bArr, int i10, T3 t32) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return f(b10, bArr, i11, t32);
        }
        t32.f33875a = b10;
        return i11;
    }

    static int t(byte[] bArr, int i10, T3 t32) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            t32.f33876b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & 127) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & 127) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        t32.f33876b = j11;
        return i12;
    }

    static long u(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
