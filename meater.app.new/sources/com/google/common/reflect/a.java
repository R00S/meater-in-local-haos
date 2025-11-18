package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import l8.m;

/* compiled from: Invokable.java */
/* loaded from: classes2.dex */
public abstract class a<T, R> implements AnnotatedElement, Member {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f37565c = b();

    /* renamed from: a, reason: collision with root package name */
    private final AccessibleObject f37566a;

    /* renamed from: b, reason: collision with root package name */
    private final Member f37567b;

    /* compiled from: Invokable.java */
    /* renamed from: com.google.common.reflect.a$a, reason: collision with other inner class name */
    static class C0477a<T> extends a<T, T> {

        /* renamed from: d, reason: collision with root package name */
        final Constructor<?> f37568d;

        C0477a(Constructor<?> constructor) {
            super(constructor);
            this.f37568d = constructor;
        }

        private boolean d() {
            Class<?> declaringClass = this.f37568d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        Type[] c() {
            Type[] genericParameterTypes = this.f37568d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !d()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f37568d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }
    }

    /* compiled from: Invokable.java */
    static class b<T> extends a<T, Object> {

        /* renamed from: d, reason: collision with root package name */
        final Method f37569d;

        b(Method method) {
            super(method);
            this.f37569d = method;
        }
    }

    <M extends AccessibleObject & Member> a(M m10) {
        m.l(m10);
        this.f37566a = m10;
        this.f37567b = m10;
    }

    private static boolean b() throws ClassNotFoundException {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public f<T> a() {
        return f.of((Class) getDeclaringClass());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return a().equals(aVar.a()) && this.f37567b.equals(aVar.f37567b);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f37566a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f37566a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f37566a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f37567b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f37567b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f37567b.getName();
    }

    public int hashCode() {
        return this.f37567b.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f37566a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f37567b.isSynthetic();
    }

    public String toString() {
        return this.f37567b.toString();
    }
}
