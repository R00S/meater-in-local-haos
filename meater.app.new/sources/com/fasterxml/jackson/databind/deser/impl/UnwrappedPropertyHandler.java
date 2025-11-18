package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UnwrappedPropertyHandler {
    protected final List<SettableBeanProperty> _properties;

    public UnwrappedPropertyHandler() {
        this._properties = new ArrayList();
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        this._properties.add(settableBeanProperty);
    }

    public Object processUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        int size = this._properties.size();
        for (int i2 = 0; i2 < size; i2++) {
            SettableBeanProperty settableBeanProperty = this._properties.get(i2);
            JsonParser jsonParserAsParser = tokenBuffer.asParser();
            jsonParserAsParser.nextToken();
            settableBeanProperty.deserializeAndSet(jsonParserAsParser, deserializationContext, obj);
        }
        return obj;
    }

    public UnwrappedPropertyHandler renameAll(NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this._properties.size());
        for (SettableBeanProperty settableBeanProperty : this._properties) {
            SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
            JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
            if (valueDeserializer != null && (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) != valueDeserializer) {
                settableBeanPropertyWithSimpleName = settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
            }
            arrayList.add(settableBeanPropertyWithSimpleName);
        }
        return new UnwrappedPropertyHandler(arrayList);
    }

    protected UnwrappedPropertyHandler(List<SettableBeanProperty> list) {
        this._properties = list;
    }
}
