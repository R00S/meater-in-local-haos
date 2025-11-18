package cb;

import Ab.k;
import Hb.U;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.h0;
import Ra.t0;
import Ua.V;
import eb.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import xb.C5087e;

/* compiled from: util.kt */
/* loaded from: classes3.dex */
public final class h {
    public static final List<t0> a(Collection<? extends U> newValueParameterTypes, Collection<? extends t0> oldValueParameters, InterfaceC1688a newOwner) {
        C3862t.g(newValueParameterTypes, "newValueParameterTypes");
        C3862t.g(oldValueParameters, "oldValueParameters");
        C3862t.g(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List listE1 = r.e1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(r.x(listE1, 10));
        for (Iterator it = listE1.iterator(); it.hasNext(); it = it) {
            C4170o c4170o = (C4170o) it.next();
            U u10 = (U) c4170o.a();
            t0 t0Var = (t0) c4170o.b();
            int index = t0Var.getIndex();
            Sa.h annotations = t0Var.getAnnotations();
            qb.f name = t0Var.getName();
            C3862t.f(name, "getName(...)");
            boolean zR0 = t0Var.r0();
            boolean Z10 = t0Var.Z();
            boolean zW = t0Var.W();
            U uK = t0Var.i0() != null ? C5087e.s(newOwner).q().k(u10) : null;
            h0 h0VarJ = t0Var.j();
            C3862t.f(h0VarJ, "getSource(...)");
            arrayList.add(new V(newOwner, null, index, annotations, name, u10, zR0, Z10, zW, uK, h0VarJ));
        }
        return arrayList;
    }

    public static final a0 b(InterfaceC1692e interfaceC1692e) {
        C3862t.g(interfaceC1692e, "<this>");
        InterfaceC1692e interfaceC1692eX = C5087e.x(interfaceC1692e);
        if (interfaceC1692eX == null) {
            return null;
        }
        k kVarQ = interfaceC1692eX.Q();
        a0 a0Var = kVarQ instanceof a0 ? (a0) kVarQ : null;
        return a0Var == null ? b(interfaceC1692eX) : a0Var;
    }
}
