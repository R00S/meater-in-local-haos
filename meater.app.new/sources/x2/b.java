package x2;

import S2.r;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.n;
import X1.y;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import m8.j0;
import v2.G;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;

/* compiled from: AviExtractor.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final y f52549a;

    /* renamed from: b, reason: collision with root package name */
    private final c f52550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f52551c;

    /* renamed from: d, reason: collision with root package name */
    private final r.a f52552d;

    /* renamed from: e, reason: collision with root package name */
    private int f52553e;

    /* renamed from: f, reason: collision with root package name */
    private v2.r f52554f;

    /* renamed from: g, reason: collision with root package name */
    private x2.c f52555g;

    /* renamed from: h, reason: collision with root package name */
    private long f52556h;

    /* renamed from: i, reason: collision with root package name */
    private e[] f52557i;

    /* renamed from: j, reason: collision with root package name */
    private long f52558j;

    /* renamed from: k, reason: collision with root package name */
    private e f52559k;

    /* renamed from: l, reason: collision with root package name */
    private int f52560l;

    /* renamed from: m, reason: collision with root package name */
    private long f52561m;

    /* renamed from: n, reason: collision with root package name */
    private long f52562n;

    /* renamed from: o, reason: collision with root package name */
    private int f52563o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f52564p;

    /* compiled from: AviExtractor.java */
    /* renamed from: x2.b$b, reason: collision with other inner class name */
    private class C0767b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f52565a;

        public C0767b(long j10) {
            this.f52565a = j10;
        }

        @Override // v2.J
        public boolean g() {
            return true;
        }

        @Override // v2.J
        public J.a k(long j10) {
            J.a aVarI = b.this.f52557i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f52557i.length; i10++) {
                J.a aVarI2 = b.this.f52557i[i10].i(j10);
                if (aVarI2.f51049a.f51055b < aVarI.f51049a.f51055b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // v2.J
        public long m() {
            return this.f52565a;
        }
    }

    /* compiled from: AviExtractor.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f52567a;

        /* renamed from: b, reason: collision with root package name */
        public int f52568b;

        /* renamed from: c, reason: collision with root package name */
        public int f52569c;

        private c() {
        }

        public void a(y yVar) {
            this.f52567a = yVar.u();
            this.f52568b = yVar.u();
            this.f52569c = 0;
        }

        public void b(y yVar) throws ParserException {
            a(yVar);
            if (this.f52567a == 1414744396) {
                this.f52569c = yVar.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f52567a, null);
        }
    }

    public b(int i10, r.a aVar) {
        this.f52552d = aVar;
        this.f52551c = (i10 & 1) == 0;
        this.f52549a = new y(12);
        this.f52550b = new c();
        this.f52554f = new G();
        this.f52557i = new e[0];
        this.f52561m = -1L;
        this.f52562n = -1L;
        this.f52560l = -1;
        this.f52556h = -9223372036854775807L;
    }

    private static void f(InterfaceC4811q interfaceC4811q) {
        if ((interfaceC4811q.getPosition() & 1) == 1) {
            interfaceC4811q.n(1);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f52557i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void k(y yVar) throws ParserException {
        f fVarD = f.d(1819436136, yVar);
        if (fVarD.a() != 1819436136) {
            throw ParserException.a("Unexpected header list type " + fVarD.a(), null);
        }
        x2.c cVar = (x2.c) fVarD.c(x2.c.class);
        if (cVar == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.f52555g = cVar;
        this.f52556h = cVar.f52572c * cVar.f52570a;
        ArrayList arrayList = new ArrayList();
        j0<InterfaceC5052a> it = fVarD.f52593a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC5052a next = it.next();
            if (next.a() == 1819440243) {
                int i11 = i10 + 1;
                e eVarN = n((f) next, i10);
                if (eVarN != null) {
                    arrayList.add(eVarN);
                }
                i10 = i11;
            }
        }
        this.f52557i = (e[]) arrayList.toArray(new e[0]);
        this.f52554f.n();
    }

    private void l(y yVar) {
        int i10;
        long jM = m(yVar);
        while (true) {
            if (yVar.a() < 16) {
                break;
            }
            int iU = yVar.u();
            int iU2 = yVar.u();
            long jU = yVar.u() + jM;
            yVar.u();
            e eVarG = g(iU);
            if (eVarG != null) {
                eVarG.b(jU, (iU2 & 16) == 16);
            }
        }
        for (e eVar : this.f52557i) {
            eVar.c();
        }
        this.f52564p = true;
        this.f52554f.f(new C0767b(this.f52556h));
    }

    private long m(y yVar) {
        if (yVar.a() < 16) {
            return 0L;
        }
        int iF = yVar.f();
        yVar.X(8);
        long jU = yVar.u();
        long j10 = this.f52561m;
        long j11 = jU <= j10 ? j10 + 8 : 0L;
        yVar.W(iF);
        return j11;
    }

    private e n(f fVar, int i10) {
        d dVar = (d) fVar.c(d.class);
        g gVar = (g) fVar.c(g.class);
        if (dVar == null) {
            n.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            n.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jB = dVar.b();
        s sVar = gVar.f52595a;
        s.b bVarB = sVar.b();
        bVarB.d0(i10);
        int i11 = dVar.f52579f;
        if (i11 != 0) {
            bVarB.j0(i11);
        }
        h hVar = (h) fVar.c(h.class);
        if (hVar != null) {
            bVarB.g0(hVar.f52596a);
        }
        int iK = z.k(sVar.f17162o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        O oA = this.f52554f.a(i10, iK);
        oA.f(bVarB.M());
        e eVar = new e(i10, iK, jB, dVar.f52578e, oA);
        this.f52556h = Math.max(this.f52556h, jB);
        return eVar;
    }

    private int o(InterfaceC4811q interfaceC4811q) {
        if (interfaceC4811q.getPosition() >= this.f52562n) {
            return -1;
        }
        e eVar = this.f52559k;
        if (eVar == null) {
            f(interfaceC4811q);
            interfaceC4811q.p(this.f52549a.e(), 0, 12);
            this.f52549a.W(0);
            int iU = this.f52549a.u();
            if (iU == 1414744396) {
                this.f52549a.W(8);
                interfaceC4811q.n(this.f52549a.u() != 1769369453 ? 8 : 12);
                interfaceC4811q.m();
                return 0;
            }
            int iU2 = this.f52549a.u();
            if (iU == 1263424842) {
                this.f52558j = interfaceC4811q.getPosition() + iU2 + 8;
                return 0;
            }
            interfaceC4811q.n(8);
            interfaceC4811q.m();
            e eVarG = g(iU);
            if (eVarG == null) {
                this.f52558j = interfaceC4811q.getPosition() + iU2;
                return 0;
            }
            eVarG.m(iU2);
            this.f52559k = eVarG;
        } else if (eVar.l(interfaceC4811q)) {
            this.f52559k = null;
        }
        return 0;
    }

    private boolean p(InterfaceC4811q interfaceC4811q, I i10) {
        boolean z10;
        if (this.f52558j != -1) {
            long position = interfaceC4811q.getPosition();
            long j10 = this.f52558j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f51048a = j10;
                z10 = true;
            } else {
                interfaceC4811q.n((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f52558j = -1L;
        return z10;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f52558j = -1L;
        this.f52559k = null;
        for (e eVar : this.f52557i) {
            eVar.n(j10);
        }
        if (j10 != 0) {
            this.f52553e = 6;
        } else if (this.f52557i.length == 0) {
            this.f52553e = 0;
        } else {
            this.f52553e = 3;
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.p(this.f52549a.e(), 0, 12);
        this.f52549a.W(0);
        if (this.f52549a.u() != 1179011410) {
            return false;
        }
        this.f52549a.X(4);
        return this.f52549a.u() == 541677121;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f52553e = 0;
        if (this.f52551c) {
            rVar = new S2.s(rVar, this.f52552d);
        }
        this.f52554f = rVar;
        this.f52558j = -1L;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        if (p(interfaceC4811q, i10)) {
            return 1;
        }
        switch (this.f52553e) {
            case 0:
                if (!d(interfaceC4811q)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                interfaceC4811q.n(12);
                this.f52553e = 1;
                return 0;
            case 1:
                interfaceC4811q.readFully(this.f52549a.e(), 0, 12);
                this.f52549a.W(0);
                this.f52550b.b(this.f52549a);
                c cVar = this.f52550b;
                if (cVar.f52569c == 1819436136) {
                    this.f52560l = cVar.f52568b;
                    this.f52553e = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f52550b.f52569c, null);
            case 2:
                int i11 = this.f52560l - 4;
                y yVar = new y(i11);
                interfaceC4811q.readFully(yVar.e(), 0, i11);
                k(yVar);
                this.f52553e = 3;
                return 0;
            case 3:
                if (this.f52561m != -1) {
                    long position = interfaceC4811q.getPosition();
                    long j10 = this.f52561m;
                    if (position != j10) {
                        this.f52558j = j10;
                        return 0;
                    }
                }
                interfaceC4811q.p(this.f52549a.e(), 0, 12);
                interfaceC4811q.m();
                this.f52549a.W(0);
                this.f52550b.a(this.f52549a);
                int iU = this.f52549a.u();
                int i12 = this.f52550b.f52567a;
                if (i12 == 1179011410) {
                    interfaceC4811q.n(12);
                    return 0;
                }
                if (i12 != 1414744396 || iU != 1769369453) {
                    this.f52558j = interfaceC4811q.getPosition() + this.f52550b.f52568b + 8;
                    return 0;
                }
                long position2 = interfaceC4811q.getPosition();
                this.f52561m = position2;
                this.f52562n = position2 + this.f52550b.f52568b + 8;
                if (!this.f52564p) {
                    if (((x2.c) C1804a.e(this.f52555g)).b()) {
                        this.f52553e = 4;
                        this.f52558j = this.f52562n;
                        return 0;
                    }
                    this.f52554f.f(new J.b(this.f52556h));
                    this.f52564p = true;
                }
                this.f52558j = interfaceC4811q.getPosition() + 12;
                this.f52553e = 6;
                return 0;
            case 4:
                interfaceC4811q.readFully(this.f52549a.e(), 0, 8);
                this.f52549a.W(0);
                int iU2 = this.f52549a.u();
                int iU3 = this.f52549a.u();
                if (iU2 == 829973609) {
                    this.f52553e = 5;
                    this.f52563o = iU3;
                } else {
                    this.f52558j = interfaceC4811q.getPosition() + iU3;
                }
                return 0;
            case 5:
                y yVar2 = new y(this.f52563o);
                interfaceC4811q.readFully(yVar2.e(), 0, this.f52563o);
                l(yVar2);
                this.f52553e = 6;
                this.f52558j = this.f52561m;
                return 0;
            case 6:
                return o(interfaceC4811q);
            default:
                throw new AssertionError();
        }
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
