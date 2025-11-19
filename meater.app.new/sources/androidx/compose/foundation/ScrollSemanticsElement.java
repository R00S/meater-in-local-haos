package androidx.compose.foundation;

import A0.V;
import kotlin.InterfaceC5034n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b\t\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b\n\u0010$¨\u0006+"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "LA0/V;", "Landroidx/compose/foundation/n;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lx/n;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLx/n;ZZ)V", "p", "()Landroidx/compose/foundation/n;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/o;", "getState", "()Landroidx/compose/foundation/o;", "c", "Z", "getReverseScrolling", "()Z", "d", "Lx/n;", "getFlingBehavior", "()Lx/n;", "e", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ScrollSemanticsElement extends V<n> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reverseScrolling;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5034n flingBehavior;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isScrollable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVertical;

    public ScrollSemanticsElement(o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, boolean z12) {
        this.state = oVar;
        this.reverseScrolling = z10;
        this.flingBehavior = interfaceC5034n;
        this.isScrollable = z11;
        this.isVertical = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) other;
        return C3862t.b(this.state, scrollSemanticsElement.state) && this.reverseScrolling == scrollSemanticsElement.reverseScrolling && C3862t.b(this.flingBehavior, scrollSemanticsElement.flingBehavior) && this.isScrollable == scrollSemanticsElement.isScrollable && this.isVertical == scrollSemanticsElement.isVertical;
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        InterfaceC5034n interfaceC5034n = this.flingBehavior;
        return ((((iHashCode + (interfaceC5034n == null ? 0 : interfaceC5034n.hashCode())) * 31) + Boolean.hashCode(this.isScrollable)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public n m() {
        return new n(this.state, this.reverseScrolling, this.flingBehavior, this.isScrollable, this.isVertical);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(n node) {
        node.n2(this.state);
        node.l2(this.reverseScrolling);
        node.k2(this.flingBehavior);
        node.m2(this.isScrollable);
        node.o2(this.isVertical);
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.state + ", reverseScrolling=" + this.reverseScrolling + ", flingBehavior=" + this.flingBehavior + ", isScrollable=" + this.isScrollable + ", isVertical=" + this.isVertical + ')';
    }
}
