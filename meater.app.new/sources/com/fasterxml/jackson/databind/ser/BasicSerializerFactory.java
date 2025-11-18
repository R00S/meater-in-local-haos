package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1 */
    static /* synthetic */ class C59821 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> map = new HashMap<>();
        HashMap<String, JsonSerializer<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map2.put(StringBuffer.class.getName(), toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(map2);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.instance);
        map2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                map2.put(entry.getKey().getName(), (JsonSerializer) value);
            } else {
                if (!(value instanceof Class)) {
                    throw new IllegalStateException("Internal error: unrecognized value of type " + entry.getClass().getName());
                }
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    protected BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    protected JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object objFindContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (objFindContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindContentSerializer);
        }
        return null;
    }

    protected JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object objFindKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (objFindKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindKeySerializer);
        }
        return null;
    }

    protected JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ArrayType arrayType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyArraySerializer = null;
        while (it.hasNext() && (jsonSerializerModifyArraySerializer = it.next().findArraySerializer(config, arrayType, beanDescription, typeSerializer, jsonSerializer)) == null) {
        }
        if (jsonSerializerModifyArraySerializer == null) {
            Class<?> rawClass = arrayType.getRawClass();
            if (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                jsonSerializerModifyArraySerializer = String[].class == rawClass ? StringArraySerializer.instance : StdArraySerializers.findStandardImpl(rawClass);
            }
            if (jsonSerializerModifyArraySerializer == null) {
                jsonSerializerModifyArraySerializer = new ObjectArraySerializer(arrayType.getContentType(), z, typeSerializer, jsonSerializer);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyArraySerializer = it2.next().modifyArraySerializer(config, arrayType, beanDescription, jsonSerializerModifyArraySerializer);
            }
        }
        return jsonSerializerModifyArraySerializer;
    }

    protected JsonSerializer<?> buildCollectionSerializer(SerializerProvider serializerProvider, CollectionType collectionType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyCollectionSerializer = null;
        while (it.hasNext() && (jsonSerializerModifyCollectionSerializer = it.next().findCollectionSerializer(config, collectionType, beanDescription, typeSerializer, jsonSerializer)) == null) {
        }
        if (jsonSerializerModifyCollectionSerializer == null && (jsonSerializerModifyCollectionSerializer = findSerializerByAnnotations(serializerProvider, collectionType, beanDescription)) == null) {
            JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
            if (valueFindExpectedFormat != null && valueFindExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
                return null;
            }
            Class<?> rawClass = collectionType.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = collectionType.getContentType();
                jsonSerializerModifyCollectionSerializer = buildEnumSetSerializer(contentType.isEnumType() ? contentType : null);
            } else {
                Class<?> rawClass2 = collectionType.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 != String.class) {
                        jsonSerializerModifyCollectionSerializer = buildIndexedListSerializer(collectionType.getContentType(), z, typeSerializer, jsonSerializer);
                    } else if (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                        jsonSerializerModifyCollectionSerializer = IndexedStringListSerializer.instance;
                    }
                } else if (rawClass2 == String.class && (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer))) {
                    jsonSerializerModifyCollectionSerializer = StringCollectionSerializer.instance;
                }
                if (jsonSerializerModifyCollectionSerializer == null) {
                    jsonSerializerModifyCollectionSerializer = buildCollectionSerializer(collectionType.getContentType(), z, typeSerializer, jsonSerializer);
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyCollectionSerializer = it2.next().modifyCollectionSerializer(config, collectionType, beanDescription, jsonSerializerModifyCollectionSerializer);
            }
        }
        return jsonSerializerModifyCollectionSerializer;
    }

    protected JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        BeanDescription beanDescription2;
        BeanDescription beanDescription3 = beanDescription;
        SerializationConfig config = serializerProvider.getConfig();
        boolean z2 = (z || !javaType.useStaticType() || (javaType.isContainerType() && javaType.getContentType().getRawClass() == Object.class)) ? z : true;
        TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        boolean z3 = typeSerializerCreateTypeSerializer != null ? false : z2;
        JsonSerializer<Object> jsonSerializer_findContentSerializer = _findContentSerializer(serializerProvider, beanDescription.getClassInfo());
        JsonSerializer<?> jsonSerializerModifyCollectionLikeSerializer = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            JsonSerializer<Object> jsonSerializer_findKeySerializer = _findKeySerializer(serializerProvider, beanDescription.getClassInfo());
            if (mapLikeType.isTrueMapType()) {
                return buildMapSerializer(serializerProvider, (MapType) mapLikeType, beanDescription, z3, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            Iterator<Serializers> it = customSerializers().iterator();
            while (it.hasNext() && (jsonSerializerModifyCollectionLikeSerializer = it.next().findMapLikeSerializer(config, mapLikeType, beanDescription, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer)) == null) {
            }
            if (jsonSerializerModifyCollectionLikeSerializer == null) {
                jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    jsonSerializerModifyCollectionLikeSerializer = it2.next().modifyMapLikeSerializer(config, mapLikeType, beanDescription3, jsonSerializerModifyCollectionLikeSerializer);
                }
            }
            return jsonSerializerModifyCollectionLikeSerializer;
        }
        if (!javaType.isCollectionLikeType()) {
            if (javaType.isArrayType()) {
                return buildArraySerializer(serializerProvider, (ArrayType) javaType, beanDescription, z3, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType.isTrueCollectionType()) {
            return buildCollectionSerializer(serializerProvider, (CollectionType) collectionLikeType, beanDescription, z3, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
        }
        Iterator<Serializers> it3 = customSerializers().iterator();
        while (true) {
            if (!it3.hasNext()) {
                beanDescription2 = beanDescription3;
                break;
            }
            beanDescription2 = beanDescription3;
            jsonSerializerModifyCollectionLikeSerializer = it3.next().findCollectionLikeSerializer(config, collectionLikeType, beanDescription, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            if (jsonSerializerModifyCollectionLikeSerializer != null) {
                break;
            }
            beanDescription3 = beanDescription2;
        }
        if (jsonSerializerModifyCollectionLikeSerializer == null) {
            jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
        }
        if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it4 = this._factoryConfig.serializerModifiers().iterator();
            while (it4.hasNext()) {
                jsonSerializerModifyCollectionLikeSerializer = it4.next().modifyCollectionLikeSerializer(config, collectionLikeType, beanDescription2, jsonSerializerModifyCollectionLikeSerializer);
            }
        }
        return jsonSerializerModifyCollectionLikeSerializer;
    }

    protected JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (valueFindExpectedFormat != null && valueFindExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
            ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
            return null;
        }
        JsonSerializer<?> jsonSerializerConstruct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, valueFindExpectedFormat);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                jsonSerializerConstruct = it.next().modifyEnumSerializer(serializationConfig, javaType, beanDescription, jsonSerializerConstruct);
            }
        }
        return jsonSerializerConstruct;
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z, typeSerializer, jsonSerializer);
    }

    protected JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    protected JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    protected JsonSerializer<?> buildMapEntrySerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        return new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(serializationConfig, javaType3), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.fasterxml.jackson.databind.ser.std.MapSerializer] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.fasterxml.jackson.databind.ser.std.MapSerializer] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.fasterxml.jackson.databind.JsonSerializer] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.fasterxml.jackson.databind.JsonSerializer<?>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.fasterxml.jackson.databind.JsonSerializer] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.fasterxml.jackson.databind.JsonSerializer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.fasterxml.jackson.databind.ser.BeanSerializerModifier] */
    protected JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, MapType mapType, BeanDescription beanDescription, boolean z, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        ?? FindSerializerByAnnotations = 0;
        while (it.hasNext() && (FindSerializerByAnnotations = it.next().findMapSerializer(config, mapType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2)) == 0) {
        }
        if (FindSerializerByAnnotations == 0 && (FindSerializerByAnnotations = findSerializerByAnnotations(serializerProvider, mapType, beanDescription)) == 0) {
            Object objFindFilterId = findFilterId(config, beanDescription);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
            FindSerializerByAnnotations = MapSerializer.construct(defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null, mapType, z, typeSerializer, jsonSerializer, jsonSerializer2, objFindFilterId);
            Object objFindSuppressableContentValue = findSuppressableContentValue(config, mapType.getContentType(), beanDescription);
            if (objFindSuppressableContentValue != null) {
                FindSerializerByAnnotations = FindSerializerByAnnotations.withContentInclusion(objFindSuppressableContentValue);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            FindSerializerByAnnotations = FindSerializerByAnnotations;
            while (it2.hasNext()) {
                FindSerializerByAnnotations = it2.next().modifyMapSerializer(config, mapType, beanDescription, FindSerializerByAnnotations);
            }
        }
        return FindSerializerByAnnotations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        BeanDescription beanDescriptionIntrospectClassAnnotations = serializationConfig.introspectClassAnnotations(javaType.getRawClass());
        JsonSerializer<?> jsonValueSerializer = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (jsonValueSerializer = it.next().findSerializer(serializationConfig, javaType, beanDescriptionIntrospectClassAnnotations)) == null) {
            }
        }
        if (jsonValueSerializer != null) {
            jsonSerializer = jsonValueSerializer;
        } else if (jsonSerializer == null && (jsonSerializer = StdKeySerializers.getStdKeySerializer(serializationConfig, javaType.getRawClass(), false)) == null) {
            beanDescriptionIntrospectClassAnnotations = serializationConfig.introspect(javaType);
            AnnotatedMethod annotatedMethodFindJsonValueMethod = beanDescriptionIntrospectClassAnnotations.findJsonValueMethod();
            if (annotatedMethodFindJsonValueMethod != null) {
                JsonSerializer<Object> stdKeySerializer = StdKeySerializers.getStdKeySerializer(serializationConfig, annotatedMethodFindJsonValueMethod.getRawReturnType(), true);
                Method annotated = annotatedMethodFindJsonValueMethod.getAnnotated();
                if (serializationConfig.canOverrideAccessModifiers()) {
                    ClassUtil.checkAndFixAccess(annotated, serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
                jsonValueSerializer = new JsonValueSerializer(annotatedMethodFindJsonValueMethod, stdKeySerializer);
                jsonSerializer = jsonValueSerializer;
            } else {
                jsonSerializer = StdKeySerializers.getFallbackKeySerializer(serializationConfig, javaType.getRawClass());
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer = it2.next().modifyKeySerializer(serializationConfig, javaType, beanDescriptionIntrospectClassAnnotations, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByClass;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (typeResolverBuilderFindTypeResolver == null) {
            return null;
        }
        return typeResolverBuilderFindTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    protected abstract Iterable<Serializers> customSerializers();

    protected Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object objFindSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, objFindSerializationConverter);
    }

    protected JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Converter<Object, Object> converterFindConverter = findConverter(serializerProvider, annotated);
        return converterFindConverter == null ? jsonSerializer : new StdDelegatingSerializer(converterFindConverter, converterFindConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    protected Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    protected JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    protected final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z, (javaTypeArrFindTypeParameters2 == null || javaTypeArrFindTypeParameters2.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    protected final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMethod annotatedMethodFindJsonValueMethod = beanDescription.findJsonValueMethod();
        if (annotatedMethodFindJsonValueMethod == null) {
            return null;
        }
        Method annotated = annotatedMethodFindJsonValueMethod.getAnnotated();
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotated, serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new JsonValueSerializer(annotatedMethodFindJsonValueMethod, findSerializerFromAnnotation(serializerProvider, annotatedMethodFindJsonValueMethod));
    }

    protected final JsonSerializer<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z) {
        Class<? extends JsonSerializer<?>> cls;
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = _concrete.get(name);
        if (jsonSerializer != null || (cls = _concreteLazy.get(name)) == null) {
            return jsonSerializer;
        }
        try {
            return cls.newInstance();
        } catch (Exception e2) {
            throw new IllegalStateException("Failed to instantiate standard serializer (of type " + cls.getName() + "): " + e2.getMessage(), e2);
        }
    }

    protected final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> jsonSerializerFindOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (jsonSerializerFindOptionalStdSerializer != null) {
            return jsonSerializerFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider.getConfig(), javaType, beanDescription, z, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            if (Enum.class.isAssignableFrom(rawClass)) {
                return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
            }
            return null;
        }
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (valueFindExpectedFormat != null) {
            int i2 = C59821.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[valueFindExpectedFormat.getShape().ordinal()];
            if (i2 == 1) {
                return ToStringSerializer.instance;
            }
            if (i2 == 2 || i2 == 3) {
                return null;
            }
        }
        return NumberSerializer.instance;
    }

    protected JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object objFindSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, objFindSerializer));
    }

    protected Object findSuppressableContentValue(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion = beanDescription.findPropertyInclusion(serializationConfig.getDefaultPropertyInclusion());
        if (valueFindPropertyInclusion == null) {
            return null;
        }
        JsonInclude.Include contentInclusion = valueFindPropertyInclusion.getContentInclusion();
        if (C59821.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()] != 1) {
            return contentInclusion;
        }
        return null;
    }

    protected boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    protected boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        if (typeSerializer != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        return (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) ? serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING) : typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z, typeSerializer, jsonSerializer);
    }
}
