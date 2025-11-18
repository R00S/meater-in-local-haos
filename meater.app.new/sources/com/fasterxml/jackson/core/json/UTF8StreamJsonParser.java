package com.fasterxml.jackson.core.json;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.p176io.CharTypes;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class UTF8StreamJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public UTF8StreamJsonParser(IOContext iOContext, int i2, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i3, int i4, boolean z) {
        super(iOContext, i2);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._currInputRowStart = i3;
        this._currInputProcessed = -i3;
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i3))) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    private final int _decodeUtf8_2(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        return ((i2 & 31) << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
        int i6 = (i3 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b3 = bArr2[i7];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i8);
        }
        return (i6 << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_3fast(int i2) throws IOException {
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
        int i6 = (i3 << 6) | (b2 & 63);
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b3 = bArr2[i7];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i8);
        }
        return (i6 << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_4(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        int i5 = ((i2 & 7) << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b3 = bArr2[i6];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i7);
        }
        int i8 = (i5 << 6) | (b3 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i9 = this._inputPtr;
        int i10 = i9 + 1;
        this._inputPtr = i10;
        byte b4 = bArr3[i9];
        if ((b4 & 192) != 128) {
            _reportInvalidOther(b4 & 255, i10);
        }
        return ((i8 << 6) | (b4 & 63)) - 65536;
    }

    private final void _finishString2(char[] cArr, int i2) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i3 = this._inputPtr;
            }
            int i4 = 0;
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArr.length - i2) + i3);
            while (true) {
                if (i3 >= iMin) {
                    this._inputPtr = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i_decodeEscaped = bArr[i3] & 255;
                if (iArr[i_decodeEscaped] != 0) {
                    this._inputPtr = i5;
                    if (i_decodeEscaped == 34) {
                        this._textBuffer.setCurrentLength(i2);
                        return;
                    }
                    int i6 = iArr[i_decodeEscaped];
                    if (i6 == 1) {
                        i_decodeEscaped = _decodeEscaped();
                    } else if (i6 == 2) {
                        i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                    } else if (i6 == 3) {
                        i_decodeEscaped = this._inputEnd - i5 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                    } else if (i6 == 4) {
                        int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                        int i7 = i2 + 1;
                        cArr[i2] = (char) (55296 | (i_decodeUtf8_4 >> 10));
                        if (i7 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } else {
                            i2 = i7;
                        }
                        i_decodeEscaped = (i_decodeUtf8_4 & 1023) | 56320;
                    } else if (i_decodeEscaped < 32) {
                        _throwUnquotedSpace(i_decodeEscaped, "string value");
                    } else {
                        _reportInvalidChar(i_decodeEscaped);
                    }
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i4 = i2;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i_decodeEscaped;
                } else {
                    cArr[i2] = (char) i_decodeEscaped;
                    i3 = i5;
                    i2++;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i2) throws IOException {
        int i3;
        int i4;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (i4 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i4 != 93 && i4 != 125) {
            _checkMatchEnd(str, i2, i4);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) throws IOException {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i2 == 45) {
            JsonToken jsonToken_parseNegNumber = _parseNegNumber();
            this._currToken = jsonToken_parseNegNumber;
            return jsonToken_parseNegNumber;
        }
        if (i2 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i2 == 102) {
            _matchToken(AdultContentAnalytics.UNLOCK, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchToken("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i2 == 123) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        switch (i2) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonToken_parsePosNumber = _parsePosNumber(i2);
                this._currToken = jsonToken_parsePosNumber;
                return jsonToken_parsePosNumber;
            default:
                JsonToken jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i2);
                this._currToken = jsonToken_handleUnexpectedValue;
                return jsonToken_handleUnexpectedValue;
        }
    }

    private final JsonToken _parseFloat(char[] cArr, int i2, int i3, boolean z, int i4) throws IOException {
        int i5;
        boolean z2;
        int i6 = 0;
        if (i3 == 46) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            cArr[i2] = (char) i3;
            i2++;
            i5 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                i3 = bArr[i7] & 255;
                if (i3 < 48 || i3 > 57) {
                    break;
                }
                i5++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i2++;
            }
            z2 = false;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i3, "Decimal point not followed by a digit");
            }
        } else {
            i5 = 0;
            z2 = false;
        }
        if (i3 == 101 || i3 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i8 = i2 + 1;
            cArr[i2] = (char) i3;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            int i10 = bArr2[i9] & 255;
            if (i10 == 45 || i10 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i11 = i8 + 1;
                cArr[i8] = (char) i10;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                i10 = bArr3[i12] & 255;
                i8 = i11;
            }
            i3 = i10;
            int i13 = 0;
            while (i3 <= 57 && i3 >= 48) {
                i13++;
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i14 = i8 + 1;
                cArr[i8] = (char) i3;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i6 = i13;
                    i2 = i14;
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                i3 = bArr4[i15] & 255;
                i8 = i14;
            }
            i6 = i13;
            i2 = i8;
            if (i6 == 0) {
                reportUnexpectedNumberChar(i3, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i3);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        return resetFloat(z, i4, i5, i6);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i2, boolean z, int i3) throws IOException {
        int i4;
        int i5;
        char[] cArrFinishCurrentSegment = cArr;
        int i6 = i2;
        int i7 = i3;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i6);
                return resetInt(z, i7);
            }
            byte[] bArr = this._inputBuffer;
            int i8 = this._inputPtr;
            i4 = i8 + 1;
            this._inputPtr = i4;
            i5 = bArr[i8] & 255;
            if (i5 > 57 || i5 < 48) {
                break;
            }
            if (i6 >= cArrFinishCurrentSegment.length) {
                i6 = 0;
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i6] = (char) i5;
            i7++;
            i6++;
        }
        if (i5 == 46 || i5 == 101 || i5 == 69) {
            return _parseFloat(cArrFinishCurrentSegment, i6, i5, z, i7);
        }
        this._inputPtr = i4 - 1;
        this._textBuffer.setCurrentLength(i6);
        if (this._parsingContext.inRoot()) {
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            _verifyRootSpace(bArr2[i9] & 255);
        }
        return resetInt(z, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void _skipCComment() throws java.io.IOException {
        /*
            r5 = this;
            int[] r0 = com.fasterxml.jackson.core.p176io.CharTypes.getInputCodeComment()
        L4:
            int r1 = r5._inputPtr
            int r2 = r5._inputEnd
            if (r1 < r2) goto L10
            boolean r1 = r5._loadMore()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            int r3 = r2 + 1
            r5._inputPtr = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5._reportInvalidChar(r1)
            goto L4
        L39:
            int r1 = r5._inputEnd
            if (r3 < r1) goto L4a
            boolean r1 = r5._loadMore()
            if (r1 != 0) goto L4a
        L43:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r5._reportInvalidEOF(r1, r0)
            return
        L4a:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5._inputPtr = r2
            return
        L59:
            r5._skipCR()
            goto L4
        L5d:
            int r1 = r5._currInputRow
            int r1 = r1 + 1
            r5._currInputRow = r1
            r5._currInputRowStart = r3
            goto L4
        L66:
            r5._skipUtf8_4(r1)
            goto L4
        L6a:
            r5._skipUtf8_3()
            goto L4
        L6e:
            r5._skipUtf8_2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i2 = this._inputPtr;
        if (i2 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b2 = bArr[i2];
        if (b2 == 58) {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            byte b3 = bArr[i3];
            if (b3 > 32) {
                if (b3 == 47 || b3 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i3 + 1;
                return b3;
            }
            if (b3 == 32 || b3 == 9) {
                int i4 = i3 + 1;
                this._inputPtr = i4;
                byte b4 = bArr[i4];
                if (b4 > 32) {
                    if (b4 == 47 || b4 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i4 + 1;
                    return b4;
                }
            }
            return _skipColon2(true);
        }
        if (b2 == 32 || b2 == 9) {
            int i5 = i2 + 1;
            this._inputPtr = i5;
            b2 = bArr[i5];
        }
        if (b2 != 58) {
            return _skipColon2(false);
        }
        int i6 = this._inputPtr + 1;
        this._inputPtr = i6;
        byte b5 = bArr[i6];
        if (b5 > 32) {
            if (b5 == 47 || b5 == 35) {
                return _skipColon2(true);
            }
            this._inputPtr = i6 + 1;
            return b5;
        }
        if (b5 == 32 || b5 == 9) {
            int i7 = i6 + 1;
            this._inputPtr = i7;
            byte b6 = bArr[i7];
            if (b6 > 32) {
                if (b6 == 47 || b6 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i7 + 1;
                return b6;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 == 47) {
                    _skipComment();
                } else if (i4 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i4;
                    }
                    if (i4 != 58) {
                        _reportUnexpectedChar(i4, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final void _skipComment() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 == 47) {
            _skipLine();
        } else if (i3 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i3, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            int i5 = inputCodeComment[i4];
            if (i5 != 0) {
                if (i5 == 2) {
                    _skipUtf8_2();
                } else if (i5 == 3) {
                    _skipUtf8_3();
                } else if (i5 == 4) {
                    _skipUtf8_4(i4);
                } else if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (i5 == 13) {
                    _skipCR();
                    return;
                } else if (i5 != 42 && i5 < 0) {
                    _reportInvalidChar(i4);
                }
            }
        }
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i3);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i5);
        }
    }

    private final void _skipUtf8_4(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i6);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b4 = bArr3[i7];
        if ((b4 & 192) != 128) {
            _reportInvalidOther(b4 & 255, i8);
        }
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 != 47 && i4 != 35) {
                    return i4;
                }
                this._inputPtr = i3 - 1;
                return _skipWS2();
            }
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final int _skipWS2() throws IOException {
        int i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            i2 = bArr[i3] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return i2;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (i4 > 32) {
            if (i4 != 47 && i4 != 35) {
                return i4;
            }
            this._inputPtr = i3 - 1;
            return _skipWSOrEnd2();
        }
        if (i4 != 32) {
            if (i4 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i4 == 13) {
                _skipCR();
            } else if (i4 != 9) {
                _throwInvalidSpace(i4);
            }
        }
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            byte[] bArr2 = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr2[i5] & 255;
            if (i7 > 32) {
                if (i7 != 47 && i7 != 35) {
                    return i7;
                }
                this._inputPtr = i6 - 1;
                return _skipWSOrEnd2();
            }
            if (i7 != 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                } else if (i7 == 13) {
                    _skipCR();
                } else if (i7 != 9) {
                    _throwInvalidSpace(i7);
                }
            }
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            i2 = bArr[i3] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return i2;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() throws IOException {
        int i2;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i2 = this._inputBuffer[this._inputPtr] & 255) < 48 || i2 > 57) {
            return 48;
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i2 == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i3 = this._inputPtr;
                i2 = bArr[i3] & 255;
                if (i2 < 48 || i2 > 57) {
                    return 48;
                }
                this._inputPtr = i3 + 1;
            } while (i2 == 48);
        }
        return i2;
    }

    private final void _verifyRootSpace(int i2) throws IOException {
        int i3 = this._inputPtr + 1;
        this._inputPtr = i3;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i2 == 13) {
                _skipCR();
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String addName(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i2, int i3) throws JsonParseException {
        int iPad = pad(i2, i3);
        String strFindName = this._symbols.findName(iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = iPad;
        return addName(iArr, 1, i3);
    }

    public static int[] growArrayBy(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : Arrays.copyOf(iArr, iArr.length + i2);
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return bArr[i2] & 255;
    }

    private static final int pad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    private final String parseName(int i2, int i3, int i4) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    protected final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i3 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i3);
                if (iDecodeBase64Char < 0) {
                    if (i3 == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i3, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                int i5 = bArr2[i4] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i5);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i5, 1);
                }
                int i6 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i8);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i8 == 34 && !base64Variant.usesPadding()) {
                            byteArrayBuilder_getByteArrayBuilder.append(i6 >> 4);
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i8, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        int i10 = bArr4[i9] & 255;
                        if (!base64Variant.usesPaddingChar(i10)) {
                            throw reportInvalidBase64Char(base64Variant, i10, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i6 >> 4);
                    }
                }
                int i11 = (i6 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                int i13 = bArr5[i12] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i13);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i13 == 34 && !base64Variant.usesPadding()) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i13, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i11 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int _decodeCharForError(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L68
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L12
            r7 = r7 & 31
        L10:
            r0 = 1
            goto L2c
        L12:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L1c
            r7 = r7 & 15
            r0 = 2
            goto L2c
        L1c:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L26
            r7 = r7 & 7
            r0 = 3
            goto L2c
        L26:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r0)
            goto L10
        L2c:
            int r3 = r6.nextByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L3b
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3b:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L68
            int r2 = r6.nextByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L4f
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L4f:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L68
            int r0 = r6.nextByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L63
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L63:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b3 = bArr2[i5];
            int iCharToHex = CharTypes.charToHex(b3);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(b3, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | iCharToHex;
        }
        return (char) i3;
    }

    protected String _finishAndReturnString() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (iArr[i4] == 0) {
                i2++;
                cArrEmptyAndGetCurrentSegment[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this._inputPtr = i2 + 1;
                return this._textBuffer.setCurrentAndReturn(i3);
            }
        }
        this._inputPtr = i2;
        _finishString2(cArrEmptyAndGetCurrentSegment, i3);
        return this._textBuffer.contentsAsString();
    }

    protected void _finishString() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (iArr[i4] == 0) {
                i2++;
                cArrEmptyAndGetCurrentSegment[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                return;
            }
        }
        this._inputPtr = i2;
        _finishString2(cArrEmptyAndGetCurrentSegment, i3);
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iM12940id = jsonToken.m12940id();
        return iM12940id != 5 ? (iM12940id == 6 || iM12940id == 7 || iM12940id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() throws IOException {
        int i2;
        int i_decodeEscaped;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i3 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i4 = this._inputEnd;
            int length = this._inputPtr + (cArrEmptyAndGetCurrentSegment.length - i3);
            if (length < i4) {
                i4 = length;
            }
            while (true) {
                int i5 = this._inputPtr;
                if (i5 < i4) {
                    i2 = i5 + 1;
                    this._inputPtr = i2;
                    i_decodeEscaped = bArr[i5] & 255;
                    if (i_decodeEscaped == 39 || iArr[i_decodeEscaped] != 0) {
                        break;
                    }
                    cArrEmptyAndGetCurrentSegment[i3] = (char) i_decodeEscaped;
                    i3++;
                }
            }
            if (i_decodeEscaped == 39) {
                this._textBuffer.setCurrentLength(i3);
                return JsonToken.VALUE_STRING;
            }
            int i6 = iArr[i_decodeEscaped];
            if (i6 == 1) {
                i_decodeEscaped = _decodeEscaped();
            } else if (i6 == 2) {
                i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
            } else if (i6 == 3) {
                i_decodeEscaped = this._inputEnd - i2 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
            } else if (i6 != 4) {
                if (i_decodeEscaped < 32) {
                    _throwUnquotedSpace(i_decodeEscaped, "string value");
                }
                _reportInvalidChar(i_decodeEscaped);
            } else {
                int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                int i7 = i3 + 1;
                cArrEmptyAndGetCurrentSegment[i3] = (char) (55296 | (i_decodeUtf8_4 >> 10));
                if (i7 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                } else {
                    i3 = i7;
                }
                i_decodeEscaped = 56320 | (i_decodeUtf8_4 & 1023);
            }
            if (i3 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            cArrEmptyAndGetCurrentSegment[i3] = (char) i_decodeEscaped;
            i3++;
        }
    }

    protected JsonToken _handleInvalidNumberStart(int i2, boolean z) throws IOException {
        String str;
        while (i2 == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3];
            if (i2 != 78) {
                if (i2 != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected String _handleOddName(int i2) throws IOException {
        if (i2 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar((char) _decodeCharForError(i2), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 < 4) {
                i3++;
                i5 = i2 | (i5 << 8);
            } else {
                if (i4 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i4] = i5;
                i5 = i2;
                i4++;
                i3 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i6 = this._inputPtr;
            i2 = bArr[i6] & 255;
            if (inputCodeUtf8JsNames[i2] != 0) {
                break;
            }
            this._inputPtr = i6 + 1;
        }
        if (i3 > 0) {
            if (i4 >= iArrGrowArrayBy.length) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i4] = i5;
            i4++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i4);
        return strFindName == null ? addName(iArrGrowArrayBy, i4, i3) : strFindName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L95
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L7b
            r0 = 78
            if (r4 == r0) goto L61
            r0 = 93
            if (r4 == r0) goto L42
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L5b
            r0 = 43
            if (r4 == r0) goto L1f
            r0 = 44
            if (r4 == r0) goto L4b
            goto La2
        L1f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L30
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L30
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L30:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L42:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L4b
            goto La2
        L4b:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L5b
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5b:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L95
        L61:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L75
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L75:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto La2
        L7b:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L8f
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L8f:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto La2
        L95:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto La2
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        La2:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lbf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        Lbf:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        int i2 = this._inputEnd;
        this._currInputProcessed += i2;
        this._currInputRowStart -= i2;
        this._nameStartOffset -= i2;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int i3 = inputStream.read(bArr, 0, length);
        if (i3 > 0) {
            this._inputPtr = 0;
            this._inputEnd = i3;
            return true;
        }
        _closeInput();
        if (i3 == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
        }
        return false;
    }

    protected void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected final void _matchToken(String str, int i2) throws IOException {
        int i3;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        int i4 = this._inputBuffer[i3] & 255;
        if (i4 < 48 || i4 == 93 || i4 == 125) {
            return;
        }
        _checkMatchEnd(str, i2, i4);
    }

    protected String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i_decodeEscaped = bArr[i2] & 255;
        if (i_decodeEscaped == 39) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = _icLatin1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i_decodeEscaped != 39) {
            if (i_decodeEscaped != 34 && iArr[i_decodeEscaped] != 0) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, "name");
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i3 >= 4) {
                        if (i4 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i4] = i5;
                        i4++;
                        i3 = 0;
                        i5 = 0;
                    }
                    if (i_decodeEscaped < 2048) {
                        i5 = (i5 << 8) | (i_decodeEscaped >> 6) | 192;
                        i3++;
                    } else {
                        int i6 = (i5 << 8) | (i_decodeEscaped >> 12) | 224;
                        int i7 = i3 + 1;
                        if (i7 >= 4) {
                            if (i4 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i4] = i6;
                            i4++;
                            i7 = 0;
                            i6 = 0;
                        }
                        i5 = (i6 << 8) | ((i_decodeEscaped >> 6) & 63) | 128;
                        i3 = i7 + 1;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i5 = i_decodeEscaped | (i5 << 8);
            } else {
                if (i4 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i4] = i5;
                i5 = i_decodeEscaped;
                i4++;
                i3 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i_decodeEscaped = bArr2[i8] & 255;
        }
        if (i3 > 0) {
            if (i4 >= iArrGrowArrayBy.length) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i4] = pad(i5, i3);
            i4++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i4);
        return strFindName == null ? addName(iArrGrowArrayBy, i4, i3) : strFindName;
    }

    protected final String _parseName(int i2) throws IOException {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int i3 = this._inputPtr;
        if (i3 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? HttpUrl.FRAGMENT_ENCODE_SET : parseName(0, i5, 0);
        }
        int i6 = i4 + 1;
        this._inputPtr = i6;
        int i7 = bArr[i4] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? findName(i5, 1) : parseName(i5, i7, 1);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i6 + 1;
        this._inputPtr = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? findName(i8, 2) : parseName(i8, i10, 2);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = i9 + 1;
        this._inputPtr = i12;
        int i13 = bArr[i9] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? findName(i11, 3) : parseName(i11, i13, 3);
        }
        int i14 = (i11 << 8) | i13;
        this._inputPtr = i12 + 1;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? findName(i14, 4) : parseName(i14, i15, 4);
        }
        this._quad1 = i14;
        return parseMediumName(i15);
    }

    protected JsonToken _parseNegNumber() throws IOException {
        int i2;
        int i3;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        int i_verifyNoLeadingZeroes = bArr[i4] & 255;
        if (i_verifyNoLeadingZeroes < 48 || i_verifyNoLeadingZeroes > 57) {
            return _handleInvalidNumberStart(i_verifyNoLeadingZeroes, true);
        }
        if (i_verifyNoLeadingZeroes == 48) {
            i_verifyNoLeadingZeroes = _verifyNoLeadingZeroes();
        }
        int i5 = 2;
        cArrEmptyAndGetCurrentSegment[1] = (char) i_verifyNoLeadingZeroes;
        int length = (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 2;
        int i6 = this._inputEnd;
        if (length > i6) {
            length = i6;
        }
        int i7 = 1;
        while (true) {
            int i8 = this._inputPtr;
            if (i8 >= length) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i5, true, i7);
            }
            byte[] bArr2 = this._inputBuffer;
            i2 = i8 + 1;
            this._inputPtr = i2;
            i3 = bArr2[i8] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i7++;
            cArrEmptyAndGetCurrentSegment[i5] = (char) i3;
            i5++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i5, i3, true, i7);
        }
        this._inputPtr = i2 - 1;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(true, i7);
    }

    protected JsonToken _parsePosNumber(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i2 == 48) {
            i2 = _verifyNoLeadingZeroes();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i2;
        int length = (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 1;
        int i5 = this._inputEnd;
        if (length > i5) {
            length = i5;
        }
        int i6 = 1;
        int i7 = 1;
        while (true) {
            int i8 = this._inputPtr;
            if (i8 >= length) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i6, false, i7);
            }
            byte[] bArr = this._inputBuffer;
            i3 = i8 + 1;
            this._inputPtr = i3;
            i4 = bArr[i8] & 255;
            if (i4 < 48 || i4 > 57) {
                break;
            }
            i7++;
            cArrEmptyAndGetCurrentSegment[i6] = (char) i4;
            i6++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i6, i4, false, i7);
        }
        this._inputPtr = i3 - 1;
        this._textBuffer.setCurrentLength(i6);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i4);
        }
        return resetInt(false, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r8
      0x00d7: PHI (r8v7 int) = (r8v6 int), (r8v14 int) binds: [B:27:0x0077, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int _readBinary(com.fasterxml.jackson.core.Base64Variant r13, java.io.OutputStream r14, byte[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() throws IOException {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = ByteArrayBuilder.NO_BYTES;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    protected void _reportInvalidChar(int i2) throws JsonParseException {
        if (i2 < 32) {
            _throwInvalidSpace(i2);
        }
        _reportInvalidInitial(i2);
    }

    protected void _reportInvalidInitial(int i2) throws JsonParseException {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i2));
    }

    protected void _reportInvalidOther(int i2) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i2));
    }

    protected void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    protected final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (bArr[i2] == 10) {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            int i3 = this._inputEnd;
            if (i2 >= i3) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            while (true) {
                if (i2 >= i3) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (iArr[i5] != 0) {
                    this._inputPtr = i4;
                    if (i5 == 34) {
                        return;
                    }
                    int i6 = iArr[i5];
                    if (i6 == 1) {
                        _decodeEscaped();
                    } else if (i6 == 2) {
                        _skipUtf8_2();
                    } else if (i6 == 3) {
                        _skipUtf8_3();
                    } else if (i6 == 4) {
                        _skipUtf8_4(i5);
                    } else if (i5 < 32) {
                        _throwUnquotedSpace(i5, "string value");
                    } else {
                        _reportInvalidChar(i5);
                    }
                } else {
                    i2 = i4;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iM12940id = jsonToken.m12940id();
        if (iM12940id != 5) {
            if (iM12940id != 6) {
                if (iM12940id != 7 && iM12940id != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iM12940id = jsonToken.m12940id();
        if (iM12940id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iM12940id != 6) {
            if (iM12940id != 7 && iM12940id != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.m12940id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        Object sourceReference = this._ioContext.getSourceReference();
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(sourceReference, this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(sourceReference, (this._nameStartOffset - 1) + this._currInputProcessed, -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
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

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (i_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String str_parseName = _parseName(i_skipWSOrEnd);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (i_skipColon == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (i_skipColon == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchToken(AdultContentAnalytics.UNLOCK, 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchToken("true", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon != 123) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseNegNumber = _parsePosNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return str_parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(i_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(i_skipWSOrEnd));
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (i_skipColon == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (i_skipColon == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchToken(AdultContentAnalytics.UNLOCK, 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchToken("true", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon != 123) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseNegNumber = _parsePosNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return this._currToken;
    }

    protected final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    break;
                }
                if (i4 != 92) {
                    _throwUnquotedSpace(i4, "name");
                } else {
                    i4 = _decodeEscaped();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (i5 >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i5 = 0;
                    }
                    if (i4 < 2048) {
                        i3 = (i3 << 8) | (i4 >> 6) | 192;
                        i5++;
                    } else {
                        int i7 = (i3 << 8) | (i4 >> 12) | 224;
                        int i8 = i5 + 1;
                        if (i8 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i2] = i7;
                            i2++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        i3 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        i5 = i8 + 1;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (i5 < 4) {
                i5++;
                i3 = (i3 << 8) | i4;
            } else {
                if (i2 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i4 = bArr[i9] & 255;
        }
        if (i5 > 0) {
            if (i2 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i2] = pad(i3, i5);
            i2++;
        }
        String strFindName = this._symbols.findName(iArr, i2);
        return strFindName == null ? addName(iArr, i2, i5) : strFindName;
    }

    protected final String parseLongName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i6, 0, i5, 0);
            }
            int i8 = i7 + 1;
            this._inputPtr = i8;
            int i9 = bArr[i7] & 255;
            if (iArr2[i9] != 0) {
                return i9 == 34 ? findName(this._quadBuffer, i6, i5, 1) : parseEscapedName(this._quadBuffer, i6, i5, i9, 1);
            }
            int i10 = (i5 << 8) | i9;
            int i11 = i8 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i8] & 255;
            if (iArr2[i12] != 0) {
                return i12 == 34 ? findName(this._quadBuffer, i6, i10, 2) : parseEscapedName(this._quadBuffer, i6, i10, i12, 2);
            }
            int i13 = (i10 << 8) | i12;
            int i14 = i11 + 1;
            this._inputPtr = i14;
            int i15 = bArr[i11] & 255;
            if (iArr2[i15] != 0) {
                return i15 == 34 ? findName(this._quadBuffer, i6, i13, 3) : parseEscapedName(this._quadBuffer, i6, i13, i15, 3);
            }
            int i16 = (i13 << 8) | i15;
            this._inputPtr = i14 + 1;
            int i17 = bArr[i14] & 255;
            if (iArr2[i17] != 0) {
                return i17 == 34 ? findName(this._quadBuffer, i6, i16, 4) : parseEscapedName(this._quadBuffer, i6, i16, i17, 4);
            }
            int[] iArr3 = this._quadBuffer;
            if (i6 >= iArr3.length) {
                this._quadBuffer = growArrayBy(iArr3, i6);
            }
            this._quadBuffer[i6] = i16;
            i5 = i17;
            i6++;
        }
    }

    protected final String parseMediumName(int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? findName(this._quad1, i2, 1) : parseName(this._quad1, i2, i5, 1);
        }
        int i6 = (i2 << 8) | i5;
        int i7 = i4 + 1;
        this._inputPtr = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? findName(this._quad1, i6, 2) : parseName(this._quad1, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        this._inputPtr = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? findName(this._quad1, i9, 3) : parseName(this._quad1, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this._inputPtr = i10 + 1;
        int i13 = bArr[i10] & 255;
        return iArr[i13] != 0 ? i13 == 34 ? findName(this._quad1, i12, 4) : parseName(this._quad1, i12, i13, 4) : parseMediumName2(i13, i12);
    }

    protected final String parseMediumName2(int i2, int i3) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        int i6 = bArr[i4] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? findName(this._quad1, i3, i2, 1) : parseName(this._quad1, i3, i2, i6, 1);
        }
        int i7 = (i2 << 8) | i6;
        int i8 = i5 + 1;
        this._inputPtr = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? findName(this._quad1, i3, i7, 2) : parseName(this._quad1, i3, i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i8 + 1;
        this._inputPtr = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? findName(this._quad1, i3, i10, 3) : parseName(this._quad1, i3, i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this._inputPtr = i11 + 1;
        int i14 = bArr[i11] & 255;
        return iArr[i14] != 0 ? i14 == 34 ? findName(this._quad1, i3, i13, 4) : parseName(this._quad1, i3, i13, i14, 4) : parseLongName(i14, i3, i13);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    protected String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        return i3 == 34 ? HttpUrl.FRAGMENT_ENCODE_SET : parseEscapedName(this._quadBuffer, 0, 0, i3, 0);
    }

    private final String parseName(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    protected void _reportInvalidOther(int i2, int i3) throws JsonParseException {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
    }

    protected void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c_decodeCharForError = (char) _decodeCharForError(bArr[i2]);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                break;
            } else {
                sb.append(c_decodeCharForError);
            }
        }
        _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    private final String findName(int i2, int i3, int i4) throws JsonParseException {
        int iPad = pad(i3, i4);
        String strFindName = this._symbols.findName(i2, iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = iPad;
        return addName(iArr, 2, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i2);
        }
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if ((i3 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    private final String findName(int i2, int i3, int i4, int i5) throws JsonParseException {
        int iPad = pad(i4, i5);
        String strFindName = this._symbols.findName(i2, i3, iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = pad(iPad, i5);
        return addName(iArr, 3, i5);
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) throws JsonParseException {
        if (i2 >= iArr.length) {
            iArr = growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = pad(i3, i4);
        String strFindName = this._symbols.findName(iArr, i5);
        return strFindName == null ? addName(iArr, i5, i4) : strFindName;
    }
}
