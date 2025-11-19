package Ib;

import Hb.E0;
import Hb.M0;
import Hb.Q0;
import Hb.U;
import Hb.y0;
import Hb.z0;
import Ra.InterfaceC1700m;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import ub.C4703e;

/* compiled from: utils.kt */
/* loaded from: classes3.dex */
public final class D {
    private static final U a(U u10) {
        return Nb.c.b(u10).d();
    }

    private static final String b(y0 y0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + y0Var, sb2);
        c("hashCode: " + y0Var.hashCode(), sb2);
        c("javaClass: " + y0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC1700m interfaceC1700mT = y0Var.t(); interfaceC1700mT != null; interfaceC1700mT = interfaceC1700mT.c()) {
            c("fqName: " + sb.n.f49596h.O(interfaceC1700mT), sb2);
            c("javaClass: " + interfaceC1700mT.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        C3862t.g(str, "<this>");
        sb2.append(str);
        C3862t.f(sb2, "append(...)");
        sb2.append('\n');
        C3862t.f(sb2, "append(...)");
        return sb2;
    }

    public static final U d(U subtype, U supertype, z typeCheckingProcedureCallbacks) {
        C3862t.g(subtype, "subtype");
        C3862t.g(supertype, "supertype");
        C3862t.g(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new w(subtype, null));
        y0 y0VarO0 = supertype.O0();
        while (!arrayDeque.isEmpty()) {
            w wVar = (w) arrayDeque.poll();
            U uB = wVar.b();
            y0 y0VarO02 = uB.O0();
            if (typeCheckingProcedureCallbacks.a(y0VarO02, y0VarO0)) {
                boolean zP0 = uB.P0();
                for (w wVarA = wVar.a(); wVarA != null; wVarA = wVarA.a()) {
                    U uB2 = wVarA.b();
                    List<E0> listM0 = uB2.M0();
                    if ((listM0 instanceof Collection) && listM0.isEmpty()) {
                        uB = z0.f5820c.a(uB2).c().n(uB, Q0.f5693F);
                        C3862t.d(uB);
                    } else {
                        Iterator<T> it = listM0.iterator();
                        while (it.hasNext()) {
                            Q0 q0B = ((E0) it.next()).b();
                            Q0 q02 = Q0.f5693F;
                            if (q0B != q02) {
                                U uN = C4703e.h(z0.f5820c.a(uB2), false, 1, null).c().n(uB, q02);
                                C3862t.f(uN, "safeSubstitute(...)");
                                uB = a(uN);
                                break;
                            }
                        }
                        uB = z0.f5820c.a(uB2).c().n(uB, Q0.f5693F);
                        C3862t.d(uB);
                    }
                    zP0 = zP0 || uB2.P0();
                }
                y0 y0VarO03 = uB.O0();
                if (typeCheckingProcedureCallbacks.a(y0VarO03, y0VarO0)) {
                    return M0.p(uB, zP0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(y0VarO03) + ", \n\nsupertype: " + b(y0VarO0) + " \n" + typeCheckingProcedureCallbacks.a(y0VarO03, y0VarO0));
            }
            for (U u10 : y0VarO02.s()) {
                C3862t.d(u10);
                arrayDeque.add(new w(u10, wVar));
            }
        }
        return null;
    }
}
