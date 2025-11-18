package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class TypeDeserializerBase extends TypeDeserializer implements Serializable {
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected JsonDeserializer<Object> _defaultImplDeserializer;
    protected final Map<String, JsonDeserializer<Object>> _deserializers;
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    protected TypeDeserializerBase(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = typeIdResolver;
        this._typePropertyName = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    protected Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findDeserializer;
        if (obj == null) {
            jsonDeserializer_findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (jsonDeserializer_findDeserializer == null) {
                deserializationContext.reportMappingException("No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
                return null;
            }
        } else {
            jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    protected final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (ClassUtil.isBogusClass(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            if (this._defaultImplDeserializer == null) {
                this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
            }
            jsonDeserializer = this._defaultImplDeserializer;
        }
        return jsonDeserializer;
    }

    protected final JsonDeserializer<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        JsonDeserializer<Object> jsonDeserializerFindContextualValueDeserializer;
        JsonDeserializer<Object> jsonDeserializer_findDefaultImplDeserializer = this._deserializers.get(str);
        if (jsonDeserializer_findDefaultImplDeserializer == null) {
            JavaType javaTypeTypeFromId = this._idResolver.typeFromId(deserializationContext, str);
            if (javaTypeTypeFromId == null) {
                jsonDeserializer_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (jsonDeserializer_findDefaultImplDeserializer == null) {
                    JavaType javaType_handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str, this._idResolver, this._baseType);
                    if (javaType_handleUnknownTypeId == null) {
                        return null;
                    }
                    jsonDeserializerFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, jsonDeserializer_findDefaultImplDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == javaTypeTypeFromId.getClass() && !javaTypeTypeFromId.hasGenericTypes()) {
                    javaTypeTypeFromId = deserializationContext.getTypeFactory().constructSpecializedType(this._baseType, javaTypeTypeFromId.getRawClass());
                }
                jsonDeserializerFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaTypeTypeFromId, this._property);
            }
            jsonDeserializer_findDefaultImplDeserializer = jsonDeserializerFindContextualValueDeserializer;
            this._deserializers.put(str, jsonDeserializer_findDefaultImplDeserializer);
        }
        return jsonDeserializer_findDefaultImplDeserializer;
    }

    protected JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str, TypeIdResolver typeIdResolver, JavaType javaType) throws IOException {
        String str2;
        String descForKnownTypeIds = typeIdResolver.getDescForKnownTypeIds();
        if (descForKnownTypeIds == null) {
            str2 = "known type ids are not statically known";
        } else {
            str2 = "known type ids = " + descForKnownTypeIds;
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, typeIdResolver, str2);
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Class<?> getDefaultImpl() {
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeIdResolver getTypeIdResolver() {
        return this._idResolver;
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + ']';
    }

    protected TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
