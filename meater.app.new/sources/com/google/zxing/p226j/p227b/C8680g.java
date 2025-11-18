package com.google.zxing.p226j.p227b;

import com.google.zxing.WriterException;
import com.google.zxing.p222g.EnumC8638c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PDF417HighLevelEncoder.java */
/* renamed from: com.google.zxing.j.b.g */
/* loaded from: classes2.dex */
final class C8680g {

    /* renamed from: c */
    private static final byte[] f32918c;

    /* renamed from: a */
    private static final byte[] f32916a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f32917b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    private static final byte[] f32919d = new byte[128];

    /* renamed from: e */
    private static final Charset f32920e = StandardCharsets.ISO_8859_1;

    /* compiled from: PDF417HighLevelEncoder.java */
    /* renamed from: com.google.zxing.j.b.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32921a;

        static {
            int[] iArr = new int[EnumC8676c.values().length];
            f32921a = iArr;
            try {
                iArr[EnumC8676c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32921a[EnumC8676c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32921a[EnumC8676c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f32918c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f32916a;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                f32918c[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(f32919d, (byte) -1);
        while (true) {
            byte[] bArr3 = f32917b;
            if (i2 >= bArr3.length) {
                return;
            }
            byte b3 = bArr3[i2];
            if (b3 > 0) {
                f32919d[b3] = (byte) i2;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m27420a(String str, int i2, Charset charset) throws WriterException {
        int i3;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i4 = i2;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            int i5 = 0;
            while (i5 < 13 && m27430k(cCharAt) && (i3 = i4 + (i5 = i5 + 1)) < length) {
                cCharAt = str.charAt(i3);
            }
            if (i5 >= 13) {
                return i4 - i2;
            }
            char cCharAt2 = str.charAt(i4);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i4++;
        }
        return i4 - i2;
    }

    /* renamed from: b */
    private static int m27421b(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            while (m27430k(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    /* renamed from: c */
    private static int m27422c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = i2;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && m27430k(cCharAt) && i3 < length) {
                i4++;
                i3++;
                if (i3 < length) {
                    cCharAt = charSequence.charAt(i3);
                }
            }
            if (i4 < 13) {
                if (i4 <= 0) {
                    if (!m27433n(charSequence.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            } else {
                return (i3 - i2) - i4;
            }
        }
        return i3 - i2;
    }

    /* renamed from: d */
    private static void m27423d(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        if (i3 == 1 && i4 == 0) {
            sb.append((char) 913);
        } else if (i3 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + (bArr[i5 + i6] & 255);
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) (j2 % 900);
                    j2 /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
        } else {
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & 255));
            i5++;
        }
    }

    /* renamed from: e */
    static String m27424e(String str, EnumC8676c enumC8676c, Charset charset) throws WriterException {
        EnumC8638c enumC8638cM27301g;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f32920e;
        } else if (!f32920e.equals(charset) && (enumC8638cM27301g = EnumC8638c.m27301g(charset.name())) != null) {
            m27427h(enumC8638cM27301g.m27302k(), sb);
        }
        int length = str.length();
        int i2 = a.f32921a[enumC8676c.ordinal()];
        if (i2 == 1) {
            m27426g(str, 0, length, sb, 0);
        } else if (i2 == 2) {
            byte[] bytes = str.getBytes(charset);
            m27423d(bytes, 0, bytes.length, 1, sb);
        } else if (i2 != 3) {
            int i3 = 0;
            int iM27426g = 0;
            int i4 = 0;
            while (i3 < length) {
                int iM27421b = m27421b(str, i3);
                if (iM27421b >= 13) {
                    sb.append((char) 902);
                    m27425f(str, i3, iM27421b, sb);
                    i3 += iM27421b;
                    iM27426g = 0;
                    i4 = 2;
                } else {
                    int iM27422c = m27422c(str, i3);
                    if (iM27422c >= 5 || iM27421b == length) {
                        if (i4 != 0) {
                            sb.append((char) 900);
                            iM27426g = 0;
                            i4 = 0;
                        }
                        iM27426g = m27426g(str, i3, iM27422c, sb, iM27426g);
                        i3 += iM27422c;
                    } else {
                        int iM27420a = m27420a(str, i3, charset);
                        if (iM27420a == 0) {
                            iM27420a = 1;
                        }
                        int i5 = iM27420a + i3;
                        byte[] bytes2 = str.substring(i3, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m27423d(bytes2, 0, 1, 0, sb);
                        } else {
                            m27423d(bytes2, 0, bytes2.length, i4, sb);
                            iM27426g = 0;
                            i4 = 1;
                        }
                        i3 = i5;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            m27425f(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static void m27425f(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i4 = 0;
        while (i4 < i3) {
            sb2.setLength(0);
            int iMin = Math.min(44, i3 - i4);
            StringBuilder sb3 = new StringBuilder("1");
            int i5 = i2 + i4;
            sb3.append(str.substring(i5, i5 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i4 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 BREAK  A[LOOP:0: B:3:0x0011->B:93:0x0011], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0011 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m27426g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p226j.p227b.C8680g.m27426g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    private static void m27427h(int i2, StringBuilder sb) throws WriterException {
        if (i2 >= 0 && i2 < 900) {
            sb.append((char) 927);
            sb.append((char) i2);
        } else if (i2 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i2 / 900) - 1));
            sb.append((char) (i2 % 900));
        } else {
            if (i2 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i2)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i2));
        }
    }

    /* renamed from: i */
    private static boolean m27428i(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m27429j(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m27430k(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    /* renamed from: l */
    private static boolean m27431l(char c2) {
        return f32918c[c2] != -1;
    }

    /* renamed from: m */
    private static boolean m27432m(char c2) {
        return f32919d[c2] != -1;
    }

    /* renamed from: n */
    private static boolean m27433n(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r') {
            return true;
        }
        return c2 >= ' ' && c2 <= '~';
    }
}
