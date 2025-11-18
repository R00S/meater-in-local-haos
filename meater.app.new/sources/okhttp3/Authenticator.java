package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* compiled from: Authenticator.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m32267d2 = {"Lokhttp3/Authenticator;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Authenticator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* compiled from: Authenticator.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t"}, m32267d2 = {"Lokhttp3/Authenticator$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", "NONE", "<init>", "()V", "AuthenticatorNone", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: Authenticator.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m32267d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                C9801m.m32346f(response, "response");
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    Request authenticate(Route route, Response response) throws IOException;
}
