package androidx.compose.foundation.gestures;

import A0.V;
import kotlin.EnumC5037q;
import kotlin.InterfaceC5024d;
import kotlin.InterfaceC5034n;
import kotlin.InterfaceC5044x;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import w.I;
import z.InterfaceC5162k;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LA0/V;", "Landroidx/compose/foundation/gestures/f;", "Lx/x;", "state", "Lx/q;", "orientation", "Lw/I;", "overscrollEffect", "", "enabled", "reverseDirection", "Lx/n;", "flingBehavior", "Lz/k;", "interactionSource", "Lx/d;", "bringIntoViewSpec", "<init>", "(Lx/x;Lx/q;Lw/I;ZZLx/n;Lz/k;Lx/d;)V", "p", "()Landroidx/compose/foundation/gestures/f;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/gestures/f;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lx/x;", "getState", "()Lx/x;", "c", "Lx/q;", "getOrientation", "()Lx/q;", "d", "Lw/I;", "getOverscrollEffect", "()Lw/I;", "e", "Z", "getEnabled", "()Z", "f", "getReverseDirection", "g", "Lx/n;", "getFlingBehavior", "()Lx/n;", "h", "Lz/k;", "getInteractionSource", "()Lz/k;", "i", "Lx/d;", "getBringIntoViewSpec", "()Lx/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends V<f> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5044x state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I overscrollEffect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5034n flingBehavior;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5162k interactionSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5024d bringIntoViewSpec;

    public ScrollableElement(InterfaceC5044x interfaceC5044x, EnumC5037q enumC5037q, I i10, boolean z10, boolean z11, InterfaceC5034n interfaceC5034n, InterfaceC5162k interfaceC5162k, InterfaceC5024d interfaceC5024d) {
        this.state = interfaceC5044x;
        this.orientation = enumC5037q;
        this.overscrollEffect = i10;
        this.enabled = z10;
        this.reverseDirection = z11;
        this.flingBehavior = interfaceC5034n;
        this.interactionSource = interfaceC5162k;
        this.bringIntoViewSpec = interfaceC5024d;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return C3862t.b(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && C3862t.b(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && C3862t.b(this.flingBehavior, scrollableElement.flingBehavior) && C3862t.b(this.interactionSource, scrollableElement.interactionSource) && C3862t.b(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        I i10 = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (i10 != null ? i10.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        InterfaceC5034n interfaceC5034n = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (interfaceC5034n != null ? interfaceC5034n.hashCode() : 0)) * 31;
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (interfaceC5162k != null ? interfaceC5162k.hashCode() : 0)) * 31;
        InterfaceC5024d interfaceC5024d = this.bringIntoViewSpec;
        return iHashCode4 + (interfaceC5024d != null ? interfaceC5024d.hashCode() : 0);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f m() {
        return new f(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(f node) {
        node.Q2(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
