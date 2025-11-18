package com.google.zxing.p228k.p230c;

import com.google.zxing.WriterException;
import com.google.zxing.common.reedsolomon.C8623a;
import com.google.zxing.common.reedsolomon.C8625c;
import com.google.zxing.p222g.C8636a;
import com.google.zxing.p222g.EnumC8638c;
import com.google.zxing.p228k.p229b.C8684c;
import com.google.zxing.p228k.p229b.EnumC8682a;
import com.google.zxing.p228k.p229b.EnumC8683b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Encoder.java */
/* renamed from: com.google.zxing.k.c.c */
/* loaded from: classes2.dex */
public final class C8687c {

    /* renamed from: a */
    private static final int[] f32957a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder.java */
    /* renamed from: com.google.zxing.k.c.c$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32958a;

        static {
            int[] iArr = new int[EnumC8683b.values().length];
            f32958a = iArr;
            try {
                iArr[EnumC8683b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32958a[EnumC8683b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32958a[EnumC8683b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32958a[EnumC8683b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    static void m27459a(String str, C8636a c8636a, String str2) throws WriterException, UnsupportedEncodingException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                c8636a.m27285e(b2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    /* renamed from: b */
    static void m27460b(CharSequence charSequence, C8636a c8636a) throws WriterException {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iM27474p = m27474p(charSequence.charAt(i2));
            if (iM27474p == -1) {
                throw new WriterException();
            }
            int i3 = i2 + 1;
            if (i3 < length) {
                int iM27474p2 = m27474p(charSequence.charAt(i3));
                if (iM27474p2 == -1) {
                    throw new WriterException();
                }
                c8636a.m27285e((iM27474p * 45) + iM27474p2, 11);
                i2 += 2;
            } else {
                c8636a.m27285e(iM27474p, 6);
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    static void m27461c(String str, EnumC8683b enumC8683b, C8636a c8636a, String str2) throws WriterException, UnsupportedEncodingException {
        int i2 = a.f32958a[enumC8683b.ordinal()];
        if (i2 == 1) {
            m27466h(str, c8636a);
            return;
        }
        if (i2 == 2) {
            m27460b(str, c8636a);
        } else if (i2 == 3) {
            m27459a(str, c8636a, str2);
        } else {
            if (i2 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(enumC8683b)));
            }
            m27463e(str, c8636a);
        }
    }

    /* renamed from: d */
    private static void m27462d(EnumC8638c enumC8638c, C8636a c8636a) {
        c8636a.m27285e(EnumC8683b.ECI.m27436g(), 4);
        c8636a.m27285e(enumC8638c.m27302k(), 8);
    }

