package y0;

import A0.A0;
import A0.B0;
import A0.C0819a0;
import A0.G;
import A0.L;
import A0.z0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.platform.y1;
import b0.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC1564q;
import kotlin.C1560o;
import kotlin.InterfaceC1552k;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.T0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import oa.C4153F;
import x0.C5047a;
import y0.Z;
import y0.k0;
import y0.m0;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00039wxB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001c\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010&J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u00102J-\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010&J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010&J+\u0010:\u001a\b\u0012\u0004\u0012\u000204032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b:\u00106J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001e¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010&J'\u0010E\u001a\u00020D2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0?¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u00020G2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\f¢\u0006\u0004\bJ\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010KR$\u0010Q\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010Z\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010OR0\u0010^\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100[j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010]R4\u0010_\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020[j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010]R\u0018\u0010b\u001a\u00060`R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010aR\u0018\u0010e\u001a\u00060cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010dR4\u0010f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020[j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010]R\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010hR\"\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020G0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010kR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0016\u0010p\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010OR\u0016\u0010r\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010OR\u0014\u0010v\u001a\u00020s8\u0002X\u0082D¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006y"}, d2 = {"Ly0/D;", "LO/k;", "LA0/G;", "root", "Ly0/m0;", "slotReusePolicy", "<init>", "(LA0/G;Ly0/m0;)V", "node", "", "slotId", "Lkotlin/Function0;", "Loa/F;", "content", "L", "(LA0/G;Ljava/lang/Object;LBa/p;)V", "Ly0/D$a;", "nodeState", "M", "(LA0/G;Ly0/D$a;)V", "LO/T0;", "existing", "container", "", "reuseContent", "LO/q;", "parent", "composable", "N", "(LO/T0;LA0/G;ZLO/q;LBa/p;)LO/T0;", "", "index", "A", "(I)Ljava/lang/Object;", "deactivate", "C", "(Z)V", "w", "()V", "H", "(LA0/G;)V", "O", "(Ljava/lang/Object;)LA0/G;", "y", "v", "(I)LA0/G;", "from", "to", "count", "D", "(III)V", "", "Ly0/H;", "F", "(Ljava/lang/Object;LBa/p;)Ljava/util/List;", "p", "i", "a", "K", "startIndex", "x", "(I)V", "B", "Lkotlin/Function2;", "Ly0/l0;", "LU0/b;", "Ly0/J;", "block", "Ly0/I;", "u", "(LBa/p;)Ly0/I;", "Ly0/k0$a;", "G", "(Ljava/lang/Object;LBa/p;)Ly0/k0$a;", "z", "LA0/G;", "LO/q;", "getCompositionContext", "()LO/q;", "I", "(LO/q;)V", "compositionContext", "value", "Ly0/m0;", "getSlotReusePolicy", "()Ly0/m0;", "J", "(Ly0/m0;)V", "E", "currentIndex", "currentPostLookaheadIndex", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeToNodeState", "slotIdToNode", "Ly0/D$c;", "Ly0/D$c;", "scope", "Ly0/D$b;", "Ly0/D$b;", "postLookaheadMeasureScope", "precomposeMap", "Ly0/m0$a;", "Ly0/m0$a;", "reusableSlotIdsSet", "", "Ljava/util/Map;", "postLookaheadPrecomposeSlotHandleMap", "LQ/b;", "LQ/b;", "postLookaheadComposedSlotIds", "reusableCount", "P", "precomposedCount", "", "Q", "Ljava/lang/String;", "NoIntrinsicsMessage", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5093D implements InterfaceC1552k {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final A0.G root;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private AbstractC1564q compositionContext;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private m0 slotReusePolicy;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int currentPostLookaheadIndex;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final HashMap<A0.G, a> nodeToNodeState = new HashMap<>();

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Object, A0.G> slotIdToNode = new HashMap<>();

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final c scope = new c();

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final b postLookaheadMeasureScope = new b();

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Object, A0.G> precomposeMap = new HashMap<>();

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final m0.a reusableSlotIdsSet = new m0.a(null, 1, null);

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, k0.a> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Q.b<Object> postLookaheadComposedSlotIds = new Q.b<>(new Object[16], 0);

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jb\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u0016*\u00020\u001cH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u0016*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"*\u00020!H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001c*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u001c*\u00020\u0019H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020!*\u00020\"H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u0019*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u0019*\u00020\u001cH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010)J-\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\b\u0010,\u001a\u0004\u0018\u00010+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0-H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u001c8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u001c8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u0010;\u001a\u0002088VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Ly0/D$b;", "Ly0/l0;", "Ly0/K;", "<init>", "(Ly0/D;)V", "", "width", "height", "", "Ly0/a;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "Loa/F;", "rulers", "Ly0/Z$a;", "placementBlock", "Ly0/J;", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "h0", "(IILjava/util/Map;LBa/l;)Ly0/J;", "LU0/h;", "i1", "(F)I", "LU0/v;", "i0", "(J)F", "", "G0", "(F)F", "E0", "(I)F", "Lh0/m;", "LU0/k;", "Z", "(J)J", "X0", "w1", "t1", "s", "(F)J", "x", "", "slotId", "Lkotlin/Function0;", "content", "", "Ly0/H;", "o1", "(Ljava/lang/Object;LBa/p;)Ljava/util/List;", "getDensity", "()F", "density", "R0", "fontScale", "", "U0", "()Z", "isLookingAhead", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$b */
    private final class b implements l0, K {

        /* renamed from: B, reason: collision with root package name */
        private final /* synthetic */ c f52947B;

        public b() {
            this.f52947B = C5093D.this.scope;
        }

        @Override // U0.d
        public float E0(int i10) {
            return this.f52947B.E0(i10);
        }

        @Override // U0.d
        public float G0(float f10) {
            return this.f52947B.G0(f10);
        }

        @Override // U0.l
        /* renamed from: R0 */
        public float getFontScale() {
            return this.f52947B.getFontScale();
        }

        @Override // y0.r
        public boolean U0() {
            return this.f52947B.U0();
        }

        @Override // U0.d
        public float X0(float f10) {
            return this.f52947B.X0(f10);
        }

        @Override // U0.d
        public long Z(long j10) {
            return this.f52947B.Z(j10);
        }

        @Override // U0.d
        public float getDensity() {
            return this.f52947B.getDensity();
        }

        @Override // y0.r
        public U0.t getLayoutDirection() {
            return this.f52947B.getLayoutDirection();
        }

        @Override // y0.K
        public J h0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super Z.a, C4153F> placementBlock) {
            return this.f52947B.h0(width, height, alignmentLines, placementBlock);
        }

        @Override // U0.l
        public float i0(long j10) {
            return this.f52947B.i0(j10);
        }

        @Override // U0.d
        public int i1(float f10) {
            return this.f52947B.i1(f10);
        }

        @Override // y0.K
        public J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super f0, C4153F> rulers, Ba.l<? super Z.a, C4153F> placementBlock) {
            return this.f52947B.m0(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // y0.l0
        public List<H> o1(Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
            A0.G g10 = (A0.G) C5093D.this.slotIdToNode.get(slotId);
            List<H> listG = g10 != null ? g10.G() : null;
            return listG != null ? listG : C5093D.this.F(slotId, content);
        }

        @Override // U0.l
        public long s(float f10) {
            return this.f52947B.s(f10);
        }

        @Override // U0.d
        public long t1(long j10) {
            return this.f52947B.t1(j10);
        }

        @Override // U0.d
        public float w1(long j10) {
            return this.f52947B.w1(j10);
        }

        @Override // U0.d
        public long x(float f10) {
            return this.f52947B.x(f10);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Ly0/D$c;", "Ly0/l0;", "<init>", "(Ly0/D;)V", "", "slotId", "Lkotlin/Function0;", "Loa/F;", "content", "", "Ly0/H;", "o1", "(Ljava/lang/Object;LBa/p;)Ljava/util/List;", "", "width", "height", "", "Ly0/a;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "rulers", "Ly0/Z$a;", "placementBlock", "Ly0/J;", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "LU0/t;", "B", "LU0/t;", "getLayoutDirection", "()LU0/t;", "o", "(LU0/t;)V", "layoutDirection", "", "C", "F", "getDensity", "()F", "b", "(F)V", "density", "D", "R0", "d", "fontScale", "", "U0", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$c */
    private final class c implements l0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private U0.t layoutDirection = U0.t.Rtl;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private float density;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"y0/D$c$a", "Ly0/J;", "Loa/F;", "e", "()V", "", "b", "()I", "width", "a", "height", "", "Ly0/a;", "d", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "j", "()LBa/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: y0.D$c$a */
        public static final class a implements J {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f52953a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f52954b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<AbstractC5096a, Integer> f52955c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ba.l<f0, C4153F> f52956d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f52957e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C5093D f52958f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ba.l<Z.a, C4153F> f52959g;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i10, int i11, Map<AbstractC5096a, Integer> map, Ba.l<? super f0, C4153F> lVar, c cVar, C5093D c5093d, Ba.l<? super Z.a, C4153F> lVar2) {
                this.f52953a = i10;
                this.f52954b = i11;
                this.f52955c = map;
                this.f52956d = lVar;
                this.f52957e = cVar;
                this.f52958f = c5093d;
                this.f52959g = lVar2;
            }

            @Override // y0.J
            /* renamed from: a, reason: from getter */
            public int getHeight() {
                return this.f52954b;
            }

            @Override // y0.J
            /* renamed from: b, reason: from getter */
            public int getWidth() {
                return this.f52953a;
            }

            @Override // y0.J
            public Map<AbstractC5096a, Integer> d() {
                return this.f52955c;
            }

            @Override // y0.J
            public void e() {
                A0.Q lookaheadDelegate;
                if (!this.f52957e.U0() || (lookaheadDelegate = this.f52958f.root.P().getLookaheadDelegate()) == null) {
                    this.f52959g.invoke(this.f52958f.root.P().getPlacementScope());
                } else {
                    this.f52959g.invoke(lookaheadDelegate.getPlacementScope());
                }
            }

            @Override // y0.J
            public Ba.l<f0, C4153F> j() {
                return this.f52956d;
            }
        }

        public c() {
        }

        @Override // U0.l
        /* renamed from: R0, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // y0.r
        public boolean U0() {
            return C5093D.this.root.W() == G.e.LookaheadLayingOut || C5093D.this.root.W() == G.e.LookaheadMeasuring;
        }

        public void b(float f10) {
            this.density = f10;
        }

        public void d(float f10) {
            this.fontScale = f10;
        }

        @Override // U0.d
        public float getDensity() {
            return this.density;
        }

        @Override // y0.r
        public U0.t getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // y0.K
        public J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super f0, C4153F> rulers, Ba.l<? super Z.a, C4153F> placementBlock) {
            if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
                C5047a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(width, height, alignmentLines, rulers, this, C5093D.this, placementBlock);
        }

        public void o(U0.t tVar) {
            this.layoutDirection = tVar;
        }

        @Override // y0.l0
        public List<H> o1(Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
            return C5093D.this.K(slotId, content);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"y0/D$d", "LA0/G$f;", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$d */
    public static final class d extends G.f {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ba.p<l0, U0.b, J> f52961c;

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"y0/D$d$a", "Ly0/J;", "Loa/F;", "e", "()V", "", "Ly0/a;", "", "d", "()Ljava/util/Map;", "alignmentLines", "a", "()I", "height", "Lkotlin/Function1;", "Ly0/f0;", "j", "()LBa/l;", "rulers", "b", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: y0.D$d$a */
        public static final class a implements J {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ J f52962a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5093D f52963b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f52964c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f52965d;

            public a(J j10, C5093D c5093d, int i10, J j11) {
                this.f52963b = c5093d;
                this.f52964c = i10;
                this.f52965d = j11;
                this.f52962a = j10;
            }

            @Override // y0.J
            /* renamed from: a */
            public int getHeight() {
                return this.f52962a.getHeight();
            }

            @Override // y0.J
            /* renamed from: b */
            public int getWidth() {
                return this.f52962a.getWidth();
            }

            @Override // y0.J
            public Map<AbstractC5096a, Integer> d() {
                return this.f52962a.d();
            }

            @Override // y0.J
            public void e() {
                this.f52963b.currentPostLookaheadIndex = this.f52964c;
                this.f52965d.e();
                this.f52963b.y();
            }

            @Override // y0.J
            public Ba.l<f0, C4153F> j() {
                return this.f52962a.j();
            }
        }

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"y0/D$d$b", "Ly0/J;", "Loa/F;", "e", "()V", "", "Ly0/a;", "", "d", "()Ljava/util/Map;", "alignmentLines", "a", "()I", "height", "Lkotlin/Function1;", "Ly0/f0;", "j", "()LBa/l;", "rulers", "b", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: y0.D$d$b */
        public static final class b implements J {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ J f52966a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5093D f52967b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f52968c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f52969d;

            public b(J j10, C5093D c5093d, int i10, J j11) {
                this.f52967b = c5093d;
                this.f52968c = i10;
                this.f52969d = j11;
                this.f52966a = j10;
            }

            @Override // y0.J
            /* renamed from: a */
            public int getHeight() {
                return this.f52966a.getHeight();
            }

            @Override // y0.J
            /* renamed from: b */
            public int getWidth() {
                return this.f52966a.getWidth();
            }

            @Override // y0.J
            public Map<AbstractC5096a, Integer> d() {
                return this.f52966a.d();
            }

            @Override // y0.J
            public void e() {
                this.f52967b.currentIndex = this.f52968c;
                this.f52969d.e();
                C5093D c5093d = this.f52967b;
                c5093d.x(c5093d.currentIndex);
            }

            @Override // y0.J
            public Ba.l<f0, C4153F> j() {
                return this.f52966a.j();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ba.p<? super l0, ? super U0.b, ? extends J> pVar, String str) {
            super(str);
            this.f52961c = pVar;
        }

        @Override // y0.I
        public J e(K k10, List<? extends H> list, long j10) {
            C5093D.this.scope.o(k10.getLayoutDirection());
            C5093D.this.scope.b(k10.getDensity());
            C5093D.this.scope.d(k10.getFontScale());
            if (k10.U0() || C5093D.this.root.getLookaheadRoot() == null) {
                C5093D.this.currentIndex = 0;
                J jInvoke = this.f52961c.invoke(C5093D.this.scope, U0.b.a(j10));
                return new b(jInvoke, C5093D.this, C5093D.this.currentIndex, jInvoke);
            }
            C5093D.this.currentPostLookaheadIndex = 0;
            J jInvoke2 = this.f52961c.invoke(C5093D.this.postLookaheadMeasureScope, U0.b.a(j10));
            return new a(jInvoke2, C5093D.this, C5093D.this.currentPostLookaheadIndex, jInvoke2);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Ly0/k0$a;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.D$e */
    static final class e extends AbstractC3864v implements Ba.l<Map.Entry<Object, k0.a>, Boolean> {
        e() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<Object, k0.a> entry) {
            boolean z10;
            Object key = entry.getKey();
            k0.a value = entry.getValue();
            int iW = C5093D.this.postLookaheadComposedSlotIds.w(key);
            if (iW < 0 || iW >= C5093D.this.currentPostLookaheadIndex) {
                value.c();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"y0/D$g", "Ly0/k0$a;", "Loa/F;", "c", "()V", "", "index", "LU0/b;", "constraints", "d", "(IJ)V", "", "key", "Lkotlin/Function1;", "LA0/A0;", "LA0/z0;", "block", "a", "(Ljava/lang/Object;LBa/l;)V", "b", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$g */
    public static final class g implements k0.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f52972b;

        g(Object obj) {
            this.f52972b = obj;
        }

        @Override // y0.k0.a
        public void a(Object key, Ba.l<? super A0, ? extends z0> block) {
            C0819a0 nodes;
            i.c head;
            A0.G g10 = (A0.G) C5093D.this.precomposeMap.get(this.f52972b);
            if (g10 == null || (nodes = g10.getNodes()) == null || (head = nodes.getHead()) == null) {
                return;
            }
            B0.e(head, key, block);
        }

        @Override // y0.k0.a
        public int b() {
            List<A0.G> listH;
            A0.G g10 = (A0.G) C5093D.this.precomposeMap.get(this.f52972b);
            if (g10 == null || (listH = g10.H()) == null) {
                return 0;
            }
            return listH.size();
        }

        @Override // y0.k0.a
        public void c() {
            C5093D.this.B();
            A0.G g10 = (A0.G) C5093D.this.precomposeMap.remove(this.f52972b);
            if (g10 != null) {
                if (C5093D.this.precomposedCount <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int iIndexOf = C5093D.this.root.M().indexOf(g10);
                if (iIndexOf < C5093D.this.root.M().size() - C5093D.this.precomposedCount) {
                    throw new IllegalStateException("Item is not in pre-composed item range");
                }
                C5093D.this.reusableCount++;
                C5093D c5093d = C5093D.this;
                c5093d.precomposedCount--;
                int size = (C5093D.this.root.M().size() - C5093D.this.precomposedCount) - C5093D.this.reusableCount;
                C5093D.this.D(iIndexOf, size, 1);
                C5093D.this.x(size);
            }
        }

        @Override // y0.k0.a
        public void d(int index, long constraints) {
            A0.G g10 = (A0.G) C5093D.this.precomposeMap.get(this.f52972b);
            if (g10 == null || !g10.K0()) {
                return;
            }
            int size = g10.H().size();
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
            }
            if (g10.o()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            A0.G g11 = C5093D.this.root;
            g11.ignoreRemeasureRequests = true;
            A0.K.b(g10).A(g10.H().get(index), constraints);
            g11.ignoreRemeasureRequests = false;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.D$h */
    static final class h extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ a f52973B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f52974C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(a aVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(2);
            this.f52973B = aVar;
            this.f52974C = pVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
            }
            boolean zA = this.f52973B.a();
            Ba.p<InterfaceC1554l, Integer, C4153F> pVar = this.f52974C;
            interfaceC1554l.x(207, Boolean.valueOf(zA));
            boolean zC = interfaceC1554l.c(zA);
            interfaceC1554l.S(-869707859);
            if (zA) {
                pVar.invoke(interfaceC1554l, 0);
            } else {
                interfaceC1554l.p(zC);
            }
            interfaceC1554l.I();
            interfaceC1554l.d();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public C5093D(A0.G g10, m0 m0Var) {
        this.root = g10;
        this.slotReusePolicy = m0Var;
    }

    private final Object A(int index) {
        a aVar = this.nodeToNodeState.get(this.root.M().get(index));
        C3862t.d(aVar);
        return aVar.getSlotId();
    }

    private final void C(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.M().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    A0.G g10 = this.root.M().get(i10);
                    a aVar = this.nodeToNodeState.get(g10);
                    if (aVar != null && aVar.a()) {
                        H(g10);
                        if (deactivate) {
                            T0 composition = aVar.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            aVar.h(r1.c(Boolean.FALSE, null, 2, null));
                        } else {
                            aVar.g(false);
                        }
                        aVar.m(j0.f53053a);
                    }
                } catch (Throwable th) {
                    companion.m(gVarD, gVarF, lVarH);
                    throw th;
                }
            }
            C4153F c4153f = C4153F.f46609a;
            companion.m(gVarD, gVarF, lVarH);
            this.slotIdToNode.clear();
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int from, int to, int count) {
        A0.G g10 = this.root;
        g10.ignoreRemeasureRequests = true;
        this.root.e1(from, to, count);
        g10.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void E(C5093D c5093d, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        c5093d.D(i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<H> F(Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        if (this.postLookaheadComposedSlotIds.getSize() < this.currentPostLookaheadIndex) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int size = this.postLookaheadComposedSlotIds.getSize();
        int i10 = this.currentPostLookaheadIndex;
        if (size == i10) {
            this.postLookaheadComposedSlotIds.c(slotId);
        } else {
            this.postLookaheadComposedSlotIds.H(i10, slotId);
        }
        this.currentPostLookaheadIndex++;
        if (!this.precomposeMap.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.put(slotId, G(slotId, content));
            if (this.root.W() == G.e.LayingOut) {
                this.root.p1(true);
            } else {
                A0.G.s1(this.root, true, false, false, 6, null);
            }
        }
        A0.G g10 = this.precomposeMap.get(slotId);
        if (g10 == null) {
            return kotlin.collections.r.m();
        }
        List<L.b> listZ0 = g10.d0().Z0();
        int size2 = listZ0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            listZ0.get(i11).A1();
        }
        return listZ0;
    }

    private final void H(A0.G g10) {
        L.b bVarD0 = g10.d0();
        G.g gVar = G.g.NotUsed;
        bVarD0.Q1(gVar);
        L.a aVarZ = g10.Z();
        if (aVarZ != null) {
            aVarZ.J1(gVar);
        }
    }

    private final void L(A0.G node, Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        HashMap<A0.G, a> map = this.nodeToNodeState;
        a aVar = map.get(node);
        if (aVar == null) {
            aVar = new a(slotId, C5105j.f53050a.a(), null, 4, null);
            map.put(node, aVar);
        }
        a aVar2 = aVar;
        T0 composition = aVar2.getComposition();
        boolean zR = composition != null ? composition.r() : true;
        if (aVar2.c() != content || zR || aVar2.getForceRecompose()) {
            aVar2.j(content);
            M(node, aVar2);
            aVar2.k(false);
        }
    }

    private final void M(A0.G node, a nodeState) {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
        try {
            A0.G g10 = this.root;
            g10.ignoreRemeasureRequests = true;
            Ba.p<InterfaceC1554l, Integer, C4153F> pVarC = nodeState.c();
            T0 composition = nodeState.getComposition();
            AbstractC1564q abstractC1564q = this.compositionContext;
            if (abstractC1564q == null) {
                throw new IllegalStateException("parent composition reference not set");
            }
            nodeState.i(N(composition, node, nodeState.getForceReuse(), abstractC1564q, W.c.b(-1750409193, true, new h(nodeState, pVarC))));
            nodeState.l(false);
            g10.ignoreRemeasureRequests = false;
            C4153F c4153f = C4153F.f46609a;
        } finally {
            companion.m(gVarD, gVarF, lVarH);
        }
    }

    private final T0 N(T0 existing, A0.G container, boolean reuseContent, AbstractC1564q parent, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = y1.a(container, parent);
        }
        if (reuseContent) {
            existing.v(composable);
        } else {
            existing.k(composable);
        }
        return existing;
    }

    private final A0.G O(Object slotId) {
        int i10;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.M().size() - this.precomposedCount;
        int i11 = size - this.reusableCount;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (C3862t.b(A(i13), slotId)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                a aVar = this.nodeToNodeState.get(this.root.M().get(i12));
                C3862t.d(aVar);
                a aVar2 = aVar;
                if (aVar2.getSlotId() == j0.f53053a || this.slotReusePolicy.a(slotId, aVar2.getSlotId())) {
                    aVar2.m(slotId);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.reusableCount--;
        A0.G g10 = this.root.M().get(i11);
        a aVar3 = this.nodeToNodeState.get(g10);
        C3862t.d(aVar3);
        a aVar4 = aVar3;
        aVar4.h(r1.c(Boolean.TRUE, null, 2, null));
        aVar4.l(true);
        aVar4.k(true);
        return g10;
    }

    private final A0.G v(int index) {
        A0.G g10 = new A0.G(true, 0, 2, null);
        A0.G g11 = this.root;
        g11.ignoreRemeasureRequests = true;
        this.root.B0(index, g10);
        g11.ignoreRemeasureRequests = false;
        return g10;
    }

    private final void w() {
        A0.G g10 = this.root;
        g10.ignoreRemeasureRequests = true;
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            T0 composition = ((a) it.next()).getComposition();
            if (composition != null) {
                composition.c();
            }
        }
        this.root.m1();
        g10.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        kotlin.collections.r.I(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new e());
    }

    public final void B() {
        int size = this.root.M().size();
        if (this.nodeToNodeState.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.reusableCount) - this.precomposedCount >= 0) {
            if (this.precomposeMap.size() == this.precomposedCount) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
    }

    public final k0.a G(Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        if (!this.root.K0()) {
            return new f();
        }
        B();
        if (!this.slotIdToNode.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(slotId);
            HashMap<Object, A0.G> map = this.precomposeMap;
            A0.G gO = map.get(slotId);
            if (gO == null) {
                gO = O(slotId);
                if (gO != null) {
                    D(this.root.M().indexOf(gO), this.root.M().size(), 1);
                    this.precomposedCount++;
                } else {
                    gO = v(this.root.M().size());
                    this.precomposedCount++;
                }
                map.put(slotId, gO);
            }
            L(gO, slotId, content);
        }
        return new g(slotId);
    }

    public final void I(AbstractC1564q abstractC1564q) {
        this.compositionContext = abstractC1564q;
    }

    public final void J(m0 m0Var) {
        if (this.slotReusePolicy != m0Var) {
            this.slotReusePolicy = m0Var;
            C(false);
            A0.G.w1(this.root, false, false, false, 7, null);
        }
    }

    public final List<H> K(Object slotId, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        B();
        G.e eVarW = this.root.W();
        G.e eVar = G.e.Measuring;
        if (!(eVarW == eVar || eVarW == G.e.LayingOut || eVarW == G.e.LookaheadMeasuring || eVarW == G.e.LookaheadLayingOut)) {
            C5047a.b("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap<Object, A0.G> map = this.slotIdToNode;
        A0.G gRemove = map.get(slotId);
        if (gRemove == null) {
            gRemove = this.precomposeMap.remove(slotId);
            if (gRemove != null) {
                if (!(this.precomposedCount > 0)) {
                    C5047a.b("Check failed.");
                }
                this.precomposedCount--;
            } else {
                A0.G gO = O(slotId);
                if (gO == null) {
                    gO = v(this.currentIndex);
                }
                gRemove = gO;
            }
            map.put(slotId, gRemove);
        }
        A0.G g10 = gRemove;
        if (kotlin.collections.r.m0(this.root.M(), this.currentIndex) != g10) {
            int iIndexOf = this.root.M().indexOf(g10);
            int i10 = this.currentIndex;
            if (iIndexOf < i10) {
                throw new IllegalArgumentException(("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i10 != iIndexOf) {
                E(this, iIndexOf, i10, 0, 4, null);
            }
        }
        this.currentIndex++;
        L(g10, slotId, content);
        return (eVarW == eVar || eVarW == G.e.LayingOut) ? g10.G() : g10.F();
    }

    @Override // kotlin.InterfaceC1552k
    public void a() {
        w();
    }

    @Override // kotlin.InterfaceC1552k
    public void i() {
        C(true);
    }

    @Override // kotlin.InterfaceC1552k
    public void p() {
        C(false);
    }

    public final I u(Ba.p<? super l0, ? super U0.b, ? extends J> block) {
        return new d(block, this.NoIntrinsicsMessage);
    }

    public final void x(int startIndex) {
        boolean z10 = false;
        this.reusableCount = 0;
        int size = (this.root.M().size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i10 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(A(i10));
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.slotReusePolicy.b(this.reusableSlotIdsSet);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            boolean z11 = false;
            while (size >= startIndex) {
                try {
                    A0.G g10 = this.root.M().get(size);
                    a aVar = this.nodeToNodeState.get(g10);
                    C3862t.d(aVar);
                    a aVar2 = aVar;
                    Object slotId = aVar2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (aVar2.a()) {
                            H(g10);
                            aVar2.g(false);
                            z11 = true;
                        }
                    } else {
                        A0.G g11 = this.root;
                        g11.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(g10);
                        T0 composition = aVar2.getComposition();
                        if (composition != null) {
                            composition.c();
                        }
                        this.root.n1(size, 1);
                        g11.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.m(gVarD, gVarF, lVarH);
                    throw th;
                }
            }
            C4153F c4153f = C4153F.f46609a;
            companion.m(gVarD, gVarF, lVarH);
            z10 = z11;
        }
        if (z10) {
            androidx.compose.runtime.snapshots.g.INSTANCE.n();
        }
        B();
    }

    public final void z() {
        if (this.reusableCount != this.root.M().size()) {
            Iterator<Map.Entry<A0.G, a>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().k(true);
            }
            if (this.root.e0()) {
                return;
            }
            A0.G.w1(this.root, false, false, false, 7, null);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u001d\"\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Ly0/D$a;", "", "slotId", "Lkotlin/Function0;", "Loa/F;", "content", "LO/T0;", "composition", "<init>", "(Ljava/lang/Object;LBa/p;LO/T0;)V", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "b", "LBa/p;", "c", "()LBa/p;", "j", "(LBa/p;)V", "LO/T0;", "()LO/T0;", "i", "(LO/T0;)V", "", "d", "Z", "()Z", "k", "(Z)V", "forceRecompose", "e", "l", "forceReuse", "LO/p0;", "LO/p0;", "getActiveState", "()LO/p0;", "h", "(LO/p0;)V", "activeState", "value", "g", "active", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object slotId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T0 composition;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean forceRecompose;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean forceReuse;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC1563p0<Boolean> activeState;

        public a(Object obj, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, T0 t02) {
            this.slotId = obj;
            this.content = pVar;
            this.composition = t02;
            this.activeState = r1.c(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return this.activeState.getValue().booleanValue();
        }

        /* renamed from: b, reason: from getter */
        public final T0 getComposition() {
            return this.composition;
        }

        public final Ba.p<InterfaceC1554l, Integer, C4153F> c() {
            return this.content;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        /* renamed from: f, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void g(boolean z10) {
            this.activeState.setValue(Boolean.valueOf(z10));
        }

        public final void h(InterfaceC1563p0<Boolean> interfaceC1563p0) {
            this.activeState = interfaceC1563p0;
        }

        public final void i(T0 t02) {
            this.composition = t02;
        }

        public final void j(Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            this.content = pVar;
        }

        public final void k(boolean z10) {
            this.forceRecompose = z10;
        }

        public final void l(boolean z10) {
            this.forceReuse = z10;
        }

        public final void m(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ a(Object obj, Ba.p pVar, T0 t02, int i10, C3854k c3854k) {
            this(obj, pVar, (i10 & 4) != 0 ? null : t02);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"y0/D$f", "Ly0/k0$a;", "Loa/F;", "c", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.D$f */
    public static final class f implements k0.a {
        f() {
        }

        @Override // y0.k0.a
        public void c() {
        }
    }
}
