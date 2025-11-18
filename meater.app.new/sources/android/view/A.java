package android.view;

import Ub.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: Lifecycling.jvm.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/A;", "", "<init>", "()V", "object", "Landroidx/lifecycle/s;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/s;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/j;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/j;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f25844a = new A();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC2103j>>> classToAdapters = new HashMap();

    private A() {
    }

    private final InterfaceC2103j a(Constructor<? extends InterfaceC2103j> constructor, Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            InterfaceC2103j interfaceC2103jNewInstance = constructor.newInstance(object);
            C3862t.f(interfaceC2103jNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return interfaceC2103jNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends InterfaceC2103j> b(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r02 = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            C3862t.f(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                C3862t.f(name, "name");
                name = name.substring(fullPackage.length() + 1);
                C3862t.f(name, "this as java.lang.String).substring(startIndex)");
            }
            C3862t.f(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls = Class.forName(strC);
            C3862t.e(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        C3862t.g(className, "className");
        return n.C(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(klass);
        map.put(klass, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && InterfaceC2113u.class.isAssignableFrom(klass);
    }

    public static final InterfaceC2111s f(Object object) {
        C3862t.g(object, "object");
        boolean z10 = object instanceof InterfaceC2111s;
        boolean z11 = object instanceof InterfaceC2097e;
        if (z10 && z11) {
            return new C2099f((InterfaceC2097e) object, (InterfaceC2111s) object);
        }
        if (z11) {
            return new C2099f((InterfaceC2097e) object, null);
        }
        if (z10) {
            return (InterfaceC2111s) object;
        }
        Class<?> cls = object.getClass();
        A a10 = f25844a;
        if (a10.d(cls) != 2) {
            return new K(object);
        }
        List<Constructor<? extends InterfaceC2103j>> list = classToAdapters.get(cls);
        C3862t.d(list);
        List<Constructor<? extends InterfaceC2103j>> list2 = list;
        if (list2.size() == 1) {
            return new X(a10.a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC2103j[] interfaceC2103jArr = new InterfaceC2103j[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC2103jArr[i10] = f25844a.a(list2.get(i10), object);
        }
        return new C2096d(interfaceC2103jArr);
    }

    private final int g(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC2103j> constructorB = b(klass);
        if (constructorB != null) {
            classToAdapters.put(klass, r.e(constructorB));
            return 2;
        }
        if (C2095c.f25940c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (e(superclass)) {
            C3862t.f(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC2103j>> list = classToAdapters.get(superclass);
            C3862t.d(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        C3862t.f(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                C3862t.f(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC2103j>> list2 = classToAdapters.get(intrface);
                C3862t.d(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
