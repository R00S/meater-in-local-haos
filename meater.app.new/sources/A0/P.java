package A0;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4384F;
import s.C4388J;
import s.C4389K;
import x0.C5047a;
import y0.AbstractC5096a;
import y0.InterfaceC5116v;
import y0.Z;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH ¢\u0006\u0004\b\u001e\u0010\u0005J\u0013\u0010 \u001a\u00020\n*\u00020\u001fH\u0004¢\u0006\u0004\b \u0010!J]\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a0$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010B\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u00106\u001a\u0004\b@\u00108\"\u0004\bA\u0010:R\u0017\u0010G\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR:\u0010Q\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020R8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0014\u0010\\\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u00108R\u0014\u0010_\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010l\u001a\u0002048VX\u0096\u0004¢\u0006\f\u0012\u0004\bk\u0010\u0005\u001a\u0004\bj\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"LA0/P;", "Ly0/Z;", "LA0/T;", "LA0/W;", "<init>", "()V", "Ly0/e0;", "ruler", "S0", "(Ly0/e0;)LA0/P;", "Loa/F;", "v1", "(Ly0/e0;)V", "LA0/r0;", "placeableResult", "P0", "(LA0/r0;)V", "Ls/K;", "Ljava/lang/ref/WeakReference;", "LA0/G;", "Landroidx/compose/ui/node/WeakReference;", "layoutNodes", "B1", "(Ls/K;)V", "Ly0/a;", "alignmentLine", "", "J", "(Ly0/a;)I", "N0", "F1", "LA0/c0;", "u1", "(LA0/c0;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "rulers", "Ly0/Z$a;", "placementBlock", "Ly0/J;", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "result", "Q0", "(Ly0/J;)V", "G", "Ly0/f0;", "_rulerScope", "", "H", "Z", "y1", "()Z", "a0", "(Z)V", "isPlacedUnderMotionFrameOfReference", "I", "A1", "H1", "isShallowPlacing", "z1", "G1", "isPlacingForAlignment", "K", "Ly0/Z$a;", "e1", "()Ly0/Z$a;", "placementScope", "Ls/F;", "L", "Ls/F;", "rulerValues", "M", "rulerValuesCache", "Ls/J;", "N", "Ls/J;", "rulerReaders", "LU0/n;", "m1", "()J", "position", "V0", "()LA0/P;", "child", "c1", "parent", "Y0", "hasMeasureResult", "s1", "()LA0/G;", "layoutNode", "Ly0/v;", "W0", "()Ly0/v;", "coordinates", "q1", "()Ly0/f0;", "rulerScope", "Z0", "()Ly0/J;", "measureResult", "U0", "isLookingAhead$annotations", "isLookingAhead", "O", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class P extends y0.Z implements T, W {

    /* renamed from: P, reason: collision with root package name */
    private static final Ba.l<PlaceableResult, C4153F> f452P = a.f461B;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private y0.f0 _rulerScope;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Z.a placementScope = y0.a0.a(this);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private C4384F<y0.e0> rulerValues;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private C4384F<y0.e0> rulerValuesCache;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private C4388J<y0.e0, C4389K<WeakReference<G>>> rulerReaders;

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/r0;", "result", "Loa/F;", "a", "(LA0/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<PlaceableResult, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f461B = new a();

        a() {
            super(1);
        }

        public final void a(PlaceableResult r0Var) {
            if (r0Var.b0()) {
                r0Var.getPlaceable().P0(r0Var);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(PlaceableResult r0Var) {
            a(r0Var);
            return C4153F.f46609a;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ PlaceableResult f462B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ P f463C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PlaceableResult r0Var, P p10) {
            super(0);
            this.f462B = r0Var;
            this.f463C = p10;
        }

        public final void a() {
            Ba.l<y0.f0, C4153F> lVarJ = this.f462B.getResult().j();
            if (lVarJ != null) {
                lVarJ.invoke(this.f463C.q1());
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"A0/P$d", "Ly0/J;", "Loa/F;", "e", "()V", "", "b", "()I", "width", "a", "height", "", "Ly0/a;", "d", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "j", "()LBa/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements y0.J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<AbstractC5096a, Integer> f466c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ba.l<y0.f0, C4153F> f467d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ba.l<Z.a, C4153F> f468e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f469f;

        /* JADX WARN: Multi-variable type inference failed */
        d(int i10, int i11, Map<AbstractC5096a, Integer> map, Ba.l<? super y0.f0, C4153F> lVar, Ba.l<? super Z.a, C4153F> lVar2, P p10) {
            this.f464a = i10;
            this.f465b = i11;
            this.f466c = map;
            this.f467d = lVar;
            this.f468e = lVar2;
            this.f469f = p10;
        }

        @Override // y0.J
        /* renamed from: a, reason: from getter */
        public int getF53096b() {
            return this.f465b;
        }

        @Override // y0.J
        /* renamed from: b, reason: from getter */
        public int getF53095a() {
            return this.f464a;
        }

        @Override // y0.J
        public Map<AbstractC5096a, Integer> d() {
            return this.f466c;
        }

        @Override // y0.J
        public void e() {
            this.f468e.invoke(this.f469f.getPlacementScope());
        }

        @Override // y0.J
        public Ba.l<y0.f0, C4153F> j() {
            return this.f467d;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"A0/P$e", "Ly0/f0;", "", "getDensity", "()F", "density", "R0", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements y0.f0 {
        e() {
        }

        @Override // U0.l
        /* renamed from: R0 */
        public float getFontScale() {
            return P.this.getFontScale();
        }

        @Override // U0.d
        public float getDensity() {
            return P.this.getDensity();
        }
    }

    private final void B1(C4389K<WeakReference<G>> layoutNodes) {
        G g10;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (g10 = (G) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (U0()) {
                            g10.p1(false);
                        } else {
                            g10.t1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0(A0.PlaceableResult r26) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.P.P0(A0.r0):void");
    }

    private final P S0(y0.e0 ruler) {
        P p10 = this;
        while (true) {
            C4384F<y0.e0> c4384f = p10.rulerValues;
            if (c4384f != null && c4384f.a(ruler)) {
                return p10;
            }
            P pC1 = p10.c1();
            if (pC1 == null) {
                return p10;
            }
            p10 = pC1;
        }
    }

    private final void v1(y0.e0 ruler) {
        C4388J<y0.e0, C4389K<WeakReference<G>>> c4388j = S0(ruler).rulerReaders;
        C4389K<WeakReference<G>> c4389kO = c4388j != null ? c4388j.o(ruler) : null;
        if (c4389kO != null) {
            B1(c4389kO);
        }
    }

    /* renamed from: A1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public abstract void F1();

    public final void G1(boolean z10) {
        this.isPlacingForAlignment = z10;
    }

    public final void H1(boolean z10) {
        this.isShallowPlacing = z10;
    }

    @Override // y0.L
    public final int J(AbstractC5096a alignmentLine) {
        int iN0;
        if (Y0() && (iN0 = N0(alignmentLine)) != Integer.MIN_VALUE) {
            return iN0 + U0.n.i(getApparentToRealOffset());
        }
        return Integer.MIN_VALUE;
    }

    public abstract int N0(AbstractC5096a alignmentLine);

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(y0.J r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            A0.r0 r0 = new A0.r0
            r0.<init>(r14, r13)
            r13.P0(r0)
            goto L62
        Lb:
            s.J<y0.e0, s.K<java.lang.ref.WeakReference<A0.G>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.values
            long[] r14 = r14.metadata
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            s.K r9 = (s.C4389K) r9
            r13.B1(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            s.J<y0.e0, s.K<java.lang.ref.WeakReference<A0.G>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L5b
            r14.h()
        L5b:
            s.F<y0.e0> r14 = r13.rulerValues
            if (r14 == 0) goto L62
            r14.i()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.P.Q0(y0.J):void");
    }

    @Override // y0.r
    public boolean U0() {
        return false;
    }

    public abstract P V0();

    public abstract InterfaceC5116v W0();

    public abstract boolean Y0();

    public abstract y0.J Z0();

    @Override // A0.W
    public void a0(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    public abstract P c1();

    /* renamed from: e1, reason: from getter */
    public final Z.a getPlacementScope() {
        return this.placementScope;
    }

    @Override // y0.K
    public y0.J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super y0.f0, C4153F> rulers, Ba.l<? super Z.a, C4153F> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C5047a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* renamed from: m1 */
    public abstract long getPosition();

    public final y0.f0 q1() {
        y0.f0 f0Var = this._rulerScope;
        return f0Var == null ? new e() : f0Var;
    }

    @Override // A0.T
    /* renamed from: s1 */
    public abstract G getLayoutNode();

    protected final void u1(AbstractC0823c0 abstractC0823c0) {
        AbstractC0818a abstractC0818aD;
        AbstractC0823c0 wrapped = abstractC0823c0.getWrapped();
        if (!C3862t.b(wrapped != null ? wrapped.getLayoutNode() : null, abstractC0823c0.getLayoutNode())) {
            abstractC0823c0.i2().d().m();
            return;
        }
        InterfaceC0820b interfaceC0820bF = abstractC0823c0.i2().F();
        if (interfaceC0820bF == null || (abstractC0818aD = interfaceC0820bF.d()) == null) {
            return;
        }
        abstractC0818aD.m();
    }

    /* renamed from: y1, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* renamed from: z1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }
}
