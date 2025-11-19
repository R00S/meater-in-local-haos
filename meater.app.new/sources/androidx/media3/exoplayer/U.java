package androidx.media3.exoplayer;

import U1.G;
import U1.v;
import U1.y;
import X1.C1804a;
import X1.InterfaceC1807d;
import X1.InterfaceC1813j;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.C2126h;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.V;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.p0;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.t0;
import androidx.media3.exoplayer.u0;
import d2.C3028F;
import d2.InterfaceC3026D;
import e2.InterfaceC3129a;
import e2.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.C3896c;
import m8.AbstractC4009y;
import p2.C4202i;
import q2.AbstractC4270C;
import q2.C4271D;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes.dex */
final class U implements Handler.Callback, q.a, AbstractC4270C.a, p0.d, C2126h.a, r0.a {

    /* renamed from: B0, reason: collision with root package name */
    private static final long f26464B0 = X1.L.u1(10000);

    /* renamed from: B, reason: collision with root package name */
    private final t0[] f26466B;

    /* renamed from: C, reason: collision with root package name */
    private final Set<t0> f26467C;

    /* renamed from: D, reason: collision with root package name */
    private final u0[] f26468D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean[] f26469E;

    /* renamed from: F, reason: collision with root package name */
    private final AbstractC4270C f26470F;

    /* renamed from: G, reason: collision with root package name */
    private final C4271D f26471G;

    /* renamed from: H, reason: collision with root package name */
    private final V f26472H;

    /* renamed from: I, reason: collision with root package name */
    private final r2.d f26473I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC1813j f26474J;

    /* renamed from: K, reason: collision with root package name */
    private final C3028F f26475K;

    /* renamed from: L, reason: collision with root package name */
    private final Looper f26476L;

    /* renamed from: M, reason: collision with root package name */
    private final G.c f26477M;

    /* renamed from: N, reason: collision with root package name */
    private final G.b f26478N;

    /* renamed from: O, reason: collision with root package name */
    private final long f26479O;

    /* renamed from: P, reason: collision with root package name */
    private final boolean f26480P;

    /* renamed from: Q, reason: collision with root package name */
    private final C2126h f26481Q;

    /* renamed from: R, reason: collision with root package name */
    private final ArrayList<d> f26482R;

    /* renamed from: S, reason: collision with root package name */
    private final InterfaceC1807d f26483S;

    /* renamed from: T, reason: collision with root package name */
    private final f f26484T;

    /* renamed from: U, reason: collision with root package name */
    private final a0 f26485U;

    /* renamed from: V, reason: collision with root package name */
    private final p0 f26486V;

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC3026D f26487W;

    /* renamed from: X, reason: collision with root package name */
    private final long f26488X;

    /* renamed from: Y, reason: collision with root package name */
    private final v1 f26489Y;

    /* renamed from: Z, reason: collision with root package name */
    private final boolean f26490Z;

    /* renamed from: a0, reason: collision with root package name */
    private final InterfaceC3129a f26491a0;

    /* renamed from: b0, reason: collision with root package name */
    private final InterfaceC1813j f26492b0;

    /* renamed from: c0, reason: collision with root package name */
    private d2.I f26493c0;

    /* renamed from: d0, reason: collision with root package name */
    private q0 f26494d0;

    /* renamed from: e0, reason: collision with root package name */
    private e f26495e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f26496f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f26497g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f26498h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f26499i0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f26501k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f26502l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f26503m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f26504n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f26505o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f26506p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f26507q0;

    /* renamed from: r0, reason: collision with root package name */
    private h f26508r0;

    /* renamed from: s0, reason: collision with root package name */
    private long f26509s0;

    /* renamed from: t0, reason: collision with root package name */
    private long f26510t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f26511u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f26512v0;

    /* renamed from: w0, reason: collision with root package name */
    private ExoPlaybackException f26513w0;

    /* renamed from: x0, reason: collision with root package name */
    private long f26514x0;

    /* renamed from: z0, reason: collision with root package name */
    private ExoPlayer.c f26516z0;

    /* renamed from: y0, reason: collision with root package name */
    private long f26515y0 = -9223372036854775807L;

    /* renamed from: j0, reason: collision with root package name */
    private long f26500j0 = -9223372036854775807L;

    /* renamed from: A0, reason: collision with root package name */
    private U1.G f26465A0 = U1.G.f16812a;

    /* compiled from: ExoPlayerImplInternal.java */
    class a implements t0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.t0.a
        public void a() {
            U.this.f26505o0 = true;
        }

