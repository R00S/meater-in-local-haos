package A0;

import A0.L;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5095F;
import y0.InterfaceC5116v;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001eJ%\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u000bR$\u00102\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010?\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u0002098PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010HR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010ER\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\u00020b8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010.R\u001a\u0010g\u001a\u00020e8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bf\u0010.R\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"LA0/Q;", "Ly0/H;", "LA0/P;", "LA0/c0;", "coordinator", "<init>", "(LA0/c0;)V", "LU0/n;", "position", "Loa/F;", "S1", "(J)V", "Ly0/a;", "alignmentLine", "", "L1", "(Ly0/a;)I", "F1", "()V", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "C0", "(JFLBa/l;)V", "T1", "R1", "height", "Q", "(I)I", "S", "width", "f0", "q", "ancestor", "", "excludingAgnosticOffset", "U1", "(LA0/Q;Z)J", "LA0/c0;", "O1", "()LA0/c0;", "R", "J", "m1", "()J", "V1", "", "Ljava/util/Map;", "oldAlignmentLines", "Ly0/F;", "T", "Ly0/F;", "P1", "()Ly0/F;", "lookaheadLayoutCoordinates", "Ly0/J;", "result", "U", "Ly0/J;", "W1", "(Ly0/J;)V", "_measureResult", "V", "M1", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "V0", "()LA0/P;", "child", "Y0", "()Z", "hasMeasureResult", "Z0", "()Ly0/J;", "measureResult", "U0", "isLookingAhead", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "getDensity", "()F", "density", "R0", "fontScale", "c1", "parent", "LA0/G;", "s1", "()LA0/G;", "layoutNode", "Ly0/v;", "W0", "()Ly0/v;", "coordinates", "LU0/r;", "Q1", "size", "LU0/b;", "N1", "constraints", "LA0/b;", "K1", "()LA0/b;", "alignmentLinesOwner", "", "b", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Q extends P implements y0.H {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final AbstractC0823c0 coordinator;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5096a, Integer> oldAlignmentLines;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private y0.J _measureResult;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private long position = U0.n.INSTANCE.a();

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final C5095F lookaheadLayoutCoordinates = new C5095F(this);

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC5096a, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public Q(AbstractC0823c0 abstractC0823c0) {
        this.coordinator = abstractC0823c0;
    }

    private final void S1(long position) {
        if (!U0.n.g(getPosition(), position)) {
            V1(position);
            L.a aVarH = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (aVarH != null) {
                aVarH.v1();
            }
            u1(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        Q0(Z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(y0.J j10) {
        C4153F c4153f;
        Map<AbstractC5096a, Integer> map;
        if (j10 != null) {
            K0(U0.s.a(j10.getF52953a(), j10.getF52954b()));
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            K0(U0.r.INSTANCE.a());
        }
        if (!C3862t.b(this._measureResult, j10) && j10 != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !j10.d().isEmpty()) && !C3862t.b(j10.d(), this.oldAlignmentLines))) {
            K1().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(j10.d());
        }
        this._measureResult = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y0.Z
    public final void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
        S1(position);
        if (getIsShallowPlacing()) {
            return;
        }
        R1();
    }

    @Override // A0.P
    public void F1() {
        C0(getPosition(), 0.0f, null);
    }

    public InterfaceC0820b K1() {
        InterfaceC0820b interfaceC0820bC = this.coordinator.getLayoutNode().getLayoutDelegate().C();
        C3862t.d(interfaceC0820bC);
        return interfaceC0820bC;
    }

    public final int L1(AbstractC5096a alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    protected final Map<AbstractC5096a, Integer> M1() {
        return this.cachedAlignmentLinesMap;
    }

    public final long N1() {
        return getMeasurementConstraints();
    }

    /* renamed from: O1, reason: from getter */
    public final AbstractC0823c0 getCoordinator() {
        return this.coordinator;
    }

    /* renamed from: P1, reason: from getter */
    public final C5095F getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public abstract int Q(int height);

    public final long Q1() {
        return U0.s.a(getWidth(), getHeight());
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    protected void R1() {
        Z0().e();
    }

    public abstract int S(int height);

    public final void T1(long position) {
        S1(U0.n.l(position, getApparentToRealOffset()));
    }

    @Override // A0.P, y0.r
    public boolean U0() {
        return true;
    }

    public final long U1(Q ancestor, boolean excludingAgnosticOffset) {
        long jA = U0.n.INSTANCE.a();
        Q lookaheadDelegate = this;
        while (!C3862t.b(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jA = U0.n.l(jA, lookaheadDelegate.getPosition());
            }
            AbstractC0823c0 wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            C3862t.d(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
        }
        return jA;
    }

    @Override // A0.P
    public P V0() {
        AbstractC0823c0 wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    public void V1(long j10) {
        this.position = j10;
    }

    @Override // A0.P
    public InterfaceC5116v W0() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // A0.P
    public boolean Y0() {
        return this._measureResult != null;
    }

    @Override // A0.P
    public y0.J Z0() {
        y0.J j10 = this._measureResult;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // y0.L, y0.InterfaceC5112q
    /* renamed from: b */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // A0.P
    public P c1() {
        AbstractC0823c0 wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    public abstract int f0(int width);

    @Override // U0.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // y0.r
    public U0.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // A0.P
    /* renamed from: m1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public abstract int q(int width);

    @Override // A0.P, A0.T
    /* renamed from: s1 */
    public G getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }
}
