package Cc;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LCc/n;", "LCc/B;", "Ljava/io/InputStream;", "input", "LCc/C;", "timeout", "<init>", "(Ljava/io/InputStream;LCc/C;)V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "close", "()V", "r", "()LCc/C;", "", "toString", "()Ljava/lang/String;", "B", "Ljava/io/InputStream;", "C", "LCc/C;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.n, reason: from toString */
/* loaded from: classes3.dex */
class source implements B {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C timeout;

    public source(InputStream input, C timeout) {
        C3862t.g(input, "input");
        C3862t.g(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // Cc.B
    public long I0(C0982e sink, long byteCount) throws IOException {
        C3862t.g(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.f();
            w wVarO0 = sink.o0(1);
            int i10 = this.input.read(wVarO0.data, wVarO0.limit, (int) Math.min(byteCount, 8192 - wVarO0.limit));
            if (i10 != -1) {
                wVarO0.limit += i10;
                long j10 = i10;
                sink.W(sink.getSize() + j10);
                return j10;
            }
            if (wVarO0.pos != wVarO0.limit) {
                return -1L;
            }
            sink.head = wVarO0.b();
            x.b(wVarO0);
            return -1L;
        } catch (AssertionError e10) {
            if (o.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // Cc.B
    /* renamed from: r, reason: from getter */
    public C getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
