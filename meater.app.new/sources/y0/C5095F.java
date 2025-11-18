package y0;

import A0.AbstractC0823c0;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020\"8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0016\u0010'\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Ly0/F;", "Ly0/v;", "LA0/Q;", "lookaheadDelegate", "<init>", "(LA0/Q;)V", "Lh0/g;", "relativeToLocal", "u", "(J)J", "c0", "sourceCoordinates", "relativeToSource", "R", "(Ly0/v;J)J", "", "includeMotionFrameOfReference", "g0", "(Ly0/v;JZ)J", "clipBounds", "Lh0/i;", "M", "(Ly0/v;Z)Lh0/i;", "B", "LA0/Q;", "getLookaheadDelegate", "()LA0/Q;", "c", "()J", "lookaheadOffset", "LA0/c0;", "b", "()LA0/c0;", "coordinator", "LU0/r;", "a", "size", "U", "()Ly0/v;", "parentLayoutCoordinates", "L", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5095F implements InterfaceC5116v {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final A0.Q lookaheadDelegate;

    public C5095F(A0.Q q10) {
        this.lookaheadDelegate = q10;
    }

    private final long c() {
        A0.Q qA = G.a(this.lookaheadDelegate);
        InterfaceC5116v interfaceC5116vW0 = qA.W0();
        C3476g.Companion companion = C3476g.INSTANCE;
        return C3476g.q(R(interfaceC5116vW0, companion.c()), b().R(qA.getCoordinator(), companion.c()));
    }

    @Override // y0.InterfaceC5116v
    public boolean L() {
        return b().L();
    }

    @Override // y0.InterfaceC5116v
    public C3478i M(InterfaceC5116v sourceCoordinates, boolean clipBounds) {
        return b().M(sourceCoordinates, clipBounds);
    }

    @Override // y0.InterfaceC5116v
    public long R(InterfaceC5116v sourceCoordinates, long relativeToSource) {
        return g0(sourceCoordinates, relativeToSource, true);
    }

    @Override // y0.InterfaceC5116v
    public InterfaceC5116v U() {
        A0.Q lookaheadDelegate;
        if (!L()) {
            C5047a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC0823c0 wrappedBy = b().getLayoutNode().m0().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.W0();
    }

    @Override // y0.InterfaceC5116v
    public long a() {
        A0.Q q10 = this.lookaheadDelegate;
        return U0.s.a(q10.getWidth(), q10.getHeight());
    }

    public final AbstractC0823c0 b() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // y0.InterfaceC5116v
    public long c0(long relativeToLocal) {
        return b().c0(C3476g.r(relativeToLocal, c()));
    }

    @Override // y0.InterfaceC5116v
    public long g0(InterfaceC5116v sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof C5095F)) {
            A0.Q qA = G.a(this.lookaheadDelegate);
            return C3476g.r(g0(qA.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference), qA.getCoordinator().W0().g0(sourceCoordinates, C3476g.INSTANCE.c(), includeMotionFrameOfReference));
        }
        A0.Q q10 = ((C5095F) sourceCoordinates).lookaheadDelegate;
        q10.getCoordinator().G2();
        A0.Q lookaheadDelegate = b().e2(q10.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long jK = U0.n.k(U0.n.l(q10.U1(lookaheadDelegate, !includeMotionFrameOfReference), U0.o.d(relativeToSource)), this.lookaheadDelegate.U1(lookaheadDelegate, !includeMotionFrameOfReference));
            return C3477h.a(U0.n.h(jK), U0.n.i(jK));
        }
        A0.Q qA2 = G.a(q10);
        long jL = U0.n.l(U0.n.l(q10.U1(qA2, !includeMotionFrameOfReference), qA2.getPosition()), U0.o.d(relativeToSource));
        A0.Q qA3 = G.a(this.lookaheadDelegate);
        long jK2 = U0.n.k(jL, U0.n.l(this.lookaheadDelegate.U1(qA3, !includeMotionFrameOfReference), qA3.getPosition()));
        long jA = C3477h.a(U0.n.h(jK2), U0.n.i(jK2));
        AbstractC0823c0 wrappedBy = qA3.getCoordinator().getWrappedBy();
        C3862t.d(wrappedBy);
        AbstractC0823c0 wrappedBy2 = qA2.getCoordinator().getWrappedBy();
        C3862t.d(wrappedBy2);
        return wrappedBy.g0(wrappedBy2, jA, includeMotionFrameOfReference);
    }

    @Override // y0.InterfaceC5116v
    public long u(long relativeToLocal) {
        return b().u(C3476g.r(relativeToLocal, c()));
    }
}
