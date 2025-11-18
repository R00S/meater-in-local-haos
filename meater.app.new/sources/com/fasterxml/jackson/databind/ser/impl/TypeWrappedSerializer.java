package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TypeWrappedSerializer extends JsonSerializer<Object> {
    protected final JsonSerializer<Object> _serializer;
    protected final TypeSerializer _typeSerializer;

    public TypeWrappedSerializer(TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer) {
        this._typeSerializer = typeSerializer;
        this._serializer = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Class<Object> handledType() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, this._typeSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public TypeSerializer typeSerializer() {
        return this._typeSerializer;
    }
}
