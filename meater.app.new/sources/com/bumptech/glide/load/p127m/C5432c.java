package com.bumptech.glide.load.p127m;

import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* renamed from: com.bumptech.glide.load.m.c */
/* loaded from: classes.dex */
public final class C5432c extends OutputStream {

    /* renamed from: f */
    private final OutputStream f13566f;

    /* renamed from: g */
    private byte[] f13567g;

    /* renamed from: h */
    private InterfaceC5410b f13568h;

    /* renamed from: i */
    private int f13569i;

    public C5432c(OutputStream outputStream, InterfaceC5410b interfaceC5410b) {
        this(outputStream, interfaceC5410b, 65536);
    }

    /* renamed from: a */
    private void m10465a() throws IOException {
        int i2 = this.f13569i;
        if (i2 > 0) {
            this.f13566f.write(this.f13567g, 0, i2);
            this.f13569i = 0;
        }
    }

    /* renamed from: b */
    private void m10466b() throws IOException {
        if (this.f13569i == this.f13567g.length) {
            m10465a();
        }
    }

    /* renamed from: c */
    private void m10467c() {
        byte[] bArr = this.f13567g;
        if (bArr != null) {
            this.f13568h.mo10368d(bArr);
            this.f13567g = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f13566f.close();
            m10467c();
        } catch (Throwable th) {
            this.f13566f.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m10465a();
        this.f13566f.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f13567g;
        int i3 = this.f13569i;
        this.f13569i = i3 + 1;
        bArr[i3] = (byte) i2;
        m10466b();
    }

    C5432c(OutputStream outputStream, InterfaceC5410b interfaceC5410b, int i2) {
        this.f13566f = outputStream;
        this.f13568h = interfaceC5410b;
        this.f13567g = (byte[]) interfaceC5410b.mo10369e(i2, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f13569i;
            if (i7 == 0 && i5 >= this.f13567g.length) {
                this.f13566f.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.f13567g.length - i7);
            System.arraycopy(bArr, i6, this.f13567g, this.f13569i, iMin);
            this.f13569i += iMin;
            i4 += iMin;
            m10466b();
        } while (i4 < i3);
    }
}
