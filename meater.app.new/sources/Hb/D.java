package Hb;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.HashMap;
import java.util.List;

/* compiled from: DescriptorSubstitutor.java */
/* loaded from: classes3.dex */
public class D {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static J0 b(List<Ra.m0> list, H0 h02, InterfaceC1700m interfaceC1700m, List<Ra.m0> list2) {
        if (list == null) {
            a(0);
        }
        if (h02 == null) {
            a(1);
        }
        if (interfaceC1700m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        J0 j0C = c(list, h02, interfaceC1700m, list2, null);
        if (j0C != null) {
            return j0C;
        }
        throw new AssertionError("Substitution failed");
    }

    public static J0 c(List<Ra.m0> list, H0 h02, InterfaceC1700m interfaceC1700m, List<Ra.m0> list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (h02 == null) {
            a(6);
        }
        if (interfaceC1700m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i10 = 0;
        for (Ra.m0 m0Var : list) {
            Ua.U uR0 = Ua.U.R0(interfaceC1700m, m0Var.getAnnotations(), m0Var.E(), m0Var.p(), m0Var.getName(), i10, Ra.h0.f15158a, m0Var.f0());
            map.put(m0Var.l(), new G0(uR0.u()));
            map2.put(m0Var, uR0);
            list2.add(uR0);
            i10++;
        }
        z0 z0VarJ = z0.j(map);
        J0 j0H = J0.h(h02, z0VarJ);
        J0 j0H2 = J0.h(h02.h(), z0VarJ);
        for (Ra.m0 m0Var2 : list) {
            Ua.U u10 = (Ua.U) map2.get(m0Var2);
            for (U u11 : m0Var2.getUpperBounds()) {
                InterfaceC1695h interfaceC1695hT = u11.O0().t();
                U uP = (((interfaceC1695hT instanceof Ra.m0) && Mb.d.p((Ra.m0) interfaceC1695hT)) ? j0H : j0H2).p(u11, Q0.f5695H);
                if (uP == null) {
                    return null;
                }
                if (uP != u11 && zArr != null) {
                    zArr[0] = true;
                }
                u10.N0(uP);
            }
            u10.W0();
        }
        return j0H;
    }
}
