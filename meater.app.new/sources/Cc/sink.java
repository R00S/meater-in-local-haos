package Cc;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LCc/s;", "LCc/z;", "Ljava/io/OutputStream;", "out", "LCc/C;", "timeout", "<init>", "(Ljava/io/OutputStream;LCc/C;)V", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "close", "r", "()LCc/C;", "", "toString", "()Ljava/lang/String;", "B", "Ljava/io/OutputStream;", "C", "LCc/C;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.s, reason: from toString */
/* loaded from: classes3.dex */
final class sink implements z {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C timeout;

    public sink(OutputStream out, C timeout) {
        C3862t.g(out, "out");
        C3862t.g(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // Cc.z, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // Cc.z
    public void n0(C0982e source, long byteCount) throws IOException {
        C3862t.g(source, "source");
        C0979b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.f();
            w wVar = source.head;
            C3862t.d(wVar);
            int iMin = (int) Math.min(byteCount, wVar.limit - wVar.pos);
            this.out.write(wVar.data, wVar.pos, iMin);
            wVar.pos += iMin;
            long j10 = iMin;
            byteCount -= j10;
            source.W(source.getSize() - j10);
            if (wVar.pos == wVar.limit) {
                source.head = wVar.b();
                x.b(wVar);
            }
        }
    }

    @Override // Cc.z
    /* renamed from: r, reason: from getter */
    public C getTimeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }
}
