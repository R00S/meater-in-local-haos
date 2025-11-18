package p353j;

import java.io.IOException;
import kotlin.jvm.internal.C9801m;

/* compiled from: ForwardingSink.kt */
/* renamed from: j.k */
/* loaded from: classes3.dex */
public abstract class AbstractC9712k implements InterfaceC9696b0 {
    private final InterfaceC9696b0 delegate;

    public AbstractC9712k(InterfaceC9696b0 interfaceC9696b0) {
        C9801m.m32346f(interfaceC9696b0, "delegate");
        this.delegate = interfaceC9696b0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC9696b0 m41051deprecated_delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC9696b0 delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p353j.InterfaceC9696b0
    public C9702e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p353j.InterfaceC9696b0
    public void write(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "source");
        this.delegate.write(c9703f, j2);
    }
}
