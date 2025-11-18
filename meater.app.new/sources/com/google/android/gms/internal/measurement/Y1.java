package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Y1 {
    public static double a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static int b(Z2 z22) {
        int i10 = i(z22.c("runtime.counter").h().doubleValue() + 1.0d);
        if (i10 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        z22.h("runtime.counter", new C2511k(Double.valueOf(i10)));
        return i10;
    }

    public static Z c(String str) {
        Z zC = (str == null || str.isEmpty()) ? null : Z.c(Integer.parseInt(str));
        if (zC != null) {
            return zC;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC2574s interfaceC2574s) {
        if (InterfaceC2574s.f34293q.equals(interfaceC2574s)) {
            return null;
        }
        if (InterfaceC2574s.f34292p.equals(interfaceC2574s)) {
            return "";
        }
        if (interfaceC2574s instanceof r) {
            return e((r) interfaceC2574s);
        }
        if (!(interfaceC2574s instanceof C2479g)) {
            return !interfaceC2574s.h().isNaN() ? interfaceC2574s.h() : interfaceC2574s.i();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC2574s> it = ((C2479g) interfaceC2574s).iterator();
        while (it.hasNext()) {
            Object objD = d(it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> e(r rVar) {
        HashMap map = new HashMap();
        for (String str : rVar.a()) {
            Object objD = d(rVar.c(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void f(Z z10, int i10, List<InterfaceC2574s> list) {
        g(z10.name(), i10, list);
    }

    public static void g(String str, int i10, List<InterfaceC2574s> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        if (!interfaceC2574s.getClass().equals(interfaceC2574s2.getClass())) {
            return false;
        }
        if ((interfaceC2574s instanceof C2630z) || (interfaceC2574s instanceof C2559q)) {
            return true;
        }
        if (!(interfaceC2574s instanceof C2511k)) {
            return interfaceC2574s instanceof C2590u ? interfaceC2574s.i().equals(interfaceC2574s2.i()) : interfaceC2574s instanceof C2487h ? interfaceC2574s.f().equals(interfaceC2574s2.f()) : interfaceC2574s == interfaceC2574s2;
        }
        if (Double.isNaN(interfaceC2574s.h().doubleValue()) || Double.isNaN(interfaceC2574s2.h().doubleValue())) {
            return false;
        }
        return interfaceC2574s.h().equals(interfaceC2574s2.h());
    }

    public static int i(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static void j(Z z10, int i10, List<InterfaceC2574s> list) {
        k(z10.name(), i10, list);
    }

    public static void k(String str, int i10, List<InterfaceC2574s> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC2574s interfaceC2574s) {
        if (interfaceC2574s == null) {
            return false;
        }
        Double dH = interfaceC2574s.h();
        return !dH.isNaN() && dH.doubleValue() >= 0.0d && dH.equals(Double.valueOf(Math.floor(dH.doubleValue())));
    }

    public static long m(double d10) {
        return i(d10) & 4294967295L;
    }

    public static void n(String str, int i10, List<InterfaceC2574s> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }
}
