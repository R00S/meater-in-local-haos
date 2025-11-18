package com.fasterxml.jackson.databind.deser.std;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p176io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable {
    protected static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();
    protected final Class<?> _valueClass;

    protected StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
    }

    protected static final double parseDouble(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    protected Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? jsonParser.getBigIntegerValue() : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? Long.valueOf(jsonParser.getLongValue()) : jsonParser.getBigIntegerValue();
    }

    protected T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    return null;
                }
                return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        } else if (currentToken == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
            return null;
        }
        return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    protected void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.reportMappingException("Can not coerce a floating-point value ('%s') into %s; enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow", jsonParser.getValueAsString(), str);
    }

    protected boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    protected final boolean _isIntNumber(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        for (int i2 = (cCharAt == '-' || cCharAt == '+') ? 1 : 0; i2 < length; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
        }
        return true;
    }

    protected final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    protected final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    protected final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    protected final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return Boolean.valueOf(_parseBooleanFromInt(jsonParser, deserializationContext));
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return (Boolean) getNullValue(deserializationContext);
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String strTrim = jsonParser.getText().trim();
            return ("true".equals(strTrim) || "True".equals(strTrim)) ? Boolean.TRUE : (AdultContentAnalytics.UNLOCK.equals(strTrim) || "False".equals(strTrim)) ? Boolean.FALSE : strTrim.length() == 0 ? (Boolean) getEmptyValue(deserializationContext) : _hasTextualNull(strTrim) ? (Boolean) getNullValue(deserializationContext) : (Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        jsonParser.nextToken();
        Boolean bool_parseBoolean = _parseBoolean(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return bool_parseBoolean;
    }

    protected boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return !"0".equals(jsonParser.getText());
    }

    protected final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Boolean bool;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE || currentToken == JsonToken.VALUE_NULL) {
            return false;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return _parseBooleanFromInt(jsonParser, deserializationContext);
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).booleanValue();
            }
            jsonParser.nextToken();
            boolean z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return z_parseBooleanPrimitive;
        }
        String strTrim = jsonParser.getText().trim();
        if ("true".equals(strTrim) || "True".equals(strTrim)) {
            return true;
        }
        if (AdultContentAnalytics.UNLOCK.equals(strTrim) || "False".equals(strTrim) || strTrim.length() == 0 || _hasTextualNull(strTrim) || (bool = (Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "only \"true\" or \"false\" recognized", new Object[0])) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return Byte.valueOf(jsonParser.getByteValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String strTrim = jsonParser.getText().trim();
            if (_hasTextualNull(strTrim)) {
                return (Byte) getNullValue(deserializationContext);
            }
            try {
                if (strTrim.length() == 0) {
                    return (Byte) getEmptyValue(deserializationContext);
                }
                int i2 = NumberInput.parseInt(strTrim);
                return (i2 < -128 || i2 > 255) ? (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value can not be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i2);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            }
        }
        if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                _failDoubleToIntCoercion(jsonParser, deserializationContext, "Byte");
            }
            return Byte.valueOf(jsonParser.getByteValue());
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return (Byte) getNullValue(deserializationContext);
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (Byte) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        jsonParser.nextToken();
        Byte b_parseByte = _parseByte(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return b_parseByte;
    }

    protected Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return new Date(jsonParser.getLongValue());
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return (Date) getNullValue(deserializationContext);
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            return _parseDate(jsonParser.getText().trim(), deserializationContext);
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        jsonParser.nextToken();
        Date date_parseDate = _parseDate(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return date_parseDate;
    }

    protected final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Double.valueOf(jsonParser.getDoubleValue());
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken == JsonToken.VALUE_NULL) {
                return (Double) getNullValue(deserializationContext);
            }
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (Double) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            Double d_parseDouble = _parseDouble(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return d_parseDouble;
        }
        String strTrim = jsonParser.getText().trim();
        if (strTrim.length() == 0) {
            return (Double) getEmptyValue(deserializationContext);
        }
        if (_hasTextualNull(strTrim)) {
            return (Double) getNullValue(deserializationContext);
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(strTrim)) {
                    return Double.valueOf(Double.NaN);
                }
            } else if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
        } else if (_isNegInf(strTrim)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        }
        try {
            return Double.valueOf(parseDouble(strTrim));
        } catch (IllegalArgumentException unused) {
            return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Double value", new Object[0]);
        }
    }

    protected final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getDoubleValue();
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken == JsonToken.VALUE_NULL) {
                return 0.0d;
            }
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).doubleValue();
            }
            jsonParser.nextToken();
            double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return d_parseDoublePrimitive;
        }
        String strTrim = jsonParser.getText().trim();
        if (strTrim.length() == 0 || _hasTextualNull(strTrim)) {
            return 0.0d;
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(strTrim)) {
                    return Double.NaN;
                }
            } else if (_isPosInf(strTrim)) {
                return Double.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(strTrim)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return parseDouble(strTrim);
        } catch (IllegalArgumentException unused) {
            Number number = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid double value", new Object[0]);
            if (number == null) {
                return 0.0d;
            }
            return number.doubleValue();
        }
    }

    protected final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Float.valueOf(jsonParser.getFloatValue());
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken == JsonToken.VALUE_NULL) {
                return (Float) getNullValue(deserializationContext);
            }
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (Float) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            Float f_parseFloat = _parseFloat(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return f_parseFloat;
        }
        String strTrim = jsonParser.getText().trim();
        if (strTrim.length() == 0) {
            return (Float) getEmptyValue(deserializationContext);
        }
        if (_hasTextualNull(strTrim)) {
            return (Float) getNullValue(deserializationContext);
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(strTrim)) {
                    return Float.valueOf(Float.NaN);
                }
            } else if (_isPosInf(strTrim)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
        } else if (_isNegInf(strTrim)) {
            return Float.valueOf(Float.NEGATIVE_INFINITY);
        }
        try {
            return Float.valueOf(Float.parseFloat(strTrim));
        } catch (IllegalArgumentException unused) {
            return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Float value", new Object[0]);
        }
    }

    protected final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getFloatValue();
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken == JsonToken.VALUE_NULL) {
                return 0.0f;
            }
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).floatValue();
            }
            jsonParser.nextToken();
            float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return f_parseFloatPrimitive;
        }
        String strTrim = jsonParser.getText().trim();
        if (strTrim.length() == 0 || _hasTextualNull(strTrim)) {
            return 0.0f;
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(strTrim)) {
                    return Float.NaN;
                }
            } else if (_isPosInf(strTrim)) {
                return Float.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(strTrim)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(strTrim);
        } catch (IllegalArgumentException unused) {
            Number number = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid float value", new Object[0]);
            if (number == null) {
                return 0.0f;
            }
            return number.floatValue();
        }
    }

    protected final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws NumberFormatException, IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.getIntValue();
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "int");
                }
                return jsonParser.getValueAsInt();
            }
            if (currentToken == JsonToken.VALUE_NULL) {
                return 0;
            }
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).intValue();
            }
            jsonParser.nextToken();
            int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return i_parseIntPrimitive;
        }
        String strTrim = jsonParser.getText().trim();
        if (_hasTextualNull(strTrim)) {
            return 0;
        }
        try {
            int length = strTrim.length();
            if (length <= 9) {
                if (length == 0) {
                    return 0;
                }
                return NumberInput.parseInt(strTrim);
            }
            long j2 = Long.parseLong(strTrim);
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                return (int) j2;
            }
            Number number = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "Overflow: numeric value (%s) out of range of int (%d -%d)", strTrim, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (number == null) {
                return 0;
            }
            return number.intValue();
        } catch (IllegalArgumentException unused) {
            Number number2 = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid int value", new Object[0]);
            if (number2 == null) {
                return 0;
            }
            return number2.intValue();
        }
    }

    protected final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, NumberFormatException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                return (Integer) getNullValue(deserializationContext);
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                try {
                    int length = strTrim.length();
                    if (_hasTextualNull(strTrim)) {
                        return (Integer) getNullValue(deserializationContext);
                    }
                    if (length <= 9) {
                        return length == 0 ? (Integer) getEmptyValue(deserializationContext) : Integer.valueOf(NumberInput.parseInt(strTrim));
                    }
                    long j2 = Long.parseLong(strTrim);
                    if (j2 >= -2147483648L && j2 <= 2147483647L) {
                        return Integer.valueOf((int) j2);
                    }
                    return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "Overflow: numeric value (" + strTrim + ") out of range of Integer (-2147483648 - 2147483647)", new Object[0]);
                } catch (IllegalArgumentException unused) {
                    return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Integer value", new Object[0]);
                }
            }
            if (currentTokenId == 7) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
            if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Integer");
                }
                return Integer.valueOf(jsonParser.getValueAsInt());
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            Integer num_parseInteger = _parseInteger(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return num_parseInteger;
        }
        return (Integer) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    protected final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                return (Long) getNullValue(deserializationContext);
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (strTrim.length() == 0) {
                    return (Long) getEmptyValue(deserializationContext);
                }
                if (_hasTextualNull(strTrim)) {
                    return (Long) getNullValue(deserializationContext);
                }
                try {
                    return Long.valueOf(NumberInput.parseLong(strTrim));
                } catch (IllegalArgumentException unused) {
                    return (Long) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Long value", new Object[0]);
                }
            }
            if (currentTokenId == 7) {
                return Long.valueOf(jsonParser.getLongValue());
            }
            if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Long");
                }
                return Long.valueOf(jsonParser.getValueAsLong());
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            Long l_parseLong = _parseLong(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return l_parseLong;
        }
        return (Long) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    protected final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                return 0L;
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (strTrim.length() == 0 || _hasTextualNull(strTrim)) {
                    return 0L;
                }
                try {
                    return NumberInput.parseLong(strTrim);
                } catch (IllegalArgumentException unused) {
                    Number number = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid long value", new Object[0]);
                    if (number == null) {
                        return 0L;
                    }
                    return number.longValue();
                }
            }
            if (currentTokenId == 7) {
                return jsonParser.getLongValue();
            }
            if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "long");
                }
                return jsonParser.getValueAsLong();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            long j_parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return j_parseLongPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).longValue();
    }

    protected Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return Short.valueOf(jsonParser.getShortValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String strTrim = jsonParser.getText().trim();
            try {
                if (strTrim.length() == 0) {
                    return (Short) getEmptyValue(deserializationContext);
                }
                if (_hasTextualNull(strTrim)) {
                    return (Short) getNullValue(deserializationContext);
                }
                int i2 = NumberInput.parseInt(strTrim);
                return (i2 < -32768 || i2 > 32767) ? (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value can not be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i2);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }
        if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                _failDoubleToIntCoercion(jsonParser, deserializationContext, "Short");
            }
            return Short.valueOf(jsonParser.getShortValue());
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return (Short) getNullValue(deserializationContext);
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (Short) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        jsonParser.nextToken();
        Short sh_parseShort = _parseShort(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return sh_parseShort;
    }

    protected final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws NumberFormatException, IOException {
        int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (i_parseIntPrimitive >= -32768 && i_parseIntPrimitive <= 32767) {
            return (short) i_parseIntPrimitive;
        }
        Number number = (Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(i_parseIntPrimitive), "overflow, value can not be represented as 16-bit value", new Object[0]);
        if (number == null) {
            return (short) 0;
        }
        return number.shortValue();
    }

    protected final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            return jsonParser.getText();
        }
        if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            String valueAsString = jsonParser.getValueAsString();
            return valueAsString != null ? valueAsString : (String) deserializationContext.handleUnexpectedToken(String.class, jsonParser);
        }
        jsonParser.nextToken();
        String str_parseString = _parseString(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return str_parseString;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    protected JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || beanProperty == null || (member = beanProperty.getMember()) == null || (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return jsonDeserializer;
        }
        Converter<Object, Object> converterConverterInstance = deserializationContext.converterInstance(beanProperty.getMember(), objFindDeserializationContentConverter);
        JavaType inputType = converterConverterInstance.getInputType(deserializationContext.getTypeFactory());
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
        }
        return new StdDelegatingDeserializer(converterConverterInstance, inputType, jsonDeserializer);
    }

    protected JsonDeserializer<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    protected Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    protected JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    protected void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException(jsonParser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single '%s' value but there was more than a single value in the array", handledType().getName());
    }

    protected void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.skipChildren();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._valueClass;
    }

    protected boolean isDefaultDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return ClassUtil.isJacksonStdImpl(jsonDeserializer);
    }

    protected boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return ClassUtil.isJacksonStdImpl(keyDeserializer);
    }

    protected StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? null : javaType.getRawClass();
    }

    protected Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (str.length() == 0) {
                return (Date) getEmptyValue(deserializationContext);
            }
            if (_hasTextualNull(str)) {
                return (Date) getNullValue(deserializationContext);
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e2) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", e2.getMessage());
        }
    }
}
