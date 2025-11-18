package v2;

import X1.C1804a;
import v2.J;

/* compiled from: BinarySearchSeeker.java */
/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4799e {

    /* renamed from: a, reason: collision with root package name */
    protected final a f51139a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f51140b;

    /* renamed from: c, reason: collision with root package name */
    protected c f51141c;

    /* renamed from: d, reason: collision with root package name */
    private final int f51142d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$a */
    public static class a implements J {

        /* renamed from: a, reason: collision with root package name */
        private final d f51143a;

        /* renamed from: b, reason: collision with root package name */
        private final long f51144b;

        /* renamed from: c, reason: collision with root package name */
        private final long f51145c;

        /* renamed from: d, reason: collision with root package name */
        private final long f51146d;

        /* renamed from: e, reason: collision with root package name */
        private final long f51147e;

        /* renamed from: f, reason: collision with root package name */
        private final long f51148f;

        /* renamed from: g, reason: collision with root package name */
        private final long f51149g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f51143a = dVar;
            this.f51144b = j10;
            this.f51145c = j11;
            this.f51146d = j12;
            this.f51147e = j13;
            this.f51148f = j14;
            this.f51149g = j15;
        }

        @Override // v2.J
        public boolean g() {
            return true;
        }

        public long i(long j10) {
            return this.f51143a.a(j10);
        }

        @Override // v2.J
        public J.a k(long j10) {
            return new J.a(new K(j10, c.h(this.f51143a.a(j10), this.f51145c, this.f51146d, this.f51147e, this.f51148f, this.f51149g)));
        }

        @Override // v2.J
        public long m() {
            return this.f51144b;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$c */
    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f51150a;

        /* renamed from: b, reason: collision with root package name */
        private final long f51151b;

        /* renamed from: c, reason: collision with root package name */
        private final long f51152c;

        /* renamed from: d, reason: collision with root package name */
        private long f51153d;

        /* renamed from: e, reason: collision with root package name */
        private long f51154e;

        /* renamed from: f, reason: collision with root package name */
        private long f51155f;

        /* renamed from: g, reason: collision with root package name */
        private long f51156g;

        /* renamed from: h, reason: collision with root package name */
        private long f51157h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f51150a = j10;
            this.f51151b = j11;
            this.f51153d = j12;
            this.f51154e = j13;
            this.f51155f = j14;
            this.f51156g = j15;
            this.f51152c = j16;
            this.f51157h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return X1.L.q(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f51156g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f51155f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f51157h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f51150a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f51151b;
        }

        private void n() {
            this.f51157h = h(this.f51151b, this.f51153d, this.f51154e, this.f51155f, this.f51156g, this.f51152c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f51154e = j10;
            this.f51156g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f51153d = j10;
            this.f51155f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$d */
    public interface d {
        long a(long j10);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$e, reason: collision with other inner class name */
    public static final class C0733e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0733e f51158d = new C0733e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f51159a;

        /* renamed from: b, reason: collision with root package name */
        private final long f51160b;

        /* renamed from: c, reason: collision with root package name */
        private final long f51161c;

        private C0733e(int i10, long j10, long j11) {
            this.f51159a = i10;
            this.f51160b = j10;
            this.f51161c = j11;
        }

        public static C0733e d(long j10, long j11) {
            return new C0733e(-1, j10, j11);
        }

        public static C0733e e(long j10) {
            return new C0733e(0, -9223372036854775807L, j10);
        }

        public static C0733e f(long j10, long j11) {
            return new C0733e(-2, j10, j11);
        }
    }

    protected AbstractC4799e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f51140b = fVar;
        this.f51142d = i10;
        this.f51139a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f51139a.i(j10), this.f51139a.f51145c, this.f51139a.f51146d, this.f51139a.f51147e, this.f51139a.f51148f, this.f51139a.f51149g);
    }

    public final J b() {
        return this.f51139a;
    }

    public int c(InterfaceC4811q interfaceC4811q, I i10) {
        while (true) {
            c cVar = (c) C1804a.i(this.f51141c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f51142d) {
                e(false, j10);
                return g(interfaceC4811q, j10, i10);
            }
            if (!i(interfaceC4811q, jK)) {
                return g(interfaceC4811q, jK, i10);
            }
            interfaceC4811q.m();
            C0733e c0733eA = this.f51140b.a(interfaceC4811q, cVar.m());
            int i11 = c0733eA.f51159a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC4811q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c0733eA.f51160b, c0733eA.f51161c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC4811q, c0733eA.f51161c);
                    e(true, c0733eA.f51161c);
                    return g(interfaceC4811q, c0733eA.f51161c, i10);
                }
                cVar.o(c0733eA.f51160b, c0733eA.f51161c);
            }
        }
    }

    public final boolean d() {
        return this.f51141c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f51141c = null;
        this.f51140b.b();
        f(z10, j10);
    }

    protected final int g(InterfaceC4811q interfaceC4811q, long j10, I i10) {
        if (j10 == interfaceC4811q.getPosition()) {
            return 0;
        }
        i10.f51048a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f51141c;
        if (cVar == null || cVar.l() != j10) {
            this.f51141c = a(j10);
        }
    }

    protected final boolean i(InterfaceC4811q interfaceC4811q, long j10) {
        long position = j10 - interfaceC4811q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC4811q.n((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$f */
    public interface f {
        C0733e a(InterfaceC4811q interfaceC4811q, long j10);

        default void b() {
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: v2.e$b */
    public static final class b implements d {
        @Override // v2.AbstractC4799e.d
        public long a(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
