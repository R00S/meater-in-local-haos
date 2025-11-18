package io.sentry;

import io.sentry.util.C9646q;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* compiled from: RequestDetails.java */
/* renamed from: io.sentry.p3 */
/* loaded from: classes2.dex */
public final class C9533p3 {

    /* renamed from: a */
    private final URL f36565a;

    /* renamed from: b */
    private final Map<String, String> f36566b;

    public C9533p3(String str, Map<String, String> map) {
        C9646q.m31802c(str, "url is required");
        C9646q.m31802c(map, "headers is required");
        try {
            this.f36565a = URI.create(str).toURL();
            this.f36566b = map;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e2);
        }
    }

    /* renamed from: a */
    public Map<String, String> m31173a() {
        return this.f36566b;
    }

    /* renamed from: b */
    public URL m31174b() {
        return this.f36565a;
    }
}
