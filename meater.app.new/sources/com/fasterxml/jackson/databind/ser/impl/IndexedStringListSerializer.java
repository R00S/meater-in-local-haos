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
import java.util.List;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();

    protected IndexedStringListSerializer() {
        super(List.class);
    }

    private final void _serializeUnwrapped(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, 1);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, 1);
        }
    }

    private final void serializeContents(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                String str = list.get(i3);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
            } catch (Exception e2) {
                wrapAndThrow(serializerProvider, e2, list, i3);
                return;
            }
        }
    }

    private final void serializeUsingCustom(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i2) throws IOException {
        int i3 = 0;
        try {
            JsonSerializer<String> jsonSerializer = this._serializer;
            while (i3 < i2) {
                String str = list.get(i3);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonSerializer.serialize(str, jsonGenerator, serializerProvider);
                }
                i3++;
            }
        } catch (Exception e2) {
            wrapAndThrow(serializerProvider, e2, list, i3);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new IndexedStringListSerializer(this, jsonSerializer, bool);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(indexedStringListSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            _serializeUnwrapped(list, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(size);
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, size);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        int size = list.size();
        typeSerializer.writeTypePrefixForArray(list, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, size);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
        }
        typeSerializer.writeTypeSuffixForArray(list, jsonGenerator);
    }
}
