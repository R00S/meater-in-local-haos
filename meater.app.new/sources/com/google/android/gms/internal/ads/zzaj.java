package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* loaded from: classes2.dex */
public abstract class zzaj implements zzas {
    @Override // com.google.android.gms.internal.ads.zzas
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo16593a(zzr<?> zzrVar, Map<String, String> map) throws zza, IOException {
        zzar zzarVarMo15664b = mo15664b(zzrVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), zzarVarMo15664b.m16889c(), HttpUrl.FRAGMENT_ENCODE_SET));
        ArrayList arrayList = new ArrayList();
        for (zzl zzlVar : zzarVarMo15664b.m16890d()) {
            arrayList.add(new BasicHeader(zzlVar.m20195a(), zzlVar.m20196b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStreamM16887a = zzarVarMo15664b.m16887a();
        if (inputStreamM16887a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStreamM16887a);
            basicHttpEntity.setContentLength(zzarVarMo15664b.m16888b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract zzar mo15664b(zzr<?> zzrVar, Map<String, String> map) throws zza, IOException;
}
