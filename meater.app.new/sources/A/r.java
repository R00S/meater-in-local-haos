package A;

import A.AbstractC0812u;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import s.C4402l;

/* compiled from: FlowLayoutBuildingBlocks.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016 B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"LA/r;", "", "", "maxItemsInMainAxis", "LA/v;", "overflow", "LA/M;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILA/v;JIIILkotlin/jvm/internal/k;)V", "LA/r$b;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "LA/r$a;", "a", "(LA/r$b;ZIIII)LA/r$a;", "nextItemHasNext", "Ls/l;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "b", "(ZIJLs/l;IIIZZ)LA/r$b;", "I", "LA/v;", "c", "J", "d", "e", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FlowLayoutOverflowState overflow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"LA/r$a;", "", "Ly0/H;", "ellipsis", "Ly0/Z;", "placeable", "Ls/l;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Ly0/H;Ly0/Z;JZLkotlin/jvm/internal/k;)V", "a", "Ly0/H;", "()Ly0/H;", "b", "Ly0/Z;", "d", "()Ly0/Z;", "c", "J", "()J", "Z", "()Z", "e", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y0.H ellipsis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final y0.Z placeable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long ellipsisSize;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean placeEllipsisOnLastContentLine;

        public /* synthetic */ a(y0.H h10, y0.Z z10, long j10, boolean z11, C3854k c3854k) {
            this(h10, z10, j10, z11);
        }

        /* renamed from: a, reason: from getter */
        public final y0.H getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: b, reason: from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        /* renamed from: d, reason: from getter */
        public final y0.Z getPlaceable() {
            return this.placeable;
        }

        public final void e(boolean z10) {
            this.placeEllipsisOnLastContentLine = z10;
        }

        private a(y0.H h10, y0.Z z10, long j10, boolean z11) {
            this.ellipsis = h10;
            this.placeable = z10;
            this.ellipsisSize = j10;
            this.placeEllipsisOnLastContentLine = z11;
        }

        public /* synthetic */ a(y0.H h10, y0.Z z10, long j10, boolean z11, int i10, C3854k c3854k) {
            this(h10, z10, j10, (i10 & 8) != 0 ? true : z11, null);
        }
    }

    /* compiled from: FlowLayoutBuildingBlocks.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"LA/r$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInLine;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInContainer;

        public b(boolean z10, boolean z11) {
            this.isLastItemInLine = z10;
            this.isLastItemInContainer = z11;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }
    }

    public /* synthetic */ r(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13, C3854k c3854k) {
        this(i10, flowLayoutOverflowState, j10, i11, i12, i13);
    }

    public final a a(b wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        a aVarE;
        if (!wrapInfo.getIsLastItemInContainer() || (aVarE = this.overflow.e(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        aVarE.e(lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - C4402l.e(aVarE.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis)));
        return aVarE;
    }

    public final b b(boolean nextItemHasNext, int nextIndexInLine, long leftOver, C4402l nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i10 = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new b(true, true);
        }
        if (this.overflow.getType() != AbstractC0812u.a.Visible && (lineIndex >= this.maxLines || C4402l.f(leftOver) - C4402l.f(nextSize.getPackedValue()) < 0)) {
            return new b(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || C4402l.e(leftOver) - C4402l.e(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new b(true, true) : new b(true, b(nextItemHasNext, 0, C4402l.b(U0.b.l(this.constraints), (C4402l.f(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), C4402l.a(C4402l.b(C4402l.e(nextSize.getPackedValue()) - this.mainAxisSpacing, C4402l.f(nextSize.getPackedValue()))), lineIndex + 1, i10, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, C4402l.f(nextSize.getPackedValue()));
        C4402l c4402lF = isEllipsisWrap ? null : this.overflow.f(nextItemHasNext, lineIndex, iMax);
        if (c4402lF != null) {
            c4402lF.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((C4402l.e(leftOver) - C4402l.e(nextSize.getPackedValue())) - this.mainAxisSpacing) - C4402l.e(c4402lF.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, C4402l.b(U0.b.l(this.constraints), (C4402l.f(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, C4402l.f(nextSize.getPackedValue()))), c4402lF, lineIndex + 1, iMax, 0, true, true);
                return new b(bVarB.getIsLastItemInContainer(), bVarB.getIsLastItemInContainer());
            }
        }
        return new b(false, false);
    }

    private r(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13) {
        this.maxItemsInMainAxis = i10;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j10;
        this.maxLines = i11;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
    }
}
