package A0;

import A0.G;
import A0.m0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import x0.C5047a;

/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001f\u0010\u0016\u001a\u00020\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0005J$\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0019J+\u0010/\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0019J\u001f\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\"J\u001f\u00103\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\"J\u001f\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\"J\u001b\u00105\u001a\u00020\f*\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010;R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010CR\u001e\u0010N\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010PR\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0018\u0010Y\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0018\u0010]\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010XR\u0018\u0010_\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"LA0/S;", "", "LA0/G;", "root", "<init>", "(LA0/G;)V", "LU0/b;", "constraints", "Loa/F;", "I", "(J)V", "layoutNode", "", "forced", "D", "(LA0/G;Z)Z", "G", "C", "F", "E", "Lkotlin/Function0;", "onLayout", "r", "(LBa/a;)Z", "t", "()V", "s", "(LA0/G;J)V", "LA0/m0$b;", "listener", "x", "(LA0/m0$b;)V", "affectsLookahead", "i", "(LA0/G;Z)V", "forceDispatch", "c", "(Z)V", "node", "v", "e", "(LA0/G;LU0/b;)Z", "f", "A", "h", "b", "relayoutNeeded", "y", "(LA0/G;ZZ)Z", "g", "B", "w", "j", "u", "a", "LA0/G;", "LA0/o;", "LA0/o;", "relayoutNodes", "Z", "duringMeasureLayout", "d", "duringFullMeasureLayoutPass", "LA0/k0;", "LA0/k0;", "onPositionedDispatcher", "LQ/b;", "LQ/b;", "onLayoutCompletedListeners", "", "<set-?>", "J", "q", "()J", "measureIteration", "LA0/S$a;", "postponedMeasureRequests", "LU0/b;", "rootConstraints", "LA0/N;", "LA0/N;", "consistencyChecker", "m", "()Z", "hasPendingMeasureOrLayout", "n", "hasPendingOnPositionedCallbacks", "o", "(LA0/G;)Z", "measureAffectsParent", "k", "canAffectParent", "l", "canAffectParentInLookahead", "p", "measureAffectsParentLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0836o relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 onPositionedDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Q.b<m0.b> onLayoutCompletedListeners;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a> postponedMeasureRequests;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private U0.b rootConstraints;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final N consistencyChecker;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"LA0/S$a;", "", "LA0/G;", "node", "", "isLookahead", "isForced", "<init>", "(LA0/G;ZZ)V", "a", "LA0/G;", "()LA0/G;", "b", "Z", "c", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final G node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        public a(G g10, boolean z10, boolean z11) {
            this.node = g10;
            this.isLookahead = z10;
            this.isForced = z11;
        }

        /* renamed from: a, reason: from getter */
        public final G getNode() {
            return this.node;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f490a;

        static {
            int[] iArr = new int[G.e.values().length];
            try {
                iArr[G.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f490a = iArr;
        }
    }

    public S(G g10) {
        this.root = g10;
        m0.Companion companion = m0.INSTANCE;
        C0836o c0836o = new C0836o(companion.a());
        this.relayoutNodes = c0836o;
        this.onPositionedDispatcher = new k0();
        this.onLayoutCompletedListeners = new Q.b<>(new m0.b[16], 0);
        this.measureIteration = 1L;
        Q.b<a> bVar = new Q.b<>(new a[16], 0);
        this.postponedMeasureRequests = bVar;
        this.consistencyChecker = companion.a() ? new N(g10, c0836o, bVar.j()) : null;
    }

    private final void A(G layoutNode) {
        Q.b<G> bVarW0 = layoutNode.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if (o(g10)) {
                    if (M.a(g10)) {
                        B(g10, true);
                    } else {
                        A(g10);
                    }
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void B(G layoutNode, boolean affectsLookahead) {
        U0.b bVar;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            C3862t.d(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            e(layoutNode, bVar);
        } else {
            f(layoutNode, bVar);
        }
    }

    public static /* synthetic */ boolean H(S s10, G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s10.G(g10, z10);
    }

    private final void b() {
        Q.b<m0.b> bVar = this.onLayoutCompletedListeners;
        int size = bVar.getSize();
        if (size > 0) {
            m0.b[] bVarArrT = bVar.t();
            int i10 = 0;
            do {
                bVarArrT[i10].d();
                i10++;
            } while (i10 < size);
        }
        this.onLayoutCompletedListeners.l();
    }

    public static /* synthetic */ void d(S s10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s10.c(z10);
    }

    private final boolean e(G layoutNode, U0.b constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zP0 = constraints != null ? layoutNode.P0(constraints) : G.Q0(layoutNode, null, 1, null);
        G gO0 = layoutNode.o0();
        if (zP0 && gO0 != null) {
            if (gO0.getLookaheadRoot() == null) {
                G.w1(gO0, false, false, false, 3, null);
            } else if (layoutNode.h0() == G.g.InMeasureBlock) {
                G.s1(gO0, false, false, false, 3, null);
            } else if (layoutNode.h0() == G.g.InLayoutBlock) {
                G.q1(gO0, false, 1, null);
            }
        }
        return zP0;
    }

    private final boolean f(G layoutNode, U0.b constraints) {
        boolean zK1 = constraints != null ? layoutNode.k1(constraints) : G.l1(layoutNode, null, 1, null);
        G gO0 = layoutNode.o0();
        if (zK1 && gO0 != null) {
            if (layoutNode.g0() == G.g.InMeasureBlock) {
                G.w1(gO0, false, false, false, 3, null);
            } else if (layoutNode.g0() == G.g.InLayoutBlock) {
                G.u1(gO0, false, 1, null);
            }
        }
        return zK1;
    }

    private final void g() {
        if (this.postponedMeasureRequests.y()) {
            Q.b<a> bVar = this.postponedMeasureRequests;
            int size = bVar.getSize();
            if (size > 0) {
                a[] aVarArrT = bVar.t();
                int i10 = 0;
                do {
                    a aVar = aVarArrT[i10];
                    if (aVar.getNode().K0()) {
                        if (aVar.getIsLookahead()) {
                            G.s1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                        } else {
                            G.w1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
            this.postponedMeasureRequests.l();
        }
    }

    private final void h(G layoutNode) {
        Q.b<G> bVarW0 = layoutNode.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if (C3862t.b(g10.N0(), Boolean.TRUE) && !g10.getIsDeactivated()) {
                    if (this.relayoutNodes.e(g10, true)) {
                        g10.R0();
                    }
                    h(g10);
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void j(G layoutNode, boolean affectsLookahead) {
        Q.b<G> bVarW0 = layoutNode.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if ((!affectsLookahead && o(g10)) || (affectsLookahead && p(g10))) {
                    if (M.a(g10) && !affectsLookahead) {
                        if (g10.Y() && this.relayoutNodes.e(g10, true)) {
                            y(g10, true, false);
                        } else {
                            i(g10, true);
                        }
                    }
                    w(g10, affectsLookahead);
                    if (!u(g10, affectsLookahead)) {
                        j(g10, affectsLookahead);
                    }
                }
                i10++;
            } while (i10 < size);
        }
        w(layoutNode, affectsLookahead);
    }

    private final boolean k(G g10) {
        return g10.e0() && o(g10);
    }

    private final boolean l(G g10) {
        return g10.Y() && p(g10);
    }

    private final boolean o(G g10) {
        return g10.g0() == G.g.InMeasureBlock || g10.getLayoutDelegate().r().getAlignmentLines().k();
    }

    private final boolean p(G g10) {
        AbstractC0818a abstractC0818aD;
        if (g10.h0() == G.g.InMeasureBlock) {
            return true;
        }
        InterfaceC0820b interfaceC0820bC = g10.getLayoutDelegate().C();
        return (interfaceC0820bC == null || (abstractC0818aD = interfaceC0820bC.getAlignmentLines()) == null || !abstractC0818aD.k()) ? false : true;
    }

    private final boolean u(G g10, boolean z10) {
        return z10 ? g10.Y() : g10.e0();
    }

    private final void w(G node, boolean affectsLookahead) {
        if (u(node, affectsLookahead) && this.relayoutNodes.e(node, affectsLookahead)) {
            y(node, affectsLookahead, false);
        }
    }

    private final boolean y(G layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        U0.b bVar;
        G gO0;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (layoutNode.o() || layoutNode.M0() || k(layoutNode) || C3862t.b(layoutNode.N0(), Boolean.TRUE) || l(layoutNode) || layoutNode.C()) {
            if (layoutNode == this.root) {
                bVar = this.rootConstraints;
                C3862t.d(bVar);
            } else {
                bVar = null;
            }
            if (affectsLookahead) {
                zE = layoutNode.Y() ? e(layoutNode, bVar) : false;
                if (relayoutNeeded && ((zE || layoutNode.X()) && C3862t.b(layoutNode.N0(), Boolean.TRUE))) {
                    layoutNode.R0();
                }
            } else {
                boolean zF = layoutNode.e0() ? f(layoutNode, bVar) : false;
                if (relayoutNeeded && layoutNode.V() && (layoutNode == this.root || ((gO0 = layoutNode.o0()) != null && gO0.o() && layoutNode.M0()))) {
                    if (layoutNode == this.root) {
                        layoutNode.i1(0, 0);
                    } else {
                        layoutNode.o1();
                    }
                    this.onPositionedDispatcher.d(layoutNode);
                    N n10 = this.consistencyChecker;
                    if (n10 != null) {
                        n10.a();
                    }
                }
                zE = zF;
            }
            g();
        }
        return zE;
    }

    static /* synthetic */ boolean z(S s10, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return s10.y(g10, z10, z11);
    }

    public final boolean C(G layoutNode, boolean forced) {
        int i10 = b.f490a[layoutNode.W().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.Y() || layoutNode.X()) && !forced) {
                N n10 = this.consistencyChecker;
                if (n10 == null) {
                    return false;
                }
                n10.a();
                return false;
            }
            layoutNode.T0();
            layoutNode.S0();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            G gO0 = layoutNode.o0();
            if (C3862t.b(layoutNode.N0(), Boolean.TRUE) && ((gO0 == null || !gO0.Y()) && (gO0 == null || !gO0.X()))) {
                this.relayoutNodes.c(layoutNode, true);
            } else if (layoutNode.o() && ((gO0 == null || !gO0.V()) && (gO0 == null || !gO0.e0()))) {
                this.relayoutNodes.c(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        N n11 = this.consistencyChecker;
        if (n11 == null) {
            return false;
        }
        n11.a();
        return false;
    }

    public final boolean D(G layoutNode, boolean forced) {
        G gO0;
        G gO02;
        if (!(layoutNode.getLookaheadRoot() != null)) {
            C5047a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f490a[layoutNode.W().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            this.postponedMeasureRequests.c(new a(layoutNode, true, forced));
            N n10 = this.consistencyChecker;
            if (n10 == null) {
                return false;
            }
            n10.a();
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.Y() && !forced) {
            return false;
        }
        layoutNode.U0();
        layoutNode.V0();
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if ((C3862t.b(layoutNode.N0(), Boolean.TRUE) || l(layoutNode)) && ((gO0 = layoutNode.o0()) == null || !gO0.Y())) {
            this.relayoutNodes.c(layoutNode, true);
        } else if ((layoutNode.o() || k(layoutNode)) && ((gO02 = layoutNode.o0()) == null || !gO02.e0())) {
            this.relayoutNodes.c(layoutNode, false);
        }
        return !this.duringFullMeasureLayoutPass;
    }

    public final void E(G layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    public final boolean F(G layoutNode, boolean forced) {
        int i10 = b.f490a[layoutNode.W().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            N n10 = this.consistencyChecker;
            if (n10 != null) {
                n10.a();
            }
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!forced && layoutNode.o() == layoutNode.M0() && (layoutNode.e0() || layoutNode.V())) {
                N n11 = this.consistencyChecker;
                if (n11 != null) {
                    n11.a();
                }
            } else {
                layoutNode.S0();
                if (!layoutNode.getIsDeactivated() && layoutNode.M0()) {
                    G gO0 = layoutNode.o0();
                    if ((gO0 == null || !gO0.V()) && (gO0 == null || !gO0.e0())) {
                        this.relayoutNodes.c(layoutNode, false);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean G(G layoutNode, boolean forced) {
        int i10 = b.f490a[layoutNode.W().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.postponedMeasureRequests.c(new a(layoutNode, false, forced));
                N n10 = this.consistencyChecker;
                if (n10 != null) {
                    n10.a();
                }
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.e0() || forced) {
                    layoutNode.V0();
                    if (!layoutNode.getIsDeactivated() && (layoutNode.o() || k(layoutNode))) {
                        G gO0 = layoutNode.o0();
                        if (gO0 == null || !gO0.e0()) {
                            this.relayoutNodes.c(layoutNode, false);
                        }
                        if (!this.duringFullMeasureLayoutPass) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void I(long constraints) {
        U0.b bVar = this.rootConstraints;
        if (bVar == null ? false : U0.b.f(bVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            C5047a.a("updateRootConstraints called while measuring");
        }
        this.rootConstraints = U0.b.a(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.U0();
        }
        this.root.V0();
        C0836o c0836o = this.relayoutNodes;
        G g10 = this.root;
        c0836o.c(g10, g10.getLookaheadRoot() != null);
    }

    public final void c(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        this.onPositionedDispatcher.a();
    }

    public final void i(G layoutNode, boolean affectsLookahead) {
        if (this.relayoutNodes.g(affectsLookahead)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            C5047a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(layoutNode, affectsLookahead)) {
            C5047a.a("node not yet measured");
        }
        j(layoutNode, affectsLookahead);
    }

    public final boolean m() {
        return this.relayoutNodes.h();
    }

    public final boolean n() {
        return this.onPositionedDispatcher.c();
    }

    public final long q() {
        if (!this.duringMeasureLayout) {
            C5047a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean r(Ba.a<C4153F> onLayout) {
        boolean z10;
        if (!this.root.K0()) {
            C5047a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.o()) {
            C5047a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            C5047a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.h()) {
                    C0836o c0836o = this.relayoutNodes;
                    z10 = false;
                    while (c0836o.h()) {
                        boolean zD = c0836o.lookaheadSet.d();
                        boolean z12 = !zD;
                        G gE = (!zD ? c0836o.lookaheadSet : c0836o.set).e();
                        boolean z13 = z(this, gE, z12, false, 4, null);
                        if (gE == this.root && z13) {
                            z10 = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                N n10 = this.consistencyChecker;
                if (n10 != null) {
                    n10.a();
                }
                z11 = z10;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        b();
        return z11;
    }

    public final void s(G layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (C3862t.b(layoutNode, this.root)) {
            C5047a.a("measureAndLayout called on root");
        }
        if (!this.root.K0()) {
            C5047a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.o()) {
            C5047a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            C5047a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.i(layoutNode);
                if (e(layoutNode, U0.b.a(constraints)) || layoutNode.X()) {
                    if (C3862t.b(layoutNode.N0(), Boolean.TRUE)) {
                        layoutNode.R0();
                    }
                }
                h(layoutNode);
                f(layoutNode, U0.b.a(constraints));
                if (layoutNode.V() && layoutNode.o()) {
                    layoutNode.o1();
                    this.onPositionedDispatcher.d(layoutNode);
                }
                g();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                N n10 = this.consistencyChecker;
                if (n10 != null) {
                    n10.a();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        b();
    }

    public final void t() {
        if (this.relayoutNodes.h()) {
            if (!this.root.K0()) {
                C5047a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.o()) {
                C5047a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                C5047a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.g(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            B(this.root, true);
                        } else {
                            A(this.root);
                        }
                    }
                    B(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    N n10 = this.consistencyChecker;
                    if (n10 != null) {
                        n10.a();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th;
                }
            }
        }
    }

    public final void v(G node) {
        this.relayoutNodes.i(node);
        this.onPositionedDispatcher.f(node);
    }

    public final void x(m0.b listener) {
        this.onLayoutCompletedListeners.c(listener);
    }
}
