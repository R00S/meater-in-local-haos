package ab;

import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.t0;
import ab.C1939U;
import java.util.List;
import jb.C3759C;
import jb.s;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.InterfaceC4598j;
import xb.C5087e;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes3.dex */
public final class z implements InterfaceC4598j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20286a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private final boolean b(InterfaceC1712z interfaceC1712z) {
            if (interfaceC1712z.k().size() != 1) {
                return false;
            }
            InterfaceC1700m interfaceC1700mC = interfaceC1712z.c();
            InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
            if (interfaceC1692e == null) {
                return false;
            }
            List<t0> listK = interfaceC1712z.k();
            C3862t.f(listK, "getValueParameters(...)");
            InterfaceC1695h interfaceC1695hT = ((t0) kotlin.collections.r.J0(listK)).a().O0().t();
            InterfaceC1692e interfaceC1692e2 = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            return interfaceC1692e2 != null && Oa.j.r0(interfaceC1692e) && C3862t.b(C5087e.o(interfaceC1692e), C5087e.o(interfaceC1692e2));
        }

        private final jb.s c(InterfaceC1712z interfaceC1712z, t0 t0Var) {
            if (C3759C.e(interfaceC1712z) || b(interfaceC1712z)) {
                Hb.U uA = t0Var.a();
                C3862t.f(uA, "getType(...)");
                return C3759C.g(Mb.d.B(uA));
            }
            Hb.U uA2 = t0Var.a();
            C3862t.f(uA2, "getType(...)");
            return C3759C.g(uA2);
        }

        public final boolean a(InterfaceC1688a superDescriptor, InterfaceC1688a subDescriptor) {
            C3862t.g(superDescriptor, "superDescriptor");
            C3862t.g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof cb.e) && (superDescriptor instanceof InterfaceC1712z)) {
                cb.e eVar = (cb.e) subDescriptor;
                eVar.k().size();
                InterfaceC1712z interfaceC1712z = (InterfaceC1712z) superDescriptor;
                interfaceC1712z.k().size();
                List<t0> listK = eVar.L0().k();
                C3862t.f(listK, "getValueParameters(...)");
                List<t0> listK2 = interfaceC1712z.L0().k();
                C3862t.f(listK2, "getValueParameters(...)");
                for (C4170o c4170o : kotlin.collections.r.e1(listK, listK2)) {
                    t0 t0Var = (t0) c4170o.a();
                    t0 t0Var2 = (t0) c4170o.b();
                    C3862t.d(t0Var);
                    boolean z10 = c((InterfaceC1712z) subDescriptor, t0Var) instanceof s.d;
                    C3862t.d(t0Var2);
                    if (z10 != (c(interfaceC1712z, t0Var2) instanceof s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, InterfaceC1692e interfaceC1692e) {
        if ((interfaceC1688a instanceof InterfaceC1689b) && (interfaceC1688a2 instanceof InterfaceC1712z) && !Oa.j.g0(interfaceC1688a2)) {
            C1949i c1949i = C1949i.f20255o;
            InterfaceC1712z interfaceC1712z = (InterfaceC1712z) interfaceC1688a2;
            qb.f name = interfaceC1712z.getName();
            C3862t.f(name, "getName(...)");
            if (!c1949i.n(name)) {
                C1939U.a aVar = C1939U.f20204a;
                qb.f name2 = interfaceC1712z.getName();
                C3862t.f(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC1689b interfaceC1689bJ = C1938T.j((InterfaceC1689b) interfaceC1688a);
            boolean z10 = interfaceC1688a instanceof InterfaceC1712z;
            InterfaceC1712z interfaceC1712z2 = z10 ? (InterfaceC1712z) interfaceC1688a : null;
            if (!(interfaceC1712z2 != null && interfaceC1712z.u0() == interfaceC1712z2.u0()) && (interfaceC1689bJ == null || !interfaceC1712z.u0())) {
                return true;
            }
            if ((interfaceC1692e instanceof cb.c) && interfaceC1712z.c0() == null && interfaceC1689bJ != null && !C1938T.l(interfaceC1692e, interfaceC1689bJ)) {
                if ((interfaceC1689bJ instanceof InterfaceC1712z) && z10 && C1949i.l((InterfaceC1712z) interfaceC1689bJ) != null) {
                    String strC = C3759C.c(interfaceC1712z, false, false, 2, null);
                    InterfaceC1712z interfaceC1712zL0 = ((InterfaceC1712z) interfaceC1688a).L0();
                    C3862t.f(interfaceC1712zL0, "getOriginal(...)");
                    if (C3862t.b(strC, C3759C.c(interfaceC1712zL0, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.b a(InterfaceC1688a superDescriptor, InterfaceC1688a subDescriptor, InterfaceC1692e interfaceC1692e) {
        C3862t.g(superDescriptor, "superDescriptor");
        C3862t.g(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, interfaceC1692e) ? InterfaceC4598j.b.INCOMPATIBLE : f20286a.a(superDescriptor, subDescriptor) ? InterfaceC4598j.b.INCOMPATIBLE : InterfaceC4598j.b.UNKNOWN;
    }

    @Override // tb.InterfaceC4598j
    public InterfaceC4598j.a b() {
        return InterfaceC4598j.a.CONFLICTS_ONLY;
    }
}
