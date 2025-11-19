package androidx.media3.exoplayer.source;

import U1.InterfaceC1734j;
import U1.s;
import X1.C1804a;
import X1.C1810g;
import a2.g;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.F;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d2.C3025C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s2.InterfaceExecutorC4472a;
import v2.C4794A;
import v2.C4807m;
import v2.J;
import v2.O;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes.dex */
final class B implements q, v2.r, Loader.b<b>, Loader.f, F.d {

    /* renamed from: r0, reason: collision with root package name */
    private static final Map<String, String> f27492r0 = N();

    /* renamed from: s0, reason: collision with root package name */
    private static final U1.s f27493s0 = new s.b().e0("icy").s0("application/x-icy").M();

    /* renamed from: B, reason: collision with root package name */
    private final Uri f27494B;

    /* renamed from: C, reason: collision with root package name */
    private final androidx.media3.datasource.a f27495C;

    /* renamed from: D, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f27496D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27497E;

    /* renamed from: F, reason: collision with root package name */
    private final s.a f27498F;

    /* renamed from: G, reason: collision with root package name */
    private final h.a f27499G;

    /* renamed from: H, reason: collision with root package name */
    private final c f27500H;

    /* renamed from: I, reason: collision with root package name */
    private final r2.b f27501I;

    /* renamed from: J, reason: collision with root package name */
    private final String f27502J;

    /* renamed from: K, reason: collision with root package name */
    private final long f27503K;

    /* renamed from: L, reason: collision with root package name */
    private final boolean f27504L;

    /* renamed from: M, reason: collision with root package name */
    private final long f27505M;

    /* renamed from: N, reason: collision with root package name */
    private final Loader f27506N;

    /* renamed from: O, reason: collision with root package name */
    private final w f27507O;

    /* renamed from: P, reason: collision with root package name */
    private final C1810g f27508P;

    /* renamed from: Q, reason: collision with root package name */
    private final Runnable f27509Q;

    /* renamed from: R, reason: collision with root package name */
    private final Runnable f27510R;

    /* renamed from: S, reason: collision with root package name */
    private final Handler f27511S;

    /* renamed from: T, reason: collision with root package name */
    private q.a f27512T;

    /* renamed from: U, reason: collision with root package name */
    private I2.b f27513U;

    /* renamed from: V, reason: collision with root package name */
    private F[] f27514V;

    /* renamed from: W, reason: collision with root package name */
    private e[] f27515W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f27516X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f27517Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f27518Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f27519a0;

    /* renamed from: b0, reason: collision with root package name */
    private f f27520b0;

    /* renamed from: c0, reason: collision with root package name */
    private v2.J f27521c0;

    /* renamed from: d0, reason: collision with root package name */
    private long f27522d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f27523e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f27524f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f27525g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f27526h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f27527i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f27528j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f27529k0;

    /* renamed from: l0, reason: collision with root package name */
    private long f27530l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f27531m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f27532n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f27533o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f27534p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f27535q0;

    /* compiled from: ProgressiveMediaPeriod.java */
    class a extends C4794A {
        a(v2.J j10) {
            super(j10);
        }

