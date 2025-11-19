package v2;

import androidx.media3.common.ParserException;

/* compiled from: FlacFrameReader.java */
/* loaded from: classes.dex */
public final class v {

    /* compiled from: FlacFrameReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f51225a;
    }

    private static boolean a(X1.y yVar, y yVar2, int i10) {
        int iJ = j(yVar, i10);
        return iJ != -1 && iJ <= yVar2.f51230b;
    }

    private static boolean b(X1.y yVar, int i10) {
        return yVar.H() == X1.L.y(yVar.e(), i10, yVar.f() - 1, 0);
    }

    private static boolean c(X1.y yVar, y yVar2, boolean z10, a aVar) {
        try {
            long jQ = yVar.Q();
            if (!z10) {
                jQ *= yVar2.f51230b;
            }
            aVar.f51225a = jQ;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(X1.y yVar, y yVar2, int i10, a aVar) {
        int iF = yVar.f();
        long J10 = yVar.J();
        long j10 = J10 >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((J10 >> 4) & 15), yVar2) && f((int) ((J10 >> 1) & 7), yVar2) && !(((J10 & 1) > 1L ? 1 : ((J10 & 1) == 1L ? 0 : -1)) == 0) && c(yVar, yVar2, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(yVar, yVar2, (int) ((J10 >> 12) & 15)) && e(yVar, yVar2, (int) ((J10 >> 8) & 15)) && b(yVar, iF);
    }

    private static boolean e(X1.y yVar, y yVar2, int i10) {
        int i11 = yVar2.f51233e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar2.f51234f;
        }
        if (i10 == 12) {
            return yVar.H() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iP = yVar.P();
        if (i10 == 14) {
            iP *= 10;
        }
        return iP == i11;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f51237i;
    }

    private static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f51235g - 1 : i10 <= 10 && yVar.f51235g == 2;
    }

    public static boolean h(InterfaceC4811q interfaceC4811q, y yVar, int i10, a aVar) {
        long jI = interfaceC4811q.i();
        byte[] bArr = new byte[2];
        interfaceC4811q.p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC4811q.m();
            interfaceC4811q.j((int) (jI - interfaceC4811q.getPosition()));
            return false;
        }
        X1.y yVar2 = new X1.y(16);
        System.arraycopy(bArr, 0, yVar2.e(), 0, 2);
        yVar2.V(C4812s.c(interfaceC4811q, yVar2.e(), 2, 14));
        interfaceC4811q.m();
        interfaceC4811q.j((int) (jI - interfaceC4811q.getPosition()));
        return d(yVar2, yVar, i10, aVar);
    }

    public static long i(InterfaceC4811q interfaceC4811q, y yVar) throws ParserException {
        interfaceC4811q.m();
        interfaceC4811q.j(1);
        byte[] bArr = new byte[1];
        interfaceC4811q.p(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC4811q.j(2);
        int i10 = z10 ? 7 : 6;
        X1.y yVar2 = new X1.y(i10);
        yVar2.V(C4812s.c(interfaceC4811q, yVar2.e(), 0, i10));
        interfaceC4811q.m();
        a aVar = new a();
        if (c(yVar2, yVar, z10, aVar)) {
            return aVar.f51225a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(X1.y yVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return yVar.H() + 1;
            case 7:
                return yVar.P() + 1;
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
