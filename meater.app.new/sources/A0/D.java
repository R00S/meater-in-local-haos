package A0;

import kotlin.Metadata;
import x0.C5047a;
import y0.AbstractC5096a;
import y0.C5111p;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LA0/P;", "Ly0/a;", "alignmentLine", "", "b", "(LA0/P;Ly0/a;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(P p10, AbstractC5096a abstractC5096a) {
        P pV0 = p10.V0();
        if (!(pV0 != null)) {
            C5047a.b("Child of " + p10 + " cannot be null when calculating alignment line");
        }
        if (p10.Z0().d().containsKey(abstractC5096a)) {
            Integer num = p10.Z0().d().get(abstractC5096a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iJ = pV0.J(abstractC5096a);
        if (iJ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        pV0.H1(true);
        p10.G1(true);
        p10.F1();
        pV0.H1(false);
        p10.G1(false);
        return iJ + (abstractC5096a instanceof C5111p ? U0.n.i(pV0.getPosition()) : U0.n.h(pV0.getPosition()));
    }
}
