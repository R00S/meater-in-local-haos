package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* loaded from: classes2.dex */
public class UnknownSerializer extends StdSerializer<Object> {
    public UnknownSerializer() {
        super(Object.class);
    }

    protected void failForEmpty(SerializerProvider serializerProvider, Object obj) throws JsonMappingException {
        serializerProvider.reportMappingProblem("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        typeSerializer.writeTypePrefixForObject(obj, jsonGenerator);
        typeSerializer.writeTypeSuffixForObject(obj, jsonGenerator);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls, false);
    }
}
