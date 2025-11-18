package p353j;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.kt */
/* renamed from: j.d0 */
/* loaded from: classes3.dex */
public interface InterfaceC9700d0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(C9703f c9703f, long j2) throws IOException;

    C9702e0 timeout();
}
