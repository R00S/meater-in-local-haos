package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

/* loaded from: classes2.dex */
public class IgnoredPropertyException extends PropertyBindingException {
    public IgnoredPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static IgnoredPropertyException from(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser, "Ignored field \"" + str + "\" (class " + cls.getName() + ") encountered; mapper configured not to allow this", jsonParser.getCurrentLocation(), cls, str, collection);
        ignoredPropertyException.prependPath(obj, str);
        return ignoredPropertyException;
    }
}
