package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes2.dex */
public class ResolvedRecursiveType extends TypeBase {
    protected JavaType _referencedType;

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, null, null, 0, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && this._referencedType != null && obj.getClass() == ResolvedRecursiveType.class && this._referencedType.equals(((ResolvedRecursiveType) obj).getSelfReferencedType());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        return this._referencedType.getGenericSignature(sb);
    }

    public JavaType getSelfReferencedType() {
        return this._referencedType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public void setReference(JavaType javaType) {
        if (this._referencedType == null) {
            this._referencedType = javaType;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this._referencedType + ", new = " + javaType);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        JavaType javaType = this._referencedType;
        if (javaType == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(javaType.getRawClass().getName());
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return this;
    }
}
