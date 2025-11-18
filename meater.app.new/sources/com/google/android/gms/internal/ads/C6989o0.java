package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.o0 */
/* loaded from: classes2.dex */
final class C6989o0 extends zzaj {

    /* renamed from: a */
    private final zzas f20118a;

    C6989o0(zzas zzasVar) {
        this.f20118a = zzasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    /* renamed from: b */
    public final zzar mo15664b(zzr<?> zzrVar, Map<String, String> map) throws zza, IOException {
        try {
            HttpResponse httpResponseMo16593a = this.f20118a.mo16593a(zzrVar, map);
            int statusCode = httpResponseMo16593a.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponseMo16593a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new zzl(header.getName(), header.getValue()));
            }
            if (httpResponseMo16593a.getEntity() == null) {
                return new zzar(statusCode, arrayList);
            }
            long contentLength = httpResponseMo16593a.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new zzar(statusCode, arrayList, (int) httpResponseMo16593a.getEntity().getContentLength(), httpResponseMo16593a.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e2) {
            throw new SocketTimeoutException(e2.getMessage());
        }
    }
}
