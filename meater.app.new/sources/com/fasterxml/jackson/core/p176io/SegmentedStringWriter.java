package com.fasterxml.jackson.core.p176io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class SegmentedStringWriter extends Writer {
    private final TextBuffer _buffer;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this._buffer = new TextBuffer(bufferRecycler);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String getAndClear() {
        String strContentsAsString = this._buffer.contentsAsString();
        this._buffer.releaseBuffers();
        return strContentsAsString;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this._buffer.append(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        this._buffer.append(cArr, i2, i3);
    }

    @Override // java.io.Writer
    public void write(int i2) {
        this._buffer.append((char) i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this._buffer.append(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this._buffer.append(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i3) {
        this._buffer.append(str, i2, i3);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i2, int i3) {
        String string = charSequence.subSequence(i2, i3).toString();
        this._buffer.append(string, 0, string.length());
        return this;
    }
}
