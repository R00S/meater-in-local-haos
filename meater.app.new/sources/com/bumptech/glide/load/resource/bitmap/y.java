package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p6.InterfaceC4237b;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes2.dex */
public class y extends FilterInputStream {

    /* renamed from: B, reason: collision with root package name */
    private volatile byte[] f33379B;

    /* renamed from: C, reason: collision with root package name */
    private int f33380C;

    /* renamed from: D, reason: collision with root package name */
    private int f33381D;

    /* renamed from: E, reason: collision with root package name */
    private int f33382E;

    /* renamed from: F, reason: collision with root package name */
    private int f33383F;

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC4237b f33384G;

    /* compiled from: RecyclableBufferedInputStream.java */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public y(InputStream inputStream, InterfaceC4237b interfaceC4237b) {
        this(inputStream, interfaceC4237b, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f33382E;
        if (i10 != -1) {
            int i11 = this.f33383F - i10;
            int i12 = this.f33381D;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f33380C == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f33384G.e(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f33379B = bArr2;
                    this.f33384G.d(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f33383F - this.f33382E;
                this.f33383F = i13;
                this.f33382E = 0;
                this.f33380C = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f33383F;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f33380C = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f33382E = -1;
            this.f33383F = 0;
            this.f33380C = i16;
        }
        return i16;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f33379B == null || inputStream == null) {
            throw d();
        }
        return (this.f33380C - this.f33383F) + inputStream.available();
    }

    public synchronized void b() {
        this.f33381D = this.f33379B.length;
    }

    public synchronized void c() {
        if (this.f33379B != null) {
            this.f33384G.d(this.f33379B);
            this.f33379B = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33379B != null) {
            this.f33384G.d(this.f33379B);
            this.f33379B = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f33381D = Math.max(this.f33381D, i10);
        this.f33382E = this.f33383F;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f33379B;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f33383F >= this.f33380C && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f33379B && (bArr = this.f33379B) == null) {
            throw d();
        }
        int i10 = this.f33380C;
        int i11 = this.f33383F;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f33383F = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f33379B == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f33382E;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f33383F + " markLimit: " + this.f33381D);
        }
        this.f33383F = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f33379B;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i10 = this.f33380C;
        int i11 = this.f33383F;
        if (i10 - i11 >= j10) {
            this.f33383F = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f33383F = i10;
        if (this.f33382E == -1 || j10 > this.f33381D) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f33382E = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f33380C;
        int i13 = this.f33383F;
        if (i12 - i13 >= j10 - j11) {
            this.f33383F = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f33383F = i12;
        return j12;
    }

    y(InputStream inputStream, InterfaceC4237b interfaceC4237b, int i10) {
        super(inputStream);
        this.f33382E = -1;
        this.f33384G = interfaceC4237b;
        this.f33379B = (byte[]) interfaceC4237b.e(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f33379B;
        if (bArr2 == null) {
            throw d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f33383F;
            int i15 = this.f33380C;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f33383F += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f33382E == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f33379B && (bArr2 = this.f33379B) == null) {
                        throw d();
                    }
                    int i17 = this.f33380C;
                    int i18 = this.f33383F;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f33383F += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw d();
        }
    }
}
