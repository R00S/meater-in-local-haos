package y0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import x0.C5047a;
import y0.Z;

/* compiled from: ApproachMeasureScope.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u0017*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u0017*\u00020\u001dH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u0017*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#*\u00020\"H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001d*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u001d*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00020\"*\u00020#H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010%J\u0017\u0010)\u001a\u00020\u001a*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u001a*\u00020\u001dH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010*J]\u0010.\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010$\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010M\u001a\u00020J8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Ly0/g;", "Ly0/f;", "Ly0/K;", "", "LA0/C;", "coordinator", "Ly0/e;", "approachNode", "<init>", "(LA0/C;Ly0/e;)V", "", "width", "height", "", "Ly0/a;", "alignmentLines", "Lkotlin/Function1;", "Ly0/Z$a;", "Loa/F;", "placementBlock", "Ly0/J;", "h0", "(IILjava/util/Map;LBa/l;)Ly0/J;", "LU0/h;", "i1", "(F)I", "LU0/v;", "i0", "(J)F", "", "G0", "(F)F", "E0", "(I)F", "Lh0/m;", "LU0/k;", "Z", "(J)J", "X0", "w1", "t1", "s", "(F)J", "x", "Ly0/f0;", "rulers", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "B", "LA0/C;", "o", "()LA0/C;", "C", "Ly0/e;", "d", "()Ly0/e;", "t", "(Ly0/e;)V", "", "D", "b", "()Z", "r", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "R0", "fontScale", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "LU0/r;", "q", "()J", "lookaheadSize", "U0", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5102g implements InterfaceC5101f, K {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final A0.C coordinator;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5100e approachNode;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean approachMeasureRequired;

    /* compiled from: ApproachMeasureScope.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"y0/g$a", "Ly0/J;", "Loa/F;", "e", "()V", "", "a", "I", "b", "()I", "width", "height", "", "Ly0/a;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "LBa/l;", "j", "()LBa/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.g$a */
    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5096a, Integer> alignmentLines;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Ba.l<f0, C4153F> rulers;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ba.l<Z.a, C4153F> f53035e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5102g f53036f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<AbstractC5096a, Integer> map, Ba.l<? super f0, C4153F> lVar, Ba.l<? super Z.a, C4153F> lVar2, C5102g c5102g) {
            this.f53035e = lVar2;
            this.f53036f = c5102g;
            this.width = i10;
            this.height = i11;
            this.alignmentLines = map;
            this.rulers = lVar;
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
            return this.alignmentLines;
        }

        @Override // y0.J
        public void e() {
            this.f53035e.invoke(this.f53036f.getCoordinator().getPlacementScope());
        }

        @Override // y0.J
        public Ba.l<f0, C4153F> j() {
            return this.rulers;
        }
    }

    public C5102g(A0.C c10, InterfaceC5100e interfaceC5100e) {
        this.coordinator = c10;
        this.approachNode = interfaceC5100e;
    }

    @Override // U0.d
    public float E0(int i10) {
        return this.coordinator.E0(i10);
    }

    @Override // U0.d
    public float G0(float f10) {
        return this.coordinator.G0(f10);
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // y0.r
    public boolean U0() {
        return false;
    }

    @Override // U0.d
    public float X0(float f10) {
        return this.coordinator.X0(f10);
    }

    @Override // U0.d
    public long Z(long j10) {
        return this.coordinator.Z(j10);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    /* renamed from: d, reason: from getter */
    public final InterfaceC5100e getApproachNode() {
        return this.approachNode;
    }

    @Override // U0.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // y0.r
    public U0.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // y0.K
    public J h0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super Z.a, C4153F> placementBlock) {
        return this.coordinator.h0(width, height, alignmentLines, placementBlock);
    }

    @Override // U0.l
    public float i0(long j10) {
        return this.coordinator.i0(j10);
    }

    @Override // U0.d
    public int i1(float f10) {
        return this.coordinator.i1(f10);
    }

    @Override // y0.K
    public J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super f0, C4153F> rulers, Ba.l<? super Z.a, C4153F> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C5047a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* renamed from: o, reason: from getter */
    public final A0.C getCoordinator() {
        return this.coordinator;
    }

    public long q() {
        A0.Q lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        C3862t.d(lookaheadDelegate);
        J jZ0 = lookaheadDelegate.Z0();
        return U0.s.a(jZ0.getWidth(), jZ0.getHeight());
    }

    public final void r(boolean z10) {
        this.approachMeasureRequired = z10;
    }

    @Override // U0.l
    public long s(float f10) {
        return this.coordinator.s(f10);
    }

    public final void t(InterfaceC5100e interfaceC5100e) {
        this.approachNode = interfaceC5100e;
    }

    @Override // U0.d
    public long t1(long j10) {
        return this.coordinator.t1(j10);
    }

    @Override // U0.d
    public float w1(long j10) {
        return this.coordinator.w1(j10);
    }

    @Override // U0.d
    public long x(float f10) {
        return this.coordinator.x(f10);
    }
}
