package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class SerializerProvider extends DatabindContext {
    public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    protected final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected JsonSerializer<Object> _keySerializer;
    protected final ReadOnlyClassToSerializerMap _knownSerializers;
    protected JsonSerializer<Object> _nullKeySerializer;
    protected JsonSerializer<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final SerializerCache _serializerCache;
    protected final SerializerFactory _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected JsonSerializer<Object> _unknownTypeSerializer;

    public SerializerProvider() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new SerializerCache();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    protected JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            JsonSerializer<Object> jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
            if (jsonSerializer_createUntypedSerializer != null) {
                this._serializerCache.addAndResolveNonTypedSerializer(cls, javaTypeConstructType, jsonSerializer_createUntypedSerializer, this);
            }
            return jsonSerializer_createUntypedSerializer;
        } catch (IllegalArgumentException e2) {
            reportMappingProblem(e2, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    protected JsonSerializer<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerCreateSerializer;
        synchronized (this._serializerCache) {
            jsonSerializerCreateSerializer = this._serializerFactory.createSerializer(this, javaType);
        }
        return jsonSerializerCreateSerializer;
    }

    protected final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    protected String _desc(Object obj) {
        if (obj == null) {
            return "N/A";
        }
        return "'" + obj + "'";
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return handleSecondaryContextualization(jsonSerializer, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JsonSerializer<Object> _handleResolvable(JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return jsonSerializer;
    }

    protected String _quotedString(Object obj) {
        return obj == null ? "N/A" : String.valueOf(obj);
    }

    protected void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && ClassUtil.wrapperType(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportMappingProblem("Incompatible types: declared root type (%s) vs %s", javaType, obj.getClass().getName());
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public void defaultSerializeDateKey(long j2, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(j2));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(new Date(j2)));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(date.getTime());
        } else {
            jsonGenerator.writeString(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public JsonSerializer<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this._config, javaType, this._keySerializer), beanProperty);
    }

    public JsonSerializer<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        return (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType)) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handlePrimaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerTypedValueSerializer = this._knownSerializers.typedValueSerializer(cls);
        if (jsonSerializerTypedValueSerializer != null) {
            return jsonSerializerTypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerTypedValueSerializer2 = this._serializerCache.typedValueSerializer(cls);
        if (jsonSerializerTypedValueSerializer2 != null) {
            return jsonSerializerTypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(cls, beanProperty);
        SerializerFactory serializerFactory = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        TypeSerializer typeSerializerCreateTypeSerializer = serializerFactory.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new TypeWrappedSerializer(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(cls, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        return (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls))) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls)) == null) ? getUnknownTypeSerializer(cls) : handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public JsonSerializer<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion();
    }

    public final FilterProvider getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public abstract JsonGenerator getGenerator();

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handleSecondaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public JsonMappingException mappingException(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return JsonMappingException.from(getGenerator(), str);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw mappingException("Invalid definition for property %s (of type %s): %s", beanPropertyDefinition == null ? "N/A" : _quotedString(beanPropertyDefinition.getName()), beanDescription != null ? _desc(beanDescription.getType().getGenericSignature()) : "N/A", str);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws JsonMappingException {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw mappingException("Invalid type definition for type %s: %s", beanDescription == null ? "N/A" : _desc(beanDescription.getType().getGenericSignature()), str);
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public abstract JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public SerializerProvider setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final SerializationConfig getConfig() {
        return this._config;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw mappingException(th, str, objArr);
    }

    public JsonSerializer<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(date));
        }
    }

    protected JsonMappingException mappingException(Throwable th, String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return JsonMappingException.from(getGenerator(), str, th);
    }

    protected JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        try {
            JsonSerializer<Object> jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaType);
            if (jsonSerializer_createUntypedSerializer != null) {
                this._serializerCache.addAndResolveNonTypedSerializer(javaType, jsonSerializer_createUntypedSerializer, this);
            }
            return jsonSerializer_createUntypedSerializer;
        } catch (IllegalArgumentException e2) {
            reportMappingProblem(e2, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls))) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType)) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerTypedValueSerializer = this._knownSerializers.typedValueSerializer(javaType);
        if (jsonSerializerTypedValueSerializer != null) {
            return jsonSerializerTypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerTypedValueSerializer2 = this._serializerCache.typedValueSerializer(javaType);
        if (jsonSerializerTypedValueSerializer2 != null) {
            return jsonSerializerTypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(javaType, beanProperty);
        TypeSerializer typeSerializerCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new TypeWrappedSerializer(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(javaType, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    protected SerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        JsonSerializer<Object> jsonSerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = jsonSerializer;
        serializationConfig.getClass();
        this._serializerFactory = serializerFactory;
        this._config = serializationConfig;
        SerializerCache serializerCache = serializerProvider._serializerCache;
        this._serializerCache = serializerCache;
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        JsonSerializer<Object> jsonSerializer2 = serializerProvider._nullValueSerializer;
        this._nullValueSerializer = jsonSerializer2;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = jsonSerializer2 == jsonSerializer;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = serializerCache.getReadOnlyLookupMap();
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer != null) {
            return jsonSerializerUntypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer2 = this._serializerCache.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer2 != null) {
            return jsonSerializerUntypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer3 = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
        if (jsonSerializerUntypedValueSerializer3 != null) {
            return jsonSerializerUntypedValueSerializer3;
        }
        JsonSerializer<Object> jsonSerializer_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return jsonSerializer_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : jsonSerializer_createAndCacheUntypedSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer != null) {
            return jsonSerializerUntypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer2 = this._serializerCache.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer2 != null) {
            return jsonSerializerUntypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializer_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return jsonSerializer_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : jsonSerializer_createAndCacheUntypedSerializer;
    }
}
