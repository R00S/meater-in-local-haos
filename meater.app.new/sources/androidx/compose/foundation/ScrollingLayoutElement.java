package androidx.compose.foundation;

import A0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import w.M;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0007\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "LA0/V;", "Lw/M;", "Landroidx/compose/foundation/o;", "scrollState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZZ)V", "p", "()Lw/M;", "node", "Loa/F;", "s", "(Lw/M;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/o;", "getScrollState", "()Landroidx/compose/foundation/o;", "c", "Z", "()Z", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends V<M> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o scrollState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isReversed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    public ScrollingLayoutElement(o oVar, boolean z10, boolean z11) {
        this.scrollState = oVar;
        this.isReversed = z10;
        this.isVertical = z11;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) other;
        return C3862t.b(this.scrollState, scrollingLayoutElement.scrollState) && this.isReversed == scrollingLayoutElement.isReversed && this.isVertical == scrollingLayoutElement.isVertical;
    }

    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.isReversed)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public M m() {
        return new M(this.scrollState, this.isReversed, this.isVertical);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(M node) {
        node.n2(this.scrollState);
        node.m2(this.isReversed);
        node.o2(this.isVertical);
    }
}
