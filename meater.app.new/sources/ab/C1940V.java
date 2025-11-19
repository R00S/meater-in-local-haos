package ab;

import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1712z;
import Ra.x0;
import db.C3092g;
import db.C3096k;
import hb.InterfaceC3506C;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: utils.kt */
/* renamed from: ab.V, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1940V {
    public static final Sa.c a(C3096k c10, InterfaceC3506C wildcardType) {
        Sa.c next;
        C3862t.g(c10, "c");
        C3862t.g(wildcardType, "wildcardType");
        if (wildcardType.D() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<Sa.c> it = new C3092g(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Sa.c cVar = next;
            for (qb.c cVar2 : C1921B.f()) {
                if (C3862t.b(cVar.f(), cVar2)) {
                    break loop0;
                }
            }
        }
        return next;
    }

    public static final boolean b(InterfaceC1689b memberDescriptor) {
        C3862t.g(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC1712z) && C3862t.b(memberDescriptor.g0(cb.e.f31131i0), Boolean.TRUE);
    }

    public static final boolean c(C1923D javaTypeEnhancementState) {
        C3862t.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(C1921B.e()) == EnumC1934O.f20197F;
    }

    public static final AbstractC1707u d(x0 x0Var) {
        C3862t.g(x0Var, "<this>");
        AbstractC1707u abstractC1707uG = y.g(x0Var);
        C3862t.f(abstractC1707uG, "toDescriptorVisibility(...)");
        return abstractC1707uG;
    }
}
