package A2;

import java.util.Objects;
import v2.AbstractC4799e;
import v2.InterfaceC4811q;
import v2.v;
import v2.y;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class b extends AbstractC4799e {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: A2.b$b, reason: collision with other inner class name */
    private static final class C0014b implements AbstractC4799e.f {

        /* renamed from: a, reason: collision with root package name */
        private final y f709a;

        /* renamed from: b, reason: collision with root package name */
        private final int f710b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a f711c;

        private long c(InterfaceC4811q interfaceC4811q) {
            while (interfaceC4811q.i() < interfaceC4811q.a() - 6 && !v.h(interfaceC4811q, this.f709a, this.f710b, this.f711c)) {
                interfaceC4811q.j(1);
            }
            if (interfaceC4811q.i() < interfaceC4811q.a() - 6) {
                return this.f711c.f51225a;
            }
            interfaceC4811q.j((int) (interfaceC4811q.a() - interfaceC4811q.i()));
            return this.f709a.f51238j;
        }

        @Override // v2.AbstractC4799e.f
        public AbstractC4799e.C0733e a(InterfaceC4811q interfaceC4811q, long j10) {
            long position = interfaceC4811q.getPosition();
            long jC = c(interfaceC4811q);
            long jI = interfaceC4811q.i();
            interfaceC4811q.j(Math.max(6, this.f709a.f51231c));
            long jC2 = c(interfaceC4811q);
            return (jC > j10 || jC2 <= j10) ? jC2 <= j10 ? AbstractC4799e.C0733e.f(jC2, interfaceC4811q.i()) : AbstractC4799e.C0733e.d(jC, position) : AbstractC4799e.C0733e.e(jI);
        }

        private C0014b(y yVar, int i10) {
            this.f709a = yVar;
            this.f710b = i10;
            this.f711c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC4799e.d() { // from class: A2.a
            @Override // v2.AbstractC4799e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0014b(yVar, i10), yVar.f(), 0L, yVar.f51238j, j10, j11, yVar.d(), Math.max(6, yVar.f51231c));
        Objects.requireNonNull(yVar);
    }
}
