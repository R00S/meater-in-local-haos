package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class TypeWrappedDeserializer extends JsonDeserializer<Object> implements Serializable {
    protected final JsonDeserializer<Object> _deserializer;
    protected final TypeDeserializer _typeDeserializer;

    public TypeWrappedDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this._typeDeserializer = typeDeserializer;
        this._deserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._deserializer.handledType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }
}
