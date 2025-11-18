package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer {
    protected final Class<?> _enumClass;
    protected KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        this._mapType = javaType;
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    protected EnumMap<?, ?> constructMap() {
        return new EnumMap<>(this._enumClass);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer keyDeserializerFindKeyDeserializer = this._keyDeserializer;
        if (keyDeserializerFindKeyDeserializer == null) {
            keyDeserializerFindKeyDeserializer = deserializationContext.findKeyDeserializer(this._mapType.getKeyType(), beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        JavaType contentType = this._mapType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._valueTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return withResolved(keyDeserializerFindKeyDeserializer, jsonDeserializerFindContextualValueDeserializer, typeDeserializerForProperty);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
    }

    public EnumMapDeserializer withResolved(KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer) {
        return (keyDeserializer == this._keyDeserializer && jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this._mapType, keyDeserializer, jsonDeserializer, this._valueTypeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        EnumMap<?, ?> enumMapConstructMap = constructMap();
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (jsonParser.nextToken() == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            Enum r4 = (Enum) this._keyDeserializer.deserializeKey(currentName, deserializationContext);
            if (r4 != null) {
                try {
                    enumMapConstructMap.put((EnumMap<?, ?>) r4, (Enum) (jsonParser.nextToken() == JsonToken.VALUE_NULL ? jsonDeserializer.getNullValue(deserializationContext) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer)));
                } catch (Exception e2) {
                    wrapAndThrow(e2, enumMapConstructMap, currentName);
                    return null;
                }
            } else {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, currentName, "value not one of declared Enum instance names for %s", this._mapType.getKeyType());
                }
                jsonParser.nextToken();
                jsonParser.skipChildren();
            }
        }
        return enumMapConstructMap;
    }
}
