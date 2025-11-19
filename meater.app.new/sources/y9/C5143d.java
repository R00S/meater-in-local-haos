package y9;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import v9.C4925a;
import w9.g;

/* compiled from: NetworkRequestMetricBuilderUtil.java */
/* renamed from: y9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5143d {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f53253a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C4925a.e().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static boolean c(String str) {
        return str == null || !f53253a.matcher(str).matches();
    }

    public static void d(g gVar) {
        if (!gVar.f()) {
            gVar.l();
        }
        gVar.b();
    }
}
