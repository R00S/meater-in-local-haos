package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    protected SettableAnyProperty _anySetter;
    protected JsonDeserializer<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    private final transient Annotations _classAnnotations;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ClassKey, JsonDeserializer<Object>> _subDeserializers;
    protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializerBase$1 */
    static /* synthetic */ class C59641 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected BeanDeserializerBase(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(beanDescription.getType());
        this._classAnnotations = beanDescription.getClassInfo().getAnnotations();
        this._beanType = beanDescription.getType();
        ValueInstantiator valueInstantiator = beanDeserializerBuilder.getValueInstantiator();
        this._valueInstantiator = valueInstantiator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBuilder.getAnySetter();
        List<ValueInjector> injectables = beanDeserializerBuilder.getInjectables();
        ValueInjector[] valueInjectorArr = (injectables == null || injectables.isEmpty()) ? null : (ValueInjector[]) injectables.toArray(new ValueInjector[injectables.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        this._objectIdReader = objectIdReader;
        boolean z3 = false;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || valueInstantiator.canCreateUsingDelegate() || valueInstantiator.canCreateUsingArrayDelegate() || valueInstantiator.canCreateFromObjectWith() || !valueInstantiator.canCreateUsingDefault();
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        this._serializationShape = valueFindExpectedFormat != null ? valueFindExpectedFormat.getShape() : null;
        this._needViewProcesing = z2;
        if (!this._nonStandardCreation && valueInjectorArr == null && !z2 && objectIdReader == null) {
            z3 = true;
        }
        this._vanillaProcessing = z3;
    }

    private final JsonDeserializer<Object> _delegateDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer == null ? this._arrayDelegateDeserializer : jsonDeserializer;
    }

    private JsonDeserializer<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, null, this._classAnnotations, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        JsonDeserializer<Object> jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, javaType, std);
        return typeDeserializerFindTypeDeserializer != null ? new TypeWrappedDeserializer(typeDeserializerFindTypeDeserializer.forProperty(std), jsonDeserializerFindDeserializer) : jsonDeserializerFindDeserializer;
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z && (th instanceof RuntimeException)) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    protected Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        if (obj instanceof String) {
            tokenBuffer.writeString((String) obj);
        } else if (obj instanceof Long) {
            tokenBuffer.writeNumber(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            tokenBuffer.writeNumber(((Integer) obj).intValue());
        } else {
            tokenBuffer.writeObject(obj);
        }
        JsonParser jsonParserAsParser = tokenBuffer.asParser();
        jsonParserAsParser.nextToken();
        return jsonDeserializer.deserialize(jsonParserAsParser, deserializationContext);
    }

    protected abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    protected JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this) {
            HashMap<ClassKey, JsonDeserializer<Object>> map = this._subDeserializers;
            jsonDeserializer = map == null ? null : map.get(new ClassKey(obj.getClass()));
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (jsonDeserializerFindRootValueDeserializer != null) {
            synchronized (this) {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), jsonDeserializerFindRootValueDeserializer);
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        JsonDeserializer<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).bindItem(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws SecurityException {
        Class<?> rawClass;
        Class<?> outerClass;
        JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (outerClass = ClassUtil.getOuterClass((rawClass = settableBeanProperty.getType().getRawClass()))) != null && outerClass == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == outerClass) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyFindBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (settableBeanPropertyFindBackReference == null) {
            throw new IllegalArgumentException("Can not handle managed/back reference '" + managedReferenceName + "': no back reference property found from type " + settableBeanProperty.getType());
        }
        JavaType javaType = this._beanType;
        JavaType type = settableBeanPropertyFindBackReference.getType();
        boolean zIsContainerType = settableBeanProperty.getType().isContainerType();
        if (type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, settableBeanPropertyFindBackReference, this._classAnnotations, zIsContainerType);
        }
        throw new IllegalArgumentException("Can not handle managed/back reference '" + managedReferenceName + "': back reference type (" + type.getRawClass().getName() + ") not compatible with managed type (" + javaType.getRawClass().getName() + ")");
    }

    protected SettableBeanProperty _resolveUnwrappedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        NameTransformer nameTransformerFindUnwrappingNameTransformer;
        JsonDeserializer<Object> valueDeserializer;
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (nameTransformerFindUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null || (jsonDeserializerUnwrappingDeserializer = (valueDeserializer = settableBeanProperty.getValueDeserializer()).unwrappingDeserializer(nameTransformerFindUnwrappingNameTransformer)) == valueDeserializer || jsonDeserializerUnwrappingDeserializer == null) {
            return null;
        }
        return settableBeanProperty.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
    }

    protected SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = settableBeanProperty.getObjectIdInfo();
        return (objectIdInfo == null && settableBeanProperty.getValueDeserializer().getObjectIdReader() == null) ? settableBeanProperty : new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    protected abstract BeanDeserializerBase asArrayDeserializer();

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap beanPropertyMapWithCaseInsensitivity;
        JsonIgnoreProperties.Value valueFindPropertyIgnorals;
        ObjectIdInfo objectIdInfoFindObjectIdInfo;
        JavaType type;
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        ObjectIdReader objectIdReaderConstruct = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        if (member != null && annotationIntrospector != null && (objectIdInfoFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            ObjectIdInfo objectIdInfoFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, objectIdInfoFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfoFindObjectReferenceInfo.getGeneratorType();
            ObjectIdResolver objectIdResolverObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, objectIdInfoFindObjectReferenceInfo);
            if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyName = objectIdInfoFindObjectReferenceInfo.getPropertyName();
                SettableBeanProperty settableBeanPropertyFindProperty = findProperty(propertyName);
                if (settableBeanPropertyFindProperty == null) {
                    throw new IllegalArgumentException("Invalid Object Id definition for " + handledType().getName() + ": can not find property with name '" + propertyName + "'");
                }
                type = settableBeanPropertyFindProperty.getType();
                settableBeanProperty = settableBeanPropertyFindProperty;
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(objectIdInfoFindObjectReferenceInfo.getScope());
            } else {
                type = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) generatorType), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, objectIdInfoFindObjectReferenceInfo);
            }
            JavaType javaType = type;
            objectIdReaderConstruct = ObjectIdReader.construct(javaType, objectIdInfoFindObjectReferenceInfo.getPropertyName(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverObjectIdResolverInstance);
        }
        BeanDeserializerBase beanDeserializerBaseWithObjectIdReader = (objectIdReaderConstruct == null || objectIdReaderConstruct == this._objectIdReader) ? this : withObjectIdReader(objectIdReaderConstruct);
        if (member != null && (valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) != null) {
            Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnorals.findIgnoredForDeserialization();
            if (!setFindIgnoredForDeserialization.isEmpty()) {
                Set<String> set = beanDeserializerBaseWithObjectIdReader._ignorableProps;
                if (set != null && !set.isEmpty()) {
                    HashSet hashSet = new HashSet(setFindIgnoredForDeserialization);
                    hashSet.addAll(set);
                    setFindIgnoredForDeserialization = hashSet;
                }
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withIgnorableProperties(setFindIgnoredForDeserialization);
            }
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            shape = valueFindFormatOverrides.hasShape() ? valueFindFormatOverrides.getShape() : null;
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null && (beanPropertyMapWithCaseInsensitivity = (beanPropertyMap = this._beanProperties).withCaseInsensitivity(feature.booleanValue())) != beanPropertyMap) {
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withBeanProperties(beanPropertyMapWithCaseInsensitivity);
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanDeserializerBaseWithObjectIdReader.asArrayDeserializer() : beanDeserializerBaseWithObjectIdReader;
    }

    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return null;
            }
            return deserializationContext.handleUnexpectedToken(handledType(), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        if (jsonTokenNextToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return null;
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != jsonToken) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return objDeserialize;
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer == null || this._valueInstantiator.canCreateFromBoolean()) {
            return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.getCurrentToken() == JsonToken.VALUE_TRUE);
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType != JsonParser.NumberType.DOUBLE && numberType != JsonParser.NumberType.FLOAT) {
            JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
            return jsonDeserializer_delegateDeserializer != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext)) : deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer2 = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromDouble()) {
            return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.getDoubleValue());
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._objectIdReader != null ? deserializeFromObjectId(jsonParser, deserializationContext) : jsonParser.getEmbeddedObject();
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        int i2 = C59641.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
        if (i2 == 1) {
            if (jsonDeserializer_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.getIntValue());
            }
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (i2 != 2) {
            if (jsonDeserializer_delegateDeserializer == null) {
                return deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
            }
            Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate2);
            }
            return objCreateUsingDelegate2;
        }
        if (jsonDeserializer_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
            return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.getLongValue());
        }
        Object objCreateUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate3);
        }
        return objCreateUsingDelegate3;
    }

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    protected Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        ReadableObjectId readableObjectIdFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objResolve = readableObjectIdFindObjectId.resolve();
        if (objResolve != null) {
            return objResolve;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] (for " + this._beanType + ").", jsonParser.getCurrentLocation(), readableObjectIdFindObjectId);
    }

    protected Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        return jsonDeserializer_delegateDeserializer != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext)) : this._propertyBasedCreator != null ? _deserializeUsingPropertyBased(jsonParser, deserializationContext) : this._beanType.isAbstract() ? deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]) : deserializationContext.handleMissingInstantiator(this._beanType.getRawClass(), jsonParser, "no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enable type information?)", new Object[0]);
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            return this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    protected Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object objectId;
        if (this._objectIdReader != null) {
            if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext), objectId);
            }
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null) {
                if (currentToken.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (currentToken == JsonToken.START_OBJECT) {
                    currentToken = jsonParser.nextToken();
                }
                if (currentToken == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    protected JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object objFindDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        Converter<Object, Object> converterConverterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), objFindDeserializationConverter);
        JavaType inputType = converterConverterInstance.getInputType(deserializationContext.getTypeFactory());
        return new StdDelegatingDeserializer(converterConverterInstance, inputType, deserializationContext.findContextualValueDeserializer(inputType, settableBeanProperty));
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    protected void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.skipChildren();
    }

    protected Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, tokenBuffer);
        if (jsonDeserializer_findSubclassDeserializer == null) {
            if (tokenBuffer != null) {
                obj = handleUnknownProperties(deserializationContext, obj, tokenBuffer);
            }
            return jsonParser != null ? deserialize(jsonParser, deserializationContext, obj) : obj;
        }
        if (tokenBuffer != null) {
            tokenBuffer.writeEndObject();
            JsonParser jsonParserAsParser = tokenBuffer.asParser();
            jsonParserAsParser.nextToken();
            obj = jsonDeserializer_findSubclassDeserializer.deserialize(jsonParserAsParser, deserializationContext, obj);
        }
        return jsonParser != null ? jsonDeserializer_findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
    }

    protected Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        tokenBuffer.writeEndObject();
        JsonParser jsonParserAsParser = tokenBuffer.asParser();
        while (jsonParserAsParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParserAsParser.getCurrentName();
            jsonParserAsParser.nextToken();
            handleUnknownProperty(jsonParserAsParser, deserializationContext, obj, currentName);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    protected void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.skipChildren();
            return;
        }
        Set<String> set = this._ignorableProps;
        if (set != null && set.contains(str)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    protected void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Set<String> set = this._ignorableProps;
        if (set != null && set.contains(str)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty == null) {
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        try {
            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
        } catch (Exception e2) {
            wrapAndThrow(e2, obj, str, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    protected void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector valueInjector : this._injectables) {
            valueInjector.inject(deserializationContext, obj);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws SecurityException, JsonMappingException {
        boolean z;
        SettableBeanProperty settableBeanPropertyWithValueDeserializer;
        ExternalTypeHandler.Builder builder = null;
        SettableBeanProperty[] fromObjectArguments = this._valueInstantiator.canCreateFromObjectWith() ? this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()) : null;
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        UnwrappedPropertyHandler unwrappedPropertyHandler = null;
        while (true) {
            z = false;
            int i2 = 0;
            z = false;
            if (!it.hasNext()) {
                break;
            }
            SettableBeanProperty next = it.next();
            if (next.hasValueDeserializer()) {
                JsonDeserializer<?> valueDeserializer = next.getValueDeserializer();
                JsonDeserializer<?> jsonDeserializerHandlePrimaryContextualization = deserializationContext.handlePrimaryContextualization(valueDeserializer, next, next.getType());
                settableBeanPropertyWithValueDeserializer = jsonDeserializerHandlePrimaryContextualization != valueDeserializer ? next.withValueDeserializer(jsonDeserializerHandlePrimaryContextualization) : next;
            } else {
                JsonDeserializer<?> jsonDeserializerFindConvertingDeserializer = findConvertingDeserializer(deserializationContext, next);
                if (jsonDeserializerFindConvertingDeserializer == null) {
                    jsonDeserializerFindConvertingDeserializer = findDeserializer(deserializationContext, next.getType(), next);
                }
                settableBeanPropertyWithValueDeserializer = next.withValueDeserializer(jsonDeserializerFindConvertingDeserializer);
            }
            SettableBeanProperty settableBeanProperty_resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanPropertyWithValueDeserializer);
            if (!(settableBeanProperty_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                settableBeanProperty_resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            }
            SettableBeanProperty settableBeanProperty_resolveUnwrappedProperty = _resolveUnwrappedProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            if (settableBeanProperty_resolveUnwrappedProperty != null) {
                if (unwrappedPropertyHandler == null) {
                    unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                }
                unwrappedPropertyHandler.addProperty(settableBeanProperty_resolveUnwrappedProperty);
                this._beanProperties.remove(settableBeanProperty_resolveUnwrappedProperty);
            } else {
                SettableBeanProperty settableBeanProperty_resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
                if (settableBeanProperty_resolveInnerClassValuedProperty != next) {
                    this._beanProperties.replace(settableBeanProperty_resolveInnerClassValuedProperty);
                    if (fromObjectArguments != null) {
                        int length = fromObjectArguments.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (fromObjectArguments[i2] == next) {
                                fromObjectArguments[i2] = settableBeanProperty_resolveInnerClassValuedProperty;
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (settableBeanProperty_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    TypeDeserializer valueTypeDeserializer = settableBeanProperty_resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.EnumC5961As.EXTERNAL_PROPERTY) {
                        if (builder == null) {
                            builder = new ExternalTypeHandler.Builder();
                        }
                        builder.addExternal(settableBeanProperty_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(settableBeanProperty_resolveInnerClassValuedProperty);
                    }
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._beanType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                throw new IllegalArgumentException("Invalid array-delegate-creator definition for " + this._beanType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'");
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (fromObjectArguments != null) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, fromObjectArguments);
        }
        if (builder != null) {
            this._externalTypeIdHandler = builder.build(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        if (unwrappedPropertyHandler != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract BeanDeserializerBase withIgnorableProperties(Set<String> set);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    protected Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (z || !(th instanceof RuntimeException)) {
            return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
        }
        throw ((RuntimeException) th);
    }

    public SettableBeanProperty findProperty(String str) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        return (settableBeanPropertyFind != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : propertyBasedCreator.findCreatorProperty(str);
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        UnwrappedPropertyHandler unwrappedPropertyHandlerRenameAll = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            unwrappedPropertyHandlerRenameAll = unwrappedPropertyHandlerRenameAll != null ? unwrappedPropertyHandlerRenameAll.renameAll(nameTransformer) : unwrappedPropertyHandlerRenameAll;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandlerRenameAll;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set);
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }
}
