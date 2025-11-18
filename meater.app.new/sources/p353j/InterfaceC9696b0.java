package p353j;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
/* renamed from: j.b0 */
/* loaded from: classes3.dex */
public interface InterfaceC9696b0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    C9702e0 timeout();

    void write(C9703f c9703f, long j2) throws IOException;
}
