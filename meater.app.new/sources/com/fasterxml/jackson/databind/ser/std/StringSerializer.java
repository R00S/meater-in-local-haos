package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class StringSerializer extends NonTypedScalarSerializerBase<Object> {
    public StringSerializer() {
        super(String.class, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        String str = (String) obj;
        return str == null || str.length() == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString((String) obj);
    }
}
