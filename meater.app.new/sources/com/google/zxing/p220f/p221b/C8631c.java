package com.google.zxing.p220f.p221b;

import com.google.zxing.common.reedsolomon.C8623a;
import com.google.zxing.common.reedsolomon.C8625c;
import com.google.zxing.p222g.C8636a;
import com.google.zxing.p222g.C8637b;

/* compiled from: Encoder.java */
/* renamed from: com.google.zxing.f.b.c */
/* loaded from: classes2.dex */
public final class C8631c {

    /* renamed from: a */
    private static final int[] f32777a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m27253a(C8636a c8636a, int i2, int i3) {
        int[] iArr = new int[i3];
        int iM27288i = c8636a.m27288i() / i2;
        for (int i4 = 0; i4 < iM27288i; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= c8636a.m27287h((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m27254b(C8637b c8637b, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    c8637b.m27298i(i6, i5);
                    c8637b.m27298i(i6, i7);
                    c8637b.m27298i(i5, i6);
                    c8637b.m27298i(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        c8637b.m27298i(i8, i8);
        int i9 = i8 + 1;
        c8637b.m27298i(i9, i8);
        c8637b.m27298i(i8, i9);
        int i10 = i2 + i3;
        c8637b.m27298i(i10, i8);
        c8637b.m27298i(i10, i9);
        c8637b.m27298i(i10, i10 - 1);
    }

    /* renamed from: c */
    private static void m27255c(C8637b c8637b, boolean z, int i2, C8636a c8636a) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (c8636a.m27287h(i4)) {
                    c8637b.m27298i(i5, i3 - 5);
                }
                if (c8636a.m27287h(i4 + 7)) {
                    c8637b.m27298i(i3 + 5, i5);
                }
                if (c8636a.m27287h(20 - i4)) {
                    c8637b.m27298i(i5, i3 + 5);
                }
                if (c8636a.m27287h(27 - i4)) {
                    c8637b.m27298i(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (c8636a.m27287h(i4)) {
                c8637b.m27298i(i6, i3 - 7);
            }
            if (c8636a.m27287h(i4 + 10)) {
                c8637b.m27298i(i3 + 7, i6);
            }
            if (c8636a.m27287h(29 - i4)) {
                c8637b.m27298i(i6, i3 + 7);
            }
            if (c8636a.m27287h(39 - i4)) {
                c8637b.m27298i(i3 - 7, i6);
            }
            i4++;
        }
    }

    /* renamed from: d */
    public static C8629a m27256d(byte[] bArr, int i2, int i3) {
        C8636a c8636aM27260h;
        int i4;
        boolean z;
        int iAbs;
        int iM27261i;
        int i5;
        C8636a c8636aM27267a = new C8632d(bArr).m27267a();
        int iM27288i = ((c8636aM27267a.m27288i() * i2) / 100) + 11;
        int iM27288i2 = c8636aM27267a.m27288i() + iM27288i;
        int i6 = 0;
        int i7 = 1;
        if (i3 == 0) {
            C8636a c8636aM27260h2 = null;
            int i8 = 0;
            int i9 = 0;
            while (i8 <= 32) {
                boolean z2 = i8 <= 3;
                int i10 = z2 ? i8 + 1 : i8;
                int iM27261i2 = m27261i(i10, z2);
                if (iM27288i2 <= iM27261i2) {
                    if (c8636aM27260h2 == null || i9 != f32777a[i10]) {
                        int i11 = f32777a[i10];
                        i9 = i11;
                        c8636aM27260h2 = m27260h(c8636aM27267a, i11);
                    }
                    int i12 = iM27261i2 - (iM27261i2 % i9);
                    if ((!z2 || c8636aM27260h2.m27288i() <= (i9 << 6)) && c8636aM27260h2.m27288i() + iM27288i <= i12) {
                        c8636aM27260h = c8636aM27260h2;
                        i4 = i9;
                        z = z2;
                        iAbs = i10;
                        iM27261i = iM27261i2;
                    }
                }
                i8++;
                i6 = 0;
                i7 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z = i3 < 0;
        iAbs = Math.abs(i3);
        if (iAbs > (z ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
        }
        iM27261i = m27261i(iAbs, z);
        i4 = f32777a[iAbs];
        int i13 = iM27261i - (iM27261i % i4);
        c8636aM27260h = m27260h(c8636aM27267a, i4);
        if (c8636aM27260h.m27288i() + iM27288i > i13) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z && c8636aM27260h.m27288i() > (i4 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        C8636a c8636aM27257e = m27257e(c8636aM27260h, iM27261i, i4);
        int iM27288i3 = c8636aM27260h.m27288i() / i4;
        C8636a c8636aM27258f = m27258f(z, iAbs, iM27288i3);
        int i14 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i14];
        int i15 = 2;
        if (z) {
            for (int i16 = 0; i16 < i14; i16++) {
                iArr[i16] = i16;
            }
            i5 = i14;
        } else {
            int i17 = i14 / 2;
            i5 = i14 + 1 + (((i17 - 1) / 15) * 2);
            int i18 = i5 / 2;
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[(i17 - i19) - i7] = (i18 - r14) - 1;
                iArr[i17 + i19] = (i19 / 15) + i19 + i18 + i7;
            }
        }
        C8637b c8637b = new C8637b(i5);
        int i20 = 0;
        int i21 = 0;
        while (i20 < iAbs) {
            int i22 = ((iAbs - i20) << i15) + (z ? 9 : 12);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = i23 << 1;
                while (i6 < i15) {
                    if (c8636aM27257e.m27287h(i21 + i24 + i6)) {
                        int i25 = i20 << 1;
                        c8637b.m27298i(iArr[i25 + i6], iArr[i25 + i23]);
                    }
                    if (c8636aM27257e.m27287h((i22 << 1) + i21 + i24 + i6)) {
                        int i26 = i20 << 1;
                        c8637b.m27298i(iArr[i26 + i23], iArr[((i14 - 1) - i26) - i6]);
                    }
                    if (c8636aM27257e.m27287h((i22 << 2) + i21 + i24 + i6)) {
                        int i27 = (i14 - 1) - (i20 << 1);
                        c8637b.m27298i(iArr[i27 - i6], iArr[i27 - i23]);
                    }
                    if (c8636aM27257e.m27287h((i22 * 6) + i21 + i24 + i6)) {
                        int i28 = i20 << 1;
                        c8637b.m27298i(iArr[((i14 - 1) - i28) - i23], iArr[i28 + i6]);
                    }
                    i6++;
                    i15 = 2;
                }
                i23++;
                i6 = 0;
                i15 = 2;
            }
            i21 += i22 << 3;
            i20++;
            i6 = 0;
            i15 = 2;
        }
        m27255c(c8637b, z, i5, c8636aM27258f);
        if (z) {
            m27254b(c8637b, i5 / 2, 5);
        } else {
            int i29 = i5 / 2;
            m27254b(c8637b, i29, 7);
            int i30 = 0;
            int i31 = 0;
            while (i31 < (i14 / 2) - 1) {
                for (int i32 = i29 & 1; i32 < i5; i32 += 2) {
                    int i33 = i29 - i30;
                    c8637b.m27298i(i33, i32);
                    int i34 = i29 + i30;
                    c8637b.m27298i(i34, i32);
                    c8637b.m27298i(i32, i33);
                    c8637b.m27298i(i32, i34);
                }
                i31 += 15;
                i30 += 16;
            }
        }
        C8629a c8629a = new C8629a();
        c8629a.m27248c(z);
        c8629a.m27251f(i5);
        c8629a.m27249d(iAbs);
        c8629a.m27247b(iM27288i3);
        c8629a.m27250e(c8637b);
        return c8629a;
    }

    /* renamed from: e */
    private static C8636a m27257e(C8636a c8636a, int i2, int i3) {
        int iM27288i = c8636a.m27288i() / i3;
        C8625c c8625c = new C8625c(m27259g(i3));
        int i4 = i2 / i3;
        int[] iArrM27253a = m27253a(c8636a, i3, i4);
        c8625c.m27242b(iArrM27253a, i4 - iM27288i);
        C8636a c8636a2 = new C8636a();
        c8636a2.m27285e(0, i2 % i3);
        for (int i5 : iArrM27253a) {
            c8636a2.m27285e(i5, i3);
        }
        return c8636a2;
    }

    /* renamed from: f */
    static C8636a m27258f(boolean z, int i2, int i3) {
        C8636a c8636a = new C8636a();
        if (z) {
            c8636a.m27285e(i2 - 1, 2);
            c8636a.m27285e(i3 - 1, 6);
            return m27257e(c8636a, 28, 4);
        }
        c8636a.m27285e(i2 - 1, 5);
        c8636a.m27285e(i3 - 1, 11);
        return m27257e(c8636a, 40, 4);
    }

    /* renamed from: g */
    private static C8623a m27259g(int i2) {
        if (i2 == 4) {
            return C8623a.f32753d;
        }
        if (i2 == 6) {
            return C8623a.f32752c;
        }
        if (i2 == 8) {
            return C8623a.f32756g;
        }
        if (i2 == 10) {
            return C8623a.f32751b;
        }
        if (i2 == 12) {
            return C8623a.f32750a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    /* renamed from: h */
    static C8636a m27260h(C8636a c8636a, int i2) {
        C8636a c8636a2 = new C8636a();
        int iM27288i = c8636a.m27288i();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < iM27288i) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= iM27288i || c8636a.m27287h(i7)) {
                    i5 |= 1 << ((i2 - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                c8636a2.m27285e(i8, i2);
            } else if (i8 == 0) {
                c8636a2.m27285e(i5 | 1, i2);
            } else {
                c8636a2.m27285e(i5, i2);
                i4 += i2;
            }
            i4--;
            i4 += i2;
        }
        return c8636a2;
    }

    /* renamed from: i */
    private static int m27261i(int i2, boolean z) {
        return ((z ? 88 : 112) + (i2 << 4)) * i2;
    }
}
