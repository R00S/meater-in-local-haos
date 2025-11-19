package Ob;

import Hb.U;
import Oa.o;
import Ob.f;
import Ra.InterfaceC1712z;
import Ra.t0;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f13543a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final String f13544b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // Ob.f
    public String c() {
        return f13544b;
    }

    @Override // Ob.f
    public String d(InterfaceC1712z interfaceC1712z) {
        return f.a.a(this, interfaceC1712z);
    }

    @Override // Ob.f
    public boolean e(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        t0 t0Var = functionDescriptor.k().get(1);
        o.b bVar = Oa.o.f13353k;
        C3862t.d(t0Var);
        U uA = bVar.a(C5087e.s(t0Var));
        if (uA == null) {
            return false;
        }
        U uA2 = t0Var.a();
        C3862t.f(uA2, "getType(...)");
        return Mb.d.w(uA, Mb.d.A(uA2));
    }
}
