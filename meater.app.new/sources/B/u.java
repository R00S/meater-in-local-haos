package B;

import java.util.List;
import java.util.Map;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4170o;
import y.C5089a;
import y0.AbstractC5096a;
import y0.f0;

/* compiled from: LazyGridMeasureResult.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B½\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b?\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R5\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0019\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010.\u001a\u0004\bS\u00100R\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010.\u001a\u0004\bH\u00100R\u001a\u0010\u001b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010.\u001a\u0004\bJ\u00100R\u001a\u0010\u001c\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bU\u00106R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b3\u0010XR\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\bD\u00100R\u001a\u0010 \u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\bT\u00100R \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00050Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010[R\u0014\u0010]\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u00100R\"\u0010_\u001a\u0010\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020#\u0018\u00010\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0014\u0010`\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u00100R\u0011\u0010a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u00106R\u001a\u0010d\u001a\u00020b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010cR\u0014\u0010e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"LB/u;", "LB/s;", "Ly0/J;", "LB/x;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "remeasureNeeded", "LXb/I;", "coroutineScope", "LU0/d;", "density", "slotsPerLine", "Lkotlin/Function1;", "", "Loa/o;", "LU0/b;", "prefetchInfoRetriever", "LB/v;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Lx/q;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(LB/x;IZFLy0/J;ZLXb/I;LU0/d;ILBa/l;Ljava/util/List;IIIZLx/q;II)V", "Loa/F;", "e", "()V", "delta", "u", "(I)Z", "a", "LB/x;", "r", "()LB/x;", "b", "I", "s", "()I", "setFirstVisibleLineScrollOffset", "(I)V", "c", "Z", "p", "()Z", "setCanScrollForward", "(Z)V", "d", "F", "q", "()F", "setConsumedScroll", "(F)V", "getRemeasureNeeded", "f", "LXb/I;", "getCoroutineScope", "()LXb/I;", "g", "LU0/d;", "getDensity", "()LU0/d;", "h", "getSlotsPerLine", "i", "LBa/l;", "t", "()LBa/l;", "j", "Ljava/util/List;", "n", "()Ljava/util/List;", "k", "m", "l", "getReverseLayout", "o", "Lx/q;", "()Lx/q;", "", "Ly0/a;", "()Ljava/util/Map;", "alignmentLines", "height", "Ly0/f0;", "rulers", "width", "canScrollBackward", "LU0/r;", "()J", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u implements s, y0.J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x firstVisibleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleLineScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float consumedScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Xb.I coroutineScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final U0.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int slotsPerLine;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Integer, List<C4170o<Integer, U0.b>>> prefetchInfoRetriever;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<v> visibleItemsInfo;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ y0.J f1354r;

    /* JADX WARN: Multi-variable type inference failed */
    public u(x xVar, int i10, boolean z10, float f10, y0.J j10, boolean z11, Xb.I i11, U0.d dVar, int i12, Ba.l<? super Integer, ? extends List<C4170o<Integer, U0.b>>> lVar, List<v> list, int i13, int i14, int i15, boolean z12, EnumC5037q enumC5037q, int i16, int i17) {
        this.firstVisibleLine = xVar;
        this.firstVisibleLineScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f10;
        this.remeasureNeeded = z11;
        this.coroutineScope = i11;
        this.density = dVar;
        this.slotsPerLine = i12;
        this.prefetchInfoRetriever = lVar;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i13;
        this.viewportEndOffset = i14;
        this.totalItemsCount = i15;
        this.reverseLayout = z12;
        this.orientation = enumC5037q;
        this.afterContentPadding = i16;
        this.mainAxisItemSpacing = i17;
        this.f1354r = j10;
    }

    @Override // y0.J
    /* renamed from: a */
    public int getHeight() {
        return this.f1354r.getHeight();
    }

    @Override // y0.J
    /* renamed from: b */
    public int getWidth() {
        return this.f1354r.getWidth();
    }

    @Override // B.s
    /* renamed from: c, reason: from getter */
    public EnumC5037q getOrientation() {
        return this.orientation;
    }

    @Override // y0.J
    public Map<AbstractC5096a, Integer> d() {
        return this.f1354r.d();
    }

    @Override // y0.J
    public void e() {
        this.f1354r.e();
    }

    @Override // B.s
    public long f() {
        return U0.s.a(getWidth(), getHeight());
    }

    @Override // B.s
    /* renamed from: g, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // B.s
    /* renamed from: h, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // B.s
    /* renamed from: i, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // y0.J
    public Ba.l<f0, C4153F> j() {
        return this.f1354r.j();
    }

    @Override // B.s
    public int k() {
        return -getViewportStartOffset();
    }

    @Override // B.s
    /* renamed from: l, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // B.s
    /* renamed from: m, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // B.s
    public List<v> n() {
        return this.visibleItemsInfo;
    }

    public final boolean o() {
        x xVar = this.firstVisibleLine;
        return ((xVar != null ? xVar.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: q, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* renamed from: r, reason: from getter */
    public final x getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* renamed from: s, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final Ba.l<Integer, List<C4170o<Integer, U0.b>>> t() {
        return this.prefetchInfoRetriever;
    }

    public final boolean u(int delta) {
        x xVar;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (!this.remeasureNeeded && !n().isEmpty() && (xVar = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = xVar.getMainAxisSizeWithSpacings();
            int i10 = this.firstVisibleLineScrollOffset - delta;
            if (i10 >= 0 && i10 < mainAxisSizeWithSpacings) {
                v vVar = (v) kotlin.collections.r.j0(n());
                v vVar2 = (v) kotlin.collections.r.u0(n());
                if (!vVar.getNonScrollableItem() && !vVar2.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - C5089a.a(vVar, getOrientation()), getViewportEndOffset() - C5089a.a(vVar2, getOrientation())) > delta : Math.min((C5089a.a(vVar, getOrientation()) + vVar.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (C5089a.a(vVar2, getOrientation()) + vVar2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    this.firstVisibleLineScrollOffset -= delta;
                    List<v> listN = n();
                    int size = listN.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        listN.get(i11).o(delta);
                    }
                    this.consumedScroll = delta;
                    z10 = true;
                    z10 = true;
                    z10 = true;
                    if (!this.canScrollForward && delta > 0) {
                        this.canScrollForward = true;
                    }
                }
            }
        }
        return z10;
    }
}
