package com.google.zxing.p228k.p230c;

import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8636a;
import com.google.zxing.p228k.p229b.C8684c;
import com.google.zxing.p228k.p229b.EnumC8682a;
import okhttp3.internal.p454ws.WebSocketProtocol;

/* compiled from: MatrixUtil.java */
/* renamed from: com.google.zxing.k.c.e */
/* loaded from: classes2.dex */
final class C8689e {

    /* renamed from: a */
    private static final int[][] f32959a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f32960b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f32961c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f32962d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m27489a(C8636a c8636a, EnumC8682a enumC8682a, C8684c c8684c, int i2, C8686b c8686b) throws WriterException {
        m27491c(c8686b);
        m27492d(c8684c, c8686b);
        m27500l(enumC8682a, i2, c8686b);
        m27507s(c8684c, c8686b);
        m27494f(c8636a, i2, c8686b);
    }

    /* renamed from: b */
    static int m27490b(int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iM27502n = m27502n(i3);
        int iM27502n2 = i2 << (iM27502n - 1);
        while (m27502n(iM27502n2) >= iM27502n) {
            iM27502n2 ^= i3 << (m27502n(iM27502n2) - iM27502n);
        }
        return iM27502n2;
    }

    /* renamed from: c */
    static void m27491c(C8686b c8686b) {
        c8686b.m27452a((byte) -1);
    }

    /* renamed from: d */
    static void m27492d(C8684c c8684c, C8686b c8686b) throws WriterException {
        m27498j(c8686b);
        m27493e(c8686b);
        m27506r(c8684c, c8686b);
        m27499k(c8686b);
    }

    /* renamed from: e */
    private static void m27493e(C8686b c8686b) throws WriterException {
        if (c8686b.m27453b(8, c8686b.m27455d() - 8) == 0) {
            throw new WriterException();
        }
        c8686b.m27457f(8, c8686b.m27455d() - 8, 1);
    }

