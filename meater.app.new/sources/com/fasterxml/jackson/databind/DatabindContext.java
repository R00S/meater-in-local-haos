package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class DatabindContext {
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return javaType.getRawClass() == cls ? javaType : getConfig().constructSpecializedType(javaType, cls);
    }

    public JavaType constructType(Type type) {
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (Converter.class.isAssignableFrom(cls)) {
            MapperConfig<?> config = getConfig();
            if (config.getHandlerInstantiator() == null) {
                return (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
            }
            throw null;
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract MapperConfig<?> getConfig();

    public abstract TypeFactory getTypeFactory();

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        MapperConfig<?> config = getConfig();
        if (config.getHandlerInstantiator() == null) {
            return ((ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers())).forScope(objectIdInfo.getScope());
        }
        throw null;
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdResolver> resolverType = objectIdInfo.getResolverType();
        MapperConfig<?> config = getConfig();
        if (config.getHandlerInstantiator() == null) {
            return (ObjectIdResolver) ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers());
        }
        throw null;
    }
}
