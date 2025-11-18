package com.fasterxml.jackson.databind.deser.std;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p176io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    static final class DelegatingKD extends KeyDeserializer implements Serializable {
        protected final JsonDeserializer<?> _delegate;
        protected final Class<?> _keyClass;

        protected DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBuffer = new TokenBuffer(deserializationContext.getParser(), deserializationContext);
            tokenBuffer.writeString(str);
            try {
                JsonParser jsonParserAsParser = tokenBuffer.asParser();
                jsonParserAsParser.nextToken();
                Object objDeserialize = this._delegate.deserialize(jsonParserAsParser, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e2) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e2.getMessage());
            }
        }
    }

    @JacksonStdImpl
    static final class EnumKD extends StdKeyDeserializer {
        protected final EnumResolver _byNameResolver;
        protected EnumResolver _byToStringResolver;
        protected final AnnotatedMethod _factory;

        protected EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
        }

        private EnumResolver _getToStringResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolverConstructUnsafeUsingToString = this._byToStringResolver;
            if (enumResolverConstructUnsafeUsingToString == null) {
                synchronized (this) {
                    enumResolverConstructUnsafeUsingToString = EnumResolver.constructUnsafeUsingToString(this._byNameResolver.getEnumClass(), deserializationContext.getAnnotationIntrospector());
                }
            }
            return enumResolverConstructUnsafeUsingToString;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e2) {
                    ClassUtil.unwrapAndThrowAsIAE(e2);
                }
            }
            EnumResolver enumResolver_getToStringResolver = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringResolver(deserializationContext) : this._byNameResolver;
            Enum<?> enumFindEnum = enumResolver_getToStringResolver.findEnum(str);
            return (enumFindEnum != null || deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) ? enumFindEnum : deserializationContext.handleWeirdKey(this._keyClass, str, "not one of values excepted for Enum class: %s", enumResolver_getToStringResolver.getEnumIds());
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(str);
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke(null, str);
        }
    }

    @JacksonStdImpl
    static final class StringKD extends StdKeyDeserializer {
        private static final StringKD sString = new StringKD(String.class);
        private static final StringKD sObject = new StringKD(Object.class);

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            return cls == String.class ? sString : cls == Object.class ? sObject : new StringKD(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    protected StdKeyDeserializer(int i2, Class<?> cls) {
        this(i2, cls, null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i2;
        if (cls == String.class || cls == Object.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i2 = 12;
        } else if (cls == Integer.class) {
            i2 = 5;
        } else if (cls == Long.class) {
            i2 = 6;
        } else if (cls == Date.class) {
            i2 = 10;
        } else if (cls == Calendar.class) {
            i2 = 11;
        } else if (cls == Boolean.class) {
            i2 = 1;
        } else if (cls == Byte.class) {
            i2 = 2;
        } else if (cls == Character.class) {
            i2 = 4;
        } else if (cls == Short.class) {
            i2 = 3;
        } else if (cls == Float.class) {
            i2 = 7;
        } else if (cls == Double.class) {
            i2 = 8;
        } else if (cls == URI.class) {
            i2 = 13;
        } else if (cls == URL.class) {
            i2 = 14;
        } else {
            if (cls != Class.class) {
                if (cls == Locale.class) {
                    return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
                }
                if (cls == Currency.class) {
                    return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
                }
                return null;
            }
            i2 = 15;
        }
        return new StdKeyDeserializer(i2, cls);
    }

    protected Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : AdultContentAnalytics.UNLOCK.equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i_parseInt = _parseInt(str);
                return (i_parseInt < -128 || i_parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value can not be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i_parseInt);
            case 3:
                int i_parseInt2 = _parseInt(str);
                return (i_parseInt2 < -32768 || i_parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value can not be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i_parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IOException unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as locale", new Object[0]);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                Date date = deserializationContext.parseDate(str);
                if (date == null) {
                    return null;
                }
                return deserializationContext.constructCalendar(date);
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e2.getMessage());
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e3.getMessage());
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e4.getMessage());
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused2) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IOException unused3) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as currency", new Object[0]);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    protected double _parseDouble(String str) throws IllegalArgumentException {
        return NumberInput.parseDouble(str);
    }

    protected int _parseInt(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    protected long _parseLong(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, deserializationContext);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (this._keyClass.isEnum() && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e2) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e2.getClass().getName(), e2.getMessage());
        }
    }

    protected StdKeyDeserializer(int i2, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i2;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
