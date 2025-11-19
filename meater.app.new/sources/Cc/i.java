package Cc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ForwardingSink.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"LCc/i;", "LCc/z;", "delegate", "<init>", "(LCc/z;)V", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "LCc/C;", "r", "()LCc/C;", "close", "", "toString", "()Ljava/lang/String;", "B", "LCc/z;", "()LCc/z;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class i implements z {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final z delegate;

    public i(z delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // Cc.z, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // Cc.z
    public void n0(C0982e source, long byteCount) {
        C3862t.g(source, "source");
        this.delegate.n0(source, byteCount);
    }

    @Override // Cc.z
    public C r() {
        return this.delegate.r();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
