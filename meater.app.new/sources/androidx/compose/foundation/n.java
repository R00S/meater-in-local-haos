package androidx.compose.foundation;

import A0.v0;
import F0.ScrollAxisRange;
import F0.v;
import F0.x;
import b0.i;
import kotlin.InterfaceC5034n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\t\u0010\u001a\"\u0004\b$\u0010\u001cR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b\n\u0010\u001a\"\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/foundation/n;", "Lb0/i$c;", "LA0/v0;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lx/n;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLx/n;ZZ)V", "LF0/x;", "Loa/F;", "m1", "(LF0/x;)V", "O", "Landroidx/compose/foundation/o;", "j2", "()Landroidx/compose/foundation/o;", "n2", "(Landroidx/compose/foundation/o;)V", "P", "Z", "getReverseScrolling", "()Z", "l2", "(Z)V", "Q", "Lx/n;", "getFlingBehavior", "()Lx/n;", "k2", "(Lx/n;)V", "R", "m2", "S", "o2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends i.c implements v0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private o state;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5034n flingBehavior;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean isScrollable;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Float> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getState().m());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Float> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getState().l());
        }
    }

    public n(o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, boolean z12) {
        this.state = oVar;
        this.reverseScrolling = z10;
        this.flingBehavior = interfaceC5034n;
        this.isScrollable = z11;
        this.isVertical = z12;
    }

    /* renamed from: j2, reason: from getter */
    public final o getState() {
        return this.state;
    }

    public final void k2(InterfaceC5034n interfaceC5034n) {
        this.flingBehavior = interfaceC5034n;
    }

    public final void l2(boolean z10) {
        this.reverseScrolling = z10;
    }

    @Override // A0.v0
    public void m1(x xVar) {
        v.N(xVar, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new a(), new b(), this.reverseScrolling);
        if (this.isVertical) {
            v.O(xVar, scrollAxisRange);
        } else {
            v.D(xVar, scrollAxisRange);
        }
    }

    public final void m2(boolean z10) {
        this.isScrollable = z10;
    }

    public final void n2(o oVar) {
        this.state = oVar;
    }

    public final void o2(boolean z10) {
        this.isVertical = z10;
    }
}
