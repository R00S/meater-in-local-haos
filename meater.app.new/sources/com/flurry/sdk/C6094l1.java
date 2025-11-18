package com.flurry.sdk;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.l1 */
/* loaded from: classes2.dex */
public final class C6094l1 {

    /* renamed from: a */
    public static final Set<String> f16104a;

    /* renamed from: b */
    private static X509TrustManagerExtensions f16105b;

    static {
        HashSet hashSet = new HashSet(13);
        f16104a = hashSet;
        hashSet.add("WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=");
        hashSet.add("SVqWumuteCQHvVIaALrOZXuzVVVeS7f4FGxxu6V+es4=");
        hashSet.add("cAajgxHlj7GTSEIzIYIQxmEloOSoJq7VOaxWHfv72QM=");
        hashSet.add("I/Lt/z7ekCWanjD0Cvj5EqXls2lOaThEA0H2Bg4BT/o=");
        hashSet.add("Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=");
        hashSet.add("JbQbUG5JMJUoI6brnx0x3vZF6jilxsapbXGVfjhN8Fg=");
        hashSet.add("r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
        hashSet.add("UZJDjsNp1+4M5x9cbbdflB779y5YRBcV6Z6rBMLIrO4=");
        hashSet.add("lnsM2T/O9/J84sJFdnrpsFp3awZJ+ZZbYpCWhGloaHI=");
        hashSet.add("i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=");
        hashSet.add("uUwZgwDOxcBXrQcntwu+kYFpkiVkOaezL0WYEZ3anJc=");
        hashSet.add("dolnbtzEBnELx/9lOEQ22e6OZO/QNb6VSSX2XHA3E7A=");
        hashSet.add("2fRAUXyxl4A1/XHrKNBmc8bTkzA7y4FB/GLJuNAzCqY=");
        f16105b = null;
        if (Build.VERSION.SDK_INT >= 17) {
            f16105b = new X509TrustManagerExtensions(m13175a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static javax.net.ssl.X509TrustManager m13175a() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        /*
            java.lang.String r0 = "Error in getting trust manager: "
            java.lang.String r1 = "SslPinningValidator"
            r2 = 0
            java.lang.String r3 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.security.KeyStoreException -> L15 java.security.NoSuchAlgorithmException -> L1b
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch: java.security.KeyStoreException -> L15 java.security.NoSuchAlgorithmException -> L1b
            r3.init(r2)     // Catch: java.security.KeyStoreException -> L11 java.security.NoSuchAlgorithmException -> L13
            goto L20
        L11:
            r4 = move-exception
            goto L17
        L13:
            r4 = move-exception
            goto L1d
        L15:
            r4 = move-exception
            r3 = r2
        L17:
            com.flurry.sdk.C6021d1.m13033f(r1, r0, r4)
            goto L20
        L1b:
            r4 = move-exception
            r3 = r2
        L1d:
            com.flurry.sdk.C6021d1.m13033f(r1, r0, r4)
        L20:
            if (r3 != 0) goto L23
            return r2
        L23:
            javax.net.ssl.TrustManager[] r0 = r3.getTrustManagers()
            int r1 = r0.length
            r3 = 0
        L29:
            if (r3 >= r1) goto L38
            r4 = r0[r3]
            boolean r5 = r4 instanceof javax.net.ssl.X509TrustManager
            if (r5 == 0) goto L35
            r2 = r4
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            goto L38
        L35:
            int r3 = r3 + 1
            goto L29
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6094l1.m13175a():javax.net.ssl.X509TrustManager");
    }

    /* renamed from: b */
    public static void m13176b(HttpsURLConnection httpsURLConnection) throws SSLException, NoSuchAlgorithmException, CertificateException {
        List<X509Certificate> listCheckServerTrusted;
        if (Build.VERSION.SDK_INT >= 17 && f16105b != null) {
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            try {
                Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                listCheckServerTrusted = f16105b.checkServerTrusted((X509Certificate[]) Arrays.copyOf(serverCertificates, serverCertificates.length, X509Certificate[].class), "RSA", httpsURLConnection.getURL().getHost());
            } catch (NoSuchAlgorithmException e2) {
                C6021d1.m13033f("SslPinningValidator", "Error in validating pinning: ", e2);
            } catch (CertificateException e3) {
                C6021d1.m13033f("SslPinningValidator", "Error in getting certificate: ", e3);
            }
            if (listCheckServerTrusted == null) {
                throw new SSLPeerUnverifiedException("Empty trusted chain Certificate.");
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (X509Certificate x509Certificate : listCheckServerTrusted) {
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                messageDigest.update(encoded, 0, encoded.length);
                String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
                if (f16104a.contains(strEncodeToString)) {
                    C6021d1.m13032e("SslPinningValidator", "Found matched pin: ".concat(String.valueOf(strEncodeToString)));
                    return;
                }
                str = str + "    sha256/" + strEncodeToString + ": " + x509Certificate.getSubjectDN().toString() + "\n";
            }
            throw new SSLPeerUnverifiedException("Certificate pinning failure!\n  Peer certificate chain:\n".concat(String.valueOf(str)));
        }
    }
}
