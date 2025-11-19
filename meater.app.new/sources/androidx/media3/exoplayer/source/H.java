package androidx.media3.exoplayer.source;

import X1.C1804a;
import androidx.media3.datasource.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d2.C3025C;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes.dex */
final class H implements q, Loader.b<c> {

    /* renamed from: B, reason: collision with root package name */
    private final a2.g f27645B;

    /* renamed from: C, reason: collision with root package name */
    private final a.InterfaceC0371a f27646C;

    /* renamed from: D, reason: collision with root package name */
    private final a2.n f27647D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27648E;

    /* renamed from: F, reason: collision with root package name */
    private final s.a f27649F;

    /* renamed from: G, reason: collision with root package name */
    private final n2.x f27650G;

    /* renamed from: I, reason: collision with root package name */
    private final long f27652I;

    /* renamed from: K, reason: collision with root package name */
    final U1.s f27654K;

    /* renamed from: L, reason: collision with root package name */
    final boolean f27655L;

    /* renamed from: M, reason: collision with root package name */
    boolean f27656M;

    /* renamed from: N, reason: collision with root package name */
    byte[] f27657N;

    /* renamed from: O, reason: collision with root package name */
    int f27658O;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList<b> f27651H = new ArrayList<>();

    /* renamed from: J, reason: collision with root package name */
    final Loader f27653J = new Loader("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    private final class b implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        private int f27659B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f27660C;

        private b() {
        }

        private void b() {
            if (this.f27660C) {
                return;
            }
            H.this.f27649F.j(U1.z.k(H.this.f27654K.f17162o), H.this.f27654K, 0, null, 0L);
            this.f27660C = true;
        }

        @Override // n2.s
        public void a() throws IOException {
            H h10 = H.this;
            if (h10.f27655L) {
                return;
            }
            h10.f27653J.a();
        }

        public void c() {
            if (this.f27659B == 2) {
                this.f27659B = 1;
            }
        }

        @Override // n2.s
        public boolean f() {
            return H.this.f27656M;
        }

        @Override // n2.s
        public int n(long j10) {
            b();
            if (j10 <= 0 || this.f27659B == 2) {
                return 0;
            }
            this.f27659B = 2;
            return 1;
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            b();
            H h10 = H.this;
            boolean z10 = h10.f27656M;
            if (z10 && h10.f27657N == null) {
                this.f27659B = 2;
            }
            int i11 = this.f27659B;
            if (i11 == 2) {
                decoderInputBuffer.s(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c3025c.f39668b = h10.f27654K;
                this.f27659B = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            C1804a.e(h10.f27657N);
            decoderInputBuffer.s(1);
            decoderInputBuffer.f26295G = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.D(H.this.f27658O);
                ByteBuffer byteBuffer = decoderInputBuffer.f26293E;
                H h11 = H.this;
                byteBuffer.put(h11.f27657N, 0, h11.f27658O);
            }
            if ((i10 & 1) == 0) {
                this.f27659B = 2;
            }
            return -4;
        }
    }

    public H(a2.g gVar, a.InterfaceC0371a interfaceC0371a, a2.n nVar, U1.s sVar, long j10, androidx.media3.exoplayer.upstream.b bVar, s.a aVar, boolean z10) {
        this.f27645B = gVar;
        this.f27646C = interfaceC0371a;
        this.f27647D = nVar;
        this.f27654K = sVar;
        this.f27652I = j10;
        this.f27648E = bVar;
        this.f27649F = aVar;
        this.f27655L = z10;
        this.f27650G = new n2.x(new U1.H(sVar));
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        if (this.f27656M || this.f27653J.j() || this.f27653J.i()) {
            return false;
        }
        androidx.media3.datasource.a aVarA = this.f27646C.a();
        a2.n nVar = this.f27647D;
        if (nVar != null) {
            aVarA.g(nVar);
        }
        c cVar = new c(this.f27645B, aVarA);
        this.f27649F.C(new n2.i(cVar.f27662a, this.f27645B, this.f27653J.n(cVar, this, this.f27648E.c(1))), 1, -1, this.f27654K, 0, null, 0L, this.f27652I);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return (this.f27656M || this.f27653J.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f27653J.j();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void v(c cVar, long j10, long j11, boolean z10) {
        a2.l lVar = cVar.f27664c;
        n2.i iVar = new n2.i(cVar.f27662a, cVar.f27663b, lVar.r(), lVar.s(), j10, j11, lVar.q());
        this.f27648E.b(cVar.f27662a);
        this.f27649F.t(iVar, 1, -1, null, 0, null, 0L, this.f27652I);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        return this.f27656M ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void t(c cVar, long j10, long j11) {
        this.f27658O = (int) cVar.f27664c.q();
        this.f27657N = (byte[]) C1804a.e(cVar.f27665d);
        this.f27656M = true;
        a2.l lVar = cVar.f27664c;
        n2.i iVar = new n2.i(cVar.f27662a, cVar.f27663b, lVar.r(), lVar.s(), j10, j11, this.f27658O);
        this.f27648E.b(cVar.f27662a);
        this.f27649F.w(iVar, 1, -1, this.f27654K, 0, null, 0L, this.f27652I);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            n2.s sVar = sVarArr[i10];
            if (sVar != null && (xVarArr[i10] == null || !zArr[i10])) {
                this.f27651H.remove(sVar);
                sVarArr[i10] = null;
            }
            if (sVarArr[i10] == null && xVarArr[i10] != null) {
                b bVar = new b();
                this.f27651H.add(bVar);
                sVarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        for (int i10 = 0; i10 < this.f27651H.size(); i10++) {
            this.f27651H.get(i10).c();
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Loader.c k(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        a2.l lVar = cVar.f27664c;
        n2.i iVar = new n2.i(cVar.f27662a, cVar.f27663b, lVar.r(), lVar.s(), j10, j11, lVar.q());
        long jA = this.f27648E.a(new b.c(iVar, new n2.j(1, -1, this.f27654K, 0, null, 0L, X1.L.u1(this.f27652I)), iOException, i10));
        boolean z10 = jA == -9223372036854775807L || i10 >= this.f27648E.c(1);
        if (this.f27655L && z10) {
            X1.n.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f27656M = true;
            cVarH = Loader.f27841f;
        } else {
            cVarH = jA != -9223372036854775807L ? Loader.h(false, jA) : Loader.f27842g;
        }
        Loader.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f27649F.y(iVar, 1, -1, this.f27654K, 0, null, 0L, this.f27652I, iOException, !zC);
        if (!zC) {
            this.f27648E.b(cVar.f27662a);
        }
        return cVar2;
    }

    public void p() {
        this.f27653J.l();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        aVar.f(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return this.f27650G;
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    static final class c implements Loader.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f27662a = n2.i.a();

        /* renamed from: b, reason: collision with root package name */
        public final a2.g f27663b;

        /* renamed from: c, reason: collision with root package name */
        private final a2.l f27664c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f27665d;

        public c(a2.g gVar, androidx.media3.datasource.a aVar) {
            this.f27663b = gVar;
            this.f27664c = new a2.l(aVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void a() {
            this.f27664c.t();
            try {
                this.f27664c.c(this.f27663b);
                int iE = 0;
                while (iE != -1) {
                    int iQ = (int) this.f27664c.q();
                    byte[] bArr = this.f27665d;
                    if (bArr == null) {
                        this.f27665d = new byte[1024];
                    } else if (iQ == bArr.length) {
                        this.f27665d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    a2.l lVar = this.f27664c;
                    byte[] bArr2 = this.f27665d;
                    iE = lVar.e(bArr2, iQ, bArr2.length - iQ);
                }
                a2.f.a(this.f27664c);
            } catch (Throwable th) {
                a2.f.a(this.f27664c);
                throw th;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }
}
