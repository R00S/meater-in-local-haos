package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pt */
/* loaded from: classes2.dex */
final class C7055pt {
    /* renamed from: a */
    private static void m15748a(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }

    /* renamed from: b */
    private static long m15749b(byte[] bArr, int i2) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: c */
    static byte[] m15750c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jM15751d = m15751d(bArr, 0, 0) & 67108863;
        int i2 = 3;
        long jM15751d2 = m15751d(bArr, 3, 2) & 67108611;
        long jM15751d3 = m15751d(bArr, 6, 4) & 67092735;
        long jM15751d4 = m15751d(bArr, 9, 6) & 66076671;
        long jM15751d5 = m15751d(bArr, 12, 8) & 1048575;
        long j2 = jM15751d2 * 5;
        long j3 = jM15751d3 * 5;
        long j4 = jM15751d4 * 5;
        long j5 = jM15751d5 * 5;
        int i3 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i4 = 0;
        while (i4 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i4);
            System.arraycopy(bArr2, i4, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i3, (byte) 0);
            }
            long jM15751d6 = j10 + m15751d(bArr3, 0, 0);
            long jM15751d7 = j6 + m15751d(bArr3, i2, 2);
            long jM15751d8 = j7 + m15751d(bArr3, 6, 4);
            long jM15751d9 = j8 + m15751d(bArr3, 9, 6);
            long jM15751d10 = j9 + (m15751d(bArr3, 12, 8) | (bArr3[16] << 24));
            long j11 = (jM15751d6 * jM15751d) + (jM15751d7 * j5) + (jM15751d8 * j4) + (jM15751d9 * j3) + (jM15751d10 * j2);
            long j12 = (jM15751d6 * jM15751d2) + (jM15751d7 * jM15751d) + (jM15751d8 * j5) + (jM15751d9 * j4) + (jM15751d10 * j3);
            long j13 = (jM15751d6 * jM15751d3) + (jM15751d7 * jM15751d2) + (jM15751d8 * jM15751d) + (jM15751d9 * j5) + (jM15751d10 * j4);
            long j14 = (jM15751d6 * jM15751d4) + (jM15751d7 * jM15751d3) + (jM15751d8 * jM15751d2) + (jM15751d9 * jM15751d) + (jM15751d10 * j5);
            long j15 = j12 + (j11 >> 26);
            long j16 = j13 + (j15 >> 26);
            long j17 = j14 + (j16 >> 26);
            long j18 = (jM15751d6 * jM15751d5) + (jM15751d7 * jM15751d4) + (jM15751d8 * jM15751d3) + (jM15751d9 * jM15751d2) + (jM15751d10 * jM15751d) + (j17 >> 26);
            long j19 = (j11 & 67108863) + ((j18 >> 26) * 5);
            j6 = (j15 & 67108863) + (j19 >> 26);
            i4 += 16;
            j7 = j16 & 67108863;
            j8 = j17 & 67108863;
            j9 = j18 & 67108863;
            i3 = 17;
            i2 = 3;
            j10 = j19 & 67108863;
        }
        long j20 = j7 + (j6 >> 26);
        long j21 = j20 & 67108863;
        long j22 = j8 + (j20 >> 26);
        long j23 = j22 & 67108863;
        long j24 = j9 + (j22 >> 26);
        long j25 = j24 & 67108863;
        long j26 = j10 + ((j24 >> 26) * 5);
        long j27 = j26 & 67108863;
        long j28 = (j6 & 67108863) + (j26 >> 26);
        long j29 = j27 + 5;
        long j30 = j29 & 67108863;
        long j31 = (j29 >> 26) + j28;
        long j32 = j21 + (j31 >> 26);
        long j33 = j23 + (j32 >> 26);
        long j34 = j33 & 67108863;
        long j35 = (j25 + (j33 >> 26)) - 67108864;
        long j36 = j35 >> 63;
        long j37 = j27 & j36;
        long j38 = j28 & j36;
        long j39 = j21 & j36;
        long j40 = j23 & j36;
        long j41 = j25 & j36;
        long j42 = j36 ^ (-1);
        long j43 = (j31 & 67108863 & j42) | j38;
        long j44 = (j32 & 67108863 & j42) | j39;
        long j45 = (j34 & j42) | j40;
        long j46 = (j35 & j42) | j41;
        long j47 = ((j43 << 26) | j37 | (j30 & j42)) & 4294967295L;
        long j48 = ((j43 >> 6) | (j44 << 20)) & 4294967295L;
        long j49 = ((j44 >> 12) | (j45 << 14)) & 4294967295L;
        long jM15749b = j47 + m15749b(bArr, 16);
        long jM15749b2 = j48 + m15749b(bArr, 20) + (jM15749b >> 32);
        long jM15749b3 = j49 + m15749b(bArr, 24) + (jM15749b2 >> 32);
        long jM15749b4 = ((((j45 >> 18) | (j46 << 8)) & 4294967295L) + m15749b(bArr, 28) + (jM15749b3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m15748a(bArr4, jM15749b & 4294967295L, 0);
        m15748a(bArr4, jM15749b2 & 4294967295L, 4);
        m15748a(bArr4, jM15749b3 & 4294967295L, 8);
        m15748a(bArr4, jM15749b4, 12);
        return bArr4;
    }

    /* renamed from: d */
    private static long m15751d(byte[] bArr, int i2, int i3) {
        return (m15749b(bArr, i2) >> i3) & 67108863;
    }
}
