package A0;

import h0.C3476g;
import h0.C3477h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import y0.AbstractC5096a;

/* compiled from: LayoutNodeAlignmentLines.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"LA0/O;", "LA0/a;", "LA0/b;", "alignmentLinesOwner", "<init>", "(LA0/b;)V", "LA0/c0;", "Ly0/a;", "alignmentLine", "", "i", "(LA0/c0;Ly0/a;)I", "Lh0/g;", "position", "d", "(LA0/c0;J)J", "", "e", "(LA0/c0;)Ljava/util/Map;", "alignmentLinesMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O extends AbstractC0818a {
    public O(InterfaceC0820b interfaceC0820b) {
        super(interfaceC0820b, null);
    }

    @Override // A0.AbstractC0818a
    protected long d(AbstractC0823c0 abstractC0823c0, long j10) {
        Q lookaheadDelegate = abstractC0823c0.getLookaheadDelegate();
        C3862t.d(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        return C3476g.r(C3477h.a(U0.n.h(position), U0.n.i(position)), j10);
    }

    @Override // A0.AbstractC0818a
    protected Map<AbstractC5096a, Integer> e(AbstractC0823c0 abstractC0823c0) {
        Q lookaheadDelegate = abstractC0823c0.getLookaheadDelegate();
        C3862t.d(lookaheadDelegate);
        return lookaheadDelegate.Z0().d();
    }

    @Override // A0.AbstractC0818a
    protected int i(AbstractC0823c0 abstractC0823c0, AbstractC5096a abstractC5096a) {
        Q lookaheadDelegate = abstractC0823c0.getLookaheadDelegate();
        C3862t.d(lookaheadDelegate);
        return lookaheadDelegate.J(abstractC5096a);
    }
}
