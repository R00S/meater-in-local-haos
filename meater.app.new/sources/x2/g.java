package x2;

import U1.s;
import X1.L;
import X1.n;
import X1.y;
import m8.AbstractC4009y;

/* compiled from: StreamFormatChunk.java */
/* loaded from: classes.dex */
final class g implements InterfaceC5052a {

    /* renamed from: a, reason: collision with root package name */
    public final s f52595a;

    public g(s sVar) {
        this.f52595a = sVar;
    }

    private static String b(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String c(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static InterfaceC5052a d(y yVar) {
        yVar.X(4);
        int iU = yVar.u();
        int iU2 = yVar.u();
        yVar.X(4);
        int iU3 = yVar.u();
        String strB = b(iU3);
        if (strB != null) {
            s.b bVar = new s.b();
            bVar.z0(iU).c0(iU2).s0(strB);
            return new g(bVar.M());
        }
        n.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static InterfaceC5052a e(int i10, y yVar) {
        if (i10 == 2) {
            return d(yVar);
        }
        if (i10 == 1) {
            return f(yVar);
        }
        n.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + L.s0(i10));
        return null;
    }

    private static InterfaceC5052a f(y yVar) {
        int iZ = yVar.z();
        String strC = c(iZ);
        if (strC == null) {
            n.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ);
            return null;
        }
        int iZ2 = yVar.z();
        int iU = yVar.u();
        yVar.X(6);
        int iG0 = L.g0(yVar.z());
        int iZ3 = yVar.a() > 0 ? yVar.z() : 0;
        byte[] bArr = new byte[iZ3];
        yVar.l(bArr, 0, iZ3);
        s.b bVar = new s.b();
        bVar.s0(strC).Q(iZ2).t0(iU);
        if ("audio/raw".equals(strC) && iG0 != 0) {
            bVar.m0(iG0);
        }
        if ("audio/mp4a-latm".equals(strC) && iZ3 > 0) {
            bVar.f0(AbstractC4009y.H(bArr));
        }
        return new g(bVar.M());
    }

    @Override // x2.InterfaceC5052a
    public int a() {
        return 1718776947;
    }
}
