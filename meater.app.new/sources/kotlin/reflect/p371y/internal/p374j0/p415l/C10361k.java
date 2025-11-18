package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: kotlin.f0.y.e.j0.l.k */
/* loaded from: classes3.dex */
public final class C10361k {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f40134a = {C9790g0.m32304h(new C9819y(C9790g0.m32300d(C10361k.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b */
    private static final ReadOnlyProperty f40135b;

    static {
        ReadOnlyProperty readOnlyPropertyM37220c = C10333a1.f40041g.m37220c(C9790g0.m32298b(C10358j.class));
        C9801m.m32344d(readOnlyPropertyM37220c, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f40135b = readOnlyPropertyM37220c;
    }

    /* renamed from: a */
    public static final InterfaceC10620g m36731a(C10333a1 c10333a1) {
        InterfaceC10620g interfaceC10620gM36724e;
        C9801m.m32346f(c10333a1, "<this>");
        C10358j c10358jM36732b = m36732b(c10333a1);
        return (c10358jM36732b == null || (interfaceC10620gM36724e = c10358jM36732b.m36724e()) == null) ? InterfaceC10620g.f40808c.m37735b() : interfaceC10620gM36724e;
    }

    /* renamed from: b */
    public static final C10358j m36732b(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "<this>");
        return (C10358j) f40135b.mo6183a(c10333a1, f40134a[0]);
    }
}
