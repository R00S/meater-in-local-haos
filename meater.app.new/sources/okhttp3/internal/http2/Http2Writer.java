package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p353j.C9703f;
import p353j.InterfaceC9705g;

/* compiled from: Http2Writer.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010G\u001a\u00020\u001c¢\u0006\u0004\bJ\u0010KJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000eJ%\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J%\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\bJ-\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\nJ+\u00109\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0019\u0010C\u001a\u00020B8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010H\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, m32267d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, "streamId", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "Lkotlin/u;", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "outFinished", "Lj/f;", "source", "data", "(ZILj/f;I)V", "flags", "buffer", "dataFrame", "(IILj/f;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", HttpUrl.FRAGMENT_ENCODE_SET, "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "maxFrameSize", "I", "Lj/g;", "sink", "Lj/g;", "closed", "Z", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "client", "hpackBuffer", "Lj/f;", "<init>", "(Lj/g;Z)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C9703f hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final InterfaceC9705g sink;

    public Http2Writer(InterfaceC9705g interfaceC9705g, boolean z) {
        C9801m.m32346f(interfaceC9705g, "sink");
        this.sink = interfaceC9705g;
        this.client = z;
        C9703f c9703f = new C9703f();
        this.hpackBuffer = c9703f;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, c9703f, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) throws IOException {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) throws IOException {
        C9801m.m32346f(peerSettings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.mo31967F(), new Object[0]));
            }
            this.sink.mo32023U0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean outFinished, int streamId, C9703f source, int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, C9703f buffer, int byteCount) throws IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            InterfaceC9705g interfaceC9705g = this.sink;
            C9801m.m32343c(buffer);
            interfaceC9705g.write(buffer, byteCount);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, streamId, length, type, flags));
        }
        if (!(length <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + length).toString());
        }
        if (!((((int) 2147483648L) & streamId) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + streamId).toString());
        }
        Util.writeMedium(this.sink, length);
        this.sink.writeByte(type & 255);
        this.sink.writeByte(flags & 255);
        this.sink.writeInt(streamId & Integer.MAX_VALUE);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) throws IOException {
        C9801m.m32346f(errorCode, "errorCode");
        C9801m.m32346f(debugData, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.writeInt(lastGoodStreamId);
        this.sink.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean outFinished, int streamId, List<Header> headerBlock) throws IOException {
        C9801m.m32346f(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i2 = size == jMin ? 4 : 0;
        if (outFinished) {
            i2 |= 1;
        }
        frameHeader(streamId, (int) jMin, 1, i2);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(streamId, size - jMin);
        }
    }

    /* renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) throws IOException {
        C9801m.m32346f(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(this.maxFrameSize - 4, size);
        long j2 = iMin;
        frameHeader(streamId, iMin + 4, 5, size == j2 ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j2);
        if (size > j2) {
            writeContinuationFrames(streamId, size - j2);
        }
    }

    public final synchronized void rstStream(int streamId, ErrorCode errorCode) throws IOException {
        C9801m.m32346f(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        C9801m.m32346f(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        int i2 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.isSet(i2)) {
                this.sink.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                this.sink.writeInt(settings.get(i2));
            }
            i2++;
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }
}
