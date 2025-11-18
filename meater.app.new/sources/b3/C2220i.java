package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import java.util.Arrays;
import java.util.Collections;
import v2.C4795a;
import v2.C4807m;
import v2.O;

/* compiled from: AdtsReader.java */
/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220i implements InterfaceC2224m {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f30257w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30258a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.x f30259b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30260c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30261d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30262e;

    /* renamed from: f, reason: collision with root package name */
    private String f30263f;

    /* renamed from: g, reason: collision with root package name */
    private O f30264g;

    /* renamed from: h, reason: collision with root package name */
    private O f30265h;

    /* renamed from: i, reason: collision with root package name */
    private int f30266i;

    /* renamed from: j, reason: collision with root package name */
    private int f30267j;

    /* renamed from: k, reason: collision with root package name */
    private int f30268k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30269l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30270m;

    /* renamed from: n, reason: collision with root package name */
    private int f30271n;

    /* renamed from: o, reason: collision with root package name */
    private int f30272o;

    /* renamed from: p, reason: collision with root package name */
    private int f30273p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30274q;

    /* renamed from: r, reason: collision with root package name */
    private long f30275r;

    /* renamed from: s, reason: collision with root package name */
    private int f30276s;

    /* renamed from: t, reason: collision with root package name */
    private long f30277t;

    /* renamed from: u, reason: collision with root package name */
    private O f30278u;

    /* renamed from: v, reason: collision with root package name */
    private long f30279v;

    public C2220i(boolean z10) {
        this(z10, null, 0);
    }

    private void f() {
        C1804a.e(this.f30264g);
        X1.L.i(this.f30278u);
        X1.L.i(this.f30265h);
    }

    private void g(X1.y yVar) {
        if (yVar.a() == 0) {
            return;
        }
        this.f30259b.f18699a[0] = yVar.e()[yVar.f()];
        this.f30259b.p(2);
        int iH = this.f30259b.h(4);
        int i10 = this.f30272o;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f30270m) {
            this.f30270m = true;
            this.f30271n = this.f30273p;
            this.f30272o = iH;
        }
        t();
    }

    private boolean h(X1.y yVar, int i10) {
        yVar.W(i10 + 1);
        if (!w(yVar, this.f30259b.f18699a, 1)) {
            return false;
        }
        this.f30259b.p(4);
        int iH = this.f30259b.h(1);
        int i11 = this.f30271n;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f30272o != -1) {
            if (!w(yVar, this.f30259b.f18699a, 1)) {
                return true;
            }
            this.f30259b.p(2);
            if (this.f30259b.h(4) != this.f30272o) {
                return false;
            }
            yVar.W(i10 + 2);
        }
        if (!w(yVar, this.f30259b.f18699a, 4)) {
            return true;
        }
        this.f30259b.p(14);
        int iH2 = this.f30259b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = yVar.e();
        int iG = yVar.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean i(X1.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f30267j);
        yVar.l(bArr, this.f30267j, iMin);
        int i11 = this.f30267j + iMin;
        this.f30267j = i11;
        return i11 == i10;
    }

    private void j(X1.y yVar) {
        byte[] bArrE = yVar.e();
        int iF = yVar.f();
        int iG = yVar.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & 255;
            if (this.f30268k == 512 && l((byte) -1, (byte) i11) && (this.f30270m || h(yVar, iF - 1))) {
                this.f30273p = (b10 & 8) >> 3;
                this.f30269l = (b10 & 1) == 0;
                if (this.f30270m) {
                    t();
                } else {
                    r();
                }
                yVar.W(i10);
                return;
            }
            int i12 = this.f30268k;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f30268k = 768;
            } else if (i13 == 511) {
                this.f30268k = 512;
            } else if (i13 == 836) {
                this.f30268k = 1024;
            } else if (i13 == 1075) {
                u();
                yVar.W(i10);
                return;
            } else if (i12 != 256) {
                this.f30268k = 256;
            }
            iF = i10;
        }
        yVar.W(iF);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f30259b.p(0);
        if (this.f30274q) {
            this.f30259b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f30259b.h(2) + 1;
            if (iH != 2) {
                X1.n.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f30259b.r(5);
            byte[] bArrA = C4795a.a(i10, this.f30272o, this.f30259b.h(3));
            C4795a.b bVarE = C4795a.e(bArrA);
            U1.s sVarM = new s.b().e0(this.f30263f).s0("audio/mp4a-latm").R(bVarE.f51101c).Q(bVarE.f51100b).t0(bVarE.f51099a).f0(Collections.singletonList(bArrA)).i0(this.f30261d).q0(this.f30262e).M();
            this.f30275r = 1024000000 / sVarM.f17138E;
            this.f30264g.f(sVarM);
            this.f30274q = true;
        }
        this.f30259b.r(4);
        int iH2 = this.f30259b.h(13);
        int i11 = iH2 - 7;
        if (this.f30269l) {
            i11 = iH2 - 9;
        }
        v(this.f30264g, this.f30275r, 0, i11);
    }

    private void o() {
        this.f30265h.d(this.f30260c, 10);
        this.f30260c.W(6);
        v(this.f30265h, 0L, 10, this.f30260c.G() + 10);
    }

    private void p(X1.y yVar) {
        int iMin = Math.min(yVar.a(), this.f30276s - this.f30267j);
        this.f30278u.d(yVar, iMin);
        int i10 = this.f30267j + iMin;
        this.f30267j = i10;
        if (i10 == this.f30276s) {
            C1804a.g(this.f30277t != -9223372036854775807L);
            this.f30278u.e(this.f30277t, 1, this.f30276s, 0, null);
            this.f30277t += this.f30279v;
            s();
        }
    }

    private void q() {
        this.f30270m = false;
        s();
    }

    private void r() {
        this.f30266i = 1;
        this.f30267j = 0;
    }

    private void s() {
        this.f30266i = 0;
        this.f30267j = 0;
        this.f30268k = 256;
    }

    private void t() {
        this.f30266i = 3;
        this.f30267j = 0;
    }

    private void u() {
        this.f30266i = 2;
        this.f30267j = f30257w.length;
        this.f30276s = 0;
        this.f30260c.W(0);
    }

    private void v(O o10, long j10, int i10, int i11) {
        this.f30266i = 4;
        this.f30267j = i10;
        this.f30278u = o10;
        this.f30279v = j10;
        this.f30276s = i11;
    }

    private boolean w(X1.y yVar, byte[] bArr, int i10) {
        if (yVar.a() < i10) {
            return false;
        }
        yVar.l(bArr, 0, i10);
        return true;
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30277t = -9223372036854775807L;
        q();
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        f();
        while (yVar.a() > 0) {
            int i10 = this.f30266i;
            if (i10 == 0) {
                j(yVar);
            } else if (i10 == 1) {
                g(yVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(yVar, this.f30259b.f18699a, this.f30269l ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(yVar);
                }
            } else if (i(yVar, this.f30260c.e(), 10)) {
                o();
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30263f = dVar.b();
        O oA = rVar.a(dVar.c(), 1);
        this.f30264g = oA;
        this.f30278u = oA;
        if (!this.f30258a) {
            this.f30265h = new C4807m();
            return;
        }
        dVar.a();
        O oA2 = rVar.a(dVar.c(), 5);
        this.f30265h = oA2;
        oA2.f(new s.b().e0(dVar.b()).s0("application/id3").M());
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30277t = j10;
    }

    public long k() {
        return this.f30275r;
    }

    public C2220i(boolean z10, String str, int i10) {
        this.f30259b = new X1.x(new byte[7]);
        this.f30260c = new X1.y(Arrays.copyOf(f30257w, 10));
        s();
        this.f30271n = -1;
        this.f30272o = -1;
        this.f30275r = -9223372036854775807L;
        this.f30277t = -9223372036854775807L;
        this.f30258a = z10;
        this.f30261d = str;
        this.f30262e = i10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
