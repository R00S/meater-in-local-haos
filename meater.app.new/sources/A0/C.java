package A0;

import b0.i;
import i0.C3555S;
import i0.C3602t0;
import i0.InterfaceC3586l0;
import i0.P0;
import i0.Q0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5102g;
import y0.InterfaceC5100e;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 R2\u00020\u0001:\u0002STB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J8\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010F\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"LA0/C;", "LA0/c0;", "LA0/G;", "layoutNode", "LA0/B;", "measureNode", "<init>", "(LA0/G;LA0/B;)V", "Loa/F;", "o3", "()V", "d2", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "", "height", "Q", "(I)I", "S", "width", "f0", "q", "LU0/n;", "position", "", "zIndex", "Ll0/c;", "layer", "D0", "(JFLl0/c;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "C0", "(JFLBa/l;)V", "Ly0/a;", "alignmentLine", "N0", "(Ly0/a;)I", "Li0/l0;", "canvas", "graphicsLayer", "N2", "(Li0/l0;Ll0/c;)V", "value", "u0", "LA0/B;", "l3", "()LA0/B;", "p3", "(LA0/B;)V", "layoutModifierNode", "v0", "LU0/b;", "m3", "()LU0/b;", "q3", "(LU0/b;)V", "lookaheadConstraints", "LA0/Q;", "<set-?>", "w0", "LA0/Q;", "n2", "()LA0/Q;", "r3", "(LA0/Q;)V", "lookaheadDelegate", "Ly0/g;", "x0", "Ly0/g;", "approachMeasureScope", "Lb0/i$c;", "r2", "()Lb0/i$c;", "tail", "n3", "()LA0/c0;", "wrappedNonNull", "y0", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C extends AbstractC0823c0 {

    /* renamed from: z0, reason: collision with root package name */
    private static final P0 f282z0;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private B layoutModifierNode;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private U0.b lookaheadConstraints;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private Q lookaheadDelegate;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private C5102g approachMeasureScope;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LA0/C$b;", "LA0/Q;", "<init>", "(LA0/C;)V", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "Ly0/a;", "alignmentLine", "", "N0", "(Ly0/a;)I", "height", "Q", "(I)I", "S", "width", "f0", "q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends Q {
        public b() {
            super(C.this);
        }

        @Override // A0.P
        public int N0(AbstractC5096a alignmentLine) {
            int iB = D.b(this, alignmentLine);
            M1().put(alignmentLine, Integer.valueOf(iB));
            return iB;
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int Q(int height) {
            B layoutModifierNode = C.this.getLayoutModifierNode();
            Q lookaheadDelegate = C.this.n3().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return layoutModifierNode.t(this, lookaheadDelegate, height);
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int S(int height) {
            B layoutModifierNode = C.this.getLayoutModifierNode();
            Q lookaheadDelegate = C.this.n3().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return layoutModifierNode.z(this, lookaheadDelegate, height);
        }

        @Override // y0.H
        public y0.Z T(long constraints) {
            C c10 = C.this;
            L0(constraints);
            c10.q3(U0.b.a(constraints));
            B layoutModifierNode = c10.getLayoutModifierNode();
            Q lookaheadDelegate = c10.n3().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            W1(layoutModifierNode.b(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int f0(int width) {
            B layoutModifierNode = C.this.getLayoutModifierNode();
            Q lookaheadDelegate = C.this.n3().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return layoutModifierNode.L(this, lookaheadDelegate, width);
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int q(int width) {
            B layoutModifierNode = C.this.getLayoutModifierNode();
            Q lookaheadDelegate = C.this.n3().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return layoutModifierNode.o(this, lookaheadDelegate, width);
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"A0/C$c", "Ly0/J;", "Loa/F;", "e", "()V", "", "b", "I", "()I", "width", "c", "a", "height", "", "Ly0/a;", "d", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "j", "()LBa/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements y0.J {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ y0.J f288a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int height;

        c(y0.J j10, C c10) {
            this.f288a = j10;
            Q lookaheadDelegate = c10.getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            this.width = lookaheadDelegate.getWidth();
            Q lookaheadDelegate2 = c10.getLookaheadDelegate();
            C3862t.d(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getHeight();
        }

        @Override // y0.J
        /* renamed from: a, reason: from getter */
        public int getHeight() {
            return this.height;
        }

        @Override // y0.J
        /* renamed from: b, reason: from getter */
        public int getWidth() {
            return this.width;
        }

        @Override // y0.J
        public Map<AbstractC5096a, Integer> d() {
            return this.f288a.d();
        }

        @Override // y0.J
        public void e() {
            this.f288a.e();
        }

        @Override // y0.J
        public Ba.l<y0.f0, C4153F> j() {
            return this.f288a.j();
        }
    }

    static {
        P0 p0A = C3555S.a();
        p0A.t(C3602t0.INSTANCE.b());
        p0A.w(1.0f);
        p0A.s(Q0.INSTANCE.b());
        f282z0 = p0A;
    }

    public C(G g10, B b10) {
        super(g10);
        this.layoutModifierNode = b10;
        C5102g c5102g = null;
        this.lookaheadDelegate = g10.getLookaheadRoot() != null ? new b() : null;
        if ((b10.getNode().getKindSet() & e0.a(512)) != 0) {
            C3862t.e(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            c5102g = new C5102g(this, (InterfaceC5100e) b10);
        }
        this.approachMeasureScope = c5102g;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o3() {
        /*
            r7 = this;
            boolean r0 = r7.getIsShallowPlacing()
            if (r0 == 0) goto L7
            return
        L7:
            r7.L2()
            y0.g r0 = r7.approachMeasureScope
            r1 = 0
            if (r0 == 0) goto L73
            y0.e r2 = r0.getApproachNode()
            y0.Z$a r3 = r7.getPlacementScope()
            A0.Q r4 = r7.getLookaheadDelegate()
            kotlin.jvm.internal.C3862t.d(r4)
            y0.F r4 = r4.getLookaheadLayoutCoordinates()
            boolean r2 = r2.g0(r3, r4)
            if (r2 != 0) goto L6b
            boolean r0 = r0.getApproachMeasureRequired()
            if (r0 != 0) goto L6b
            long r2 = r7.a()
            A0.Q r0 = r7.getLookaheadDelegate()
            r4 = 0
            if (r0 == 0) goto L42
            long r5 = r0.Q1()
            U0.r r0 = U0.r.b(r5)
            goto L43
        L42:
            r0 = r4
        L43:
            boolean r0 = U0.r.d(r2, r0)
            if (r0 == 0) goto L6b
            A0.c0 r0 = r7.n3()
            long r2 = r0.a()
            A0.c0 r0 = r7.n3()
            A0.Q r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto L63
            long r4 = r0.Q1()
            U0.r r4 = U0.r.b(r4)
        L63:
            boolean r0 = U0.r.d(r2, r4)
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = r1
        L6c:
            A0.c0 r2 = r7.n3()
            r2.U2(r0)
        L73:
            y0.J r0 = r7.Z0()
            r0.e()
            A0.c0 r0 = r7.n3()
            r0.U2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C.o3():void");
    }

    @Override // A0.AbstractC0823c0, y0.Z
    protected void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
        super.C0(position, zIndex, layerBlock);
        o3();
    }

    @Override // A0.AbstractC0823c0, y0.Z
    protected void D0(long position, float zIndex, C3870c layer) {
        super.D0(position, zIndex, layer);
        o3();
    }

    @Override // A0.P
    public int N0(AbstractC5096a alignmentLine) {
        Q lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.L1(alignmentLine) : D.b(this, alignmentLine);
    }

    @Override // A0.AbstractC0823c0
    public void N2(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        n3().a2(canvas, graphicsLayer);
        if (K.b(getLayoutNode()).getShowLayoutBounds()) {
            b2(canvas, f282z0);
        }
    }

    @Override // y0.InterfaceC5112q
    public int Q(int height) {
        C5102g c5102g = this.approachMeasureScope;
        return c5102g != null ? c5102g.getApproachNode().Y0(c5102g, n3(), height) : this.layoutModifierNode.t(this, n3(), height);
    }

    @Override // y0.InterfaceC5112q
    public int S(int height) {
        C5102g c5102g = this.approachMeasureScope;
        return c5102g != null ? c5102g.getApproachNode().s0(c5102g, n3(), height) : this.layoutModifierNode.z(this, n3(), height);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // y0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y0.Z T(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.getForceMeasureWithLookaheadConstraints()
            if (r0 == 0) goto L17
            U0.b r7 = r6.lookaheadConstraints
            if (r7 == 0) goto Lf
            long r7 = r7.getValue()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            A0.AbstractC0823c0.U1(r6, r7)
            y0.g r0 = k3(r6)
            if (r0 == 0) goto Lb2
            y0.e r1 = r0.getApproachNode()
            long r2 = r0.q()
            boolean r2 = r1.S(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            U0.b r2 = r6.getLookaheadConstraints()
            boolean r2 = U0.b.e(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.r(r2)
            boolean r2 = r0.getApproachMeasureRequired()
            if (r2 != 0) goto L4e
            A0.c0 r2 = r6.n3()
            r2.T2(r3)
        L4e:
            A0.c0 r2 = r6.n3()
            y0.J r7 = r1.R(r0, r2, r7)
            A0.c0 r8 = r6.n3()
            r8.T2(r4)
            int r8 = r7.getWidth()
            A0.Q r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.C3862t.d(r1)
            int r1 = r1.getWidth()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            A0.Q r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.C3862t.d(r1)
            int r1 = r1.getHeight()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.getApproachMeasureRequired()
            if (r8 != 0) goto Lbe
            A0.c0 r8 = r6.n3()
            long r0 = r8.a()
            A0.c0 r8 = r6.n3()
            A0.Q r8 = r8.getLookaheadDelegate()
            if (r8 == 0) goto La2
            long r4 = r8.Q1()
            U0.r r8 = U0.r.b(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = U0.r.d(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            A0.C$c r8 = new A0.C$c
            r8.<init>(r7, r6)
            r7 = r8
            goto Lbe
        Lb2:
            A0.B r0 = r6.getLayoutModifierNode()
            A0.c0 r1 = r6.n3()
            y0.J r7 = r0.b(r6, r1, r7)
        Lbe:
            r6.V2(r7)
            r6.K2()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C.T(long):y0.Z");
    }

    @Override // A0.AbstractC0823c0
    public void d2() {
        if (getLookaheadDelegate() == null) {
            r3(new b());
        }
    }

    @Override // y0.InterfaceC5112q
    public int f0(int width) {
        C5102g c5102g = this.approachMeasureScope;
        return c5102g != null ? c5102g.getApproachNode().k0(c5102g, n3(), width) : this.layoutModifierNode.L(this, n3(), width);
    }

    /* renamed from: l3, reason: from getter */
    public final B getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* renamed from: m3, reason: from getter */
    public final U0.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // A0.AbstractC0823c0
    /* renamed from: n2, reason: from getter */
    public Q getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final AbstractC0823c0 n3() {
        AbstractC0823c0 wrapped = getWrapped();
        C3862t.d(wrapped);
        return wrapped;
    }

    public final void p3(B b10) {
        if (!C3862t.b(b10, this.layoutModifierNode)) {
            i.c node = b10.getNode();
            if ((node.getKindSet() & e0.a(512)) != 0) {
                C3862t.e(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                InterfaceC5100e interfaceC5100e = (InterfaceC5100e) b10;
                C5102g c5102g = this.approachMeasureScope;
                if (c5102g != null) {
                    c5102g.t(interfaceC5100e);
                } else {
                    c5102g = new C5102g(this, interfaceC5100e);
                }
                this.approachMeasureScope = c5102g;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = b10;
    }

    @Override // y0.InterfaceC5112q
    public int q(int width) {
        C5102g c5102g = this.approachMeasureScope;
        return c5102g != null ? c5102g.getApproachNode().c1(c5102g, n3(), width) : this.layoutModifierNode.o(this, n3(), width);
    }

    public final void q3(U0.b bVar) {
        this.lookaheadConstraints = bVar;
    }

    @Override // A0.AbstractC0823c0
    public i.c r2() {
        return this.layoutModifierNode.getNode();
    }

    protected void r3(Q q10) {
        this.lookaheadDelegate = q10;
    }
}
