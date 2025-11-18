package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10464z0;

/* compiled from: TypeAttributes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.b1 */
/* loaded from: classes3.dex */
public final class C10336b1 {
    /* renamed from: a */
    public static final C10333a1 m36586a(C10333a1 c10333a1, InterfaceC10620g interfaceC10620g) {
        C10333a1 c10333a1M36573s;
        C9801m.m32346f(c10333a1, "<this>");
        C9801m.m32346f(interfaceC10620g, "newAnnotations");
        if (C10361k.m36731a(c10333a1) == interfaceC10620g) {
            return c10333a1;
        }
        C10358j c10358jM36732b = C10361k.m36732b(c10333a1);
        if (c10358jM36732b != null && (c10333a1M36573s = c10333a1.m36573s(c10358jM36732b)) != null) {
            c10333a1 = c10333a1M36573s;
        }
        return (interfaceC10620g.iterator().hasNext() || !interfaceC10620g.isEmpty()) ? c10333a1.m36572r(new C10358j(interfaceC10620g)) : c10333a1;
    }

    /* renamed from: b */
    public static final C10333a1 m36587b(InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(interfaceC10620g, "<this>");
        return InterfaceC10464z0.a.m37183a(C10373o.f40157a, interfaceC10620g, null, null, 6, null);
    }
}
