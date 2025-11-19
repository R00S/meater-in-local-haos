package y9;

import B9.l;
import java.io.IOException;
import java.io.InputStream;
import w9.g;

/* compiled from: InstrHttpInputStream.java */
/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5140a extends InputStream {

    /* renamed from: B, reason: collision with root package name */
    private final InputStream f53240B;

    /* renamed from: C, reason: collision with root package name */
    private final g f53241C;

    /* renamed from: D, reason: collision with root package name */
    private final l f53242D;

    /* renamed from: F, reason: collision with root package name */
    private long f53244F;

    /* renamed from: E, reason: collision with root package name */
    private long f53243E = -1;

    /* renamed from: G, reason: collision with root package name */
    private long f53245G = -1;

    public C5140a(InputStream inputStream, g gVar, l lVar) {
        this.f53242D = lVar;
        this.f53240B = inputStream;
        this.f53241C = gVar;
        this.f53244F = gVar.e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f53240B.available();
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f53242D.c();
        if (this.f53245G == -1) {
            this.f53245G = jC;
        }
        try {
            this.f53240B.close();
            long j10 = this.f53243E;
            if (j10 != -1) {
                this.f53241C.p(j10);
            }
            long j11 = this.f53244F;
            if (j11 != -1) {
                this.f53241C.s(j11);
            }
            this.f53241C.r(this.f53245G);
            this.f53241C.b();
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f53240B.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f53240B.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f53240B.read();
            long jC = this.f53242D.c();
            if (this.f53244F == -1) {
                this.f53244F = jC;
            }
            if (i10 == -1 && this.f53245G == -1) {
                this.f53245G = jC;
                this.f53241C.r(jC);
                this.f53241C.b();
            } else {
                long j10 = this.f53243E + 1;
                this.f53243E = j10;
                this.f53241C.p(j10);
            }
            return i10;
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f53240B.reset();
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f53240B.skip(j10);
            long jC = this.f53242D.c();
            if (this.f53244F == -1) {
                this.f53244F = jC;
            }
            if (jSkip == -1 && this.f53245G == -1) {
                this.f53245G = jC;
                this.f53241C.r(jC);
            } else {
                long j11 = this.f53243E + jSkip;
                this.f53243E = j11;
                this.f53241C.p(j11);
            }
            return jSkip;
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f53240B.read(bArr, i10, i11);
            long jC = this.f53242D.c();
            if (this.f53244F == -1) {
                this.f53244F = jC;
            }
            if (i12 == -1 && this.f53245G == -1) {
                this.f53245G = jC;
                this.f53241C.r(jC);
                this.f53241C.b();
            } else {
                long j10 = this.f53243E + i12;
                this.f53243E = j10;
                this.f53241C.p(j10);
            }
            return i12;
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f53240B.read(bArr);
            long jC = this.f53242D.c();
            if (this.f53244F == -1) {
                this.f53244F = jC;
            }
            if (i10 == -1 && this.f53245G == -1) {
                this.f53245G = jC;
                this.f53241C.r(jC);
                this.f53241C.b();
            } else {
                long j10 = this.f53243E + i10;
                this.f53243E = j10;
                this.f53241C.p(j10);
            }
            return i10;
        } catch (IOException e10) {
            this.f53241C.r(this.f53242D.c());
            C5143d.d(this.f53241C);
            throw e10;
        }
    }
}
