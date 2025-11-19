package v2;

import U1.C1738n;
import U1.s;
import androidx.media3.common.ParserException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DtsUtil.java */
/* renamed from: v2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4809o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f51208a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f51209b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f51210c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f51211d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f51212e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f51213f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f51214g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f51215h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f51216i = {5, 8, 10, 12};

    /* compiled from: DtsUtil.java */
    /* renamed from: v2.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f51217a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51218b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51219c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51220d;

        /* renamed from: e, reason: collision with root package name */
        public final long f51221e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51222f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f51217a = str;
            this.f51219c = i10;
            this.f51218b = i11;
            this.f51220d = i12;
            this.f51221e = j10;
            this.f51222f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) throws ParserException {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != X1.L.v(bArr, 0, i11, 65535)) {
            throw ParserException.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C4809o.b(byte[]):int");
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static X1.x d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new X1.x(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        X1.x xVar = new X1.x(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            X1.x xVar2 = new X1.x(bArrCopyOf);
            while (xVar2.b() >= 16) {
                xVar2.r(2);
                xVar.f(xVar2.h(14), 14);
            }
        }
        xVar.n(bArrCopyOf);
        return xVar;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static U1.s h(byte[] bArr, String str, String str2, int i10, C1738n c1738n) {
        X1.x xVarD = d(bArr);
        xVarD.r(60);
        int i11 = f51208a[xVarD.h(6)];
        int i12 = f51209b[xVarD.h(4)];
        int iH = xVarD.h(5);
        int[] iArr = f51210c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        xVarD.r(10);
        return new s.b().e0(str).s0("audio/vnd.dts").P(i13).Q(i11 + (xVarD.h(2) > 0 ? 1 : 0)).t0(i12).X(c1738n).i0(str2).q0(i10).M();
    }

    public static b i(byte[] bArr) throws ParserException {
        int i10;
        int i11;
        int iH;
        int i12;
        int iH2;
        long jD1;
        int i13;
        X1.x xVarD = d(bArr);
        xVarD.r(40);
        int iH3 = xVarD.h(2);
        if (xVarD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        xVarD.r(i11);
        int iH4 = xVarD.h(i10) + 1;
        boolean zG = xVarD.g();
        int i14 = 0;
        if (zG) {
            iH = xVarD.h(2);
            int iH5 = (xVarD.h(3) + 1) * 512;
            if (xVarD.g()) {
                xVarD.r(36);
            }
            int iH6 = xVarD.h(3) + 1;
            int iH7 = xVarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw ParserException.d("Multiple audio presentations or assets not supported");
            }
            int i15 = iH3 + 1;
            int iH8 = xVarD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    xVarD.r(8);
                }
            }
            if (xVarD.g()) {
                xVarD.r(2);
                int iH9 = (xVarD.h(2) + 1) << 2;
                int iH10 = xVarD.h(2) + 1;
                while (i14 < iH10) {
                    xVarD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        xVarD.r(i10);
        xVarD.r(12);
        if (zG) {
            if (xVarD.g()) {
                xVarD.r(4);
            }
            if (xVarD.g()) {
                xVarD.r(24);
            }
            if (xVarD.g()) {
                xVarD.s(xVarD.h(10) + 1);
            }
            xVarD.r(5);
            int i17 = f51211d[xVarD.h(4)];
            iH2 = xVarD.h(8) + 1;
            i12 = i17;
        } else {
            i12 = -2147483647;
            iH2 = -1;
        }
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw ParserException.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jD1 = X1.L.d1(i14, 1000000L, i13);
        } else {
            jD1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH2, i12, iH4, jD1, 0);
    }

    public static int j(byte[] bArr) {
        X1.x xVarD = d(bArr);
        xVarD.r(42);
        return xVarD.h(xVarD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iH;
        long jD1;
        int i10;
        int i11;
        X1.x xVarD = d(bArr);
        int i12 = xVarD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(xVarD, f51212e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jD1 = -9223372036854775807L;
        } else {
            if (!xVarD.g()) {
                throw ParserException.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = xVarD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw ParserException.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (xVarD.h(3) + 1);
            int iH4 = xVarD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw ParserException.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (xVarD.g()) {
                xVarD.r(36);
            }
            iH = (1 << xVarD.h(2)) * i11;
            jD1 = X1.L.d1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jD1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(xVarD, f51213f, true);
        }
        if (i12 != 0) {
            atomicInteger.set(m(xVarD, f51214g, true));
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger.get() != 0 ? m(xVarD, f51215h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        X1.x xVarD = d(bArr);
        xVarD.r(32);
        return m(xVarD, f51216i, true) + 1;
    }

    private static int m(X1.x xVar, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && xVar.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + xVar.h(iArr[i11]);
    }
}
