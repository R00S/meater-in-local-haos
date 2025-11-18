package p353j;

import java.util.Arrays;
import kotlin.jvm.internal.C9801m;
import p353j.C9710i;

/* compiled from: -Base64.kt */
/* renamed from: j.a */
/* loaded from: classes3.dex */
public final class C9693a {

    /* renamed from: a */
    private static final byte[] f37029a;

    /* renamed from: b */
    private static final byte[] f37030b;

    static {
        C9710i.a aVar = C9710i.f37052g;
        f37029a = aVar.m32103d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m32098y();
        f37030b = aVar.m32103d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m32098y();
    }

    /* renamed from: a */
    public static final byte[] m31962a(String str) {
        int i2;
        char cCharAt;
        C9801m.m32346f(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt2 = str.charAt(i7);
            if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                i2 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                i2 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                i2 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i2 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i2 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i5 = (i5 << 6) | i2;
            i4++;
            if (i4 % 4 == 0) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 16);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i5 >> 8);
                bArr[i9] = (byte) i5;
                i6 = i9 + 1;
            }
        }
        int i10 = i4 % 4;
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            bArr[i6] = (byte) ((i5 << 12) >> 16);
            i6++;
        } else if (i10 == 3) {
            int i11 = i5 << 6;
            int i12 = i6 + 1;
            bArr[i6] = (byte) (i11 >> 16);
            i6 = i12 + 1;
            bArr[i12] = (byte) (i11 >> 8);
        }
        if (i6 == i3) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i6);
        C9801m.m32345e(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    /* renamed from: b */
    public static final String m31963b(byte[] bArr, byte[] bArr2) {
        C9801m.m32346f(bArr, "$this$encodeBase64");
        C9801m.m32346f(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i5 + 1;
            byte b4 = bArr[i5];
            int i7 = i3 + 1;
            bArr3[i3] = bArr2[(b2 & 255) >> 2];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 = i9 + 1;
            bArr3[i9] = bArr2[b4 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            int i10 = i3 + 1;
            bArr3[i3] = bArr2[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i11] = b6;
            bArr3[i11 + 1] = b6;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b7 = bArr[i2];
            byte b8 = bArr[i12];
            int i13 = i3 + 1;
            bArr3[i3] = bArr2[(b7 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i14] = bArr2[(b8 & 15) << 2];
            bArr3[i14 + 1] = (byte) 61;
        }
        return C9695b.m31980b(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m31964c(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = f37029a;
        }
        return m31963b(bArr, bArr2);
    }
}
