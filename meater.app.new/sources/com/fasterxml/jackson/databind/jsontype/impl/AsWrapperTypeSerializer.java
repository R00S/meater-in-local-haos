package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class AsWrapperTypeSerializer extends TypeSerializerBase {
    public AsWrapperTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        super(typeIdResolver, beanProperty);
    }

    protected String _validTypeId(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.EnumC5961As getTypeInclusion() {
        return JsonTypeInfo.EnumC5961As.WRAPPER_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeArrayFieldStart(_validTypeId(str));
        } else {
            if (str != null) {
                jsonGenerator.writeTypeId(str);
            }
            jsonGenerator.writeStartArray();
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectFieldStart(_validTypeId(str));
        } else {
            if (str != null) {
                jsonGenerator.writeTypeId(str);
            }
            jsonGenerator.writeStartObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (jsonGenerator.canWriteTypeId()) {
            return;
        }
        writeTypeSuffixForArray(obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (jsonGenerator.canWriteTypeId()) {
            return;
        }
        writeTypeSuffixForObject(obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        String strIdFromValue = idFromValue(obj);
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeArrayFieldStart(_validTypeId(strIdFromValue));
        } else {
            if (strIdFromValue != null) {
                jsonGenerator.writeTypeId(strIdFromValue);
            }
            jsonGenerator.writeStartArray();
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        String strIdFromValue = idFromValue(obj);
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectFieldStart(_validTypeId(strIdFromValue));
        } else {
            if (strIdFromValue != null) {
                jsonGenerator.writeTypeId(strIdFromValue);
            }
            jsonGenerator.writeStartObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        String strIdFromValue = idFromValue(obj);
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(_validTypeId(strIdFromValue));
        } else if (strIdFromValue != null) {
            jsonGenerator.writeTypeId(strIdFromValue);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeEndArray();
        if (jsonGenerator.canWriteTypeId()) {
            return;
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeEndObject();
        if (jsonGenerator.canWriteTypeId()) {
            return;
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (jsonGenerator.canWriteTypeId()) {
            return;
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public AsWrapperTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsWrapperTypeSerializer(this._idResolver, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        String strIdFromValueAndType = idFromValueAndType(obj, cls);
        if (!jsonGenerator.canWriteTypeId()) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(_validTypeId(strIdFromValueAndType));
        } else if (strIdFromValueAndType != null) {
            jsonGenerator.writeTypeId(strIdFromValueAndType);
        }
    }
}
