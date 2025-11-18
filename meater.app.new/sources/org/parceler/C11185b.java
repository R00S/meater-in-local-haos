package org.parceler;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/* compiled from: InjectionUtil.java */
/* renamed from: org.parceler.b */
/* loaded from: classes3.dex */
public final class C11185b {

    /* compiled from: InjectionUtil.java */
    /* renamed from: org.parceler.b$b */
    private static abstract class b<T, E extends AccessibleObject> implements PrivilegedExceptionAction<T> {

        /* renamed from: a */
        private final E f41992a;

        protected b(E e2) {
            this.f41992a = e2;
        }

        /* renamed from: a */
        public abstract T mo39870a(E e2) throws Exception;

        @Override // java.security.PrivilegedExceptionAction
        public T run() throws Exception {
            boolean zIsAccessible = this.f41992a.isAccessible();
            this.f41992a.setAccessible(true);
            T tMo39870a = mo39870a(this.f41992a);
            this.f41992a.setAccessible(zIsAccessible);
            return tMo39870a;
        }
    }

    /* compiled from: InjectionUtil.java */
    /* renamed from: org.parceler.b$c */
    private static final class c<T> extends b<T, Field> {

        /* renamed from: b */
        private final Object f41993b;

        @Override // org.parceler.C11185b.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T mo39870a(Field field) throws IllegalAccessException {
            return (T) field.get(this.f41993b);
        }

        private c(Field field, Object obj) {
            super(field);
            this.f41993b = obj;
        }
    }

    /* compiled from: InjectionUtil.java */
    /* renamed from: org.parceler.b$d */
    private static final class d extends b<Void, Field> {

        /* renamed from: b */
        private final Object f41994b;

        /* renamed from: c */
        private final Object f41995c;

        @Override // org.parceler.C11185b.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo39870a(Field field) throws IllegalAccessException, IllegalArgumentException {
            field.set(this.f41994b, this.f41995c);
            return null;
        }

        private d(Field field, Object obj, Object obj2) {
            super(field);
            this.f41994b = obj;
            this.f41995c = obj2;
        }
    }

    /* renamed from: a */
    public static <T> T m39868a(Class<T> cls, Class<?> cls2, Object obj, String str) {
        try {
            return (T) AccessController.doPrivileged(new c(cls2.getDeclaredField(str), obj));
        } catch (NoSuchFieldException e2) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e2);
        } catch (PrivilegedActionException e3) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e3);
        } catch (Exception e4) {
            throw new ParcelerRuntimeException("Exception during field injection", e4);
        }
    }

    /* renamed from: b */
    public static void m39869b(Class<?> cls, Object obj, String str, Object obj2) throws PrivilegedActionException {
        try {
            AccessController.doPrivileged(new d(cls.getDeclaredField(str), obj, obj2));
        } catch (NoSuchFieldException e2) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e2);
        } catch (PrivilegedActionException e3) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e3);
        } catch (Exception e4) {
            throw new ParcelerRuntimeException("Exception during field injection", e4);
        }
    }
}
