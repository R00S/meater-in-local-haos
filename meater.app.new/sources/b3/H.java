package b3;

import v2.AbstractC4799e;
import v2.InterfaceC4811q;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class H extends AbstractC4799e {

    /* compiled from: TsBinarySearchSeeker.java */
    private static final class a implements AbstractC4799e.f {

        /* renamed from: a, reason: collision with root package name */
        private final X1.E f30152a;

        /* renamed from: b, reason: collision with root package name */
        private final X1.y f30153b = new X1.y();

        /* renamed from: c, reason: collision with root package name */
        private final int f30154c;

        /* renamed from: d, reason: collision with root package name */
        private final int f30155d;

        public a(int i10, X1.E e10, int i11) {
            this.f30154c = i10;
            this.f30152a = e10;
            this.f30155d = i11;
        }

        private AbstractC4799e.C0733e c(X1.y yVar, long j10, long j11) {
            int iA;
            int iA2;
            int iG = yVar.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (yVar.a() >= 188 && (iA2 = (iA = M.a(yVar.e(), yVar.f(), iG)) + 188) <= iG) {
                long jC = M.c(yVar, iA, this.f30154c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f30152a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC4799e.C0733e.d(jB, j11) : AbstractC4799e.C0733e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return AbstractC4799e.C0733e.e(j11 + iA);
                    }
                    j13 = iA;
                    j14 = jB;
                }
                yVar.W(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC4799e.C0733e.f(j14, j11 + j12) : AbstractC4799e.C0733e.f51158d;
        }

        @Override // v2.AbstractC4799e.f
        public AbstractC4799e.C0733e a(InterfaceC4811q interfaceC4811q, long j10) {
            long position = interfaceC4811q.getPosition();
            int iMin = (int) Math.min(this.f30155d, interfaceC4811q.a() - position);
            this.f30153b.S(iMin);
            interfaceC4811q.p(this.f30153b.e(), 0, iMin);
            return c(this.f30153b, j10, position);
        }

        @Override // v2.AbstractC4799e.f
        public void b() {
            this.f30153b.T(X1.L.f18631f);
        }
    }

    public H(X1.E e10, long j10, long j11, int i10, int i11) {
        super(new AbstractC4799e.b(), new a(i10, e10, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
