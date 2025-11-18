package a2;

import X1.C1804a;
import java.io.InputStream;

/* compiled from: DataSourceInputStream.java */
/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: B, reason: collision with root package name */
    private final androidx.media3.datasource.a f19977B;

    /* renamed from: C, reason: collision with root package name */
    private final g f19978C;

    /* renamed from: G, reason: collision with root package name */
    private long f19982G;

    /* renamed from: E, reason: collision with root package name */
    private boolean f19980E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f19981F = false;

    /* renamed from: D, reason: collision with root package name */
    private final byte[] f19979D = new byte[1];

    public e(androidx.media3.datasource.a aVar, g gVar) {
        this.f19977B = aVar;
        this.f19978C = gVar;
    }

    private void a() {
        if (this.f19980E) {
            return;
        }
        this.f19977B.c(this.f19978C);
        this.f19980E = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19981F) {
            return;
        }
        this.f19977B.close();
        this.f19981F = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f19979D) == -1) {
            return -1;
        }
        return this.f19979D[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        C1804a.g(!this.f19981F);
        a();
        int iE = this.f19977B.e(bArr, i10, i11);
        if (iE == -1) {
            return -1;
        }
        this.f19982G += iE;
        return iE;
    }
}
