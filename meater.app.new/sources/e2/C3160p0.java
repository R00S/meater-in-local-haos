package e2;

import U1.B;
import U1.G;
import X1.C1804a;
import X1.C1816m;
import X1.InterfaceC1807d;
import X1.InterfaceC1813j;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.r;
import d2.C3030b;
import d2.C3031c;
import e2.InterfaceC3131b;
import java.io.IOException;
import java.util.List;
import l8.C3918k;
import m8.AbstractC4009y;
import m8.AbstractC4010z;
import m8.C3982E;

/* compiled from: DefaultAnalyticsCollector.java */
/* renamed from: e2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3160p0 implements InterfaceC3129a {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1807d f40205B;

    /* renamed from: C, reason: collision with root package name */
    private final G.b f40206C;

    /* renamed from: D, reason: collision with root package name */
    private final G.c f40207D;

    /* renamed from: E, reason: collision with root package name */
    private final a f40208E;

    /* renamed from: F, reason: collision with root package name */
    private final SparseArray<InterfaceC3131b.a> f40209F;

    /* renamed from: G, reason: collision with root package name */
    private C1816m<InterfaceC3131b> f40210G;

    /* renamed from: H, reason: collision with root package name */
    private U1.B f40211H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC1813j f40212I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f40213J;

    /* compiled from: DefaultAnalyticsCollector.java */
    /* renamed from: e2.p0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final G.b f40214a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4009y<r.b> f40215b = AbstractC4009y.G();

        /* renamed from: c, reason: collision with root package name */
        private AbstractC4010z<r.b, U1.G> f40216c = AbstractC4010z.l();

        /* renamed from: d, reason: collision with root package name */
        private r.b f40217d;

        /* renamed from: e, reason: collision with root package name */
        private r.b f40218e;

        /* renamed from: f, reason: collision with root package name */
        private r.b f40219f;

        public a(G.b bVar) {
            this.f40214a = bVar;
        }

        private void b(AbstractC4010z.a<r.b, U1.G> aVar, r.b bVar, U1.G g10) {
            if (bVar == null) {
                return;
            }
            if (g10.b(bVar.f27812a) != -1) {
                aVar.g(bVar, g10);
                return;
            }
            U1.G g11 = this.f40216c.get(bVar);
            if (g11 != null) {
                aVar.g(bVar, g11);
            }
        }

        private static r.b c(U1.B b10, AbstractC4009y<r.b> abstractC4009y, r.b bVar, G.b bVar2) {
            U1.G gX = b10.X();
            int iS = b10.s();
            Object objM = gX.q() ? null : gX.m(iS);
            int iD = (b10.k() || gX.q()) ? -1 : gX.f(iS, bVar2).d(X1.L.Q0(b10.i0()) - bVar2.n());
            for (int i10 = 0; i10 < abstractC4009y.size(); i10++) {
                r.b bVar3 = abstractC4009y.get(i10);
                if (i(bVar3, objM, b10.k(), b10.P(), b10.y(), iD)) {
                    return bVar3;
                }
            }
            if (abstractC4009y.isEmpty() && bVar != null) {
                if (i(bVar, objM, b10.k(), b10.P(), b10.y(), iD)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(r.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f27812a.equals(obj)) {
                return (z10 && bVar.f27813b == i10 && bVar.f27814c == i11) || (!z10 && bVar.f27813b == -1 && bVar.f27816e == i12);
            }
            return false;
        }

        private void m(U1.G g10) {
            AbstractC4010z.a<r.b, U1.G> aVarA = AbstractC4010z.a();
            if (this.f40215b.isEmpty()) {
                b(aVarA, this.f40218e, g10);
                if (!C3918k.a(this.f40219f, this.f40218e)) {
                    b(aVarA, this.f40219f, g10);
                }
                if (!C3918k.a(this.f40217d, this.f40218e) && !C3918k.a(this.f40217d, this.f40219f)) {
                    b(aVarA, this.f40217d, g10);
                }
            } else {
                for (int i10 = 0; i10 < this.f40215b.size(); i10++) {
                    b(aVarA, this.f40215b.get(i10), g10);
                }
                if (!this.f40215b.contains(this.f40217d)) {
                    b(aVarA, this.f40217d, g10);
                }
            }
            this.f40216c = aVarA.d();
        }

        public r.b d() {
            return this.f40217d;
        }

        public r.b e() {
            if (this.f40215b.isEmpty()) {
                return null;
            }
            return (r.b) C3982E.e(this.f40215b);
        }

        public U1.G f(r.b bVar) {
            return this.f40216c.get(bVar);
        }

        public r.b g() {
            return this.f40218e;
        }

        public r.b h() {
            return this.f40219f;
        }

        public void j(U1.B b10) {
            this.f40217d = c(b10, this.f40215b, this.f40218e, this.f40214a);
        }

        public void k(List<r.b> list, r.b bVar, U1.B b10) {
            this.f40215b = AbstractC4009y.B(list);
            if (!list.isEmpty()) {
                this.f40218e = list.get(0);
                this.f40219f = (r.b) C1804a.e(bVar);
            }
            if (this.f40217d == null) {
                this.f40217d = c(b10, this.f40215b, this.f40218e, this.f40214a);
            }
            m(b10.X());
        }

        public void l(U1.B b10) {
            this.f40217d = c(b10, this.f40215b, this.f40218e, this.f40214a);
            m(b10.X());
        }
    }

    public C3160p0(InterfaceC1807d interfaceC1807d) {
        this.f40205B = (InterfaceC1807d) C1804a.e(interfaceC1807d);
        this.f40210G = new C1816m<>(X1.L.V(), interfaceC1807d, new C1816m.b() { // from class: e2.t
            @Override // X1.C1816m.b
            public final void a(Object obj, U1.q qVar) {
                C3160p0.K1((InterfaceC3131b) obj, qVar);
            }
        });
        G.b bVar = new G.b();
        this.f40206C = bVar;
        this.f40207D = new G.c();
        this.f40208E = new a(bVar);
        this.f40209F = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A2(InterfaceC3131b.a aVar, int i10, B.e eVar, B.e eVar2, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.j0(aVar, i10);
        interfaceC3131b.f(aVar, eVar, eVar2, i10);
    }

    private InterfaceC3131b.a E1(r.b bVar) {
        C1804a.e(this.f40211H);
        U1.G gF = bVar == null ? null : this.f40208E.f(bVar);
        if (bVar != null && gF != null) {
            return D1(gF, gF.h(bVar.f27812a, this.f40206C).f16823c, bVar);
        }
        int iQ = this.f40211H.Q();
        U1.G gX = this.f40211H.X();
        if (iQ >= gX.p()) {
            gX = U1.G.f16812a;
        }
        return D1(gX, iQ, null);
    }

    private InterfaceC3131b.a F1() {
        return E1(this.f40208E.e());
    }

    private InterfaceC3131b.a G1(int i10, r.b bVar) {
        C1804a.e(this.f40211H);
        if (bVar != null) {
            return this.f40208E.f(bVar) != null ? E1(bVar) : D1(U1.G.f16812a, i10, bVar);
        }
        U1.G gX = this.f40211H.X();
        if (i10 >= gX.p()) {
            gX = U1.G.f16812a;
        }
        return D1(gX, i10, null);
    }

    private InterfaceC3131b.a H1() {
        return E1(this.f40208E.g());
    }

    private InterfaceC3131b.a I1() {
        return E1(this.f40208E.h());
    }

    private InterfaceC3131b.a J1(PlaybackException playbackException) {
        r.b bVar;
        return (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).f26320P) == null) ? C1() : E1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M2(InterfaceC3131b.a aVar, String str, long j10, long j11, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.w(aVar, str, j10);
        interfaceC3131b.g(aVar, str, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(InterfaceC3131b.a aVar, String str, long j10, long j11, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.j(aVar, str, j10);
        interfaceC3131b.l(aVar, str, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S2(InterfaceC3131b.a aVar, U1.N n10, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.h0(aVar, n10);
        interfaceC3131b.q(aVar, n10.f16986a, n10.f16987b, 0, n10.f16989d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U2(U1.B b10, InterfaceC3131b interfaceC3131b, U1.q qVar) {
        interfaceC3131b.g0(b10, new InterfaceC3131b.C0509b(qVar, this.f40209F));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V2() {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 1028, new C1816m.a() { // from class: e2.M
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).T(aVarC1);
            }
        });
        this.f40210G.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g2(InterfaceC3131b.a aVar, int i10, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.M(aVar);
        interfaceC3131b.b(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k2(InterfaceC3131b.a aVar, boolean z10, InterfaceC3131b interfaceC3131b) {
        interfaceC3131b.o(aVar, z10);
        interfaceC3131b.n0(aVar, z10);
    }

    @Override // e2.InterfaceC3129a
    public final void A(final int i10, final long j10, final long j11) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1011, new C1816m.a() { // from class: e2.O
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).p(aVarI1, i10, j10, j11);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void B(final long j10, final int i10) {
        final InterfaceC3131b.a aVarH1 = H1();
        W2(aVarH1, 1021, new C1816m.a() { // from class: e2.u
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).z(aVarH1, j10, i10);
            }
        });
    }

    @Override // U1.B.d
    public final void C(final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 6, new C1816m.a() { // from class: e2.l
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).s(aVarC1, i10);
            }
        });
    }

    protected final InterfaceC3131b.a C1() {
        return E1(this.f40208E.d());
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void D(int i10, r.b bVar, final n2.j jVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1005, new C1816m.a() { // from class: e2.i0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).y(aVarG1, jVar);
            }
        });
    }

    protected final InterfaceC3131b.a D1(U1.G g10, int i10, r.b bVar) {
        r.b bVar2 = g10.q() ? null : bVar;
        long jC = this.f40205B.c();
        boolean z10 = g10.equals(this.f40211H.X()) && i10 == this.f40211H.Q();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f40211H.I();
            } else if (!g10.q()) {
                jB = g10.n(i10, this.f40207D).b();
            }
        } else if (z10 && this.f40211H.P() == bVar2.f27813b && this.f40211H.y() == bVar2.f27814c) {
            jB = this.f40211H.i0();
        }
        return new InterfaceC3131b.a(jC, g10, i10, bVar2, jB, this.f40211H.X(), this.f40211H.Q(), this.f40208E.d(), this.f40211H.i0(), this.f40211H.l());
    }

    @Override // e2.InterfaceC3129a
    public final void G(List<r.b> list, r.b bVar) {
        this.f40208E.k(list, bVar, (U1.B) C1804a.e(this.f40211H));
    }

    @Override // U1.B.d
    public final void H(U1.G g10, final int i10) {
        this.f40208E.l((U1.B) C1804a.e(this.f40211H));
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 0, new C1816m.a() { // from class: e2.o0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).l0(aVarC1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void I(int i10, r.b bVar, final n2.j jVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1004, new C1816m.a() { // from class: e2.L
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).m0(aVarG1, jVar);
            }
        });
    }

    @Override // U1.B.d
    public final void J(final boolean z10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 3, new C1816m.a() { // from class: e2.l0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.k2(aVarC1, z10, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // U1.B.d
    public void K(final U1.K k10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 2, new C1816m.a() { // from class: e2.n
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).Y(aVarC1, k10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void L(int i10, r.b bVar, final n2.i iVar, final n2.j jVar, final IOException iOException, final boolean z10) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1003, new C1816m.a() { // from class: e2.P
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).a(aVarG1, iVar, jVar, iOException, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void M(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1000, new C1816m.a() { // from class: e2.N
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).r0(aVarG1, iVar, jVar);
            }
        });
    }

    @Override // U1.B.d
    public final void N(final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 4, new C1816m.a() { // from class: e2.x
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).O(aVarC1, i10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void O(InterfaceC3131b interfaceC3131b) {
        C1804a.e(interfaceC3131b);
        this.f40210G.c(interfaceC3131b);
    }

    @Override // r2.d.a
    public final void P(final int i10, final long j10, final long j11) {
        final InterfaceC3131b.a aVarF1 = F1();
        W2(aVarF1, 1006, new C1816m.a() { // from class: e2.b0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).V(aVarF1, i10, j10, j11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void Q(int i10, r.b bVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1025, new C1816m.a() { // from class: e2.h0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).F(aVarG1);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void R() {
        if (this.f40213J) {
            return;
        }
        final InterfaceC3131b.a aVarC1 = C1();
        this.f40213J = true;
        W2(aVarC1, -1, new C1816m.a() { // from class: e2.A
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).D(aVarC1);
            }
        });
    }

    @Override // U1.B.d
    public final void S(final boolean z10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 9, new C1816m.a() { // from class: e2.a0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).G(aVarC1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void T(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1002, new C1816m.a() { // from class: e2.S
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).C(aVarG1, iVar, jVar);
            }
        });
    }

    @Override // U1.B.d
    public final void U(final B.e eVar, final B.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f40213J = false;
        }
        this.f40208E.j((U1.B) C1804a.e(this.f40211H));
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 11, new C1816m.a() { // from class: e2.C
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.A2(aVarC1, i10, eVar, eVar2, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void V(final int i10, final int i11, final boolean z10) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1033, new C1816m.a() { // from class: e2.r
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).n(aVarI1, i10, i11, z10);
            }
        });
    }

    @Override // U1.B.d
    public void W(final B.b bVar) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 13, new C1816m.a() { // from class: e2.n0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).W(aVarC1, bVar);
            }
        });
    }

    protected final void W2(InterfaceC3131b.a aVar, int i10, C1816m.a<InterfaceC3131b> aVar2) {
        this.f40209F.put(i10, aVar);
        this.f40210G.l(i10, aVar2);
    }

    @Override // U1.B.d
    public void X(final int i10, final boolean z10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 30, new C1816m.a() { // from class: e2.Q
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).k0(aVarC1, i10, z10);
            }
        });
    }

    @Override // U1.B.d
    public final void Y(final boolean z10, final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, -1, new C1816m.a() { // from class: e2.g
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).k(aVarC1, z10, i10);
            }
        });
    }

    @Override // U1.B.d
    public void Z(final U1.x xVar) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 14, new C1816m.a() { // from class: e2.V
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).u(aVarC1, xVar);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void a(final AudioSink.a aVar) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1031, new C1816m.a() { // from class: e2.f0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).H(aVarI1, aVar);
            }
        });
    }

    @Override // U1.B.d
    public final void a0(final U1.v vVar, final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 1, new C1816m.a() { // from class: e2.d
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).d(aVarC1, vVar, i10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void b(final AudioSink.a aVar) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1032, new C1816m.a() { // from class: e2.k0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).f0(aVarI1, aVar);
            }
        });
    }

    @Override // U1.B.d
    public void b0(final U1.J j10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 19, new C1816m.a() { // from class: e2.c0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).J(aVarC1, j10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void c() {
        ((InterfaceC1813j) C1804a.i(this.f40212I)).c(new Runnable() { // from class: e2.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f40079B.V2();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void c0(int i10, r.b bVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1023, new C1816m.a() { // from class: e2.j0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).b0(aVarG1);
            }
        });
    }

    @Override // U1.B.d
    public final void d(final U1.N n10) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 25, new C1816m.a() { // from class: e2.X
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.S2(aVarI1, n10, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // U1.B.d
    public final void e(final boolean z10) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 23, new C1816m.a() { // from class: e2.d0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).U(aVarI1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void e0(int i10, r.b bVar, final n2.i iVar, final n2.j jVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1001, new C1816m.a() { // from class: e2.W
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).c(aVarG1, iVar, jVar);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void f(final Exception exc) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1014, new C1816m.a() { // from class: e2.I
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).S(aVarI1, exc);
            }
        });
    }

    @Override // U1.B.d
    public void f0(final PlaybackException playbackException) {
        final InterfaceC3131b.a aVarJ1 = J1(playbackException);
        W2(aVarJ1, 10, new C1816m.a() { // from class: e2.p
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).p0(aVarJ1, playbackException);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void g(final String str) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1019, new C1816m.a() { // from class: e2.m
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).A(aVarI1, str);
            }
        });
    }

    @Override // U1.B.d
    public final void g0(final boolean z10, final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 5, new C1816m.a() { // from class: e2.q
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).x(aVarC1, z10, i10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void h(final String str, final long j10, final long j11) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1016, new C1816m.a() { // from class: e2.H
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.M2(aVarI1, str, j11, j10, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void h0(int i10, r.b bVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1027, new C1816m.a() { // from class: e2.Z
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).P(aVarG1);
            }
        });
    }

    @Override // U1.B.d
    public void i(final W1.b bVar) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 27, new C1816m.a() { // from class: e2.J
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).d0(aVarC1, bVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void i0(int i10, r.b bVar, final int i11) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1022, new C1816m.a() { // from class: e2.T
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.g2(aVarG1, i11, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void j(final C3030b c3030b) {
        final InterfaceC3131b.a aVarH1 = H1();
        W2(aVarH1, 1020, new C1816m.a() { // from class: e2.y
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).K(aVarH1, c3030b);
            }
        });
    }

    @Override // U1.B.d
    public final void j0(final PlaybackException playbackException) {
        final InterfaceC3131b.a aVarJ1 = J1(playbackException);
        W2(aVarJ1, 10, new C1816m.a() { // from class: e2.v
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).t0(aVarJ1, playbackException);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void k(final String str) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1012, new C1816m.a() { // from class: e2.m0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).L(aVarI1, str);
            }
        });
    }

    @Override // U1.B.d
    public final void k0(final int i10, final int i11) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 24, new C1816m.a() { // from class: e2.K
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).i0(aVarI1, i10, i11);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void l(final String str, final long j10, final long j11) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1008, new C1816m.a() { // from class: e2.k
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                C3160p0.N1(aVarI1, str, j11, j10, (InterfaceC3131b) obj);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public void l0(final U1.B b10, Looper looper) {
        C1804a.g(this.f40211H == null || this.f40208E.f40215b.isEmpty());
        this.f40211H = (U1.B) C1804a.e(b10);
        this.f40212I = this.f40205B.e(looper, null);
        this.f40210G = this.f40210G.e(looper, new C1816m.b() { // from class: e2.f
            @Override // X1.C1816m.b
            public final void a(Object obj, U1.q qVar) {
                this.f40161a.U2(b10, (InterfaceC3131b) obj, qVar);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void m(final int i10, final long j10) {
        final InterfaceC3131b.a aVarH1 = H1();
        W2(aVarH1, 1018, new C1816m.a() { // from class: e2.o
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).E(aVarH1, i10, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void m0(int i10, r.b bVar) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1026, new C1816m.a() { // from class: e2.e0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).e0(aVarG1);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void n(final C3030b c3030b) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1007, new C1816m.a() { // from class: e2.g0
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).r(aVarI1, c3030b);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void n0(int i10, r.b bVar, final Exception exc) {
        final InterfaceC3131b.a aVarG1 = G1(i10, bVar);
        W2(aVarG1, 1024, new C1816m.a() { // from class: e2.U
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).h(aVarG1, exc);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void o(final C3030b c3030b) {
        final InterfaceC3131b.a aVarH1 = H1();
        W2(aVarH1, 1013, new C1816m.a() { // from class: e2.w
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).o0(aVarH1, c3030b);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void p(final Object obj, final long j10) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 26, new C1816m.a() { // from class: e2.Y
            @Override // X1.C1816m.a
            public final void invoke(Object obj2) {
                ((InterfaceC3131b) obj2).e(aVarI1, obj, j10);
            }
        });
    }

    @Override // U1.B.d
    public void p0(final boolean z10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 7, new C1816m.a() { // from class: e2.j
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).R(aVarC1, z10);
            }
        });
    }

    @Override // U1.B.d
    public final void q(final int i10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 8, new C1816m.a() { // from class: e2.F
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).v(aVarC1, i10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void r(final U1.s sVar, final C3031c c3031c) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1017, new C1816m.a() { // from class: e2.z
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).m(aVarI1, sVar, c3031c);
            }
        });
    }

    @Override // U1.B.d
    public void s(final List<W1.a> list) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 27, new C1816m.a() { // from class: e2.s
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).Q(aVarC1, list);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void t(final long j10) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1010, new C1816m.a() { // from class: e2.i
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).t(aVarI1, j10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void u(final U1.s sVar, final C3031c c3031c) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1009, new C1816m.a() { // from class: e2.B
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).i(aVarI1, sVar, c3031c);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void v(final Exception exc) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1029, new C1816m.a() { // from class: e2.G
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).q0(aVarI1, exc);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void w(final Exception exc) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1030, new C1816m.a() { // from class: e2.e
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).N(aVarI1, exc);
            }
        });
    }

    @Override // U1.B.d
    public final void x(final U1.A a10) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 12, new C1816m.a() { // from class: e2.c
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).c0(aVarC1, a10);
            }
        });
    }

    @Override // e2.InterfaceC3129a
    public final void y(final C3030b c3030b) {
        final InterfaceC3131b.a aVarI1 = I1();
        W2(aVarI1, 1015, new C1816m.a() { // from class: e2.D
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).X(aVarI1, c3030b);
            }
        });
    }

    @Override // U1.B.d
    public final void z(final U1.y yVar) {
        final InterfaceC3131b.a aVarC1 = C1();
        W2(aVarC1, 28, new C1816m.a() { // from class: e2.h
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((InterfaceC3131b) obj).Z(aVarC1, yVar);
            }
        });
    }

    @Override // U1.B.d
    public void d0() {
    }

    @Override // U1.B.d
    public void E(boolean z10) {
    }

    @Override // U1.B.d
    public void F(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(InterfaceC3131b interfaceC3131b, U1.q qVar) {
    }

    @Override // U1.B.d
    public void o0(U1.B b10, B.c cVar) {
    }
}
