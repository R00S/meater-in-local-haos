package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import p353j.C9703f;
import p353j.InterfaceC9709h;

/* compiled from: Response.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001XB}\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u001d\u0012\b\u0010(\u001a\u0004\u0018\u00010#\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\b\u00100\u001a\u0004\u0018\u00010\u0000\u0012\b\u00102\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010<\u001a\u00020!\u0012\u0006\u0010>\u001a\u00020!\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bV\u0010WJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0018\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0011\u0010(\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b&\u0010'J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0011\u0010.\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b,\u0010-J\u0011\u00100\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b/\u0010-J\u0011\u00102\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b1\u0010-J\u0013\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0017¢\u0006\u0004\b4\u00105J\u000f\u00109\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010<\u001a\u00020!H\u0007¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020!H\u0007¢\u0006\u0004\b=\u0010;J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010\u0010R\u0019\u0010\r\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\b\r\u0010\fR\u0018\u0010D\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010(\u001a\u0004\u0018\u00010#8\u0007@\u0006¢\u0006\f\n\u0004\b(\u0010F\u001a\u0004\b(\u0010'R\u0019\u0010<\u001a\u00020!8\u0007@\u0006¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\b<\u0010;R\u001b\u0010.\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b.\u0010H\u001a\u0004\b.\u0010-R\u001e\u0010J\u001a\u0004\u0018\u00010I8\u0001@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0019\u0010\u0011\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\b\u0005\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0018\u001a\u00020\u001d8\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\b\u0018\u0010\u001fR\u001b\u00100\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b0\u0010H\u001a\u0004\b0\u0010-R\u0013\u0010R\u001a\u00020Q8F@\u0006¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001b\u00102\u001a\u0004\u0018\u00010\u00008\u0007@\u0006¢\u0006\f\n\u0004\b2\u0010H\u001a\u0004\b2\u0010-R\u0013\u0010T\u001a\u00020Q8F@\u0006¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0019\u0010>\u001a\u00020!8\u0007@\u0006¢\u0006\f\n\u0004\b>\u0010G\u001a\u0004\b>\u0010;R\u0019\u0010\t\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\b\t\u0010\bR\u0013\u00109\u001a\u0002068G@\u0006¢\u0006\u0006\u001a\u0004\b9\u00108¨\u0006Y"}, m32267d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_code", "()I", "code", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_message", "()Ljava/lang/String;", "message", "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", "name", HttpUrl.FRAGMENT_ENCODE_SET, "headers", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "Lokhttp3/ResponseBody;", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lokhttp3/Response;", "networkResponse", "-deprecated_cacheResponse", "cacheResponse", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", "receivedResponseAtMillis", "Lkotlin/u;", "close", "()V", "toString", "I", "lazyCacheControl", "Lokhttp3/CacheControl;", "Lokhttp3/ResponseBody;", "J", "Lokhttp3/Response;", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "Ljava/lang/String;", "Lokhttp3/Request;", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "isSuccessful", "()Z", "isRedirect", "Lokhttp3/Protocol;", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "Builder", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i2, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j2, long j3, Exchange exchange) {
        C9801m.m32346f(request, "request");
        C9801m.m32346f(protocol, "protocol");
        C9801m.m32346f(str, "message");
        C9801m.m32346f(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i2;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j2;
        this.receivedResponseAtMillis = j3;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m41171deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    /* renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    /* renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    /* renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i2 = this.code;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return C10817u.m38888j();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    /* renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String str) {
        return header$default(this, str, null, 2, null);
    }

    public final String header(String name, String defaultValue) {
        C9801m.m32346f(name, "name");
        String str = this.headers.get(name);
        return str != null ? str : defaultValue;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i2 = this.code;
        if (i2 != 307 && i2 != 308) {
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i2 = this.code;
        return 200 <= i2 && 299 >= i2;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long byteCount) throws IOException {
        ResponseBody responseBody = this.body;
        C9801m.m32343c(responseBody);
        InterfaceC9709h interfaceC9709hPeek = responseBody.source().peek();
        C9703f c9703f = new C9703f();
        interfaceC9709hPeek.request(byteCount);
        c9703f.m32061x0(interfaceC9709hPeek, Math.min(byteCount, interfaceC9709hPeek.mo32042i().size()));
        return ResponseBody.INSTANCE.create(c9703f, this.body.contentType(), c9703f.size());
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final List<String> headers(String name) {
        C9801m.m32346f(name, "name");
        return this.headers.values(name);
    }

    /* compiled from: Response.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b9\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bj\u0010kB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bj\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b&\u0010%J\u0019\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u001f\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010+\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010/R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010'\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010R\u001a\u0004\bS\u00102\"\u0004\bT\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010R\u001a\u0004\b_\u00102\"\u0004\b`\u0010\nR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\ba\u00102\"\u0004\bb\u0010\nR\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00109\u001a\u0004\bc\u0010;\"\u0004\bd\u0010=R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006l"}, m32267d2 = {"Lokhttp3/Response$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "name", "Lokhttp3/Response;", "response", "Lkotlin/u;", "checkSupportResponse", "(Ljava/lang/String;Lokhttp3/Response;)V", "checkPriorResponse", "(Lokhttp3/Response;)V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "code", "(I)Lokhttp3/Response$Builder;", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "networkResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "cacheResponse", "priorResponse", HttpUrl.FRAGMENT_ENCODE_SET, "sentRequestAtMillis", "(J)Lokhttp3/Response$Builder;", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "()Lokhttp3/Response;", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "J", "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Lokhttp3/Response;", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (!(response.networkResponse() == null)) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (!(response.cacheResponse() == null)) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public Builder addHeader(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder body(ResponseBody body) {
            this.body = body;
            return this;
        }

        public Response build() {
            int i2 = this.code;
            if (!(i2 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i2, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public Builder cacheResponse(Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        /* renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        /* renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        /* renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        /* renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        /* renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        /* renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        /* renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            C9801m.m32346f(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange deferredTrailers) {
            C9801m.m32346f(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Builder message(String message) {
            C9801m.m32346f(message, "message");
            this.message = message;
            return this;
        }

        public Builder networkResponse(Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public Builder priorResponse(Response priorResponse) {
            checkPriorResponse(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            C9801m.m32346f(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public Builder removeHeader(String name) {
            C9801m.m32346f(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder request(Request request) {
            C9801m.m32346f(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i2) {
            this.code = i2;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            C9801m.m32346f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j2) {
            this.receivedResponseAtMillis = j2;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j2) {
            this.sentRequestAtMillis = j2;
        }

        public Builder(Response response) {
            C9801m.m32346f(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
