package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        this(Boolean.FALSE);
    }

    protected SqlDateSerializer(Boolean bool) {
        super(Date.class, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (_asTimestamp(serializerProvider)) {
            jsonGenerator.writeNumber(_timestamp(date));
        } else {
            jsonGenerator.writeString(date.toString());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* renamed from: withFormat, reason: avoid collision after fix types in other method */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(bool);
    }
}
