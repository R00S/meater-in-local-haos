package A0;

import A0.G;
import U0.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;
import x0.C5047a;
import y0.AbstractC5096a;
import y0.Z;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0017\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR$\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001eR$\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001cR\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R*\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b\u001c\u0010?R*\u0010D\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010?R*\u0010J\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00108\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010N\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001c\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010?R*\u0010R\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001c\u001a\u0004\bP\u0010\u001e\"\u0004\bQ\u0010?R*\u0010U\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR\u001e\u0010Z\u001a\u00060VR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b8\u0010YR0\u0010_\u001a\b\u0018\u00010[R\u00020\u00002\f\u0010\u001a\u001a\b\u0018\u00010[R\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010`\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010'R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010bR\u0011\u0010g\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0019\u0010j\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0019\u0010l\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0014\u0010n\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010GR\u0014\u0010p\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010GR\u0014\u0010s\u001a\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010rR\u0016\u0010u\u001a\u0004\u0018\u00010q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"LA0/L;", "", "LA0/G;", "layoutNode", "<init>", "(LA0/G;)V", "LU0/b;", "constraints", "Loa/F;", "U", "(J)V", "T", "O", "()V", "R", "P", "Q", "S", "q", "c0", "M", "V", "N", "a", "LA0/G;", "", "<set-?>", "b", "Z", "w", "()Z", "detachedFromParentLookaheadPass", "LA0/G$e;", "c", "LA0/G$e;", "B", "()LA0/G$e;", "layoutState", "d", "J", "measurePending", "e", "A", "layoutPending", "f", "layoutPendingForAlignment", "g", "G", "lookaheadMeasurePending", "h", "F", "lookaheadLayoutPending", "i", "lookaheadLayoutPendingForAlignment", "", "j", "I", "nextChildLookaheadPlaceOrder", "k", "nextChildPlaceOrder", "value", "l", "v", "(Z)V", "coordinatesAccessedDuringPlacement", "m", "u", "Y", "coordinatesAccessedDuringModifierPlacement", "n", "s", "()I", "W", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "o", "E", "b0", "lookaheadCoordinatesAccessedDuringPlacement", "p", "D", "a0", "lookaheadCoordinatesAccessedDuringModifierPlacement", "t", "X", "childrenAccessingLookaheadCoordinatesDuringPlacement", "LA0/L$b;", "r", "LA0/L$b;", "()LA0/L$b;", "measurePassDelegate", "LA0/L$a;", "LA0/L$a;", "H", "()LA0/L$a;", "lookaheadPassDelegate", "performMeasureConstraints", "Lkotlin/Function0;", "LBa/a;", "performMeasureBlock", "LA0/c0;", "K", "()LA0/c0;", "outerCoordinator", "y", "()LU0/b;", "lastConstraints", "z", "lastLookaheadConstraints", "x", "height", "L", "width", "LA0/b;", "()LA0/b;", "alignmentLinesOwner", "C", "lookaheadAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private a lookaheadPassDelegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private G.e layoutState = G.e.Idle;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final b measurePassDelegate = new b();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long performMeasureConstraints = U0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> performMeasureBlock = new d();

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\u001a\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00101\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013H\u0014ø\u0001\u0000¢\u0006\u0004\b1\u00102J*\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020 H\u0096\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b=\u0010:J\u0017\u0010>\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b>\u0010:J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020.¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\tJ\r\u0010C\u001a\u00020.¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0007H\u0000¢\u0006\u0004\bE\u0010\tJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\tJ\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\tR\u0016\u0010J\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010N\u001a\u00020!2\u0006\u0010K\u001a\u00020!8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010S\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010M\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010AR\"\u0010b\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010I\u001a\u0004\b`\u0010D\"\u0004\ba\u0010AR\u0016\u0010d\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010IR\u001e\u0010g\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010fR*\u0010k\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u00106\u001a\u0004\bi\u0010jR$\u0010p\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR@\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010q\u001a\u0004\br\u0010sR(\u0010y\u001a\u0004\u0018\u00010\u00162\b\u0010K\u001a\u0004\u0018\u00010\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\"\u0010|\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010I\u001a\u0004\bz\u0010D\"\u0004\b{\u0010AR\u001c\u0010\u0081\u0001\u001a\u00020}8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b,\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0086\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u008a\u0001\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010I\u001a\u0005\b\u0088\u0001\u0010D\"\u0005\b\u0089\u0001\u0010AR'\u0010\u008d\u0001\u001a\u00020.2\u0006\u0010K\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010I\u001a\u0005\b\u008c\u0001\u0010DR\u0018\u0010\u008f\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010IR.\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010K\u001a\u0005\u0018\u00010\u0090\u00018\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b\u001e\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R.\u0010\u0096\u0001\u001a\u00020.2\u0007\u0010\u0095\u0001\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\bI\u0010I\u001a\u0005\b\u0096\u0001\u0010D\"\u0005\b\u0097\u0001\u0010AR\u0018\u0010\u0098\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010IR\u001d\u0010\u009c\u0001\u001a\b0\u0099\u0001R\u00030\u0083\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010\u009f\u0001\u001a\u0004\u0018\u00010*8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R#\u0010§\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0083\u00010¤\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bm\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020!8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010PR\u0016\u0010\u00ad\u0001\u001a\u00020!8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, d2 = {"LA0/L$a;", "Ly0/Z;", "Ly0/H;", "LA0/b;", "LA0/W;", "<init>", "(LA0/L;)V", "Loa/F;", "P0", "()V", "u1", "LA0/G;", "node", "M1", "(LA0/G;)V", "LU0/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Ll0/c;", "layer", "F1", "(JFLBa/l;Ll0/c;)V", "z1", "Q0", "q1", "y1", "Y", "", "Ly0/a;", "", "r", "()Ljava/util/Map;", "block", "t", "(LBa/l;)V", "requestLayout", "d0", "v1", "LU0/b;", "constraints", "T", "(J)Ly0/Z;", "", "G1", "(J)Z", "C0", "(JFLBa/l;)V", "D0", "(JFLl0/c;)V", "alignmentLine", "J", "(Ly0/a;)I", "height", "Q", "(I)I", "S", "width", "f0", "q", "forceRequest", "e1", "(Z)V", "m1", "N1", "()Z", "B1", "H1", "A1", "G", "Z", "relayoutWithoutParentInProgress", "<set-?>", "H", "I", "previousPlaceOrder", "getPlaceOrder$ui_release", "()I", "K1", "(I)V", "placeOrder", "LA0/G$g;", "LA0/G$g;", "Z0", "()LA0/G$g;", "J1", "(LA0/G$g;)V", "measuredByParent", "K", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "L", "c1", "setPlacedOnce$ui_release", "placedOnce", "M", "measuredOnce", "N", "LU0/b;", "lookaheadConstraints", "O", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "P", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "LBa/l;", "getLastLayerBlock$ui_release", "()LBa/l;", "lastLayerBlock", "R", "Ll0/c;", "getLastExplicitLayer$ui_release", "()Ll0/c;", "lastExplicitLayer", "o", "L1", "isPlaced", "LA0/a;", "LA0/a;", "d", "()LA0/a;", "alignmentLines", "LQ/b;", "LA0/L;", "U", "LQ/b;", "_childDelegates", "V", "getChildDelegatesDirty$ui_release", "I1", "childDelegatesDirty", "W", "W0", "layingOutChildren", "X", "parentDataDirty", "", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "parentData", "new", "isPlacedUnderMotionFrameOfReference", "a0", "onNodePlacedCalled", "LA0/L$b;", "Y0", "()LA0/L$b;", "measurePassDelegate", "V0", "()LU0/b;", "lastConstraints", "LA0/c0;", "z", "()LA0/c0;", "innerCoordinator", "", "S0", "()Ljava/util/List;", "childDelegates", "()LA0/b;", "parentAlignmentLinesOwner", "y0", "measuredWidth", "v0", "measuredHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a extends y0.Z implements y0.H, InterfaceC0820b, W {

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private U0.b lookaheadConstraints;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
        private Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lastLayerBlock;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata */
        private C3870c lastExplicitLayer;

        /* renamed from: S, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* renamed from: W, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedUnderMotionFrameOfReference;

        /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private G.g measuredByParent = G.g.NotUsed;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = U0.n.INSTANCE.a();

        /* renamed from: T, reason: collision with root package name and from kotlin metadata */
        private final AbstractC0818a alignmentLines = new O(this);

        /* renamed from: U, reason: collision with root package name and from kotlin metadata */
        private final Q.b<a> _childDelegates = new Q.b<>(new a[16], 0);

        /* renamed from: V, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty = true;

        /* renamed from: X, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty = true;

        /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
        private Object parentData = Y0().getParentData();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: A0.L$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0004a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f396a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f397b;

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
                    iArr[G.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[G.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f396a = iArr;
                int[] iArr2 = new int[G.g.values().length];
                try {
                    iArr2[G.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[G.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f397b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Q f399C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ L f400D;

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "child", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: A0.L$a$b$a, reason: collision with other inner class name */
            static final class C0005a extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                public static final C0005a f401B = new C0005a();

                C0005a() {
                    super(1);
                }

                public final void a(InterfaceC0820b interfaceC0820b) {
                    interfaceC0820b.getAlignmentLines().t(false);
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                    a(interfaceC0820b);
                    return C4153F.f46609a;
                }
            }

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "child", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: A0.L$a$b$b, reason: collision with other inner class name */
            static final class C0006b extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                public static final C0006b f402B = new C0006b();

                C0006b() {
                    super(1);
                }

                public final void a(InterfaceC0820b interfaceC0820b) {
                    interfaceC0820b.getAlignmentLines().q(interfaceC0820b.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                    a(interfaceC0820b);
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Q q10, L l10) {
                super(0);
                this.f399C = q10;
                this.f400D = l10;
            }

            public final void a() {
                a.this.Q0();
                a.this.t(C0005a.f401B);
                Q lookaheadDelegate = a.this.z().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                    List<G> listH = this.f400D.layoutNode.H();
                    int size = listH.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Q lookaheadDelegate2 = listH.get(i10).m0().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            lookaheadDelegate2.G1(isPlacingForAlignment);
                        }
                    }
                }
                this.f399C.Z0().e();
                Q lookaheadDelegate3 = a.this.z().getLookaheadDelegate();
                if (lookaheadDelegate3 != null) {
                    lookaheadDelegate3.getIsPlacingForAlignment();
                    List<G> listH2 = this.f400D.layoutNode.H();
                    int size2 = listH2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Q lookaheadDelegate4 = listH2.get(i11).m0().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.G1(false);
                        }
                    }
                }
                a.this.P0();
                a.this.t(C0006b.f402B);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ L f403B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m0 f404C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f405D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, m0 m0Var, long j10) {
                super(0);
                this.f403B = l10;
                this.f404C = m0Var;
                this.f405D = j10;
            }

            public final void a() {
                Q lookaheadDelegate;
                Z.a placementScope = null;
                if (M.a(this.f403B.layoutNode)) {
                    AbstractC0823c0 wrappedBy = this.f403B.K().getWrappedBy();
                    if (wrappedBy != null) {
                        placementScope = wrappedBy.getPlacementScope();
                    }
                } else {
                    AbstractC0823c0 wrappedBy2 = this.f403B.K().getWrappedBy();
                    if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                        placementScope = lookaheadDelegate.getPlacementScope();
                    }
                }
                if (placementScope == null) {
                    placementScope = this.f404C.getPlacementScope();
                }
                L l10 = this.f403B;
                long j10 = this.f405D;
                Q lookaheadDelegate2 = l10.K().getLookaheadDelegate();
                C3862t.d(lookaheadDelegate2);
                Z.a.j(placementScope, lookaheadDelegate2, j10, 0.0f, 2, null);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "it", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final d f406B = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC0820b interfaceC0820b) {
                interfaceC0820b.getAlignmentLines().u(false);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                a(interfaceC0820b);
                return C4153F.f46609a;
            }
        }

        public a() {
        }

        private final void F1(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, C3870c layer) {
            if (L.this.layoutNode.getIsDeactivated()) {
                C5047a.a("place is called on a deactivated node");
            }
            L.this.layoutState = G.e.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!U0.n.g(position, this.lastPosition)) {
                if (L.this.getLookaheadCoordinatesAccessedDuringModifierPlacement() || L.this.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    L.this.lookaheadLayoutPending = true;
                }
                v1();
            }
            m0 m0VarB = K.b(L.this.layoutNode);
            if (L.this.getLookaheadLayoutPending() || !getIsPlaced()) {
                L.this.a0(false);
                getAlignmentLines().r(false);
                o0.d(m0VarB.getSnapshotObserver(), L.this.layoutNode, false, new c(L.this, m0VarB, position), 2, null);
            } else {
                Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
                C3862t.d(lookaheadDelegate);
                lookaheadDelegate.T1(position);
                B1();
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            L.this.layoutState = G.e.Idle;
        }

        private final void M1(G node) {
            G.g gVar;
            G gO0 = node.o0();
            if (gO0 == null) {
                this.measuredByParent = G.g.NotUsed;
                return;
            }
            if (!(this.measuredByParent == G.g.NotUsed || node.getCanMultiMeasure())) {
                C5047a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = C0004a.f396a[gO0.W().ordinal()];
            if (i10 == 1 || i10 == 2) {
                gVar = G.g.InMeasureBlock;
            } else {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gO0.W());
                }
                gVar = G.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P0() {
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    a lookaheadPassDelegate = gArrT[i10].getLayoutDelegate().getLookaheadPassDelegate();
                    C3862t.d(lookaheadPassDelegate);
                    int i11 = lookaheadPassDelegate.previousPlaceOrder;
                    int i12 = lookaheadPassDelegate.placeOrder;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.u1();
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q0() {
            int i10 = 0;
            L.this.nextChildLookaheadPlaceOrder = 0;
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                do {
                    a lookaheadPassDelegate = gArrT[i10].getLayoutDelegate().getLookaheadPassDelegate();
                    C3862t.d(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == G.g.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        private final void q1() {
            boolean isPlaced = getIsPlaced();
            L1(true);
            if (!isPlaced && L.this.getLookaheadMeasurePending()) {
                G.s1(L.this.layoutNode, true, false, false, 6, null);
            }
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g10 = gArrT[i10];
                    a aVarZ = g10.Z();
                    if (aVarZ == null) {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                    if (aVarZ.placeOrder != Integer.MAX_VALUE) {
                        aVarZ.q1();
                        g10.x1(g10);
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        private final void u1() {
            if (getIsPlaced()) {
                int i10 = 0;
                L1(false);
                Q.b<G> bVarW0 = L.this.layoutNode.w0();
                int size = bVarW0.getSize();
                if (size > 0) {
                    G[] gArrT = bVarW0.t();
                    do {
                        a lookaheadPassDelegate = gArrT[i10].getLayoutDelegate().getLookaheadPassDelegate();
                        C3862t.d(lookaheadPassDelegate);
                        lookaheadPassDelegate.u1();
                        i10++;
                    } while (i10 < size);
                }
            }
        }

        private final void y1() {
            G g10 = L.this.layoutNode;
            L l10 = L.this;
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (g11.Y() && g11.h0() == G.g.InMeasureBlock) {
                        a lookaheadPassDelegate = g11.getLayoutDelegate().getLookaheadPassDelegate();
                        C3862t.d(lookaheadPassDelegate);
                        U0.b bVarZ = g11.getLayoutDelegate().z();
                        C3862t.d(bVarZ);
                        if (lookaheadPassDelegate.G1(bVarZ.getValue())) {
                            G.s1(l10.layoutNode, false, false, false, 7, null);
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        private final void z1() {
            G.s1(L.this.layoutNode, false, false, false, 7, null);
            G gO0 = L.this.layoutNode.o0();
            if (gO0 == null || L.this.layoutNode.getIntrinsicsUsageByParent() != G.g.NotUsed) {
                return;
            }
            G g10 = L.this.layoutNode;
            int i10 = C0004a.f396a[gO0.W().ordinal()];
            g10.D1(i10 != 2 ? i10 != 3 ? gO0.getIntrinsicsUsageByParent() : G.g.InLayoutBlock : G.g.InMeasureBlock);
        }

        public final void A1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            L1(false);
        }

        public final void B1() {
            this.onNodePlacedCalled = true;
            G gO0 = L.this.layoutNode.o0();
            if (!getIsPlaced()) {
                q1();
                if (this.relayoutWithoutParentInProgress && gO0 != null) {
                    G.q1(gO0, false, 1, null);
                }
            }
            if (gO0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && (gO0.W() == G.e.LayingOut || gO0.W() == G.e.LookaheadLayingOut)) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    C5047a.b("Place was called on a node which was placed already");
                }
                this.placeOrder = gO0.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                gO0.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
            }
            Y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y0.Z
        public void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
            F1(position, zIndex, layerBlock, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y0.Z
        public void D0(long position, float zIndex, C3870c layer) {
            F1(position, zIndex, null, layer);
        }

        @Override // A0.InterfaceC0820b
        public InterfaceC0820b F() {
            L layoutDelegate;
            G gO0 = L.this.layoutNode.o0();
            if (gO0 == null || (layoutDelegate = gO0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.C();
        }

        public final boolean G1(long constraints) {
            if (L.this.layoutNode.getIsDeactivated()) {
                C5047a.a("measure is called on a deactivated node");
            }
            G gO0 = L.this.layoutNode.o0();
            L.this.layoutNode.A1(L.this.layoutNode.getCanMultiMeasure() || (gO0 != null && gO0.getCanMultiMeasure()));
            if (!L.this.layoutNode.Y()) {
                U0.b bVar = this.lookaheadConstraints;
                if (bVar == null ? false : U0.b.f(bVar.getValue(), constraints)) {
                    m0 owner = L.this.layoutNode.getOwner();
                    if (owner != null) {
                        owner.g(L.this.layoutNode, true);
                    }
                    L.this.layoutNode.z1();
                    return false;
                }
            }
            this.lookaheadConstraints = U0.b.a(constraints);
            L0(constraints);
            getAlignmentLines().s(false);
            t(d.f406B);
            long measuredSize = this.measuredOnce ? getMeasuredSize() : U0.s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.measuredOnce = true;
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                C5047a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            L.this.T(constraints);
            K0(U0.s.a(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (U0.r.g(measuredSize) == lookaheadDelegate.getWidth() && U0.r.f(measuredSize) == lookaheadDelegate.getHeight()) ? false : true;
        }

        public final void H1() {
            G gO0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    C5047a.b("replace() called on item that was not placed");
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = getIsPlaced();
                F1(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !this.onNodePlacedCalled && (gO0 = L.this.layoutNode.o0()) != null) {
                    G.q1(gO0, false, 1, null);
                }
                this.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                this.relayoutWithoutParentInProgress = false;
                throw th;
            }
        }

        public final void I1(boolean z10) {
            this.childDelegatesDirty = z10;
        }

        @Override // y0.L
        public int J(AbstractC5096a alignmentLine) {
            G gO0 = L.this.layoutNode.o0();
            if ((gO0 != null ? gO0.W() : null) == G.e.LookaheadMeasuring) {
                getAlignmentLines().u(true);
            } else {
                G gO02 = L.this.layoutNode.o0();
                if ((gO02 != null ? gO02.W() : null) == G.e.LookaheadLayingOut) {
                    getAlignmentLines().t(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            int iJ = lookaheadDelegate.J(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iJ;
        }

        public final void J1(G.g gVar) {
            this.measuredByParent = gVar;
        }

        public final void K1(int i10) {
            this.placeOrder = i10;
        }

        public void L1(boolean z10) {
            this.isPlaced = z10;
        }

        public final boolean N1() {
            if (getParentData() == null) {
                Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
                C3862t.d(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            Q lookaheadDelegate2 = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        @Override // y0.InterfaceC5112q
        public int Q(int height) {
            z1();
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.Q(height);
        }

        @Override // y0.InterfaceC5112q
        public int S(int height) {
            z1();
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.S(height);
        }

        public final List<a> S0() {
            L.this.layoutNode.H();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.j();
            }
            G g10 = L.this.layoutNode;
            Q.b<a> bVar = this._childDelegates;
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (bVar.getSize() <= i10) {
                        a lookaheadPassDelegate = g11.getLayoutDelegate().getLookaheadPassDelegate();
                        C3862t.d(lookaheadPassDelegate);
                        bVar.c(lookaheadPassDelegate);
                    } else {
                        a lookaheadPassDelegate2 = g11.getLayoutDelegate().getLookaheadPassDelegate();
                        C3862t.d(lookaheadPassDelegate2);
                        bVar.H(i10, lookaheadPassDelegate2);
                    }
                    i10++;
                } while (i10 < size);
            }
            bVar.F(g10.H().size(), bVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.j();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        @Override // y0.H
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public y0.Z T(long r4) {
            /*
                r3 = this;
                A0.L r0 = A0.L.this
                A0.G r0 = A0.L.a(r0)
                A0.G r0 = r0.o0()
                r1 = 0
                if (r0 == 0) goto L12
                A0.G$e r0 = r0.W()
                goto L13
            L12:
                r0 = r1
            L13:
                A0.G$e r2 = A0.G.e.LookaheadMeasuring
                if (r0 == r2) goto L2b
                A0.L r0 = A0.L.this
                A0.G r0 = A0.L.a(r0)
                A0.G r0 = r0.o0()
                if (r0 == 0) goto L27
                A0.G$e r1 = r0.W()
            L27:
                A0.G$e r0 = A0.G.e.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                A0.L r0 = A0.L.this
                r1 = 0
                A0.L.i(r0, r1)
            L31:
                A0.L r0 = A0.L.this
                A0.G r0 = A0.L.a(r0)
                r3.M1(r0)
                A0.L r0 = A0.L.this
                A0.G r0 = A0.L.a(r0)
                A0.G$g r0 = r0.getIntrinsicsUsageByParent()
                A0.G$g r1 = A0.G.g.NotUsed
                if (r0 != r1) goto L51
                A0.L r0 = A0.L.this
                A0.G r0 = A0.L.a(r0)
                r0.v()
            L51:
                r3.G1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: A0.L.a.T(long):y0.Z");
        }

        /* renamed from: V0, reason: from getter */
        public final U0.b getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        /* renamed from: W0, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // A0.InterfaceC0820b
        public void Y() {
            this.layingOutChildren = true;
            getAlignmentLines().o();
            if (L.this.getLookaheadLayoutPending()) {
                y1();
            }
            Q lookaheadDelegate = z().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            if (L.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && L.this.getLookaheadLayoutPending())) {
                L.this.lookaheadLayoutPending = false;
                G.e layoutState = L.this.getLayoutState();
                L.this.layoutState = G.e.LookaheadLayingOut;
                m0 m0VarB = K.b(L.this.layoutNode);
                L.this.b0(false);
                o0.f(m0VarB.getSnapshotObserver(), L.this.layoutNode, false, new b(lookaheadDelegate, L.this), 2, null);
                L.this.layoutState = layoutState;
                if (L.this.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                L.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().q(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
                getAlignmentLines().n();
            }
            this.layingOutChildren = false;
        }

        public final b Y0() {
            return L.this.getMeasurePassDelegate();
        }

        /* renamed from: Z0, reason: from getter */
        public final G.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        @Override // A0.W
        public void a0(boolean z10) {
            Q lookaheadDelegate;
            Q lookaheadDelegate2 = L.this.K().getLookaheadDelegate();
            if (!C3862t.b(Boolean.valueOf(z10), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = L.this.K().getLookaheadDelegate()) != null) {
                lookaheadDelegate.a0(z10);
            }
            this.isPlacedUnderMotionFrameOfReference = z10;
        }

        @Override // y0.L, y0.InterfaceC5112q
        /* renamed from: b, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        /* renamed from: c1, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }

        @Override // A0.InterfaceC0820b
        /* renamed from: d, reason: from getter */
        public AbstractC0818a getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // A0.InterfaceC0820b
        public void d0() {
            G.s1(L.this.layoutNode, false, false, false, 7, null);
        }

        public final void e1(boolean forceRequest) {
            G g10;
            G gO0 = L.this.layoutNode.o0();
            G.g intrinsicsUsageByParent = L.this.layoutNode.getIntrinsicsUsageByParent();
            if (gO0 == null || intrinsicsUsageByParent == G.g.NotUsed) {
                return;
            }
            do {
                g10 = gO0;
                if (g10.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    gO0 = g10.o0();
                }
            } while (gO0 != null);
            int i10 = C0004a.f397b[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                if (g10.getLookaheadRoot() != null) {
                    G.s1(g10, forceRequest, false, false, 6, null);
                    return;
                } else {
                    G.w1(g10, forceRequest, false, false, 6, null);
                    return;
                }
            }
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (g10.getLookaheadRoot() != null) {
                g10.p1(forceRequest);
            } else {
                g10.t1(forceRequest);
            }
        }

        @Override // y0.InterfaceC5112q
        public int f0(int width) {
            z1();
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.f0(width);
        }

        public final void m1() {
            this.parentDataDirty = true;
        }

        @Override // A0.InterfaceC0820b
        /* renamed from: o, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // y0.InterfaceC5112q
        public int q(int width) {
            z1();
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.q(width);
        }

        @Override // A0.InterfaceC0820b
        public Map<AbstractC5096a, Integer> r() {
            if (!this.duringAlignmentLinesQuery) {
                if (L.this.getLayoutState() == G.e.LookaheadMeasuring) {
                    getAlignmentLines().s(true);
                    if (getAlignmentLines().getDirty()) {
                        L.this.P();
                    }
                } else {
                    getAlignmentLines().r(true);
                }
            }
            Q lookaheadDelegate = z().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.G1(true);
            }
            Y();
            Q lookaheadDelegate2 = z().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.G1(false);
            }
            return getAlignmentLines().h();
        }

        @Override // A0.InterfaceC0820b
        public void requestLayout() {
            G.q1(L.this.layoutNode, false, 1, null);
        }

        @Override // A0.InterfaceC0820b
        public void t(Ba.l<? super InterfaceC0820b, C4153F> block) {
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    InterfaceC0820b interfaceC0820bC = gArrT[i10].getLayoutDelegate().C();
                    C3862t.d(interfaceC0820bC);
                    block.invoke(interfaceC0820bC);
                    i10++;
                } while (i10 < size);
            }
        }

        @Override // y0.Z
        public int v0() {
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.v0();
        }

        public final void v1() {
            Q.b<G> bVarW0;
            int size;
            if (L.this.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0 || (size = (bVarW0 = L.this.layoutNode.w0()).getSize()) <= 0) {
                return;
            }
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                L layoutDelegate = g10.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    G.q1(g10, false, 1, null);
                }
                a lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.v1();
                }
                i10++;
            } while (i10 < size);
        }

        @Override // y0.Z
        public int y0() {
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            return lookaheadDelegate.y0();
        }

        @Override // A0.InterfaceC0820b
        public AbstractC0823c0 z() {
            return L.this.layoutNode.P();
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\tJ\u000f\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\tJ\u001a\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096\u0002¢\u0006\u0004\b,\u0010-J8\u0010.\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u00100\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\tJ\u0017\u00104\u001a\u00020+2\u0006\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020+2\u0006\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00108\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b8\u00105J\u0017\u00109\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b9\u00105J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\tJ\r\u0010;\u001a\u00020&¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020+0=H\u0016¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u00020\u00072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0015H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\tJ\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\tJ\u0015\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020&¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tR\u0016\u0010L\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010R\u001a\u00020+2\u0006\u0010M\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u0010T\u001a\u00020+2\u0006\u0010M\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010O\u001a\u0004\bS\u0010QR\u0016\u0010U\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010KR\u0016\u0010W\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010KR\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010<\"\u0004\bb\u0010HR\u001c\u0010e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bd\u0010,R$\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010lR\u0016\u0010o\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010KR(\u0010t\u001a\u0004\u0018\u00010p2\b\u0010M\u001a\u0004\u0018\u00010p8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u0010q\u001a\u0004\br\u0010sR*\u0010w\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010K\u001a\u0004\bu\u0010<\"\u0004\bv\u0010HR*\u0010{\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010K\u001a\u0004\by\u0010<\"\u0004\bz\u0010HR\u001c\u0010\u0081\u0001\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0086\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u008a\u0001\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010K\u001a\u0005\b\u0088\u0001\u0010<\"\u0005\b\u0089\u0001\u0010HR&\u0010\u008c\u0001\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b \u0010K\u001a\u0005\b\u008b\u0001\u0010<R\u001d\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u008d\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010\u008e\u0001R'\u0010\u0014\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010l\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010KR&\u0010\u0096\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010gR\u0019\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010jR\u001e\u0010\u0099\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0017\u0010\u009a\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010lR\u001e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008e\u0001R\u0018\u0010\u009e\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010KR/\u0010¡\u0001\u001a\u00020&2\u0007\u0010\u009f\u0001\u001a\u00020&8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010K\u001a\u0005\b¡\u0001\u0010<\"\u0005\b\u0090\u0001\u0010HR\u001c\u0010¤\u0001\u001a\u0004\u0018\u00010\"8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R#\u0010¬\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0083\u00010©\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0016\u0010®\u0001\u001a\u00020+8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010QR\u0016\u0010°\u0001\u001a\u00020+8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010QR\u0018\u0010²\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bl\u0010±\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006³\u0001"}, d2 = {"LA0/L$b;", "Ly0/H;", "Ly0/Z;", "LA0/b;", "LA0/W;", "<init>", "(LA0/L;)V", "Loa/F;", "W0", "()V", "F1", "B1", "Y0", "LA0/G;", "node", "S1", "(LA0/G;)V", "LU0/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Ll0/c;", "layer", "M1", "(JFLBa/l;Ll0/c;)V", "L1", "I1", "H1", "A1", "Y", "K1", "LU0/b;", "constraints", "T", "(J)Ly0/Z;", "", "N1", "(J)Z", "Ly0/a;", "alignmentLine", "", "J", "(Ly0/a;)I", "C0", "(JFLBa/l;)V", "D0", "(JFLl0/c;)V", "O1", "height", "Q", "(I)I", "S", "width", "f0", "q", "y1", "T1", "()Z", "", "r", "()Ljava/util/Map;", "block", "t", "(LBa/l;)V", "requestLayout", "d0", "G1", "forceRequest", "v1", "(Z)V", "J1", "G", "Z", "relayoutWithoutParentInProgress", "<set-?>", "H", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "q1", "placeOrder", "measuredOnce", "K", "placedOnce", "LA0/G$g;", "L", "LA0/G$g;", "m1", "()LA0/G$g;", "Q1", "(LA0/G$g;)V", "measuredByParent", "M", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "N", "lastPosition", "O", "LBa/l;", "lastLayerBlock", "P", "Ll0/c;", "lastExplicitLayer", "F", "lastZIndex", "R", "parentDataDirty", "", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "parentData", "o", "R1", "isPlaced", "U", "z1", "setPlacedByParent$ui_release", "isPlacedByParent", "LA0/a;", "V", "LA0/a;", "d", "()LA0/a;", "alignmentLines", "LQ/b;", "LA0/L;", "W", "LQ/b;", "_childDelegates", "X", "getChildDelegatesDirty$ui_release", "P1", "childDelegatesDirty", "e1", "layingOutChildren", "Lkotlin/Function0;", "LBa/a;", "layoutChildrenBlock", "a0", "u1", "()F", "b0", "onNodePlacedCalled", "c0", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorLayer", "e0", "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "g0", "placeOuterCoordinatorBlock", "h0", "needsCoordinatesUpdate", "new", "i0", "isPlacedUnderMotionFrameOfReference", "c1", "()LU0/b;", "lastConstraints", "LA0/c0;", "z", "()LA0/c0;", "innerCoordinator", "", "Z0", "()Ljava/util/List;", "childDelegates", "y0", "measuredWidth", "v0", "measuredHeight", "()LA0/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends y0.Z implements y0.H, InterfaceC0820b, W {

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lastLayerBlock;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata */
        private C3870c lastExplicitLayer;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty;

        /* renamed from: S, reason: collision with root package name and from kotlin metadata */
        private Object parentData;

        /* renamed from: T, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* renamed from: U, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedByParent;

        /* renamed from: V, reason: collision with root package name and from kotlin metadata */
        private final AbstractC0818a alignmentLines;

        /* renamed from: W, reason: collision with root package name and from kotlin metadata */
        private final Q.b<b> _childDelegates;

        /* renamed from: X, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty;

        /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Ba.a<C4153F> layoutChildrenBlock;

        /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
        private float zIndex;

        /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
        private Ba.l<? super androidx.compose.ui.graphics.c, C4153F> placeOuterCoordinatorLayerBlock;

        /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
        private C3870c placeOuterCoordinatorLayer;

        /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
        private long placeOuterCoordinatorPosition;

        /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
        private float placeOuterCoordinatorZIndex;

        /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
        private final Ba.a<C4153F> placeOuterCoordinatorBlock;

        /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
        private boolean needsCoordinatesUpdate;

        /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedUnderMotionFrameOfReference;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private G.g measuredByParent = G.g.NotUsed;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f437a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f438b;

            static {
                int[] iArr = new int[G.e.values().length];
                try {
                    iArr[G.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[G.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f437a = iArr;
                int[] iArr2 = new int[G.g.values().length];
                try {
                    iArr2[G.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[G.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f438b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.L$b$b, reason: collision with other inner class name */
        static final class C0007b extends AbstractC3864v implements Ba.a<C4153F> {

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "it", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: A0.L$b$b$a */
            static final class a extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                public static final a f440B = new a();

                a() {
                    super(1);
                }

                public final void a(InterfaceC0820b interfaceC0820b) {
                    interfaceC0820b.getAlignmentLines().t(false);
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                    a(interfaceC0820b);
                    return C4153F.f46609a;
                }
            }

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "it", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: A0.L$b$b$b, reason: collision with other inner class name */
            static final class C0008b extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                public static final C0008b f441B = new C0008b();

                C0008b() {
                    super(1);
                }

                public final void a(InterfaceC0820b interfaceC0820b) {
                    interfaceC0820b.getAlignmentLines().q(interfaceC0820b.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                    a(interfaceC0820b);
                    return C4153F.f46609a;
                }
            }

            C0007b() {
                super(0);
            }

            public final void a() {
                b.this.Y0();
                b.this.t(a.f440B);
                b.this.z().Z0().e();
                b.this.W0();
                b.this.t(C0008b.f441B);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ L f442B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f443C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, b bVar) {
                super(0);
                this.f442B = l10;
                this.f443C = bVar;
            }

            public final void a() {
                Z.a placementScope;
                AbstractC0823c0 wrappedBy = this.f442B.K().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = K.b(this.f442B.layoutNode).getPlacementScope();
                }
                Z.a aVar = placementScope;
                b bVar = this.f443C;
                L l10 = this.f442B;
                Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar = bVar.placeOuterCoordinatorLayerBlock;
                C3870c c3870c = bVar.placeOuterCoordinatorLayer;
                if (c3870c != null) {
                    aVar.x(l10.K(), bVar.placeOuterCoordinatorPosition, c3870c, bVar.placeOuterCoordinatorZIndex);
                } else if (lVar == null) {
                    aVar.i(l10.K(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex);
                } else {
                    aVar.w(l10.K(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex, lVar);
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "it", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final d f444B = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC0820b interfaceC0820b) {
                interfaceC0820b.getAlignmentLines().u(false);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
                a(interfaceC0820b);
                return C4153F.f46609a;
            }
        }

        public b() {
            n.Companion companion = U0.n.INSTANCE;
            this.lastPosition = companion.a();
            this.parentDataDirty = true;
            this.alignmentLines = new H(this);
            this._childDelegates = new Q.b<>(new b[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new C0007b();
            this.placeOuterCoordinatorPosition = companion.a();
            this.placeOuterCoordinatorBlock = new c(L.this, this);
        }

        private final void B1() {
            boolean isPlaced = getIsPlaced();
            R1(true);
            G g10 = L.this.layoutNode;
            if (!isPlaced) {
                if (g10.e0()) {
                    G.w1(g10, true, false, false, 6, null);
                } else if (g10.Y()) {
                    G.s1(g10, true, false, false, 6, null);
                }
            }
            AbstractC0823c0 wrapped = g10.P().getWrapped();
            for (AbstractC0823c0 abstractC0823c0M0 = g10.m0(); !C3862t.b(abstractC0823c0M0, wrapped) && abstractC0823c0M0 != null; abstractC0823c0M0 = abstractC0823c0M0.getWrapped()) {
                if (abstractC0823c0M0.getLastLayerDrawingWasSkipped()) {
                    abstractC0823c0M0.C2();
                }
            }
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (g11.p0() != Integer.MAX_VALUE) {
                        g11.d0().B1();
                        g10.x1(g11);
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        private final void F1() {
            if (getIsPlaced()) {
                int i10 = 0;
                R1(false);
                G g10 = L.this.layoutNode;
                AbstractC0823c0 wrapped = g10.P().getWrapped();
                for (AbstractC0823c0 abstractC0823c0M0 = g10.m0(); !C3862t.b(abstractC0823c0M0, wrapped) && abstractC0823c0M0 != null; abstractC0823c0M0 = abstractC0823c0M0.getWrapped()) {
                    abstractC0823c0M0.S2();
                }
                Q.b<G> bVarW0 = L.this.layoutNode.w0();
                int size = bVarW0.getSize();
                if (size > 0) {
                    G[] gArrT = bVarW0.t();
                    do {
                        gArrT[i10].d0().F1();
                        i10++;
                    } while (i10 < size);
                }
            }
        }

        private final void H1() {
            G g10 = L.this.layoutNode;
            L l10 = L.this;
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (g11.e0() && g11.g0() == G.g.InMeasureBlock && G.l1(g11, null, 1, null)) {
                        G.w1(l10.layoutNode, false, false, false, 7, null);
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        private final void I1() {
            G.w1(L.this.layoutNode, false, false, false, 7, null);
            G gO0 = L.this.layoutNode.o0();
            if (gO0 == null || L.this.layoutNode.getIntrinsicsUsageByParent() != G.g.NotUsed) {
                return;
            }
            G g10 = L.this.layoutNode;
            int i10 = a.f437a[gO0.W().ordinal()];
            g10.D1(i10 != 1 ? i10 != 2 ? gO0.getIntrinsicsUsageByParent() : G.g.InLayoutBlock : G.g.InMeasureBlock);
        }

        private final void L1(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, C3870c layer) {
            if (L.this.layoutNode.getIsDeactivated()) {
                C5047a.a("place is called on a deactivated node");
            }
            L.this.layoutState = G.e.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            m0 m0VarB = K.b(L.this.layoutNode);
            if (L.this.getLayoutPending() || !getIsPlaced()) {
                getAlignmentLines().r(false);
                L.this.Y(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                this.placeOuterCoordinatorLayer = layer;
                m0VarB.getSnapshotObserver().c(L.this.layoutNode, false, this.placeOuterCoordinatorBlock);
            } else {
                L.this.K().P2(position, zIndex, layerBlock, layer);
                K1();
            }
            L.this.layoutState = G.e.Idle;
        }

        private final void M1(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, C3870c layer) {
            Z.a placementScope;
            this.isPlacedByParent = true;
            if (!U0.n.g(position, this.lastPosition) || this.needsCoordinatesUpdate) {
                if (L.this.getCoordinatesAccessedDuringModifierPlacement() || L.this.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    L.this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
                G1();
            }
            if (M.a(L.this.layoutNode)) {
                AbstractC0823c0 wrappedBy = L.this.K().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = K.b(L.this.layoutNode).getPlacementScope();
                }
                Z.a aVar = placementScope;
                L l10 = L.this;
                a lookaheadPassDelegate = l10.getLookaheadPassDelegate();
                C3862t.d(lookaheadPassDelegate);
                G gO0 = l10.layoutNode.o0();
                if (gO0 != null) {
                    gO0.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.K1(Integer.MAX_VALUE);
                Z.a.h(aVar, lookaheadPassDelegate, U0.n.h(position), U0.n.i(position), 0.0f, 4, null);
            }
            a lookaheadPassDelegate2 = L.this.getLookaheadPassDelegate();
            if ((lookaheadPassDelegate2 == null || lookaheadPassDelegate2.getPlacedOnce()) ? false : true) {
                C5047a.b("Error: Placement happened before lookahead.");
            }
            L1(position, zIndex, layerBlock, layer);
        }

        private final void S1(G node) {
            G.g gVar;
            G gO0 = node.o0();
            if (gO0 == null) {
                this.measuredByParent = G.g.NotUsed;
                return;
            }
            if (!(this.measuredByParent == G.g.NotUsed || node.getCanMultiMeasure())) {
                C5047a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = a.f437a[gO0.W().ordinal()];
            if (i10 == 1) {
                gVar = G.g.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gO0.W());
                }
                gVar = G.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W0() {
            G g10 = L.this.layoutNode;
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (g11.d0().previousPlaceOrder != g11.p0()) {
                        g10.h1();
                        g10.D0();
                        if (g11.p0() == Integer.MAX_VALUE) {
                            g11.d0().F1();
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y0() {
            L.this.nextChildPlaceOrder = 0;
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    b bVarD0 = gArrT[i10].d0();
                    bVarD0.previousPlaceOrder = bVarD0.placeOrder;
                    bVarD0.placeOrder = Integer.MAX_VALUE;
                    bVarD0.isPlacedByParent = false;
                    if (bVarD0.measuredByParent == G.g.InLayoutBlock) {
                        bVarD0.measuredByParent = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < size);
            }
        }

        public final void A1() {
            L.this.detachedFromParentLookaheadPass = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y0.Z
        public void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
            M1(position, zIndex, layerBlock, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y0.Z
        public void D0(long position, float zIndex, C3870c layer) {
            M1(position, zIndex, null, layer);
        }

        @Override // A0.InterfaceC0820b
        public InterfaceC0820b F() {
            L layoutDelegate;
            G gO0 = L.this.layoutNode.o0();
            if (gO0 == null || (layoutDelegate = gO0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.r();
        }

        public final void G1() {
            Q.b<G> bVarW0;
            int size;
            if (L.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (bVarW0 = L.this.layoutNode.w0()).getSize()) <= 0) {
                return;
            }
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                L layoutDelegate = g10.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    G.u1(g10, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().G1();
                i10++;
            } while (i10 < size);
        }

        @Override // y0.L
        public int J(AbstractC5096a alignmentLine) {
            G gO0 = L.this.layoutNode.o0();
            if ((gO0 != null ? gO0.W() : null) == G.e.Measuring) {
                getAlignmentLines().u(true);
            } else {
                G gO02 = L.this.layoutNode.o0();
                if ((gO02 != null ? gO02.W() : null) == G.e.LayingOut) {
                    getAlignmentLines().t(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int iJ = L.this.K().J(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iJ;
        }

        public final void J1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            R1(false);
        }

        public final void K1() {
            this.onNodePlacedCalled = true;
            G gO0 = L.this.layoutNode.o0();
            float zIndex = z().getZIndex();
            G g10 = L.this.layoutNode;
            AbstractC0823c0 abstractC0823c0M0 = g10.m0();
            AbstractC0823c0 abstractC0823c0P = g10.P();
            while (abstractC0823c0M0 != abstractC0823c0P) {
                C3862t.e(abstractC0823c0M0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                C c10 = (C) abstractC0823c0M0;
                zIndex += c10.getZIndex();
                abstractC0823c0M0 = c10.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (gO0 != null) {
                    gO0.h1();
                }
                if (gO0 != null) {
                    gO0.D0();
                }
            }
            if (!getIsPlaced()) {
                if (gO0 != null) {
                    gO0.D0();
                }
                B1();
                if (this.relayoutWithoutParentInProgress && gO0 != null) {
                    G.u1(gO0, false, 1, null);
                }
            }
            if (gO0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && gO0.W() == G.e.LayingOut) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    C5047a.b("Place was called on a node which was placed already");
                }
                this.placeOrder = gO0.getLayoutDelegate().nextChildPlaceOrder;
                gO0.getLayoutDelegate().nextChildPlaceOrder++;
            }
            Y();
        }

        public final boolean N1(long constraints) {
            if (L.this.layoutNode.getIsDeactivated()) {
                C5047a.a("measure is called on a deactivated node");
            }
            m0 m0VarB = K.b(L.this.layoutNode);
            G gO0 = L.this.layoutNode.o0();
            boolean z10 = true;
            L.this.layoutNode.A1(L.this.layoutNode.getCanMultiMeasure() || (gO0 != null && gO0.getCanMultiMeasure()));
            if (!L.this.layoutNode.e0() && U0.b.f(getMeasurementConstraints(), constraints)) {
                m0.B(m0VarB, L.this.layoutNode, false, 2, null);
                L.this.layoutNode.z1();
                return false;
            }
            getAlignmentLines().s(false);
            t(d.f444B);
            this.measuredOnce = true;
            long jA = L.this.K().a();
            L0(constraints);
            L.this.U(constraints);
            if (U0.r.e(L.this.K().a(), jA) && L.this.K().getWidth() == getWidth() && L.this.K().getHeight() == getHeight()) {
                z10 = false;
            }
            K0(U0.s.a(L.this.K().getWidth(), L.this.K().getHeight()));
            return z10;
        }

        public final void O1() {
            G gO0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    C5047a.b("replace called on unplaced item");
                }
                boolean isPlaced = getIsPlaced();
                L1(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !this.onNodePlacedCalled && (gO0 = L.this.layoutNode.o0()) != null) {
                    G.u1(gO0, false, 1, null);
                }
                this.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                this.relayoutWithoutParentInProgress = false;
                throw th;
            }
        }

        public final void P1(boolean z10) {
            this.childDelegatesDirty = z10;
        }

        @Override // y0.InterfaceC5112q
        public int Q(int height) {
            I1();
            return L.this.K().Q(height);
        }

        public final void Q1(G.g gVar) {
            this.measuredByParent = gVar;
        }

        public void R1(boolean z10) {
            this.isPlaced = z10;
        }

        @Override // y0.InterfaceC5112q
        public int S(int height) {
            I1();
            return L.this.K().S(height);
        }

        @Override // y0.H
        public y0.Z T(long constraints) {
            G.g intrinsicsUsageByParent = L.this.layoutNode.getIntrinsicsUsageByParent();
            G.g gVar = G.g.NotUsed;
            if (intrinsicsUsageByParent == gVar) {
                L.this.layoutNode.v();
            }
            if (M.a(L.this.layoutNode)) {
                a lookaheadPassDelegate = L.this.getLookaheadPassDelegate();
                C3862t.d(lookaheadPassDelegate);
                lookaheadPassDelegate.J1(gVar);
                lookaheadPassDelegate.T(constraints);
            }
            S1(L.this.layoutNode);
            N1(constraints);
            return this;
        }

        public final boolean T1() {
            if ((getParentData() == null && L.this.K().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = L.this.K().getParentData();
            return true;
        }

        @Override // A0.InterfaceC0820b
        public void Y() {
            this.layingOutChildren = true;
            getAlignmentLines().o();
            if (L.this.getLayoutPending()) {
                H1();
            }
            if (L.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !z().getIsPlacingForAlignment() && L.this.getLayoutPending())) {
                L.this.layoutPending = false;
                G.e layoutState = L.this.getLayoutState();
                L.this.layoutState = G.e.LayingOut;
                L.this.Z(false);
                G g10 = L.this.layoutNode;
                K.b(g10).getSnapshotObserver().e(g10, false, this.layoutChildrenBlock);
                L.this.layoutState = layoutState;
                if (z().getIsPlacingForAlignment() && L.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                L.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().q(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
                getAlignmentLines().n();
            }
            this.layingOutChildren = false;
        }

        public final List<b> Z0() {
            L.this.layoutNode.K1();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.j();
            }
            G g10 = L.this.layoutNode;
            Q.b<b> bVar = this._childDelegates;
            Q.b<G> bVarW0 = g10.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    G g11 = gArrT[i10];
                    if (bVar.getSize() <= i10) {
                        bVar.c(g11.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        bVar.H(i10, g11.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i10++;
                } while (i10 < size);
            }
            bVar.F(g10.H().size(), bVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.j();
        }

        @Override // A0.W
        public void a0(boolean z10) {
            boolean isPlacedUnderMotionFrameOfReference = L.this.K().getIsPlacedUnderMotionFrameOfReference();
            if (z10 != isPlacedUnderMotionFrameOfReference) {
                L.this.K().a0(isPlacedUnderMotionFrameOfReference);
                this.needsCoordinatesUpdate = true;
            }
            this.isPlacedUnderMotionFrameOfReference = z10;
        }

        @Override // y0.L, y0.InterfaceC5112q
        /* renamed from: b, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        public final U0.b c1() {
            if (this.measuredOnce) {
                return U0.b.a(getMeasurementConstraints());
            }
            return null;
        }

        @Override // A0.InterfaceC0820b
        /* renamed from: d, reason: from getter */
        public AbstractC0818a getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // A0.InterfaceC0820b
        public void d0() {
            G.w1(L.this.layoutNode, false, false, false, 7, null);
        }

        /* renamed from: e1, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // y0.InterfaceC5112q
        public int f0(int width) {
            I1();
            return L.this.K().f0(width);
        }

        /* renamed from: m1, reason: from getter */
        public final G.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        @Override // A0.InterfaceC0820b
        /* renamed from: o, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // y0.InterfaceC5112q
        public int q(int width) {
            I1();
            return L.this.K().q(width);
        }

        /* renamed from: q1, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        @Override // A0.InterfaceC0820b
        public Map<AbstractC5096a, Integer> r() {
            if (!this.duringAlignmentLinesQuery) {
                if (L.this.getLayoutState() == G.e.Measuring) {
                    getAlignmentLines().s(true);
                    if (getAlignmentLines().getDirty()) {
                        L.this.O();
                    }
                } else {
                    getAlignmentLines().r(true);
                }
            }
            z().G1(true);
            Y();
            z().G1(false);
            return getAlignmentLines().h();
        }

        @Override // A0.InterfaceC0820b
        public void requestLayout() {
            G.u1(L.this.layoutNode, false, 1, null);
        }

        @Override // A0.InterfaceC0820b
        public void t(Ba.l<? super InterfaceC0820b, C4153F> block) {
            Q.b<G> bVarW0 = L.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                G[] gArrT = bVarW0.t();
                int i10 = 0;
                do {
                    block.invoke(gArrT[i10].getLayoutDelegate().r());
                    i10++;
                } while (i10 < size);
            }
        }

        /* renamed from: u1, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        @Override // y0.Z
        public int v0() {
            return L.this.K().v0();
        }

        public final void v1(boolean forceRequest) {
            G g10;
            G gO0 = L.this.layoutNode.o0();
            G.g intrinsicsUsageByParent = L.this.layoutNode.getIntrinsicsUsageByParent();
            if (gO0 == null || intrinsicsUsageByParent == G.g.NotUsed) {
                return;
            }
            do {
                g10 = gO0;
                if (g10.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    gO0 = g10.o0();
                }
            } while (gO0 != null);
            int i10 = a.f438b[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                G.w1(g10, forceRequest, false, false, 6, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                g10.t1(forceRequest);
            }
        }

        @Override // y0.Z
        public int y0() {
            return L.this.K().y0();
        }

        public final void y1() {
            this.parentDataDirty = true;
        }

        @Override // A0.InterfaceC0820b
        public AbstractC0823c0 z() {
            return L.this.layoutNode.P();
        }

        /* renamed from: z1, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f446C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10) {
            super(0);
            this.f446C = j10;
        }

        public final void a() {
            Q lookaheadDelegate = L.this.K().getLookaheadDelegate();
            C3862t.d(lookaheadDelegate);
            lookaheadDelegate.T(this.f446C);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {
        d() {
            super(0);
        }

        public final void a() {
            L.this.K().T(L.this.performMeasureConstraints);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public L(G g10) {
        this.layoutNode = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long constraints) {
        this.layoutState = G.e.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        o0.h(K.b(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new c(constraints), 2, null);
        P();
        if (M.a(this.layoutNode)) {
            O();
        } else {
            R();
        }
        this.layoutState = G.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long constraints) {
        G.e eVar = this.layoutState;
        G.e eVar2 = G.e.Idle;
        if (!(eVar == eVar2)) {
            C5047a.b("layout state is not idle before measure starts");
        }
        G.e eVar3 = G.e.Measuring;
        this.layoutState = eVar3;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        K.b(this.layoutNode).getSnapshotObserver().g(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == eVar3) {
            O();
            this.layoutState = eVar2;
        }
    }

    /* renamed from: A, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* renamed from: B, reason: from getter */
    public final G.e getLayoutState() {
        return this.layoutState;
    }

    public final InterfaceC0820b C() {
        return this.lookaheadPassDelegate;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* renamed from: H, reason: from getter */
    public final a getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    /* renamed from: I, reason: from getter */
    public final b getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* renamed from: J, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    public final AbstractC0823c0 K() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final int L() {
        return this.measurePassDelegate.getWidth();
    }

    public final void M() {
        this.measurePassDelegate.y1();
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.m1();
        }
    }

    public final void N() {
        this.measurePassDelegate.P1(true);
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.I1(true);
        }
    }

    public final void O() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void P() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void Q() {
        this.lookaheadMeasurePending = true;
    }

    public final void R() {
        this.measurePending = true;
    }

    public final void S() {
        G.e eVarW = this.layoutNode.W();
        if (eVarW == G.e.LayingOut || eVarW == G.e.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (eVarW == G.e.LookaheadLayingOut) {
            a aVar = this.lookaheadPassDelegate;
            if (aVar == null || !aVar.getLayingOutChildren()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        AbstractC0818a alignmentLines;
        this.measurePassDelegate.getAlignmentLines().p();
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || (alignmentLines = aVar.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.p();
    }

    public final void W(int i10) {
        int i11 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            G gO0 = this.layoutNode.o0();
            L layoutDelegate = gO0 != null ? gO0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.W(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.W(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void X(int i10) {
        int i11 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            G gO0 = this.layoutNode.o0();
            L layoutDelegate = gO0 != null ? gO0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.X(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.X(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void Y(boolean z10) {
        if (this.coordinatesAccessedDuringModifierPlacement != z10) {
            this.coordinatesAccessedDuringModifierPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringPlacement) {
                W(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                W(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void Z(boolean z10) {
        if (this.coordinatesAccessedDuringPlacement != z10) {
            this.coordinatesAccessedDuringPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringModifierPlacement) {
                W(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                W(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void a0(boolean z10) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z10) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z10;
            if (z10 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void b0(boolean z10) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z10) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z10;
            if (z10 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void c0() {
        G gO0;
        if (this.measurePassDelegate.T1() && (gO0 = this.layoutNode.o0()) != null) {
            G.w1(gO0, false, false, false, 7, null);
        }
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || !aVar.N1()) {
            return;
        }
        if (M.a(this.layoutNode)) {
            G gO02 = this.layoutNode.o0();
            if (gO02 != null) {
                G.w1(gO02, false, false, false, 7, null);
                return;
            }
            return;
        }
        G gO03 = this.layoutNode.o0();
        if (gO03 != null) {
            G.s1(gO03, false, false, false, 7, null);
        }
    }

    public final void q() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new a();
        }
    }

    public final InterfaceC0820b r() {
        return this.measurePassDelegate;
    }

    /* renamed from: s, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* renamed from: t, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    public final int x() {
        return this.measurePassDelegate.getHeight();
    }

    public final U0.b y() {
        return this.measurePassDelegate.c1();
    }

    public final U0.b z() {
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            return aVar.getLookaheadConstraints();
        }
        return null;
    }
}
