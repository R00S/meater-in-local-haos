package com.google.zxing.p223h.p224b;

import com.google.zxing.C8621b;
import java.util.Arrays;

/* compiled from: HighLevelEncoder.java */
/* renamed from: com.google.zxing.h.b.j */
/* loaded from: classes2.dex */
public final class C8649j {
    /* renamed from: a */
    public static int m27354a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            while (m27359f(cCharAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    cCharAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    /* renamed from: b */
    public static String m27355b(String str, EnumC8651l enumC8651l, C8621b c8621b, C8621b c8621b2) {
        int iM27337e = 0;
        InterfaceC8646g[] interfaceC8646gArr = {new C8640a(), new C8642c(), new C8652m(), new C8653n(), new C8645f(), new C8641b()};
        C8647h c8647h = new C8647h(str);
        c8647h.m27345n(enumC8651l);
        c8647h.m27343l(c8621b, c8621b2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c8647h.m27349r((char) 236);
            c8647h.m27344m(2);
            c8647h.f32840f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c8647h.m27349r((char) 237);
            c8647h.m27344m(2);
            c8647h.f32840f += 7;
        }
        while (c8647h.m27340i()) {
            interfaceC8646gArr[iM27337e].mo27306a(c8647h);
            if (c8647h.m27337e() >= 0) {
                iM27337e = c8647h.m27337e();
                c8647h.m27341j();
            }
        }
        int iM27333a = c8647h.m27333a();
        c8647h.m27347p();
        int iM27372a = c8647h.m27339g().m27372a();
        if (iM27333a < iM27372a && iM27337e != 0 && iM27337e != 5 && iM27337e != 4) {
            c8647h.m27349r((char) 254);
        }
        StringBuilder sbM27334b = c8647h.m27334b();
        if (sbM27334b.length() < iM27372a) {
            sbM27334b.append((char) 129);
        }
        while (sbM27334b.length() < iM27372a) {
            sbM27334b.append(m27368o((char) 129, sbM27334b.length() + 1));
        }
        return c8647h.m27334b().toString();
    }

    /* renamed from: c */
    private static int m27356c(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil(fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    /* renamed from: d */
    private static int m27357d(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    /* renamed from: e */
    static void m27358e(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f */
    static boolean m27359f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    /* renamed from: g */
    static boolean m27360g(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    /* renamed from: h */
    private static boolean m27361h(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m27362i(char c2) {
        return c2 >= ' ' && c2 <= '^';
    }

    /* renamed from: j */
    private static boolean m27363j(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m27364k(char c2) {
        if (m27366m(c2) || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m27365l(char c2) {
        return false;
    }

    /* renamed from: m */
    private static boolean m27366m(char c2) {
        return c2 == '\r' || c2 == '*' || c2 == '>';
    }

    /* renamed from: n */
    static int m27367n(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        char c2;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i3] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iM27356c = m27356c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iM27357d = m27357d(bArr);
                if (iArr[0] == iM27356c) {
                    return 0;
                }
                if (iM27357d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iM27357d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iM27357d != 1 || bArr[2] <= 0) {
                    return (iM27357d != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (m27359f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m27360g(cCharAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m27361h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m27360g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m27363j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m27360g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m27364k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m27360g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m27362i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m27360g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m27365l(cCharAt)) {
                c2 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c2 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m27356c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iM27357d2 = m27357d(bArr2);
                if (iArr2[0] < iArr2[c2] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (iM27357d2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (iM27357d2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (iM27357d2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i6 = i2 + i4 + 1; i6 < charSequence.length(); i6++) {
                            char cCharAt2 = charSequence.charAt(i6);
                            if (m27366m(cCharAt2)) {
                                return 3;
                            }
                            if (!m27364k(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private static char m27368o(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 253) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }
}
