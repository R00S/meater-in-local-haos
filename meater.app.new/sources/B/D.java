package B;

import kotlin.C1538d1;
import kotlin.InterfaceC1557m0;
import kotlin.Metadata;
import kotlin.collections.C3831l;

/* compiled from: LazyGridScrollPosition.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"LB/D;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "Loa/F;", "g", "LB/u;", "measureResult", "h", "(LB/u;)V", "i", "(I)V", "d", "LB/l;", "itemProvider", "j", "(LB/l;I)I", "<set-?>", "a", "LO/m0;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "LC/y;", "LC/y;", "()LC/y;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 scrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kotlin.y nearestRangeState;

    public D(int i10, int i11) {
        this.index = C1538d1.a(i10);
        this.scrollOffset = C1538d1.a(i11);
        this.nearestRangeState = new kotlin.y(i10, 90, 200);
    }

    private final void e(int i10) {
        this.index.g(i10);
    }

    private final void f(int i10) {
        this.scrollOffset.g(i10);
    }

    private final void g(int index, int scrollOffset) {
        if (index >= 0.0f) {
            e(index);
            this.nearestRangeState.j(index);
            f(scrollOffset);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + ')').toString());
        }
    }

    public final int a() {
        return this.index.d();
    }

    /* renamed from: b, reason: from getter */
    public final kotlin.y getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.d();
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void h(u measureResult) {
        v[] items;
        v vVar;
        v[] items2;
        v vVar2;
        x xVarR = measureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (xVarR == null || (items2 = xVarR.getItems()) == null || (vVar2 = (v) C3831l.Y(items2)) == null) ? null : vVar2.getKey();
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int iS = measureResult.getFirstVisibleLineScrollOffset();
            if (iS >= 0.0f) {
                x xVarR2 = measureResult.getFirstVisibleLine();
                g((xVarR2 == null || (items = xVarR2.getItems()) == null || (vVar = (v) C3831l.Y(items)) == null) ? 0 : vVar.getIndex(), iS);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iS + ')').toString());
            }
        }
    }

    public final void i(int scrollOffset) {
        if (scrollOffset >= 0.0f) {
            f(scrollOffset);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + scrollOffset + ')').toString());
    }

    public final int j(l itemProvider, int index) {
        int iA = kotlin.r.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iA) {
            e(iA);
            this.nearestRangeState.j(index);
        }
        return iA;
    }
}
