package com.bumptech.glide.load.p127m;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* renamed from: com.bumptech.glide.load.m.g */
/* loaded from: classes.dex */
public final class C5436g extends FilterInputStream {

    /* renamed from: f */
    private static final byte[] f13573f;

    /* renamed from: g */
    private static final int f13574g;

    /* renamed from: h */
    private static final int f13575h;

    /* renamed from: i */
    private final byte f13576i;

    /* renamed from: j */
    private int f13577j;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f13573f = bArr;
        int length = bArr.length;
        f13574g = length;
        f13575h = length + 2;
    }

    public C5436g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f13576i = (byte) i2;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        int i3 = this.f13577j;
        int i4 = (i3 < 2 || i3 > (i2 = f13575h)) ? super.read() : i3 == i2 ? this.f13576i : f13573f[i3 - 2] & 255;
        if (i4 != -1) {
            this.f13577j++;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f13577j = (int) (this.f13577j + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f13577j;
        int i6 = f13575h;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f13576i;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(f13573f, this.f13577j - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.f13577j += i4;
        }
        return i4;
    }
}
