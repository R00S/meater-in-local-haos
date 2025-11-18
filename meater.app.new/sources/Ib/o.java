package Ib;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.J0;
import Hb.P0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.z0;
import Ib.f;
import Ra.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class o {
    private static final List<E0> a(P0 p02, Lb.b bVar) {
        if (p02.M0().size() != p02.O0().getParameters().size()) {
            return null;
        }
        List<E0> listM0 = p02.M0();
        List<E0> list = listM0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((E0) it.next()).b() != Q0.f5693F) {
                    List<m0> parameters = p02.O0().getParameters();
                    C3862t.f(parameters, "getParameters(...)");
                    List<C4170o> listE1 = kotlin.collections.r.e1(list, parameters);
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listE1, 10));
                    for (C4170o c4170o : listE1) {
                        E0 e0D = (E0) c4170o.a();
                        m0 m0Var = (m0) c4170o.b();
                        if (e0D.b() != Q0.f5693F) {
                            P0 p0R0 = (e0D.c() || e0D.b() != Q0.f5694G) ? null : e0D.a().R0();
                            C3862t.d(m0Var);
                            e0D = Mb.d.d(new i(bVar, p0R0, e0D, m0Var));
                        }
                        arrayList.add(e0D);
                    }
                    J0 j0C = z0.f5820c.b(p02.O0(), arrayList).c();
                    int size = listM0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        E0 e02 = listM0.get(i10);
                        E0 e03 = (E0) arrayList.get(i10);
                        if (e02.b() != Q0.f5693F) {
                            List<U> upperBounds = p02.O0().getParameters().get(i10).getUpperBounds();
                            C3862t.f(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f6981a.a(j0C.n((U) it2.next(), Q0.f5693F).R0()));
                            }
                            if (!e02.c() && e02.b() == Q0.f5695H) {
                                arrayList2.add(f.a.f6981a.a(e02.a().R0()));
                            }
                            U uA = e03.a();
                            C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) uA).O0().k(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final AbstractC1082f0 b(AbstractC1082f0 type, Lb.b status) {
        C3862t.g(type, "type");
        C3862t.g(status, "status");
        List<E0> listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final AbstractC1082f0 c(P0 p02, List<? extends E0> list) {
        return X.k(p02.N0(), p02.O0(), list, p02.P0(), null, 16, null);
    }
}
