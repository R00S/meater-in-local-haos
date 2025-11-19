package Hc;

/* compiled from: SimpleBase64Encoder.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f5828a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[(length * 3) / 4];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (length < 4) {
                break;
            }
            long jC = c(bytes, i10, 4);
            length -= 4;
            i10 += 4;
            for (int i12 = 2; i12 >= 0; i12--) {
                bArr[i11 + i12] = (byte) (jC & 255);
                jC >>= 8;
            }
            i11 += 3;
        }
        if (length == 3) {
            long jC2 = c(bytes, i10, 3);
            for (int i13 = 1; i13 >= 0; i13--) {
                bArr[i11 + i13] = (byte) (jC2 & 255);
                jC2 >>= 8;
            }
        }
        if (length == 2) {
            bArr[i11] = (byte) (c(bytes, i10, 2) & 255);
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((length + 2) / 3) * 4);
        int i10 = 0;
        while (length >= 3) {
            stringBuffer.append(d(((bArr[i10] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8) | (bArr[i10 + 2] & 255), 4));
            i10 += 3;
            length -= 3;
        }
        if (length == 2) {
            stringBuffer.append(d(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255), 3));
        }
        if (length == 1) {
            stringBuffer.append(d(bArr[i10] & 255, 2));
        }
        return stringBuffer.toString();
    }

    private static final long c(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        long j10 = 0;
        while (i11 > 0) {
            i11--;
            int i13 = i10 + 1;
            byte b10 = bArr[i10];
            long j11 = b10 == 47 ? 1L : 0L;
            if (b10 >= 48 && b10 <= 57) {
                j11 = b10 - 46;
            }
            if (b10 >= 65 && b10 <= 90) {
                j11 = b10 - 53;
            }
            if (b10 >= 97 && b10 <= 122) {
                j11 = b10 - 59;
            }
            j10 += j11 << i12;
            i12 += 6;
            i10 = i13;
        }
        return j10;
    }

    private static final String d(long j10, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10);
        while (i10 > 0) {
            i10--;
            stringBuffer.append(f5828a[(int) (63 & j10)]);
            j10 >>= 6;
        }
        return stringBuffer.toString();
    }
}
