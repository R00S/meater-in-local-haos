package b3;

import v2.InterfaceC4811q;

/* compiled from: TsDurationReader.java */
/* loaded from: classes.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final int f30156a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30159d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30160e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30161f;

    /* renamed from: b, reason: collision with root package name */
    private final X1.E f30157b = new X1.E(0);

    /* renamed from: g, reason: collision with root package name */
    private long f30162g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f30163h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f30164i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30158c = new X1.y();

    I(int i10) {
        this.f30156a = i10;
    }

    private int a(InterfaceC4811q interfaceC4811q) {
        this.f30158c.T(X1.L.f18631f);
        this.f30159d = true;
        interfaceC4811q.m();
        return 0;
    }

    private int f(InterfaceC4811q interfaceC4811q, v2.I i10, int i11) {
        int iMin = (int) Math.min(this.f30156a, interfaceC4811q.a());
        long j10 = 0;
        if (interfaceC4811q.getPosition() != j10) {
            i10.f51048a = j10;
            return 1;
        }
        this.f30158c.S(iMin);
        interfaceC4811q.m();
        interfaceC4811q.p(this.f30158c.e(), 0, iMin);
        this.f30162g = g(this.f30158c, i11);
        this.f30160e = true;
        return 0;
    }

    private long g(X1.y yVar, int i10) {
        int iG = yVar.g();
        for (int iF = yVar.f(); iF < iG; iF++) {
            if (yVar.e()[iF] == 71) {
                long jC = M.c(yVar, iF, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(InterfaceC4811q interfaceC4811q, v2.I i10, int i11) {
        long jA = interfaceC4811q.a();
        int iMin = (int) Math.min(this.f30156a, jA);
        long j10 = jA - iMin;
        if (interfaceC4811q.getPosition() != j10) {
            i10.f51048a = j10;
            return 1;
        }
        this.f30158c.S(iMin);
        interfaceC4811q.m();
        interfaceC4811q.p(this.f30158c.e(), 0, iMin);
        this.f30163h = i(this.f30158c, i11);
        this.f30161f = true;
        return 0;
    }

    private long i(X1.y yVar, int i10) {
        int iF = yVar.f();
        int iG = yVar.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (M.b(yVar.e(), iF, iG, i11)) {
                long jC = M.c(yVar, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f30164i;
    }

    public X1.E c() {
        return this.f30157b;
    }

    public boolean d() {
        return this.f30159d;
    }

    public int e(InterfaceC4811q interfaceC4811q, v2.I i10, int i11) {
        if (i11 <= 0) {
            return a(interfaceC4811q);
        }
        if (!this.f30161f) {
            return h(interfaceC4811q, i10, i11);
        }
        if (this.f30163h == -9223372036854775807L) {
            return a(interfaceC4811q);
        }
        if (!this.f30160e) {
            return f(interfaceC4811q, i10, i11);
        }
        long j10 = this.f30162g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC4811q);
        }
        this.f30164i = this.f30157b.c(this.f30163h) - this.f30157b.b(j10);
        return a(interfaceC4811q);
    }
}
