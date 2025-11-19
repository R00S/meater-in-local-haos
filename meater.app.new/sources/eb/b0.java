package eb;

import Ra.m0;
import Ra.t0;
import db.C3096k;
import eb.U;
import hb.InterfaceC3525r;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes3.dex */
public abstract class b0 extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(C3096k c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        C3862t.g(c10, "c");
    }

    @Override // eb.U
    protected void C(qb.f name, Collection<Ra.Z> result) {
        C3862t.g(name, "name");
        C3862t.g(result, "result");
    }

    @Override // eb.U
    protected Ra.c0 O() {
        return null;
    }

    @Override // eb.U
    protected U.a Y(InterfaceC3525r method, List<? extends m0> methodTypeParameters, Hb.U returnType, List<? extends t0> valueParameters) {
        C3862t.g(method, "method");
        C3862t.g(methodTypeParameters, "methodTypeParameters");
        C3862t.g(returnType, "returnType");
        C3862t.g(valueParameters, "valueParameters");
        return new U.a(returnType, null, valueParameters, methodTypeParameters, false, kotlin.collections.r.m());
    }
}
