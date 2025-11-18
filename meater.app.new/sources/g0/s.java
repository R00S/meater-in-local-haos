package g0;

import A0.AbstractC0823c0;
import A0.C0832k;
import A0.G;
import A0.m0;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;

/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Lg0/t;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lg0/t;", "Loa/F;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "b", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final t b(FocusTargetNode focusTargetNode) {
        G layoutNode;
        m0 owner;
        i focusOwner;
        AbstractC0823c0 coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        C0832k.l(focusTargetNode).getFocusOwner().a(focusTargetNode);
    }

    public static final t d(FocusTargetNode focusTargetNode) {
        return C0832k.l(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
