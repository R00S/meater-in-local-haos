package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import p353j.C9703f;

/* loaded from: classes.dex */
public class POSTCacheKeyAlgorithm implements KeyAlgorithm<Request, String> {
    @Override // cm.aptoide.p092pt.dataprovider.cache.KeyAlgorithm
    public String getKeyFrom(Request request) {
        Request requestBuild = request.newBuilder().build();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("URL:%s\n", requestBuild.url().getUrl()));
        Headers headers = requestBuild.headers();
        if (headers.size() > 0) {
            sb.append("Headers:\n");
            for (String str : headers.names()) {
                sb.append(String.format("\t%s: %s\n", str, AptoideUtils.StringU.join(headers.values(str), ", ")));
            }
        }
        try {
            if (requestBuild.body() != null && requestBuild.body().contentLength() > 0) {
                sb.append("Body:\n");
                C9703f c9703f = new C9703f();
                requestBuild.body().writeTo(c9703f);
                sb.append(c9703f.m32021T());
            }
            return AptoideUtils.AlgorithmU.computeSha1(sb.toString());
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            return null;
        }
    }
}
