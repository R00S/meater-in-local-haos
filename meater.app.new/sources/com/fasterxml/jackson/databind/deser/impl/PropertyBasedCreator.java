package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class PropertyBasedCreator {
    protected final SettableBeanProperty[] _allProperties;
    protected final int _propertyCount;
    protected final HashMap<String, SettableBeanProperty> _propertyLookup;
    protected final ValueInstantiator _valueInstantiator;

    static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        CaseInsensitiveMap() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get((Object) ((String) obj).toLowerCase());
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put((CaseInsensitiveMap) str.toLowerCase(), (String) settableBeanProperty);
        }
    }

    protected PropertyBasedCreator(ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) {
        this._valueInstantiator = valueInstantiator;
        if (z) {
            this._propertyLookup = new CaseInsensitiveMap();
        } else {
            this._propertyLookup = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this._propertyCount = length;
        this._allProperties = new SettableBeanProperty[length];
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i2];
            this._allProperties[i2] = settableBeanProperty;
            this._propertyLookup.put(settableBeanProperty.getName(), settableBeanProperty);
        }
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i2];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i2] = settableBeanPropertyWithValueDeserializer;
        }
        return new PropertyBasedCreator(valueInstantiator, settableBeanPropertyArr2, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    public Object build(DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer) throws IOException {
        Object objCreateFromObjectWith = this._valueInstantiator.createFromObjectWith(deserializationContext, this._allProperties, propertyValueBuffer);
        if (objCreateFromObjectWith != null) {
            objCreateFromObjectWith = propertyValueBuffer.handleIdValue(deserializationContext, objCreateFromObjectWith);
            for (PropertyValue propertyValueBuffered = propertyValueBuffer.buffered(); propertyValueBuffered != null; propertyValueBuffered = propertyValueBuffered.next) {
                propertyValueBuffered.assign(objCreateFromObjectWith);
            }
        }
        return objCreateFromObjectWith;
    }

    public SettableBeanProperty findCreatorProperty(String str) {
        return this._propertyLookup.get(str);
    }

    public PropertyValueBuffer startBuilding(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new PropertyValueBuffer(jsonParser, deserializationContext, this._propertyCount, objectIdReader);
    }
}
