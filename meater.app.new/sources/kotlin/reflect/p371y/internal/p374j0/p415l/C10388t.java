package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10658k0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: DescriptorSubstitutor.java */
/* renamed from: kotlin.f0.y.e.j0.l.t */
/* loaded from: classes3.dex */
public class C10388t {
    /* renamed from: a */
    private static /* synthetic */ void m36824a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
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
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: b */
    public static C10366l1 m36825b(List<InterfaceC10587e1> list, AbstractC10360j1 abstractC10360j1, InterfaceC10609m interfaceC10609m, List<InterfaceC10587e1> list2) {
        if (list == null) {
            m36824a(0);
        }
        if (abstractC10360j1 == null) {
            m36824a(1);
        }
        if (interfaceC10609m == null) {
            m36824a(2);
        }
        if (list2 == null) {
            m36824a(3);
        }
        C10366l1 c10366l1M36826c = m36826c(list, abstractC10360j1, interfaceC10609m, list2, null);
        if (c10366l1M36826c != null) {
            return c10366l1M36826c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static C10366l1 m36826c(List<InterfaceC10587e1> list, AbstractC10360j1 abstractC10360j1, InterfaceC10609m interfaceC10609m, List<InterfaceC10587e1> list2, boolean[] zArr) {
        if (list == null) {
            m36824a(5);
        }
        if (abstractC10360j1 == null) {
            m36824a(6);
        }
        if (interfaceC10609m == null) {
            m36824a(7);
        }
        if (list2 == null) {
            m36824a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i2 = 0;
        for (InterfaceC10587e1 interfaceC10587e1 : list) {
            C10658k0 c10658k0M37874R0 = C10658k0.m37874R0(interfaceC10609m, interfaceC10587e1.getAnnotations(), interfaceC10587e1.mo37669F(), interfaceC10587e1.mo37672n(), interfaceC10587e1.getName(), i2, InterfaceC10741z0.f41247a, interfaceC10587e1.mo37671h0());
            map.put(interfaceC10587e1.mo32877h(), new C10357i1(c10658k0M37874R0.mo36400s()));
            map2.put(interfaceC10587e1, c10658k0M37874R0);
            list2.add(c10658k0M37874R0);
            i2++;
        }
        AbstractC10348f1 abstractC10348f1M36678j = AbstractC10348f1.m36678j(map);
        C10366l1 c10366l1M36748h = C10366l1.m36748h(abstractC10360j1, abstractC10348f1M36678j);
        C10366l1 c10366l1M36748h2 = C10366l1.m36748h(abstractC10360j1.m36729h(), abstractC10348f1M36678j);
        for (InterfaceC10587e1 interfaceC10587e12 : list) {
            C10658k0 c10658k0 = (C10658k0) map2.get(interfaceC10587e12);
            for (AbstractC10344e0 abstractC10344e0 : interfaceC10587e12.getUpperBounds()) {
                InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
                AbstractC10344e0 abstractC10344e0M36759p = (((interfaceC10594hMo32891w instanceof InterfaceC10587e1) && C10457a.m37144j((InterfaceC10587e1) interfaceC10594hMo32891w)) ? c10366l1M36748h : c10366l1M36748h2).m36759p(abstractC10344e0, EnumC10384r1.OUT_VARIANCE);
                if (abstractC10344e0M36759p == null) {
                    return null;
                }
                if (abstractC10344e0M36759p != abstractC10344e0 && zArr != null) {
                    zArr[0] = true;
                }
                c10658k0.m37879N0(abstractC10344e0M36759p);
            }
            c10658k0.m37881W0();
        }
        return c10366l1M36748h;
    }
}
