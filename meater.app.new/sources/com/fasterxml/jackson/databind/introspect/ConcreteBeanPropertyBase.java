package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    protected final PropertyMetadata _metadata;
    protected transient JsonFormat.Value _propertyFormat;

    protected ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotatedMember member;
        JsonFormat.Value valueFindFormat = this._propertyFormat;
        if (valueFindFormat == null) {
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            valueFindFormat = null;
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null && (member = getMember()) != null) {
                valueFindFormat = annotationIntrospector.findFormat(member);
            }
            if (defaultPropertyFormat != null) {
                if (valueFindFormat != null) {
                    defaultPropertyFormat = defaultPropertyFormat.withOverrides(valueFindFormat);
                }
                valueFindFormat = defaultPropertyFormat;
            } else if (valueFindFormat == null) {
                valueFindFormat = BeanProperty.EMPTY_FORMAT;
            }
            this._propertyFormat = valueFindFormat;
        }
        return valueFindFormat;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Value defaultPropertyInclusion = mapperConfig.getDefaultPropertyInclusion(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        return (annotationIntrospector == null || member == null || (valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(member)) == null) ? defaultPropertyInclusion : defaultPropertyInclusion.withOverrides(valueFindPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
        this._propertyFormat = concreteBeanPropertyBase._propertyFormat;
    }
}
