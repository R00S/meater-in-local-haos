package B;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.snapshots.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0964b;
import kotlin.C0968g;
import kotlin.C5045y;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC5041u;
import kotlin.InterfaceC5044x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.r1;
import oa.C4153F;
import oa.C4170o;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.b0;
import y0.c0;
import z.C5161j;
import z.InterfaceC5162k;

/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ~2\u00020\u0001:\u00016B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001bH\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010#J!\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u0015H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020&058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010D\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010ER$\u0010J\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\bH\u0010IR\"\u0010Q\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010W\u001a\u0004\u0018\u00010R2\b\u0010?\u001a\u0004\u0018\u00010R8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010b\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010_\u001a\u0004\b`\u0010aR \u0010i\u001a\b\u0012\u0004\u0012\u00020d0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010s\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010}\u001a\u0004\b~\u0010\u007fR$\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bg\u00107\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0085\u0001\u00107\u001a\u0006\b\u0086\u0001\u0010\u0083\u0001R.\u0010\u0089\u0001\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0086\u0001\u00107\u001a\u0004\b@\u0010N\"\u0005\b\u0088\u0001\u0010PR-\u0010\u008b\u0001\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0005\b\u008a\u0001\u00107\u001a\u0004\b6\u0010N\"\u0004\bA\u0010PR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bu\u0010IR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\by\u0010IR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u008c\u0001R!\u0010\u0091\u0001\u001a\u00030\u008d\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008e\u0001*\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0015\u0010\u0092\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"LB/I;", "Lx/x;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "LB/A;", "prefetchStrategy", "<init>", "(IILB/A;)V", "(II)V", "", "delta", "LB/s;", "layoutInfo", "Loa/F;", "B", "(FLB/s;)V", "index", "scrollOffset", "D", "(IILta/d;)Ljava/lang/Object;", "", "forceRemeasure", "H", "(IIZ)V", "Lw/C;", "scrollPriority", "Lkotlin/Function2;", "Lx/u;", "Lta/d;", "", "block", "b", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "f", "(F)F", "distance", "C", "LB/u;", "result", "visibleItemsStayedTheSame", "k", "(LB/u;Z)V", "LB/l;", "itemProvider", "firstItemIndex", "I", "(LB/l;I)I", "a", "LB/A;", "LB/D;", "LB/D;", "scrollPosition", "LO/p0;", "c", "LO/p0;", "layoutInfoState", "Lz/k;", "d", "Lz/k;", "q", "()Lz/k;", "internalInteractionSource", "<set-?>", "e", "F", "A", "()F", "scrollToBeConsumed", "Lx/x;", "scrollableState", "g", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "h", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Ly0/b0;", "i", "Ly0/b0;", "y", "()Ly0/b0;", "remeasurement", "Ly0/c0;", "j", "Ly0/c0;", "z", "()Ly0/c0;", "remeasurementModifier", "LC/b;", "LC/b;", "m", "()LC/b;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "LB/v;", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "r", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "LC/g;", "LC/g;", "n", "()LC/g;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "x", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "LB/z;", "o", "LB/z;", "prefetchScope", "LB/e;", "p", "LB/e;", "animateScrollScope", "LC/B;", "LC/B;", "v", "()LC/B;", "pinnedItems", "LC/J;", "w", "()LO/p0;", "placementScopeInvalidator", "s", "t", "measurementScopeInvalidator", "G", "canScrollForward", "u", "canScrollBackward", "()LB/s;", "LHa/f;", "()LHa/f;", "getNearestRange$foundation_release$delegate", "(LB/I;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I implements InterfaceC5044x {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    private static final Y.j<I, ?> f1197w = Y.a.a(a.f1219B, b.f1220B);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A prefetchStrategy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D scrollPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<u> layoutInfoState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5162k internalInteractionSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5044x scrollableState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private b0 remeasurement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c0 remeasurementModifier;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C0964b awaitLayoutModifier;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<v> itemAnimator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C0968g beyondBoundsInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final z prefetchScope;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C0876e animateScrollScope;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final kotlin.B pinnedItems;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<C4153F> placementScopeInvalidator;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<C4153F> measurementScopeInvalidator;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 canScrollForward;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 canScrollBackward;

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LY/l;", "LB/I;", "it", "", "", "a", "(LY/l;LB/I;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.p<Y.l, I, List<? extends Integer>> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f1219B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(Y.l lVar, I i10) {
            return kotlin.collections.r.p(Integer.valueOf(i10.o()), Integer.valueOf(i10.p()));
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "LB/I;", "a", "(Ljava/util/List;)LB/I;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<List<? extends Integer>, I> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f1220B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I invoke(List<Integer> list) {
            return new I(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LB/I$c;", "", "<init>", "()V", "LY/j;", "LB/I;", "Saver", "LY/j;", "a", "()LY/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B.I$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Y.j<I, ?> a() {
            return I.f1197w;
        }

        private Companion() {
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"B/I$d", "LB/z;", "", "lineIndex", "", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements z {
        d() {
        }

        @Override // B.z
        public List<d.b> a(int lineIndex) {
            ArrayList arrayList = new ArrayList();
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            I i10 = I.this;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            try {
                List<C4170o<Integer, U0.b>> listInvoke = ((u) i10.layoutInfoState.getValue()).t().invoke(Integer.valueOf(lineIndex));
                int size = listInvoke.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C4170o<Integer, U0.b> c4170o = listInvoke.get(i11);
                    arrayList.add(i10.getPrefetchState().e(c4170o.c().intValue(), c4170o.d().getValue()));
                }
                C4153F c4153f = C4153F.f46609a;
                companion.m(gVarD, gVarF, lVarH);
                return arrayList;
            } catch (Throwable th) {
                companion.m(gVarD, gVarF, lVarH);
                throw th;
            }
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "Loa/F;", "a", "(LC/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<kotlin.I, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1223C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f1223C = i10;
        }

        public final void a(kotlin.I i10) {
            A a10 = I.this.prefetchStrategy;
            int i11 = this.f1223C;
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            companion.m(gVarD, companion.f(gVarD), gVarD != null ? gVarD.h() : null);
            a10.d(i10, i11);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(kotlin.I i10) {
            a(i10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"B/I$f", "Ly0/c0;", "Ly0/b0;", "remeasurement", "Loa/F;", "f", "(Ly0/b0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements c0 {
        f() {
        }

        @Override // y0.c0
        public void f(b0 remeasurement) {
            I.this.remeasurement = remeasurement;
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {370, 371}, m = "scroll")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f1225B;

        /* renamed from: C, reason: collision with root package name */
        Object f1226C;

        /* renamed from: D, reason: collision with root package name */
        Object f1227D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f1228E;

        /* renamed from: G, reason: collision with root package name */
        int f1230G;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1228E = obj;
            this.f1230G |= Integer.MIN_VALUE;
            return I.this.b(null, null, this);
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/u;", "Loa/F;", "<anonymous>", "(Lx/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1231B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f1233D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1234E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1233D = i10;
            this.f1234E = i11;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5041u interfaceC5041u, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(interfaceC5041u, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return I.this.new h(this.f1233D, this.f1234E, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f1231B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            I.this.H(this.f1233D, this.f1234E, true);
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.l<Float, Float> {
        i() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-I.this.C(-f10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    public I() {
        this(0, 0, null, 7, null);
    }

    private final void B(float delta, s layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.b(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ Object E(I i10, int i11, int i12, InterfaceC4588d interfaceC4588d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i10.D(i11, i12, interfaceC4588d);
    }

    private void F(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private void G(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void l(I i10, u uVar, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        i10.k(uVar, z10);
    }

    /* renamed from: A, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final float C(float distance) {
        if ((distance < 0.0f && !e()) || (distance > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            u value = this.layoutInfoState.getValue();
            float f11 = this.scrollToBeConsumed;
            if (value.u(Da.a.c(f11))) {
                k(value, true);
                kotlin.J.d(this.placementScopeInvalidator);
                B(f11 - this.scrollToBeConsumed, value);
            } else {
                b0 b0Var = this.remeasurement;
                if (b0Var != null) {
                    b0Var.k();
                }
                B(f11 - this.scrollToBeConsumed, s());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    public final Object D(int i10, int i11, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = InterfaceC5044x.d(this, null, new h(i10, i11, null), interfaceC4588d, 1, null);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    public final void H(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.o();
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            kotlin.J.d(this.measurementScopeInvalidator);
            return;
        }
        b0 b0Var = this.remeasurement;
        if (b0Var != null) {
            b0Var.k();
        }
    }

    public final int I(l itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    @Override // kotlin.InterfaceC5044x
    public boolean a() {
        return this.scrollableState.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC5044x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(w.EnumC4950C r6, Ba.p<? super kotlin.InterfaceC5041u, ? super ta.InterfaceC4588d<? super oa.C4153F>, ? extends java.lang.Object> r7, ta.InterfaceC4588d<? super oa.C4153F> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof B.I.g
            if (r0 == 0) goto L13
            r0 = r8
            B.I$g r0 = (B.I.g) r0
            int r1 = r0.f1230G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1230G = r1
            goto L18
        L13:
            B.I$g r0 = new B.I$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1228E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f1230G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oa.C4173r.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f1227D
            r7 = r6
            Ba.p r7 = (Ba.p) r7
            java.lang.Object r6 = r0.f1226C
            w.C r6 = (w.EnumC4950C) r6
            java.lang.Object r2 = r0.f1225B
            B.I r2 = (B.I) r2
            oa.C4173r.b(r8)
            goto L5a
        L45:
            oa.C4173r.b(r8)
            C.b r8 = r5.awaitLayoutModifier
            r0.f1225B = r5
            r0.f1226C = r6
            r0.f1227D = r7
            r0.f1230G = r4
            java.lang.Object r8 = r8.m(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            x.x r8 = r2.scrollableState
            r2 = 0
            r0.f1225B = r2
            r0.f1226C = r2
            r0.f1227D = r2
            r0.f1230G = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B.I.b(w.C, Ba.p, ta.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC5044x
    public boolean c() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC5044x
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC5044x
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final void k(u result, boolean visibleItemsStayedTheSame) {
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        F(result.o());
        G(result.getCanScrollForward());
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.a(this.prefetchScope, result);
            }
        }
        this.numMeasurePasses++;
    }

    /* renamed from: m, reason: from getter */
    public final C0964b getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: n, reason: from getter */
    public final C0968g getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int o() {
        return this.scrollPosition.a();
    }

    public final int p() {
        return this.scrollPosition.c();
    }

    /* renamed from: q, reason: from getter */
    public final InterfaceC5162k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutItemAnimator<v> r() {
        return this.itemAnimator;
    }

    public final s s() {
        return this.layoutInfoState.getValue();
    }

    public final InterfaceC1563p0<C4153F> t() {
        return this.measurementScopeInvalidator;
    }

    public final Ha.f u() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: v, reason: from getter */
    public final kotlin.B getPinnedItems() {
        return this.pinnedItems;
    }

    public final InterfaceC1563p0<C4153F> w() {
        return this.placementScopeInvalidator;
    }

    /* renamed from: x, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: y, reason: from getter */
    public final b0 getRemeasurement() {
        return this.remeasurement;
    }

    /* renamed from: z, reason: from getter */
    public final c0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public I(int i10, int i11, A a10) {
        this.prefetchStrategy = a10;
        D d10 = new D(i10, i11);
        this.scrollPosition = d10;
        this.layoutInfoState = m1.g(J.f1236a, m1.i());
        this.internalInteractionSource = C5161j.a();
        this.scrollableState = C5045y.a(new i());
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new f();
        this.awaitLayoutModifier = new C0964b();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new C0968g();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(a10.c(), new e(i10));
        this.prefetchScope = new d();
        this.animateScrollScope = new C0876e(this);
        this.pinnedItems = new kotlin.B();
        d10.getNearestRangeState();
        this.placementScopeInvalidator = kotlin.J.c(null, 1, null);
        this.measurementScopeInvalidator = kotlin.J.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = r1.c(bool, null, 2, null);
        this.canScrollBackward = r1.c(bool, null, 2, null);
    }

    public /* synthetic */ I(int i10, int i11, A a10, int i12, C3854k c3854k) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? B.b(0, 1, null) : a10);
    }

    public I(int i10, int i11) {
        this(i10, i11, B.b(0, 1, null));
    }
}
