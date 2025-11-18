package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);

    protected BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected BeanPropertyWriter _constructWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, PropertyBuilder propertyBuilder, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        PropertyName fullName = beanPropertyDefinition.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, beanPropertyDefinition.getWrapperName(), propertyBuilder.getClassAnnotations(), annotatedMember, beanPropertyDefinition.getMetadata());
        JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMember);
        if (jsonSerializerFindSerializerFromAnnotation instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializerFindSerializerFromAnnotation).resolve(serializerProvider);
        }
        return propertyBuilder.buildWriter(serializerProvider, beanPropertyDefinition, type, serializerProvider.handlePrimaryContextualization(jsonSerializerFindSerializerFromAnnotation, std), findPropertyTypeSerializer(type, serializerProvider.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? findPropertyContentTypeSerializer(type, serializerProvider.getConfig(), annotatedMember) : null, annotatedMember, z);
    }

    protected JsonSerializer<?> _createSerializer2(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        JsonSerializer<?> jsonSerializerFindSerializerByAnnotations;
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializerFindSerializer = null;
        if (javaType.isContainerType()) {
            if (!z) {
                z = usesStaticTyping(config, beanDescription, null);
            }
            jsonSerializerFindSerializerByAnnotations = buildContainerSerializer(serializerProvider, javaType, beanDescription, z);
            if (jsonSerializerFindSerializerByAnnotations != null) {
                return jsonSerializerFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                jsonSerializerFindSerializerByAnnotations = findReferenceSerializer(serializerProvider, (ReferenceType) javaType, beanDescription, z);
            } else {
                Iterator<Serializers> it = customSerializers().iterator();
                while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(config, javaType, beanDescription)) == null) {
                }
                jsonSerializerFindSerializerByAnnotations = jsonSerializerFindSerializer;
            }
            if (jsonSerializerFindSerializerByAnnotations == null) {
                jsonSerializerFindSerializerByAnnotations = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
        }
        if (jsonSerializerFindSerializerByAnnotations == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByLookup(javaType, config, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByPrimaryType(serializerProvider, javaType, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = findBeanSerializer(serializerProvider, javaType, beanDescription)) == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByAddonType(config, javaType, beanDescription, z)) == null) {
            jsonSerializerFindSerializerByAnnotations = serializerProvider.getUnknownTypeSerializer(beanDescription.getBeanClass());
        }
        if (jsonSerializerFindSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerFindSerializerByAnnotations = it2.next().modifySerializer(config, beanDescription, jsonSerializerFindSerializerByAnnotations);
            }
        }
        return jsonSerializerFindSerializerByAnnotations;
    }

    protected JsonSerializer<Object> constructBeanSerializer(SerializerProvider serializerProvider, BeanDescription beanDescription) throws JsonMappingException {
        if (beanDescription.getBeanClass() == Object.class) {
            return serializerProvider.getUnknownTypeSerializer(Object.class);
        }
        SerializationConfig config = serializerProvider.getConfig();
        BeanSerializerBuilder beanSerializerBuilderConstructBeanSerializerBuilder = constructBeanSerializerBuilder(beanDescription);
        beanSerializerBuilderConstructBeanSerializerBuilder.setConfig(config);
        List<BeanPropertyWriter> listFindBeanProperties = findBeanProperties(serializerProvider, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder);
        List<BeanPropertyWriter> arrayList = listFindBeanProperties == null ? new ArrayList<>() : removeOverlappingTypeIds(serializerProvider, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder, listFindBeanProperties);
        serializerProvider.getAnnotationIntrospector().findAndAddVirtualProperties(config, beanDescription.getClassInfo(), arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                arrayList = it.next().changeProperties(config, beanDescription, arrayList);
            }
        }
        List<BeanPropertyWriter> listFilterBeanProperties = filterBeanProperties(config, beanDescription, arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                listFilterBeanProperties = it2.next().orderProperties(config, beanDescription, listFilterBeanProperties);
            }
        }
        beanSerializerBuilderConstructBeanSerializerBuilder.setObjectIdWriter(constructObjectIdHandler(serializerProvider, beanDescription, listFilterBeanProperties));
        beanSerializerBuilderConstructBeanSerializerBuilder.setProperties(listFilterBeanProperties);
        beanSerializerBuilderConstructBeanSerializerBuilder.setFilterId(findFilterId(config, beanDescription));
        AnnotatedMember annotatedMemberFindAnyGetter = beanDescription.findAnyGetter();
        if (annotatedMemberFindAnyGetter != null) {
            JavaType type = annotatedMemberFindAnyGetter.getType();
            boolean zIsEnabled = config.isEnabled(MapperFeature.USE_STATIC_TYPING);
            JavaType contentType = type.getContentType();
            TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
            JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMemberFindAnyGetter);
            if (jsonSerializerFindSerializerFromAnnotation == null) {
                jsonSerializerFindSerializerFromAnnotation = MapSerializer.construct(null, type, zIsEnabled, typeSerializerCreateTypeSerializer, null, null, null);
            }
            beanSerializerBuilderConstructBeanSerializerBuilder.setAnyGetter(new AnyGetterWriter(new BeanProperty.Std(PropertyName.construct(annotatedMemberFindAnyGetter.getName()), contentType, null, beanDescription.getClassAnnotations(), annotatedMemberFindAnyGetter, PropertyMetadata.STD_OPTIONAL), annotatedMemberFindAnyGetter, jsonSerializerFindSerializerFromAnnotation));
        }
        processViews(config, beanSerializerBuilderConstructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it3 = this._factoryConfig.serializerModifiers().iterator();
            while (it3.hasNext()) {
                beanSerializerBuilderConstructBeanSerializerBuilder = it3.next().updateBuilder(config, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder);
            }
        }
        JsonSerializer<?> jsonSerializerBuild = beanSerializerBuilderConstructBeanSerializerBuilder.build();
        return (jsonSerializerBuild == null && beanDescription.hasKnownClassAnnotations()) ? beanSerializerBuilderConstructBeanSerializerBuilder.createDummy() : jsonSerializerBuild;
    }

    protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDescription) {
        return new BeanSerializerBuilder(beanDescription);
    }

    protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(beanPropertyWriter, clsArr);
    }

    protected ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerProvider, BeanDescription beanDescription, List<BeanPropertyWriter> list) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        if (generatorType != ObjectIdGenerators$PropertyGenerator.class) {
            return ObjectIdWriter.construct(serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0], objectIdInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.getAlwaysAsId());
        }
        String simpleName = objectIdInfo.getPropertyName().getSimpleName();
        int size = list.size();
        for (int i2 = 0; i2 != size; i2++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i2);
            if (simpleName.equals(beanPropertyWriter.getName())) {
                if (i2 > 0) {
                    list.remove(i2);
                    list.add(0, beanPropertyWriter);
                }
                return ObjectIdWriter.construct(beanPropertyWriter.getType(), (PropertyName) null, new PropertyBasedObjectIdGenerator(objectIdInfo, beanPropertyWriter), objectIdInfo.getAlwaysAsId());
            }
        }
        throw new IllegalArgumentException("Invalid Object Id definition for " + beanDescription.getBeanClass().getName() + ": can not find property with name '" + simpleName + "'");
    }

    protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return new PropertyBuilder(serializationConfig, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType;
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        JsonSerializer<?> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionIntrospect.getClassInfo());
        if (jsonSerializerFindSerializerFromAnnotation != null) {
            return jsonSerializerFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, beanDescriptionIntrospect.getClassInfo(), javaType);
            } catch (JsonMappingException e2) {
                return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescriptionIntrospect, e2.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                beanDescriptionIntrospect = config.introspect(javaTypeRefineSerializationType);
            }
            z = true;
        }
        Converter<Object, Object> converterFindSerializationConverter = beanDescriptionIntrospect.findSerializationConverter();
        if (converterFindSerializationConverter == null) {
            return _createSerializer2(serializerProvider, javaTypeRefineSerializationType, beanDescriptionIntrospect, z);
        }
        JavaType outputType = converterFindSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            beanDescriptionIntrospect = config.introspect(outputType);
            jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionIntrospect.getClassInfo());
        }
        if (jsonSerializerFindSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            jsonSerializerFindSerializerFromAnnotation = _createSerializer2(serializerProvider, outputType, beanDescriptionIntrospect, true);
        }
        return new StdDelegatingSerializer(converterFindSerializationConverter, outputType, jsonSerializerFindSerializerFromAnnotation);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    protected Iterable<Serializers> customSerializers() {
        return this._factoryConfig.serializers();
    }

    protected List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals.findIgnoredForSerialization();
            if (!setFindIgnoredForSerialization.isEmpty()) {
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (it.hasNext()) {
                    if (setFindIgnoredForSerialization.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        }
        return list;
    }

    protected List<BeanPropertyWriter> findBeanProperties(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder) throws JsonMappingException {
        List<BeanPropertyDefinition> listFindProperties = beanDescription.findProperties();
        SerializationConfig config = serializerProvider.getConfig();
        removeIgnorableTypes(config, beanDescription, listFindProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, beanDescription, listFindProperties);
        }
        if (listFindProperties.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, beanDescription, null);
        PropertyBuilder propertyBuilderConstructPropertyBuilder = constructPropertyBuilder(config, beanDescription);
        ArrayList arrayList = new ArrayList(listFindProperties.size());
        for (BeanPropertyDefinition beanPropertyDefinition : listFindProperties) {
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (!beanPropertyDefinition.isTypeId()) {
                AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = beanPropertyDefinition.findReferenceType();
                if (referencePropertyFindReferenceType == null || !referencePropertyFindReferenceType.isBackReference()) {
                    if (accessor instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(serializerProvider, beanPropertyDefinition, propertyBuilderConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedMethod) accessor));
                    } else {
                        arrayList.add(_constructWriter(serializerProvider, beanPropertyDefinition, propertyBuilderConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedField) accessor));
                    }
                }
            } else if (accessor != null) {
                beanSerializerBuilder.setTypeId(accessor);
            }
        }
        return arrayList;
    }

    public JsonSerializer<Object> findBeanSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || javaType.isEnumType()) {
            return constructBeanSerializer(serializerProvider, beanDescription);
        }
        return null;
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        return typeResolverBuilderFindPropertyContentTypeResolver == null ? createTypeSerializer(serializationConfig, contentType) : typeResolverBuilderFindPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        return typeResolverBuilderFindPropertyTypeResolver == null ? createTypeSerializer(serializationConfig, javaType) : typeResolverBuilderFindPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializerCreateTypeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializerCreateTypeSerializer == null) {
            typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        JsonSerializer<Object> jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            JsonSerializer<?> jsonSerializerFindReferenceSerializer = it.next().findReferenceSerializer(config, referenceType, beanDescription, typeSerializerCreateTypeSerializer, jsonSerializer);
            if (jsonSerializerFindReferenceSerializer != null) {
                return jsonSerializerFindReferenceSerializer;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceSerializer(referenceType, z, typeSerializerCreateTypeSerializer, jsonSerializer);
        }
        return null;
    }

    protected boolean isPotentialBeanType(Class<?> cls) {
        return ClassUtil.canBeABeanType(cls) == null && !ClassUtil.isProxyType(cls);
    }

    protected void processViews(SerializationConfig serializationConfig, BeanSerializerBuilder beanSerializerBuilder) {
        List<BeanPropertyWriter> properties = beanSerializerBuilder.getProperties();
        boolean zIsEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = properties.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            BeanPropertyWriter beanPropertyWriter = properties.get(i3);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null) {
                i2++;
                beanPropertyWriterArr[i3] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (zIsEnabled) {
                beanPropertyWriterArr[i3] = beanPropertyWriter;
            }
        }
        if (zIsEnabled && i2 == 0) {
            return;
        }
        beanSerializerBuilder.setFilteredProperties(beanPropertyWriterArr);
    }

    protected void removeIgnorableTypes(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            AnnotatedMember accessor = it.next().getAccessor();
            if (accessor == null) {
                it.remove();
            } else {
                Class<?> rawType = accessor.getRawType();
                Boolean boolIsIgnorableType = (Boolean) map.get(rawType);
                if (boolIsIgnorableType == null) {
                    ConfigOverride configOverrideFindConfigOverride = serializationConfig.findConfigOverride(rawType);
                    if (configOverrideFindConfigOverride != null) {
                        boolIsIgnorableType = configOverrideFindConfigOverride.getIsIgnoredType();
                    }
                    if (boolIsIgnorableType == null && (boolIsIgnorableType = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawType).getClassInfo())) == null) {
                        boolIsIgnorableType = Boolean.FALSE;
                    }
                    map.put(rawType, boolIsIgnorableType);
                }
                if (boolIsIgnorableType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected List<BeanPropertyWriter> removeOverlappingTypeIds(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i2);
            TypeSerializer typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.EnumC5961As.EXTERNAL_PROPERTY) {
                PropertyName propertyNameConstruct = PropertyName.construct(typeSerializer.getPropertyName());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter next = it.next();
                    if (next != beanPropertyWriter && next.wouldConflictWithName(propertyNameConstruct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected void removeSetterlessGetters(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (!next.couldDeserialize() && !next.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }
}