    /* renamed from: e */
    static void m27463e(String str, C8636a c8636a) throws WriterException, UnsupportedEncodingException {
        int i2;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i3 = 0; i3 < length; i3 += 2) {
                int i4 = ((bytes[i3] & 255) << 8) | (bytes[i3 + 1] & 255);
                int i5 = 33088;
                if (i4 >= 33088 && i4 <= 40956) {
                    i2 = i4 - i5;
                } else if (i4 < 57408 || i4 > 60351) {
                    i2 = -1;
                } else {
                    i5 = 49472;
                    i2 = i4 - i5;
                }
                if (i2 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                c8636a.m27285e(((i2 >> 8) * 192) + (i2 & 255), 13);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    /* renamed from: f */
    static void m27464f(int i2, C8684c c8684c, EnumC8683b enumC8683b, C8636a c8636a) throws WriterException {
        int iM27437k = enumC8683b.m27437k(c8684c);
        int i3 = 1 << iM27437k;
        if (i2 < i3) {
            c8636a.m27285e(i2, iM27437k);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    /* renamed from: g */
    static void m27465g(EnumC8683b enumC8683b, C8636a c8636a) {
        c8636a.m27285e(enumC8683b.m27436g(), 4);
    }

    /* renamed from: h */
    static void m27466h(CharSequence charSequence, C8636a c8636a) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iCharAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                c8636a.m27285e((iCharAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    c8636a.m27285e((iCharAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    c8636a.m27285e(iCharAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m27467i(EnumC8683b enumC8683b, C8636a c8636a, C8636a c8636a2, C8684c c8684c) {
        return c8636a.m27288i() + enumC8683b.m27437k(c8684c) + c8636a2.m27288i();
    }

    /* renamed from: j */
    private static int m27468j(C8686b c8686b) {
        return C8688d.m27481a(c8686b) + C8688d.m27483c(c8686b) + C8688d.m27484d(c8686b) + C8688d.m27485e(c8686b);
    }

    /* renamed from: k */
    private static int m27469k(C8636a c8636a, EnumC8682a enumC8682a, C8684c c8684c, C8686b c8686b) throws WriterException {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            C8689e.m27489a(c8636a, enumC8682a, c8684c, i4, c8686b);
            int iM27468j = m27468j(c8686b);
            if (iM27468j < i2) {
                i3 = i4;
                i2 = iM27468j;
            }
        }
        return i3;
    }

    /* renamed from: l */
    private static EnumC8683b m27470l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m27477s(str)) {
            return EnumC8683b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (m27474p(cCharAt) == -1) {
                    return EnumC8683b.BYTE;
                }
                z = true;
            }
        }
        return z ? EnumC8683b.ALPHANUMERIC : z2 ? EnumC8683b.NUMERIC : EnumC8683b.BYTE;
    }

    /* renamed from: m */
    private static C8684c m27471m(int i2, EnumC8682a enumC8682a) throws WriterException {
        for (int i3 = 1; i3 <= 40; i3++) {
            C8684c c8684cM27439e = C8684c.m27439e(i3);
            if (m27480v(i2, c8684cM27439e, enumC8682a)) {
                return c8684cM27439e;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.p228k.p230c.C8690f m27472n(java.lang.String r7, com.google.zxing.p228k.p229b.EnumC8682a r8, java.util.Map<com.google.zxing.EnumC8622c, ?> r9) throws com.google.zxing.WriterException, java.io.UnsupportedEncodingException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.google.zxing.c r2 = com.google.zxing.EnumC8622c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1c
            com.google.zxing.c r3 = com.google.zxing.EnumC8622c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.google.zxing.k.b.b r4 = m27470l(r7, r3)
            com.google.zxing.g.a r5 = new com.google.zxing.g.a
            r5.<init>()
            com.google.zxing.k.b.b r6 = com.google.zxing.p228k.p229b.EnumC8683b.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            com.google.zxing.g.c r2 = com.google.zxing.p222g.EnumC8638c.m27301g(r3)
            if (r2 == 0) goto L36
            m27462d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.google.zxing.c r2 = com.google.zxing.EnumC8622c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5d
            com.google.zxing.c r0 = com.google.zxing.EnumC8622c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.zxing.k.b.b r0 = com.google.zxing.p228k.p229b.EnumC8683b.FNC1_FIRST_POSITION
            m27465g(r0, r5)
        L5d:
            m27465g(r4, r5)
            com.google.zxing.g.a r0 = new com.google.zxing.g.a
            r0.<init>()
            m27461c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            com.google.zxing.c r1 = com.google.zxing.EnumC8622c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.k.b.c r9 = com.google.zxing.p228k.p229b.C8684c.m27439e(r9)
            int r1 = m27467i(r4, r5, r0, r9)
            boolean r1 = m27480v(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            com.google.zxing.k.b.c r9 = m27478t(r8, r4, r5, r0)
        L99:
            com.google.zxing.g.a r1 = new com.google.zxing.g.a
            r1.<init>()
            r1.m27284d(r5)
            if (r4 != r6) goto La8
            int r7 = r0.m27289j()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            m27464f(r7, r9, r4, r1)
            r1.m27284d(r0)
            com.google.zxing.k.b.c$b r7 = r9.m27441c(r8)
            int r0 = r9.m27442d()
            int r2 = r7.m27449d()
            int r0 = r0 - r2
            m27479u(r0, r1)
            int r2 = r9.m27442d()
            int r7 = r7.m27448c()
            com.google.zxing.g.a r7 = m27476r(r1, r2, r0, r7)
            com.google.zxing.k.c.f r0 = new com.google.zxing.k.c.f
            r0.<init>()
            r0.m27510c(r8)
            r0.m27513f(r4)
            r0.m27514g(r9)
            int r1 = r9.m27440b()
            com.google.zxing.k.c.b r2 = new com.google.zxing.k.c.b
            r2.<init>(r1, r1)
            int r1 = m27469k(r7, r8, r9, r2)
            r0.m27511d(r1)
            com.google.zxing.p228k.p230c.C8689e.m27489a(r7, r8, r9, r1, r2)
            r0.m27512e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p228k.p230c.C8687c.m27472n(java.lang.String, com.google.zxing.k.b.a, java.util.Map):com.google.zxing.k.c.f");
    }

    /* renamed from: o */
    static byte[] m27473o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[length + i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new C8625c(C8623a.f32754e).m27242b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m27474p(int i2) {
        int[] iArr = f32957a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: q */
    static void m27475q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) throws WriterException {
        if (i5 >= i4) {
            throw new WriterException("Block ID too large");
        }
        int i6 = i2 % i4;
        int i7 = i4 - i6;
        int i8 = i2 / i4;
        int i9 = i8 + 1;
        int i10 = i3 / i4;
        int i11 = i10 + 1;
        int i12 = i8 - i10;
        int i13 = i9 - i11;
        if (i12 != i13) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i4 != i7 + i6) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i5 < i7) {
            iArr[0] = i10;
            iArr2[0] = i12;
        } else {
            iArr[0] = i11;
            iArr2[0] = i13;
        }
    }

    /* renamed from: r */
    static C8636a m27476r(C8636a c8636a, int i2, int i3, int i4) throws WriterException {
        if (c8636a.m27289j() != i3) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i4);
        int i5 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            m27475q(i2, i3, i4, i6, iArr, iArr2);
            int i7 = iArr[0];
            byte[] bArr = new byte[i7];
            c8636a.m27290l(i5 << 3, bArr, 0, i7);
            byte[] bArrM27473o = m27473o(bArr, iArr2[0]);
            arrayList.add(new C8685a(bArr, bArrM27473o));
            iMax = Math.max(iMax, i7);
            iMax2 = Math.max(iMax2, bArrM27473o.length);
            i5 += iArr[0];
        }
        if (i3 != i5) {
            throw new WriterException("Data bytes does not match offset");
        }
        C8636a c8636a2 = new C8636a();
        for (int i8 = 0; i8 < iMax; i8++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrM27450a = ((C8685a) it.next()).m27450a();
                if (i8 < bArrM27450a.length) {
                    c8636a2.m27285e(bArrM27450a[i8], 8);
                }
            }
        }
        for (int i9 = 0; i9 < iMax2; i9++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrM27451b = ((C8685a) it2.next()).m27451b();
                if (i9 < bArrM27451b.length) {
                    c8636a2.m27285e(bArrM27451b[i9], 8);
                }
            }
        }
        if (i2 == c8636a2.m27289j()) {
            return c8636a2;
        }
        throw new WriterException("Interleaving error: " + i2 + " and " + c8636a2.m27289j() + " differ.");
    }

    /* renamed from: s */
    private static boolean m27477s(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = bytes[i2] & 255;
                if ((i3 < 129 || i3 > 159) && (i3 < 224 || i3 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C8684c m27478t(EnumC8682a enumC8682a, EnumC8683b enumC8683b, C8636a c8636a, C8636a c8636a2) throws WriterException {
        return m27471m(m27467i(enumC8683b, c8636a, c8636a2, m27471m(m27467i(enumC8683b, c8636a, c8636a2, C8684c.m27439e(1)), enumC8682a)), enumC8682a);
    }

    /* renamed from: u */
    static void m27479u(int i2, C8636a c8636a) throws WriterException {
        int i3 = i2 << 3;
        if (c8636a.m27288i() > i3) {
            throw new WriterException("data bits cannot fit in the QR Code" + c8636a.m27288i() + " > " + i3);
        }
        for (int i4 = 0; i4 < 4 && c8636a.m27288i() < i3; i4++) {
            c8636a.m27283b(false);
        }
        int iM27288i = c8636a.m27288i() & 7;
        if (iM27288i > 0) {
            while (iM27288i < 8) {
                c8636a.m27283b(false);
                iM27288i++;
            }
        }
        int iM27289j = i2 - c8636a.m27289j();
        for (int i5 = 0; i5 < iM27289j; i5++) {
            c8636a.m27285e((i5 & 1) == 0 ? 236 : 17, 8);
        }
        if (c8636a.m27288i() != i3) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    /* renamed from: v */
    private static boolean m27480v(int i2, C8684c c8684c, EnumC8682a enumC8682a) {
        return c8684c.m27442d() - c8684c.m27441c(enumC8682a).m27449d() >= (i2 + 7) / 8;
    }
}
