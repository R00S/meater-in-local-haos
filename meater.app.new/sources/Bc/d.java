package Bc;

import Cc.D;
import Ub.n;
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
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import pc.C4256a;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LBc/d;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "g", "b", "(Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Z", "pattern", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "c", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "e", "a", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1968a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        C3862t.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate certificate, int type) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return r.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C3862t.b(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return r.m();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) D.b(str, 0, 0, 3, null));
    }

    private final boolean f(String hostname, String pattern) {
        if (hostname != null && hostname.length() != 0 && !n.G(hostname, ".", false, 2, null) && !n.s(hostname, "..", false, 2, null) && pattern != null && pattern.length() != 0 && !n.G(pattern, ".", false, 2, null) && !n.s(pattern, "..", false, 2, null)) {
            if (!n.s(hostname, ".", false, 2, null)) {
                hostname = hostname + '.';
            }
            String str = hostname;
            if (!n.s(pattern, ".", false, 2, null)) {
                pattern = pattern + '.';
            }
            String strB = b(pattern);
            if (!n.L(strB, "*", false, 2, null)) {
                return C3862t.b(str, strB);
            }
            if (!n.G(strB, "*.", false, 2, null) || n.X(strB, '*', 1, false, 4, null) != -1 || str.length() < strB.length() || C3862t.b("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            C3862t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!n.s(str, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || n.d0(str, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String hostname, X509Certificate certificate) throws CertificateParsingException {
        String strB = b(hostname);
        List<String> listC = c(certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (f1968a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String ipAddress, X509Certificate certificate) throws CertificateParsingException {
        String strE = C4256a.e(ipAddress);
        List<String> listC = c(certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (C3862t.b(strE, C4256a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate certificate) throws CertificateParsingException {
        C3862t.g(certificate, "certificate");
        return r.F0(c(certificate, 7), c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        C3862t.g(host, "host");
        C3862t.g(certificate, "certificate");
        return pc.d.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        C3862t.g(host, "host");
        C3862t.g(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            C3862t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
