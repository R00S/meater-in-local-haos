package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.p176io.MergedStream;
import com.fasterxml.jackson.core.p176io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes2.dex */
public final class ByteSourceJsonBootstrapper {
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private boolean _bigEndian = true;
    private int _inputPtr = 0;
    private int _inputEnd = 0;
    private final boolean _bufferRecyclable = true;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
    }

    private boolean checkUTF16(int i2) {
        if ((65280 & i2) == 0) {
            this._bigEndian = true;
        } else {
            if ((i2 & 255) != 0) {
                return false;
            }
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i2) throws IOException {
        if ((i2 >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i2) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i2) == 0) {
            reportWeirdUCS4("3412");
        } else {
            if ((i2 & (-65281)) != 0) {
                return false;
            }
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i2) throws IOException {
        if (i2 == -16842752) {
            reportWeirdUCS4("3412");
        } else {
            if (i2 == -131072) {
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                this._bigEndian = false;
                return true;
            }
            if (i2 == 65279) {
                this._bigEndian = true;
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                return true;
            }
            if (i2 == 65534) {
                reportWeirdUCS4("2143");
            }
        }
        int i3 = i2 >>> 16;
        if (i3 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        }
        if (i3 == 65534) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = false;
            return true;
        }
        if ((i2 >>> 8) != 15711167) {
            return false;
        }
        this._inputPtr += 3;
        this._bytesPerChar = 1;
        this._bigEndian = true;
        return true;
    }

    private void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public JsonParser constructParser(int i2, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i3) throws IOException {
        if (detectEncoding() != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new ReaderBasedJsonParser(this._context, i2, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i3));
        }
        return new UTF8StreamJsonParser(this._context, i2, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i3), this._inputBuffer, this._inputPtr, this._inputEnd, this._bufferRecyclable);
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int iBits = encoding.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                throw new RuntimeException("Internal error");
            }
            IOContext iOContext = this._context;
            return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
        }
        InputStream mergedStream = this._in;
        if (mergedStream == null) {
            mergedStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
        } else if (this._inputPtr < this._inputEnd) {
            mergedStream = new MergedStream(this._context, mergedStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(mergedStream, encoding.getJavaName());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.ensureLoaded(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L42
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.handleBOM(r1)
            if (r5 == 0) goto L32
            goto L5e
        L32:
            boolean r5 = r8.checkUTF32(r1)
            if (r5 == 0) goto L39
            goto L5e
        L39:
            int r1 = r1 >>> 16
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L5f
            goto L5e
        L42:
            boolean r1 = r8.ensureLoaded(r2)
            if (r1 == 0) goto L5f
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L5f
        L5e:
            r4 = 1
        L5f:
            if (r4 != 0) goto L64
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L8a
        L64:
            int r1 = r8._bytesPerChar
            if (r1 == r3) goto L88
            if (r1 == r2) goto L7e
            if (r1 != r0) goto L76
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L73
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L8a
        L73:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L8a
        L76:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L7e:
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L85
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L8a
        L85:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L8a
        L88:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L8a:
            com.fasterxml.jackson.core.io.IOContext r1 = r8._context
            r1.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    protected boolean ensureLoaded(int i2) throws IOException {
        int i3;
        int i4 = this._inputEnd - this._inputPtr;
        while (i4 < i2) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i3 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i5 = this._inputEnd;
                i3 = inputStream.read(bArr, i5, bArr.length - i5);
            }
            if (i3 < 1) {
                return false;
            }
            this._inputEnd += i3;
            i4 += i3;
        }
        return true;
    }
}
