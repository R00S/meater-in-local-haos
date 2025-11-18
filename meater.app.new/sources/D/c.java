package D;

import A0.B0;
import A0.InterfaceC0831j;
import h0.C3478i;
import kotlin.Metadata;
import y0.InterfaceC5116v;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LA0/j;", "LD/a;", "b", "(LA0/j;)LD/a;", "Ly0/v;", "sourceCoordinates", "Lh0/i;", "rect", "c", "(Ly0/v;Ly0/v;Lh0/i;)Lh0/i;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* loaded from: classes.dex */
final /* synthetic */ class c {
    public static final a b(InterfaceC0831j interfaceC0831j) {
        if (!interfaceC0831j.getNode().getIsAttached()) {
            return null;
        }
        a aVar = (a) B0.a(interfaceC0831j, e.f3290R);
        return aVar == null ? f.b(interfaceC0831j) : aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3478i c(InterfaceC5116v interfaceC5116v, InterfaceC5116v interfaceC5116v2, C3478i c3478i) {
        return c3478i.q(interfaceC5116v.M(interfaceC5116v2, false).j());
    }
}
