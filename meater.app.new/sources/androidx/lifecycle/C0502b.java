package androidx.lifecycle;

import androidx.lifecycle.AbstractC0511g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
final class C0502b {

    /* renamed from: a */
    static C0502b f3461a = new C0502b();

    /* renamed from: b */
    private final Map<Class<?>, a> f3462b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Boolean> f3463c = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a */
        final Map<AbstractC0511g.b, List<b>> f3464a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC0511g.b> f3465b;

        a(Map<b, AbstractC0511g.b> map) {
            this.f3465b = map;
            for (Map.Entry<b, AbstractC0511g.b> entry : map.entrySet()) {
                AbstractC0511g.b value = entry.getValue();
                List<b> arrayList = this.f3464a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f3464a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m3849b(List<b> list, InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m3851a(interfaceC0515k, bVar, obj);
                }
            }
        }

        /* renamed from: a */
        void m3850a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m3849b(this.f3464a.get(bVar), interfaceC0515k, bVar, obj);
            m3849b(this.f3464a.get(AbstractC0511g.b.ON_ANY), interfaceC0515k, bVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    /* renamed from: androidx.lifecycle.b$b */
    static final class b {

        /* renamed from: a */
        final int f3466a;

        /* renamed from: b */
        final Method f3467b;

        b(int i2, Method method) {
            this.f3466a = i2;
            this.f3467b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m3851a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i2 = this.f3466a;
                if (i2 == 0) {
                    this.f3467b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f3467b.invoke(obj, interfaceC0515k);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f3467b.invoke(obj, interfaceC0515k, bVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
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
            return this.f3466a == bVar.f3466a && this.f3467b.getName().equals(bVar.f3467b.getName());
        }

        public int hashCode() {
            return (this.f3466a * 31) + this.f3467b.getName().hashCode();
        }
    }

    C0502b() {
    }

    /* renamed from: a */
    private a m3844a(Class<?> cls, Method[] methodArr) {
        int i2;
        a aVarM3847c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM3847c = m3847c(superclass)) != null) {
            map.putAll(aVarM3847c.f3465b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0511g.b> entry : m3847c(cls2).f3465b.entrySet()) {
                m3846e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3845b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0523s interfaceC0523s = (InterfaceC0523s) method.getAnnotation(InterfaceC0523s.class);
            if (interfaceC0523s != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0515k.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                AbstractC0511g.b bVarValue = interfaceC0523s.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0511g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != AbstractC0511g.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m3846e(map, new b(i2, method), bVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f3462b.put(cls, aVar);
        this.f3463c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m3845b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* renamed from: e */
    private void m3846e(Map<b, AbstractC0511g.b> map, b bVar, AbstractC0511g.b bVar2, Class<?> cls) {
        AbstractC0511g.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f3467b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    /* renamed from: c */
    a m3847c(Class<?> cls) {
        a aVar = this.f3462b.get(cls);
        return aVar != null ? aVar : m3844a(cls, null);
    }

    /* renamed from: d */
    boolean m3848d(Class<?> cls) {
        Boolean bool = this.f3463c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM3845b = m3845b(cls);
        for (Method method : methodArrM3845b) {
            if (((InterfaceC0523s) method.getAnnotation(InterfaceC0523s.class)) != null) {
                m3844a(cls, methodArrM3845b);
                return true;
            }
        }
        this.f3463c.put(cls, Boolean.FALSE);
        return false;
    }
}
