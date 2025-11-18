package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.p176io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class ParserBase extends ParserMinimalBase {
    static final BigDecimal BD_MAX_INT;
    static final BigDecimal BD_MAX_LONG;
    static final BigDecimal BD_MIN_INT;
    static final BigDecimal BD_MIN_LONG;
    static final BigInteger BI_MAX_INT;
    static final BigInteger BI_MAX_LONG;
    static final BigInteger BI_MIN_INT;
    static final BigInteger BI_MIN_LONG;
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        BI_MIN_INT = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        BI_MAX_INT = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = bigIntegerValueOf4;
        BD_MIN_LONG = new BigDecimal(bigIntegerValueOf3);
        BD_MAX_LONG = new BigDecimal(bigIntegerValueOf4);
        BD_MIN_INT = new BigDecimal(bigIntegerValueOf);
        BD_MAX_INT = new BigDecimal(bigIntegerValueOf2);
    }

    protected ParserBase(IOContext iOContext, int i2) {
        super(i2);
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector(this) : null);
    }

    private void _parseSlowFloat(int i2) throws IOException {
        try {
            if (i2 == 16) {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } else {
                this._numberDouble = this._textBuffer.contentsAsDouble();
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e2) {
            _wrapError("Malformed numeric value '" + this._textBuffer.contentsAsString() + "'", e2);
        }
    }

    private void _parseSlowInt(int i2, char[] cArr, int i3, int i4) throws IOException {
        String strContentsAsString = this._textBuffer.contentsAsString();
        try {
            if (NumberInput.inLongRange(cArr, i3, i4, this._numberNegative)) {
                this._numberLong = Long.parseLong(strContentsAsString);
                this._numTypesValid = 2;
            } else {
                this._numberBigInt = new BigInteger(strContentsAsString);
                this._numTypesValid = 4;
            }
        } catch (NumberFormatException e2) {
            _wrapError("Malformed numeric value '" + strContentsAsString + "'", e2);
        }
    }

    protected void _checkStdFeatureChanges(int i2, int i3) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i3 & mask) == 0 || (i2 & mask) == 0) {
            return;
        }
        if (this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        } else {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
    }

    protected abstract void _closeInput() throws IOException;

    protected final int _decodeBase64Escape(Base64Variant base64Variant, int i2, int i3) throws IOException {
        if (i2 != 92) {
            throw reportInvalidBase64Char(base64Variant, i2, i3);
        }
        char c_decodeEscaped = _decodeEscaped();
        if (c_decodeEscaped <= ' ' && i3 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char((int) c_decodeEscaped);
        if (iDecodeBase64Char >= 0) {
            return iDecodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i3);
    }

    protected abstract char _decodeEscaped() throws IOException;

    protected final int _eofAsNextChar() throws JsonParseException {
        _handleEOF();
        return -1;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected void _handleEOF() throws JsonParseException {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(this._ioContext.getSourceReference())), null);
    }

    protected int _parseIntValue() throws IOException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            int i2 = this._intLength;
            if (this._numberNegative) {
                textOffset++;
            }
            if (i2 <= 9) {
                int i3 = NumberInput.parseInt(textBuffer, textOffset, i2);
                if (this._numberNegative) {
                    i3 = -i3;
                }
                this._numberInt = i3;
                this._numTypesValid = 1;
                return i3;
            }
        }
        _parseNumericValue(1);
        if ((this._numTypesValid & 1) == 0) {
            convertNumberToInt();
        }
        return this._numberInt;
    }

    protected void _parseNumericValue(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i2);
                return;
            }
            _reportError("Current token (" + this._currToken + ") not numeric, can not use numeric value accessors");
            return;
        }
        char[] textBuffer = this._textBuffer.getTextBuffer();
        int textOffset = this._textBuffer.getTextOffset();
        int i3 = this._intLength;
        if (this._numberNegative) {
            textOffset++;
        }
        if (i3 <= 9) {
            int i4 = NumberInput.parseInt(textBuffer, textOffset, i3);
            if (this._numberNegative) {
                i4 = -i4;
            }
            this._numberInt = i4;
            this._numTypesValid = 1;
            return;
        }
        if (i3 > 18) {
            _parseSlowInt(i2, textBuffer, textOffset, i3);
            return;
        }
        long j2 = NumberInput.parseLong(textBuffer, textOffset, i3);
        boolean z = this._numberNegative;
        if (z) {
            j2 = -j2;
        }
        if (i3 == 10) {
            if (z) {
                if (j2 >= -2147483648L) {
                    this._numberInt = (int) j2;
                    this._numTypesValid = 1;
                    return;
                }
            } else if (j2 <= 2147483647L) {
                this._numberInt = (int) j2;
                this._numTypesValid = 1;
                return;
            }
        }
        this._numberLong = j2;
        this._numTypesValid = 2;
    }

    protected void _releaseBuffers() throws IOException {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    protected void _reportMismatchedEndMarker(int i2, char c2) throws JsonParseException {
        _reportError("Unexpected close marker '" + ((char) i2) + "': expected '" + c2 + "' (for " + this._parsingContext.typeDesc() + " starting at " + (HttpUrl.FRAGMENT_ENCODE_SET + this._parsingContext.getStartLocation(this._ioContext.getSourceReference())) + ")");
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }

    protected void convertNumberToBigDecimal() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i2 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i2 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    protected void convertNumberToBigInteger() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i2 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i2 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i2 & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i2 & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((i2 & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    protected void convertNumberToInt() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 2) != 0) {
            long j2 = this._numberLong;
            int i3 = (int) j2;
            if (i3 != j2) {
                _reportError("Numeric value (" + getText() + ") out of range of int");
            }
            this._numberInt = i3;
        } else if ((i2 & 4) != 0) {
            if (BI_MIN_INT.compareTo(this._numberBigInt) > 0 || BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this._numberDouble;
            if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i2 & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i2 & 4) != 0) {
            if (BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this._numberDouble;
            if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i2 & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return (float) getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            return (this._numTypesValid & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i2 = this._numTypesValid;
        return (i2 & 1) != 0 ? JsonParser.NumberType.INT : (i2 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._numTypesValid;
            return (i2 & 1) != 0 ? Integer.valueOf(this._numberInt) : (i2 & 2) != 0 ? Long.valueOf(this._numberLong) : (i2 & 4) != 0 ? this._numberBigInt : this._numberBigDecimal;
        }
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i3 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((i3 ^ (-1)) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i2, i3, null);
    }

    protected void reportInvalidNumber(String str) throws JsonParseException {
        _reportError("Invalid numeric value: " + str);
    }

    protected void reportOverflowInt() throws IOException {
        _reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", getText(), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    protected void reportOverflowLong() throws IOException {
        _reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", getText(), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    protected void reportUnexpectedNumberChar(int i2, String str) throws JsonParseException {
        String str2 = "Unexpected character (" + ParserMinimalBase._getCharDesc(i2) + ") in numeric value";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    protected final JsonToken reset(boolean z, int i2, int i3, int i4) {
        return (i3 >= 1 || i4 >= 1) ? resetFloat(z, i2, i3, i4) : resetInt(z, i2);
    }

    protected final JsonToken resetAsNaN(String str, double d2) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d2;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetFloat(boolean z, int i2, int i3, int i4) {
        this._numberNegative = z;
        this._intLength = i2;
        this._fractLength = i3;
        this._expLength = i4;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetInt(boolean z, int i2) {
        this._numberNegative = z;
        this._intLength = i2;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        if (i3 != 0) {
            this._features = i2;
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3, String str) throws IllegalArgumentException {
        String str2;
        if (i2 <= 32) {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(i2) + ") as character #" + (i3 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (base64Variant.usesPaddingChar(i2)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i3 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i2) || Character.isISOControl(i2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i2) + "' (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    protected final int _decodeBase64Escape(Base64Variant base64Variant, char c2, int i2) throws IOException {
        if (c2 == '\\') {
            char c_decodeEscaped = _decodeEscaped();
            if (c_decodeEscaped <= ' ' && i2 == 0) {
                return -1;
            }
            int iDecodeBase64Char = base64Variant.decodeBase64Char(c_decodeEscaped);
            if (iDecodeBase64Char >= 0) {
                return iDecodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i2);
        }
        throw reportInvalidBase64Char(base64Variant, c2, i2);
    }
}
