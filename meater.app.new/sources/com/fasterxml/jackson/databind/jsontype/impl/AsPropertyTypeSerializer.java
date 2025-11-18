package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;

/* loaded from: classes2.dex */
public class AsPropertyTypeSerializer extends AsArrayTypeSerializer {
    protected final String _typePropertyName;

    public AsPropertyTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this._typePropertyName = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.EnumC5961As getTypeInclusion() {
        return JsonTypeInfo.EnumC5961As.PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (str == null) {
            jsonGenerator.writeStartObject();
        } else if (jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeTypeId(str);
            jsonGenerator.writeStartObject();
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        String strIdFromValue = idFromValue(obj);
        if (strIdFromValue == null) {
            jsonGenerator.writeStartObject();
        } else if (jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeTypeId(strIdFromValue);
            jsonGenerator.writeStartObject();
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField(this._typePropertyName, strIdFromValue);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public AsPropertyTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsPropertyTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }
}
