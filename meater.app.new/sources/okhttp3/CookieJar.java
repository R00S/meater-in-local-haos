package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: CookieJar.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m32267d2 = {"Lokhttp3/CookieJar;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/HttpUrl;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "cookies", "Lkotlin/u;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface CookieJar {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* compiled from: CookieJar.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m32267d2 = {"Lokhttp3/CookieJar$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/CookieJar;", "NO_COOKIES", "Lokhttp3/CookieJar;", "<init>", "()V", "NoCookies", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: CookieJar.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m32267d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "cookies", "Lkotlin/u;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl url) {
                C9801m.m32346f(url, "url");
                return C10817u.m38888j();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                C9801m.m32346f(url, "url");
                C9801m.m32346f(cookies, "cookies");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    List<Cookie> loadForRequest(HttpUrl url);

    void saveFromResponse(HttpUrl url, List<Cookie> cookies);
}
