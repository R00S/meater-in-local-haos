package A0;

import b0.i;
import kotlin.Metadata;

/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"LA0/j;", "LA0/e0;", "type", "stopType", "Lb0/i$c;", "b", "(LA0/j;II)Lb0/i$c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i.c b(InterfaceC0831j interfaceC0831j, int i10, int i11) {
        i.c child = interfaceC0831j.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i11) != 0) {
                return null;
            }
            if ((kindSet & i10) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
