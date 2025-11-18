package b3;

import X1.C1804a;
import android.util.SparseArray;
import b3.L;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;

/* compiled from: PsExtractor.java */
/* loaded from: classes.dex */
public final class C implements InterfaceC4810p {

    /* renamed from: l, reason: collision with root package name */
    public static final v2.u f30122l = new v2.u() { // from class: b3.B
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C.f();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final X1.E f30123a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f30124b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30125c;

    /* renamed from: d, reason: collision with root package name */
    private final C2211A f30126d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30127e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30128f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30129g;

    /* renamed from: h, reason: collision with root package name */
    private long f30130h;

    /* renamed from: i, reason: collision with root package name */
    private z f30131i;

    /* renamed from: j, reason: collision with root package name */
    private v2.r f30132j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30133k;

    /* compiled from: PsExtractor.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2224m f30134a;

        /* renamed from: b, reason: collision with root package name */
        private final X1.E f30135b;

        /* renamed from: c, reason: collision with root package name */
        private final X1.x f30136c = new X1.x(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f30137d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f30138e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f30139f;

        /* renamed from: g, reason: collision with root package name */
        private int f30140g;

        /* renamed from: h, reason: collision with root package name */
        private long f30141h;

        public a(InterfaceC2224m interfaceC2224m, X1.E e10) {
            this.f30134a = interfaceC2224m;
            this.f30135b = e10;
        }

        private void b() {
            this.f30136c.r(8);
            this.f30137d = this.f30136c.g();
            this.f30138e = this.f30136c.g();
            this.f30136c.r(6);
            this.f30140g = this.f30136c.h(8);
        }

        private void c() {
            this.f30141h = 0L;
            if (this.f30137d) {
                this.f30136c.r(4);
                this.f30136c.r(1);
                this.f30136c.r(1);
                long jH = (this.f30136c.h(3) << 30) | (this.f30136c.h(15) << 15) | this.f30136c.h(15);
                this.f30136c.r(1);
                if (!this.f30139f && this.f30138e) {
                    this.f30136c.r(4);
                    this.f30136c.r(1);
                    this.f30136c.r(1);
                    this.f30136c.r(1);
                    this.f30135b.b((this.f30136c.h(3) << 30) | (this.f30136c.h(15) << 15) | this.f30136c.h(15));
                    this.f30139f = true;
                }
                this.f30141h = this.f30135b.b(jH);
            }
        }

        public void a(X1.y yVar) {
            yVar.l(this.f30136c.f18699a, 0, 3);
            this.f30136c.p(0);
            b();
            yVar.l(this.f30136c.f18699a, 0, this.f30140g);
            this.f30136c.p(0);
            c();
            this.f30134a.e(this.f30141h, 4);
            this.f30134a.b(yVar);
            this.f30134a.c(false);
        }

        public void d() {
            this.f30139f = false;
            this.f30134a.a();
        }
    }

    public C() {
        this(new X1.E(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] f() {
        return new InterfaceC4810p[]{new C()};
    }

    private void g(long j10) {
        if (this.f30133k) {
            return;
        }
        this.f30133k = true;
        if (this.f30126d.c() == -9223372036854775807L) {
            this.f30132j.f(new J.b(this.f30126d.c()));
            return;
        }
        z zVar = new z(this.f30126d.d(), this.f30126d.c(), j10);
        this.f30131i = zVar;
        this.f30132j.f(zVar.b());
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        boolean z10 = this.f30123a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f30123a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f30123a.i(j11);
        }
        z zVar = this.f30131i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f30124b.size(); i10++) {
            this.f30124b.valueAt(i10).d();
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        byte[] bArr = new byte[14];
        interfaceC4811q.p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC4811q.j(bArr[13] & 7);
        interfaceC4811q.p(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f30132j = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, v2.I i10) {
        InterfaceC2224m c2225n;
        C1804a.i(this.f30132j);
        long jA = interfaceC4811q.a();
        if (jA != -1 && !this.f30126d.e()) {
            return this.f30126d.g(interfaceC4811q, i10);
        }
        g(jA);
        z zVar = this.f30131i;
        if (zVar != null && zVar.d()) {
            return this.f30131i.c(interfaceC4811q, i10);
        }
        interfaceC4811q.m();
        long jI = jA != -1 ? jA - interfaceC4811q.i() : -1L;
        if ((jI != -1 && jI < 4) || !interfaceC4811q.h(this.f30125c.e(), 0, 4, true)) {
            return -1;
        }
        this.f30125c.W(0);
        int iQ = this.f30125c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            interfaceC4811q.p(this.f30125c.e(), 0, 10);
            this.f30125c.W(9);
            interfaceC4811q.n((this.f30125c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            interfaceC4811q.p(this.f30125c.e(), 0, 2);
            this.f30125c.W(0);
            interfaceC4811q.n(this.f30125c.P() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            interfaceC4811q.n(1);
            return 0;
        }
        int i11 = iQ & 255;
        a aVar = this.f30124b.get(i11);
        if (!this.f30127e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c2225n = new C2214c();
                    this.f30128f = true;
                    this.f30130h = interfaceC4811q.getPosition();
                } else if ((iQ & 224) == 192) {
                    c2225n = new t();
                    this.f30128f = true;
                    this.f30130h = interfaceC4811q.getPosition();
                } else if ((iQ & 240) == 224) {
                    c2225n = new C2225n();
                    this.f30129g = true;
                    this.f30130h = interfaceC4811q.getPosition();
                } else {
                    c2225n = null;
                }
                if (c2225n != null) {
                    c2225n.d(this.f30132j, new L.d(i11, 256));
                    aVar = new a(c2225n, this.f30123a);
                    this.f30124b.put(i11, aVar);
                }
            }
            if (interfaceC4811q.getPosition() > ((this.f30128f && this.f30129g) ? this.f30130h + 8192 : 1048576L)) {
                this.f30127e = true;
                this.f30132j.n();
            }
        }
        interfaceC4811q.p(this.f30125c.e(), 0, 2);
        this.f30125c.W(0);
        int iP = this.f30125c.P() + 6;
        if (aVar == null) {
            interfaceC4811q.n(iP);
        } else {
            this.f30125c.S(iP);
            interfaceC4811q.readFully(this.f30125c.e(), 0, iP);
            this.f30125c.W(6);
            aVar.a(this.f30125c);
            X1.y yVar = this.f30125c;
            yVar.V(yVar.b());
        }
        return 0;
    }

    public C(X1.E e10) {
        this.f30123a = e10;
        this.f30125c = new X1.y(4096);
        this.f30124b = new SparseArray<>();
        this.f30126d = new C2211A();
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
