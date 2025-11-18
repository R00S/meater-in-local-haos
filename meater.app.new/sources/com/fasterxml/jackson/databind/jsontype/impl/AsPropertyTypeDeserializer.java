package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

/* loaded from: classes2.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    protected final JsonTypeInfo.EnumC5961As _inclusion;

    public AsPropertyTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2, JsonTypeInfo.EnumC5961As enumC5961As) {
        super(javaType, typeIdResolver, str, z, javaType2);
        this._inclusion = enumC5961As;
    }

    protected Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer) throws IOException {
        String text = jsonParser.getText();
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, text);
        if (this._typeIdVisible) {
            if (tokenBuffer == null) {
                tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
            }
            tokenBuffer.writeFieldName(jsonParser.getCurrentName());
            tokenBuffer.writeString(text);
        }
        if (tokenBuffer != null) {
            jsonParser.clearCurrentToken();
            jsonParser = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
        }
        jsonParser.nextToken();
        return jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    protected Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (jsonDeserializer_findDefaultImplDeserializer != null) {
            if (tokenBuffer != null) {
                tokenBuffer.writeEndObject();
                jsonParser = tokenBuffer.asParser(jsonParser);
                jsonParser.nextToken();
            }
            return jsonDeserializer_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
        }
        Object objDeserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
        if (objDeserializeIfNatural != null) {
            return objDeserializeIfNatural;
        }
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            return super.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        deserializationContext.reportWrongTokenException(jsonParser, JsonToken.FIELD_NAME, "missing property '" + this._typePropertyName + "' that is to contain type id  (for class " + baseTypeName() + ")", new Object[0]);
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.getCurrentToken() == JsonToken.START_ARRAY ? super.deserializeTypedFromArray(jsonParser, deserializationContext) : deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        TokenBuffer tokenBuffer = null;
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        } else if (currentToken != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null);
        }
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (currentName.equals(this._typePropertyName)) {
                return _deserializeTypedForId(jsonParser, deserializationContext, tokenBuffer);
            }
            if (tokenBuffer == null) {
                tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
            }
            tokenBuffer.writeFieldName(currentName);
            tokenBuffer.copyCurrentStructure(jsonParser);
            currentToken = jsonParser.nextToken();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, tokenBuffer);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.EnumC5961As getTypeInclusion() {
        return this._inclusion;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }
}
