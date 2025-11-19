package A0;

import A0.G;
import A0.L;
import i0.C3555S;
import i0.C3602t0;
import i0.InterfaceC3586l0;
import i0.P0;
import i0.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;
import y0.AbstractC5096a;

/* compiled from: InnerNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 H2\u00020\u0001:\u0002IJB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001fH\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b+\u0010,J:\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107R \u0010>\u001a\u0002088\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\b\u001a\u0004\b;\u0010<R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"LA0/w;", "LA0/c0;", "LA0/G;", "layoutNode", "<init>", "(LA0/G;)V", "Loa/F;", "l3", "()V", "d2", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "", "height", "Q", "(I)I", "width", "f0", "S", "q", "LU0/n;", "position", "", "zIndex", "Ll0/c;", "layer", "D0", "(JFLl0/c;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "C0", "(JFLBa/l;)V", "Ly0/a;", "alignmentLine", "N0", "(Ly0/a;)I", "Li0/l0;", "canvas", "graphicsLayer", "N2", "(Li0/l0;Ll0/c;)V", "LA0/c0$f;", "hitTestSource", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "", "isTouchEvent", "isInLayer", "B2", "(LA0/c0$f;JLA0/u;ZZ)V", "LA0/y0;", "u0", "LA0/y0;", "k3", "()LA0/y0;", "getTail$annotations", "tail", "LA0/Q;", "<set-?>", "v0", "LA0/Q;", "n2", "()LA0/Q;", "m3", "(LA0/Q;)V", "lookaheadDelegate", "w0", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843w extends AbstractC0823c0 {

    /* renamed from: x0, reason: collision with root package name */
    private static final P0 f686x0;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final y0 tail;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private Q lookaheadDelegate;

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LA0/w$b;", "LA0/Q;", "<init>", "(LA0/w;)V", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "Ly0/a;", "alignmentLine", "", "N0", "(Ly0/a;)I", "Loa/F;", "R1", "()V", "height", "Q", "(I)I", "width", "f0", "S", "q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.w$b */
    private final class b extends Q {
        public b() {
            super(C0843w.this);
        }

        @Override // A0.P
        public int N0(AbstractC5096a alignmentLine) {
            Integer num = K1().r().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            M1().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int Q(int height) {
            return getLayoutNode().d1(height);
        }

        @Override // A0.Q
        protected void R1() {
            L.a aVarZ = getLayoutNode().Z();
            C3862t.d(aVarZ);
            aVarZ.B1();
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int S(int height) {
            return getLayoutNode().Z0(height);
        }

        @Override // y0.H
        public y0.Z T(long constraints) {
            L0(constraints);
            Q.b<G> bVarW0 = getLayoutNode().w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    L.a aVarZ = gArrT[i10].Z();
                    C3862t.d(aVarZ);
                    aVarZ.J1(G.g.NotUsed);
                    i10++;
                } while (i10 < size);
            }
            W1(getLayoutNode().getMeasurePolicy().e(this, getLayoutNode().F(), constraints));
            return this;
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int f0(int width) {
            return getLayoutNode().c1(width);
        }

        @Override // A0.Q, y0.InterfaceC5112q
        public int q(int width) {
            return getLayoutNode().Y0(width);
        }
    }

    static {
        P0 p0A = C3555S.a();
        p0A.t(C3602t0.INSTANCE.c());
        p0A.w(1.0f);
        p0A.s(Q0.INSTANCE.b());
        f686x0 = p0A;
    }

    public C0843w(G g10) {
        super(g10);
        this.tail = new y0();
        r2().i2(this);
        this.lookaheadDelegate = g10.getLookaheadRoot() != null ? new b() : null;
    }

    private final void l3() {
        if (getIsShallowPlacing()) {
            return;
        }
        L2();
        getLayoutNode().d0().K1();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // A0.AbstractC0823c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B2(A0.AbstractC0823c0.f r16, long r17, A0.C0841u r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r17
            A0.G r1 = r15.getLayoutNode()
            r10 = r16
            boolean r1 = r10.a(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            boolean r1 = r15.j3(r8)
            if (r1 == 0) goto L1b
            r11 = r21
        L19:
            r3 = r2
            goto L35
        L1b:
            if (r20 == 0) goto L33
            long r4 = r15.o2()
            float r1 = r15.Z1(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L33
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L33
            r11 = r3
            goto L19
        L33:
            r11 = r21
        L35:
            if (r3 == 0) goto L82
            int r12 = A0.C0841u.h(r19)
            A0.G r1 = r15.getLayoutNode()
            Q.b r1 = r1.v0()
            int r3 = r1.getSize()
            if (r3 <= 0) goto L77
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.t()
            r14 = r3
        L4f:
            r1 = r13[r14]
            r2 = r1
            A0.G r2 = (A0.G) r2
            boolean r1 = r2.o()
            if (r1 == 0) goto L7a
            r1 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r11
            r1.d(r2, r3, r5, r6, r7)
            boolean r1 = r19.D()
            if (r1 != 0) goto L6d
            goto L7a
        L6d:
            boolean r1 = r19.getShouldSharePointerInputWithSibling()
            if (r1 == 0) goto L77
            r19.c()
            goto L7a
        L77:
            r1 = r19
            goto L7f
        L7a:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L4f
            goto L77
        L7f:
            A0.C0841u.j(r1, r12)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C0843w.B2(A0.c0$f, long, A0.u, boolean, boolean):void");
    }

    @Override // A0.AbstractC0823c0, y0.Z
    protected void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
        super.C0(position, zIndex, layerBlock);
        l3();
    }

    @Override // A0.AbstractC0823c0, y0.Z
    protected void D0(long position, float zIndex, C3870c layer) {
        super.D0(position, zIndex, layer);
        l3();
    }

    @Override // A0.P
    public int N0(AbstractC5096a alignmentLine) {
        Q lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.N0(alignmentLine);
        }
        Integer num = i2().r().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // A0.AbstractC0823c0
    public void N2(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        m0 m0VarB = K.b(getLayoutNode());
        Q.b<G> bVarV0 = getLayoutNode().v0();
        int size = bVarV0.getSize();
        if (size > 0) {
            G[] gArrT = bVarV0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if (g10.o()) {
                    g10.B(canvas, graphicsLayer);
                }
                i10++;
            } while (i10 < size);
        }
        if (m0VarB.getShowLayoutBounds()) {
            b2(canvas, f686x0);
        }
    }

    @Override // y0.InterfaceC5112q
    public int Q(int height) {
        return getLayoutNode().b1(height);
    }

    @Override // y0.InterfaceC5112q
    public int S(int height) {
        return getLayoutNode().X0(height);
    }

    @Override // y0.H
    public y0.Z T(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            Q lookaheadDelegate = getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            constraints = lookaheadDelegate.N1();
        }
        L0(constraints);
        Q.b<G> bVarW0 = getLayoutNode().w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                gArrT[i10].d0().Q1(G.g.NotUsed);
                i10++;
            } while (i10 < size);
        }
        V2(getLayoutNode().getMeasurePolicy().e(this, getLayoutNode().G(), constraints));
        K2();
        return this;
    }

    @Override // A0.AbstractC0823c0
    public void d2() {
        if (getLookaheadDelegate() == null) {
            m3(new b());
        }
    }

    @Override // y0.InterfaceC5112q
    public int f0(int width) {
        return getLayoutNode().a1(width);
    }

    @Override // A0.AbstractC0823c0
    /* renamed from: k3, reason: from getter and merged with bridge method [inline-methods] */
    public y0 r2() {
        return this.tail;
    }

    protected void m3(Q q10) {
        this.lookaheadDelegate = q10;
    }

    @Override // A0.AbstractC0823c0
    /* renamed from: n2, reason: from getter */
    public Q getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // y0.InterfaceC5112q
    public int q(int width) {
        return getLayoutNode().W0(width);
    }
}
