package jb;

import Hb.U;
import Oa.p;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.g0;
import Ra.t0;
import ab.C1938T;
import ab.C1949i;
import java.util.Iterator;
import java.util.List;
import jb.s;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import xb.C5087e;
import yb.C5148d;
import yb.EnumC5149e;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: jb.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3759C {
    private static final void a(StringBuilder sb2, U u10) {
        sb2.append(g(u10));
    }

    public static final String b(InterfaceC1712z interfaceC1712z, boolean z10, boolean z11) {
        String strJ;
        C3862t.g(interfaceC1712z, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC1712z instanceof InterfaceC1699l) {
                strJ = "<init>";
            } else {
                strJ = interfaceC1712z.getName().j();
                C3862t.f(strJ, "asString(...)");
            }
            sb2.append(strJ);
        }
        sb2.append("(");
        c0 c0VarJ0 = interfaceC1712z.j0();
        if (c0VarJ0 != null) {
            U uA = c0VarJ0.a();
            C3862t.f(uA, "getType(...)");
            a(sb2, uA);
        }
        Iterator<t0> it = interfaceC1712z.k().iterator();
        while (it.hasNext()) {
            U uA2 = it.next().a();
            C3862t.f(uA2, "getType(...)");
            a(sb2, uA2);
        }
        sb2.append(")");
        if (z10) {
            if (C3776j.c(interfaceC1712z)) {
                sb2.append("V");
            } else {
                U returnType = interfaceC1712z.getReturnType();
                C3862t.d(returnType);
                a(sb2, returnType);
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String c(InterfaceC1712z interfaceC1712z, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC1712z, z10, z11);
    }

    public static final String d(InterfaceC1688a interfaceC1688a) {
        C3862t.g(interfaceC1688a, "<this>");
        C3762F c3762f = C3762F.f43573a;
        if (C4597i.E(interfaceC1688a)) {
            return null;
        }
        InterfaceC1700m interfaceC1700mC = interfaceC1688a.c();
        InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
        if (interfaceC1692e == null || interfaceC1692e.getName().u()) {
            return null;
        }
        InterfaceC1688a interfaceC1688aB = interfaceC1688a.b();
        g0 g0Var = interfaceC1688aB instanceof g0 ? (g0) interfaceC1688aB : null;
        if (g0Var == null) {
            return null;
        }
        return C3758B.a(c3762f, interfaceC1692e, c(g0Var, false, false, 3, null));
    }

    public static final boolean e(InterfaceC1688a f10) {
        InterfaceC1712z interfaceC1712zL;
        C3862t.g(f10, "f");
        if (!(f10 instanceof InterfaceC1712z)) {
            return false;
        }
        InterfaceC1712z interfaceC1712z = (InterfaceC1712z) f10;
        if (!C3862t.b(interfaceC1712z.getName().j(), "remove") || interfaceC1712z.k().size() != 1 || C1938T.n((InterfaceC1689b) f10)) {
            return false;
        }
        List<t0> listK = interfaceC1712z.b().k();
        C3862t.f(listK, "getValueParameters(...)");
        U uA = ((t0) kotlin.collections.r.J0(listK)).a();
        C3862t.f(uA, "getType(...)");
        s sVarG = g(uA);
        s.d dVar = sVarG instanceof s.d ? (s.d) sVarG : null;
        if ((dVar != null ? dVar.i() : null) != EnumC5149e.INT || (interfaceC1712zL = C1949i.l(interfaceC1712z)) == null) {
            return false;
        }
        List<t0> listK2 = interfaceC1712zL.b().k();
        C3862t.f(listK2, "getValueParameters(...)");
        U uA2 = ((t0) kotlin.collections.r.J0(listK2)).a();
        C3862t.f(uA2, "getType(...)");
        s sVarG2 = g(uA2);
        InterfaceC1700m interfaceC1700mC = interfaceC1712zL.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        return C3862t.b(C5087e.p(interfaceC1700mC), p.a.f13452f0.j()) && (sVarG2 instanceof s.c) && C3862t.b(((s.c) sVarG2).i(), "java/lang/Object");
    }

    public static final String f(InterfaceC1692e interfaceC1692e) {
        C3862t.g(interfaceC1692e, "<this>");
        Qa.c cVar = Qa.c.f14576a;
        qb.d dVarJ = C5087e.o(interfaceC1692e).j();
        C3862t.f(dVarJ, "toUnsafe(...)");
        qb.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return C3776j.b(interfaceC1692e, null, 2, null);
        }
        String strH = C5148d.h(bVarN);
        C3862t.f(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final s g(U u10) {
        C3862t.g(u10, "<this>");
        return (s) C3776j.e(u10, u.f43680a, C3765I.f43579o, C3764H.f43574a, null, null, 32, null);
    }
}
