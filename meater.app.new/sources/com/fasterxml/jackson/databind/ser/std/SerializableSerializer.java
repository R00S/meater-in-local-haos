package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class SerializableSerializer extends StdSerializer<JsonSerializable> {
    public static final SerializableSerializer instance = new SerializableSerializer();
    private static final AtomicReference<ObjectMapper> _mapperReference = new AtomicReference<>();

    protected SerializableSerializer() {
        super(JsonSerializable.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, JsonSerializable jsonSerializable) {
        if (jsonSerializable instanceof JsonSerializable.Base) {
            return ((JsonSerializable.Base) jsonSerializable).isEmpty(serializerProvider);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonSerializable.serialize(jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void serializeWithType(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonSerializable.serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
    }
}
