package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: PackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n0 */
/* loaded from: classes2.dex */
public final class C10613n0 {
    /* renamed from: a */
    public static final void m37723a(InterfaceC10607l0 interfaceC10607l0, C10160c c10160c, Collection<InterfaceC10604k0> collection) {
        C9801m.m32346f(interfaceC10607l0, "<this>");
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(collection, "packageFragments");
        if (interfaceC10607l0 instanceof InterfaceC10629o0) {
            ((InterfaceC10629o0) interfaceC10607l0).mo33277b(c10160c, collection);
        } else {
            collection.addAll(interfaceC10607l0.mo33276a(c10160c));
        }
    }

    /* renamed from: b */
    public static final boolean m37724b(InterfaceC10607l0 interfaceC10607l0, C10160c c10160c) {
        C9801m.m32346f(interfaceC10607l0, "<this>");
        C9801m.m32346f(c10160c, "fqName");
        return interfaceC10607l0 instanceof InterfaceC10629o0 ? ((InterfaceC10629o0) interfaceC10607l0).mo33278c(c10160c) : m37725c(interfaceC10607l0, c10160c).isEmpty();
    }

    /* renamed from: c */
    public static final List<InterfaceC10604k0> m37725c(InterfaceC10607l0 interfaceC10607l0, C10160c c10160c) {
        C9801m.m32346f(interfaceC10607l0, "<this>");
        C9801m.m32346f(c10160c, "fqName");
        ArrayList arrayList = new ArrayList();
        m37723a(interfaceC10607l0, c10160c, arrayList);
        return arrayList;
    }
}
