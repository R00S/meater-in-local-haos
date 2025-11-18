package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
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
            return;
        }
        DateFormat dateFormat = this._customFormat;
        if (dateFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
        } else {
            synchronized (dateFormat) {
                jsonGenerator.writeString(this._customFormat.format(date));
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* renamed from: withFormat */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }
}
