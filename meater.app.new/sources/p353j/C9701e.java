package p353j;

import java.io.EOFException;
import kotlin.jvm.internal.C9801m;

/* compiled from: Okio.kt */
/* renamed from: j.e */
/* loaded from: classes3.dex */
final class C9701e implements InterfaceC9696b0 {
    @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() {
    }

    @Override // p353j.InterfaceC9696b0
    public C9702e0 timeout() {
        return C9702e0.NONE;
    }

    @Override // p353j.InterfaceC9696b0
    public void write(C9703f c9703f, long j2) throws EOFException {
        C9801m.m32346f(c9703f, "source");
        c9703f.skip(j2);
    }
}
