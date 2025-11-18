package okhttp3.logging;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p429io.C10556a;
import kotlin.text.C10546u;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import p353j.C9703f;
import p353j.C9715n;
import p353j.InterfaceC9709h;

/* compiled from: HttpLoggingInterceptor.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0011\u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, m32267d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Headers;", "headers", HttpUrl.FRAGMENT_ENCODE_SET, "i", "Lkotlin/u;", "logHeader", "(Lokhttp3/Headers;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "bodyHasUnknownEncoding", "(Lokhttp3/Headers;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "name", "redactHeader", "(Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", HttpUrl.FRAGMENT_ENCODE_SET, "headersToRedact", "Ljava/util/Set;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "okhttp-logging-interceptor"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, m32268k = 1, m32269mv = {1, 4, 0})
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m32267d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "message", "Lkotlin/u;", "log", "(Ljava/lang/String;)V", "Companion", "okhttp-logging-interceptor"}, m32268k = 1, m32269mv = {1, 4, 0})
    public interface Logger {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: HttpLoggingInterceptor.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m32267d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "DefaultLogger", "okhttp-logging-interceptor"}, m32268k = 1, m32269mv = {1, 4, 0})
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            /* compiled from: HttpLoggingInterceptor.kt */
            @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", HttpUrl.FRAGMENT_ENCODE_SET, "message", "Lkotlin/u;", "log", "(Ljava/lang/String;)V", "<init>", "()V", "okhttp-logging-interceptor"}, m32268k = 1, m32269mv = {1, 4, 0})
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    C9801m.m32346f(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(C9789g c9789g) {
                this();
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(Logger logger) {
        C9801m.m32346f(logger, "logger");
        this.logger = logger;
        this.headersToRedact = C10822w0.m38917d();
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || C10546u.m37515q(str, "identity", true) || C10546u.m37515q(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i2) {
        String strValue = this.headersToRedact.contains(headers.name(i2)) ? "██" : headers.value(i2);
        this.logger.log(headers.name(i2) + ": " + strValue);
    }

    /* renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        String str;
        String string;
        Charset charset;
        Charset charset2;
        C9801m.m32346f(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? " " + connection.protocol() : HttpUrl.FRAGMENT_ENCODE_SET);
        String string2 = sb.toString();
        if (!z2 && requestBodyBody != null) {
            string2 = string2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(string2);
        if (z2) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType contentType = requestBodyBody.getContentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + contentType);
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                logHeader(headers, i2);
            }
            if (!z || requestBodyBody == null) {
                this.logger.log("--> END " + request.method());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (requestBodyBody.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (requestBodyBody.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                C9703f c9703f = new C9703f();
                requestBodyBody.writeTo(c9703f);
                MediaType contentType2 = requestBodyBody.getContentType();
                if (contentType2 == null || (charset2 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    C9801m.m32345e(charset2, "UTF_8");
                }
                this.logger.log(HttpUrl.FRAGMENT_ENCODE_SET);
                if (Utf8Kt.isProbablyUtf8(c9703f)) {
                    this.logger.log(c9703f.mo32060w0(charset2));
                    this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            C9801m.m32343c(responseBodyBody);
            long contentLength = responseBodyBody.getContentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            if (responseProceed.message().length() == 0) {
                str = "-byte body omitted)";
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                String strMessage = responseProceed.message();
                StringBuilder sb3 = new StringBuilder();
                str = "-byte body omitted)";
                sb3.append(String.valueOf(' '));
                sb3.append(strMessage);
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(' ');
            sb2.append(responseProceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z2 ? HttpUrl.FRAGMENT_ENCODE_SET : ", " + str2 + " body");
            sb2.append(')');
            logger.log(sb2.toString());
            if (z2) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    logHeader(headers2, i3);
                }
                if (!z || !HttpHeaders.promisesBody(responseProceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(responseProceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    InterfaceC9709h source = responseBodyBody.getSource();
                    source.request(Long.MAX_VALUE);
                    C9703f c9703fMo32042i = source.mo32042i();
                    Long l = null;
                    if (C10546u.m37515q("gzip", headers2.get("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(c9703fMo32042i.size());
                        C9715n c9715n = new C9715n(c9703fMo32042i.clone());
                        try {
                            c9703fMo32042i = new C9703f();
                            c9703fMo32042i.mo31999B0(c9715n);
                            C10556a.m37638a(c9715n, null);
                            l = lValueOf;
                        } finally {
                        }
                    }
                    MediaType mediaType = responseBodyBody.get$contentType();
                    if (mediaType == null || (charset = mediaType.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        C9801m.m32345e(charset, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(c9703fMo32042i)) {
                        this.logger.log(HttpUrl.FRAGMENT_ENCODE_SET);
                        this.logger.log("<-- END HTTP (binary " + c9703fMo32042i.size() + str);
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log(HttpUrl.FRAGMENT_ENCODE_SET);
                        this.logger.log(c9703fMo32042i.clone().mo32060w0(charset));
                    }
                    if (l != null) {
                        this.logger.log("<-- END HTTP (" + c9703fMo32042i.size() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + c9703fMo32042i.size() + "-byte body)");
                    }
                }
            }
            return responseProceed;
        } catch (Exception e2) {
            this.logger.log("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    public final void level(Level level) {
        C9801m.m32346f(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String name) {
        C9801m.m32346f(name, "name");
        TreeSet treeSet = new TreeSet(C10546u.m37517s(StringCompanionObject.f37185a));
        C10827z.m38933z(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        C9801m.m32346f(level, "level");
        this.level = level;
        return this;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
