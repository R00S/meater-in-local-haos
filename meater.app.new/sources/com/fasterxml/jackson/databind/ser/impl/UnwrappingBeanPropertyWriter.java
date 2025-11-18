package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p176io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        JsonSerializer<Object> jsonSerializerFindValueSerializer = javaType != null ? serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(javaType, cls), this) : serializerProvider.findValueSerializer(cls, this);
        NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
        if (jsonSerializerFindValueSerializer.isUnwrappingSerializer()) {
            nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) jsonSerializerFindValueSerializer)._nameTransformer);
        }
        JsonSerializer<Object> jsonSerializerUnwrappingSerializer = jsonSerializerFindValueSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializerUnwrappingSerializer);
        return jsonSerializerUnwrappingSerializer;
    }

    protected UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
        super.assignSerializer(jsonSerializer);
        JsonSerializer<Object> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null) {
            NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
            if (jsonSerializer2.isUnwrappingSerializer()) {
                nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) this._serializer)._nameTransformer);
            }
            this._serializer = this._serializer.unwrappingSerializer(nameTransformerChainedTransformer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return;
        }
        JsonSerializer<?> jsonSerializer_findAndAddDynamic = this._serializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = obj2.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : jsonSerializerSerializerFor;
        }
        Object obj3 = this._suppressableValue;
        if (obj3 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                if (jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, obj2)) {
                    return;
                }
            } else if (obj3.equals(obj2)) {
                return;
            }
        }
        if (obj2 == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer_findAndAddDynamic)) {
            return;
        }
        if (!jsonSerializer_findAndAddDynamic.isUnwrappingSerializer()) {
            jsonGenerator.writeFieldName(this._name);
        }
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            jsonSerializer_findAndAddDynamic.serialize(obj2, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer_findAndAddDynamic.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    protected UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }
}
