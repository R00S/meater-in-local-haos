package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10625l;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.k1 */
/* loaded from: classes3.dex */
public final class C10363k1 {
    /* renamed from: a */
    public static final AbstractC10368m0 m36734a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        AbstractC10368m0 abstractC10368m0 = abstractC10381q1Mo36635R0 instanceof AbstractC10368m0 ? (AbstractC10368m0) abstractC10381q1Mo36635R0 : null;
        if (abstractC10368m0 != null) {
            return abstractC10368m0;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC10344e0).toString());
    }

    /* renamed from: b */
    public static final AbstractC10344e0 m36735b(AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10351g1> list, InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(list, "newArguments");
        C9801m.m32346f(interfaceC10620g, "newAnnotations");
        return m36738e(abstractC10344e0, list, interfaceC10620g, null, 4, null);
    }

    /* renamed from: c */
    public static final AbstractC10344e0 m36736c(AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10351g1> list, InterfaceC10620g interfaceC10620g, List<? extends InterfaceC10351g1> list2) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        C9801m.m32346f(list, "newArguments");
        C9801m.m32346f(interfaceC10620g, "newAnnotations");
        C9801m.m32346f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == abstractC10344e0.mo35991M0()) && interfaceC10620g == abstractC10344e0.getAnnotations()) {
            return abstractC10344e0;
        }
        C10333a1 c10333a1Mo35992N0 = abstractC10344e0.mo35992N0();
        if ((interfaceC10620g instanceof C10625l) && interfaceC10620g.isEmpty()) {
            interfaceC10620g = InterfaceC10620g.f40808c.m37735b();
        }
        C10333a1 c10333a1M36586a = C10336b1.m36586a(c10333a1Mo35992N0, interfaceC10620g);
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1Mo36635R0;
            return C10347f0.m36664d(m36737d(abstractC10458y.m37161W0(), list, c10333a1M36586a), m36737d(abstractC10458y.m37162X0(), list2, c10333a1M36586a));
        }
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            return m36737d((AbstractC10368m0) abstractC10381q1Mo36635R0, list, c10333a1M36586a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final AbstractC10368m0 m36737d(AbstractC10368m0 abstractC10368m0, List<? extends InterfaceC10351g1> list, C10333a1 c10333a1) {
        C9801m.m32346f(abstractC10368m0, "<this>");
        C9801m.m32346f(list, "newArguments");
        C9801m.m32346f(c10333a1, "newAttributes");
        return (list.isEmpty() && c10333a1 == abstractC10368m0.mo35992N0()) ? abstractC10368m0 : list.isEmpty() ? abstractC10368m0.mo33547U0(c10333a1) : C10347f0.m36669i(c10333a1, abstractC10368m0.mo35993O0(), list, abstractC10368m0.mo33691P0(), null, 16, null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC10344e0 m36738e(AbstractC10344e0 abstractC10344e0, List list, InterfaceC10620g interfaceC10620g, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = abstractC10344e0.mo35991M0();
        }
        if ((i2 & 2) != 0) {
            interfaceC10620g = abstractC10344e0.getAnnotations();
        }
        if ((i2 & 4) != 0) {
            list2 = list;
        }
        return m36736c(abstractC10344e0, list, interfaceC10620g, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10368m0 m36739f(AbstractC10368m0 abstractC10368m0, List list, C10333a1 c10333a1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = abstractC10368m0.mo35991M0();
        }
        if ((i2 & 2) != 0) {
            c10333a1 = abstractC10368m0.mo35992N0();
        }
        return m36737d(abstractC10368m0, list, c10333a1);
    }
}
