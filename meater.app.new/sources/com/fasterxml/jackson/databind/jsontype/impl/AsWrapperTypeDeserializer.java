package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    public AsWrapperTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    protected Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenNextToken != jsonToken2) {
                deserializationContext.reportWrongTokenException(jsonParser, jsonToken2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (currentToken != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String text = jsonParser.getText();
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, text);
        jsonParser.nextToken();
        if (this._typeIdVisible && jsonParser.getCurrentToken() == jsonToken) {
            TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
            tokenBuffer.writeStartObject();
            tokenBuffer.writeFieldName(this._typePropertyName);
            tokenBuffer.writeString(text);
            jsonParser.clearCurrentToken();
            jsonParser = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
            jsonParser.nextToken();
        }
        Object objDeserialize = jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenNextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.EnumC5961As getTypeInclusion() {
        return JsonTypeInfo.EnumC5961As.WRAPPER_OBJECT;
    }

    protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
