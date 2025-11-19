package Pa;

import Hb.AbstractC1082f0;
import Hb.J0;
import Hb.Q0;
import Hb.U;
import Oa.i;
import Ob.t;
import Ra.C1706t;
import Ra.E;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Sa.h;
import Ua.AbstractC1779s;
import Ua.O;
import Ua.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.IndexedValue;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes3.dex */
public final class e extends O {

    /* renamed from: f0, reason: collision with root package name */
    public static final a f14160f0 = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private final t0 b(e eVar, int i10, m0 m0Var) {
            String lowerCase;
            String strJ = m0Var.getName().j();
            C3862t.f(strJ, "asString(...)");
            if (C3862t.b(strJ, "T")) {
                lowerCase = "instance";
            } else if (C3862t.b(strJ, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strJ.toLowerCase(Locale.ROOT);
                C3862t.f(lowerCase, "toLowerCase(...)");
            }
            h hVarB = h.f15630e.b();
            qb.f fVarT = qb.f.t(lowerCase);
            C3862t.f(fVarT, "identifier(...)");
            AbstractC1082f0 abstractC1082f0U = m0Var.u();
            C3862t.f(abstractC1082f0U, "getDefaultType(...)");
            h0 NO_SOURCE = h0.f15158a;
            C3862t.f(NO_SOURCE, "NO_SOURCE");
            return new V(eVar, null, i10, hVarB, fVarT, abstractC1082f0U, false, false, false, null, NO_SOURCE);
        }

        public final e a(b functionClass, boolean z10) {
            C3862t.g(functionClass, "functionClass");
            List<m0> listW = functionClass.w();
            e eVar = new e(functionClass, null, InterfaceC1689b.a.DECLARATION, z10, null);
            c0 c0VarK0 = functionClass.K0();
            List<c0> listM = r.m();
            List<? extends m0> listM2 = r.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW) {
                if (((m0) obj).p() != Q0.f5694G) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableD1 = r.d1(arrayList);
            ArrayList arrayList2 = new ArrayList(r.x(iterableD1, 10));
            for (IndexedValue indexedValue : iterableD1) {
                arrayList2.add(e.f14160f0.b(eVar, indexedValue.c(), (m0) indexedValue.d()));
            }
            eVar.S0(null, c0VarK0, listM, listM2, arrayList2, ((m0) r.u0(listW)).u(), E.f15109F, C1706t.f15170e);
            eVar.a1(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(InterfaceC1700m interfaceC1700m, e eVar, InterfaceC1689b.a aVar, boolean z10, C3854k c3854k) {
        this(interfaceC1700m, eVar, aVar, z10);
    }

    private final InterfaceC1712z q1(List<qb.f> list) {
        qb.f fVar;
        int size = k().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List<t0> listK = k();
            C3862t.f(listK, "getValueParameters(...)");
            List<C4170o> listE1 = r.e1(list, listK);
            if (!(listE1 instanceof Collection) || !listE1.isEmpty()) {
                for (C4170o c4170o : listE1) {
                    if (!C3862t.b((qb.f) c4170o.a(), ((t0) c4170o.b()).getName())) {
                    }
                }
            }
            return this;
        }
        List<t0> listK2 = k();
        C3862t.f(listK2, "getValueParameters(...)");
        List<t0> list2 = listK2;
        ArrayList arrayList = new ArrayList(r.x(list2, 10));
        for (t0 t0Var : list2) {
            qb.f name = t0Var.getName();
            C3862t.f(name, "getName(...)");
            int index = t0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(t0Var.t0(this, name, index));
        }
        AbstractC1779s.c cVarT0 = T0(J0.f5665b);
        List<qb.f> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((qb.f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        AbstractC1779s.c cVarJ = cVarT0.H(z10).c(arrayList).j(L0());
        C3862t.f(cVarJ, "setOriginal(...)");
        InterfaceC1712z interfaceC1712zN0 = super.N0(cVarJ);
        C3862t.d(interfaceC1712zN0);
        return interfaceC1712zN0;
    }

    @Override // Ua.O, Ua.AbstractC1779s
    /* renamed from: M0 */
    protected AbstractC1779s p1(InterfaceC1700m newOwner, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a kind, qb.f fVar, h annotations, h0 source) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(kind, "kind");
        C3862t.g(annotations, "annotations");
        C3862t.g(source, "source");
        return new e(newOwner, (e) interfaceC1712z, kind, isSuspend());
    }

    @Override // Ua.AbstractC1779s
    protected InterfaceC1712z N0(AbstractC1779s.c configuration) {
        C3862t.g(configuration, "configuration");
        e eVar = (e) super.N0(configuration);
        if (eVar == null) {
            return null;
        }
        List<t0> listK = eVar.k();
        C3862t.f(listK, "getValueParameters(...)");
        List<t0> list = listK;
        if ((list instanceof Collection) && list.isEmpty()) {
            return eVar;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            U uA = ((t0) it.next()).a();
            C3862t.f(uA, "getType(...)");
            if (i.d(uA) != null) {
                List<t0> listK2 = eVar.k();
                C3862t.f(listK2, "getValueParameters(...)");
                List<t0> list2 = listK2;
                ArrayList arrayList = new ArrayList(r.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    U uA2 = ((t0) it2.next()).a();
                    C3862t.f(uA2, "getType(...)");
                    arrayList.add(i.d(uA2));
                }
                return eVar.q1(arrayList);
            }
        }
        return eVar;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean O() {
        return false;
    }

    @Override // Ua.AbstractC1779s, Ra.D
    public boolean isExternal() {
        return false;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean isInline() {
        return false;
    }

    private e(InterfaceC1700m interfaceC1700m, e eVar, InterfaceC1689b.a aVar, boolean z10) {
        super(interfaceC1700m, eVar, h.f15630e.b(), t.f13602i, aVar, h0.f15158a);
        g1(true);
        i1(z10);
        Z0(false);
    }
}
