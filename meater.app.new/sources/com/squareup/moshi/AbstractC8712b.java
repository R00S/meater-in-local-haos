package com.squareup.moshi;

import com.squareup.moshi.p231w.C8735c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ClassFactory.java */
/* renamed from: com.squareup.moshi.b */
/* loaded from: classes2.dex */
abstract class AbstractC8712b<T> {

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$a */
    class a extends AbstractC8712b<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f33074a;

        /* renamed from: b */
        final /* synthetic */ Class f33075b;

        a(Constructor constructor, Class cls) {
            this.f33074a = constructor;
            this.f33075b = cls;
        }

        @Override // com.squareup.moshi.AbstractC8712b
        /* renamed from: b */
        public T mo27686b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f33074a.newInstance(null);
        }

        public String toString() {
            return this.f33075b.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$b */
    class b extends AbstractC8712b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33076a;

        /* renamed from: b */
        final /* synthetic */ Object f33077b;

        /* renamed from: c */
        final /* synthetic */ Class f33078c;

        b(Method method, Object obj, Class cls) {
            this.f33076a = method;
            this.f33077b = obj;
            this.f33078c = cls;
        }

        @Override // com.squareup.moshi.AbstractC8712b
        /* renamed from: b */
        public T mo27686b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f33076a.invoke(this.f33077b, this.f33078c);
        }

        public String toString() {
            return this.f33078c.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$c */
    class c extends AbstractC8712b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33079a;

        /* renamed from: b */
        final /* synthetic */ Class f33080b;

        /* renamed from: c */
        final /* synthetic */ int f33081c;

        c(Method method, Class cls, int i2) {
            this.f33079a = method;
            this.f33080b = cls;
            this.f33081c = i2;
        }

        @Override // com.squareup.moshi.AbstractC8712b
        /* renamed from: b */
        public T mo27686b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f33079a.invoke(null, this.f33080b, Integer.valueOf(this.f33081c));
        }

        public String toString() {
            return this.f33080b.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$d */
    class d extends AbstractC8712b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33082a;

        /* renamed from: b */
        final /* synthetic */ Class f33083b;

        d(Method method, Class cls) {
            this.f33082a = method;
            this.f33083b = cls;
        }

        @Override // com.squareup.moshi.AbstractC8712b
        /* renamed from: b */
        public T mo27686b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f33082a.invoke(null, this.f33083b, Object.class);
        }

        public String toString() {
            return this.f33083b.getName();
        }
    }

    AbstractC8712b() {
    }

    /* renamed from: a */
    public static <T> AbstractC8712b<T> m27685a(Class<?> cls) throws NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new c(declaredMethod2, cls, iIntValue);
                    } catch (IllegalAccessException unused3) {
                        throw new AssertionError();
                    } catch (NoSuchMethodException unused4) {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new d(declaredMethod3, cls);
                    } catch (InvocationTargetException e2) {
                        throw C8735c.m27873s(e2);
                    }
                } catch (Exception unused5) {
                    throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b */
    abstract T mo27686b() throws IllegalAccessException, InstantiationException, InvocationTargetException;
}
