package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {
        private final String _name;
        private final Type _type;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this._type = type;
            this._name = str;
        }

        public static ReferenceProperty back(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public static ReferenceProperty managed(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public String getName() {
            return this._name;
        }

        public boolean isBackReference() {
            return this._type == Type.BACK_REFERENCE;
        }

        public boolean isManagedReference() {
            return this._type == Type.MANAGED_REFERENCE;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    protected <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> cls) {
        return (A) annotated.getAnnotation(cls);
    }

    protected boolean _hasAnnotation(Annotated annotated, Class<? extends Annotation> cls) {
        return annotated.hasAnnotation(cls);
    }

    protected boolean _hasOneOf(Annotated annotated, Class<? extends Annotation>[] clsArr) {
        return annotated.hasOneOf(clsArr);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public Object findContentDeserializer(Annotated annotated) {
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        return null;
    }

    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(Annotated annotated) {
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r1) {
        return r1.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        int length = enumArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2] == null) {
                strArr[i2] = findEnumValue(enumArr[i2]);
            }
        }
        return strArr;
    }

    public Object findFilterId(Annotated annotated) {
        return null;
    }

    public JsonFormat.Value findFormat(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        return null;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        return null;
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        return null;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findNullSerializer(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return objectIdInfo;
    }

    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        return null;
    }

    public String findPropertyDescription(Annotated annotated) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties.Value valueForIgnoredProperties;
        String[] strArrFindPropertiesToIgnore = findPropertiesToIgnore(annotated, true);
        Boolean boolFindIgnoreUnknownProperties = annotated instanceof AnnotatedClass ? findIgnoreUnknownProperties((AnnotatedClass) annotated) : null;
        if (strArrFindPropertiesToIgnore != null) {
            valueForIgnoredProperties = JsonIgnoreProperties.Value.forIgnoredProperties(strArrFindPropertiesToIgnore);
        } else {
            if (boolFindIgnoreUnknownProperties == null) {
                return null;
            }
            valueForIgnoredProperties = JsonIgnoreProperties.Value.empty();
        }
        if (boolFindIgnoreUnknownProperties != null) {
            return boolFindIgnoreUnknownProperties.booleanValue() ? valueForIgnoredProperties.withIgnoreUnknown() : valueForIgnoredProperties.withoutIgnoreUnknown();
        }
        return valueForIgnoredProperties;
    }

    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        return JsonInclude.Value.empty();
    }

    public Integer findPropertyIndex(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        return null;
    }

    public Object findSerializer(Annotated annotated) {
        return null;
    }

    public List<NamedType> findSubtypes(Annotated annotated) {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        return null;
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        return null;
    }

    public Class<?>[] findViews(Annotated annotated) {
        return null;
    }

    public PropertyName findWrapperName(Annotated annotated) {
        return null;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        Class<?> clsFindDeserializationContentType;
        JavaType keyType;
        Class<?> clsFindDeserializationKeyType;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        Class<?> clsFindDeserializationType = findDeserializationType(annotated, javaType);
        if (clsFindDeserializationType != null && !javaType.hasRawClass(clsFindDeserializationType)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, clsFindDeserializationType);
            } catch (IllegalArgumentException e2) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, clsFindDeserializationType.getName(), annotated.getName(), e2.getMessage()), e2);
            }
        }
        if (javaType.isMapLikeType() && (clsFindDeserializationKeyType = findDeserializationKeyType(annotated, (keyType = javaType.getKeyType()))) != null) {
            try {
                javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, clsFindDeserializationKeyType));
            } catch (IllegalArgumentException e3) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsFindDeserializationKeyType.getName(), annotated.getName(), e3.getMessage()), e3);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (clsFindDeserializationContentType = findDeserializationContentType(annotated, contentType)) == null) {
            return javaType;
        }
        try {
            return javaType.withContentType(typeFactory.constructSpecializedType(contentType, clsFindDeserializationContentType));
        } catch (IllegalArgumentException e4) {
            throw new JsonMappingException((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsFindDeserializationContentType.getName(), annotated.getName(), e4.getMessage()), e4);
        }
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        Class<?> clsFindSerializationContentType;
        JavaType javaTypeConstructSpecializedType;
        JavaType keyType;
        Class<?> clsFindSerializationKeyType;
        JavaType javaTypeConstructSpecializedType2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        Class<?> clsFindSerializationType = findSerializationType(annotated);
        if (clsFindSerializationType != null) {
            if (javaType.hasRawClass(clsFindSerializationType)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (clsFindSerializationType.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, clsFindSerializationType);
                    } else {
                        if (!rawClass.isAssignableFrom(clsFindSerializationType)) {
                            throw new JsonMappingException(null, String.format("Can not refine serialization type %s into %s; types not related", javaType, clsFindSerializationType.getName()));
                        }
                        javaType = typeFactory.constructSpecializedType(javaType, clsFindSerializationType);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsFindSerializationType.getName(), annotated.getName(), e2.getMessage()), e2);
                }
            }
        }
        if (javaType.isMapLikeType() && (clsFindSerializationKeyType = findSerializationKeyType(annotated, (keyType = javaType.getKeyType()))) != null) {
            if (keyType.hasRawClass(clsFindSerializationKeyType)) {
                javaTypeConstructSpecializedType2 = keyType.withStaticTyping();
            } else {
                Class<?> rawClass2 = keyType.getRawClass();
                try {
                    if (clsFindSerializationKeyType.isAssignableFrom(rawClass2)) {
                        javaTypeConstructSpecializedType2 = typeFactory.constructGeneralizedType(keyType, clsFindSerializationKeyType);
                    } else {
                        if (!rawClass2.isAssignableFrom(clsFindSerializationKeyType)) {
                            throw new JsonMappingException(null, String.format("Can not refine serialization key type %s into %s; types not related", keyType, clsFindSerializationKeyType.getName()));
                        }
                        javaTypeConstructSpecializedType2 = typeFactory.constructSpecializedType(keyType, clsFindSerializationKeyType);
                    }
                } catch (IllegalArgumentException e3) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsFindSerializationKeyType.getName(), annotated.getName(), e3.getMessage()), e3);
                }
            }
            javaType = ((MapLikeType) javaType).withKeyType(javaTypeConstructSpecializedType2);
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (clsFindSerializationContentType = findSerializationContentType(annotated, contentType)) == null) {
            return javaType;
        }
        if (contentType.hasRawClass(clsFindSerializationContentType)) {
            javaTypeConstructSpecializedType = contentType.withStaticTyping();
        } else {
            Class<?> rawClass3 = contentType.getRawClass();
            try {
                if (clsFindSerializationContentType.isAssignableFrom(rawClass3)) {
                    javaTypeConstructSpecializedType = typeFactory.constructGeneralizedType(contentType, clsFindSerializationContentType);
                } else {
                    if (!rawClass3.isAssignableFrom(clsFindSerializationContentType)) {
                        throw new JsonMappingException(null, String.format("Can not refine serialization content type %s into %s; types not related", contentType, clsFindSerializationContentType.getName()));
                    }
                    javaTypeConstructSpecializedType = typeFactory.constructSpecializedType(contentType, clsFindSerializationContentType);
                }
            } catch (IllegalArgumentException e4) {
                throw new JsonMappingException((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsFindSerializationContentType.getName(), annotated.getName(), e4.getMessage()), e4);
            }
        }
        return javaType.withContentType(javaTypeConstructSpecializedType);
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }
}
