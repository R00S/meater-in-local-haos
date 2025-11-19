package B;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import l0.C3870c;
import y0.Z;

/* compiled from: LazyGridMeasuredItem.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020\u0003¢\u0006\u0004\b1\u0010/J\u0015\u00104\u001a\u00020&2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00107R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00107R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\bK\u0010=R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\b>\u0010OR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\bJ\u00109R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\bE\u00109R\u0017\u0010R\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u00109R\u001a\u0010S\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bD\u00109R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u00107R\u0016\u0010V\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00107R\u0016\u0010W\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00107R \u0010Y\u001a\u00020X8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010I\u001a\u0004\b6\u0010OR*\u0010[\u001a\u00020\u00132\u0006\u0010Z\u001a\u00020\u00138\u0016@RX\u0096\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010I\u001a\u0004\bL\u0010OR$\u0010)\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\bG\u00109R$\u0010*\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b]\u00107\u001a\u0004\bN\u00109R\"\u0010`\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010?\u001a\u0004\bU\u0010A\"\u0004\bB\u0010_R\u0018\u0010b\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010aR\u0018\u0010R\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010cR\u0014\u0010d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"LB/v;", "LB/k;", "LC/w;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "LU0/t;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Ly0/Z;", "placeables", "LU0/n;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "LU0/b;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLU0/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/k;)V", "g", "(I)Ljava/lang/Object;", "j", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Loa/F;", "n", "(IIII)V", "row", "column", "u", "(IIIIII)V", "mainAxisLayoutSize", "v", "(I)V", "delta", "o", "Ly0/Z$a;", "scope", "t", "(Ly0/Z$a;)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "i", "()Z", "d", "getCrossAxisSize", "e", "f", "LU0/t;", "h", "Ljava/util/List;", "J", "k", "getContentType", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "m", "()J", "p", "q", "mainAxisSize", "mainAxisSizeWithSpacings", "r", "s", "minMainAxisOffset", "maxMainAxisOffset", "LU0/r;", "size", "<set-?>", "offset", "w", "x", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Ly0/Z;)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v implements InterfaceC0882k, kotlin.w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final U0.t layoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<Z> placeables;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<v> animator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int row;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int column;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    public /* synthetic */ v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, U0.t tVar, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, C3854k c3854k) {
        this(i10, obj, z10, i11, i12, z11, tVar, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    private final int p(long j10) {
        return getIsVertical() ? U0.n.i(j10) : U0.n.h(j10);
    }

    private final int r(Z z10) {
        return getIsVertical() ? z10.getHeight() : z10.getWidth();
    }

    @Override // B.InterfaceC0882k
    /* renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // kotlin.w
    public int b() {
        return this.placeables.size();
    }

    @Override // kotlin.w
    /* renamed from: c, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // kotlin.w
    public void d(boolean z10) {
        this.nonScrollableItem = z10;
    }

    @Override // kotlin.w
    /* renamed from: e, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // kotlin.w
    /* renamed from: f, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @Override // kotlin.w
    public Object g(int index) {
        return this.placeables.get(index).b();
    }

    @Override // B.InterfaceC0882k, kotlin.w
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.w
    public Object getKey() {
        return this.key;
    }

    @Override // B.InterfaceC0882k
    /* renamed from: h, reason: from getter */
    public int getRow() {
        return this.row;
    }

    @Override // kotlin.w
    /* renamed from: i, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // kotlin.w
    public long j(int index) {
        return getOffset();
    }

    @Override // kotlin.w
    /* renamed from: k, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // B.InterfaceC0882k
    /* renamed from: l, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // B.InterfaceC0882k
    /* renamed from: m, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // kotlin.w
    public void n(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        u(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    public final void o(int delta) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int iH = getIsVertical() ? U0.n.h(offset) : U0.n.h(offset) + delta;
        boolean isVertical = getIsVertical();
        int i10 = U0.n.i(offset);
        if (isVertical) {
            i10 += delta;
        }
        this.offset = U0.o.a(iH, i10);
        int iB = b();
        for (int i11 = 0; i11 < iB; i11++) {
            androidx.compose.foundation.lazy.layout.b bVarE = this.animator.e(getKey(), i11);
            if (bVarE != null) {
                long rawOffset = bVarE.getRawOffset();
                int iH2 = getIsVertical() ? U0.n.h(rawOffset) : Integer.valueOf(U0.n.h(rawOffset) + delta).intValue();
                boolean isVertical2 = getIsVertical();
                int i12 = U0.n.i(rawOffset);
                if (isVertical2) {
                    i12 += delta;
                }
                bVarE.H(U0.o.a(iH2, i12));
            }
        }
    }

    /* renamed from: q, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: s, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void t(Z.a scope) {
        C3870c layer;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            Z z10 = this.placeables.get(i10);
            int iR = this.minMainAxisOffset - r(z10);
            int i11 = this.maxMainAxisOffset;
            long offset = getOffset();
            androidx.compose.foundation.lazy.layout.b bVarE = this.animator.e(getKey(), i10);
            if (bVarE != null) {
                long jL = U0.n.l(offset, bVarE.q());
                if ((p(offset) <= iR && p(jL) <= iR) || (p(offset) >= i11 && p(jL) >= i11)) {
                    bVarE.n();
                }
                layer = bVarE.getLayer();
                offset = jL;
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                offset = U0.o.a(getIsVertical() ? U0.n.h(offset) : (this.mainAxisLayoutSize - U0.n.h(offset)) - r(z10), getIsVertical() ? (this.mainAxisLayoutSize - U0.n.i(offset)) - r(z10) : U0.n.i(offset));
            }
            long jL2 = U0.n.l(offset, this.visualOffset);
            if (bVarE != null) {
                bVarE.D(jL2);
            }
            if (getIsVertical()) {
                if (layer != null) {
                    Z.a.z(scope, z10, jL2, layer, 0.0f, 4, null);
                } else {
                    Z.a.y(scope, z10, jL2, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                Z.a.t(scope, z10, jL2, layer, 0.0f, 4, null);
            } else {
                Z.a.s(scope, z10, jL2, 0.0f, null, 6, null);
            }
        }
    }

    public final void u(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == U0.t.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        this.offset = getIsVertical() ? U0.o.a(crossAxisOffset, mainAxisOffset) : U0.o.a(mainAxisOffset, crossAxisOffset);
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void v(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, U0.t tVar, int i13, int i14, List<? extends Z> list, long j10, Object obj2, LazyLayoutItemAnimator<v> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.index = i10;
        this.key = obj;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.reverseLayout = z11;
        this.layoutDirection = tVar;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.placeables = list;
        this.visualOffset = j10;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        this.lane = i15;
        this.span = i16;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Z z12 = (Z) list.get(i17);
            iMax = Math.max(iMax, getIsVertical() ? z12.getHeight() : z12.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = Ha.g.d(iMax + i12, 0);
        this.size = getIsVertical() ? U0.s.a(this.crossAxisSize, iMax) : U0.s.a(iMax, this.crossAxisSize);
        this.offset = U0.n.INSTANCE.a();
        this.row = -1;
        this.column = -1;
    }
}
