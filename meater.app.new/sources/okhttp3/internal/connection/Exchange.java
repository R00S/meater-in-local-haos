package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.p454ws.RealWebSocket;
import p353j.AbstractC9712k;
import p353j.AbstractC9713l;
import p353j.C9703f;
import p353j.C9718q;
import p353j.InterfaceC9696b0;
import p353j.InterfaceC9700d0;

/* compiled from: Exchange.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002QRB'\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bO\u0010PJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0011J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0011J9\u0010.\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u0011R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\u0002048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010D\u001a\u00020C8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020\u000b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010BR\u001c\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006S"}, m32267d2 = {"Lokhttp3/internal/connection/Exchange;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/IOException;", "e", "Lkotlin/u;", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Request;", "request", "writeRequestHeaders", "(Lokhttp3/Request;)V", HttpUrl.FRAGMENT_ENCODE_SET, "duplex", "Lj/b0;", "createRequestBody", "(Lokhttp3/Request;Z)Lj/b0;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/internal/ws/RealWebSocket$Streams;", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "E", HttpUrl.FRAGMENT_ENCODE_SET, "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "isCoalescedConnection$okhttp", "isCoalescedConnection", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "RequestBodySink", "ResponseBodySource", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;

    /* compiled from: Exchange.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001c"}, m32267d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lj/k;", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lj/f;", "source", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "Lkotlin/u;", "write", "(Lj/f;J)V", "flush", "()V", "close", "bytesReceived", "J", HttpUrl.FRAGMENT_ENCODE_SET, "closed", "Z", "contentLength", "completed", "Lj/b0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lj/b0;J)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private final class RequestBodySink extends AbstractC9712k {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, InterfaceC9696b0 interfaceC9696b0, long j2) {
            super(interfaceC9696b0);
            C9801m.m32346f(interfaceC9696b0, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
        }

        private final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e2);
        }

        @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j2 = this.contentLength;
            if (j2 != -1 && this.bytesReceived != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0
        public void write(C9703f source, long byteCount) throws IOException {
            C9801m.m32346f(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.contentLength;
            if (j2 == -1 || this.bytesReceived + byteCount <= j2) {
                try {
                    super.write(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e2) {
                    throw complete(e2);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, m32267d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lj/l;", "Lj/f;", "sink", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "read", "(Lj/f;J)J", "Lkotlin/u;", "close", "()V", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", HttpUrl.FRAGMENT_ENCODE_SET, "invokeStartEvent", "Z", "contentLength", "J", "closed", "completed", "bytesReceived", "Lj/d0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lj/d0;J)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public final class ResponseBodySource extends AbstractC9713l {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, InterfaceC9700d0 interfaceC9700d0, long j2) {
            super(interfaceC9700d0);
            C9801m.m32346f(interfaceC9700d0, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
            this.invokeStartEvent = true;
            if (j2 == 0) {
                complete(null);
            }
        }

        @Override // p353j.AbstractC9713l, p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        public final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            if (e2 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e2);
        }

        @Override // p353j.AbstractC9713l, p353j.InterfaceC9700d0
        public long read(C9703f sink, long byteCount) throws IOException {
            C9801m.m32346f(sink, "sink");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j2 = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                }
                if (j2 == -1) {
                    complete(null);
                    return -1L;
                }
                long j3 = this.bytesReceived + j2;
                long j4 = this.contentLength;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j3);
                }
                this.bytesReceived = j3;
                if (j3 == j4) {
                    complete(null);
                }
                return j2;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        C9801m.m32346f(realCall, "call");
        C9801m.m32346f(eventListener, "eventListener");
        C9801m.m32346f(exchangeFinder, "finder");
        C9801m.m32346f(exchangeCodec, "codec");
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
        this.connection = exchangeCodec.getConnection();
    }

    private final void trackFailure(IOException e2) {
        this.finder.trackFailure(e2);
        this.codec.getConnection().trackFailure$okhttp(this.call, e2);
    }

    public final <E extends IOException> E bodyComplete(long bytesRead, boolean responseDone, boolean requestDone, E e2) {
        if (e2 != null) {
            trackFailure(e2);
        }
        if (requestDone) {
            if (e2 != null) {
                this.eventListener.requestFailed(this.call, e2);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e2 != null) {
                this.eventListener.responseFailed(this.call, e2);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return (E) this.call.messageDone$okhttp(this, requestDone, responseDone, e2);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final InterfaceC9696b0 createRequestBody(Request request, boolean duplex) throws IOException {
        C9801m.m32346f(request, "request");
        this.isDuplex = duplex;
        RequestBody requestBodyBody = request.body();
        C9801m.m32343c(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    /* renamed from: getConnection$okhttp, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !C9801m.m32341a(this.finder.getAddress().url().host(), this.connection.getRoute().address().url().host());
    }

    /* renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        C9801m.m32346f(response, "response");
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, C9718q.m32120d(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void responseHeadersEnd(Response response) {
        C9801m.m32346f(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        C9801m.m32346f(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }
}
