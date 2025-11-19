package v2;

import androidx.media3.common.ParserException;
import com.apptionlabs.meater_app.model.TemperatureLog;

/* compiled from: AacUtil.java */
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4795a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f51097a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f51098b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* renamed from: v2.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f51099a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51100b;

        /* renamed from: c, reason: collision with root package name */
        public final String f51101c;

        private b(int i10, int i11, String str) {
            this.f51099a = i10;
            this.f51100b = i11;
            this.f51101c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES))};
    }

    private static int b(X1.x xVar) {
        int iH = xVar.h(5);
        return iH == 31 ? xVar.h(6) + 32 : iH;
    }

    private static int c(X1.x xVar) throws ParserException {
        int iH = xVar.h(4);
        if (iH == 15) {
            if (xVar.b() >= 24) {
                return xVar.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f51097a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(X1.x xVar, boolean z10) throws ParserException {
        int iB = b(xVar);
        int iC = c(xVar);
        int iH = xVar.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(xVar);
            iB = b(xVar);
            if (iB == 22) {
                iH = xVar.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.d("Unsupported audio object type: " + iB);
                }
            }
            f(xVar, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = xVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.d("Unsupported epConfig: " + iH2);
                    }
            }
        }
        int i10 = f51098b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw ParserException.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new X1.x(bArr), false);
    }

    private static void f(X1.x xVar, int i10, int i11) {
        if (xVar.g()) {
            X1.n.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.g()) {
            xVar.r(14);
        }
        boolean zG = xVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            xVar.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                xVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                xVar.r(3);
            }
            xVar.r(1);
        }
    }
}
