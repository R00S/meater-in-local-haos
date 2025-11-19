package androidx.media3.extractor.flv;

import X1.C1804a;
import X1.y;
import androidx.media3.extractor.flv.b;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.r;
import v2.u;

/* compiled from: FlvExtractor.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC4810p {

    /* renamed from: q, reason: collision with root package name */
    public static final u f28041q = new u() { // from class: B2.a
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return b.k();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private r f28047f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28049h;

    /* renamed from: i, reason: collision with root package name */
    private long f28050i;

    /* renamed from: j, reason: collision with root package name */
    private int f28051j;

    /* renamed from: k, reason: collision with root package name */
    private int f28052k;

    /* renamed from: l, reason: collision with root package name */
    private int f28053l;

    /* renamed from: m, reason: collision with root package name */
    private long f28054m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28055n;

    /* renamed from: o, reason: collision with root package name */
    private a f28056o;

    /* renamed from: p, reason: collision with root package name */
    private d f28057p;

    /* renamed from: a, reason: collision with root package name */
    private final y f28042a = new y(4);

    /* renamed from: b, reason: collision with root package name */
    private final y f28043b = new y(9);

    /* renamed from: c, reason: collision with root package name */
    private final y f28044c = new y(11);

    /* renamed from: d, reason: collision with root package name */
    private final y f28045d = new y();

    /* renamed from: e, reason: collision with root package name */
    private final c f28046e = new c();

    /* renamed from: g, reason: collision with root package name */
    private int f28048g = 1;

    private void f() {
        if (this.f28055n) {
            return;
        }
        this.f28047f.f(new J.b(-9223372036854775807L));
        this.f28055n = true;
    }

    private long g() {
        if (this.f28049h) {
            return this.f28050i + this.f28054m;
        }
        if (this.f28046e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f28054m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] k() {
        return new InterfaceC4810p[]{new b()};
    }

    private y l(InterfaceC4811q interfaceC4811q) {
        if (this.f28053l > this.f28045d.b()) {
            y yVar = this.f28045d;
            yVar.U(new byte[Math.max(yVar.b() * 2, this.f28053l)], 0);
        } else {
            this.f28045d.W(0);
        }
        this.f28045d.V(this.f28053l);
        interfaceC4811q.readFully(this.f28045d.e(), 0, this.f28053l);
        return this.f28045d;
    }

    private boolean m(InterfaceC4811q interfaceC4811q) {
        if (!interfaceC4811q.f(this.f28043b.e(), 0, 9, true)) {
            return false;
        }
        this.f28043b.W(0);
        this.f28043b.X(4);
        int iH = this.f28043b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f28056o == null) {
            this.f28056o = new a(this.f28047f.a(8, 1));
        }
        if (z11 && this.f28057p == null) {
            this.f28057p = new d(this.f28047f.a(9, 2));
        }
        this.f28047f.n();
        this.f28051j = this.f28043b.q() - 5;
        this.f28048g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean n(v2.InterfaceC4811q r10) {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f28052k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            androidx.media3.extractor.flv.a r3 = r9.f28056o
            if (r3 == 0) goto L23
            r9.f()
            androidx.media3.extractor.flv.a r2 = r9.f28056o
            X1.y r10 = r9.l(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            androidx.media3.extractor.flv.d r3 = r9.f28057p
            if (r3 == 0) goto L39
            r9.f()
            androidx.media3.extractor.flv.d r2 = r9.f28057p
            X1.y r10 = r9.l(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f28055n
            if (r2 != 0) goto L6e
            androidx.media3.extractor.flv.c r2 = r9.f28046e
            X1.y r10 = r9.l(r10)
            boolean r10 = r2.a(r10, r0)
            androidx.media3.extractor.flv.c r0 = r9.f28046e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            v2.r r2 = r9.f28047f
            v2.E r3 = new v2.E
            androidx.media3.extractor.flv.c r7 = r9.f28046e
            long[] r7 = r7.e()
            androidx.media3.extractor.flv.c r8 = r9.f28046e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.f(r3)
            r9.f28055n = r6
            goto L21
        L6e:
            int r0 = r9.f28053l
            r10.n(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f28049h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f28049h = r6
            androidx.media3.extractor.flv.c r10 = r9.f28046e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f28054m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f28050i = r1
        L8f:
            r10 = 4
            r9.f28051j = r10
            r10 = 2
            r9.f28048g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.b.n(v2.q):boolean");
    }

    private boolean o(InterfaceC4811q interfaceC4811q) {
        if (!interfaceC4811q.f(this.f28044c.e(), 0, 11, true)) {
            return false;
        }
        this.f28044c.W(0);
        this.f28052k = this.f28044c.H();
        this.f28053l = this.f28044c.K();
        this.f28054m = this.f28044c.K();
        this.f28054m = ((this.f28044c.H() << 24) | this.f28054m) * 1000;
        this.f28044c.X(3);
        this.f28048g = 4;
        return true;
    }

    private void p(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.n(this.f28051j);
        this.f28051j = 0;
        this.f28048g = 3;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f28048g = 1;
            this.f28049h = false;
        } else {
            this.f28048g = 3;
        }
        this.f28051j = 0;
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.p(this.f28042a.e(), 0, 3);
        this.f28042a.W(0);
        if (this.f28042a.K() != 4607062) {
            return false;
        }
        interfaceC4811q.p(this.f28042a.e(), 0, 2);
        this.f28042a.W(0);
        if ((this.f28042a.P() & 250) != 0) {
            return false;
        }
        interfaceC4811q.p(this.f28042a.e(), 0, 4);
        this.f28042a.W(0);
        int iQ = this.f28042a.q();
        interfaceC4811q.m();
        interfaceC4811q.j(iQ);
        interfaceC4811q.p(this.f28042a.e(), 0, 4);
        this.f28042a.W(0);
        return this.f28042a.q() == 0;
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f28047f = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        C1804a.i(this.f28047f);
        while (true) {
            int i11 = this.f28048g;
            if (i11 != 1) {
                if (i11 == 2) {
                    p(interfaceC4811q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (n(interfaceC4811q)) {
                        return 0;
                    }
                } else if (!o(interfaceC4811q)) {
                    return -1;
                }
            } else if (!m(interfaceC4811q)) {
                return -1;
            }
        }
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
