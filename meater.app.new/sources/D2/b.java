package D2;

import P2.m;
import S2.r;
import U1.s;
import X1.C1804a;
import X1.y;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.r;

/* compiled from: JpegMotionPhotoExtractor.java */
/* loaded from: classes.dex */
final class b implements InterfaceC4810p {

    /* renamed from: b, reason: collision with root package name */
    private r f3348b;

    /* renamed from: c, reason: collision with root package name */
    private int f3349c;

    /* renamed from: d, reason: collision with root package name */
    private int f3350d;

    /* renamed from: e, reason: collision with root package name */
    private int f3351e;

    /* renamed from: g, reason: collision with root package name */
    private K2.a f3353g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC4811q f3354h;

    /* renamed from: i, reason: collision with root package name */
    private d f3355i;

    /* renamed from: j, reason: collision with root package name */
    private m f3356j;

    /* renamed from: a, reason: collision with root package name */
    private final y f3347a = new y(6);

    /* renamed from: f, reason: collision with root package name */
    private long f3352f = -1;

    private void a(InterfaceC4811q interfaceC4811q) {
        this.f3347a.S(2);
        interfaceC4811q.p(this.f3347a.e(), 0, 2);
        interfaceC4811q.j(this.f3347a.P() - 2);
    }

    private void f() {
        ((r) C1804a.e(this.f3348b)).n();
        this.f3348b.f(new J.b(-9223372036854775807L));
        this.f3349c = 6;
    }

    private static K2.a g(String str, long j10) {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void k(K2.a aVar) {
        ((r) C1804a.e(this.f3348b)).a(1024, 4).f(new s.b().T("image/jpeg").l0(new U1.y(aVar)).M());
    }

    private int l(InterfaceC4811q interfaceC4811q) {
        this.f3347a.S(2);
        interfaceC4811q.p(this.f3347a.e(), 0, 2);
        return this.f3347a.P();
    }

    private void m(InterfaceC4811q interfaceC4811q) {
        this.f3347a.S(2);
        interfaceC4811q.readFully(this.f3347a.e(), 0, 2);
        int iP = this.f3347a.P();
        this.f3350d = iP;
        if (iP == 65498) {
            if (this.f3352f != -1) {
                this.f3349c = 4;
                return;
            } else {
                f();
                return;
            }
        }
        if ((iP < 65488 || iP > 65497) && iP != 65281) {
            this.f3349c = 1;
        }
    }

    private void n(InterfaceC4811q interfaceC4811q) {
        String strB;
        if (this.f3350d == 65505) {
            y yVar = new y(this.f3351e);
            interfaceC4811q.readFully(yVar.e(), 0, this.f3351e);
            if (this.f3353g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.B()) && (strB = yVar.B()) != null) {
                K2.a aVarG = g(strB, interfaceC4811q.a());
                this.f3353g = aVarG;
                if (aVarG != null) {
                    this.f3352f = aVarG.f8668E;
                }
            }
        } else {
            interfaceC4811q.n(this.f3351e);
        }
        this.f3349c = 0;
    }

    private void o(InterfaceC4811q interfaceC4811q) {
        this.f3347a.S(2);
        interfaceC4811q.readFully(this.f3347a.e(), 0, 2);
        this.f3351e = this.f3347a.P() - 2;
        this.f3349c = 2;
    }

    private void p(InterfaceC4811q interfaceC4811q) {
        if (!interfaceC4811q.h(this.f3347a.e(), 0, 1, true)) {
            f();
            return;
        }
        interfaceC4811q.m();
        if (this.f3356j == null) {
            this.f3356j = new m(r.a.f15292a, 8);
        }
        d dVar = new d(interfaceC4811q, this.f3352f);
        this.f3355i = dVar;
        if (!this.f3356j.d(dVar)) {
            f();
        } else {
            this.f3356j.h(new e(this.f3352f, (v2.r) C1804a.e(this.f3348b)));
            q();
        }
    }

    private void q() {
        k((K2.a) C1804a.e(this.f3353g));
        this.f3349c = 5;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f3349c = 0;
            this.f3356j = null;
        } else if (this.f3349c == 5) {
            ((m) C1804a.e(this.f3356j)).b(j10, j11);
        }
    }

    @Override // v2.InterfaceC4810p
    public void c() {
        m mVar = this.f3356j;
        if (mVar != null) {
            mVar.c();
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        if (l(interfaceC4811q) != 65496) {
            return false;
        }
        int iL = l(interfaceC4811q);
        this.f3350d = iL;
        if (iL == 65504) {
            a(interfaceC4811q);
            this.f3350d = l(interfaceC4811q);
        }
        if (this.f3350d != 65505) {
            return false;
        }
        interfaceC4811q.j(2);
        this.f3347a.S(6);
        interfaceC4811q.p(this.f3347a.e(), 0, 6);
        return this.f3347a.J() == 1165519206 && this.f3347a.P() == 0;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f3348b = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        int i11 = this.f3349c;
        if (i11 == 0) {
            m(interfaceC4811q);
            return 0;
        }
        if (i11 == 1) {
            o(interfaceC4811q);
            return 0;
        }
        if (i11 == 2) {
            n(interfaceC4811q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC4811q.getPosition();
            long j10 = this.f3352f;
            if (position != j10) {
                i10.f51048a = j10;
                return 1;
            }
            p(interfaceC4811q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f3355i == null || interfaceC4811q != this.f3354h) {
            this.f3354h = interfaceC4811q;
            this.f3355i = new d(interfaceC4811q, this.f3352f);
        }
        int i12 = ((m) C1804a.e(this.f3356j)).i(this.f3355i, i10);
        if (i12 == 1) {
            i10.f51048a += this.f3352f;
        }
        return i12;
    }
}
