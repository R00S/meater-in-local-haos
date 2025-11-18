package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10658k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10661m;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10675y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: suspendFunctionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.l */
/* loaded from: classes2.dex */
public final class C9918l {

    /* renamed from: a */
    private static final C10675y f37612a;

    static {
        C10661m c10661m = new C10661m(C10427k.f40355a.m37062i(), C9917k.f37509j);
        EnumC10588f enumC10588f = EnumC10588f.INTERFACE;
        C10163f c10163fM35425g = C9917k.f37512m.m35425g();
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        InterfaceC10330n interfaceC10330n = C10322f.f40008b;
        C10675y c10675y = new C10675y(c10661m, enumC10588f, false, false, c10163fM35425g, interfaceC10741z0, interfaceC10330n);
        c10675y.m38004N0(EnumC10583d0.ABSTRACT);
        c10675y.m38006P0(C10728t.f41220e);
        c10675y.m38005O0(C10815t.m38883e(C10658k0.m37875S0(c10675y, InterfaceC10620g.f40808c.m37735b(), false, EnumC10384r1.IN_VARIANCE, C10163f.m35454x("T"), 0, interfaceC10330n)));
        c10675y.m38002L0();
        f37612a = c10675y;
    }

    /* renamed from: a */
    public static final AbstractC10368m0 m32837a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "suspendFunType");
        C9913g.m32721q(abstractC10344e0);
        AbstractC9914h abstractC9914hM37142h = C10457a.m37142h(abstractC10344e0);
        InterfaceC10620g annotations = abstractC10344e0.getAnnotations();
        AbstractC10344e0 abstractC10344e0M32714j = C9913g.m32714j(abstractC10344e0);
        List<AbstractC10344e0> listM32709e = C9913g.m32709e(abstractC10344e0);
        List<InterfaceC10351g1> listM32716l = C9913g.m32716l(abstractC10344e0);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM32716l, 10));
        Iterator<T> it = listM32716l.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10351g1) it.next()).getType());
        }
        C10333a1 c10333a1M36577h = C10333a1.f40041g.m36577h();
        InterfaceC10345e1 interfaceC10345e1Mo32877h = f37612a.mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List listM38610p0 = C10782c0.m38610p0(arrayList, C10347f0.m36669i(c10333a1M36577h, interfaceC10345e1Mo32877h, C10815t.m38883e(C10457a.m37135a(C9913g.m32715k(abstractC10344e0))), false, null, 16, null));
        AbstractC10368m0 abstractC10368m0M32774I = C10457a.m37142h(abstractC10344e0).m32774I();
        C9801m.m32345e(abstractC10368m0M32774I, "suspendFunType.builtIns.nullableAnyType");
        return C9913g.m32706b(abstractC9914hM37142h, annotations, abstractC10344e0M32714j, listM32709e, listM38610p0, null, abstractC10368m0M32774I, (128 & 128) != 0 ? false : false).mo33545S0(abstractC10344e0.mo33691P0());
    }
}
