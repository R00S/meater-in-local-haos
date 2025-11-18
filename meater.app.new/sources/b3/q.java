package b3;

import U1.C1733i;
import U1.s;
import X1.C1804a;
import X1.C1808e;
import Y1.e;
import b3.L;
import java.util.Collections;
import v2.O;

/* compiled from: H265Reader.java */
/* loaded from: classes.dex */
public final class q implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final G f30402a;

    /* renamed from: b, reason: collision with root package name */
    private String f30403b;

    /* renamed from: c, reason: collision with root package name */
    private O f30404c;

    /* renamed from: d, reason: collision with root package name */
    private a f30405d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30406e;

    /* renamed from: l, reason: collision with root package name */
    private long f30413l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f30407f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final w f30408g = new w(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final w f30409h = new w(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final w f30410i = new w(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final w f30411j = new w(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final w f30412k = new w(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f30414m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final X1.y f30415n = new X1.y();

    /* compiled from: H265Reader.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final O f30416a;

        /* renamed from: b, reason: collision with root package name */
        private long f30417b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30418c;

        /* renamed from: d, reason: collision with root package name */
        private int f30419d;

        /* renamed from: e, reason: collision with root package name */
        private long f30420e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f30421f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f30422g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f30423h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f30424i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f30425j;

        /* renamed from: k, reason: collision with root package name */
        private long f30426k;

        /* renamed from: l, reason: collision with root package name */
        private long f30427l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f30428m;

        public a(O o10) {
            this.f30416a = o10;
        }

        private static boolean c(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean d(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void e(int i10) {
            long j10 = this.f30427l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f30428m;
            this.f30416a.e(j10, z10 ? 1 : 0, (int) (this.f30417b - this.f30426k), i10, null);
        }

        public void a(long j10) {
            this.f30428m = this.f30418c;
            e((int) (j10 - this.f30417b));
            this.f30426k = this.f30417b;
            this.f30417b = j10;
            e(0);
            this.f30424i = false;
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f30425j && this.f30422g) {
                this.f30428m = this.f30418c;
                this.f30425j = false;
            } else if (this.f30423h || this.f30422g) {
                if (z10 && this.f30424i) {
                    e(i10 + ((int) (j10 - this.f30417b)));
                }
                this.f30426k = this.f30417b;
                this.f30427l = this.f30420e;
                this.f30428m = this.f30418c;
                this.f30424i = true;
            }
        }

        public void f(byte[] bArr, int i10, int i11) {
            if (this.f30421f) {
                int i12 = this.f30419d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f30419d = i12 + (i11 - i10);
                } else {
                    this.f30422g = (bArr[i13] & 128) != 0;
                    this.f30421f = false;
                }
            }
        }

        public void g() {
            this.f30421f = false;
            this.f30422g = false;
            this.f30423h = false;
            this.f30424i = false;
            this.f30425j = false;
        }

        public void h(long j10, int i10, int i11, long j11, boolean z10) {
            this.f30422g = false;
            this.f30423h = false;
            this.f30420e = j11;
            this.f30419d = 0;
            this.f30417b = j10;
            if (!d(i11)) {
                if (this.f30424i && !this.f30425j) {
                    if (z10) {
                        e(i10);
                    }
                    this.f30424i = false;
                }
                if (c(i11)) {
                    this.f30423h = !this.f30425j;
                    this.f30425j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f30418c = z11;
            this.f30421f = z11 || i11 <= 9;
        }
    }

    public q(G g10) {
        this.f30402a = g10;
    }

    private void f() {
        C1804a.i(this.f30404c);
        X1.L.i(this.f30405d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f30405d.b(j10, i10, this.f30406e);
        if (!this.f30406e) {
            this.f30408g.b(i11);
            this.f30409h.b(i11);
            this.f30410i.b(i11);
            if (this.f30408g.c() && this.f30409h.c() && this.f30410i.c()) {
                U1.s sVarI = i(this.f30403b, this.f30408g, this.f30409h, this.f30410i);
                this.f30404c.f(sVarI);
                l8.m.q(sVarI.f17164q != -1);
                this.f30402a.f(sVarI.f17164q);
                this.f30406e = true;
            }
        }
        if (this.f30411j.b(i11)) {
            w wVar = this.f30411j;
            this.f30415n.U(this.f30411j.f30501d, Y1.e.I(wVar.f30501d, wVar.f30502e));
            this.f30415n.X(5);
            this.f30402a.b(j11, this.f30415n);
        }
        if (this.f30412k.b(i11)) {
            w wVar2 = this.f30412k;
            this.f30415n.U(this.f30412k.f30501d, Y1.e.I(wVar2.f30501d, wVar2.f30502e));
            this.f30415n.X(5);
            this.f30402a.b(j11, this.f30415n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f30405d.f(bArr, i10, i11);
        if (!this.f30406e) {
            this.f30408g.a(bArr, i10, i11);
            this.f30409h.a(bArr, i10, i11);
            this.f30410i.a(bArr, i10, i11);
        }
        this.f30411j.a(bArr, i10, i11);
        this.f30412k.a(bArr, i10, i11);
    }

    private static U1.s i(String str, w wVar, w wVar2, w wVar3) {
        int i10 = wVar.f30502e;
        byte[] bArr = new byte[wVar2.f30502e + i10 + wVar3.f30502e];
        System.arraycopy(wVar.f30501d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f30501d, 0, bArr, wVar.f30502e, wVar2.f30502e);
        System.arraycopy(wVar3.f30501d, 0, bArr, wVar.f30502e + wVar2.f30502e, wVar3.f30502e);
        e.h hVarR = Y1.e.r(wVar2.f30501d, 3, wVar2.f30502e, null);
        e.c cVar = hVarR.f19260b;
        return new s.b().e0(str).s0("video/hevc").R(cVar != null ? C1808e.f(cVar.f19235a, cVar.f19236b, cVar.f19237c, cVar.f19238d, cVar.f19239e, cVar.f19240f) : null).z0(hVarR.f19265g).c0(hVarR.f19266h).S(new C1733i.b().d(hVarR.f19269k).c(hVarR.f19270l).e(hVarR.f19271m).g(hVarR.f19262d + 8).b(hVarR.f19263e + 8).a()).o0(hVarR.f19267i).k0(hVarR.f19268j).f0(Collections.singletonList(bArr)).M();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f30405d.h(j10, i10, i11, j11, this.f30406e);
        if (!this.f30406e) {
            this.f30408g.e(i11);
            this.f30409h.e(i11);
            this.f30410i.e(i11);
        }
        this.f30411j.e(i11);
        this.f30412k.e(i11);
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30413l = 0L;
        this.f30414m = -9223372036854775807L;
        Y1.e.c(this.f30407f);
        this.f30408g.d();
        this.f30409h.d();
        this.f30410i.d();
        this.f30411j.d();
        this.f30412k.d();
        this.f30402a.d();
        a aVar = this.f30405d;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        f();
        while (yVar.a() > 0) {
            int iF = yVar.f();
            int iG = yVar.g();
            byte[] bArrE = yVar.e();
            this.f30413l += yVar.a();
            this.f30404c.d(yVar, yVar.a());
            while (iF < iG) {
                int iE = Y1.e.e(bArrE, iF, iG, this.f30407f);
                if (iE == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int i10 = Y1.e.i(bArrE, iE);
                int i11 = iE - iF;
                if (i11 > 0) {
                    h(bArrE, iF, iE);
                }
                int i12 = iG - iE;
                long j10 = this.f30413l - i12;
                g(j10, i12, i11 < 0 ? -i11 : 0, this.f30414m);
                j(j10, i12, i10, this.f30414m);
                iF = iE + 3;
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f30402a.d();
            this.f30405d.a(this.f30413l);
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30403b = dVar.b();
        O oA = rVar.a(dVar.c(), 2);
        this.f30404c = oA;
        this.f30405d = new a(oA);
        this.f30402a.c(rVar, dVar);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30414m = j10;
    }
}
