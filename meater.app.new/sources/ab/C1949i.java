package ab;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1712z;
import ab.C1939U;
import jb.C3759C;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: ab.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1949i extends C1939U {

    /* renamed from: o, reason: collision with root package name */
    public static final C1949i f20255o = new C1949i();

    private C1949i() {
    }

    private final boolean k(InterfaceC1689b interfaceC1689b) {
        return kotlin.collections.r.a0(C1939U.f20204a.e(), C3759C.d(interfaceC1689b));
    }

    public static final InterfaceC1712z l(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        C1949i c1949i = f20255o;
        qb.f name = functionDescriptor.getName();
        C3862t.f(name, "getName(...)");
        if (c1949i.n(name)) {
            return (InterfaceC1712z) C5087e.i(functionDescriptor, false, C1947g.f20253B, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return f20255o.k(it);
    }

    public static final C1939U.b o(InterfaceC1689b interfaceC1689b) {
        InterfaceC1689b interfaceC1689bI;
        String strD;
        C3862t.g(interfaceC1689b, "<this>");
        C1939U.a aVar = C1939U.f20204a;
        if (!aVar.d().contains(interfaceC1689b.getName()) || (interfaceC1689bI = C5087e.i(interfaceC1689b, false, C1948h.f20254B, 1, null)) == null || (strD = C3759C.d(interfaceC1689bI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1689b it) {
        C3862t.g(it, "it");
        return (it instanceof InterfaceC1712z) && f20255o.k(it);
    }

    public final boolean n(qb.f fVar) {
        C3862t.g(fVar, "<this>");
        return C1939U.f20204a.d().contains(fVar);
    }
}
