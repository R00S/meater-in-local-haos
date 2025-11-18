package Ob;

import Ob.g;
import Ra.InterfaceC1712z;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class b {
    public final g a(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f13531b;
    }

    public abstract List<h> b();
}
