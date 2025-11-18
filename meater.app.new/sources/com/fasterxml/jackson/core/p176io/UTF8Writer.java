package com.fasterxml.jackson.core.p176io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class UTF8Writer extends Writer {
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr = 0;
    private int _surrogate;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        this._outBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBufferEnd = r1.length - 4;
    }

    protected static void illegalSurrogate(int i2) throws IOException {
        throw new IOException(illegalSurrogateDesc(i2));
    }

    protected static String illegalSurrogateDesc(int i2) {
        if (i2 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i2 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output";
        }
        if (i2 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i2 = this._outPtr;
            if (i2 > 0) {
                outputStream.write(this._outBuffer, 0, i2);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i3 = this._surrogate;
            this._surrogate = 0;
            if (i3 > 0) {
                illegalSurrogate(i3);
            }
        }
    }

    protected int convertSurrogate(int i2) throws IOException {
        int i3 = this._surrogate;
        this._surrogate = 0;
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i3 - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i3) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i2 = this._outPtr;
            if (i2 > 0) {
                outputStream.write(this._outBuffer, 0, i2);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        write(c2);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0025, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p176io.UTF8Writer.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i2) throws IOException {
        int i3;
        if (this._surrogate > 0) {
            i2 = convertSurrogate(i2);
        } else if (i2 >= 55296 && i2 <= 57343) {
            if (i2 > 56319) {
                illegalSurrogate(i2);
            }
            this._surrogate = i2;
            return;
        }
        int i4 = this._outPtr;
        if (i4 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i4);
            this._outPtr = 0;
        }
        if (i2 < 128) {
            byte[] bArr = this._outBuffer;
            int i5 = this._outPtr;
            this._outPtr = i5 + 1;
            bArr[i5] = (byte) i2;
            return;
        }
        int i6 = this._outPtr;
        if (i2 < 2048) {
            byte[] bArr2 = this._outBuffer;
            int i7 = i6 + 1;
            bArr2[i6] = (byte) ((i2 >> 6) | 192);
            i3 = i7 + 1;
            bArr2[i7] = (byte) ((i2 & 63) | 128);
        } else if (i2 <= 65535) {
            byte[] bArr3 = this._outBuffer;
            int i8 = i6 + 1;
            bArr3[i6] = (byte) ((i2 >> 12) | 224);
            int i9 = i8 + 1;
            bArr3[i8] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i9] = (byte) ((i2 & 63) | 128);
            i3 = i9 + 1;
        } else {
            if (i2 > 1114111) {
                illegalSurrogate(i2);
            }
            byte[] bArr4 = this._outBuffer;
            int i10 = i6 + 1;
            bArr4[i6] = (byte) ((i2 >> 18) | 240);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i2 >> 12) & 63) | 128);
            int i12 = i11 + 1;
            bArr4[i11] = (byte) (((i2 >> 6) & 63) | 128);
            i3 = i12 + 1;
            bArr4[i12] = (byte) ((i2 & 63) | 128);
        }
        this._outPtr = i3;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0029, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p176io.UTF8Writer.write(java.lang.String, int, int):void");
    }
}
