package p353j;

import java.io.IOException;
import kotlin.jvm.internal.C9801m;

/* compiled from: ForwardingSource.kt */
/* renamed from: j.l */
/* loaded from: classes3.dex */
public abstract class AbstractC9713l implements InterfaceC9700d0 {
    private final InterfaceC9700d0 delegate;

    public AbstractC9713l(InterfaceC9700d0 interfaceC9700d0) {
        C9801m.m32346f(interfaceC9700d0, "delegate");
        this.delegate = interfaceC9700d0;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC9700d0 m41052deprecated_delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC9700d0 delegate() {
        return this.delegate;
    }

    @Override // p353j.InterfaceC9700d0
    public long read(C9703f c9703f, long j2) throws IOException {
        C9801m.m32346f(c9703f, "sink");
        return this.delegate.read(c9703f, j2);
    }

    @Override // p353j.InterfaceC9700d0
    public C9702e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
