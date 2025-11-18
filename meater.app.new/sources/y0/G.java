package y0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"LA0/Q;", "a", "(LA0/Q;)LA0/Q;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {
    public static final A0.Q a(A0.Q q10) {
        A0.G layoutNode = q10.getLayoutNode();
        while (true) {
            A0.G gO0 = layoutNode.o0();
            if ((gO0 != null ? gO0.getLookaheadRoot() : null) == null) {
                A0.Q lookaheadDelegate = layoutNode.m0().getLookaheadDelegate();
                C3862t.d(lookaheadDelegate);
                return lookaheadDelegate;
            }
            A0.G gO02 = layoutNode.o0();
            A0.G lookaheadRoot = gO02 != null ? gO02.getLookaheadRoot() : null;
            C3862t.d(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.o0();
                C3862t.d(layoutNode);
            } else {
                A0.G gO03 = layoutNode.o0();
                C3862t.d(gO03);
                layoutNode = gO03.getLookaheadRoot();
                C3862t.d(layoutNode);
            }
        }
    }
}
