package Ob;

import Ob.f;
import Ra.InterfaceC1712z;
import Ra.t0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final m f13549a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final String f13550b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // Ob.f
    public String c() {
        return f13550b;
    }

    @Override // Ob.f
    public String d(InterfaceC1712z interfaceC1712z) {
        return f.a.a(this, interfaceC1712z);
    }

    @Override // Ob.f
    public boolean e(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        List<t0> listK = functionDescriptor.k();
        C3862t.f(listK, "getValueParameters(...)");
        List<t0> list = listK;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (t0 t0Var : list) {
            C3862t.d(t0Var);
            if (C5087e.f(t0Var) || t0Var.i0() != null) {
                return false;
            }
        }
        return true;
    }
}
