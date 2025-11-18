package y9;

import B9.l;
import java.io.IOException;
import java.io.OutputStream;
import w9.g;

/* compiled from: InstrHttpOutputStream.java */
/* renamed from: y9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5141b extends OutputStream {

    /* renamed from: B, reason: collision with root package name */
    private final OutputStream f53246B;

    /* renamed from: C, reason: collision with root package name */
    private final l f53247C;

    /* renamed from: D, reason: collision with root package name */
    g f53248D;

    /* renamed from: E, reason: collision with root package name */
    long f53249E = -1;

    public C5141b(OutputStream outputStream, g gVar, l lVar) {
        this.f53246B = outputStream;
        this.f53248D = gVar;
        this.f53247C = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f53249E;
        if (j10 != -1) {
            this.f53248D.m(j10);
        }
        this.f53248D.q(this.f53247C.c());
        try {
            this.f53246B.close();
        } catch (IOException e10) {
            this.f53248D.r(this.f53247C.c());
            C5143d.d(this.f53248D);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f53246B.flush();
        } catch (IOException e10) {
            this.f53248D.r(this.f53247C.c());
            C5143d.d(this.f53248D);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f53246B.write(i10);
            long j10 = this.f53249E + 1;
            this.f53249E = j10;
            this.f53248D.m(j10);
        } catch (IOException e10) {
            this.f53248D.r(this.f53247C.c());
            C5143d.d(this.f53248D);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f53246B.write(bArr);
            long length = this.f53249E + bArr.length;
            this.f53249E = length;
            this.f53248D.m(length);
        } catch (IOException e10) {
            this.f53248D.r(this.f53247C.c());
            C5143d.d(this.f53248D);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f53246B.write(bArr, i10, i11);
            long j10 = this.f53249E + i11;
            this.f53249E = j10;
            this.f53248D.m(j10);
        } catch (IOException e10) {
            this.f53248D.r(this.f53247C.c());
            C5143d.d(this.f53248D);
            throw e10;
        }
    }
}
