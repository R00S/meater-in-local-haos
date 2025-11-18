package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import v2.C4797c;
import v2.O;

/* compiled from: Ac4Reader.java */
/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2217f implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final X1.x f30230a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30231b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30232c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30233d;

    /* renamed from: e, reason: collision with root package name */
    private String f30234e;

    /* renamed from: f, reason: collision with root package name */
    private O f30235f;

    /* renamed from: g, reason: collision with root package name */
    private int f30236g;

    /* renamed from: h, reason: collision with root package name */
    private int f30237h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30238i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30239j;

    /* renamed from: k, reason: collision with root package name */
    private long f30240k;

    /* renamed from: l, reason: collision with root package name */
    private U1.s f30241l;

    /* renamed from: m, reason: collision with root package name */
    private int f30242m;

    /* renamed from: n, reason: collision with root package name */
    private long f30243n;

    public C2217f() {
        this(null, 0);
    }

    private boolean f(X1.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f30237h);
        yVar.l(bArr, this.f30237h, iMin);
        int i11 = this.f30237h + iMin;
        this.f30237h = i11;
        return i11 == i10;
    }

    private void g() {
        this.f30230a.p(0);
        C4797c.C0732c c0732cF = C4797c.f(this.f30230a);
        U1.s sVar = this.f30241l;
        if (sVar == null || c0732cF.f51124c != sVar.f17137D || c0732cF.f51123b != sVar.f17138E || !"audio/ac4".equals(sVar.f17162o)) {
            U1.s sVarM = new s.b().e0(this.f30234e).s0("audio/ac4").Q(c0732cF.f51124c).t0(c0732cF.f51123b).i0(this.f30232c).q0(this.f30233d).M();
            this.f30241l = sVarM;
            this.f30235f.f(sVarM);
        }
        this.f30242m = c0732cF.f51125d;
        this.f30240k = (c0732cF.f51126e * 1000000) / this.f30241l.f17138E;
    }

    private boolean h(X1.y yVar) {
        int iH;
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (this.f30238i) {
                iH = yVar.H();
                this.f30238i = iH == 172;
                if (iH == 64 || iH == 65) {
                    break;
                }
            } else {
                this.f30238i = yVar.H() == 172;
            }
        }
        this.f30239j = iH == 65;
        return true;
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30236g = 0;
        this.f30237h = 0;
        this.f30238i = false;
        this.f30239j = false;
        this.f30243n = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        C1804a.i(this.f30235f);
        while (yVar.a() > 0) {
            int i10 = this.f30236g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(yVar.a(), this.f30242m - this.f30237h);
                        this.f30235f.d(yVar, iMin);
                        int i11 = this.f30237h + iMin;
                        this.f30237h = i11;
                        if (i11 == this.f30242m) {
                            C1804a.g(this.f30243n != -9223372036854775807L);
                            this.f30235f.e(this.f30243n, 1, this.f30242m, 0, null);
                            this.f30243n += this.f30240k;
                            this.f30236g = 0;
                        }
                    }
                } else if (f(yVar, this.f30231b.e(), 16)) {
                    g();
                    this.f30231b.W(0);
                    this.f30235f.d(this.f30231b, 16);
                    this.f30236g = 2;
                }
            } else if (h(yVar)) {
                this.f30236g = 1;
                this.f30231b.e()[0] = -84;
                this.f30231b.e()[1] = (byte) (this.f30239j ? 65 : 64);
                this.f30237h = 2;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30234e = dVar.b();
        this.f30235f = rVar.a(dVar.c(), 1);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30243n = j10;
    }

    public C2217f(String str, int i10) {
        X1.x xVar = new X1.x(new byte[16]);
        this.f30230a = xVar;
        this.f30231b = new X1.y(xVar.f18699a);
        this.f30236g = 0;
        this.f30237h = 0;
        this.f30238i = false;
        this.f30239j = false;
        this.f30243n = -9223372036854775807L;
        this.f30232c = str;
        this.f30233d = i10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
