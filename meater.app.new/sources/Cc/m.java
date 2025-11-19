package Cc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: InflaterSource.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LCc/m;", "LCc/B;", "LCc/g;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(LCc/g;Ljava/util/zip/Inflater;)V", "Loa/F;", "c", "()V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "a", "", "b", "()Z", "LCc/C;", "r", "()LCc/C;", "close", "B", "LCc/g;", "C", "Ljava/util/zip/Inflater;", "", "D", "I", "bufferBytesHeldByInflater", "E", "Z", "closed", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements B {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g source;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public m(g source, Inflater inflater) {
        C3862t.g(source, "source");
        C3862t.g(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    private final void c() {
        int i10 = this.bufferBytesHeldByInflater;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.w(remaining);
    }

    @Override // Cc.B
    public long I0(C0982e sink, long byteCount) throws DataFormatException, IOException {
        C3862t.g(sink, "sink");
        do {
            long jA = a(sink, byteCount);
            if (jA > 0) {
                return jA;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.c0());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C0982e sink, long byteCount) throws DataFormatException, IOException {
        C3862t.g(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            w wVarO0 = sink.o0(1);
            int iMin = (int) Math.min(byteCount, 8192 - wVarO0.limit);
            b();
            int iInflate = this.inflater.inflate(wVarO0.data, wVarO0.limit, iMin);
            c();
            if (iInflate > 0) {
                wVarO0.limit += iInflate;
                long j10 = iInflate;
                sink.W(sink.getSize() + j10);
                return j10;
            }
            if (wVarO0.pos == wVarO0.limit) {
                sink.head = wVarO0.b();
                x.b(wVarO0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.c0()) {
            return true;
        }
        w wVar = this.source.i().head;
        C3862t.d(wVar);
        int i10 = wVar.limit;
        int i11 = wVar.pos;
        int i12 = i10 - i11;
        this.bufferBytesHeldByInflater = i12;
        this.inflater.setInput(wVar.data, i11, i12);
        return false;
    }

    @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // Cc.B
    /* renamed from: r */
    public C getTimeout() {
        return this.source.getTimeout();
    }
}
