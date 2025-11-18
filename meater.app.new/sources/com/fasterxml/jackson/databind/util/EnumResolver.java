package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class EnumResolver implements Serializable {
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r4) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = map;
        this._defaultValue = r4;
    }

    public static EnumResolver constructFor(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("No enum constants for class " + cls.getName());
        }
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(cls, enumConstants, new String[enumConstants.length]);
        HashMap map = new HashMap();
        int length = enumConstants.length;
        for (int i2 = 0; i2 < length; i2++) {
            String strName = strArrFindEnumValues[i2];
            if (strName == null) {
                strName = enumConstants[i2].name();
            }
            map.put(strName, enumConstants[i2]);
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector.findDefaultEnumValue(cls));
    }

    public static EnumResolver constructUnsafe(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructFor(cls, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingMethod(Class<?> cls, Method method, AnnotationIntrospector annotationIntrospector) {
        return constructUsingMethod(cls, method, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructUsingToString(cls, annotationIntrospector);
    }

    public static EnumResolver constructUsingMethod(Class<Enum<?>> cls, Method method, AnnotationIntrospector annotationIntrospector) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap map = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            try {
                Object objInvoke = method.invoke(r3, new Object[0]);
                if (objInvoke != null) {
                    map.put(objInvoke.toString(), r3);
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r3 + ": " + e2.getMessage());
            }
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null);
    }

    public static EnumResolver constructUsingToString(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap map = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            map.put(r3.toString(), r3);
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector == null ? null : annotationIntrospector.findDefaultEnumValue(cls));
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        return this._enumsById.get(str);
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }
}
