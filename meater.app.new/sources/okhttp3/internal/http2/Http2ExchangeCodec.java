package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p353j.C9702e0;
import p353j.InterfaceC9696b0;
import p353j.InterfaceC9700d0;

/* compiled from: Http2ExchangeCodec.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B'\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b4\u00105J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\rR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\u00020\"8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, m32267d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/Request;", "request", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "Lj/b0;", "createRequestBody", "(Lokhttp3/Request;J)Lj/b0;", "Lkotlin/u;", "writeRequestHeaders", "(Lokhttp3/Request;)V", "flushRequest", "()V", "finishRequest", HttpUrl.FRAGMENT_ENCODE_SET, "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lj/d0;", "openResponseBodySource", "(Lokhttp3/Response;)Lj/d0;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "cancel", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/connection/RealConnection;", Http2ExchangeCodec.CONNECTION, "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "canceled", "Z", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* renamed from: TE */
    private static final String f41960TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f41960TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f41960TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* compiled from: Http2ExchangeCodec.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011¨\u0006\u001e"}, m32267d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Request;", "request", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "http2HeadersList", "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Response$Builder;", "readHttp2HeadersList", "(Lokhttp3/Headers;Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final List<Header> http2HeadersList(Request request) {
            C9801m.m32346f(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headers.name(i2);
                Locale locale = Locale.US;
                C9801m.m32345e(locale, "Locale.US");
                if (strName == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strName.toLowerCase(locale);
                C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (C9801m.m32341a(lowerCase, Http2ExchangeCodec.f41960TE) && C9801m.m32341a(headers.value(i2), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i2)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headerBlock, Protocol protocol) throws NumberFormatException, IOException {
            C9801m.m32346f(headerBlock, "headerBlock");
            C9801m.m32346f(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headerBlock.name(i2);
                String strValue = headerBlock.value(i2);
                if (C9801m.m32341a(strName, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.INSTANCE.parse("HTTP/1.1 " + strValue);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        C9801m.m32346f(okHttpClient, "client");
        C9801m.m32346f(realConnection, CONNECTION);
        C9801m.m32346f(realInterceptorChain, "chain");
        C9801m.m32346f(http2Connection, "http2Connection");
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List<Protocol> listProtocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listProtocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC9696b0 createRequestBody(Request request, long contentLength) {
        C9801m.m32346f(request, "request");
        Http2Stream http2Stream = this.stream;
        C9801m.m32343c(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        Http2Stream http2Stream = this.stream;
        C9801m.m32343c(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC9700d0 openResponseBodySource(Response response) {
        C9801m.m32346f(response, "response");
        Http2Stream http2Stream = this.stream;
        C9801m.m32343c(http2Stream);
        return http2Stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) throws IOException, NumberFormatException {
        Http2Stream http2Stream = this.stream;
        C9801m.m32343c(http2Stream);
        Response.Builder http2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (expectContinue && http2HeadersList.getCode() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        C9801m.m32346f(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        C9801m.m32343c(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        C9801m.m32346f(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(INSTANCE.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            C9801m.m32343c(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        C9801m.m32343c(http2Stream2);
        C9702e0 timeout = http2Stream2.readTimeout();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        C9801m.m32343c(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis(), timeUnit);
    }
}
