package v2;

import androidx.media3.common.ParserException;
import java.nio.ByteBuffer;

/* compiled from: Ac4Util.java */
/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4797c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f51115a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* compiled from: Ac4Util.java */
    /* renamed from: v2.c$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f51116a;

        /* renamed from: b, reason: collision with root package name */
        public int f51117b;

        /* renamed from: c, reason: collision with root package name */
        public int f51118c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f51119d;

        /* renamed from: e, reason: collision with root package name */
        public int f51120e;

        /* renamed from: f, reason: collision with root package name */
        public int f51121f;

        private b() {
            this.f51116a = true;
            this.f51117b = -1;
            this.f51118c = -1;
            this.f51119d = true;
            this.f51120e = 2;
            this.f51121f = 0;
        }
    }

    /* compiled from: Ac4Util.java */
    /* renamed from: v2.c$c, reason: collision with other inner class name */
    public static final class C0732c {

        /* renamed from: a, reason: collision with root package name */
        public final int f51122a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51123b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51124c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51125d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51126e;

        private C0732c(int i10, int i11, int i12, int i13, int i14) {
            this.f51122a = i10;
            this.f51124c = i11;
            this.f51123b = i12;
            this.f51125d = i13;
            this.f51126e = i14;
        }
    }

    public static void a(int i10, X1.y yVar) {
        yVar.S(7);
        byte[] bArrE = yVar.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & 255);
        bArrE[5] = (byte) ((i10 >> 8) & 255);
        bArrE[6] = (byte) (i10 & 255);
    }

    private static int b(int i10, boolean z10, int i11) {
        int iC = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iC;
        }
        if (!z10) {
            iC -= 2;
        }
        return i11 != 0 ? i11 != 1 ? iC : iC - 2 : iC - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 8;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 11;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 12;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static U1.s d(X1.y r18, java.lang.String r19, java.lang.String r20, U1.C1738n r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C4797c.d(X1.y, java.lang.String, java.lang.String, U1.n):U1.s");
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return f(new X1.x(bArr)).f51126e;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v2.C4797c.C0732c f(X1.x r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = j(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.h(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = v2.C4797c.f51115a
            r11 = r0[r11]
            goto L91
        L63:
            if (r9 != r7) goto L90
            int[] r4 = v2.C4797c.f51115a
            int r6 = r4.length
            if (r11 >= r6) goto L90
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8b
            r7 = 11
            if (r1 == r0) goto L86
            if (r1 == r2) goto L8b
            if (r1 == r3) goto L7c
            goto L84
        L7c:
            if (r11 == r2) goto L82
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
        L82:
            int r4 = r4 + 1
        L84:
            r11 = r4
            goto L91
        L86:
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
            goto L82
        L8b:
            if (r11 == r2) goto L82
            if (r11 != r6) goto L84
            goto L82
        L90:
            r11 = 0
        L91:
            v2.c$c r0 = new v2.c$c
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C4797c.f(X1.x):v2.c$c");
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void h(X1.x xVar, b bVar) throws ParserException {
        int iH = xVar.h(5);
        xVar.r(2);
        if (xVar.g()) {
            xVar.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            xVar.q();
        }
        if (xVar.g()) {
            int iH2 = xVar.h(3);
            if (bVar.f51117b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f51117b = iH;
            }
            if (xVar.g()) {
                l(xVar);
            }
        }
    }

    private static void i(X1.x xVar, b bVar) throws ParserException {
        xVar.r(2);
        boolean zG = xVar.g();
        int iH = xVar.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            xVar.r(2);
            if (xVar.g()) {
                xVar.r(5);
            }
            if (zG) {
                xVar.r(24);
            } else {
                if (xVar.g()) {
                    if (!xVar.g()) {
                        xVar.r(4);
                    }
                    bVar.f51118c = xVar.h(6) + 1;
                }
                xVar.r(4);
            }
        }
        if (xVar.g()) {
            xVar.r(3);
            if (xVar.g()) {
                l(xVar);
            }
        }
    }

    private static int j(X1.x xVar, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + xVar.h(i10);
            if (!xVar.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static boolean k(X1.x xVar) {
        if (xVar.b() < 66) {
            return false;
        }
        xVar.r(66);
        return true;
    }

    private static void l(X1.x xVar) throws ParserException {
        int iH = xVar.h(6);
        if (iH < 2 || iH > 42) {
            throw ParserException.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        xVar.r(iH * 8);
    }
}
