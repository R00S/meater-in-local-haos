package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private long defaultMark;

    /* renamed from: in */
    private final InputStream f33249in;
    private long limit;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j2) throws IOException {
        try {
            long j3 = this.reset;
            long j4 = this.offset;
            if (j3 >= j4 || j4 > this.limit) {
                this.reset = j4;
                this.f33249in.mark((int) (j2 - j4));
            } else {
                this.f33249in.reset();
                this.f33249in.mark((int) (j2 - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    private void skip(long j2, long j3) throws IOException {
        while (j2 < j3) {
            long jSkip = this.f33249in.skip(j3 - j2);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j2 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f33249in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33249in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.defaultMark = savePosition(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f33249in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2 = this.f33249in.read();
        if (i2 != -1) {
            this.offset++;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public long savePosition(int i2) throws IOException {
        long j2 = this.offset + i2;
        if (this.limit < j2) {
            setLimit(j2);
        }
        return this.offset;
    }

    public MarkableInputStream(InputStream inputStream, int i2) {
        this.defaultMark = -1L;
        this.f33249in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i2);
    }

    public void reset(long j2) throws IOException {
        if (this.offset > this.limit || j2 < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.f33249in.reset();
        skip(this.reset, j2);
        this.offset = j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i2 = this.f33249in.read(bArr);
        if (i2 != -1) {
            this.offset += i2;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = this.f33249in.skip(j2);
        this.offset += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f33249in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.offset += i4;
        }
        return i4;
    }
}