    /* renamed from: f */
    static void m27494f(C8636a c8636a, int i2, C8686b c8686b) throws WriterException {
        boolean zM27287h;
        int iM27456e = c8686b.m27456e() - 1;
        int iM27455d = c8686b.m27455d() - 1;
        int i3 = 0;
        int i4 = -1;
        while (iM27456e > 0) {
            if (iM27456e == 6) {
                iM27456e--;
            }
            while (iM27455d >= 0 && iM27455d < c8686b.m27455d()) {
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = iM27456e - i5;
                    if (m27503o(c8686b.m27453b(i6, iM27455d))) {
                        if (i3 < c8636a.m27288i()) {
                            zM27287h = c8636a.m27287h(i3);
                            i3++;
                        } else {
                            zM27287h = false;
                        }
                        if (i2 != -1 && C8688d.m27486f(i2, i6, iM27455d)) {
                            zM27287h = !zM27287h;
                        }
                        c8686b.m27458g(i6, iM27455d, zM27287h);
                    }
                }
                iM27455d += i4;
            }
            i4 = -i4;
            iM27455d += i4;
            iM27456e -= 2;
        }
        if (i3 == c8636a.m27288i()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i3 + '/' + c8636a.m27288i());
    }

    /* renamed from: g */
    private static void m27495g(int i2, int i3, C8686b c8686b) throws WriterException {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!m27503o(c8686b.m27453b(i5, i3))) {
                throw new WriterException();
            }
            c8686b.m27457f(i5, i3, 0);
        }
    }

    /* renamed from: h */
    private static void m27496h(int i2, int i3, C8686b c8686b) {
        for (int i4 = 0; i4 < 5; i4++) {
            int[] iArr = f32960b[i4];
            for (int i5 = 0; i5 < 5; i5++) {
                c8686b.m27457f(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    /* renamed from: i */
    private static void m27497i(int i2, int i3, C8686b c8686b) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = f32959a[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                c8686b.m27457f(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    /* renamed from: j */
    private static void m27498j(C8686b c8686b) throws WriterException {
        int length = f32959a[0].length;
        m27497i(0, 0, c8686b);
        m27497i(c8686b.m27456e() - length, 0, c8686b);
        m27497i(0, c8686b.m27456e() - length, c8686b);
        m27495g(0, 7, c8686b);
        m27495g(c8686b.m27456e() - 8, 7, c8686b);
        m27495g(0, c8686b.m27456e() - 8, c8686b);
        m27501m(7, 0, c8686b);
        m27501m((c8686b.m27455d() - 7) - 1, 0, c8686b);
        m27501m(7, c8686b.m27455d() - 7, c8686b);
    }

    /* renamed from: k */
    private static void m27499k(C8686b c8686b) {
        int i2 = 8;
        while (i2 < c8686b.m27456e() - 8) {
            int i3 = i2 + 1;
            int i4 = i3 % 2;
            if (m27503o(c8686b.m27453b(i2, 6))) {
                c8686b.m27457f(i2, 6, i4);
            }
            if (m27503o(c8686b.m27453b(6, i2))) {
                c8686b.m27457f(6, i2, i4);
            }
            i2 = i3;
        }
    }

    /* renamed from: l */
    static void m27500l(EnumC8682a enumC8682a, int i2, C8686b c8686b) throws WriterException {
        C8636a c8636a = new C8636a();
        m27504p(enumC8682a, i2, c8636a);
        for (int i3 = 0; i3 < c8636a.m27288i(); i3++) {
            boolean zM27287h = c8636a.m27287h((c8636a.m27288i() - 1) - i3);
            int[] iArr = f32962d[i3];
            c8686b.m27458g(iArr[0], iArr[1], zM27287h);
            if (i3 < 8) {
                c8686b.m27458g((c8686b.m27456e() - i3) - 1, 8, zM27287h);
            } else {
                c8686b.m27458g(8, (c8686b.m27455d() - 7) + (i3 - 8), zM27287h);
            }
        }
    }

    /* renamed from: m */
    private static void m27501m(int i2, int i3, C8686b c8686b) throws WriterException {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!m27503o(c8686b.m27453b(i2, i5))) {
                throw new WriterException();
            }
            c8686b.m27457f(i2, i5, 0);
        }
    }

    /* renamed from: n */
    static int m27502n(int i2) {
        return 32 - Integer.numberOfLeadingZeros(i2);
    }

    /* renamed from: o */
    private static boolean m27503o(int i2) {
        return i2 == -1;
    }

    /* renamed from: p */
    static void m27504p(EnumC8682a enumC8682a, int i2, C8636a c8636a) throws WriterException {
        if (!C8690f.m27508b(i2)) {
            throw new WriterException("Invalid mask pattern");
        }
        int iM27435g = (enumC8682a.m27435g() << 3) | i2;
        c8636a.m27285e(iM27435g, 5);
        c8636a.m27285e(m27490b(iM27435g, 1335), 10);
        C8636a c8636a2 = new C8636a();
        c8636a2.m27285e(21522, 15);
        c8636a.m27291m(c8636a2);
        if (c8636a.m27288i() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c8636a.m27288i());
    }

    /* renamed from: q */
    static void m27505q(C8684c c8684c, C8636a c8636a) throws WriterException {
        c8636a.m27285e(c8684c.m27443f(), 6);
        c8636a.m27285e(m27490b(c8684c.m27443f(), 7973), 12);
        if (c8636a.m27288i() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c8636a.m27288i());
    }

    /* renamed from: r */
    private static void m27506r(C8684c c8684c, C8686b c8686b) {
        if (c8684c.m27443f() < 2) {
            return;
        }
        int[] iArr = f32961c[c8684c.m27443f() - 1];
        for (int i2 : iArr) {
            if (i2 >= 0) {
                for (int i3 : iArr) {
                    if (i3 >= 0 && m27503o(c8686b.m27453b(i3, i2))) {
                        m27496h(i3 - 2, i2 - 2, c8686b);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m27507s(C8684c c8684c, C8686b c8686b) throws WriterException {
        if (c8684c.m27443f() < 7) {
            return;
        }
        C8636a c8636a = new C8636a();
        m27505q(c8684c, c8636a);
        int i2 = 17;
        for (int i3 = 0; i3 < 6; i3++) {
            for (int i4 = 0; i4 < 3; i4++) {
                boolean zM27287h = c8636a.m27287h(i2);
                i2--;
                c8686b.m27458g(i3, (c8686b.m27455d() - 11) + i4, zM27287h);
                c8686b.m27458g((c8686b.m27455d() - 11) + i4, i3, zM27287h);
            }
        }
    }
}
