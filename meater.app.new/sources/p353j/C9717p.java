package p353j;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C9801m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.p */
/* loaded from: classes3.dex */
final class C9717p implements InterfaceC9700d0 {

    /* renamed from: f */
    private final InputStream f37069f;

    /* renamed from: g */
    private final C9702e0 f37070g;

    public C9717p(InputStream inputStream, C9702e0 c9702e0) {
        C9801m.m32346f(inputStream, "input");
        C9801m.m32346f(c9702e0, "timeout");
        this.f37069f = inputStream;
        this.f37070g = c9702e0;
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37069f.close();
    }

    @Override // p353j.InterfaceC9700d0
    public long read(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        try {
            this.f37070g.throwIfReached();
            C9726y c9726yM32054q0 = c9703f.m32054q0(1);
            int i2 = this.f37069f.read(c9726yM32054q0.f37091b, c9726yM32054q0.f37093d, (int) Math.min(j2, 8192 - c9726yM32054q0.f37093d));
            if (i2 != -1) {
                c9726yM32054q0.f37093d += i2;
                long j3 = i2;
                c9703f.m32038f0(c9703f.size() + j3);
                return j3;
            }
            if (c9726yM32054q0.f37092c != c9726yM32054q0.f37093d) {
                return -1L;
            }
            c9703f.f37038f = c9726yM32054q0.m32162b();
            C9727z.m32169b(c9726yM32054q0);
            return -1L;
        } catch (AssertionError e2) {
            if (C9718q.m32121e(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.f37070g;
    }

    public String toString() {
        return "source(" + this.f37069f + ')';
    }
}
