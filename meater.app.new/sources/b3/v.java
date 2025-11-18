package b3;

import X1.C1804a;
import androidx.media3.common.ParserException;
import o8.C4144d;
import o8.C4145e;

/* compiled from: MpeghUtil.java */
/* loaded from: classes.dex */
final class v {

    /* compiled from: MpeghUtil.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f30491a;

        /* renamed from: b, reason: collision with root package name */
        public long f30492b;

        /* renamed from: c, reason: collision with root package name */
        public int f30493c;
    }

    /* compiled from: MpeghUtil.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f30494a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30495b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30496c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f30497d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f30494a = i10;
            this.f30495b = i11;
            this.f30496c = i12;
            this.f30497d = bArr;
        }
    }

    private static int a(int i10) throws ParserException {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) throws ParserException {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.d("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws ParserException {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 11025;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 8000;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 7350;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            default:
                throw ParserException.d("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i10) throws ParserException {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(X1.x xVar) {
        if (!xVar.g()) {
            return 0;
        }
        xVar.r(2);
        return xVar.h(13);
    }

    public static boolean g(X1.x xVar, b bVar) throws ParserException {
        xVar.d();
        int iK = k(xVar, 3, 8, 8);
        bVar.f30491a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(xVar, 2, 8, 32);
        bVar.f30492b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw ParserException.d("Contains sub-stream with an invalid packet label " + bVar.f30492b);
        }
        if (jL == 0) {
            int i10 = bVar.f30491a;
            if (i10 == 1) {
                throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(xVar, 11, 24, 24);
        bVar.f30493c = iK2;
        return iK2 != -1;
    }

    public static c h(X1.x xVar) throws ParserException {
        int iH = xVar.h(8);
        int iH2 = xVar.h(5);
        int iH3 = iH2 == 31 ? xVar.h(24) : c(iH2);
        int iH4 = xVar.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        xVar.r(2);
        p(xVar);
        m(xVar, j(xVar), iD);
        byte[] bArr = null;
        if (xVar.g()) {
            int iK = k(xVar, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(xVar, 4, 8, 16);
                int iK3 = k(xVar, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = xVar.h(4) + 1;
                    xVar.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) xVar.h(8);
                    }
                    bArr = bArr2;
                } else {
                    xVar.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (iH3 * dB), (int) (iA * dB), bArr3);
    }

    private static boolean i(X1.x xVar) {
        xVar.r(3);
        boolean zG = xVar.g();
        if (zG) {
            xVar.r(13);
        }
        return zG;
    }

    private static int j(X1.x xVar) {
        int iH = xVar.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = xVar.h(3);
            iK += k(xVar, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && xVar.g()) {
                p(xVar);
            }
        }
        return iK;
    }

    private static int k(X1.x xVar, int i10, int i11, int i12) {
        C1804a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        C4144d.a(C4144d.a(i13, i14), 1 << i12);
        if (xVar.b() < i10) {
            return -1;
        }
        int iH = xVar.h(i10);
        if (iH != i13) {
            return iH;
        }
        if (xVar.b() < i11) {
            return -1;
        }
        int iH2 = xVar.h(i11);
        int i15 = iH + iH2;
        if (iH2 != i14) {
            return i15;
        }
        if (xVar.b() < i12) {
            return -1;
        }
        return i15 + xVar.h(i12);
    }

    private static long l(X1.x xVar, int i10, int i11, int i12) {
        C1804a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        C4145e.a(C4145e.a(j10, j11), 1 << i12);
        if (xVar.b() < i10) {
            return -1L;
        }
        long j12 = xVar.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (xVar.b() < i11) {
            return -1L;
        }
        long j13 = xVar.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (xVar.b() < i12) {
            return -1L;
        }
        return j14 + xVar.j(i12);
    }

    private static void m(X1.x xVar, int i10, int i11) {
        int iH;
        int iK = k(xVar, 4, 8, 16) + 1;
        xVar.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = xVar.h(2);
            if (iH2 == 0) {
                i(xVar);
                if (i11 > 0) {
                    o(xVar);
                }
            } else if (iH2 == 1) {
                if (i(xVar)) {
                    xVar.q();
                }
                if (i11 > 0) {
                    o(xVar);
                    iH = xVar.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    xVar.r(6);
                    int iH3 = xVar.h(2);
                    xVar.r(4);
                    if (xVar.g()) {
                        xVar.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        xVar.r(6);
                    }
                    if (iH3 == 2) {
                        xVar.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = xVar.h(2);
                if (iH4 > 0 && xVar.g()) {
                    xVar.r(iFloor);
                }
                if (xVar.g()) {
                    xVar.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    xVar.q();
                }
            } else if (iH2 == 3) {
                k(xVar, 4, 8, 16);
                int iK2 = k(xVar, 4, 8, 16);
                if (xVar.g()) {
                    k(xVar, 8, 16, 0);
                }
                xVar.q();
                if (iK2 > 0) {
                    xVar.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(X1.x xVar, int i10) {
        int iH;
        boolean zG = xVar.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (xVar.g()) {
                xVar.r(7);
                iH = 0;
            } else {
                if (xVar.h(2) == 3 && xVar.h(i12) * i11 != 0) {
                    xVar.q();
                }
                iH = xVar.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    xVar.q();
                }
                xVar.q();
            }
            if (iH != 0 && iH != 180 && xVar.g()) {
                i14++;
            }
            i14++;
        }
    }

    private static void o(X1.x xVar) {
        xVar.r(3);
        xVar.r(8);
        boolean zG = xVar.g();
        boolean zG2 = xVar.g();
        if (zG) {
            xVar.r(5);
        }
        if (zG2) {
            xVar.r(6);
        }
    }

    private static void p(X1.x xVar) {
        int iH = xVar.h(2);
        if (iH == 0) {
            xVar.r(6);
            return;
        }
        int iK = k(xVar, 5, 8, 16) + 1;
        if (iH == 1) {
            xVar.r(iK * 7);
        } else if (iH == 2) {
            n(xVar, iK);
        }
    }
}
