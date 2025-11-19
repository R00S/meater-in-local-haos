package yb;

import Hb.U;
import Oa.p;
import Ra.C1706t;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.m0;
import Ra.t0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import tb.C4599k;
import xb.C5087e;

/* compiled from: inlineClassManglingRules.kt */
/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5146b {
    private static final boolean a(InterfaceC1692e interfaceC1692e) {
        return C3862t.b(C5087e.o(interfaceC1692e), p.f13396w);
    }

    private static final boolean b(U u10, boolean z10) {
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        m0 m0Var = interfaceC1695hT instanceof m0 ? (m0) interfaceC1695hT : null;
        if (m0Var == null) {
            return false;
        }
        return (z10 || !C4599k.d(m0Var)) && e(Mb.d.o(m0Var));
    }

    public static final boolean c(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT != null) {
            return (C4599k.b(interfaceC1695hT) && d(interfaceC1695hT)) || C4599k.i(u10);
        }
        return false;
    }

    public static final boolean d(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        return C4599k.g(interfaceC1700m) && !a((InterfaceC1692e) interfaceC1700m);
    }

    private static final boolean e(U u10) {
        return c(u10) || b(u10, true);
    }

    public static final boolean f(InterfaceC1689b descriptor) {
        C3862t.g(descriptor, "descriptor");
        InterfaceC1691d interfaceC1691d = descriptor instanceof InterfaceC1691d ? (InterfaceC1691d) descriptor : null;
        if (interfaceC1691d == null || C1706t.g(interfaceC1691d.getVisibility())) {
            return false;
        }
        InterfaceC1692e interfaceC1692eB = interfaceC1691d.B();
        C3862t.f(interfaceC1692eB, "getConstructedClass(...)");
        if (C4599k.g(interfaceC1692eB) || C4597i.G(interfaceC1691d.B())) {
            return false;
        }
        List<t0> listK = interfaceC1691d.k();
        C3862t.f(listK, "getValueParameters(...)");
        List<t0> list = listK;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            U uA = ((t0) it.next()).a();
            C3862t.f(uA, "getType(...)");
            if (e(uA)) {
                return true;
            }
        }
        return false;
    }
}
