package t8;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: Poly1305.java */
/* renamed from: t8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4583i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i10 = 0;
        long jC = c(bArr, 0, 0) & 67108863;
        int i11 = 3;
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        long j10 = jC2 * 5;
        long j11 = jC3 * 5;
        long j12 = jC4 * 5;
        long j13 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            b(bArr3, bArr2, i12);
            long jC6 = j18 + c(bArr3, i10, i10);
            long jC7 = j14 + c(bArr3, i11, 2);
            long jC8 = j15 + c(bArr3, 6, 4);
            long jC9 = j16 + c(bArr3, 9, 6);
            long jC10 = j17 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j19 = (jC6 * jC) + (jC7 * j13) + (jC8 * j12) + (jC9 * j11) + (jC10 * j10);
            long j20 = (jC6 * jC2) + (jC7 * jC) + (jC8 * j13) + (jC9 * j12) + (jC10 * j11);
            long j21 = (jC6 * jC3) + (jC7 * jC2) + (jC8 * jC) + (jC9 * j13) + (jC10 * j12);
            long j22 = (jC6 * jC4) + (jC7 * jC3) + (jC8 * jC2) + (jC9 * jC) + (jC10 * j13);
            long j23 = j20 + (j19 >> 26);
            long j24 = j21 + (j23 >> 26);
            long j25 = j22 + (j24 >> 26);
            long j26 = (jC6 * jC5) + (jC7 * jC4) + (jC8 * jC3) + (jC9 * jC2) + (jC10 * jC) + (j25 >> 26);
            long j27 = (j19 & 67108863) + ((j26 >> 26) * 5);
            j14 = (j23 & 67108863) + (j27 >> 26);
            i12 += 16;
            j15 = j24 & 67108863;
            j16 = j25 & 67108863;
            j17 = j26 & 67108863;
            i11 = 3;
            j18 = j27 & 67108863;
            i10 = 0;
        }
        long j28 = j15 + (j14 >> 26);
        long j29 = j28 & 67108863;
        long j30 = j16 + (j28 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j17 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j18 + ((j32 >> 26) * 5);
        long j35 = j34 & 67108863;
        long j36 = (j14 & 67108863) + (j34 >> 26);
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = (j37 >> 26) + j36;
        long j40 = j29 + (j39 >> 26);
        long j41 = j31 + (j40 >> 26);
        long j42 = (j33 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = j35 & j43;
        long j45 = j36 & j43;
        long j46 = j29 & j43;
        long j47 = j31 & j43;
        long j48 = j33 & j43;
        long j49 = ~j43;
        long j50 = (j39 & 67108863 & j49) | j45;
        long j51 = (j40 & 67108863 & j49) | j46;
        long j52 = (j41 & 67108863 & j49) | j47;
        long j53 = (j42 & j49) | j48;
        long j54 = (j44 | (j38 & j49) | (j50 << 26)) & 4294967295L;
        long j55 = ((j50 >> 6) | (j51 << 20)) & 4294967295L;
        long j56 = ((j51 >> 12) | (j52 << 14)) & 4294967295L;
        long j57 = ((j52 >> 18) | (j53 << 8)) & 4294967295L;
        long jD = j54 + d(bArr, 16);
        long j58 = jD & 4294967295L;
        long jD2 = j55 + d(bArr, 20) + (jD >> 32);
        long j59 = jD2 & 4294967295L;
        long jD3 = j56 + d(bArr, 24) + (jD2 >> 32);
        long j60 = jD3 & 4294967295L;
        long jD4 = (j57 + d(bArr, 28) + (jD3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j58, 0);
        e(bArr4, j59, 4);
        e(bArr4, j60, 8);
        e(bArr4, jD4, 12);
        return bArr4;
    }

    private static void b(byte[] bArr, byte[] bArr2, int i10) {
        int iMin = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i10, int i11) {
        return (d(bArr, i10) >> i11) & 67108863;
    }

    private static long d(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!E8.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
