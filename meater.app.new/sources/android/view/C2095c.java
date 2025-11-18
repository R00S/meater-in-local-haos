package android.view;

import android.view.AbstractC2106m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2095c {

    /* renamed from: c, reason: collision with root package name */
    static C2095c f25940c = new C2095c();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f25941a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f25942b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.c$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<AbstractC2106m.a, List<b>> f25943a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, AbstractC2106m.a> f25944b;

        a(Map<b, AbstractC2106m.a> map) {
            this.f25944b = map;
            for (Map.Entry<b, AbstractC2106m.a> entry : map.entrySet()) {
                AbstractC2106m.a value = entry.getValue();
                List<b> arrayList = this.f25943a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f25943a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(interfaceC2114v, aVar, obj);
                }
            }
        }

        void a(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.f25943a.get(aVar), interfaceC2114v, aVar, obj);
            b(this.f25943a.get(AbstractC2106m.a.ON_ANY), interfaceC2114v, aVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.c$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f25945a;

        /* renamed from: b, reason: collision with root package name */
        final Method f25946b;

        b(int i10, Method method) throws SecurityException {
            this.f25945a = i10;
            this.f25946b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i10 = this.f25945a;
                if (i10 == 0) {
                    this.f25946b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f25946b.invoke(obj, interfaceC2114v);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f25946b.invoke(obj, interfaceC2114v, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f25945a == bVar.f25945a && this.f25946b.getName().equals(bVar.f25946b.getName());
        }

        public int hashCode() {
            return (this.f25945a * 31) + this.f25946b.getName().hashCode();
        }
    }

    C2095c() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f25944b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC2106m.a> entry : c(cls2).f25944b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            F f10 = (F) method.getAnnotation(F.class);
            if (f10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC2114v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC2106m.a aVarValue = f10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2106m.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC2106m.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f25941a.put(cls, aVar);
        this.f25942b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, AbstractC2106m.a> map, b bVar, AbstractC2106m.a aVar, Class<?> cls) {
        AbstractC2106m.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f25946b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f25941a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f25942b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((F) method.getAnnotation(F.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f25942b.put(cls, Boolean.FALSE);
        return false;
    }
}
