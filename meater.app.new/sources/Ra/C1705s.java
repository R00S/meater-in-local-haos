package Ra;

import Hb.AbstractC1082f0;
import kotlin.jvm.internal.C3862t;
import tb.C4599k;

/* compiled from: descriptorUtil.kt */
/* renamed from: Ra.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1705s {
    public static final InterfaceC1695h a(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        InterfaceC1700m interfaceC1700mC = interfaceC1700m.c();
        if (interfaceC1700mC == null || (interfaceC1700m instanceof N)) {
            return null;
        }
        if (!b(interfaceC1700mC)) {
            return a(interfaceC1700mC);
        }
        if (interfaceC1700mC instanceof InterfaceC1695h) {
            return (InterfaceC1695h) interfaceC1700mC;
        }
        return null;
    }

    public static final boolean b(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return interfaceC1700m.c() instanceof N;
    }

    public static final boolean c(InterfaceC1712z interfaceC1712z) {
        AbstractC1082f0 abstractC1082f0U;
        Hb.U uD;
        Hb.U returnType;
        C3862t.g(interfaceC1712z, "<this>");
        InterfaceC1700m interfaceC1700mC = interfaceC1712z.c();
        InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
        if (interfaceC1692e == null) {
            return false;
        }
        InterfaceC1692e interfaceC1692e2 = C4599k.g(interfaceC1692e) ? interfaceC1692e : null;
        if (interfaceC1692e2 == null || (abstractC1082f0U = interfaceC1692e2.u()) == null || (uD = Mb.d.D(abstractC1082f0U)) == null || (returnType = interfaceC1712z.getReturnType()) == null || !C3862t.b(interfaceC1712z.getName(), Ob.t.f13594e)) {
            return false;
        }
        if ((!Mb.d.s(returnType) && !Mb.d.t(returnType)) || interfaceC1712z.k().size() != 1) {
            return false;
        }
        Hb.U uA = interfaceC1712z.k().get(0).a();
        C3862t.f(uA, "getType(...)");
        return C3862t.b(Mb.d.D(uA), uD) && interfaceC1712z.o0().isEmpty() && interfaceC1712z.j0() == null;
    }

    public static final InterfaceC1692e d(H h10, qb.c fqName, Za.b lookupLocation) {
        InterfaceC1695h interfaceC1695hG;
        Ab.k kVarX0;
        C3862t.g(h10, "<this>");
        C3862t.g(fqName, "fqName");
        C3862t.g(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        qb.c cVarE = fqName.e();
        C3862t.f(cVarE, "parent(...)");
        Ab.k kVarS = h10.G(cVarE).s();
        qb.f fVarG = fqName.g();
        C3862t.f(fVarG, "shortName(...)");
        InterfaceC1695h interfaceC1695hG2 = kVarS.g(fVarG, lookupLocation);
        InterfaceC1692e interfaceC1692e = interfaceC1695hG2 instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hG2 : null;
        if (interfaceC1692e != null) {
            return interfaceC1692e;
        }
        qb.c cVarE2 = fqName.e();
        C3862t.f(cVarE2, "parent(...)");
        InterfaceC1692e interfaceC1692eD = d(h10, cVarE2, lookupLocation);
        if (interfaceC1692eD == null || (kVarX0 = interfaceC1692eD.x0()) == null) {
            interfaceC1695hG = null;
        } else {
            qb.f fVarG2 = fqName.g();
            C3862t.f(fVarG2, "shortName(...)");
            interfaceC1695hG = kVarX0.g(fVarG2, lookupLocation);
        }
        if (interfaceC1695hG instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hG;
        }
        return null;
    }
}
