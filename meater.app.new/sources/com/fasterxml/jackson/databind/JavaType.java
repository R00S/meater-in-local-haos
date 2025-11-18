package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public abstract class JavaType extends ResolvedType implements Serializable, Type {
    protected final boolean _asStatic;
    protected final Class<?> _class;
    protected final int _hash;
    protected final Object _typeHandler;
    protected final Object _valueHandler;

    protected JavaType(Class<?> cls, int i2, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hash = cls.getName().hashCode() + i2;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    public abstract JavaType containedType(int i2);

    public abstract int containedTypeCount();

    public JavaType containedTypeOrUnknown(int i2) {
        JavaType javaTypeContainedType = containedType(i2);
        return javaTypeContainedType == null ? TypeFactory.unknownType() : javaTypeContainedType;
    }

    public abstract boolean equals(Object obj);

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract TypeBindings getBindings();

    public JavaType getContentType() {
        return null;
    }

    public String getGenericSignature() {
        StringBuilder sb = new StringBuilder(40);
        getGenericSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb);

    public abstract List<JavaType> getInterfaces();

    public JavaType getKeyType() {
        return null;
    }

    public final Class<?> getRawClass() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getReferencedType() {
        return null;
    }

    public abstract JavaType getSuperClass();

    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public boolean hasContentType() {
        return true;
    }

    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public boolean hasHandlers() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    public final int hashCode() {
        return this._hash;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public boolean isArrayType() {
        return false;
    }

    public boolean isCollectionLikeType() {
        return false;
    }

    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    public abstract boolean isContainerType();

    public final boolean isEnumType() {
        return this._class.isEnum();
    }

    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public final boolean isJavaLangObject() {
        return this._class == Object.class;
    }

    public boolean isMapLikeType() {
        return false;
    }

    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract String toString();

    public final boolean useStaticType() {
        return this._asStatic;
    }

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public JavaType withHandlersFrom(JavaType javaType) {
        Object typeHandler = javaType.getTypeHandler();
        JavaType javaTypeWithTypeHandler = typeHandler != this._typeHandler ? withTypeHandler(typeHandler) : this;
        Object valueHandler = javaType.getValueHandler();
        return valueHandler != this._valueHandler ? javaTypeWithTypeHandler.withValueHandler(valueHandler) : javaTypeWithTypeHandler;
    }

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);
}
