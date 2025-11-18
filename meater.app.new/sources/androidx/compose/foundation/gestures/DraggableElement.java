package androidx.compose.foundation.gestures;

import A0.V;
import Ba.l;
import Ba.q;
import Xb.I;
import h0.C3476g;
import kotlin.EnumC5037q;
import kotlin.InterfaceC5033m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;
import u0.PointerInputChange;
import z.InterfaceC5162k;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(¨\u00061"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LA0/V;", "Landroidx/compose/foundation/gestures/c;", "Lx/m;", "state", "Lx/q;", "orientation", "", "enabled", "Lz/k;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LXb/I;", "Lh0/g;", "Lta/d;", "Loa/F;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lx/m;Lx/q;ZLz/k;ZLBa/q;LBa/q;Z)V", "p", "()Landroidx/compose/foundation/gestures/c;", "node", "s", "(Landroidx/compose/foundation/gestures/c;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lx/m;", "c", "Lx/q;", "d", "Z", "e", "Lz/k;", "f", "g", "LBa/q;", "h", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends V<c> {

    /* renamed from: k, reason: collision with root package name */
    private static final l<PointerInputChange, Boolean> f21978k = a.f21987B;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5033m state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5162k interactionSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q<I, C3476g, InterfaceC4588d<? super C4153F>, Object> onDragStarted;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q<I, Float, InterfaceC4588d<? super C4153F>, Object> onDragStopped;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "", "a", "(Lu0/z;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<PointerInputChange, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f21987B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(InterfaceC5033m interfaceC5033m, EnumC5037q enumC5037q, boolean z10, InterfaceC5162k interfaceC5162k, boolean z11, q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, q<? super I, ? super Float, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar2, boolean z12) {
        this.state = interfaceC5033m;
        this.orientation = enumC5037q;
        this.enabled = z10;
        this.interactionSource = interfaceC5162k;
        this.startDragImmediately = z11;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return C3862t.b(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && C3862t.b(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && C3862t.b(this.onDragStarted, draggableElement.onDragStarted) && C3862t.b(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        InterfaceC5162k interfaceC5162k = this.interactionSource;
        return ((((((((iHashCode + (interfaceC5162k != null ? interfaceC5162k.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c m() {
        return new c(this.state, f21978k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(c node) {
        node.R2(this.state, f21978k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
