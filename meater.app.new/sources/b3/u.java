package b3;

import U1.s;
import X1.C1804a;
import androidx.media3.common.ParserException;
import b3.L;
import b3.v;
import m8.AbstractC4009y;
import v2.O;

/* compiled from: MpeghReader.java */
/* loaded from: classes.dex */
public final class u implements InterfaceC2224m {

    /* renamed from: e, reason: collision with root package name */
    private String f30474e;

    /* renamed from: f, reason: collision with root package name */
    private O f30475f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30478i;

    /* renamed from: k, reason: collision with root package name */
    private int f30480k;

    /* renamed from: l, reason: collision with root package name */
    private int f30481l;

    /* renamed from: n, reason: collision with root package name */
    private int f30483n;

    /* renamed from: o, reason: collision with root package name */
    private int f30484o;

    /* renamed from: s, reason: collision with root package name */
    private int f30488s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f30490u;

    /* renamed from: d, reason: collision with root package name */
    private int f30473d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final X1.y f30470a = new X1.y(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    private final X1.x f30471b = new X1.x();

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30472c = new X1.y();

    /* renamed from: p, reason: collision with root package name */
    private v.b f30485p = new v.b();

    /* renamed from: q, reason: collision with root package name */
    private int f30486q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    private int f30487r = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f30489t = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30479j = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30482m = true;

    /* renamed from: g, reason: collision with root package name */
    private double f30476g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    private double f30477h = -9.223372036854776E18d;

    private void f(X1.y yVar, X1.y yVar2, boolean z10) {
        int iF = yVar.f();
        int iMin = Math.min(yVar.a(), yVar2.a());
        yVar.l(yVar2.e(), yVar2.f(), iMin);
        yVar2.X(iMin);
        if (z10) {
            yVar.W(iF);
        }
    }

    private void g() {
        int i10;
        if (this.f30490u) {
            this.f30479j = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = ((this.f30487r - this.f30488s) * 1000000.0d) / this.f30486q;
        long jRound = Math.round(this.f30476g);
        if (this.f30478i) {
            this.f30478i = false;
            this.f30476g = this.f30477h;
        } else {
            this.f30476g += d10;
        }
        this.f30475f.e(jRound, i10, this.f30484o, 0, null);
        this.f30490u = false;
        this.f30488s = 0;
        this.f30484o = 0;
    }

    private void h(X1.x xVar) throws ParserException {
        v.c cVarH = v.h(xVar);
        this.f30486q = cVarH.f30495b;
        this.f30487r = cVarH.f30496c;
        long j10 = this.f30489t;
        long j11 = this.f30485p.f30492b;
        if (j10 != j11) {
            this.f30489t = j11;
            String str = "mhm1";
            if (cVarH.f30494a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f30494a));
            }
            byte[] bArr = cVarH.f30497d;
            this.f30475f.f(new s.b().e0(this.f30474e).s0("audio/mhm1").t0(this.f30486q).R(str).f0((bArr == null || bArr.length <= 0) ? null : AbstractC4009y.I(X1.L.f18631f, bArr)).M());
        }
        this.f30490u = true;
    }

    private boolean i() throws ParserException {
        int iG = this.f30470a.g();
        this.f30471b.o(this.f30470a.e(), iG);
        boolean zG = v.g(this.f30471b, this.f30485p);
        if (zG) {
            this.f30483n = 0;
            this.f30484o += this.f30485p.f30493c + iG;
        }
        return zG;
    }

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean k(X1.y yVar) {
        int i10 = this.f30480k;
        if ((i10 & 2) == 0) {
            yVar.W(yVar.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (yVar.a() > 0) {
            int i11 = this.f30481l << 8;
            this.f30481l = i11;
            int iH = i11 | yVar.H();
            this.f30481l = iH;
            if (v.e(iH)) {
                yVar.W(yVar.f() - 3);
                this.f30481l = 0;
                return true;
            }
        }
        return false;
    }

    private void l(X1.y yVar) {
        int iMin = Math.min(yVar.a(), this.f30485p.f30493c - this.f30483n);
        this.f30475f.d(yVar, iMin);
        this.f30483n += iMin;
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30473d = 0;
        this.f30481l = 0;
        this.f30470a.S(2);
        this.f30483n = 0;
        this.f30484o = 0;
        this.f30486q = -2147483647;
        this.f30487r = -1;
        this.f30488s = 0;
        this.f30489t = -1L;
        this.f30490u = false;
        this.f30478i = false;
        this.f30482m = true;
        this.f30479j = true;
        this.f30476g = -9.223372036854776E18d;
        this.f30477h = -9.223372036854776E18d;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) throws ParserException {
        C1804a.i(this.f30475f);
        while (yVar.a() > 0) {
            int i10 = this.f30473d;
            if (i10 != 0) {
                if (i10 == 1) {
                    f(yVar, this.f30470a, false);
                    if (this.f30470a.a() != 0) {
                        this.f30482m = false;
                    } else if (i()) {
                        this.f30470a.W(0);
                        O o10 = this.f30475f;
                        X1.y yVar2 = this.f30470a;
                        o10.d(yVar2, yVar2.g());
                        this.f30470a.S(2);
                        this.f30472c.S(this.f30485p.f30493c);
                        this.f30482m = true;
                        this.f30473d = 2;
                    } else if (this.f30470a.g() < 15) {
                        X1.y yVar3 = this.f30470a;
                        yVar3.V(yVar3.g() + 1);
                        this.f30482m = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f30485p.f30491a)) {
                        f(yVar, this.f30472c, true);
                    }
                    l(yVar);
                    int i11 = this.f30483n;
                    v.b bVar = this.f30485p;
                    if (i11 == bVar.f30493c) {
                        int i12 = bVar.f30491a;
                        if (i12 == 1) {
                            h(new X1.x(this.f30472c.e()));
                        } else if (i12 == 17) {
                            this.f30488s = v.f(new X1.x(this.f30472c.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f30473d = 1;
                    }
                }
            } else if (k(yVar)) {
                this.f30473d = 1;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30474e = dVar.b();
        this.f30475f = rVar.a(dVar.c(), 1);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30480k = i10;
        if (!this.f30479j && (this.f30484o != 0 || !this.f30482m)) {
            this.f30478i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f30478i) {
                this.f30477h = j10;
            } else {
                this.f30476g = j10;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
