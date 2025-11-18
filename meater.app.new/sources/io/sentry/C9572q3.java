package io.sentry;

import io.sentry.util.C9646q;
import java.net.URI;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* compiled from: RequestDetailsResolver.java */
/* renamed from: io.sentry.q3 */
/* loaded from: classes2.dex */
final class C9572q3 {

    /* renamed from: a */
    private final C9680x4 f36795a;

    public C9572q3(C9680x4 c9680x4) {
        this.f36795a = (C9680x4) C9646q.m31802c(c9680x4, "options is required");
    }

    /* renamed from: a */
    C9533p3 m31554a() {
        String str;
        C9432f1 c9432f1 = new C9432f1(this.f36795a.getDsn());
        URI uriM30785c = c9432f1.m30785c();
        String string = uriM30785c.resolve(uriM30785c.getPath() + "/envelope/").toString();
        String strM30783a = c9432f1.m30783a();
        String strM30784b = c9432f1.m30784b();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=7,sentry_client=");
        sb.append(this.f36795a.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(strM30783a);
        if (strM30784b == null || strM30784b.length() <= 0) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ",sentry_secret=" + strM30784b;
        }
        sb.append(str);
        String string2 = sb.toString();
        String sentryClientName = this.f36795a.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        return new C9533p3(string, map);
    }
}
