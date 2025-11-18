package Ra;

import Hb.E0;
import Hb.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import xb.C5087e;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes3.dex */
public final class q0 {
    public static final X d(Hb.U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        return e(u10, interfaceC1695hT instanceof InterfaceC1696i ? (InterfaceC1696i) interfaceC1695hT : null, 0);
    }

    private static final X e(Hb.U u10, InterfaceC1696i interfaceC1696i, int i10) {
        if (interfaceC1696i == null || Jb.l.m(interfaceC1696i)) {
            return null;
        }
        int size = interfaceC1696i.w().size() + i10;
        if (interfaceC1696i.L()) {
            List<E0> listSubList = u10.M0().subList(i10, size);
            InterfaceC1700m interfaceC1700mC = interfaceC1696i.c();
            return new X(interfaceC1696i, listSubList, e(u10, interfaceC1700mC instanceof InterfaceC1696i ? (InterfaceC1696i) interfaceC1700mC : null, size));
        }
        if (size != u10.M0().size()) {
            C4597i.E(interfaceC1696i);
        }
        return new X(interfaceC1696i, u10.M0().subList(i10, u10.M0().size()), null);
    }

    private static final C1690c f(m0 m0Var, InterfaceC1700m interfaceC1700m, int i10) {
        return new C1690c(m0Var, interfaceC1700m, i10);
    }

    public static final List<m0> g(InterfaceC1696i interfaceC1696i) {
        List<m0> listM;
        InterfaceC1700m next;
        y0 y0VarL;
        C3862t.g(interfaceC1696i, "<this>");
        List<m0> listW = interfaceC1696i.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        if (!interfaceC1696i.L() && !(interfaceC1696i.c() instanceof InterfaceC1688a)) {
            return listW;
        }
        List listH = Tb.k.H(Tb.k.u(Tb.k.q(Tb.k.F(C5087e.u(interfaceC1696i), n0.f15162B), o0.f15163B), p0.f15164B));
        Iterator<InterfaceC1700m> it = C5087e.u(interfaceC1696i).iterator();
        while (true) {
            listM = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC1692e) {
                break;
            }
        }
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) next;
        if (interfaceC1692e != null && (y0VarL = interfaceC1692e.l()) != null) {
            listM = y0VarL.getParameters();
        }
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        if (listH.isEmpty() && listM.isEmpty()) {
            List<m0> listW2 = interfaceC1696i.w();
            C3862t.f(listW2, "getDeclaredTypeParameters(...)");
            return listW2;
        }
        List<m0> listF0 = kotlin.collections.r.F0(listH, listM);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listF0, 10));
        for (m0 m0Var : listF0) {
            C3862t.d(m0Var);
            arrayList.add(f(m0Var, interfaceC1696i, listW.size()));
        }
        return kotlin.collections.r.F0(listW, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1700m it) {
        C3862t.g(it, "it");
        return it instanceof InterfaceC1688a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1700m it) {
        C3862t.g(it, "it");
        return !(it instanceof InterfaceC1699l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tb.h j(InterfaceC1700m it) {
        C3862t.g(it, "it");
        List<m0> typeParameters = ((InterfaceC1688a) it).getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        return kotlin.collections.r.Z(typeParameters);
    }
}
