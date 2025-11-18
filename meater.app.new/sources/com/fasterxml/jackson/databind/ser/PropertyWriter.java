package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    protected PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    protected PropertyWriter(BeanPropertyDefinition beanPropertyDefinition) {
        super(beanPropertyDefinition.getMetadata());
    }

    protected PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }
}