        @Override // v2.C4794A, v2.J
        public long m() {
            return B.this.f27522d0;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    final class b implements Loader.e, n.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f27538b;

        /* renamed from: c, reason: collision with root package name */
        private final a2.l f27539c;

        /* renamed from: d, reason: collision with root package name */
        private final w f27540d;

        /* renamed from: e, reason: collision with root package name */
        private final v2.r f27541e;

        /* renamed from: f, reason: collision with root package name */
        private final C1810g f27542f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f27544h;

        /* renamed from: j, reason: collision with root package name */
        private long f27546j;

        /* renamed from: l, reason: collision with root package name */
        private O f27548l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f27549m;

        /* renamed from: g, reason: collision with root package name */
        private final v2.I f27543g = new v2.I();

        /* renamed from: i, reason: collision with root package name */
        private boolean f27545i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f27537a = n2.i.a();

        /* renamed from: k, reason: collision with root package name */
        private a2.g f27547k = i(0);

        public b(Uri uri, androidx.media3.datasource.a aVar, w wVar, v2.r rVar, C1810g c1810g) {
            this.f27538b = uri;
            this.f27539c = new a2.l(aVar);
            this.f27540d = wVar;
            this.f27541e = rVar;
            this.f27542f = c1810g;
        }

        private a2.g i(long j10) {
            return new g.b().i(this.f27538b).h(j10).f(B.this.f27502J).b(6).e(B.f27492r0).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f27543g.f51048a = j10;
            this.f27546j = j11;
            this.f27545i = true;
            this.f27549m = false;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void a() {
            int iD = 0;
            while (iD == 0 && !this.f27544h) {
                try {
                    long j10 = this.f27543g.f51048a;
                    a2.g gVarI = i(j10);
                    this.f27547k = gVarI;
                    long jC = this.f27539c.c(gVarI);
                    if (this.f27544h) {
                        if (iD != 1 && this.f27540d.e() != -1) {
                            this.f27543g.f51048a = this.f27540d.e();
                        }
                        a2.f.a(this.f27539c);
                        return;
                    }
                    if (jC != -1) {
                        jC += j10;
                        B.this.b0();
                    }
                    long j11 = jC;
                    B.this.f27513U = I2.b.a(this.f27539c.l());
                    InterfaceC1734j nVar = this.f27539c;
                    if (B.this.f27513U != null && B.this.f27513U.f6663G != -1) {
                        nVar = new n(this.f27539c, B.this.f27513U.f6663G, this);
                        O oQ = B.this.Q();
                        this.f27548l = oQ;
                        oQ.f(B.f27493s0);
                    }
                    long jE = j10;
                    this.f27540d.g(nVar, this.f27538b, this.f27539c.l(), j10, j11, this.f27541e);
                    if (B.this.f27513U != null) {
                        this.f27540d.f();
                    }
                    if (this.f27545i) {
                        this.f27540d.b(jE, this.f27546j);
                        this.f27545i = false;
                    }
                    while (true) {
                        long j12 = jE;
                        while (iD == 0 && !this.f27544h) {
                            try {
                                this.f27542f.a();
                                iD = this.f27540d.d(this.f27543g);
                                jE = this.f27540d.e();
                                if (jE > B.this.f27503K + j12) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f27542f.c();
                        B.this.f27511S.post(B.this.f27510R);
                    }
                    if (iD == 1) {
                        iD = 0;
                    } else if (this.f27540d.e() != -1) {
                        this.f27543g.f51048a = this.f27540d.e();
                    }
                    a2.f.a(this.f27539c);
                } catch (Throwable th) {
                    if (iD != 1 && this.f27540d.e() != -1) {
                        this.f27543g.f51048a = this.f27540d.e();
                    }
                    a2.f.a(this.f27539c);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
            this.f27544h = true;
        }

        @Override // androidx.media3.exoplayer.source.n.a
        public void c(X1.y yVar) {
            long jMax = !this.f27549m ? this.f27546j : Math.max(B.this.P(true), this.f27546j);
            int iA = yVar.a();
            O o10 = (O) C1804a.e(this.f27548l);
            o10.d(yVar, iA);
            o10.e(jMax, 1, iA, 0, null);
            this.f27549m = true;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    interface c {
        void g(long j10, boolean z10, boolean z11);
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    private final class d implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        private final int f27551B;

        public d(int i10) {
            this.f27551B = i10;
        }

        @Override // n2.s
        public void a() throws IOException {
            B.this.a0(this.f27551B);
        }

        @Override // n2.s
        public boolean f() {
            return B.this.S(this.f27551B);
        }

        @Override // n2.s
        public int n(long j10) {
            return B.this.k0(this.f27551B, j10);
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            return B.this.g0(this.f27551B, c3025c, decoderInputBuffer, i10);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f27553a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27554b;

        public e(int i10, boolean z10) {
            this.f27553a = i10;
            this.f27554b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f27553a == eVar.f27553a && this.f27554b == eVar.f27554b;
        }

        public int hashCode() {
            return (this.f27553a * 31) + (this.f27554b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final n2.x f27555a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f27556b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f27557c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f27558d;

        public f(n2.x xVar, boolean[] zArr) {
            this.f27555a = xVar;
            this.f27556b = zArr;
            int i10 = xVar.f45677a;
            this.f27557c = new boolean[i10];
            this.f27558d = new boolean[i10];
        }
    }

    public B(Uri uri, androidx.media3.datasource.a aVar, w wVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar2, androidx.media3.exoplayer.upstream.b bVar, s.a aVar3, c cVar, r2.b bVar2, String str, int i10, boolean z10, long j10, InterfaceExecutorC4472a interfaceExecutorC4472a) {
        this.f27494B = uri;
        this.f27495C = aVar;
        this.f27496D = iVar;
        this.f27499G = aVar2;
        this.f27497E = bVar;
        this.f27498F = aVar3;
        this.f27500H = cVar;
        this.f27501I = bVar2;
        this.f27502J = str;
        this.f27503K = i10;
        this.f27504L = z10;
        this.f27506N = interfaceExecutorC4472a != null ? new Loader(interfaceExecutorC4472a) : new Loader("ProgressiveMediaPeriod");
        this.f27507O = wVar;
        this.f27505M = j10;
        this.f27508P = new C1810g();
        this.f27509Q = new Runnable() { // from class: androidx.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f27835B.W();
            }
        };
        this.f27510R = new Runnable() { // from class: androidx.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f27836B.T();
            }
        };
        this.f27511S = X1.L.A();
        this.f27515W = new e[0];
        this.f27514V = new F[0];
        this.f27531m0 = -9223372036854775807L;
        this.f27524f0 = 1;
    }

    private void L() {
        C1804a.g(this.f27517Y);
        C1804a.e(this.f27520b0);
        C1804a.e(this.f27521c0);
    }

    private boolean M(b bVar, int i10) {
        v2.J j10;
        if (this.f27529k0 || !((j10 = this.f27521c0) == null || j10.m() == -9223372036854775807L)) {
            this.f27533o0 = i10;
            return true;
        }
        if (this.f27517Y && !m0()) {
            this.f27532n0 = true;
            return false;
        }
        this.f27526h0 = this.f27517Y;
        this.f27530l0 = 0L;
        this.f27533o0 = 0;
        for (F f10 : this.f27514V) {
            f10.V();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int O() {
        int iH = 0;
        for (F f10 : this.f27514V) {
            iH += f10.H();
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f27514V.length; i10++) {
            if (z10 || ((f) C1804a.e(this.f27520b0)).f27557c[i10]) {
                jMax = Math.max(jMax, this.f27514V[i10].A());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.f27531m0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        if (this.f27535q0) {
            return;
        }
        ((q.a) C1804a.e(this.f27512T)).i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f27529k0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (this.f27535q0 || this.f27517Y || !this.f27516X || this.f27521c0 == null) {
            return;
        }
        for (F f10 : this.f27514V) {
            if (f10.G() == null) {
                return;
            }
        }
        this.f27508P.c();
        int length = this.f27514V.length;
        U1.H[] hArr = new U1.H[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            U1.s sVarM = (U1.s) C1804a.e(this.f27514V[i10].G());
            String str = sVarM.f17162o;
            boolean zO = U1.z.o(str);
            boolean z10 = zO || U1.z.s(str);
            zArr[i10] = z10;
            this.f27518Z = z10 | this.f27518Z;
            this.f27519a0 = this.f27505M != -9223372036854775807L && length == 1 && U1.z.p(str);
            I2.b bVar = this.f27513U;
            if (bVar != null) {
                if (zO || this.f27515W[i10].f27554b) {
                    U1.y yVar = sVarM.f17159l;
                    sVarM = sVarM.b().l0(yVar == null ? new U1.y(bVar) : yVar.a(bVar)).M();
                }
                if (zO && sVarM.f17155h == -1 && sVarM.f17156i == -1 && bVar.f6658B != -1) {
                    sVarM = sVarM.b().P(bVar.f6658B).M();
                }
            }
            U1.s sVarC = sVarM.c(this.f27496D.d(sVarM));
            hArr[i10] = new U1.H(Integer.toString(i10), sVarC);
            this.f27527i0 = sVarC.f17168u | this.f27527i0;
        }
        this.f27520b0 = new f(new n2.x(hArr), zArr);
        if (this.f27519a0 && this.f27522d0 == -9223372036854775807L) {
            this.f27522d0 = this.f27505M;
            this.f27521c0 = new a(this.f27521c0);
        }
        this.f27500H.g(this.f27522d0, this.f27521c0.g(), this.f27523e0);
        this.f27517Y = true;
        ((q.a) C1804a.e(this.f27512T)).f(this);
    }

    private void X(int i10) {
        L();
        f fVar = this.f27520b0;
        boolean[] zArr = fVar.f27558d;
        if (zArr[i10]) {
            return;
        }
        U1.s sVarA = fVar.f27555a.b(i10).a(0);
        this.f27498F.j(U1.z.k(sVarA.f17162o), sVarA, 0, null, this.f27530l0);
        zArr[i10] = true;
    }

    private void Y(int i10) {
        L();
        boolean[] zArr = this.f27520b0.f27556b;
        if (this.f27532n0 && zArr[i10]) {
            if (this.f27514V[i10].L(false)) {
                return;
            }
            this.f27531m0 = 0L;
            this.f27532n0 = false;
            this.f27526h0 = true;
            this.f27530l0 = 0L;
            this.f27533o0 = 0;
            for (F f10 : this.f27514V) {
                f10.V();
            }
            ((q.a) C1804a.e(this.f27512T)).i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.f27511S.post(new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f27834B.U();
            }
        });
    }

    private O f0(e eVar) {
        int length = this.f27514V.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f27515W[i10])) {
                return this.f27514V[i10];
            }
        }
        if (this.f27516X) {
            X1.n.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f27553a + ") after finishing tracks.");
            return new C4807m();
        }
        F fK = F.k(this.f27501I, this.f27496D, this.f27499G);
        fK.d0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f27515W, i11);
        eVarArr[length] = eVar;
        this.f27515W = (e[]) X1.L.j(eVarArr);
        F[] fArr = (F[]) Arrays.copyOf(this.f27514V, i11);
        fArr[length] = fK;
        this.f27514V = (F[]) X1.L.j(fArr);
        return fK;
    }

    private boolean i0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f27514V.length;
        for (int i10 = 0; i10 < length; i10++) {
            F f10 = this.f27514V[i10];
            if (f10.D() != 0 || !z10) {
                if (!(this.f27519a0 ? f10.Y(f10.y()) : f10.Z(j10, false)) && (zArr[i10] || !this.f27518Z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void V(v2.J j10) {
        this.f27521c0 = this.f27513U == null ? j10 : new J.b(-9223372036854775807L);
        this.f27522d0 = j10.m();
        boolean z10 = !this.f27529k0 && j10.m() == -9223372036854775807L;
        this.f27523e0 = z10;
        this.f27524f0 = z10 ? 7 : 1;
        if (this.f27517Y) {
            this.f27500H.g(this.f27522d0, j10.g(), this.f27523e0);
        } else {
            W();
        }
    }

    private void l0() {
        b bVar = new b(this.f27494B, this.f27495C, this.f27507O, this, this.f27508P);
        if (this.f27517Y) {
            C1804a.g(R());
            long j10 = this.f27522d0;
            if (j10 != -9223372036854775807L && this.f27531m0 > j10) {
                this.f27534p0 = true;
                this.f27531m0 = -9223372036854775807L;
                return;
            }
            bVar.j(((v2.J) C1804a.e(this.f27521c0)).k(this.f27531m0).f51049a.f51055b, this.f27531m0);
            for (F f10 : this.f27514V) {
                f10.b0(this.f27531m0);
            }
            this.f27531m0 = -9223372036854775807L;
        }
        this.f27533o0 = O();
        this.f27498F.C(new n2.i(bVar.f27537a, bVar.f27547k, this.f27506N.n(bVar, this, this.f27497E.c(this.f27524f0))), 1, -1, null, 0, null, bVar.f27546j, this.f27522d0);
    }

    private boolean m0() {
        return this.f27526h0 || R();
    }

    O Q() {
        return f0(new e(0, true));
    }

    boolean S(int i10) {
        return !m0() && this.f27514V[i10].L(this.f27534p0);
    }

    void Z() throws IOException {
        this.f27506N.k(this.f27497E.c(this.f27524f0));
    }

    @Override // v2.r
    public O a(int i10, int i11) {
        return f0(new e(i10, false));
    }

    void a0(int i10) throws IOException {
        this.f27514V[i10].O();
        Z();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        if (this.f27534p0 || this.f27506N.i() || this.f27532n0) {
            return false;
        }
        if (this.f27517Y && this.f27528j0 == 0) {
            return false;
        }
        boolean zE = this.f27508P.e();
        if (this.f27506N.j()) {
            return zE;
        }
        l0();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return g();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void v(b bVar, long j10, long j11, boolean z10) {
        a2.l lVar = bVar.f27539c;
        n2.i iVar = new n2.i(bVar.f27537a, bVar.f27547k, lVar.r(), lVar.s(), j10, j11, lVar.q());
        this.f27497E.b(bVar.f27537a);
        this.f27498F.t(iVar, 1, -1, null, 0, null, bVar.f27546j, this.f27522d0);
        if (z10) {
            return;
        }
        for (F f10 : this.f27514V) {
            f10.V();
        }
        if (this.f27528j0 > 0) {
            ((q.a) C1804a.e(this.f27512T)).i(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        L();
        if (!this.f27521c0.g()) {
            return 0L;
        }
        J.a aVarK = this.f27521c0.k(j10);
        return i10.a(j10, aVarK.f51049a.f51054a, aVarK.f51050b.f51054a);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void t(b bVar, long j10, long j11) {
        v2.J j12;
        if (this.f27522d0 == -9223372036854775807L && (j12 = this.f27521c0) != null) {
            boolean zG = j12.g();
            long jP = P(true);
            long j13 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f27522d0 = j13;
            this.f27500H.g(j13, zG, this.f27523e0);
        }
        a2.l lVar = bVar.f27539c;
        n2.i iVar = new n2.i(bVar.f27537a, bVar.f27547k, lVar.r(), lVar.s(), j10, j11, lVar.q());
        this.f27497E.b(bVar.f27537a);
        this.f27498F.w(iVar, 1, -1, null, 0, null, bVar.f27546j, this.f27522d0);
        this.f27534p0 = true;
        ((q.a) C1804a.e(this.f27512T)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f27506N.j() && this.f27508P.d();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public Loader.c k(b bVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        a2.l lVar = bVar.f27539c;
        n2.i iVar = new n2.i(bVar.f27537a, bVar.f27547k, lVar.r(), lVar.s(), j10, j11, lVar.q());
        long jA = this.f27497E.a(new b.c(iVar, new n2.j(1, -1, null, 0, null, X1.L.u1(bVar.f27546j), X1.L.u1(this.f27522d0)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarH = Loader.f27842g;
        } else {
            int iO = O();
            cVarH = M(bVar, iO) ? Loader.h(iO > this.f27533o0, jA) : Loader.f27841f;
        }
        boolean zC = cVarH.c();
        this.f27498F.y(iVar, 1, -1, null, 0, null, bVar.f27546j, this.f27522d0, iOException, !zC);
        if (!zC) {
            this.f27497E.b(bVar.f27537a);
        }
        return cVarH;
    }

    @Override // v2.r
    public void f(final v2.J j10) {
        this.f27511S.post(new Runnable() { // from class: androidx.media3.exoplayer.source.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f27490B.V(j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        long jP;
        L();
        if (this.f27534p0 || this.f27528j0 == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f27531m0;
        }
        if (this.f27518Z) {
            int length = this.f27514V.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f27520b0;
                if (fVar.f27556b[i10] && fVar.f27557c[i10] && !this.f27514V[i10].K()) {
                    jP = Math.min(jP, this.f27514V[i10].A());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        return jP == Long.MIN_VALUE ? this.f27530l0 : jP;
    }

    int g0(int i10, C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (m0()) {
            return -3;
        }
        X(i10);
        int iS = this.f27514V[i10].S(c3025c, decoderInputBuffer, i11, this.f27534p0);
        if (iS == -3) {
            Y(i10);
        }
        return iS;
    }

    public void h0() {
        if (this.f27517Y) {
            for (F f10 : this.f27514V) {
                f10.R();
            }
        }
        this.f27506N.m(this);
        this.f27511S.removeCallbacksAndMessages(null);
        this.f27512T = null;
        this.f27535q0 = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void i() {
        for (F f10 : this.f27514V) {
            f10.T();
        }
        this.f27507O.c();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        q2.x xVar;
        L();
        f fVar = this.f27520b0;
        n2.x xVar2 = fVar.f27555a;
        boolean[] zArr3 = fVar.f27557c;
        int i10 = this.f27528j0;
        int i11 = 0;
        for (int i12 = 0; i12 < xVarArr.length; i12++) {
            n2.s sVar = sVarArr[i12];
            if (sVar != null && (xVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) sVar).f27551B;
                C1804a.g(zArr3[i13]);
                this.f27528j0--;
                zArr3[i13] = false;
                sVarArr[i12] = null;
            }
        }
        boolean z10 = !this.f27525g0 ? j10 == 0 || this.f27519a0 : i10 != 0;
        for (int i14 = 0; i14 < xVarArr.length; i14++) {
            if (sVarArr[i14] == null && (xVar = xVarArr[i14]) != null) {
                C1804a.g(xVar.length() == 1);
                C1804a.g(xVar.i(0) == 0);
                int iD = xVar2.d(xVar.b());
                C1804a.g(!zArr3[iD]);
                this.f27528j0++;
                zArr3[iD] = true;
                this.f27527i0 = xVar.n().f17168u | this.f27527i0;
                sVarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    F f10 = this.f27514V[iD];
                    z10 = (f10.D() == 0 || f10.Z(j10, true)) ? false : true;
                }
            }
        }
        if (this.f27528j0 == 0) {
            this.f27532n0 = false;
            this.f27526h0 = false;
            this.f27527i0 = false;
            if (this.f27506N.j()) {
                F[] fArr = this.f27514V;
                int length = fArr.length;
                while (i11 < length) {
                    fArr[i11].r();
                    i11++;
                }
                this.f27506N.f();
            } else {
                this.f27534p0 = false;
                F[] fArr2 = this.f27514V;
                int length2 = fArr2.length;
                while (i11 < length2) {
                    fArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = m(j10);
            while (i11 < sVarArr.length) {
                if (sVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f27525g0 = true;
        return j10;
    }

    int k0(int i10, long j10) {
        if (m0()) {
            return 0;
        }
        X(i10);
        F f10 = this.f27514V[i10];
        int iF = f10.F(j10, this.f27534p0);
        f10.e0(iF);
        if (iF == 0) {
            Y(i10);
        }
        return iF;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() throws IOException {
        try {
            Z();
        } catch (IOException e10) {
            if (!this.f27504L) {
                throw e10;
            }
            X1.n.d("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e10);
            this.f27516X = true;
            V(new J.b(-9223372036854775807L));
        }
        if (this.f27534p0 && !this.f27517Y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        L();
        boolean[] zArr = this.f27520b0.f27556b;
        if (!this.f27521c0.g()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f27526h0 = false;
        boolean z10 = this.f27530l0 == j10;
        this.f27530l0 = j10;
        if (R()) {
            this.f27531m0 = j10;
            return j10;
        }
        if (this.f27524f0 != 7 && ((this.f27534p0 || this.f27506N.j()) && i0(zArr, j10, z10))) {
            return j10;
        }
        this.f27532n0 = false;
        this.f27531m0 = j10;
        this.f27534p0 = false;
        this.f27527i0 = false;
        if (this.f27506N.j()) {
            F[] fArr = this.f27514V;
            int length = fArr.length;
            while (i10 < length) {
                fArr[i10].r();
                i10++;
            }
            this.f27506N.f();
        } else {
            this.f27506N.g();
            F[] fArr2 = this.f27514V;
            int length2 = fArr2.length;
            while (i10 < length2) {
                fArr2[i10].V();
                i10++;
            }
        }
        return j10;
    }

    @Override // v2.r
    public void n() {
        this.f27516X = true;
        this.f27511S.post(this.f27509Q);
    }

    @Override // androidx.media3.exoplayer.source.F.d
    public void p(U1.s sVar) {
        this.f27511S.post(this.f27509Q);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        if (this.f27527i0) {
            this.f27527i0 = false;
            return this.f27530l0;
        }
        if (!this.f27526h0) {
            return -9223372036854775807L;
        }
        if (!this.f27534p0 && O() <= this.f27533o0) {
            return -9223372036854775807L;
        }
        this.f27526h0 = false;
        return this.f27530l0;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f27512T = aVar;
        this.f27508P.e();
        l0();
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        L();
        return this.f27520b0.f27555a;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        if (this.f27519a0) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f27520b0.f27557c;
        int length = this.f27514V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f27514V[i10].q(j10, z10, zArr[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
    }
}
