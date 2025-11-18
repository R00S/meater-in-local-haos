package wc;

import Cc.C0982e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import wc.c;

/* compiled from: Http2Writer.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J%\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ-\u0010;\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\u0010J+\u0010?\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lwc/i;", "Ljava/io/Closeable;", "LCc/f;", "sink", "", "client", "<init>", "(LCc/f;Z)V", "", "streamId", "", "byteCount", "Loa/F;", "p", "(IJ)V", "b", "()V", "Lwc/l;", "peerSettings", "a", "(Lwc/l;)V", "promisedStreamId", "", "Lwc/b;", "requestHeaders", "l", "(IILjava/util/List;)V", "flush", "Lwc/a;", "errorCode", "m", "(ILwc/a;)V", "j", "()I", "outFinished", "LCc/e;", "source", "c", "(ZILCc/e;I)V", "flags", "buffer", "d", "(IILCc/e;I)V", "settings", "n", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "", "debugData", "f", "(ILwc/a;[B)V", "windowSizeIncrement", "o", "length", "type", "e", "(IIII)V", "close", "headerBlock", "g", "(ZILjava/util/List;)V", "B", "LCc/f;", "C", "Z", "D", "LCc/e;", "hpackBuffer", "E", "I", "maxFrameSize", "F", "closed", "Lwc/c$b;", "G", "Lwc/c$b;", "getHpackWriter", "()Lwc/c$b;", "hpackWriter", "H", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements Closeable {

    /* renamed from: I, reason: collision with root package name */
    private static final Logger f52196I = Logger.getLogger(d.class.getName());

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Cc.f sink;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C0982e hpackBuffer;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final c.b hpackWriter;

    public i(Cc.f sink, boolean z10) {
        C3862t.g(sink, "sink");
        this.sink = sink;
        this.client = z10;
        C0982e c0982e = new C0982e();
        this.hpackBuffer = c0982e;
        this.maxFrameSize = 16384;
        this.hpackWriter = new c.b(0, false, c0982e, 3, null);
    }

    private final void p(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            e(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.n0(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void a(l peerSettings) {
        try {
            C3862t.g(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.e(this.maxFrameSize);
            if (peerSettings.b() != -1) {
                this.hpackWriter.e(peerSettings.b());
            }
            e(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger = f52196I;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(pc.d.t(">> CONNECTION " + d.CONNECTION_PREFACE.y(), new Object[0]));
                }
                this.sink.t0(d.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean outFinished, int streamId, C0982e source, int byteCount) {
        if (this.closed) {
            throw new IOException("closed");
        }
        d(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final void d(int streamId, int flags, C0982e buffer, int byteCount) {
        e(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            Cc.f fVar = this.sink;
            C3862t.d(buffer);
            fVar.n0(buffer, byteCount);
        }
    }

    public final void e(int streamId, int length, int type, int flags) {
        Logger logger = f52196I;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.f52064a.c(false, streamId, length, type, flags));
        }
        if (length > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + length).toString());
        }
        if ((Integer.MIN_VALUE & streamId) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + streamId).toString());
        }
        pc.d.a0(this.sink, length);
        this.sink.d0(type & 255);
        this.sink.d0(flags & 255);
        this.sink.U(streamId & Integer.MAX_VALUE);
    }

    public final synchronized void f(int lastGoodStreamId, a errorCode, byte[] debugData) {
        try {
            C3862t.g(errorCode, "errorCode");
            C3862t.g(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, debugData.length + 8, 7, 0);
            this.sink.U(lastGoodStreamId);
            this.sink.U(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.i1(debugData);
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void g(boolean outFinished, int streamId, List<b> headerBlock) {
        C3862t.g(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(headerBlock);
        long size = this.hpackBuffer.getSize();
        long jMin = Math.min(this.maxFrameSize, size);
        int i10 = size == jMin ? 4 : 0;
        if (outFinished) {
            i10 |= 1;
        }
        e(streamId, (int) jMin, 1, i10);
        this.sink.n0(this.hpackBuffer, jMin);
        if (size > jMin) {
            p(streamId, size - jMin);
        }
    }

    /* renamed from: j, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void k(boolean ack, int payload1, int payload2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        e(0, 8, 6, ack ? 1 : 0);
        this.sink.U(payload1);
        this.sink.U(payload2);
        this.sink.flush();
    }

    public final synchronized void l(int streamId, int promisedStreamId, List<b> requestHeaders) {
        C3862t.g(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(requestHeaders);
        long size = this.hpackBuffer.getSize();
        int iMin = (int) Math.min(this.maxFrameSize - 4, size);
        long j10 = iMin;
        e(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
        this.sink.U(promisedStreamId & Integer.MAX_VALUE);
        this.sink.n0(this.hpackBuffer, j10);
        if (size > j10) {
            p(streamId, size - j10);
        }
    }

    public final synchronized void m(int streamId, a errorCode) {
        C3862t.g(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(streamId, 4, 3, 0);
        this.sink.U(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void n(l settings) {
        try {
            C3862t.g(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i10 = 0;
            e(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.sink.O(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.sink.U(settings.a(i10));
                }
                i10++;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(int streamId, long windowSizeIncrement) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        e(streamId, 4, 8, 0);
        this.sink.U((int) windowSizeIncrement);
        this.sink.flush();
    }
}
