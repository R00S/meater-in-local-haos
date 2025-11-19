package H6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes2.dex */
public final class c extends FilterInputStream {

    /* renamed from: B, reason: collision with root package name */
    private final long f5581B;

    /* renamed from: C, reason: collision with root package name */
    private int f5582C;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f5581B = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f5582C += i10;
        } else if (this.f5581B - this.f5582C > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f5581B + ", but read: " + this.f5582C);
        }
        return i10;
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f5581B - this.f5582C, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
