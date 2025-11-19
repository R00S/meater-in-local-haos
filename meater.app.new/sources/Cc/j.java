package Cc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ForwardingSource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LCc/j;", "LCc/B;", "delegate", "<init>", "(LCc/B;)V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "LCc/C;", "r", "()LCc/C;", "Loa/F;", "close", "()V", "", "toString", "()Ljava/lang/String;", "B", "LCc/B;", "a", "()LCc/B;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class j implements B {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final B delegate;

    public j(B delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // Cc.B
    public long I0(C0982e sink, long byteCount) {
        C3862t.g(sink, "sink");
        return this.delegate.I0(sink, byteCount);
    }

    /* renamed from: a, reason: from getter */
    public final B getDelegate() {
        return this.delegate;
    }

    @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // Cc.B
    public C r() {
        return this.delegate.r();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
