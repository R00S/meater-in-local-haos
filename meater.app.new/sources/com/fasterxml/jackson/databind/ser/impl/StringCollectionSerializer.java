package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.Collection;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    protected StringCollectionSerializer() {
        super(Collection.class);
    }

    private final void _serializeUnwrapped(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._serializer != null) {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
            return;
        }
        int i2 = 0;
        for (String str : collection) {
            if (str == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, collection, i2);
                }
            } else {
                jsonGenerator.writeString(str);
            }
            i2++;
        }
    }

    private void serializeUsingCustom(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<String> jsonSerializer = this._serializer;
        for (String str : collection) {
            if (str == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, collection, 0);
                }
            } else {
                jsonSerializer.serialize(str, jsonGenerator, serializerProvider);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new StringCollectionSerializer(this, jsonSerializer, bool);
    }

    protected StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(stringCollectionSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            _serializeUnwrapped(collection, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(size);
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        typeSerializer.writeTypePrefixForArray(collection, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForArray(collection, jsonGenerator);
    }
}
