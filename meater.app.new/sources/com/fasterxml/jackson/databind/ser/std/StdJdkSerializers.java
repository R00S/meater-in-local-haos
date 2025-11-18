package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class StdJdkSerializers {

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeBoolean(atomicBoolean.get());
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(atomicInteger.get());
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(atomicLong.get());
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> all() {
        HashMap map = new HashMap();
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map.put(URL.class, toStringSerializer);
        map.put(URI.class, toStringSerializer);
        map.put(Currency.class, toStringSerializer);
        map.put(UUID.class, new UUIDSerializer());
        map.put(Pattern.class, toStringSerializer);
        map.put(Locale.class, toStringSerializer);
        map.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        map.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        map.put(AtomicLong.class, AtomicLongSerializer.class);
        map.put(File.class, FileSerializer.class);
        map.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.instance;
        map.put(Void.class, nullSerializer);
        map.put(Void.TYPE, nullSerializer);
        try {
            map.put(Timestamp.class, DateSerializer.instance);
            map.put(Date.class, SqlDateSerializer.class);
            map.put(Time.class, SqlTimeSerializer.class);
        } catch (NoClassDefFoundError unused) {
        }
        return map.entrySet();
    }
}
