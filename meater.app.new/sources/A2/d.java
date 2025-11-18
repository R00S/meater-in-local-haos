package A2;

import X1.C1804a;
import X1.L;
import X1.y;
import androidx.media3.common.ParserException;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;
import v2.r;
import v2.u;
import v2.v;
import v2.w;
import v2.x;

/* compiled from: FlacExtractor.java */
/* loaded from: classes.dex */
public final class d implements InterfaceC4810p {

    /* renamed from: o, reason: collision with root package name */
    public static final u f712o = new u() { // from class: A2.c
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return d.m();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f713a;

    /* renamed from: b, reason: collision with root package name */
    private final y f714b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f715c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a f716d;

    /* renamed from: e, reason: collision with root package name */
    private r f717e;

    /* renamed from: f, reason: collision with root package name */
    private O f718f;

    /* renamed from: g, reason: collision with root package name */
    private int f719g;

    /* renamed from: h, reason: collision with root package name */
    private U1.y f720h;

    /* renamed from: i, reason: collision with root package name */
    private v2.y f721i;

    /* renamed from: j, reason: collision with root package name */
    private int f722j;

    /* renamed from: k, reason: collision with root package name */
    private int f723k;

    /* renamed from: l, reason: collision with root package name */
    private b f724l;

    /* renamed from: m, reason: collision with root package name */
    private int f725m;

    /* renamed from: n, reason: collision with root package name */
    private long f726n;

    public d() {
        this(0);
    }

    private long f(y yVar, boolean z10) {
        boolean zD;
        C1804a.e(this.f721i);
        int iF = yVar.f();
        while (iF <= yVar.g() - 16) {
            yVar.W(iF);
            if (v.d(yVar, this.f721i, this.f723k, this.f716d)) {
                yVar.W(iF);
                return this.f716d.f51225a;
            }
            iF++;
        }
        if (!z10) {
            yVar.W(iF);
            return -1L;
        }
        while (iF <= yVar.g() - this.f722j) {
            yVar.W(iF);
            try {
                zD = v.d(yVar, this.f721i, this.f723k, this.f716d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (yVar.f() <= yVar.g() ? zD : false) {
                yVar.W(iF);
                return this.f716d.f51225a;
            }
            iF++;
        }
        yVar.W(yVar.g());
        return -1L;
    }

    private void g(InterfaceC4811q interfaceC4811q) {
        this.f723k = w.b(interfaceC4811q);
        ((r) L.i(this.f717e)).f(k(interfaceC4811q.getPosition(), interfaceC4811q.a()));
        this.f719g = 5;
    }

    private J k(long j10, long j11) {
        C1804a.e(this.f721i);
        v2.y yVar = this.f721i;
        if (yVar.f51239k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f51238j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f723k, j10, j11);
        this.f724l = bVar;
        return bVar.b();
    }

    private void l(InterfaceC4811q interfaceC4811q) {
        byte[] bArr = this.f713a;
        interfaceC4811q.p(bArr, 0, bArr.length);
        interfaceC4811q.m();
        this.f719g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] m() {
        return new InterfaceC4810p[]{new d()};
    }

    private void n() {
        ((O) L.i(this.f718f)).e((this.f726n * 1000000) / ((v2.y) L.i(this.f721i)).f51233e, 1, this.f725m, 0, null);
    }

    private int o(InterfaceC4811q interfaceC4811q, I i10) {
        boolean z10;
        C1804a.e(this.f718f);
        C1804a.e(this.f721i);
        b bVar = this.f724l;
        if (bVar != null && bVar.d()) {
            return this.f724l.c(interfaceC4811q, i10);
        }
        if (this.f726n == -1) {
            this.f726n = v.i(interfaceC4811q, this.f721i);
            return 0;
        }
        int iG = this.f714b.g();
        if (iG < 32768) {
            int iE = interfaceC4811q.e(this.f714b.e(), iG, 32768 - iG);
            z10 = iE == -1;
            if (!z10) {
                this.f714b.V(iG + iE);
            } else if (this.f714b.a() == 0) {
                n();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f714b.f();
        int i11 = this.f725m;
        int i12 = this.f722j;
        if (i11 < i12) {
            y yVar = this.f714b;
            yVar.X(Math.min(i12 - i11, yVar.a()));
        }
        long jF = f(this.f714b, z10);
        int iF2 = this.f714b.f() - iF;
        this.f714b.W(iF);
        this.f718f.d(this.f714b, iF2);
        this.f725m += iF2;
        if (jF != -1) {
            n();
            this.f725m = 0;
            this.f726n = jF;
        }
        if (this.f714b.a() < 16) {
            int iA = this.f714b.a();
            System.arraycopy(this.f714b.e(), this.f714b.f(), this.f714b.e(), 0, iA);
            this.f714b.W(0);
            this.f714b.V(iA);
        }
        return 0;
    }

    private void p(InterfaceC4811q interfaceC4811q) {
        this.f720h = w.d(interfaceC4811q, !this.f715c);
        this.f719g = 1;
    }

    private void q(InterfaceC4811q interfaceC4811q) {
        w.a aVar = new w.a(this.f721i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC4811q, aVar);
            this.f721i = (v2.y) L.i(aVar.f51226a);
        }
        C1804a.e(this.f721i);
        this.f722j = Math.max(this.f721i.f51231c, 6);
        ((O) L.i(this.f718f)).f(this.f721i.g(this.f713a, this.f720h));
        this.f719g = 4;
    }

    private void r(InterfaceC4811q interfaceC4811q) throws ParserException {
        w.i(interfaceC4811q);
        this.f719g = 3;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f719g = 0;
        } else {
            b bVar = this.f724l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f726n = j11 != 0 ? -1L : 0L;
        this.f725m = 0;
        this.f714b.S(0);
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        w.c(interfaceC4811q, false);
        return w.a(interfaceC4811q);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f717e = rVar;
        this.f718f = rVar.a(0, 1);
        rVar.n();
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        int i11 = this.f719g;
        if (i11 == 0) {
            p(interfaceC4811q);
            return 0;
        }
        if (i11 == 1) {
            l(interfaceC4811q);
            return 0;
        }
        if (i11 == 2) {
            r(interfaceC4811q);
            return 0;
        }
        if (i11 == 3) {
            q(interfaceC4811q);
            return 0;
        }
        if (i11 == 4) {
            g(interfaceC4811q);
            return 0;
        }
        if (i11 == 5) {
            return o(interfaceC4811q, i10);
        }
        throw new IllegalStateException();
    }

    public d(int i10) {
        this.f713a = new byte[42];
        this.f714b = new y(new byte[32768], 0);
        this.f715c = (i10 & 1) != 0;
        this.f716d = new v.a();
        this.f719g = 0;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
