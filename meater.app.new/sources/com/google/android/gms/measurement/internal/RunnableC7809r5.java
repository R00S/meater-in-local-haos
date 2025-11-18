package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes2.dex */
final class RunnableC7809r5 implements Runnable {

    /* renamed from: f */
    private final URL f28875f;

    /* renamed from: g */
    private final byte[] f28876g;

    /* renamed from: h */
    private final InterfaceC7782o5 f28877h;

    /* renamed from: i */
    private final String f28878i;

    /* renamed from: j */
    private final Map<String, String> f28879j;

    /* renamed from: k */
    private final /* synthetic */ zzia f28880k;

    public RunnableC7809r5(zzia zziaVar, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC7782o5 interfaceC7782o5) {
        this.f28880k = zziaVar;
        Preconditions.m14368g(str);
        Preconditions.m14372k(url);
        Preconditions.m14372k(interfaceC7782o5);
        this.f28875f = url;
        this.f28876g = null;
        this.f28877h = interfaceC7782o5;
        this.f28878i = str;
        this.f28879j = null;
    }

    /* renamed from: b */
    private final void m22842b(final int i2, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) throws IllegalStateException {
        this.f28880k.mo22835g().m23201z(new Runnable(this, i2, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.q5

            /* renamed from: f */
            private final RunnableC7809r5 f28837f;

            /* renamed from: g */
            private final int f28838g;

            /* renamed from: h */
            private final Exception f28839h;

            /* renamed from: i */
            private final byte[] f28840i;

            /* renamed from: j */
            private final Map f28841j;

            {
                this.f28837f = this;
                this.f28838g = i2;
                this.f28839h = exc;
                this.f28840i = bArr;
                this.f28841j = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28837f.m22843a(this.f28838g, this.f28839h, this.f28840i, this.f28841j);
            }
        });
    }

    /* renamed from: a */
    final /* synthetic */ void m22843a(int i2, Exception exc, byte[] bArr, Map map) {
        this.f28877h.mo22698a(this.f28878i, i2, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionM23325u;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        this.f28880k.mo22791c();
        int responseCode = 0;
        try {
            httpURLConnectionM23325u = this.f28880k.m23325u(this.f28875f);
            try {
                Map<String, String> map3 = this.f28879j;
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        httpURLConnectionM23325u.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                responseCode = httpURLConnectionM23325u.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnectionM23325u.getHeaderFields();
                try {
                    zzia zziaVar = this.f28880k;
                    byte[] bArrM23324w = zzia.m23324w(httpURLConnectionM23325u);
                    httpURLConnectionM23325u.disconnect();
                    m22842b(responseCode, null, bArrM23324w, headerFields);
                } catch (IOException e2) {
                    map2 = headerFields;
                    e = e2;
                    if (httpURLConnectionM23325u != null) {
                        httpURLConnectionM23325u.disconnect();
                    }
                    m22842b(responseCode, e, null, map2);
                } catch (Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnectionM23325u != null) {
                        httpURLConnectionM23325u.disconnect();
                    }
                    m22842b(responseCode, null, null, map);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                map2 = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnectionM23325u = null;
            map2 = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionM23325u = null;
            map = null;
        }
    }
}
