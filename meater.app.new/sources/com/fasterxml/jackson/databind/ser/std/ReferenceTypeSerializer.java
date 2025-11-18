package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    protected final JsonInclude.Include _contentInclusion;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._contentInclusion = null;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(cls);
        if (jsonSerializerSerializerFor != null) {
            return jsonSerializerSerializerFor;
        }
        JsonSerializer<Object> jsonSerializer_findSerializer = _findSerializer(serializerProvider, cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            jsonSerializer_findSerializer = jsonSerializer_findSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<Object> jsonSerializer = jsonSerializer_findSerializer;
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializer);
        return jsonSerializer;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return serializerProvider.findTypedValueSerializer(cls, true, beanProperty);
    }

    protected abstract Object _getReferenced(T t);

    protected abstract Object _getReferencedIfPresent(T t);

    protected abstract boolean _isValueEmpty(T t);

    protected boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        TypeSerializer typeSerializerForProperty = this._valueTypeSerializer;
        if (typeSerializerForProperty != null) {
            typeSerializerForProperty = typeSerializerForProperty.forProperty(beanProperty);
        }
        TypeSerializer typeSerializer = typeSerializerForProperty;
        JsonSerializer<?> jsonSerializerFindAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (jsonSerializerFindAnnotatedContentSerializer == null) {
            jsonSerializerFindAnnotatedContentSerializer = this._valueSerializer;
            if (jsonSerializerFindAnnotatedContentSerializer != null) {
                jsonSerializerFindAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(jsonSerializerFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                jsonSerializerFindAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerFindAnnotatedContentSerializer;
        JsonInclude.Include include = this._contentInclusion;
        JsonInclude.Include contentInclusion = findIncludeOverrides(serializerProvider, beanProperty, handledType()).getContentInclusion();
        return withResolved(beanProperty, typeSerializer, jsonSerializer, this._unwrapper, (contentInclusion == include || contentInclusion == JsonInclude.Include.USE_DEFAULTS) ? include : contentInclusion);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        if (t == null || _isValueEmpty(t)) {
            return true;
        }
        if (this._contentInclusion == null) {
            return false;
        }
        Object obj_getReferenced = _getReferenced(t);
        JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
        if (jsonSerializer_findCachedSerializer == null) {
            try {
                jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferenced.getClass());
            } catch (JsonMappingException e2) {
                throw new RuntimeJsonMappingException(e2);
            }
        }
        return jsonSerializer_findCachedSerializer.isEmpty(serializerProvider, obj_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
        if (jsonSerializer_findCachedSerializer == null) {
            jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferencedIfPresent.getClass());
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            jsonSerializer_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializer_findCachedSerializer.serialize(obj_getReferencedIfPresent, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            }
        } else {
            JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
            if (jsonSerializer_findCachedSerializer == null) {
                jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferencedIfPresent.getClass());
            }
            jsonSerializer_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<?> jsonSerializerUnwrappingSerializer = this._valueSerializer;
        if (jsonSerializerUnwrappingSerializer != null) {
            jsonSerializerUnwrappingSerializer = jsonSerializerUnwrappingSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerUnwrappingSerializer;
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return withResolved(this._property, this._valueTypeSerializer, jsonSerializer, nameTransformer, this._contentInclusion);
    }

    protected abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, JsonInclude.Include include);

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return serializerProvider.findTypedValueSerializer(javaType, true, beanProperty);
    }

    protected ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, JsonInclude.Include include) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = referenceTypeSerializer._dynamicSerializers;
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        if (include != JsonInclude.Include.USE_DEFAULTS && include != JsonInclude.Include.ALWAYS) {
            this._contentInclusion = include;
        } else {
            this._contentInclusion = null;
        }
    }
}
