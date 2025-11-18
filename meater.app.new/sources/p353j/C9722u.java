package p353j;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.C9801m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.u */
/* loaded from: classes3.dex */
final class C9722u implements InterfaceC9696b0 {

    /* renamed from: f */
    private final OutputStream f37075f;

    /* renamed from: g */
    private final C9702e0 f37076g;

    public C9722u(OutputStream outputStream, C9702e0 c9702e0) {
        C9801m.m32346f(outputStream, "out");
        C9801m.m32346f(c9702e0, "timeout");
        this.f37075f = outputStream;
        this.f37076g = c9702e0;
    }

    @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37075f.close();
    }

    @Override // p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() throws IOException {
        this.f37075f.flush();
    }

    @Override // p353j.InterfaceC9696b0
    public C9702e0 timeout() {
        return this.f37076g;
    }

    public String toString() {
        return "sink(" + this.f37075f + ')';
    }

    @Override // p353j.InterfaceC9696b0
    public void write(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "source");
        C9697c.m31982b(c9703f.size(), 0L, j2);
        while (j2 > 0) {
            this.f37076g.throwIfReached();
            C9726y c9726y = c9703f.f37038f;
            C9801m.m32343c(c9726y);
            int iMin = (int) Math.min(j2, c9726y.f37093d - c9726y.f37092c);
            this.f37075f.write(c9726y.f37091b, c9726y.f37092c, iMin);
            c9726y.f37092c += iMin;
            long j3 = iMin;
            j2 -= j3;
            c9703f.m32038f0(c9703f.size() - j3);
            if (c9726y.f37092c == c9726y.f37093d) {
                c9703f.f37038f = c9726y.m32162b();
                C9727z.m32169b(c9726y);
            }
        }
    }
}
