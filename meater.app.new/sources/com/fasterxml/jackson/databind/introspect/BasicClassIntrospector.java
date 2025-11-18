package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public class BasicClassIntrospector extends ClassIntrospector implements Serializable {
    protected static final BasicBeanDescription BOOLEAN_DESC;
    protected static final BasicBeanDescription INT_DESC;
    protected static final BasicBeanDescription LONG_DESC;
    protected static final BasicBeanDescription STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(String.class), AnnotatedClass.constructWithoutSuperTypes(String.class, null));

    @Deprecated
    public static final BasicClassIntrospector instance;
    protected final LRUMap<JavaType, BasicBeanDescription> _cachedFCA = new LRUMap<>(16, 64);

    static {
        Class cls = Boolean.TYPE;
        BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClass.constructWithoutSuperTypes(cls, null));
        Class cls2 = Integer.TYPE;
        INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls2), AnnotatedClass.constructWithoutSuperTypes(cls2, null));
        Class cls3 = Long.TYPE;
        LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls3), AnnotatedClass.constructWithoutSuperTypes(cls3, null));
        instance = new BasicClassIntrospector();
    }

    protected BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return BasicBeanDescription.forOtherUse(mapperConfig, javaType, AnnotatedClass.construct(javaType, mapperConfig));
        }
        return null;
    }

    protected BasicBeanDescription _findStdTypeDesc(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (!rawClass.isPrimitive()) {
            if (rawClass == String.class) {
                return STRING_DESC;
            }
            return null;
        }
        if (rawClass == Boolean.TYPE) {
            return BOOLEAN_DESC;
        }
        if (rawClass == Integer.TYPE) {
            return INT_DESC;
        }
        if (rawClass == Long.TYPE) {
            return LONG_DESC;
        }
        return null;
    }

    protected boolean _isStdJDKCollection(JavaType javaType) {
        Class<?> rawClass;
        String packageName;
        return javaType.isContainerType() && !javaType.isArrayType() && (packageName = ClassUtil.getPackageName((rawClass = javaType.getRawClass()))) != null && (packageName.startsWith("java.lang") || packageName.startsWith("java.util")) && (Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass));
    }

    protected POJOPropertiesCollector collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, boolean z, String str) {
        return constructPropertyCollector(mapperConfig, AnnotatedClass.construct(javaType, mapperConfig, mixInResolver), javaType, z, str);
    }

    protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        AnnotatedClass annotatedClassConstruct = AnnotatedClass.construct(javaType, mapperConfig, mixInResolver);
        JsonPOJOBuilder.Value valueFindPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(annotatedClassConstruct) : null;
        return constructPropertyCollector(mapperConfig, annotatedClassConstruct, javaType, z, valueFindPOJOBuilderConfig == null ? "with" : valueFindPOJOBuilderConfig.withPrefix);
    }

    protected POJOPropertiesCollector constructPropertyCollector(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType, boolean z, String str) {
        return new POJOPropertiesCollector(mapperConfig, z, javaType, annotatedClass, str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public /* bridge */ /* synthetic */ BeanDescription forClassAnnotations(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        return forClassAnnotations((MapperConfig<?>) mapperConfig, javaType, mixInResolver);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public BasicBeanDescription forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        BasicBeanDescription basicBeanDescription_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (basicBeanDescription_findStdTypeDesc != null) {
            return basicBeanDescription_findStdTypeDesc;
        }
        BasicBeanDescription basicBeanDescription = this._cachedFCA.get(javaType);
        if (basicBeanDescription != null) {
            return basicBeanDescription;
        }
        BasicBeanDescription basicBeanDescriptionForOtherUse = BasicBeanDescription.forOtherUse(mapperConfig, javaType, AnnotatedClass.construct(javaType, mapperConfig, mixInResolver));
        this._cachedFCA.put(javaType, basicBeanDescriptionForOtherUse);
        return basicBeanDescriptionForOtherUse;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public BasicBeanDescription forCreation(DeserializationConfig deserializationConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        BasicBeanDescription basicBeanDescription_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (basicBeanDescription_findStdTypeDesc != null) {
            return basicBeanDescription_findStdTypeDesc;
        }
        BasicBeanDescription basicBeanDescription_findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return basicBeanDescription_findStdJdkCollectionDesc == null ? BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType, mixInResolver, false, "set")) : basicBeanDescription_findStdJdkCollectionDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        BasicBeanDescription basicBeanDescription_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (basicBeanDescription_findStdTypeDesc == null) {
            basicBeanDescription_findStdTypeDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
            if (basicBeanDescription_findStdTypeDesc == null) {
                basicBeanDescription_findStdTypeDesc = BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType, mixInResolver, false, "set"));
            }
            this._cachedFCA.putIfAbsent(javaType, basicBeanDescription_findStdTypeDesc);
        }
        return basicBeanDescription_findStdTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        BasicBeanDescription basicBeanDescriptionForDeserialization = BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(deserializationConfig, javaType, mixInResolver, false));
        this._cachedFCA.putIfAbsent(javaType, basicBeanDescriptionForDeserialization);
        return basicBeanDescriptionForDeserialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public BasicBeanDescription forSerialization(SerializationConfig serializationConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        BasicBeanDescription basicBeanDescription_findStdTypeDesc = _findStdTypeDesc(javaType);
        if (basicBeanDescription_findStdTypeDesc == null) {
            basicBeanDescription_findStdTypeDesc = _findStdJdkCollectionDesc(serializationConfig, javaType);
            if (basicBeanDescription_findStdTypeDesc == null) {
                basicBeanDescription_findStdTypeDesc = BasicBeanDescription.forSerialization(collectProperties(serializationConfig, javaType, mixInResolver, true, "set"));
            }
            this._cachedFCA.putIfAbsent(javaType, basicBeanDescription_findStdTypeDesc);
        }
        return basicBeanDescription_findStdTypeDesc;
    }
}
