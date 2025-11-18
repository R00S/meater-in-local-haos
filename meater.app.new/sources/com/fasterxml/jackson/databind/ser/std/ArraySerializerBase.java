package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements ContextualSerializer {
    protected final BeanProperty _property;
    protected final Boolean _unwrapSingle;

    protected ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    public abstract JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides;
        Boolean feature;
        return (beanProperty == null || (valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType())) == null || (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) == this._unwrapSingle) ? this : _withResolved(beanProperty, feature);
    }

    protected abstract void serializeContents(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        typeSerializer.writeTypePrefixForArray(t, jsonGenerator);
        jsonGenerator.setCurrentValue(t);
        serializeContents(t, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForArray(t, jsonGenerator);
    }

    protected ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }
}
