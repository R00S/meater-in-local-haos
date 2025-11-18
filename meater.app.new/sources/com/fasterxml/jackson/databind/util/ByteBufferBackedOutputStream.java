package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class ByteBufferBackedOutputStream extends OutputStream {

    /* renamed from: _b */
    protected final ByteBuffer f15616_b;

    public ByteBufferBackedOutputStream(ByteBuffer byteBuffer) {
        this.f15616_b = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.f15616_b.put((byte) i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.f15616_b.put(bArr, i2, i3);
    }
}
