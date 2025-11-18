package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import p353j.C9704f0;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006\""}, m32267d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", HttpUrl.FRAGMENT_ENCODE_SET, "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", HttpUrl.FRAGMENT_ENCODE_SET, "verifyIpAddress", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "verifyHostname", "asciiToLowercase", "(Ljava/lang/String;)Ljava/lang/String;", "isAscii", "(Ljava/lang/String;)Z", "pattern", "(Ljava/lang/String;Ljava/lang/String;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "getSubjectAltNames", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "ALT_DNS_NAME", "I", "ALT_IPA_NAME", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C9801m.m32345e(locale, "Locale.US");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C10817u.m38888j();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!C9801m.m32341a(list.get(0), Integer.valueOf(type))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C10817u.m38888j();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) C9704f0.m32069b(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) throws CertificateParsingException {
        String strAsciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) throws CertificateParsingException {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (C9801m.m32341a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        C9801m.m32346f(certificate, "certificate");
        return C10782c0.m38609o0(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        C9801m.m32346f(host, "host");
        C9801m.m32346f(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        C9801m.m32346f(host, "host");
        C9801m.m32346f(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        if (!(hostname == null || hostname.length() == 0) && !C10546u.m37511E(hostname, ".", false, 2, null) && !C10546u.m37514p(hostname, "..", false, 2, null)) {
            if (!(pattern == null || pattern.length() == 0) && !C10546u.m37511E(pattern, ".", false, 2, null) && !C10546u.m37514p(pattern, "..", false, 2, null)) {
                if (!C10546u.m37514p(hostname, ".", false, 2, null)) {
                    hostname = hostname + ".";
                }
                String str = hostname;
                if (!C10546u.m37514p(pattern, ".", false, 2, null)) {
                    pattern = pattern + ".";
                }
                String strAsciiToLowercase = asciiToLowercase(pattern);
                if (!C10547v.m37538J(strAsciiToLowercase, "*", false, 2, null)) {
                    return C9801m.m32341a(str, strAsciiToLowercase);
                }
                if (!C10546u.m37511E(strAsciiToLowercase, "*.", false, 2, null) || C10547v.m37556V(strAsciiToLowercase, '*', 1, false, 4, null) != -1 || str.length() < strAsciiToLowercase.length() || C9801m.m32341a("*.", strAsciiToLowercase)) {
                    return false;
                }
                String strSubstring = strAsciiToLowercase.substring(1);
                C9801m.m32345e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                if (!C10546u.m37514p(str, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str.length() - strSubstring.length();
                return length <= 0 || C10547v.m37561a0(str, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }
}
