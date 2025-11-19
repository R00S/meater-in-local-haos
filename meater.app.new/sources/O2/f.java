package O2;

import J2.h;
import J2.l;
import J2.n;
import O2.g;
import U1.s;
import U1.y;
import X1.C1804a;
import X1.L;
import X1.y;
import java.io.EOFException;
import java.math.RoundingMode;
import o8.C4145e;
import v2.B;
import v2.C4807m;
import v2.D;
import v2.F;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.O;
import v2.r;
import v2.u;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes.dex */
public final class f implements InterfaceC4810p {

    /* renamed from: v, reason: collision with root package name */
    public static final u f13124v = new u() { // from class: O2.d
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return f.s();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private static final h.a f13125w = new h.a() { // from class: O2.e
        @Override // J2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.t(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f13126a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13127b;

    /* renamed from: c, reason: collision with root package name */
    private final y f13128c;

    /* renamed from: d, reason: collision with root package name */
    private final F.a f13129d;

    /* renamed from: e, reason: collision with root package name */
    private final B f13130e;

    /* renamed from: f, reason: collision with root package name */
    private final D f13131f;

    /* renamed from: g, reason: collision with root package name */
    private final O f13132g;

    /* renamed from: h, reason: collision with root package name */
    private r f13133h;

    /* renamed from: i, reason: collision with root package name */
    private O f13134i;

    /* renamed from: j, reason: collision with root package name */
    private O f13135j;

    /* renamed from: k, reason: collision with root package name */
    private int f13136k;

    /* renamed from: l, reason: collision with root package name */
    private U1.y f13137l;

    /* renamed from: m, reason: collision with root package name */
    private long f13138m;

    /* renamed from: n, reason: collision with root package name */
    private long f13139n;

    /* renamed from: o, reason: collision with root package name */
    private long f13140o;

    /* renamed from: p, reason: collision with root package name */
    private long f13141p;

    /* renamed from: q, reason: collision with root package name */
    private int f13142q;

    /* renamed from: r, reason: collision with root package name */
    private g f13143r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13144s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13145t;

    /* renamed from: u, reason: collision with root package name */
    private long f13146u;

    public f() {
        this(0);
    }

    private boolean A(InterfaceC4811q interfaceC4811q, boolean z10) throws EOFException {
        int i10;
        int i11;
        int iJ;
        int i12 = z10 ? 32768 : 131072;
        interfaceC4811q.m();
        if (interfaceC4811q.getPosition() == 0) {
            U1.y yVarA = this.f13131f.a(interfaceC4811q, (this.f13126a & 8) == 0 ? null : f13125w);
            this.f13137l = yVarA;
            if (yVarA != null) {
                this.f13130e.c(yVarA);
            }
            i10 = (int) interfaceC4811q.i();
            if (!z10) {
                interfaceC4811q.n(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!x(interfaceC4811q)) {
                this.f13128c.W(0);
                int iQ = this.f13128c.q();
                if ((i11 == 0 || r(iQ, i11)) && (iJ = F.j(iQ)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f13129d.a(iQ);
                        i11 = iQ;
                    }
                    interfaceC4811q.j(iJ - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        w();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC4811q.m();
                        interfaceC4811q.j(i10 + i15);
                    } else {
                        interfaceC4811q.n(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i11 = 0;
                }
            } else if (i13 <= 0) {
                w();
                throw new EOFException();
            }
        }
        if (z10) {
            interfaceC4811q.n(i10 + i14);
        } else {
            interfaceC4811q.m();
        }
        this.f13136k = i11;
        return true;
    }

    private void g() {
        C1804a.i(this.f13134i);
        L.i(this.f13133h);
    }

    private g k(InterfaceC4811q interfaceC4811q) {
        long jP;
        long jF;
        g gVarV = v(interfaceC4811q);
        c cVarU = u(this.f13137l, interfaceC4811q.getPosition());
        if (this.f13144s) {
            return new g.a();
        }
        if ((this.f13126a & 4) != 0) {
            if (cVarU != null) {
                jP = cVarU.m();
                jF = cVarU.f();
            } else if (gVarV != null) {
                jP = gVarV.m();
                jF = gVarV.f();
            } else {
                jP = p(this.f13137l);
                jF = -1;
            }
            gVarV = new b(jP, interfaceC4811q.getPosition(), jF);
        } else if (cVarU != null) {
            gVarV = cVarU;
        } else if (gVarV == null) {
            gVarV = null;
        }
        if (gVarV == null || !(gVarV.g() || (this.f13126a & 1) == 0)) {
            return o(interfaceC4811q, (this.f13126a & 2) != 0);
        }
        return gVarV;
    }

    private long l(long j10) {
        return this.f13138m + ((j10 * 1000000) / this.f13129d.f51044d);
    }

    private g n(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f13154c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - iVar.f13152a.f51043c;
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - iVar.f13152a.f51043c;
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + iVar.f13152a.f51043c, p8.f.d(L.f1(j16, 8000000L, jA, roundingMode)), p8.f.d(C4145e.b(j16, iVar.f13153b, roundingMode)), false);
    }

    private g o(InterfaceC4811q interfaceC4811q, boolean z10) {
        interfaceC4811q.p(this.f13128c.e(), 0, 4);
        this.f13128c.W(0);
        this.f13129d.a(this.f13128c.q());
        return new a(interfaceC4811q.a(), interfaceC4811q.getPosition(), this.f13129d, z10);
    }

    private static long p(U1.y yVar) {
        if (yVar == null) {
            return -9223372036854775807L;
        }
        int iE = yVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            y.b bVarD = yVar.d(i10);
            if (bVarD instanceof n) {
                n nVar = (n) bVarD;
                if (nVar.f7255B.equals("TLEN")) {
                    return L.Q0(Long.parseLong(nVar.f7269E.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int q(X1.y yVar, int i10) {
        if (yVar.g() >= i10 + 4) {
            yVar.W(i10);
            int iQ = yVar.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (yVar.g() < 40) {
            return 0;
        }
        yVar.W(36);
        return yVar.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean r(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] s() {
        return new InterfaceC4810p[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean t(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c u(U1.y yVar, long j10) {
        if (yVar == null) {
            return null;
        }
        int iE = yVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            y.b bVarD = yVar.d(i10);
            if (bVarD instanceof l) {
                return c.b(j10, (l) bVarD, p(yVar));
            }
        }
        return null;
    }

    private g v(InterfaceC4811q interfaceC4811q) {
        int i10;
        int i11;
        X1.y yVar = new X1.y(this.f13129d.f51043c);
        interfaceC4811q.p(yVar.e(), 0, this.f13129d.f51043c);
        F.a aVar = this.f13129d;
        int i12 = 21;
        if ((aVar.f51041a & 1) != 0) {
            if (aVar.f51045e != 1) {
                i12 = 36;
            }
        } else if (aVar.f51045e == 1) {
            i12 = 13;
        }
        int iQ = q(yVar, i12);
        if (iQ != 1231971951) {
            if (iQ == 1447187017) {
                h hVarB = h.b(interfaceC4811q.a(), interfaceC4811q.getPosition(), this.f13129d, yVar);
                interfaceC4811q.n(this.f13129d.f51043c);
                return hVarB;
            }
            if (iQ != 1483304551) {
                interfaceC4811q.m();
                return null;
            }
        }
        i iVarB = i.b(this.f13129d, yVar);
        if (!this.f13130e.a() && (i10 = iVarB.f13155d) != -1 && (i11 = iVarB.f13156e) != -1) {
            B b10 = this.f13130e;
            b10.f51014a = i10;
            b10.f51015b = i11;
        }
        long position = interfaceC4811q.getPosition();
        if (interfaceC4811q.a() != -1 && iVarB.f13154c != -1 && interfaceC4811q.a() != iVarB.f13154c + position) {
            X1.n.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC4811q.a() + ") and Xing frame (" + (iVarB.f13154c + position) + "), using Xing value.");
        }
        interfaceC4811q.n(this.f13129d.f51043c);
        return iQ == 1483304551 ? j.b(iVarB, position) : n(position, iVarB, interfaceC4811q.a());
    }

    private void w() {
        g gVar = this.f13143r;
        if ((gVar instanceof a) && gVar.g()) {
            long j10 = this.f13141p;
            if (j10 == -1 || j10 == this.f13143r.f()) {
                return;
            }
            this.f13143r = ((a) this.f13143r).e(this.f13141p);
            ((r) C1804a.e(this.f13133h)).f(this.f13143r);
        }
    }

    private boolean x(InterfaceC4811q interfaceC4811q) {
        g gVar = this.f13143r;
        if (gVar != null) {
            long jF = gVar.f();
            if (jF != -1 && interfaceC4811q.i() > jF - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4811q.h(this.f13128c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int y(InterfaceC4811q interfaceC4811q) {
        if (this.f13136k == 0) {
            try {
                A(interfaceC4811q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f13143r == null) {
            g gVarK = k(interfaceC4811q);
            this.f13143r = gVarK;
            this.f13133h.f(gVarK);
            s.b bVarL0 = new s.b().s0(this.f13129d.f51042b).j0(4096).Q(this.f13129d.f51045e).t0(this.f13129d.f51044d).Y(this.f13130e.f51014a).Z(this.f13130e.f51015b).l0((this.f13126a & 8) != 0 ? null : this.f13137l);
            if (this.f13143r.l() != -2147483647) {
                bVarL0.P(this.f13143r.l());
            }
            this.f13135j.f(bVarL0.M());
            this.f13140o = interfaceC4811q.getPosition();
        } else if (this.f13140o != 0) {
            long position = interfaceC4811q.getPosition();
            long j10 = this.f13140o;
            if (position < j10) {
                interfaceC4811q.n((int) (j10 - position));
            }
        }
        return z(interfaceC4811q);
    }

    private int z(InterfaceC4811q interfaceC4811q) {
        if (this.f13142q == 0) {
            interfaceC4811q.m();
            if (x(interfaceC4811q)) {
                return -1;
            }
            this.f13128c.W(0);
            int iQ = this.f13128c.q();
            if (!r(iQ, this.f13136k) || F.j(iQ) == -1) {
                interfaceC4811q.n(1);
                this.f13136k = 0;
                return 0;
            }
            this.f13129d.a(iQ);
            if (this.f13138m == -9223372036854775807L) {
                this.f13138m = this.f13143r.a(interfaceC4811q.getPosition());
                if (this.f13127b != -9223372036854775807L) {
                    this.f13138m += this.f13127b - this.f13143r.a(0L);
                }
            }
            this.f13142q = this.f13129d.f51043c;
            long position = interfaceC4811q.getPosition();
            F.a aVar = this.f13129d;
            this.f13141p = position + aVar.f51043c;
            g gVar = this.f13143r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(l(this.f13139n + aVar.f51047g), this.f13141p);
                if (this.f13145t && bVar.b(this.f13146u)) {
                    this.f13145t = false;
                    this.f13135j = this.f13134i;
                }
            }
        }
        int iC = this.f13135j.c(interfaceC4811q, this.f13142q, true);
        if (iC == -1) {
            return -1;
        }
        int i10 = this.f13142q - iC;
        this.f13142q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f13135j.e(l(this.f13139n), 1, this.f13129d.f51043c, 0, null);
        this.f13139n += this.f13129d.f51047g;
        this.f13142q = 0;
        return 0;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f13136k = 0;
        this.f13138m = -9223372036854775807L;
        this.f13139n = 0L;
        this.f13142q = 0;
        this.f13146u = j11;
        g gVar = this.f13143r;
        if (!(gVar instanceof b) || ((b) gVar).b(j11)) {
            return;
        }
        this.f13145t = true;
        this.f13135j = this.f13132g;
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        return A(interfaceC4811q, true);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f13133h = rVar;
        O oA = rVar.a(0, 1);
        this.f13134i = oA;
        this.f13135j = oA;
        this.f13133h.n();
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        g();
        int iY = y(interfaceC4811q);
        if (iY == -1 && (this.f13143r instanceof b)) {
            long jL = l(this.f13139n);
            if (this.f13143r.m() != jL) {
                ((b) this.f13143r).d(jL);
                this.f13133h.f(this.f13143r);
            }
        }
        return iY;
    }

    public void m() {
        this.f13144s = true;
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f13126a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f13127b = j10;
        this.f13128c = new X1.y(10);
        this.f13129d = new F.a();
        this.f13130e = new B();
        this.f13138m = -9223372036854775807L;
        this.f13131f = new D();
        C4807m c4807m = new C4807m();
        this.f13132g = c4807m;
        this.f13135j = c4807m;
        this.f13141p = -1L;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
