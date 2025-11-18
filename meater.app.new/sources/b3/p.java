package b3;

import U1.C1733i;
import U1.s;
import X1.C1804a;
import X1.C1808e;
import Y1.e;
import android.util.SparseArray;
import b3.L;
import java.util.ArrayList;
import java.util.Arrays;
import v2.O;

/* compiled from: H264Reader.java */
/* loaded from: classes.dex */
public final class p implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final G f30352a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30353b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30354c;

    /* renamed from: g, reason: collision with root package name */
    private long f30358g;

    /* renamed from: i, reason: collision with root package name */
    private String f30360i;

    /* renamed from: j, reason: collision with root package name */
    private O f30361j;

    /* renamed from: k, reason: collision with root package name */
    private b f30362k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30363l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30365n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f30359h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final w f30355d = new w(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final w f30356e = new w(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final w f30357f = new w(6, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f30364m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final X1.y f30366o = new X1.y();

    /* compiled from: H264Reader.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final O f30367a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30368b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30369c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<e.m> f30370d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<e.l> f30371e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final Y1.f f30372f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f30373g;

        /* renamed from: h, reason: collision with root package name */
        private int f30374h;

        /* renamed from: i, reason: collision with root package name */
        private int f30375i;

        /* renamed from: j, reason: collision with root package name */
        private long f30376j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f30377k;

        /* renamed from: l, reason: collision with root package name */
        private long f30378l;

        /* renamed from: m, reason: collision with root package name */
        private a f30379m;

        /* renamed from: n, reason: collision with root package name */
        private a f30380n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f30381o;

        /* renamed from: p, reason: collision with root package name */
        private long f30382p;

        /* renamed from: q, reason: collision with root package name */
        private long f30383q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f30384r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f30385s;

        /* compiled from: H264Reader.java */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f30386a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f30387b;

            /* renamed from: c, reason: collision with root package name */
            private e.m f30388c;

            /* renamed from: d, reason: collision with root package name */
            private int f30389d;

            /* renamed from: e, reason: collision with root package name */
            private int f30390e;

            /* renamed from: f, reason: collision with root package name */
            private int f30391f;

            /* renamed from: g, reason: collision with root package name */
            private int f30392g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f30393h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f30394i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f30395j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f30396k;

            /* renamed from: l, reason: collision with root package name */
            private int f30397l;

            /* renamed from: m, reason: collision with root package name */
            private int f30398m;

            /* renamed from: n, reason: collision with root package name */
            private int f30399n;

            /* renamed from: o, reason: collision with root package name */
            private int f30400o;

            /* renamed from: p, reason: collision with root package name */
            private int f30401p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f30386a) {
                    return false;
                }
                if (!aVar.f30386a) {
                    return true;
                }
                e.m mVar = (e.m) C1804a.i(this.f30388c);
                e.m mVar2 = (e.m) C1804a.i(aVar.f30388c);
                return (this.f30391f == aVar.f30391f && this.f30392g == aVar.f30392g && this.f30393h == aVar.f30393h && (!this.f30394i || !aVar.f30394i || this.f30395j == aVar.f30395j) && (((i10 = this.f30389d) == (i11 = aVar.f30389d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f19298n) != 0 || mVar2.f19298n != 0 || (this.f30398m == aVar.f30398m && this.f30399n == aVar.f30399n)) && ((i12 != 1 || mVar2.f19298n != 1 || (this.f30400o == aVar.f30400o && this.f30401p == aVar.f30401p)) && (z10 = this.f30396k) == aVar.f30396k && (!z10 || this.f30397l == aVar.f30397l))))) ? false : true;
            }

            public void b() {
                this.f30387b = false;
                this.f30386a = false;
            }

            public boolean d() {
                int i10;
                return this.f30387b && ((i10 = this.f30390e) == 7 || i10 == 2);
            }

            public void e(e.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f30388c = mVar;
                this.f30389d = i10;
                this.f30390e = i11;
                this.f30391f = i12;
                this.f30392g = i13;
                this.f30393h = z10;
                this.f30394i = z11;
                this.f30395j = z12;
                this.f30396k = z13;
                this.f30397l = i14;
                this.f30398m = i15;
                this.f30399n = i16;
                this.f30400o = i17;
                this.f30401p = i18;
                this.f30386a = true;
                this.f30387b = true;
            }

            public void f(int i10) {
                this.f30390e = i10;
                this.f30387b = true;
            }
        }

        public b(O o10, boolean z10, boolean z11) {
            this.f30367a = o10;
            this.f30368b = z10;
            this.f30369c = z11;
            this.f30379m = new a();
            this.f30380n = new a();
            byte[] bArr = new byte[128];
            this.f30373g = bArr;
            this.f30372f = new Y1.f(bArr, 0, 0);
            h();
        }

        private void e(int i10) {
            long j10 = this.f30383q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f30384r;
            this.f30367a.e(j10, z10 ? 1 : 0, (int) (this.f30376j - this.f30382p), i10, null);
        }

        private void i() {
            boolean zD = this.f30368b ? this.f30380n.d() : this.f30385s;
            boolean z10 = this.f30384r;
            int i10 = this.f30375i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f30384r = z10 | z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.p.b.a(byte[], int, int):void");
        }

        public void b(long j10) {
            i();
            this.f30376j = j10;
            e(0);
            this.f30381o = false;
        }

        public boolean c(long j10, int i10, boolean z10) {
            if (this.f30375i == 9 || (this.f30369c && this.f30380n.c(this.f30379m))) {
                if (z10 && this.f30381o) {
                    e(i10 + ((int) (j10 - this.f30376j)));
                }
                this.f30382p = this.f30376j;
                this.f30383q = this.f30378l;
                this.f30384r = false;
                this.f30381o = true;
            }
            i();
            return this.f30384r;
        }

        public boolean d() {
            return this.f30369c;
        }

        public void f(e.l lVar) {
            this.f30371e.append(lVar.f19282a, lVar);
        }

        public void g(e.m mVar) {
            this.f30370d.append(mVar.f19288d, mVar);
        }

        public void h() {
            this.f30377k = false;
            this.f30381o = false;
            this.f30380n.b();
        }

        public void j(long j10, int i10, long j11, boolean z10) {
            this.f30375i = i10;
            this.f30378l = j11;
            this.f30376j = j10;
            this.f30385s = z10;
            if (!this.f30368b || i10 != 1) {
                if (!this.f30369c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f30379m;
            this.f30379m = this.f30380n;
            this.f30380n = aVar;
            aVar.b();
            this.f30374h = 0;
            this.f30377k = true;
        }
    }

    public p(G g10, boolean z10, boolean z11) {
        this.f30352a = g10;
        this.f30353b = z10;
        this.f30354c = z11;
    }

    private void f() {
        C1804a.i(this.f30361j);
        X1.L.i(this.f30362k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f30363l || this.f30362k.d()) {
            this.f30355d.b(i11);
            this.f30356e.b(i11);
            if (this.f30363l) {
                if (this.f30355d.c()) {
                    w wVar = this.f30355d;
                    e.m mVarZ = Y1.e.z(wVar.f30501d, 3, wVar.f30502e);
                    this.f30352a.f(mVarZ.f19304t);
                    this.f30362k.g(mVarZ);
                    this.f30355d.d();
                } else if (this.f30356e.c()) {
                    w wVar2 = this.f30356e;
                    this.f30362k.f(Y1.e.x(wVar2.f30501d, 3, wVar2.f30502e));
                    this.f30356e.d();
                }
            } else if (this.f30355d.c() && this.f30356e.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f30355d;
                arrayList.add(Arrays.copyOf(wVar3.f30501d, wVar3.f30502e));
                w wVar4 = this.f30356e;
                arrayList.add(Arrays.copyOf(wVar4.f30501d, wVar4.f30502e));
                w wVar5 = this.f30355d;
                e.m mVarZ2 = Y1.e.z(wVar5.f30501d, 3, wVar5.f30502e);
                w wVar6 = this.f30356e;
                e.l lVarX = Y1.e.x(wVar6.f30501d, 3, wVar6.f30502e);
                this.f30361j.f(new s.b().e0(this.f30360i).s0("video/avc").R(C1808e.d(mVarZ2.f19285a, mVarZ2.f19286b, mVarZ2.f19287c)).z0(mVarZ2.f19290f).c0(mVarZ2.f19291g).S(new C1733i.b().d(mVarZ2.f19301q).c(mVarZ2.f19302r).e(mVarZ2.f19303s).g(mVarZ2.f19293i + 8).b(mVarZ2.f19294j + 8).a()).o0(mVarZ2.f19292h).f0(arrayList).k0(mVarZ2.f19304t).M());
                this.f30363l = true;
                this.f30352a.f(mVarZ2.f19304t);
                this.f30362k.g(mVarZ2);
                this.f30362k.f(lVarX);
                this.f30355d.d();
                this.f30356e.d();
            }
        }
        if (this.f30357f.b(i11)) {
            w wVar7 = this.f30357f;
            this.f30366o.U(this.f30357f.f30501d, Y1.e.I(wVar7.f30501d, wVar7.f30502e));
            this.f30366o.W(4);
            this.f30352a.b(j11, this.f30366o);
        }
        if (this.f30362k.c(j10, i10, this.f30363l)) {
            this.f30365n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f30363l || this.f30362k.d()) {
            this.f30355d.a(bArr, i10, i11);
            this.f30356e.a(bArr, i10, i11);
        }
        this.f30357f.a(bArr, i10, i11);
        this.f30362k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f30363l || this.f30362k.d()) {
            this.f30355d.e(i10);
            this.f30356e.e(i10);
        }
        this.f30357f.e(i10);
        this.f30362k.j(j10, i10, j11, this.f30365n);
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30358g = 0L;
        this.f30365n = false;
        this.f30364m = -9223372036854775807L;
        Y1.e.c(this.f30359h);
        this.f30355d.d();
        this.f30356e.d();
        this.f30357f.d();
        this.f30352a.d();
        b bVar = this.f30362k;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        f();
        int iF = yVar.f();
        int iG = yVar.g();
        byte[] bArrE = yVar.e();
        this.f30358g += yVar.a();
        this.f30361j.d(yVar, yVar.a());
        while (true) {
            int iE = Y1.e.e(bArrE, iF, iG, this.f30359h);
            if (iE == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iJ = Y1.e.j(bArrE, iE);
            int i10 = iE - iF;
            if (i10 > 0) {
                h(bArrE, iF, iE);
            }
            int i11 = iG - iE;
            long j10 = this.f30358g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f30364m);
            i(j10, iJ, this.f30364m);
            iF = iE + 3;
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        f();
        if (z10) {
            this.f30352a.d();
            this.f30362k.b(this.f30358g);
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30360i = dVar.b();
        O oA = rVar.a(dVar.c(), 2);
        this.f30361j = oA;
        this.f30362k = new b(oA, this.f30353b, this.f30354c);
        this.f30352a.c(rVar, dVar);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30364m = j10;
        this.f30365n |= (i10 & 2) != 0;
    }
}
