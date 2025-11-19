package androidx.media3.exoplayer.source;

import U1.G;
import X1.C1804a;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ClippingMediaSource extends L {

    /* renamed from: m, reason: collision with root package name */
    private final long f27580m;

    /* renamed from: n, reason: collision with root package name */
    private final long f27581n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f27582o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f27583p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f27584q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList<C2138b> f27585r;

    /* renamed from: s, reason: collision with root package name */
    private final G.c f27586s;

    /* renamed from: t, reason: collision with root package name */
    private a f27587t;

    /* renamed from: u, reason: collision with root package name */
    private IllegalClippingException f27588u;

    /* renamed from: v, reason: collision with root package name */
    private long f27589v;

    /* renamed from: w, reason: collision with root package name */
    private long f27590w;

    public static final class IllegalClippingException extends IOException {

        /* renamed from: B, reason: collision with root package name */
        public final int f27591B;

        public IllegalClippingException(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            C1804a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public IllegalClippingException(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f27591B = i10;
        }
    }

    private static final class a extends m {

        /* renamed from: f, reason: collision with root package name */
        private final long f27592f;

        /* renamed from: g, reason: collision with root package name */
        private final long f27593g;

        /* renamed from: h, reason: collision with root package name */
        private final long f27594h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f27595i;

        public a(U1.G g10, long j10, long j11) throws IllegalClippingException {
            super(g10);
            boolean z10 = false;
            if (g10.i() != 1) {
                throw new IllegalClippingException(0);
            }
            G.c cVarN = g10.n(0, new G.c());
            long jMax = Math.max(0L, j10);
            if (!cVarN.f16854k && jMax != 0 && !cVarN.f16851h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarN.f16856m : Math.max(0L, j11);
            long j12 = cVarN.f16856m;
            if (j12 != -9223372036854775807L) {
                long j13 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > j13) {
                    throw new IllegalClippingException(2, jMax, j13);
                }
                jMax2 = j13;
            }
            this.f27592f = jMax;
            this.f27593g = jMax2;
            this.f27594h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f16852i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z10 = true;
            }
            this.f27595i = z10;
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            this.f27784e.g(0, bVar, z10);
            long jN = bVar.n() - this.f27592f;
            long j10 = this.f27594h;
            return bVar.s(bVar.f16821a, bVar.f16822b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - jN, jN);
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.c o(int i10, G.c cVar, long j10) {
            this.f27784e.o(0, cVar, 0L);
            long j11 = cVar.f16859p;
            long j12 = this.f27592f;
            cVar.f16859p = j11 + j12;
            cVar.f16856m = this.f27594h;
            cVar.f16852i = this.f27595i;
            long j13 = cVar.f16855l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f16855l = jMax;
                long j14 = this.f27593g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f16855l = jMax - this.f27592f;
            }
            long jU1 = X1.L.u1(this.f27592f);
            long j15 = cVar.f16848e;
            if (j15 != -9223372036854775807L) {
                cVar.f16848e = j15 + jU1;
            }
            long j16 = cVar.f16849f;
            if (j16 != -9223372036854775807L) {
                cVar.f16849f = j16 + jU1;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(r rVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((r) C1804a.e(rVar));
        C1804a.a(j10 >= 0);
        this.f27580m = j10;
        this.f27581n = j11;
        this.f27582o = z10;
        this.f27583p = z11;
        this.f27584q = z12;
        this.f27585r = new ArrayList<>();
        this.f27586s = new G.c();
    }

    private void S(U1.G g10) {
        long j10;
        long j11;
        g10.n(0, this.f27586s);
        long jE = this.f27586s.e();
        if (this.f27587t == null || this.f27585r.isEmpty() || this.f27583p) {
            long j12 = this.f27580m;
            long j13 = this.f27581n;
            if (this.f27584q) {
                long jC = this.f27586s.c();
                j12 += jC;
                j13 += jC;
            }
            this.f27589v = jE + j12;
            this.f27590w = this.f27581n != Long.MIN_VALUE ? jE + j13 : Long.MIN_VALUE;
            int size = this.f27585r.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f27585r.get(i10).t(this.f27589v, this.f27590w);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f27589v - jE;
            j11 = this.f27581n != Long.MIN_VALUE ? this.f27590w - jE : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(g10, j10, j11);
            this.f27587t = aVar;
            z(aVar);
        } catch (IllegalClippingException e10) {
            this.f27588u = e10;
            for (int i11 = 0; i11 < this.f27585r.size(); i11++) {
                this.f27585r.get(i11).o(this.f27588u);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
        super.A();
        this.f27588u = null;
        this.f27587t = null;
    }

    @Override // androidx.media3.exoplayer.source.L
    protected void O(U1.G g10) {
        if (this.f27588u != null) {
            return;
        }
        S(g10);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        C2138b c2138b = new C2138b(this.f27689k.a(bVar, bVar2, j10), this.f27582o, this.f27589v, this.f27590w);
        this.f27585r.add(c2138b);
        return c2138b;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2139c, androidx.media3.exoplayer.source.r
    public void i() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f27588u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.i();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        C1804a.g(this.f27585r.remove(qVar));
        this.f27689k.p(((C2138b) qVar).f27717B);
        if (!this.f27585r.isEmpty() || this.f27583p) {
            return;
        }
        S(((a) C1804a.e(this.f27587t)).f27784e);
    }
}
