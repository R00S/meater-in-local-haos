package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: HttpMethod.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006¨\u0006\r"}, m32267d2 = {"Lokhttp3/internal/http/HttpMethod;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "method", HttpUrl.FRAGMENT_ENCODE_SET, "requiresRequestBody", "(Ljava/lang/String;)Z", "permitsRequestBody", "invalidatesCache", "redirectsWithBody", "redirectsToGet", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        C9801m.m32346f(method, "method");
        return (C9801m.m32341a(method, "GET") || C9801m.m32341a(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        C9801m.m32346f(method, "method");
        return C9801m.m32341a(method, "POST") || C9801m.m32341a(method, "PUT") || C9801m.m32341a(method, "PATCH") || C9801m.m32341a(method, "PROPPATCH") || C9801m.m32341a(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        C9801m.m32346f(method, "method");
        return C9801m.m32341a(method, "POST") || C9801m.m32341a(method, "PATCH") || C9801m.m32341a(method, "PUT") || C9801m.m32341a(method, "DELETE") || C9801m.m32341a(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        C9801m.m32346f(method, "method");
        return !C9801m.m32341a(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        C9801m.m32346f(method, "method");
        return C9801m.m32341a(method, "PROPFIND");
    }
}
