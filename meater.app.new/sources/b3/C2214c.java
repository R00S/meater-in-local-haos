package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import v2.C4796b;
import v2.O;

/* compiled from: Ac3Reader.java */
/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2214c implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final X1.x f30213a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30214b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30215c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30216d;

    /* renamed from: e, reason: collision with root package name */
    private String f30217e;

    /* renamed from: f, reason: collision with root package name */
    private O f30218f;

    /* renamed from: g, reason: collision with root package name */
    private int f30219g;

    /* renamed from: h, reason: collision with root package name */
    private int f30220h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30221i;

    /* renamed from: j, reason: collision with root package name */
    private long f30222j;

    /* renamed from: k, reason: collision with root package name */
    private U1.s f30223k;

    /* renamed from: l, reason: collision with root package name */
    private int f30224l;

    /* renamed from: m, reason: collision with root package name */
    private long f30225m;

    public C2214c() {
        this(null, 0);
    }

    private boolean f(X1.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f30220h);
        yVar.l(bArr, this.f30220h, iMin);
        int i11 = this.f30220h + iMin;
        this.f30220h = i11;
        return i11 == i10;
    }

    private void g() {
        this.f30213a.p(0);
        C4796b.C0731b c0731bF = C4796b.f(this.f30213a);
        U1.s sVar = this.f30223k;
        if (sVar == null || c0731bF.f51111d != sVar.f17137D || c0731bF.f51110c != sVar.f17138E || !X1.L.d(c0731bF.f51108a, sVar.f17162o)) {
            s.b bVarN0 = new s.b().e0(this.f30217e).s0(c0731bF.f51108a).Q(c0731bF.f51111d).t0(c0731bF.f51110c).i0(this.f30215c).q0(this.f30216d).n0(c0731bF.f51114g);
            if ("audio/ac3".equals(c0731bF.f51108a)) {
                bVarN0.P(c0731bF.f51114g);
            }
            U1.s sVarM = bVarN0.M();
            this.f30223k = sVarM;
            this.f30218f.f(sVarM);
        }
        this.f30224l = c0731bF.f51112e;
        this.f30222j = (c0731bF.f51113f * 1000000) / this.f30223k.f17138E;
    }

    private boolean h(X1.y yVar) {
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (this.f30221i) {
                int iH = yVar.H();
                if (iH == 119) {
                    this.f30221i = false;
                    return true;
                }
                this.f30221i = iH == 11;
            } else {
                this.f30221i = yVar.H() == 11;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30219g = 0;
        this.f30220h = 0;
        this.f30221i = false;
        this.f30225m = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        C1804a.i(this.f30218f);
        while (yVar.a() > 0) {
            int i10 = this.f30219g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(yVar.a(), this.f30224l - this.f30220h);
                        this.f30218f.d(yVar, iMin);
                        int i11 = this.f30220h + iMin;
                        this.f30220h = i11;
                        if (i11 == this.f30224l) {
                            C1804a.g(this.f30225m != -9223372036854775807L);
                            this.f30218f.e(this.f30225m, 1, this.f30224l, 0, null);
                            this.f30225m += this.f30222j;
                            this.f30219g = 0;
                        }
                    }
                } else if (f(yVar, this.f30214b.e(), 128)) {
                    g();
                    this.f30214b.W(0);
                    this.f30218f.d(this.f30214b, 128);
                    this.f30219g = 2;
                }
            } else if (h(yVar)) {
                this.f30219g = 1;
                this.f30214b.e()[0] = 11;
                this.f30214b.e()[1] = 119;
                this.f30220h = 2;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30217e = dVar.b();
        this.f30218f = rVar.a(dVar.c(), 1);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30225m = j10;
    }

    public C2214c(String str, int i10) {
        X1.x xVar = new X1.x(new byte[128]);
        this.f30213a = xVar;
        this.f30214b = new X1.y(xVar.f18699a);
        this.f30219g = 0;
        this.f30225m = -9223372036854775807L;
        this.f30215c = str;
        this.f30216d = i10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
