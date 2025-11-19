package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.L;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: ReusableBufferedOutputStream.java */
/* loaded from: classes.dex */
final class g extends BufferedOutputStream {

    /* renamed from: B, reason: collision with root package name */
    private boolean f26271B;

    public g(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        C1804a.g(this.f26271B);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f26271B = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f26271B = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            L.j1(th);
        }
    }

    public g(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
