package tb;

import Hb.AbstractC1082f0;
import Hb.J0;
import Hb.Q0;
import Hb.U;
import Ra.A;
import Ra.I;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.a0;
import Ra.r0;
import Ra.u0;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: inlineClassesUtils.kt */
/* renamed from: tb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4599k {

    /* renamed from: a, reason: collision with root package name */
    private static final qb.c f50023a;

    /* renamed from: b, reason: collision with root package name */
    private static final qb.b f50024b;

    static {
        qb.c cVar = new qb.c("kotlin.jvm.JvmInline");
        f50023a = cVar;
        f50024b = qb.b.f48178d.c(cVar);
    }

    public static final boolean a(InterfaceC1688a interfaceC1688a) {
        C3862t.g(interfaceC1688a, "<this>");
        if (interfaceC1688a instanceof a0) {
            Z zA0 = ((a0) interfaceC1688a).A0();
            C3862t.f(zA0, "getCorrespondingProperty(...)");
            if (f(zA0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return (interfaceC1700m instanceof InterfaceC1692e) && (((InterfaceC1692e) interfaceC1700m).y0() instanceof A);
    }

    public static final boolean c(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT != null) {
            return b(interfaceC1695hT);
        }
        return false;
    }

    public static final boolean d(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return (interfaceC1700m instanceof InterfaceC1692e) && (((InterfaceC1692e) interfaceC1700m).y0() instanceof I);
    }

    public static final boolean e(u0 u0Var) {
        A<AbstractC1082f0> aQ;
        C3862t.g(u0Var, "<this>");
        if (u0Var.j0() == null) {
            InterfaceC1700m interfaceC1700mC = u0Var.c();
            qb.f fVarC = null;
            InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
            if (interfaceC1692e != null && (aQ = C5087e.q(interfaceC1692e)) != null) {
                fVarC = aQ.c();
            }
            if (C3862t.b(fVarC, u0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(u0 u0Var) {
        r0<AbstractC1082f0> r0VarY0;
        C3862t.g(u0Var, "<this>");
        if (u0Var.j0() == null) {
            InterfaceC1700m interfaceC1700mC = u0Var.c();
            InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
            if (interfaceC1692e != null && (r0VarY0 = interfaceC1692e.y0()) != null) {
                qb.f name = u0Var.getName();
                C3862t.f(name, "getName(...)");
                if (r0VarY0.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return b(interfaceC1700m) || d(interfaceC1700m);
    }

    public static final boolean h(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT != null) {
            return g(interfaceC1695hT);
        }
        return false;
    }

    public static final boolean i(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        return (interfaceC1695hT == null || !d(interfaceC1695hT) || Ib.u.f7008a.l(u10)) ? false : true;
    }

    public static final U j(U u10) {
        C3862t.g(u10, "<this>");
        U uK = k(u10);
        if (uK != null) {
            return J0.f(u10).p(uK, Q0.f5693F);
        }
        return null;
    }

    public static final U k(U u10) {
        A<AbstractC1082f0> aQ;
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
        if (interfaceC1692e == null || (aQ = C5087e.q(interfaceC1692e)) == null) {
            return null;
        }
        return (AbstractC1082f0) aQ.d();
    }
}
