package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    /* loaded from: classes2.dex */
    private static final class Serialization implements Serializable {
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method == null) {
            throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == AnnotatedMethod.class && ((AnnotatedMethod) obj)._method == this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName() + "(" + getParameterCount() + " params)";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i2) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i2]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i2) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i2 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i2];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e2.getMessage(), e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e3.getMessage(), e3);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._method.getName().hashCode();
    }

    Object readResolve() throws NoSuchMethodException, SecurityException {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e2.getMessage(), e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e3.getMessage(), e3);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public AnnotatedMethod withMethod(Method method) {
        return new AnnotatedMethod(this._typeContext, method, this._annotations, this._paramAnnotations);
    }

    Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    protected AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this._method = null;
        this._serialization = serialization;
    }
}
