package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    protected StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i2, String str4, String str5) {
        return new StackTraceElement(str, str2, str3, i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT) {
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        String text = HttpUrl.FRAGMENT_ENCODE_SET;
        String text2 = null;
        String text3 = null;
        String text4 = HttpUrl.FRAGMENT_ENCODE_SET;
        String text5 = text4;
        int intValue = -1;
        while (true) {
            JsonToken jsonTokenNextValue = jsonParser.nextValue();
            if (jsonTokenNextValue == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, text4, text, text5, intValue, text2, text3);
            }
            String currentName = jsonParser.getCurrentName();
            if ("className".equals(currentName)) {
                text4 = jsonParser.getText();
            } else if ("fileName".equals(currentName)) {
                text5 = jsonParser.getText();
            } else if ("lineNumber".equals(currentName)) {
                if (!jsonTokenNextValue.isNumeric()) {
                    return (StackTraceElement) deserializationContext.handleUnexpectedToken(handledType(), jsonTokenNextValue, jsonParser, "Non-numeric token (%s) for property 'lineNumber'", jsonTokenNextValue);
                }
                intValue = jsonParser.getIntValue();
            } else if ("methodName".equals(currentName)) {
                text = jsonParser.getText();
            } else if (!"nativeMethod".equals(currentName)) {
                if ("moduleName".equals(currentName)) {
                    text2 = jsonParser.getText();
                } else if ("moduleVersion".equals(currentName)) {
                    text3 = jsonParser.getText();
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                }
            }
        }
    }
}
