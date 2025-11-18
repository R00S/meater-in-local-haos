package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    protected final ByteBuffer f15615_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f15615_b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f15615_b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f15615_b.hasRemaining()) {
            return this.f15615_b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f15615_b.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i3, this.f15615_b.remaining());
        this.f15615_b.get(bArr, i2, iMin);
        return iMin;
    }
}
