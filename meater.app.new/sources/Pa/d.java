package Pa;

import Gb.n;
import Pa.f;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1712z;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes3.dex */
public final class d extends Ab.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n storageManager, b containingClass) {
        super(storageManager, containingClass);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingClass, "containingClass");
    }

    @Override // Ab.f
    protected List<InterfaceC1712z> j() {
        InterfaceC1692e interfaceC1692eM = m();
        C3862t.e(interfaceC1692eM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f fVarV0 = ((b) interfaceC1692eM).V0();
        return C3862t.b(fVarV0, f.a.f14165e) ? r.e(e.f14160f0.a((b) m(), false)) : C3862t.b(fVarV0, f.d.f14168e) ? r.e(e.f14160f0.a((b) m(), true)) : r.m();
    }
}
