package v2;

import android.util.Base64;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: VorbisUtil.java */
/* loaded from: classes.dex */
public final class S {

    /* compiled from: VorbisUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f51080a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f51081b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51082c;

        public a(String str, String[] strArr, int i10) {
            this.f51080a = str;
            this.f51081b = strArr;
            this.f51082c = i10;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f51083a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51084b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51085c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51086d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f51083a = z10;
            this.f51084b = i10;
            this.f51085c = i11;
            this.f51086d = i12;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f51087a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51088b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51089c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51090d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51091e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51092f;

        /* renamed from: g, reason: collision with root package name */
        public final int f51093g;

        /* renamed from: h, reason: collision with root package name */
        public final int f51094h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f51095i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f51096j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f51087a = i10;
            this.f51088b = i11;
            this.f51089c = i12;
            this.f51090d = i13;
            this.f51091e = i14;
            this.f51092f = i15;
            this.f51093g = i16;
            this.f51094h = i17;
            this.f51095i = z10;
            this.f51096j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static U1.y d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrM1 = X1.L.m1(str, "=");
            if (strArrM1.length != 2) {
                X1.n.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrM1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(H2.a.a(new X1.y(Base64.decode(strArrM1[1], 0))));
                } catch (RuntimeException e10) {
                    X1.n.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new M2.a(strArrM1[0], strArrM1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new U1.y(arrayList);
    }

    public static AbstractC4009y<byte[]> e(byte[] bArr) {
        X1.y yVar = new X1.y(bArr);
        yVar.X(1);
        int i10 = 0;
        while (yVar.a() > 0 && yVar.j() == 255) {
            i10 += 255;
            yVar.X(1);
        }
        int iH = i10 + yVar.H();
        int i11 = 0;
        while (yVar.a() > 0 && yVar.j() == 255) {
            i11 += 255;
            yVar.X(1);
        }
        int iH2 = i11 + yVar.H();
        byte[] bArr2 = new byte[iH];
        int iF = yVar.f();
        System.arraycopy(bArr, iF, bArr2, 0, iH);
        int i12 = iF + iH + iH2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return AbstractC4009y.I(bArr2, bArr3);
    }

    private static void f(Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q10.d(16);
            if (iD2 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int iD3 = q10.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q10.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q10.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q10.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int iD6 = q10.d(2);
                    if (iD6 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int iD7 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q10.d(16);
            if (iD2 != 0) {
                X1.n.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int iD4 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q10.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q10.e(8);
                    q10.e(8);
                    q10.e(8);
                }
            }
        }
    }

    private static b[] h(Q q10) {
        int iD = q10.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    private static void i(Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q10.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            q10.e(24);
            q10.e(24);
            q10.e(24);
            int iD2 = q10.d(6) + 1;
            q10.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q10.e(8);
                    }
                }
            }
        }
    }

    public static a j(X1.y yVar) {
        return k(yVar, true, true);
    }

    public static a k(X1.y yVar, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            o(3, yVar, false);
        }
        String strE = yVar.E((int) yVar.x());
        int length = strE.length();
        long jX = yVar.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jX; i10++) {
            String strE2 = yVar.E((int) yVar.x());
            strArr[i10] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z11 && (yVar.H() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c l(X1.y yVar) throws ParserException {
        o(1, yVar, false);
        int iY = yVar.y();
        int iH = yVar.H();
        int iY2 = yVar.y();
        int iU = yVar.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = yVar.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = yVar.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = yVar.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (yVar.H() & 1) > 0, Arrays.copyOf(yVar.e(), yVar.g()));
    }

    public static b[] m(X1.y yVar, int i10) throws ParserException {
        o(5, yVar, false);
        int iH = yVar.H() + 1;
        Q q10 = new Q(yVar.e());
        q10.e(yVar.f() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            n(q10);
        }
        int iD = q10.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q10.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] bVarArrH = h(q10);
        if (q10.c()) {
            return bVarArrH;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void n(Q q10) throws ParserException {
        if (q10.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), null);
        }
        int iD = q10.d(16);
        int iD2 = q10.d(24);
        int iD3 = 0;
        if (q10.c()) {
            q10.e(5);
            while (iD3 < iD2) {
                iD3 += q10.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q10.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q10.e(5);
                } else if (q10.c()) {
                    q10.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q10.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q10.e(32);
            q10.e(32);
            int iD5 = q10.d(4) + 1;
            q10.e(1);
            q10.e((int) ((iD4 == 1 ? iD != 0 ? c(iD2, iD) : 0L : iD * iD2) * iD5));
        }
    }

    public static boolean o(int i10, X1.y yVar, boolean z10) throws ParserException {
        if (yVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a("too short header: " + yVar.a(), null);
        }
        if (yVar.H() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (yVar.H() == 118 && yVar.H() == 111 && yVar.H() == 114 && yVar.H() == 98 && yVar.H() == 105 && yVar.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
