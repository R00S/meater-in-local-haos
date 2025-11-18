package c3;

import X1.C1804a;
import X1.L;
import X1.n;
import X1.y;
import android.util.Pair;
import androidx.media3.common.ParserException;
import v2.InterfaceC4811q;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes.dex */
final class d {

    /* compiled from: WavHeaderReader.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30990a;

        /* renamed from: b, reason: collision with root package name */
        public final long f30991b;

        private a(int i10, long j10) {
            this.f30990a = i10;
            this.f30991b = j10;
        }

        public static a a(InterfaceC4811q interfaceC4811q, y yVar) {
            interfaceC4811q.p(yVar.e(), 0, 8);
            yVar.W(0);
            return new a(yVar.q(), yVar.x());
        }
    }

    public static boolean a(InterfaceC4811q interfaceC4811q) {
        y yVar = new y(8);
        int i10 = a.a(interfaceC4811q, yVar).f30990a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC4811q.p(yVar.e(), 0, 4);
        yVar.W(0);
        int iQ = yVar.q();
        if (iQ == 1463899717) {
            return true;
        }
        n.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static C2311c b(InterfaceC4811q interfaceC4811q) throws ParserException {
        byte[] bArr;
        y yVar = new y(16);
        a aVarD = d(1718449184, interfaceC4811q, yVar);
        C1804a.g(aVarD.f30991b >= 16);
        interfaceC4811q.p(yVar.e(), 0, 16);
        yVar.W(0);
        int iZ = yVar.z();
        int iZ2 = yVar.z();
        int iY = yVar.y();
        int iY2 = yVar.y();
        int iZ3 = yVar.z();
        int iZ4 = yVar.z();
        int i10 = ((int) aVarD.f30991b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            interfaceC4811q.p(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = L.f18631f;
        }
        interfaceC4811q.n((int) (interfaceC4811q.i() - interfaceC4811q.getPosition()));
        return new C2311c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr);
    }

    public static long c(InterfaceC4811q interfaceC4811q) {
        y yVar = new y(8);
        a aVarA = a.a(interfaceC4811q, yVar);
        if (aVarA.f30990a != 1685272116) {
            interfaceC4811q.m();
            return -1L;
        }
        interfaceC4811q.j(8);
        yVar.W(0);
        interfaceC4811q.p(yVar.e(), 0, 8);
        long jV = yVar.v();
        interfaceC4811q.n(((int) aVarA.f30991b) + 8);
        return jV;
    }

    private static a d(int i10, InterfaceC4811q interfaceC4811q, y yVar) throws ParserException {
        a aVarA = a.a(interfaceC4811q, yVar);
        while (aVarA.f30990a != i10) {
            n.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f30990a);
            long j10 = aVarA.f30991b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw ParserException.d("Chunk is too large (~2GB+) to skip; id: " + aVarA.f30990a);
            }
            interfaceC4811q.n((int) j11);
            aVarA = a.a(interfaceC4811q, yVar);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(InterfaceC4811q interfaceC4811q) throws ParserException {
        interfaceC4811q.m();
        a aVarD = d(1684108385, interfaceC4811q, new y(8));
        interfaceC4811q.n(8);
        return Pair.create(Long.valueOf(interfaceC4811q.getPosition()), Long.valueOf(aVarD.f30991b));
    }
}
