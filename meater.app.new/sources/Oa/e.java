package Oa;

import Ra.InterfaceC1692e;
import java.util.Set;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import xb.C5087e;

/* compiled from: CompanionObjectMappingUtils.kt */
/* loaded from: classes3.dex */
public final class e {
    public static final boolean a(d dVar, InterfaceC1692e classDescriptor) {
        C3862t.g(dVar, "<this>");
        C3862t.g(classDescriptor, "classDescriptor");
        if (C4597i.x(classDescriptor)) {
            Set<qb.b> setB = dVar.b();
            qb.b bVarN = C5087e.n(classDescriptor);
            if (kotlin.collections.r.a0(setB, bVarN != null ? bVarN.e() : null)) {
                return true;
            }
        }
        return false;
    }
}
