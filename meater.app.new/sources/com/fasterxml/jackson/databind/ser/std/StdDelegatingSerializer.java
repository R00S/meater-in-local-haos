package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

/* loaded from: classes2.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer {
    protected final Converter<Object, ?> _converter;
    protected final JsonSerializer<Object> _delegateSerializer;
    protected final JavaType _delegateType;

    public StdDelegatingSerializer(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateSerializer = jsonSerializer;
    }

    protected JsonSerializer<Object> _findSerializer(Object obj, SerializerProvider serializerProvider) throws JsonMappingException {
        return serializerProvider.findValueSerializer(obj.getClass());
    }

    protected Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization = this._delegateSerializer;
        JavaType outputType = this._delegateType;
        if (jsonSerializerHandleSecondaryContextualization == null) {
            if (outputType == null) {
                outputType = this._converter.getOutputType(serializerProvider.getTypeFactory());
            }
            if (!outputType.isJavaLangObject()) {
                jsonSerializerHandleSecondaryContextualization = serializerProvider.findValueSerializer(outputType);
            }
        }
        if (jsonSerializerHandleSecondaryContextualization instanceof ContextualSerializer) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerHandleSecondaryContextualization, beanProperty);
        }
        return (jsonSerializerHandleSecondaryContextualization == this._delegateSerializer && outputType == this._delegateType) ? this : withDelegate(this._converter, outputType, jsonSerializerHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object objConvertValue = convertValue(obj);
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        return jsonSerializer == null ? obj == null : jsonSerializer.isEmpty(serializerProvider, objConvertValue);
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) throws JsonMappingException {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof ResolvableSerializer)) {
            return;
        }
        ((ResolvableSerializer) obj).resolve(serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer_findSerializer = this._delegateSerializer;
        if (jsonSerializer_findSerializer == null) {
            jsonSerializer_findSerializer = _findSerializer(objConvertValue, serializerProvider);
        }
        jsonSerializer_findSerializer.serialize(objConvertValue, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object objConvertValue = convertValue(obj);
        JsonSerializer<Object> jsonSerializer_findSerializer = this._delegateSerializer;
        if (jsonSerializer_findSerializer == null) {
            jsonSerializer_findSerializer = _findSerializer(obj, serializerProvider);
        }
        jsonSerializer_findSerializer.serializeWithType(objConvertValue, jsonGenerator, serializerProvider, typeSerializer);
    }

    protected StdDelegatingSerializer withDelegate(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        if (StdDelegatingSerializer.class == StdDelegatingSerializer.class) {
            return new StdDelegatingSerializer(converter, javaType, jsonSerializer);
        }
        throw new IllegalStateException("Sub-class " + StdDelegatingSerializer.class.getName() + " must override 'withDelegate'");
    }
}
