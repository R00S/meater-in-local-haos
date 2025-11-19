package b3;

import X1.C1804a;
import b3.L;

/* compiled from: PesReader.java */
/* loaded from: classes.dex */
public final class y implements L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2224m f30506a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.x f30507b = new X1.x(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f30508c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f30509d;

    /* renamed from: e, reason: collision with root package name */
    private X1.E f30510e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30511f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30512g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30513h;

    /* renamed from: i, reason: collision with root package name */
    private int f30514i;

    /* renamed from: j, reason: collision with root package name */
    private int f30515j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30516k;

    /* renamed from: l, reason: collision with root package name */
    private long f30517l;

    public y(InterfaceC2224m interfaceC2224m) {
        this.f30506a = interfaceC2224m;
    }

    private boolean e(X1.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f30509d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.X(iMin);
        } else {
            yVar.l(bArr, this.f30509d, iMin);
        }
        int i11 = this.f30509d + iMin;
        this.f30509d = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f30507b.p(0);
        int iH = this.f30507b.h(24);
        if (iH != 1) {
            X1.n.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f30515j = -1;
            return false;
        }
        this.f30507b.r(8);
        int iH2 = this.f30507b.h(16);
        this.f30507b.r(5);
        this.f30516k = this.f30507b.g();
        this.f30507b.r(2);
        this.f30511f = this.f30507b.g();
        this.f30512g = this.f30507b.g();
        this.f30507b.r(6);
        int iH3 = this.f30507b.h(8);
        this.f30514i = iH3;
        if (iH2 == 0) {
            this.f30515j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f30515j = i10;
            if (i10 < 0) {
                X1.n.h("PesReader", "Found negative packet payload size: " + this.f30515j);
                this.f30515j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f30507b.p(0);
        this.f30517l = -9223372036854775807L;
        if (this.f30511f) {
            this.f30507b.r(4);
            this.f30507b.r(1);
            this.f30507b.r(1);
            long jH = (this.f30507b.h(3) << 30) | (this.f30507b.h(15) << 15) | this.f30507b.h(15);
            this.f30507b.r(1);
            if (!this.f30513h && this.f30512g) {
                this.f30507b.r(4);
                this.f30507b.r(1);
                this.f30507b.r(1);
                this.f30507b.r(1);
                this.f30510e.b((this.f30507b.h(3) << 30) | (this.f30507b.h(15) << 15) | this.f30507b.h(15));
                this.f30513h = true;
            }
            this.f30517l = this.f30510e.b(jH);
        }
    }

    private void h(int i10) {
        this.f30508c = i10;
        this.f30509d = 0;
    }

    @Override // b3.L
    public void a() {
        this.f30508c = 0;
        this.f30509d = 0;
        this.f30513h = false;
        this.f30506a.a();
    }

    @Override // b3.L
    public void b(X1.y yVar, int i10) {
        C1804a.i(this.f30510e);
        if ((i10 & 1) != 0) {
            int i11 = this.f30508c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    X1.n.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f30515j != -1) {
                        X1.n.h("PesReader", "Unexpected start indicator: expected " + this.f30515j + " more bytes");
                    }
                    this.f30506a.c(yVar.g() == 0);
                }
            }
            h(1);
        }
        while (yVar.a() > 0) {
            int i12 = this.f30508c;
            if (i12 == 0) {
                yVar.X(yVar.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(yVar, this.f30507b.f18699a, Math.min(10, this.f30514i)) && e(yVar, null, this.f30514i)) {
                        g();
                        i10 |= this.f30516k ? 4 : 0;
                        this.f30506a.e(this.f30517l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = yVar.a();
                    int i13 = this.f30515j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        yVar.V(yVar.f() + iA);
                    }
                    this.f30506a.b(yVar);
                    int i15 = this.f30515j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f30515j = i16;
                        if (i16 == 0) {
                            this.f30506a.c(false);
                            h(1);
                        }
                    }
                }
            } else if (e(yVar, this.f30507b.f18699a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // b3.L
    public void c(X1.E e10, v2.r rVar, L.d dVar) {
        this.f30510e = e10;
        this.f30506a.d(rVar, dVar);
    }

    public boolean d(boolean z10) {
        return this.f30508c == 3 && this.f30515j == -1 && !(z10 && (this.f30506a instanceof C2225n));
    }
}
