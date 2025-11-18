package com.bumptech.glide.p145r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* renamed from: com.bumptech.glide.r.h */
/* loaded from: classes.dex */
public class C5594h extends FilterInputStream {

    /* renamed from: f */
    private int f14042f;

    public C5594h(InputStream inputStream) {
        super(inputStream);
        this.f14042f = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private long m11036a(long j2) {
        int i2 = this.f14042f;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    /* renamed from: b */
    private void m11037b(long j2) {
        int i2 = this.f14042f;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f14042f = (int) (i2 - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2 = this.f14042f;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f14042f = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m11036a(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        m11037b(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f14042f = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jM11036a = m11036a(j2);
        if (jM11036a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM11036a);
        m11037b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iM11036a = (int) m11036a(i3);
        if (iM11036a == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iM11036a);
        m11037b(i4);
        return i4;
    }
}
