package b3;

import v2.AbstractC4799e;
import v2.InterfaceC4811q;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class z extends AbstractC4799e {

    /* compiled from: PsBinarySearchSeeker.java */
    private static final class b implements AbstractC4799e.f {

        /* renamed from: a, reason: collision with root package name */
        private final X1.E f30518a;

        /* renamed from: b, reason: collision with root package name */
        private final X1.y f30519b;

        private AbstractC4799e.C0733e c(X1.y yVar, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (yVar.a() >= 4) {
                if (z.k(yVar.e(), yVar.f()) != 442) {
                    yVar.X(1);
                } else {
                    yVar.X(4);
                    long jL = C2211A.l(yVar);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f30518a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC4799e.C0733e.d(jB, j11) : AbstractC4799e.C0733e.e(j11 + iF2);
                        }
                        if (100000 + jB > j10) {
                            return AbstractC4799e.C0733e.e(j11 + yVar.f());
                        }
                        iF2 = yVar.f();
                        j12 = jB;
                    }
                    d(yVar);
                    iF = yVar.f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC4799e.C0733e.f(j12, j11 + iF) : AbstractC4799e.C0733e.f51158d;
        }

        private static void d(X1.y yVar) {
            int iK;
            int iG = yVar.g();
            if (yVar.a() < 10) {
                yVar.W(iG);
                return;
            }
            yVar.X(9);
            int iH = yVar.H() & 7;
            if (yVar.a() < iH) {
                yVar.W(iG);
                return;
            }
            yVar.X(iH);
            if (yVar.a() < 4) {
                yVar.W(iG);
                return;
            }
            if (z.k(yVar.e(), yVar.f()) == 443) {
                yVar.X(4);
                int iP = yVar.P();
                if (yVar.a() < iP) {
                    yVar.W(iG);
                    return;
                }
                yVar.X(iP);
            }
            while (yVar.a() >= 4 && (iK = z.k(yVar.e(), yVar.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                yVar.X(4);
                if (yVar.a() < 2) {
                    yVar.W(iG);
                    return;
                }
                yVar.W(Math.min(yVar.g(), yVar.f() + yVar.P()));
            }
        }

        @Override // v2.AbstractC4799e.f
        public AbstractC4799e.C0733e a(InterfaceC4811q interfaceC4811q, long j10) {
            long position = interfaceC4811q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC4811q.a() - position);
            this.f30519b.S(iMin);
            interfaceC4811q.p(this.f30519b.e(), 0, iMin);
            return c(this.f30519b, j10, position);
        }

        @Override // v2.AbstractC4799e.f
        public void b() {
            this.f30519b.T(X1.L.f18631f);
        }

        private b(X1.E e10) {
            this.f30518a = e10;
            this.f30519b = new X1.y();
        }
    }

    public z(X1.E e10, long j10, long j11) {
        super(new AbstractC4799e.b(), new b(e10), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
