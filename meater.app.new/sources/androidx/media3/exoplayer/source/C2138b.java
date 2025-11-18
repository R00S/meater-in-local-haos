package androidx.media3.exoplayer.source;

import X1.C1804a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.q;
import d2.C3025C;

/* compiled from: ClippingMediaPeriod.java */
/* renamed from: androidx.media3.exoplayer.source.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138b implements q, q.a {

    /* renamed from: B, reason: collision with root package name */
    public final q f27717B;

    /* renamed from: C, reason: collision with root package name */
    private q.a f27718C;

    /* renamed from: D, reason: collision with root package name */
    private a[] f27719D = new a[0];

    /* renamed from: E, reason: collision with root package name */
    private long f27720E;

    /* renamed from: F, reason: collision with root package name */
    long f27721F;

    /* renamed from: G, reason: collision with root package name */
    long f27722G;

    /* renamed from: H, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f27723H;

    /* compiled from: ClippingMediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.b$a */
    private final class a implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        public final n2.s f27724B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f27725C;

        public a(n2.s sVar) {
            this.f27724B = sVar;
        }

        @Override // n2.s
        public void a() {
            this.f27724B.a();
        }

        public void b() {
            this.f27725C = false;
        }

        @Override // n2.s
        public boolean f() {
            return !C2138b.this.k() && this.f27724B.f();
        }

        @Override // n2.s
        public int n(long j10) {
            if (C2138b.this.k()) {
                return -3;
            }
            return this.f27724B.n(j10);
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (C2138b.this.k()) {
                return -3;
            }
            if (this.f27725C) {
                decoderInputBuffer.B(4);
                return -4;
            }
            long jG = C2138b.this.g();
            int iP = this.f27724B.p(c3025c, decoderInputBuffer, i10);
            if (iP == -5) {
                U1.s sVar = (U1.s) C1804a.e(c3025c.f39668b);
                int i11 = sVar.f17140G;
                if (i11 != 0 || sVar.f17141H != 0) {
                    C2138b c2138b = C2138b.this;
                    if (c2138b.f27721F != 0) {
                        i11 = 0;
                    }
                    c3025c.f39668b = sVar.b().Y(i11).Z(c2138b.f27722G == Long.MIN_VALUE ? sVar.f17141H : 0).M();
                }
                return -5;
            }
            long j10 = C2138b.this.f27722G;
            if (j10 == Long.MIN_VALUE || ((iP != -4 || decoderInputBuffer.f26295G < j10) && !(iP == -3 && jG == Long.MIN_VALUE && !decoderInputBuffer.f26294F))) {
                return iP;
            }
            decoderInputBuffer.t();
            decoderInputBuffer.B(4);
            this.f27725C = true;
            return -4;
        }
    }

    public C2138b(q qVar, boolean z10, long j10, long j11) {
        this.f27717B = qVar;
        this.f27720E = z10 ? j10 : -9223372036854775807L;
        this.f27721F = j10;
        this.f27722G = j11;
    }

    private d2.I a(long j10, d2.I i10) {
        long jQ = X1.L.q(i10.f39681a, 0L, j10 - this.f27721F);
        long j11 = i10.f39682b;
        long j12 = this.f27722G;
        long jQ2 = X1.L.q(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jQ == i10.f39681a && jQ2 == i10.f39682b) ? i10 : new d2.I(jQ, jQ2);
    }

    private static boolean p(long j10, q2.x[] xVarArr) {
        if (j10 != 0) {
            for (q2.x xVar : xVarArr) {
                if (xVar != null) {
                    U1.s sVarN = xVar.n();
                    if (!U1.z.a(sVarN.f17162o, sVarN.f17158k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        return this.f27717B.b(w10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        long jC = this.f27717B.c();
        if (jC != Long.MIN_VALUE) {
            long j10 = this.f27722G;
            if (j10 == Long.MIN_VALUE || jC < j10) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        long j11 = this.f27721F;
        if (j10 == j11) {
            return j11;
        }
        return this.f27717B.d(j10, a(j10, i10));
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f27717B.e();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        if (this.f27723H != null) {
            return;
        }
        ((q.a) C1804a.e(this.f27718C)).f(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        long jG = this.f27717B.g();
        if (jG != Long.MIN_VALUE) {
            long j10 = this.f27722G;
            if (j10 == Long.MIN_VALUE || jG < j10) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
        this.f27717B.h(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // androidx.media3.exoplayer.source.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(q2.x[] r13, boolean[] r14, n2.s[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            androidx.media3.exoplayer.source.b$a[] r2 = new androidx.media3.exoplayer.source.C2138b.a[r2]
            r0.f27719D = r2
            int r2 = r1.length
            n2.s[] r9 = new n2.s[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            androidx.media3.exoplayer.source.b$a[] r3 = r0.f27719D
            r4 = r1[r2]
            androidx.media3.exoplayer.source.b$a r4 = (androidx.media3.exoplayer.source.C2138b.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            n2.s r11 = r4.f27724B
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            androidx.media3.exoplayer.source.q r2 = r0.f27717B
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.j(r3, r4, r5, r6, r7)
            boolean r4 = r12.k()
            if (r4 == 0) goto L43
            long r4 = r0.f27721F
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = p(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f27720E = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f27721F
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f27722G
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            X1.C1804a.g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            androidx.media3.exoplayer.source.b$a[] r4 = r0.f27719D
            r4[r10] = r11
            goto L84
        L73:
            androidx.media3.exoplayer.source.b$a[] r5 = r0.f27719D
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            n2.s r6 = r6.f27724B
            if (r6 == r4) goto L84
        L7d:
            androidx.media3.exoplayer.source.b$a r6 = new androidx.media3.exoplayer.source.b$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            androidx.media3.exoplayer.source.b$a[] r4 = r0.f27719D
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C2138b.j(q2.x[], boolean[], n2.s[], boolean[], long):long");
    }

    boolean k() {
        return this.f27720E != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f27723H;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f27717B.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // androidx.media3.exoplayer.source.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f27720E = r0
            androidx.media3.exoplayer.source.b$a[] r0 = r5.f27719D
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            androidx.media3.exoplayer.source.q r0 = r5.f27717B
            long r0 = r0.m(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f27721F
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f27722G
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            X1.C1804a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C2138b.m(long):long");
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(q qVar) {
        ((q.a) C1804a.e(this.f27718C)).i(this);
    }

    public void o(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f27723H = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        if (k()) {
            long j10 = this.f27720E;
            this.f27720E = -9223372036854775807L;
            long jQ = q();
            return jQ != -9223372036854775807L ? jQ : j10;
        }
        long jQ2 = this.f27717B.q();
        if (jQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        C1804a.g(jQ2 >= this.f27721F);
        long j11 = this.f27722G;
        C1804a.g(j11 == Long.MIN_VALUE || jQ2 <= j11);
        return jQ2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f27718C = aVar;
        this.f27717B.r(this, j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return this.f27717B.s();
    }

    public void t(long j10, long j11) {
        this.f27721F = j10;
        this.f27722G = j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f27717B.u(j10, z10);
    }
}
