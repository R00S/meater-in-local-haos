package v2;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;
import v2.y;

/* compiled from: FlacMetadataReader.java */
/* loaded from: classes.dex */
public final class w {

    /* compiled from: FlacMetadataReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f51226a;

        public a(y yVar) {
            this.f51226a = yVar;
        }
    }

    public static boolean a(InterfaceC4811q interfaceC4811q) {
        X1.y yVar = new X1.y(4);
        interfaceC4811q.p(yVar.e(), 0, 4);
        return yVar.J() == 1716281667;
    }

    public static int b(InterfaceC4811q interfaceC4811q) throws ParserException {
        interfaceC4811q.m();
        X1.y yVar = new X1.y(2);
        interfaceC4811q.p(yVar.e(), 0, 2);
        int iP = yVar.P();
        if ((iP >> 2) == 16382) {
            interfaceC4811q.m();
            return iP;
        }
        interfaceC4811q.m();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static U1.y c(InterfaceC4811q interfaceC4811q, boolean z10) {
        U1.y yVarA = new D().a(interfaceC4811q, z10 ? null : J2.h.f7250b);
        if (yVarA == null || yVarA.e() == 0) {
            return null;
        }
        return yVarA;
    }

    public static U1.y d(InterfaceC4811q interfaceC4811q, boolean z10) {
        interfaceC4811q.m();
        long jI = interfaceC4811q.i();
        U1.y yVarC = c(interfaceC4811q, z10);
        interfaceC4811q.n((int) (interfaceC4811q.i() - jI));
        return yVarC;
    }

    public static boolean e(InterfaceC4811q interfaceC4811q, a aVar) {
        interfaceC4811q.m();
        X1.x xVar = new X1.x(new byte[4]);
        interfaceC4811q.p(xVar.f18699a, 0, 4);
        boolean zG = xVar.g();
        int iH = xVar.h(7);
        int iH2 = xVar.h(24) + 4;
        if (iH == 0) {
            aVar.f51226a = h(interfaceC4811q);
        } else {
            y yVar = aVar.f51226a;
            if (yVar == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                aVar.f51226a = yVar.b(g(interfaceC4811q, iH2));
            } else if (iH == 4) {
                aVar.f51226a = yVar.c(j(interfaceC4811q, iH2));
            } else if (iH == 6) {
                X1.y yVar2 = new X1.y(iH2);
                interfaceC4811q.readFully(yVar2.e(), 0, iH2);
                yVar2.X(4);
                aVar.f51226a = yVar.a(AbstractC4009y.H(H2.a.a(yVar2)));
            } else {
                interfaceC4811q.n(iH2);
            }
        }
        return zG;
    }

    public static y.a f(X1.y yVar) {
        yVar.X(1);
        int iK = yVar.K();
        long jF = yVar.f() + iK;
        int i10 = iK / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jA = yVar.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA;
            jArrCopyOf2[i11] = yVar.A();
            yVar.X(2);
            i11++;
        }
        yVar.X((int) (jF - yVar.f()));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y.a g(InterfaceC4811q interfaceC4811q, int i10) {
        X1.y yVar = new X1.y(i10);
        interfaceC4811q.readFully(yVar.e(), 0, i10);
        return f(yVar);
    }

    private static y h(InterfaceC4811q interfaceC4811q) {
        byte[] bArr = new byte[38];
        interfaceC4811q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC4811q interfaceC4811q) throws ParserException {
        X1.y yVar = new X1.y(4);
        interfaceC4811q.readFully(yVar.e(), 0, 4);
        if (yVar.J() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(InterfaceC4811q interfaceC4811q, int i10) {
        X1.y yVar = new X1.y(i10);
        interfaceC4811q.readFully(yVar.e(), 0, i10);
        yVar.X(4);
        return Arrays.asList(S.k(yVar, false, false).f51081b);
    }
}
