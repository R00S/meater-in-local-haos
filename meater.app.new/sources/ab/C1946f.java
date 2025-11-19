package ab;

import Ra.InterfaceC1689b;
import Ra.g0;
import java.util.Map;
import jb.C3759C;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: ab.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1946f extends C1939U {

    /* renamed from: o, reason: collision with root package name */
    public static final C1946f f20252o = new C1946f();

    private C1946f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g0 g0Var, InterfaceC1689b it) {
        C3862t.g(it, "it");
        return C1939U.f20204a.j().containsKey(C3759C.d(g0Var));
    }

    public final qb.f j(g0 functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        Map<String, qb.f> mapJ = C1939U.f20204a.j();
        String strD = C3759C.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return mapJ.get(strD);
    }

    public final boolean k(g0 functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        return Oa.j.g0(functionDescriptor) && C5087e.i(functionDescriptor, false, new C1945e(functionDescriptor), 1, null) != null;
    }

    public final boolean m(g0 g0Var) {
        C3862t.g(g0Var, "<this>");
        return C3862t.b(g0Var.getName().j(), "removeAt") && C3862t.b(C3759C.d(g0Var), C1939U.f20204a.h().d());
    }
}
