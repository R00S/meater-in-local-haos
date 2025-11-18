package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.m */
/* loaded from: classes3.dex */
final class C10477m implements InterfaceC10470f {

    /* renamed from: a */
    public static final C10477m f40425a = new C10477m();

    /* renamed from: b */
    private static final String f40426b = "should not have varargs or parameters with default values";

    private C10477m() {
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
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
        C9801m.m32345e(listMo37028f, "functionDescriptor.valueParameters");
        if (!(listMo37028f instanceof Collection) || !listMo37028f.isEmpty()) {
            for (InterfaceC10599i1 interfaceC10599i1 : listMo37028f) {
                C9801m.m32345e(interfaceC10599i1, "it");
                if (!(!C10235a.m36067a(interfaceC10599i1) && interfaceC10599i1.mo37697l0() == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    public String getDescription() {
        return f40426b;
    }
}
