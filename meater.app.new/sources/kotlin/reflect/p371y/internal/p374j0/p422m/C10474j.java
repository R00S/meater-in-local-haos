package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9916j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.j */
/* loaded from: classes3.dex */
final class C10474j implements InterfaceC10470f {

    /* renamed from: a */
    public static final C10474j f40419a = new C10474j();

    /* renamed from: b */
    private static final String f40420b = "second parameter must be of type KProperty<*> or its supertype";

    private C10474j() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: a */
    public String mo37194a(InterfaceC10738y interfaceC10738y) {
        return InterfaceC10470f.a.m37196a(this, interfaceC10738y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: b */
    public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        InterfaceC10599i1 interfaceC10599i1 = interfaceC10738y.mo37028f().get(1);
        C9916j.b bVar = C9916j.f37486a;
        C9801m.m32345e(interfaceC10599i1, "secondParameter");
        AbstractC10344e0 abstractC10344e0M32824a = bVar.m32824a(C10235a.m36078l(interfaceC10599i1));
        if (abstractC10344e0M32824a == null) {
            return false;
        }
        AbstractC10344e0 type = interfaceC10599i1.getType();
        C9801m.m32345e(type, "secondParameter.type");
        return C10457a.m37149o(abstractC10344e0M32824a, C10457a.m37153s(type));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    public String getDescription() {
        return f40420b;
    }
}
