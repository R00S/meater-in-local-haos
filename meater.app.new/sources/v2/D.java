package v2;

import J2.h;
import java.io.EOFException;

/* compiled from: Id3Peeker.java */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final X1.y f51030a = new X1.y(10);

    public U1.y a(InterfaceC4811q interfaceC4811q, h.a aVar) {
        U1.y yVarE = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC4811q.p(this.f51030a.e(), 0, 10);
                this.f51030a.W(0);
                if (this.f51030a.K() != 4801587) {
                    break;
                }
                this.f51030a.X(3);
                int iG = this.f51030a.G();
                int i11 = iG + 10;
                if (yVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f51030a.e(), 0, bArr, 0, 10);
                    interfaceC4811q.p(bArr, 10, iG);
                    yVarE = new J2.h(aVar).e(bArr, i11);
                } else {
                    interfaceC4811q.j(iG);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC4811q.m();
        interfaceC4811q.j(i10);
        return yVarE;
    }
}
