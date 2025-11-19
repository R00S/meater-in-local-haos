package androidx.media3.exoplayer.source;

import U1.C1726b;
import U1.G;
import androidx.media3.exoplayer.source.r;

/* compiled from: MaskingMediaSource.java */
/* loaded from: classes.dex */
public final class p extends L {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f27799m;

    /* renamed from: n, reason: collision with root package name */
    private final G.c f27800n;

    /* renamed from: o, reason: collision with root package name */
    private final G.b f27801o;

    /* renamed from: p, reason: collision with root package name */
    private a f27802p;

    /* renamed from: q, reason: collision with root package name */
    private o f27803q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27804r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27805s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27806t;

    /* compiled from: MaskingMediaSource.java */
    private static final class a extends m {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f27807h = new Object();

        /* renamed from: f, reason: collision with root package name */
        private final Object f27808f;

        /* renamed from: g, reason: collision with root package name */
        private final Object f27809g;

        private a(U1.G g10, Object obj, Object obj2) {
            super(g10);
            this.f27808f = obj;
            this.f27809g = obj2;
        }

        public static a u(U1.v vVar) {
            return new a(new b(vVar), G.c.f16834q, f27807h);
        }

        public static a v(U1.G g10, Object obj, Object obj2) {
            return new a(g10, obj, obj2);
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public int b(Object obj) {
            Object obj2;
            U1.G g10 = this.f27784e;
            if (f27807h.equals(obj) && (obj2 = this.f27809g) != null) {
                obj = obj2;
            }
            return g10.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            this.f27784e.g(i10, bVar, z10);
            if (X1.L.d(bVar.f16822b, this.f27809g) && z10) {
                bVar.f16822b = f27807h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public Object m(int i10) {
            Object objM = this.f27784e.m(i10);
            return X1.L.d(objM, this.f27809g) ? f27807h : objM;
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.c o(int i10, G.c cVar, long j10) {
            this.f27784e.o(i10, cVar, j10);
            if (X1.L.d(cVar.f16844a, this.f27808f)) {
                cVar.f16844a = G.c.f16834q;
            }
            return cVar;
        }

        public a t(U1.G g10) {
            return new a(g10, this.f27808f, this.f27809g);
        }
    }

    /* compiled from: MaskingMediaSource.java */
    public static final class b extends U1.G {

        /* renamed from: e, reason: collision with root package name */
        private final U1.v f27810e;

        public b(U1.v vVar) {
            this.f27810e = vVar;
        }

        @Override // U1.G
        public int b(Object obj) {
            return obj == a.f27807h ? 0 : -1;
        }

        @Override // U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            bVar.t(z10 ? 0 : null, z10 ? a.f27807h : null, 0, -9223372036854775807L, 0L, C1726b.f16996g, true);
            return bVar;
        }

        @Override // U1.G
        public int i() {
            return 1;
        }

        @Override // U1.G
        public Object m(int i10) {
            return a.f27807h;
        }

        @Override // U1.G
        public G.c o(int i10, G.c cVar, long j10) {
            cVar.g(G.c.f16834q, this.f27810e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f16854k = true;
            return cVar;
        }

        @Override // U1.G
        public int p() {
            return 1;
        }
    }

    public p(r rVar, boolean z10) {
        super(rVar);
        this.f27799m = z10 && rVar.k();
        this.f27800n = new G.c();
        this.f27801o = new G.b();
        U1.G gL = rVar.l();
        if (gL == null) {
            this.f27802p = a.u(rVar.h());
        } else {
            this.f27802p = a.v(gL, null, null);
            this.f27806t = true;
        }
    }

    private Object T(Object obj) {
        return (this.f27802p.f27809g == null || !this.f27802p.f27809g.equals(obj)) ? obj : a.f27807h;
    }

    private Object U(Object obj) {
        return (this.f27802p.f27809g == null || !obj.equals(a.f27807h)) ? obj : this.f27802p.f27809g;
    }

    private boolean W(long j10) {
        o oVar = this.f27803q;
        int iB = this.f27802p.b(oVar.f27790B.f27812a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f27802p.f(iB, this.f27801o).f16824d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.t(j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.AbstractC2137a
    public void A() {
        this.f27805s = false;
        this.f27804r = false;
        super.A();
    }

    @Override // androidx.media3.exoplayer.source.L
    protected r.b I(r.b bVar) {
        return bVar.a(T(bVar.f27812a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void O(U1.G r15) {
        /*
            r14 = this;
            boolean r0 = r14.f27805s
            if (r0 == 0) goto L19
            androidx.media3.exoplayer.source.p$a r0 = r14.f27802p
            androidx.media3.exoplayer.source.p$a r15 = r0.t(r15)
            r14.f27802p = r15
            androidx.media3.exoplayer.source.o r15 = r14.f27803q
            if (r15 == 0) goto Lb1
            long r0 = r15.k()
            r14.W(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.f27806t
            if (r0 == 0) goto L2a
            androidx.media3.exoplayer.source.p$a r0 = r14.f27802p
            androidx.media3.exoplayer.source.p$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = U1.G.c.f16834q
            java.lang.Object r1 = androidx.media3.exoplayer.source.p.a.f27807h
            androidx.media3.exoplayer.source.p$a r15 = androidx.media3.exoplayer.source.p.a.v(r15, r0, r1)
        L32:
            r14.f27802p = r15
            goto Lb1
        L36:
            U1.G$c r0 = r14.f27800n
            r1 = 0
            r15.n(r1, r0)
            U1.G$c r0 = r14.f27800n
            long r2 = r0.c()
            U1.G$c r0 = r14.f27800n
            java.lang.Object r0 = r0.f16844a
            androidx.media3.exoplayer.source.o r4 = r14.f27803q
            if (r4 == 0) goto L74
            long r4 = r4.n()
            androidx.media3.exoplayer.source.p$a r6 = r14.f27802p
            androidx.media3.exoplayer.source.o r7 = r14.f27803q
            androidx.media3.exoplayer.source.r$b r7 = r7.f27790B
            java.lang.Object r7 = r7.f27812a
            U1.G$b r8 = r14.f27801o
            r6.h(r7, r8)
            U1.G$b r6 = r14.f27801o
            long r6 = r6.n()
            long r6 = r6 + r4
            androidx.media3.exoplayer.source.p$a r4 = r14.f27802p
            U1.G$c r5 = r14.f27800n
            U1.G$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            U1.G$c r9 = r14.f27800n
            U1.G$b r10 = r14.f27801o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f27806t
            if (r1 == 0) goto L94
            androidx.media3.exoplayer.source.p$a r0 = r14.f27802p
            androidx.media3.exoplayer.source.p$a r15 = r0.t(r15)
            goto L98
        L94:
            androidx.media3.exoplayer.source.p$a r15 = androidx.media3.exoplayer.source.p.a.v(r15, r0, r2)
        L98:
            r14.f27802p = r15
            androidx.media3.exoplayer.source.o r15 = r14.f27803q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.W(r3)
            if (r0 == 0) goto Lb1
            androidx.media3.exoplayer.source.r$b r15 = r15.f27790B
            java.lang.Object r0 = r15.f27812a
            java.lang.Object r0 = r14.U(r0)
            androidx.media3.exoplayer.source.r$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.f27806t = r0
            r14.f27805s = r0
            androidx.media3.exoplayer.source.p$a r0 = r14.f27802p
            r14.z(r0)
            if (r15 == 0) goto Lc9
            androidx.media3.exoplayer.source.o r0 = r14.f27803q
            java.lang.Object r0 = X1.C1804a.e(r0)
            androidx.media3.exoplayer.source.o r0 = (androidx.media3.exoplayer.source.o) r0
            r0.a(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.p.O(U1.G):void");
    }

    @Override // androidx.media3.exoplayer.source.L
    public void R() {
        if (this.f27799m) {
            return;
        }
        this.f27804r = true;
        Q();
    }

    @Override // androidx.media3.exoplayer.source.r
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public o a(r.b bVar, r2.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.w(this.f27689k);
        if (this.f27805s) {
            oVar.a(bVar.a(U(bVar.f27812a)));
        } else {
            this.f27803q = oVar;
            if (!this.f27804r) {
                this.f27804r = true;
                Q();
            }
        }
        return oVar;
    }

    public U1.G V() {
        return this.f27802p;
    }

    @Override // androidx.media3.exoplayer.source.L, androidx.media3.exoplayer.source.r
    public void j(U1.v vVar) {
        if (this.f27806t) {
            this.f27802p = this.f27802p.t(new n2.v(this.f27802p.f27784e, vVar));
        } else {
            this.f27802p = a.u(vVar);
        }
        this.f27689k.j(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        ((o) qVar).v();
        if (qVar == this.f27803q) {
            this.f27803q = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.r
    public void i() {
    }
}
