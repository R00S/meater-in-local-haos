package okhttp3;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.p429io.C10556a;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p453io.FileSystem;
import okhttp3.internal.platform.Platform;
import p353j.AbstractC9712k;
import p353j.AbstractC9713l;
import p353j.C9703f;
import p353j.C9710i;
import p353j.C9718q;
import p353j.InterfaceC9696b0;
import p353j.InterfaceC9700d0;
import p353j.InterfaceC9705g;
import p353j.InterfaceC9709h;

/* compiled from: Cache.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0004ONPQB!\b\u0000\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LB\u0019\b\u0016\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bK\u0010MJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u001dJ\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020(¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u001dJ\u000f\u00101\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\b7\u0010\u001dJ\r\u00109\u001a\u00020$¢\u0006\u0004\b9\u0010&J\r\u0010:\u001a\u00020$¢\u0006\u0004\b:\u0010&J\r\u0010;\u001a\u00020$¢\u0006\u0004\b;\u0010&R\u0016\u0010;\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0013\u0010>\u001a\u00020=8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010?R\"\u0010%\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010<\u001a\u0004\b@\u0010&\"\u0004\bA\u0010BR\u0016\u0010:\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010<R\u001c\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u00109\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010<R\"\u0010'\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010<\u001a\u0004\bG\u0010&\"\u0004\bH\u0010BR\u0013\u00101\u001a\u00020.8G@\u0006¢\u0006\u0006\u001a\u0004\b1\u00100¨\u0006R"}, m32267d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lkotlin/u;", "abortQuietly", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "()V", "delete", "evictAll", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "urls", "()Ljava/util/Iterator;", HttpUrl.FRAGMENT_ENCODE_SET, "writeAbortCount", "()I", "writeSuccessCount", HttpUrl.FRAGMENT_ENCODE_SET, "size", "()J", "maxSize", "flush", "close", "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "I", HttpUrl.FRAGMENT_ENCODE_SET, "isClosed", "()Z", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "(I)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: Cache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0011\u001a\u00060\u000fR\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001d\u0010\u0011\u001a\u00060\u000fR\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m32267d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Lj/h;", "source", "()Lj/h;", "bodySource", "Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private static final class CacheResponseBody extends ResponseBody {
        private final InterfaceC9709h bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            C9801m.m32346f(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            final InterfaceC9700d0 source = snapshot.getSource(1);
            this.bodySource = C9718q.m32120d(new AbstractC9713l(source) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // p353j.AbstractC9713l, p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    CacheResponseBody.this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public InterfaceC9709h getSource() {
            return this.bodySource;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001a*\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0015¢\u0006\u0004\b\t\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, m32267d2 = {"Lokhttp3/Cache$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "varyFields", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "varyHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", "url", RoomNotification.KEY, "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lj/h;", "source", HttpUrl.FRAGMENT_ENCODE_SET, "readInt$okhttp", "(Lj/h;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", HttpUrl.FRAGMENT_ENCODE_SET, "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (C10546u.m37515q("Vary", headers.name(i2), true)) {
                    String strValue = headers.value(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C10546u.m37517s(StringCompanionObject.f37185a));
                    }
                    for (String str : C10547v.m37581u0(strValue, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(C10547v.m37549O0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : C10822w0.m38917d();
        }

        public final boolean hasVaryAll(Response response) {
            C9801m.m32346f(response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl url) {
            C9801m.m32346f(url, "url");
            return C9710i.f37052g.m32103d(url.getUrl()).m32088I().mo31967F();
        }

        public final int readInt$okhttp(InterfaceC9709h source) throws IOException {
            C9801m.m32346f(source, "source");
            try {
                long jMo32035d0 = source.mo32035d0();
                String strMo32011L0 = source.mo32011L0();
                if (jMo32035d0 >= 0 && jMo32035d0 <= Integer.MAX_VALUE) {
                    if (!(strMo32011L0.length() > 0)) {
                        return (int) jMo32035d0;
                    }
                }
                throw new IOException("expected an int but was \"" + jMo32035d0 + strMo32011L0 + '\"');
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            C9801m.m32346f(response, "$this$varyHeaders");
            Response responseNetworkResponse = response.networkResponse();
            C9801m.m32343c(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            C9801m.m32346f(cachedResponse, "cachedResponse");
            C9801m.m32346f(cachedRequest, "cachedRequest");
            C9801m.m32346f(newRequest, "newRequest");
            Set<String> setVaryFields = varyFields(cachedResponse.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!C9801m.m32341a(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        private final Headers varyHeaders(Headers requestHeaders, Headers responseHeaders) {
            Set<String> setVaryFields = varyFields(responseHeaders);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = requestHeaders.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = requestHeaders.name(i2);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, requestHeaders.value(i2));
                }
            }
            return builder.build();
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00060\u0011R\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m32267d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lkotlin/u;", "abort", "()V", "Lj/b0;", "body", "()Lj/b0;", "cacheOut", "Lj/b0;", HttpUrl.FRAGMENT_ENCODE_SET, "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private final class RealCacheRequest implements CacheRequest {
        private final InterfaceC9696b0 body;
        private final InterfaceC9696b0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor) {
            C9801m.m32346f(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            InterfaceC9696b0 interfaceC9696b0NewSink = editor.newSink(1);
            this.cacheOut = interfaceC9696b0NewSink;
            this.body = new AbstractC9712k(interfaceC9696b0NewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (RealCacheRequest.this.this$0) {
                        if (RealCacheRequest.this.getDone()) {
                            return;
                        }
                        RealCacheRequest.this.setDone(true);
                        Cache cache2 = RealCacheRequest.this.this$0;
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        RealCacheRequest.this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (this.this$0) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache cache = this.this$0;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: body, reason: from getter */
        public InterfaceC9696b0 getBody() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\f\u0012\b\u0012\u00060\rR\u00020\u000e0\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m32267d2 = {"okhttp3/Cache$urls$1", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "()Z", "next", "()Ljava/lang/String;", "Lkotlin/u;", "remove", "()V", "nextUrl", "Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Ljava/util/Iterator;", "canRemove", "Z", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    /* renamed from: okhttp3.Cache$urls$1 */
    public static final class C110951 implements Iterator<String>, KMappedMarker {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        C110951() {
            this.delegate = Cache.this.getCache().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = C9718q.m32120d(next.getSource(0)).mo32011L0();
                        C10556a.m37638a(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            C9801m.m32343c(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public Cache(File file, long j2, FileSystem fileSystem) {
        C9801m.m32346f(file, "directory");
        C9801m.m32346f(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j2, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m41064deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        C9801m.m32346f(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null) {
                        Util.closeQuietly(responseBodyBody);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* renamed from: getCache$okhttp, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        C9801m.m32346f(response, "response");
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!C9801m.m32341a(strMethod, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        C9801m.m32346f(request, "request");
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i2) {
        this.writeAbortCount = i2;
    }

    public final void setWriteSuccessCount$okhttp(int i2) {
        this.writeSuccessCount = i2;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        C9801m.m32346f(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response cached, Response network) {
        C9801m.m32346f(cached, "cached");
        C9801m.m32346f(network, "network");
        Entry entry = new Entry(network);
        ResponseBody responseBodyBody = cached.body();
        if (responseBodyBody == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        DiskLruCache.Editor editorEdit = null;
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit != null) {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            }
        } catch (IOException unused) {
            abortQuietly(editorEdit);
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new C110951();
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j2) {
        this(file, j2, FileSystem.SYSTEM);
        C9801m.m32346f(file, "directory");
    }

    /* compiled from: Cache.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0011\b\u0016\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b7\u00109J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0016\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u001aR\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010%\u001a\u00020\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103¨\u0006;"}, m32267d2 = {"Lokhttp3/Cache$Entry;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/h;", "source", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "readCertificateList", "(Lj/h;)Ljava/util/List;", "Lj/g;", "sink", "certificates", "Lkotlin/u;", "writeCertList", "(Lj/g;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", HttpUrl.FRAGMENT_ENCODE_SET, "matches", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "requestMethod", "Ljava/lang/String;", "responseHeaders", "message", "isHttps", "()Z", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", HttpUrl.FRAGMENT_ENCODE_SET, "code", "I", "url", HttpUrl.FRAGMENT_ENCODE_SET, "sentRequestMillis", "J", "receivedResponseMillis", "Lj/d0;", "rawSource", "<init>", "(Lj/d0;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private static final class Entry {
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(InterfaceC9700d0 interfaceC9700d0) throws IOException {
            C9801m.m32346f(interfaceC9700d0, "rawSource");
            try {
                InterfaceC9709h interfaceC9709hM32120d = C9718q.m32120d(interfaceC9700d0);
                this.url = interfaceC9709hM32120d.mo32011L0();
                this.requestMethod = interfaceC9709hM32120d.mo32011L0();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.INSTANCE.readInt$okhttp(interfaceC9709hM32120d);
                for (int i2 = 0; i2 < int$okhttp; i2++) {
                    builder.addLenient$okhttp(interfaceC9709hM32120d.mo32011L0());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.INSTANCE.parse(interfaceC9709hM32120d.mo32011L0());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.INSTANCE.readInt$okhttp(interfaceC9709hM32120d);
                for (int i3 = 0; i3 < int$okhttp2; i3++) {
                    builder2.addLenient$okhttp(interfaceC9709hM32120d.mo32011L0());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strMo32011L0 = interfaceC9709hM32120d.mo32011L0();
                    if (strMo32011L0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo32011L0 + '\"');
                    }
                    this.handshake = Handshake.INSTANCE.get(!interfaceC9709hM32120d.mo32019R() ? TlsVersion.INSTANCE.forJavaName(interfaceC9709hM32120d.mo32011L0()) : TlsVersion.SSL_3_0, CipherSuite.INSTANCE.forJavaName(interfaceC9709hM32120d.mo32011L0()), readCertificateList(interfaceC9709hM32120d), readCertificateList(interfaceC9709hM32120d));
                } else {
                    this.handshake = null;
                }
            } finally {
                interfaceC9700d0.close();
            }
        }

        private final boolean isHttps() {
            return C10546u.m37511E(this.url, "https://", false, 2, null);
        }

        private final List<Certificate> readCertificateList(InterfaceC9709h source) throws IOException, CertificateException {
            int int$okhttp = Cache.INSTANCE.readInt$okhttp(source);
            if (int$okhttp == -1) {
                return C10817u.m38888j();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i2 = 0; i2 < int$okhttp; i2++) {
                    String strMo32011L0 = source.mo32011L0();
                    C9703f c9703f = new C9703f();
                    C9710i c9710iM32100a = C9710i.f37052g.m32100a(strMo32011L0);
                    C9801m.m32343c(c9710iM32100a);
                    c9703f.mo32023U0(c9710iM32100a);
                    arrayList.add(certificateFactory.generateCertificate(c9703f.mo32051o1()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private final void writeCertList(InterfaceC9705g sink, List<? extends Certificate> certificates) throws IOException, CertificateEncodingException {
            try {
                sink.mo32043i1(certificates.size()).writeByte(10);
                int size = certificates.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] encoded = certificates.get(i2).getEncoded();
                    C9710i.a aVar = C9710i.f37052g;
                    C9801m.m32345e(encoded, "bytes");
                    sink.mo32055r0(C9710i.a.m32099f(aVar, encoded, 0, 0, 3, null).mo31977g()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            C9801m.m32346f(request, "request");
            C9801m.m32346f(response, "response");
            return C9801m.m32341a(this.url, request.url().getUrl()) && C9801m.m32341a(this.requestMethod, request.method()) && Cache.INSTANCE.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            C9801m.m32346f(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            C9801m.m32346f(editor, "editor");
            InterfaceC9705g interfaceC9705gM32119c = C9718q.m32119c(editor.newSink(0));
            try {
                interfaceC9705gM32119c.mo32055r0(this.url).writeByte(10);
                interfaceC9705gM32119c.mo32055r0(this.requestMethod).writeByte(10);
                interfaceC9705gM32119c.mo32043i1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i2 = 0; i2 < size; i2++) {
                    interfaceC9705gM32119c.mo32055r0(this.varyHeaders.name(i2)).mo32055r0(": ").mo32055r0(this.varyHeaders.value(i2)).writeByte(10);
                }
                interfaceC9705gM32119c.mo32055r0(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                interfaceC9705gM32119c.mo32043i1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    interfaceC9705gM32119c.mo32055r0(this.responseHeaders.name(i3)).mo32055r0(": ").mo32055r0(this.responseHeaders.value(i3)).writeByte(10);
                }
                interfaceC9705gM32119c.mo32055r0(SENT_MILLIS).mo32055r0(": ").mo32043i1(this.sentRequestMillis).writeByte(10);
                interfaceC9705gM32119c.mo32055r0(RECEIVED_MILLIS).mo32055r0(": ").mo32043i1(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    interfaceC9705gM32119c.writeByte(10);
                    Handshake handshake = this.handshake;
                    C9801m.m32343c(handshake);
                    interfaceC9705gM32119c.mo32055r0(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(interfaceC9705gM32119c, this.handshake.peerCertificates());
                    writeCertList(interfaceC9705gM32119c, this.handshake.localCertificates());
                    interfaceC9705gM32119c.mo32055r0(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                C10775u c10775u = C10775u.f41439a;
                C10556a.m37638a(interfaceC9705gM32119c, null);
            } finally {
            }
        }

        public Entry(Response response) {
            C9801m.m32346f(response, "response");
            this.url = response.request().url().getUrl();
            this.varyHeaders = Cache.INSTANCE.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
