package androidx.media3.exoplayer;

import X1.C1804a;
import X1.InterfaceC1807d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.u0;
import d2.C3025C;
import d2.InterfaceC3027E;
import e2.v1;

/* compiled from: BaseRenderer.java */
/* renamed from: androidx.media3.exoplayer.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2123e implements t0, u0 {

    /* renamed from: C, reason: collision with root package name */
    private final int f27146C;

    /* renamed from: E, reason: collision with root package name */
    private d2.G f27148E;

    /* renamed from: F, reason: collision with root package name */
    private int f27149F;

    /* renamed from: G, reason: collision with root package name */
    private v1 f27150G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC1807d f27151H;

    /* renamed from: I, reason: collision with root package name */
    private int f27152I;

    /* renamed from: J, reason: collision with root package name */
    private n2.s f27153J;

    /* renamed from: K, reason: collision with root package name */
    private U1.s[] f27154K;

    /* renamed from: L, reason: collision with root package name */
    private long f27155L;

    /* renamed from: M, reason: collision with root package name */
    private long f27156M;

    /* renamed from: O, reason: collision with root package name */
    private boolean f27158O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f27159P;

    /* renamed from: R, reason: collision with root package name */
    private u0.a f27161R;

    /* renamed from: B, reason: collision with root package name */
    private final Object f27145B = new Object();

    /* renamed from: D, reason: collision with root package name */
    private final C3025C f27147D = new C3025C();

    /* renamed from: N, reason: collision with root package name */
    private long f27157N = Long.MIN_VALUE;

    /* renamed from: Q, reason: collision with root package name */
    private U1.G f27160Q = U1.G.f16812a;

    public AbstractC2123e(int i10) {
        this.f27146C = i10;
    }

    private void s0(long j10, boolean z10) {
        this.f27158O = false;
        this.f27156M = j10;
        this.f27157N = j10;
        j0(j10, z10);
    }

    @Override // androidx.media3.exoplayer.u0
    public final void B(u0.a aVar) {
        synchronized (this.f27145B) {
            this.f27161R = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public int I() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void K() {
        ((n2.s) C1804a.e(this.f27153J)).a();
    }

    @Override // androidx.media3.exoplayer.t0
    public final long L() {
        return this.f27157N;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void M(U1.s[] sVarArr, n2.s sVar, long j10, long j11, r.b bVar) {
        C1804a.g(!this.f27158O);
        this.f27153J = sVar;
        if (this.f27157N == Long.MIN_VALUE) {
            this.f27157N = j10;
        }
        this.f27154K = sVarArr;
        this.f27155L = j11;
        p0(sVarArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.t0
    public final void P(long j10) {
        s0(j10, false);
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean Q() {
        return this.f27158O;
    }

    @Override // androidx.media3.exoplayer.t0
    public InterfaceC3027E R() {
        return null;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void S(U1.G g10) {
        if (X1.L.d(this.f27160Q, g10)) {
            return;
        }
        this.f27160Q = g10;
        q0(g10);
    }

    protected final ExoPlaybackException U(Throwable th, U1.s sVar, int i10) {
        return V(th, sVar, false, i10);
    }

    protected final ExoPlaybackException V(Throwable th, U1.s sVar, boolean z10, int i10) {
        int iT;
        if (sVar == null || this.f27159P) {
            iT = 4;
        } else {
            this.f27159P = true;
            try {
                iT = u0.T(a(sVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f27159P = false;
            }
        }
        return ExoPlaybackException.b(th, getName(), Z(), sVar, iT, z10, i10);
    }

    protected final InterfaceC1807d W() {
        return (InterfaceC1807d) C1804a.e(this.f27151H);
    }

    protected final d2.G X() {
        return (d2.G) C1804a.e(this.f27148E);
    }

    protected final C3025C Y() {
        this.f27147D.a();
        return this.f27147D;
    }

    protected final int Z() {
        return this.f27149F;
    }

    protected final long a0() {
        return this.f27156M;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void b() {
        C1804a.g(this.f27152I == 0);
        this.f27147D.a();
        m0();
    }

    protected final v1 b0() {
        return (v1) C1804a.e(this.f27150G);
    }

    @Override // androidx.media3.exoplayer.t0
    public final void c() {
        C1804a.g(this.f27152I == 0);
        k0();
    }

    protected final U1.s[] c0() {
        return (U1.s[]) C1804a.e(this.f27154K);
    }

    protected final long d0() {
        return this.f27155L;
    }

    protected final U1.G e0() {
        return this.f27160Q;
    }

    protected final boolean f0() {
        return p() ? this.f27158O : ((n2.s) C1804a.e(this.f27153J)).f();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void g() {
        C1804a.g(this.f27152I == 1);
        this.f27147D.a();
        this.f27152I = 0;
        this.f27153J = null;
        this.f27154K = null;
        this.f27158O = false;
        g0();
    }

    protected abstract void g0();

    @Override // androidx.media3.exoplayer.t0
    public final int getState() {
        return this.f27152I;
    }

    protected abstract void j0(long j10, boolean z10);

    @Override // androidx.media3.exoplayer.t0
    public final n2.s k() {
        return this.f27153J;
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final int l() {
        return this.f27146C;
    }

    protected final void l0() {
        u0.a aVar;
        synchronized (this.f27145B) {
            aVar = this.f27161R;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public final void n() {
        synchronized (this.f27145B) {
            this.f27161R = null;
        }
    }

    @Override // androidx.media3.exoplayer.t0
    public final boolean p() {
        return this.f27157N == Long.MIN_VALUE;
    }

    protected final int r0(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iP = ((n2.s) C1804a.e(this.f27153J)).p(c3025c, decoderInputBuffer, i10);
        if (iP == -4) {
            if (decoderInputBuffer.w()) {
                this.f27157N = Long.MIN_VALUE;
                return this.f27158O ? -4 : -3;
            }
            long j10 = decoderInputBuffer.f26295G + this.f27155L;
            decoderInputBuffer.f26295G = j10;
            this.f27157N = Math.max(this.f27157N, j10);
        } else if (iP == -5) {
            U1.s sVar = (U1.s) C1804a.e(c3025c.f39668b);
            if (sVar.f17167t != Long.MAX_VALUE) {
                c3025c.f39668b = sVar.b().w0(sVar.f17167t + this.f27155L).M();
            }
        }
        return iP;
    }

    @Override // androidx.media3.exoplayer.t0
    public final void start() {
        C1804a.g(this.f27152I == 1);
        this.f27152I = 2;
        n0();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void stop() {
        C1804a.g(this.f27152I == 2);
        this.f27152I = 1;
        o0();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void t(d2.G g10, U1.s[] sVarArr, n2.s sVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar) {
        C1804a.g(this.f27152I == 0);
        this.f27148E = g10;
        this.f27152I = 1;
        h0(z10, z11);
        M(sVarArr, sVar, j11, j12, bVar);
        s0(j11, z10);
    }

    protected int t0(long j10) {
        return ((n2.s) C1804a.e(this.f27153J)).n(j10 - this.f27155L);
    }

    @Override // androidx.media3.exoplayer.t0
    public final void u(int i10, v1 v1Var, InterfaceC1807d interfaceC1807d) {
        this.f27149F = i10;
        this.f27150G = v1Var;
        this.f27151H = interfaceC1807d;
        i0();
    }

    @Override // androidx.media3.exoplayer.t0
    public final void v() {
        this.f27158O = true;
    }

    @Override // androidx.media3.exoplayer.t0
    public final u0 A() {
        return this;
    }

    protected void i0() {
    }

    protected void k0() {
    }

    protected void m0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }

    protected void q0(U1.G g10) {
    }

    @Override // androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) {
    }

    protected void h0(boolean z10, boolean z11) {
    }

    protected void p0(U1.s[] sVarArr, long j10, long j11, r.b bVar) {
    }
}
