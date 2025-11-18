package com.fasterxml.jackson.core.p176io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes2.dex */
public class UTF32Reader extends Reader {
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i2, int i3, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i2;
        this._length = i3;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i2) throws IOException {
        int i3;
        this._byteCount += this._length - i2;
        if (i2 > 0) {
            int i4 = this._ptr;
            if (i4 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i4, bArr, 0, i2);
                this._ptr = 0;
            }
            this._length = i2;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            int i5 = inputStream == null ? -1 : inputStream.read(this._buffer);
            if (i5 < 1) {
                this._length = 0;
                if (i5 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = i5;
        }
        while (true) {
            int i6 = this._length;
            if (i6 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                i3 = -1;
            } else {
                byte[] bArr2 = this._buffer;
                i3 = inputStream2.read(bArr2, i6, bArr2.length - i6);
            }
            if (i3 < 1) {
                if (i3 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += i3;
        }
    }

    private void reportBounds(char[] cArr, int i2, int i3) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i2 + "," + i3 + "), cbuf[" + cArr.length + "]");
    }

    private void reportInvalid(int i2, int i3, String str) throws IOException {
        int i4 = (this._byteCount + this._ptr) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i2) + str + " at char #" + (this._charCount + i3) + ", byte #" + i4 + ")");
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i2, int i3) throws IOException {
        int i4 = this._byteCount + i2;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i2 + ", needed " + i3 + ", at char #" + this._charCount + ", byte #" + i4 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[LOOP:0: B:21:0x0031->B:38:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p176io.UTF32Reader.read(char[], int, int):int");
    }
}
