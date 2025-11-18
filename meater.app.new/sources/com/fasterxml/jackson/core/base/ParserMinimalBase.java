package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p176io.JsonEOFException;
import com.fasterxml.jackson.core.p176io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ParserMinimalBase extends JsonParser {
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    protected ParserMinimalBase(int i2) {
        super(i2);
    }

    protected static final String _getCharDesc(int i2) {
        char c2 = (char) i2;
        if (Character.isISOControl(c2)) {
            return "(CTRL-CHAR, code " + i2 + ")";
        }
        if (i2 <= 255) {
            return "'" + c2 + "' (code " + i2 + ")";
        }
        return "'" + c2 + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    protected final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    protected void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e2) {
            _reportError(e2.getMessage());
        }
    }

    protected abstract void _handleEOF() throws JsonParseException;

    protected char _handleUnrecognizedCharacterEscape(char c2) throws JsonProcessingException {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c2;
        }
        if (c2 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c2;
        }
        _reportError("Unrecognized character escape " + _getCharDesc(c2));
        return c2;
    }

    protected boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    protected final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    protected void _reportInvalidEOF() throws JsonParseException {
        _reportInvalidEOF(" in " + this._currToken, this._currToken);
    }

    protected void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        _reportInvalidEOF(jsonToken == JsonToken.VALUE_STRING ? " in a String value" : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", jsonToken);
    }

    protected void _reportMissingRootWS(int i2) throws JsonParseException {
        _reportUnexpectedChar(i2, "Expected space separating root-level values");
    }

    protected void _reportUnexpectedChar(int i2, String str) throws JsonParseException {
        if (i2 < 0) {
            _reportInvalidEOF();
        }
        String str2 = "Unexpected character (" + _getCharDesc(i2) + ")";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    protected final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    protected void _throwInvalidSpace(int i2) throws JsonParseException {
        _reportError("Illegal character (" + _getCharDesc((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    protected void _throwUnquotedSpace(int i2, String str) throws JsonParseException {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            _reportError("Illegal unquoted character (" + _getCharDesc((char) i2) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m12940id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getIntValue() : getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getLongValue() : getValueAsLong(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? getText() : jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i2) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i2 == 0 : jsonToken.m12940id() == i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws IOException {
        JsonToken jsonTokenNextToken = nextToken();
        return jsonTokenNextToken == JsonToken.FIELD_NAME ? nextToken() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            JsonToken jsonTokenNextToken = nextToken();
            if (jsonTokenNextToken == null) {
                _handleEOF();
                return this;
            }
            if (jsonTokenNextToken.isStructStart()) {
                i2++;
            } else if (jsonTokenNextToken.isStructEnd() && i2 - 1 == 0) {
                return this;
            }
        }
    }

    protected void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i2;
        }
        int iM12940id = jsonToken.m12940id();
        if (iM12940id != 6) {
            switch (iM12940id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).intValue() : i2;
                default:
                    return i2;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0;
        }
        return NumberInput.parseAsInt(text, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j2;
        }
        int iM12940id = jsonToken.m12940id();
        if (iM12940id != 6) {
            switch (iM12940id) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).longValue() : j2;
                default:
                    return j2;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0L;
        }
        return NumberInput.parseAsLong(text, j2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }
}
