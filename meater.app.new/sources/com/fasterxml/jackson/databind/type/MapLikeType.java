package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

/* loaded from: classes2.dex */
public class MapLikeType extends TypeBase {
    protected final JavaType _keyType;
    protected final JavaType _valueType;

    protected MapLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z);
        this._keyType = javaType2;
        this._valueType = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._keyType != null) {
            sb.append('<');
            sb.append(this._keyType.toCanonical());
            sb.append(',');
            sb.append(this._valueType.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj;
        return this._class == mapLikeType._class && this._keyType.equals(mapLikeType._keyType) && this._valueType.equals(mapLikeType._valueType);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        sb.append('<');
        this._keyType.getGenericSignature(sb);
        this._valueType.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getKeyType() {
        return this._keyType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasHandlers() {
        return super.hasHandlers() || this._valueType.hasHandlers() || this._keyType.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isMapLikeType() {
        return true;
    }

    public boolean isTrueMapType() {
        return Map.class.isAssignableFrom(this._class);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this._class.getName(), this._keyType, this._valueType);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this._valueType == javaType ? this : new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaTypeWithHandlersFrom;
        JavaType javaTypeWithHandlersFrom2;
        JavaType javaTypeWithHandlersFrom3 = super.withHandlersFrom(javaType);
        JavaType keyType = javaType.getKeyType();
        if ((javaTypeWithHandlersFrom3 instanceof MapLikeType) && keyType != null && (javaTypeWithHandlersFrom2 = this._keyType.withHandlersFrom(keyType)) != this._keyType) {
            javaTypeWithHandlersFrom3 = ((MapLikeType) javaTypeWithHandlersFrom3).withKeyType(javaTypeWithHandlersFrom2);
        }
        JavaType contentType = javaType.getContentType();
        return (contentType == null || (javaTypeWithHandlersFrom = this._valueType.withHandlersFrom(contentType)) == this._valueType) ? javaTypeWithHandlersFrom3 : javaTypeWithHandlersFrom3.withContentType(javaTypeWithHandlersFrom);
    }

    public MapLikeType withKeyType(JavaType javaType) {
        return javaType == this._keyType ? this : new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withKeyValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public MapLikeType withContentTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public MapLikeType withContentValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public MapLikeType withStaticTyping() {
        return this._asStatic ? this : new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public MapLikeType withTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public MapLikeType withValueHandler(Object obj) {
        return new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
    }
}
