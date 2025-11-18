package com.bumptech.glide.load.p131o.p132c;

import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* renamed from: com.bumptech.glide.load.o.c.s */
/* loaded from: classes.dex */
public class C5498s extends FilterInputStream {

    /* renamed from: f */
    private volatile byte[] f13761f;

    /* renamed from: g */
    private int f13762g;

    /* renamed from: h */
    private int f13763h;

    /* renamed from: i */
    private int f13764i;

    /* renamed from: j */
    private int f13765j;

    /* renamed from: k */
    private final InterfaceC5410b f13766k;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* renamed from: com.bumptech.glide.load.o.c.s$a */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public C5498s(InputStream inputStream, InterfaceC5410b interfaceC5410b) {
        this(inputStream, interfaceC5410b, 65536);
    }

    /* renamed from: a */
    private int m10663a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f13764i;
        if (i2 != -1) {
            int i3 = this.f13765j - i2;
            int i4 = this.f13763h;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f13762g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f13766k.mo10369e(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f13761f = bArr2;
                    this.f13766k.mo10368d(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f13765j - this.f13764i;
                this.f13765j = i5;
                this.f13764i = 0;
                this.f13762g = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f13765j;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f13762g = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.f13764i = -1;
            this.f13765j = 0;
            this.f13762g = i8;
        }
        return i8;
    }

    /* renamed from: d */
    private static IOException m10664d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f13761f == null || inputStream == null) {
            throw m10664d();
        }
        return (this.f13762g - this.f13765j) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m10665b() {
        this.f13763h = this.f13761f.length;
    }

    /* renamed from: c */
    public synchronized void m10666c() {
        if (this.f13761f != null) {
            this.f13766k.mo10368d(this.f13761f);
            this.f13761f = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f13761f != null) {
            this.f13766k.mo10368d(this.f13761f);
            this.f13761f = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f13763h = Math.max(this.f13763h, i2);
        this.f13764i = this.f13765j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f13761f;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m10664d();
        }
        if (this.f13765j >= this.f13762g && m10663a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f13761f && (bArr = this.f13761f) == null) {
            throw m10664d();
        }
        int i2 = this.f13762g;
        int i3 = this.f13765j;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f13765j = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f13761f == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f13764i;
        if (-1 == i2) {
            throw new a("Mark has been invalidated, pos: " + this.f13765j + " markLimit: " + this.f13763h);
        }
        this.f13765j = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f13761f;
        if (bArr == null) {
            throw m10664d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m10664d();
        }
        int i2 = this.f13762g;
        int i3 = this.f13765j;
        if (i2 - i3 >= j2) {
            this.f13765j = (int) (i3 + j2);
            return j2;
        }
        long j3 = i2 - i3;
        this.f13765j = i2;
        if (this.f13764i == -1 || j2 > this.f13763h) {
            return j3 + inputStream.skip(j2 - j3);
        }
        if (m10663a(inputStream, bArr) == -1) {
            return j3;
        }
        int i4 = this.f13762g;
        int i5 = this.f13765j;
        if (i4 - i5 >= j2 - j3) {
            this.f13765j = (int) ((i5 + j2) - j3);
            return j2;
        }
        long j4 = (j3 + i4) - i5;
        this.f13765j = i4;
        return j4;
    }

    C5498s(InputStream inputStream, InterfaceC5410b interfaceC5410b, int i2) {
        super(inputStream);
        this.f13764i = -1;
        this.f13766k = interfaceC5410b;
        this.f13761f = (byte[]) interfaceC5410b.mo10369e(i2, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte[] bArr2 = this.f13761f;
        if (bArr2 == null) {
            throw m10664d();
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f13765j;
            int i7 = this.f13762g;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f13765j += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f13764i == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (m10663a(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.f13761f && (bArr2 = this.f13761f) == null) {
                        throw m10664d();
                    }
                    int i9 = this.f13762g;
                    int i10 = this.f13765j;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f13765j += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            throw m10664d();
        }
    }
}
