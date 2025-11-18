package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p6.InterfaceC4237b;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes2.dex */
public final class c extends OutputStream {

    /* renamed from: B, reason: collision with root package name */
    private final OutputStream f33035B;

    /* renamed from: C, reason: collision with root package name */
    private byte[] f33036C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC4237b f33037D;

    /* renamed from: E, reason: collision with root package name */
    private int f33038E;

    public c(OutputStream outputStream, InterfaceC4237b interfaceC4237b) {
        this(outputStream, interfaceC4237b, 65536);
    }

    private void a() throws IOException {
        int i10 = this.f33038E;
        if (i10 > 0) {
            this.f33035B.write(this.f33036C, 0, i10);
            this.f33038E = 0;
        }
    }

    private void b() throws IOException {
        if (this.f33038E == this.f33036C.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f33036C;
        if (bArr != null) {
            this.f33037D.d(bArr);
            this.f33036C = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f33035B.close();
            c();
        } catch (Throwable th) {
            this.f33035B.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f33035B.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f33036C;
        int i11 = this.f33038E;
        this.f33038E = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, InterfaceC4237b interfaceC4237b, int i10) {
        this.f33035B = outputStream;
        this.f33037D = interfaceC4237b;
        this.f33036C = (byte[]) interfaceC4237b.e(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f33038E;
            if (i15 == 0 && i13 >= this.f33036C.length) {
                this.f33035B.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f33036C.length - i15);
            System.arraycopy(bArr, i14, this.f33036C, this.f33038E, iMin);
            this.f33038E += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
