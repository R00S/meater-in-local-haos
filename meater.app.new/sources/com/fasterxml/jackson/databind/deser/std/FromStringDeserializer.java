package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        protected final int _kind;

        protected Std(Class<?> cls, int i2) {
            super(cls);
            this._kind = i2;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        protected Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e2) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ClassUtil.getRootCause(e2));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int i_firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
                    if (i_firstHyphenOrUnderscore < 0) {
                        return new Locale(str);
                    }
                    String strSubstring = str.substring(0, i_firstHyphenOrUnderscore);
                    String strSubstring2 = str.substring(i_firstHyphenOrUnderscore + 1);
                    int i_firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(strSubstring2);
                    return i_firstHyphenOrUnderscore2 < 0 ? new Locale(strSubstring, strSubstring2) : new Locale(strSubstring, strSubstring2.substring(0, i_firstHyphenOrUnderscore2), strSubstring2.substring(i_firstHyphenOrUnderscore2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int iLastIndexOf = str.lastIndexOf(93);
                        if (iLastIndexOf == -1) {
                            throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                        }
                        int iIndexOf = str.indexOf(58, iLastIndexOf);
                        return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf > -1 ? Integer.parseInt(str.substring(iIndexOf + 1)) : 0);
                    }
                    int iIndexOf2 = str.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        int i2 = iIndexOf2 + 1;
                        if (str.indexOf(58, i2) < 0) {
                            return new InetSocketAddress(str.substring(0, iIndexOf2), Integer.parseInt(str.substring(i2)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        protected Object _deserializeFromEmptyString() throws IOException {
            int i2 = this._kind;
            return i2 == 3 ? URI.create(HttpUrl.FRAGMENT_ENCODE_SET) : i2 == 8 ? Locale.ROOT : super._deserializeFromEmptyString();
        }

        protected int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '_' || cCharAt == '-') {
                    return i2;
                }
            }
            return -1;
        }
    }

    protected FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static Std findDeserializer(Class<?> cls) {
        int i2;
        if (cls == File.class) {
            i2 = 1;
        } else if (cls == URL.class) {
            i2 = 2;
        } else if (cls == URI.class) {
            i2 = 3;
        } else if (cls == Class.class) {
            i2 = 4;
        } else if (cls == JavaType.class) {
            i2 = 5;
        } else if (cls == Currency.class) {
            i2 = 6;
        } else if (cls == Pattern.class) {
            i2 = 7;
        } else if (cls == Locale.class) {
            i2 = 8;
        } else if (cls == Charset.class) {
            i2 = 9;
        } else if (cls == TimeZone.class) {
            i2 = 10;
        } else if (cls == InetAddress.class) {
            i2 = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                return null;
            }
            i2 = 12;
        }
        return new Std(cls, i2);
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class};
    }

    protected abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    protected T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportMappingException("Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    protected T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String message;
        String valueAsString = jsonParser.getValueAsString();
        Exception e2 = null;
        if (valueAsString == null) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.nextToken();
                T tDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return tDeserialize;
            }
            if (currentToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
                return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            T t = (T) jsonParser.getEmbeddedObject();
            if (t == null) {
                return null;
            }
            return this._valueClass.isAssignableFrom(t.getClass()) ? t : _deserializeEmbedded(t, deserializationContext);
        }
        if (valueAsString.length() != 0) {
            String strTrim = valueAsString.trim();
            if (strTrim.length() != 0) {
                try {
                    T t_deserialize = _deserialize(strTrim, deserializationContext);
                    if (t_deserialize != null) {
                        return t_deserialize;
                    }
                } catch (IllegalArgumentException e3) {
                    e2 = e3;
                } catch (MalformedURLException e4) {
                    e2 = e4;
                }
                String str = "not a valid textual representation";
                if (e2 != null && (message = e2.getMessage()) != null) {
                    str = "not a valid textual representation, problem: " + message;
                }
                JsonMappingException jsonMappingExceptionWeirdStringException = deserializationContext.weirdStringException(strTrim, this._valueClass, str);
                if (e2 == null) {
                    throw jsonMappingExceptionWeirdStringException;
                }
                jsonMappingExceptionWeirdStringException.initCause(e2);
                throw jsonMappingExceptionWeirdStringException;
            }
        }
        return _deserializeFromEmptyString();
    }
}
