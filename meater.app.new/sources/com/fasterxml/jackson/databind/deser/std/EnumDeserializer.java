package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> {
    private final Enum<?> _enumDefaultValue;
    protected Object[] _enumsByIndex;
    protected final CompactStringObjectMap _lookupByName;
    protected CompactStringObjectMap _lookupByToString;

    public EnumDeserializer(EnumResolver enumResolver) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
    }

    private final Object _deserializeAltString(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws NumberFormatException, IOException {
        String strTrim = str.trim();
        if (strTrim.length() != 0) {
            char cCharAt = strTrim.charAt(0);
            if (cCharAt >= '0' && cCharAt <= '9') {
                try {
                    int i2 = Integer.parseInt(strTrim);
                    if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                        return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i2), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
                    }
                    if (i2 >= 0) {
                        Object[] objArr = this._enumsByIndex;
                        if (i2 < objArr.length) {
                            return objArr[i2];
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "value not one of declared Enum instance names: %s", compactStringObjectMap.keys());
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    protected Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS) || !jsonParser.isExpectedStartArrayToken()) {
            return deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
        }
        jsonParser.nextToken();
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return objDeserialize;
    }

    protected Class<?> _enumClass() {
        return handledType();
    }

    protected CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMapConstructLookup = this._lookupByToString;
        if (compactStringObjectMapConstructLookup == null) {
            synchronized (this) {
                compactStringObjectMapConstructLookup = EnumResolver.constructUnsafeUsingToString(_enumClass(), deserializationContext.getAnnotationIntrospector()).constructLookup();
            }
            this._lookupByToString = compactStringObjectMapConstructLookup;
        }
        return compactStringObjectMapConstructLookup;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING || currentToken == JsonToken.FIELD_NAME) {
            CompactStringObjectMap compactStringObjectMap_getToStringLookup = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
            String text = jsonParser.getText();
            Object objFind = compactStringObjectMap_getToStringLookup.find(text);
            return objFind == null ? _deserializeAltString(jsonParser, deserializationContext, compactStringObjectMap_getToStringLookup, text) : objFind;
        }
        if (currentToken != JsonToken.VALUE_NUMBER_INT) {
            return _deserializeOther(jsonParser, deserializationContext);
        }
        int intValue = jsonParser.getIntValue();
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
            return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(intValue), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
        }
        if (intValue >= 0) {
            Object[] objArr = this._enumsByIndex;
            if (intValue < objArr.length) {
                return objArr[intValue];
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(intValue), "index value outside legal index range [0..%s]", Integer.valueOf(this._enumsByIndex.length - 1));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
