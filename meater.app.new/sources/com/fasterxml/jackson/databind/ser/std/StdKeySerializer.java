package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Date;

@Deprecated
/* loaded from: classes2.dex */
public class StdKeySerializer extends StdSerializer<Object> {
    public StdKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String name;
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            name = (String) obj;
        } else if (cls.isEnum()) {
            Enum r3 = (Enum) obj;
            name = serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? r3.toString() : r3.name();
        } else {
            if (obj instanceof Date) {
                serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
                return;
            }
            name = cls == Class.class ? ((Class) obj).getName() : obj.toString();
        }
        jsonGenerator.writeFieldName(name);
    }
}
