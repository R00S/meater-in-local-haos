package Q2;

import U1.s;
import X1.C1804a;
import X1.L;
import X1.y;
import v2.I;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;
import v2.r;

/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private O f14258b;

    /* renamed from: c, reason: collision with root package name */
    private r f14259c;

    /* renamed from: d, reason: collision with root package name */
    private g f14260d;

    /* renamed from: e, reason: collision with root package name */
    private long f14261e;

    /* renamed from: f, reason: collision with root package name */
    private long f14262f;

    /* renamed from: g, reason: collision with root package name */
    private long f14263g;

    /* renamed from: h, reason: collision with root package name */
    private int f14264h;

    /* renamed from: i, reason: collision with root package name */
    private int f14265i;

    /* renamed from: k, reason: collision with root package name */
    private long f14267k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14268l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14269m;

    /* renamed from: a, reason: collision with root package name */
    private final e f14257a = new e();

    /* renamed from: j, reason: collision with root package name */
    private b f14266j = new b();

    /* compiled from: StreamReader.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        s f14270a;

        /* renamed from: b, reason: collision with root package name */
        g f14271b;

        b() {
        }
    }

    private void a() {
        C1804a.i(this.f14258b);
        L.i(this.f14259c);
    }

    private boolean i(InterfaceC4811q interfaceC4811q) {
        while (this.f14257a.d(interfaceC4811q)) {
            this.f14267k = interfaceC4811q.getPosition() - this.f14262f;
            if (!h(this.f14257a.c(), this.f14262f, this.f14266j)) {
                return true;
            }
            this.f14262f = interfaceC4811q.getPosition();
        }
        this.f14264h = 3;
        return false;
    }

    private int j(InterfaceC4811q interfaceC4811q) {
        if (!i(interfaceC4811q)) {
            return -1;
        }
        s sVar = this.f14266j.f14270a;
        this.f14265i = sVar.f17138E;
        if (!this.f14269m) {
            this.f14258b.f(sVar);
            this.f14269m = true;
        }
        g gVar = this.f14266j.f14271b;
        if (gVar != null) {
            this.f14260d = gVar;
        } else if (interfaceC4811q.a() == -1) {
            this.f14260d = new c();
        } else {
            f fVarB = this.f14257a.b();
            this.f14260d = new Q2.a(this, this.f14262f, interfaceC4811q.a(), fVarB.f14250h + fVarB.f14251i, fVarB.f14245c, (fVarB.f14244b & 4) != 0);
        }
        this.f14264h = 2;
        this.f14257a.f();
        return 0;
    }

    private int k(InterfaceC4811q interfaceC4811q, I i10) {
        long jD = this.f14260d.d(interfaceC4811q);
        if (jD >= 0) {
            i10.f51048a = jD;
            return 1;
        }
        if (jD < -1) {
            e(-(jD + 2));
        }
        if (!this.f14268l) {
            this.f14259c.f((J) C1804a.i(this.f14260d.a()));
            this.f14268l = true;
        }
        if (this.f14267k <= 0 && !this.f14257a.d(interfaceC4811q)) {
            this.f14264h = 3;
            return -1;
        }
        this.f14267k = 0L;
        y yVarC = this.f14257a.c();
        long jF = f(yVarC);
        if (jF >= 0) {
            long j10 = this.f14263g;
            if (j10 + jF >= this.f14261e) {
                long jB = b(j10);
                this.f14258b.d(yVarC, yVarC.g());
                this.f14258b.e(jB, 1, yVarC.g(), 0, null);
                this.f14261e = -1L;
            }
        }
        this.f14263g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / this.f14265i;
    }

    protected long c(long j10) {
        return (this.f14265i * j10) / 1000000;
    }

    void d(r rVar, O o10) {
        this.f14259c = rVar;
        this.f14258b = o10;
        l(true);
    }

    protected void e(long j10) {
        this.f14263g = j10;
    }

    protected abstract long f(y yVar);

    final int g(InterfaceC4811q interfaceC4811q, I i10) {
        a();
        int i11 = this.f14264h;
        if (i11 == 0) {
            return j(interfaceC4811q);
        }
        if (i11 == 1) {
            interfaceC4811q.n((int) this.f14262f);
            this.f14264h = 2;
            return 0;
        }
        if (i11 == 2) {
            L.i(this.f14260d);
            return k(interfaceC4811q, i10);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean h(y yVar, long j10, b bVar);

    protected void l(boolean z10) {
        if (z10) {
            this.f14266j = new b();
            this.f14262f = 0L;
            this.f14264h = 0;
        } else {
            this.f14264h = 1;
        }
        this.f14261e = -1L;
        this.f14263g = 0L;
    }

    final void m(long j10, long j11) {
        this.f14257a.e();
        if (j10 == 0) {
            l(!this.f14268l);
        } else if (this.f14264h != 0) {
            this.f14261e = c(j11);
            ((g) L.i(this.f14260d)).b(this.f14261e);
            this.f14264h = 2;
        }
    }

    /* compiled from: StreamReader.java */
    private static final class c implements g {
        private c() {
        }

        @Override // Q2.g
        public J a() {
            return new J.b(-9223372036854775807L);
        }

        @Override // Q2.g
        public long d(InterfaceC4811q interfaceC4811q) {
            return -1L;
        }

        @Override // Q2.g
        public void b(long j10) {
        }
    }
}
