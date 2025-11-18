package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;
import java.sql.Time;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class SqlTimeSerializer extends StdScalarSerializer<Time> {
    public SqlTimeSerializer() {
        super(Time.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Time time, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(time.toString());
    }
}
