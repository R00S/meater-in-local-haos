package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    protected final DateFormat _customFormat;
    protected final Boolean _useTimestamp;

    protected DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
    }

    protected boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (serializerProvider != null) {
            return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    protected abstract long _timestamp(T t);

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides;
        if (beanProperty != null && (valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType())) != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return withFormat(Boolean.TRUE, null);
            }
            if (shape == JsonFormat.Shape.STRING || valueFindFormatOverrides.hasPattern() || valueFindFormatOverrides.hasLocale() || valueFindFormatOverrides.hasTimeZone()) {
                TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(valueFindFormatOverrides.hasPattern() ? valueFindFormatOverrides.getPattern() : "yyyy-MM-dd'T'HH:mm:ss.SSSZ", valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : serializerProvider.getLocale());
                if (timeZone == null) {
                    timeZone = serializerProvider.getTimeZone();
                }
                simpleDateFormat.setTimeZone(timeZone);
                return withFormat(Boolean.FALSE, simpleDateFormat);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null || _timestamp(t) == 0;
    }

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);
}
