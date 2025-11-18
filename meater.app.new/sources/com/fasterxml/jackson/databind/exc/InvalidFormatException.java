package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes2.dex */
public class InvalidFormatException extends JsonMappingException {
    protected final Class<?> _targetType;
    protected final Object _value;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str);
        this._value = obj;
        this._targetType = cls;
    }

    public static InvalidFormatException from(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        return new InvalidFormatException(jsonParser, str, obj, cls);
    }
}
