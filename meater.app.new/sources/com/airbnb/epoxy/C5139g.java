package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ControllerHelperLookup.java */
/* renamed from: com.airbnb.epoxy.g */
/* loaded from: classes.dex */
class C5139g {

    /* renamed from: a */
    private static final Map<Class<?>, Constructor<?>> f12234a = new LinkedHashMap();

    /* renamed from: b */
    private static final NoOpControllerHelper f12235b = new NoOpControllerHelper();

    /* renamed from: a */
    private static Constructor<?> m9292a(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> constructorM9292a;
        Map<Class<?>, Constructor<?>> map = f12234a;
        Constructor<?> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructorM9292a = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            constructorM9292a = m9292a(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for " + name, e2);
        }
        f12234a.put(cls, constructorM9292a);
        return constructorM9292a;
    }

    /* renamed from: b */
    static AbstractC5137f m9293b(AbstractC5153n abstractC5153n) throws NoSuchMethodException, SecurityException {
        Constructor<?> constructorM9292a = m9292a(abstractC5153n.getClass());
        if (constructorM9292a == null) {
            return f12235b;
        }
        try {
            return (AbstractC5137f) constructorM9292a.newInstance(abstractC5153n);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke " + constructorM9292a, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke " + constructorM9292a, e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to get Epoxy helper class.", cause);
        }
    }
}
