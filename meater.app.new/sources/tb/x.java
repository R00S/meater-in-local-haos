package tb;

import Ra.C1706t;
import Ra.InterfaceC1689b;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: VisibilityUtil.kt */
/* loaded from: classes3.dex */
public final class x {
    public static final InterfaceC1689b a(Collection<? extends InterfaceC1689b> descriptors) {
        Integer numD;
        C3862t.g(descriptors, "descriptors");
        descriptors.isEmpty();
        InterfaceC1689b interfaceC1689b = null;
        for (InterfaceC1689b interfaceC1689b2 : descriptors) {
            if (interfaceC1689b == null || ((numD = C1706t.d(interfaceC1689b.getVisibility(), interfaceC1689b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC1689b = interfaceC1689b2;
            }
        }
        C3862t.d(interfaceC1689b);
        return interfaceC1689b;
    }
}
