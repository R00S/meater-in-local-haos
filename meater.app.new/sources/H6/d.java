package H6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes2.dex */
public final class d extends InputStream {

    /* renamed from: D, reason: collision with root package name */
    private static final Queue<d> f5583D = l.f(0);

    /* renamed from: B, reason: collision with root package name */
    private InputStream f5584B;

    /* renamed from: C, reason: collision with root package name */
    private IOException f5585C;

    d() {
    }

    public static d b(InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f5583D;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.d(inputStream);
        return dVarPoll;
    }

    public IOException a() {
        return this.f5585C;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f5584B.available();
    }

    public void c() {
        this.f5585C = null;
        this.f5584B = null;
        Queue<d> queue = f5583D;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5584B.close();
    }

    void d(InputStream inputStream) {
        this.f5584B = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f5584B.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f5584B.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f5584B.read();
        } catch (IOException e10) {
            this.f5585C = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f5584B.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f5584B.skip(j10);
        } catch (IOException e10) {
            this.f5585C = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f5584B.read(bArr);
        } catch (IOException e10) {
            this.f5585C = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f5584B.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f5585C = e10;
            throw e10;
        }
    }
}
