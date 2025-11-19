package ab;

import Hb.AbstractC1082f0;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.Y;
import Ra.Z;
import Ra.g0;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import xb.C5087e;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: ab.T, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1938T {
    public static final boolean d(InterfaceC1689b interfaceC1689b) {
        C3862t.g(interfaceC1689b, "<this>");
        return g(interfaceC1689b) != null;
    }

    public static final String e(InterfaceC1689b callableMemberDescriptor) {
        InterfaceC1689b interfaceC1689bW;
        qb.f fVarJ;
        C3862t.g(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC1689b interfaceC1689bF = f(callableMemberDescriptor);
        if (interfaceC1689bF == null || (interfaceC1689bW = C5087e.w(interfaceC1689bF)) == null) {
            return null;
        }
        if (interfaceC1689bW instanceof Z) {
            return C1953m.f20263a.b(interfaceC1689bW);
        }
        if (!(interfaceC1689bW instanceof g0) || (fVarJ = C1946f.f20252o.j((g0) interfaceC1689bW)) == null) {
            return null;
        }
        return fVarJ.j();
    }

    private static final InterfaceC1689b f(InterfaceC1689b interfaceC1689b) {
        if (Oa.j.g0(interfaceC1689b)) {
            return g(interfaceC1689b);
        }
        return null;
    }

    public static final <T extends InterfaceC1689b> T g(T t10) {
        C3862t.g(t10, "<this>");
        if (!C1939U.f20204a.g().contains(t10.getName()) && !C1950j.f20256a.d().contains(C5087e.w(t10).getName())) {
            return null;
        }
        if ((t10 instanceof Z) || (t10 instanceof Y)) {
            return (T) C5087e.i(t10, false, C1935P.f20201B, 1, null);
        }
        if (t10 instanceof g0) {
            return (T) C5087e.i(t10, false, C1936Q.f20202B, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return C1953m.f20263a.d(C5087e.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return C1946f.f20252o.k((g0) it);
    }

    public static final <T extends InterfaceC1689b> T j(T t10) {
        C3862t.g(t10, "<this>");
        T t11 = (T) g(t10);
        if (t11 != null) {
            return t11;
        }
        C1949i c1949i = C1949i.f20255o;
        qb.f name = t10.getName();
        C3862t.f(name, "getName(...)");
        if (c1949i.n(name)) {
            return (T) C5087e.i(t10, false, C1937S.f20203B, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return Oa.j.g0(it) && C1949i.o(it) != null;
    }

    public static final boolean l(InterfaceC1692e interfaceC1692e, InterfaceC1688a specialCallableDescriptor) {
        C3862t.g(interfaceC1692e, "<this>");
        C3862t.g(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC1700m interfaceC1700mC = specialCallableDescriptor.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC1082f0 abstractC1082f0U = ((InterfaceC1692e) interfaceC1700mC).u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        for (InterfaceC1692e interfaceC1692eS = C4597i.s(interfaceC1692e); interfaceC1692eS != null; interfaceC1692eS = C4597i.s(interfaceC1692eS)) {
            if (!(interfaceC1692eS instanceof cb.c) && Ib.y.b(interfaceC1692eS.u(), abstractC1082f0U) != null) {
                return !Oa.j.g0(interfaceC1692eS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC1689b interfaceC1689b) {
        C3862t.g(interfaceC1689b, "<this>");
        return C5087e.w(interfaceC1689b).c() instanceof cb.c;
    }

    public static final boolean n(InterfaceC1689b interfaceC1689b) {
        C3862t.g(interfaceC1689b, "<this>");
        return m(interfaceC1689b) || Oa.j.g0(interfaceC1689b);
    }
}
