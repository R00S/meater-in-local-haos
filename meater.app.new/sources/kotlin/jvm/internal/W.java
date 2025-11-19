package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oa.InterfaceC4160e;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes2.dex */
public class W {
    public static Collection a(Object obj) {
        if ((obj instanceof Ca.a) && !(obj instanceof Ca.b)) {
            s(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof Ca.a) && !(obj instanceof Ca.c)) {
            s(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof Ca.a) && !(obj instanceof Ca.d)) {
            s(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof Ca.a) && !(obj instanceof Ca.e)) {
            s(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof Ca.a) && !(obj instanceof Ca.f)) {
            s(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i10) {
        if (obj != null && !m(obj, i10)) {
            s(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof InterfaceC3858o) {
            return ((InterfaceC3858o) obj).getArity();
        }
        if (obj instanceof Ba.a) {
            return 0;
        }
        if (obj instanceof Ba.l) {
            return 1;
        }
        if (obj instanceof Ba.p) {
            return 2;
        }
        if (obj instanceof Ba.q) {
            return 3;
        }
        if (obj instanceof Ba.r) {
            return 4;
        }
        if (obj instanceof Ba.s) {
            return 5;
        }
        if (obj instanceof Ba.t) {
            return 6;
        }
        if (obj instanceof Ba.u) {
            return 7;
        }
        if (obj instanceof Ba.v) {
            return 8;
        }
        if (obj instanceof Ba.w) {
            return 9;
        }
        if (obj instanceof Ba.b) {
            return 10;
        }
        if (obj instanceof Ba.c) {
            return 11;
        }
        if (obj instanceof Ba.d) {
            return 12;
        }
        if (obj instanceof Ba.e) {
            return 13;
        }
        if (obj instanceof Ba.f) {
            return 14;
        }
        if (obj instanceof Ba.g) {
            return 15;
        }
        if (obj instanceof Ba.h) {
            return 16;
        }
        if (obj instanceof Ba.i) {
            return 17;
        }
        if (obj instanceof Ba.j) {
            return 18;
        }
        if (obj instanceof Ba.k) {
            return 19;
        }
        if (obj instanceof Ba.m) {
            return 20;
        }
        if (obj instanceof Ba.n) {
            return 21;
        }
        return obj instanceof Ba.o ? 22 : -1;
    }

    public static boolean m(Object obj, int i10) {
        return (obj instanceof InterfaceC4160e) && l(obj) == i10;
    }

    public static boolean n(Object obj) {
        return (obj instanceof List) && (!(obj instanceof Ca.a) || (obj instanceof Ca.d));
    }

    public static boolean o(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof Ca.a) || (obj instanceof Ca.e));
    }

    public static boolean p(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof Ca.a) || (obj instanceof Ca.f));
    }

    private static <T extends Throwable> T q(T t10) {
        return (T) C3862t.m(t10, W.class.getName());
    }

    public static ClassCastException r(ClassCastException classCastException) {
        throw ((ClassCastException) q(classCastException));
    }

    public static void s(Object obj, String str) {
        t((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void t(String str) {
        throw r(new ClassCastException(str));
    }
}
