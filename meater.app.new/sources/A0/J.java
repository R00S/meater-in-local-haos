package A0;

import b0.i;
import kotlin.Metadata;

/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LA0/j;", "Lb0/i$c;", "b", "(LA0/j;)Lb0/i$c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i.c b(InterfaceC0831j interfaceC0831j) {
        int iA = e0.a(4);
        int iA2 = e0.a(2);
        i.c child = interfaceC0831j.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iA) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iA2) == 0) {
            if ((child.getKindSet() & iA) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
