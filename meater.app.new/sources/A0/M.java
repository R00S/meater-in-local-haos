package A0;

import kotlin.Metadata;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LA0/G;", "", "a", "(LA0/G;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {
    public static final boolean a(G g10) {
        if (g10.getLookaheadRoot() != null) {
            G gO0 = g10.o0();
            if ((gO0 != null ? gO0.getLookaheadRoot() : null) == null || g10.getLayoutDelegate().getDetachedFromParentLookaheadPass()) {
                return true;
            }
        }
        return false;
    }
}