        @Override // androidx.media3.exoplayer.t0.a
        public void b() {
            if (U.this.f26490Z || U.this.f26506p0) {
                U.this.f26474J.f(2);
            }
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<p0.c> f26518a;

        /* renamed from: b, reason: collision with root package name */
        private final n2.t f26519b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26520c;

        /* renamed from: d, reason: collision with root package name */
        private final long f26521d;

        /* synthetic */ b(List list, n2.t tVar, int i10, long j10, a aVar) {
            this(list, tVar, i10, j10);
        }

        private b(List<p0.c> list, n2.t tVar, int i10, long j10) {
            this.f26518a = list;
            this.f26519b = tVar;
            this.f26520c = i10;
            this.f26521d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f26522a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26523b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26524c;

        /* renamed from: d, reason: collision with root package name */
        public final n2.t f26525d;
    }

    /* compiled from: ExoPlayerImplInternal.java */
    private static final class d implements Comparable<d> {

        /* renamed from: B, reason: collision with root package name */
        public final r0 f26526B;

        /* renamed from: C, reason: collision with root package name */
        public int f26527C;

        /* renamed from: D, reason: collision with root package name */
        public long f26528D;

        /* renamed from: E, reason: collision with root package name */
        public Object f26529E;

        public d(r0 r0Var) {
            this.f26526B = r0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f26529E;
            if ((obj == null) != (dVar.f26529E == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f26527C - dVar.f26527C;
            return i10 != 0 ? i10 : X1.L.n(this.f26528D, dVar.f26528D);
        }

        public void j(int i10, long j10, Object obj) {
            this.f26527C = i10;
            this.f26528D = j10;
            this.f26529E = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26530a;

        /* renamed from: b, reason: collision with root package name */
        public q0 f26531b;

        /* renamed from: c, reason: collision with root package name */
        public int f26532c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f26533d;

        /* renamed from: e, reason: collision with root package name */
        public int f26534e;

        public e(q0 q0Var) {
            this.f26531b = q0Var;
        }

        public void b(int i10) {
            this.f26530a |= i10 > 0;
            this.f26532c += i10;
        }

        public void c(q0 q0Var) {
            this.f26530a |= this.f26531b != q0Var;
            this.f26531b = q0Var;
        }

        public void d(int i10) {
            if (this.f26533d && this.f26534e != 5) {
                C1804a.a(i10 == 5);
                return;
            }
            this.f26530a = true;
            this.f26533d = true;
            this.f26534e = i10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public interface f {
        void a(e eVar);
    }

    /* compiled from: ExoPlayerImplInternal.java */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final r.b f26535a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26536b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26537c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f26538d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f26539e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f26540f;

        public g(r.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f26535a = bVar;
            this.f26536b = j10;
            this.f26537c = j11;
            this.f26538d = z10;
            this.f26539e = z11;
            this.f26540f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final U1.G f26541a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26542b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26543c;

        public h(U1.G g10, int i10, long j10) {
            this.f26541a = g10;
            this.f26542b = i10;
            this.f26543c = j10;
        }
    }

    public U(t0[] t0VarArr, AbstractC4270C abstractC4270C, C4271D c4271d, V v10, r2.d dVar, int i10, boolean z10, InterfaceC3129a interfaceC3129a, d2.I i11, InterfaceC3026D interfaceC3026D, long j10, boolean z11, boolean z12, Looper looper, InterfaceC1807d interfaceC1807d, f fVar, v1 v1Var, C3028F c3028f, ExoPlayer.c cVar) {
        this.f26484T = fVar;
        this.f26466B = t0VarArr;
        this.f26470F = abstractC4270C;
        this.f26471G = c4271d;
        this.f26472H = v10;
        this.f26473I = dVar;
        this.f26502l0 = i10;
        this.f26503m0 = z10;
        this.f26493c0 = i11;
        this.f26487W = interfaceC3026D;
        this.f26488X = j10;
        this.f26514x0 = j10;
        this.f26497g0 = z11;
        this.f26490Z = z12;
        this.f26483S = interfaceC1807d;
        this.f26489Y = v1Var;
        this.f26516z0 = cVar;
        this.f26491a0 = interfaceC3129a;
        this.f26479O = v10.n(v1Var);
        this.f26480P = v10.r(v1Var);
        q0 q0VarK = q0.k(c4271d);
        this.f26494d0 = q0VarK;
        this.f26495e0 = new e(q0VarK);
        this.f26468D = new u0[t0VarArr.length];
        this.f26469E = new boolean[t0VarArr.length];
        u0.a aVarD = abstractC4270C.d();
        for (int i12 = 0; i12 < t0VarArr.length; i12++) {
            t0VarArr[i12].u(i12, v1Var, interfaceC1807d);
            this.f26468D[i12] = t0VarArr[i12].A();
            if (aVarD != null) {
                this.f26468D[i12].B(aVarD);
            }
        }
        this.f26481Q = new C2126h(this, interfaceC1807d);
        this.f26482R = new ArrayList<>();
        this.f26467C = m8.d0.h();
        this.f26477M = new G.c();
        this.f26478N = new G.b();
        abstractC4270C.e(this, dVar);
        this.f26512v0 = true;
        InterfaceC1813j interfaceC1813jE = interfaceC1807d.e(looper, null);
        this.f26492b0 = interfaceC1813jE;
        this.f26485U = new a0(interfaceC3129a, interfaceC1813jE, new X.a() { // from class: androidx.media3.exoplayer.S
            @Override // androidx.media3.exoplayer.X.a
            public final X a(Y y10, long j11) {
                return this.f26461a.r(y10, j11);
            }
        }, cVar);
        this.f26486V = new p0(this, interfaceC3129a, interfaceC1813jE, v1Var);
        C3028F c3028f2 = c3028f == null ? new C3028F() : c3028f;
        this.f26475K = c3028f2;
        Looper looperA = c3028f2.a();
        this.f26476L = looperA;
        this.f26474J = interfaceC1807d.e(looperA, this);
    }

    private void A0(int i10, int i11, n2.t tVar) throws Throwable {
        this.f26495e0.b(1);
        O(this.f26486V.B(i10, i11, tVar), false);
    }

    private void A1(r.b bVar, n2.x xVar, C4271D c4271d) {
        X x10 = (X) C1804a.e(this.f26485U.m());
        this.f26472H.e(new V.a(this.f26489Y, this.f26494d0.f27445a, bVar, x10 == this.f26485U.t() ? x10.C(this.f26509s0) : x10.C(this.f26509s0) - x10.f26567h.f26578b, J(x10.j()), this.f26481Q.h().f16775a, this.f26494d0.f27456l, this.f26499i0, u1(this.f26494d0.f27445a, x10.f26567h.f26577a) ? this.f26487W.c() : -9223372036854775807L), xVar, c4271d.f47807c);
    }

    private AbstractC4009y<U1.y> B(q2.x[] xVarArr) {
        AbstractC4009y.a aVar = new AbstractC4009y.a();
        boolean z10 = false;
        for (q2.x xVar : xVarArr) {
            if (xVar != null) {
                U1.y yVar = xVar.f(0).f17159l;
                if (yVar == null) {
                    aVar.a(new U1.y(new y.b[0]));
                } else {
                    aVar.a(yVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : AbstractC4009y.G();
    }

    private boolean B0() {
        X xW = this.f26485U.w();
        C4271D c4271dP = xW.p();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            t0[] t0VarArr = this.f26466B;
            if (i10 >= t0VarArr.length) {
                return !z10;
            }
            t0 t0Var = t0VarArr[i10];
            if (X(t0Var)) {
                boolean z11 = t0Var.k() != xW.f26562c[i10];
                if (!c4271dP.c(i10) || z11) {
                    if (!t0Var.Q()) {
                        t0Var.M(D(c4271dP.f47807c[i10]), xW.f26562c[i10], xW.n(), xW.m(), xW.f26567h.f26577a);
                        if (this.f26506p0) {
                            c1(false);
                        }
                    } else if (t0Var.d()) {
                        t(i10);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void B1(int i10, int i11, List<U1.v> list) throws Throwable {
        this.f26495e0.b(1);
        O(this.f26486V.F(i10, i11, list), false);
    }

    private long C() {
        q0 q0Var = this.f26494d0;
        return E(q0Var.f27445a, q0Var.f27446b.f27812a, q0Var.f27463s);
    }

    private void C0() throws ExoPlaybackException {
        float f10 = this.f26481Q.h().f16775a;
        X xW = this.f26485U.w();
        C4271D c4271d = null;
        boolean z10 = true;
        for (X xT = this.f26485U.t(); xT != null && xT.f26565f; xT = xT.k()) {
            q0 q0Var = this.f26494d0;
            C4271D c4271dZ = xT.z(f10, q0Var.f27445a, q0Var.f27456l);
            if (xT == this.f26485U.t()) {
                c4271d = c4271dZ;
            }
            if (!c4271dZ.a(xT.p())) {
                if (z10) {
                    X xT2 = this.f26485U.t();
                    boolean zM = this.f26485U.M(xT2);
                    boolean[] zArr = new boolean[this.f26466B.length];
                    long jB = xT2.b((C4271D) C1804a.e(c4271d), this.f26494d0.f27463s, zM, zArr);
                    q0 q0Var2 = this.f26494d0;
                    boolean z11 = (q0Var2.f27449e == 4 || jB == q0Var2.f27463s) ? false : true;
                    q0 q0Var3 = this.f26494d0;
                    this.f26494d0 = S(q0Var3.f27446b, jB, q0Var3.f27447c, q0Var3.f27448d, z11, 5);
                    if (z11) {
                        G0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f26466B.length];
                    int i10 = 0;
                    while (true) {
                        t0[] t0VarArr = this.f26466B;
                        if (i10 >= t0VarArr.length) {
                            break;
                        }
                        t0 t0Var = t0VarArr[i10];
                        boolean zX = X(t0Var);
                        zArr2[i10] = zX;
                        n2.s sVar = xT2.f26562c[i10];
                        if (zX) {
                            if (sVar != t0Var.k()) {
                                t(i10);
                            } else if (zArr[i10]) {
                                t0Var.P(this.f26509s0);
                            }
                        }
                        i10++;
                    }
                    y(zArr2, this.f26509s0);
                } else {
                    this.f26485U.M(xT);
                    if (xT.f26565f) {
                        xT.a(c4271dZ, Math.max(xT.f26567h.f26578b, xT.C(this.f26509s0)), false);
                    }
                }
                M(true);
                if (this.f26494d0.f27449e != 4) {
                    d0();
                    D1();
                    this.f26474J.f(2);
                    return;
                }
                return;
            }
            if (xT == xW) {
                z10 = false;
            }
        }
    }

    private void C1() throws ExoPlaybackException {
        if (this.f26494d0.f27445a.q() || !this.f26486V.t()) {
            return;
        }
        boolean zJ0 = j0();
        n0();
        o0();
        l0();
        m0(zJ0);
    }

    private static U1.s[] D(q2.x xVar) {
        int length = xVar != null ? xVar.length() : 0;
        U1.s[] sVarArr = new U1.s[length];
        for (int i10 = 0; i10 < length; i10++) {
            sVarArr[i10] = xVar.f(i10);
        }
        return sVarArr;
    }

    private void D0() throws ExoPlaybackException {
        C0();
        P0(true);
    }

    private void D1() {
        X xT = this.f26485U.t();
        if (xT == null) {
            return;
        }
        long jQ = xT.f26565f ? xT.f26560a.q() : -9223372036854775807L;
        if (jQ != -9223372036854775807L) {
            if (!xT.s()) {
                this.f26485U.M(xT);
                M(false);
                d0();
            }
            G0(jQ);
            if (jQ != this.f26494d0.f27463s) {
                q0 q0Var = this.f26494d0;
                this.f26494d0 = S(q0Var.f27446b, jQ, q0Var.f27447c, jQ, true, 5);
            }
        } else {
            long jI = this.f26481Q.i(xT != this.f26485U.w());
            this.f26509s0 = jI;
            long jC = xT.C(jI);
            i0(this.f26494d0.f27463s, jC);
            if (this.f26481Q.H()) {
                boolean z10 = !this.f26495e0.f26533d;
                q0 q0Var2 = this.f26494d0;
                this.f26494d0 = S(q0Var2.f27446b, jC, q0Var2.f27447c, jC, z10, 6);
            } else {
                this.f26494d0.o(jC);
            }
        }
        this.f26494d0.f27461q = this.f26485U.m().j();
        this.f26494d0.f27462r = I();
        q0 q0Var3 = this.f26494d0;
        if (q0Var3.f27456l && q0Var3.f27449e == 3 && u1(q0Var3.f27445a, q0Var3.f27446b) && this.f26494d0.f27459o.f16775a == 1.0f) {
            float fB = this.f26487W.b(C(), this.f26494d0.f27462r);
            if (this.f26481Q.h().f16775a != fB) {
                Z0(this.f26494d0.f27459o.b(fB));
                Q(this.f26494d0.f27459o, this.f26481Q.h().f16775a, false, false);
            }
        }
    }

    private long E(U1.G g10, Object obj, long j10) {
        g10.n(g10.h(obj, this.f26478N).f16823c, this.f26477M);
        G.c cVar = this.f26477M;
        if (cVar.f16849f != -9223372036854775807L && cVar.f()) {
            G.c cVar2 = this.f26477M;
            if (cVar2.f16852i) {
                return X1.L.Q0(cVar2.a() - this.f26477M.f16849f) - (j10 + this.f26478N.n());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[PHI: r5 r6 r8
      0x00a2: PHI (r5v4 androidx.media3.exoplayer.source.r$b) = (r5v3 androidx.media3.exoplayer.source.r$b), (r5v7 androidx.media3.exoplayer.source.r$b) binds: [B:29:0x0077, B:31:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:29:0x0077, B:31:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:29:0x0077, B:31:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[PHI: r0
      0x00ea: PHI (r0v11 U1.G) = (r0v10 U1.G), (r0v10 U1.G), (r0v16 U1.G), (r0v16 U1.G) binds: [B:35:0x00af, B:37:0x00b3, B:39:0x00c4, B:41:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.E0(boolean, boolean, boolean, boolean):void");
    }

    private void E1(U1.G g10, r.b bVar, U1.G g11, r.b bVar2, long j10, boolean z10) {
        if (!u1(g10, bVar)) {
            U1.A a10 = bVar.b() ? U1.A.f16772d : this.f26494d0.f27459o;
            if (this.f26481Q.h().equals(a10)) {
                return;
            }
            Z0(a10);
            Q(this.f26494d0.f27459o, a10.f16775a, false, false);
            return;
        }
        g10.n(g10.h(bVar.f27812a, this.f26478N).f16823c, this.f26477M);
        this.f26487W.a((v.g) X1.L.i(this.f26477M.f16853j));
        if (j10 != -9223372036854775807L) {
            this.f26487W.e(E(g10, bVar.f27812a, j10));
            return;
        }
        if (!X1.L.d(!g11.q() ? g11.n(g11.h(bVar2.f27812a, this.f26478N).f16823c, this.f26477M).f16844a : null, this.f26477M.f16844a) || z10) {
            this.f26487W.e(-9223372036854775807L);
        }
    }

    private long F() {
        X xW = this.f26485U.w();
        if (xW == null) {
            return 0L;
        }
        long jM = xW.m();
        if (!xW.f26565f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = this.f26466B;
            if (i10 >= t0VarArr.length) {
                return jM;
            }
            if (X(t0VarArr[i10]) && this.f26466B[i10].k() == xW.f26562c[i10]) {
                long jL = this.f26466B[i10].L();
                if (jL == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jL, jM);
            }
            i10++;
        }
    }

    private void F0() {
        X xT = this.f26485U.t();
        this.f26498h0 = xT != null && xT.f26567h.f26584h && this.f26497g0;
    }

    private void F1(boolean z10, boolean z11) {
        this.f26499i0 = z10;
        this.f26500j0 = (!z10 || z11) ? -9223372036854775807L : this.f26483S.c();
    }

    private Pair<r.b, Long> G(U1.G g10) {
        if (g10.q()) {
            return Pair.create(q0.l(), 0L);
        }
        Pair<Object, Long> pairJ = g10.j(this.f26477M, this.f26478N, g10.a(this.f26503m0), -9223372036854775807L);
        r.b bVarP = this.f26485U.P(g10, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarP.b()) {
            g10.h(bVarP.f27812a, this.f26478N);
            jLongValue = bVarP.f27814c == this.f26478N.k(bVarP.f27813b) ? this.f26478N.g() : 0L;
        }
        return Pair.create(bVarP, Long.valueOf(jLongValue));
    }

    private void G0(long j10) {
        X xT = this.f26485U.t();
        long jD = xT == null ? j10 + 1000000000000L : xT.D(j10);
        this.f26509s0 = jD;
        this.f26481Q.c(jD);
        for (t0 t0Var : this.f26466B) {
            if (X(t0Var)) {
                t0Var.P(this.f26509s0);
            }
        }
        r0();
    }

    private void G1(float f10) {
        for (X xT = this.f26485U.t(); xT != null; xT = xT.k()) {
            for (q2.x xVar : xT.p().f47807c) {
                if (xVar != null) {
                    xVar.q(f10);
                }
            }
        }
    }

    private static void H0(U1.G g10, d dVar, G.c cVar, G.b bVar) {
        int i10 = g10.n(g10.h(dVar.f26529E, bVar).f16823c, cVar).f16858o;
        Object obj = g10.g(i10, bVar, true).f16822b;
        long j10 = bVar.f16824d;
        dVar.j(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private synchronized void H1(l8.s<Boolean> sVar, long j10) {
        long jC = this.f26483S.c() + j10;
        boolean z10 = false;
        while (!sVar.get().booleanValue() && j10 > 0) {
            try {
                this.f26483S.f();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jC - this.f26483S.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private long I() {
        return J(this.f26494d0.f27461q);
    }

    private static boolean I0(d dVar, U1.G g10, U1.G g11, int i10, boolean z10, G.c cVar, G.b bVar) {
        Object obj = dVar.f26529E;
        if (obj == null) {
            Pair<Object, Long> pairL0 = L0(g10, new h(dVar.f26526B.h(), dVar.f26526B.d(), dVar.f26526B.f() == Long.MIN_VALUE ? -9223372036854775807L : X1.L.Q0(dVar.f26526B.f())), false, i10, z10, cVar, bVar);
            if (pairL0 == null) {
                return false;
            }
            dVar.j(g10.b(pairL0.first), ((Long) pairL0.second).longValue(), pairL0.first);
            if (dVar.f26526B.f() == Long.MIN_VALUE) {
                H0(g10, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = g10.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f26526B.f() == Long.MIN_VALUE) {
            H0(g10, dVar, cVar, bVar);
            return true;
        }
        dVar.f26527C = iB;
        g11.h(dVar.f26529E, bVar);
        if (bVar.f16826f && g11.n(bVar.f16823c, cVar).f16857n == g11.b(dVar.f26529E)) {
            Pair<Object, Long> pairJ = g10.j(cVar, bVar, g10.h(dVar.f26529E, bVar).f16823c, dVar.f26528D + bVar.n());
            dVar.j(g10.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private long J(long j10) {
        X xM = this.f26485U.m();
        if (xM == null) {
            return 0L;
        }
        return Math.max(0L, j10 - xM.C(this.f26509s0));
    }

    private void J0(U1.G g10, U1.G g11) {
        if (g10.q() && g11.q()) {
            return;
        }
        for (int size = this.f26482R.size() - 1; size >= 0; size--) {
            if (!I0(this.f26482R.get(size), g10, g11, this.f26502l0, this.f26503m0, this.f26477M, this.f26478N)) {
                this.f26482R.get(size).f26526B.k(false);
                this.f26482R.remove(size);
            }
        }
        Collections.sort(this.f26482R);
    }

    private void K(androidx.media3.exoplayer.source.q qVar) {
        if (this.f26485U.D(qVar)) {
            this.f26485U.J(this.f26509s0);
            d0();
        } else if (this.f26485U.E(qVar)) {
            e0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.media3.exoplayer.U.g K0(U1.G r30, androidx.media3.exoplayer.q0 r31, androidx.media3.exoplayer.U.h r32, androidx.media3.exoplayer.a0 r33, int r34, boolean r35, U1.G.c r36, U1.G.b r37) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.K0(U1.G, androidx.media3.exoplayer.q0, androidx.media3.exoplayer.U$h, androidx.media3.exoplayer.a0, int, boolean, U1.G$c, U1.G$b):androidx.media3.exoplayer.U$g");
    }

    private void L(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionC = ExoPlaybackException.c(iOException, i10);
        X xT = this.f26485U.t();
        if (xT != null) {
            exoPlaybackExceptionC = exoPlaybackExceptionC.a(xT.f26567h.f26577a);
        }
        X1.n.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionC);
        x1(false, false);
        this.f26494d0 = this.f26494d0.f(exoPlaybackExceptionC);
    }

    private static Pair<Object, Long> L0(U1.G g10, h hVar, boolean z10, int i10, boolean z11, G.c cVar, G.b bVar) {
        Pair<Object, Long> pairJ;
        int iM0;
        U1.G g11 = hVar.f26541a;
        if (g10.q()) {
            return null;
        }
        U1.G g12 = g11.q() ? g10 : g11;
        try {
            pairJ = g12.j(cVar, bVar, hVar.f26542b, hVar.f26543c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g10.equals(g12)) {
            return pairJ;
        }
        if (g10.b(pairJ.first) != -1) {
            return (g12.h(pairJ.first, bVar).f16826f && g12.n(bVar.f16823c, cVar).f16857n == g12.b(pairJ.first)) ? g10.j(cVar, bVar, g10.h(pairJ.first, bVar).f16823c, hVar.f26543c) : pairJ;
        }
        if (z10 && (iM0 = M0(cVar, bVar, i10, z11, pairJ.first, g12, g10)) != -1) {
            return g10.j(cVar, bVar, iM0, -9223372036854775807L);
        }
        return null;
    }

    private void M(boolean z10) {
        X xM = this.f26485U.m();
        r.b bVar = xM == null ? this.f26494d0.f27446b : xM.f26567h.f26577a;
        boolean zEquals = this.f26494d0.f27455k.equals(bVar);
        if (!zEquals) {
            this.f26494d0 = this.f26494d0.c(bVar);
        }
        q0 q0Var = this.f26494d0;
        q0Var.f27461q = xM == null ? q0Var.f27463s : xM.j();
        this.f26494d0.f27462r = I();
        if ((!zEquals || z10) && xM != null && xM.f26565f) {
            A1(xM.f26567h.f26577a, xM.o(), xM.p());
        }
    }

    static int M0(G.c cVar, G.b bVar, int i10, boolean z10, Object obj, U1.G g10, U1.G g11) {
        Object obj2 = g10.n(g10.h(obj, bVar).f16823c, cVar).f16844a;
        for (int i11 = 0; i11 < g11.p(); i11++) {
            if (g11.n(i11, cVar).f16844a.equals(obj2)) {
                return i11;
            }
        }
        int iB = g10.b(obj);
        int i12 = g10.i();
        int iD = iB;
        int iB2 = -1;
        for (int i13 = 0; i13 < i12 && iB2 == -1; i13++) {
            iD = g10.d(iD, bVar, cVar, i10, z10);
            if (iD == -1) {
                break;
            }
            iB2 = g11.b(g10.m(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return g11.f(iB2, bVar).f16823c;
    }

    private void N(X x10) throws ExoPlaybackException {
        if (!x10.f26565f) {
            float f10 = this.f26481Q.h().f16775a;
            q0 q0Var = this.f26494d0;
            x10.q(f10, q0Var.f27445a, q0Var.f27456l);
        }
        A1(x10.f26567h.f26577a, x10.o(), x10.p());
        if (x10 == this.f26485U.t()) {
            G0(x10.f26567h.f26578b);
            w();
            q0 q0Var2 = this.f26494d0;
            r.b bVar = q0Var2.f27446b;
            long j10 = x10.f26567h.f26578b;
            this.f26494d0 = S(bVar, j10, q0Var2.f27447c, j10, false, 5);
        }
        d0();
    }

    private void N0(long j10) {
        long jMin = (this.f26494d0.f27449e != 3 || (!this.f26490Z && s1())) ? f26464B0 : 1000L;
        if (this.f26490Z && s1()) {
            for (t0 t0Var : this.f26466B) {
                if (X(t0Var)) {
                    jMin = Math.min(jMin, X1.L.u1(t0Var.r(this.f26509s0, this.f26510t0)));
                }
            }
        }
        this.f26474J.g(2, j10 + jMin);
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0093: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]) (LINE:148), block:B:33:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O(U1.G r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.O(U1.G, boolean):void");
    }

    private void P(androidx.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f26485U.D(qVar)) {
            N((X) C1804a.e(this.f26485U.m()));
            return;
        }
        X xU = this.f26485U.u(qVar);
        if (xU != null) {
            C1804a.g(!xU.f26565f);
            float f10 = this.f26481Q.h().f16775a;
            q0 q0Var = this.f26494d0;
            xU.q(f10, q0Var.f27445a, q0Var.f27456l);
            if (this.f26485U.E(qVar)) {
                e0();
            }
        }
    }

    private void P0(boolean z10) throws ExoPlaybackException {
        r.b bVar = this.f26485U.t().f26567h.f26577a;
        long jS0 = S0(bVar, this.f26494d0.f27463s, true, false);
        if (jS0 != this.f26494d0.f27463s) {
            q0 q0Var = this.f26494d0;
            this.f26494d0 = S(bVar, jS0, q0Var.f27447c, q0Var.f27448d, z10, 5);
        }
    }

    private void Q(U1.A a10, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f26495e0.b(1);
            }
            this.f26494d0 = this.f26494d0.g(a10);
        }
        G1(a10.f16775a);
        for (t0 t0Var : this.f26466B) {
            if (t0Var != null) {
                t0Var.D(f10, a10.f16775a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Q0(androidx.media3.exoplayer.U.h r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.Q0(androidx.media3.exoplayer.U$h):void");
    }

    private void R(U1.A a10, boolean z10) {
        Q(a10, a10.f16775a, true, z10);
    }

    private long R0(r.b bVar, long j10, boolean z10) {
        return S0(bVar, j10, this.f26485U.t() != this.f26485U.w(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q0 S(r.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List listG;
        n2.x xVar;
        C4271D c4271d;
        this.f26512v0 = (!this.f26512v0 && j10 == this.f26494d0.f27463s && bVar.equals(this.f26494d0.f27446b)) ? false : true;
        F0();
        q0 q0Var = this.f26494d0;
        n2.x xVar2 = q0Var.f27452h;
        C4271D c4271d2 = q0Var.f27453i;
        List list = q0Var.f27454j;
        if (this.f26486V.t()) {
            X xT = this.f26485U.t();
            n2.x xVarO = xT == null ? n2.x.f45675d : xT.o();
            C4271D c4271dP = xT == null ? this.f26471G : xT.p();
            List listB = B(c4271dP.f47807c);
            if (xT != null) {
                Y y10 = xT.f26567h;
                if (y10.f26579c != j11) {
                    xT.f26567h = y10.a(j11);
                }
            }
            k0();
            xVar = xVarO;
            c4271d = c4271dP;
            listG = listB;
        } else if (bVar.equals(this.f26494d0.f27446b)) {
            listG = list;
            xVar = xVar2;
            c4271d = c4271d2;
        } else {
            xVar = n2.x.f45675d;
            c4271d = this.f26471G;
            listG = AbstractC4009y.G();
        }
        if (z10) {
            this.f26495e0.d(i10);
        }
        return this.f26494d0.d(bVar, j10, j11, j12, I(), xVar, c4271d, listG);
    }

    private long S0(r.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        y1();
        F1(false, true);
        if (z11 || this.f26494d0.f27449e == 3) {
            p1(2);
        }
        X xT = this.f26485U.t();
        X xK = xT;
        while (xK != null && !bVar.equals(xK.f26567h.f26577a)) {
            xK = xK.k();
        }
        if (z10 || xT != xK || (xK != null && xK.D(j10) < 0)) {
            for (int i10 = 0; i10 < this.f26466B.length; i10++) {
                t(i10);
            }
            if (xK != null) {
                while (this.f26485U.t() != xK) {
                    this.f26485U.b();
                }
                this.f26485U.M(xK);
                xK.B(1000000000000L);
                w();
            }
        }
        if (xK != null) {
            this.f26485U.M(xK);
            if (!xK.f26565f) {
                xK.f26567h = xK.f26567h.b(j10);
            } else if (xK.f26566g) {
                j10 = xK.f26560a.m(j10);
                xK.f26560a.u(j10 - this.f26479O, this.f26480P);
            }
            G0(j10);
            d0();
        } else {
            this.f26485U.f();
            G0(j10);
        }
        M(false);
        this.f26474J.f(2);
        return j10;
    }

    private boolean T(t0 t0Var, X x10) {
        X xK = x10.k();
        return x10.f26567h.f26582f && xK.f26565f && ((t0Var instanceof C4202i) || (t0Var instanceof C3896c) || t0Var.L() >= xK.n());
    }

    private void T0(r0 r0Var) {
        if (r0Var.f() == -9223372036854775807L) {
            U0(r0Var);
            return;
        }
        if (this.f26494d0.f27445a.q()) {
            this.f26482R.add(new d(r0Var));
            return;
        }
        d dVar = new d(r0Var);
        U1.G g10 = this.f26494d0.f27445a;
        if (!I0(dVar, g10, g10, this.f26502l0, this.f26503m0, this.f26477M, this.f26478N)) {
            r0Var.k(false);
        } else {
            this.f26482R.add(dVar);
            Collections.sort(this.f26482R);
        }
    }

    private boolean U() {
        X xW = this.f26485U.w();
        if (!xW.f26565f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            t0[] t0VarArr = this.f26466B;
            if (i10 >= t0VarArr.length) {
                return true;
            }
            t0 t0Var = t0VarArr[i10];
            n2.s sVar = xW.f26562c[i10];
            if (t0Var.k() != sVar || (sVar != null && !t0Var.p() && !T(t0Var, xW))) {
                break;
            }
            i10++;
        }
        return false;
    }

    private void U0(r0 r0Var) {
        if (r0Var.c() != this.f26476L) {
            this.f26474J.i(15, r0Var).a();
            return;
        }
        s(r0Var);
        int i10 = this.f26494d0.f27449e;
        if (i10 == 3 || i10 == 2) {
            this.f26474J.f(2);
        }
    }

    private static boolean V(boolean z10, r.b bVar, long j10, r.b bVar2, G.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f27812a.equals(bVar2.f27812a)) {
            return (bVar.b() && bVar3.r(bVar.f27813b)) ? (bVar3.h(bVar.f27813b, bVar.f27814c) == 4 || bVar3.h(bVar.f27813b, bVar.f27814c) == 2) ? false : true : bVar2.b() && bVar3.r(bVar2.f27813b);
        }
        return false;
    }

    private void V0(final r0 r0Var) {
        Looper looperC = r0Var.c();
        if (looperC.getThread().isAlive()) {
            this.f26483S.e(looperC, null).c(new Runnable() { // from class: androidx.media3.exoplayer.T
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26462B.c0(r0Var);
                }
            });
        } else {
            X1.n.h("TAG", "Trying to send message on a dead thread.");
            r0Var.k(false);
        }
    }

    private boolean W(X x10) {
        return (x10 == null || x10.r() || x10.l() == Long.MIN_VALUE) ? false : true;
    }

    private void W0(long j10) {
        for (t0 t0Var : this.f26466B) {
            if (t0Var.k() != null) {
                X0(t0Var, j10);
            }
        }
    }

    private static boolean X(t0 t0Var) {
        return t0Var.getState() != 0;
    }

    private void X0(t0 t0Var, long j10) {
        t0Var.v();
        if (t0Var instanceof C4202i) {
            ((C4202i) t0Var).K0(j10);
        }
    }

    private boolean Y() {
        X xT = this.f26485U.t();
        long j10 = xT.f26567h.f26581e;
        return xT.f26565f && (j10 == -9223372036854775807L || this.f26494d0.f27463s < j10 || !s1());
    }

    private void Y0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f26504n0 != z10) {
            this.f26504n0 = z10;
            if (!z10) {
                for (t0 t0Var : this.f26466B) {
                    if (!X(t0Var) && this.f26467C.remove(t0Var)) {
                        t0Var.b();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private static boolean Z(q0 q0Var, G.b bVar) {
        r.b bVar2 = q0Var.f27446b;
        U1.G g10 = q0Var.f27445a;
        return g10.q() || g10.h(bVar2.f27812a, bVar).f16826f;
    }

    private void Z0(U1.A a10) {
        this.f26474J.h(16);
        this.f26481Q.e(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(int i10, boolean z10) {
        this.f26491a0.V(i10, this.f26466B[i10].l(), z10);
    }

    private void a1(b bVar) throws Throwable {
        this.f26495e0.b(1);
        if (bVar.f26520c != -1) {
            this.f26508r0 = new h(new s0(bVar.f26518a, bVar.f26519b), bVar.f26520c, bVar.f26521d);
        }
        O(this.f26486V.D(bVar.f26518a, bVar.f26519b), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean b0() {
        return Boolean.valueOf(this.f26496f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(r0 r0Var) {
        try {
            s(r0Var);
        } catch (ExoPlaybackException e10) {
            X1.n.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void c1(boolean z10) {
        if (z10 == this.f26506p0) {
            return;
        }
        this.f26506p0 = z10;
        if (z10 || !this.f26494d0.f27460p) {
            return;
        }
        this.f26474J.f(2);
    }

    private void d0() {
        boolean zR1 = r1();
        this.f26501k0 = zR1;
        if (zR1) {
            X x10 = (X) C1804a.e(this.f26485U.m());
            x10.e(new W.b().f(x10.C(this.f26509s0)).g(this.f26481Q.h().f16775a).e(this.f26500j0).d());
        }
        z1();
    }

    private void d1(boolean z10) throws ExoPlaybackException {
        this.f26497g0 = z10;
        F0();
        if (!this.f26498h0 || this.f26485U.w() == this.f26485U.t()) {
            return;
        }
        P0(true);
        M(false);
    }

    private void e0() {
        this.f26485U.H();
        X xV = this.f26485U.v();
        if (xV != null) {
            if ((!xV.f26564e || xV.f26565f) && !xV.f26560a.e()) {
                if (this.f26472H.f(this.f26494d0.f27445a, xV.f26567h.f26577a, xV.f26565f ? xV.f26560a.g() : 0L)) {
                    if (xV.f26564e) {
                        xV.e(new W.b().f(xV.C(this.f26509s0)).g(this.f26481Q.h().f16775a).e(this.f26500j0).d());
                    } else {
                        xV.v(this, xV.f26567h.f26578b);
                    }
                }
            }
        }
    }

    private void f0() {
        this.f26495e0.c(this.f26494d0);
        if (this.f26495e0.f26530a) {
            this.f26484T.a(this.f26495e0);
            this.f26495e0 = new e(this.f26494d0);
        }
    }

    private void f1(boolean z10, int i10, boolean z11, int i11) {
        this.f26495e0.b(z11 ? 1 : 0);
        this.f26494d0 = this.f26494d0.e(z10, i11, i10);
        F1(false, false);
        s0(z10);
        if (!s1()) {
            y1();
            D1();
            return;
        }
        int i12 = this.f26494d0.f27449e;
        if (i12 == 3) {
            this.f26481Q.f();
            v1();
            this.f26474J.f(2);
        } else if (i12 == 2) {
            this.f26474J.f(2);
        }
    }

    private void g0(int i10) {
        t0 t0Var = this.f26466B[i10];
        try {
            t0Var.K();
        } catch (IOException | RuntimeException e10) {
            int iL = t0Var.l();
            if (iL != 3 && iL != 5) {
                throw e10;
            }
            C4271D c4271dP = this.f26485U.t().p();
            X1.n.d("ExoPlayerImplInternal", "Disabling track due to error: " + U1.s.i(c4271dP.f47807c[i10].n()), e10);
            C4271D c4271d = new C4271D((d2.G[]) c4271dP.f47806b.clone(), (q2.x[]) c4271dP.f47807c.clone(), c4271dP.f47808d, c4271dP.f47809e);
            c4271d.f47806b[i10] = null;
            c4271d.f47807c[i10] = null;
            t(i10);
            this.f26485U.t().a(c4271d, this.f26494d0.f27463s, false);
        }
    }

    private void h0(final int i10, final boolean z10) {
        boolean[] zArr = this.f26469E;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f26492b0.c(new Runnable() { // from class: androidx.media3.exoplayer.Q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26458B.a0(i10, z10);
                }
            });
        }
    }

    private void h1(U1.A a10) {
        Z0(a10);
        R(this.f26481Q.h(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i0(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.i0(long, long):void");
    }

    private void i1(ExoPlayer.c cVar) {
        this.f26516z0 = cVar;
        this.f26485U.U(this.f26494d0.f27445a, cVar);
    }

    private boolean j0() {
        Y yS;
        this.f26485U.J(this.f26509s0);
        boolean z10 = false;
        if (this.f26485U.S() && (yS = this.f26485U.s(this.f26509s0, this.f26494d0)) != null) {
            X xG = this.f26485U.g(yS);
            if (!xG.f26564e) {
                xG.v(this, yS.f26578b);
            } else if (xG.f26565f) {
                this.f26474J.i(8, xG.f26560a).a();
            }
            if (this.f26485U.t() == xG) {
                G0(yS.f26578b);
            }
            M(false);
            z10 = true;
        }
        if (this.f26501k0) {
            this.f26501k0 = W(this.f26485U.m());
            z1();
        } else {
            d0();
        }
        return z10;
    }

    private void k0() {
        boolean z10;
        X xT = this.f26485U.t();
        if (xT != null) {
            C4271D c4271dP = xT.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f26466B.length) {
                    z10 = true;
                    break;
                }
                if (c4271dP.c(i10)) {
                    if (this.f26466B[i10].l() != 1) {
                        z10 = false;
                        break;
                    } else if (c4271dP.f47806b[i10].f39674a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            c1(z11);
        }
    }

    private void k1(int i10) throws ExoPlaybackException {
        this.f26502l0 = i10;
        if (!this.f26485U.W(this.f26494d0.f27445a, i10)) {
            P0(true);
        }
        M(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.q1()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto Ld
            r14.f0()
        Ld:
            androidx.media3.exoplayer.a0 r1 = r14.f26485U
            androidx.media3.exoplayer.X r1 = r1.b()
            java.lang.Object r1 = X1.C1804a.e(r1)
            androidx.media3.exoplayer.X r1 = (androidx.media3.exoplayer.X) r1
            androidx.media3.exoplayer.q0 r2 = r14.f26494d0
            androidx.media3.exoplayer.source.r$b r2 = r2.f27446b
            java.lang.Object r2 = r2.f27812a
            androidx.media3.exoplayer.Y r3 = r1.f26567h
            androidx.media3.exoplayer.source.r$b r3 = r3.f26577a
            java.lang.Object r3 = r3.f27812a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            androidx.media3.exoplayer.q0 r2 = r14.f26494d0
            androidx.media3.exoplayer.source.r$b r2 = r2.f27446b
            int r4 = r2.f27813b
            r5 = -1
            if (r4 != r5) goto L45
            androidx.media3.exoplayer.Y r4 = r1.f26567h
            androidx.media3.exoplayer.source.r$b r4 = r4.f26577a
            int r6 = r4.f27813b
            if (r6 != r5) goto L45
            int r2 = r2.f27816e
            int r4 = r4.f27816e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            androidx.media3.exoplayer.Y r1 = r1.f26567h
            androidx.media3.exoplayer.source.r$b r5 = r1.f26577a
            long r10 = r1.f26578b
            long r8 = r1.f26579c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            androidx.media3.exoplayer.q0 r1 = r4.S(r5, r6, r8, r10, r12, r13)
            r14.f26494d0 = r1
            r14.F0()
            r14.D1()
            androidx.media3.exoplayer.q0 r1 = r14.f26494d0
            int r1 = r1.f27449e
            r2 = 3
            if (r1 != r2) goto L69
            r14.v1()
        L69:
            r14.p()
            r1 = r3
            goto L2
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.l0():void");
    }

    private void l1(d2.I i10) {
        this.f26493c0 = i10;
    }

    private void m0(boolean z10) {
        if (this.f26516z0.f26359a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f26494d0.f27445a.equals(this.f26465A0)) {
            U1.G g10 = this.f26494d0.f27445a;
            this.f26465A0 = g10;
            this.f26485U.z(g10);
        }
        e0();
    }

    private void n0() {
        X xW = this.f26485U.w();
        if (xW == null) {
            return;
        }
        int i10 = 0;
        if (xW.k() != null && !this.f26498h0) {
            if (U()) {
                if (xW.k().f26565f || this.f26509s0 >= xW.k().n()) {
                    C4271D c4271dP = xW.p();
                    X xC = this.f26485U.c();
                    C4271D c4271dP2 = xC.p();
                    U1.G g10 = this.f26494d0.f27445a;
                    E1(g10, xC.f26567h.f26577a, g10, xW.f26567h.f26577a, -9223372036854775807L, false);
                    if (xC.f26565f && xC.f26560a.q() != -9223372036854775807L) {
                        W0(xC.n());
                        if (xC.s()) {
                            return;
                        }
                        this.f26485U.M(xC);
                        M(false);
                        d0();
                        return;
                    }
                    for (int i11 = 0; i11 < this.f26466B.length; i11++) {
                        boolean zC = c4271dP.c(i11);
                        boolean zC2 = c4271dP2.c(i11);
                        if (zC && !this.f26466B[i11].Q()) {
                            boolean z10 = this.f26468D[i11].l() == -2;
                            d2.G g11 = c4271dP.f47806b[i11];
                            d2.G g12 = c4271dP2.f47806b[i11];
                            if (!zC2 || !g12.equals(g11) || z10) {
                                X0(this.f26466B[i11], xC.n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!xW.f26567h.f26585i && !this.f26498h0) {
            return;
        }
        while (true) {
            t0[] t0VarArr = this.f26466B;
            if (i10 >= t0VarArr.length) {
                return;
            }
            t0 t0Var = t0VarArr[i10];
            n2.s sVar = xW.f26562c[i10];
            if (sVar != null && t0Var.k() == sVar && t0Var.p()) {
                long j10 = xW.f26567h.f26581e;
                X0(t0Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : xW.m() + xW.f26567h.f26581e);
            }
            i10++;
        }
    }

    private void n1(boolean z10) throws ExoPlaybackException {
        this.f26503m0 = z10;
        if (!this.f26485U.X(this.f26494d0.f27445a, z10)) {
            P0(true);
        }
        M(false);
    }

    private void o(b bVar, int i10) throws Throwable {
        this.f26495e0.b(1);
        p0 p0Var = this.f26486V;
        if (i10 == -1) {
            i10 = p0Var.r();
        }
        O(p0Var.f(i10, bVar.f26518a, bVar.f26519b), false);
    }

    private void o0() throws ExoPlaybackException {
        X xW = this.f26485U.w();
        if (xW == null || this.f26485U.t() == xW || xW.f26568i || !B0()) {
            return;
        }
        w();
    }

    private void o1(n2.t tVar) throws Throwable {
        this.f26495e0.b(1);
        O(this.f26486V.E(tVar), false);
    }

    private void p() {
        C4271D c4271dP = this.f26485U.t().p();
        for (int i10 = 0; i10 < this.f26466B.length; i10++) {
            if (c4271dP.c(i10)) {
                this.f26466B[i10].i();
            }
        }
    }

    private void p0() throws Throwable {
        O(this.f26486V.i(), true);
    }

    private void p1(int i10) {
        q0 q0Var = this.f26494d0;
        if (q0Var.f27449e != i10) {
            if (i10 != 2) {
                this.f26515y0 = -9223372036854775807L;
            }
            this.f26494d0 = q0Var.h(i10);
        }
    }

    private void q() throws ExoPlaybackException {
        D0();
    }

    private void q0(c cVar) throws Throwable {
        this.f26495e0.b(1);
        O(this.f26486V.w(cVar.f26522a, cVar.f26523b, cVar.f26524c, cVar.f26525d), false);
    }

    private boolean q1() {
        X xT;
        X xK;
        return s1() && !this.f26498h0 && (xT = this.f26485U.t()) != null && (xK = xT.k()) != null && this.f26509s0 >= xK.n() && xK.f26568i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public X r(Y y10, long j10) {
        return new X(this.f26468D, j10, this.f26470F, this.f26472H.o(), this.f26486V, y10, this.f26471G, this.f26516z0.f26359a);
    }

    private void r0() {
        for (X xT = this.f26485U.t(); xT != null; xT = xT.k()) {
            for (q2.x xVar : xT.p().f47807c) {
                if (xVar != null) {
                    xVar.s();
                }
            }
        }
    }

    private boolean r1() {
        if (!W(this.f26485U.m())) {
            return false;
        }
        X xM = this.f26485U.m();
        long J10 = J(xM.l());
        V.a aVar = new V.a(this.f26489Y, this.f26494d0.f27445a, xM.f26567h.f26577a, xM == this.f26485U.t() ? xM.C(this.f26509s0) : xM.C(this.f26509s0) - xM.f26567h.f26578b, J10, this.f26481Q.h().f16775a, this.f26494d0.f27456l, this.f26499i0, u1(this.f26494d0.f27445a, xM.f26567h.f26577a) ? this.f26487W.c() : -9223372036854775807L);
        boolean zD = this.f26472H.d(aVar);
        X xT = this.f26485U.t();
        if (zD || !xT.f26565f || J10 >= 500000) {
            return zD;
        }
        if (this.f26479O <= 0 && !this.f26480P) {
            return zD;
        }
        xT.f26560a.u(this.f26494d0.f27463s, false);
        return this.f26472H.d(aVar);
    }

    private void s(r0 r0Var) {
        if (r0Var.j()) {
            return;
        }
        try {
            r0Var.g().J(r0Var.i(), r0Var.e());
        } finally {
            r0Var.k(true);
        }
    }

    private void s0(boolean z10) {
        for (X xT = this.f26485U.t(); xT != null; xT = xT.k()) {
            for (q2.x xVar : xT.p().f47807c) {
                if (xVar != null) {
                    xVar.e(z10);
                }
            }
        }
    }

    private boolean s1() {
        q0 q0Var = this.f26494d0;
        return q0Var.f27456l && q0Var.f27458n == 0;
    }

    private void t(int i10) {
        t0 t0Var = this.f26466B[i10];
        if (X(t0Var)) {
            h0(i10, false);
            this.f26481Q.a(t0Var);
            z(t0Var);
            t0Var.g();
            this.f26507q0--;
        }
    }

    private void t0() {
        for (X xT = this.f26485U.t(); xT != null; xT = xT.k()) {
            for (q2.x xVar : xT.p().f47807c) {
                if (xVar != null) {
                    xVar.t();
                }
            }
        }
    }

    private boolean t1(boolean z10) {
        if (this.f26507q0 == 0) {
            return Y();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f26494d0.f27451g) {
            return true;
        }
        X xT = this.f26485U.t();
        long jC = u1(this.f26494d0.f27445a, xT.f26567h.f26577a) ? this.f26487W.c() : -9223372036854775807L;
        X xM = this.f26485U.m();
        boolean z12 = xM.s() && xM.f26567h.f26585i;
        if (xM.f26567h.f26577a.b() && !xM.f26565f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f26472H.a(new V.a(this.f26489Y, this.f26494d0.f27445a, xT.f26567h.f26577a, xT.C(this.f26509s0), J(xM.j()), this.f26481Q.h().f16775a, this.f26494d0.f27456l, this.f26499i0, jC));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.U.u():void");
    }

    private boolean u1(U1.G g10, r.b bVar) {
        if (bVar.b() || g10.q()) {
            return false;
        }
        g10.n(g10.h(bVar.f27812a, this.f26478N).f16823c, this.f26477M);
        if (!this.f26477M.f()) {
            return false;
        }
        G.c cVar = this.f26477M;
        return cVar.f16852i && cVar.f16849f != -9223372036854775807L;
    }

    private void v(int i10, boolean z10, long j10) throws ExoPlaybackException {
        t0 t0Var = this.f26466B[i10];
        if (X(t0Var)) {
            return;
        }
        X xW = this.f26485U.w();
        boolean z11 = xW == this.f26485U.t();
        C4271D c4271dP = xW.p();
        d2.G g10 = c4271dP.f47806b[i10];
        U1.s[] sVarArrD = D(c4271dP.f47807c[i10]);
        boolean z12 = s1() && this.f26494d0.f27449e == 3;
        boolean z13 = !z10 && z12;
        this.f26507q0++;
        this.f26467C.add(t0Var);
        t0Var.t(g10, sVarArrD, xW.f26562c[i10], this.f26509s0, z13, z11, j10, xW.m(), xW.f26567h.f26577a);
        t0Var.J(11, new a());
        this.f26481Q.b(t0Var);
        if (z12 && z11) {
            t0Var.start();
        }
    }

    private void v1() {
        X xT = this.f26485U.t();
        if (xT == null) {
            return;
        }
        C4271D c4271dP = xT.p();
        for (int i10 = 0; i10 < this.f26466B.length; i10++) {
            if (c4271dP.c(i10) && this.f26466B[i10].getState() == 1) {
                this.f26466B[i10].start();
            }
        }
    }

    private void w() throws ExoPlaybackException {
        y(new boolean[this.f26466B.length], this.f26485U.w().n());
    }

    private void w0() {
        this.f26495e0.b(1);
        E0(false, false, false, true);
        this.f26472H.q(this.f26489Y);
        p1(this.f26494d0.f27445a.q() ? 4 : 2);
        this.f26486V.x(this.f26473I.e());
        this.f26474J.f(2);
    }

    private void x1(boolean z10, boolean z11) {
        E0(z10 || !this.f26504n0, false, true, false);
        this.f26495e0.b(z11 ? 1 : 0);
        this.f26472H.i(this.f26489Y);
        p1(1);
    }

    private void y(boolean[] zArr, long j10) throws ExoPlaybackException {
        X xW = this.f26485U.w();
        C4271D c4271dP = xW.p();
        for (int i10 = 0; i10 < this.f26466B.length; i10++) {
            if (!c4271dP.c(i10) && this.f26467C.remove(this.f26466B[i10])) {
                this.f26466B[i10].b();
            }
        }
        for (int i11 = 0; i11 < this.f26466B.length; i11++) {
            if (c4271dP.c(i11)) {
                v(i11, zArr[i11], j10);
            }
        }
        xW.f26568i = true;
    }

    private void y0() {
        try {
            E0(true, false, true, false);
            z0();
            this.f26472H.g(this.f26489Y);
            p1(1);
            this.f26475K.b();
            synchronized (this) {
                this.f26496f0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f26475K.b();
            synchronized (this) {
                this.f26496f0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    private void y1() {
        this.f26481Q.g();
        for (t0 t0Var : this.f26466B) {
            if (X(t0Var)) {
                z(t0Var);
            }
        }
    }

    private void z(t0 t0Var) {
        if (t0Var.getState() == 2) {
            t0Var.stop();
        }
    }

    private void z0() {
        for (int i10 = 0; i10 < this.f26466B.length; i10++) {
            this.f26468D[i10].n();
            this.f26466B[i10].c();
        }
    }

    private void z1() {
        X xM = this.f26485U.m();
        boolean z10 = this.f26501k0 || (xM != null && xM.f26560a.e());
        q0 q0Var = this.f26494d0;
        if (z10 != q0Var.f27451g) {
            this.f26494d0 = q0Var.b(z10);
        }
    }

    public void A(long j10) {
        this.f26514x0 = j10;
    }

    public Looper H() {
        return this.f26476L;
    }

    public void O0(U1.G g10, int i10, long j10) {
        this.f26474J.i(3, new h(g10, i10, j10)).a();
    }

    @Override // q2.AbstractC4270C.a
    public void a(t0 t0Var) {
        this.f26474J.f(26);
    }

    @Override // q2.AbstractC4270C.a
    public void b() {
        this.f26474J.f(10);
    }

    public void b1(List<p0.c> list, int i10, long j10, n2.t tVar) {
        this.f26474J.i(17, new b(list, tVar, i10, j10, null)).a();
    }

    @Override // androidx.media3.exoplayer.p0.d
    public void c() {
        this.f26474J.h(2);
        this.f26474J.f(22);
    }

    @Override // androidx.media3.exoplayer.r0.a
    public synchronized void d(r0 r0Var) {
        if (!this.f26496f0 && this.f26476L.getThread().isAlive()) {
            this.f26474J.i(14, r0Var).a();
            return;
        }
        X1.n.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        r0Var.k(false);
    }

    public void e1(boolean z10, int i10, int i11) {
        this.f26474J.a(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(androidx.media3.exoplayer.source.q qVar) {
        this.f26474J.i(8, qVar).a();
    }

    public void g1(U1.A a10) {
        this.f26474J.i(4, a10).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        X xW;
        int i11;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i12 = message.arg2;
                    f1(z10, i12 >> 4, true, i12 & 15);
                    break;
                case 2:
                    u();
                    break;
                case 3:
                    Q0((h) message.obj);
                    break;
                case 4:
                    h1((U1.A) message.obj);
                    break;
                case 5:
                    l1((d2.I) message.obj);
                    break;
                case 6:
                    x1(false, true);
                    break;
                case 7:
                    y0();
                    return true;
                case 8:
                    P((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case 9:
                    K((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    C0();
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    k1(message.arg1);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    n1(message.arg1 != 0);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    Y0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    T0((r0) message.obj);
                    break;
                case 15:
                    V0((r0) message.obj);
                    break;
                case 16:
                    R((U1.A) message.obj, false);
                    break;
                case 17:
                    a1((b) message.obj);
                    break;
                case 18:
                    o((b) message.obj, message.arg1);
                    break;
                case 19:
                    q0((c) message.obj);
                    break;
                case 20:
                    A0(message.arg1, message.arg2, (n2.t) message.obj);
                    break;
                case 21:
                    o1((n2.t) message.obj);
                    break;
                case 22:
                    p0();
                    break;
                case 23:
                    d1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    q();
                    break;
                case 26:
                    D0();
                    break;
                case 27:
                    B1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    i1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    w0();
                    break;
            }
        } catch (ParserException e10) {
            int i13 = e10.f26024C;
            if (i13 == 1) {
                i11 = e10.f26023B ? 3001 : 3003;
            } else {
                if (i13 == 4) {
                    i11 = e10.f26023B ? 3002 : 3004;
                }
                L(e10, i);
            }
            i = i11;
            L(e10, i);
        } catch (DataSourceException e11) {
            L(e11, e11.f26131B);
        } catch (ExoPlaybackException e12) {
            ExoPlaybackException exoPlaybackExceptionA = e12;
            if (exoPlaybackExceptionA.f26315K == 1 && (xW = this.f26485U.w()) != null) {
                exoPlaybackExceptionA = exoPlaybackExceptionA.a(xW.f26567h.f26577a);
            }
            if (exoPlaybackExceptionA.f26321Q && (this.f26513w0 == null || (i10 = exoPlaybackExceptionA.f26031B) == 5004 || i10 == 5003)) {
                X1.n.i("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackExceptionA);
                ExoPlaybackException exoPlaybackException = this.f26513w0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(exoPlaybackExceptionA);
                    exoPlaybackExceptionA = this.f26513w0;
                } else {
                    this.f26513w0 = exoPlaybackExceptionA;
                }
                InterfaceC1813j interfaceC1813j = this.f26474J;
                interfaceC1813j.b(interfaceC1813j.i(25, exoPlaybackExceptionA));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.f26513w0;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackExceptionA);
                    exoPlaybackExceptionA = this.f26513w0;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackExceptionA;
                X1.n.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException3);
                if (exoPlaybackException3.f26315K == 1 && this.f26485U.t() != this.f26485U.w()) {
                    while (this.f26485U.t() != this.f26485U.w()) {
                        this.f26485U.b();
                    }
                    X x10 = (X) C1804a.e(this.f26485U.t());
                    f0();
                    Y y10 = x10.f26567h;
                    r.b bVar = y10.f26577a;
                    long j10 = y10.f26578b;
                    this.f26494d0 = S(bVar, j10, y10.f26579c, j10, true, 0);
                }
                x1(true, false);
                this.f26494d0 = this.f26494d0.f(exoPlaybackException3);
            }
        } catch (DrmSession.DrmSessionException e13) {
            L(e13, e13.f27106B);
        } catch (BehindLiveWindowException e14) {
            L(e14, 1002);
        } catch (IOException e15) {
            L(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionD = ExoPlaybackException.d(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            X1.n.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionD);
            x1(true, false);
            this.f26494d0 = this.f26494d0.f(exoPlaybackExceptionD);
        }
        f0();
        return true;
    }

    public void j1(int i10) {
        this.f26474J.a(11, i10, 0).a();
    }

    public void m1(boolean z10) {
        this.f26474J.a(12, z10 ? 1 : 0, 0).a();
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void i(androidx.media3.exoplayer.source.q qVar) {
        this.f26474J.i(9, qVar).a();
    }

    public void v0() {
        this.f26474J.d(29).a();
    }

    public void w1() {
        this.f26474J.d(6).a();
    }

    @Override // androidx.media3.exoplayer.C2126h.a
    public void x(U1.A a10) {
        this.f26474J.i(16, a10).a();
    }

    public synchronized boolean x0() {
        if (!this.f26496f0 && this.f26476L.getThread().isAlive()) {
            this.f26474J.f(7);
            H1(new l8.s() { // from class: androidx.media3.exoplayer.P
                @Override // l8.s
                public final Object get() {
                    return this.f26457B.b0();
                }
            }, this.f26488X);
            return this.f26496f0;
        }
        return true;
    }
}
