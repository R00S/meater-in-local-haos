package p8;

import java.util.Arrays;
import l8.m;

/* compiled from: Longs.java */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: Longs.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f47668a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < 10; i10++) {
                bArr[i10 + 48] = (byte) i10;
            }
            for (int i11 = 0; i11 < 26; i11++) {
                byte b10 = (byte) (i11 + 10);
                bArr[i11 + 65] = b10;
                bArr[i11 + 97] = b10;
            }
            f47668a = bArr;
        }

        static int a(char c10) {
            if (c10 < 128) {
                return f47668a[c10];
            }
            return -1;
        }
    }

    public static long a(byte[] bArr) {
        m.f(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return b(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long b(byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17) {
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (b17 & 255);
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static long d(long... jArr) {
        m.d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static byte[] e(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
        return bArr;
    }

    public static Long f(String str, int i10) {
        if (((String) m.l(str)).isEmpty()) {
            return null;
        }
        if (i10 < 2 || i10 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i10);
        }
        int i11 = str.charAt(0) == '-' ? 1 : 0;
        if (i11 == str.length()) {
            return null;
        }
        int i12 = i11 + 1;
        int iA = a.a(str.charAt(i11));
        if (iA < 0 || iA >= i10) {
            return null;
        }
        long j10 = -iA;
        long j11 = i10;
        long j12 = Long.MIN_VALUE / j11;
        while (i12 < str.length()) {
            int i13 = i12 + 1;
            int iA2 = a.a(str.charAt(i12));
            if (iA2 < 0 || iA2 >= i10 || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = iA2;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i12 = i13;
        }
        if (i11 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }
}
