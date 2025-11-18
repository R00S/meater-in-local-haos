package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p176io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements ClassIntrospector.MixInResolver, Serializable {
    protected final BaseSettings _base;
    protected final int _mapperFeatures;
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    protected MapperConfig(BaseSettings baseSettings, int i2) {
        this._base = baseSettings;
        this._mapperFeatures = i2;
    }

    public static <F extends Enum<F> & ConfigFeature> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) obj;
            if (configFeature.enabledByDefault()) {
                mask |= configFeature.getMask();
            }
        }
        return mask;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public SerializableString compileString(String str) {
        return new SerializedString(str);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._base.getAnnotationIntrospector();
    }

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public ClassIntrospector getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public final TypeResolverBuilder<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public VisibilityChecker<?> getDefaultVisibilityChecker() {
        return this._base.getVisibilityChecker();
    }

    public final HandlerInstantiator getHandlerInstantiator() {
        return this._base.getHandlerInstantiator();
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public abstract BeanDescription introspectClassAnnotations(JavaType javaType);

    public BeanDescription introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return (mapperFeature.getMask() & this._mapperFeatures) != 0;
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class<? extends TypeIdResolver> cls) {
        if (getHandlerInstantiator() == null) {
            return (TypeIdResolver) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
        }
        throw null;
    }

    public TypeResolverBuilder<?> typeResolverBuilderInstance(Annotated annotated, Class<? extends TypeResolverBuilder<?>> cls) {
        if (getHandlerInstantiator() == null) {
            return (TypeResolverBuilder) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
        }
        throw null;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, int i2) {
        this._base = mapperConfig._base;
        this._mapperFeatures = i2;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }
}
