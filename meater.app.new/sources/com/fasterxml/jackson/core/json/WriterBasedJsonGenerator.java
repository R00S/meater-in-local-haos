package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p176io.CharTypes;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.p176io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar;
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i2, objectCodec);
        this._quoteChar = '\"';
        this._writer = writer;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = cArrAllocConcatBuffer;
        this._outputEnd = cArrAllocConcatBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c2, int i2) throws IOException {
        int i3;
        if (i2 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i4 = this._outputTail;
            int i5 = i4 + 1;
            this._outputTail = i5;
            cArr[i4] = '\\';
            this._outputTail = i5 + 1;
            cArr[i5] = (char) i2;
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            serializableString.getClass();
            String value = serializableString.getValue();
            this._currentEscape = null;
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i6 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        int i7 = i6 + 1;
        cArr2[i6] = '\\';
        int i8 = i7 + 1;
        cArr2[i7] = 'u';
        if (c2 > 255) {
            int i9 = 255 & (c2 >> '\b');
            int i10 = i8 + 1;
            char[] cArr3 = HEX_CHARS;
            cArr2[i8] = cArr3[i9 >> 4];
            i3 = i10 + 1;
            cArr2[i10] = cArr3[i9 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i11 = i8 + 1;
            cArr2[i8] = '0';
            i3 = i11 + 1;
            cArr2[i11] = '0';
        }
        int i12 = i3 + 1;
        char[] cArr4 = HEX_CHARS;
        cArr2[i3] = cArr4[c2 >> 4];
        cArr2[i12] = cArr4[c2 & 15];
        this._outputTail = i12 + 1;
    }

    private void _prependOrWriteCharacterEscape(char c2, int i2) throws IOException {
        int i3;
        if (i2 >= 0) {
            int i4 = this._outputTail;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this._outputHead = i5;
                char[] cArr = this._outputBuffer;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i2;
                return;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr_allocateEntityBuffer[1] = (char) i2;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            serializableString.getClass();
            String value = serializableString.getValue();
            this._currentEscape = null;
            int length = value.length();
            int i6 = this._outputTail;
            if (i6 < length) {
                this._outputHead = i6;
                this._writer.write(value);
                return;
            } else {
                int i7 = i6 - length;
                this._outputHead = i7;
                value.getChars(0, length, this._outputBuffer, i7);
                return;
            }
        }
        int i8 = this._outputTail;
        if (i8 < 6) {
            char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
            if (cArr_allocateEntityBuffer2 == null) {
                cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c2 <= 255) {
                char[] cArr2 = HEX_CHARS;
                cArr_allocateEntityBuffer2[6] = cArr2[c2 >> 4];
                cArr_allocateEntityBuffer2[7] = cArr2[c2 & 15];
                this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
                return;
            }
            int i9 = (c2 >> '\b') & 255;
            int i10 = c2 & 255;
            char[] cArr3 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr3[i9 >> 4];
            cArr_allocateEntityBuffer2[11] = cArr3[i9 & 15];
            cArr_allocateEntityBuffer2[12] = cArr3[i10 >> 4];
            cArr_allocateEntityBuffer2[13] = cArr3[i10 & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return;
        }
        char[] cArr4 = this._outputBuffer;
        int i11 = i8 - 6;
        this._outputHead = i11;
        cArr4[i11] = '\\';
        int i12 = i11 + 1;
        cArr4[i12] = 'u';
        if (c2 > 255) {
            int i13 = (c2 >> '\b') & 255;
            int i14 = i12 + 1;
            char[] cArr5 = HEX_CHARS;
            cArr4[i14] = cArr5[i13 >> 4];
            i3 = i14 + 1;
            cArr4[i3] = cArr5[i13 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i15 = i12 + 1;
            cArr4[i15] = '0';
            i3 = i15 + 1;
            cArr4[i3] = '0';
        }
        int i16 = i3 + 1;
        char[] cArr6 = HEX_CHARS;
        cArr4[i16] = cArr6[c2 >> 4];
        cArr4[i16 + 1] = cArr6[c2 & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = bArr[i2];
            i5++;
            i2++;
        }
        int iMin = Math.min(i4, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0) {
                break;
            }
            int i7 = inputStream.read(bArr, i5, i6);
            if (i7 < 0) {
                return i5;
            }
            i5 += i7;
        } while (i5 < 3);
        return i5;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this._outputEnd;
            if (i2 + i3 > length) {
                i3 = length - i2;
            }
            int i4 = i2 + i3;
            str.getChars(i2, i4, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i3);
            } else {
                int i5 = this._maximumNonEscapedChar;
                if (i5 != 0) {
                    _writeSegmentASCII(i3, i5);
                } else {
                    _writeSegment(i3);
                }
            }
            if (i4 >= length) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i2] = 'n';
        int i3 = i2 + 1;
        cArr[i3] = 'u';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        int i5 = i4 + 1;
        cArr[i5] = 'l';
        this._outputTail = i5 + 1;
    }

    private void _writeQuotedInt(int i2) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr[i3] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(i2, cArr, i4);
        this._outputTail = iOutputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j2) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int iOutputLong = NumberOutput.outputLong(j2, cArr, i3);
        this._outputTail = iOutputLong;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        cArr2[iOutputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    private void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s, cArr, i3);
        this._outputTail = iOutputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeSegment(int i2) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i3 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        while (i3 < i2) {
            do {
                cArr = this._outputBuffer;
                c2 = cArr[i3];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i3++;
                }
            } while (i3 < i2);
            int i4 = i3 - i_prependOrWriteCharacterEscape;
            if (i4 > 0) {
                this._writer.write(cArr, i_prependOrWriteCharacterEscape, i4);
                if (i3 >= i2) {
                    return;
                }
            }
            i3++;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i3, i2, c2, iArr[c2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r4
      0x001d: PHI (r4v5 int) = (r4v2 int), (r4v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentASCII(int r13, int r14) throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            if (r2 >= r13) goto L3a
        Le:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r2]
            if (r10 >= r1) goto L19
            r4 = r0[r10]
            if (r4 == 0) goto L1d
            goto L21
        L19:
            if (r10 <= r14) goto L1d
            r4 = -1
            goto L21
        L1d:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
        L21:
            int r6 = r2 - r3
            if (r6 <= 0) goto L2d
            java.io.Writer r7 = r12._writer
            r7.write(r5, r3, r6)
            if (r2 < r13) goto L2d
            goto L3a
        L2d:
            int r2 = r2 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r8 = r2
            r9 = r13
            r11 = r4
            int r3 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            goto Lc
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentCustom(int r13) throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r12._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto La
            r1 = 65535(0xffff, float:9.1834E-41)
        La:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            r4 = 0
        L13:
            if (r3 >= r13) goto L44
        L15:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r3]
            if (r10 >= r2) goto L26
            r6 = r0[r10]
            if (r6 == 0) goto L21
        L1f:
            r11 = r6
            goto L2a
        L21:
            int r3 = r3 + 1
            if (r3 < r13) goto L15
            goto L1f
        L26:
            if (r10 <= r1) goto L42
            r6 = -1
            r11 = -1
        L2a:
            int r6 = r3 - r4
            if (r6 <= 0) goto L36
            java.io.Writer r7 = r12._writer
            r7.write(r5, r4, r6)
            if (r3 < r13) goto L36
            goto L44
        L36:
            int r3 = r3 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r8 = r3
            r9 = r13
            int r4 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            goto L13
        L42:
            r13 = 0
            throw r13
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentCustom(int):void");
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd;
        if (length > i2) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i2) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(length, i3);
        } else {
            _writeString2(length);
        }
    }

    private void _writeString2(int i2) throws IOException {
        int i3;
        int i4 = this._outputTail + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i4) {
            do {
                char[] cArr = this._outputBuffer;
                int i5 = this._outputTail;
                char c2 = cArr[i5];
                if (c2 >= length || iArr[c2] == 0) {
                    i3 = i5 + 1;
                    this._outputTail = i3;
                } else {
                    int i6 = this._outputHead;
                    int i7 = i5 - i6;
                    if (i7 > 0) {
                        this._writer.write(cArr, i6, i7);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i8 = this._outputTail;
                    this._outputTail = i8 + 1;
                    char c3 = cArr2[i8];
                    _prependOrWriteCharacterEscape(c3, iArr[c3]);
                }
            } while (i3 < i4);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(int r9, int r10) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    private void _writeStringCustom(int i2) throws IOException {
        int i3;
        int i4;
        int i5 = this._outputTail + i2;
        int[] iArr = this._outputEscapes;
        int i6 = this._maximumNonEscapedChar;
        if (i6 < 1) {
            i6 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        int iMin = Math.min(iArr.length, i6 + 1);
        while (this._outputTail < i5) {
            do {
                char[] cArr = this._outputBuffer;
                int i7 = this._outputTail;
                char c2 = cArr[i7];
                if (c2 < iMin) {
                    i3 = iArr[c2];
                    if (i3 == 0) {
                        i4 = i7 + 1;
                        this._outputTail = i4;
                    }
                } else {
                    if (c2 <= i6) {
                        throw null;
                    }
                    i3 = -1;
                }
                int i8 = this._outputHead;
                int i9 = i7 - i8;
                if (i9 > 0) {
                    this._writer.write(cArr, i8, i9);
                }
                this._outputTail++;
                _prependOrWriteCharacterEscape(c2, i3);
            } while (i4 < i5);
            return;
        }
    }

    private void writeRawLong(String str) throws IOException {
        int i2 = this._outputEnd;
        int i3 = this._outputTail;
        int i4 = i2 - i3;
        str.getChars(0, i4, this._outputBuffer, i3);
        this._outputTail += i4;
        _flushBuffer();
        int length = str.length() - i4;
        while (true) {
            int i5 = this._outputEnd;
            if (length <= i5) {
                str.getChars(i4, i4 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i6 = i4 + i5;
                str.getChars(i4, i6, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i5;
                _flushBuffer();
                length -= i5;
                i4 = i6;
            }
        }
    }

    protected void _flushBuffer() throws IOException {
        int i2 = this._outputTail;
        int i3 = this._outputHead;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i3, i4);
        }
    }

    protected void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    protected void _verifyValueWrite(String str) throws IOException {
        char c2;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            c2 = ',';
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c2 = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    protected void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i3 - 3;
        int i5 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i2 <= i4) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i6 = i2 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i2] << 8) | (bArr[i6] & 255)) << 8;
            int i9 = i7 + 1;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i10 = iEncodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i2 = i9;
        }
        int i11 = i3 - i2;
        if (i11 > 0) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i12 = i2 + 1;
            int i13 = bArr[i2] << 16;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i13, i11, this._outputBuffer, this._outputTail);
        }
    }

    protected void _writeFieldName(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = this._quoteChar;
    }

    protected void _writePPFieldName(String str, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        int i2;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i3] = 't';
            int i4 = i3 + 1;
            cArr[i4] = 'r';
            int i5 = i4 + 1;
            cArr[i5] = 'u';
            i2 = i5 + 1;
            cArr[i2] = 'e';
        } else {
            cArr[i3] = 'f';
            int i6 = i3 + 1;
            cArr[i6] = 'a';
            int i7 = i6 + 1;
            cArr[i7] = 'l';
            int i8 = i7 + 1;
            cArr[i8] = 's';
            i2 = i8 + 1;
            cArr[i2] = 'e';
        }
        this._outputTail = i2 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd - this._outputTail;
        if (i2 == 0) {
            _flushBuffer();
            i2 = this._outputEnd - this._outputTail;
        }
        if (i2 < length) {
            writeRawLong(str);
        } else {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext jsonWriteContextCreateChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = jsonWriteContextCreateChildObjectContext;
        if (obj != null) {
            jsonWriteContextCreateChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i2 < 0) {
                i2 = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer);
            } else {
                int i_writeBinary = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer, i2);
                if (i_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + i_writeBinary + " bytes (out of " + i2 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            cArr2[i4] = this._quoteChar;
            return i2;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        if (i3 < 32) {
            if (i3 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i3);
            this._outputTail += i3;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        _writeString(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr3[i5] = this._quoteChar;
    }

    private void _writeString(char[] cArr, int i2, int i3) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i2, i3);
            return;
        }
        int i4 = this._maximumNonEscapedChar;
        if (i4 != 0) {
            _writeStringASCII(cArr, i2, i3, i4);
            return;
        }
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i2 < i5) {
            int i6 = i2;
            do {
                char c2 = cArr[i6];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i6++;
                }
            } while (i6 < i5);
            int i7 = i6 - i2;
            if (i7 < 32) {
                if (this._outputTail + i7 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i7);
                    this._outputTail += i7;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i7);
            }
            if (i6 >= i5) {
                return;
            }
            i2 = i6 + 1;
            char c3 = cArr[i6];
            _appendCharacterEscape(c3, iArr[c3]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(char[] r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8._outputEscapes
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8._outputTail
            int r6 = r6 + r5
            int r7 = r8._outputEnd
            if (r6 <= r7) goto L2f
            r8._flushBuffer()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8._outputBuffer
            int r7 = r8._outputTail
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8._outputTail
            int r10 = r10 + r5
            r8._outputTail = r10
            goto L46
        L3e:
            r8._flushBuffer()
            java.io.Writer r6 = r8._writer
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8._appendCharacterEscape(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(char[], int, int, int):void");
    }

    protected void _writePPFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    protected void _writeFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr2[i3] = this._quoteChar;
        int length = cArrAsQuotedChars.length;
        if (i4 + length + 1 >= this._outputEnd) {
            writeRaw(cArrAsQuotedChars, 0, length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr3 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            cArr3[i5] = this._quoteChar;
            return;
        }
        System.arraycopy(cArrAsQuotedChars, 0, cArr2, i4, length);
        int i6 = this._outputTail + length;
        this._outputTail = i6;
        char[] cArr4 = this._outputBuffer;
        this._outputTail = i6 + 1;
        cArr4[i6] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j2);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j2, this._outputBuffer, this._outputTail);
    }

    private void _writeStringCustom(char[] cArr, int i2, int i3) throws IOException {
        char c2;
        int i4;
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int i6 = this._maximumNonEscapedChar;
        if (i6 < 1) {
            i6 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        int iMin = Math.min(iArr.length, i6 + 1);
        while (i2 < i5) {
            int i7 = i2;
            while (true) {
                c2 = cArr[i7];
                if (c2 < iMin) {
                    i4 = iArr[c2];
                    if (i4 != 0 || (i7 = i7 + 1) >= i5) {
                        break;
                    }
                } else {
                    if (c2 <= i6) {
                        throw null;
                    }
                    i4 = -1;
                }
            }
            int i8 = i7 - i2;
            if (i8 < 32) {
                if (this._outputTail + i8 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i8);
                    this._outputTail += i8;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i8);
            }
            if (i7 >= i5) {
                return;
            }
            i2 = i7 + 1;
            _appendCharacterEscape(c2, i4);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    protected int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) throws IOException {
        int i_readMore;
        int i3 = this._outputEnd - 6;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = 0;
        int i_readMore2 = 0;
        while (true) {
            if (i2 <= 2) {
                break;
            }
            if (i6 > i5) {
                i_readMore2 = _readMore(inputStream, bArr, i6, i_readMore2, i2);
                if (i_readMore2 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = i_readMore2 - 3;
                i6 = 0;
            }
            if (this._outputTail > i3) {
                _flushBuffer();
            }
            int i7 = i6 + 1;
            int i8 = bArr[i6] << 8;
            int i9 = i7 + 1;
            i6 = i9 + 1;
            i2 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i7] & 255) | i8) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i10 = iEncodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i2 <= 0 || (i_readMore = _readMore(inputStream, bArr, i6, i_readMore2, i2)) <= 0) {
            return i2;
        }
        if (this._outputTail > i3) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        if (1 < i_readMore) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i11, i4, this._outputBuffer, this._outputTail);
        return i2 - i4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(cArrAsQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || (!Double.isNaN(d2) && !Double.isInfinite(d2)))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d2));
        } else {
            writeString(String.valueOf(d2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || (!Float.isNaN(f2) && !Float.isInfinite(f2)))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f2));
        } else {
            writeString(String.valueOf(f2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    protected int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i_readMore = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i4) {
                i_readMore = _readMore(inputStream, bArr, i5, i_readMore, bArr.length);
                if (i_readMore < 3) {
                    break;
                }
                i4 = i_readMore - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i7 = i5 + 1;
            int i8 = bArr[i5] << 8;
            int i9 = i7 + 1;
            i5 = i9 + 1;
            i6 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i7] & 255) | i8) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i10 = iEncodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i_readMore <= 0) {
            return i6;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        if (1 < i_readMore) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i12 = i6 + i3;
        this._outputTail = base64Variant.encodeBase64Partial(i11, i3, this._outputBuffer, this._outputTail);
        return i12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i2, int i3, char c2, int i4) throws IOException {
        int i5;
        if (i4 >= 0) {
            if (i2 > 1 && i2 < i3) {
                int i6 = i2 - 2;
                cArr[i6] = '\\';
                cArr[i6 + 1] = (char) i4;
                return i6;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            cArr_allocateEntityBuffer[1] = (char) i4;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return i2;
        }
        if (i4 == -2) {
            SerializableString serializableString = this._currentEscape;
            serializableString.getClass();
            String value = serializableString.getValue();
            this._currentEscape = null;
            int length = value.length();
            if (i2 >= length && i2 < i3) {
                int i7 = i2 - length;
                value.getChars(0, length, cArr, i7);
                return i7;
            }
            this._writer.write(value);
            return i2;
        }
        if (i2 > 5 && i2 < i3) {
            int i8 = i2 - 6;
            int i9 = i8 + 1;
            cArr[i8] = '\\';
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c2 > 255) {
                int i11 = (c2 >> '\b') & 255;
                int i12 = i10 + 1;
                char[] cArr2 = HEX_CHARS;
                cArr[i10] = cArr2[i11 >> 4];
                i5 = i12 + 1;
                cArr[i12] = cArr2[i11 & 15];
                c2 = (char) (c2 & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i5 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i5 + 1;
            char[] cArr3 = HEX_CHARS;
            cArr[i5] = cArr3[c2 >> 4];
            cArr[i14] = cArr3[c2 & 15];
            return i14 - 5;
        }
        char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
        if (cArr_allocateEntityBuffer2 == null) {
            cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
        }
        this._outputHead = this._outputTail;
        if (c2 > 255) {
            int i15 = (c2 >> '\b') & 255;
            int i16 = c2 & 255;
            char[] cArr4 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr4[i15 >> 4];
            cArr_allocateEntityBuffer2[11] = cArr4[i15 & 15];
            cArr_allocateEntityBuffer2[12] = cArr4[i16 >> 4];
            cArr_allocateEntityBuffer2[13] = cArr4[i16 & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return i2;
        }
        char[] cArr5 = HEX_CHARS;
        cArr_allocateEntityBuffer2[6] = cArr5[c2 >> 4];
        cArr_allocateEntityBuffer2[7] = cArr5[c2 & 15];
        this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
        return i2;
    }
}
