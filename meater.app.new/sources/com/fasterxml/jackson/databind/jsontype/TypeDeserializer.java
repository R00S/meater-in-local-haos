package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class TypeDeserializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeDeserializer$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C59801 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        return deserializeIfNatural(jsonParser, deserializationContext, javaType.getRawClass());
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract TypeDeserializer forProperty(BeanProperty beanProperty);

    public abstract Class<?> getDefaultImpl();

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract JsonTypeInfo.EnumC5961As getTypeInclusion();

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            return null;
        }
        int i2 = C59801.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5 && cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.FALSE;
                        }
                    } else if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return jsonParser.getText();
        }
        return null;
    }
}
