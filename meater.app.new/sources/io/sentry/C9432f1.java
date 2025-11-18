package io.sentry;

import cm.aptoide.p092pt.dataprovider.BuildConfig;
import io.sentry.util.C9646q;
import java.net.URI;

/* compiled from: Dsn.java */
/* renamed from: io.sentry.f1 */
/* loaded from: classes2.dex */
final class C9432f1 {

    /* renamed from: a */
    private final String f36317a;

    /* renamed from: b */
    private final String f36318b;

    /* renamed from: c */
    private final String f36319c;

    /* renamed from: d */
    private final String f36320d;

    /* renamed from: e */
    private final URI f36321e;

    C9432f1(String str) throws IllegalArgumentException {
        try {
            C9646q.m31802c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f36320d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f36319c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f36318b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f36317a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f36321e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    /* renamed from: a */
    public String m30783a() {
        return this.f36320d;
    }

    /* renamed from: b */
    public String m30784b() {
        return this.f36319c;
    }

    /* renamed from: c */
    URI m30785c() {
        return this.f36321e;
    }
}
