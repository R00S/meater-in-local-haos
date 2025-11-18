package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(TimeZone timeZone, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(timeZone.getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(TimeZone timeZone, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        typeSerializer.writeTypePrefixForScalar(timeZone, jsonGenerator, TimeZone.class);
        serialize(timeZone, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(timeZone, jsonGenerator);
    }
}
