package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: TypeIntrinsics.java */
/* renamed from: kotlin.a0.d.l0 */
/* loaded from: classes2.dex */
public class C9800l0 {
    /* renamed from: a */
    public static Collection m32326a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            m32339n(obj, "kotlin.collections.MutableCollection");
        }
        return m32331f(obj);
    }

    /* renamed from: b */
    public static List m32327b(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            m32339n(obj, "kotlin.collections.MutableList");
        }
        return m32332g(obj);
    }

    /* renamed from: c */
    public static Map m32328c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            m32339n(obj, "kotlin.collections.MutableMap");
        }
        return m32333h(obj);
    }

    /* renamed from: d */
    public static Set m32329d(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            m32339n(obj, "kotlin.collections.MutableSet");
        }
        return m32334i(obj);
    }

    /* renamed from: e */
    public static Object m32330e(Object obj, int i2) {
        if (obj != null && !m32336k(obj, i2)) {
            m32339n(obj, "kotlin.jvm.functions.Function" + i2);
        }
        return obj;
    }

    /* renamed from: f */
    public static Collection m32331f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            throw m32338m(e2);
        }
    }

    /* renamed from: g */
    public static List m32332g(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            throw m32338m(e2);
        }
    }

    /* renamed from: h */
    public static Map m32333h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            throw m32338m(e2);
        }
    }

    /* renamed from: i */
    public static Set m32334i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            throw m32338m(e2);
        }
    }

    /* renamed from: j */
    public static int m32335j(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        return obj instanceof Function22 ? 22 : -1;
    }

    /* renamed from: k */
    public static boolean m32336k(Object obj, int i2) {
        return (obj instanceof Function) && m32335j(obj) == i2;
    }

    /* renamed from: l */
    private static <T extends Throwable> T m32337l(T t) {
        return (T) C9801m.m32353m(t, C9800l0.class.getName());
    }

    /* renamed from: m */
    public static ClassCastException m32338m(ClassCastException classCastException) {
        throw ((ClassCastException) m32337l(classCastException));
    }

    /* renamed from: n */
    public static void m32339n(Object obj, String str) {
        m32340o((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: o */
    public static void m32340o(String str) {
        throw m32338m(new ClassCastException(str));
    }
}
