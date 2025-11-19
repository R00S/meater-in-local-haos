package b3;

import U1.s;
import X1.C1804a;
import androidx.media3.common.ParserException;
import b3.L;
import java.util.Collections;
import v2.C4795a;
import v2.O;

/* compiled from: LatmReader.java */
/* loaded from: classes.dex */
public final class s implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final String f30435a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30436b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30437c;

    /* renamed from: d, reason: collision with root package name */
    private final X1.x f30438d;

    /* renamed from: e, reason: collision with root package name */
    private O f30439e;

    /* renamed from: f, reason: collision with root package name */
    private String f30440f;

    /* renamed from: g, reason: collision with root package name */
    private U1.s f30441g;

    /* renamed from: h, reason: collision with root package name */
    private int f30442h;

    /* renamed from: i, reason: collision with root package name */
    private int f30443i;

    /* renamed from: j, reason: collision with root package name */
    private int f30444j;

    /* renamed from: k, reason: collision with root package name */
    private int f30445k;

    /* renamed from: l, reason: collision with root package name */
    private long f30446l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30447m;

    /* renamed from: n, reason: collision with root package name */
    private int f30448n;

    /* renamed from: o, reason: collision with root package name */
    private int f30449o;

    /* renamed from: p, reason: collision with root package name */
    private int f30450p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30451q;

    /* renamed from: r, reason: collision with root package name */
    private long f30452r;

    /* renamed from: s, reason: collision with root package name */
    private int f30453s;

    /* renamed from: t, reason: collision with root package name */
    private long f30454t;

    /* renamed from: u, reason: collision with root package name */
    private int f30455u;

    /* renamed from: v, reason: collision with root package name */
    private String f30456v;

    public s(String str, int i10) {
        this.f30435a = str;
        this.f30436b = i10;
        X1.y yVar = new X1.y(1024);
        this.f30437c = yVar;
        this.f30438d = new X1.x(yVar.e());
        this.f30446l = -9223372036854775807L;
    }

    private static long f(X1.x xVar) {
        return xVar.h((xVar.h(2) + 1) * 8);
    }

    private void g(X1.x xVar) throws ParserException {
        if (!xVar.g()) {
            this.f30447m = true;
            l(xVar);
        } else if (!this.f30447m) {
            return;
        }
        if (this.f30448n != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f30449o != 0) {
            throw ParserException.a(null, null);
        }
        k(xVar, j(xVar));
        if (this.f30451q) {
            xVar.r((int) this.f30452r);
        }
    }

    private int h(X1.x xVar) throws ParserException {
        int iB = xVar.b();
        C4795a.b bVarD = C4795a.d(xVar, true);
        this.f30456v = bVarD.f51101c;
        this.f30453s = bVarD.f51099a;
        this.f30455u = bVarD.f51100b;
        return iB - xVar.b();
    }

    private void i(X1.x xVar) {
        int iH = xVar.h(3);
        this.f30450p = iH;
        if (iH == 0) {
            xVar.r(8);
            return;
        }
        if (iH == 1) {
            xVar.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            xVar.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            xVar.r(1);
        }
    }

    private int j(X1.x xVar) throws ParserException {
        int iH;
        if (this.f30450p != 0) {
            throw ParserException.a(null, null);
        }
        int i10 = 0;
        do {
            iH = xVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void k(X1.x xVar, int i10) {
        int iE = xVar.e();
        if ((iE & 7) == 0) {
            this.f30437c.W(iE >> 3);
        } else {
            xVar.i(this.f30437c.e(), 0, i10 * 8);
            this.f30437c.W(0);
        }
        this.f30439e.d(this.f30437c, i10);
        C1804a.g(this.f30446l != -9223372036854775807L);
        this.f30439e.e(this.f30446l, 1, i10, 0, null);
        this.f30446l += this.f30454t;
    }

    private void l(X1.x xVar) throws ParserException {
        boolean zG;
        int iH = xVar.h(1);
        int iH2 = iH == 1 ? xVar.h(1) : 0;
        this.f30448n = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            f(xVar);
        }
        if (!xVar.g()) {
            throw ParserException.a(null, null);
        }
        this.f30449o = xVar.h(6);
        int iH3 = xVar.h(4);
        int iH4 = xVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = xVar.e();
            int iH5 = h(xVar);
            xVar.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            xVar.i(bArr, 0, iH5);
            U1.s sVarM = new s.b().e0(this.f30440f).s0("audio/mp4a-latm").R(this.f30456v).Q(this.f30455u).t0(this.f30453s).f0(Collections.singletonList(bArr)).i0(this.f30435a).q0(this.f30436b).M();
            if (!sVarM.equals(this.f30441g)) {
                this.f30441g = sVarM;
                this.f30454t = 1024000000 / sVarM.f17138E;
                this.f30439e.f(sVarM);
            }
        } else {
            xVar.r(((int) f(xVar)) - h(xVar));
        }
        i(xVar);
        boolean zG2 = xVar.g();
        this.f30451q = zG2;
        this.f30452r = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f30452r = f(xVar);
            } else {
                do {
                    zG = xVar.g();
                    this.f30452r = (this.f30452r << 8) + xVar.h(8);
                } while (zG);
            }
        }
        if (xVar.g()) {
            xVar.r(8);
        }
    }

    private void m(int i10) {
        this.f30437c.S(i10);
        this.f30438d.n(this.f30437c.e());
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30442h = 0;
        this.f30446l = -9223372036854775807L;
        this.f30447m = false;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) throws ParserException {
        C1804a.i(this.f30439e);
        while (yVar.a() > 0) {
            int i10 = this.f30442h;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = yVar.H();
                    if ((iH & 224) == 224) {
                        this.f30445k = iH;
                        this.f30442h = 2;
                    } else if (iH != 86) {
                        this.f30442h = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f30445k & (-225)) << 8) | yVar.H();
                    this.f30444j = iH2;
                    if (iH2 > this.f30437c.e().length) {
                        m(this.f30444j);
                    }
                    this.f30443i = 0;
                    this.f30442h = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(yVar.a(), this.f30444j - this.f30443i);
                    yVar.l(this.f30438d.f18699a, this.f30443i, iMin);
                    int i11 = this.f30443i + iMin;
                    this.f30443i = i11;
                    if (i11 == this.f30444j) {
                        this.f30438d.p(0);
                        g(this.f30438d);
                        this.f30442h = 0;
                    }
                }
            } else if (yVar.H() == 86) {
                this.f30442h = 1;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30439e = rVar.a(dVar.c(), 1);
        this.f30440f = dVar.b();
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30446l = j10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
