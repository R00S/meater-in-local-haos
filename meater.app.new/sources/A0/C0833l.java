package A0;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: DelegatableNode.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LA0/j;", "Landroid/view/View;", "a", "(LA0/j;)Landroid/view/View;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833l {
    public static final View a(InterfaceC0831j interfaceC0831j) {
        if (!interfaceC0831j.getNode().getIsAttached()) {
            C5047a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = K.b(C0832k.k(interfaceC0831j));
        C3862t.e(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
