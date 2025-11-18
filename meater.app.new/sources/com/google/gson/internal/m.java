package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f39099a = c();

    /* compiled from: UnsafeAllocator.java */
    class a extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f39100b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39101c;

        a(Method method, Object obj) {
            this.f39100b = method;
            this.f39101c = obj;
        }

        @Override // com.google.gson.internal.m
        public <T> T d(Class<T> cls) {
            m.b(cls);
            return (T) this.f39100b.invoke(this.f39101c, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class b extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f39102b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39103c;

        b(Method method, int i10) {
            this.f39102b = method;
            this.f39103c = i10;
        }

        @Override // com.google.gson.internal.m
        public <T> T d(Class<T> cls) {
            m.b(cls);
            return (T) this.f39102b.invoke(null, cls, Integer.valueOf(this.f39103c));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class c extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f39104b;

        c(Method method) {
            this.f39104b = method;
        }

        @Override // com.google.gson.internal.m
        public <T> T d(Class<T> cls) {
            m.b(cls);
            return (T) this.f39104b.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class d extends m {
        d() {
        }

        @Override // com.google.gson.internal.m
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strA = com.google.gson.internal.c.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    private static m c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract <T> T d(Class<T> cls);
}
