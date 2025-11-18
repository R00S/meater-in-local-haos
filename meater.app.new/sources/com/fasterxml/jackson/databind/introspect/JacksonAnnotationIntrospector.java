package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final Java7Support _java7Helper;
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};

    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1 */
    static /* synthetic */ class C59671 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion */
        static final /* synthetic */ int[] f15612xfdbfedae;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            f15612xfdbfedae = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15612xfdbfedae[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15612xfdbfedae[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15612xfdbfedae[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15612xfdbfedae[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        Java7Support java7SupportInstance;
        try {
            java7SupportInstance = Java7Support.instance();
        } catch (Throwable unused) {
            java7SupportInstance = null;
        }
        _java7Helper = java7SupportInstance;
    }

    private final Boolean _findSortAlpha(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotated, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    protected Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        return cls;
    }

    protected StdTypeResolverBuilder _constructNoTypeResolverBuilder() {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    protected StdTypeResolverBuilder _constructStdTypeResolverBuilder() {
        return new StdTypeResolverBuilder();
    }

    protected BeanPropertyWriter _constructVirtualProperty(JsonAppend.Attr attr, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        PropertyMetadata propertyMetadata = attr.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String strValue = attr.value();
        PropertyName propertyName_propertyName = _propertyName(attr.propName(), attr.propNamespace());
        if (!propertyName_propertyName.hasSimpleName()) {
            propertyName_propertyName = PropertyName.construct(strValue);
        }
        return AttributePropertyWriter.construct(strValue, SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), strValue, javaType), propertyName_propertyName, propertyMetadata, attr.include()), annotatedClass.getAnnotations(), javaType);
    }

    protected PropertyName _findConstructorName(Annotated annotated) {
        Java7Support java7Support;
        PropertyName propertyNameFindConstructorName;
        if (!(annotated instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) annotated;
        if (annotatedParameter.getOwner() == null || (java7Support = _java7Helper) == null || (propertyNameFindConstructorName = java7Support.findConstructorName(annotatedParameter)) == null) {
            return null;
        }
        return propertyNameFindConstructorName;
    }

    protected TypeResolverBuilder<?> _findTypeResolver(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeResolverBuilder<?> typeResolverBuilder_constructStdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(annotated, JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) _findAnnotation(annotated, JsonTypeResolver.class);
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            typeResolverBuilder_constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.use() == JsonTypeInfo.EnumC5962Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            typeResolverBuilder_constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) _findAnnotation(annotated, JsonTypeIdResolver.class);
        TypeIdResolver typeIdResolverTypeIdResolverInstance = jsonTypeIdResolver != null ? mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value()) : null;
        if (typeIdResolverTypeIdResolverInstance != null) {
            typeIdResolverTypeIdResolverInstance.init(javaType);
        }
        TypeResolverBuilder typeResolverBuilderInit = typeResolverBuilder_constructStdTypeResolverBuilder.init(jsonTypeInfo.use(), typeIdResolverTypeIdResolverInstance);
        JsonTypeInfo.EnumC5961As enumC5961AsInclude = jsonTypeInfo.include();
        if (enumC5961AsInclude == JsonTypeInfo.EnumC5961As.EXTERNAL_PROPERTY && (annotated instanceof AnnotatedClass)) {
            enumC5961AsInclude = JsonTypeInfo.EnumC5961As.PROPERTY;
        }
        TypeResolverBuilder typeResolverBuilderTypeProperty = typeResolverBuilderInit.inclusion(enumC5961AsInclude).typeProperty(jsonTypeInfo.property());
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        if (clsDefaultImpl != JsonTypeInfo.None.class && !clsDefaultImpl.isAnnotation()) {
            typeResolverBuilderTypeProperty = typeResolverBuilderTypeProperty.defaultImpl(clsDefaultImpl);
        }
        return typeResolverBuilderTypeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    protected boolean _isIgnorable(Annotated annotated) {
        Boolean boolFindTransient;
        JsonIgnore jsonIgnore = (JsonIgnore) _findAnnotation(annotated, JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        Java7Support java7Support = _java7Helper;
        if (java7Support == null || (boolFindTransient = java7Support.findTransient(annotated)) == null) {
            return false;
        }
        return boolFindTransient.booleanValue();
    }

    protected PropertyName _propertyName(String str, String str2) {
        return str.isEmpty() ? PropertyName.USE_DEFAULT : (str2 == null || str2.isEmpty()) ? PropertyName.construct(str) : PropertyName.construct(str, str2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        JsonAppend jsonAppend = (JsonAppend) _findAnnotation(annotatedClass, JsonAppend.class);
        if (jsonAppend == null) {
            return;
        }
        boolean zPrepend = jsonAppend.prepend();
        JavaType javaTypeConstructType = null;
        JsonAppend.Attr[] attrArrAttrs = jsonAppend.attrs();
        int length = attrArrAttrs.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (javaTypeConstructType == null) {
                javaTypeConstructType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty = _constructVirtualProperty(attrArrAttrs[i2], mapperConfig, annotatedClass, javaTypeConstructType);
            if (zPrepend) {
                list.add(i2, beanPropertyWriter_constructVirtualProperty);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty);
            }
        }
        JsonAppend.Prop[] propArrProps = jsonAppend.props();
        int length2 = propArrProps.length;
        for (int i3 = 0; i3 < length2; i3++) {
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty2 = _constructVirtualProperty(propArrProps[i3], mapperConfig, annotatedClass);
            if (zPrepend) {
                list.add(i3, beanPropertyWriter_constructVirtualProperty2);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty2);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(annotatedClass, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> clsContentUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsContentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return ClassUtil.findFirstAnnotatedEnumValue(cls, JsonEnumDefaultValue.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedMember, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.contentAs());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.keyAs());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.m12941as());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> clsUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsUsing = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r3) throws NoSuchFieldException {
        JsonProperty jsonProperty;
        String strValue;
        try {
            Field field = r3.getClass().getField(r3.name());
            if (field != null && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null && (strValue = jsonProperty.value()) != null) {
                if (!strValue.isEmpty()) {
                    return strValue;
                }
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return r3.name();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : ClassUtil.getDeclaredFields(cls)) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValue = jsonProperty.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = (String) map.get(enumArr[i2].name());
                if (str != null) {
                    strArr[i2] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) _findAnnotation(annotated, JsonFilter.class);
        if (jsonFilter == null) {
            return null;
        }
        String strValue = jsonFilter.value();
        if (strValue.length() > 0) {
            return strValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(annotated, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return new JsonFormat.Value(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        JsonIgnoreProperties.Value valueFindPropertyIgnorals = findPropertyIgnorals(annotatedClass);
        if (valueFindPropertyIgnorals == null) {
            return null;
        }
        return Boolean.valueOf(valueFindPropertyIgnorals.getIgnoreUnknown());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName propertyName_findConstructorName = _findConstructorName(annotatedMember);
        if (propertyName_findConstructorName == null) {
            return null;
        }
        return propertyName_findConstructorName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        String strValue = jacksonInject.value();
        if (strValue.length() != 0) {
            return strValue;
        }
        if (!(annotatedMember instanceof AnnotatedMethod)) {
            return annotatedMember.getRawType().getName();
        }
        AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
        return annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(Annotated annotated) {
        Class<? extends KeyDeserializer> clsKeyUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsKeyUsing = jsonDeserialize.keyUsing()) == KeyDeserializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(Annotated annotated) {
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(annotated, JsonSetter.class);
        if (jsonSetter != null) {
            return PropertyName.construct(jsonSetter.value());
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (_hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(Annotated annotated) {
        JsonGetter jsonGetter = (JsonGetter) _findAnnotation(annotated, JsonGetter.class);
        if (jsonGetter != null) {
            return PropertyName.construct(jsonGetter.value());
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (_hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) _findAnnotation(annotatedClass, JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) _findAnnotation(annotated, JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new ObjectIdInfo(PropertyName.construct(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) _findAnnotation(annotated, JsonIdentityReference.class);
        return jsonIdentityReference != null ? objectIdInfo.withAlwaysAsId(jsonIdentityReference.alwaysAsId()) : objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedClass, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) _findAnnotation(annotatedClass, JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z) {
        JsonIgnoreProperties.Value valueFindPropertyIgnorals = findPropertyIgnorals(annotated);
        if (valueFindPropertyIgnorals == null) {
            return null;
        }
        if (z) {
            if (valueFindPropertyIgnorals.getAllowGetters()) {
                return null;
            }
        } else if (valueFindPropertyIgnorals.getAllowSetters()) {
            return null;
        }
        Set<String> ignored = valueFindPropertyIgnorals.getIgnored();
        return (String[]) ignored.toArray(new String[ignored.size()]);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String strDefaultValue = jsonProperty.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(Annotated annotated) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) _findAnnotation(annotated, JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(annotated, JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return null;
        }
        return JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        JsonSerialize jsonSerialize;
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(annotated, JsonInclude.class);
        JsonInclude.Include includeValue = jsonInclude == null ? JsonInclude.Include.USE_DEFAULTS : jsonInclude.value();
        JsonInclude.Include includeContent = JsonInclude.Include.USE_DEFAULTS;
        if (includeValue == includeContent && (jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class)) != null) {
            int i2 = C59671.f15612xfdbfedae[jsonSerialize.include().ordinal()];
            if (i2 == 1) {
                includeValue = JsonInclude.Include.ALWAYS;
            } else if (i2 == 2) {
                includeValue = JsonInclude.Include.NON_NULL;
            } else if (i2 == 3) {
                includeValue = JsonInclude.Include.NON_DEFAULT;
            } else if (i2 == 4) {
                includeValue = JsonInclude.Include.NON_EMPTY;
            }
        }
        if (jsonInclude != null) {
            includeContent = jsonInclude.content();
        }
        return JsonInclude.Value.construct(includeValue, includeContent);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(Annotated annotated) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) _findAnnotation(annotatedMember, JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return AnnotationIntrospector.ReferenceProperty.managed(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) _findAnnotation(annotatedMember, JsonBackReference.class);
        if (jsonBackReference != null) {
            return AnnotationIntrospector.ReferenceProperty.back(jsonBackReference.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) _findAnnotation(annotatedClass, JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        String strNamespace = jsonRootName.namespace();
        return PropertyName.construct(jsonRootName.value(), (strNamespace == null || strNamespace.length() != 0) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentAs());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.keyAs());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotatedClass, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return _findSortAlpha(annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.m12942as());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != JsonSerializer.None.class) {
            return clsUsing;
        }
        JsonRawValue jsonRawValue = (JsonRawValue) _findAnnotation(annotated, JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new RawSerializer(annotated.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) _findAnnotation(annotated, JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        JsonSubTypes.Type[] typeArrValue = jsonSubTypes.value();
        ArrayList arrayList = new ArrayList(typeArrValue.length);
        for (JsonSubTypes.Type type : typeArrValue) {
            arrayList.add(new NamedType(type.value(), type.name()));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) _findAnnotation(annotatedClass, JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return _findTypeResolver(mapperConfig, annotatedClass, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) _findAnnotation(annotatedMember, JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) _findAnnotation(annotatedClass, JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) _findAnnotation(annotated, JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnyGetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnySetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotatedMethod, JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasCreatorAnnotation(Annotated annotated) {
        Java7Support java7Support;
        Boolean boolHasCreatorAnnotation;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !(annotated instanceof AnnotatedConstructor) || (java7Support = _java7Helper) == null || (boolHasCreatorAnnotation = java7Support.hasCreatorAnnotation(annotated)) == null) {
            return false;
        }
        return boolHasCreatorAnnotation.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this._annotationsInside.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this._annotationsInside.putIfAbsent(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) _findAnnotation(annotatedClass, JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, JsonTypeId.class));
    }

    protected Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                return annotatedMethod;
            }
        } else if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return annotatedMethod;
            }
            return null;
        }
        if (rawParameterType2 == String.class) {
            return annotatedMethod2;
        }
        return null;
    }

    protected Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> cls_classIfExplicit = _classIfExplicit(cls);
        if (cls_classIfExplicit == null || cls_classIfExplicit == cls2) {
            return null;
        }
        return cls_classIfExplicit;
    }

    protected BeanPropertyWriter _constructVirtualProperty(JsonAppend.Prop prop, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        PropertyMetadata propertyMetadata = prop.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName_propertyName = _propertyName(prop.name(), prop.namespace());
        JavaType javaTypeConstructType = mapperConfig.constructType(prop.type());
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinitionConstruct = SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), propertyName_propertyName.getSimpleName(), javaTypeConstructType), propertyName_propertyName, propertyMetadata, prop.include());
        Class<? extends VirtualBeanPropertyWriter> clsValue = prop.value();
        if (mapperConfig.getHandlerInstantiator() == null) {
            return ((VirtualBeanPropertyWriter) ClassUtil.createInstance(clsValue, mapperConfig.canOverrideAccessModifiers())).withConfig(mapperConfig, annotatedClass, simpleBeanPropertyDefinitionConstruct, javaTypeConstructType);
        }
        throw null;
    }
}
