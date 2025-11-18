package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: Lifecycling.java */
/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class C0519o {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3491a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC0510f>>> f3492b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0510f m3883a(Constructor<? extends InterfaceC0510f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC0510f> m3884b(Class<?> cls) throws NoSuchMethodException, SecurityException {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strM3885c = m3885c(canonicalName);
            if (!name.isEmpty()) {
                strM3885c = name + "." + strM3885c;
            }
            Constructor declaredConstructor = Class.forName(strM3885c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public static String m3885c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m3886d(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Integer num = f3491a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM3889g = m3889g(cls);
        f3491a.put(cls, Integer.valueOf(iM3889g));
        return iM3889g;
    }

    /* renamed from: e */
    private static boolean m3887e(Class<?> cls) {
        return cls != null && InterfaceC0514j.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static InterfaceC0513i m3888f(Object obj) {
        boolean z = obj instanceof InterfaceC0513i;
        boolean z2 = obj instanceof InterfaceC0508e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0508e) obj, (InterfaceC0513i) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0508e) obj, null);
        }
        if (z) {
            return (InterfaceC0513i) obj;
        }
        Class<?> cls = obj.getClass();
        if (m3886d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0510f>> list = f3492b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3883a(list.get(0), obj));
        }
        InterfaceC0510f[] interfaceC0510fArr = new InterfaceC0510f[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            interfaceC0510fArr[i2] = m3883a(list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0510fArr);
    }

    /* renamed from: g */
    private static int m3889g(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0510f> constructorM3884b = m3884b(cls);
        if (constructorM3884b != null) {
            f3492b.put(cls, Collections.singletonList(constructorM3884b));
            return 2;
        }
        if (C0502b.f3461a.m3848d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m3887e(superclass)) {
            if (m3886d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f3492b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m3887e(cls2)) {
                if (m3886d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f3492b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3492b.put(cls, arrayList);
        return 2;
    }
}
