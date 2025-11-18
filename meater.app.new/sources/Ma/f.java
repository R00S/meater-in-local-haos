package Ma;

import La.Y0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "q", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "p", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "g", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    public static final <T> T g(Class<T> annotationClass, Map<String, ? extends Object> values, List<Method> methods) {
        C3862t.g(annotationClass, "annotationClass");
        C3862t.g(values, "values");
        C3862t.g(methods, "methods");
        InterfaceC4164i interfaceC4164iA = C4165j.a(new b(values));
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new d(annotationClass, values, C4165j.a(new c(annotationClass, values)), interfaceC4164iA, methods));
        C3862t.e(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(r.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    private static final <T> boolean i(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zB;
        boolean z10;
        Ia.d dVarA;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!C3862t.b((annotation == null || (dVarA = Aa.a.a(annotation)) == null) ? null : Aa.a.b(dVarA), cls)) {
            return false;
        }
        List<Method> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z10 = true;
        } else {
            for (Method method : list2) {
                Object obj2 = map.get(method.getName());
                Object objInvoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zB = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zB = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zB = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zB = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zB = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zB = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zB = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zB = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zB = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zB = C3862t.b(obj2, objInvoke);
                }
                if (!zB) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    private static final int k(InterfaceC4164i<Integer> interfaceC4164i) {
        return interfaceC4164i.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        B.p0(map.entrySet(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : e.f12155B);
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        C3862t.g(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            C3862t.f(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            C3862t.f(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final String n(InterfaceC4164i<String> interfaceC4164i) {
        return interfaceC4164i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, InterfaceC4164i interfaceC4164i, InterfaceC4164i interfaceC4164i2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(interfaceC4164i2));
                }
            } else if (name.equals("toString")) {
                return n(interfaceC4164i);
            }
        }
        if (C3862t.b(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, C3831l.v0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(C3831l.I0(objArr));
        sb2.append(')');
        throw new Y0(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i10, String str, Class<?> cls) {
        String strQ;
        Ia.d dVarB = C3862t.b(cls, Class.class) ? P.b(Ia.d.class) : (cls.isArray() && C3862t.b(cls.getComponentType(), Class.class)) ? P.b(Ia.d[].class) : Aa.a.e(cls);
        if (C3862t.b(dVarB.q(), P.b(Object[].class).q())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVarB.q());
            sb2.append('<');
            Class<?> componentType = Aa.a.b(dVarB).getComponentType();
            C3862t.f(componentType, "getComponentType(...)");
            sb2.append(Aa.a.e(componentType).q());
            sb2.append('>');
            strQ = sb2.toString();
        } else {
            strQ = dVarB.q();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof Ia.d) {
            obj = Aa.a.b((Ia.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof Ia.d[]) {
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                Ia.d[] dVarArr = (Ia.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (Ia.d dVar : dVarArr) {
                    arrayList.add(Aa.a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
