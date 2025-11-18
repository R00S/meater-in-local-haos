package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class DeserializationContext extends DatabindContext implements Serializable {
    protected transient ArrayBuilders _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected LinkedNode<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient ObjectBuffer _objectBuffer;
    protected transient JsonParser _parser;
    protected final Class<?> _view;

    protected DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory == null) {
            throw new IllegalArgumentException("Can not pass null DeserializerFactory");
        }
        this._factory = deserializerFactory;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._config = null;
        this._view = null;
        this._attributes = null;
    }

    protected String _calcName(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        return _calcName(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    protected String _desc(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    protected String _quotedString(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() > 500) {
            return String.format("\"%s]...[%s\"", str.substring(0, 500), str.substring(str.length() - 500));
        }
        return "\"" + str + "\"";
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public final JavaType constructType(Class<?> cls) {
        return this._config.constructType(cls);
    }

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializerFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return jsonDeserializerFindValueDeserializer != null ? handleSecondaryContextualization(jsonDeserializerFindValueDeserializer, beanProperty, javaType) : jsonDeserializerFindValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) {
        if (this._injectableValues != null) {
            throw null;
        }
        throw new IllegalStateException("No 'injectableValues' configured, can not inject value with id [" + obj + "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer keyDeserializerFindKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return keyDeserializerFindKeyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) keyDeserializerFindKeyDeserializer).createContextual(this, beanProperty) : keyDeserializerFindKeyDeserializer;
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializerFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (jsonDeserializerFindValueDeserializer == null) {
            return null;
        }
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization = handleSecondaryContextualization(jsonDeserializerFindValueDeserializer, null, javaType);
        TypeDeserializer typeDeserializerFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return typeDeserializerFindTypeDeserializer != null ? new TypeWrappedDeserializer(typeDeserializerFindTypeDeserializer.forProperty(null), jsonDeserializerHandleSecondaryContextualization) : jsonDeserializerHandleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    protected DateFormat getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleInstantiationProblem = problemHandlers.value().handleInstantiationProblem(this, cls, obj, th);
            if (objHandleInstantiationProblem != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleInstantiationProblem == null || cls.isInstance(objHandleInstantiationProblem)) {
                    return objHandleInstantiationProblem;
                }
                throw instantiationException(cls, String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", cls, objHandleInstantiationProblem.getClass()));
            }
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleMissingInstantiator = problemHandlers.value().handleMissingInstantiator(this, cls, jsonParser, str);
            if (objHandleMissingInstantiator != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleMissingInstantiator == null || cls.isInstance(objHandleMissingInstantiator)) {
                    return objHandleMissingInstantiator;
                }
                throw instantiationException(cls, String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", cls, objHandleMissingInstantiator.getClass()));
            }
        }
        throw instantiationException(cls, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = jsonDeserializer instanceof ContextualDeserializer;
        JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                JsonDeserializer<?> jsonDeserializerCreateContextual = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = jsonDeserializer instanceof ContextualDeserializer;
        JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                JsonDeserializer<?> jsonDeserializerCreateContextual = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer2;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(cls, jsonParser.getCurrentToken(), jsonParser, null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) throws IOException {
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            if (problemHandlers.value().handleUnknownProperty(this, jsonParser, jsonDeserializer, obj, str)) {
                return true;
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, jsonDeserializer == null ? null : jsonDeserializer.getKnownPropertyNames());
        }
        jsonParser.skipChildren();
        return true;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) throws IOException {
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            JavaType javaTypeHandleUnknownTypeId = problemHandlers.value().handleUnknownTypeId(this, javaType, str, typeIdResolver, str2);
            if (javaTypeHandleUnknownTypeId != null) {
                if (javaTypeHandleUnknownTypeId.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeHandleUnknownTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeHandleUnknownTypeId;
                }
                throw unknownTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + javaTypeHandleUnknownTypeId);
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw unknownTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdKey = problemHandlers.value().handleWeirdKey(this, cls, str, str2);
            if (objHandleWeirdKey != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleWeirdKey == null || cls.isInstance(objHandleWeirdKey)) {
                    return objHandleWeirdKey;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", cls, objHandleWeirdKey.getClass()));
            }
        }
        throw weirdKeyException(cls, str, str2);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdNumberValue = problemHandlers.value().handleWeirdNumberValue(this, cls, number, str);
            if (objHandleWeirdNumberValue != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleWeirdNumberValue == null || cls.isInstance(objHandleWeirdNumberValue)) {
                    return objHandleWeirdNumberValue;
                }
                throw weirdNumberException(number, cls, String.format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", cls, objHandleWeirdNumberValue.getClass()));
            }
        }
        throw weirdNumberException(number, cls, str);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdStringValue = problemHandlers.value().handleWeirdStringValue(this, cls, str, str2);
            if (objHandleWeirdStringValue != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleWeirdStringValue == null || cls.isInstance(objHandleWeirdStringValue)) {
                    return objHandleWeirdStringValue;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", cls, objHandleWeirdStringValue.getClass()));
            }
        }
        throw weirdStringException(str, cls, str2);
    }

    public final boolean hasSomeOfFeatures(int i2) {
        return (i2 & this._featureFlags) != 0;
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        return JsonMappingException.from(this._parser, String.format("Can not construct instance of %s, problem: %s", cls.getName(), th.getMessage()), th);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e2) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, e2.getMessage()));
        }
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw mappingException("Invalid definition for property %s (of type %s): %s", beanPropertyDefinition == null ? "N/A" : _quotedString(beanPropertyDefinition.getName()), beanDescription != null ? _desc(beanDescription.getType().getGenericSignature()) : "N/A", str);
    }

    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw JsonMappingException.from(getParser(), str);
    }

    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        if (str == null) {
            str = "No content to map due to end-of-input";
        } else if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw JsonMappingException.from(getParser(), str);
    }

    public void reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), String.format("No Object Id found for an instance of %s, to assign to property '%s'", obj.getClass().getName(), objectIdReader.propertyName));
    }

    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        if (str != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw wrongTokenException(jsonParser, jsonToken, str);
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    public JsonMappingException unknownTypeIdException(JavaType javaType, String str, String str2) {
        String str3 = String.format("Could not resolve type id '%s' into a subtype of %s", str, javaType);
        if (str2 != null) {
            str3 = str3 + ": " + str2;
        }
        return InvalidTypeIdException.from(this._parser, str3, javaType, str);
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Can not deserialize Map key of type %s from String %s: %s", cls.getName(), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Can not deserialize value of type %s from number %s: %s", cls.getName(), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Can not deserialize value of type %s from String %s: %s", cls.getName(), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        String str2 = String.format("Unexpected token (%s), expected %s", jsonParser.getCurrentToken(), jsonToken);
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return JsonMappingException.from(jsonParser, str2);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleUnexpectedToken = problemHandlers.value().handleUnexpectedToken(this, cls, jsonToken, jsonParser, str);
            if (objHandleUnexpectedToken != DeserializationProblemHandler.NOT_HANDLED) {
                if (objHandleUnexpectedToken == null || cls.isInstance(objHandleUnexpectedToken)) {
                    return objHandleUnexpectedToken;
                }
                reportMappingException("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", cls, objHandleUnexpectedToken.getClass());
            }
        }
        if (str == null) {
            str = jsonToken == null ? String.format("Unexpected end-of-input when binding data into %s", _calcName(cls)) : String.format("Can not deserialize instance of %s out of %s token", _calcName(cls), jsonToken);
        }
        reportMappingException(str, new Object[0]);
        return null;
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return JsonMappingException.from(this._parser, String.format("Can not construct instance of %s: %s", cls.getName(), str));
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public JsonMappingException mappingException(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return JsonMappingException.from(getParser(), str);
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._attributes = deserializationConfig.getAttributes();
    }
}
