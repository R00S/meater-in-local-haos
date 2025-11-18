package b3;

import v2.InterfaceC4811q;

/* compiled from: PsDurationReader.java */
/* renamed from: b3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2211A {

    /* renamed from: c, reason: collision with root package name */
    private boolean f30116c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30117d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30118e;

    /* renamed from: a, reason: collision with root package name */
    private final X1.E f30114a = new X1.E(0);

    /* renamed from: f, reason: collision with root package name */
    private long f30119f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f30120g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f30121h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30115b = new X1.y();

    C2211A() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(InterfaceC4811q interfaceC4811q) {
        this.f30115b.T(X1.L.f18631f);
        this.f30116c = true;
        interfaceC4811q.m();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(InterfaceC4811q interfaceC4811q, v2.I i10) {
        int iMin = (int) Math.min(20000L, interfaceC4811q.a());
        long j10 = 0;
        if (interfaceC4811q.getPosition() != j10) {
            i10.f51048a = j10;
            return 1;
        }
        this.f30115b.S(iMin);
        interfaceC4811q.m();
        interfaceC4811q.p(this.f30115b.e(), 0, iMin);
        this.f30119f = i(this.f30115b);
        this.f30117d = true;
        return 0;
    }

    private long i(X1.y yVar) {
        int iG = yVar.g();
        for (int iF = yVar.f(); iF < iG - 3; iF++) {
            if (f(yVar.e(), iF) == 442) {
                yVar.W(iF + 4);
                long jL = l(yVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(InterfaceC4811q interfaceC4811q, v2.I i10) {
        long jA = interfaceC4811q.a();
        int iMin = (int) Math.min(20000L, jA);
        long j10 = jA - iMin;
        if (interfaceC4811q.getPosition() != j10) {
            i10.f51048a = j10;
            return 1;
        }
        this.f30115b.S(iMin);
        interfaceC4811q.m();
        interfaceC4811q.p(this.f30115b.e(), 0, iMin);
        this.f30120g = k(this.f30115b);
        this.f30118e = true;
        return 0;
    }

    private long k(X1.y yVar) {
        int iF = yVar.f();
        for (int iG = yVar.g() - 4; iG >= iF; iG--) {
            if (f(yVar.e(), iG) == 442) {
                yVar.W(iG + 4);
                long jL = l(yVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(X1.y yVar) {
        int iF = yVar.f();
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.l(bArr, 0, 9);
        yVar.W(iF);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f30121h;
    }

    public X1.E d() {
        return this.f30114a;
    }

    public boolean e() {
        return this.f30116c;
    }

    public int g(InterfaceC4811q interfaceC4811q, v2.I i10) {
        if (!this.f30118e) {
            return j(interfaceC4811q, i10);
        }
        if (this.f30120g == -9223372036854775807L) {
            return b(interfaceC4811q);
        }
        if (!this.f30117d) {
            return h(interfaceC4811q, i10);
        }
        long j10 = this.f30119f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC4811q);
        }
        this.f30121h = this.f30114a.c(this.f30120g) - this.f30114a.b(j10);
        return b(interfaceC4811q);
    }
}
